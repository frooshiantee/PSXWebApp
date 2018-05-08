/**
 * PrefixProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class PrefixProfileData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String prefixProfileId;
    private java.lang.String prefix;
    private java.lang.Short matchStartLocation;
    private java.lang.Short totalMinDigits;
    private java.lang.Short totalMaxDigits;
    private java.lang.Integer calltype;
    private java.lang.String inPmRuleId;
    private java.lang.String outPmRuleId;
    private java.lang.Short nonSubscriberRoutingFlag;
    private java.lang.String nonSubscriberScriptId;
    private java.lang.Short noCallingPartyRoutingFlag;
    private java.lang.String noCallingPartyScriptId;
    private java.lang.Short phoneType;
    private java.lang.String phoneTypeInvalidScriptId;
    private java.lang.Integer digitType;
    private java.lang.Integer digitSubType;
    private java.lang.Short natureOfAddress;
    private java.lang.Short numberPlanIndicator;
    private java.lang.Short numberLeadingPrefixDigits;
    private java.lang.Short numberLeadingPrefixDigitsToStrip;
    private java.lang.Short numberCarrierCodeDigits;
    private java.lang.String classOfServiceId;
    private java.lang.String routingLabelId;
    private java.lang.Integer attributes;
    private java.lang.Short routeMinDigits;
    private java.lang.Short validPhNoMinDigits;
    private java.lang.Short validPhNoMaxDigits;
    private java.lang.Integer numRepAreaCodeDigits;
    private java.lang.Short prefixTypeId;

    public PrefixProfileData() {
    }

    public PrefixProfileData(
           java.lang.String prefixProfileId,
           java.lang.String prefix,
           java.lang.Short matchStartLocation,
           java.lang.Short totalMinDigits,
           java.lang.Short totalMaxDigits,
           java.lang.Integer calltype,
           java.lang.String inPmRuleId,
           java.lang.String outPmRuleId,
           java.lang.Short nonSubscriberRoutingFlag,
           java.lang.String nonSubscriberScriptId,
           java.lang.Short noCallingPartyRoutingFlag,
           java.lang.String noCallingPartyScriptId,
           java.lang.Short phoneType,
           java.lang.String phoneTypeInvalidScriptId,
           java.lang.Integer digitType,
           java.lang.Integer digitSubType,
           java.lang.Short natureOfAddress,
           java.lang.Short numberPlanIndicator,
           java.lang.Short numberLeadingPrefixDigits,
           java.lang.Short numberLeadingPrefixDigitsToStrip,
           java.lang.Short numberCarrierCodeDigits,
           java.lang.String classOfServiceId,
           java.lang.String routingLabelId,
           java.lang.Integer attributes,
           java.lang.Short routeMinDigits,
           java.lang.Short validPhNoMinDigits,
           java.lang.Short validPhNoMaxDigits,
           java.lang.Integer numRepAreaCodeDigits,
           java.lang.Short prefixTypeId) {
           this.prefixProfileId = prefixProfileId;
           this.prefix = prefix;
           this.matchStartLocation = matchStartLocation;
           this.totalMinDigits = totalMinDigits;
           this.totalMaxDigits = totalMaxDigits;
           this.calltype = calltype;
           this.inPmRuleId = inPmRuleId;
           this.outPmRuleId = outPmRuleId;
           this.nonSubscriberRoutingFlag = nonSubscriberRoutingFlag;
           this.nonSubscriberScriptId = nonSubscriberScriptId;
           this.noCallingPartyRoutingFlag = noCallingPartyRoutingFlag;
           this.noCallingPartyScriptId = noCallingPartyScriptId;
           this.phoneType = phoneType;
           this.phoneTypeInvalidScriptId = phoneTypeInvalidScriptId;
           this.digitType = digitType;
           this.digitSubType = digitSubType;
           this.natureOfAddress = natureOfAddress;
           this.numberPlanIndicator = numberPlanIndicator;
           this.numberLeadingPrefixDigits = numberLeadingPrefixDigits;
           this.numberLeadingPrefixDigitsToStrip = numberLeadingPrefixDigitsToStrip;
           this.numberCarrierCodeDigits = numberCarrierCodeDigits;
           this.classOfServiceId = classOfServiceId;
           this.routingLabelId = routingLabelId;
           this.attributes = attributes;
           this.routeMinDigits = routeMinDigits;
           this.validPhNoMinDigits = validPhNoMinDigits;
           this.validPhNoMaxDigits = validPhNoMaxDigits;
           this.numRepAreaCodeDigits = numRepAreaCodeDigits;
           this.prefixTypeId = prefixTypeId;
    }


    /**
     * Gets the prefixProfileId value for this PrefixProfileData.
     * 
     * @return prefixProfileId
     */
    public java.lang.String getPrefixProfileId() {
        return prefixProfileId;
    }


    /**
     * Sets the prefixProfileId value for this PrefixProfileData.
     * 
     * @param prefixProfileId
     */
    public void setPrefixProfileId(java.lang.String prefixProfileId) {
        this.prefixProfileId = prefixProfileId;
    }


    /**
     * Gets the prefix value for this PrefixProfileData.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this PrefixProfileData.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the matchStartLocation value for this PrefixProfileData.
     * 
     * @return matchStartLocation
     */
    public java.lang.Short getMatchStartLocation() {
        return matchStartLocation;
    }


    /**
     * Sets the matchStartLocation value for this PrefixProfileData.
     * 
     * @param matchStartLocation
     */
    public void setMatchStartLocation(java.lang.Short matchStartLocation) {
        this.matchStartLocation = matchStartLocation;
    }


    /**
     * Gets the totalMinDigits value for this PrefixProfileData.
     * 
     * @return totalMinDigits
     */
    public java.lang.Short getTotalMinDigits() {
        return totalMinDigits;
    }


    /**
     * Sets the totalMinDigits value for this PrefixProfileData.
     * 
     * @param totalMinDigits
     */
    public void setTotalMinDigits(java.lang.Short totalMinDigits) {
        this.totalMinDigits = totalMinDigits;
    }


    /**
     * Gets the totalMaxDigits value for this PrefixProfileData.
     * 
     * @return totalMaxDigits
     */
    public java.lang.Short getTotalMaxDigits() {
        return totalMaxDigits;
    }


    /**
     * Sets the totalMaxDigits value for this PrefixProfileData.
     * 
     * @param totalMaxDigits
     */
    public void setTotalMaxDigits(java.lang.Short totalMaxDigits) {
        this.totalMaxDigits = totalMaxDigits;
    }


    /**
     * Gets the calltype value for this PrefixProfileData.
     * 
     * @return calltype
     */
    public java.lang.Integer getCalltype() {
        return calltype;
    }


    /**
     * Sets the calltype value for this PrefixProfileData.
     * 
     * @param calltype
     */
    public void setCalltype(java.lang.Integer calltype) {
        this.calltype = calltype;
    }


    /**
     * Gets the inPmRuleId value for this PrefixProfileData.
     * 
     * @return inPmRuleId
     */
    public java.lang.String getInPmRuleId() {
        return inPmRuleId;
    }


    /**
     * Sets the inPmRuleId value for this PrefixProfileData.
     * 
     * @param inPmRuleId
     */
    public void setInPmRuleId(java.lang.String inPmRuleId) {
        this.inPmRuleId = inPmRuleId;
    }


    /**
     * Gets the outPmRuleId value for this PrefixProfileData.
     * 
     * @return outPmRuleId
     */
    public java.lang.String getOutPmRuleId() {
        return outPmRuleId;
    }


    /**
     * Sets the outPmRuleId value for this PrefixProfileData.
     * 
     * @param outPmRuleId
     */
    public void setOutPmRuleId(java.lang.String outPmRuleId) {
        this.outPmRuleId = outPmRuleId;
    }


    /**
     * Gets the nonSubscriberRoutingFlag value for this PrefixProfileData.
     * 
     * @return nonSubscriberRoutingFlag
     */
    public java.lang.Short getNonSubscriberRoutingFlag() {
        return nonSubscriberRoutingFlag;
    }


    /**
     * Sets the nonSubscriberRoutingFlag value for this PrefixProfileData.
     * 
     * @param nonSubscriberRoutingFlag
     */
    public void setNonSubscriberRoutingFlag(java.lang.Short nonSubscriberRoutingFlag) {
        this.nonSubscriberRoutingFlag = nonSubscriberRoutingFlag;
    }


    /**
     * Gets the nonSubscriberScriptId value for this PrefixProfileData.
     * 
     * @return nonSubscriberScriptId
     */
    public java.lang.String getNonSubscriberScriptId() {
        return nonSubscriberScriptId;
    }


    /**
     * Sets the nonSubscriberScriptId value for this PrefixProfileData.
     * 
     * @param nonSubscriberScriptId
     */
    public void setNonSubscriberScriptId(java.lang.String nonSubscriberScriptId) {
        this.nonSubscriberScriptId = nonSubscriberScriptId;
    }


    /**
     * Gets the noCallingPartyRoutingFlag value for this PrefixProfileData.
     * 
     * @return noCallingPartyRoutingFlag
     */
    public java.lang.Short getNoCallingPartyRoutingFlag() {
        return noCallingPartyRoutingFlag;
    }


    /**
     * Sets the noCallingPartyRoutingFlag value for this PrefixProfileData.
     * 
     * @param noCallingPartyRoutingFlag
     */
    public void setNoCallingPartyRoutingFlag(java.lang.Short noCallingPartyRoutingFlag) {
        this.noCallingPartyRoutingFlag = noCallingPartyRoutingFlag;
    }


    /**
     * Gets the noCallingPartyScriptId value for this PrefixProfileData.
     * 
     * @return noCallingPartyScriptId
     */
    public java.lang.String getNoCallingPartyScriptId() {
        return noCallingPartyScriptId;
    }


    /**
     * Sets the noCallingPartyScriptId value for this PrefixProfileData.
     * 
     * @param noCallingPartyScriptId
     */
    public void setNoCallingPartyScriptId(java.lang.String noCallingPartyScriptId) {
        this.noCallingPartyScriptId = noCallingPartyScriptId;
    }


    /**
     * Gets the phoneType value for this PrefixProfileData.
     * 
     * @return phoneType
     */
    public java.lang.Short getPhoneType() {
        return phoneType;
    }


    /**
     * Sets the phoneType value for this PrefixProfileData.
     * 
     * @param phoneType
     */
    public void setPhoneType(java.lang.Short phoneType) {
        this.phoneType = phoneType;
    }


    /**
     * Gets the phoneTypeInvalidScriptId value for this PrefixProfileData.
     * 
     * @return phoneTypeInvalidScriptId
     */
    public java.lang.String getPhoneTypeInvalidScriptId() {
        return phoneTypeInvalidScriptId;
    }


    /**
     * Sets the phoneTypeInvalidScriptId value for this PrefixProfileData.
     * 
     * @param phoneTypeInvalidScriptId
     */
    public void setPhoneTypeInvalidScriptId(java.lang.String phoneTypeInvalidScriptId) {
        this.phoneTypeInvalidScriptId = phoneTypeInvalidScriptId;
    }


    /**
     * Gets the digitType value for this PrefixProfileData.
     * 
     * @return digitType
     */
    public java.lang.Integer getDigitType() {
        return digitType;
    }


    /**
     * Sets the digitType value for this PrefixProfileData.
     * 
     * @param digitType
     */
    public void setDigitType(java.lang.Integer digitType) {
        this.digitType = digitType;
    }


    /**
     * Gets the digitSubType value for this PrefixProfileData.
     * 
     * @return digitSubType
     */
    public java.lang.Integer getDigitSubType() {
        return digitSubType;
    }


    /**
     * Sets the digitSubType value for this PrefixProfileData.
     * 
     * @param digitSubType
     */
    public void setDigitSubType(java.lang.Integer digitSubType) {
        this.digitSubType = digitSubType;
    }


    /**
     * Gets the natureOfAddress value for this PrefixProfileData.
     * 
     * @return natureOfAddress
     */
    public java.lang.Short getNatureOfAddress() {
        return natureOfAddress;
    }


    /**
     * Sets the natureOfAddress value for this PrefixProfileData.
     * 
     * @param natureOfAddress
     */
    public void setNatureOfAddress(java.lang.Short natureOfAddress) {
        this.natureOfAddress = natureOfAddress;
    }


    /**
     * Gets the numberPlanIndicator value for this PrefixProfileData.
     * 
     * @return numberPlanIndicator
     */
    public java.lang.Short getNumberPlanIndicator() {
        return numberPlanIndicator;
    }


    /**
     * Sets the numberPlanIndicator value for this PrefixProfileData.
     * 
     * @param numberPlanIndicator
     */
    public void setNumberPlanIndicator(java.lang.Short numberPlanIndicator) {
        this.numberPlanIndicator = numberPlanIndicator;
    }


    /**
     * Gets the numberLeadingPrefixDigits value for this PrefixProfileData.
     * 
     * @return numberLeadingPrefixDigits
     */
    public java.lang.Short getNumberLeadingPrefixDigits() {
        return numberLeadingPrefixDigits;
    }


    /**
     * Sets the numberLeadingPrefixDigits value for this PrefixProfileData.
     * 
     * @param numberLeadingPrefixDigits
     */
    public void setNumberLeadingPrefixDigits(java.lang.Short numberLeadingPrefixDigits) {
        this.numberLeadingPrefixDigits = numberLeadingPrefixDigits;
    }


    /**
     * Gets the numberLeadingPrefixDigitsToStrip value for this PrefixProfileData.
     * 
     * @return numberLeadingPrefixDigitsToStrip
     */
    public java.lang.Short getNumberLeadingPrefixDigitsToStrip() {
        return numberLeadingPrefixDigitsToStrip;
    }


    /**
     * Sets the numberLeadingPrefixDigitsToStrip value for this PrefixProfileData.
     * 
     * @param numberLeadingPrefixDigitsToStrip
     */
    public void setNumberLeadingPrefixDigitsToStrip(java.lang.Short numberLeadingPrefixDigitsToStrip) {
        this.numberLeadingPrefixDigitsToStrip = numberLeadingPrefixDigitsToStrip;
    }


    /**
     * Gets the numberCarrierCodeDigits value for this PrefixProfileData.
     * 
     * @return numberCarrierCodeDigits
     */
    public java.lang.Short getNumberCarrierCodeDigits() {
        return numberCarrierCodeDigits;
    }


    /**
     * Sets the numberCarrierCodeDigits value for this PrefixProfileData.
     * 
     * @param numberCarrierCodeDigits
     */
    public void setNumberCarrierCodeDigits(java.lang.Short numberCarrierCodeDigits) {
        this.numberCarrierCodeDigits = numberCarrierCodeDigits;
    }


    /**
     * Gets the classOfServiceId value for this PrefixProfileData.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this PrefixProfileData.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the routingLabelId value for this PrefixProfileData.
     * 
     * @return routingLabelId
     */
    public java.lang.String getRoutingLabelId() {
        return routingLabelId;
    }


    /**
     * Sets the routingLabelId value for this PrefixProfileData.
     * 
     * @param routingLabelId
     */
    public void setRoutingLabelId(java.lang.String routingLabelId) {
        this.routingLabelId = routingLabelId;
    }


    /**
     * Gets the attributes value for this PrefixProfileData.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this PrefixProfileData.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the routeMinDigits value for this PrefixProfileData.
     * 
     * @return routeMinDigits
     */
    public java.lang.Short getRouteMinDigits() {
        return routeMinDigits;
    }


    /**
     * Sets the routeMinDigits value for this PrefixProfileData.
     * 
     * @param routeMinDigits
     */
    public void setRouteMinDigits(java.lang.Short routeMinDigits) {
        this.routeMinDigits = routeMinDigits;
    }


    /**
     * Gets the validPhNoMinDigits value for this PrefixProfileData.
     * 
     * @return validPhNoMinDigits
     */
    public java.lang.Short getValidPhNoMinDigits() {
        return validPhNoMinDigits;
    }


    /**
     * Sets the validPhNoMinDigits value for this PrefixProfileData.
     * 
     * @param validPhNoMinDigits
     */
    public void setValidPhNoMinDigits(java.lang.Short validPhNoMinDigits) {
        this.validPhNoMinDigits = validPhNoMinDigits;
    }


    /**
     * Gets the validPhNoMaxDigits value for this PrefixProfileData.
     * 
     * @return validPhNoMaxDigits
     */
    public java.lang.Short getValidPhNoMaxDigits() {
        return validPhNoMaxDigits;
    }


    /**
     * Sets the validPhNoMaxDigits value for this PrefixProfileData.
     * 
     * @param validPhNoMaxDigits
     */
    public void setValidPhNoMaxDigits(java.lang.Short validPhNoMaxDigits) {
        this.validPhNoMaxDigits = validPhNoMaxDigits;
    }


    /**
     * Gets the numRepAreaCodeDigits value for this PrefixProfileData.
     * 
     * @return numRepAreaCodeDigits
     */
    public java.lang.Integer getNumRepAreaCodeDigits() {
        return numRepAreaCodeDigits;
    }


    /**
     * Sets the numRepAreaCodeDigits value for this PrefixProfileData.
     * 
     * @param numRepAreaCodeDigits
     */
    public void setNumRepAreaCodeDigits(java.lang.Integer numRepAreaCodeDigits) {
        this.numRepAreaCodeDigits = numRepAreaCodeDigits;
    }


    /**
     * Gets the prefixTypeId value for this PrefixProfileData.
     * 
     * @return prefixTypeId
     */
    public java.lang.Short getPrefixTypeId() {
        return prefixTypeId;
    }


    /**
     * Sets the prefixTypeId value for this PrefixProfileData.
     * 
     * @param prefixTypeId
     */
    public void setPrefixTypeId(java.lang.Short prefixTypeId) {
        this.prefixTypeId = prefixTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrefixProfileData)) return false;
        PrefixProfileData other = (PrefixProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prefixProfileId==null && other.getPrefixProfileId()==null) || 
             (this.prefixProfileId!=null &&
              this.prefixProfileId.equals(other.getPrefixProfileId()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.matchStartLocation==null && other.getMatchStartLocation()==null) || 
             (this.matchStartLocation!=null &&
              this.matchStartLocation.equals(other.getMatchStartLocation()))) &&
            ((this.totalMinDigits==null && other.getTotalMinDigits()==null) || 
             (this.totalMinDigits!=null &&
              this.totalMinDigits.equals(other.getTotalMinDigits()))) &&
            ((this.totalMaxDigits==null && other.getTotalMaxDigits()==null) || 
             (this.totalMaxDigits!=null &&
              this.totalMaxDigits.equals(other.getTotalMaxDigits()))) &&
            ((this.calltype==null && other.getCalltype()==null) || 
             (this.calltype!=null &&
              this.calltype.equals(other.getCalltype()))) &&
            ((this.inPmRuleId==null && other.getInPmRuleId()==null) || 
             (this.inPmRuleId!=null &&
              this.inPmRuleId.equals(other.getInPmRuleId()))) &&
            ((this.outPmRuleId==null && other.getOutPmRuleId()==null) || 
             (this.outPmRuleId!=null &&
              this.outPmRuleId.equals(other.getOutPmRuleId()))) &&
            ((this.nonSubscriberRoutingFlag==null && other.getNonSubscriberRoutingFlag()==null) || 
             (this.nonSubscriberRoutingFlag!=null &&
              this.nonSubscriberRoutingFlag.equals(other.getNonSubscriberRoutingFlag()))) &&
            ((this.nonSubscriberScriptId==null && other.getNonSubscriberScriptId()==null) || 
             (this.nonSubscriberScriptId!=null &&
              this.nonSubscriberScriptId.equals(other.getNonSubscriberScriptId()))) &&
            ((this.noCallingPartyRoutingFlag==null && other.getNoCallingPartyRoutingFlag()==null) || 
             (this.noCallingPartyRoutingFlag!=null &&
              this.noCallingPartyRoutingFlag.equals(other.getNoCallingPartyRoutingFlag()))) &&
            ((this.noCallingPartyScriptId==null && other.getNoCallingPartyScriptId()==null) || 
             (this.noCallingPartyScriptId!=null &&
              this.noCallingPartyScriptId.equals(other.getNoCallingPartyScriptId()))) &&
            ((this.phoneType==null && other.getPhoneType()==null) || 
             (this.phoneType!=null &&
              this.phoneType.equals(other.getPhoneType()))) &&
            ((this.phoneTypeInvalidScriptId==null && other.getPhoneTypeInvalidScriptId()==null) || 
             (this.phoneTypeInvalidScriptId!=null &&
              this.phoneTypeInvalidScriptId.equals(other.getPhoneTypeInvalidScriptId()))) &&
            ((this.digitType==null && other.getDigitType()==null) || 
             (this.digitType!=null &&
              this.digitType.equals(other.getDigitType()))) &&
            ((this.digitSubType==null && other.getDigitSubType()==null) || 
             (this.digitSubType!=null &&
              this.digitSubType.equals(other.getDigitSubType()))) &&
            ((this.natureOfAddress==null && other.getNatureOfAddress()==null) || 
             (this.natureOfAddress!=null &&
              this.natureOfAddress.equals(other.getNatureOfAddress()))) &&
            ((this.numberPlanIndicator==null && other.getNumberPlanIndicator()==null) || 
             (this.numberPlanIndicator!=null &&
              this.numberPlanIndicator.equals(other.getNumberPlanIndicator()))) &&
            ((this.numberLeadingPrefixDigits==null && other.getNumberLeadingPrefixDigits()==null) || 
             (this.numberLeadingPrefixDigits!=null &&
              this.numberLeadingPrefixDigits.equals(other.getNumberLeadingPrefixDigits()))) &&
            ((this.numberLeadingPrefixDigitsToStrip==null && other.getNumberLeadingPrefixDigitsToStrip()==null) || 
             (this.numberLeadingPrefixDigitsToStrip!=null &&
              this.numberLeadingPrefixDigitsToStrip.equals(other.getNumberLeadingPrefixDigitsToStrip()))) &&
            ((this.numberCarrierCodeDigits==null && other.getNumberCarrierCodeDigits()==null) || 
             (this.numberCarrierCodeDigits!=null &&
              this.numberCarrierCodeDigits.equals(other.getNumberCarrierCodeDigits()))) &&
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.routingLabelId==null && other.getRoutingLabelId()==null) || 
             (this.routingLabelId!=null &&
              this.routingLabelId.equals(other.getRoutingLabelId()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.routeMinDigits==null && other.getRouteMinDigits()==null) || 
             (this.routeMinDigits!=null &&
              this.routeMinDigits.equals(other.getRouteMinDigits()))) &&
            ((this.validPhNoMinDigits==null && other.getValidPhNoMinDigits()==null) || 
             (this.validPhNoMinDigits!=null &&
              this.validPhNoMinDigits.equals(other.getValidPhNoMinDigits()))) &&
            ((this.validPhNoMaxDigits==null && other.getValidPhNoMaxDigits()==null) || 
             (this.validPhNoMaxDigits!=null &&
              this.validPhNoMaxDigits.equals(other.getValidPhNoMaxDigits()))) &&
            ((this.numRepAreaCodeDigits==null && other.getNumRepAreaCodeDigits()==null) || 
             (this.numRepAreaCodeDigits!=null &&
              this.numRepAreaCodeDigits.equals(other.getNumRepAreaCodeDigits()))) &&
            ((this.prefixTypeId==null && other.getPrefixTypeId()==null) || 
             (this.prefixTypeId!=null &&
              this.prefixTypeId.equals(other.getPrefixTypeId())));
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
        if (getPrefixProfileId() != null) {
            _hashCode += getPrefixProfileId().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getMatchStartLocation() != null) {
            _hashCode += getMatchStartLocation().hashCode();
        }
        if (getTotalMinDigits() != null) {
            _hashCode += getTotalMinDigits().hashCode();
        }
        if (getTotalMaxDigits() != null) {
            _hashCode += getTotalMaxDigits().hashCode();
        }
        if (getCalltype() != null) {
            _hashCode += getCalltype().hashCode();
        }
        if (getInPmRuleId() != null) {
            _hashCode += getInPmRuleId().hashCode();
        }
        if (getOutPmRuleId() != null) {
            _hashCode += getOutPmRuleId().hashCode();
        }
        if (getNonSubscriberRoutingFlag() != null) {
            _hashCode += getNonSubscriberRoutingFlag().hashCode();
        }
        if (getNonSubscriberScriptId() != null) {
            _hashCode += getNonSubscriberScriptId().hashCode();
        }
        if (getNoCallingPartyRoutingFlag() != null) {
            _hashCode += getNoCallingPartyRoutingFlag().hashCode();
        }
        if (getNoCallingPartyScriptId() != null) {
            _hashCode += getNoCallingPartyScriptId().hashCode();
        }
        if (getPhoneType() != null) {
            _hashCode += getPhoneType().hashCode();
        }
        if (getPhoneTypeInvalidScriptId() != null) {
            _hashCode += getPhoneTypeInvalidScriptId().hashCode();
        }
        if (getDigitType() != null) {
            _hashCode += getDigitType().hashCode();
        }
        if (getDigitSubType() != null) {
            _hashCode += getDigitSubType().hashCode();
        }
        if (getNatureOfAddress() != null) {
            _hashCode += getNatureOfAddress().hashCode();
        }
        if (getNumberPlanIndicator() != null) {
            _hashCode += getNumberPlanIndicator().hashCode();
        }
        if (getNumberLeadingPrefixDigits() != null) {
            _hashCode += getNumberLeadingPrefixDigits().hashCode();
        }
        if (getNumberLeadingPrefixDigitsToStrip() != null) {
            _hashCode += getNumberLeadingPrefixDigitsToStrip().hashCode();
        }
        if (getNumberCarrierCodeDigits() != null) {
            _hashCode += getNumberCarrierCodeDigits().hashCode();
        }
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getRoutingLabelId() != null) {
            _hashCode += getRoutingLabelId().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getRouteMinDigits() != null) {
            _hashCode += getRouteMinDigits().hashCode();
        }
        if (getValidPhNoMinDigits() != null) {
            _hashCode += getValidPhNoMinDigits().hashCode();
        }
        if (getValidPhNoMaxDigits() != null) {
            _hashCode += getValidPhNoMaxDigits().hashCode();
        }
        if (getNumRepAreaCodeDigits() != null) {
            _hashCode += getNumRepAreaCodeDigits().hashCode();
        }
        if (getPrefixTypeId() != null) {
            _hashCode += getPrefixTypeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrefixProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PrefixProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchStartLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchStartLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMinDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalMinDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMaxDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalMaxDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("nonSubscriberRoutingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonSubscriberRoutingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonSubscriberScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonSubscriberScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noCallingPartyRoutingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noCallingPartyRoutingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noCallingPartyScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noCallingPartyScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneTypeInvalidScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneTypeInvalidScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digitSubType"));
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
        elemField.setFieldName("numberPlanIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberPlanIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberLeadingPrefixDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberLeadingPrefixDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberLeadingPrefixDigitsToStrip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberLeadingPrefixDigitsToStrip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberCarrierCodeDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberCarrierCodeDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classOfServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classOfServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingLabelId"));
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
        elemField.setFieldName("routeMinDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routeMinDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validPhNoMinDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validPhNoMinDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validPhNoMaxDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validPhNoMaxDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRepAreaCodeDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numRepAreaCodeDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixTypeId"));
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
