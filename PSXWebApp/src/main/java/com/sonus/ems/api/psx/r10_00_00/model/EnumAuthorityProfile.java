/**
 * EnumAuthorityProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class EnumAuthorityProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String enumAuthProfileId;
    private java.lang.String emailAddress;
    private java.lang.Integer refreshTime;
    private java.lang.Integer retryTime;
    private java.lang.Integer expireTime;
    private java.lang.Integer minimumTtl;
    private java.lang.String origin;

    public EnumAuthorityProfile() {
    }

    public EnumAuthorityProfile(
           java.lang.String enumAuthProfileId,
           java.lang.String emailAddress,
           java.lang.Integer refreshTime,
           java.lang.Integer retryTime,
           java.lang.Integer expireTime,
           java.lang.Integer minimumTtl,
           java.lang.String origin) {
           this.enumAuthProfileId = enumAuthProfileId;
           this.emailAddress = emailAddress;
           this.refreshTime = refreshTime;
           this.retryTime = retryTime;
           this.expireTime = expireTime;
           this.minimumTtl = minimumTtl;
           this.origin = origin;
    }


    /**
     * Gets the enumAuthProfileId value for this EnumAuthorityProfile.
     * 
     * @return enumAuthProfileId
     */
    public java.lang.String getEnumAuthProfileId() {
        return enumAuthProfileId;
    }


    /**
     * Sets the enumAuthProfileId value for this EnumAuthorityProfile.
     * 
     * @param enumAuthProfileId
     */
    public void setEnumAuthProfileId(java.lang.String enumAuthProfileId) {
        this.enumAuthProfileId = enumAuthProfileId;
    }


    /**
     * Gets the emailAddress value for this EnumAuthorityProfile.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this EnumAuthorityProfile.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the refreshTime value for this EnumAuthorityProfile.
     * 
     * @return refreshTime
     */
    public java.lang.Integer getRefreshTime() {
        return refreshTime;
    }


    /**
     * Sets the refreshTime value for this EnumAuthorityProfile.
     * 
     * @param refreshTime
     */
    public void setRefreshTime(java.lang.Integer refreshTime) {
        this.refreshTime = refreshTime;
    }


    /**
     * Gets the retryTime value for this EnumAuthorityProfile.
     * 
     * @return retryTime
     */
    public java.lang.Integer getRetryTime() {
        return retryTime;
    }


    /**
     * Sets the retryTime value for this EnumAuthorityProfile.
     * 
     * @param retryTime
     */
    public void setRetryTime(java.lang.Integer retryTime) {
        this.retryTime = retryTime;
    }


    /**
     * Gets the expireTime value for this EnumAuthorityProfile.
     * 
     * @return expireTime
     */
    public java.lang.Integer getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this EnumAuthorityProfile.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.Integer expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the minimumTtl value for this EnumAuthorityProfile.
     * 
     * @return minimumTtl
     */
    public java.lang.Integer getMinimumTtl() {
        return minimumTtl;
    }


    /**
     * Sets the minimumTtl value for this EnumAuthorityProfile.
     * 
     * @param minimumTtl
     */
    public void setMinimumTtl(java.lang.Integer minimumTtl) {
        this.minimumTtl = minimumTtl;
    }


    /**
     * Gets the origin value for this EnumAuthorityProfile.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this EnumAuthorityProfile.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumAuthorityProfile)) return false;
        EnumAuthorityProfile other = (EnumAuthorityProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enumAuthProfileId==null && other.getEnumAuthProfileId()==null) || 
             (this.enumAuthProfileId!=null &&
              this.enumAuthProfileId.equals(other.getEnumAuthProfileId()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.refreshTime==null && other.getRefreshTime()==null) || 
             (this.refreshTime!=null &&
              this.refreshTime.equals(other.getRefreshTime()))) &&
            ((this.retryTime==null && other.getRetryTime()==null) || 
             (this.retryTime!=null &&
              this.retryTime.equals(other.getRetryTime()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime()))) &&
            ((this.minimumTtl==null && other.getMinimumTtl()==null) || 
             (this.minimumTtl!=null &&
              this.minimumTtl.equals(other.getMinimumTtl()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin())));
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
        if (getEnumAuthProfileId() != null) {
            _hashCode += getEnumAuthProfileId().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getRefreshTime() != null) {
            _hashCode += getRefreshTime().hashCode();
        }
        if (getRetryTime() != null) {
            _hashCode += getRetryTime().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        if (getMinimumTtl() != null) {
            _hashCode += getMinimumTtl().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumAuthorityProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumAuthorityProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumAuthProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumAuthProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refreshTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retryTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumTtl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumTtl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origin"));
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
