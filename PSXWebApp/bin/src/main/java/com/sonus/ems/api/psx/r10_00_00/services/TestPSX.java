package com.bandwidth.sbc.service;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sonusnet.www.ems.emsapi.psx.r10_00_00.intf.PSXAPIR10_00_00SoapBindingStub;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bandwidth.sbcprovisioning.common.domain.constants.PsxProfileType;
import com.bandwidth.sbcprovisioning.common.domain.template.Entity;
import com.bandwidth.sbcprovisioni ng.common.domain.template.Parameter;
import com.bandwidth.sbcprovisioning.common.util.ManagedEntityUtil;
import com.sonusnet.www.ems.emsapi.psx.r10_00_00.intf.PSXAPIR10_00_00SoapBindingStub;
import com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ManagedEntityKey;
import com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ManagedEntityValue;
import com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.Trunkgroup;
import com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.TrunkgroupKey;

public class PSXApiRunner
{
   private PSXAPIR10_00_00SoapBindingStub psxApi;

   private String psxName;
   private static final java.util.logging.Logger log = LoggerFactory.getLogger(PSXApiRunner.class);

   private final PsxConnectionProperties connectionProperties;

   public PSXApiRunner(final PsxConnectionProperties propertiesIn)
   {

      this.connectionProperties = propertiesIn;
   }

   public void setup() throws Exception
   {
      try
      {
             	  
    	  log.info("Initializing PSXApiRunner");

         psxName = connectionProperties.getName();
         final URL serverUrl = new URL(connectionProperties.getUrl() + "?WSDL");
         //WS Client using Generated stubs.
         psxApi = new PSXAPIR10_00_00SoapBindingStub(serverUrl, null);
         log.info("psxApi = " + psxApi.toString() + ", psxServerUrl = " + connectionProperties.getUrl() + ", PSX_NAME = " +
                  psxName + ", TIMEOUT = " + connectionProperties.getTimeout());
         //the user needs to be a user with appropriate access privileges for the operation to be performed
         final SOAPHeaderElement user = new SOAPHeaderElement("", "USER");
         user.setObjectValue(connectionProperties.getUsername());

         final SOAPHeaderElement passwd = new SOAPHeaderElement("", "PASSWORD");
         passwd.setObjectValue(connectionProperties.getPassword());

         psxApi.setHeader(user);
         psxApi.setHeader(passwd);
         psxApi.setTimeout(connectionProperties.getTimeout());

      }
      catch (Exception e)
      {
         log.error(e.getMessage(), e);
         throw e;
      }
   }

   public Trunkgroup getTrunkgroup(final String trunkgroupId, final String gatewayId) throws Exception
   {
      log.info("calling getTrunkgroup with key trunkgroupId = " + trunkgroupId + " , gatewayId = " + gatewayId);

      final TrunkgroupKey trunkgroupKey = new TrunkgroupKey();
      trunkgroupKey.setTrunkgroupId(trunkgroupId);
      trunkgroupKey.setGatewayId(gatewayId);

      final Trunkgroup trunkgroup = (Trunkgroup) getEntity(trunkgroupKey);

      log.info("SUCCESS: called getTrunkgroup");
      logTrunkgroup(trunkgroup);

      return trunkgroup;
   }

   public ManagedEntityValue getEntity(final ManagedEntityKey key) throws Exception
   {
      log.info("calling getEntity with key = " + key.toString());

      return getEntity(key, psxName);
   }

   public ManagedEntityValue getEntity(final ManagedEntityKey key, final String psxNameSource) throws Exception
   {
      ManagedEntityValue value = null;
      try
      {
         log.info("calling getEntity with key = " + key.toString() + ", psxNameSource = " + psxNameSource);
 
         value = psxApi.retrieve(psxNameSource, key);
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiBatchException e2)
      {
         log.error(e2.getMessage1(), e2);
         throw e2;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiAuthorizationException e3)
      {         
    	 log.error(e3.getMessage(), e3);
         throw e3;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiException e1)
      {
         // If we can't find the entity, we'll just return null, we don't care about logging the exception we get when this happens...
         if (!"(ERR_REC_NOT_FOUND) Database row not found. (rc=20)".equals(e1.getRootCause()))
         {
            log.error(e1.getRootCause(), e1);
         }
      }
      catch (RemoteException e0)
      {
         log.error(e0.getMessage(), e0);
         throw e0;
      }
      catch (Exception e)
      {
         log.error(e.getMessage(), e);
         throw e;
      }

      log.info("SUCCESS: called getEntity");

      return value;
   }

   public List<ManagedEntityKey> getEntityKeysByProfileType(final PsxProfileType psxProfileType) throws Exception
   {
      log.info("calling getEntityKeysByProfileType with psxProfileType = " + psxProfileType.getDisplayName());

      return getEntityKeysByProfileType(psxProfileType, psxName);
   }

   public List<ManagedEntityKey> getEntityKeysByProfileType(final PsxProfileType psxProfileType, final String psxNameSource) throws Exception
   {
      return getEntityKeysByProfileTypeAndName(null, psxProfileType, psxNameSource);
   }

   public List<ManagedEntityKey> getEntityKeysByProfileTypeAndName(final String name, final PsxProfileType psxProfileType, final String psxNameSource) throws Exception
   {
      final List<ManagedEntityKey> managedEntityKeys;
      try
      {
         log.info("calling getEntityKeysByProfileType with psxProfileType = " + psxProfileType.getDisplayName() + ", psxNameSource = " + psxNameSource);

         final ManagedEntityKey key;
         if (StringUtils.isBlank(name))
         {
            key = ManagedEntityUtil.createWildcardManagedEntityKey(psxProfileType);
         }
         else
         {
            key = ManagedEntityUtil.createManagedEntityKey(psxProfileType, name);
         }

         managedEntityKeys = getEntityKeys(key, psxNameSource);
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiBatchException e2)
      {
         log.error(e2.getMessage1(), e2);
         throw e2;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiAuthorizationException e3)
      {
         log.error(e3.getMessage(), e3);
         throw e3;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiException e1)
      {
         log.error(e1.getRootCause(), e1);
         throw e1;
      }
      catch (RemoteException e0)
      {
         log.error(e0.getMessage(), e0);
         throw e0;
      }
      catch (Exception e)
      {
         log.error(e.getMessage(), e);
         throw e;
      }

      log.info("SUCCESS: called getEntityKeysByProfileType");
      
      log.info("name");

      return managedEntityKeys;
   }

   public List<ManagedEntityKey> getEntityKeys(final ManagedEntityKey key) throws Exception
   {
      log.info("calling getEntityKeys with key = " + key.toString());

      return getEntityKeys(key, psxName);
   }

   public List<ManagedEntityKey> getEntityKeys(final ManagedEntityKey key, final String psxNameSource) throws Exception
   {
      final List<ManagedEntityKey> managedEntityKeys = new ArrayList<ManagedEntityKey>();
      try
      {
         log.info("calling getEntityKeys with key = " + key.toString() + ", psxNameSource = " + psxNameSource);

         int chunkNum = 0;
         final int chunkSize = 100;
         ManagedEntityKey[] keys;
         do
         {
            keys = psxApi.getNextItems(psxNameSource, key, chunkSize, chunkNum++);
            if (null != keys)
            {
               managedEntityKeys.addAll(Arrays.asList(keys));
            }
         }
         while ((null != keys) && (keys.length > 0) && (keys.length == chunkSize));
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiBatchException e2)
      {
         log.error(e2.getMessage1(), e2);
         throw e2;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiAuthorizationException e3)
      {
         log.error(e3.getMessage(), e3);
         throw e3;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiException e1)
      {
         log.error(e1.getRootCause(), e1);
         throw e1;
      }
      catch (RemoteException e0)
      {
         log.error(e0.getMessage(), e0);
         throw e0;
      }
      catch (Exception e)
      {
         log.error(e.getMessage(), e);
         throw e;
      }

      log.info("SUCCESS: called getEntityKeys");

      return managedEntityKeys;
   }

   public ManagedEntityValue[] getEntitiesByKeys(final ManagedEntityKey[] keys, final boolean continueOnError) throws Exception
   {
      log.info("calling getEntitiesByKeys with key = " + Arrays.toString(keys));

      return getEntitiesByKeys(keys, continueOnError, psxName);
   }

   public ManagedEntityValue[] getEntitiesByKeys(final ManagedEntityKey[] keys, final boolean continueOnError, final String psxNameSource) throws Exception
   {
      if (keys == null)
      {
         throw new IllegalArgumentException("Specified keys to retrieve PSX entities for cannot be null.");
      }
      ManagedEntityValue[] values = null;
      try
      {
         log.info("calling getEntitiesByKeys with key = " + Arrays.toString(keys) + ", psxNameSource = " + psxNameSource);

         int chunkNum = 0;
         final int chunkSize = 500;
         if (keys.length <= chunkSize)
         {
            values = psxApi.retrieve(psxNameSource, keys, continueOnError);
         }
         else if (keys.length > chunkSize)
         {
            final ArrayList<ManagedEntityValue> managedEntityValues = new ArrayList<ManagedEntityValue>();
            ManagedEntityValue[] tempValues;
            do {
               final List<ManagedEntityKey> managedEntityKeys = Arrays.asList(keys).subList(chunkNum, (chunkNum + chunkSize) <= keys.length ? (chunkNum + chunkSize) : keys.length);
               tempValues = psxApi.retrieve(psxNameSource, (managedEntityKeys.toArray(new ManagedEntityKey[managedEntityKeys.size()])), continueOnError);
               chunkNum += chunkSize;
               if (null != tempValues) {managedEntityValues.addAll(Arrays.asList(tempValues));}
            }
            while ((null != tempValues) && (tempValues.length > 0) && (tempValues.length == chunkSize));

            values = managedEntityValues.toArray(new ManagedEntityValue[managedEntityValues.size()]);
         }

      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiBatchException e2)
      {
         log.error(e2.getMessage1(), e2);
         throw e2;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiAuthorizationException e3)
      {
         log.error(e3.getMessage(), e3);
         throw e3;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiException e1)
      {
         log.error(e1.getRootCause(), e1);
         throw e1;
      }
      catch (RemoteException e0)
      {
         log.error(e0.getMessage(), e0);
         throw e0;
      }
      catch (Exception e)
      {
         log.error(e.getMessage(), e);
         throw e;
      }

      log.info("SUCCESS: called getEntitiesByKeys");
       
      
      return values;
   }

   public void syncEntities(final ManagedEntityKey key, final String psxNameSource, final String psxNameTarget) throws Exception
   {
      try
      {
         log.info("calling syncEntities with key = " + key.toString() + ", psxNameSource = " + psxNameSource + ", psxNameTarget = " + psxNameTarget);

         final List<ManagedEntityKey> managedEntityKeys = getEntityKeys(key, psxNameSource);

         final ManagedEntityValue[] values = getEntitiesByKeys(managedEntityKeys.toArray(new ManagedEntityKey[managedEntityKeys.size()]), true, psxNameSource);

         for (final ManagedEntityValue managedEntityValue : values)
         {
            boolean found = false;
            for (final ManagedEntityKey managedEntityKey : managedEntityKeys)
            {
               final ManagedEntityValue value = getEntity(managedEntityKey, psxNameTarget);
               if (null != value && value.equals(managedEntityValue))
               {
                  updateEntity(managedEntityKey, managedEntityValue, psxNameTarget);
                  found = true;
                  break;
               }
            }
            if (!found)
            {
               createManagedEntity(managedEntityValue, psxNameTarget);
            }
         }
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiBatchException e2)
      {
         log.error(e2.getMessage1(), e2);
         throw e2;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiAuthorizationException e3)
      {
         log.error(e3.getMessage(), e3);
         throw e3;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiException e1)
      {
         log.error(e1.getRootCause(), e1);
         throw e1;
      }
      catch (RemoteException e0)
      {
         log.error(e0.getMessage(), e0);
         throw e0;
      }
      catch (Exception e)
      {
         log.error(e.getMessage(), e);
         throw e;
      }

      log.info("SUCCESS: called syncEntities");
   }

   //carrierId is a required field
   public void createTrunkgroup(final String trunkgroupId, final String gatewayId, final String carrierId) throws Exception
   {
      try
      {
         log.info("calling createTrunkgroup with trunkgroupId = " + trunkgroupId + " , gatewayId = " + gatewayId + " , carrierId = " + carrierId);

         final Trunkgroup trunkgroup = new Trunkgroup();
         trunkgroup.setTrunkgroupId(trunkgroupId);
         trunkgroup.setGatewayId(gatewayId);
         trunkgroup.setCarrierId(carrierId);
         createManagedEntity(trunkgroup);

         log.info("SUCCESS: called createTrunkgroup");
         logTrunkgroup(trunkgroup);
      }
      catch (Exception e)
      {
         log.error(e.getMessage(), e);
         throw e;
      }
   }

   public void createTrunkgroup(final Trunkgroup trunkgroup) throws Exception
   {
      log.info("calling createTrunkgroup");

      createManagedEntity(trunkgroup);
      logTrunkgroup(trunkgroup);
   }

   public void createManagedEntity(final ManagedEntityValue managedEntityValue) throws Exception
   {
      log.info("calling createManagedEntity with managedEntityValue = " + managedEntityValue.toString());

      createManagedEntity(managedEntityValue, psxName);

      log.info("SUCCESS: called createManagedEntity");
   }
   
   log.info("TESTING!!!!!!!!!!!!!!!!!")

   public void createManagedEntity(final ManagedEntityValue managedEntityValue, final String psxNameTarget) throws Exception
   {
      try
      {
         log.info("calling createManagedEntity with managedEntityValue = " + managedEntityValue.toString() + ", psxNameTarget = " + psxNameTarget);

         psxApi.create(psxNameTarget, managedEntityValue);
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiBatchException e2)
      {
         log.error(e2.getMessage1(), e2);
         throw e2;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiAuthorizationException e3)
      {
         log.error(e3.getMessage(), e3);
         throw e3;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiException e1)
      {
         log.error(e1.getRootCause(), e1);
         throw e1;
      }
      catch (RemoteException e0)
      {
         log.error(e0.getMessage(), e0);
         throw e0;
      }
      catch (Exception e)
      {
         log.error(e.getMessage(), e);
         throw e;
      }
      
      log.info("SUCCESS: called createManagedEntity");
   }

   public void updateTrunkgroup(final Trunkgroup trunkgroup) throws Exception
   {
	   
	  
      log.info("calling updateTrunkgroup with trunkgroup = " + trunkgroup.toString());

      final TrunkgroupKey trunkgroupKey = new TrunkgroupKey();
      trunkgroupKey.setTrunkgroupId(trunkgroup.getTrunkgroupId());
      trunkgroupKey.setGatewayId(trunkgroup.getGatewayId());
      updateEntity(trunkgroupKey, trunkgroup);

      log.info("SUCCESS: called updateTrunkgroup");
      logTrunkgroup(trunkgroup);
   }

   public void updateTrunkgroup(final TrunkgroupKey trunkgroupKey, final Trunkgroup trunkgroup) throws Exception
   {
      log.info("calling updateTrunkgroup with trunkgroupKey = " + trunkgroupKey + ", trunkgroup = " + trunkgroup.toString());

      updateEntity(trunkgroupKey, trunkgroup);
      logTrunkgroup(trunkgroup);
   }

   public void updateEntity(final ManagedEntityKey key, final ManagedEntityValue managedEntityValue) throws Exception
   {
      log.info("calling updateEntity with key = " + key + ", managedEntityValue = " + managedEntityValue.toString());

      updateEntity(key, managedEntityValue, psxName);

      log.info("SUCCESS: called updateEntity");
   }

   public void updateEntity(final ManagedEntityKey key, final ManagedEntityValue managedEntityValue, final String psxNameTarget) throws Exception
   {
      try
      {
         log.info("calling updateEntity with key = " + key + ", managedEntityValue = " + managedEntityValue.toString() + ", psxNameTarget = " + psxNameTarget);

         psxApi.update(psxNameTarget, key, managedEntityValue);
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiBatchException e2)
      {
         log.error(e2.getMessage1(), e2);
         throw e2;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiAuthorizationException e3)
      {
         log.error(e3.getMessage(), e3);
         throw e3;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiException e1)
      {
         log.error(e1.getRootCause(), e1);
         throw e1;
      }
      catch (RemoteException e0)
      {
         log.error(e0.getMessage(), e0);
         throw e0;
      }
      catch (Exception e)
      {
         log.error(e.getMessage(), e);
         throw e;
      }

      log.info("SUCCESS: called updateEntity");
   }

   public void putEntity(final ManagedEntityValue managedEntityValueIn) throws Exception
   {
      putEntity(managedEntityValueIn, psxName);
   }

   public void putEntity(final ManagedEntityValue managedEntityValue, final String psxNameIn) throws Exception
   {
      try
      {
         log.info("calling putEntity with managedEntityValue = " + managedEntityValue.toString());

         psxApi.put(psxNameIn, managedEntityValue);
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiBatchException e2)
      {
         log.error(e2.getMessage1(), e2);
         throw e2;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiAuthorizationException e3)
      {
         log.error(e3.getMessage(), e3);
         throw e3;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiException e1)
      {
         log.error(e1.getRootCause(), e1);
         throw e1;
      }
      catch (RemoteException e0)
      {
         log.error(e0.getMessage(), e0);
         throw e0;
      }
      catch (Exception e)
      {
         log.error(e.getMessage(), e);
         throw e;
      }

      log.info("SUCCESS: called putEntity");
   }

   public void deleteTrunkgroup(final String trunkgroupId, final String gatewayId) throws Exception
   {
      log.info("calling deleteTrunkgroup with key trunkgroupId = " + trunkgroupId + " , gatewayId = " + gatewayId);

      final TrunkgroupKey trunkgroupKey = new TrunkgroupKey();
      if (null != trunkgroupId && !"".equals(trunkgroupId) && null != gatewayId && !"".equals(gatewayId))
      {
         trunkgroupKey.setTrunkgroupId(trunkgroupId);
         trunkgroupKey.setGatewayId(gatewayId);
      }
      deleteEntity(trunkgroupKey);

      log.info("SUCCESS: called deleteTrunkgroup");
   }

   public void deleteTrunkgroup(final TrunkgroupKey trunkgroupKey) throws Exception
   {
      deleteEntity(trunkgroupKey);
   }

   public void deleteEntity(final ManagedEntityKey key) throws Exception
   {
      log.info("calling deleteEntity with key = " + key.toString());

      deleteEntity(key, psxName);

      log.info("SUCCESS: called deleteEntity");
   }

   public void deleteEntity(final ManagedEntityKey key, final String psxNameTarget) throws Exception
   {
      try
      {
         log.info("calling deleteEntity with key = " + key.toString() + ", psxNameTarget = " + psxNameTarget);

         psxApi.delete(psxNameTarget, key);
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiBatchException e2)
      {
         log.error(e2.getMessage1(), e2);
         throw e2;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiAuthorizationException e3)
      {
         log.error(e3.getMessage(), e3);
         throw e3;
      }
      catch (com.sonusnet.www.ems.emsapi.psx.r10_00_00.model.ProvApiException e1)
      {
         log.error(e1.getRootCause(), e1);
         throw e1;
      }
      catch (RemoteException e0)
      {
         log.error(e0.getMessage(), e0);
         throw e0;
      }
      catch (Exception e)
      {
         log.error(e.getMessage(), e);
         throw e;
      }
      log.info("SUCCESS: called deleteEntity");
   }

   public void healthCheck() throws Exception
   {
      Validate.notEmpty(getEntityKeysByProfileType(PsxProfileType.CODEC_ENTRY), "Expected to receive at least one CodecEntryKey from the PSX (%s), but received none.", psxName);
      log.info("SUCCESS: called healthCheck");
   }

   private void logEntityString(final Entity entity)
   {
      final StringBuilder stringBuilder = new StringBuilder();
      for (final Parameter parameter : entity.getParameter())
      {
         stringBuilder.append(parameter.getId()).append("=").append(StringUtils.defaultIfBlank(parameter.getValue(), parameter.getDefaultValue())).append(";");
      }
      log.info(entity.getId() + " : " + stringBuilder.toString());
   }


   private void logTrunkgroup(final Trunkgroup trunkgroup)
   {
      if (null != trunkgroup)
      {
         final StringBuilder stringBuilder = new StringBuilder();
         stringBuilder.append("trunkgroupId=").append(trunkgroup.getTrunkgroupId()).append(";");
         stringBuilder.append("gatewayId=").append(trunkgroup.getGatewayId()).append(";");
         stringBuilder.append("carrierId=").append(trunkgroup.getCarrierId()).append(";");
         stringBuilder.append("overrideCarrierId=").append(trunkgroup.getOverrideCarrierId()).append(";");
         stringBuilder.append("npaId=").append(trunkgroup.getNpaId()).append(";");
         stringBuilder.append("jipId=").append(trunkgroup.getJipId()).append(";");
         stringBuilder.append("destinationSwitchType=").append(trunkgroup.getDestinationSwitchType()).append(";");
         stringBuilder.append("releaseToneTreatment=").append(trunkgroup.getReleaseToneTreatment()).append(";");
         stringBuilder.append("direction=").append(trunkgroup.getDirection()).append(";");
         stringBuilder.append("unrestrictedFlag=").append(trunkgroup.getUnrestrictedFlag()).append(";");
         stringBuilder.append("signalingFlag=").append(trunkgroup.getSignalingFlag()).append(";");
         stringBuilder.append("inPmRuleId=").append(trunkgroup.getInPmRuleId()).append(";");
         stringBuilder.append("outPmRuleId=").append(trunkgroup.getOutPmRuleId()).append(";");
         stringBuilder.append("numberingPlanId=").append(trunkgroup.getNumberingPlanId()).append(";");
         stringBuilder.append("callingPartyId=").append(trunkgroup.getCallingPartyId()).append(";");
         stringBuilder.append("countryId=").append(trunkgroup.getCountryId()).append(";");
         stringBuilder.append("lataId=").append(trunkgroup.getLataId()).append(";");
         stringBuilder.append("regionId=").append(trunkgroup.getRegionId()).append(";");
         stringBuilder.append("defaultOlip=").append(trunkgroup.getDefaultOlip()).append(";");
         stringBuilder.append("signalingProfileId=").append(trunkgroup.getSignalingProfileId()).append(";");
         stringBuilder.append("zzProfileId=").append(trunkgroup.getZzProfileId()).append(";");
         stringBuilder.append("prfdPacketServiceProfileId=").append(trunkgroup.getPrfdPacketServiceProfileId()).append(";");
         stringBuilder.append("ownCarrierId=").append(trunkgroup.getOwnCarrierId()).append(";");
         stringBuilder.append("poiLevel=").append(trunkgroup.getPoiLevel()).append(";");
         stringBuilder.append("poiChargeArea=").append(trunkgroup.getPoiChargeArea()).append(";");
         stringBuilder.append("originatingCarrier=").append(trunkgroup.getOriginatingCarrier()).append(";");
         stringBuilder.append("trunkgroupDomainId=").append(trunkgroup.getTrunkgroupDomainId()).append(";");
         stringBuilder.append("billingPlanId=").append(trunkgroup.getBillingPlanId()).append(";");
         stringBuilder.append("sipDomainId=").append(trunkgroup.getSipDomainId()).append(";");
         stringBuilder.append("billingId=").append(trunkgroup.getBillingId()).append(";");
         stringBuilder.append("callingPartyNoa=").append(trunkgroup.getCallingPartyNoa()).append(";");
         stringBuilder.append("callingPartyNpi=").append(trunkgroup.getCallingPartyNpi()).append(";");
         stringBuilder.append("billingNoa=").append(trunkgroup.getBillingNoa()).append(";");
         stringBuilder.append("billingNpi=").append(trunkgroup.getBillingNpi()).append(";");
         stringBuilder.append("tgCos=").append(trunkgroup.getTgCos()).append(";");
         stringBuilder.append("tgCosProfileId=").append(trunkgroup.getTgCosProfileId()).append(";");
         stringBuilder.append("dialPlanProfileId=").append(trunkgroup.getDialPlanProfileId()).append(";");
         stringBuilder.append("digitLenEnfProfileId=").append(trunkgroup.getDigitLenEnfProfileId()).append(";");
         stringBuilder.append("npiId=").append(trunkgroup.getNpiId()).append(";");
         stringBuilder.append("businessGroupId=").append(trunkgroup.getBusinessGroupId()).append(";");
         stringBuilder.append("elementAttributes=").append(trunkgroup.getElementAttributes()).append(";");
         stringBuilder.append("classOfServiceId=").append(trunkgroup.getClassOfServiceId()).append(";");
         stringBuilder.append("carrierSelectionPriorityId=").append(trunkgroup.getCarrierSelectionPriorityId()).append(";");
         stringBuilder.append("pseudoCarrierId=").append(trunkgroup.getPseudoCarrierId()).append(";");
         stringBuilder.append("featureControlProfileId=").append(trunkgroup.getFeatureControlProfileId()).append(";");
         stringBuilder.append("trunkgroupId2=").append(trunkgroup.getTrunkgroupId2()).append(";");
         stringBuilder.append("description=").append(trunkgroup.getDescription()).append(";");
         stringBuilder.append("tdmTrunkType=").append(trunkgroup.getTdmTrunkType()).append(";");
         stringBuilder.append("scpBusinessServiceGroup=").append(trunkgroup.getScpBusinessServiceGroup()).append(";");
         stringBuilder.append("chargeIndicator=").append(trunkgroup.getChargeIndicator()).append(";");
         stringBuilder.append("erpProfileId=").append(trunkgroup.getErpProfileId()).append(";");
         stringBuilder.append("rcProfileId=").append(trunkgroup.getRcProfileId()).append(";");
         stringBuilder.append("cpnPresentation=").append(trunkgroup.getCpnPresentation()).append(";");
         stringBuilder.append("cpnScreening=").append(trunkgroup.getCpnScreening()).append(";");
         stringBuilder.append("dfltCpnPresentation=").append(trunkgroup.getDfltCpnPresentation()).append(";");
         stringBuilder.append("localizationType=").append(trunkgroup.getLocalizationType()).append(";");
         stringBuilder.append("exceptionProfileId=").append(trunkgroup.getExceptionProfileId()).append(";");
         stringBuilder.append("prefixProfileId=").append(trunkgroup.getPrefixProfileId()).append(";");
         stringBuilder.append("businessLocationId=").append(trunkgroup.getBusinessLocationId()).append(";");
         stringBuilder.append("billingInfoId=").append(trunkgroup.getBillingInfoId()).append(";");
         stringBuilder.append("egressChargeInd=").append(trunkgroup.getEgressChargeInd()).append(";");
         stringBuilder.append("isEscaped=").append(trunkgroup.getIsEscaped()).append(";");
         stringBuilder.append("defaultCpc=").append(trunkgroup.getDefaultCpc()).append(";");
         stringBuilder.append("numberAnalysisProfileId=").append(trunkgroup.getNumberAnalysisProfileId()).append(";");
         stringBuilder.append("pprProfileId=").append(trunkgroup.getPprProfileId()).append(";");
         stringBuilder.append("maximumSatelliteHops=").append(trunkgroup.getMaximumSatelliteHops()).append(";");
         stringBuilder.append("trafficTrunkResvLevel1=").append(trunkgroup.getTrafficTrunkResvLevel1()).append(";");
         stringBuilder.append("trafficTrunkResvLevel2=").append(trunkgroup.getTrafficTrunkResvLevel2()).append(";");
         stringBuilder.append("callingArea=").append(trunkgroup.getCallingArea()).append(";");
         stringBuilder.append("localRingBackToneId=").append(trunkgroup.getLocalRingBackToneId()).append(";");
         stringBuilder.append("ipSignalingPeerGroupId=").append(trunkgroup.getIpSignalingPeerGroupId()).append(";");
         stringBuilder.append("ipSignalingProfileId=").append(trunkgroup.getIpSignalingProfileId()).append(";");
         stringBuilder.append("iptgPacketServiceProfileId=").append(trunkgroup.getIptgPacketServiceProfileId()).append(";");
         stringBuilder.append("iptgIpSignalingProfileId=").append(trunkgroup.getIptgIpSignalingProfileId()).append(";");
         stringBuilder.append("owningCarrierProfileId=").append(trunkgroup.getOwningCarrierProfileId()).append(";");
         stringBuilder.append("carrierTypeProfileId=").append(trunkgroup.getCarrierTypeProfileId()).append(";");
         stringBuilder.append("deviceProfileId=").append(trunkgroup.getDeviceProfileId()).append(";");
         stringBuilder.append("chargeInformationId=").append(trunkgroup.getChargeInformationId()).append(";");
         stringBuilder.append("networkdataPartition=").append(trunkgroup.getNetworkdataPartition()).append(";");
         stringBuilder.append("networkdataNet=").append(trunkgroup.getNetworkdataNet()).append(";");
         stringBuilder.append("ddiRangeProfileId=").append(trunkgroup.getDdiRangeProfileId()).append(";");
         stringBuilder.append("forcedOlip=").append(trunkgroup.getForcedOlip()).append(";");
         stringBuilder.append("bNumberPrefix=").append(trunkgroup.getBNumberPrefix()).append(";");
         stringBuilder.append("autoRecallProfileId=").append(trunkgroup.getAutoRecallProfileId()).append(";");
         stringBuilder.append("carrierCodeConvrId=").append(trunkgroup.getCarrierCodeConvrId()).append(";");
         stringBuilder.append("nextHopDomainId=").append(trunkgroup.getNextHopDomainId()).append(";");
         stringBuilder.append("infoTransCapProfileId=").append(trunkgroup.getInfoTransCapProfileId()).append(";");
         stringBuilder.append("zoneIndexProfileId=").append(trunkgroup.getZoneIndexProfileId()).append(";");
         stringBuilder.append("addressContext=").append(trunkgroup.getAddressContext()).append(";");
         log.info("Trunkgroup : " + stringBuilder.toString());
      }
   }
}