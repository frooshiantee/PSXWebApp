/**
 * NumberingPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class NumberingPlan  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String numberingPlanId;
    private java.lang.Short nationalLength;
    private java.lang.Short areaCodeLength;
    private java.lang.Short subscriberLength;
    private java.lang.Short exchangeLength;
    private java.lang.Short lineLength;
    private java.lang.Short analyzeFlags;
    private java.lang.String reFacilityCode;
    private java.lang.String reCarrierCode;
    private java.lang.String reVsc;
    private java.lang.String reEmergency;
    private java.lang.String reDa;
    private java.lang.String reEin;
    private java.lang.String rePrefix;
    private java.lang.String reNational;
    private java.lang.String reNationalOperator;
    private java.lang.String reInternational;
    private java.lang.String reInternationalOperator;
    private java.lang.String reTollFree;
    private java.lang.String re900;
    private java.lang.String reNpa;
    private java.lang.String reNxx;
    private java.lang.String reLine;
    private java.lang.String reNpaNxxLine;
    private java.lang.String reNxxLine;
    private java.lang.String re950;
    private java.lang.String reAll;
    private java.lang.String reLecOperator;
    private java.lang.String reIxcOperator;
    private java.lang.String re10XxxCarrierCode;
    private java.lang.String reSac;
    private java.lang.Short privateCallDetermination;
    private java.lang.String privateCallLdigits;
    private java.lang.Short privateCallLdigitsRmFlag;
    private java.lang.String publicCallLdigits;
    private java.lang.Short publicCallLdigitsRmFlag;
    private java.lang.String privateCallNumberMatching;
    private java.lang.Short privateCallNpi;
    private java.lang.Short privateCallNoa;
    private java.lang.String pmRuleId;
    private java.lang.Integer attributes;
    private java.lang.Short nationalLengthMax;
    private java.lang.Short areaCodeLengthMax;
    private java.lang.Short subscriberLengthMax;
    private java.lang.Short exchangeLengthMax;
    private java.lang.Short lineLengthMax;
    private java.lang.Short privateLengthMin;
    private java.lang.Short privateLengthMax;
    private java.lang.String prefixProfileId;
    private java.lang.Short analysisType;
    private java.lang.String clipPrefix;
    private java.lang.String clirPrefix;
    private java.lang.String enblocProfileId;

    public NumberingPlan() {
    }

    public NumberingPlan(
           java.lang.String numberingPlanId,
           java.lang.Short nationalLength,
           java.lang.Short areaCodeLength,
           java.lang.Short subscriberLength,
           java.lang.Short exchangeLength,
           java.lang.Short lineLength,
           java.lang.Short analyzeFlags,
           java.lang.String reFacilityCode,
           java.lang.String reCarrierCode,
           java.lang.String reVsc,
           java.lang.String reEmergency,
           java.lang.String reDa,
           java.lang.String reEin,
           java.lang.String rePrefix,
           java.lang.String reNational,
           java.lang.String reNationalOperator,
           java.lang.String reInternational,
           java.lang.String reInternationalOperator,
           java.lang.String reTollFree,
           java.lang.String re900,
           java.lang.String reNpa,
           java.lang.String reNxx,
           java.lang.String reLine,
           java.lang.String reNpaNxxLine,
           java.lang.String reNxxLine,
           java.lang.String re950,
           java.lang.String reAll,
           java.lang.String reLecOperator,
           java.lang.String reIxcOperator,
           java.lang.String re10XxxCarrierCode,
           java.lang.String reSac,
           java.lang.Short privateCallDetermination,
           java.lang.String privateCallLdigits,
           java.lang.Short privateCallLdigitsRmFlag,
           java.lang.String publicCallLdigits,
           java.lang.Short publicCallLdigitsRmFlag,
           java.lang.String privateCallNumberMatching,
           java.lang.Short privateCallNpi,
           java.lang.Short privateCallNoa,
           java.lang.String pmRuleId,
           java.lang.Integer attributes,
           java.lang.Short nationalLengthMax,
           java.lang.Short areaCodeLengthMax,
           java.lang.Short subscriberLengthMax,
           java.lang.Short exchangeLengthMax,
           java.lang.Short lineLengthMax,
           java.lang.Short privateLengthMin,
           java.lang.Short privateLengthMax,
           java.lang.String prefixProfileId,
           java.lang.Short analysisType,
           java.lang.String clipPrefix,
           java.lang.String clirPrefix,
           java.lang.String enblocProfileId) {
           this.numberingPlanId = numberingPlanId;
           this.nationalLength = nationalLength;
           this.areaCodeLength = areaCodeLength;
           this.subscriberLength = subscriberLength;
           this.exchangeLength = exchangeLength;
           this.lineLength = lineLength;
           this.analyzeFlags = analyzeFlags;
           this.reFacilityCode = reFacilityCode;
           this.reCarrierCode = reCarrierCode;
           this.reVsc = reVsc;
           this.reEmergency = reEmergency;
           this.reDa = reDa;
           this.reEin = reEin;
           this.rePrefix = rePrefix;
           this.reNational = reNational;
           this.reNationalOperator = reNationalOperator;
           this.reInternational = reInternational;
           this.reInternationalOperator = reInternationalOperator;
           this.reTollFree = reTollFree;
           this.re900 = re900;
           this.reNpa = reNpa;
           this.reNxx = reNxx;
           this.reLine = reLine;
           this.reNpaNxxLine = reNpaNxxLine;
           this.reNxxLine = reNxxLine;
           this.re950 = re950;
           this.reAll = reAll;
           this.reLecOperator = reLecOperator;
           this.reIxcOperator = reIxcOperator;
           this.re10XxxCarrierCode = re10XxxCarrierCode;
           this.reSac = reSac;
           this.privateCallDetermination = privateCallDetermination;
           this.privateCallLdigits = privateCallLdigits;
           this.privateCallLdigitsRmFlag = privateCallLdigitsRmFlag;
           this.publicCallLdigits = publicCallLdigits;
           this.publicCallLdigitsRmFlag = publicCallLdigitsRmFlag;
           this.privateCallNumberMatching = privateCallNumberMatching;
           this.privateCallNpi = privateCallNpi;
           this.privateCallNoa = privateCallNoa;
           this.pmRuleId = pmRuleId;
           this.attributes = attributes;
           this.nationalLengthMax = nationalLengthMax;
           this.areaCodeLengthMax = areaCodeLengthMax;
           this.subscriberLengthMax = subscriberLengthMax;
           this.exchangeLengthMax = exchangeLengthMax;
           this.lineLengthMax = lineLengthMax;
           this.privateLengthMin = privateLengthMin;
           this.privateLengthMax = privateLengthMax;
           this.prefixProfileId = prefixProfileId;
           this.analysisType = analysisType;
           this.clipPrefix = clipPrefix;
           this.clirPrefix = clirPrefix;
           this.enblocProfileId = enblocProfileId;
    }


    /**
     * Gets the numberingPlanId value for this NumberingPlan.
     * 
     * @return numberingPlanId
     */
    public java.lang.String getNumberingPlanId() {
        return numberingPlanId;
    }


    /**
     * Sets the numberingPlanId value for this NumberingPlan.
     * 
     * @param numberingPlanId
     */
    public void setNumberingPlanId(java.lang.String numberingPlanId) {
        this.numberingPlanId = numberingPlanId;
    }


    /**
     * Gets the nationalLength value for this NumberingPlan.
     * 
     * @return nationalLength
     */
    public java.lang.Short getNationalLength() {
        return nationalLength;
    }


    /**
     * Sets the nationalLength value for this NumberingPlan.
     * 
     * @param nationalLength
     */
    public void setNationalLength(java.lang.Short nationalLength) {
        this.nationalLength = nationalLength;
    }


    /**
     * Gets the areaCodeLength value for this NumberingPlan.
     * 
     * @return areaCodeLength
     */
    public java.lang.Short getAreaCodeLength() {
        return areaCodeLength;
    }


    /**
     * Sets the areaCodeLength value for this NumberingPlan.
     * 
     * @param areaCodeLength
     */
    public void setAreaCodeLength(java.lang.Short areaCodeLength) {
        this.areaCodeLength = areaCodeLength;
    }


    /**
     * Gets the subscriberLength value for this NumberingPlan.
     * 
     * @return subscriberLength
     */
    public java.lang.Short getSubscriberLength() {
        return subscriberLength;
    }


    /**
     * Sets the subscriberLength value for this NumberingPlan.
     * 
     * @param subscriberLength
     */
    public void setSubscriberLength(java.lang.Short subscriberLength) {
        this.subscriberLength = subscriberLength;
    }


    /**
     * Gets the exchangeLength value for this NumberingPlan.
     * 
     * @return exchangeLength
     */
    public java.lang.Short getExchangeLength() {
        return exchangeLength;
    }


    /**
     * Sets the exchangeLength value for this NumberingPlan.
     * 
     * @param exchangeLength
     */
    public void setExchangeLength(java.lang.Short exchangeLength) {
        this.exchangeLength = exchangeLength;
    }


    /**
     * Gets the lineLength value for this NumberingPlan.
     * 
     * @return lineLength
     */
    public java.lang.Short getLineLength() {
        return lineLength;
    }


    /**
     * Sets the lineLength value for this NumberingPlan.
     * 
     * @param lineLength
     */
    public void setLineLength(java.lang.Short lineLength) {
        this.lineLength = lineLength;
    }


    /**
     * Gets the analyzeFlags value for this NumberingPlan.
     * 
     * @return analyzeFlags
     */
    public java.lang.Short getAnalyzeFlags() {
        return analyzeFlags;
    }


    /**
     * Sets the analyzeFlags value for this NumberingPlan.
     * 
     * @param analyzeFlags
     */
    public void setAnalyzeFlags(java.lang.Short analyzeFlags) {
        this.analyzeFlags = analyzeFlags;
    }


    /**
     * Gets the reFacilityCode value for this NumberingPlan.
     * 
     * @return reFacilityCode
     */
    public java.lang.String getReFacilityCode() {
        return reFacilityCode;
    }


    /**
     * Sets the reFacilityCode value for this NumberingPlan.
     * 
     * @param reFacilityCode
     */
    public void setReFacilityCode(java.lang.String reFacilityCode) {
        this.reFacilityCode = reFacilityCode;
    }


    /**
     * Gets the reCarrierCode value for this NumberingPlan.
     * 
     * @return reCarrierCode
     */
    public java.lang.String getReCarrierCode() {
        return reCarrierCode;
    }


    /**
     * Sets the reCarrierCode value for this NumberingPlan.
     * 
     * @param reCarrierCode
     */
    public void setReCarrierCode(java.lang.String reCarrierCode) {
        this.reCarrierCode = reCarrierCode;
    }


    /**
     * Gets the reVsc value for this NumberingPlan.
     * 
     * @return reVsc
     */
    public java.lang.String getReVsc() {
        return reVsc;
    }


    /**
     * Sets the reVsc value for this NumberingPlan.
     * 
     * @param reVsc
     */
    public void setReVsc(java.lang.String reVsc) {
        this.reVsc = reVsc;
    }


    /**
     * Gets the reEmergency value for this NumberingPlan.
     * 
     * @return reEmergency
     */
    public java.lang.String getReEmergency() {
        return reEmergency;
    }


    /**
     * Sets the reEmergency value for this NumberingPlan.
     * 
     * @param reEmergency
     */
    public void setReEmergency(java.lang.String reEmergency) {
        this.reEmergency = reEmergency;
    }


    /**
     * Gets the reDa value for this NumberingPlan.
     * 
     * @return reDa
     */
    public java.lang.String getReDa() {
        return reDa;
    }


    /**
     * Sets the reDa value for this NumberingPlan.
     * 
     * @param reDa
     */
    public void setReDa(java.lang.String reDa) {
        this.reDa = reDa;
    }


    /**
     * Gets the reEin value for this NumberingPlan.
     * 
     * @return reEin
     */
    public java.lang.String getReEin() {
        return reEin;
    }


    /**
     * Sets the reEin value for this NumberingPlan.
     * 
     * @param reEin
     */
    public void setReEin(java.lang.String reEin) {
        this.reEin = reEin;
    }


    /**
     * Gets the rePrefix value for this NumberingPlan.
     * 
     * @return rePrefix
     */
    public java.lang.String getRePrefix() {
        return rePrefix;
    }


    /**
     * Sets the rePrefix value for this NumberingPlan.
     * 
     * @param rePrefix
     */
    public void setRePrefix(java.lang.String rePrefix) {
        this.rePrefix = rePrefix;
    }


    /**
     * Gets the reNational value for this NumberingPlan.
     * 
     * @return reNational
     */
    public java.lang.String getReNational() {
        return reNational;
    }


    /**
     * Sets the reNational value for this NumberingPlan.
     * 
     * @param reNational
     */
    public void setReNational(java.lang.String reNational) {
        this.reNational = reNational;
    }


    /**
     * Gets the reNationalOperator value for this NumberingPlan.
     * 
     * @return reNationalOperator
     */
    public java.lang.String getReNationalOperator() {
        return reNationalOperator;
    }


    /**
     * Sets the reNationalOperator value for this NumberingPlan.
     * 
     * @param reNationalOperator
     */
    public void setReNationalOperator(java.lang.String reNationalOperator) {
        this.reNationalOperator = reNationalOperator;
    }


    /**
     * Gets the reInternational value for this NumberingPlan.
     * 
     * @return reInternational
     */
    public java.lang.String getReInternational() {
        return reInternational;
    }


    /**
     * Sets the reInternational value for this NumberingPlan.
     * 
     * @param reInternational
     */
    public void setReInternational(java.lang.String reInternational) {
        this.reInternational = reInternational;
    }


    /**
     * Gets the reInternationalOperator value for this NumberingPlan.
     * 
     * @return reInternationalOperator
     */
    public java.lang.String getReInternationalOperator() {
        return reInternationalOperator;
    }


    /**
     * Sets the reInternationalOperator value for this NumberingPlan.
     * 
     * @param reInternationalOperator
     */
    public void setReInternationalOperator(java.lang.String reInternationalOperator) {
        this.reInternationalOperator = reInternationalOperator;
    }


    /**
     * Gets the reTollFree value for this NumberingPlan.
     * 
     * @return reTollFree
     */
    public java.lang.String getReTollFree() {
        return reTollFree;
    }


    /**
     * Sets the reTollFree value for this NumberingPlan.
     * 
     * @param reTollFree
     */
    public void setReTollFree(java.lang.String reTollFree) {
        this.reTollFree = reTollFree;
    }


    /**
     * Gets the re900 value for this NumberingPlan.
     * 
     * @return re900
     */
    public java.lang.String getRe900() {
        return re900;
    }


    /**
     * Sets the re900 value for this NumberingPlan.
     * 
     * @param re900
     */
    public void setRe900(java.lang.String re900) {
        this.re900 = re900;
    }


    /**
     * Gets the reNpa value for this NumberingPlan.
     * 
     * @return reNpa
     */
    public java.lang.String getReNpa() {
        return reNpa;
    }


    /**
     * Sets the reNpa value for this NumberingPlan.
     * 
     * @param reNpa
     */
    public void setReNpa(java.lang.String reNpa) {
        this.reNpa = reNpa;
    }


    /**
     * Gets the reNxx value for this NumberingPlan.
     * 
     * @return reNxx
     */
    public java.lang.String getReNxx() {
        return reNxx;
    }


    /**
     * Sets the reNxx value for this NumberingPlan.
     * 
     * @param reNxx
     */
    public void setReNxx(java.lang.String reNxx) {
        this.reNxx = reNxx;
    }


    /**
     * Gets the reLine value for this NumberingPlan.
     * 
     * @return reLine
     */
    public java.lang.String getReLine() {
        return reLine;
    }


    /**
     * Sets the reLine value for this NumberingPlan.
     * 
     * @param reLine
     */
    public void setReLine(java.lang.String reLine) {
        this.reLine = reLine;
    }


    /**
     * Gets the reNpaNxxLine value for this NumberingPlan.
     * 
     * @return reNpaNxxLine
     */
    public java.lang.String getReNpaNxxLine() {
        return reNpaNxxLine;
    }


    /**
     * Sets the reNpaNxxLine value for this NumberingPlan.
     * 
     * @param reNpaNxxLine
     */
    public void setReNpaNxxLine(java.lang.String reNpaNxxLine) {
        this.reNpaNxxLine = reNpaNxxLine;
    }


    /**
     * Gets the reNxxLine value for this NumberingPlan.
     * 
     * @return reNxxLine
     */
    public java.lang.String getReNxxLine() {
        return reNxxLine;
    }


    /**
     * Sets the reNxxLine value for this NumberingPlan.
     * 
     * @param reNxxLine
     */
    public void setReNxxLine(java.lang.String reNxxLine) {
        this.reNxxLine = reNxxLine;
    }


    /**
     * Gets the re950 value for this NumberingPlan.
     * 
     * @return re950
     */
    public java.lang.String getRe950() {
        return re950;
    }


    /**
     * Sets the re950 value for this NumberingPlan.
     * 
     * @param re950
     */
    public void setRe950(java.lang.String re950) {
        this.re950 = re950;
    }


    /**
     * Gets the reAll value for this NumberingPlan.
     * 
     * @return reAll
     */
    public java.lang.String getReAll() {
        return reAll;
    }


    /**
     * Sets the reAll value for this NumberingPlan.
     * 
     * @param reAll
     */
    public void setReAll(java.lang.String reAll) {
        this.reAll = reAll;
    }


    /**
     * Gets the reLecOperator value for this NumberingPlan.
     * 
     * @return reLecOperator
     */
    public java.lang.String getReLecOperator() {
        return reLecOperator;
    }


    /**
     * Sets the reLecOperator value for this NumberingPlan.
     * 
     * @param reLecOperator
     */
    public void setReLecOperator(java.lang.String reLecOperator) {
        this.reLecOperator = reLecOperator;
    }


    /**
     * Gets the reIxcOperator value for this NumberingPlan.
     * 
     * @return reIxcOperator
     */
    public java.lang.String getReIxcOperator() {
        return reIxcOperator;
    }


    /**
     * Sets the reIxcOperator value for this NumberingPlan.
     * 
     * @param reIxcOperator
     */
    public void setReIxcOperator(java.lang.String reIxcOperator) {
        this.reIxcOperator = reIxcOperator;
    }


    /**
     * Gets the re10XxxCarrierCode value for this NumberingPlan.
     * 
     * @return re10XxxCarrierCode
     */
    public java.lang.String getRe10XxxCarrierCode() {
        return re10XxxCarrierCode;
    }


    /**
     * Sets the re10XxxCarrierCode value for this NumberingPlan.
     * 
     * @param re10XxxCarrierCode
     */
    public void setRe10XxxCarrierCode(java.lang.String re10XxxCarrierCode) {
        this.re10XxxCarrierCode = re10XxxCarrierCode;
    }


    /**
     * Gets the reSac value for this NumberingPlan.
     * 
     * @return reSac
     */
    public java.lang.String getReSac() {
        return reSac;
    }


    /**
     * Sets the reSac value for this NumberingPlan.
     * 
     * @param reSac
     */
    public void setReSac(java.lang.String reSac) {
        this.reSac = reSac;
    }


    /**
     * Gets the privateCallDetermination value for this NumberingPlan.
     * 
     * @return privateCallDetermination
     */
    public java.lang.Short getPrivateCallDetermination() {
        return privateCallDetermination;
    }


    /**
     * Sets the privateCallDetermination value for this NumberingPlan.
     * 
     * @param privateCallDetermination
     */
    public void setPrivateCallDetermination(java.lang.Short privateCallDetermination) {
        this.privateCallDetermination = privateCallDetermination;
    }


    /**
     * Gets the privateCallLdigits value for this NumberingPlan.
     * 
     * @return privateCallLdigits
     */
    public java.lang.String getPrivateCallLdigits() {
        return privateCallLdigits;
    }


    /**
     * Sets the privateCallLdigits value for this NumberingPlan.
     * 
     * @param privateCallLdigits
     */
    public void setPrivateCallLdigits(java.lang.String privateCallLdigits) {
        this.privateCallLdigits = privateCallLdigits;
    }


    /**
     * Gets the privateCallLdigitsRmFlag value for this NumberingPlan.
     * 
     * @return privateCallLdigitsRmFlag
     */
    public java.lang.Short getPrivateCallLdigitsRmFlag() {
        return privateCallLdigitsRmFlag;
    }


    /**
     * Sets the privateCallLdigitsRmFlag value for this NumberingPlan.
     * 
     * @param privateCallLdigitsRmFlag
     */
    public void setPrivateCallLdigitsRmFlag(java.lang.Short privateCallLdigitsRmFlag) {
        this.privateCallLdigitsRmFlag = privateCallLdigitsRmFlag;
    }


    /**
     * Gets the publicCallLdigits value for this NumberingPlan.
     * 
     * @return publicCallLdigits
     */
    public java.lang.String getPublicCallLdigits() {
        return publicCallLdigits;
    }


    /**
     * Sets the publicCallLdigits value for this NumberingPlan.
     * 
     * @param publicCallLdigits
     */
    public void setPublicCallLdigits(java.lang.String publicCallLdigits) {
        this.publicCallLdigits = publicCallLdigits;
    }


    /**
     * Gets the publicCallLdigitsRmFlag value for this NumberingPlan.
     * 
     * @return publicCallLdigitsRmFlag
     */
    public java.lang.Short getPublicCallLdigitsRmFlag() {
        return publicCallLdigitsRmFlag;
    }


    /**
     * Sets the publicCallLdigitsRmFlag value for this NumberingPlan.
     * 
     * @param publicCallLdigitsRmFlag
     */
    public void setPublicCallLdigitsRmFlag(java.lang.Short publicCallLdigitsRmFlag) {
        this.publicCallLdigitsRmFlag = publicCallLdigitsRmFlag;
    }


    /**
     * Gets the privateCallNumberMatching value for this NumberingPlan.
     * 
     * @return privateCallNumberMatching
     */
    public java.lang.String getPrivateCallNumberMatching() {
        return privateCallNumberMatching;
    }


    /**
     * Sets the privateCallNumberMatching value for this NumberingPlan.
     * 
     * @param privateCallNumberMatching
     */
    public void setPrivateCallNumberMatching(java.lang.String privateCallNumberMatching) {
        this.privateCallNumberMatching = privateCallNumberMatching;
    }


    /**
     * Gets the privateCallNpi value for this NumberingPlan.
     * 
     * @return privateCallNpi
     */
    public java.lang.Short getPrivateCallNpi() {
        return privateCallNpi;
    }


    /**
     * Sets the privateCallNpi value for this NumberingPlan.
     * 
     * @param privateCallNpi
     */
    public void setPrivateCallNpi(java.lang.Short privateCallNpi) {
        this.privateCallNpi = privateCallNpi;
    }


    /**
     * Gets the privateCallNoa value for this NumberingPlan.
     * 
     * @return privateCallNoa
     */
    public java.lang.Short getPrivateCallNoa() {
        return privateCallNoa;
    }


    /**
     * Sets the privateCallNoa value for this NumberingPlan.
     * 
     * @param privateCallNoa
     */
    public void setPrivateCallNoa(java.lang.Short privateCallNoa) {
        this.privateCallNoa = privateCallNoa;
    }


    /**
     * Gets the pmRuleId value for this NumberingPlan.
     * 
     * @return pmRuleId
     */
    public java.lang.String getPmRuleId() {
        return pmRuleId;
    }


    /**
     * Sets the pmRuleId value for this NumberingPlan.
     * 
     * @param pmRuleId
     */
    public void setPmRuleId(java.lang.String pmRuleId) {
        this.pmRuleId = pmRuleId;
    }


    /**
     * Gets the attributes value for this NumberingPlan.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this NumberingPlan.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the nationalLengthMax value for this NumberingPlan.
     * 
     * @return nationalLengthMax
     */
    public java.lang.Short getNationalLengthMax() {
        return nationalLengthMax;
    }


    /**
     * Sets the nationalLengthMax value for this NumberingPlan.
     * 
     * @param nationalLengthMax
     */
    public void setNationalLengthMax(java.lang.Short nationalLengthMax) {
        this.nationalLengthMax = nationalLengthMax;
    }


    /**
     * Gets the areaCodeLengthMax value for this NumberingPlan.
     * 
     * @return areaCodeLengthMax
     */
    public java.lang.Short getAreaCodeLengthMax() {
        return areaCodeLengthMax;
    }


    /**
     * Sets the areaCodeLengthMax value for this NumberingPlan.
     * 
     * @param areaCodeLengthMax
     */
    public void setAreaCodeLengthMax(java.lang.Short areaCodeLengthMax) {
        this.areaCodeLengthMax = areaCodeLengthMax;
    }


    /**
     * Gets the subscriberLengthMax value for this NumberingPlan.
     * 
     * @return subscriberLengthMax
     */
    public java.lang.Short getSubscriberLengthMax() {
        return subscriberLengthMax;
    }


    /**
     * Sets the subscriberLengthMax value for this NumberingPlan.
     * 
     * @param subscriberLengthMax
     */
    public void setSubscriberLengthMax(java.lang.Short subscriberLengthMax) {
        this.subscriberLengthMax = subscriberLengthMax;
    }


    /**
     * Gets the exchangeLengthMax value for this NumberingPlan.
     * 
     * @return exchangeLengthMax
     */
    public java.lang.Short getExchangeLengthMax() {
        return exchangeLengthMax;
    }


    /**
     * Sets the exchangeLengthMax value for this NumberingPlan.
     * 
     * @param exchangeLengthMax
     */
    public void setExchangeLengthMax(java.lang.Short exchangeLengthMax) {
        this.exchangeLengthMax = exchangeLengthMax;
    }


    /**
     * Gets the lineLengthMax value for this NumberingPlan.
     * 
     * @return lineLengthMax
     */
    public java.lang.Short getLineLengthMax() {
        return lineLengthMax;
    }


    /**
     * Sets the lineLengthMax value for this NumberingPlan.
     * 
     * @param lineLengthMax
     */
    public void setLineLengthMax(java.lang.Short lineLengthMax) {
        this.lineLengthMax = lineLengthMax;
    }


    /**
     * Gets the privateLengthMin value for this NumberingPlan.
     * 
     * @return privateLengthMin
     */
    public java.lang.Short getPrivateLengthMin() {
        return privateLengthMin;
    }


    /**
     * Sets the privateLengthMin value for this NumberingPlan.
     * 
     * @param privateLengthMin
     */
    public void setPrivateLengthMin(java.lang.Short privateLengthMin) {
        this.privateLengthMin = privateLengthMin;
    }


    /**
     * Gets the privateLengthMax value for this NumberingPlan.
     * 
     * @return privateLengthMax
     */
    public java.lang.Short getPrivateLengthMax() {
        return privateLengthMax;
    }


    /**
     * Sets the privateLengthMax value for this NumberingPlan.
     * 
     * @param privateLengthMax
     */
    public void setPrivateLengthMax(java.lang.Short privateLengthMax) {
        this.privateLengthMax = privateLengthMax;
    }


    /**
     * Gets the prefixProfileId value for this NumberingPlan.
     * 
     * @return prefixProfileId
     */
    public java.lang.String getPrefixProfileId() {
        return prefixProfileId;
    }


    /**
     * Sets the prefixProfileId value for this NumberingPlan.
     * 
     * @param prefixProfileId
     */
    public void setPrefixProfileId(java.lang.String prefixProfileId) {
        this.prefixProfileId = prefixProfileId;
    }


    /**
     * Gets the analysisType value for this NumberingPlan.
     * 
     * @return analysisType
     */
    public java.lang.Short getAnalysisType() {
        return analysisType;
    }


    /**
     * Sets the analysisType value for this NumberingPlan.
     * 
     * @param analysisType
     */
    public void setAnalysisType(java.lang.Short analysisType) {
        this.analysisType = analysisType;
    }


    /**
     * Gets the clipPrefix value for this NumberingPlan.
     * 
     * @return clipPrefix
     */
    public java.lang.String getClipPrefix() {
        return clipPrefix;
    }


    /**
     * Sets the clipPrefix value for this NumberingPlan.
     * 
     * @param clipPrefix
     */
    public void setClipPrefix(java.lang.String clipPrefix) {
        this.clipPrefix = clipPrefix;
    }


    /**
     * Gets the clirPrefix value for this NumberingPlan.
     * 
     * @return clirPrefix
     */
    public java.lang.String getClirPrefix() {
        return clirPrefix;
    }


    /**
     * Sets the clirPrefix value for this NumberingPlan.
     * 
     * @param clirPrefix
     */
    public void setClirPrefix(java.lang.String clirPrefix) {
        this.clirPrefix = clirPrefix;
    }


    /**
     * Gets the enblocProfileId value for this NumberingPlan.
     * 
     * @return enblocProfileId
     */
    public java.lang.String getEnblocProfileId() {
        return enblocProfileId;
    }


    /**
     * Sets the enblocProfileId value for this NumberingPlan.
     * 
     * @param enblocProfileId
     */
    public void setEnblocProfileId(java.lang.String enblocProfileId) {
        this.enblocProfileId = enblocProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumberingPlan)) return false;
        NumberingPlan other = (NumberingPlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numberingPlanId==null && other.getNumberingPlanId()==null) || 
             (this.numberingPlanId!=null &&
              this.numberingPlanId.equals(other.getNumberingPlanId()))) &&
            ((this.nationalLength==null && other.getNationalLength()==null) || 
             (this.nationalLength!=null &&
              this.nationalLength.equals(other.getNationalLength()))) &&
            ((this.areaCodeLength==null && other.getAreaCodeLength()==null) || 
             (this.areaCodeLength!=null &&
              this.areaCodeLength.equals(other.getAreaCodeLength()))) &&
            ((this.subscriberLength==null && other.getSubscriberLength()==null) || 
             (this.subscriberLength!=null &&
              this.subscriberLength.equals(other.getSubscriberLength()))) &&
            ((this.exchangeLength==null && other.getExchangeLength()==null) || 
             (this.exchangeLength!=null &&
              this.exchangeLength.equals(other.getExchangeLength()))) &&
            ((this.lineLength==null && other.getLineLength()==null) || 
             (this.lineLength!=null &&
              this.lineLength.equals(other.getLineLength()))) &&
            ((this.analyzeFlags==null && other.getAnalyzeFlags()==null) || 
             (this.analyzeFlags!=null &&
              this.analyzeFlags.equals(other.getAnalyzeFlags()))) &&
            ((this.reFacilityCode==null && other.getReFacilityCode()==null) || 
             (this.reFacilityCode!=null &&
              this.reFacilityCode.equals(other.getReFacilityCode()))) &&
            ((this.reCarrierCode==null && other.getReCarrierCode()==null) || 
             (this.reCarrierCode!=null &&
              this.reCarrierCode.equals(other.getReCarrierCode()))) &&
            ((this.reVsc==null && other.getReVsc()==null) || 
             (this.reVsc!=null &&
              this.reVsc.equals(other.getReVsc()))) &&
            ((this.reEmergency==null && other.getReEmergency()==null) || 
             (this.reEmergency!=null &&
              this.reEmergency.equals(other.getReEmergency()))) &&
            ((this.reDa==null && other.getReDa()==null) || 
             (this.reDa!=null &&
              this.reDa.equals(other.getReDa()))) &&
            ((this.reEin==null && other.getReEin()==null) || 
             (this.reEin!=null &&
              this.reEin.equals(other.getReEin()))) &&
            ((this.rePrefix==null && other.getRePrefix()==null) || 
             (this.rePrefix!=null &&
              this.rePrefix.equals(other.getRePrefix()))) &&
            ((this.reNational==null && other.getReNational()==null) || 
             (this.reNational!=null &&
              this.reNational.equals(other.getReNational()))) &&
            ((this.reNationalOperator==null && other.getReNationalOperator()==null) || 
             (this.reNationalOperator!=null &&
              this.reNationalOperator.equals(other.getReNationalOperator()))) &&
            ((this.reInternational==null && other.getReInternational()==null) || 
             (this.reInternational!=null &&
              this.reInternational.equals(other.getReInternational()))) &&
            ((this.reInternationalOperator==null && other.getReInternationalOperator()==null) || 
             (this.reInternationalOperator!=null &&
              this.reInternationalOperator.equals(other.getReInternationalOperator()))) &&
            ((this.reTollFree==null && other.getReTollFree()==null) || 
             (this.reTollFree!=null &&
              this.reTollFree.equals(other.getReTollFree()))) &&
            ((this.re900==null && other.getRe900()==null) || 
             (this.re900!=null &&
              this.re900.equals(other.getRe900()))) &&
            ((this.reNpa==null && other.getReNpa()==null) || 
             (this.reNpa!=null &&
              this.reNpa.equals(other.getReNpa()))) &&
            ((this.reNxx==null && other.getReNxx()==null) || 
             (this.reNxx!=null &&
              this.reNxx.equals(other.getReNxx()))) &&
            ((this.reLine==null && other.getReLine()==null) || 
             (this.reLine!=null &&
              this.reLine.equals(other.getReLine()))) &&
            ((this.reNpaNxxLine==null && other.getReNpaNxxLine()==null) || 
             (this.reNpaNxxLine!=null &&
              this.reNpaNxxLine.equals(other.getReNpaNxxLine()))) &&
            ((this.reNxxLine==null && other.getReNxxLine()==null) || 
             (this.reNxxLine!=null &&
              this.reNxxLine.equals(other.getReNxxLine()))) &&
            ((this.re950==null && other.getRe950()==null) || 
             (this.re950!=null &&
              this.re950.equals(other.getRe950()))) &&
            ((this.reAll==null && other.getReAll()==null) || 
             (this.reAll!=null &&
              this.reAll.equals(other.getReAll()))) &&
            ((this.reLecOperator==null && other.getReLecOperator()==null) || 
             (this.reLecOperator!=null &&
              this.reLecOperator.equals(other.getReLecOperator()))) &&
            ((this.reIxcOperator==null && other.getReIxcOperator()==null) || 
             (this.reIxcOperator!=null &&
              this.reIxcOperator.equals(other.getReIxcOperator()))) &&
            ((this.re10XxxCarrierCode==null && other.getRe10XxxCarrierCode()==null) || 
             (this.re10XxxCarrierCode!=null &&
              this.re10XxxCarrierCode.equals(other.getRe10XxxCarrierCode()))) &&
            ((this.reSac==null && other.getReSac()==null) || 
             (this.reSac!=null &&
              this.reSac.equals(other.getReSac()))) &&
            ((this.privateCallDetermination==null && other.getPrivateCallDetermination()==null) || 
             (this.privateCallDetermination!=null &&
              this.privateCallDetermination.equals(other.getPrivateCallDetermination()))) &&
            ((this.privateCallLdigits==null && other.getPrivateCallLdigits()==null) || 
             (this.privateCallLdigits!=null &&
              this.privateCallLdigits.equals(other.getPrivateCallLdigits()))) &&
            ((this.privateCallLdigitsRmFlag==null && other.getPrivateCallLdigitsRmFlag()==null) || 
             (this.privateCallLdigitsRmFlag!=null &&
              this.privateCallLdigitsRmFlag.equals(other.getPrivateCallLdigitsRmFlag()))) &&
            ((this.publicCallLdigits==null && other.getPublicCallLdigits()==null) || 
             (this.publicCallLdigits!=null &&
              this.publicCallLdigits.equals(other.getPublicCallLdigits()))) &&
            ((this.publicCallLdigitsRmFlag==null && other.getPublicCallLdigitsRmFlag()==null) || 
             (this.publicCallLdigitsRmFlag!=null &&
              this.publicCallLdigitsRmFlag.equals(other.getPublicCallLdigitsRmFlag()))) &&
            ((this.privateCallNumberMatching==null && other.getPrivateCallNumberMatching()==null) || 
             (this.privateCallNumberMatching!=null &&
              this.privateCallNumberMatching.equals(other.getPrivateCallNumberMatching()))) &&
            ((this.privateCallNpi==null && other.getPrivateCallNpi()==null) || 
             (this.privateCallNpi!=null &&
              this.privateCallNpi.equals(other.getPrivateCallNpi()))) &&
            ((this.privateCallNoa==null && other.getPrivateCallNoa()==null) || 
             (this.privateCallNoa!=null &&
              this.privateCallNoa.equals(other.getPrivateCallNoa()))) &&
            ((this.pmRuleId==null && other.getPmRuleId()==null) || 
             (this.pmRuleId!=null &&
              this.pmRuleId.equals(other.getPmRuleId()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.nationalLengthMax==null && other.getNationalLengthMax()==null) || 
             (this.nationalLengthMax!=null &&
              this.nationalLengthMax.equals(other.getNationalLengthMax()))) &&
            ((this.areaCodeLengthMax==null && other.getAreaCodeLengthMax()==null) || 
             (this.areaCodeLengthMax!=null &&
              this.areaCodeLengthMax.equals(other.getAreaCodeLengthMax()))) &&
            ((this.subscriberLengthMax==null && other.getSubscriberLengthMax()==null) || 
             (this.subscriberLengthMax!=null &&
              this.subscriberLengthMax.equals(other.getSubscriberLengthMax()))) &&
            ((this.exchangeLengthMax==null && other.getExchangeLengthMax()==null) || 
             (this.exchangeLengthMax!=null &&
              this.exchangeLengthMax.equals(other.getExchangeLengthMax()))) &&
            ((this.lineLengthMax==null && other.getLineLengthMax()==null) || 
             (this.lineLengthMax!=null &&
              this.lineLengthMax.equals(other.getLineLengthMax()))) &&
            ((this.privateLengthMin==null && other.getPrivateLengthMin()==null) || 
             (this.privateLengthMin!=null &&
              this.privateLengthMin.equals(other.getPrivateLengthMin()))) &&
            ((this.privateLengthMax==null && other.getPrivateLengthMax()==null) || 
             (this.privateLengthMax!=null &&
              this.privateLengthMax.equals(other.getPrivateLengthMax()))) &&
            ((this.prefixProfileId==null && other.getPrefixProfileId()==null) || 
             (this.prefixProfileId!=null &&
              this.prefixProfileId.equals(other.getPrefixProfileId()))) &&
            ((this.analysisType==null && other.getAnalysisType()==null) || 
             (this.analysisType!=null &&
              this.analysisType.equals(other.getAnalysisType()))) &&
            ((this.clipPrefix==null && other.getClipPrefix()==null) || 
             (this.clipPrefix!=null &&
              this.clipPrefix.equals(other.getClipPrefix()))) &&
            ((this.clirPrefix==null && other.getClirPrefix()==null) || 
             (this.clirPrefix!=null &&
              this.clirPrefix.equals(other.getClirPrefix()))) &&
            ((this.enblocProfileId==null && other.getEnblocProfileId()==null) || 
             (this.enblocProfileId!=null &&
              this.enblocProfileId.equals(other.getEnblocProfileId())));
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
        if (getNumberingPlanId() != null) {
            _hashCode += getNumberingPlanId().hashCode();
        }
        if (getNationalLength() != null) {
            _hashCode += getNationalLength().hashCode();
        }
        if (getAreaCodeLength() != null) {
            _hashCode += getAreaCodeLength().hashCode();
        }
        if (getSubscriberLength() != null) {
            _hashCode += getSubscriberLength().hashCode();
        }
        if (getExchangeLength() != null) {
            _hashCode += getExchangeLength().hashCode();
        }
        if (getLineLength() != null) {
            _hashCode += getLineLength().hashCode();
        }
        if (getAnalyzeFlags() != null) {
            _hashCode += getAnalyzeFlags().hashCode();
        }
        if (getReFacilityCode() != null) {
            _hashCode += getReFacilityCode().hashCode();
        }
        if (getReCarrierCode() != null) {
            _hashCode += getReCarrierCode().hashCode();
        }
        if (getReVsc() != null) {
            _hashCode += getReVsc().hashCode();
        }
        if (getReEmergency() != null) {
            _hashCode += getReEmergency().hashCode();
        }
        if (getReDa() != null) {
            _hashCode += getReDa().hashCode();
        }
        if (getReEin() != null) {
            _hashCode += getReEin().hashCode();
        }
        if (getRePrefix() != null) {
            _hashCode += getRePrefix().hashCode();
        }
        if (getReNational() != null) {
            _hashCode += getReNational().hashCode();
        }
        if (getReNationalOperator() != null) {
            _hashCode += getReNationalOperator().hashCode();
        }
        if (getReInternational() != null) {
            _hashCode += getReInternational().hashCode();
        }
        if (getReInternationalOperator() != null) {
            _hashCode += getReInternationalOperator().hashCode();
        }
        if (getReTollFree() != null) {
            _hashCode += getReTollFree().hashCode();
        }
        if (getRe900() != null) {
            _hashCode += getRe900().hashCode();
        }
        if (getReNpa() != null) {
            _hashCode += getReNpa().hashCode();
        }
        if (getReNxx() != null) {
            _hashCode += getReNxx().hashCode();
        }
        if (getReLine() != null) {
            _hashCode += getReLine().hashCode();
        }
        if (getReNpaNxxLine() != null) {
            _hashCode += getReNpaNxxLine().hashCode();
        }
        if (getReNxxLine() != null) {
            _hashCode += getReNxxLine().hashCode();
        }
        if (getRe950() != null) {
            _hashCode += getRe950().hashCode();
        }
        if (getReAll() != null) {
            _hashCode += getReAll().hashCode();
        }
        if (getReLecOperator() != null) {
            _hashCode += getReLecOperator().hashCode();
        }
        if (getReIxcOperator() != null) {
            _hashCode += getReIxcOperator().hashCode();
        }
        if (getRe10XxxCarrierCode() != null) {
            _hashCode += getRe10XxxCarrierCode().hashCode();
        }
        if (getReSac() != null) {
            _hashCode += getReSac().hashCode();
        }
        if (getPrivateCallDetermination() != null) {
            _hashCode += getPrivateCallDetermination().hashCode();
        }
        if (getPrivateCallLdigits() != null) {
            _hashCode += getPrivateCallLdigits().hashCode();
        }
        if (getPrivateCallLdigitsRmFlag() != null) {
            _hashCode += getPrivateCallLdigitsRmFlag().hashCode();
        }
        if (getPublicCallLdigits() != null) {
            _hashCode += getPublicCallLdigits().hashCode();
        }
        if (getPublicCallLdigitsRmFlag() != null) {
            _hashCode += getPublicCallLdigitsRmFlag().hashCode();
        }
        if (getPrivateCallNumberMatching() != null) {
            _hashCode += getPrivateCallNumberMatching().hashCode();
        }
        if (getPrivateCallNpi() != null) {
            _hashCode += getPrivateCallNpi().hashCode();
        }
        if (getPrivateCallNoa() != null) {
            _hashCode += getPrivateCallNoa().hashCode();
        }
        if (getPmRuleId() != null) {
            _hashCode += getPmRuleId().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getNationalLengthMax() != null) {
            _hashCode += getNationalLengthMax().hashCode();
        }
        if (getAreaCodeLengthMax() != null) {
            _hashCode += getAreaCodeLengthMax().hashCode();
        }
        if (getSubscriberLengthMax() != null) {
            _hashCode += getSubscriberLengthMax().hashCode();
        }
        if (getExchangeLengthMax() != null) {
            _hashCode += getExchangeLengthMax().hashCode();
        }
        if (getLineLengthMax() != null) {
            _hashCode += getLineLengthMax().hashCode();
        }
        if (getPrivateLengthMin() != null) {
            _hashCode += getPrivateLengthMin().hashCode();
        }
        if (getPrivateLengthMax() != null) {
            _hashCode += getPrivateLengthMax().hashCode();
        }
        if (getPrefixProfileId() != null) {
            _hashCode += getPrefixProfileId().hashCode();
        }
        if (getAnalysisType() != null) {
            _hashCode += getAnalysisType().hashCode();
        }
        if (getClipPrefix() != null) {
            _hashCode += getClipPrefix().hashCode();
        }
        if (getClirPrefix() != null) {
            _hashCode += getClirPrefix().hashCode();
        }
        if (getEnblocProfileId() != null) {
            _hashCode += getEnblocProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumberingPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberingPlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberingPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaCodeLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "areaCodeLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exchangeLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("analyzeFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "analyzeFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reFacilityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reFacilityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reCarrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reCarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reVsc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reVsc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reEmergency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reEmergency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reDa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reDa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reEin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reEin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reNational");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reNational"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reNationalOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reNationalOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reInternational");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reInternational"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reInternationalOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reInternationalOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reTollFree");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reTollFree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("re900");
        elemField.setXmlName(new javax.xml.namespace.QName("", "re900"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reNpa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reNpa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reNxx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reNxx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reNpaNxxLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reNpaNxxLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reNxxLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reNxxLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("re950");
        elemField.setXmlName(new javax.xml.namespace.QName("", "re950"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reAll");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reLecOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reLecOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reIxcOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reIxcOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("re10XxxCarrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "re10xxxCarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reSac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reSac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateCallDetermination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateCallDetermination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateCallLdigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateCallLdigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateCallLdigitsRmFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateCallLdigitsRmFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicCallLdigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicCallLdigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicCallLdigitsRmFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicCallLdigitsRmFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateCallNumberMatching");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateCallNumberMatching"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateCallNpi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateCallNpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateCallNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateCallNoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmRuleId"));
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
        elemField.setFieldName("nationalLengthMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalLengthMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaCodeLengthMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "areaCodeLengthMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberLengthMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberLengthMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeLengthMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exchangeLengthMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineLengthMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineLengthMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateLengthMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateLengthMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateLengthMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateLengthMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("analysisType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "analysisType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clipPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clipPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clirPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clirPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enblocProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enblocProfileId"));
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
