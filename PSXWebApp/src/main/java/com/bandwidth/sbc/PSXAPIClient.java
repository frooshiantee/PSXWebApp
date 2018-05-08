package com.bandwidth.sbc;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPIR09_03_02SoapBindingStub;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;



import com.bandwidth.sbcprovisioning.common.domain.template.Entity;
import com.bandwidth.sbcprovisioning.common.domain.template.Parameter;
import com.bandwidth.sbcprovisioning.ManagedEntityUtil;
import com.sonus.ems.api.psx.r10_00_00.services.PSXAPIR10_00_00SoapBindingStub;
import com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey;
import com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue;
import com.sonus.ems.api.psx.r10_00_00.model.Trunkgroup;
import com.sonus.ems.api.psx.r10_00_00.model.TrunkgroupKey;

import jdk.internal.jline.internal.Log;

public class PSXAPIClient
{
	
	private PSXAPIR10_00_00SoapBindingStub psxApi;
	
	private String psxName;
//	private static final java.util.logging.Logger log = LoggerFactory.getLogger(PSXApiRunner.class);
	
	
	@SuppressWarnings("unused")
	private final PsxConnectionProperties connectionProperties;
	
	public PSXAPIClient(final PsxConnectionProperties propertiesIn)
	{
		this.connectionProperties = propertiesIn;
		
	}

	
	public void setup() throws Exception
	{
		try
           {

     		// psxName = connectionProperties.getName();
			psxName = "labpsx03";              //  host-name of the PSX of interest
			
			final URL serverUrl = new URL("http://192.168.125.25/emsapi/services/PSXAPI/r10_00_00?wsdl");
			
			psxApi = new PSXAPIR10_00_00SoapBindingStub(serverUrl,null);
			// log.info("psxClient =" + psxApi.toString() + ", psxServerUrl = "+ connectionProperties.getUrl() + ", PSX_NAME = " +
				//	psxName + ", TIMEOUT = " + connectionProperties.getTimeout());
			
	         //the user needs to be a user with appropriate access privileges for the operation to be performed
	         final SOAPHeaderElement user = new SOAPHeaderElement("", "USER");
	         user.setObjectValue("admin");
			
		  	 final SOAPHeaderElement passwd = new SOAPHeaderElement("", "PASSWORD");
	         passwd.setObjectValue("admin");

	         psxApi.setHeader(user);
	         psxApi.setHeader(passwd);
	         // psxApi.setTimeout(connectionProperties.getTimeout());
	         
	         psxApi.setTimeout(5);
	         
	         
           }
		catch (Exception e)
		{
			//log.error(e.getMessage(), e);
			throw e;
		}
	}
	
	
	   public Trunkgroup getTrunkgroup(final String trunkgroupId, final String gatewayId) throws Exception
	   {
  
	      final TrunkgroupKey trunkgroupKey = new TrunkgroupKey();
	      trunkgroupKey.setTrunkgroupId(trunkgroupId);
	      trunkgroupKey.setGatewayId(gatewayId);
	      final Trunkgroup trunkgroup = (Trunkgroup) getEntity(trunkgroupKey);
	      // log.info("SUCCESS: called getTrunkgroup");
	      // logTrunkgroup(trunkgroup);
	      return trunkgroup;
	   }

	   public ManagedEntityValue getEntity(final ManagedEntityKey key) throws Exception
	   {
	      //log.info("calling getEntity with key = " + key.toString());

	      return getEntity(key, psxName);
	   }
	   

	   
	   public ManagedEntityValue getEntity(final ManagedEntityKey key, final String psxNameSource) throws Exception
	   {
	      ManagedEntityValue value = null;
	      try
	      {
	     //   log.info("calling getEntity with key = " + key.toString() + ", psxNameSource = " + psxNameSource);

	         value = psxApi.retrieve(psxNameSource, key);
	      }
	      catch (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException e2)
	      {
	     //    log.error(e2.getMessage1(), e2);
	         throw e2;
	      }
	      catch (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException e3)
	      {
	     //  log.error(e3.getMessage(), e3);
	         throw e3;
	      }
	      catch (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException e1)
	      {
	         // If we can't find the entity, we'll just return null, we don't care about logging the exception we get when this happens...
	         if (!"(ERR_REC_NOT_FOUND) Database row not found. (rc=20)".equals(e1.getRootCause()))
	         {
	     //       log.error(e1.getRootCause(), e1);
	         }
	      }
	      catch (RemoteException e0)
	      {
	       //  log.error(e0.getMessage(), e0);
	         throw e0;
	      }
	      catch (Exception e)
	      {
	         //log.error(e.getMessage(), e);
	         throw e;
	      }

	     // log.info("SUCCESS: called getEntity");

	      return value;
	   }

	   
	   //***************************************************************************************
	 //carrierId is a required field
	
	  
	   public void createTrunkgroup(final String trunkgroupId, final String gatewayId, final String carrierId) throws Exception
	   {
	      try
	      {
	       //  log.info("calling createTrunkgroup with trunkgroupId = " + trunkgroupId + " , gatewayId = " + gatewayId + " , carrierId = " + carrierId);

	         final Trunkgroup trunkgroup = new Trunkgroup();
	         trunkgroup.setTrunkgroupId(trunkgroupId);
	         trunkgroup.setGatewayId(gatewayId);
	         trunkgroup.setCarrierId(carrierId);
	         createManagedEntity(trunkgroup);
	         	         
	         
	       //  log.info("SUCCESS: called createTrunkgroup");
	         //logTrunkgroup(trunkgroup);
	      }
	      catch (Exception e)
	      {
	         //log.error(e.getMessage(), e);
	         throw e;
	      }
	   }
	   
	     
	   public void createTrunkgroup(final Trunkgroup trunkgroup) throws Exception
	   {
	    //  log.info("calling createTrunkgroup");

	      createManagedEntity(trunkgroup);
	   //   logTrunkgroup(trunkgroup);
	   }

	   public void createManagedEntity(final ManagedEntityValue managedEntityValue) throws Exception
	   {
	     // log.info("calling createManagedEntity with managedEntityValue = " + managedEntityValue.toString());

	      createManagedEntity(managedEntityValue, psxName);

	   //   log.info("SUCCESS: called createManagedEntity");
	   }
	   
	   public void createManagedEntity(final ManagedEntityValue managedEntityValue, final String psxNameTarget) throws Exception
	   {
	      try
	      {
	     //    log.info("calling createManagedEntity with managedEntityValue = " + managedEntityValue.toString() + ", psxNameTarget = " + psxNameTarget);

	         psxApi.create(psxNameTarget, managedEntityValue);
	      }
	      catch (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException e2)
	      {
	       //  log.error(e2.getMessage1(), e2);
	         throw e2;
	      }
	      catch (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException e3)
	      {
	     //    log.error(e3.getMessage(), e3);
	         throw e3;
	      }
	      catch (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException e1)
	      {
	     //    log.error(e1.getRootCause(), e1);
	         throw e1;
	      }
	      catch (RemoteException e0)
	      {
	     //    log.error(e0.getMessage(), e0);
	         throw e0;
	      }
	      catch (Exception e)
	      {
	     //    log.error(e.getMessage(), e);
	         throw e;
	      }

	  //    log.info("SUCCESS: called createManagedEntity");
	   }
	   
	   
	   // put is not required in my code
	   
	   
/*
	   public void putEntity(final ManagedEntityValue managedEntityValueIn) throws Exception
	   {
	      putEntity(managedEntityValueIn, psxName);
	   }

	   public void putEntity(final ManagedEntityValue managedEntityValue, final String psxNameIn) throws Exception
	   {
	      try
	      {
	      //   log.info("calling putEntity with managedEntityValue = " + managedEntityValue.toString());

	         psxApi.put(psxNameIn, managedEntityValue);
	      }
	      catch (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException e2)
	      {
	      //   log.error(e2.getMessage1(), e2);
	         throw e2;
	      }
	      catch (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException e3)
	      {
	      //   log.error(e3.getMessage(), e3);
	         throw e3;
	      }
	      catch (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException e1)
	      {
	      //   log.error(e1.getRootCause(), e1);
	         throw e1;
	      }
	      catch (RemoteException e0)
	      {
	      //   log.error(e0.getMessage(), e0);
	         throw e0;
	      }
	      catch (Exception e)
	      {
	      //   log.error(e.getMessage(), e);
	         throw e;
	      }

	      // log.info("SUCCESS: called putEntity");
	   }

*/ 
	   
	   
	   // deleting a trunk group
/*	   
	   public void deleteTrunkgroup(final String trunkgroupId, final String gatewayId) throws Exception
	   {
		   log.info("calling deleteTrunkgroup with key trunkgroupId = " + trunkgroupId + " , gatewayId = " + gatewayId);
		   
		   final TrunkgroupKey trunkgroupKey = new TrunkgoupKey();
		   if (null != trunkgroupId &&  !"".equals(trunkgroupId) && null != gatewayId && !"".equals(gatewayId))
		   {
			   trunkgroupKey.setTrunkgroupId(trunkgroupId);
			   trunkgroupKey.setGatewayId(gatewayId);
		   }
		
		   deleteEntity(trunkgroupKey);		      
		   
	   }
	   
	   public void deleteTrunkgroup(final TrunkgroupKey trunkgroupKey) throws Exception
	   {
		   deleteEntity(trunkgroupKey);
		   
	   }
	   
	   public void deleteEntity(final ManagedEntityKey key) throws Exception
	   {
		  deleteEntity(key,psxName);
	   }
	   
	   
	   
	   public void deleteEntity(final ManagedEntityKey key, final String psxNameTarget) throws Exception
	   {
	      try
	      {
	         //log.info("calling deleteEntity with key = " + key.toString() + ", psxNameTarget = " + psxNameTarget);

	         psxApi.delete(psxNameTarget, key);
	      }
	      catch (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException e2)
	      {
	         //log.error(e2.getMessage1(), e2);
	         throw e2;
	      }
	      catch (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException e3)
	      {
	         //log.error(e3.getMessage(), e3);
	         throw e3;
	      }
	      catch (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException e1)
	      {
	         //log.error(e1.getRootCause(), e1);
	         throw e1;
	      }
	      catch (RemoteException e0)
	      {
	         //log.error(e0.getMessage(), e0);
	         throw e0;
	      }
	      catch (Exception e)
	      {
	         //log.error(e.getMessage(), e);
	         throw e;
	      }

	      //log.info("SUCCESS: called deleteEntity");
	   }
*/
	   
	   
}