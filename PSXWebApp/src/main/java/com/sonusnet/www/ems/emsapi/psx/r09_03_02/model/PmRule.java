/**
 * PmRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class PmRule  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String pmRuleId;

    private java.lang.Short pmSubruleId;

    private java.lang.String pmCriteriaId;

    private java.lang.Integer parameterType;

    private java.lang.Short startDigitPosition;

    private java.lang.Short numberOfDigits;

    private java.lang.String constRepValue;

    private java.lang.Short varRepNumberType;

    private java.lang.Short varRepStartDigitPosition;

    private java.lang.Short varRepNumberOfDigits;

    private java.lang.Short replacementType;

    private java.lang.Short ruleType;

    private java.lang.Integer natureOfAddress;

    private java.lang.Integer numberingPlanIndicator;

    private java.lang.Integer numberLength;

    private java.lang.Integer presentation;

    private java.lang.Integer screening;

    private java.lang.Integer actions;

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

    private java.lang.Integer carrierCodeCircuitCode;

    private java.lang.String carrierCodeString;

    private java.lang.Short carrierCodePresubIndicator;

    private java.lang.String jurisdictionSwitchId;

    private java.lang.String zzCode;

    private java.lang.Integer additionalCategoryName;

    private java.lang.Integer additionalCategoryCat;

    private java.lang.Short origCarrierInfoPoiLevel;

    private java.lang.String origCarrierInfoPoiChgStr;

    private java.lang.String origCarrierString;

    private java.lang.Short callingNamePresentation;

    private java.lang.Short callingNameTypeOfName;

    private java.lang.String callingNameGenericString;

    private java.lang.Short callingNameAvailability;

    private java.lang.Short bgLinePrivileges;

    private java.lang.Short forwardCallIndIsupPref;

    private java.lang.Short uriScheme;

    private java.lang.Short uriFlag;

    private java.lang.Short uriUserParam;

    private java.lang.Integer portNumber;

    private java.lang.String pmCriteriaGroupId;

    private java.lang.Short skipMatch;

    private java.lang.Short skipNotMatch;

    private java.lang.Short startRemovePosition;

    private java.lang.Short numberOfRemoval;

    private java.lang.Short replacementType2;

    private java.lang.String constRepValue2;

    private java.lang.Short varRepParamType;

    private java.lang.Short varRepParamStartPosition;

    private java.lang.Short varRepNumberOfReplacement;

    private java.lang.Integer parameterType2;

    private java.lang.Short includeInEgress;

    private java.lang.Short carrierIncludeInEgress;

    private java.lang.Short carrierCodeIncludeInEgress;

    private java.lang.Short causeIncludeInEgress;

    private java.lang.Short causeOfNoId;

    private java.lang.String chargeAreaStr;

    private java.lang.Integer attributes1;

    private java.lang.Short olipIncludeInEgress;

    private java.lang.String pmRuleValue1;

    private java.lang.String pmRuleValue2;

    public PmRule() {
    }

    public PmRule(
           java.lang.String pmRuleId,
           java.lang.Short pmSubruleId,
           java.lang.String pmCriteriaId,
           java.lang.Integer parameterType,
           java.lang.Short startDigitPosition,
           java.lang.Short numberOfDigits,
           java.lang.String constRepValue,
           java.lang.Short varRepNumberType,
           java.lang.Short varRepStartDigitPosition,
           java.lang.Short varRepNumberOfDigits,
           java.lang.Short replacementType,
           java.lang.Short ruleType,
           java.lang.Integer natureOfAddress,
           java.lang.Integer numberingPlanIndicator,
           java.lang.Integer numberLength,
           java.lang.Integer presentation,
           java.lang.Integer screening,
           java.lang.Integer actions,
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
           java.lang.Integer carrierCodeCircuitCode,
           java.lang.String carrierCodeString,
           java.lang.Short carrierCodePresubIndicator,
           java.lang.String jurisdictionSwitchId,
           java.lang.String zzCode,
           java.lang.Integer additionalCategoryName,
           java.lang.Integer additionalCategoryCat,
           java.lang.Short origCarrierInfoPoiLevel,
           java.lang.String origCarrierInfoPoiChgStr,
           java.lang.String origCarrierString,
           java.lang.Short callingNamePresentation,
           java.lang.Short callingNameTypeOfName,
           java.lang.String callingNameGenericString,
           java.lang.Short callingNameAvailability,
           java.lang.Short bgLinePrivileges,
           java.lang.Short forwardCallIndIsupPref,
           java.lang.Short uriScheme,
           java.lang.Short uriFlag,
           java.lang.Short uriUserParam,
           java.lang.Integer portNumber,
           java.lang.String pmCriteriaGroupId,
           java.lang.Short skipMatch,
           java.lang.Short skipNotMatch,
           java.lang.Short startRemovePosition,
           java.lang.Short numberOfRemoval,
           java.lang.Short replacementType2,
           java.lang.String constRepValue2,
           java.lang.Short varRepParamType,
           java.lang.Short varRepParamStartPosition,
           java.lang.Short varRepNumberOfReplacement,
           java.lang.Integer parameterType2,
           java.lang.Short includeInEgress,
           java.lang.Short carrierIncludeInEgress,
           java.lang.Short carrierCodeIncludeInEgress,
           java.lang.Short causeIncludeInEgress,
           java.lang.Short causeOfNoId,
           java.lang.String chargeAreaStr,
           java.lang.Integer attributes1,
           java.lang.Short olipIncludeInEgress,
           java.lang.String pmRuleValue1,
           java.lang.String pmRuleValue2) {
        this.pmRuleId = pmRuleId;
        this.pmSubruleId = pmSubruleId;
        this.pmCriteriaId = pmCriteriaId;
        this.parameterType = parameterType;
        this.startDigitPosition = startDigitPosition;
        this.numberOfDigits = numberOfDigits;
        this.constRepValue = constRepValue;
        this.varRepNumberType = varRepNumberType;
        this.varRepStartDigitPosition = varRepStartDigitPosition;
        this.varRepNumberOfDigits = varRepNumberOfDigits;
        this.replacementType = replacementType;
        this.ruleType = ruleType;
        this.natureOfAddress = natureOfAddress;
        this.numberingPlanIndicator = numberingPlanIndicator;
        this.numberLength = numberLength;
        this.presentation = presentation;
        this.screening = screening;
        this.actions = actions;
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
        this.carrierCodeCircuitCode = carrierCodeCircuitCode;
        this.carrierCodeString = carrierCodeString;
        this.carrierCodePresubIndicator = carrierCodePresubIndicator;
        this.jurisdictionSwitchId = jurisdictionSwitchId;
        this.zzCode = zzCode;
        this.additionalCategoryName = additionalCategoryName;
        this.additionalCategoryCat = additionalCategoryCat;
        this.origCarrierInfoPoiLevel = origCarrierInfoPoiLevel;
        this.origCarrierInfoPoiChgStr = origCarrierInfoPoiChgStr;
        this.origCarrierString = origCarrierString;
        this.callingNamePresentation = callingNamePresentation;
        this.callingNameTypeOfName = callingNameTypeOfName;
        this.callingNameGenericString = callingNameGenericString;
        this.callingNameAvailability = callingNameAvailability;
        this.bgLinePrivileges = bgLinePrivileges;
        this.forwardCallIndIsupPref = forwardCallIndIsupPref;
        this.uriScheme = uriScheme;
        this.uriFlag = uriFlag;
        this.uriUserParam = uriUserParam;
        this.portNumber = portNumber;
        this.pmCriteriaGroupId = pmCriteriaGroupId;
        this.skipMatch = skipMatch;
        this.skipNotMatch = skipNotMatch;
        this.startRemovePosition = startRemovePosition;
        this.numberOfRemoval = numberOfRemoval;
        this.replacementType2 = replacementType2;
        this.constRepValue2 = constRepValue2;
        this.varRepParamType = varRepParamType;
        this.varRepParamStartPosition = varRepParamStartPosition;
        this.varRepNumberOfReplacement = varRepNumberOfReplacement;
        this.parameterType2 = parameterType2;
        this.includeInEgress = includeInEgress;
        this.carrierIncludeInEgress = carrierIncludeInEgress;
        this.carrierCodeIncludeInEgress = carrierCodeIncludeInEgress;
        this.causeIncludeInEgress = causeIncludeInEgress;
        this.causeOfNoId = causeOfNoId;
        this.chargeAreaStr = chargeAreaStr;
        this.attributes1 = attributes1;
        this.olipIncludeInEgress = olipIncludeInEgress;
        this.pmRuleValue1 = pmRuleValue1;
        this.pmRuleValue2 = pmRuleValue2;
    }


    /**
     * Gets the pmRuleId value for this PmRule.
     * 
     * @return pmRuleId
     */
    public java.lang.String getPmRuleId() {
        return pmRuleId;
    }


    /**
     * Sets the pmRuleId value for this PmRule.
     * 
     * @param pmRuleId
     */
    public void setPmRuleId(java.lang.String pmRuleId) {
        this.pmRuleId = pmRuleId;
    }


    /**
     * Gets the pmSubruleId value for this PmRule.
     * 
     * @return pmSubruleId
     */
    public java.lang.Short getPmSubruleId() {
        return pmSubruleId;
    }


    /**
     * Sets the pmSubruleId value for this PmRule.
     * 
     * @param pmSubruleId
     */
    public void setPmSubruleId(java.lang.Short pmSubruleId) {
        this.pmSubruleId = pmSubruleId;
    }


    /**
     * Gets the pmCriteriaId value for this PmRule.
     * 
     * @return pmCriteriaId
     */
    public java.lang.String getPmCriteriaId() {
        return pmCriteriaId;
    }


    /**
     * Sets the pmCriteriaId value for this PmRule.
     * 
     * @param pmCriteriaId
     */
    public void setPmCriteriaId(java.lang.String pmCriteriaId) {
        this.pmCriteriaId = pmCriteriaId;
    }


    /**
     * Gets the parameterType value for this PmRule.
     * 
     * @return parameterType
     */
    public java.lang.Integer getParameterType() {
        return parameterType;
    }


    /**
     * Sets the parameterType value for this PmRule.
     * 
     * @param parameterType
     */
    public void setParameterType(java.lang.Integer parameterType) {
        this.parameterType = parameterType;
    }


    /**
     * Gets the startDigitPosition value for this PmRule.
     * 
     * @return startDigitPosition
     */
    public java.lang.Short getStartDigitPosition() {
        return startDigitPosition;
    }


    /**
     * Sets the startDigitPosition value for this PmRule.
     * 
     * @param startDigitPosition
     */
    public void setStartDigitPosition(java.lang.Short startDigitPosition) {
        this.startDigitPosition = startDigitPosition;
    }


    /**
     * Gets the numberOfDigits value for this PmRule.
     * 
     * @return numberOfDigits
     */
    public java.lang.Short getNumberOfDigits() {
        return numberOfDigits;
    }


    /**
     * Sets the numberOfDigits value for this PmRule.
     * 
     * @param numberOfDigits
     */
    public void setNumberOfDigits(java.lang.Short numberOfDigits) {
        this.numberOfDigits = numberOfDigits;
    }


    /**
     * Gets the constRepValue value for this PmRule.
     * 
     * @return constRepValue
     */
    public java.lang.String getConstRepValue() {
        return constRepValue;
    }


    /**
     * Sets the constRepValue value for this PmRule.
     * 
     * @param constRepValue
     */
    public void setConstRepValue(java.lang.String constRepValue) {
        this.constRepValue = constRepValue;
    }


    /**
     * Gets the varRepNumberType value for this PmRule.
     * 
     * @return varRepNumberType
     */
    public java.lang.Short getVarRepNumberType() {
        return varRepNumberType;
    }


    /**
     * Sets the varRepNumberType value for this PmRule.
     * 
     * @param varRepNumberType
     */
    public void setVarRepNumberType(java.lang.Short varRepNumberType) {
        this.varRepNumberType = varRepNumberType;
    }


    /**
     * Gets the varRepStartDigitPosition value for this PmRule.
     * 
     * @return varRepStartDigitPosition
     */
    public java.lang.Short getVarRepStartDigitPosition() {
        return varRepStartDigitPosition;
    }


    /**
     * Sets the varRepStartDigitPosition value for this PmRule.
     * 
     * @param varRepStartDigitPosition
     */
    public void setVarRepStartDigitPosition(java.lang.Short varRepStartDigitPosition) {
        this.varRepStartDigitPosition = varRepStartDigitPosition;
    }


    /**
     * Gets the varRepNumberOfDigits value for this PmRule.
     * 
     * @return varRepNumberOfDigits
     */
    public java.lang.Short getVarRepNumberOfDigits() {
        return varRepNumberOfDigits;
    }


    /**
     * Sets the varRepNumberOfDigits value for this PmRule.
     * 
     * @param varRepNumberOfDigits
     */
    public void setVarRepNumberOfDigits(java.lang.Short varRepNumberOfDigits) {
        this.varRepNumberOfDigits = varRepNumberOfDigits;
    }


    /**
     * Gets the replacementType value for this PmRule.
     * 
     * @return replacementType
     */
    public java.lang.Short getReplacementType() {
        return replacementType;
    }


    /**
     * Sets the replacementType value for this PmRule.
     * 
     * @param replacementType
     */
    public void setReplacementType(java.lang.Short replacementType) {
        this.replacementType = replacementType;
    }


    /**
     * Gets the ruleType value for this PmRule.
     * 
     * @return ruleType
     */
    public java.lang.Short getRuleType() {
        return ruleType;
    }


    /**
     * Sets the ruleType value for this PmRule.
     * 
     * @param ruleType
     */
    public void setRuleType(java.lang.Short ruleType) {
        this.ruleType = ruleType;
    }


    /**
     * Gets the natureOfAddress value for this PmRule.
     * 
     * @return natureOfAddress
     */
    public java.lang.Integer getNatureOfAddress() {
        return natureOfAddress;
    }


    /**
     * Sets the natureOfAddress value for this PmRule.
     * 
     * @param natureOfAddress
     */
    public void setNatureOfAddress(java.lang.Integer natureOfAddress) {
        this.natureOfAddress = natureOfAddress;
    }


    /**
     * Gets the numberingPlanIndicator value for this PmRule.
     * 
     * @return numberingPlanIndicator
     */
    public java.lang.Integer getNumberingPlanIndicator() {
        return numberingPlanIndicator;
    }


    /**
     * Sets the numberingPlanIndicator value for this PmRule.
     * 
     * @param numberingPlanIndicator
     */
    public void setNumberingPlanIndicator(java.lang.Integer numberingPlanIndicator) {
        this.numberingPlanIndicator = numberingPlanIndicator;
    }


    /**
     * Gets the numberLength value for this PmRule.
     * 
     * @return numberLength
     */
    public java.lang.Integer getNumberLength() {
        return numberLength;
    }


    /**
     * Sets the numberLength value for this PmRule.
     * 
     * @param numberLength
     */
    public void setNumberLength(java.lang.Integer numberLength) {
        this.numberLength = numberLength;
    }


    /**
     * Gets the presentation value for this PmRule.
     * 
     * @return presentation
     */
    public java.lang.Integer getPresentation() {
        return presentation;
    }


    /**
     * Sets the presentation value for this PmRule.
     * 
     * @param presentation
     */
    public void setPresentation(java.lang.Integer presentation) {
        this.presentation = presentation;
    }


    /**
     * Gets the screening value for this PmRule.
     * 
     * @return screening
     */
    public java.lang.Integer getScreening() {
        return screening;
    }


    /**
     * Sets the screening value for this PmRule.
     * 
     * @param screening
     */
    public void setScreening(java.lang.Integer screening) {
        this.screening = screening;
    }


    /**
     * Gets the actions value for this PmRule.
     * 
     * @return actions
     */
    public java.lang.Integer getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this PmRule.
     * 
     * @param actions
     */
    public void setActions(java.lang.Integer actions) {
        this.actions = actions;
    }


    /**
     * Gets the callingPartyCategory value for this PmRule.
     * 
     * @return callingPartyCategory
     */
    public java.lang.Short getCallingPartyCategory() {
        return callingPartyCategory;
    }


    /**
     * Sets the callingPartyCategory value for this PmRule.
     * 
     * @param callingPartyCategory
     */
    public void setCallingPartyCategory(java.lang.Short callingPartyCategory) {
        this.callingPartyCategory = callingPartyCategory;
    }


    /**
     * Gets the originatingLineInfo value for this PmRule.
     * 
     * @return originatingLineInfo
     */
    public java.lang.Short getOriginatingLineInfo() {
        return originatingLineInfo;
    }


    /**
     * Sets the originatingLineInfo value for this PmRule.
     * 
     * @param originatingLineInfo
     */
    public void setOriginatingLineInfo(java.lang.Short originatingLineInfo) {
        this.originatingLineInfo = originatingLineInfo;
    }


    /**
     * Gets the forwardCallIndicator value for this PmRule.
     * 
     * @return forwardCallIndicator
     */
    public java.lang.Integer getForwardCallIndicator() {
        return forwardCallIndicator;
    }


    /**
     * Sets the forwardCallIndicator value for this PmRule.
     * 
     * @param forwardCallIndicator
     */
    public void setForwardCallIndicator(java.lang.Integer forwardCallIndicator) {
        this.forwardCallIndicator = forwardCallIndicator;
    }


    /**
     * Gets the nocSatellite value for this PmRule.
     * 
     * @return nocSatellite
     */
    public java.lang.Integer getNocSatellite() {
        return nocSatellite;
    }


    /**
     * Sets the nocSatellite value for this PmRule.
     * 
     * @param nocSatellite
     */
    public void setNocSatellite(java.lang.Integer nocSatellite) {
        this.nocSatellite = nocSatellite;
    }


    /**
     * Gets the nocCheck value for this PmRule.
     * 
     * @return nocCheck
     */
    public java.lang.Integer getNocCheck() {
        return nocCheck;
    }


    /**
     * Sets the nocCheck value for this PmRule.
     * 
     * @param nocCheck
     */
    public void setNocCheck(java.lang.Integer nocCheck) {
        this.nocCheck = nocCheck;
    }


    /**
     * Gets the nocEchoSuppression value for this PmRule.
     * 
     * @return nocEchoSuppression
     */
    public java.lang.Integer getNocEchoSuppression() {
        return nocEchoSuppression;
    }


    /**
     * Sets the nocEchoSuppression value for this PmRule.
     * 
     * @param nocEchoSuppression
     */
    public void setNocEchoSuppression(java.lang.Integer nocEchoSuppression) {
        this.nocEchoSuppression = nocEchoSuppression;
    }


    /**
     * Gets the bgPartySelector value for this PmRule.
     * 
     * @return bgPartySelector
     */
    public java.lang.Short getBgPartySelector() {
        return bgPartySelector;
    }


    /**
     * Sets the bgPartySelector value for this PmRule.
     * 
     * @param bgPartySelector
     */
    public void setBgPartySelector(java.lang.Short bgPartySelector) {
        this.bgPartySelector = bgPartySelector;
    }


    /**
     * Gets the bgId value for this PmRule.
     * 
     * @return bgId
     */
    public java.lang.Integer getBgId() {
        return bgId;
    }


    /**
     * Sets the bgId value for this PmRule.
     * 
     * @param bgId
     */
    public void setBgId(java.lang.Integer bgId) {
        this.bgId = bgId;
    }


    /**
     * Gets the bgSubgroupId value for this PmRule.
     * 
     * @return bgSubgroupId
     */
    public java.lang.Integer getBgSubgroupId() {
        return bgSubgroupId;
    }


    /**
     * Sets the bgSubgroupId value for this PmRule.
     * 
     * @param bgSubgroupId
     */
    public void setBgSubgroupId(java.lang.Integer bgSubgroupId) {
        this.bgSubgroupId = bgSubgroupId;
    }


    /**
     * Gets the bgFlags value for this PmRule.
     * 
     * @return bgFlags
     */
    public java.lang.Integer getBgFlags() {
        return bgFlags;
    }


    /**
     * Sets the bgFlags value for this PmRule.
     * 
     * @param bgFlags
     */
    public void setBgFlags(java.lang.Integer bgFlags) {
        this.bgFlags = bgFlags;
    }


    /**
     * Gets the bgElementAttributes value for this PmRule.
     * 
     * @return bgElementAttributes
     */
    public java.lang.Integer getBgElementAttributes() {
        return bgElementAttributes;
    }


    /**
     * Sets the bgElementAttributes value for this PmRule.
     * 
     * @param bgElementAttributes
     */
    public void setBgElementAttributes(java.lang.Integer bgElementAttributes) {
        this.bgElementAttributes = bgElementAttributes;
    }


    /**
     * Gets the carrierSelection value for this PmRule.
     * 
     * @return carrierSelection
     */
    public java.lang.Integer getCarrierSelection() {
        return carrierSelection;
    }


    /**
     * Sets the carrierSelection value for this PmRule.
     * 
     * @param carrierSelection
     */
    public void setCarrierSelection(java.lang.Integer carrierSelection) {
        this.carrierSelection = carrierSelection;
    }


    /**
     * Gets the carrierCodeNetworkIdPlan value for this PmRule.
     * 
     * @return carrierCodeNetworkIdPlan
     */
    public java.lang.Integer getCarrierCodeNetworkIdPlan() {
        return carrierCodeNetworkIdPlan;
    }


    /**
     * Sets the carrierCodeNetworkIdPlan value for this PmRule.
     * 
     * @param carrierCodeNetworkIdPlan
     */
    public void setCarrierCodeNetworkIdPlan(java.lang.Integer carrierCodeNetworkIdPlan) {
        this.carrierCodeNetworkIdPlan = carrierCodeNetworkIdPlan;
    }


    /**
     * Gets the carrierCodeNetworkIdType value for this PmRule.
     * 
     * @return carrierCodeNetworkIdType
     */
    public java.lang.Integer getCarrierCodeNetworkIdType() {
        return carrierCodeNetworkIdType;
    }


    /**
     * Sets the carrierCodeNetworkIdType value for this PmRule.
     * 
     * @param carrierCodeNetworkIdType
     */
    public void setCarrierCodeNetworkIdType(java.lang.Integer carrierCodeNetworkIdType) {
        this.carrierCodeNetworkIdType = carrierCodeNetworkIdType;
    }


    /**
     * Gets the carrierCodeCircuitCode value for this PmRule.
     * 
     * @return carrierCodeCircuitCode
     */
    public java.lang.Integer getCarrierCodeCircuitCode() {
        return carrierCodeCircuitCode;
    }


    /**
     * Sets the carrierCodeCircuitCode value for this PmRule.
     * 
     * @param carrierCodeCircuitCode
     */
    public void setCarrierCodeCircuitCode(java.lang.Integer carrierCodeCircuitCode) {
        this.carrierCodeCircuitCode = carrierCodeCircuitCode;
    }


    /**
     * Gets the carrierCodeString value for this PmRule.
     * 
     * @return carrierCodeString
     */
    public java.lang.String getCarrierCodeString() {
        return carrierCodeString;
    }


    /**
     * Sets the carrierCodeString value for this PmRule.
     * 
     * @param carrierCodeString
     */
    public void setCarrierCodeString(java.lang.String carrierCodeString) {
        this.carrierCodeString = carrierCodeString;
    }


    /**
     * Gets the carrierCodePresubIndicator value for this PmRule.
     * 
     * @return carrierCodePresubIndicator
     */
    public java.lang.Short getCarrierCodePresubIndicator() {
        return carrierCodePresubIndicator;
    }


    /**
     * Sets the carrierCodePresubIndicator value for this PmRule.
     * 
     * @param carrierCodePresubIndicator
     */
    public void setCarrierCodePresubIndicator(java.lang.Short carrierCodePresubIndicator) {
        this.carrierCodePresubIndicator = carrierCodePresubIndicator;
    }


    /**
     * Gets the jurisdictionSwitchId value for this PmRule.
     * 
     * @return jurisdictionSwitchId
     */
    public java.lang.String getJurisdictionSwitchId() {
        return jurisdictionSwitchId;
    }


    /**
     * Sets the jurisdictionSwitchId value for this PmRule.
     * 
     * @param jurisdictionSwitchId
     */
    public void setJurisdictionSwitchId(java.lang.String jurisdictionSwitchId) {
        this.jurisdictionSwitchId = jurisdictionSwitchId;
    }


    /**
     * Gets the zzCode value for this PmRule.
     * 
     * @return zzCode
     */
    public java.lang.String getZzCode() {
        return zzCode;
    }


    /**
     * Sets the zzCode value for this PmRule.
     * 
     * @param zzCode
     */
    public void setZzCode(java.lang.String zzCode) {
        this.zzCode = zzCode;
    }


    /**
     * Gets the additionalCategoryName value for this PmRule.
     * 
     * @return additionalCategoryName
     */
    public java.lang.Integer getAdditionalCategoryName() {
        return additionalCategoryName;
    }


    /**
     * Sets the additionalCategoryName value for this PmRule.
     * 
     * @param additionalCategoryName
     */
    public void setAdditionalCategoryName(java.lang.Integer additionalCategoryName) {
        this.additionalCategoryName = additionalCategoryName;
    }


    /**
     * Gets the additionalCategoryCat value for this PmRule.
     * 
     * @return additionalCategoryCat
     */
    public java.lang.Integer getAdditionalCategoryCat() {
        return additionalCategoryCat;
    }


    /**
     * Sets the additionalCategoryCat value for this PmRule.
     * 
     * @param additionalCategoryCat
     */
    public void setAdditionalCategoryCat(java.lang.Integer additionalCategoryCat) {
        this.additionalCategoryCat = additionalCategoryCat;
    }


    /**
     * Gets the origCarrierInfoPoiLevel value for this PmRule.
     * 
     * @return origCarrierInfoPoiLevel
     */
    public java.lang.Short getOrigCarrierInfoPoiLevel() {
        return origCarrierInfoPoiLevel;
    }


    /**
     * Sets the origCarrierInfoPoiLevel value for this PmRule.
     * 
     * @param origCarrierInfoPoiLevel
     */
    public void setOrigCarrierInfoPoiLevel(java.lang.Short origCarrierInfoPoiLevel) {
        this.origCarrierInfoPoiLevel = origCarrierInfoPoiLevel;
    }


    /**
     * Gets the origCarrierInfoPoiChgStr value for this PmRule.
     * 
     * @return origCarrierInfoPoiChgStr
     */
    public java.lang.String getOrigCarrierInfoPoiChgStr() {
        return origCarrierInfoPoiChgStr;
    }


    /**
     * Sets the origCarrierInfoPoiChgStr value for this PmRule.
     * 
     * @param origCarrierInfoPoiChgStr
     */
    public void setOrigCarrierInfoPoiChgStr(java.lang.String origCarrierInfoPoiChgStr) {
        this.origCarrierInfoPoiChgStr = origCarrierInfoPoiChgStr;
    }


    /**
     * Gets the origCarrierString value for this PmRule.
     * 
     * @return origCarrierString
     */
    public java.lang.String getOrigCarrierString() {
        return origCarrierString;
    }


    /**
     * Sets the origCarrierString value for this PmRule.
     * 
     * @param origCarrierString
     */
    public void setOrigCarrierString(java.lang.String origCarrierString) {
        this.origCarrierString = origCarrierString;
    }


    /**
     * Gets the callingNamePresentation value for this PmRule.
     * 
     * @return callingNamePresentation
     */
    public java.lang.Short getCallingNamePresentation() {
        return callingNamePresentation;
    }


    /**
     * Sets the callingNamePresentation value for this PmRule.
     * 
     * @param callingNamePresentation
     */
    public void setCallingNamePresentation(java.lang.Short callingNamePresentation) {
        this.callingNamePresentation = callingNamePresentation;
    }


    /**
     * Gets the callingNameTypeOfName value for this PmRule.
     * 
     * @return callingNameTypeOfName
     */
    public java.lang.Short getCallingNameTypeOfName() {
        return callingNameTypeOfName;
    }


    /**
     * Sets the callingNameTypeOfName value for this PmRule.
     * 
     * @param callingNameTypeOfName
     */
    public void setCallingNameTypeOfName(java.lang.Short callingNameTypeOfName) {
        this.callingNameTypeOfName = callingNameTypeOfName;
    }


    /**
     * Gets the callingNameGenericString value for this PmRule.
     * 
     * @return callingNameGenericString
     */
    public java.lang.String getCallingNameGenericString() {
        return callingNameGenericString;
    }


    /**
     * Sets the callingNameGenericString value for this PmRule.
     * 
     * @param callingNameGenericString
     */
    public void setCallingNameGenericString(java.lang.String callingNameGenericString) {
        this.callingNameGenericString = callingNameGenericString;
    }


    /**
     * Gets the callingNameAvailability value for this PmRule.
     * 
     * @return callingNameAvailability
     */
    public java.lang.Short getCallingNameAvailability() {
        return callingNameAvailability;
    }


    /**
     * Sets the callingNameAvailability value for this PmRule.
     * 
     * @param callingNameAvailability
     */
    public void setCallingNameAvailability(java.lang.Short callingNameAvailability) {
        this.callingNameAvailability = callingNameAvailability;
    }


    /**
     * Gets the bgLinePrivileges value for this PmRule.
     * 
     * @return bgLinePrivileges
     */
    public java.lang.Short getBgLinePrivileges() {
        return bgLinePrivileges;
    }


    /**
     * Sets the bgLinePrivileges value for this PmRule.
     * 
     * @param bgLinePrivileges
     */
    public void setBgLinePrivileges(java.lang.Short bgLinePrivileges) {
        this.bgLinePrivileges = bgLinePrivileges;
    }


    /**
     * Gets the forwardCallIndIsupPref value for this PmRule.
     * 
     * @return forwardCallIndIsupPref
     */
    public java.lang.Short getForwardCallIndIsupPref() {
        return forwardCallIndIsupPref;
    }


    /**
     * Sets the forwardCallIndIsupPref value for this PmRule.
     * 
     * @param forwardCallIndIsupPref
     */
    public void setForwardCallIndIsupPref(java.lang.Short forwardCallIndIsupPref) {
        this.forwardCallIndIsupPref = forwardCallIndIsupPref;
    }


    /**
     * Gets the uriScheme value for this PmRule.
     * 
     * @return uriScheme
     */
    public java.lang.Short getUriScheme() {
        return uriScheme;
    }


    /**
     * Sets the uriScheme value for this PmRule.
     * 
     * @param uriScheme
     */
    public void setUriScheme(java.lang.Short uriScheme) {
        this.uriScheme = uriScheme;
    }


    /**
     * Gets the uriFlag value for this PmRule.
     * 
     * @return uriFlag
     */
    public java.lang.Short getUriFlag() {
        return uriFlag;
    }


    /**
     * Sets the uriFlag value for this PmRule.
     * 
     * @param uriFlag
     */
    public void setUriFlag(java.lang.Short uriFlag) {
        this.uriFlag = uriFlag;
    }


    /**
     * Gets the uriUserParam value for this PmRule.
     * 
     * @return uriUserParam
     */
    public java.lang.Short getUriUserParam() {
        return uriUserParam;
    }


    /**
     * Sets the uriUserParam value for this PmRule.
     * 
     * @param uriUserParam
     */
    public void setUriUserParam(java.lang.Short uriUserParam) {
        this.uriUserParam = uriUserParam;
    }


    /**
     * Gets the portNumber value for this PmRule.
     * 
     * @return portNumber
     */
    public java.lang.Integer getPortNumber() {
        return portNumber;
    }


    /**
     * Sets the portNumber value for this PmRule.
     * 
     * @param portNumber
     */
    public void setPortNumber(java.lang.Integer portNumber) {
        this.portNumber = portNumber;
    }


    /**
     * Gets the pmCriteriaGroupId value for this PmRule.
     * 
     * @return pmCriteriaGroupId
     */
    public java.lang.String getPmCriteriaGroupId() {
        return pmCriteriaGroupId;
    }


    /**
     * Sets the pmCriteriaGroupId value for this PmRule.
     * 
     * @param pmCriteriaGroupId
     */
    public void setPmCriteriaGroupId(java.lang.String pmCriteriaGroupId) {
        this.pmCriteriaGroupId = pmCriteriaGroupId;
    }


    /**
     * Gets the skipMatch value for this PmRule.
     * 
     * @return skipMatch
     */
    public java.lang.Short getSkipMatch() {
        return skipMatch;
    }


    /**
     * Sets the skipMatch value for this PmRule.
     * 
     * @param skipMatch
     */
    public void setSkipMatch(java.lang.Short skipMatch) {
        this.skipMatch = skipMatch;
    }


    /**
     * Gets the skipNotMatch value for this PmRule.
     * 
     * @return skipNotMatch
     */
    public java.lang.Short getSkipNotMatch() {
        return skipNotMatch;
    }


    /**
     * Sets the skipNotMatch value for this PmRule.
     * 
     * @param skipNotMatch
     */
    public void setSkipNotMatch(java.lang.Short skipNotMatch) {
        this.skipNotMatch = skipNotMatch;
    }


    /**
     * Gets the startRemovePosition value for this PmRule.
     * 
     * @return startRemovePosition
     */
    public java.lang.Short getStartRemovePosition() {
        return startRemovePosition;
    }


    /**
     * Sets the startRemovePosition value for this PmRule.
     * 
     * @param startRemovePosition
     */
    public void setStartRemovePosition(java.lang.Short startRemovePosition) {
        this.startRemovePosition = startRemovePosition;
    }


    /**
     * Gets the numberOfRemoval value for this PmRule.
     * 
     * @return numberOfRemoval
     */
    public java.lang.Short getNumberOfRemoval() {
        return numberOfRemoval;
    }


    /**
     * Sets the numberOfRemoval value for this PmRule.
     * 
     * @param numberOfRemoval
     */
    public void setNumberOfRemoval(java.lang.Short numberOfRemoval) {
        this.numberOfRemoval = numberOfRemoval;
    }


    /**
     * Gets the replacementType2 value for this PmRule.
     * 
     * @return replacementType2
     */
    public java.lang.Short getReplacementType2() {
        return replacementType2;
    }


    /**
     * Sets the replacementType2 value for this PmRule.
     * 
     * @param replacementType2
     */
    public void setReplacementType2(java.lang.Short replacementType2) {
        this.replacementType2 = replacementType2;
    }


    /**
     * Gets the constRepValue2 value for this PmRule.
     * 
     * @return constRepValue2
     */
    public java.lang.String getConstRepValue2() {
        return constRepValue2;
    }


    /**
     * Sets the constRepValue2 value for this PmRule.
     * 
     * @param constRepValue2
     */
    public void setConstRepValue2(java.lang.String constRepValue2) {
        this.constRepValue2 = constRepValue2;
    }


    /**
     * Gets the varRepParamType value for this PmRule.
     * 
     * @return varRepParamType
     */
    public java.lang.Short getVarRepParamType() {
        return varRepParamType;
    }


    /**
     * Sets the varRepParamType value for this PmRule.
     * 
     * @param varRepParamType
     */
    public void setVarRepParamType(java.lang.Short varRepParamType) {
        this.varRepParamType = varRepParamType;
    }


    /**
     * Gets the varRepParamStartPosition value for this PmRule.
     * 
     * @return varRepParamStartPosition
     */
    public java.lang.Short getVarRepParamStartPosition() {
        return varRepParamStartPosition;
    }


    /**
     * Sets the varRepParamStartPosition value for this PmRule.
     * 
     * @param varRepParamStartPosition
     */
    public void setVarRepParamStartPosition(java.lang.Short varRepParamStartPosition) {
        this.varRepParamStartPosition = varRepParamStartPosition;
    }


    /**
     * Gets the varRepNumberOfReplacement value for this PmRule.
     * 
     * @return varRepNumberOfReplacement
     */
    public java.lang.Short getVarRepNumberOfReplacement() {
        return varRepNumberOfReplacement;
    }


    /**
     * Sets the varRepNumberOfReplacement value for this PmRule.
     * 
     * @param varRepNumberOfReplacement
     */
    public void setVarRepNumberOfReplacement(java.lang.Short varRepNumberOfReplacement) {
        this.varRepNumberOfReplacement = varRepNumberOfReplacement;
    }


    /**
     * Gets the parameterType2 value for this PmRule.
     * 
     * @return parameterType2
     */
    public java.lang.Integer getParameterType2() {
        return parameterType2;
    }


    /**
     * Sets the parameterType2 value for this PmRule.
     * 
     * @param parameterType2
     */
    public void setParameterType2(java.lang.Integer parameterType2) {
        this.parameterType2 = parameterType2;
    }


    /**
     * Gets the includeInEgress value for this PmRule.
     * 
     * @return includeInEgress
     */
    public java.lang.Short getIncludeInEgress() {
        return includeInEgress;
    }


    /**
     * Sets the includeInEgress value for this PmRule.
     * 
     * @param includeInEgress
     */
    public void setIncludeInEgress(java.lang.Short includeInEgress) {
        this.includeInEgress = includeInEgress;
    }


    /**
     * Gets the carrierIncludeInEgress value for this PmRule.
     * 
     * @return carrierIncludeInEgress
     */
    public java.lang.Short getCarrierIncludeInEgress() {
        return carrierIncludeInEgress;
    }


    /**
     * Sets the carrierIncludeInEgress value for this PmRule.
     * 
     * @param carrierIncludeInEgress
     */
    public void setCarrierIncludeInEgress(java.lang.Short carrierIncludeInEgress) {
        this.carrierIncludeInEgress = carrierIncludeInEgress;
    }


    /**
     * Gets the carrierCodeIncludeInEgress value for this PmRule.
     * 
     * @return carrierCodeIncludeInEgress
     */
    public java.lang.Short getCarrierCodeIncludeInEgress() {
        return carrierCodeIncludeInEgress;
    }


    /**
     * Sets the carrierCodeIncludeInEgress value for this PmRule.
     * 
     * @param carrierCodeIncludeInEgress
     */
    public void setCarrierCodeIncludeInEgress(java.lang.Short carrierCodeIncludeInEgress) {
        this.carrierCodeIncludeInEgress = carrierCodeIncludeInEgress;
    }


    /**
     * Gets the causeIncludeInEgress value for this PmRule.
     * 
     * @return causeIncludeInEgress
     */
    public java.lang.Short getCauseIncludeInEgress() {
        return causeIncludeInEgress;
    }


    /**
     * Sets the causeIncludeInEgress value for this PmRule.
     * 
     * @param causeIncludeInEgress
     */
    public void setCauseIncludeInEgress(java.lang.Short causeIncludeInEgress) {
        this.causeIncludeInEgress = causeIncludeInEgress;
    }


    /**
     * Gets the causeOfNoId value for this PmRule.
     * 
     * @return causeOfNoId
     */
    public java.lang.Short getCauseOfNoId() {
        return causeOfNoId;
    }


    /**
     * Sets the causeOfNoId value for this PmRule.
     * 
     * @param causeOfNoId
     */
    public void setCauseOfNoId(java.lang.Short causeOfNoId) {
        this.causeOfNoId = causeOfNoId;
    }


    /**
     * Gets the chargeAreaStr value for this PmRule.
     * 
     * @return chargeAreaStr
     */
    public java.lang.String getChargeAreaStr() {
        return chargeAreaStr;
    }


    /**
     * Sets the chargeAreaStr value for this PmRule.
     * 
     * @param chargeAreaStr
     */
    public void setChargeAreaStr(java.lang.String chargeAreaStr) {
        this.chargeAreaStr = chargeAreaStr;
    }


    /**
     * Gets the attributes1 value for this PmRule.
     * 
     * @return attributes1
     */
    public java.lang.Integer getAttributes1() {
        return attributes1;
    }


    /**
     * Sets the attributes1 value for this PmRule.
     * 
     * @param attributes1
     */
    public void setAttributes1(java.lang.Integer attributes1) {
        this.attributes1 = attributes1;
    }


    /**
     * Gets the olipIncludeInEgress value for this PmRule.
     * 
     * @return olipIncludeInEgress
     */
    public java.lang.Short getOlipIncludeInEgress() {
        return olipIncludeInEgress;
    }


    /**
     * Sets the olipIncludeInEgress value for this PmRule.
     * 
     * @param olipIncludeInEgress
     */
    public void setOlipIncludeInEgress(java.lang.Short olipIncludeInEgress) {
        this.olipIncludeInEgress = olipIncludeInEgress;
    }


    /**
     * Gets the pmRuleValue1 value for this PmRule.
     * 
     * @return pmRuleValue1
     */
    public java.lang.String getPmRuleValue1() {
        return pmRuleValue1;
    }


    /**
     * Sets the pmRuleValue1 value for this PmRule.
     * 
     * @param pmRuleValue1
     */
    public void setPmRuleValue1(java.lang.String pmRuleValue1) {
        this.pmRuleValue1 = pmRuleValue1;
    }


    /**
     * Gets the pmRuleValue2 value for this PmRule.
     * 
     * @return pmRuleValue2
     */
    public java.lang.String getPmRuleValue2() {
        return pmRuleValue2;
    }


    /**
     * Sets the pmRuleValue2 value for this PmRule.
     * 
     * @param pmRuleValue2
     */
    public void setPmRuleValue2(java.lang.String pmRuleValue2) {
        this.pmRuleValue2 = pmRuleValue2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PmRule)) return false;
        PmRule other = (PmRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pmRuleId==null && other.getPmRuleId()==null) || 
             (this.pmRuleId!=null &&
              this.pmRuleId.equals(other.getPmRuleId()))) &&
            ((this.pmSubruleId==null && other.getPmSubruleId()==null) || 
             (this.pmSubruleId!=null &&
              this.pmSubruleId.equals(other.getPmSubruleId()))) &&
            ((this.pmCriteriaId==null && other.getPmCriteriaId()==null) || 
             (this.pmCriteriaId!=null &&
              this.pmCriteriaId.equals(other.getPmCriteriaId()))) &&
            ((this.parameterType==null && other.getParameterType()==null) || 
             (this.parameterType!=null &&
              this.parameterType.equals(other.getParameterType()))) &&
            ((this.startDigitPosition==null && other.getStartDigitPosition()==null) || 
             (this.startDigitPosition!=null &&
              this.startDigitPosition.equals(other.getStartDigitPosition()))) &&
            ((this.numberOfDigits==null && other.getNumberOfDigits()==null) || 
             (this.numberOfDigits!=null &&
              this.numberOfDigits.equals(other.getNumberOfDigits()))) &&
            ((this.constRepValue==null && other.getConstRepValue()==null) || 
             (this.constRepValue!=null &&
              this.constRepValue.equals(other.getConstRepValue()))) &&
            ((this.varRepNumberType==null && other.getVarRepNumberType()==null) || 
             (this.varRepNumberType!=null &&
              this.varRepNumberType.equals(other.getVarRepNumberType()))) &&
            ((this.varRepStartDigitPosition==null && other.getVarRepStartDigitPosition()==null) || 
             (this.varRepStartDigitPosition!=null &&
              this.varRepStartDigitPosition.equals(other.getVarRepStartDigitPosition()))) &&
            ((this.varRepNumberOfDigits==null && other.getVarRepNumberOfDigits()==null) || 
             (this.varRepNumberOfDigits!=null &&
              this.varRepNumberOfDigits.equals(other.getVarRepNumberOfDigits()))) &&
            ((this.replacementType==null && other.getReplacementType()==null) || 
             (this.replacementType!=null &&
              this.replacementType.equals(other.getReplacementType()))) &&
            ((this.ruleType==null && other.getRuleType()==null) || 
             (this.ruleType!=null &&
              this.ruleType.equals(other.getRuleType()))) &&
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
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              this.actions.equals(other.getActions()))) &&
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
            ((this.carrierCodeCircuitCode==null && other.getCarrierCodeCircuitCode()==null) || 
             (this.carrierCodeCircuitCode!=null &&
              this.carrierCodeCircuitCode.equals(other.getCarrierCodeCircuitCode()))) &&
            ((this.carrierCodeString==null && other.getCarrierCodeString()==null) || 
             (this.carrierCodeString!=null &&
              this.carrierCodeString.equals(other.getCarrierCodeString()))) &&
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
            ((this.origCarrierInfoPoiLevel==null && other.getOrigCarrierInfoPoiLevel()==null) || 
             (this.origCarrierInfoPoiLevel!=null &&
              this.origCarrierInfoPoiLevel.equals(other.getOrigCarrierInfoPoiLevel()))) &&
            ((this.origCarrierInfoPoiChgStr==null && other.getOrigCarrierInfoPoiChgStr()==null) || 
             (this.origCarrierInfoPoiChgStr!=null &&
              this.origCarrierInfoPoiChgStr.equals(other.getOrigCarrierInfoPoiChgStr()))) &&
            ((this.origCarrierString==null && other.getOrigCarrierString()==null) || 
             (this.origCarrierString!=null &&
              this.origCarrierString.equals(other.getOrigCarrierString()))) &&
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
            ((this.uriScheme==null && other.getUriScheme()==null) || 
             (this.uriScheme!=null &&
              this.uriScheme.equals(other.getUriScheme()))) &&
            ((this.uriFlag==null && other.getUriFlag()==null) || 
             (this.uriFlag!=null &&
              this.uriFlag.equals(other.getUriFlag()))) &&
            ((this.uriUserParam==null && other.getUriUserParam()==null) || 
             (this.uriUserParam!=null &&
              this.uriUserParam.equals(other.getUriUserParam()))) &&
            ((this.portNumber==null && other.getPortNumber()==null) || 
             (this.portNumber!=null &&
              this.portNumber.equals(other.getPortNumber()))) &&
            ((this.pmCriteriaGroupId==null && other.getPmCriteriaGroupId()==null) || 
             (this.pmCriteriaGroupId!=null &&
              this.pmCriteriaGroupId.equals(other.getPmCriteriaGroupId()))) &&
            ((this.skipMatch==null && other.getSkipMatch()==null) || 
             (this.skipMatch!=null &&
              this.skipMatch.equals(other.getSkipMatch()))) &&
            ((this.skipNotMatch==null && other.getSkipNotMatch()==null) || 
             (this.skipNotMatch!=null &&
              this.skipNotMatch.equals(other.getSkipNotMatch()))) &&
            ((this.startRemovePosition==null && other.getStartRemovePosition()==null) || 
             (this.startRemovePosition!=null &&
              this.startRemovePosition.equals(other.getStartRemovePosition()))) &&
            ((this.numberOfRemoval==null && other.getNumberOfRemoval()==null) || 
             (this.numberOfRemoval!=null &&
              this.numberOfRemoval.equals(other.getNumberOfRemoval()))) &&
            ((this.replacementType2==null && other.getReplacementType2()==null) || 
             (this.replacementType2!=null &&
              this.replacementType2.equals(other.getReplacementType2()))) &&
            ((this.constRepValue2==null && other.getConstRepValue2()==null) || 
             (this.constRepValue2!=null &&
              this.constRepValue2.equals(other.getConstRepValue2()))) &&
            ((this.varRepParamType==null && other.getVarRepParamType()==null) || 
             (this.varRepParamType!=null &&
              this.varRepParamType.equals(other.getVarRepParamType()))) &&
            ((this.varRepParamStartPosition==null && other.getVarRepParamStartPosition()==null) || 
             (this.varRepParamStartPosition!=null &&
              this.varRepParamStartPosition.equals(other.getVarRepParamStartPosition()))) &&
            ((this.varRepNumberOfReplacement==null && other.getVarRepNumberOfReplacement()==null) || 
             (this.varRepNumberOfReplacement!=null &&
              this.varRepNumberOfReplacement.equals(other.getVarRepNumberOfReplacement()))) &&
            ((this.parameterType2==null && other.getParameterType2()==null) || 
             (this.parameterType2!=null &&
              this.parameterType2.equals(other.getParameterType2()))) &&
            ((this.includeInEgress==null && other.getIncludeInEgress()==null) || 
             (this.includeInEgress!=null &&
              this.includeInEgress.equals(other.getIncludeInEgress()))) &&
            ((this.carrierIncludeInEgress==null && other.getCarrierIncludeInEgress()==null) || 
             (this.carrierIncludeInEgress!=null &&
              this.carrierIncludeInEgress.equals(other.getCarrierIncludeInEgress()))) &&
            ((this.carrierCodeIncludeInEgress==null && other.getCarrierCodeIncludeInEgress()==null) || 
             (this.carrierCodeIncludeInEgress!=null &&
              this.carrierCodeIncludeInEgress.equals(other.getCarrierCodeIncludeInEgress()))) &&
            ((this.causeIncludeInEgress==null && other.getCauseIncludeInEgress()==null) || 
             (this.causeIncludeInEgress!=null &&
              this.causeIncludeInEgress.equals(other.getCauseIncludeInEgress()))) &&
            ((this.causeOfNoId==null && other.getCauseOfNoId()==null) || 
             (this.causeOfNoId!=null &&
              this.causeOfNoId.equals(other.getCauseOfNoId()))) &&
            ((this.chargeAreaStr==null && other.getChargeAreaStr()==null) || 
             (this.chargeAreaStr!=null &&
              this.chargeAreaStr.equals(other.getChargeAreaStr()))) &&
            ((this.attributes1==null && other.getAttributes1()==null) || 
             (this.attributes1!=null &&
              this.attributes1.equals(other.getAttributes1()))) &&
            ((this.olipIncludeInEgress==null && other.getOlipIncludeInEgress()==null) || 
             (this.olipIncludeInEgress!=null &&
              this.olipIncludeInEgress.equals(other.getOlipIncludeInEgress()))) &&
            ((this.pmRuleValue1==null && other.getPmRuleValue1()==null) || 
             (this.pmRuleValue1!=null &&
              this.pmRuleValue1.equals(other.getPmRuleValue1()))) &&
            ((this.pmRuleValue2==null && other.getPmRuleValue2()==null) || 
             (this.pmRuleValue2!=null &&
              this.pmRuleValue2.equals(other.getPmRuleValue2())));
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
        if (getPmRuleId() != null) {
            _hashCode += getPmRuleId().hashCode();
        }
        if (getPmSubruleId() != null) {
            _hashCode += getPmSubruleId().hashCode();
        }
        if (getPmCriteriaId() != null) {
            _hashCode += getPmCriteriaId().hashCode();
        }
        if (getParameterType() != null) {
            _hashCode += getParameterType().hashCode();
        }
        if (getStartDigitPosition() != null) {
            _hashCode += getStartDigitPosition().hashCode();
        }
        if (getNumberOfDigits() != null) {
            _hashCode += getNumberOfDigits().hashCode();
        }
        if (getConstRepValue() != null) {
            _hashCode += getConstRepValue().hashCode();
        }
        if (getVarRepNumberType() != null) {
            _hashCode += getVarRepNumberType().hashCode();
        }
        if (getVarRepStartDigitPosition() != null) {
            _hashCode += getVarRepStartDigitPosition().hashCode();
        }
        if (getVarRepNumberOfDigits() != null) {
            _hashCode += getVarRepNumberOfDigits().hashCode();
        }
        if (getReplacementType() != null) {
            _hashCode += getReplacementType().hashCode();
        }
        if (getRuleType() != null) {
            _hashCode += getRuleType().hashCode();
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
        if (getActions() != null) {
            _hashCode += getActions().hashCode();
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
        if (getCarrierCodeCircuitCode() != null) {
            _hashCode += getCarrierCodeCircuitCode().hashCode();
        }
        if (getCarrierCodeString() != null) {
            _hashCode += getCarrierCodeString().hashCode();
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
        if (getOrigCarrierInfoPoiLevel() != null) {
            _hashCode += getOrigCarrierInfoPoiLevel().hashCode();
        }
        if (getOrigCarrierInfoPoiChgStr() != null) {
            _hashCode += getOrigCarrierInfoPoiChgStr().hashCode();
        }
        if (getOrigCarrierString() != null) {
            _hashCode += getOrigCarrierString().hashCode();
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
        if (getUriScheme() != null) {
            _hashCode += getUriScheme().hashCode();
        }
        if (getUriFlag() != null) {
            _hashCode += getUriFlag().hashCode();
        }
        if (getUriUserParam() != null) {
            _hashCode += getUriUserParam().hashCode();
        }
        if (getPortNumber() != null) {
            _hashCode += getPortNumber().hashCode();
        }
        if (getPmCriteriaGroupId() != null) {
            _hashCode += getPmCriteriaGroupId().hashCode();
        }
        if (getSkipMatch() != null) {
            _hashCode += getSkipMatch().hashCode();
        }
        if (getSkipNotMatch() != null) {
            _hashCode += getSkipNotMatch().hashCode();
        }
        if (getStartRemovePosition() != null) {
            _hashCode += getStartRemovePosition().hashCode();
        }
        if (getNumberOfRemoval() != null) {
            _hashCode += getNumberOfRemoval().hashCode();
        }
        if (getReplacementType2() != null) {
            _hashCode += getReplacementType2().hashCode();
        }
        if (getConstRepValue2() != null) {
            _hashCode += getConstRepValue2().hashCode();
        }
        if (getVarRepParamType() != null) {
            _hashCode += getVarRepParamType().hashCode();
        }
        if (getVarRepParamStartPosition() != null) {
            _hashCode += getVarRepParamStartPosition().hashCode();
        }
        if (getVarRepNumberOfReplacement() != null) {
            _hashCode += getVarRepNumberOfReplacement().hashCode();
        }
        if (getParameterType2() != null) {
            _hashCode += getParameterType2().hashCode();
        }
        if (getIncludeInEgress() != null) {
            _hashCode += getIncludeInEgress().hashCode();
        }
        if (getCarrierIncludeInEgress() != null) {
            _hashCode += getCarrierIncludeInEgress().hashCode();
        }
        if (getCarrierCodeIncludeInEgress() != null) {
            _hashCode += getCarrierCodeIncludeInEgress().hashCode();
        }
        if (getCauseIncludeInEgress() != null) {
            _hashCode += getCauseIncludeInEgress().hashCode();
        }
        if (getCauseOfNoId() != null) {
            _hashCode += getCauseOfNoId().hashCode();
        }
        if (getChargeAreaStr() != null) {
            _hashCode += getChargeAreaStr().hashCode();
        }
        if (getAttributes1() != null) {
            _hashCode += getAttributes1().hashCode();
        }
        if (getOlipIncludeInEgress() != null) {
            _hashCode += getOlipIncludeInEgress().hashCode();
        }
        if (getPmRuleValue1() != null) {
            _hashCode += getPmRuleValue1().hashCode();
        }
        if (getPmRuleValue2() != null) {
            _hashCode += getPmRuleValue2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PmRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmSubruleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmSubruleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmCriteriaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmCriteriaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("constRepValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "constRepValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varRepNumberType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "varRepNumberType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varRepStartDigitPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "varRepStartDigitPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varRepNumberOfDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "varRepNumberOfDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replacementType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replacementType"));
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
        elemField.setFieldName("natureOfAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natureOfAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberingPlanIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberingPlanIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screening");
        elemField.setXmlName(new javax.xml.namespace.QName("", "screening"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("carrierCodeCircuitCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCodeCircuitCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCodeString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCodeString"));
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
        elemField.setFieldName("origCarrierInfoPoiLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origCarrierInfoPoiLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origCarrierInfoPoiChgStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origCarrierInfoPoiChgStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origCarrierString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origCarrierString"));
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
        elemField.setFieldName("uriScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uriScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uriFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uriFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uriUserParam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uriUserParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmCriteriaGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmCriteriaGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skipMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipNotMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skipNotMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startRemovePosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startRemovePosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfRemoval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfRemoval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replacementType2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replacementType2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constRepValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "constRepValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varRepParamType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "varRepParamType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varRepParamStartPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "varRepParamStartPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varRepNumberOfReplacement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "varRepNumberOfReplacement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterType2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterType2"));
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
        elemField.setFieldName("carrierIncludeInEgress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierIncludeInEgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCodeIncludeInEgress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCodeIncludeInEgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causeIncludeInEgress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "causeIncludeInEgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causeOfNoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "causeOfNoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeAreaStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeAreaStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("olipIncludeInEgress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "olipIncludeInEgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmRuleValue1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmRuleValue1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmRuleValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmRuleValue2"));
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
