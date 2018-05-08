/**
 * Trunkgroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class Trunkgroup  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String trunkgroupId;

    private java.lang.String gatewayId;

    private java.lang.String carrierId;

    private java.lang.String overrideCarrierId;

    private java.lang.String npaId;

    private java.lang.String jipId;

    private java.lang.Short destinationSwitchType;

    private java.lang.Short releaseToneTreatment;

    private java.lang.Short direction;

    private java.lang.Short unrestrictedFlag;

    private java.lang.Short signalingFlag;

    private java.lang.String inPmRuleId;

    private java.lang.String outPmRuleId;

    private java.lang.String numberingPlanId;

    private java.lang.String callingPartyId;

    private java.lang.String countryId;

    private java.lang.String lataId;

    private java.lang.String regionId;

    private java.lang.Short defaultOlip;

    private java.lang.String signalingProfileId;

    private java.lang.String zzProfileId;

    private java.lang.String prfdPacketServiceProfileId;

    private java.lang.String ownCarrierId;

    private java.lang.Short poiLevel;

    private java.lang.String poiChargeArea;

    private java.lang.String originatingCarrier;

    private java.lang.String trunkgroupDomainId;

    private java.lang.String billingPlanId;

    private java.lang.String sipDomainId;

    private java.lang.String billingId;

    private java.lang.Short callingPartyNoa;

    private java.lang.Short callingPartyNpi;

    private java.lang.Short billingNoa;

    private java.lang.Short billingNpi;

    private java.lang.String tgCos;

    private java.lang.String tgCosProfileId;

    private java.lang.String dialPlanProfileId;

    private java.lang.String digitLenEnfProfileId;

    private java.lang.String npiId;

    private java.lang.String businessGroupId;

    private java.lang.Integer elementAttributes;

    private java.lang.String classOfServiceId;

    private java.lang.String carrierSelectionPriorityId;

    private java.lang.String pseudoCarrierId;

    private java.lang.String featureControlProfileId;

    private java.lang.String trunkgroupId2;

    private java.lang.String description;

    private java.lang.Short tdmTrunkType;

    private java.lang.Short scpBusinessServiceGroup;

    private java.lang.Integer chargeIndicator;

    private java.lang.String erpProfileId;

    private java.lang.String rcProfileId;

    private java.lang.Short cpnPresentation;

    private java.lang.Short cpnScreening;

    private java.lang.Short dfltCpnPresentation;

    private java.lang.Short localizationType;

    private java.lang.String exceptionProfileId;

    private java.lang.String prefixProfileId;

    private java.lang.String businessLocationId;

    private java.lang.String billingInfoId;

    private java.lang.Integer egressChargeInd;

    private java.lang.Short isEscaped;

    private java.lang.String defaultCpc;

    private java.lang.String numberAnalysisProfileId;

    private java.lang.String pprProfileId;

    private java.lang.Integer maximumSatelliteHops;

    private java.lang.Short trafficTrunkResvLevel1;

    private java.lang.Short trafficTrunkResvLevel2;

    private java.lang.String callingArea;

    private java.lang.String localRingBackToneId;

    private java.lang.String ipSignalingPeerGroupId;

    private java.lang.String ipSignalingProfileId;

    private java.lang.String iptgPacketServiceProfileId;

    private java.lang.String iptgIpSignalingProfileId;

    private java.lang.String owningCarrierProfileId;

    private java.lang.String carrierTypeProfileId;

    private java.lang.String deviceProfileId;

    private java.lang.String chargeInformationId;

    private java.lang.Integer networkdataPartition;

    private java.lang.Integer networkdataNet;

    private java.lang.String ddiRangeProfileId;

    private java.lang.Integer forcedOlip;

    private java.lang.String bNumberPrefix;

    private java.lang.String autoRecallProfileId;

    private java.lang.String carrierCodeConvrId;

    private java.lang.String nextHopDomainId;

    private java.lang.String infoTransCapProfileId;

    private java.lang.String zoneIndexProfileId;

    private java.lang.String addressContext;

    private java.lang.String chargeBandProfileId;

    private java.lang.Short trunkgroupVersionPreference;

    private java.lang.String origNetworkId;

    private java.lang.String sipRcProfileId;

    private java.lang.String sipLrProfileId;

    private java.lang.String enumDomainProfileId;

    private java.lang.Short remoteSipPeerType;

    public Trunkgroup() {
    }

    public Trunkgroup(
           java.lang.String trunkgroupId,
           java.lang.String gatewayId,
           java.lang.String carrierId,
           java.lang.String overrideCarrierId,
           java.lang.String npaId,
           java.lang.String jipId,
           java.lang.Short destinationSwitchType,
           java.lang.Short releaseToneTreatment,
           java.lang.Short direction,
           java.lang.Short unrestrictedFlag,
           java.lang.Short signalingFlag,
           java.lang.String inPmRuleId,
           java.lang.String outPmRuleId,
           java.lang.String numberingPlanId,
           java.lang.String callingPartyId,
           java.lang.String countryId,
           java.lang.String lataId,
           java.lang.String regionId,
           java.lang.Short defaultOlip,
           java.lang.String signalingProfileId,
           java.lang.String zzProfileId,
           java.lang.String prfdPacketServiceProfileId,
           java.lang.String ownCarrierId,
           java.lang.Short poiLevel,
           java.lang.String poiChargeArea,
           java.lang.String originatingCarrier,
           java.lang.String trunkgroupDomainId,
           java.lang.String billingPlanId,
           java.lang.String sipDomainId,
           java.lang.String billingId,
           java.lang.Short callingPartyNoa,
           java.lang.Short callingPartyNpi,
           java.lang.Short billingNoa,
           java.lang.Short billingNpi,
           java.lang.String tgCos,
           java.lang.String tgCosProfileId,
           java.lang.String dialPlanProfileId,
           java.lang.String digitLenEnfProfileId,
           java.lang.String npiId,
           java.lang.String businessGroupId,
           java.lang.Integer elementAttributes,
           java.lang.String classOfServiceId,
           java.lang.String carrierSelectionPriorityId,
           java.lang.String pseudoCarrierId,
           java.lang.String featureControlProfileId,
           java.lang.String trunkgroupId2,
           java.lang.String description,
           java.lang.Short tdmTrunkType,
           java.lang.Short scpBusinessServiceGroup,
           java.lang.Integer chargeIndicator,
           java.lang.String erpProfileId,
           java.lang.String rcProfileId,
           java.lang.Short cpnPresentation,
           java.lang.Short cpnScreening,
           java.lang.Short dfltCpnPresentation,
           java.lang.Short localizationType,
           java.lang.String exceptionProfileId,
           java.lang.String prefixProfileId,
           java.lang.String businessLocationId,
           java.lang.String billingInfoId,
           java.lang.Integer egressChargeInd,
           java.lang.Short isEscaped,
           java.lang.String defaultCpc,
           java.lang.String numberAnalysisProfileId,
           java.lang.String pprProfileId,
           java.lang.Integer maximumSatelliteHops,
           java.lang.Short trafficTrunkResvLevel1,
           java.lang.Short trafficTrunkResvLevel2,
           java.lang.String callingArea,
           java.lang.String localRingBackToneId,
           java.lang.String ipSignalingPeerGroupId,
           java.lang.String ipSignalingProfileId,
           java.lang.String iptgPacketServiceProfileId,
           java.lang.String iptgIpSignalingProfileId,
           java.lang.String owningCarrierProfileId,
           java.lang.String carrierTypeProfileId,
           java.lang.String deviceProfileId,
           java.lang.String chargeInformationId,
           java.lang.Integer networkdataPartition,
           java.lang.Integer networkdataNet,
           java.lang.String ddiRangeProfileId,
           java.lang.Integer forcedOlip,
           java.lang.String bNumberPrefix,
           java.lang.String autoRecallProfileId,
           java.lang.String carrierCodeConvrId,
           java.lang.String nextHopDomainId,
           java.lang.String infoTransCapProfileId,
           java.lang.String zoneIndexProfileId,
           java.lang.String addressContext,
           java.lang.String chargeBandProfileId,
           java.lang.Short trunkgroupVersionPreference,
           java.lang.String origNetworkId,
           java.lang.String sipRcProfileId,
           java.lang.String sipLrProfileId,
           java.lang.String enumDomainProfileId,
           java.lang.Short remoteSipPeerType) {
        this.trunkgroupId = trunkgroupId;
        this.gatewayId = gatewayId;
        this.carrierId = carrierId;
        this.overrideCarrierId = overrideCarrierId;
        this.npaId = npaId;
        this.jipId = jipId;
        this.destinationSwitchType = destinationSwitchType;
        this.releaseToneTreatment = releaseToneTreatment;
        this.direction = direction;
        this.unrestrictedFlag = unrestrictedFlag;
        this.signalingFlag = signalingFlag;
        this.inPmRuleId = inPmRuleId;
        this.outPmRuleId = outPmRuleId;
        this.numberingPlanId = numberingPlanId;
        this.callingPartyId = callingPartyId;
        this.countryId = countryId;
        this.lataId = lataId;
        this.regionId = regionId;
        this.defaultOlip = defaultOlip;
        this.signalingProfileId = signalingProfileId;
        this.zzProfileId = zzProfileId;
        this.prfdPacketServiceProfileId = prfdPacketServiceProfileId;
        this.ownCarrierId = ownCarrierId;
        this.poiLevel = poiLevel;
        this.poiChargeArea = poiChargeArea;
        this.originatingCarrier = originatingCarrier;
        this.trunkgroupDomainId = trunkgroupDomainId;
        this.billingPlanId = billingPlanId;
        this.sipDomainId = sipDomainId;
        this.billingId = billingId;
        this.callingPartyNoa = callingPartyNoa;
        this.callingPartyNpi = callingPartyNpi;
        this.billingNoa = billingNoa;
        this.billingNpi = billingNpi;
        this.tgCos = tgCos;
        this.tgCosProfileId = tgCosProfileId;
        this.dialPlanProfileId = dialPlanProfileId;
        this.digitLenEnfProfileId = digitLenEnfProfileId;
        this.npiId = npiId;
        this.businessGroupId = businessGroupId;
        this.elementAttributes = elementAttributes;
        this.classOfServiceId = classOfServiceId;
        this.carrierSelectionPriorityId = carrierSelectionPriorityId;
        this.pseudoCarrierId = pseudoCarrierId;
        this.featureControlProfileId = featureControlProfileId;
        this.trunkgroupId2 = trunkgroupId2;
        this.description = description;
        this.tdmTrunkType = tdmTrunkType;
        this.scpBusinessServiceGroup = scpBusinessServiceGroup;
        this.chargeIndicator = chargeIndicator;
        this.erpProfileId = erpProfileId;
        this.rcProfileId = rcProfileId;
        this.cpnPresentation = cpnPresentation;
        this.cpnScreening = cpnScreening;
        this.dfltCpnPresentation = dfltCpnPresentation;
        this.localizationType = localizationType;
        this.exceptionProfileId = exceptionProfileId;
        this.prefixProfileId = prefixProfileId;
        this.businessLocationId = businessLocationId;
        this.billingInfoId = billingInfoId;
        this.egressChargeInd = egressChargeInd;
        this.isEscaped = isEscaped;
        this.defaultCpc = defaultCpc;
        this.numberAnalysisProfileId = numberAnalysisProfileId;
        this.pprProfileId = pprProfileId;
        this.maximumSatelliteHops = maximumSatelliteHops;
        this.trafficTrunkResvLevel1 = trafficTrunkResvLevel1;
        this.trafficTrunkResvLevel2 = trafficTrunkResvLevel2;
        this.callingArea = callingArea;
        this.localRingBackToneId = localRingBackToneId;
        this.ipSignalingPeerGroupId = ipSignalingPeerGroupId;
        this.ipSignalingProfileId = ipSignalingProfileId;
        this.iptgPacketServiceProfileId = iptgPacketServiceProfileId;
        this.iptgIpSignalingProfileId = iptgIpSignalingProfileId;
        this.owningCarrierProfileId = owningCarrierProfileId;
        this.carrierTypeProfileId = carrierTypeProfileId;
        this.deviceProfileId = deviceProfileId;
        this.chargeInformationId = chargeInformationId;
        this.networkdataPartition = networkdataPartition;
        this.networkdataNet = networkdataNet;
        this.ddiRangeProfileId = ddiRangeProfileId;
        this.forcedOlip = forcedOlip;
        this.bNumberPrefix = bNumberPrefix;
        this.autoRecallProfileId = autoRecallProfileId;
        this.carrierCodeConvrId = carrierCodeConvrId;
        this.nextHopDomainId = nextHopDomainId;
        this.infoTransCapProfileId = infoTransCapProfileId;
        this.zoneIndexProfileId = zoneIndexProfileId;
        this.addressContext = addressContext;
        this.chargeBandProfileId = chargeBandProfileId;
        this.trunkgroupVersionPreference = trunkgroupVersionPreference;
        this.origNetworkId = origNetworkId;
        this.sipRcProfileId = sipRcProfileId;
        this.sipLrProfileId = sipLrProfileId;
        this.enumDomainProfileId = enumDomainProfileId;
        this.remoteSipPeerType = remoteSipPeerType;
    }


    /**
     * Gets the trunkgroupId value for this Trunkgroup.
     * 
     * @return trunkgroupId
     */
    public java.lang.String getTrunkgroupId() {
        return trunkgroupId;
    }


    /**
     * Sets the trunkgroupId value for this Trunkgroup.
     * 
     * @param trunkgroupId
     */
    public void setTrunkgroupId(java.lang.String trunkgroupId) {
        this.trunkgroupId = trunkgroupId;
    }


    /**
     * Gets the gatewayId value for this Trunkgroup.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this Trunkgroup.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the carrierId value for this Trunkgroup.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this Trunkgroup.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the overrideCarrierId value for this Trunkgroup.
     * 
     * @return overrideCarrierId
     */
    public java.lang.String getOverrideCarrierId() {
        return overrideCarrierId;
    }


    /**
     * Sets the overrideCarrierId value for this Trunkgroup.
     * 
     * @param overrideCarrierId
     */
    public void setOverrideCarrierId(java.lang.String overrideCarrierId) {
        this.overrideCarrierId = overrideCarrierId;
    }


    /**
     * Gets the npaId value for this Trunkgroup.
     * 
     * @return npaId
     */
    public java.lang.String getNpaId() {
        return npaId;
    }


    /**
     * Sets the npaId value for this Trunkgroup.
     * 
     * @param npaId
     */
    public void setNpaId(java.lang.String npaId) {
        this.npaId = npaId;
    }


    /**
     * Gets the jipId value for this Trunkgroup.
     * 
     * @return jipId
     */
    public java.lang.String getJipId() {
        return jipId;
    }


    /**
     * Sets the jipId value for this Trunkgroup.
     * 
     * @param jipId
     */
    public void setJipId(java.lang.String jipId) {
        this.jipId = jipId;
    }


    /**
     * Gets the destinationSwitchType value for this Trunkgroup.
     * 
     * @return destinationSwitchType
     */
    public java.lang.Short getDestinationSwitchType() {
        return destinationSwitchType;
    }


    /**
     * Sets the destinationSwitchType value for this Trunkgroup.
     * 
     * @param destinationSwitchType
     */
    public void setDestinationSwitchType(java.lang.Short destinationSwitchType) {
        this.destinationSwitchType = destinationSwitchType;
    }


    /**
     * Gets the releaseToneTreatment value for this Trunkgroup.
     * 
     * @return releaseToneTreatment
     */
    public java.lang.Short getReleaseToneTreatment() {
        return releaseToneTreatment;
    }


    /**
     * Sets the releaseToneTreatment value for this Trunkgroup.
     * 
     * @param releaseToneTreatment
     */
    public void setReleaseToneTreatment(java.lang.Short releaseToneTreatment) {
        this.releaseToneTreatment = releaseToneTreatment;
    }


    /**
     * Gets the direction value for this Trunkgroup.
     * 
     * @return direction
     */
    public java.lang.Short getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this Trunkgroup.
     * 
     * @param direction
     */
    public void setDirection(java.lang.Short direction) {
        this.direction = direction;
    }


    /**
     * Gets the unrestrictedFlag value for this Trunkgroup.
     * 
     * @return unrestrictedFlag
     */
    public java.lang.Short getUnrestrictedFlag() {
        return unrestrictedFlag;
    }


    /**
     * Sets the unrestrictedFlag value for this Trunkgroup.
     * 
     * @param unrestrictedFlag
     */
    public void setUnrestrictedFlag(java.lang.Short unrestrictedFlag) {
        this.unrestrictedFlag = unrestrictedFlag;
    }


    /**
     * Gets the signalingFlag value for this Trunkgroup.
     * 
     * @return signalingFlag
     */
    public java.lang.Short getSignalingFlag() {
        return signalingFlag;
    }


    /**
     * Sets the signalingFlag value for this Trunkgroup.
     * 
     * @param signalingFlag
     */
    public void setSignalingFlag(java.lang.Short signalingFlag) {
        this.signalingFlag = signalingFlag;
    }


    /**
     * Gets the inPmRuleId value for this Trunkgroup.
     * 
     * @return inPmRuleId
     */
    public java.lang.String getInPmRuleId() {
        return inPmRuleId;
    }


    /**
     * Sets the inPmRuleId value for this Trunkgroup.
     * 
     * @param inPmRuleId
     */
    public void setInPmRuleId(java.lang.String inPmRuleId) {
        this.inPmRuleId = inPmRuleId;
    }


    /**
     * Gets the outPmRuleId value for this Trunkgroup.
     * 
     * @return outPmRuleId
     */
    public java.lang.String getOutPmRuleId() {
        return outPmRuleId;
    }


    /**
     * Sets the outPmRuleId value for this Trunkgroup.
     * 
     * @param outPmRuleId
     */
    public void setOutPmRuleId(java.lang.String outPmRuleId) {
        this.outPmRuleId = outPmRuleId;
    }


    /**
     * Gets the numberingPlanId value for this Trunkgroup.
     * 
     * @return numberingPlanId
     */
    public java.lang.String getNumberingPlanId() {
        return numberingPlanId;
    }


    /**
     * Sets the numberingPlanId value for this Trunkgroup.
     * 
     * @param numberingPlanId
     */
    public void setNumberingPlanId(java.lang.String numberingPlanId) {
        this.numberingPlanId = numberingPlanId;
    }


    /**
     * Gets the callingPartyId value for this Trunkgroup.
     * 
     * @return callingPartyId
     */
    public java.lang.String getCallingPartyId() {
        return callingPartyId;
    }


    /**
     * Sets the callingPartyId value for this Trunkgroup.
     * 
     * @param callingPartyId
     */
    public void setCallingPartyId(java.lang.String callingPartyId) {
        this.callingPartyId = callingPartyId;
    }


    /**
     * Gets the countryId value for this Trunkgroup.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this Trunkgroup.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the lataId value for this Trunkgroup.
     * 
     * @return lataId
     */
    public java.lang.String getLataId() {
        return lataId;
    }


    /**
     * Sets the lataId value for this Trunkgroup.
     * 
     * @param lataId
     */
    public void setLataId(java.lang.String lataId) {
        this.lataId = lataId;
    }


    /**
     * Gets the regionId value for this Trunkgroup.
     * 
     * @return regionId
     */
    public java.lang.String getRegionId() {
        return regionId;
    }


    /**
     * Sets the regionId value for this Trunkgroup.
     * 
     * @param regionId
     */
    public void setRegionId(java.lang.String regionId) {
        this.regionId = regionId;
    }


    /**
     * Gets the defaultOlip value for this Trunkgroup.
     * 
     * @return defaultOlip
     */
    public java.lang.Short getDefaultOlip() {
        return defaultOlip;
    }


    /**
     * Sets the defaultOlip value for this Trunkgroup.
     * 
     * @param defaultOlip
     */
    public void setDefaultOlip(java.lang.Short defaultOlip) {
        this.defaultOlip = defaultOlip;
    }


    /**
     * Gets the signalingProfileId value for this Trunkgroup.
     * 
     * @return signalingProfileId
     */
    public java.lang.String getSignalingProfileId() {
        return signalingProfileId;
    }


    /**
     * Sets the signalingProfileId value for this Trunkgroup.
     * 
     * @param signalingProfileId
     */
    public void setSignalingProfileId(java.lang.String signalingProfileId) {
        this.signalingProfileId = signalingProfileId;
    }


    /**
     * Gets the zzProfileId value for this Trunkgroup.
     * 
     * @return zzProfileId
     */
    public java.lang.String getZzProfileId() {
        return zzProfileId;
    }


    /**
     * Sets the zzProfileId value for this Trunkgroup.
     * 
     * @param zzProfileId
     */
    public void setZzProfileId(java.lang.String zzProfileId) {
        this.zzProfileId = zzProfileId;
    }


    /**
     * Gets the prfdPacketServiceProfileId value for this Trunkgroup.
     * 
     * @return prfdPacketServiceProfileId
     */
    public java.lang.String getPrfdPacketServiceProfileId() {
        return prfdPacketServiceProfileId;
    }


    /**
     * Sets the prfdPacketServiceProfileId value for this Trunkgroup.
     * 
     * @param prfdPacketServiceProfileId
     */
    public void setPrfdPacketServiceProfileId(java.lang.String prfdPacketServiceProfileId) {
        this.prfdPacketServiceProfileId = prfdPacketServiceProfileId;
    }


    /**
     * Gets the ownCarrierId value for this Trunkgroup.
     * 
     * @return ownCarrierId
     */
    public java.lang.String getOwnCarrierId() {
        return ownCarrierId;
    }


    /**
     * Sets the ownCarrierId value for this Trunkgroup.
     * 
     * @param ownCarrierId
     */
    public void setOwnCarrierId(java.lang.String ownCarrierId) {
        this.ownCarrierId = ownCarrierId;
    }


    /**
     * Gets the poiLevel value for this Trunkgroup.
     * 
     * @return poiLevel
     */
    public java.lang.Short getPoiLevel() {
        return poiLevel;
    }


    /**
     * Sets the poiLevel value for this Trunkgroup.
     * 
     * @param poiLevel
     */
    public void setPoiLevel(java.lang.Short poiLevel) {
        this.poiLevel = poiLevel;
    }


    /**
     * Gets the poiChargeArea value for this Trunkgroup.
     * 
     * @return poiChargeArea
     */
    public java.lang.String getPoiChargeArea() {
        return poiChargeArea;
    }


    /**
     * Sets the poiChargeArea value for this Trunkgroup.
     * 
     * @param poiChargeArea
     */
    public void setPoiChargeArea(java.lang.String poiChargeArea) {
        this.poiChargeArea = poiChargeArea;
    }


    /**
     * Gets the originatingCarrier value for this Trunkgroup.
     * 
     * @return originatingCarrier
     */
    public java.lang.String getOriginatingCarrier() {
        return originatingCarrier;
    }


    /**
     * Sets the originatingCarrier value for this Trunkgroup.
     * 
     * @param originatingCarrier
     */
    public void setOriginatingCarrier(java.lang.String originatingCarrier) {
        this.originatingCarrier = originatingCarrier;
    }


    /**
     * Gets the trunkgroupDomainId value for this Trunkgroup.
     * 
     * @return trunkgroupDomainId
     */
    public java.lang.String getTrunkgroupDomainId() {
        return trunkgroupDomainId;
    }


    /**
     * Sets the trunkgroupDomainId value for this Trunkgroup.
     * 
     * @param trunkgroupDomainId
     */
    public void setTrunkgroupDomainId(java.lang.String trunkgroupDomainId) {
        this.trunkgroupDomainId = trunkgroupDomainId;
    }


    /**
     * Gets the billingPlanId value for this Trunkgroup.
     * 
     * @return billingPlanId
     */
    public java.lang.String getBillingPlanId() {
        return billingPlanId;
    }


    /**
     * Sets the billingPlanId value for this Trunkgroup.
     * 
     * @param billingPlanId
     */
    public void setBillingPlanId(java.lang.String billingPlanId) {
        this.billingPlanId = billingPlanId;
    }


    /**
     * Gets the sipDomainId value for this Trunkgroup.
     * 
     * @return sipDomainId
     */
    public java.lang.String getSipDomainId() {
        return sipDomainId;
    }


    /**
     * Sets the sipDomainId value for this Trunkgroup.
     * 
     * @param sipDomainId
     */
    public void setSipDomainId(java.lang.String sipDomainId) {
        this.sipDomainId = sipDomainId;
    }


    /**
     * Gets the billingId value for this Trunkgroup.
     * 
     * @return billingId
     */
    public java.lang.String getBillingId() {
        return billingId;
    }


    /**
     * Sets the billingId value for this Trunkgroup.
     * 
     * @param billingId
     */
    public void setBillingId(java.lang.String billingId) {
        this.billingId = billingId;
    }


    /**
     * Gets the callingPartyNoa value for this Trunkgroup.
     * 
     * @return callingPartyNoa
     */
    public java.lang.Short getCallingPartyNoa() {
        return callingPartyNoa;
    }


    /**
     * Sets the callingPartyNoa value for this Trunkgroup.
     * 
     * @param callingPartyNoa
     */
    public void setCallingPartyNoa(java.lang.Short callingPartyNoa) {
        this.callingPartyNoa = callingPartyNoa;
    }


    /**
     * Gets the callingPartyNpi value for this Trunkgroup.
     * 
     * @return callingPartyNpi
     */
    public java.lang.Short getCallingPartyNpi() {
        return callingPartyNpi;
    }


    /**
     * Sets the callingPartyNpi value for this Trunkgroup.
     * 
     * @param callingPartyNpi
     */
    public void setCallingPartyNpi(java.lang.Short callingPartyNpi) {
        this.callingPartyNpi = callingPartyNpi;
    }


    /**
     * Gets the billingNoa value for this Trunkgroup.
     * 
     * @return billingNoa
     */
    public java.lang.Short getBillingNoa() {
        return billingNoa;
    }


    /**
     * Sets the billingNoa value for this Trunkgroup.
     * 
     * @param billingNoa
     */
    public void setBillingNoa(java.lang.Short billingNoa) {
        this.billingNoa = billingNoa;
    }


    /**
     * Gets the billingNpi value for this Trunkgroup.
     * 
     * @return billingNpi
     */
    public java.lang.Short getBillingNpi() {
        return billingNpi;
    }


    /**
     * Sets the billingNpi value for this Trunkgroup.
     * 
     * @param billingNpi
     */
    public void setBillingNpi(java.lang.Short billingNpi) {
        this.billingNpi = billingNpi;
    }


    /**
     * Gets the tgCos value for this Trunkgroup.
     * 
     * @return tgCos
     */
    public java.lang.String getTgCos() {
        return tgCos;
    }


    /**
     * Sets the tgCos value for this Trunkgroup.
     * 
     * @param tgCos
     */
    public void setTgCos(java.lang.String tgCos) {
        this.tgCos = tgCos;
    }


    /**
     * Gets the tgCosProfileId value for this Trunkgroup.
     * 
     * @return tgCosProfileId
     */
    public java.lang.String getTgCosProfileId() {
        return tgCosProfileId;
    }


    /**
     * Sets the tgCosProfileId value for this Trunkgroup.
     * 
     * @param tgCosProfileId
     */
    public void setTgCosProfileId(java.lang.String tgCosProfileId) {
        this.tgCosProfileId = tgCosProfileId;
    }


    /**
     * Gets the dialPlanProfileId value for this Trunkgroup.
     * 
     * @return dialPlanProfileId
     */
    public java.lang.String getDialPlanProfileId() {
        return dialPlanProfileId;
    }


    /**
     * Sets the dialPlanProfileId value for this Trunkgroup.
     * 
     * @param dialPlanProfileId
     */
    public void setDialPlanProfileId(java.lang.String dialPlanProfileId) {
        this.dialPlanProfileId = dialPlanProfileId;
    }


    /**
     * Gets the digitLenEnfProfileId value for this Trunkgroup.
     * 
     * @return digitLenEnfProfileId
     */
    public java.lang.String getDigitLenEnfProfileId() {
        return digitLenEnfProfileId;
    }


    /**
     * Sets the digitLenEnfProfileId value for this Trunkgroup.
     * 
     * @param digitLenEnfProfileId
     */
    public void setDigitLenEnfProfileId(java.lang.String digitLenEnfProfileId) {
        this.digitLenEnfProfileId = digitLenEnfProfileId;
    }


    /**
     * Gets the npiId value for this Trunkgroup.
     * 
     * @return npiId
     */
    public java.lang.String getNpiId() {
        return npiId;
    }


    /**
     * Sets the npiId value for this Trunkgroup.
     * 
     * @param npiId
     */
    public void setNpiId(java.lang.String npiId) {
        this.npiId = npiId;
    }


    /**
     * Gets the businessGroupId value for this Trunkgroup.
     * 
     * @return businessGroupId
     */
    public java.lang.String getBusinessGroupId() {
        return businessGroupId;
    }


    /**
     * Sets the businessGroupId value for this Trunkgroup.
     * 
     * @param businessGroupId
     */
    public void setBusinessGroupId(java.lang.String businessGroupId) {
        this.businessGroupId = businessGroupId;
    }


    /**
     * Gets the elementAttributes value for this Trunkgroup.
     * 
     * @return elementAttributes
     */
    public java.lang.Integer getElementAttributes() {
        return elementAttributes;
    }


    /**
     * Sets the elementAttributes value for this Trunkgroup.
     * 
     * @param elementAttributes
     */
    public void setElementAttributes(java.lang.Integer elementAttributes) {
        this.elementAttributes = elementAttributes;
    }


    /**
     * Gets the classOfServiceId value for this Trunkgroup.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this Trunkgroup.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the carrierSelectionPriorityId value for this Trunkgroup.
     * 
     * @return carrierSelectionPriorityId
     */
    public java.lang.String getCarrierSelectionPriorityId() {
        return carrierSelectionPriorityId;
    }


    /**
     * Sets the carrierSelectionPriorityId value for this Trunkgroup.
     * 
     * @param carrierSelectionPriorityId
     */
    public void setCarrierSelectionPriorityId(java.lang.String carrierSelectionPriorityId) {
        this.carrierSelectionPriorityId = carrierSelectionPriorityId;
    }


    /**
     * Gets the pseudoCarrierId value for this Trunkgroup.
     * 
     * @return pseudoCarrierId
     */
    public java.lang.String getPseudoCarrierId() {
        return pseudoCarrierId;
    }


    /**
     * Sets the pseudoCarrierId value for this Trunkgroup.
     * 
     * @param pseudoCarrierId
     */
    public void setPseudoCarrierId(java.lang.String pseudoCarrierId) {
        this.pseudoCarrierId = pseudoCarrierId;
    }


    /**
     * Gets the featureControlProfileId value for this Trunkgroup.
     * 
     * @return featureControlProfileId
     */
    public java.lang.String getFeatureControlProfileId() {
        return featureControlProfileId;
    }


    /**
     * Sets the featureControlProfileId value for this Trunkgroup.
     * 
     * @param featureControlProfileId
     */
    public void setFeatureControlProfileId(java.lang.String featureControlProfileId) {
        this.featureControlProfileId = featureControlProfileId;
    }


    /**
     * Gets the trunkgroupId2 value for this Trunkgroup.
     * 
     * @return trunkgroupId2
     */
    public java.lang.String getTrunkgroupId2() {
        return trunkgroupId2;
    }


    /**
     * Sets the trunkgroupId2 value for this Trunkgroup.
     * 
     * @param trunkgroupId2
     */
    public void setTrunkgroupId2(java.lang.String trunkgroupId2) {
        this.trunkgroupId2 = trunkgroupId2;
    }


    /**
     * Gets the description value for this Trunkgroup.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Trunkgroup.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the tdmTrunkType value for this Trunkgroup.
     * 
     * @return tdmTrunkType
     */
    public java.lang.Short getTdmTrunkType() {
        return tdmTrunkType;
    }


    /**
     * Sets the tdmTrunkType value for this Trunkgroup.
     * 
     * @param tdmTrunkType
     */
    public void setTdmTrunkType(java.lang.Short tdmTrunkType) {
        this.tdmTrunkType = tdmTrunkType;
    }


    /**
     * Gets the scpBusinessServiceGroup value for this Trunkgroup.
     * 
     * @return scpBusinessServiceGroup
     */
    public java.lang.Short getScpBusinessServiceGroup() {
        return scpBusinessServiceGroup;
    }


    /**
     * Sets the scpBusinessServiceGroup value for this Trunkgroup.
     * 
     * @param scpBusinessServiceGroup
     */
    public void setScpBusinessServiceGroup(java.lang.Short scpBusinessServiceGroup) {
        this.scpBusinessServiceGroup = scpBusinessServiceGroup;
    }


    /**
     * Gets the chargeIndicator value for this Trunkgroup.
     * 
     * @return chargeIndicator
     */
    public java.lang.Integer getChargeIndicator() {
        return chargeIndicator;
    }


    /**
     * Sets the chargeIndicator value for this Trunkgroup.
     * 
     * @param chargeIndicator
     */
    public void setChargeIndicator(java.lang.Integer chargeIndicator) {
        this.chargeIndicator = chargeIndicator;
    }


    /**
     * Gets the erpProfileId value for this Trunkgroup.
     * 
     * @return erpProfileId
     */
    public java.lang.String getErpProfileId() {
        return erpProfileId;
    }


    /**
     * Sets the erpProfileId value for this Trunkgroup.
     * 
     * @param erpProfileId
     */
    public void setErpProfileId(java.lang.String erpProfileId) {
        this.erpProfileId = erpProfileId;
    }


    /**
     * Gets the rcProfileId value for this Trunkgroup.
     * 
     * @return rcProfileId
     */
    public java.lang.String getRcProfileId() {
        return rcProfileId;
    }


    /**
     * Sets the rcProfileId value for this Trunkgroup.
     * 
     * @param rcProfileId
     */
    public void setRcProfileId(java.lang.String rcProfileId) {
        this.rcProfileId = rcProfileId;
    }


    /**
     * Gets the cpnPresentation value for this Trunkgroup.
     * 
     * @return cpnPresentation
     */
    public java.lang.Short getCpnPresentation() {
        return cpnPresentation;
    }


    /**
     * Sets the cpnPresentation value for this Trunkgroup.
     * 
     * @param cpnPresentation
     */
    public void setCpnPresentation(java.lang.Short cpnPresentation) {
        this.cpnPresentation = cpnPresentation;
    }


    /**
     * Gets the cpnScreening value for this Trunkgroup.
     * 
     * @return cpnScreening
     */
    public java.lang.Short getCpnScreening() {
        return cpnScreening;
    }


    /**
     * Sets the cpnScreening value for this Trunkgroup.
     * 
     * @param cpnScreening
     */
    public void setCpnScreening(java.lang.Short cpnScreening) {
        this.cpnScreening = cpnScreening;
    }


    /**
     * Gets the dfltCpnPresentation value for this Trunkgroup.
     * 
     * @return dfltCpnPresentation
     */
    public java.lang.Short getDfltCpnPresentation() {
        return dfltCpnPresentation;
    }


    /**
     * Sets the dfltCpnPresentation value for this Trunkgroup.
     * 
     * @param dfltCpnPresentation
     */
    public void setDfltCpnPresentation(java.lang.Short dfltCpnPresentation) {
        this.dfltCpnPresentation = dfltCpnPresentation;
    }


    /**
     * Gets the localizationType value for this Trunkgroup.
     * 
     * @return localizationType
     */
    public java.lang.Short getLocalizationType() {
        return localizationType;
    }


    /**
     * Sets the localizationType value for this Trunkgroup.
     * 
     * @param localizationType
     */
    public void setLocalizationType(java.lang.Short localizationType) {
        this.localizationType = localizationType;
    }


    /**
     * Gets the exceptionProfileId value for this Trunkgroup.
     * 
     * @return exceptionProfileId
     */
    public java.lang.String getExceptionProfileId() {
        return exceptionProfileId;
    }


    /**
     * Sets the exceptionProfileId value for this Trunkgroup.
     * 
     * @param exceptionProfileId
     */
    public void setExceptionProfileId(java.lang.String exceptionProfileId) {
        this.exceptionProfileId = exceptionProfileId;
    }


    /**
     * Gets the prefixProfileId value for this Trunkgroup.
     * 
     * @return prefixProfileId
     */
    public java.lang.String getPrefixProfileId() {
        return prefixProfileId;
    }


    /**
     * Sets the prefixProfileId value for this Trunkgroup.
     * 
     * @param prefixProfileId
     */
    public void setPrefixProfileId(java.lang.String prefixProfileId) {
        this.prefixProfileId = prefixProfileId;
    }


    /**
     * Gets the businessLocationId value for this Trunkgroup.
     * 
     * @return businessLocationId
     */
    public java.lang.String getBusinessLocationId() {
        return businessLocationId;
    }


    /**
     * Sets the businessLocationId value for this Trunkgroup.
     * 
     * @param businessLocationId
     */
    public void setBusinessLocationId(java.lang.String businessLocationId) {
        this.businessLocationId = businessLocationId;
    }


    /**
     * Gets the billingInfoId value for this Trunkgroup.
     * 
     * @return billingInfoId
     */
    public java.lang.String getBillingInfoId() {
        return billingInfoId;
    }


    /**
     * Sets the billingInfoId value for this Trunkgroup.
     * 
     * @param billingInfoId
     */
    public void setBillingInfoId(java.lang.String billingInfoId) {
        this.billingInfoId = billingInfoId;
    }


    /**
     * Gets the egressChargeInd value for this Trunkgroup.
     * 
     * @return egressChargeInd
     */
    public java.lang.Integer getEgressChargeInd() {
        return egressChargeInd;
    }


    /**
     * Sets the egressChargeInd value for this Trunkgroup.
     * 
     * @param egressChargeInd
     */
    public void setEgressChargeInd(java.lang.Integer egressChargeInd) {
        this.egressChargeInd = egressChargeInd;
    }


    /**
     * Gets the isEscaped value for this Trunkgroup.
     * 
     * @return isEscaped
     */
    public java.lang.Short getIsEscaped() {
        return isEscaped;
    }


    /**
     * Sets the isEscaped value for this Trunkgroup.
     * 
     * @param isEscaped
     */
    public void setIsEscaped(java.lang.Short isEscaped) {
        this.isEscaped = isEscaped;
    }


    /**
     * Gets the defaultCpc value for this Trunkgroup.
     * 
     * @return defaultCpc
     */
    public java.lang.String getDefaultCpc() {
        return defaultCpc;
    }


    /**
     * Sets the defaultCpc value for this Trunkgroup.
     * 
     * @param defaultCpc
     */
    public void setDefaultCpc(java.lang.String defaultCpc) {
        this.defaultCpc = defaultCpc;
    }


    /**
     * Gets the numberAnalysisProfileId value for this Trunkgroup.
     * 
     * @return numberAnalysisProfileId
     */
    public java.lang.String getNumberAnalysisProfileId() {
        return numberAnalysisProfileId;
    }


    /**
     * Sets the numberAnalysisProfileId value for this Trunkgroup.
     * 
     * @param numberAnalysisProfileId
     */
    public void setNumberAnalysisProfileId(java.lang.String numberAnalysisProfileId) {
        this.numberAnalysisProfileId = numberAnalysisProfileId;
    }


    /**
     * Gets the pprProfileId value for this Trunkgroup.
     * 
     * @return pprProfileId
     */
    public java.lang.String getPprProfileId() {
        return pprProfileId;
    }


    /**
     * Sets the pprProfileId value for this Trunkgroup.
     * 
     * @param pprProfileId
     */
    public void setPprProfileId(java.lang.String pprProfileId) {
        this.pprProfileId = pprProfileId;
    }


    /**
     * Gets the maximumSatelliteHops value for this Trunkgroup.
     * 
     * @return maximumSatelliteHops
     */
    public java.lang.Integer getMaximumSatelliteHops() {
        return maximumSatelliteHops;
    }


    /**
     * Sets the maximumSatelliteHops value for this Trunkgroup.
     * 
     * @param maximumSatelliteHops
     */
    public void setMaximumSatelliteHops(java.lang.Integer maximumSatelliteHops) {
        this.maximumSatelliteHops = maximumSatelliteHops;
    }


    /**
     * Gets the trafficTrunkResvLevel1 value for this Trunkgroup.
     * 
     * @return trafficTrunkResvLevel1
     */
    public java.lang.Short getTrafficTrunkResvLevel1() {
        return trafficTrunkResvLevel1;
    }


    /**
     * Sets the trafficTrunkResvLevel1 value for this Trunkgroup.
     * 
     * @param trafficTrunkResvLevel1
     */
    public void setTrafficTrunkResvLevel1(java.lang.Short trafficTrunkResvLevel1) {
        this.trafficTrunkResvLevel1 = trafficTrunkResvLevel1;
    }


    /**
     * Gets the trafficTrunkResvLevel2 value for this Trunkgroup.
     * 
     * @return trafficTrunkResvLevel2
     */
    public java.lang.Short getTrafficTrunkResvLevel2() {
        return trafficTrunkResvLevel2;
    }


    /**
     * Sets the trafficTrunkResvLevel2 value for this Trunkgroup.
     * 
     * @param trafficTrunkResvLevel2
     */
    public void setTrafficTrunkResvLevel2(java.lang.Short trafficTrunkResvLevel2) {
        this.trafficTrunkResvLevel2 = trafficTrunkResvLevel2;
    }


    /**
     * Gets the callingArea value for this Trunkgroup.
     * 
     * @return callingArea
     */
    public java.lang.String getCallingArea() {
        return callingArea;
    }


    /**
     * Sets the callingArea value for this Trunkgroup.
     * 
     * @param callingArea
     */
    public void setCallingArea(java.lang.String callingArea) {
        this.callingArea = callingArea;
    }


    /**
     * Gets the localRingBackToneId value for this Trunkgroup.
     * 
     * @return localRingBackToneId
     */
    public java.lang.String getLocalRingBackToneId() {
        return localRingBackToneId;
    }


    /**
     * Sets the localRingBackToneId value for this Trunkgroup.
     * 
     * @param localRingBackToneId
     */
    public void setLocalRingBackToneId(java.lang.String localRingBackToneId) {
        this.localRingBackToneId = localRingBackToneId;
    }


    /**
     * Gets the ipSignalingPeerGroupId value for this Trunkgroup.
     * 
     * @return ipSignalingPeerGroupId
     */
    public java.lang.String getIpSignalingPeerGroupId() {
        return ipSignalingPeerGroupId;
    }


    /**
     * Sets the ipSignalingPeerGroupId value for this Trunkgroup.
     * 
     * @param ipSignalingPeerGroupId
     */
    public void setIpSignalingPeerGroupId(java.lang.String ipSignalingPeerGroupId) {
        this.ipSignalingPeerGroupId = ipSignalingPeerGroupId;
    }


    /**
     * Gets the ipSignalingProfileId value for this Trunkgroup.
     * 
     * @return ipSignalingProfileId
     */
    public java.lang.String getIpSignalingProfileId() {
        return ipSignalingProfileId;
    }


    /**
     * Sets the ipSignalingProfileId value for this Trunkgroup.
     * 
     * @param ipSignalingProfileId
     */
    public void setIpSignalingProfileId(java.lang.String ipSignalingProfileId) {
        this.ipSignalingProfileId = ipSignalingProfileId;
    }


    /**
     * Gets the iptgPacketServiceProfileId value for this Trunkgroup.
     * 
     * @return iptgPacketServiceProfileId
     */
    public java.lang.String getIptgPacketServiceProfileId() {
        return iptgPacketServiceProfileId;
    }


    /**
     * Sets the iptgPacketServiceProfileId value for this Trunkgroup.
     * 
     * @param iptgPacketServiceProfileId
     */
    public void setIptgPacketServiceProfileId(java.lang.String iptgPacketServiceProfileId) {
        this.iptgPacketServiceProfileId = iptgPacketServiceProfileId;
    }


    /**
     * Gets the iptgIpSignalingProfileId value for this Trunkgroup.
     * 
     * @return iptgIpSignalingProfileId
     */
    public java.lang.String getIptgIpSignalingProfileId() {
        return iptgIpSignalingProfileId;
    }


    /**
     * Sets the iptgIpSignalingProfileId value for this Trunkgroup.
     * 
     * @param iptgIpSignalingProfileId
     */
    public void setIptgIpSignalingProfileId(java.lang.String iptgIpSignalingProfileId) {
        this.iptgIpSignalingProfileId = iptgIpSignalingProfileId;
    }


    /**
     * Gets the owningCarrierProfileId value for this Trunkgroup.
     * 
     * @return owningCarrierProfileId
     */
    public java.lang.String getOwningCarrierProfileId() {
        return owningCarrierProfileId;
    }


    /**
     * Sets the owningCarrierProfileId value for this Trunkgroup.
     * 
     * @param owningCarrierProfileId
     */
    public void setOwningCarrierProfileId(java.lang.String owningCarrierProfileId) {
        this.owningCarrierProfileId = owningCarrierProfileId;
    }


    /**
     * Gets the carrierTypeProfileId value for this Trunkgroup.
     * 
     * @return carrierTypeProfileId
     */
    public java.lang.String getCarrierTypeProfileId() {
        return carrierTypeProfileId;
    }


    /**
     * Sets the carrierTypeProfileId value for this Trunkgroup.
     * 
     * @param carrierTypeProfileId
     */
    public void setCarrierTypeProfileId(java.lang.String carrierTypeProfileId) {
        this.carrierTypeProfileId = carrierTypeProfileId;
    }


    /**
     * Gets the deviceProfileId value for this Trunkgroup.
     * 
     * @return deviceProfileId
     */
    public java.lang.String getDeviceProfileId() {
        return deviceProfileId;
    }


    /**
     * Sets the deviceProfileId value for this Trunkgroup.
     * 
     * @param deviceProfileId
     */
    public void setDeviceProfileId(java.lang.String deviceProfileId) {
        this.deviceProfileId = deviceProfileId;
    }


    /**
     * Gets the chargeInformationId value for this Trunkgroup.
     * 
     * @return chargeInformationId
     */
    public java.lang.String getChargeInformationId() {
        return chargeInformationId;
    }


    /**
     * Sets the chargeInformationId value for this Trunkgroup.
     * 
     * @param chargeInformationId
     */
    public void setChargeInformationId(java.lang.String chargeInformationId) {
        this.chargeInformationId = chargeInformationId;
    }


    /**
     * Gets the networkdataPartition value for this Trunkgroup.
     * 
     * @return networkdataPartition
     */
    public java.lang.Integer getNetworkdataPartition() {
        return networkdataPartition;
    }


    /**
     * Sets the networkdataPartition value for this Trunkgroup.
     * 
     * @param networkdataPartition
     */
    public void setNetworkdataPartition(java.lang.Integer networkdataPartition) {
        this.networkdataPartition = networkdataPartition;
    }


    /**
     * Gets the networkdataNet value for this Trunkgroup.
     * 
     * @return networkdataNet
     */
    public java.lang.Integer getNetworkdataNet() {
        return networkdataNet;
    }


    /**
     * Sets the networkdataNet value for this Trunkgroup.
     * 
     * @param networkdataNet
     */
    public void setNetworkdataNet(java.lang.Integer networkdataNet) {
        this.networkdataNet = networkdataNet;
    }


    /**
     * Gets the ddiRangeProfileId value for this Trunkgroup.
     * 
     * @return ddiRangeProfileId
     */
    public java.lang.String getDdiRangeProfileId() {
        return ddiRangeProfileId;
    }


    /**
     * Sets the ddiRangeProfileId value for this Trunkgroup.
     * 
     * @param ddiRangeProfileId
     */
    public void setDdiRangeProfileId(java.lang.String ddiRangeProfileId) {
        this.ddiRangeProfileId = ddiRangeProfileId;
    }


    /**
     * Gets the forcedOlip value for this Trunkgroup.
     * 
     * @return forcedOlip
     */
    public java.lang.Integer getForcedOlip() {
        return forcedOlip;
    }


    /**
     * Sets the forcedOlip value for this Trunkgroup.
     * 
     * @param forcedOlip
     */
    public void setForcedOlip(java.lang.Integer forcedOlip) {
        this.forcedOlip = forcedOlip;
    }


    /**
     * Gets the bNumberPrefix value for this Trunkgroup.
     * 
     * @return bNumberPrefix
     */
    public java.lang.String getBNumberPrefix() {
        return bNumberPrefix;
    }


    /**
     * Sets the bNumberPrefix value for this Trunkgroup.
     * 
     * @param bNumberPrefix
     */
    public void setBNumberPrefix(java.lang.String bNumberPrefix) {
        this.bNumberPrefix = bNumberPrefix;
    }


    /**
     * Gets the autoRecallProfileId value for this Trunkgroup.
     * 
     * @return autoRecallProfileId
     */
    public java.lang.String getAutoRecallProfileId() {
        return autoRecallProfileId;
    }


    /**
     * Sets the autoRecallProfileId value for this Trunkgroup.
     * 
     * @param autoRecallProfileId
     */
    public void setAutoRecallProfileId(java.lang.String autoRecallProfileId) {
        this.autoRecallProfileId = autoRecallProfileId;
    }


    /**
     * Gets the carrierCodeConvrId value for this Trunkgroup.
     * 
     * @return carrierCodeConvrId
     */
    public java.lang.String getCarrierCodeConvrId() {
        return carrierCodeConvrId;
    }


    /**
     * Sets the carrierCodeConvrId value for this Trunkgroup.
     * 
     * @param carrierCodeConvrId
     */
    public void setCarrierCodeConvrId(java.lang.String carrierCodeConvrId) {
        this.carrierCodeConvrId = carrierCodeConvrId;
    }


    /**
     * Gets the nextHopDomainId value for this Trunkgroup.
     * 
     * @return nextHopDomainId
     */
    public java.lang.String getNextHopDomainId() {
        return nextHopDomainId;
    }


    /**
     * Sets the nextHopDomainId value for this Trunkgroup.
     * 
     * @param nextHopDomainId
     */
    public void setNextHopDomainId(java.lang.String nextHopDomainId) {
        this.nextHopDomainId = nextHopDomainId;
    }


    /**
     * Gets the infoTransCapProfileId value for this Trunkgroup.
     * 
     * @return infoTransCapProfileId
     */
    public java.lang.String getInfoTransCapProfileId() {
        return infoTransCapProfileId;
    }


    /**
     * Sets the infoTransCapProfileId value for this Trunkgroup.
     * 
     * @param infoTransCapProfileId
     */
    public void setInfoTransCapProfileId(java.lang.String infoTransCapProfileId) {
        this.infoTransCapProfileId = infoTransCapProfileId;
    }


    /**
     * Gets the zoneIndexProfileId value for this Trunkgroup.
     * 
     * @return zoneIndexProfileId
     */
    public java.lang.String getZoneIndexProfileId() {
        return zoneIndexProfileId;
    }


    /**
     * Sets the zoneIndexProfileId value for this Trunkgroup.
     * 
     * @param zoneIndexProfileId
     */
    public void setZoneIndexProfileId(java.lang.String zoneIndexProfileId) {
        this.zoneIndexProfileId = zoneIndexProfileId;
    }


    /**
     * Gets the addressContext value for this Trunkgroup.
     * 
     * @return addressContext
     */
    public java.lang.String getAddressContext() {
        return addressContext;
    }


    /**
     * Sets the addressContext value for this Trunkgroup.
     * 
     * @param addressContext
     */
    public void setAddressContext(java.lang.String addressContext) {
        this.addressContext = addressContext;
    }


    /**
     * Gets the chargeBandProfileId value for this Trunkgroup.
     * 
     * @return chargeBandProfileId
     */
    public java.lang.String getChargeBandProfileId() {
        return chargeBandProfileId;
    }


    /**
     * Sets the chargeBandProfileId value for this Trunkgroup.
     * 
     * @param chargeBandProfileId
     */
    public void setChargeBandProfileId(java.lang.String chargeBandProfileId) {
        this.chargeBandProfileId = chargeBandProfileId;
    }


    /**
     * Gets the trunkgroupVersionPreference value for this Trunkgroup.
     * 
     * @return trunkgroupVersionPreference
     */
    public java.lang.Short getTrunkgroupVersionPreference() {
        return trunkgroupVersionPreference;
    }


    /**
     * Sets the trunkgroupVersionPreference value for this Trunkgroup.
     * 
     * @param trunkgroupVersionPreference
     */
    public void setTrunkgroupVersionPreference(java.lang.Short trunkgroupVersionPreference) {
        this.trunkgroupVersionPreference = trunkgroupVersionPreference;
    }


    /**
     * Gets the origNetworkId value for this Trunkgroup.
     * 
     * @return origNetworkId
     */
    public java.lang.String getOrigNetworkId() {
        return origNetworkId;
    }


    /**
     * Sets the origNetworkId value for this Trunkgroup.
     * 
     * @param origNetworkId
     */
    public void setOrigNetworkId(java.lang.String origNetworkId) {
        this.origNetworkId = origNetworkId;
    }


    /**
     * Gets the sipRcProfileId value for this Trunkgroup.
     * 
     * @return sipRcProfileId
     */
    public java.lang.String getSipRcProfileId() {
        return sipRcProfileId;
    }


    /**
     * Sets the sipRcProfileId value for this Trunkgroup.
     * 
     * @param sipRcProfileId
     */
    public void setSipRcProfileId(java.lang.String sipRcProfileId) {
        this.sipRcProfileId = sipRcProfileId;
    }


    /**
     * Gets the sipLrProfileId value for this Trunkgroup.
     * 
     * @return sipLrProfileId
     */
    public java.lang.String getSipLrProfileId() {
        return sipLrProfileId;
    }


    /**
     * Sets the sipLrProfileId value for this Trunkgroup.
     * 
     * @param sipLrProfileId
     */
    public void setSipLrProfileId(java.lang.String sipLrProfileId) {
        this.sipLrProfileId = sipLrProfileId;
    }


    /**
     * Gets the enumDomainProfileId value for this Trunkgroup.
     * 
     * @return enumDomainProfileId
     */
    public java.lang.String getEnumDomainProfileId() {
        return enumDomainProfileId;
    }


    /**
     * Sets the enumDomainProfileId value for this Trunkgroup.
     * 
     * @param enumDomainProfileId
     */
    public void setEnumDomainProfileId(java.lang.String enumDomainProfileId) {
        this.enumDomainProfileId = enumDomainProfileId;
    }


    /**
     * Gets the remoteSipPeerType value for this Trunkgroup.
     * 
     * @return remoteSipPeerType
     */
    public java.lang.Short getRemoteSipPeerType() {
        return remoteSipPeerType;
    }


    /**
     * Sets the remoteSipPeerType value for this Trunkgroup.
     * 
     * @param remoteSipPeerType
     */
    public void setRemoteSipPeerType(java.lang.Short remoteSipPeerType) {
        this.remoteSipPeerType = remoteSipPeerType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Trunkgroup)) return false;
        Trunkgroup other = (Trunkgroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.trunkgroupId==null && other.getTrunkgroupId()==null) || 
             (this.trunkgroupId!=null &&
              this.trunkgroupId.equals(other.getTrunkgroupId()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId()))) &&
            ((this.overrideCarrierId==null && other.getOverrideCarrierId()==null) || 
             (this.overrideCarrierId!=null &&
              this.overrideCarrierId.equals(other.getOverrideCarrierId()))) &&
            ((this.npaId==null && other.getNpaId()==null) || 
             (this.npaId!=null &&
              this.npaId.equals(other.getNpaId()))) &&
            ((this.jipId==null && other.getJipId()==null) || 
             (this.jipId!=null &&
              this.jipId.equals(other.getJipId()))) &&
            ((this.destinationSwitchType==null && other.getDestinationSwitchType()==null) || 
             (this.destinationSwitchType!=null &&
              this.destinationSwitchType.equals(other.getDestinationSwitchType()))) &&
            ((this.releaseToneTreatment==null && other.getReleaseToneTreatment()==null) || 
             (this.releaseToneTreatment!=null &&
              this.releaseToneTreatment.equals(other.getReleaseToneTreatment()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.unrestrictedFlag==null && other.getUnrestrictedFlag()==null) || 
             (this.unrestrictedFlag!=null &&
              this.unrestrictedFlag.equals(other.getUnrestrictedFlag()))) &&
            ((this.signalingFlag==null && other.getSignalingFlag()==null) || 
             (this.signalingFlag!=null &&
              this.signalingFlag.equals(other.getSignalingFlag()))) &&
            ((this.inPmRuleId==null && other.getInPmRuleId()==null) || 
             (this.inPmRuleId!=null &&
              this.inPmRuleId.equals(other.getInPmRuleId()))) &&
            ((this.outPmRuleId==null && other.getOutPmRuleId()==null) || 
             (this.outPmRuleId!=null &&
              this.outPmRuleId.equals(other.getOutPmRuleId()))) &&
            ((this.numberingPlanId==null && other.getNumberingPlanId()==null) || 
             (this.numberingPlanId!=null &&
              this.numberingPlanId.equals(other.getNumberingPlanId()))) &&
            ((this.callingPartyId==null && other.getCallingPartyId()==null) || 
             (this.callingPartyId!=null &&
              this.callingPartyId.equals(other.getCallingPartyId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.lataId==null && other.getLataId()==null) || 
             (this.lataId!=null &&
              this.lataId.equals(other.getLataId()))) &&
            ((this.regionId==null && other.getRegionId()==null) || 
             (this.regionId!=null &&
              this.regionId.equals(other.getRegionId()))) &&
            ((this.defaultOlip==null && other.getDefaultOlip()==null) || 
             (this.defaultOlip!=null &&
              this.defaultOlip.equals(other.getDefaultOlip()))) &&
            ((this.signalingProfileId==null && other.getSignalingProfileId()==null) || 
             (this.signalingProfileId!=null &&
              this.signalingProfileId.equals(other.getSignalingProfileId()))) &&
            ((this.zzProfileId==null && other.getZzProfileId()==null) || 
             (this.zzProfileId!=null &&
              this.zzProfileId.equals(other.getZzProfileId()))) &&
            ((this.prfdPacketServiceProfileId==null && other.getPrfdPacketServiceProfileId()==null) || 
             (this.prfdPacketServiceProfileId!=null &&
              this.prfdPacketServiceProfileId.equals(other.getPrfdPacketServiceProfileId()))) &&
            ((this.ownCarrierId==null && other.getOwnCarrierId()==null) || 
             (this.ownCarrierId!=null &&
              this.ownCarrierId.equals(other.getOwnCarrierId()))) &&
            ((this.poiLevel==null && other.getPoiLevel()==null) || 
             (this.poiLevel!=null &&
              this.poiLevel.equals(other.getPoiLevel()))) &&
            ((this.poiChargeArea==null && other.getPoiChargeArea()==null) || 
             (this.poiChargeArea!=null &&
              this.poiChargeArea.equals(other.getPoiChargeArea()))) &&
            ((this.originatingCarrier==null && other.getOriginatingCarrier()==null) || 
             (this.originatingCarrier!=null &&
              this.originatingCarrier.equals(other.getOriginatingCarrier()))) &&
            ((this.trunkgroupDomainId==null && other.getTrunkgroupDomainId()==null) || 
             (this.trunkgroupDomainId!=null &&
              this.trunkgroupDomainId.equals(other.getTrunkgroupDomainId()))) &&
            ((this.billingPlanId==null && other.getBillingPlanId()==null) || 
             (this.billingPlanId!=null &&
              this.billingPlanId.equals(other.getBillingPlanId()))) &&
            ((this.sipDomainId==null && other.getSipDomainId()==null) || 
             (this.sipDomainId!=null &&
              this.sipDomainId.equals(other.getSipDomainId()))) &&
            ((this.billingId==null && other.getBillingId()==null) || 
             (this.billingId!=null &&
              this.billingId.equals(other.getBillingId()))) &&
            ((this.callingPartyNoa==null && other.getCallingPartyNoa()==null) || 
             (this.callingPartyNoa!=null &&
              this.callingPartyNoa.equals(other.getCallingPartyNoa()))) &&
            ((this.callingPartyNpi==null && other.getCallingPartyNpi()==null) || 
             (this.callingPartyNpi!=null &&
              this.callingPartyNpi.equals(other.getCallingPartyNpi()))) &&
            ((this.billingNoa==null && other.getBillingNoa()==null) || 
             (this.billingNoa!=null &&
              this.billingNoa.equals(other.getBillingNoa()))) &&
            ((this.billingNpi==null && other.getBillingNpi()==null) || 
             (this.billingNpi!=null &&
              this.billingNpi.equals(other.getBillingNpi()))) &&
            ((this.tgCos==null && other.getTgCos()==null) || 
             (this.tgCos!=null &&
              this.tgCos.equals(other.getTgCos()))) &&
            ((this.tgCosProfileId==null && other.getTgCosProfileId()==null) || 
             (this.tgCosProfileId!=null &&
              this.tgCosProfileId.equals(other.getTgCosProfileId()))) &&
            ((this.dialPlanProfileId==null && other.getDialPlanProfileId()==null) || 
             (this.dialPlanProfileId!=null &&
              this.dialPlanProfileId.equals(other.getDialPlanProfileId()))) &&
            ((this.digitLenEnfProfileId==null && other.getDigitLenEnfProfileId()==null) || 
             (this.digitLenEnfProfileId!=null &&
              this.digitLenEnfProfileId.equals(other.getDigitLenEnfProfileId()))) &&
            ((this.npiId==null && other.getNpiId()==null) || 
             (this.npiId!=null &&
              this.npiId.equals(other.getNpiId()))) &&
            ((this.businessGroupId==null && other.getBusinessGroupId()==null) || 
             (this.businessGroupId!=null &&
              this.businessGroupId.equals(other.getBusinessGroupId()))) &&
            ((this.elementAttributes==null && other.getElementAttributes()==null) || 
             (this.elementAttributes!=null &&
              this.elementAttributes.equals(other.getElementAttributes()))) &&
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.carrierSelectionPriorityId==null && other.getCarrierSelectionPriorityId()==null) || 
             (this.carrierSelectionPriorityId!=null &&
              this.carrierSelectionPriorityId.equals(other.getCarrierSelectionPriorityId()))) &&
            ((this.pseudoCarrierId==null && other.getPseudoCarrierId()==null) || 
             (this.pseudoCarrierId!=null &&
              this.pseudoCarrierId.equals(other.getPseudoCarrierId()))) &&
            ((this.featureControlProfileId==null && other.getFeatureControlProfileId()==null) || 
             (this.featureControlProfileId!=null &&
              this.featureControlProfileId.equals(other.getFeatureControlProfileId()))) &&
            ((this.trunkgroupId2==null && other.getTrunkgroupId2()==null) || 
             (this.trunkgroupId2!=null &&
              this.trunkgroupId2.equals(other.getTrunkgroupId2()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.tdmTrunkType==null && other.getTdmTrunkType()==null) || 
             (this.tdmTrunkType!=null &&
              this.tdmTrunkType.equals(other.getTdmTrunkType()))) &&
            ((this.scpBusinessServiceGroup==null && other.getScpBusinessServiceGroup()==null) || 
             (this.scpBusinessServiceGroup!=null &&
              this.scpBusinessServiceGroup.equals(other.getScpBusinessServiceGroup()))) &&
            ((this.chargeIndicator==null && other.getChargeIndicator()==null) || 
             (this.chargeIndicator!=null &&
              this.chargeIndicator.equals(other.getChargeIndicator()))) &&
            ((this.erpProfileId==null && other.getErpProfileId()==null) || 
             (this.erpProfileId!=null &&
              this.erpProfileId.equals(other.getErpProfileId()))) &&
            ((this.rcProfileId==null && other.getRcProfileId()==null) || 
             (this.rcProfileId!=null &&
              this.rcProfileId.equals(other.getRcProfileId()))) &&
            ((this.cpnPresentation==null && other.getCpnPresentation()==null) || 
             (this.cpnPresentation!=null &&
              this.cpnPresentation.equals(other.getCpnPresentation()))) &&
            ((this.cpnScreening==null && other.getCpnScreening()==null) || 
             (this.cpnScreening!=null &&
              this.cpnScreening.equals(other.getCpnScreening()))) &&
            ((this.dfltCpnPresentation==null && other.getDfltCpnPresentation()==null) || 
             (this.dfltCpnPresentation!=null &&
              this.dfltCpnPresentation.equals(other.getDfltCpnPresentation()))) &&
            ((this.localizationType==null && other.getLocalizationType()==null) || 
             (this.localizationType!=null &&
              this.localizationType.equals(other.getLocalizationType()))) &&
            ((this.exceptionProfileId==null && other.getExceptionProfileId()==null) || 
             (this.exceptionProfileId!=null &&
              this.exceptionProfileId.equals(other.getExceptionProfileId()))) &&
            ((this.prefixProfileId==null && other.getPrefixProfileId()==null) || 
             (this.prefixProfileId!=null &&
              this.prefixProfileId.equals(other.getPrefixProfileId()))) &&
            ((this.businessLocationId==null && other.getBusinessLocationId()==null) || 
             (this.businessLocationId!=null &&
              this.businessLocationId.equals(other.getBusinessLocationId()))) &&
            ((this.billingInfoId==null && other.getBillingInfoId()==null) || 
             (this.billingInfoId!=null &&
              this.billingInfoId.equals(other.getBillingInfoId()))) &&
            ((this.egressChargeInd==null && other.getEgressChargeInd()==null) || 
             (this.egressChargeInd!=null &&
              this.egressChargeInd.equals(other.getEgressChargeInd()))) &&
            ((this.isEscaped==null && other.getIsEscaped()==null) || 
             (this.isEscaped!=null &&
              this.isEscaped.equals(other.getIsEscaped()))) &&
            ((this.defaultCpc==null && other.getDefaultCpc()==null) || 
             (this.defaultCpc!=null &&
              this.defaultCpc.equals(other.getDefaultCpc()))) &&
            ((this.numberAnalysisProfileId==null && other.getNumberAnalysisProfileId()==null) || 
             (this.numberAnalysisProfileId!=null &&
              this.numberAnalysisProfileId.equals(other.getNumberAnalysisProfileId()))) &&
            ((this.pprProfileId==null && other.getPprProfileId()==null) || 
             (this.pprProfileId!=null &&
              this.pprProfileId.equals(other.getPprProfileId()))) &&
            ((this.maximumSatelliteHops==null && other.getMaximumSatelliteHops()==null) || 
             (this.maximumSatelliteHops!=null &&
              this.maximumSatelliteHops.equals(other.getMaximumSatelliteHops()))) &&
            ((this.trafficTrunkResvLevel1==null && other.getTrafficTrunkResvLevel1()==null) || 
             (this.trafficTrunkResvLevel1!=null &&
              this.trafficTrunkResvLevel1.equals(other.getTrafficTrunkResvLevel1()))) &&
            ((this.trafficTrunkResvLevel2==null && other.getTrafficTrunkResvLevel2()==null) || 
             (this.trafficTrunkResvLevel2!=null &&
              this.trafficTrunkResvLevel2.equals(other.getTrafficTrunkResvLevel2()))) &&
            ((this.callingArea==null && other.getCallingArea()==null) || 
             (this.callingArea!=null &&
              this.callingArea.equals(other.getCallingArea()))) &&
            ((this.localRingBackToneId==null && other.getLocalRingBackToneId()==null) || 
             (this.localRingBackToneId!=null &&
              this.localRingBackToneId.equals(other.getLocalRingBackToneId()))) &&
            ((this.ipSignalingPeerGroupId==null && other.getIpSignalingPeerGroupId()==null) || 
             (this.ipSignalingPeerGroupId!=null &&
              this.ipSignalingPeerGroupId.equals(other.getIpSignalingPeerGroupId()))) &&
            ((this.ipSignalingProfileId==null && other.getIpSignalingProfileId()==null) || 
             (this.ipSignalingProfileId!=null &&
              this.ipSignalingProfileId.equals(other.getIpSignalingProfileId()))) &&
            ((this.iptgPacketServiceProfileId==null && other.getIptgPacketServiceProfileId()==null) || 
             (this.iptgPacketServiceProfileId!=null &&
              this.iptgPacketServiceProfileId.equals(other.getIptgPacketServiceProfileId()))) &&
            ((this.iptgIpSignalingProfileId==null && other.getIptgIpSignalingProfileId()==null) || 
             (this.iptgIpSignalingProfileId!=null &&
              this.iptgIpSignalingProfileId.equals(other.getIptgIpSignalingProfileId()))) &&
            ((this.owningCarrierProfileId==null && other.getOwningCarrierProfileId()==null) || 
             (this.owningCarrierProfileId!=null &&
              this.owningCarrierProfileId.equals(other.getOwningCarrierProfileId()))) &&
            ((this.carrierTypeProfileId==null && other.getCarrierTypeProfileId()==null) || 
             (this.carrierTypeProfileId!=null &&
              this.carrierTypeProfileId.equals(other.getCarrierTypeProfileId()))) &&
            ((this.deviceProfileId==null && other.getDeviceProfileId()==null) || 
             (this.deviceProfileId!=null &&
              this.deviceProfileId.equals(other.getDeviceProfileId()))) &&
            ((this.chargeInformationId==null && other.getChargeInformationId()==null) || 
             (this.chargeInformationId!=null &&
              this.chargeInformationId.equals(other.getChargeInformationId()))) &&
            ((this.networkdataPartition==null && other.getNetworkdataPartition()==null) || 
             (this.networkdataPartition!=null &&
              this.networkdataPartition.equals(other.getNetworkdataPartition()))) &&
            ((this.networkdataNet==null && other.getNetworkdataNet()==null) || 
             (this.networkdataNet!=null &&
              this.networkdataNet.equals(other.getNetworkdataNet()))) &&
            ((this.ddiRangeProfileId==null && other.getDdiRangeProfileId()==null) || 
             (this.ddiRangeProfileId!=null &&
              this.ddiRangeProfileId.equals(other.getDdiRangeProfileId()))) &&
            ((this.forcedOlip==null && other.getForcedOlip()==null) || 
             (this.forcedOlip!=null &&
              this.forcedOlip.equals(other.getForcedOlip()))) &&
            ((this.bNumberPrefix==null && other.getBNumberPrefix()==null) || 
             (this.bNumberPrefix!=null &&
              this.bNumberPrefix.equals(other.getBNumberPrefix()))) &&
            ((this.autoRecallProfileId==null && other.getAutoRecallProfileId()==null) || 
             (this.autoRecallProfileId!=null &&
              this.autoRecallProfileId.equals(other.getAutoRecallProfileId()))) &&
            ((this.carrierCodeConvrId==null && other.getCarrierCodeConvrId()==null) || 
             (this.carrierCodeConvrId!=null &&
              this.carrierCodeConvrId.equals(other.getCarrierCodeConvrId()))) &&
            ((this.nextHopDomainId==null && other.getNextHopDomainId()==null) || 
             (this.nextHopDomainId!=null &&
              this.nextHopDomainId.equals(other.getNextHopDomainId()))) &&
            ((this.infoTransCapProfileId==null && other.getInfoTransCapProfileId()==null) || 
             (this.infoTransCapProfileId!=null &&
              this.infoTransCapProfileId.equals(other.getInfoTransCapProfileId()))) &&
            ((this.zoneIndexProfileId==null && other.getZoneIndexProfileId()==null) || 
             (this.zoneIndexProfileId!=null &&
              this.zoneIndexProfileId.equals(other.getZoneIndexProfileId()))) &&
            ((this.addressContext==null && other.getAddressContext()==null) || 
             (this.addressContext!=null &&
              this.addressContext.equals(other.getAddressContext()))) &&
            ((this.chargeBandProfileId==null && other.getChargeBandProfileId()==null) || 
             (this.chargeBandProfileId!=null &&
              this.chargeBandProfileId.equals(other.getChargeBandProfileId()))) &&
            ((this.trunkgroupVersionPreference==null && other.getTrunkgroupVersionPreference()==null) || 
             (this.trunkgroupVersionPreference!=null &&
              this.trunkgroupVersionPreference.equals(other.getTrunkgroupVersionPreference()))) &&
            ((this.origNetworkId==null && other.getOrigNetworkId()==null) || 
             (this.origNetworkId!=null &&
              this.origNetworkId.equals(other.getOrigNetworkId()))) &&
            ((this.sipRcProfileId==null && other.getSipRcProfileId()==null) || 
             (this.sipRcProfileId!=null &&
              this.sipRcProfileId.equals(other.getSipRcProfileId()))) &&
            ((this.sipLrProfileId==null && other.getSipLrProfileId()==null) || 
             (this.sipLrProfileId!=null &&
              this.sipLrProfileId.equals(other.getSipLrProfileId()))) &&
            ((this.enumDomainProfileId==null && other.getEnumDomainProfileId()==null) || 
             (this.enumDomainProfileId!=null &&
              this.enumDomainProfileId.equals(other.getEnumDomainProfileId()))) &&
            ((this.remoteSipPeerType==null && other.getRemoteSipPeerType()==null) || 
             (this.remoteSipPeerType!=null &&
              this.remoteSipPeerType.equals(other.getRemoteSipPeerType())));
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
        if (getTrunkgroupId() != null) {
            _hashCode += getTrunkgroupId().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        if (getOverrideCarrierId() != null) {
            _hashCode += getOverrideCarrierId().hashCode();
        }
        if (getNpaId() != null) {
            _hashCode += getNpaId().hashCode();
        }
        if (getJipId() != null) {
            _hashCode += getJipId().hashCode();
        }
        if (getDestinationSwitchType() != null) {
            _hashCode += getDestinationSwitchType().hashCode();
        }
        if (getReleaseToneTreatment() != null) {
            _hashCode += getReleaseToneTreatment().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getUnrestrictedFlag() != null) {
            _hashCode += getUnrestrictedFlag().hashCode();
        }
        if (getSignalingFlag() != null) {
            _hashCode += getSignalingFlag().hashCode();
        }
        if (getInPmRuleId() != null) {
            _hashCode += getInPmRuleId().hashCode();
        }
        if (getOutPmRuleId() != null) {
            _hashCode += getOutPmRuleId().hashCode();
        }
        if (getNumberingPlanId() != null) {
            _hashCode += getNumberingPlanId().hashCode();
        }
        if (getCallingPartyId() != null) {
            _hashCode += getCallingPartyId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getLataId() != null) {
            _hashCode += getLataId().hashCode();
        }
        if (getRegionId() != null) {
            _hashCode += getRegionId().hashCode();
        }
        if (getDefaultOlip() != null) {
            _hashCode += getDefaultOlip().hashCode();
        }
        if (getSignalingProfileId() != null) {
            _hashCode += getSignalingProfileId().hashCode();
        }
        if (getZzProfileId() != null) {
            _hashCode += getZzProfileId().hashCode();
        }
        if (getPrfdPacketServiceProfileId() != null) {
            _hashCode += getPrfdPacketServiceProfileId().hashCode();
        }
        if (getOwnCarrierId() != null) {
            _hashCode += getOwnCarrierId().hashCode();
        }
        if (getPoiLevel() != null) {
            _hashCode += getPoiLevel().hashCode();
        }
        if (getPoiChargeArea() != null) {
            _hashCode += getPoiChargeArea().hashCode();
        }
        if (getOriginatingCarrier() != null) {
            _hashCode += getOriginatingCarrier().hashCode();
        }
        if (getTrunkgroupDomainId() != null) {
            _hashCode += getTrunkgroupDomainId().hashCode();
        }
        if (getBillingPlanId() != null) {
            _hashCode += getBillingPlanId().hashCode();
        }
        if (getSipDomainId() != null) {
            _hashCode += getSipDomainId().hashCode();
        }
        if (getBillingId() != null) {
            _hashCode += getBillingId().hashCode();
        }
        if (getCallingPartyNoa() != null) {
            _hashCode += getCallingPartyNoa().hashCode();
        }
        if (getCallingPartyNpi() != null) {
            _hashCode += getCallingPartyNpi().hashCode();
        }
        if (getBillingNoa() != null) {
            _hashCode += getBillingNoa().hashCode();
        }
        if (getBillingNpi() != null) {
            _hashCode += getBillingNpi().hashCode();
        }
        if (getTgCos() != null) {
            _hashCode += getTgCos().hashCode();
        }
        if (getTgCosProfileId() != null) {
            _hashCode += getTgCosProfileId().hashCode();
        }
        if (getDialPlanProfileId() != null) {
            _hashCode += getDialPlanProfileId().hashCode();
        }
        if (getDigitLenEnfProfileId() != null) {
            _hashCode += getDigitLenEnfProfileId().hashCode();
        }
        if (getNpiId() != null) {
            _hashCode += getNpiId().hashCode();
        }
        if (getBusinessGroupId() != null) {
            _hashCode += getBusinessGroupId().hashCode();
        }
        if (getElementAttributes() != null) {
            _hashCode += getElementAttributes().hashCode();
        }
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getCarrierSelectionPriorityId() != null) {
            _hashCode += getCarrierSelectionPriorityId().hashCode();
        }
        if (getPseudoCarrierId() != null) {
            _hashCode += getPseudoCarrierId().hashCode();
        }
        if (getFeatureControlProfileId() != null) {
            _hashCode += getFeatureControlProfileId().hashCode();
        }
        if (getTrunkgroupId2() != null) {
            _hashCode += getTrunkgroupId2().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTdmTrunkType() != null) {
            _hashCode += getTdmTrunkType().hashCode();
        }
        if (getScpBusinessServiceGroup() != null) {
            _hashCode += getScpBusinessServiceGroup().hashCode();
        }
        if (getChargeIndicator() != null) {
            _hashCode += getChargeIndicator().hashCode();
        }
        if (getErpProfileId() != null) {
            _hashCode += getErpProfileId().hashCode();
        }
        if (getRcProfileId() != null) {
            _hashCode += getRcProfileId().hashCode();
        }
        if (getCpnPresentation() != null) {
            _hashCode += getCpnPresentation().hashCode();
        }
        if (getCpnScreening() != null) {
            _hashCode += getCpnScreening().hashCode();
        }
        if (getDfltCpnPresentation() != null) {
            _hashCode += getDfltCpnPresentation().hashCode();
        }
        if (getLocalizationType() != null) {
            _hashCode += getLocalizationType().hashCode();
        }
        if (getExceptionProfileId() != null) {
            _hashCode += getExceptionProfileId().hashCode();
        }
        if (getPrefixProfileId() != null) {
            _hashCode += getPrefixProfileId().hashCode();
        }
        if (getBusinessLocationId() != null) {
            _hashCode += getBusinessLocationId().hashCode();
        }
        if (getBillingInfoId() != null) {
            _hashCode += getBillingInfoId().hashCode();
        }
        if (getEgressChargeInd() != null) {
            _hashCode += getEgressChargeInd().hashCode();
        }
        if (getIsEscaped() != null) {
            _hashCode += getIsEscaped().hashCode();
        }
        if (getDefaultCpc() != null) {
            _hashCode += getDefaultCpc().hashCode();
        }
        if (getNumberAnalysisProfileId() != null) {
            _hashCode += getNumberAnalysisProfileId().hashCode();
        }
        if (getPprProfileId() != null) {
            _hashCode += getPprProfileId().hashCode();
        }
        if (getMaximumSatelliteHops() != null) {
            _hashCode += getMaximumSatelliteHops().hashCode();
        }
        if (getTrafficTrunkResvLevel1() != null) {
            _hashCode += getTrafficTrunkResvLevel1().hashCode();
        }
        if (getTrafficTrunkResvLevel2() != null) {
            _hashCode += getTrafficTrunkResvLevel2().hashCode();
        }
        if (getCallingArea() != null) {
            _hashCode += getCallingArea().hashCode();
        }
        if (getLocalRingBackToneId() != null) {
            _hashCode += getLocalRingBackToneId().hashCode();
        }
        if (getIpSignalingPeerGroupId() != null) {
            _hashCode += getIpSignalingPeerGroupId().hashCode();
        }
        if (getIpSignalingProfileId() != null) {
            _hashCode += getIpSignalingProfileId().hashCode();
        }
        if (getIptgPacketServiceProfileId() != null) {
            _hashCode += getIptgPacketServiceProfileId().hashCode();
        }
        if (getIptgIpSignalingProfileId() != null) {
            _hashCode += getIptgIpSignalingProfileId().hashCode();
        }
        if (getOwningCarrierProfileId() != null) {
            _hashCode += getOwningCarrierProfileId().hashCode();
        }
        if (getCarrierTypeProfileId() != null) {
            _hashCode += getCarrierTypeProfileId().hashCode();
        }
        if (getDeviceProfileId() != null) {
            _hashCode += getDeviceProfileId().hashCode();
        }
        if (getChargeInformationId() != null) {
            _hashCode += getChargeInformationId().hashCode();
        }
        if (getNetworkdataPartition() != null) {
            _hashCode += getNetworkdataPartition().hashCode();
        }
        if (getNetworkdataNet() != null) {
            _hashCode += getNetworkdataNet().hashCode();
        }
        if (getDdiRangeProfileId() != null) {
            _hashCode += getDdiRangeProfileId().hashCode();
        }
        if (getForcedOlip() != null) {
            _hashCode += getForcedOlip().hashCode();
        }
        if (getBNumberPrefix() != null) {
            _hashCode += getBNumberPrefix().hashCode();
        }
        if (getAutoRecallProfileId() != null) {
            _hashCode += getAutoRecallProfileId().hashCode();
        }
        if (getCarrierCodeConvrId() != null) {
            _hashCode += getCarrierCodeConvrId().hashCode();
        }
        if (getNextHopDomainId() != null) {
            _hashCode += getNextHopDomainId().hashCode();
        }
        if (getInfoTransCapProfileId() != null) {
            _hashCode += getInfoTransCapProfileId().hashCode();
        }
        if (getZoneIndexProfileId() != null) {
            _hashCode += getZoneIndexProfileId().hashCode();
        }
        if (getAddressContext() != null) {
            _hashCode += getAddressContext().hashCode();
        }
        if (getChargeBandProfileId() != null) {
            _hashCode += getChargeBandProfileId().hashCode();
        }
        if (getTrunkgroupVersionPreference() != null) {
            _hashCode += getTrunkgroupVersionPreference().hashCode();
        }
        if (getOrigNetworkId() != null) {
            _hashCode += getOrigNetworkId().hashCode();
        }
        if (getSipRcProfileId() != null) {
            _hashCode += getSipRcProfileId().hashCode();
        }
        if (getSipLrProfileId() != null) {
            _hashCode += getSipLrProfileId().hashCode();
        }
        if (getEnumDomainProfileId() != null) {
            _hashCode += getEnumDomainProfileId().hashCode();
        }
        if (getRemoteSipPeerType() != null) {
            _hashCode += getRemoteSipPeerType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Trunkgroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Trunkgroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overrideCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "npaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jipId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jipId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationSwitchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationSwitchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseToneTreatment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseToneTreatment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unrestrictedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unrestrictedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signalingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inPmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inPmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outPmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outPmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberingPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lataId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lataId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOlip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultOlip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signalingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zzProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zzProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prfdPacketServiceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prfdPacketServiceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poiLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poiLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poiChargeArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poiChargeArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originatingCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupDomainId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupDomainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDomainId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDomainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingPartyNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingPartyNoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingPartyNpi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingPartyNpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingNoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingNpi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingNpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tgCos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tgCos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tgCosProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tgCosProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dialPlanProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dialPlanProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitLenEnfProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digitLenEnfProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npiId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "npiId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elementAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classOfServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classOfServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierSelectionPriorityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierSelectionPriorityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pseudoCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pseudoCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "featureControlProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupId2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupId2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tdmTrunkType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tdmTrunkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpBusinessServiceGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpBusinessServiceGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erpProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erpProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rcProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpnPresentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpnPresentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpnScreening");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpnScreening"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfltCpnPresentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dfltCpnPresentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egressChargeInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "egressChargeInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEscaped");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isEscaped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberAnalysisProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberAnalysisProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pprProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pprProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumSatelliteHops");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximumSatelliteHops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficTrunkResvLevel1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficTrunkResvLevel1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficTrunkResvLevel2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficTrunkResvLevel2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localRingBackToneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localRingBackToneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSignalingPeerGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSignalingPeerGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSignalingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSignalingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iptgPacketServiceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iptgPacketServiceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iptgIpSignalingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iptgIpSignalingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owningCarrierProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owningCarrierProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierTypeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierTypeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeInformationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeInformationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkdataPartition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkdataPartition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkdataNet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkdataNet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddiRangeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ddiRangeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forcedOlip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forcedOlip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BNumberPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bNumberPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRecallProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoRecallProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCodeConvrId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCodeConvrId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextHopDomainId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextHopDomainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoTransCapProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infoTransCapProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneIndexProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zoneIndexProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeBandProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeBandProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupVersionPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupVersionPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origNetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origNetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipRcProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipRcProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipLrProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipLrProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumDomainProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumDomainProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteSipPeerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteSipPeerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
