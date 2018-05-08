/**
 * NumberTranslationProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class NumberTranslationProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String translationProfileId;

    private java.lang.Short servicesProvisioned;

    private java.lang.Short phoneType;

    private java.lang.Short suspendedFlag;

    public NumberTranslationProfile() {
    }

    public NumberTranslationProfile(
           java.lang.String translationProfileId,
           java.lang.Short servicesProvisioned,
           java.lang.Short phoneType,
           java.lang.Short suspendedFlag) {
        this.translationProfileId = translationProfileId;
        this.servicesProvisioned = servicesProvisioned;
        this.phoneType = phoneType;
        this.suspendedFlag = suspendedFlag;
    }


    /**
     * Gets the translationProfileId value for this NumberTranslationProfile.
     * 
     * @return translationProfileId
     */
    public java.lang.String getTranslationProfileId() {
        return translationProfileId;
    }


    /**
     * Sets the translationProfileId value for this NumberTranslationProfile.
     * 
     * @param translationProfileId
     */
    public void setTranslationProfileId(java.lang.String translationProfileId) {
        this.translationProfileId = translationProfileId;
    }


    /**
     * Gets the servicesProvisioned value for this NumberTranslationProfile.
     * 
     * @return servicesProvisioned
     */
    public java.lang.Short getServicesProvisioned() {
        return servicesProvisioned;
    }


    /**
     * Sets the servicesProvisioned value for this NumberTranslationProfile.
     * 
     * @param servicesProvisioned
     */
    public void setServicesProvisioned(java.lang.Short servicesProvisioned) {
        this.servicesProvisioned = servicesProvisioned;
    }


    /**
     * Gets the phoneType value for this NumberTranslationProfile.
     * 
     * @return phoneType
     */
    public java.lang.Short getPhoneType() {
        return phoneType;
    }


    /**
     * Sets the phoneType value for this NumberTranslationProfile.
     * 
     * @param phoneType
     */
    public void setPhoneType(java.lang.Short phoneType) {
        this.phoneType = phoneType;
    }


    /**
     * Gets the suspendedFlag value for this NumberTranslationProfile.
     * 
     * @return suspendedFlag
     */
    public java.lang.Short getSuspendedFlag() {
        return suspendedFlag;
    }


    /**
     * Sets the suspendedFlag value for this NumberTranslationProfile.
     * 
     * @param suspendedFlag
     */
    public void setSuspendedFlag(java.lang.Short suspendedFlag) {
        this.suspendedFlag = suspendedFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumberTranslationProfile)) return false;
        NumberTranslationProfile other = (NumberTranslationProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.translationProfileId==null && other.getTranslationProfileId()==null) || 
             (this.translationProfileId!=null &&
              this.translationProfileId.equals(other.getTranslationProfileId()))) &&
            ((this.servicesProvisioned==null && other.getServicesProvisioned()==null) || 
             (this.servicesProvisioned!=null &&
              this.servicesProvisioned.equals(other.getServicesProvisioned()))) &&
            ((this.phoneType==null && other.getPhoneType()==null) || 
             (this.phoneType!=null &&
              this.phoneType.equals(other.getPhoneType()))) &&
            ((this.suspendedFlag==null && other.getSuspendedFlag()==null) || 
             (this.suspendedFlag!=null &&
              this.suspendedFlag.equals(other.getSuspendedFlag())));
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
        if (getTranslationProfileId() != null) {
            _hashCode += getTranslationProfileId().hashCode();
        }
        if (getServicesProvisioned() != null) {
            _hashCode += getServicesProvisioned().hashCode();
        }
        if (getPhoneType() != null) {
            _hashCode += getPhoneType().hashCode();
        }
        if (getSuspendedFlag() != null) {
            _hashCode += getSuspendedFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumberTranslationProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberTranslationProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translationProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicesProvisioned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicesProvisioned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suspendedFlag"));
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
