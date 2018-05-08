/**
 * BusinessGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class BusinessGroup  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String businessGroupId;
    private java.lang.String businessGroupName;
    private java.lang.String interLataCarrierId;
    private java.lang.String intraLataCarrierId;
    private java.lang.String intlCarrierId;
    private java.lang.String localCarrierId;
    private java.lang.String numberingPlanId;
    private java.lang.String inPmRuleId;
    private java.lang.String outPmRuleId;
    private java.lang.String callingPartyId;
    private java.lang.Integer elementAttributes;
    private java.lang.String classOfServiceId;
    private java.lang.Integer vpnAttributes;
    private java.lang.String billingNumber;
    private java.lang.String remoteAccessScriptId;
    private java.lang.String numberMatchingPrefix;
    private java.lang.Integer authenticationPinLength;
    private java.lang.String exceptionProfileId;
    private java.lang.String publicCallInPmRuleId;
    private java.lang.String publicCallOutPmRuleId;
    private java.lang.String shortIdentifier;
    private java.lang.String authcodeGroupId;
    private java.lang.Integer language;

    public BusinessGroup() {
    }

    public BusinessGroup(
           java.lang.String businessGroupId,
           java.lang.String businessGroupName,
           java.lang.String interLataCarrierId,
           java.lang.String intraLataCarrierId,
           java.lang.String intlCarrierId,
           java.lang.String localCarrierId,
           java.lang.String numberingPlanId,
           java.lang.String inPmRuleId,
           java.lang.String outPmRuleId,
           java.lang.String callingPartyId,
           java.lang.Integer elementAttributes,
           java.lang.String classOfServiceId,
           java.lang.Integer vpnAttributes,
           java.lang.String billingNumber,
           java.lang.String remoteAccessScriptId,
           java.lang.String numberMatchingPrefix,
           java.lang.Integer authenticationPinLength,
           java.lang.String exceptionProfileId,
           java.lang.String publicCallInPmRuleId,
           java.lang.String publicCallOutPmRuleId,
           java.lang.String shortIdentifier,
           java.lang.String authcodeGroupId,
           java.lang.Integer language) {
           this.businessGroupId = businessGroupId;
           this.businessGroupName = businessGroupName;
           this.interLataCarrierId = interLataCarrierId;
           this.intraLataCarrierId = intraLataCarrierId;
           this.intlCarrierId = intlCarrierId;
           this.localCarrierId = localCarrierId;
           this.numberingPlanId = numberingPlanId;
           this.inPmRuleId = inPmRuleId;
           this.outPmRuleId = outPmRuleId;
           this.callingPartyId = callingPartyId;
           this.elementAttributes = elementAttributes;
           this.classOfServiceId = classOfServiceId;
           this.vpnAttributes = vpnAttributes;
           this.billingNumber = billingNumber;
           this.remoteAccessScriptId = remoteAccessScriptId;
           this.numberMatchingPrefix = numberMatchingPrefix;
           this.authenticationPinLength = authenticationPinLength;
           this.exceptionProfileId = exceptionProfileId;
           this.publicCallInPmRuleId = publicCallInPmRuleId;
           this.publicCallOutPmRuleId = publicCallOutPmRuleId;
           this.shortIdentifier = shortIdentifier;
           this.authcodeGroupId = authcodeGroupId;
           this.language = language;
    }


    /**
     * Gets the businessGroupId value for this BusinessGroup.
     * 
     * @return businessGroupId
     */
    public java.lang.String getBusinessGroupId() {
        return businessGroupId;
    }


    /**
     * Sets the businessGroupId value for this BusinessGroup.
     * 
     * @param businessGroupId
     */
    public void setBusinessGroupId(java.lang.String businessGroupId) {
        this.businessGroupId = businessGroupId;
    }


    /**
     * Gets the businessGroupName value for this BusinessGroup.
     * 
     * @return businessGroupName
     */
    public java.lang.String getBusinessGroupName() {
        return businessGroupName;
    }


    /**
     * Sets the businessGroupName value for this BusinessGroup.
     * 
     * @param businessGroupName
     */
    public void setBusinessGroupName(java.lang.String businessGroupName) {
        this.businessGroupName = businessGroupName;
    }


    /**
     * Gets the interLataCarrierId value for this BusinessGroup.
     * 
     * @return interLataCarrierId
     */
    public java.lang.String getInterLataCarrierId() {
        return interLataCarrierId;
    }


    /**
     * Sets the interLataCarrierId value for this BusinessGroup.
     * 
     * @param interLataCarrierId
     */
    public void setInterLataCarrierId(java.lang.String interLataCarrierId) {
        this.interLataCarrierId = interLataCarrierId;
    }


    /**
     * Gets the intraLataCarrierId value for this BusinessGroup.
     * 
     * @return intraLataCarrierId
     */
    public java.lang.String getIntraLataCarrierId() {
        return intraLataCarrierId;
    }


    /**
     * Sets the intraLataCarrierId value for this BusinessGroup.
     * 
     * @param intraLataCarrierId
     */
    public void setIntraLataCarrierId(java.lang.String intraLataCarrierId) {
        this.intraLataCarrierId = intraLataCarrierId;
    }


    /**
     * Gets the intlCarrierId value for this BusinessGroup.
     * 
     * @return intlCarrierId
     */
    public java.lang.String getIntlCarrierId() {
        return intlCarrierId;
    }


    /**
     * Sets the intlCarrierId value for this BusinessGroup.
     * 
     * @param intlCarrierId
     */
    public void setIntlCarrierId(java.lang.String intlCarrierId) {
        this.intlCarrierId = intlCarrierId;
    }


    /**
     * Gets the localCarrierId value for this BusinessGroup.
     * 
     * @return localCarrierId
     */
    public java.lang.String getLocalCarrierId() {
        return localCarrierId;
    }


    /**
     * Sets the localCarrierId value for this BusinessGroup.
     * 
     * @param localCarrierId
     */
    public void setLocalCarrierId(java.lang.String localCarrierId) {
        this.localCarrierId = localCarrierId;
    }


    /**
     * Gets the numberingPlanId value for this BusinessGroup.
     * 
     * @return numberingPlanId
     */
    public java.lang.String getNumberingPlanId() {
        return numberingPlanId;
    }


    /**
     * Sets the numberingPlanId value for this BusinessGroup.
     * 
     * @param numberingPlanId
     */
    public void setNumberingPlanId(java.lang.String numberingPlanId) {
        this.numberingPlanId = numberingPlanId;
    }


    /**
     * Gets the inPmRuleId value for this BusinessGroup.
     * 
     * @return inPmRuleId
     */
    public java.lang.String getInPmRuleId() {
        return inPmRuleId;
    }


    /**
     * Sets the inPmRuleId value for this BusinessGroup.
     * 
     * @param inPmRuleId
     */
    public void setInPmRuleId(java.lang.String inPmRuleId) {
        this.inPmRuleId = inPmRuleId;
    }


    /**
     * Gets the outPmRuleId value for this BusinessGroup.
     * 
     * @return outPmRuleId
     */
    public java.lang.String getOutPmRuleId() {
        return outPmRuleId;
    }


    /**
     * Sets the outPmRuleId value for this BusinessGroup.
     * 
     * @param outPmRuleId
     */
    public void setOutPmRuleId(java.lang.String outPmRuleId) {
        this.outPmRuleId = outPmRuleId;
    }


    /**
     * Gets the callingPartyId value for this BusinessGroup.
     * 
     * @return callingPartyId
     */
    public java.lang.String getCallingPartyId() {
        return callingPartyId;
    }


    /**
     * Sets the callingPartyId value for this BusinessGroup.
     * 
     * @param callingPartyId
     */
    public void setCallingPartyId(java.lang.String callingPartyId) {
        this.callingPartyId = callingPartyId;
    }


    /**
     * Gets the elementAttributes value for this BusinessGroup.
     * 
     * @return elementAttributes
     */
    public java.lang.Integer getElementAttributes() {
        return elementAttributes;
    }


    /**
     * Sets the elementAttributes value for this BusinessGroup.
     * 
     * @param elementAttributes
     */
    public void setElementAttributes(java.lang.Integer elementAttributes) {
        this.elementAttributes = elementAttributes;
    }


    /**
     * Gets the classOfServiceId value for this BusinessGroup.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this BusinessGroup.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the vpnAttributes value for this BusinessGroup.
     * 
     * @return vpnAttributes
     */
    public java.lang.Integer getVpnAttributes() {
        return vpnAttributes;
    }


    /**
     * Sets the vpnAttributes value for this BusinessGroup.
     * 
     * @param vpnAttributes
     */
    public void setVpnAttributes(java.lang.Integer vpnAttributes) {
        this.vpnAttributes = vpnAttributes;
    }


    /**
     * Gets the billingNumber value for this BusinessGroup.
     * 
     * @return billingNumber
     */
    public java.lang.String getBillingNumber() {
        return billingNumber;
    }


    /**
     * Sets the billingNumber value for this BusinessGroup.
     * 
     * @param billingNumber
     */
    public void setBillingNumber(java.lang.String billingNumber) {
        this.billingNumber = billingNumber;
    }


    /**
     * Gets the remoteAccessScriptId value for this BusinessGroup.
     * 
     * @return remoteAccessScriptId
     */
    public java.lang.String getRemoteAccessScriptId() {
        return remoteAccessScriptId;
    }


    /**
     * Sets the remoteAccessScriptId value for this BusinessGroup.
     * 
     * @param remoteAccessScriptId
     */
    public void setRemoteAccessScriptId(java.lang.String remoteAccessScriptId) {
        this.remoteAccessScriptId = remoteAccessScriptId;
    }


    /**
     * Gets the numberMatchingPrefix value for this BusinessGroup.
     * 
     * @return numberMatchingPrefix
     */
    public java.lang.String getNumberMatchingPrefix() {
        return numberMatchingPrefix;
    }


    /**
     * Sets the numberMatchingPrefix value for this BusinessGroup.
     * 
     * @param numberMatchingPrefix
     */
    public void setNumberMatchingPrefix(java.lang.String numberMatchingPrefix) {
        this.numberMatchingPrefix = numberMatchingPrefix;
    }


    /**
     * Gets the authenticationPinLength value for this BusinessGroup.
     * 
     * @return authenticationPinLength
     */
    public java.lang.Integer getAuthenticationPinLength() {
        return authenticationPinLength;
    }


    /**
     * Sets the authenticationPinLength value for this BusinessGroup.
     * 
     * @param authenticationPinLength
     */
    public void setAuthenticationPinLength(java.lang.Integer authenticationPinLength) {
        this.authenticationPinLength = authenticationPinLength;
    }


    /**
     * Gets the exceptionProfileId value for this BusinessGroup.
     * 
     * @return exceptionProfileId
     */
    public java.lang.String getExceptionProfileId() {
        return exceptionProfileId;
    }


    /**
     * Sets the exceptionProfileId value for this BusinessGroup.
     * 
     * @param exceptionProfileId
     */
    public void setExceptionProfileId(java.lang.String exceptionProfileId) {
        this.exceptionProfileId = exceptionProfileId;
    }


    /**
     * Gets the publicCallInPmRuleId value for this BusinessGroup.
     * 
     * @return publicCallInPmRuleId
     */
    public java.lang.String getPublicCallInPmRuleId() {
        return publicCallInPmRuleId;
    }


    /**
     * Sets the publicCallInPmRuleId value for this BusinessGroup.
     * 
     * @param publicCallInPmRuleId
     */
    public void setPublicCallInPmRuleId(java.lang.String publicCallInPmRuleId) {
        this.publicCallInPmRuleId = publicCallInPmRuleId;
    }


    /**
     * Gets the publicCallOutPmRuleId value for this BusinessGroup.
     * 
     * @return publicCallOutPmRuleId
     */
    public java.lang.String getPublicCallOutPmRuleId() {
        return publicCallOutPmRuleId;
    }


    /**
     * Sets the publicCallOutPmRuleId value for this BusinessGroup.
     * 
     * @param publicCallOutPmRuleId
     */
    public void setPublicCallOutPmRuleId(java.lang.String publicCallOutPmRuleId) {
        this.publicCallOutPmRuleId = publicCallOutPmRuleId;
    }


    /**
     * Gets the shortIdentifier value for this BusinessGroup.
     * 
     * @return shortIdentifier
     */
    public java.lang.String getShortIdentifier() {
        return shortIdentifier;
    }


    /**
     * Sets the shortIdentifier value for this BusinessGroup.
     * 
     * @param shortIdentifier
     */
    public void setShortIdentifier(java.lang.String shortIdentifier) {
        this.shortIdentifier = shortIdentifier;
    }


    /**
     * Gets the authcodeGroupId value for this BusinessGroup.
     * 
     * @return authcodeGroupId
     */
    public java.lang.String getAuthcodeGroupId() {
        return authcodeGroupId;
    }


    /**
     * Sets the authcodeGroupId value for this BusinessGroup.
     * 
     * @param authcodeGroupId
     */
    public void setAuthcodeGroupId(java.lang.String authcodeGroupId) {
        this.authcodeGroupId = authcodeGroupId;
    }


    /**
     * Gets the language value for this BusinessGroup.
     * 
     * @return language
     */
    public java.lang.Integer getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this BusinessGroup.
     * 
     * @param language
     */
    public void setLanguage(java.lang.Integer language) {
        this.language = language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessGroup)) return false;
        BusinessGroup other = (BusinessGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessGroupId==null && other.getBusinessGroupId()==null) || 
             (this.businessGroupId!=null &&
              this.businessGroupId.equals(other.getBusinessGroupId()))) &&
            ((this.businessGroupName==null && other.getBusinessGroupName()==null) || 
             (this.businessGroupName!=null &&
              this.businessGroupName.equals(other.getBusinessGroupName()))) &&
            ((this.interLataCarrierId==null && other.getInterLataCarrierId()==null) || 
             (this.interLataCarrierId!=null &&
              this.interLataCarrierId.equals(other.getInterLataCarrierId()))) &&
            ((this.intraLataCarrierId==null && other.getIntraLataCarrierId()==null) || 
             (this.intraLataCarrierId!=null &&
              this.intraLataCarrierId.equals(other.getIntraLataCarrierId()))) &&
            ((this.intlCarrierId==null && other.getIntlCarrierId()==null) || 
             (this.intlCarrierId!=null &&
              this.intlCarrierId.equals(other.getIntlCarrierId()))) &&
            ((this.localCarrierId==null && other.getLocalCarrierId()==null) || 
             (this.localCarrierId!=null &&
              this.localCarrierId.equals(other.getLocalCarrierId()))) &&
            ((this.numberingPlanId==null && other.getNumberingPlanId()==null) || 
             (this.numberingPlanId!=null &&
              this.numberingPlanId.equals(other.getNumberingPlanId()))) &&
            ((this.inPmRuleId==null && other.getInPmRuleId()==null) || 
             (this.inPmRuleId!=null &&
              this.inPmRuleId.equals(other.getInPmRuleId()))) &&
            ((this.outPmRuleId==null && other.getOutPmRuleId()==null) || 
             (this.outPmRuleId!=null &&
              this.outPmRuleId.equals(other.getOutPmRuleId()))) &&
            ((this.callingPartyId==null && other.getCallingPartyId()==null) || 
             (this.callingPartyId!=null &&
              this.callingPartyId.equals(other.getCallingPartyId()))) &&
            ((this.elementAttributes==null && other.getElementAttributes()==null) || 
             (this.elementAttributes!=null &&
              this.elementAttributes.equals(other.getElementAttributes()))) &&
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.vpnAttributes==null && other.getVpnAttributes()==null) || 
             (this.vpnAttributes!=null &&
              this.vpnAttributes.equals(other.getVpnAttributes()))) &&
            ((this.billingNumber==null && other.getBillingNumber()==null) || 
             (this.billingNumber!=null &&
              this.billingNumber.equals(other.getBillingNumber()))) &&
            ((this.remoteAccessScriptId==null && other.getRemoteAccessScriptId()==null) || 
             (this.remoteAccessScriptId!=null &&
              this.remoteAccessScriptId.equals(other.getRemoteAccessScriptId()))) &&
            ((this.numberMatchingPrefix==null && other.getNumberMatchingPrefix()==null) || 
             (this.numberMatchingPrefix!=null &&
              this.numberMatchingPrefix.equals(other.getNumberMatchingPrefix()))) &&
            ((this.authenticationPinLength==null && other.getAuthenticationPinLength()==null) || 
             (this.authenticationPinLength!=null &&
              this.authenticationPinLength.equals(other.getAuthenticationPinLength()))) &&
            ((this.exceptionProfileId==null && other.getExceptionProfileId()==null) || 
             (this.exceptionProfileId!=null &&
              this.exceptionProfileId.equals(other.getExceptionProfileId()))) &&
            ((this.publicCallInPmRuleId==null && other.getPublicCallInPmRuleId()==null) || 
             (this.publicCallInPmRuleId!=null &&
              this.publicCallInPmRuleId.equals(other.getPublicCallInPmRuleId()))) &&
            ((this.publicCallOutPmRuleId==null && other.getPublicCallOutPmRuleId()==null) || 
             (this.publicCallOutPmRuleId!=null &&
              this.publicCallOutPmRuleId.equals(other.getPublicCallOutPmRuleId()))) &&
            ((this.shortIdentifier==null && other.getShortIdentifier()==null) || 
             (this.shortIdentifier!=null &&
              this.shortIdentifier.equals(other.getShortIdentifier()))) &&
            ((this.authcodeGroupId==null && other.getAuthcodeGroupId()==null) || 
             (this.authcodeGroupId!=null &&
              this.authcodeGroupId.equals(other.getAuthcodeGroupId()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage())));
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
        if (getBusinessGroupId() != null) {
            _hashCode += getBusinessGroupId().hashCode();
        }
        if (getBusinessGroupName() != null) {
            _hashCode += getBusinessGroupName().hashCode();
        }
        if (getInterLataCarrierId() != null) {
            _hashCode += getInterLataCarrierId().hashCode();
        }
        if (getIntraLataCarrierId() != null) {
            _hashCode += getIntraLataCarrierId().hashCode();
        }
        if (getIntlCarrierId() != null) {
            _hashCode += getIntlCarrierId().hashCode();
        }
        if (getLocalCarrierId() != null) {
            _hashCode += getLocalCarrierId().hashCode();
        }
        if (getNumberingPlanId() != null) {
            _hashCode += getNumberingPlanId().hashCode();
        }
        if (getInPmRuleId() != null) {
            _hashCode += getInPmRuleId().hashCode();
        }
        if (getOutPmRuleId() != null) {
            _hashCode += getOutPmRuleId().hashCode();
        }
        if (getCallingPartyId() != null) {
            _hashCode += getCallingPartyId().hashCode();
        }
        if (getElementAttributes() != null) {
            _hashCode += getElementAttributes().hashCode();
        }
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getVpnAttributes() != null) {
            _hashCode += getVpnAttributes().hashCode();
        }
        if (getBillingNumber() != null) {
            _hashCode += getBillingNumber().hashCode();
        }
        if (getRemoteAccessScriptId() != null) {
            _hashCode += getRemoteAccessScriptId().hashCode();
        }
        if (getNumberMatchingPrefix() != null) {
            _hashCode += getNumberMatchingPrefix().hashCode();
        }
        if (getAuthenticationPinLength() != null) {
            _hashCode += getAuthenticationPinLength().hashCode();
        }
        if (getExceptionProfileId() != null) {
            _hashCode += getExceptionProfileId().hashCode();
        }
        if (getPublicCallInPmRuleId() != null) {
            _hashCode += getPublicCallInPmRuleId().hashCode();
        }
        if (getPublicCallOutPmRuleId() != null) {
            _hashCode += getPublicCallOutPmRuleId().hashCode();
        }
        if (getShortIdentifier() != null) {
            _hashCode += getShortIdentifier().hashCode();
        }
        if (getAuthcodeGroupId() != null) {
            _hashCode += getAuthcodeGroupId().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BusinessGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interLataCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interLataCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intraLataCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intraLataCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intlCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intlCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localCarrierId"));
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
        elemField.setFieldName("callingPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingPartyId"));
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
        elemField.setFieldName("vpnAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vpnAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteAccessScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteAccessScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberMatchingPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberMatchingPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationPinLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationPinLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicCallInPmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicCallInPmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicCallOutPmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicCallOutPmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authcodeGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authcodeGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
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
