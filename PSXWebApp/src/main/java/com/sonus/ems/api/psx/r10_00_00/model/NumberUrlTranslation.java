/**
 * NumberUrlTranslation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class NumberUrlTranslation  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String nationalId;
    private java.lang.String countryId;
    private java.lang.String sipUrl;
    private java.lang.Short numberPortabilityFlag;

    public NumberUrlTranslation() {
    }

    public NumberUrlTranslation(
           java.lang.String nationalId,
           java.lang.String countryId,
           java.lang.String sipUrl,
           java.lang.Short numberPortabilityFlag) {
           this.nationalId = nationalId;
           this.countryId = countryId;
           this.sipUrl = sipUrl;
           this.numberPortabilityFlag = numberPortabilityFlag;
    }


    /**
     * Gets the nationalId value for this NumberUrlTranslation.
     * 
     * @return nationalId
     */
    public java.lang.String getNationalId() {
        return nationalId;
    }


    /**
     * Sets the nationalId value for this NumberUrlTranslation.
     * 
     * @param nationalId
     */
    public void setNationalId(java.lang.String nationalId) {
        this.nationalId = nationalId;
    }


    /**
     * Gets the countryId value for this NumberUrlTranslation.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this NumberUrlTranslation.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the sipUrl value for this NumberUrlTranslation.
     * 
     * @return sipUrl
     */
    public java.lang.String getSipUrl() {
        return sipUrl;
    }


    /**
     * Sets the sipUrl value for this NumberUrlTranslation.
     * 
     * @param sipUrl
     */
    public void setSipUrl(java.lang.String sipUrl) {
        this.sipUrl = sipUrl;
    }


    /**
     * Gets the numberPortabilityFlag value for this NumberUrlTranslation.
     * 
     * @return numberPortabilityFlag
     */
    public java.lang.Short getNumberPortabilityFlag() {
        return numberPortabilityFlag;
    }


    /**
     * Sets the numberPortabilityFlag value for this NumberUrlTranslation.
     * 
     * @param numberPortabilityFlag
     */
    public void setNumberPortabilityFlag(java.lang.Short numberPortabilityFlag) {
        this.numberPortabilityFlag = numberPortabilityFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumberUrlTranslation)) return false;
        NumberUrlTranslation other = (NumberUrlTranslation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nationalId==null && other.getNationalId()==null) || 
             (this.nationalId!=null &&
              this.nationalId.equals(other.getNationalId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.sipUrl==null && other.getSipUrl()==null) || 
             (this.sipUrl!=null &&
              this.sipUrl.equals(other.getSipUrl()))) &&
            ((this.numberPortabilityFlag==null && other.getNumberPortabilityFlag()==null) || 
             (this.numberPortabilityFlag!=null &&
              this.numberPortabilityFlag.equals(other.getNumberPortabilityFlag())));
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
        if (getNationalId() != null) {
            _hashCode += getNationalId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getSipUrl() != null) {
            _hashCode += getSipUrl().hashCode();
        }
        if (getNumberPortabilityFlag() != null) {
            _hashCode += getNumberPortabilityFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumberUrlTranslation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberUrlTranslation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalId"));
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
        elemField.setFieldName("sipUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberPortabilityFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberPortabilityFlag"));
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
