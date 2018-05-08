/**
 * ClassOfService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ClassOfService  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String classOfServiceId;
    private java.lang.String authcodeScriptId;
    private java.lang.String screeningScriptId;
    private java.lang.String intlBlockingScriptId;
    private java.lang.String sacRoutingScriptId;
    private java.lang.String nonSacRoutingScriptId;
    private java.lang.Integer nonSubscriberRoutingFlags;
    private java.lang.Integer casualRoutingFlags;
    private java.lang.Integer servicesFlags;
    private java.lang.Integer userNonSubscriberRoutingFlags;
    private java.lang.Integer userCasualFlags;
    private java.lang.String exceptionProfileId;
    private java.lang.Short blockingPrecedence;
    private java.lang.String description;
    private java.lang.String shortKeyProfileId;
    private java.lang.String dtmfProfileId;
    private java.lang.String mwiScr;
    private java.lang.String mwiServiceNumber;

    public ClassOfService() {
    }

    public ClassOfService(
           java.lang.String classOfServiceId,
           java.lang.String authcodeScriptId,
           java.lang.String screeningScriptId,
           java.lang.String intlBlockingScriptId,
           java.lang.String sacRoutingScriptId,
           java.lang.String nonSacRoutingScriptId,
           java.lang.Integer nonSubscriberRoutingFlags,
           java.lang.Integer casualRoutingFlags,
           java.lang.Integer servicesFlags,
           java.lang.Integer userNonSubscriberRoutingFlags,
           java.lang.Integer userCasualFlags,
           java.lang.String exceptionProfileId,
           java.lang.Short blockingPrecedence,
           java.lang.String description,
           java.lang.String shortKeyProfileId,
           java.lang.String dtmfProfileId,
           java.lang.String mwiScr,
           java.lang.String mwiServiceNumber) {
           this.classOfServiceId = classOfServiceId;
           this.authcodeScriptId = authcodeScriptId;
           this.screeningScriptId = screeningScriptId;
           this.intlBlockingScriptId = intlBlockingScriptId;
           this.sacRoutingScriptId = sacRoutingScriptId;
           this.nonSacRoutingScriptId = nonSacRoutingScriptId;
           this.nonSubscriberRoutingFlags = nonSubscriberRoutingFlags;
           this.casualRoutingFlags = casualRoutingFlags;
           this.servicesFlags = servicesFlags;
           this.userNonSubscriberRoutingFlags = userNonSubscriberRoutingFlags;
           this.userCasualFlags = userCasualFlags;
           this.exceptionProfileId = exceptionProfileId;
           this.blockingPrecedence = blockingPrecedence;
           this.description = description;
           this.shortKeyProfileId = shortKeyProfileId;
           this.dtmfProfileId = dtmfProfileId;
           this.mwiScr = mwiScr;
           this.mwiServiceNumber = mwiServiceNumber;
    }


    /**
     * Gets the classOfServiceId value for this ClassOfService.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this ClassOfService.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the authcodeScriptId value for this ClassOfService.
     * 
     * @return authcodeScriptId
     */
    public java.lang.String getAuthcodeScriptId() {
        return authcodeScriptId;
    }


    /**
     * Sets the authcodeScriptId value for this ClassOfService.
     * 
     * @param authcodeScriptId
     */
    public void setAuthcodeScriptId(java.lang.String authcodeScriptId) {
        this.authcodeScriptId = authcodeScriptId;
    }


    /**
     * Gets the screeningScriptId value for this ClassOfService.
     * 
     * @return screeningScriptId
     */
    public java.lang.String getScreeningScriptId() {
        return screeningScriptId;
    }


    /**
     * Sets the screeningScriptId value for this ClassOfService.
     * 
     * @param screeningScriptId
     */
    public void setScreeningScriptId(java.lang.String screeningScriptId) {
        this.screeningScriptId = screeningScriptId;
    }


    /**
     * Gets the intlBlockingScriptId value for this ClassOfService.
     * 
     * @return intlBlockingScriptId
     */
    public java.lang.String getIntlBlockingScriptId() {
        return intlBlockingScriptId;
    }


    /**
     * Sets the intlBlockingScriptId value for this ClassOfService.
     * 
     * @param intlBlockingScriptId
     */
    public void setIntlBlockingScriptId(java.lang.String intlBlockingScriptId) {
        this.intlBlockingScriptId = intlBlockingScriptId;
    }


    /**
     * Gets the sacRoutingScriptId value for this ClassOfService.
     * 
     * @return sacRoutingScriptId
     */
    public java.lang.String getSacRoutingScriptId() {
        return sacRoutingScriptId;
    }


    /**
     * Sets the sacRoutingScriptId value for this ClassOfService.
     * 
     * @param sacRoutingScriptId
     */
    public void setSacRoutingScriptId(java.lang.String sacRoutingScriptId) {
        this.sacRoutingScriptId = sacRoutingScriptId;
    }


    /**
     * Gets the nonSacRoutingScriptId value for this ClassOfService.
     * 
     * @return nonSacRoutingScriptId
     */
    public java.lang.String getNonSacRoutingScriptId() {
        return nonSacRoutingScriptId;
    }


    /**
     * Sets the nonSacRoutingScriptId value for this ClassOfService.
     * 
     * @param nonSacRoutingScriptId
     */
    public void setNonSacRoutingScriptId(java.lang.String nonSacRoutingScriptId) {
        this.nonSacRoutingScriptId = nonSacRoutingScriptId;
    }


    /**
     * Gets the nonSubscriberRoutingFlags value for this ClassOfService.
     * 
     * @return nonSubscriberRoutingFlags
     */
    public java.lang.Integer getNonSubscriberRoutingFlags() {
        return nonSubscriberRoutingFlags;
    }


    /**
     * Sets the nonSubscriberRoutingFlags value for this ClassOfService.
     * 
     * @param nonSubscriberRoutingFlags
     */
    public void setNonSubscriberRoutingFlags(java.lang.Integer nonSubscriberRoutingFlags) {
        this.nonSubscriberRoutingFlags = nonSubscriberRoutingFlags;
    }


    /**
     * Gets the casualRoutingFlags value for this ClassOfService.
     * 
     * @return casualRoutingFlags
     */
    public java.lang.Integer getCasualRoutingFlags() {
        return casualRoutingFlags;
    }


    /**
     * Sets the casualRoutingFlags value for this ClassOfService.
     * 
     * @param casualRoutingFlags
     */
    public void setCasualRoutingFlags(java.lang.Integer casualRoutingFlags) {
        this.casualRoutingFlags = casualRoutingFlags;
    }


    /**
     * Gets the servicesFlags value for this ClassOfService.
     * 
     * @return servicesFlags
     */
    public java.lang.Integer getServicesFlags() {
        return servicesFlags;
    }


    /**
     * Sets the servicesFlags value for this ClassOfService.
     * 
     * @param servicesFlags
     */
    public void setServicesFlags(java.lang.Integer servicesFlags) {
        this.servicesFlags = servicesFlags;
    }


    /**
     * Gets the userNonSubscriberRoutingFlags value for this ClassOfService.
     * 
     * @return userNonSubscriberRoutingFlags
     */
    public java.lang.Integer getUserNonSubscriberRoutingFlags() {
        return userNonSubscriberRoutingFlags;
    }


    /**
     * Sets the userNonSubscriberRoutingFlags value for this ClassOfService.
     * 
     * @param userNonSubscriberRoutingFlags
     */
    public void setUserNonSubscriberRoutingFlags(java.lang.Integer userNonSubscriberRoutingFlags) {
        this.userNonSubscriberRoutingFlags = userNonSubscriberRoutingFlags;
    }


    /**
     * Gets the userCasualFlags value for this ClassOfService.
     * 
     * @return userCasualFlags
     */
    public java.lang.Integer getUserCasualFlags() {
        return userCasualFlags;
    }


    /**
     * Sets the userCasualFlags value for this ClassOfService.
     * 
     * @param userCasualFlags
     */
    public void setUserCasualFlags(java.lang.Integer userCasualFlags) {
        this.userCasualFlags = userCasualFlags;
    }


    /**
     * Gets the exceptionProfileId value for this ClassOfService.
     * 
     * @return exceptionProfileId
     */
    public java.lang.String getExceptionProfileId() {
        return exceptionProfileId;
    }


    /**
     * Sets the exceptionProfileId value for this ClassOfService.
     * 
     * @param exceptionProfileId
     */
    public void setExceptionProfileId(java.lang.String exceptionProfileId) {
        this.exceptionProfileId = exceptionProfileId;
    }


    /**
     * Gets the blockingPrecedence value for this ClassOfService.
     * 
     * @return blockingPrecedence
     */
    public java.lang.Short getBlockingPrecedence() {
        return blockingPrecedence;
    }


    /**
     * Sets the blockingPrecedence value for this ClassOfService.
     * 
     * @param blockingPrecedence
     */
    public void setBlockingPrecedence(java.lang.Short blockingPrecedence) {
        this.blockingPrecedence = blockingPrecedence;
    }


    /**
     * Gets the description value for this ClassOfService.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ClassOfService.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the shortKeyProfileId value for this ClassOfService.
     * 
     * @return shortKeyProfileId
     */
    public java.lang.String getShortKeyProfileId() {
        return shortKeyProfileId;
    }


    /**
     * Sets the shortKeyProfileId value for this ClassOfService.
     * 
     * @param shortKeyProfileId
     */
    public void setShortKeyProfileId(java.lang.String shortKeyProfileId) {
        this.shortKeyProfileId = shortKeyProfileId;
    }


    /**
     * Gets the dtmfProfileId value for this ClassOfService.
     * 
     * @return dtmfProfileId
     */
    public java.lang.String getDtmfProfileId() {
        return dtmfProfileId;
    }


    /**
     * Sets the dtmfProfileId value for this ClassOfService.
     * 
     * @param dtmfProfileId
     */
    public void setDtmfProfileId(java.lang.String dtmfProfileId) {
        this.dtmfProfileId = dtmfProfileId;
    }


    /**
     * Gets the mwiScr value for this ClassOfService.
     * 
     * @return mwiScr
     */
    public java.lang.String getMwiScr() {
        return mwiScr;
    }


    /**
     * Sets the mwiScr value for this ClassOfService.
     * 
     * @param mwiScr
     */
    public void setMwiScr(java.lang.String mwiScr) {
        this.mwiScr = mwiScr;
    }


    /**
     * Gets the mwiServiceNumber value for this ClassOfService.
     * 
     * @return mwiServiceNumber
     */
    public java.lang.String getMwiServiceNumber() {
        return mwiServiceNumber;
    }


    /**
     * Sets the mwiServiceNumber value for this ClassOfService.
     * 
     * @param mwiServiceNumber
     */
    public void setMwiServiceNumber(java.lang.String mwiServiceNumber) {
        this.mwiServiceNumber = mwiServiceNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClassOfService)) return false;
        ClassOfService other = (ClassOfService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.authcodeScriptId==null && other.getAuthcodeScriptId()==null) || 
             (this.authcodeScriptId!=null &&
              this.authcodeScriptId.equals(other.getAuthcodeScriptId()))) &&
            ((this.screeningScriptId==null && other.getScreeningScriptId()==null) || 
             (this.screeningScriptId!=null &&
              this.screeningScriptId.equals(other.getScreeningScriptId()))) &&
            ((this.intlBlockingScriptId==null && other.getIntlBlockingScriptId()==null) || 
             (this.intlBlockingScriptId!=null &&
              this.intlBlockingScriptId.equals(other.getIntlBlockingScriptId()))) &&
            ((this.sacRoutingScriptId==null && other.getSacRoutingScriptId()==null) || 
             (this.sacRoutingScriptId!=null &&
              this.sacRoutingScriptId.equals(other.getSacRoutingScriptId()))) &&
            ((this.nonSacRoutingScriptId==null && other.getNonSacRoutingScriptId()==null) || 
             (this.nonSacRoutingScriptId!=null &&
              this.nonSacRoutingScriptId.equals(other.getNonSacRoutingScriptId()))) &&
            ((this.nonSubscriberRoutingFlags==null && other.getNonSubscriberRoutingFlags()==null) || 
             (this.nonSubscriberRoutingFlags!=null &&
              this.nonSubscriberRoutingFlags.equals(other.getNonSubscriberRoutingFlags()))) &&
            ((this.casualRoutingFlags==null && other.getCasualRoutingFlags()==null) || 
             (this.casualRoutingFlags!=null &&
              this.casualRoutingFlags.equals(other.getCasualRoutingFlags()))) &&
            ((this.servicesFlags==null && other.getServicesFlags()==null) || 
             (this.servicesFlags!=null &&
              this.servicesFlags.equals(other.getServicesFlags()))) &&
            ((this.userNonSubscriberRoutingFlags==null && other.getUserNonSubscriberRoutingFlags()==null) || 
             (this.userNonSubscriberRoutingFlags!=null &&
              this.userNonSubscriberRoutingFlags.equals(other.getUserNonSubscriberRoutingFlags()))) &&
            ((this.userCasualFlags==null && other.getUserCasualFlags()==null) || 
             (this.userCasualFlags!=null &&
              this.userCasualFlags.equals(other.getUserCasualFlags()))) &&
            ((this.exceptionProfileId==null && other.getExceptionProfileId()==null) || 
             (this.exceptionProfileId!=null &&
              this.exceptionProfileId.equals(other.getExceptionProfileId()))) &&
            ((this.blockingPrecedence==null && other.getBlockingPrecedence()==null) || 
             (this.blockingPrecedence!=null &&
              this.blockingPrecedence.equals(other.getBlockingPrecedence()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.shortKeyProfileId==null && other.getShortKeyProfileId()==null) || 
             (this.shortKeyProfileId!=null &&
              this.shortKeyProfileId.equals(other.getShortKeyProfileId()))) &&
            ((this.dtmfProfileId==null && other.getDtmfProfileId()==null) || 
             (this.dtmfProfileId!=null &&
              this.dtmfProfileId.equals(other.getDtmfProfileId()))) &&
            ((this.mwiScr==null && other.getMwiScr()==null) || 
             (this.mwiScr!=null &&
              this.mwiScr.equals(other.getMwiScr()))) &&
            ((this.mwiServiceNumber==null && other.getMwiServiceNumber()==null) || 
             (this.mwiServiceNumber!=null &&
              this.mwiServiceNumber.equals(other.getMwiServiceNumber())));
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
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getAuthcodeScriptId() != null) {
            _hashCode += getAuthcodeScriptId().hashCode();
        }
        if (getScreeningScriptId() != null) {
            _hashCode += getScreeningScriptId().hashCode();
        }
        if (getIntlBlockingScriptId() != null) {
            _hashCode += getIntlBlockingScriptId().hashCode();
        }
        if (getSacRoutingScriptId() != null) {
            _hashCode += getSacRoutingScriptId().hashCode();
        }
        if (getNonSacRoutingScriptId() != null) {
            _hashCode += getNonSacRoutingScriptId().hashCode();
        }
        if (getNonSubscriberRoutingFlags() != null) {
            _hashCode += getNonSubscriberRoutingFlags().hashCode();
        }
        if (getCasualRoutingFlags() != null) {
            _hashCode += getCasualRoutingFlags().hashCode();
        }
        if (getServicesFlags() != null) {
            _hashCode += getServicesFlags().hashCode();
        }
        if (getUserNonSubscriberRoutingFlags() != null) {
            _hashCode += getUserNonSubscriberRoutingFlags().hashCode();
        }
        if (getUserCasualFlags() != null) {
            _hashCode += getUserCasualFlags().hashCode();
        }
        if (getExceptionProfileId() != null) {
            _hashCode += getExceptionProfileId().hashCode();
        }
        if (getBlockingPrecedence() != null) {
            _hashCode += getBlockingPrecedence().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getShortKeyProfileId() != null) {
            _hashCode += getShortKeyProfileId().hashCode();
        }
        if (getDtmfProfileId() != null) {
            _hashCode += getDtmfProfileId().hashCode();
        }
        if (getMwiScr() != null) {
            _hashCode += getMwiScr().hashCode();
        }
        if (getMwiServiceNumber() != null) {
            _hashCode += getMwiServiceNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClassOfService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ClassOfService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classOfServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classOfServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authcodeScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authcodeScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screeningScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "screeningScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intlBlockingScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intlBlockingScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sacRoutingScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sacRoutingScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonSacRoutingScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonSacRoutingScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonSubscriberRoutingFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonSubscriberRoutingFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("casualRoutingFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "casualRoutingFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicesFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicesFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNonSubscriberRoutingFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userNonSubscriberRoutingFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCasualFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCasualFlags"));
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
        elemField.setFieldName("blockingPrecedence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockingPrecedence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortKeyProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortKeyProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtmfProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtmfProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mwiScr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mwiScr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mwiServiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mwiServiceNumber"));
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
