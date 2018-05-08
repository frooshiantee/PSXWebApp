package com.bandwidth.sbcprovisioning.common.domain.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bandwidth.sbcprovisioning.common.domain.BaseProfileType;

/**
 * /!\ Important /!\
 * <p/>
 * When adding new profile types, you will also need to add logic to ManagedEntityUtil.java to translate generic MangedEntityKey and ManagedEntityValue objects into their
 * profile-specific sub-classes, and map the ID fields for the objects.
 */
public enum PsxProfileType implements BaseProfileType
{
   BILLING_INFO_PROFILE_DATA("Billing Info Profile Data", true, true),
   BILLING_INFO_PROFILE("Billing Info Profile", false, true, BILLING_INFO_PROFILE_DATA),
   BILLING_PLAN("Billing Plan", true, true),
   DIAL_PLAN_PROFILE("Dial Plan Profile", true, true),
   IP_SIGNALING_PROFILE("IP Signaling Profile", true, true),
   PM_RULE("PM Rule", true, true),
   ELEMENT_ROUTING_PRIORITY("Element Routing Priority", true, true),
   ELEMENT_ROUTING_PRIORITY_GROUP("Element Routing Priority Group", false, true, ELEMENT_ROUTING_PRIORITY),
   FEATURE_CONTROL_PROFILE("Feature Control Profile", true, true),
   IP_SIGNALING_PEER_GROUP_DATA("IP Signaling Peer Group Data", true, true),
   IP_SIGNALING_PEER_GROUP("IP Signaling Peer Group", true, true, IP_SIGNALING_PEER_GROUP_DATA),
   SIGNALING_PROFILE("Signaling Profile", true, true),
   LOCAL_RING_BACK_TONE("Local Ring Back Tone", true, true),
   PREFIX_PROFILE_DATA("Prefix Profile Data", true, true),
   PREFIX_PROFILE("Prefix Profile", false, true, PREFIX_PROFILE_DATA),
   CODEC_ENTRY("Codec Entry", true, true),
   SERVICE_EXCEPTION_PROFILE_DATA("Service Exception Profile Data", true, true),
   SERVICE_EXCEPTION_PROFILE("Service Exception Profile", false, true, SERVICE_EXCEPTION_PROFILE_DATA),
   SHORT_KEY_PROFILE_DATA("Short Key Profile Data", true, true),
   SHORT_KEY_PROFILE("Short Key Profile", true, true, SHORT_KEY_PROFILE_DATA),
   DTMF_PROFILE_DATA("DTMF Profile Data", true, true),
   DTMF_PROFILE("DTMF Profile", true, true, DTMF_PROFILE_DATA),
   BLOCKING_LABEL_PROFILE_DATA("Blocking Label Profile Data", true, true),
   BLOCKING_LABEL_PROFILE("Blocking Label Profile", false, true, BLOCKING_LABEL_PROFILE_DATA),
   TIME_RANGE_PROFILE_DATA("Time Range Profile Data", true, false),
   TIME_RANGE_PROFILE("Time Range Profile", true, false, TIME_RANGE_PROFILE_DATA),
   ENBLOC_PROFILE_DATA("Enbloc Profile Data", true, false),
   ENBLOC_PROFILE("Enbloc Profile", true, false, ENBLOC_PROFILE_DATA),
   CPC_SCREENING("CPC Screening", true, true),
   ROUTING_LABEL_ROUTES("Routing Label Routes", true, true)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(PM_RULE, Arrays.asList("pmRuleId"));
            return dependencies;
         }
      },
   ROUTING_LABEL("Routing Label", true, true, ROUTING_LABEL_ROUTES)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(CPC_SCREENING, Arrays.asList("rlCpcScreeningId"));
            dependencies.put(PM_RULE, Arrays.asList("pmRuleId"));
            dependencies.put(CALL_PARAMETER_FILTER_GROUP_PROFILE, Arrays.asList("callParamFilterGroupId"));
            return dependencies;
         }
      },
   INFODIGIT("Infodigit", true, true), // Not including the ClassOfService dependency for this, as there's a circular dependency between the two...
   CPC("CPC", true, true) // Not including the ClassOfService dependency for this, as there's a circular dependency between the two...
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(SERVICE_EXCEPTION_PROFILE, Arrays.asList("exceptionProfileId"));
            return dependencies;
         }
      },
   CALL_PARAMETER_FILTER_PROFILE_DATA("Call Parameter Filter Profile Data", true, true),
   CALL_PARAMETER_FILTER_PROFILE("Call Parameter Filter Profile", true, true, CALL_PARAMETER_FILTER_PROFILE_DATA),
   CALL_PARAMETER_FILTER_GROUP_PROFILE_DATA("Call Parameter Filter Group Profile Data", true, true)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(CALL_PARAMETER_FILTER_PROFILE, Arrays.asList("callParamFilterProfileId"));
            return dependencies;
         }
      },
   CALL_PARAMETER_FILTER_GROUP_PROFILE("Call Parameter Filter Group Profile", true, true, CALL_PARAMETER_FILTER_GROUP_PROFILE_DATA),
   COS_INFO_DIGIT_SCREEN("Class Of Service Info Digit Screen", true, true)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(INFODIGIT, Arrays.asList("infodigitId"));
            return dependencies;
         }
      },
   COS_CPC_SCREEN("Class Of Service CPC Screen", true, true)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(CPC, Arrays.asList("cpcScreeningId"));
            return dependencies;
         }
      },
   COS_BLOCKING_LABEL("Class Of Service Blocking Label", true, true)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(BLOCKING_LABEL_PROFILE, Arrays.asList("blockingProfileId"));
            dependencies.put(TIME_RANGE_PROFILE, Arrays.asList("timeRangeProfileId"));
            return dependencies;
         }
      },
   COS_CALL_RESTRICTION_PROFILE("Class of Service Call Restriction Profile", true, true)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(CALL_PARAMETER_FILTER_GROUP_PROFILE, Arrays.asList("callParamFilterGroupId"));
            dependencies.put(ROUTING_LABEL, Arrays.asList("routingLabelId"));
            return dependencies;
         }
      },
   PREFERRED_PACKET_SERVICE_PROFILE("Preferred Packet Service Profile", true, true)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(CODEC_ENTRY,
               Arrays.asList("codecEntry1Id", "codecEntry2Id", "codecEntry3Id", "codecEntry4Id", "codecEntry5Id", "codecEntry6Id", "codecEntry7Id", "codecEntry8Id",
                  "codecEntry9Id", "codecEntry10Id", "codecEntry11Id", "codecEntry12Id"));
            return dependencies;
         }
      },
   PPSP_IDS_PROFILE("PPSP IDs Profile", true, true)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(PREFERRED_PACKET_SERVICE_PROFILE, Arrays.asList("ppspId", "hpcPpspId"));
            return dependencies;
         }
      },
   NUMBERING_PLAN("Numbering Plan", true, true)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(PREFIX_PROFILE, Arrays.asList("prefixProfileId"));
            dependencies.put(ENBLOC_PROFILE, Arrays.asList("enblocProfileId"));
            return dependencies;
         }
      },
   PACKET_SERVICE_PROFILE("Packet Service Profile", true, true)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(CODEC_ENTRY, Arrays.asList("codecEntry1Id", "codecEntry2Id", "codecEntry3Id", "codecEntry4Id"));
            return dependencies;
         }
      },
   PSP_IDS_PROFILE("PSP IDs Profile", true, true)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(PACKET_SERVICE_PROFILE, Arrays.asList("pspId", "hpcPspId"));
            return dependencies;
         }
      },
   CLASS_OF_SERVICE("Class Of Service", true, true, COS_CPC_SCREEN, COS_INFO_DIGIT_SCREEN, COS_BLOCKING_LABEL, COS_CALL_RESTRICTION_PROFILE)
      {
         @Override
         public Map<PsxProfileType, List<String>> getDependencies()
         {
            final Map<PsxProfileType, List<String>> dependencies = new HashMap<PsxProfileType, List<String>>();
            dependencies.put(SERVICE_EXCEPTION_PROFILE, Arrays.asList("exceptionProfileId"));
            dependencies.put(SHORT_KEY_PROFILE, Arrays.asList("shortKeyProfileId"));
            dependencies.put(DTMF_PROFILE, Arrays.asList("dtmfProfileId"));
            return dependencies;
         }
      };

   private String displayName;
   private boolean createOperationSupported; // Mainly used for parent entities, to specify whether the parent entity should be included with the ManagedEntities for the profile, or if only the children can be modified.
   private boolean putOperationSupported; // Whether or not the ManagedEntityValue can be sent to the PSX using the 'put' API command.
   private List<PsxProfileType> children;

   @SuppressWarnings("unused")
   PsxProfileType()
   {
   }

   PsxProfileType(final String displayNameIn, final boolean createOperationSupportedIn, final boolean putOperationSupportedIn, final PsxProfileType... childrenIn)
   {
      displayName = displayNameIn;
      createOperationSupported = createOperationSupportedIn;
      putOperationSupported = putOperationSupportedIn;
      if (childrenIn == null)
      {
         children = Collections.emptyList();
      }
      else
      {
         children = Arrays.asList(childrenIn);
      }
   }

   // Profile Types that have dependencies should override this, and provide their dependencies.
   /**
    * @return A Map of any other PsxProfiles this PsxProfile depends on, and the name(s) of the fields in that profile's ManagedEntityValue object that reference that PsxProfile.
    */
   public Map<PsxProfileType, List<String>> getDependencies()
   {
      return Collections.emptyMap();
   }

   public String getDisplayName()
   {
      return displayName;
   }

   public List<PsxProfileType> getChildren()
   {
      return children;
   }

   public boolean isGroup()
   {
      return children != null && !children.isEmpty();
   }

   public boolean isCreateOperationSupported()
   {
      return createOperationSupported;
   }

   public boolean isPutOperationSupported()
   {
      return putOperationSupported;
   }

   public static PsxProfileType fromString(final String nameIn)
   {
      if (nameIn != null)
      {
         for (final PsxProfileType profileType : PsxProfileType.values())
         {
            if (profileType.name().replaceAll("_", "").equalsIgnoreCase(nameIn))
            {
               return profileType;
            }
         }
      }

      return null;
   }

   public static List<PsxProfileType> allNonChildren()
   {
      final Set<PsxProfileType> all = new HashSet<PsxProfileType>(Arrays.asList(values()));
      for (final PsxProfileType profileType : values())
      {
         if (profileType.isGroup())
         {
            all.removeAll(profileType.getChildren());
         }
      }

      return new ArrayList<PsxProfileType>(all);
   }
}