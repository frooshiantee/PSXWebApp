/**
 * SignalingProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SignalingProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String signalingProfileId;

    private java.lang.Short tnsInterLFlag;

    private java.lang.Short tnsIntraLFlag;

    private java.lang.Short tnsInterTFlag;

    private java.lang.Short tnsIntraTFlag;

    private java.lang.Short cipFlag;

    private java.lang.Short callingNumberFlag;

    private java.lang.Short callingNumber7DFlag;

    private java.lang.Short calledNumber7DFlag;

    private java.lang.Short chargeNumberFlag;

    private java.lang.Short olipFlag;

    private java.lang.Short cspFlag;

    private java.lang.Short jipFlag;

    private java.lang.Short inboundTnsAllowedFlag;

    private java.lang.Short natureOfAddress;

    private java.lang.Integer transitCarrierIndicator;

    private java.lang.Integer attributes;

    private java.lang.Integer genericNumber;

    private java.lang.Integer genericNumber2;

    private java.lang.Integer locationNumber;

    private java.lang.Integer redirectionNumber;

    private java.lang.Integer originalNumber;

    private java.lang.Integer redirectingNumber;

    private java.lang.Short genericDigitType;

    private java.lang.Integer attributes2;

    private java.lang.Integer attributes3;

    private java.lang.Integer attributes4;

    private java.lang.Integer attributes5;

    private java.lang.Short clip;

    private java.lang.String callingBillingControlId;

    private java.lang.Integer mobileCdOcnFlag;

    private java.lang.Integer mobileCdRedirectInfoFlag;

    private java.lang.Short ingressCftValue;

    private java.lang.Short egressCftValue;

    private java.lang.String tciProfileId;

    private java.lang.Integer contractorNumber;

    private java.lang.String redirectionInfoId;

    private java.lang.String numberControlProfileId;

    private java.lang.Integer fciIsupPreference;

    private java.lang.String carrierCodeProfileId;

    public SignalingProfile() {
    }

    public SignalingProfile(
           java.lang.String signalingProfileId,
           java.lang.Short tnsInterLFlag,
           java.lang.Short tnsIntraLFlag,
           java.lang.Short tnsInterTFlag,
           java.lang.Short tnsIntraTFlag,
           java.lang.Short cipFlag,
           java.lang.Short callingNumberFlag,
           java.lang.Short callingNumber7DFlag,
           java.lang.Short calledNumber7DFlag,
           java.lang.Short chargeNumberFlag,
           java.lang.Short olipFlag,
           java.lang.Short cspFlag,
           java.lang.Short jipFlag,
           java.lang.Short inboundTnsAllowedFlag,
           java.lang.Short natureOfAddress,
           java.lang.Integer transitCarrierIndicator,
           java.lang.Integer attributes,
           java.lang.Integer genericNumber,
           java.lang.Integer genericNumber2,
           java.lang.Integer locationNumber,
           java.lang.Integer redirectionNumber,
           java.lang.Integer originalNumber,
           java.lang.Integer redirectingNumber,
           java.lang.Short genericDigitType,
           java.lang.Integer attributes2,
           java.lang.Integer attributes3,
           java.lang.Integer attributes4,
           java.lang.Integer attributes5,
           java.lang.Short clip,
           java.lang.String callingBillingControlId,
           java.lang.Integer mobileCdOcnFlag,
           java.lang.Integer mobileCdRedirectInfoFlag,
           java.lang.Short ingressCftValue,
           java.lang.Short egressCftValue,
           java.lang.String tciProfileId,
           java.lang.Integer contractorNumber,
           java.lang.String redirectionInfoId,
           java.lang.String numberControlProfileId,
           java.lang.Integer fciIsupPreference,
           java.lang.String carrierCodeProfileId) {
        this.signalingProfileId = signalingProfileId;
        this.tnsInterLFlag = tnsInterLFlag;
        this.tnsIntraLFlag = tnsIntraLFlag;
        this.tnsInterTFlag = tnsInterTFlag;
        this.tnsIntraTFlag = tnsIntraTFlag;
        this.cipFlag = cipFlag;
        this.callingNumberFlag = callingNumberFlag;
        this.callingNumber7DFlag = callingNumber7DFlag;
        this.calledNumber7DFlag = calledNumber7DFlag;
        this.chargeNumberFlag = chargeNumberFlag;
        this.olipFlag = olipFlag;
        this.cspFlag = cspFlag;
        this.jipFlag = jipFlag;
        this.inboundTnsAllowedFlag = inboundTnsAllowedFlag;
        this.natureOfAddress = natureOfAddress;
        this.transitCarrierIndicator = transitCarrierIndicator;
        this.attributes = attributes;
        this.genericNumber = genericNumber;
        this.genericNumber2 = genericNumber2;
        this.locationNumber = locationNumber;
        this.redirectionNumber = redirectionNumber;
        this.originalNumber = originalNumber;
        this.redirectingNumber = redirectingNumber;
        this.genericDigitType = genericDigitType;
        this.attributes2 = attributes2;
        this.attributes3 = attributes3;
        this.attributes4 = attributes4;
        this.attributes5 = attributes5;
        this.clip = clip;
        this.callingBillingControlId = callingBillingControlId;
        this.mobileCdOcnFlag = mobileCdOcnFlag;
        this.mobileCdRedirectInfoFlag = mobileCdRedirectInfoFlag;
        this.ingressCftValue = ingressCftValue;
        this.egressCftValue = egressCftValue;
        this.tciProfileId = tciProfileId;
        this.contractorNumber = contractorNumber;
        this.redirectionInfoId = redirectionInfoId;
        this.numberControlProfileId = numberControlProfileId;
        this.fciIsupPreference = fciIsupPreference;
        this.carrierCodeProfileId = carrierCodeProfileId;
    }


    /**
     * Gets the signalingProfileId value for this SignalingProfile.
     * 
     * @return signalingProfileId
     */
    public java.lang.String getSignalingProfileId() {
        return signalingProfileId;
    }


    /**
     * Sets the signalingProfileId value for this SignalingProfile.
     * 
     * @param signalingProfileId
     */
    public void setSignalingProfileId(java.lang.String signalingProfileId) {
        this.signalingProfileId = signalingProfileId;
    }


    /**
     * Gets the tnsInterLFlag value for this SignalingProfile.
     * 
     * @return tnsInterLFlag
     */
    public java.lang.Short getTnsInterLFlag() {
        return tnsInterLFlag;
    }


    /**
     * Sets the tnsInterLFlag value for this SignalingProfile.
     * 
     * @param tnsInterLFlag
     */
    public void setTnsInterLFlag(java.lang.Short tnsInterLFlag) {
        this.tnsInterLFlag = tnsInterLFlag;
    }


    /**
     * Gets the tnsIntraLFlag value for this SignalingProfile.
     * 
     * @return tnsIntraLFlag
     */
    public java.lang.Short getTnsIntraLFlag() {
        return tnsIntraLFlag;
    }


    /**
     * Sets the tnsIntraLFlag value for this SignalingProfile.
     * 
     * @param tnsIntraLFlag
     */
    public void setTnsIntraLFlag(java.lang.Short tnsIntraLFlag) {
        this.tnsIntraLFlag = tnsIntraLFlag;
    }


    /**
     * Gets the tnsInterTFlag value for this SignalingProfile.
     * 
     * @return tnsInterTFlag
     */
    public java.lang.Short getTnsInterTFlag() {
        return tnsInterTFlag;
    }


    /**
     * Sets the tnsInterTFlag value for this SignalingProfile.
     * 
     * @param tnsInterTFlag
     */
    public void setTnsInterTFlag(java.lang.Short tnsInterTFlag) {
        this.tnsInterTFlag = tnsInterTFlag;
    }


    /**
     * Gets the tnsIntraTFlag value for this SignalingProfile.
     * 
     * @return tnsIntraTFlag
     */
    public java.lang.Short getTnsIntraTFlag() {
        return tnsIntraTFlag;
    }


    /**
     * Sets the tnsIntraTFlag value for this SignalingProfile.
     * 
     * @param tnsIntraTFlag
     */
    public void setTnsIntraTFlag(java.lang.Short tnsIntraTFlag) {
        this.tnsIntraTFlag = tnsIntraTFlag;
    }


    /**
     * Gets the cipFlag value for this SignalingProfile.
     * 
     * @return cipFlag
     */
    public java.lang.Short getCipFlag() {
        return cipFlag;
    }


    /**
     * Sets the cipFlag value for this SignalingProfile.
     * 
     * @param cipFlag
     */
    public void setCipFlag(java.lang.Short cipFlag) {
        this.cipFlag = cipFlag;
    }


    /**
     * Gets the callingNumberFlag value for this SignalingProfile.
     * 
     * @return callingNumberFlag
     */
    public java.lang.Short getCallingNumberFlag() {
        return callingNumberFlag;
    }


    /**
     * Sets the callingNumberFlag value for this SignalingProfile.
     * 
     * @param callingNumberFlag
     */
    public void setCallingNumberFlag(java.lang.Short callingNumberFlag) {
        this.callingNumberFlag = callingNumberFlag;
    }


    /**
     * Gets the callingNumber7DFlag value for this SignalingProfile.
     * 
     * @return callingNumber7DFlag
     */
    public java.lang.Short getCallingNumber7DFlag() {
        return callingNumber7DFlag;
    }


    /**
     * Sets the callingNumber7DFlag value for this SignalingProfile.
     * 
     * @param callingNumber7DFlag
     */
    public void setCallingNumber7DFlag(java.lang.Short callingNumber7DFlag) {
        this.callingNumber7DFlag = callingNumber7DFlag;
    }


    /**
     * Gets the calledNumber7DFlag value for this SignalingProfile.
     * 
     * @return calledNumber7DFlag
     */
    public java.lang.Short getCalledNumber7DFlag() {
        return calledNumber7DFlag;
    }


    /**
     * Sets the calledNumber7DFlag value for this SignalingProfile.
     * 
     * @param calledNumber7DFlag
     */
    public void setCalledNumber7DFlag(java.lang.Short calledNumber7DFlag) {
        this.calledNumber7DFlag = calledNumber7DFlag;
    }


    /**
     * Gets the chargeNumberFlag value for this SignalingProfile.
     * 
     * @return chargeNumberFlag
     */
    public java.lang.Short getChargeNumberFlag() {
        return chargeNumberFlag;
    }


    /**
     * Sets the chargeNumberFlag value for this SignalingProfile.
     * 
     * @param chargeNumberFlag
     */
    public void setChargeNumberFlag(java.lang.Short chargeNumberFlag) {
        this.chargeNumberFlag = chargeNumberFlag;
    }


    /**
     * Gets the olipFlag value for this SignalingProfile.
     * 
     * @return olipFlag
     */
    public java.lang.Short getOlipFlag() {
        return olipFlag;
    }


    /**
     * Sets the olipFlag value for this SignalingProfile.
     * 
     * @param olipFlag
     */
    public void setOlipFlag(java.lang.Short olipFlag) {
        this.olipFlag = olipFlag;
    }


    /**
     * Gets the cspFlag value for this SignalingProfile.
     * 
     * @return cspFlag
     */
    public java.lang.Short getCspFlag() {
        return cspFlag;
    }


    /**
     * Sets the cspFlag value for this SignalingProfile.
     * 
     * @param cspFlag
     */
    public void setCspFlag(java.lang.Short cspFlag) {
        this.cspFlag = cspFlag;
    }


    /**
     * Gets the jipFlag value for this SignalingProfile.
     * 
     * @return jipFlag
     */
    public java.lang.Short getJipFlag() {
        return jipFlag;
    }


    /**
     * Sets the jipFlag value for this SignalingProfile.
     * 
     * @param jipFlag
     */
    public void setJipFlag(java.lang.Short jipFlag) {
        this.jipFlag = jipFlag;
    }


    /**
     * Gets the inboundTnsAllowedFlag value for this SignalingProfile.
     * 
     * @return inboundTnsAllowedFlag
     */
    public java.lang.Short getInboundTnsAllowedFlag() {
        return inboundTnsAllowedFlag;
    }


    /**
     * Sets the inboundTnsAllowedFlag value for this SignalingProfile.
     * 
     * @param inboundTnsAllowedFlag
     */
    public void setInboundTnsAllowedFlag(java.lang.Short inboundTnsAllowedFlag) {
        this.inboundTnsAllowedFlag = inboundTnsAllowedFlag;
    }


    /**
     * Gets the natureOfAddress value for this SignalingProfile.
     * 
     * @return natureOfAddress
     */
    public java.lang.Short getNatureOfAddress() {
        return natureOfAddress;
    }


    /**
     * Sets the natureOfAddress value for this SignalingProfile.
     * 
     * @param natureOfAddress
     */
    public void setNatureOfAddress(java.lang.Short natureOfAddress) {
        this.natureOfAddress = natureOfAddress;
    }


    /**
     * Gets the transitCarrierIndicator value for this SignalingProfile.
     * 
     * @return transitCarrierIndicator
     */
    public java.lang.Integer getTransitCarrierIndicator() {
        return transitCarrierIndicator;
    }


    /**
     * Sets the transitCarrierIndicator value for this SignalingProfile.
     * 
     * @param transitCarrierIndicator
     */
    public void setTransitCarrierIndicator(java.lang.Integer transitCarrierIndicator) {
        this.transitCarrierIndicator = transitCarrierIndicator;
    }


    /**
     * Gets the attributes value for this SignalingProfile.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this SignalingProfile.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the genericNumber value for this SignalingProfile.
     * 
     * @return genericNumber
     */
    public java.lang.Integer getGenericNumber() {
        return genericNumber;
    }


    /**
     * Sets the genericNumber value for this SignalingProfile.
     * 
     * @param genericNumber
     */
    public void setGenericNumber(java.lang.Integer genericNumber) {
        this.genericNumber = genericNumber;
    }


    /**
     * Gets the genericNumber2 value for this SignalingProfile.
     * 
     * @return genericNumber2
     */
    public java.lang.Integer getGenericNumber2() {
        return genericNumber2;
    }


    /**
     * Sets the genericNumber2 value for this SignalingProfile.
     * 
     * @param genericNumber2
     */
    public void setGenericNumber2(java.lang.Integer genericNumber2) {
        this.genericNumber2 = genericNumber2;
    }


    /**
     * Gets the locationNumber value for this SignalingProfile.
     * 
     * @return locationNumber
     */
    public java.lang.Integer getLocationNumber() {
        return locationNumber;
    }


    /**
     * Sets the locationNumber value for this SignalingProfile.
     * 
     * @param locationNumber
     */
    public void setLocationNumber(java.lang.Integer locationNumber) {
        this.locationNumber = locationNumber;
    }


    /**
     * Gets the redirectionNumber value for this SignalingProfile.
     * 
     * @return redirectionNumber
     */
    public java.lang.Integer getRedirectionNumber() {
        return redirectionNumber;
    }


    /**
     * Sets the redirectionNumber value for this SignalingProfile.
     * 
     * @param redirectionNumber
     */
    public void setRedirectionNumber(java.lang.Integer redirectionNumber) {
        this.redirectionNumber = redirectionNumber;
    }


    /**
     * Gets the originalNumber value for this SignalingProfile.
     * 
     * @return originalNumber
     */
    public java.lang.Integer getOriginalNumber() {
        return originalNumber;
    }


    /**
     * Sets the originalNumber value for this SignalingProfile.
     * 
     * @param originalNumber
     */
    public void setOriginalNumber(java.lang.Integer originalNumber) {
        this.originalNumber = originalNumber;
    }


    /**
     * Gets the redirectingNumber value for this SignalingProfile.
     * 
     * @return redirectingNumber
     */
    public java.lang.Integer getRedirectingNumber() {
        return redirectingNumber;
    }


    /**
     * Sets the redirectingNumber value for this SignalingProfile.
     * 
     * @param redirectingNumber
     */
    public void setRedirectingNumber(java.lang.Integer redirectingNumber) {
        this.redirectingNumber = redirectingNumber;
    }


    /**
     * Gets the genericDigitType value for this SignalingProfile.
     * 
     * @return genericDigitType
     */
    public java.lang.Short getGenericDigitType() {
        return genericDigitType;
    }


    /**
     * Sets the genericDigitType value for this SignalingProfile.
     * 
     * @param genericDigitType
     */
    public void setGenericDigitType(java.lang.Short genericDigitType) {
        this.genericDigitType = genericDigitType;
    }


    /**
     * Gets the attributes2 value for this SignalingProfile.
     * 
     * @return attributes2
     */
    public java.lang.Integer getAttributes2() {
        return attributes2;
    }


    /**
     * Sets the attributes2 value for this SignalingProfile.
     * 
     * @param attributes2
     */
    public void setAttributes2(java.lang.Integer attributes2) {
        this.attributes2 = attributes2;
    }


    /**
     * Gets the attributes3 value for this SignalingProfile.
     * 
     * @return attributes3
     */
    public java.lang.Integer getAttributes3() {
        return attributes3;
    }


    /**
     * Sets the attributes3 value for this SignalingProfile.
     * 
     * @param attributes3
     */
    public void setAttributes3(java.lang.Integer attributes3) {
        this.attributes3 = attributes3;
    }


    /**
     * Gets the attributes4 value for this SignalingProfile.
     * 
     * @return attributes4
     */
    public java.lang.Integer getAttributes4() {
        return attributes4;
    }


    /**
     * Sets the attributes4 value for this SignalingProfile.
     * 
     * @param attributes4
     */
    public void setAttributes4(java.lang.Integer attributes4) {
        this.attributes4 = attributes4;
    }


    /**
     * Gets the attributes5 value for this SignalingProfile.
     * 
     * @return attributes5
     */
    public java.lang.Integer getAttributes5() {
        return attributes5;
    }


    /**
     * Sets the attributes5 value for this SignalingProfile.
     * 
     * @param attributes5
     */
    public void setAttributes5(java.lang.Integer attributes5) {
        this.attributes5 = attributes5;
    }


    /**
     * Gets the clip value for this SignalingProfile.
     * 
     * @return clip
     */
    public java.lang.Short getClip() {
        return clip;
    }


    /**
     * Sets the clip value for this SignalingProfile.
     * 
     * @param clip
     */
    public void setClip(java.lang.Short clip) {
        this.clip = clip;
    }


    /**
     * Gets the callingBillingControlId value for this SignalingProfile.
     * 
     * @return callingBillingControlId
     */
    public java.lang.String getCallingBillingControlId() {
        return callingBillingControlId;
    }


    /**
     * Sets the callingBillingControlId value for this SignalingProfile.
     * 
     * @param callingBillingControlId
     */
    public void setCallingBillingControlId(java.lang.String callingBillingControlId) {
        this.callingBillingControlId = callingBillingControlId;
    }


    /**
     * Gets the mobileCdOcnFlag value for this SignalingProfile.
     * 
     * @return mobileCdOcnFlag
     */
    public java.lang.Integer getMobileCdOcnFlag() {
        return mobileCdOcnFlag;
    }


    /**
     * Sets the mobileCdOcnFlag value for this SignalingProfile.
     * 
     * @param mobileCdOcnFlag
     */
    public void setMobileCdOcnFlag(java.lang.Integer mobileCdOcnFlag) {
        this.mobileCdOcnFlag = mobileCdOcnFlag;
    }


    /**
     * Gets the mobileCdRedirectInfoFlag value for this SignalingProfile.
     * 
     * @return mobileCdRedirectInfoFlag
     */
    public java.lang.Integer getMobileCdRedirectInfoFlag() {
        return mobileCdRedirectInfoFlag;
    }


    /**
     * Sets the mobileCdRedirectInfoFlag value for this SignalingProfile.
     * 
     * @param mobileCdRedirectInfoFlag
     */
    public void setMobileCdRedirectInfoFlag(java.lang.Integer mobileCdRedirectInfoFlag) {
        this.mobileCdRedirectInfoFlag = mobileCdRedirectInfoFlag;
    }


    /**
     * Gets the ingressCftValue value for this SignalingProfile.
     * 
     * @return ingressCftValue
     */
    public java.lang.Short getIngressCftValue() {
        return ingressCftValue;
    }


    /**
     * Sets the ingressCftValue value for this SignalingProfile.
     * 
     * @param ingressCftValue
     */
    public void setIngressCftValue(java.lang.Short ingressCftValue) {
        this.ingressCftValue = ingressCftValue;
    }


    /**
     * Gets the egressCftValue value for this SignalingProfile.
     * 
     * @return egressCftValue
     */
    public java.lang.Short getEgressCftValue() {
        return egressCftValue;
    }


    /**
     * Sets the egressCftValue value for this SignalingProfile.
     * 
     * @param egressCftValue
     */
    public void setEgressCftValue(java.lang.Short egressCftValue) {
        this.egressCftValue = egressCftValue;
    }


    /**
     * Gets the tciProfileId value for this SignalingProfile.
     * 
     * @return tciProfileId
     */
    public java.lang.String getTciProfileId() {
        return tciProfileId;
    }


    /**
     * Sets the tciProfileId value for this SignalingProfile.
     * 
     * @param tciProfileId
     */
    public void setTciProfileId(java.lang.String tciProfileId) {
        this.tciProfileId = tciProfileId;
    }


    /**
     * Gets the contractorNumber value for this SignalingProfile.
     * 
     * @return contractorNumber
     */
    public java.lang.Integer getContractorNumber() {
        return contractorNumber;
    }


    /**
     * Sets the contractorNumber value for this SignalingProfile.
     * 
     * @param contractorNumber
     */
    public void setContractorNumber(java.lang.Integer contractorNumber) {
        this.contractorNumber = contractorNumber;
    }


    /**
     * Gets the redirectionInfoId value for this SignalingProfile.
     * 
     * @return redirectionInfoId
     */
    public java.lang.String getRedirectionInfoId() {
        return redirectionInfoId;
    }


    /**
     * Sets the redirectionInfoId value for this SignalingProfile.
     * 
     * @param redirectionInfoId
     */
    public void setRedirectionInfoId(java.lang.String redirectionInfoId) {
        this.redirectionInfoId = redirectionInfoId;
    }


    /**
     * Gets the numberControlProfileId value for this SignalingProfile.
     * 
     * @return numberControlProfileId
     */
    public java.lang.String getNumberControlProfileId() {
        return numberControlProfileId;
    }


    /**
     * Sets the numberControlProfileId value for this SignalingProfile.
     * 
     * @param numberControlProfileId
     */
    public void setNumberControlProfileId(java.lang.String numberControlProfileId) {
        this.numberControlProfileId = numberControlProfileId;
    }


    /**
     * Gets the fciIsupPreference value for this SignalingProfile.
     * 
     * @return fciIsupPreference
     */
    public java.lang.Integer getFciIsupPreference() {
        return fciIsupPreference;
    }


    /**
     * Sets the fciIsupPreference value for this SignalingProfile.
     * 
     * @param fciIsupPreference
     */
    public void setFciIsupPreference(java.lang.Integer fciIsupPreference) {
        this.fciIsupPreference = fciIsupPreference;
    }


    /**
     * Gets the carrierCodeProfileId value for this SignalingProfile.
     * 
     * @return carrierCodeProfileId
     */
    public java.lang.String getCarrierCodeProfileId() {
        return carrierCodeProfileId;
    }


    /**
     * Sets the carrierCodeProfileId value for this SignalingProfile.
     * 
     * @param carrierCodeProfileId
     */
    public void setCarrierCodeProfileId(java.lang.String carrierCodeProfileId) {
        this.carrierCodeProfileId = carrierCodeProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignalingProfile)) return false;
        SignalingProfile other = (SignalingProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.signalingProfileId==null && other.getSignalingProfileId()==null) || 
             (this.signalingProfileId!=null &&
              this.signalingProfileId.equals(other.getSignalingProfileId()))) &&
            ((this.tnsInterLFlag==null && other.getTnsInterLFlag()==null) || 
             (this.tnsInterLFlag!=null &&
              this.tnsInterLFlag.equals(other.getTnsInterLFlag()))) &&
            ((this.tnsIntraLFlag==null && other.getTnsIntraLFlag()==null) || 
             (this.tnsIntraLFlag!=null &&
              this.tnsIntraLFlag.equals(other.getTnsIntraLFlag()))) &&
            ((this.tnsInterTFlag==null && other.getTnsInterTFlag()==null) || 
             (this.tnsInterTFlag!=null &&
              this.tnsInterTFlag.equals(other.getTnsInterTFlag()))) &&
            ((this.tnsIntraTFlag==null && other.getTnsIntraTFlag()==null) || 
             (this.tnsIntraTFlag!=null &&
              this.tnsIntraTFlag.equals(other.getTnsIntraTFlag()))) &&
            ((this.cipFlag==null && other.getCipFlag()==null) || 
             (this.cipFlag!=null &&
              this.cipFlag.equals(other.getCipFlag()))) &&
            ((this.callingNumberFlag==null && other.getCallingNumberFlag()==null) || 
             (this.callingNumberFlag!=null &&
              this.callingNumberFlag.equals(other.getCallingNumberFlag()))) &&
            ((this.callingNumber7DFlag==null && other.getCallingNumber7DFlag()==null) || 
             (this.callingNumber7DFlag!=null &&
              this.callingNumber7DFlag.equals(other.getCallingNumber7DFlag()))) &&
            ((this.calledNumber7DFlag==null && other.getCalledNumber7DFlag()==null) || 
             (this.calledNumber7DFlag!=null &&
              this.calledNumber7DFlag.equals(other.getCalledNumber7DFlag()))) &&
            ((this.chargeNumberFlag==null && other.getChargeNumberFlag()==null) || 
             (this.chargeNumberFlag!=null &&
              this.chargeNumberFlag.equals(other.getChargeNumberFlag()))) &&
            ((this.olipFlag==null && other.getOlipFlag()==null) || 
             (this.olipFlag!=null &&
              this.olipFlag.equals(other.getOlipFlag()))) &&
            ((this.cspFlag==null && other.getCspFlag()==null) || 
             (this.cspFlag!=null &&
              this.cspFlag.equals(other.getCspFlag()))) &&
            ((this.jipFlag==null && other.getJipFlag()==null) || 
             (this.jipFlag!=null &&
              this.jipFlag.equals(other.getJipFlag()))) &&
            ((this.inboundTnsAllowedFlag==null && other.getInboundTnsAllowedFlag()==null) || 
             (this.inboundTnsAllowedFlag!=null &&
              this.inboundTnsAllowedFlag.equals(other.getInboundTnsAllowedFlag()))) &&
            ((this.natureOfAddress==null && other.getNatureOfAddress()==null) || 
             (this.natureOfAddress!=null &&
              this.natureOfAddress.equals(other.getNatureOfAddress()))) &&
            ((this.transitCarrierIndicator==null && other.getTransitCarrierIndicator()==null) || 
             (this.transitCarrierIndicator!=null &&
              this.transitCarrierIndicator.equals(other.getTransitCarrierIndicator()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.genericNumber==null && other.getGenericNumber()==null) || 
             (this.genericNumber!=null &&
              this.genericNumber.equals(other.getGenericNumber()))) &&
            ((this.genericNumber2==null && other.getGenericNumber2()==null) || 
             (this.genericNumber2!=null &&
              this.genericNumber2.equals(other.getGenericNumber2()))) &&
            ((this.locationNumber==null && other.getLocationNumber()==null) || 
             (this.locationNumber!=null &&
              this.locationNumber.equals(other.getLocationNumber()))) &&
            ((this.redirectionNumber==null && other.getRedirectionNumber()==null) || 
             (this.redirectionNumber!=null &&
              this.redirectionNumber.equals(other.getRedirectionNumber()))) &&
            ((this.originalNumber==null && other.getOriginalNumber()==null) || 
             (this.originalNumber!=null &&
              this.originalNumber.equals(other.getOriginalNumber()))) &&
            ((this.redirectingNumber==null && other.getRedirectingNumber()==null) || 
             (this.redirectingNumber!=null &&
              this.redirectingNumber.equals(other.getRedirectingNumber()))) &&
            ((this.genericDigitType==null && other.getGenericDigitType()==null) || 
             (this.genericDigitType!=null &&
              this.genericDigitType.equals(other.getGenericDigitType()))) &&
            ((this.attributes2==null && other.getAttributes2()==null) || 
             (this.attributes2!=null &&
              this.attributes2.equals(other.getAttributes2()))) &&
            ((this.attributes3==null && other.getAttributes3()==null) || 
             (this.attributes3!=null &&
              this.attributes3.equals(other.getAttributes3()))) &&
            ((this.attributes4==null && other.getAttributes4()==null) || 
             (this.attributes4!=null &&
              this.attributes4.equals(other.getAttributes4()))) &&
            ((this.attributes5==null && other.getAttributes5()==null) || 
             (this.attributes5!=null &&
              this.attributes5.equals(other.getAttributes5()))) &&
            ((this.clip==null && other.getClip()==null) || 
             (this.clip!=null &&
              this.clip.equals(other.getClip()))) &&
            ((this.callingBillingControlId==null && other.getCallingBillingControlId()==null) || 
             (this.callingBillingControlId!=null &&
              this.callingBillingControlId.equals(other.getCallingBillingControlId()))) &&
            ((this.mobileCdOcnFlag==null && other.getMobileCdOcnFlag()==null) || 
             (this.mobileCdOcnFlag!=null &&
              this.mobileCdOcnFlag.equals(other.getMobileCdOcnFlag()))) &&
            ((this.mobileCdRedirectInfoFlag==null && other.getMobileCdRedirectInfoFlag()==null) || 
             (this.mobileCdRedirectInfoFlag!=null &&
              this.mobileCdRedirectInfoFlag.equals(other.getMobileCdRedirectInfoFlag()))) &&
            ((this.ingressCftValue==null && other.getIngressCftValue()==null) || 
             (this.ingressCftValue!=null &&
              this.ingressCftValue.equals(other.getIngressCftValue()))) &&
            ((this.egressCftValue==null && other.getEgressCftValue()==null) || 
             (this.egressCftValue!=null &&
              this.egressCftValue.equals(other.getEgressCftValue()))) &&
            ((this.tciProfileId==null && other.getTciProfileId()==null) || 
             (this.tciProfileId!=null &&
              this.tciProfileId.equals(other.getTciProfileId()))) &&
            ((this.contractorNumber==null && other.getContractorNumber()==null) || 
             (this.contractorNumber!=null &&
              this.contractorNumber.equals(other.getContractorNumber()))) &&
            ((this.redirectionInfoId==null && other.getRedirectionInfoId()==null) || 
             (this.redirectionInfoId!=null &&
              this.redirectionInfoId.equals(other.getRedirectionInfoId()))) &&
            ((this.numberControlProfileId==null && other.getNumberControlProfileId()==null) || 
             (this.numberControlProfileId!=null &&
              this.numberControlProfileId.equals(other.getNumberControlProfileId()))) &&
            ((this.fciIsupPreference==null && other.getFciIsupPreference()==null) || 
             (this.fciIsupPreference!=null &&
              this.fciIsupPreference.equals(other.getFciIsupPreference()))) &&
            ((this.carrierCodeProfileId==null && other.getCarrierCodeProfileId()==null) || 
             (this.carrierCodeProfileId!=null &&
              this.carrierCodeProfileId.equals(other.getCarrierCodeProfileId())));
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
        if (getSignalingProfileId() != null) {
            _hashCode += getSignalingProfileId().hashCode();
        }
        if (getTnsInterLFlag() != null) {
            _hashCode += getTnsInterLFlag().hashCode();
        }
        if (getTnsIntraLFlag() != null) {
            _hashCode += getTnsIntraLFlag().hashCode();
        }
        if (getTnsInterTFlag() != null) {
            _hashCode += getTnsInterTFlag().hashCode();
        }
        if (getTnsIntraTFlag() != null) {
            _hashCode += getTnsIntraTFlag().hashCode();
        }
        if (getCipFlag() != null) {
            _hashCode += getCipFlag().hashCode();
        }
        if (getCallingNumberFlag() != null) {
            _hashCode += getCallingNumberFlag().hashCode();
        }
        if (getCallingNumber7DFlag() != null) {
            _hashCode += getCallingNumber7DFlag().hashCode();
        }
        if (getCalledNumber7DFlag() != null) {
            _hashCode += getCalledNumber7DFlag().hashCode();
        }
        if (getChargeNumberFlag() != null) {
            _hashCode += getChargeNumberFlag().hashCode();
        }
        if (getOlipFlag() != null) {
            _hashCode += getOlipFlag().hashCode();
        }
        if (getCspFlag() != null) {
            _hashCode += getCspFlag().hashCode();
        }
        if (getJipFlag() != null) {
            _hashCode += getJipFlag().hashCode();
        }
        if (getInboundTnsAllowedFlag() != null) {
            _hashCode += getInboundTnsAllowedFlag().hashCode();
        }
        if (getNatureOfAddress() != null) {
            _hashCode += getNatureOfAddress().hashCode();
        }
        if (getTransitCarrierIndicator() != null) {
            _hashCode += getTransitCarrierIndicator().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getGenericNumber() != null) {
            _hashCode += getGenericNumber().hashCode();
        }
        if (getGenericNumber2() != null) {
            _hashCode += getGenericNumber2().hashCode();
        }
        if (getLocationNumber() != null) {
            _hashCode += getLocationNumber().hashCode();
        }
        if (getRedirectionNumber() != null) {
            _hashCode += getRedirectionNumber().hashCode();
        }
        if (getOriginalNumber() != null) {
            _hashCode += getOriginalNumber().hashCode();
        }
        if (getRedirectingNumber() != null) {
            _hashCode += getRedirectingNumber().hashCode();
        }
        if (getGenericDigitType() != null) {
            _hashCode += getGenericDigitType().hashCode();
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
        if (getAttributes5() != null) {
            _hashCode += getAttributes5().hashCode();
        }
        if (getClip() != null) {
            _hashCode += getClip().hashCode();
        }
        if (getCallingBillingControlId() != null) {
            _hashCode += getCallingBillingControlId().hashCode();
        }
        if (getMobileCdOcnFlag() != null) {
            _hashCode += getMobileCdOcnFlag().hashCode();
        }
        if (getMobileCdRedirectInfoFlag() != null) {
            _hashCode += getMobileCdRedirectInfoFlag().hashCode();
        }
        if (getIngressCftValue() != null) {
            _hashCode += getIngressCftValue().hashCode();
        }
        if (getEgressCftValue() != null) {
            _hashCode += getEgressCftValue().hashCode();
        }
        if (getTciProfileId() != null) {
            _hashCode += getTciProfileId().hashCode();
        }
        if (getContractorNumber() != null) {
            _hashCode += getContractorNumber().hashCode();
        }
        if (getRedirectionInfoId() != null) {
            _hashCode += getRedirectionInfoId().hashCode();
        }
        if (getNumberControlProfileId() != null) {
            _hashCode += getNumberControlProfileId().hashCode();
        }
        if (getFciIsupPreference() != null) {
            _hashCode += getFciIsupPreference().hashCode();
        }
        if (getCarrierCodeProfileId() != null) {
            _hashCode += getCarrierCodeProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignalingProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SignalingProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signalingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tnsInterLFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tnsInterLFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tnsIntraLFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tnsIntraLFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tnsInterTFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tnsInterTFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tnsIntraTFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tnsIntraTFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cipFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cipFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNumberFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNumberFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNumber7DFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNumber7dFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNumber7DFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledNumber7dFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeNumberFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeNumberFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("olipFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "olipFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cspFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cspFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jipFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jipFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundTnsAllowedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inboundTnsAllowedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natureOfAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natureOfAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitCarrierIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transitCarrierIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericNumber2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericNumber2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirectionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirectingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericDigitType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericDigitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("attributes5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingBillingControlId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingBillingControlId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileCdOcnFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileCdOcnFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileCdRedirectInfoFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileCdRedirectInfoFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressCftValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressCftValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egressCftValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "egressCftValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tciProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tciProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractorNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractorNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectionInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirectionInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberControlProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fciIsupPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fciIsupPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCodeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCodeProfileId"));
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
