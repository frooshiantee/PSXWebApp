/**
 * PmCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class PmCriteria  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String pmCriteriaId;

    private java.lang.Short parameterType;

    private java.lang.Short ruleType;

    private java.lang.Short startDigitPosition;

    private java.lang.Short numberOfDigits;

    private java.lang.String matchValue;

    private java.lang.Integer checkType;

    private java.lang.Short natureOfAddress;

    private java.lang.Short numberingPlanIndicator;

    private java.lang.Short numberLength;

    private java.lang.Short presentation;

    private java.lang.Short screening;

    private java.lang.Short callingPartyCategory;

    private java.lang.Short originatingLineInfo;

    private java.lang.Integer forwardCallIndicator;

    private java.lang.Integer nocSatellite;

    private java.lang.Integer nocCheck;

    private java.lang.Integer nocEchoSuppression;

    private java.lang.Short bgPartySelector;

    private java.lang.Integer bgId;

    private java.lang.Integer bgSubgroupId;

    private java.lang.Integer bgFlags;

    private java.lang.Integer bgElementAttributes;

    private java.lang.Integer carrierSelection;

    private java.lang.Integer carrierCodeNetworkIdPlan;

    private java.lang.Integer carrierCodeNetworkIdType;

    private java.lang.Integer carrierCircuitCode;

    private java.lang.String carrierId;

    private java.lang.Short carrierCodePresubIndicator;

    private java.lang.String jurisdictionSwitchId;

    private java.lang.String zzCode;

    private java.lang.Integer additionalCategoryName;

    private java.lang.Integer additionalCategoryCat;

    private java.lang.Short poiLevel;

    private java.lang.String poiChgString;

    private java.lang.String originatingCarrier;

    private java.lang.Short callingNamePresentation;

    private java.lang.Short callingNameTypeOfName;

    private java.lang.String callingNameGenericString;

    private java.lang.Short callingNameAvailability;

    private java.lang.Short bgLinePrivileges;

    private java.lang.Short forwardCallIndIsupPref;

    private java.lang.Short parameterPresenceCheck;

    private java.lang.String uriDomain;

    private java.lang.Integer matchNumber;

    private java.lang.Short includeInEgress;

    private java.lang.Short globalNumberFlag;

    private java.lang.Short cliBlockingIndicator;

    private java.lang.Short dpcInfoInd;

    private java.lang.Short prefixTypeId;

    private java.lang.Integer pmCriteriaAttributes1;

    private java.lang.String dmpmCriteriaValue1;

    private java.lang.String dmpmCriteriaValue2;

    private java.lang.String dmpmCriteriaValue3;

    public PmCriteria() {
    }

    public PmCriteria(
           java.lang.String pmCriteriaId,
           java.lang.Short parameterType,
           java.lang.Short ruleType,
           java.lang.Short startDigitPosition,
           java.lang.Short numberOfDigits,
           java.lang.String matchValue,
           java.lang.Integer checkType,
           java.lang.Short natureOfAddress,
           java.lang.Short numberingPlanIndicator,
           java.lang.Short numberLength,
           java.lang.Short presentation,
           java.lang.Short screening,
           java.lang.Short callingPartyCategory,
           java.lang.Short originatingLineInfo,
           java.lang.Integer forwardCallIndicator,
           java.lang.Integer nocSatellite,
           java.lang.Integer nocCheck,
           java.lang.Integer nocEchoSuppression,
           java.lang.Short bgPartySelector,
           java.lang.Integer bgId,
           java.lang.Integer bgSubgroupId,
           java.lang.Integer bgFlags,
           java.lang.Integer bgElementAttributes,
           java.lang.Integer carrierSelection,
           java.lang.Integer carrierCodeNetworkIdPlan,
           java.lang.Integer carrierCodeNetworkIdType,
           java.lang.Integer carrierCircuitCode,
           java.lang.String carrierId,
           java.lang.Short carrierCodePresubIndicator,
           java.lang.String jurisdictionSwitchId,
           java.lang.String zzCode,
           java.lang.Integer additionalCategoryName,
           java.lang.Integer additionalCategoryCat,
           java.lang.Short poiLevel,
           java.lang.String poiChgString,
           java.lang.String originatingCarrier,
           java.lang.Short callingNamePresentation,
           java.lang.Short callingNameTypeOfName,
           java.lang.String callingNameGenericString,
           java.lang.Short callingNameAvailability,
           java.lang.Short bgLinePrivileges,
           java.lang.Short forwardCallIndIsupPref,
           java.lang.Short parameterPresenceCheck,
           java.lang.String uriDomain,
           java.lang.Integer matchNumber,
           java.lang.Short includeInEgress,
           java.lang.Short globalNumberFlag,
           java.lang.Short cliBlockingIndicator,
           java.lang.Short dpcInfoInd,
           java.lang.Short prefixTypeId,
           java.lang.Integer pmCriteriaAttributes1,
           java.lang.String dmpmCriteriaValue1,
           java.lang.String dmpmCriteriaValue2,
           java.lang.String dmpmCriteriaValue3) {
        this.pmCriteriaId = pmCriteriaId;
        this.parameterType = parameterType;
        this.ruleType = ruleType;
        this.startDigitPosition = startDigitPosition;
        this.numberOfDigits = numberOfDigits;
        this.matchValue = matchValue;
        this.checkType = checkType;
        this.natureOfAddress = natureOfAddress;
        this.numberingPlanIndicator = numberingPlanIndicator;
        this.numberLength = numberLength;
        this.presentation = presentation;
        this.screening = screening;
        this.callingPartyCategory = callingPartyCategory;
        this.originatingLineInfo = originatingLineInfo;
        this.forwardCallIndicator = forwardCallIndicator;
        this.nocSatellite = nocSatellite;
        this.nocCheck = nocCheck;
        this.nocEchoSuppression = nocEchoSuppression;
        this.bgPartySelector = bgPartySelector;
        this.bgId = bgId;
        this.bgSubgroupId = bgSubgroupId;
        this.bgFlags = bgFlags;
        this.bgElementAttributes = bgElementAttributes;
        this.carrierSelection = carrierSelection;
        this.carrierCodeNetworkIdPlan = carrierCodeNetworkIdPlan;
        this.carrierCodeNetworkIdType = carrierCodeNetworkIdType;
        this.carrierCircuitCode = carrierCircuitCode;
        this.carrierId = carrierId;
        this.carrierCodePresubIndicator = carrierCodePresubIndicator;
        this.jurisdictionSwitchId = jurisdictionSwitchId;
        this.zzCode = zzCode;
        this.additionalCategoryName = additionalCategoryName;
        this.additionalCategoryCat = additionalCategoryCat;
        this.poiLevel = poiLevel;
        this.poiChgString = poiChgString;
        this.originatingCarrier = originatingCarrier;
        this.callingNamePresentation = callingNamePresentation;
        this.callingNameTypeOfName = callingNameTypeOfName;
        this.callingNameGenericString = callingNameGenericString;
        this.callingNameAvailability = callingNameAvailability;
        this.bgLinePrivileges = bgLinePrivileges;
        this.forwardCallIndIsupPref = forwardCallIndIsupPref;
        this.parameterPresenceCheck = parameterPresenceCheck;
        this.uriDomain = uriDomain;
        this.matchNumber = matchNumber;
        this.includeInEgress = includeInEgress;
        this.globalNumberFlag = globalNumberFlag;
        this.cliBlockingIndicator = cliBlockingIndicator;
        this.dpcInfoInd = dpcInfoInd;
        this.prefixTypeId = prefixTypeId;
        this.pmCriteriaAttributes1 = pmCriteriaAttributes1;
        this.dmpmCriteriaValue1 = dmpmCriteriaValue1;
        this.dmpmCriteriaValue2 = dmpmCriteriaValue2;
        this.dmpmCriteriaValue3 = dmpmCriteriaValue3;
    }


    /**
     * Gets the pmCriteriaId value for this PmCriteria.
     * 
     * @return pmCriteriaId
     */
    public java.lang.String getPmCriteriaId() {
        return pmCriteriaId;
    }


    /**
     * Sets the pmCriteriaId value for this PmCriteria.
     * 
     * @param pmCriteriaId
     */
    public void setPmCriteriaId(java.lang.String pmCriteriaId) {
        this.pmCriteriaId = pmCriteriaId;
    }


    /**
     * Gets the parameterType value for this PmCriteria.
     * 
     * @return parameterType
     */
    public java.lang.Short getParameterType() {
        return parameterType;
    }


    /**
     * Sets the parameterType value for this PmCriteria.
     * 
     * @param parameterType
     */
    public void setParameterType(java.lang.Short parameterType) {
        this.parameterType = parameterType;
    }


    /**
     * Gets the ruleType value for this PmCriteria.
     * 
     * @return ruleType
     */
    public java.lang.Short getRuleType() {
        return ruleType;
    }


    /**
     * Sets the ruleType value for this PmCriteria.
     * 
     * @param ruleType
     */
    public void setRuleType(java.lang.Short ruleType) {
        this.ruleType = ruleType;
    }


    /**
     * Gets the startDigitPosition value for this PmCriteria.
     * 
     * @return startDigitPosition
     */
    public java.lang.Short getStartDigitPosition() {
        return startDigitPosition;
    }


    /**
     * Sets the startDigitPosition value for this PmCriteria.
     * 
     * @param startDigitPosition
     */
    public void setStartDigitPosition(java.lang.Short startDigitPosition) {
        this.startDigitPosition = startDigitPosition;
    }


    /**
     * Gets the numberOfDigits value for this PmCriteria.
     * 
     * @return numberOfDigits
     */
    public java.lang.Short getNumberOfDigits() {
        return numberOfDigits;
    }


    /**
     * Sets the numberOfDigits value for this PmCriteria.
     * 
     * @param numberOfDigits
     */
    public void setNumberOfDigits(java.lang.Short numberOfDigits) {
        this.numberOfDigits = numberOfDigits;
    }


    /**
     * Gets the matchValue value for this PmCriteria.
     * 
     * @return matchValue
     */
    public java.lang.String getMatchValue() {
        return matchValue;
    }


    /**
     * Sets the matchValue value for this PmCriteria.
     * 
     * @param matchValue
     */
    public void setMatchValue(java.lang.String matchValue) {
        this.matchValue = matchValue;
    }


    /**
     * Gets the checkType value for this PmCriteria.
     * 
     * @return checkType
     */
    public java.lang.Integer getCheckType() {
        return checkType;
    }


    /**
     * Sets the checkType value for this PmCriteria.
     * 
     * @param checkType
     */
    public void setCheckType(java.lang.Integer checkType) {
        this.checkType = checkType;
    }


    /**
     * Gets the natureOfAddress value for this PmCriteria.
     * 
     * @return natureOfAddress
     */
    public java.lang.Short getNatureOfAddress() {
        return natureOfAddress;
    }


    /**
     * Sets the natureOfAddress value for this PmCriteria.
     * 
     * @param natureOfAddress
     */
    public void setNatureOfAddress(java.lang.Short natureOfAddress) {
        this.natureOfAddress = natureOfAddress;
    }


    /**
     * Gets the numberingPlanIndicator value for this PmCriteria.
     * 
     * @return numberingPlanIndicator
     */
    public java.lang.Short getNumberingPlanIndicator() {
        return numberingPlanIndicator;
    }


    /**
     * Sets the numberingPlanIndicator value for this PmCriteria.
     * 
     * @param numberingPlanIndicator
     */
    public void setNumberingPlanIndicator(java.lang.Short numberingPlanIndicator) {
        this.numberingPlanIndicator = numberingPlanIndicator;
    }


    /**
     * Gets the numberLength value for this PmCriteria.
     * 
     * @return numberLength
     */
    public java.lang.Short getNumberLength() {
        return numberLength;
    }


    /**
     * Sets the numberLength value for this PmCriteria.
     * 
     * @param numberLength
     */
    public void setNumberLength(java.lang.Short numberLength) {
        this.numberLength = numberLength;
    }


    /**
     * Gets the presentation value for this PmCriteria.
     * 
     * @return presentation
     */
    public java.lang.Short getPresentation() {
        return presentation;
    }


    /**
     * Sets the presentation value for this PmCriteria.
     * 
     * @param presentation
     */
    public void setPresentation(java.lang.Short presentation) {
        this.presentation = presentation;
    }


    /**
     * Gets the screening value for this PmCriteria.
     * 
     * @return screening
     */
    public java.lang.Short getScreening() {
        return screening;
    }


    /**
     * Sets the screening value for this PmCriteria.
     * 
     * @param screening
     */
    public void setScreening(java.lang.Short screening) {
        this.screening = screening;
    }


    /**
     * Gets the callingPartyCategory value for this PmCriteria.
     * 
     * @return callingPartyCategory
     */
    public java.lang.Short getCallingPartyCategory() {
        return callingPartyCategory;
    }


    /**
     * Sets the callingPartyCategory value for this PmCriteria.
     * 
     * @param callingPartyCategory
     */
    public void setCallingPartyCategory(java.lang.Short callingPartyCategory) {
        this.callingPartyCategory = callingPartyCategory;
    }


    /**
     * Gets the originatingLineInfo value for this PmCriteria.
     * 
     * @return originatingLineInfo
     */
    public java.lang.Short getOriginatingLineInfo() {
        return originatingLineInfo;
    }


    /**
     * Sets the originatingLineInfo value for this PmCriteria.
     * 
     * @param originatingLineInfo
     */
    public void setOriginatingLineInfo(java.lang.Short originatingLineInfo) {
        this.originatingLineInfo = originatingLineInfo;
    }


    /**
     * Gets the forwardCallIndicator value for this PmCriteria.
     * 
     * @return forwardCallIndicator
     */
    public java.lang.Integer getForwardCallIndicator() {
        return forwardCallIndicator;
    }


    /**
     * Sets the forwardCallIndicator value for this PmCriteria.
     * 
     * @param forwardCallIndicator
     */
    public void setForwardCallIndicator(java.lang.Integer forwardCallIndicator) {
        this.forwardCallIndicator = forwardCallIndicator;
    }


    /**
     * Gets the nocSatellite value for this PmCriteria.
     * 
     * @return nocSatellite
     */
    public java.lang.Integer getNocSatellite() {
        return nocSatellite;
    }


    /**
     * Sets the nocSatellite value for this PmCriteria.
     * 
     * @param nocSatellite
     */
    public void setNocSatellite(java.lang.Integer nocSatellite) {
        this.nocSatellite = nocSatellite;
    }


    /**
     * Gets the nocCheck value for this PmCriteria.
     * 
     * @return nocCheck
     */
    public java.lang.Integer getNocCheck() {
        return nocCheck;
    }


    /**
     * Sets the nocCheck value for this PmCriteria.
     * 
     * @param nocCheck
     */
    public void setNocCheck(java.lang.Integer nocCheck) {
        this.nocCheck = nocCheck;
    }


    /**
     * Gets the nocEchoSuppression value for this PmCriteria.
     * 
     * @return nocEchoSuppression
     */
    public java.lang.Integer getNocEchoSuppression() {
        return nocEchoSuppression;
    }


    /**
     * Sets the nocEchoSuppression value for this PmCriteria.
     * 
     * @param nocEchoSuppression
     */
    public void setNocEchoSuppression(java.lang.Integer nocEchoSuppression) {
        this.nocEchoSuppression = nocEchoSuppression;
    }


    /**
     * Gets the bgPartySelector value for this PmCriteria.
     * 
     * @return bgPartySelector
     */
    public java.lang.Short getBgPartySelector() {
        return bgPartySelector;
    }


    /**
     * Sets the bgPartySelector value for this PmCriteria.
     * 
     * @param bgPartySelector
     */
    public void setBgPartySelector(java.lang.Short bgPartySelector) {
        this.bgPartySelector = bgPartySelector;
    }


    /**
     * Gets the bgId value for this PmCriteria.
     * 
     * @return bgId
     */
    public java.lang.Integer getBgId() {
        return bgId;
    }


    /**
     * Sets the bgId value for this PmCriteria.
     * 
     * @param bgId
     */
    public void setBgId(java.lang.Integer bgId) {
        this.bgId = bgId;
    }


    /**
     * Gets the bgSubgroupId value for this PmCriteria.
     * 
     * @return bgSubgroupId
     */
    public java.lang.Integer getBgSubgroupId() {
        return bgSubgroupId;
    }


    /**
     * Sets the bgSubgroupId value for this PmCriteria.
     * 
     * @param bgSubgroupId
     */
    public void setBgSubgroupId(java.lang.Integer bgSubgroupId) {
        this.bgSubgroupId = bgSubgroupId;
    }


    /**
     * Gets the bgFlags value for this PmCriteria.
     * 
     * @return bgFlags
     */
    public java.lang.Integer getBgFlags() {
        return bgFlags;
    }


    /**
     * Sets the bgFlags value for this PmCriteria.
     * 
     * @param bgFlags
     */
    public void setBgFlags(java.lang.Integer bgFlags) {
        this.bgFlags = bgFlags;
    }


    /**
     * Gets the bgElementAttributes value for this PmCriteria.
     * 
     * @return bgElementAttributes
     */
    public java.lang.Integer getBgElementAttributes() {
        return bgElementAttributes;
    }


    /**
     * Sets the bgElementAttributes value for this PmCriteria.
     * 
     * @param bgElementAttributes
     */
    public void setBgElementAttributes(java.lang.Integer bgElementAttributes) {
        this.bgElementAttributes = bgElementAttributes;
    }


    /**
     * Gets the carrierSelection value for this PmCriteria.
     * 
     * @return carrierSelection
     */
    public java.lang.Integer getCarrierSelection() {
        return carrierSelection;
    }


    /**
     * Sets the carrierSelection value for this PmCriteria.
     * 
     * @param carrierSelection
     */
    public void setCarrierSelection(java.lang.Integer carrierSelection) {
        this.carrierSelection = carrierSelection;
    }


    /**
     * Gets the carrierCodeNetworkIdPlan value for this PmCriteria.
     * 
     * @return carrierCodeNetworkIdPlan
     */
    public java.lang.Integer getCarrierCodeNetworkIdPlan() {
        return carrierCodeNetworkIdPlan;
    }


    /**
     * Sets the carrierCodeNetworkIdPlan value for this PmCriteria.
     * 
     * @param carrierCodeNetworkIdPlan
     */
    public void setCarrierCodeNetworkIdPlan(java.lang.Integer carrierCodeNetworkIdPlan) {
        this.carrierCodeNetworkIdPlan = carrierCodeNetworkIdPlan;
    }


    /**
     * Gets the carrierCodeNetworkIdType value for this PmCriteria.
     * 
     * @return carrierCodeNetworkIdType
     */
    public java.lang.Integer getCarrierCodeNetworkIdType() {
        return carrierCodeNetworkIdType;
    }


    /**
     * Sets the carrierCodeNetworkIdType value for this PmCriteria.
     * 
     * @param carrierCodeNetworkIdType
     */
    public void setCarrierCodeNetworkIdType(java.lang.Integer carrierCodeNetworkIdType) {
        this.carrierCodeNetworkIdType = carrierCodeNetworkIdType;
    }


    /**
     * Gets the carrierCircuitCode value for this PmCriteria.
     * 
     * @return carrierCircuitCode
     */
    public java.lang.Integer getCarrierCircuitCode() {
        return carrierCircuitCode;
    }


    /**
     * Sets the carrierCircuitCode value for this PmCriteria.
     * 
     * @param carrierCircuitCode
     */
    public void setCarrierCircuitCode(java.lang.Integer carrierCircuitCode) {
        this.carrierCircuitCode = carrierCircuitCode;
    }


    /**
     * Gets the carrierId value for this PmCriteria.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this PmCriteria.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the carrierCodePresubIndicator value for this PmCriteria.
     * 
     * @return carrierCodePresubIndicator
     */
    public java.lang.Short getCarrierCodePresubIndicator() {
        return carrierCodePresubIndicator;
    }


    /**
     * Sets the carrierCodePresubIndicator value for this PmCriteria.
     * 
     * @param carrierCodePresubIndicator
     */
    public void setCarrierCodePresubIndicator(java.lang.Short carrierCodePresubIndicator) {
        this.carrierCodePresubIndicator = carrierCodePresubIndicator;
    }


    /**
     * Gets the jurisdictionSwitchId value for this PmCriteria.
     * 
     * @return jurisdictionSwitchId
     */
    public java.lang.String getJurisdictionSwitchId() {
        return jurisdictionSwitchId;
    }


    /**
     * Sets the jurisdictionSwitchId value for this PmCriteria.
     * 
     * @param jurisdictionSwitchId
     */
    public void setJurisdictionSwitchId(java.lang.String jurisdictionSwitchId) {
        this.jurisdictionSwitchId = jurisdictionSwitchId;
    }


    /**
     * Gets the zzCode value for this PmCriteria.
     * 
     * @return zzCode
     */
    public java.lang.String getZzCode() {
        return zzCode;
    }


    /**
     * Sets the zzCode value for this PmCriteria.
     * 
     * @param zzCode
     */
    public void setZzCode(java.lang.String zzCode) {
        this.zzCode = zzCode;
    }


    /**
     * Gets the additionalCategoryName value for this PmCriteria.
     * 
     * @return additionalCategoryName
     */
    public java.lang.Integer getAdditionalCategoryName() {
        return additionalCategoryName;
    }


    /**
     * Sets the additionalCategoryName value for this PmCriteria.
     * 
     * @param additionalCategoryName
     */
    public void setAdditionalCategoryName(java.lang.Integer additionalCategoryName) {
        this.additionalCategoryName = additionalCategoryName;
    }


    /**
     * Gets the additionalCategoryCat value for this PmCriteria.
     * 
     * @return additionalCategoryCat
     */
    public java.lang.Integer getAdditionalCategoryCat() {
        return additionalCategoryCat;
    }


    /**
     * Sets the additionalCategoryCat value for this PmCriteria.
     * 
     * @param additionalCategoryCat
     */
    public void setAdditionalCategoryCat(java.lang.Integer additionalCategoryCat) {
        this.additionalCategoryCat = additionalCategoryCat;
    }


    /**
     * Gets the poiLevel value for this PmCriteria.
     * 
     * @return poiLevel
     */
    public java.lang.Short getPoiLevel() {
        return poiLevel;
    }


    /**
     * Sets the poiLevel value for this PmCriteria.
     * 
     * @param poiLevel
     */
    public void setPoiLevel(java.lang.Short poiLevel) {
        this.poiLevel = poiLevel;
    }


    /**
     * Gets the poiChgString value for this PmCriteria.
     * 
     * @return poiChgString
     */
    public java.lang.String getPoiChgString() {
        return poiChgString;
    }


    /**
     * Sets the poiChgString value for this PmCriteria.
     * 
     * @param poiChgString
     */
    public void setPoiChgString(java.lang.String poiChgString) {
        this.poiChgString = poiChgString;
    }


    /**
     * Gets the originatingCarrier value for this PmCriteria.
     * 
     * @return originatingCarrier
     */
    public java.lang.String getOriginatingCarrier() {
        return originatingCarrier;
    }


    /**
     * Sets the originatingCarrier value for this PmCriteria.
     * 
     * @param originatingCarrier
     */
    public void setOriginatingCarrier(java.lang.String originatingCarrier) {
        this.originatingCarrier = originatingCarrier;
    }


    /**
     * Gets the callingNamePresentation value for this PmCriteria.
     * 
     * @return callingNamePresentation
     */
    public java.lang.Short getCallingNamePresentation() {
        return callingNamePresentation;
    }


    /**
     * Sets the callingNamePresentation value for this PmCriteria.
     * 
     * @param callingNamePresentation
     */
    public void setCallingNamePresentation(java.lang.Short callingNamePresentation) {
        this.callingNamePresentation = callingNamePresentation;
    }


    /**
     * Gets the callingNameTypeOfName value for this PmCriteria.
     * 
     * @return callingNameTypeOfName
     */
    public java.lang.Short getCallingNameTypeOfName() {
        return callingNameTypeOfName;
    }


    /**
     * Sets the callingNameTypeOfName value for this PmCriteria.
     * 
     * @param callingNameTypeOfName
     */
    public void setCallingNameTypeOfName(java.lang.Short callingNameTypeOfName) {
        this.callingNameTypeOfName = callingNameTypeOfName;
    }


    /**
     * Gets the callingNameGenericString value for this PmCriteria.
     * 
     * @return callingNameGenericString
     */
    public java.lang.String getCallingNameGenericString() {
        return callingNameGenericString;
    }


    /**
     * Sets the callingNameGenericString value for this PmCriteria.
     * 
     * @param callingNameGenericString
     */
    public void setCallingNameGenericString(java.lang.String callingNameGenericString) {
        this.callingNameGenericString = callingNameGenericString;
    }


    /**
     * Gets the callingNameAvailability value for this PmCriteria.
     * 
     * @return callingNameAvailability
     */
    public java.lang.Short getCallingNameAvailability() {
        return callingNameAvailability;
    }


    /**
     * Sets the callingNameAvailability value for this PmCriteria.
     * 
     * @param callingNameAvailability
     */
    public void setCallingNameAvailability(java.lang.Short callingNameAvailability) {
        this.callingNameAvailability = callingNameAvailability;
    }


    /**
     * Gets the bgLinePrivileges value for this PmCriteria.
     * 
     * @return bgLinePrivileges
     */
    public java.lang.Short getBgLinePrivileges() {
        return bgLinePrivileges;
    }


    /**
     * Sets the bgLinePrivileges value for this PmCriteria.
     * 
     * @param bgLinePrivileges
     */
    public void setBgLinePrivileges(java.lang.Short bgLinePrivileges) {
        this.bgLinePrivileges = bgLinePrivileges;
    }


    /**
     * Gets the forwardCallIndIsupPref value for this PmCriteria.
     * 
     * @return forwardCallIndIsupPref
     */
    public java.lang.Short getForwardCallIndIsupPref() {
        return forwardCallIndIsupPref;
    }


    /**
     * Sets the forwardCallIndIsupPref value for this PmCriteria.
     * 
     * @param forwardCallIndIsupPref
     */
    public void setForwardCallIndIsupPref(java.lang.Short forwardCallIndIsupPref) {
        this.forwardCallIndIsupPref = forwardCallIndIsupPref;
    }


    /**
     * Gets the parameterPresenceCheck value for this PmCriteria.
     * 
     * @return parameterPresenceCheck
     */
    public java.lang.Short getParameterPresenceCheck() {
        return parameterPresenceCheck;
    }


    /**
     * Sets the parameterPresenceCheck value for this PmCriteria.
     * 
     * @param parameterPresenceCheck
     */
    public void setParameterPresenceCheck(java.lang.Short parameterPresenceCheck) {
        this.parameterPresenceCheck = parameterPresenceCheck;
    }


    /**
     * Gets the uriDomain value for this PmCriteria.
     * 
     * @return uriDomain
     */
    public java.lang.String getUriDomain() {
        return uriDomain;
    }


    /**
     * Sets the uriDomain value for this PmCriteria.
     * 
     * @param uriDomain
     */
    public void setUriDomain(java.lang.String uriDomain) {
        this.uriDomain = uriDomain;
    }


    /**
     * Gets the matchNumber value for this PmCriteria.
     * 
     * @return matchNumber
     */
    public java.lang.Integer getMatchNumber() {
        return matchNumber;
    }


    /**
     * Sets the matchNumber value for this PmCriteria.
     * 
     * @param matchNumber
     */
    public void setMatchNumber(java.lang.Integer matchNumber) {
        this.matchNumber = matchNumber;
    }


    /**
     * Gets the includeInEgress value for this PmCriteria.
     * 
     * @return includeInEgress
     */
    public java.lang.Short getIncludeInEgress() {
        return includeInEgress;
    }


    /**
     * Sets the includeInEgress value for this PmCriteria.
     * 
     * @param includeInEgress
     */
    public void setIncludeInEgress(java.lang.Short includeInEgress) {
        this.includeInEgress = includeInEgress;
    }


    /**
     * Gets the globalNumberFlag value for this PmCriteria.
     * 
     * @return globalNumberFlag
     */
    public java.lang.Short getGlobalNumberFlag() {
        return globalNumberFlag;
    }


    /**
     * Sets the globalNumberFlag value for this PmCriteria.
     * 
     * @param globalNumberFlag
     */
    public void setGlobalNumberFlag(java.lang.Short globalNumberFlag) {
        this.globalNumberFlag = globalNumberFlag;
    }


    /**
     * Gets the cliBlockingIndicator value for this PmCriteria.
     * 
     * @return cliBlockingIndicator
     */
    public java.lang.Short getCliBlockingIndicator() {
        return cliBlockingIndicator;
    }


    /**
     * Sets the cliBlockingIndicator value for this PmCriteria.
     * 
     * @param cliBlockingIndicator
     */
    public void setCliBlockingIndicator(java.lang.Short cliBlockingIndicator) {
        this.cliBlockingIndicator = cliBlockingIndicator;
    }


    /**
     * Gets the dpcInfoInd value for this PmCriteria.
     * 
     * @return dpcInfoInd
     */
    public java.lang.Short getDpcInfoInd() {
        return dpcInfoInd;
    }


    /**
     * Sets the dpcInfoInd value for this PmCriteria.
     * 
     * @param dpcInfoInd
     */
    public void setDpcInfoInd(java.lang.Short dpcInfoInd) {
        this.dpcInfoInd = dpcInfoInd;
    }


    /**
     * Gets the prefixTypeId value for this PmCriteria.
     * 
     * @return prefixTypeId
     */
    public java.lang.Short getPrefixTypeId() {
        return prefixTypeId;
    }


    /**
     * Sets the prefixTypeId value for this PmCriteria.
     * 
     * @param prefixTypeId
     */
    public void setPrefixTypeId(java.lang.Short prefixTypeId) {
        this.prefixTypeId = prefixTypeId;
    }


    /**
     * Gets the pmCriteriaAttributes1 value for this PmCriteria.
     * 
     * @return pmCriteriaAttributes1
     */
    public java.lang.Integer getPmCriteriaAttributes1() {
        return pmCriteriaAttributes1;
    }


    /**
     * Sets the pmCriteriaAttributes1 value for this PmCriteria.
     * 
     * @param pmCriteriaAttributes1
     */
    public void setPmCriteriaAttributes1(java.lang.Integer pmCriteriaAttributes1) {
        this.pmCriteriaAttributes1 = pmCriteriaAttributes1;
    }


    /**
     * Gets the dmpmCriteriaValue1 value for this PmCriteria.
     * 
     * @return dmpmCriteriaValue1
     */
    public java.lang.String getDmpmCriteriaValue1() {
        return dmpmCriteriaValue1;
    }


    /**
     * Sets the dmpmCriteriaValue1 value for this PmCriteria.
     * 
     * @param dmpmCriteriaValue1
     */
    public void setDmpmCriteriaValue1(java.lang.String dmpmCriteriaValue1) {
        this.dmpmCriteriaValue1 = dmpmCriteriaValue1;
    }


    /**
     * Gets the dmpmCriteriaValue2 value for this PmCriteria.
     * 
     * @return dmpmCriteriaValue2
     */
    public java.lang.String getDmpmCriteriaValue2() {
        return dmpmCriteriaValue2;
    }


    /**
     * Sets the dmpmCriteriaValue2 value for this PmCriteria.
     * 
     * @param dmpmCriteriaValue2
     */
    public void setDmpmCriteriaValue2(java.lang.String dmpmCriteriaValue2) {
        this.dmpmCriteriaValue2 = dmpmCriteriaValue2;
    }


    /**
     * Gets the dmpmCriteriaValue3 value for this PmCriteria.
     * 
     * @return dmpmCriteriaValue3
     */
    public java.lang.String getDmpmCriteriaValue3() {
        return dmpmCriteriaValue3;
    }


    /**
     * Sets the dmpmCriteriaValue3 value for this PmCriteria.
     * 
     * @param dmpmCriteriaValue3
     */
    public void setDmpmCriteriaValue3(java.lang.String dmpmCriteriaValue3) {
        this.dmpmCriteriaValue3 = dmpmCriteriaValue3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PmCriteria)) return false;
        PmCriteria other = (PmCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pmCriteriaId==null && other.getPmCriteriaId()==null) || 
             (this.pmCriteriaId!=null &&
              this.pmCriteriaId.equals(other.getPmCriteriaId()))) &&
            ((this.parameterType==null && other.getParameterType()==null) || 
             (this.parameterType!=null &&
              this.parameterType.equals(other.getParameterType()))) &&
            ((this.ruleType==null && other.getRuleType()==null) || 
             (this.ruleType!=null &&
              this.ruleType.equals(other.getRuleType()))) &&
            ((this.startDigitPosition==null && other.getStartDigitPosition()==null) || 
             (this.startDigitPosition!=null &&
              this.startDigitPosition.equals(other.getStartDigitPosition()))) &&
            ((this.numberOfDigits==null && other.getNumberOfDigits()==null) || 
             (this.numberOfDigits!=null &&
              this.numberOfDigits.equals(other.getNumberOfDigits()))) &&
            ((this.matchValue==null && other.getMatchValue()==null) || 
             (this.matchValue!=null &&
              this.matchValue.equals(other.getMatchValue()))) &&
            ((this.checkType==null && other.getCheckType()==null) || 
             (this.checkType!=null &&
              this.checkType.equals(other.getCheckType()))) &&
            ((this.natureOfAddress==null && other.getNatureOfAddress()==null) || 
             (this.natureOfAddress!=null &&
              this.natureOfAddress.equals(other.getNatureOfAddress()))) &&
            ((this.numberingPlanIndicator==null && other.getNumberingPlanIndicator()==null) || 
             (this.numberingPlanIndicator!=null &&
              this.numberingPlanIndicator.equals(other.getNumberingPlanIndicator()))) &&
            ((this.numberLength==null && other.getNumberLength()==null) || 
             (this.numberLength!=null &&
              this.numberLength.equals(other.getNumberLength()))) &&
            ((this.presentation==null && other.getPresentation()==null) || 
             (this.presentation!=null &&
              this.presentation.equals(other.getPresentation()))) &&
            ((this.screening==null && other.getScreening()==null) || 
             (this.screening!=null &&
              this.screening.equals(other.getScreening()))) &&
            ((this.callingPartyCategory==null && other.getCallingPartyCategory()==null) || 
             (this.callingPartyCategory!=null &&
              this.callingPartyCategory.equals(other.getCallingPartyCategory()))) &&
            ((this.originatingLineInfo==null && other.getOriginatingLineInfo()==null) || 
             (this.originatingLineInfo!=null &&
              this.originatingLineInfo.equals(other.getOriginatingLineInfo()))) &&
            ((this.forwardCallIndicator==null && other.getForwardCallIndicator()==null) || 
             (this.forwardCallIndicator!=null &&
              this.forwardCallIndicator.equals(other.getForwardCallIndicator()))) &&
            ((this.nocSatellite==null && other.getNocSatellite()==null) || 
             (this.nocSatellite!=null &&
              this.nocSatellite.equals(other.getNocSatellite()))) &&
            ((this.nocCheck==null && other.getNocCheck()==null) || 
             (this.nocCheck!=null &&
              this.nocCheck.equals(other.getNocCheck()))) &&
            ((this.nocEchoSuppression==null && other.getNocEchoSuppression()==null) || 
             (this.nocEchoSuppression!=null &&
              this.nocEchoSuppression.equals(other.getNocEchoSuppression()))) &&
            ((this.bgPartySelector==null && other.getBgPartySelector()==null) || 
             (this.bgPartySelector!=null &&
              this.bgPartySelector.equals(other.getBgPartySelector()))) &&
            ((this.bgId==null && other.getBgId()==null) || 
             (this.bgId!=null &&
              this.bgId.equals(other.getBgId()))) &&
            ((this.bgSubgroupId==null && other.getBgSubgroupId()==null) || 
             (this.bgSubgroupId!=null &&
              this.bgSubgroupId.equals(other.getBgSubgroupId()))) &&
            ((this.bgFlags==null && other.getBgFlags()==null) || 
             (this.bgFlags!=null &&
              this.bgFlags.equals(other.getBgFlags()))) &&
            ((this.bgElementAttributes==null && other.getBgElementAttributes()==null) || 
             (this.bgElementAttributes!=null &&
              this.bgElementAttributes.equals(other.getBgElementAttributes()))) &&
            ((this.carrierSelection==null && other.getCarrierSelection()==null) || 
             (this.carrierSelection!=null &&
              this.carrierSelection.equals(other.getCarrierSelection()))) &&
            ((this.carrierCodeNetworkIdPlan==null && other.getCarrierCodeNetworkIdPlan()==null) || 
             (this.carrierCodeNetworkIdPlan!=null &&
              this.carrierCodeNetworkIdPlan.equals(other.getCarrierCodeNetworkIdPlan()))) &&
            ((this.carrierCodeNetworkIdType==null && other.getCarrierCodeNetworkIdType()==null) || 
             (this.carrierCodeNetworkIdType!=null &&
              this.carrierCodeNetworkIdType.equals(other.getCarrierCodeNetworkIdType()))) &&
            ((this.carrierCircuitCode==null && other.getCarrierCircuitCode()==null) || 
             (this.carrierCircuitCode!=null &&
              this.carrierCircuitCode.equals(other.getCarrierCircuitCode()))) &&
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId()))) &&
            ((this.carrierCodePresubIndicator==null && other.getCarrierCodePresubIndicator()==null) || 
             (this.carrierCodePresubIndicator!=null &&
              this.carrierCodePresubIndicator.equals(other.getCarrierCodePresubIndicator()))) &&
            ((this.jurisdictionSwitchId==null && other.getJurisdictionSwitchId()==null) || 
             (this.jurisdictionSwitchId!=null &&
              this.jurisdictionSwitchId.equals(other.getJurisdictionSwitchId()))) &&
            ((this.zzCode==null && other.getZzCode()==null) || 
             (this.zzCode!=null &&
              this.zzCode.equals(other.getZzCode()))) &&
            ((this.additionalCategoryName==null && other.getAdditionalCategoryName()==null) || 
             (this.additionalCategoryName!=null &&
              this.additionalCategoryName.equals(other.getAdditionalCategoryName()))) &&
            ((this.additionalCategoryCat==null && other.getAdditionalCategoryCat()==null) || 
             (this.additionalCategoryCat!=null &&
              this.additionalCategoryCat.equals(other.getAdditionalCategoryCat()))) &&
            ((this.poiLevel==null && other.getPoiLevel()==null) || 
             (this.poiLevel!=null &&
              this.poiLevel.equals(other.getPoiLevel()))) &&
            ((this.poiChgString==null && other.getPoiChgString()==null) || 
             (this.poiChgString!=null &&
              this.poiChgString.equals(other.getPoiChgString()))) &&
            ((this.originatingCarrier==null && other.getOriginatingCarrier()==null) || 
             (this.originatingCarrier!=null &&
              this.originatingCarrier.equals(other.getOriginatingCarrier()))) &&
            ((this.callingNamePresentation==null && other.getCallingNamePresentation()==null) || 
             (this.callingNamePresentation!=null &&
              this.callingNamePresentation.equals(other.getCallingNamePresentation()))) &&
            ((this.callingNameTypeOfName==null && other.getCallingNameTypeOfName()==null) || 
             (this.callingNameTypeOfName!=null &&
              this.callingNameTypeOfName.equals(other.getCallingNameTypeOfName()))) &&
            ((this.callingNameGenericString==null && other.getCallingNameGenericString()==null) || 
             (this.callingNameGenericString!=null &&
              this.callingNameGenericString.equals(other.getCallingNameGenericString()))) &&
            ((this.callingNameAvailability==null && other.getCallingNameAvailability()==null) || 
             (this.callingNameAvailability!=null &&
              this.callingNameAvailability.equals(other.getCallingNameAvailability()))) &&
            ((this.bgLinePrivileges==null && other.getBgLinePrivileges()==null) || 
             (this.bgLinePrivileges!=null &&
              this.bgLinePrivileges.equals(other.getBgLinePrivileges()))) &&
            ((this.forwardCallIndIsupPref==null && other.getForwardCallIndIsupPref()==null) || 
             (this.forwardCallIndIsupPref!=null &&
              this.forwardCallIndIsupPref.equals(other.getForwardCallIndIsupPref()))) &&
            ((this.parameterPresenceCheck==null && other.getParameterPresenceCheck()==null) || 
             (this.parameterPresenceCheck!=null &&
              this.parameterPresenceCheck.equals(other.getParameterPresenceCheck()))) &&
            ((this.uriDomain==null && other.getUriDomain()==null) || 
             (this.uriDomain!=null &&
              this.uriDomain.equals(other.getUriDomain()))) &&
            ((this.matchNumber==null && other.getMatchNumber()==null) || 
             (this.matchNumber!=null &&
              this.matchNumber.equals(other.getMatchNumber()))) &&
            ((this.includeInEgress==null && other.getIncludeInEgress()==null) || 
             (this.includeInEgress!=null &&
              this.includeInEgress.equals(other.getIncludeInEgress()))) &&
            ((this.globalNumberFlag==null && other.getGlobalNumberFlag()==null) || 
             (this.globalNumberFlag!=null &&
              this.globalNumberFlag.equals(other.getGlobalNumberFlag()))) &&
            ((this.cliBlockingIndicator==null && other.getCliBlockingIndicator()==null) || 
             (this.cliBlockingIndicator!=null &&
              this.cliBlockingIndicator.equals(other.getCliBlockingIndicator()))) &&
            ((this.dpcInfoInd==null && other.getDpcInfoInd()==null) || 
             (this.dpcInfoInd!=null &&
              this.dpcInfoInd.equals(other.getDpcInfoInd()))) &&
            ((this.prefixTypeId==null && other.getPrefixTypeId()==null) || 
             (this.prefixTypeId!=null &&
              this.prefixTypeId.equals(other.getPrefixTypeId()))) &&
            ((this.pmCriteriaAttributes1==null && other.getPmCriteriaAttributes1()==null) || 
             (this.pmCriteriaAttributes1!=null &&
              this.pmCriteriaAttributes1.equals(other.getPmCriteriaAttributes1()))) &&
            ((this.dmpmCriteriaValue1==null && other.getDmpmCriteriaValue1()==null) || 
             (this.dmpmCriteriaValue1!=null &&
              this.dmpmCriteriaValue1.equals(other.getDmpmCriteriaValue1()))) &&
            ((this.dmpmCriteriaValue2==null && other.getDmpmCriteriaValue2()==null) || 
             (this.dmpmCriteriaValue2!=null &&
              this.dmpmCriteriaValue2.equals(other.getDmpmCriteriaValue2()))) &&
            ((this.dmpmCriteriaValue3==null && other.getDmpmCriteriaValue3()==null) || 
             (this.dmpmCriteriaValue3!=null &&
              this.dmpmCriteriaValue3.equals(other.getDmpmCriteriaValue3())));
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
        if (getPmCriteriaId() != null) {
            _hashCode += getPmCriteriaId().hashCode();
        }
        if (getParameterType() != null) {
            _hashCode += getParameterType().hashCode();
        }
        if (getRuleType() != null) {
            _hashCode += getRuleType().hashCode();
        }
        if (getStartDigitPosition() != null) {
            _hashCode += getStartDigitPosition().hashCode();
        }
        if (getNumberOfDigits() != null) {
            _hashCode += getNumberOfDigits().hashCode();
        }
        if (getMatchValue() != null) {
            _hashCode += getMatchValue().hashCode();
        }
        if (getCheckType() != null) {
            _hashCode += getCheckType().hashCode();
        }
        if (getNatureOfAddress() != null) {
            _hashCode += getNatureOfAddress().hashCode();
        }
        if (getNumberingPlanIndicator() != null) {
            _hashCode += getNumberingPlanIndicator().hashCode();
        }
        if (getNumberLength() != null) {
            _hashCode += getNumberLength().hashCode();
        }
        if (getPresentation() != null) {
            _hashCode += getPresentation().hashCode();
        }
        if (getScreening() != null) {
            _hashCode += getScreening().hashCode();
        }
        if (getCallingPartyCategory() != null) {
            _hashCode += getCallingPartyCategory().hashCode();
        }
        if (getOriginatingLineInfo() != null) {
            _hashCode += getOriginatingLineInfo().hashCode();
        }
        if (getForwardCallIndicator() != null) {
            _hashCode += getForwardCallIndicator().hashCode();
        }
        if (getNocSatellite() != null) {
            _hashCode += getNocSatellite().hashCode();
        }
        if (getNocCheck() != null) {
            _hashCode += getNocCheck().hashCode();
        }
        if (getNocEchoSuppression() != null) {
            _hashCode += getNocEchoSuppression().hashCode();
        }
        if (getBgPartySelector() != null) {
            _hashCode += getBgPartySelector().hashCode();
        }
        if (getBgId() != null) {
            _hashCode += getBgId().hashCode();
        }
        if (getBgSubgroupId() != null) {
            _hashCode += getBgSubgroupId().hashCode();
        }
        if (getBgFlags() != null) {
            _hashCode += getBgFlags().hashCode();
        }
        if (getBgElementAttributes() != null) {
            _hashCode += getBgElementAttributes().hashCode();
        }
        if (getCarrierSelection() != null) {
            _hashCode += getCarrierSelection().hashCode();
        }
        if (getCarrierCodeNetworkIdPlan() != null) {
            _hashCode += getCarrierCodeNetworkIdPlan().hashCode();
        }
        if (getCarrierCodeNetworkIdType() != null) {
            _hashCode += getCarrierCodeNetworkIdType().hashCode();
        }
        if (getCarrierCircuitCode() != null) {
            _hashCode += getCarrierCircuitCode().hashCode();
        }
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        if (getCarrierCodePresubIndicator() != null) {
            _hashCode += getCarrierCodePresubIndicator().hashCode();
        }
        if (getJurisdictionSwitchId() != null) {
            _hashCode += getJurisdictionSwitchId().hashCode();
        }
        if (getZzCode() != null) {
            _hashCode += getZzCode().hashCode();
        }
        if (getAdditionalCategoryName() != null) {
            _hashCode += getAdditionalCategoryName().hashCode();
        }
        if (getAdditionalCategoryCat() != null) {
            _hashCode += getAdditionalCategoryCat().hashCode();
        }
        if (getPoiLevel() != null) {
            _hashCode += getPoiLevel().hashCode();
        }
        if (getPoiChgString() != null) {
            _hashCode += getPoiChgString().hashCode();
        }
        if (getOriginatingCarrier() != null) {
            _hashCode += getOriginatingCarrier().hashCode();
        }
        if (getCallingNamePresentation() != null) {
            _hashCode += getCallingNamePresentation().hashCode();
        }
        if (getCallingNameTypeOfName() != null) {
            _hashCode += getCallingNameTypeOfName().hashCode();
        }
        if (getCallingNameGenericString() != null) {
            _hashCode += getCallingNameGenericString().hashCode();
        }
        if (getCallingNameAvailability() != null) {
            _hashCode += getCallingNameAvailability().hashCode();
        }
        if (getBgLinePrivileges() != null) {
            _hashCode += getBgLinePrivileges().hashCode();
        }
        if (getForwardCallIndIsupPref() != null) {
            _hashCode += getForwardCallIndIsupPref().hashCode();
        }
        if (getParameterPresenceCheck() != null) {
            _hashCode += getParameterPresenceCheck().hashCode();
        }
        if (getUriDomain() != null) {
            _hashCode += getUriDomain().hashCode();
        }
        if (getMatchNumber() != null) {
            _hashCode += getMatchNumber().hashCode();
        }
        if (getIncludeInEgress() != null) {
            _hashCode += getIncludeInEgress().hashCode();
        }
        if (getGlobalNumberFlag() != null) {
            _hashCode += getGlobalNumberFlag().hashCode();
        }
        if (getCliBlockingIndicator() != null) {
            _hashCode += getCliBlockingIndicator().hashCode();
        }
        if (getDpcInfoInd() != null) {
            _hashCode += getDpcInfoInd().hashCode();
        }
        if (getPrefixTypeId() != null) {
            _hashCode += getPrefixTypeId().hashCode();
        }
        if (getPmCriteriaAttributes1() != null) {
            _hashCode += getPmCriteriaAttributes1().hashCode();
        }
        if (getDmpmCriteriaValue1() != null) {
            _hashCode += getDmpmCriteriaValue1().hashCode();
        }
        if (getDmpmCriteriaValue2() != null) {
            _hashCode += getDmpmCriteriaValue2().hashCode();
        }
        if (getDmpmCriteriaValue3() != null) {
            _hashCode += getDmpmCriteriaValue3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PmCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmCriteriaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmCriteriaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDigitPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDigitPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natureOfAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natureOfAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberingPlanIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberingPlanIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screening");
        elemField.setXmlName(new javax.xml.namespace.QName("", "screening"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingPartyCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingPartyCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingLineInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originatingLineInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCallIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwardCallIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nocSatellite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nocSatellite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nocCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nocCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nocEchoSuppression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nocEchoSuppression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bgPartySelector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bgPartySelector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bgSubgroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bgSubgroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bgFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bgFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bgElementAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bgElementAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierSelection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCodeNetworkIdPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCodeNetworkIdPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCodeNetworkIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCodeNetworkIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCircuitCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCircuitCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCodePresubIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCodePresubIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdictionSwitchId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jurisdictionSwitchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zzCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zzCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalCategoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalCategoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalCategoryCat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalCategoryCat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poiLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poiLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poiChgString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poiChgString"));
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
        elemField.setFieldName("callingNamePresentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNamePresentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNameTypeOfName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNameTypeOfName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNameGenericString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNameGenericString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNameAvailability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNameAvailability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bgLinePrivileges");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bgLinePrivileges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCallIndIsupPref");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwardCallIndIsupPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterPresenceCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterPresenceCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uriDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uriDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeInEgress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeInEgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalNumberFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalNumberFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliBlockingIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cliBlockingIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpcInfoInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpcInfoInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmCriteriaAttributes1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmCriteriaAttributes1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmpmCriteriaValue1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dmpmCriteriaValue1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmpmCriteriaValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dmpmCriteriaValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmpmCriteriaValue3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dmpmCriteriaValue3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
