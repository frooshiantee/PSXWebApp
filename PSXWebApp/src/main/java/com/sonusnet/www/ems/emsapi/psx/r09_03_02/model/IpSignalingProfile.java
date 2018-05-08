/**
 * IpSignalingProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class IpSignalingProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String ipSignalingProfileId;

    private java.lang.Short protocolType;

    private java.lang.Integer ipSigAttributes1;

    private java.lang.Integer ipSigAttributes2;

    private java.lang.Short sipSignalingTypeVersionId;

    private java.lang.Short sipSignalingType;

    private java.lang.Short sipSignalingTreatment;

    private java.lang.Short sipSignalingRedirectPurge;

    private java.lang.Short sipSignalingRedirectReject;

    private java.lang.Short sipHeaderPrivacyInfo;

    private java.lang.Short sipSignalingTransportType;

    private java.lang.Integer sipOriginatingTg;

    private java.lang.Integer sipDestinationTg;

    private java.lang.Integer sipDcsChargeInfo;

    private java.lang.Integer ipSigAttributes3;

    private java.lang.Integer ipSigAttributes4;

    private java.lang.Integer sipCallForwardingMapping;

    private java.lang.Integer sipToHeaderMapping;

    private java.lang.Integer sipCauseMappingIndex;

    private java.lang.Integer internalCauseMappingIndex;

    private java.lang.Integer mirroredTransparencies1;

    private java.lang.Integer mirroredTransparencies2;

    private java.lang.Integer nonMirroredTransparencies1;

    private java.lang.Integer nonMirroredTransparencies2;

    private java.lang.Integer ipSigAttributes5;

    private java.lang.Integer ipSigAttributes6;

    private java.lang.Integer sipNpdiOption;

    private java.lang.Short sessionExpiresRefresherParm;

    private java.lang.Integer sipRelayFlags1;

    private java.lang.Integer sipRelayFlags2;

    private java.lang.Integer sipRelayFlags3;

    private java.lang.Integer sipRelayFlags4;

    private java.lang.Short handleIpNotInNst;

    private java.lang.Short ingHandleIpNotInNst;

    private java.lang.Short sipSignalingTransportType2;

    private java.lang.Short sipSignalingTransportType3;

    private java.lang.Short sipSignalingTransportType4;

    private java.lang.Integer ipSigAttributes7;

    private java.lang.Integer ipSigAttributes8;

    private java.lang.Integer sipOptionTagInSupported;

    private java.lang.Integer sipOptionTagInRequire;

    private java.lang.String globalizeProfileId;

    private java.lang.Integer etsDefaultPrioValue;

    private java.lang.Integer action400RespWith417;

    private java.lang.Integer useIncomingEtsResValue;

    private java.lang.Integer doNotIncludeRequireRph;

    private java.lang.Short sipHeaderPChargeInfo;

    private java.lang.Integer ipSigAttributes9;

    private java.lang.Integer ipSigAttributes10;

    private java.lang.String mediaQosKpiProfileId;

    private java.lang.String signalingQosProfileId;

    private java.lang.Integer callPreservationValue;

    private java.lang.Integer ipSigAttributes11;

    private java.lang.Integer phoneContextLen;

    private java.lang.String accessTransferProfileId;

    private java.lang.String preferredMrbUri;

    private java.lang.String preferredTrfUri;

    private java.lang.Integer ipSigAttributes12;

    private java.lang.Integer genericAttributes1;

    private java.lang.Integer genericAttributes2;

    private java.lang.Integer genericAttributes3;

    private java.lang.Integer genericAttributes4;

    public IpSignalingProfile() {
    }

    public IpSignalingProfile(
           java.lang.String ipSignalingProfileId,
           java.lang.Short protocolType,
           java.lang.Integer ipSigAttributes1,
           java.lang.Integer ipSigAttributes2,
           java.lang.Short sipSignalingTypeVersionId,
           java.lang.Short sipSignalingType,
           java.lang.Short sipSignalingTreatment,
           java.lang.Short sipSignalingRedirectPurge,
           java.lang.Short sipSignalingRedirectReject,
           java.lang.Short sipHeaderPrivacyInfo,
           java.lang.Short sipSignalingTransportType,
           java.lang.Integer sipOriginatingTg,
           java.lang.Integer sipDestinationTg,
           java.lang.Integer sipDcsChargeInfo,
           java.lang.Integer ipSigAttributes3,
           java.lang.Integer ipSigAttributes4,
           java.lang.Integer sipCallForwardingMapping,
           java.lang.Integer sipToHeaderMapping,
           java.lang.Integer sipCauseMappingIndex,
           java.lang.Integer internalCauseMappingIndex,
           java.lang.Integer mirroredTransparencies1,
           java.lang.Integer mirroredTransparencies2,
           java.lang.Integer nonMirroredTransparencies1,
           java.lang.Integer nonMirroredTransparencies2,
           java.lang.Integer ipSigAttributes5,
           java.lang.Integer ipSigAttributes6,
           java.lang.Integer sipNpdiOption,
           java.lang.Short sessionExpiresRefresherParm,
           java.lang.Integer sipRelayFlags1,
           java.lang.Integer sipRelayFlags2,
           java.lang.Integer sipRelayFlags3,
           java.lang.Integer sipRelayFlags4,
           java.lang.Short handleIpNotInNst,
           java.lang.Short ingHandleIpNotInNst,
           java.lang.Short sipSignalingTransportType2,
           java.lang.Short sipSignalingTransportType3,
           java.lang.Short sipSignalingTransportType4,
           java.lang.Integer ipSigAttributes7,
           java.lang.Integer ipSigAttributes8,
           java.lang.Integer sipOptionTagInSupported,
           java.lang.Integer sipOptionTagInRequire,
           java.lang.String globalizeProfileId,
           java.lang.Integer etsDefaultPrioValue,
           java.lang.Integer action400RespWith417,
           java.lang.Integer useIncomingEtsResValue,
           java.lang.Integer doNotIncludeRequireRph,
           java.lang.Short sipHeaderPChargeInfo,
           java.lang.Integer ipSigAttributes9,
           java.lang.Integer ipSigAttributes10,
           java.lang.String mediaQosKpiProfileId,
           java.lang.String signalingQosProfileId,
           java.lang.Integer callPreservationValue,
           java.lang.Integer ipSigAttributes11,
           java.lang.Integer phoneContextLen,
           java.lang.String accessTransferProfileId,
           java.lang.String preferredMrbUri,
           java.lang.String preferredTrfUri,
           java.lang.Integer ipSigAttributes12,
           java.lang.Integer genericAttributes1,
           java.lang.Integer genericAttributes2,
           java.lang.Integer genericAttributes3,
           java.lang.Integer genericAttributes4) {
        this.ipSignalingProfileId = ipSignalingProfileId;
        this.protocolType = protocolType;
        this.ipSigAttributes1 = ipSigAttributes1;
        this.ipSigAttributes2 = ipSigAttributes2;
        this.sipSignalingTypeVersionId = sipSignalingTypeVersionId;
        this.sipSignalingType = sipSignalingType;
        this.sipSignalingTreatment = sipSignalingTreatment;
        this.sipSignalingRedirectPurge = sipSignalingRedirectPurge;
        this.sipSignalingRedirectReject = sipSignalingRedirectReject;
        this.sipHeaderPrivacyInfo = sipHeaderPrivacyInfo;
        this.sipSignalingTransportType = sipSignalingTransportType;
        this.sipOriginatingTg = sipOriginatingTg;
        this.sipDestinationTg = sipDestinationTg;
        this.sipDcsChargeInfo = sipDcsChargeInfo;
        this.ipSigAttributes3 = ipSigAttributes3;
        this.ipSigAttributes4 = ipSigAttributes4;
        this.sipCallForwardingMapping = sipCallForwardingMapping;
        this.sipToHeaderMapping = sipToHeaderMapping;
        this.sipCauseMappingIndex = sipCauseMappingIndex;
        this.internalCauseMappingIndex = internalCauseMappingIndex;
        this.mirroredTransparencies1 = mirroredTransparencies1;
        this.mirroredTransparencies2 = mirroredTransparencies2;
        this.nonMirroredTransparencies1 = nonMirroredTransparencies1;
        this.nonMirroredTransparencies2 = nonMirroredTransparencies2;
        this.ipSigAttributes5 = ipSigAttributes5;
        this.ipSigAttributes6 = ipSigAttributes6;
        this.sipNpdiOption = sipNpdiOption;
        this.sessionExpiresRefresherParm = sessionExpiresRefresherParm;
        this.sipRelayFlags1 = sipRelayFlags1;
        this.sipRelayFlags2 = sipRelayFlags2;
        this.sipRelayFlags3 = sipRelayFlags3;
        this.sipRelayFlags4 = sipRelayFlags4;
        this.handleIpNotInNst = handleIpNotInNst;
        this.ingHandleIpNotInNst = ingHandleIpNotInNst;
        this.sipSignalingTransportType2 = sipSignalingTransportType2;
        this.sipSignalingTransportType3 = sipSignalingTransportType3;
        this.sipSignalingTransportType4 = sipSignalingTransportType4;
        this.ipSigAttributes7 = ipSigAttributes7;
        this.ipSigAttributes8 = ipSigAttributes8;
        this.sipOptionTagInSupported = sipOptionTagInSupported;
        this.sipOptionTagInRequire = sipOptionTagInRequire;
        this.globalizeProfileId = globalizeProfileId;
        this.etsDefaultPrioValue = etsDefaultPrioValue;
        this.action400RespWith417 = action400RespWith417;
        this.useIncomingEtsResValue = useIncomingEtsResValue;
        this.doNotIncludeRequireRph = doNotIncludeRequireRph;
        this.sipHeaderPChargeInfo = sipHeaderPChargeInfo;
        this.ipSigAttributes9 = ipSigAttributes9;
        this.ipSigAttributes10 = ipSigAttributes10;
        this.mediaQosKpiProfileId = mediaQosKpiProfileId;
        this.signalingQosProfileId = signalingQosProfileId;
        this.callPreservationValue = callPreservationValue;
        this.ipSigAttributes11 = ipSigAttributes11;
        this.phoneContextLen = phoneContextLen;
        this.accessTransferProfileId = accessTransferProfileId;
        this.preferredMrbUri = preferredMrbUri;
        this.preferredTrfUri = preferredTrfUri;
        this.ipSigAttributes12 = ipSigAttributes12;
        this.genericAttributes1 = genericAttributes1;
        this.genericAttributes2 = genericAttributes2;
        this.genericAttributes3 = genericAttributes3;
        this.genericAttributes4 = genericAttributes4;
    }


    /**
     * Gets the ipSignalingProfileId value for this IpSignalingProfile.
     * 
     * @return ipSignalingProfileId
     */
    public java.lang.String getIpSignalingProfileId() {
        return ipSignalingProfileId;
    }


    /**
     * Sets the ipSignalingProfileId value for this IpSignalingProfile.
     * 
     * @param ipSignalingProfileId
     */
    public void setIpSignalingProfileId(java.lang.String ipSignalingProfileId) {
        this.ipSignalingProfileId = ipSignalingProfileId;
    }


    /**
     * Gets the protocolType value for this IpSignalingProfile.
     * 
     * @return protocolType
     */
    public java.lang.Short getProtocolType() {
        return protocolType;
    }


    /**
     * Sets the protocolType value for this IpSignalingProfile.
     * 
     * @param protocolType
     */
    public void setProtocolType(java.lang.Short protocolType) {
        this.protocolType = protocolType;
    }


    /**
     * Gets the ipSigAttributes1 value for this IpSignalingProfile.
     * 
     * @return ipSigAttributes1
     */
    public java.lang.Integer getIpSigAttributes1() {
        return ipSigAttributes1;
    }


    /**
     * Sets the ipSigAttributes1 value for this IpSignalingProfile.
     * 
     * @param ipSigAttributes1
     */
    public void setIpSigAttributes1(java.lang.Integer ipSigAttributes1) {
        this.ipSigAttributes1 = ipSigAttributes1;
    }


    /**
     * Gets the ipSigAttributes2 value for this IpSignalingProfile.
     * 
     * @return ipSigAttributes2
     */
    public java.lang.Integer getIpSigAttributes2() {
        return ipSigAttributes2;
    }


    /**
     * Sets the ipSigAttributes2 value for this IpSignalingProfile.
     * 
     * @param ipSigAttributes2
     */
    public void setIpSigAttributes2(java.lang.Integer ipSigAttributes2) {
        this.ipSigAttributes2 = ipSigAttributes2;
    }


    /**
     * Gets the sipSignalingTypeVersionId value for this IpSignalingProfile.
     * 
     * @return sipSignalingTypeVersionId
     */
    public java.lang.Short getSipSignalingTypeVersionId() {
        return sipSignalingTypeVersionId;
    }


    /**
     * Sets the sipSignalingTypeVersionId value for this IpSignalingProfile.
     * 
     * @param sipSignalingTypeVersionId
     */
    public void setSipSignalingTypeVersionId(java.lang.Short sipSignalingTypeVersionId) {
        this.sipSignalingTypeVersionId = sipSignalingTypeVersionId;
    }


    /**
     * Gets the sipSignalingType value for this IpSignalingProfile.
     * 
     * @return sipSignalingType
     */
    public java.lang.Short getSipSignalingType() {
        return sipSignalingType;
    }


    /**
     * Sets the sipSignalingType value for this IpSignalingProfile.
     * 
     * @param sipSignalingType
     */
    public void setSipSignalingType(java.lang.Short sipSignalingType) {
        this.sipSignalingType = sipSignalingType;
    }


    /**
     * Gets the sipSignalingTreatment value for this IpSignalingProfile.
     * 
     * @return sipSignalingTreatment
     */
    public java.lang.Short getSipSignalingTreatment() {
        return sipSignalingTreatment;
    }


    /**
     * Sets the sipSignalingTreatment value for this IpSignalingProfile.
     * 
     * @param sipSignalingTreatment
     */
    public void setSipSignalingTreatment(java.lang.Short sipSignalingTreatment) {
        this.sipSignalingTreatment = sipSignalingTreatment;
    }


    /**
     * Gets the sipSignalingRedirectPurge value for this IpSignalingProfile.
     * 
     * @return sipSignalingRedirectPurge
     */
    public java.lang.Short getSipSignalingRedirectPurge() {
        return sipSignalingRedirectPurge;
    }


    /**
     * Sets the sipSignalingRedirectPurge value for this IpSignalingProfile.
     * 
     * @param sipSignalingRedirectPurge
     */
    public void setSipSignalingRedirectPurge(java.lang.Short sipSignalingRedirectPurge) {
        this.sipSignalingRedirectPurge = sipSignalingRedirectPurge;
    }


    /**
     * Gets the sipSignalingRedirectReject value for this IpSignalingProfile.
     * 
     * @return sipSignalingRedirectReject
     */
    public java.lang.Short getSipSignalingRedirectReject() {
        return sipSignalingRedirectReject;
    }


    /**
     * Sets the sipSignalingRedirectReject value for this IpSignalingProfile.
     * 
     * @param sipSignalingRedirectReject
     */
    public void setSipSignalingRedirectReject(java.lang.Short sipSignalingRedirectReject) {
        this.sipSignalingRedirectReject = sipSignalingRedirectReject;
    }


    /**
     * Gets the sipHeaderPrivacyInfo value for this IpSignalingProfile.
     * 
     * @return sipHeaderPrivacyInfo
     */
    public java.lang.Short getSipHeaderPrivacyInfo() {
        return sipHeaderPrivacyInfo;
    }


    /**
     * Sets the sipHeaderPrivacyInfo value for this IpSignalingProfile.
     * 
     * @param sipHeaderPrivacyInfo
     */
    public void setSipHeaderPrivacyInfo(java.lang.Short sipHeaderPrivacyInfo) {
        this.sipHeaderPrivacyInfo = sipHeaderPrivacyInfo;
    }


    /**
     * Gets the sipSignalingTransportType value for this IpSignalingProfile.
     * 
     * @return sipSignalingTransportType
     */
    public java.lang.Short getSipSignalingTransportType() {
        return sipSignalingTransportType;
    }


    /**
     * Sets the sipSignalingTransportType value for this IpSignalingProfile.
     * 
     * @param sipSignalingTransportType
     */
    public void setSipSignalingTransportType(java.lang.Short sipSignalingTransportType) {
        this.sipSignalingTransportType = sipSignalingTransportType;
    }


    /**
     * Gets the sipOriginatingTg value for this IpSignalingProfile.
     * 
     * @return sipOriginatingTg
     */
    public java.lang.Integer getSipOriginatingTg() {
        return sipOriginatingTg;
    }


    /**
     * Sets the sipOriginatingTg value for this IpSignalingProfile.
     * 
     * @param sipOriginatingTg
     */
    public void setSipOriginatingTg(java.lang.Integer sipOriginatingTg) {
        this.sipOriginatingTg = sipOriginatingTg;
    }


    /**
     * Gets the sipDestinationTg value for this IpSignalingProfile.
     * 
     * @return sipDestinationTg
     */
    public java.lang.Integer getSipDestinationTg() {
        return sipDestinationTg;
    }


    /**
     * Sets the sipDestinationTg value for this IpSignalingProfile.
     * 
     * @param sipDestinationTg
     */
    public void setSipDestinationTg(java.lang.Integer sipDestinationTg) {
        this.sipDestinationTg = sipDestinationTg;
    }


    /**
     * Gets the sipDcsChargeInfo value for this IpSignalingProfile.
     * 
     * @return sipDcsChargeInfo
     */
    public java.lang.Integer getSipDcsChargeInfo() {
        return sipDcsChargeInfo;
    }


    /**
     * Sets the sipDcsChargeInfo value for this IpSignalingProfile.
     * 
     * @param sipDcsChargeInfo
     */
    public void setSipDcsChargeInfo(java.lang.Integer sipDcsChargeInfo) {
        this.sipDcsChargeInfo = sipDcsChargeInfo;
    }


    /**
     * Gets the ipSigAttributes3 value for this IpSignalingProfile.
     * 
     * @return ipSigAttributes3
     */
    public java.lang.Integer getIpSigAttributes3() {
        return ipSigAttributes3;
    }


    /**
     * Sets the ipSigAttributes3 value for this IpSignalingProfile.
     * 
     * @param ipSigAttributes3
     */
    public void setIpSigAttributes3(java.lang.Integer ipSigAttributes3) {
        this.ipSigAttributes3 = ipSigAttributes3;
    }


    /**
     * Gets the ipSigAttributes4 value for this IpSignalingProfile.
     * 
     * @return ipSigAttributes4
     */
    public java.lang.Integer getIpSigAttributes4() {
        return ipSigAttributes4;
    }


    /**
     * Sets the ipSigAttributes4 value for this IpSignalingProfile.
     * 
     * @param ipSigAttributes4
     */
    public void setIpSigAttributes4(java.lang.Integer ipSigAttributes4) {
        this.ipSigAttributes4 = ipSigAttributes4;
    }


    /**
     * Gets the sipCallForwardingMapping value for this IpSignalingProfile.
     * 
     * @return sipCallForwardingMapping
     */
    public java.lang.Integer getSipCallForwardingMapping() {
        return sipCallForwardingMapping;
    }


    /**
     * Sets the sipCallForwardingMapping value for this IpSignalingProfile.
     * 
     * @param sipCallForwardingMapping
     */
    public void setSipCallForwardingMapping(java.lang.Integer sipCallForwardingMapping) {
        this.sipCallForwardingMapping = sipCallForwardingMapping;
    }


    /**
     * Gets the sipToHeaderMapping value for this IpSignalingProfile.
     * 
     * @return sipToHeaderMapping
     */
    public java.lang.Integer getSipToHeaderMapping() {
        return sipToHeaderMapping;
    }


    /**
     * Sets the sipToHeaderMapping value for this IpSignalingProfile.
     * 
     * @param sipToHeaderMapping
     */
    public void setSipToHeaderMapping(java.lang.Integer sipToHeaderMapping) {
        this.sipToHeaderMapping = sipToHeaderMapping;
    }


    /**
     * Gets the sipCauseMappingIndex value for this IpSignalingProfile.
     * 
     * @return sipCauseMappingIndex
     */
    public java.lang.Integer getSipCauseMappingIndex() {
        return sipCauseMappingIndex;
    }


    /**
     * Sets the sipCauseMappingIndex value for this IpSignalingProfile.
     * 
     * @param sipCauseMappingIndex
     */
    public void setSipCauseMappingIndex(java.lang.Integer sipCauseMappingIndex) {
        this.sipCauseMappingIndex = sipCauseMappingIndex;
    }


    /**
     * Gets the internalCauseMappingIndex value for this IpSignalingProfile.
     * 
     * @return internalCauseMappingIndex
     */
    public java.lang.Integer getInternalCauseMappingIndex() {
        return internalCauseMappingIndex;
    }


    /**
     * Sets the internalCauseMappingIndex value for this IpSignalingProfile.
     * 
     * @param internalCauseMappingIndex
     */
    public void setInternalCauseMappingIndex(java.lang.Integer internalCauseMappingIndex) {
        this.internalCauseMappingIndex = internalCauseMappingIndex;
    }


    /**
     * Gets the mirroredTransparencies1 value for this IpSignalingProfile.
     * 
     * @return mirroredTransparencies1
     */
    public java.lang.Integer getMirroredTransparencies1() {
        return mirroredTransparencies1;
    }


    /**
     * Sets the mirroredTransparencies1 value for this IpSignalingProfile.
     * 
     * @param mirroredTransparencies1
     */
    public void setMirroredTransparencies1(java.lang.Integer mirroredTransparencies1) {
        this.mirroredTransparencies1 = mirroredTransparencies1;
    }


    /**
     * Gets the mirroredTransparencies2 value for this IpSignalingProfile.
     * 
     * @return mirroredTransparencies2
     */
    public java.lang.Integer getMirroredTransparencies2() {
        return mirroredTransparencies2;
    }


    /**
     * Sets the mirroredTransparencies2 value for this IpSignalingProfile.
     * 
     * @param mirroredTransparencies2
     */
    public void setMirroredTransparencies2(java.lang.Integer mirroredTransparencies2) {
        this.mirroredTransparencies2 = mirroredTransparencies2;
    }


    /**
     * Gets the nonMirroredTransparencies1 value for this IpSignalingProfile.
     * 
     * @return nonMirroredTransparencies1
     */
    public java.lang.Integer getNonMirroredTransparencies1() {
        return nonMirroredTransparencies1;
    }


    /**
     * Sets the nonMirroredTransparencies1 value for this IpSignalingProfile.
     * 
     * @param nonMirroredTransparencies1
     */
    public void setNonMirroredTransparencies1(java.lang.Integer nonMirroredTransparencies1) {
        this.nonMirroredTransparencies1 = nonMirroredTransparencies1;
    }


    /**
     * Gets the nonMirroredTransparencies2 value for this IpSignalingProfile.
     * 
     * @return nonMirroredTransparencies2
     */
    public java.lang.Integer getNonMirroredTransparencies2() {
        return nonMirroredTransparencies2;
    }


    /**
     * Sets the nonMirroredTransparencies2 value for this IpSignalingProfile.
     * 
     * @param nonMirroredTransparencies2
     */
    public void setNonMirroredTransparencies2(java.lang.Integer nonMirroredTransparencies2) {
        this.nonMirroredTransparencies2 = nonMirroredTransparencies2;
    }


    /**
     * Gets the ipSigAttributes5 value for this IpSignalingProfile.
     * 
     * @return ipSigAttributes5
     */
    public java.lang.Integer getIpSigAttributes5() {
        return ipSigAttributes5;
    }


    /**
     * Sets the ipSigAttributes5 value for this IpSignalingProfile.
     * 
     * @param ipSigAttributes5
     */
    public void setIpSigAttributes5(java.lang.Integer ipSigAttributes5) {
        this.ipSigAttributes5 = ipSigAttributes5;
    }


    /**
     * Gets the ipSigAttributes6 value for this IpSignalingProfile.
     * 
     * @return ipSigAttributes6
     */
    public java.lang.Integer getIpSigAttributes6() {
        return ipSigAttributes6;
    }


    /**
     * Sets the ipSigAttributes6 value for this IpSignalingProfile.
     * 
     * @param ipSigAttributes6
     */
    public void setIpSigAttributes6(java.lang.Integer ipSigAttributes6) {
        this.ipSigAttributes6 = ipSigAttributes6;
    }


    /**
     * Gets the sipNpdiOption value for this IpSignalingProfile.
     * 
     * @return sipNpdiOption
     */
    public java.lang.Integer getSipNpdiOption() {
        return sipNpdiOption;
    }


    /**
     * Sets the sipNpdiOption value for this IpSignalingProfile.
     * 
     * @param sipNpdiOption
     */
    public void setSipNpdiOption(java.lang.Integer sipNpdiOption) {
        this.sipNpdiOption = sipNpdiOption;
    }


    /**
     * Gets the sessionExpiresRefresherParm value for this IpSignalingProfile.
     * 
     * @return sessionExpiresRefresherParm
     */
    public java.lang.Short getSessionExpiresRefresherParm() {
        return sessionExpiresRefresherParm;
    }


    /**
     * Sets the sessionExpiresRefresherParm value for this IpSignalingProfile.
     * 
     * @param sessionExpiresRefresherParm
     */
    public void setSessionExpiresRefresherParm(java.lang.Short sessionExpiresRefresherParm) {
        this.sessionExpiresRefresherParm = sessionExpiresRefresherParm;
    }


    /**
     * Gets the sipRelayFlags1 value for this IpSignalingProfile.
     * 
     * @return sipRelayFlags1
     */
    public java.lang.Integer getSipRelayFlags1() {
        return sipRelayFlags1;
    }


    /**
     * Sets the sipRelayFlags1 value for this IpSignalingProfile.
     * 
     * @param sipRelayFlags1
     */
    public void setSipRelayFlags1(java.lang.Integer sipRelayFlags1) {
        this.sipRelayFlags1 = sipRelayFlags1;
    }


    /**
     * Gets the sipRelayFlags2 value for this IpSignalingProfile.
     * 
     * @return sipRelayFlags2
     */
    public java.lang.Integer getSipRelayFlags2() {
        return sipRelayFlags2;
    }


    /**
     * Sets the sipRelayFlags2 value for this IpSignalingProfile.
     * 
     * @param sipRelayFlags2
     */
    public void setSipRelayFlags2(java.lang.Integer sipRelayFlags2) {
        this.sipRelayFlags2 = sipRelayFlags2;
    }


    /**
     * Gets the sipRelayFlags3 value for this IpSignalingProfile.
     * 
     * @return sipRelayFlags3
     */
    public java.lang.Integer getSipRelayFlags3() {
        return sipRelayFlags3;
    }


    /**
     * Sets the sipRelayFlags3 value for this IpSignalingProfile.
     * 
     * @param sipRelayFlags3
     */
    public void setSipRelayFlags3(java.lang.Integer sipRelayFlags3) {
        this.sipRelayFlags3 = sipRelayFlags3;
    }


    /**
     * Gets the sipRelayFlags4 value for this IpSignalingProfile.
     * 
     * @return sipRelayFlags4
     */
    public java.lang.Integer getSipRelayFlags4() {
        return sipRelayFlags4;
    }


    /**
     * Sets the sipRelayFlags4 value for this IpSignalingProfile.
     * 
     * @param sipRelayFlags4
     */
    public void setSipRelayFlags4(java.lang.Integer sipRelayFlags4) {
        this.sipRelayFlags4 = sipRelayFlags4;
    }


    /**
     * Gets the handleIpNotInNst value for this IpSignalingProfile.
     * 
     * @return handleIpNotInNst
     */
    public java.lang.Short getHandleIpNotInNst() {
        return handleIpNotInNst;
    }


    /**
     * Sets the handleIpNotInNst value for this IpSignalingProfile.
     * 
     * @param handleIpNotInNst
     */
    public void setHandleIpNotInNst(java.lang.Short handleIpNotInNst) {
        this.handleIpNotInNst = handleIpNotInNst;
    }


    /**
     * Gets the ingHandleIpNotInNst value for this IpSignalingProfile.
     * 
     * @return ingHandleIpNotInNst
     */
    public java.lang.Short getIngHandleIpNotInNst() {
        return ingHandleIpNotInNst;
    }


    /**
     * Sets the ingHandleIpNotInNst value for this IpSignalingProfile.
     * 
     * @param ingHandleIpNotInNst
     */
    public void setIngHandleIpNotInNst(java.lang.Short ingHandleIpNotInNst) {
        this.ingHandleIpNotInNst = ingHandleIpNotInNst;
    }


    /**
     * Gets the sipSignalingTransportType2 value for this IpSignalingProfile.
     * 
     * @return sipSignalingTransportType2
     */
    public java.lang.Short getSipSignalingTransportType2() {
        return sipSignalingTransportType2;
    }


    /**
     * Sets the sipSignalingTransportType2 value for this IpSignalingProfile.
     * 
     * @param sipSignalingTransportType2
     */
    public void setSipSignalingTransportType2(java.lang.Short sipSignalingTransportType2) {
        this.sipSignalingTransportType2 = sipSignalingTransportType2;
    }


    /**
     * Gets the sipSignalingTransportType3 value for this IpSignalingProfile.
     * 
     * @return sipSignalingTransportType3
     */
    public java.lang.Short getSipSignalingTransportType3() {
        return sipSignalingTransportType3;
    }


    /**
     * Sets the sipSignalingTransportType3 value for this IpSignalingProfile.
     * 
     * @param sipSignalingTransportType3
     */
    public void setSipSignalingTransportType3(java.lang.Short sipSignalingTransportType3) {
        this.sipSignalingTransportType3 = sipSignalingTransportType3;
    }


    /**
     * Gets the sipSignalingTransportType4 value for this IpSignalingProfile.
     * 
     * @return sipSignalingTransportType4
     */
    public java.lang.Short getSipSignalingTransportType4() {
        return sipSignalingTransportType4;
    }


    /**
     * Sets the sipSignalingTransportType4 value for this IpSignalingProfile.
     * 
     * @param sipSignalingTransportType4
     */
    public void setSipSignalingTransportType4(java.lang.Short sipSignalingTransportType4) {
        this.sipSignalingTransportType4 = sipSignalingTransportType4;
    }


    /**
     * Gets the ipSigAttributes7 value for this IpSignalingProfile.
     * 
     * @return ipSigAttributes7
     */
    public java.lang.Integer getIpSigAttributes7() {
        return ipSigAttributes7;
    }


    /**
     * Sets the ipSigAttributes7 value for this IpSignalingProfile.
     * 
     * @param ipSigAttributes7
     */
    public void setIpSigAttributes7(java.lang.Integer ipSigAttributes7) {
        this.ipSigAttributes7 = ipSigAttributes7;
    }


    /**
     * Gets the ipSigAttributes8 value for this IpSignalingProfile.
     * 
     * @return ipSigAttributes8
     */
    public java.lang.Integer getIpSigAttributes8() {
        return ipSigAttributes8;
    }


    /**
     * Sets the ipSigAttributes8 value for this IpSignalingProfile.
     * 
     * @param ipSigAttributes8
     */
    public void setIpSigAttributes8(java.lang.Integer ipSigAttributes8) {
        this.ipSigAttributes8 = ipSigAttributes8;
    }


    /**
     * Gets the sipOptionTagInSupported value for this IpSignalingProfile.
     * 
     * @return sipOptionTagInSupported
     */
    public java.lang.Integer getSipOptionTagInSupported() {
        return sipOptionTagInSupported;
    }


    /**
     * Sets the sipOptionTagInSupported value for this IpSignalingProfile.
     * 
     * @param sipOptionTagInSupported
     */
    public void setSipOptionTagInSupported(java.lang.Integer sipOptionTagInSupported) {
        this.sipOptionTagInSupported = sipOptionTagInSupported;
    }


    /**
     * Gets the sipOptionTagInRequire value for this IpSignalingProfile.
     * 
     * @return sipOptionTagInRequire
     */
    public java.lang.Integer getSipOptionTagInRequire() {
        return sipOptionTagInRequire;
    }


    /**
     * Sets the sipOptionTagInRequire value for this IpSignalingProfile.
     * 
     * @param sipOptionTagInRequire
     */
    public void setSipOptionTagInRequire(java.lang.Integer sipOptionTagInRequire) {
        this.sipOptionTagInRequire = sipOptionTagInRequire;
    }


    /**
     * Gets the globalizeProfileId value for this IpSignalingProfile.
     * 
     * @return globalizeProfileId
     */
    public java.lang.String getGlobalizeProfileId() {
        return globalizeProfileId;
    }


    /**
     * Sets the globalizeProfileId value for this IpSignalingProfile.
     * 
     * @param globalizeProfileId
     */
    public void setGlobalizeProfileId(java.lang.String globalizeProfileId) {
        this.globalizeProfileId = globalizeProfileId;
    }


    /**
     * Gets the etsDefaultPrioValue value for this IpSignalingProfile.
     * 
     * @return etsDefaultPrioValue
     */
    public java.lang.Integer getEtsDefaultPrioValue() {
        return etsDefaultPrioValue;
    }


    /**
     * Sets the etsDefaultPrioValue value for this IpSignalingProfile.
     * 
     * @param etsDefaultPrioValue
     */
    public void setEtsDefaultPrioValue(java.lang.Integer etsDefaultPrioValue) {
        this.etsDefaultPrioValue = etsDefaultPrioValue;
    }


    /**
     * Gets the action400RespWith417 value for this IpSignalingProfile.
     * 
     * @return action400RespWith417
     */
    public java.lang.Integer getAction400RespWith417() {
        return action400RespWith417;
    }


    /**
     * Sets the action400RespWith417 value for this IpSignalingProfile.
     * 
     * @param action400RespWith417
     */
    public void setAction400RespWith417(java.lang.Integer action400RespWith417) {
        this.action400RespWith417 = action400RespWith417;
    }


    /**
     * Gets the useIncomingEtsResValue value for this IpSignalingProfile.
     * 
     * @return useIncomingEtsResValue
     */
    public java.lang.Integer getUseIncomingEtsResValue() {
        return useIncomingEtsResValue;
    }


    /**
     * Sets the useIncomingEtsResValue value for this IpSignalingProfile.
     * 
     * @param useIncomingEtsResValue
     */
    public void setUseIncomingEtsResValue(java.lang.Integer useIncomingEtsResValue) {
        this.useIncomingEtsResValue = useIncomingEtsResValue;
    }


    /**
     * Gets the doNotIncludeRequireRph value for this IpSignalingProfile.
     * 
     * @return doNotIncludeRequireRph
     */
    public java.lang.Integer getDoNotIncludeRequireRph() {
        return doNotIncludeRequireRph;
    }


    /**
     * Sets the doNotIncludeRequireRph value for this IpSignalingProfile.
     * 
     * @param doNotIncludeRequireRph
     */
    public void setDoNotIncludeRequireRph(java.lang.Integer doNotIncludeRequireRph) {
        this.doNotIncludeRequireRph = doNotIncludeRequireRph;
    }


    /**
     * Gets the sipHeaderPChargeInfo value for this IpSignalingProfile.
     * 
     * @return sipHeaderPChargeInfo
     */
    public java.lang.Short getSipHeaderPChargeInfo() {
        return sipHeaderPChargeInfo;
    }


    /**
     * Sets the sipHeaderPChargeInfo value for this IpSignalingProfile.
     * 
     * @param sipHeaderPChargeInfo
     */
    public void setSipHeaderPChargeInfo(java.lang.Short sipHeaderPChargeInfo) {
        this.sipHeaderPChargeInfo = sipHeaderPChargeInfo;
    }


    /**
     * Gets the ipSigAttributes9 value for this IpSignalingProfile.
     * 
     * @return ipSigAttributes9
     */
    public java.lang.Integer getIpSigAttributes9() {
        return ipSigAttributes9;
    }


    /**
     * Sets the ipSigAttributes9 value for this IpSignalingProfile.
     * 
     * @param ipSigAttributes9
     */
    public void setIpSigAttributes9(java.lang.Integer ipSigAttributes9) {
        this.ipSigAttributes9 = ipSigAttributes9;
    }


    /**
     * Gets the ipSigAttributes10 value for this IpSignalingProfile.
     * 
     * @return ipSigAttributes10
     */
    public java.lang.Integer getIpSigAttributes10() {
        return ipSigAttributes10;
    }


    /**
     * Sets the ipSigAttributes10 value for this IpSignalingProfile.
     * 
     * @param ipSigAttributes10
     */
    public void setIpSigAttributes10(java.lang.Integer ipSigAttributes10) {
        this.ipSigAttributes10 = ipSigAttributes10;
    }


    /**
     * Gets the mediaQosKpiProfileId value for this IpSignalingProfile.
     * 
     * @return mediaQosKpiProfileId
     */
    public java.lang.String getMediaQosKpiProfileId() {
        return mediaQosKpiProfileId;
    }


    /**
     * Sets the mediaQosKpiProfileId value for this IpSignalingProfile.
     * 
     * @param mediaQosKpiProfileId
     */
    public void setMediaQosKpiProfileId(java.lang.String mediaQosKpiProfileId) {
        this.mediaQosKpiProfileId = mediaQosKpiProfileId;
    }


    /**
     * Gets the signalingQosProfileId value for this IpSignalingProfile.
     * 
     * @return signalingQosProfileId
     */
    public java.lang.String getSignalingQosProfileId() {
        return signalingQosProfileId;
    }


    /**
     * Sets the signalingQosProfileId value for this IpSignalingProfile.
     * 
     * @param signalingQosProfileId
     */
    public void setSignalingQosProfileId(java.lang.String signalingQosProfileId) {
        this.signalingQosProfileId = signalingQosProfileId;
    }


    /**
     * Gets the callPreservationValue value for this IpSignalingProfile.
     * 
     * @return callPreservationValue
     */
    public java.lang.Integer getCallPreservationValue() {
        return callPreservationValue;
    }


    /**
     * Sets the callPreservationValue value for this IpSignalingProfile.
     * 
     * @param callPreservationValue
     */
    public void setCallPreservationValue(java.lang.Integer callPreservationValue) {
        this.callPreservationValue = callPreservationValue;
    }


    /**
     * Gets the ipSigAttributes11 value for this IpSignalingProfile.
     * 
     * @return ipSigAttributes11
     */
    public java.lang.Integer getIpSigAttributes11() {
        return ipSigAttributes11;
    }


    /**
     * Sets the ipSigAttributes11 value for this IpSignalingProfile.
     * 
     * @param ipSigAttributes11
     */
    public void setIpSigAttributes11(java.lang.Integer ipSigAttributes11) {
        this.ipSigAttributes11 = ipSigAttributes11;
    }


    /**
     * Gets the phoneContextLen value for this IpSignalingProfile.
     * 
     * @return phoneContextLen
     */
    public java.lang.Integer getPhoneContextLen() {
        return phoneContextLen;
    }


    /**
     * Sets the phoneContextLen value for this IpSignalingProfile.
     * 
     * @param phoneContextLen
     */
    public void setPhoneContextLen(java.lang.Integer phoneContextLen) {
        this.phoneContextLen = phoneContextLen;
    }


    /**
     * Gets the accessTransferProfileId value for this IpSignalingProfile.
     * 
     * @return accessTransferProfileId
     */
    public java.lang.String getAccessTransferProfileId() {
        return accessTransferProfileId;
    }


    /**
     * Sets the accessTransferProfileId value for this IpSignalingProfile.
     * 
     * @param accessTransferProfileId
     */
    public void setAccessTransferProfileId(java.lang.String accessTransferProfileId) {
        this.accessTransferProfileId = accessTransferProfileId;
    }


    /**
     * Gets the preferredMrbUri value for this IpSignalingProfile.
     * 
     * @return preferredMrbUri
     */
    public java.lang.String getPreferredMrbUri() {
        return preferredMrbUri;
    }


    /**
     * Sets the preferredMrbUri value for this IpSignalingProfile.
     * 
     * @param preferredMrbUri
     */
    public void setPreferredMrbUri(java.lang.String preferredMrbUri) {
        this.preferredMrbUri = preferredMrbUri;
    }


    /**
     * Gets the preferredTrfUri value for this IpSignalingProfile.
     * 
     * @return preferredTrfUri
     */
    public java.lang.String getPreferredTrfUri() {
        return preferredTrfUri;
    }


    /**
     * Sets the preferredTrfUri value for this IpSignalingProfile.
     * 
     * @param preferredTrfUri
     */
    public void setPreferredTrfUri(java.lang.String preferredTrfUri) {
        this.preferredTrfUri = preferredTrfUri;
    }


    /**
     * Gets the ipSigAttributes12 value for this IpSignalingProfile.
     * 
     * @return ipSigAttributes12
     */
    public java.lang.Integer getIpSigAttributes12() {
        return ipSigAttributes12;
    }


    /**
     * Sets the ipSigAttributes12 value for this IpSignalingProfile.
     * 
     * @param ipSigAttributes12
     */
    public void setIpSigAttributes12(java.lang.Integer ipSigAttributes12) {
        this.ipSigAttributes12 = ipSigAttributes12;
    }


    /**
     * Gets the genericAttributes1 value for this IpSignalingProfile.
     * 
     * @return genericAttributes1
     */
    public java.lang.Integer getGenericAttributes1() {
        return genericAttributes1;
    }


    /**
     * Sets the genericAttributes1 value for this IpSignalingProfile.
     * 
     * @param genericAttributes1
     */
    public void setGenericAttributes1(java.lang.Integer genericAttributes1) {
        this.genericAttributes1 = genericAttributes1;
    }


    /**
     * Gets the genericAttributes2 value for this IpSignalingProfile.
     * 
     * @return genericAttributes2
     */
    public java.lang.Integer getGenericAttributes2() {
        return genericAttributes2;
    }


    /**
     * Sets the genericAttributes2 value for this IpSignalingProfile.
     * 
     * @param genericAttributes2
     */
    public void setGenericAttributes2(java.lang.Integer genericAttributes2) {
        this.genericAttributes2 = genericAttributes2;
    }


    /**
     * Gets the genericAttributes3 value for this IpSignalingProfile.
     * 
     * @return genericAttributes3
     */
    public java.lang.Integer getGenericAttributes3() {
        return genericAttributes3;
    }


    /**
     * Sets the genericAttributes3 value for this IpSignalingProfile.
     * 
     * @param genericAttributes3
     */
    public void setGenericAttributes3(java.lang.Integer genericAttributes3) {
        this.genericAttributes3 = genericAttributes3;
    }


    /**
     * Gets the genericAttributes4 value for this IpSignalingProfile.
     * 
     * @return genericAttributes4
     */
    public java.lang.Integer getGenericAttributes4() {
        return genericAttributes4;
    }


    /**
     * Sets the genericAttributes4 value for this IpSignalingProfile.
     * 
     * @param genericAttributes4
     */
    public void setGenericAttributes4(java.lang.Integer genericAttributes4) {
        this.genericAttributes4 = genericAttributes4;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpSignalingProfile)) return false;
        IpSignalingProfile other = (IpSignalingProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipSignalingProfileId==null && other.getIpSignalingProfileId()==null) || 
             (this.ipSignalingProfileId!=null &&
              this.ipSignalingProfileId.equals(other.getIpSignalingProfileId()))) &&
            ((this.protocolType==null && other.getProtocolType()==null) || 
             (this.protocolType!=null &&
              this.protocolType.equals(other.getProtocolType()))) &&
            ((this.ipSigAttributes1==null && other.getIpSigAttributes1()==null) || 
             (this.ipSigAttributes1!=null &&
              this.ipSigAttributes1.equals(other.getIpSigAttributes1()))) &&
            ((this.ipSigAttributes2==null && other.getIpSigAttributes2()==null) || 
             (this.ipSigAttributes2!=null &&
              this.ipSigAttributes2.equals(other.getIpSigAttributes2()))) &&
            ((this.sipSignalingTypeVersionId==null && other.getSipSignalingTypeVersionId()==null) || 
             (this.sipSignalingTypeVersionId!=null &&
              this.sipSignalingTypeVersionId.equals(other.getSipSignalingTypeVersionId()))) &&
            ((this.sipSignalingType==null && other.getSipSignalingType()==null) || 
             (this.sipSignalingType!=null &&
              this.sipSignalingType.equals(other.getSipSignalingType()))) &&
            ((this.sipSignalingTreatment==null && other.getSipSignalingTreatment()==null) || 
             (this.sipSignalingTreatment!=null &&
              this.sipSignalingTreatment.equals(other.getSipSignalingTreatment()))) &&
            ((this.sipSignalingRedirectPurge==null && other.getSipSignalingRedirectPurge()==null) || 
             (this.sipSignalingRedirectPurge!=null &&
              this.sipSignalingRedirectPurge.equals(other.getSipSignalingRedirectPurge()))) &&
            ((this.sipSignalingRedirectReject==null && other.getSipSignalingRedirectReject()==null) || 
             (this.sipSignalingRedirectReject!=null &&
              this.sipSignalingRedirectReject.equals(other.getSipSignalingRedirectReject()))) &&
            ((this.sipHeaderPrivacyInfo==null && other.getSipHeaderPrivacyInfo()==null) || 
             (this.sipHeaderPrivacyInfo!=null &&
              this.sipHeaderPrivacyInfo.equals(other.getSipHeaderPrivacyInfo()))) &&
            ((this.sipSignalingTransportType==null && other.getSipSignalingTransportType()==null) || 
             (this.sipSignalingTransportType!=null &&
              this.sipSignalingTransportType.equals(other.getSipSignalingTransportType()))) &&
            ((this.sipOriginatingTg==null && other.getSipOriginatingTg()==null) || 
             (this.sipOriginatingTg!=null &&
              this.sipOriginatingTg.equals(other.getSipOriginatingTg()))) &&
            ((this.sipDestinationTg==null && other.getSipDestinationTg()==null) || 
             (this.sipDestinationTg!=null &&
              this.sipDestinationTg.equals(other.getSipDestinationTg()))) &&
            ((this.sipDcsChargeInfo==null && other.getSipDcsChargeInfo()==null) || 
             (this.sipDcsChargeInfo!=null &&
              this.sipDcsChargeInfo.equals(other.getSipDcsChargeInfo()))) &&
            ((this.ipSigAttributes3==null && other.getIpSigAttributes3()==null) || 
             (this.ipSigAttributes3!=null &&
              this.ipSigAttributes3.equals(other.getIpSigAttributes3()))) &&
            ((this.ipSigAttributes4==null && other.getIpSigAttributes4()==null) || 
             (this.ipSigAttributes4!=null &&
              this.ipSigAttributes4.equals(other.getIpSigAttributes4()))) &&
            ((this.sipCallForwardingMapping==null && other.getSipCallForwardingMapping()==null) || 
             (this.sipCallForwardingMapping!=null &&
              this.sipCallForwardingMapping.equals(other.getSipCallForwardingMapping()))) &&
            ((this.sipToHeaderMapping==null && other.getSipToHeaderMapping()==null) || 
             (this.sipToHeaderMapping!=null &&
              this.sipToHeaderMapping.equals(other.getSipToHeaderMapping()))) &&
            ((this.sipCauseMappingIndex==null && other.getSipCauseMappingIndex()==null) || 
             (this.sipCauseMappingIndex!=null &&
              this.sipCauseMappingIndex.equals(other.getSipCauseMappingIndex()))) &&
            ((this.internalCauseMappingIndex==null && other.getInternalCauseMappingIndex()==null) || 
             (this.internalCauseMappingIndex!=null &&
              this.internalCauseMappingIndex.equals(other.getInternalCauseMappingIndex()))) &&
            ((this.mirroredTransparencies1==null && other.getMirroredTransparencies1()==null) || 
             (this.mirroredTransparencies1!=null &&
              this.mirroredTransparencies1.equals(other.getMirroredTransparencies1()))) &&
            ((this.mirroredTransparencies2==null && other.getMirroredTransparencies2()==null) || 
             (this.mirroredTransparencies2!=null &&
              this.mirroredTransparencies2.equals(other.getMirroredTransparencies2()))) &&
            ((this.nonMirroredTransparencies1==null && other.getNonMirroredTransparencies1()==null) || 
             (this.nonMirroredTransparencies1!=null &&
              this.nonMirroredTransparencies1.equals(other.getNonMirroredTransparencies1()))) &&
            ((this.nonMirroredTransparencies2==null && other.getNonMirroredTransparencies2()==null) || 
             (this.nonMirroredTransparencies2!=null &&
              this.nonMirroredTransparencies2.equals(other.getNonMirroredTransparencies2()))) &&
            ((this.ipSigAttributes5==null && other.getIpSigAttributes5()==null) || 
             (this.ipSigAttributes5!=null &&
              this.ipSigAttributes5.equals(other.getIpSigAttributes5()))) &&
            ((this.ipSigAttributes6==null && other.getIpSigAttributes6()==null) || 
             (this.ipSigAttributes6!=null &&
              this.ipSigAttributes6.equals(other.getIpSigAttributes6()))) &&
            ((this.sipNpdiOption==null && other.getSipNpdiOption()==null) || 
             (this.sipNpdiOption!=null &&
              this.sipNpdiOption.equals(other.getSipNpdiOption()))) &&
            ((this.sessionExpiresRefresherParm==null && other.getSessionExpiresRefresherParm()==null) || 
             (this.sessionExpiresRefresherParm!=null &&
              this.sessionExpiresRefresherParm.equals(other.getSessionExpiresRefresherParm()))) &&
            ((this.sipRelayFlags1==null && other.getSipRelayFlags1()==null) || 
             (this.sipRelayFlags1!=null &&
              this.sipRelayFlags1.equals(other.getSipRelayFlags1()))) &&
            ((this.sipRelayFlags2==null && other.getSipRelayFlags2()==null) || 
             (this.sipRelayFlags2!=null &&
              this.sipRelayFlags2.equals(other.getSipRelayFlags2()))) &&
            ((this.sipRelayFlags3==null && other.getSipRelayFlags3()==null) || 
             (this.sipRelayFlags3!=null &&
              this.sipRelayFlags3.equals(other.getSipRelayFlags3()))) &&
            ((this.sipRelayFlags4==null && other.getSipRelayFlags4()==null) || 
             (this.sipRelayFlags4!=null &&
              this.sipRelayFlags4.equals(other.getSipRelayFlags4()))) &&
            ((this.handleIpNotInNst==null && other.getHandleIpNotInNst()==null) || 
             (this.handleIpNotInNst!=null &&
              this.handleIpNotInNst.equals(other.getHandleIpNotInNst()))) &&
            ((this.ingHandleIpNotInNst==null && other.getIngHandleIpNotInNst()==null) || 
             (this.ingHandleIpNotInNst!=null &&
              this.ingHandleIpNotInNst.equals(other.getIngHandleIpNotInNst()))) &&
            ((this.sipSignalingTransportType2==null && other.getSipSignalingTransportType2()==null) || 
             (this.sipSignalingTransportType2!=null &&
              this.sipSignalingTransportType2.equals(other.getSipSignalingTransportType2()))) &&
            ((this.sipSignalingTransportType3==null && other.getSipSignalingTransportType3()==null) || 
             (this.sipSignalingTransportType3!=null &&
              this.sipSignalingTransportType3.equals(other.getSipSignalingTransportType3()))) &&
            ((this.sipSignalingTransportType4==null && other.getSipSignalingTransportType4()==null) || 
             (this.sipSignalingTransportType4!=null &&
              this.sipSignalingTransportType4.equals(other.getSipSignalingTransportType4()))) &&
            ((this.ipSigAttributes7==null && other.getIpSigAttributes7()==null) || 
             (this.ipSigAttributes7!=null &&
              this.ipSigAttributes7.equals(other.getIpSigAttributes7()))) &&
            ((this.ipSigAttributes8==null && other.getIpSigAttributes8()==null) || 
             (this.ipSigAttributes8!=null &&
              this.ipSigAttributes8.equals(other.getIpSigAttributes8()))) &&
            ((this.sipOptionTagInSupported==null && other.getSipOptionTagInSupported()==null) || 
             (this.sipOptionTagInSupported!=null &&
              this.sipOptionTagInSupported.equals(other.getSipOptionTagInSupported()))) &&
            ((this.sipOptionTagInRequire==null && other.getSipOptionTagInRequire()==null) || 
             (this.sipOptionTagInRequire!=null &&
              this.sipOptionTagInRequire.equals(other.getSipOptionTagInRequire()))) &&
            ((this.globalizeProfileId==null && other.getGlobalizeProfileId()==null) || 
             (this.globalizeProfileId!=null &&
              this.globalizeProfileId.equals(other.getGlobalizeProfileId()))) &&
            ((this.etsDefaultPrioValue==null && other.getEtsDefaultPrioValue()==null) || 
             (this.etsDefaultPrioValue!=null &&
              this.etsDefaultPrioValue.equals(other.getEtsDefaultPrioValue()))) &&
            ((this.action400RespWith417==null && other.getAction400RespWith417()==null) || 
             (this.action400RespWith417!=null &&
              this.action400RespWith417.equals(other.getAction400RespWith417()))) &&
            ((this.useIncomingEtsResValue==null && other.getUseIncomingEtsResValue()==null) || 
             (this.useIncomingEtsResValue!=null &&
              this.useIncomingEtsResValue.equals(other.getUseIncomingEtsResValue()))) &&
            ((this.doNotIncludeRequireRph==null && other.getDoNotIncludeRequireRph()==null) || 
             (this.doNotIncludeRequireRph!=null &&
              this.doNotIncludeRequireRph.equals(other.getDoNotIncludeRequireRph()))) &&
            ((this.sipHeaderPChargeInfo==null && other.getSipHeaderPChargeInfo()==null) || 
             (this.sipHeaderPChargeInfo!=null &&
              this.sipHeaderPChargeInfo.equals(other.getSipHeaderPChargeInfo()))) &&
            ((this.ipSigAttributes9==null && other.getIpSigAttributes9()==null) || 
             (this.ipSigAttributes9!=null &&
              this.ipSigAttributes9.equals(other.getIpSigAttributes9()))) &&
            ((this.ipSigAttributes10==null && other.getIpSigAttributes10()==null) || 
             (this.ipSigAttributes10!=null &&
              this.ipSigAttributes10.equals(other.getIpSigAttributes10()))) &&
            ((this.mediaQosKpiProfileId==null && other.getMediaQosKpiProfileId()==null) || 
             (this.mediaQosKpiProfileId!=null &&
              this.mediaQosKpiProfileId.equals(other.getMediaQosKpiProfileId()))) &&
            ((this.signalingQosProfileId==null && other.getSignalingQosProfileId()==null) || 
             (this.signalingQosProfileId!=null &&
              this.signalingQosProfileId.equals(other.getSignalingQosProfileId()))) &&
            ((this.callPreservationValue==null && other.getCallPreservationValue()==null) || 
             (this.callPreservationValue!=null &&
              this.callPreservationValue.equals(other.getCallPreservationValue()))) &&
            ((this.ipSigAttributes11==null && other.getIpSigAttributes11()==null) || 
             (this.ipSigAttributes11!=null &&
              this.ipSigAttributes11.equals(other.getIpSigAttributes11()))) &&
            ((this.phoneContextLen==null && other.getPhoneContextLen()==null) || 
             (this.phoneContextLen!=null &&
              this.phoneContextLen.equals(other.getPhoneContextLen()))) &&
            ((this.accessTransferProfileId==null && other.getAccessTransferProfileId()==null) || 
             (this.accessTransferProfileId!=null &&
              this.accessTransferProfileId.equals(other.getAccessTransferProfileId()))) &&
            ((this.preferredMrbUri==null && other.getPreferredMrbUri()==null) || 
             (this.preferredMrbUri!=null &&
              this.preferredMrbUri.equals(other.getPreferredMrbUri()))) &&
            ((this.preferredTrfUri==null && other.getPreferredTrfUri()==null) || 
             (this.preferredTrfUri!=null &&
              this.preferredTrfUri.equals(other.getPreferredTrfUri()))) &&
            ((this.ipSigAttributes12==null && other.getIpSigAttributes12()==null) || 
             (this.ipSigAttributes12!=null &&
              this.ipSigAttributes12.equals(other.getIpSigAttributes12()))) &&
            ((this.genericAttributes1==null && other.getGenericAttributes1()==null) || 
             (this.genericAttributes1!=null &&
              this.genericAttributes1.equals(other.getGenericAttributes1()))) &&
            ((this.genericAttributes2==null && other.getGenericAttributes2()==null) || 
             (this.genericAttributes2!=null &&
              this.genericAttributes2.equals(other.getGenericAttributes2()))) &&
            ((this.genericAttributes3==null && other.getGenericAttributes3()==null) || 
             (this.genericAttributes3!=null &&
              this.genericAttributes3.equals(other.getGenericAttributes3()))) &&
            ((this.genericAttributes4==null && other.getGenericAttributes4()==null) || 
             (this.genericAttributes4!=null &&
              this.genericAttributes4.equals(other.getGenericAttributes4())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getIpSignalingProfileId() != null) {
            _hashCode += getIpSignalingProfileId().hashCode();
        }
        if (getProtocolType() != null) {
            _hashCode += getProtocolType().hashCode();
        }
        if (getIpSigAttributes1() != null) {
            _hashCode += getIpSigAttributes1().hashCode();
        }
        if (getIpSigAttributes2() != null) {
            _hashCode += getIpSigAttributes2().hashCode();
        }
        if (getSipSignalingTypeVersionId() != null) {
            _hashCode += getSipSignalingTypeVersionId().hashCode();
        }
        if (getSipSignalingType() != null) {
            _hashCode += getSipSignalingType().hashCode();
        }
        if (getSipSignalingTreatment() != null) {
            _hashCode += getSipSignalingTreatment().hashCode();
        }
        if (getSipSignalingRedirectPurge() != null) {
            _hashCode += getSipSignalingRedirectPurge().hashCode();
        }
        if (getSipSignalingRedirectReject() != null) {
            _hashCode += getSipSignalingRedirectReject().hashCode();
        }
        if (getSipHeaderPrivacyInfo() != null) {
            _hashCode += getSipHeaderPrivacyInfo().hashCode();
        }
        if (getSipSignalingTransportType() != null) {
            _hashCode += getSipSignalingTransportType().hashCode();
        }
        if (getSipOriginatingTg() != null) {
            _hashCode += getSipOriginatingTg().hashCode();
        }
        if (getSipDestinationTg() != null) {
            _hashCode += getSipDestinationTg().hashCode();
        }
        if (getSipDcsChargeInfo() != null) {
            _hashCode += getSipDcsChargeInfo().hashCode();
        }
        if (getIpSigAttributes3() != null) {
            _hashCode += getIpSigAttributes3().hashCode();
        }
        if (getIpSigAttributes4() != null) {
            _hashCode += getIpSigAttributes4().hashCode();
        }
        if (getSipCallForwardingMapping() != null) {
            _hashCode += getSipCallForwardingMapping().hashCode();
        }
        if (getSipToHeaderMapping() != null) {
            _hashCode += getSipToHeaderMapping().hashCode();
        }
        if (getSipCauseMappingIndex() != null) {
            _hashCode += getSipCauseMappingIndex().hashCode();
        }
        if (getInternalCauseMappingIndex() != null) {
            _hashCode += getInternalCauseMappingIndex().hashCode();
        }
        if (getMirroredTransparencies1() != null) {
            _hashCode += getMirroredTransparencies1().hashCode();
        }
        if (getMirroredTransparencies2() != null) {
            _hashCode += getMirroredTransparencies2().hashCode();
        }
        if (getNonMirroredTransparencies1() != null) {
            _hashCode += getNonMirroredTransparencies1().hashCode();
        }
        if (getNonMirroredTransparencies2() != null) {
            _hashCode += getNonMirroredTransparencies2().hashCode();
        }
        if (getIpSigAttributes5() != null) {
            _hashCode += getIpSigAttributes5().hashCode();
        }
        if (getIpSigAttributes6() != null) {
            _hashCode += getIpSigAttributes6().hashCode();
        }
        if (getSipNpdiOption() != null) {
            _hashCode += getSipNpdiOption().hashCode();
        }
        if (getSessionExpiresRefresherParm() != null) {
            _hashCode += getSessionExpiresRefresherParm().hashCode();
        }
        if (getSipRelayFlags1() != null) {
            _hashCode += getSipRelayFlags1().hashCode();
        }
        if (getSipRelayFlags2() != null) {
            _hashCode += getSipRelayFlags2().hashCode();
        }
        if (getSipRelayFlags3() != null) {
            _hashCode += getSipRelayFlags3().hashCode();
        }
        if (getSipRelayFlags4() != null) {
            _hashCode += getSipRelayFlags4().hashCode();
        }
        if (getHandleIpNotInNst() != null) {
            _hashCode += getHandleIpNotInNst().hashCode();
        }
        if (getIngHandleIpNotInNst() != null) {
            _hashCode += getIngHandleIpNotInNst().hashCode();
        }
        if (getSipSignalingTransportType2() != null) {
            _hashCode += getSipSignalingTransportType2().hashCode();
        }
        if (getSipSignalingTransportType3() != null) {
            _hashCode += getSipSignalingTransportType3().hashCode();
        }
        if (getSipSignalingTransportType4() != null) {
            _hashCode += getSipSignalingTransportType4().hashCode();
        }
        if (getIpSigAttributes7() != null) {
            _hashCode += getIpSigAttributes7().hashCode();
        }
        if (getIpSigAttributes8() != null) {
            _hashCode += getIpSigAttributes8().hashCode();
        }
        if (getSipOptionTagInSupported() != null) {
            _hashCode += getSipOptionTagInSupported().hashCode();
        }
        if (getSipOptionTagInRequire() != null) {
            _hashCode += getSipOptionTagInRequire().hashCode();
        }
        if (getGlobalizeProfileId() != null) {
            _hashCode += getGlobalizeProfileId().hashCode();
        }
        if (getEtsDefaultPrioValue() != null) {
            _hashCode += getEtsDefaultPrioValue().hashCode();
        }
        if (getAction400RespWith417() != null) {
            _hashCode += getAction400RespWith417().hashCode();
        }
        if (getUseIncomingEtsResValue() != null) {
            _hashCode += getUseIncomingEtsResValue().hashCode();
        }
        if (getDoNotIncludeRequireRph() != null) {
            _hashCode += getDoNotIncludeRequireRph().hashCode();
        }
        if (getSipHeaderPChargeInfo() != null) {
            _hashCode += getSipHeaderPChargeInfo().hashCode();
        }
        if (getIpSigAttributes9() != null) {
            _hashCode += getIpSigAttributes9().hashCode();
        }
        if (getIpSigAttributes10() != null) {
            _hashCode += getIpSigAttributes10().hashCode();
        }
        if (getMediaQosKpiProfileId() != null) {
            _hashCode += getMediaQosKpiProfileId().hashCode();
        }
        if (getSignalingQosProfileId() != null) {
            _hashCode += getSignalingQosProfileId().hashCode();
        }
        if (getCallPreservationValue() != null) {
            _hashCode += getCallPreservationValue().hashCode();
        }
        if (getIpSigAttributes11() != null) {
            _hashCode += getIpSigAttributes11().hashCode();
        }
        if (getPhoneContextLen() != null) {
            _hashCode += getPhoneContextLen().hashCode();
        }
        if (getAccessTransferProfileId() != null) {
            _hashCode += getAccessTransferProfileId().hashCode();
        }
        if (getPreferredMrbUri() != null) {
            _hashCode += getPreferredMrbUri().hashCode();
        }
        if (getPreferredTrfUri() != null) {
            _hashCode += getPreferredTrfUri().hashCode();
        }
        if (getIpSigAttributes12() != null) {
            _hashCode += getIpSigAttributes12().hashCode();
        }
        if (getGenericAttributes1() != null) {
            _hashCode += getGenericAttributes1().hashCode();
        }
        if (getGenericAttributes2() != null) {
            _hashCode += getGenericAttributes2().hashCode();
        }
        if (getGenericAttributes3() != null) {
            _hashCode += getGenericAttributes3().hashCode();
        }
        if (getGenericAttributes4() != null) {
            _hashCode += getGenericAttributes4().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpSignalingProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpSignalingProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSignalingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSignalingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocolType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSigAttributes1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSigAttributes1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSigAttributes2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSigAttributes2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipSignalingTypeVersionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipSignalingTypeVersionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipSignalingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipSignalingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipSignalingTreatment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipSignalingTreatment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipSignalingRedirectPurge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipSignalingRedirectPurge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipSignalingRedirectReject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipSignalingRedirectReject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipHeaderPrivacyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipHeaderPrivacyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipSignalingTransportType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipSignalingTransportType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipOriginatingTg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipOriginatingTg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDestinationTg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDestinationTg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDcsChargeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDcsChargeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSigAttributes3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSigAttributes3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSigAttributes4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSigAttributes4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipCallForwardingMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipCallForwardingMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipToHeaderMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipToHeaderMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipCauseMappingIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipCauseMappingIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCauseMappingIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalCauseMappingIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mirroredTransparencies1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mirroredTransparencies1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mirroredTransparencies2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mirroredTransparencies2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonMirroredTransparencies1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonMirroredTransparencies1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonMirroredTransparencies2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonMirroredTransparencies2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSigAttributes5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSigAttributes5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSigAttributes6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSigAttributes6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipNpdiOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipNpdiOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionExpiresRefresherParm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionExpiresRefresherParm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipRelayFlags1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipRelayFlags1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipRelayFlags2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipRelayFlags2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipRelayFlags3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipRelayFlags3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipRelayFlags4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipRelayFlags4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handleIpNotInNst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "handleIpNotInNst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingHandleIpNotInNst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingHandleIpNotInNst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipSignalingTransportType2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipSignalingTransportType2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipSignalingTransportType3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipSignalingTransportType3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipSignalingTransportType4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipSignalingTransportType4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSigAttributes7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSigAttributes7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSigAttributes8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSigAttributes8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipOptionTagInSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipOptionTagInSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipOptionTagInRequire");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipOptionTagInRequire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalizeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalizeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etsDefaultPrioValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "etsDefaultPrioValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action400RespWith417");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action400RespWith417"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useIncomingEtsResValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useIncomingEtsResValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doNotIncludeRequireRph");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doNotIncludeRequireRph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipHeaderPChargeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipHeaderPChargeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSigAttributes9");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSigAttributes9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSigAttributes10");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSigAttributes10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaQosKpiProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaQosKpiProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalingQosProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signalingQosProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callPreservationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callPreservationValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSigAttributes11");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSigAttributes11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneContextLen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneContextLen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessTransferProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessTransferProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredMrbUri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferredMrbUri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredTrfUri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferredTrfUri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSigAttributes12");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSigAttributes12"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericAttributes1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericAttributes1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericAttributes2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericAttributes2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericAttributes3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericAttributes3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericAttributes4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericAttributes4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
