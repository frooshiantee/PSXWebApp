package com.bandwidth.sbcprovisioning;

import com.bandwidth.sbcprovisioning.common.domain.constants.PsxProfileType;
import com.sonus.ems.api.psx.r10_00_00.model.*;
import org.apache.commons.beanutils.BeanUtils;

import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class ManagedEntityUtil
{
   public static final String WILDCARD = "%";
   public static final Map<Class<? extends ManagedEntityKey>, String> KEY_ID_FIELDS = new IdentityHashMap<Class<? extends ManagedEntityKey>, String>();
   public static final Map<Class<? extends ManagedEntityValue>, String> VALUE_ID_FIELDS = new IdentityHashMap<Class<? extends ManagedEntityValue>, String>();

   private static final Map<Class<? extends ManagedEntityValue>, PsxProfileType> PROFILE_TYPE_FOR_ENTITY_VALUE = new IdentityHashMap<Class<? extends ManagedEntityValue>, PsxProfileType>();
   private static final Map<PsxProfileType, Class<? extends ManagedEntityKey>> KEY_FOR_PROFILE_TYPE = new EnumMap<PsxProfileType, Class<? extends ManagedEntityKey>>(PsxProfileType.class);

   static
   {
      // Keys
      KEY_ID_FIELDS.put(ClassOfServiceKey.class, "classOfServiceId");
      KEY_ID_FIELDS.put(IpSignalingProfileKey.class, "ipSignalingProfileId");
      KEY_ID_FIELDS.put(PacketServiceProfileKey.class, "packetServiceProfileId");
      KEY_ID_FIELDS.put(PreferredPacketServiceProfileKey.class, "prfdPacketServiceProfileId");
      KEY_ID_FIELDS.put(DialPlanProfileKey.class, "dialPlanProfileId");
      KEY_ID_FIELDS.put(FeatureControlProfileKey.class, "featureControlProfileId");
      KEY_ID_FIELDS.put(ElementRoutingPriorityKey.class, "erpProfileId");
      KEY_ID_FIELDS.put(ElementRoutingPriorityGroupKey.class, "erpProfileId");
      KEY_ID_FIELDS.put(PrefixProfileKey.class, "prefixProfileId");
      KEY_ID_FIELDS.put(BillingInfoProfileKey.class, "billingInfoId");
      KEY_ID_FIELDS.put(BillingInfoProfileDataKey.class, "billingInfoId");
      KEY_ID_FIELDS.put(BillingPlanKey.class, "billingPlanId");
      KEY_ID_FIELDS.put(PmRuleKey.class, "pmRuleId");
      KEY_ID_FIELDS.put(IpSignalingPeerGroupKey.class, "ipSignalingPeerGroupId");
      KEY_ID_FIELDS.put(IpSignalingPeerGroupDataKey.class, "ipSignalingPeerGroupId");
      KEY_ID_FIELDS.put(IpSignalingPeerGroupDataKey.class, "ipSignalingPeerGroupId");
      KEY_ID_FIELDS.put(NumberingPlanKey.class, "numberingPlanId");
      KEY_ID_FIELDS.put(PpspIdsProfileKey.class, "ppspIdsProfileId");
      KEY_ID_FIELDS.put(SignalingProfileKey.class, "signalingProfileId");
      KEY_ID_FIELDS.put(LocalRingBackToneKey.class, "localRingBackToneId");
      KEY_ID_FIELDS.put(PrefixProfileDataKey.class, "prefixProfileId");
      KEY_ID_FIELDS.put(CodecEntryKey.class, "codecEntryId");
      KEY_ID_FIELDS.put(ServiceExceptionProfileDataKey.class, "exceptionProfileId");
      KEY_ID_FIELDS.put(ServiceExceptionProfileKey.class, "exceptionProfileId");
      KEY_ID_FIELDS.put(ShortKeyProfileDataKey.class, "shortKeyProfileId");
      KEY_ID_FIELDS.put(ShortKeyProfileKey.class, "shortKeyProfileId");
      KEY_ID_FIELDS.put(DtmfProfileDataKey.class, "dtmfProfileId");
      KEY_ID_FIELDS.put(DtmfProfileKey.class, "dtmfProfileId");
      KEY_ID_FIELDS.put(BlockingLabelProfileDataKey.class, "blockingProfileId");
      KEY_ID_FIELDS.put(BlockingLabelProfileKey.class, "blockingProfileId");
      KEY_ID_FIELDS.put(TimeRangeProfileDataKey.class, "timeRangeProfileId");
      KEY_ID_FIELDS.put(TimeRangeProfileKey.class, "timeRangeProfileId");
      KEY_ID_FIELDS.put(CosCpcScreenKey.class, "classOfServiceId");
      KEY_ID_FIELDS.put(CosInfodigitScreenKey.class, "classOfServiceId");
      KEY_ID_FIELDS.put(CosBlockingLabelKey.class, "classOfServiceId");
      KEY_ID_FIELDS.put(EnblocProfileDataKey.class, "enblocProfileId");
      KEY_ID_FIELDS.put(EnblocProfileKey.class, "enblocProfileId");
      KEY_ID_FIELDS.put(InfodigitKey.class, "infodigitId");
      KEY_ID_FIELDS.put(CosCallRestrictionProfileKey.class, "classOfServiceId");
      KEY_ID_FIELDS.put(CallParameterFilterGroupProfileKey.class, "callParamFilterGroupId");
      KEY_ID_FIELDS.put(CallParameterFilterGroupProfileDataKey.class, "callParamFilterGroupId");
      KEY_ID_FIELDS.put(CallParamFilterProfileKey.class, "callParamFilterProfileId");
      KEY_ID_FIELDS.put(CallParamFilterProfileDataKey.class, "callParamFilterProfileId");
      KEY_ID_FIELDS.put(CpcKey.class, "cpcId");
      KEY_ID_FIELDS.put(RoutingLabelKey.class, "routingLabelId");
      KEY_ID_FIELDS.put(RoutingLabelRoutesKey.class, "routingLabelId");
      KEY_ID_FIELDS.put(CpcScreeningKey.class, "cpcScreeningId");
      KEY_ID_FIELDS.put(PspIdsProfileKey.class, "pspIdsProfileId");

      // Values
      VALUE_ID_FIELDS.put(ClassOfService.class, "classOfServiceId");
      VALUE_ID_FIELDS.put(IpSignalingProfile.class, "ipSignalingProfileId");
      VALUE_ID_FIELDS.put(PacketServiceProfile.class, "packetServiceProfileId");
      VALUE_ID_FIELDS.put(PreferredPacketServiceProfile.class, "prfdPacketServiceProfileId");
      VALUE_ID_FIELDS.put(DialPlanProfile.class, "dialPlanProfileId");
      VALUE_ID_FIELDS.put(FeatureControlProfile.class, "featureControlProfileId");
      VALUE_ID_FIELDS.put(ElementRoutingPriority.class, "erpProfileId");
      VALUE_ID_FIELDS.put(PrefixProfile.class, "prefixProfileId");
      VALUE_ID_FIELDS.put(BillingInfoProfile.class, "billingInfoId");
      VALUE_ID_FIELDS.put(BillingInfoProfileData.class, "billingInfoId");
      VALUE_ID_FIELDS.put(BillingPlan.class, "billingPlanId");
      VALUE_ID_FIELDS.put(PmRule.class, "pmRuleId");
      VALUE_ID_FIELDS.put(IpSignalingPeerGroup.class, "ipSignalingPeerGroupId");
      VALUE_ID_FIELDS.put(IpSignalingPeerGroupData.class, "ipSignalingPeerGroupId");
      VALUE_ID_FIELDS.put(NumberingPlan.class, "numberingPlanId");
      VALUE_ID_FIELDS.put(PpspIdsProfile.class, "ppspIdsProfileId");
      VALUE_ID_FIELDS.put(SignalingProfile.class, "signalingProfileId");
      VALUE_ID_FIELDS.put(LocalRingBackTone.class, "localRingBackToneId");
      VALUE_ID_FIELDS.put(PrefixProfileData.class, "prefixProfileId");
      VALUE_ID_FIELDS.put(CodecEntry.class, "codecEntryId");
      VALUE_ID_FIELDS.put(ServiceExceptionProfileData.class, "exceptionProfileId");
      VALUE_ID_FIELDS.put(ServiceExceptionProfile.class, "exceptionProfileId");
      VALUE_ID_FIELDS.put(ShortKeyProfileData.class, "shortKeyProfileId");
      VALUE_ID_FIELDS.put(ShortKeyProfile.class, "shortKeyProfileId");
      VALUE_ID_FIELDS.put(DtmfProfileData.class, "dtmfProfileId");
      VALUE_ID_FIELDS.put(DtmfProfile.class, "dtmfProfileId");
      VALUE_ID_FIELDS.put(BlockingLabelProfileData.class, "blockingProfileId");
      VALUE_ID_FIELDS.put(BlockingLabelProfile.class, "blockingProfileId");
      VALUE_ID_FIELDS.put(TimeRangeProfileData.class, "timeRangeProfileId");
      VALUE_ID_FIELDS.put(TimeRangeProfile.class, "timeRangeProfileId");
      VALUE_ID_FIELDS.put(CosCpcScreen.class, "classOfServiceId");
      VALUE_ID_FIELDS.put(CosInfodigitScreen.class, "classOfServiceId");
      VALUE_ID_FIELDS.put(CosBlockingLabel.class, "classOfServiceId");
      VALUE_ID_FIELDS.put(EnblocProfileData.class, "enblocProfileId");
      VALUE_ID_FIELDS.put(EnblocProfile.class, "enblocProfileId");
      VALUE_ID_FIELDS.put(Infodigit.class, "infodigitId");
      VALUE_ID_FIELDS.put(CosCallRestrictionProfile.class, "classOfServiceId");
      VALUE_ID_FIELDS.put(CallParameterFilterGroupProfile.class, "callParamFilterGroupId");
      VALUE_ID_FIELDS.put(CallParameterFilterGroupProfileData.class, "callParamFilterGroupId");
      VALUE_ID_FIELDS.put(CallParamFilterProfile.class, "callParamFilterProfileId");
      VALUE_ID_FIELDS.put(CallParamFilterProfileData.class, "callParamFilterProfileId");
      VALUE_ID_FIELDS.put(Cpc.class, "cpcId");
      VALUE_ID_FIELDS.put(RoutingLabel.class, "routingLabelId");
      VALUE_ID_FIELDS.put(RoutingLabelRoutes.class, "routingLabelId");
      VALUE_ID_FIELDS.put(CpcScreening.class, "cpcScreeningId");
      VALUE_ID_FIELDS.put(PspIdsProfile.class, "pspIdsProfileId");

      // Map ManagedEntityValue object to PsxProfileTypes
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(ClassOfService.class, PsxProfileType.CLASS_OF_SERVICE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(IpSignalingProfile.class, PsxProfileType.IP_SIGNALING_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(PacketServiceProfile.class, PsxProfileType.PACKET_SERVICE_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(PreferredPacketServiceProfile.class, PsxProfileType.PREFERRED_PACKET_SERVICE_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(DialPlanProfile.class, PsxProfileType.DIAL_PLAN_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(FeatureControlProfile.class, PsxProfileType.FEATURE_CONTROL_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(ElementRoutingPriority.class, PsxProfileType.ELEMENT_ROUTING_PRIORITY);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(PrefixProfile.class, PsxProfileType.PREFIX_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(BillingInfoProfile.class, PsxProfileType.BILLING_INFO_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(BillingInfoProfileData.class, PsxProfileType.BILLING_INFO_PROFILE_DATA);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(BillingPlan.class, PsxProfileType.BILLING_PLAN);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(PmRule.class, PsxProfileType.PM_RULE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(IpSignalingPeerGroup.class, PsxProfileType.IP_SIGNALING_PEER_GROUP);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(IpSignalingPeerGroupData.class, PsxProfileType.IP_SIGNALING_PEER_GROUP_DATA);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(NumberingPlan.class, PsxProfileType.NUMBERING_PLAN);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(PpspIdsProfile.class, PsxProfileType.PPSP_IDS_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(SignalingProfile.class, PsxProfileType.SIGNALING_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(LocalRingBackTone.class, PsxProfileType.LOCAL_RING_BACK_TONE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(PrefixProfileData.class, PsxProfileType.PREFIX_PROFILE_DATA);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(CodecEntry.class, PsxProfileType.CODEC_ENTRY);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(ServiceExceptionProfileData.class, PsxProfileType.SERVICE_EXCEPTION_PROFILE_DATA);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(ServiceExceptionProfile.class, PsxProfileType.SERVICE_EXCEPTION_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(ShortKeyProfileData.class, PsxProfileType.SHORT_KEY_PROFILE_DATA);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(ShortKeyProfile.class, PsxProfileType.SHORT_KEY_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(DtmfProfileData.class, PsxProfileType.DTMF_PROFILE_DATA);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(DtmfProfile.class, PsxProfileType.DTMF_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(BlockingLabelProfileData.class, PsxProfileType.BLOCKING_LABEL_PROFILE_DATA);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(BlockingLabelProfile.class, PsxProfileType.BLOCKING_LABEL_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(TimeRangeProfileData.class, PsxProfileType.TIME_RANGE_PROFILE_DATA);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(TimeRangeProfile.class, PsxProfileType.TIME_RANGE_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(CosCpcScreen.class, PsxProfileType.COS_CPC_SCREEN);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(CosInfodigitScreen.class, PsxProfileType.COS_INFO_DIGIT_SCREEN);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(CosBlockingLabel.class, PsxProfileType.COS_BLOCKING_LABEL);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(EnblocProfileData.class, PsxProfileType.ENBLOC_PROFILE_DATA);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(EnblocProfile.class, PsxProfileType.ENBLOC_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(Infodigit.class, PsxProfileType.INFODIGIT);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(CosCallRestrictionProfile.class, PsxProfileType.COS_CALL_RESTRICTION_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(CallParameterFilterGroupProfile.class, PsxProfileType.CALL_PARAMETER_FILTER_GROUP_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(CallParameterFilterGroupProfileData.class, PsxProfileType.CALL_PARAMETER_FILTER_GROUP_PROFILE_DATA);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(CallParamFilterProfile.class, PsxProfileType.CALL_PARAMETER_FILTER_PROFILE);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(CallParamFilterProfileData.class, PsxProfileType.CALL_PARAMETER_FILTER_PROFILE_DATA);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(Cpc.class, PsxProfileType.CPC);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(RoutingLabel.class, PsxProfileType.ROUTING_LABEL);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(RoutingLabelRoutes.class, PsxProfileType.ROUTING_LABEL_ROUTES);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(CpcScreening.class, PsxProfileType.CPC_SCREENING);
      PROFILE_TYPE_FOR_ENTITY_VALUE.put(PspIdsProfile.class, PsxProfileType.PSP_IDS_PROFILE);

      // Map ProfileTypes to ManagedEntityKeys
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.CLASS_OF_SERVICE, ClassOfServiceKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.IP_SIGNALING_PROFILE, IpSignalingProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.PACKET_SERVICE_PROFILE, PacketServiceProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.PREFERRED_PACKET_SERVICE_PROFILE, PreferredPacketServiceProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.DIAL_PLAN_PROFILE, DialPlanProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.FEATURE_CONTROL_PROFILE, FeatureControlProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.ELEMENT_ROUTING_PRIORITY, ElementRoutingPriorityKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.ELEMENT_ROUTING_PRIORITY_GROUP, ElementRoutingPriorityGroupKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.PREFIX_PROFILE, PrefixProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.BILLING_INFO_PROFILE, BillingInfoProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.BILLING_INFO_PROFILE_DATA, BillingInfoProfileDataKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.BILLING_PLAN, BillingPlanKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.PM_RULE, PmRuleKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.IP_SIGNALING_PEER_GROUP, IpSignalingPeerGroupKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.IP_SIGNALING_PEER_GROUP_DATA, IpSignalingPeerGroupDataKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.NUMBERING_PLAN, NumberingPlanKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.PPSP_IDS_PROFILE, PpspIdsProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.SIGNALING_PROFILE, SignalingProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.LOCAL_RING_BACK_TONE, LocalRingBackToneKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.PREFIX_PROFILE_DATA, PrefixProfileDataKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.CODEC_ENTRY, CodecEntryKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.SERVICE_EXCEPTION_PROFILE_DATA, ServiceExceptionProfileDataKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.SERVICE_EXCEPTION_PROFILE, ServiceExceptionProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.SHORT_KEY_PROFILE_DATA, ShortKeyProfileDataKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.SHORT_KEY_PROFILE, ShortKeyProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.DTMF_PROFILE_DATA, DtmfProfileDataKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.DTMF_PROFILE, DtmfProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.BLOCKING_LABEL_PROFILE_DATA, BlockingLabelProfileDataKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.BLOCKING_LABEL_PROFILE, BlockingLabelProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.TIME_RANGE_PROFILE_DATA, TimeRangeProfileDataKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.TIME_RANGE_PROFILE, TimeRangeProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.COS_CPC_SCREEN, CosCpcScreenKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.COS_INFO_DIGIT_SCREEN, CosInfodigitScreenKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.COS_BLOCKING_LABEL, CosBlockingLabelKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.ENBLOC_PROFILE_DATA, EnblocProfileDataKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.ENBLOC_PROFILE, EnblocProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.INFODIGIT, InfodigitKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.COS_CALL_RESTRICTION_PROFILE, CosCallRestrictionProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.CALL_PARAMETER_FILTER_GROUP_PROFILE, CallParameterFilterGroupProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.CALL_PARAMETER_FILTER_GROUP_PROFILE_DATA, CallParameterFilterGroupProfileDataKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.CALL_PARAMETER_FILTER_PROFILE, CallParamFilterProfileKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.CALL_PARAMETER_FILTER_PROFILE_DATA, CallParamFilterProfileDataKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.CPC, CpcKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.ROUTING_LABEL, RoutingLabelKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.ROUTING_LABEL_ROUTES, RoutingLabelRoutesKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.CPC_SCREENING, CpcScreeningKey.class);
      KEY_FOR_PROFILE_TYPE.put(PsxProfileType.PSP_IDS_PROFILE, PspIdsProfileKey.class);
   }

   public static ManagedEntityKey createManagedEntityKey(final PsxProfileType profileTypeIn, final String idIn)
   {
      final ManagedEntityKey managedEntityKey = getManagedEntityKeyForPsxProfileType(profileTypeIn);
      setIdForManagedEntityKey(idIn, managedEntityKey);
      // Set the CPC Screening sub-ID to the wildcard if we don't have a value set for it, as retrievals will fail if nothing is specified for that field.
      if (managedEntityKey instanceof CpcScreeningKey && ((CpcScreeningKey) managedEntityKey).getCpcValue() == null)
      {
         ((CpcScreeningKey) managedEntityKey).setCpcValue(WILDCARD);
      }
      return managedEntityKey;
   }

   public static ManagedEntityKey createWildcardManagedEntityKey(final PsxProfileType profileTypeIn)
   {
      final ManagedEntityKey managedEntityKey = createManagedEntityKey(profileTypeIn, WILDCARD);
      // CPC Screening Key requires the sub-ID field to be set...
      if (managedEntityKey instanceof CpcScreeningKey)
      {
         ((CpcScreeningKey) managedEntityKey).setCpcValue(WILDCARD);
      }
      return managedEntityKey;
   }

   public static String getIdForManagedEntityKey(final ManagedEntityKey key)
   {
      try
      {
         return BeanUtils.getSimpleProperty(key, KEY_ID_FIELDS.get(key.getClass()));
      }
      catch (final Exception e)
      {
         throw new IllegalArgumentException("Unable to retrieve ID field from ManagedEntityKey of type [" + key.getClass().getSimpleName() + "].");
      }
   }

   public static String getIdForManagedEntityValue(final ManagedEntityValue value)
   {
      try
      {
         return BeanUtils.getSimpleProperty(value, VALUE_ID_FIELDS.get(value.getClass()));
      }
      catch (final Exception e)
      {
         throw new IllegalArgumentException("Unable to retrieve ID field from ManagedEntityValue of type [" + value.getClass().getSimpleName() + "].");
      }
   }

   public static void setIdForManagedEntityValue(final String nameIn, final ManagedEntityValue valueIn)
   {
      try
      {
         BeanUtils.setProperty(valueIn, VALUE_ID_FIELDS.get(valueIn.getClass()), nameIn);
      }
      catch (final Exception e)
      {
         throw new IllegalArgumentException("Unable to set ID field for ManagedEntityValue object.", e);
      }
   }

   public static void setIdForManagedEntityKey(final String nameIn, final ManagedEntityKey keyIn)
   {
      try
      {
         BeanUtils.setProperty(keyIn, KEY_ID_FIELDS.get(keyIn.getClass()), nameIn);
      }
      catch (final Exception e)
      {
         throw new IllegalArgumentException("Unable to set ID field for ManagedEntityKey object.", e);
      }
   }

   public static PsxProfileType getPsxProfileTypeForManagedEntityValue(final ManagedEntityValue managedEntityValueIn)
   {
      return PROFILE_TYPE_FOR_ENTITY_VALUE.get(managedEntityValueIn.getClass());
   }

   @SuppressWarnings("deprecation")
private static ManagedEntityKey getManagedEntityKeyForPsxProfileType(final PsxProfileType profileTypeIn)
   {
      final Class<? extends ManagedEntityKey> classForProfileType = KEY_FOR_PROFILE_TYPE.get(profileTypeIn);
      if (classForProfileType == null)
      {
         throw new IllegalArgumentException("Unable to determine ManagedEntityKey class corresponding to PSX profile type [" + profileTypeIn.getDisplayName() + "].");
      }

      try
      {
         return classForProfileType.newInstance();
      }
      catch (final Exception e)
      {
         throw new IllegalArgumentException("Unable to instantiate ManagedEntityKey class [" + classForProfileType.getSimpleName() + "] for PSX profile type [" + profileTypeIn.getDisplayName() + "].", e);
      }
   }
}