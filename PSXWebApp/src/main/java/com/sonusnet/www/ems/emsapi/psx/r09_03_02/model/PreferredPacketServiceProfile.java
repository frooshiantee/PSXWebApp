/**
 * PreferredPacketServiceProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class PreferredPacketServiceProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String prfdPacketServiceProfileId;

    private java.lang.Short rtpDataPayloadType;

    private java.lang.Short silenceFactor;

    private java.lang.Short typeOfService;

    private java.lang.Short options;

    private java.lang.Short voiceInitPlayoutDelay;

    private java.lang.Short dataInitPlayoutDelay;

    private java.lang.Short packetLossThreshold;

    private java.lang.Short packetLossRrbandwidth;

    private java.lang.Short packetLossRsbandwidth;

    private java.lang.Short rtpOptions;

    private java.lang.Short g711SidRtpPayloadType;

    private java.lang.Short aal1PayloadSize;

    private java.lang.String codecEntry1Id;

    private java.lang.String codecEntry2Id;

    private java.lang.String codecEntry3Id;

    private java.lang.String codecEntry4Id;

    private java.lang.Integer attributes;

    private java.lang.Integer attributes2;

    private java.lang.Integer attributes3;

    private java.lang.Integer attributes4;

    private java.lang.Integer p2PCtrlOptionType;

    private java.lang.Integer p2PCtrlOptionRtpFlow;

    private java.lang.Integer dataCallPacketSize;

    private java.lang.Integer rfc2833RtpPayloadType;

    private java.lang.String securityCryptoSuiteId;

    private java.lang.Integer videoMaxBw;

    private java.lang.Integer videoBwReductionRate;

    private java.lang.Integer videoFailAudioOnly;

    private java.lang.Integer mediaPacketCos;

    private java.lang.Short packetMediaControlSh;

    private java.lang.String codecEntry5Id;

    private java.lang.String codecEntry6Id;

    private java.lang.String codecEntry7Id;

    private java.lang.String codecEntry8Id;

    private java.lang.String codecEntry9Id;

    private java.lang.String codecEntry10Id;

    private java.lang.String codecEntry11Id;

    private java.lang.String codecEntry12Id;

    private java.lang.Short ipv4Tos;

    private java.lang.Short ipv6TrafficClass;

    private java.lang.Short ieee8021QVlanCos;

    private java.lang.String codecListProfile;

    private java.lang.Short t38FaxExtAttributes;

    private java.lang.String dtlsCryptoSuiteId;

    private java.lang.Short msrpDscp;

    private java.lang.Integer genericAttributes1;

    private java.lang.Integer genericAttributes2;

    private java.lang.Integer genericAttributes3;

    private java.lang.Integer genericAttributes4;

    public PreferredPacketServiceProfile() {
    }

    public PreferredPacketServiceProfile(
           java.lang.String prfdPacketServiceProfileId,
           java.lang.Short rtpDataPayloadType,
           java.lang.Short silenceFactor,
           java.lang.Short typeOfService,
           java.lang.Short options,
           java.lang.Short voiceInitPlayoutDelay,
           java.lang.Short dataInitPlayoutDelay,
           java.lang.Short packetLossThreshold,
           java.lang.Short packetLossRrbandwidth,
           java.lang.Short packetLossRsbandwidth,
           java.lang.Short rtpOptions,
           java.lang.Short g711SidRtpPayloadType,
           java.lang.Short aal1PayloadSize,
           java.lang.String codecEntry1Id,
           java.lang.String codecEntry2Id,
           java.lang.String codecEntry3Id,
           java.lang.String codecEntry4Id,
           java.lang.Integer attributes,
           java.lang.Integer attributes2,
           java.lang.Integer attributes3,
           java.lang.Integer attributes4,
           java.lang.Integer p2PCtrlOptionType,
           java.lang.Integer p2PCtrlOptionRtpFlow,
           java.lang.Integer dataCallPacketSize,
           java.lang.Integer rfc2833RtpPayloadType,
           java.lang.String securityCryptoSuiteId,
           java.lang.Integer videoMaxBw,
           java.lang.Integer videoBwReductionRate,
           java.lang.Integer videoFailAudioOnly,
           java.lang.Integer mediaPacketCos,
           java.lang.Short packetMediaControlSh,
           java.lang.String codecEntry5Id,
           java.lang.String codecEntry6Id,
           java.lang.String codecEntry7Id,
           java.lang.String codecEntry8Id,
           java.lang.String codecEntry9Id,
           java.lang.String codecEntry10Id,
           java.lang.String codecEntry11Id,
           java.lang.String codecEntry12Id,
           java.lang.Short ipv4Tos,
           java.lang.Short ipv6TrafficClass,
           java.lang.Short ieee8021QVlanCos,
           java.lang.String codecListProfile,
           java.lang.Short t38FaxExtAttributes,
           java.lang.String dtlsCryptoSuiteId,
           java.lang.Short msrpDscp,
           java.lang.Integer genericAttributes1,
           java.lang.Integer genericAttributes2,
           java.lang.Integer genericAttributes3,
           java.lang.Integer genericAttributes4) {
        this.prfdPacketServiceProfileId = prfdPacketServiceProfileId;
        this.rtpDataPayloadType = rtpDataPayloadType;
        this.silenceFactor = silenceFactor;
        this.typeOfService = typeOfService;
        this.options = options;
        this.voiceInitPlayoutDelay = voiceInitPlayoutDelay;
        this.dataInitPlayoutDelay = dataInitPlayoutDelay;
        this.packetLossThreshold = packetLossThreshold;
        this.packetLossRrbandwidth = packetLossRrbandwidth;
        this.packetLossRsbandwidth = packetLossRsbandwidth;
        this.rtpOptions = rtpOptions;
        this.g711SidRtpPayloadType = g711SidRtpPayloadType;
        this.aal1PayloadSize = aal1PayloadSize;
        this.codecEntry1Id = codecEntry1Id;
        this.codecEntry2Id = codecEntry2Id;
        this.codecEntry3Id = codecEntry3Id;
        this.codecEntry4Id = codecEntry4Id;
        this.attributes = attributes;
        this.attributes2 = attributes2;
        this.attributes3 = attributes3;
        this.attributes4 = attributes4;
        this.p2PCtrlOptionType = p2PCtrlOptionType;
        this.p2PCtrlOptionRtpFlow = p2PCtrlOptionRtpFlow;
        this.dataCallPacketSize = dataCallPacketSize;
        this.rfc2833RtpPayloadType = rfc2833RtpPayloadType;
        this.securityCryptoSuiteId = securityCryptoSuiteId;
        this.videoMaxBw = videoMaxBw;
        this.videoBwReductionRate = videoBwReductionRate;
        this.videoFailAudioOnly = videoFailAudioOnly;
        this.mediaPacketCos = mediaPacketCos;
        this.packetMediaControlSh = packetMediaControlSh;
        this.codecEntry5Id = codecEntry5Id;
        this.codecEntry6Id = codecEntry6Id;
        this.codecEntry7Id = codecEntry7Id;
        this.codecEntry8Id = codecEntry8Id;
        this.codecEntry9Id = codecEntry9Id;
        this.codecEntry10Id = codecEntry10Id;
        this.codecEntry11Id = codecEntry11Id;
        this.codecEntry12Id = codecEntry12Id;
        this.ipv4Tos = ipv4Tos;
        this.ipv6TrafficClass = ipv6TrafficClass;
        this.ieee8021QVlanCos = ieee8021QVlanCos;
        this.codecListProfile = codecListProfile;
        this.t38FaxExtAttributes = t38FaxExtAttributes;
        this.dtlsCryptoSuiteId = dtlsCryptoSuiteId;
        this.msrpDscp = msrpDscp;
        this.genericAttributes1 = genericAttributes1;
        this.genericAttributes2 = genericAttributes2;
        this.genericAttributes3 = genericAttributes3;
        this.genericAttributes4 = genericAttributes4;
    }


    /**
     * Gets the prfdPacketServiceProfileId value for this PreferredPacketServiceProfile.
     * 
     * @return prfdPacketServiceProfileId
     */
    public java.lang.String getPrfdPacketServiceProfileId() {
        return prfdPacketServiceProfileId;
    }


    /**
     * Sets the prfdPacketServiceProfileId value for this PreferredPacketServiceProfile.
     * 
     * @param prfdPacketServiceProfileId
     */
    public void setPrfdPacketServiceProfileId(java.lang.String prfdPacketServiceProfileId) {
        this.prfdPacketServiceProfileId = prfdPacketServiceProfileId;
    }


    /**
     * Gets the rtpDataPayloadType value for this PreferredPacketServiceProfile.
     * 
     * @return rtpDataPayloadType
     */
    public java.lang.Short getRtpDataPayloadType() {
        return rtpDataPayloadType;
    }


    /**
     * Sets the rtpDataPayloadType value for this PreferredPacketServiceProfile.
     * 
     * @param rtpDataPayloadType
     */
    public void setRtpDataPayloadType(java.lang.Short rtpDataPayloadType) {
        this.rtpDataPayloadType = rtpDataPayloadType;
    }


    /**
     * Gets the silenceFactor value for this PreferredPacketServiceProfile.
     * 
     * @return silenceFactor
     */
    public java.lang.Short getSilenceFactor() {
        return silenceFactor;
    }


    /**
     * Sets the silenceFactor value for this PreferredPacketServiceProfile.
     * 
     * @param silenceFactor
     */
    public void setSilenceFactor(java.lang.Short silenceFactor) {
        this.silenceFactor = silenceFactor;
    }


    /**
     * Gets the typeOfService value for this PreferredPacketServiceProfile.
     * 
     * @return typeOfService
     */
    public java.lang.Short getTypeOfService() {
        return typeOfService;
    }


    /**
     * Sets the typeOfService value for this PreferredPacketServiceProfile.
     * 
     * @param typeOfService
     */
    public void setTypeOfService(java.lang.Short typeOfService) {
        this.typeOfService = typeOfService;
    }


    /**
     * Gets the options value for this PreferredPacketServiceProfile.
     * 
     * @return options
     */
    public java.lang.Short getOptions() {
        return options;
    }


    /**
     * Sets the options value for this PreferredPacketServiceProfile.
     * 
     * @param options
     */
    public void setOptions(java.lang.Short options) {
        this.options = options;
    }


    /**
     * Gets the voiceInitPlayoutDelay value for this PreferredPacketServiceProfile.
     * 
     * @return voiceInitPlayoutDelay
     */
    public java.lang.Short getVoiceInitPlayoutDelay() {
        return voiceInitPlayoutDelay;
    }


    /**
     * Sets the voiceInitPlayoutDelay value for this PreferredPacketServiceProfile.
     * 
     * @param voiceInitPlayoutDelay
     */
    public void setVoiceInitPlayoutDelay(java.lang.Short voiceInitPlayoutDelay) {
        this.voiceInitPlayoutDelay = voiceInitPlayoutDelay;
    }


    /**
     * Gets the dataInitPlayoutDelay value for this PreferredPacketServiceProfile.
     * 
     * @return dataInitPlayoutDelay
     */
    public java.lang.Short getDataInitPlayoutDelay() {
        return dataInitPlayoutDelay;
    }


    /**
     * Sets the dataInitPlayoutDelay value for this PreferredPacketServiceProfile.
     * 
     * @param dataInitPlayoutDelay
     */
    public void setDataInitPlayoutDelay(java.lang.Short dataInitPlayoutDelay) {
        this.dataInitPlayoutDelay = dataInitPlayoutDelay;
    }


    /**
     * Gets the packetLossThreshold value for this PreferredPacketServiceProfile.
     * 
     * @return packetLossThreshold
     */
    public java.lang.Short getPacketLossThreshold() {
        return packetLossThreshold;
    }


    /**
     * Sets the packetLossThreshold value for this PreferredPacketServiceProfile.
     * 
     * @param packetLossThreshold
     */
    public void setPacketLossThreshold(java.lang.Short packetLossThreshold) {
        this.packetLossThreshold = packetLossThreshold;
    }


    /**
     * Gets the packetLossRrbandwidth value for this PreferredPacketServiceProfile.
     * 
     * @return packetLossRrbandwidth
     */
    public java.lang.Short getPacketLossRrbandwidth() {
        return packetLossRrbandwidth;
    }


    /**
     * Sets the packetLossRrbandwidth value for this PreferredPacketServiceProfile.
     * 
     * @param packetLossRrbandwidth
     */
    public void setPacketLossRrbandwidth(java.lang.Short packetLossRrbandwidth) {
        this.packetLossRrbandwidth = packetLossRrbandwidth;
    }


    /**
     * Gets the packetLossRsbandwidth value for this PreferredPacketServiceProfile.
     * 
     * @return packetLossRsbandwidth
     */
    public java.lang.Short getPacketLossRsbandwidth() {
        return packetLossRsbandwidth;
    }


    /**
     * Sets the packetLossRsbandwidth value for this PreferredPacketServiceProfile.
     * 
     * @param packetLossRsbandwidth
     */
    public void setPacketLossRsbandwidth(java.lang.Short packetLossRsbandwidth) {
        this.packetLossRsbandwidth = packetLossRsbandwidth;
    }


    /**
     * Gets the rtpOptions value for this PreferredPacketServiceProfile.
     * 
     * @return rtpOptions
     */
    public java.lang.Short getRtpOptions() {
        return rtpOptions;
    }


    /**
     * Sets the rtpOptions value for this PreferredPacketServiceProfile.
     * 
     * @param rtpOptions
     */
    public void setRtpOptions(java.lang.Short rtpOptions) {
        this.rtpOptions = rtpOptions;
    }


    /**
     * Gets the g711SidRtpPayloadType value for this PreferredPacketServiceProfile.
     * 
     * @return g711SidRtpPayloadType
     */
    public java.lang.Short getG711SidRtpPayloadType() {
        return g711SidRtpPayloadType;
    }


    /**
     * Sets the g711SidRtpPayloadType value for this PreferredPacketServiceProfile.
     * 
     * @param g711SidRtpPayloadType
     */
    public void setG711SidRtpPayloadType(java.lang.Short g711SidRtpPayloadType) {
        this.g711SidRtpPayloadType = g711SidRtpPayloadType;
    }


    /**
     * Gets the aal1PayloadSize value for this PreferredPacketServiceProfile.
     * 
     * @return aal1PayloadSize
     */
    public java.lang.Short getAal1PayloadSize() {
        return aal1PayloadSize;
    }


    /**
     * Sets the aal1PayloadSize value for this PreferredPacketServiceProfile.
     * 
     * @param aal1PayloadSize
     */
    public void setAal1PayloadSize(java.lang.Short aal1PayloadSize) {
        this.aal1PayloadSize = aal1PayloadSize;
    }


    /**
     * Gets the codecEntry1Id value for this PreferredPacketServiceProfile.
     * 
     * @return codecEntry1Id
     */
    public java.lang.String getCodecEntry1Id() {
        return codecEntry1Id;
    }


    /**
     * Sets the codecEntry1Id value for this PreferredPacketServiceProfile.
     * 
     * @param codecEntry1Id
     */
    public void setCodecEntry1Id(java.lang.String codecEntry1Id) {
        this.codecEntry1Id = codecEntry1Id;
    }


    /**
     * Gets the codecEntry2Id value for this PreferredPacketServiceProfile.
     * 
     * @return codecEntry2Id
     */
    public java.lang.String getCodecEntry2Id() {
        return codecEntry2Id;
    }


    /**
     * Sets the codecEntry2Id value for this PreferredPacketServiceProfile.
     * 
     * @param codecEntry2Id
     */
    public void setCodecEntry2Id(java.lang.String codecEntry2Id) {
        this.codecEntry2Id = codecEntry2Id;
    }


    /**
     * Gets the codecEntry3Id value for this PreferredPacketServiceProfile.
     * 
     * @return codecEntry3Id
     */
    public java.lang.String getCodecEntry3Id() {
        return codecEntry3Id;
    }


    /**
     * Sets the codecEntry3Id value for this PreferredPacketServiceProfile.
     * 
     * @param codecEntry3Id
     */
    public void setCodecEntry3Id(java.lang.String codecEntry3Id) {
        this.codecEntry3Id = codecEntry3Id;
    }


    /**
     * Gets the codecEntry4Id value for this PreferredPacketServiceProfile.
     * 
     * @return codecEntry4Id
     */
    public java.lang.String getCodecEntry4Id() {
        return codecEntry4Id;
    }


    /**
     * Sets the codecEntry4Id value for this PreferredPacketServiceProfile.
     * 
     * @param codecEntry4Id
     */
    public void setCodecEntry4Id(java.lang.String codecEntry4Id) {
        this.codecEntry4Id = codecEntry4Id;
    }


    /**
     * Gets the attributes value for this PreferredPacketServiceProfile.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this PreferredPacketServiceProfile.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the attributes2 value for this PreferredPacketServiceProfile.
     * 
     * @return attributes2
     */
    public java.lang.Integer getAttributes2() {
        return attributes2;
    }


    /**
     * Sets the attributes2 value for this PreferredPacketServiceProfile.
     * 
     * @param attributes2
     */
    public void setAttributes2(java.lang.Integer attributes2) {
        this.attributes2 = attributes2;
    }


    /**
     * Gets the attributes3 value for this PreferredPacketServiceProfile.
     * 
     * @return attributes3
     */
    public java.lang.Integer getAttributes3() {
        return attributes3;
    }


    /**
     * Sets the attributes3 value for this PreferredPacketServiceProfile.
     * 
     * @param attributes3
     */
    public void setAttributes3(java.lang.Integer attributes3) {
        this.attributes3 = attributes3;
    }


    /**
     * Gets the attributes4 value for this PreferredPacketServiceProfile.
     * 
     * @return attributes4
     */
    public java.lang.Integer getAttributes4() {
        return attributes4;
    }


    /**
     * Sets the attributes4 value for this PreferredPacketServiceProfile.
     * 
     * @param attributes4
     */
    public void setAttributes4(java.lang.Integer attributes4) {
        this.attributes4 = attributes4;
    }


    /**
     * Gets the p2PCtrlOptionType value for this PreferredPacketServiceProfile.
     * 
     * @return p2PCtrlOptionType
     */
    public java.lang.Integer getP2PCtrlOptionType() {
        return p2PCtrlOptionType;
    }


    /**
     * Sets the p2PCtrlOptionType value for this PreferredPacketServiceProfile.
     * 
     * @param p2PCtrlOptionType
     */
    public void setP2PCtrlOptionType(java.lang.Integer p2PCtrlOptionType) {
        this.p2PCtrlOptionType = p2PCtrlOptionType;
    }


    /**
     * Gets the p2PCtrlOptionRtpFlow value for this PreferredPacketServiceProfile.
     * 
     * @return p2PCtrlOptionRtpFlow
     */
    public java.lang.Integer getP2PCtrlOptionRtpFlow() {
        return p2PCtrlOptionRtpFlow;
    }


    /**
     * Sets the p2PCtrlOptionRtpFlow value for this PreferredPacketServiceProfile.
     * 
     * @param p2PCtrlOptionRtpFlow
     */
    public void setP2PCtrlOptionRtpFlow(java.lang.Integer p2PCtrlOptionRtpFlow) {
        this.p2PCtrlOptionRtpFlow = p2PCtrlOptionRtpFlow;
    }


    /**
     * Gets the dataCallPacketSize value for this PreferredPacketServiceProfile.
     * 
     * @return dataCallPacketSize
     */
    public java.lang.Integer getDataCallPacketSize() {
        return dataCallPacketSize;
    }


    /**
     * Sets the dataCallPacketSize value for this PreferredPacketServiceProfile.
     * 
     * @param dataCallPacketSize
     */
    public void setDataCallPacketSize(java.lang.Integer dataCallPacketSize) {
        this.dataCallPacketSize = dataCallPacketSize;
    }


    /**
     * Gets the rfc2833RtpPayloadType value for this PreferredPacketServiceProfile.
     * 
     * @return rfc2833RtpPayloadType
     */
    public java.lang.Integer getRfc2833RtpPayloadType() {
        return rfc2833RtpPayloadType;
    }


    /**
     * Sets the rfc2833RtpPayloadType value for this PreferredPacketServiceProfile.
     * 
     * @param rfc2833RtpPayloadType
     */
    public void setRfc2833RtpPayloadType(java.lang.Integer rfc2833RtpPayloadType) {
        this.rfc2833RtpPayloadType = rfc2833RtpPayloadType;
    }


    /**
     * Gets the securityCryptoSuiteId value for this PreferredPacketServiceProfile.
     * 
     * @return securityCryptoSuiteId
     */
    public java.lang.String getSecurityCryptoSuiteId() {
        return securityCryptoSuiteId;
    }


    /**
     * Sets the securityCryptoSuiteId value for this PreferredPacketServiceProfile.
     * 
     * @param securityCryptoSuiteId
     */
    public void setSecurityCryptoSuiteId(java.lang.String securityCryptoSuiteId) {
        this.securityCryptoSuiteId = securityCryptoSuiteId;
    }


    /**
     * Gets the videoMaxBw value for this PreferredPacketServiceProfile.
     * 
     * @return videoMaxBw
     */
    public java.lang.Integer getVideoMaxBw() {
        return videoMaxBw;
    }


    /**
     * Sets the videoMaxBw value for this PreferredPacketServiceProfile.
     * 
     * @param videoMaxBw
     */
    public void setVideoMaxBw(java.lang.Integer videoMaxBw) {
        this.videoMaxBw = videoMaxBw;
    }


    /**
     * Gets the videoBwReductionRate value for this PreferredPacketServiceProfile.
     * 
     * @return videoBwReductionRate
     */
    public java.lang.Integer getVideoBwReductionRate() {
        return videoBwReductionRate;
    }


    /**
     * Sets the videoBwReductionRate value for this PreferredPacketServiceProfile.
     * 
     * @param videoBwReductionRate
     */
    public void setVideoBwReductionRate(java.lang.Integer videoBwReductionRate) {
        this.videoBwReductionRate = videoBwReductionRate;
    }


    /**
     * Gets the videoFailAudioOnly value for this PreferredPacketServiceProfile.
     * 
     * @return videoFailAudioOnly
     */
    public java.lang.Integer getVideoFailAudioOnly() {
        return videoFailAudioOnly;
    }


    /**
     * Sets the videoFailAudioOnly value for this PreferredPacketServiceProfile.
     * 
     * @param videoFailAudioOnly
     */
    public void setVideoFailAudioOnly(java.lang.Integer videoFailAudioOnly) {
        this.videoFailAudioOnly = videoFailAudioOnly;
    }


    /**
     * Gets the mediaPacketCos value for this PreferredPacketServiceProfile.
     * 
     * @return mediaPacketCos
     */
    public java.lang.Integer getMediaPacketCos() {
        return mediaPacketCos;
    }


    /**
     * Sets the mediaPacketCos value for this PreferredPacketServiceProfile.
     * 
     * @param mediaPacketCos
     */
    public void setMediaPacketCos(java.lang.Integer mediaPacketCos) {
        this.mediaPacketCos = mediaPacketCos;
    }


    /**
     * Gets the packetMediaControlSh value for this PreferredPacketServiceProfile.
     * 
     * @return packetMediaControlSh
     */
    public java.lang.Short getPacketMediaControlSh() {
        return packetMediaControlSh;
    }


    /**
     * Sets the packetMediaControlSh value for this PreferredPacketServiceProfile.
     * 
     * @param packetMediaControlSh
     */
    public void setPacketMediaControlSh(java.lang.Short packetMediaControlSh) {
        this.packetMediaControlSh = packetMediaControlSh;
    }


    /**
     * Gets the codecEntry5Id value for this PreferredPacketServiceProfile.
     * 
     * @return codecEntry5Id
     */
    public java.lang.String getCodecEntry5Id() {
        return codecEntry5Id;
    }


    /**
     * Sets the codecEntry5Id value for this PreferredPacketServiceProfile.
     * 
     * @param codecEntry5Id
     */
    public void setCodecEntry5Id(java.lang.String codecEntry5Id) {
        this.codecEntry5Id = codecEntry5Id;
    }


    /**
     * Gets the codecEntry6Id value for this PreferredPacketServiceProfile.
     * 
     * @return codecEntry6Id
     */
    public java.lang.String getCodecEntry6Id() {
        return codecEntry6Id;
    }


    /**
     * Sets the codecEntry6Id value for this PreferredPacketServiceProfile.
     * 
     * @param codecEntry6Id
     */
    public void setCodecEntry6Id(java.lang.String codecEntry6Id) {
        this.codecEntry6Id = codecEntry6Id;
    }


    /**
     * Gets the codecEntry7Id value for this PreferredPacketServiceProfile.
     * 
     * @return codecEntry7Id
     */
    public java.lang.String getCodecEntry7Id() {
        return codecEntry7Id;
    }


    /**
     * Sets the codecEntry7Id value for this PreferredPacketServiceProfile.
     * 
     * @param codecEntry7Id
     */
    public void setCodecEntry7Id(java.lang.String codecEntry7Id) {
        this.codecEntry7Id = codecEntry7Id;
    }


    /**
     * Gets the codecEntry8Id value for this PreferredPacketServiceProfile.
     * 
     * @return codecEntry8Id
     */
    public java.lang.String getCodecEntry8Id() {
        return codecEntry8Id;
    }


    /**
     * Sets the codecEntry8Id value for this PreferredPacketServiceProfile.
     * 
     * @param codecEntry8Id
     */
    public void setCodecEntry8Id(java.lang.String codecEntry8Id) {
        this.codecEntry8Id = codecEntry8Id;
    }


    /**
     * Gets the codecEntry9Id value for this PreferredPacketServiceProfile.
     * 
     * @return codecEntry9Id
     */
    public java.lang.String getCodecEntry9Id() {
        return codecEntry9Id;
    }


    /**
     * Sets the codecEntry9Id value for this PreferredPacketServiceProfile.
     * 
     * @param codecEntry9Id
     */
    public void setCodecEntry9Id(java.lang.String codecEntry9Id) {
        this.codecEntry9Id = codecEntry9Id;
    }


    /**
     * Gets the codecEntry10Id value for this PreferredPacketServiceProfile.
     * 
     * @return codecEntry10Id
     */
    public java.lang.String getCodecEntry10Id() {
        return codecEntry10Id;
    }


    /**
     * Sets the codecEntry10Id value for this PreferredPacketServiceProfile.
     * 
     * @param codecEntry10Id
     */
    public void setCodecEntry10Id(java.lang.String codecEntry10Id) {
        this.codecEntry10Id = codecEntry10Id;
    }


    /**
     * Gets the codecEntry11Id value for this PreferredPacketServiceProfile.
     * 
     * @return codecEntry11Id
     */
    public java.lang.String getCodecEntry11Id() {
        return codecEntry11Id;
    }


    /**
     * Sets the codecEntry11Id value for this PreferredPacketServiceProfile.
     * 
     * @param codecEntry11Id
     */
    public void setCodecEntry11Id(java.lang.String codecEntry11Id) {
        this.codecEntry11Id = codecEntry11Id;
    }


    /**
     * Gets the codecEntry12Id value for this PreferredPacketServiceProfile.
     * 
     * @return codecEntry12Id
     */
    public java.lang.String getCodecEntry12Id() {
        return codecEntry12Id;
    }


    /**
     * Sets the codecEntry12Id value for this PreferredPacketServiceProfile.
     * 
     * @param codecEntry12Id
     */
    public void setCodecEntry12Id(java.lang.String codecEntry12Id) {
        this.codecEntry12Id = codecEntry12Id;
    }


    /**
     * Gets the ipv4Tos value for this PreferredPacketServiceProfile.
     * 
     * @return ipv4Tos
     */
    public java.lang.Short getIpv4Tos() {
        return ipv4Tos;
    }


    /**
     * Sets the ipv4Tos value for this PreferredPacketServiceProfile.
     * 
     * @param ipv4Tos
     */
    public void setIpv4Tos(java.lang.Short ipv4Tos) {
        this.ipv4Tos = ipv4Tos;
    }


    /**
     * Gets the ipv6TrafficClass value for this PreferredPacketServiceProfile.
     * 
     * @return ipv6TrafficClass
     */
    public java.lang.Short getIpv6TrafficClass() {
        return ipv6TrafficClass;
    }


    /**
     * Sets the ipv6TrafficClass value for this PreferredPacketServiceProfile.
     * 
     * @param ipv6TrafficClass
     */
    public void setIpv6TrafficClass(java.lang.Short ipv6TrafficClass) {
        this.ipv6TrafficClass = ipv6TrafficClass;
    }


    /**
     * Gets the ieee8021QVlanCos value for this PreferredPacketServiceProfile.
     * 
     * @return ieee8021QVlanCos
     */
    public java.lang.Short getIeee8021QVlanCos() {
        return ieee8021QVlanCos;
    }


    /**
     * Sets the ieee8021QVlanCos value for this PreferredPacketServiceProfile.
     * 
     * @param ieee8021QVlanCos
     */
    public void setIeee8021QVlanCos(java.lang.Short ieee8021QVlanCos) {
        this.ieee8021QVlanCos = ieee8021QVlanCos;
    }


    /**
     * Gets the codecListProfile value for this PreferredPacketServiceProfile.
     * 
     * @return codecListProfile
     */
    public java.lang.String getCodecListProfile() {
        return codecListProfile;
    }


    /**
     * Sets the codecListProfile value for this PreferredPacketServiceProfile.
     * 
     * @param codecListProfile
     */
    public void setCodecListProfile(java.lang.String codecListProfile) {
        this.codecListProfile = codecListProfile;
    }


    /**
     * Gets the t38FaxExtAttributes value for this PreferredPacketServiceProfile.
     * 
     * @return t38FaxExtAttributes
     */
    public java.lang.Short getT38FaxExtAttributes() {
        return t38FaxExtAttributes;
    }


    /**
     * Sets the t38FaxExtAttributes value for this PreferredPacketServiceProfile.
     * 
     * @param t38FaxExtAttributes
     */
    public void setT38FaxExtAttributes(java.lang.Short t38FaxExtAttributes) {
        this.t38FaxExtAttributes = t38FaxExtAttributes;
    }


    /**
     * Gets the dtlsCryptoSuiteId value for this PreferredPacketServiceProfile.
     * 
     * @return dtlsCryptoSuiteId
     */
    public java.lang.String getDtlsCryptoSuiteId() {
        return dtlsCryptoSuiteId;
    }


    /**
     * Sets the dtlsCryptoSuiteId value for this PreferredPacketServiceProfile.
     * 
     * @param dtlsCryptoSuiteId
     */
    public void setDtlsCryptoSuiteId(java.lang.String dtlsCryptoSuiteId) {
        this.dtlsCryptoSuiteId = dtlsCryptoSuiteId;
    }


    /**
     * Gets the msrpDscp value for this PreferredPacketServiceProfile.
     * 
     * @return msrpDscp
     */
    public java.lang.Short getMsrpDscp() {
        return msrpDscp;
    }


    /**
     * Sets the msrpDscp value for this PreferredPacketServiceProfile.
     * 
     * @param msrpDscp
     */
    public void setMsrpDscp(java.lang.Short msrpDscp) {
        this.msrpDscp = msrpDscp;
    }


    /**
     * Gets the genericAttributes1 value for this PreferredPacketServiceProfile.
     * 
     * @return genericAttributes1
     */
    public java.lang.Integer getGenericAttributes1() {
        return genericAttributes1;
    }


    /**
     * Sets the genericAttributes1 value for this PreferredPacketServiceProfile.
     * 
     * @param genericAttributes1
     */
    public void setGenericAttributes1(java.lang.Integer genericAttributes1) {
        this.genericAttributes1 = genericAttributes1;
    }


    /**
     * Gets the genericAttributes2 value for this PreferredPacketServiceProfile.
     * 
     * @return genericAttributes2
     */
    public java.lang.Integer getGenericAttributes2() {
        return genericAttributes2;
    }


    /**
     * Sets the genericAttributes2 value for this PreferredPacketServiceProfile.
     * 
     * @param genericAttributes2
     */
    public void setGenericAttributes2(java.lang.Integer genericAttributes2) {
        this.genericAttributes2 = genericAttributes2;
    }


    /**
     * Gets the genericAttributes3 value for this PreferredPacketServiceProfile.
     * 
     * @return genericAttributes3
     */
    public java.lang.Integer getGenericAttributes3() {
        return genericAttributes3;
    }


    /**
     * Sets the genericAttributes3 value for this PreferredPacketServiceProfile.
     * 
     * @param genericAttributes3
     */
    public void setGenericAttributes3(java.lang.Integer genericAttributes3) {
        this.genericAttributes3 = genericAttributes3;
    }


    /**
     * Gets the genericAttributes4 value for this PreferredPacketServiceProfile.
     * 
     * @return genericAttributes4
     */
    public java.lang.Integer getGenericAttributes4() {
        return genericAttributes4;
    }


    /**
     * Sets the genericAttributes4 value for this PreferredPacketServiceProfile.
     * 
     * @param genericAttributes4
     */
    public void setGenericAttributes4(java.lang.Integer genericAttributes4) {
        this.genericAttributes4 = genericAttributes4;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreferredPacketServiceProfile)) return false;
        PreferredPacketServiceProfile other = (PreferredPacketServiceProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prfdPacketServiceProfileId==null && other.getPrfdPacketServiceProfileId()==null) || 
             (this.prfdPacketServiceProfileId!=null &&
              this.prfdPacketServiceProfileId.equals(other.getPrfdPacketServiceProfileId()))) &&
            ((this.rtpDataPayloadType==null && other.getRtpDataPayloadType()==null) || 
             (this.rtpDataPayloadType!=null &&
              this.rtpDataPayloadType.equals(other.getRtpDataPayloadType()))) &&
            ((this.silenceFactor==null && other.getSilenceFactor()==null) || 
             (this.silenceFactor!=null &&
              this.silenceFactor.equals(other.getSilenceFactor()))) &&
            ((this.typeOfService==null && other.getTypeOfService()==null) || 
             (this.typeOfService!=null &&
              this.typeOfService.equals(other.getTypeOfService()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.voiceInitPlayoutDelay==null && other.getVoiceInitPlayoutDelay()==null) || 
             (this.voiceInitPlayoutDelay!=null &&
              this.voiceInitPlayoutDelay.equals(other.getVoiceInitPlayoutDelay()))) &&
            ((this.dataInitPlayoutDelay==null && other.getDataInitPlayoutDelay()==null) || 
             (this.dataInitPlayoutDelay!=null &&
              this.dataInitPlayoutDelay.equals(other.getDataInitPlayoutDelay()))) &&
            ((this.packetLossThreshold==null && other.getPacketLossThreshold()==null) || 
             (this.packetLossThreshold!=null &&
              this.packetLossThreshold.equals(other.getPacketLossThreshold()))) &&
            ((this.packetLossRrbandwidth==null && other.getPacketLossRrbandwidth()==null) || 
             (this.packetLossRrbandwidth!=null &&
              this.packetLossRrbandwidth.equals(other.getPacketLossRrbandwidth()))) &&
            ((this.packetLossRsbandwidth==null && other.getPacketLossRsbandwidth()==null) || 
             (this.packetLossRsbandwidth!=null &&
              this.packetLossRsbandwidth.equals(other.getPacketLossRsbandwidth()))) &&
            ((this.rtpOptions==null && other.getRtpOptions()==null) || 
             (this.rtpOptions!=null &&
              this.rtpOptions.equals(other.getRtpOptions()))) &&
            ((this.g711SidRtpPayloadType==null && other.getG711SidRtpPayloadType()==null) || 
             (this.g711SidRtpPayloadType!=null &&
              this.g711SidRtpPayloadType.equals(other.getG711SidRtpPayloadType()))) &&
            ((this.aal1PayloadSize==null && other.getAal1PayloadSize()==null) || 
             (this.aal1PayloadSize!=null &&
              this.aal1PayloadSize.equals(other.getAal1PayloadSize()))) &&
            ((this.codecEntry1Id==null && other.getCodecEntry1Id()==null) || 
             (this.codecEntry1Id!=null &&
              this.codecEntry1Id.equals(other.getCodecEntry1Id()))) &&
            ((this.codecEntry2Id==null && other.getCodecEntry2Id()==null) || 
             (this.codecEntry2Id!=null &&
              this.codecEntry2Id.equals(other.getCodecEntry2Id()))) &&
            ((this.codecEntry3Id==null && other.getCodecEntry3Id()==null) || 
             (this.codecEntry3Id!=null &&
              this.codecEntry3Id.equals(other.getCodecEntry3Id()))) &&
            ((this.codecEntry4Id==null && other.getCodecEntry4Id()==null) || 
             (this.codecEntry4Id!=null &&
              this.codecEntry4Id.equals(other.getCodecEntry4Id()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.attributes2==null && other.getAttributes2()==null) || 
             (this.attributes2!=null &&
              this.attributes2.equals(other.getAttributes2()))) &&
            ((this.attributes3==null && other.getAttributes3()==null) || 
             (this.attributes3!=null &&
              this.attributes3.equals(other.getAttributes3()))) &&
            ((this.attributes4==null && other.getAttributes4()==null) || 
             (this.attributes4!=null &&
              this.attributes4.equals(other.getAttributes4()))) &&
            ((this.p2PCtrlOptionType==null && other.getP2PCtrlOptionType()==null) || 
             (this.p2PCtrlOptionType!=null &&
              this.p2PCtrlOptionType.equals(other.getP2PCtrlOptionType()))) &&
            ((this.p2PCtrlOptionRtpFlow==null && other.getP2PCtrlOptionRtpFlow()==null) || 
             (this.p2PCtrlOptionRtpFlow!=null &&
              this.p2PCtrlOptionRtpFlow.equals(other.getP2PCtrlOptionRtpFlow()))) &&
            ((this.dataCallPacketSize==null && other.getDataCallPacketSize()==null) || 
             (this.dataCallPacketSize!=null &&
              this.dataCallPacketSize.equals(other.getDataCallPacketSize()))) &&
            ((this.rfc2833RtpPayloadType==null && other.getRfc2833RtpPayloadType()==null) || 
             (this.rfc2833RtpPayloadType!=null &&
              this.rfc2833RtpPayloadType.equals(other.getRfc2833RtpPayloadType()))) &&
            ((this.securityCryptoSuiteId==null && other.getSecurityCryptoSuiteId()==null) || 
             (this.securityCryptoSuiteId!=null &&
              this.securityCryptoSuiteId.equals(other.getSecurityCryptoSuiteId()))) &&
            ((this.videoMaxBw==null && other.getVideoMaxBw()==null) || 
             (this.videoMaxBw!=null &&
              this.videoMaxBw.equals(other.getVideoMaxBw()))) &&
            ((this.videoBwReductionRate==null && other.getVideoBwReductionRate()==null) || 
             (this.videoBwReductionRate!=null &&
              this.videoBwReductionRate.equals(other.getVideoBwReductionRate()))) &&
            ((this.videoFailAudioOnly==null && other.getVideoFailAudioOnly()==null) || 
             (this.videoFailAudioOnly!=null &&
              this.videoFailAudioOnly.equals(other.getVideoFailAudioOnly()))) &&
            ((this.mediaPacketCos==null && other.getMediaPacketCos()==null) || 
             (this.mediaPacketCos!=null &&
              this.mediaPacketCos.equals(other.getMediaPacketCos()))) &&
            ((this.packetMediaControlSh==null && other.getPacketMediaControlSh()==null) || 
             (this.packetMediaControlSh!=null &&
              this.packetMediaControlSh.equals(other.getPacketMediaControlSh()))) &&
            ((this.codecEntry5Id==null && other.getCodecEntry5Id()==null) || 
             (this.codecEntry5Id!=null &&
              this.codecEntry5Id.equals(other.getCodecEntry5Id()))) &&
            ((this.codecEntry6Id==null && other.getCodecEntry6Id()==null) || 
             (this.codecEntry6Id!=null &&
              this.codecEntry6Id.equals(other.getCodecEntry6Id()))) &&
            ((this.codecEntry7Id==null && other.getCodecEntry7Id()==null) || 
             (this.codecEntry7Id!=null &&
              this.codecEntry7Id.equals(other.getCodecEntry7Id()))) &&
            ((this.codecEntry8Id==null && other.getCodecEntry8Id()==null) || 
             (this.codecEntry8Id!=null &&
              this.codecEntry8Id.equals(other.getCodecEntry8Id()))) &&
            ((this.codecEntry9Id==null && other.getCodecEntry9Id()==null) || 
             (this.codecEntry9Id!=null &&
              this.codecEntry9Id.equals(other.getCodecEntry9Id()))) &&
            ((this.codecEntry10Id==null && other.getCodecEntry10Id()==null) || 
             (this.codecEntry10Id!=null &&
              this.codecEntry10Id.equals(other.getCodecEntry10Id()))) &&
            ((this.codecEntry11Id==null && other.getCodecEntry11Id()==null) || 
             (this.codecEntry11Id!=null &&
              this.codecEntry11Id.equals(other.getCodecEntry11Id()))) &&
            ((this.codecEntry12Id==null && other.getCodecEntry12Id()==null) || 
             (this.codecEntry12Id!=null &&
              this.codecEntry12Id.equals(other.getCodecEntry12Id()))) &&
            ((this.ipv4Tos==null && other.getIpv4Tos()==null) || 
             (this.ipv4Tos!=null &&
              this.ipv4Tos.equals(other.getIpv4Tos()))) &&
            ((this.ipv6TrafficClass==null && other.getIpv6TrafficClass()==null) || 
             (this.ipv6TrafficClass!=null &&
              this.ipv6TrafficClass.equals(other.getIpv6TrafficClass()))) &&
            ((this.ieee8021QVlanCos==null && other.getIeee8021QVlanCos()==null) || 
             (this.ieee8021QVlanCos!=null &&
              this.ieee8021QVlanCos.equals(other.getIeee8021QVlanCos()))) &&
            ((this.codecListProfile==null && other.getCodecListProfile()==null) || 
             (this.codecListProfile!=null &&
              this.codecListProfile.equals(other.getCodecListProfile()))) &&
            ((this.t38FaxExtAttributes==null && other.getT38FaxExtAttributes()==null) || 
             (this.t38FaxExtAttributes!=null &&
              this.t38FaxExtAttributes.equals(other.getT38FaxExtAttributes()))) &&
            ((this.dtlsCryptoSuiteId==null && other.getDtlsCryptoSuiteId()==null) || 
             (this.dtlsCryptoSuiteId!=null &&
              this.dtlsCryptoSuiteId.equals(other.getDtlsCryptoSuiteId()))) &&
            ((this.msrpDscp==null && other.getMsrpDscp()==null) || 
             (this.msrpDscp!=null &&
              this.msrpDscp.equals(other.getMsrpDscp()))) &&
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
        if (getPrfdPacketServiceProfileId() != null) {
            _hashCode += getPrfdPacketServiceProfileId().hashCode();
        }
        if (getRtpDataPayloadType() != null) {
            _hashCode += getRtpDataPayloadType().hashCode();
        }
        if (getSilenceFactor() != null) {
            _hashCode += getSilenceFactor().hashCode();
        }
        if (getTypeOfService() != null) {
            _hashCode += getTypeOfService().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getVoiceInitPlayoutDelay() != null) {
            _hashCode += getVoiceInitPlayoutDelay().hashCode();
        }
        if (getDataInitPlayoutDelay() != null) {
            _hashCode += getDataInitPlayoutDelay().hashCode();
        }
        if (getPacketLossThreshold() != null) {
            _hashCode += getPacketLossThreshold().hashCode();
        }
        if (getPacketLossRrbandwidth() != null) {
            _hashCode += getPacketLossRrbandwidth().hashCode();
        }
        if (getPacketLossRsbandwidth() != null) {
            _hashCode += getPacketLossRsbandwidth().hashCode();
        }
        if (getRtpOptions() != null) {
            _hashCode += getRtpOptions().hashCode();
        }
        if (getG711SidRtpPayloadType() != null) {
            _hashCode += getG711SidRtpPayloadType().hashCode();
        }
        if (getAal1PayloadSize() != null) {
            _hashCode += getAal1PayloadSize().hashCode();
        }
        if (getCodecEntry1Id() != null) {
            _hashCode += getCodecEntry1Id().hashCode();
        }
        if (getCodecEntry2Id() != null) {
            _hashCode += getCodecEntry2Id().hashCode();
        }
        if (getCodecEntry3Id() != null) {
            _hashCode += getCodecEntry3Id().hashCode();
        }
        if (getCodecEntry4Id() != null) {
            _hashCode += getCodecEntry4Id().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getAttributes2() != null) {
            _hashCode += getAttributes2().hashCode();
        }
        if (getAttributes3() != null) {
            _hashCode += getAttributes3().hashCode();
        }
        if (getAttributes4() != null) {
            _hashCode += getAttributes4().hashCode();
        }
        if (getP2PCtrlOptionType() != null) {
            _hashCode += getP2PCtrlOptionType().hashCode();
        }
        if (getP2PCtrlOptionRtpFlow() != null) {
            _hashCode += getP2PCtrlOptionRtpFlow().hashCode();
        }
        if (getDataCallPacketSize() != null) {
            _hashCode += getDataCallPacketSize().hashCode();
        }
        if (getRfc2833RtpPayloadType() != null) {
            _hashCode += getRfc2833RtpPayloadType().hashCode();
        }
        if (getSecurityCryptoSuiteId() != null) {
            _hashCode += getSecurityCryptoSuiteId().hashCode();
        }
        if (getVideoMaxBw() != null) {
            _hashCode += getVideoMaxBw().hashCode();
        }
        if (getVideoBwReductionRate() != null) {
            _hashCode += getVideoBwReductionRate().hashCode();
        }
        if (getVideoFailAudioOnly() != null) {
            _hashCode += getVideoFailAudioOnly().hashCode();
        }
        if (getMediaPacketCos() != null) {
            _hashCode += getMediaPacketCos().hashCode();
        }
        if (getPacketMediaControlSh() != null) {
            _hashCode += getPacketMediaControlSh().hashCode();
        }
        if (getCodecEntry5Id() != null) {
            _hashCode += getCodecEntry5Id().hashCode();
        }
        if (getCodecEntry6Id() != null) {
            _hashCode += getCodecEntry6Id().hashCode();
        }
        if (getCodecEntry7Id() != null) {
            _hashCode += getCodecEntry7Id().hashCode();
        }
        if (getCodecEntry8Id() != null) {
            _hashCode += getCodecEntry8Id().hashCode();
        }
        if (getCodecEntry9Id() != null) {
            _hashCode += getCodecEntry9Id().hashCode();
        }
        if (getCodecEntry10Id() != null) {
            _hashCode += getCodecEntry10Id().hashCode();
        }
        if (getCodecEntry11Id() != null) {
            _hashCode += getCodecEntry11Id().hashCode();
        }
        if (getCodecEntry12Id() != null) {
            _hashCode += getCodecEntry12Id().hashCode();
        }
        if (getIpv4Tos() != null) {
            _hashCode += getIpv4Tos().hashCode();
        }
        if (getIpv6TrafficClass() != null) {
            _hashCode += getIpv6TrafficClass().hashCode();
        }
        if (getIeee8021QVlanCos() != null) {
            _hashCode += getIeee8021QVlanCos().hashCode();
        }
        if (getCodecListProfile() != null) {
            _hashCode += getCodecListProfile().hashCode();
        }
        if (getT38FaxExtAttributes() != null) {
            _hashCode += getT38FaxExtAttributes().hashCode();
        }
        if (getDtlsCryptoSuiteId() != null) {
            _hashCode += getDtlsCryptoSuiteId().hashCode();
        }
        if (getMsrpDscp() != null) {
            _hashCode += getMsrpDscp().hashCode();
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
        new org.apache.axis.description.TypeDesc(PreferredPacketServiceProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PreferredPacketServiceProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prfdPacketServiceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prfdPacketServiceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtpDataPayloadType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtpDataPayloadType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("silenceFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "silenceFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeOfService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceInitPlayoutDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voiceInitPlayoutDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInitPlayoutDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInitPlayoutDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetLossThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packetLossThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetLossRrbandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packetLossRrbandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetLossRsbandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packetLossRsbandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtpOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtpOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("g711SidRtpPayloadType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "g711sidRtpPayloadType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aal1PayloadSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aal1PayloadSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntry1Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntry1Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntry2Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntry2Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntry3Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntry3Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntry4Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntry4Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p2PCtrlOptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "p2pCtrlOptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p2PCtrlOptionRtpFlow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "p2pCtrlOptionRtpFlow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCallPacketSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCallPacketSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfc2833RtpPayloadType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rfc2833RtpPayloadType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityCryptoSuiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securityCryptoSuiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoMaxBw");
        elemField.setXmlName(new javax.xml.namespace.QName("", "videoMaxBw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoBwReductionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "videoBwReductionRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoFailAudioOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "videoFailAudioOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaPacketCos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaPacketCos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetMediaControlSh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packetMediaControlSh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntry5Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntry5Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntry6Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntry6Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntry7Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntry7Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntry8Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntry8Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntry9Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntry9Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntry10Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntry10Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntry11Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntry11Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntry12Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntry12Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv4Tos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv4Tos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6TrafficClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6TrafficClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ieee8021QVlanCos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ieee8021qVlanCos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecListProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecListProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t38FaxExtAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "t38FaxExtAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtlsCryptoSuiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtlsCryptoSuiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msrpDscp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msrpDscp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
