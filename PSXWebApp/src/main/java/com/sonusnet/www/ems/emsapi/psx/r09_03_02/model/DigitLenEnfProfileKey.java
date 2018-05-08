/**
 * DigitLenEnfProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class DigitLenEnfProfileKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String digitLenEnfProfileId;

    private java.lang.String countryId;

    public DigitLenEnfProfileKey() {
    }

    public DigitLenEnfProfileKey(
           java.lang.String digitLenEnfProfileId,
           java.lang.String countryId) {
        this.digitLenEnfProfileId = digitLenEnfProfileId;
        this.countryId = countryId;
    }


    /**
     * Gets the digitLenEnfProfileId value for this DigitLenEnfProfileKey.
     * 
     * @return digitLenEnfProfileId
     */
    public java.lang.String getDigitLenEnfProfileId() {
        return digitLenEnfProfileId;
    }


    /**
     * Sets the digitLenEnfProfileId value for this DigitLenEnfProfileKey.
     * 
     * @param digitLenEnfProfileId
     */
    public void setDigitLenEnfProfileId(java.lang.String digitLenEnfProfileId) {
        this.digitLenEnfProfileId = digitLenEnfProfileId;
    }


    /**
     * Gets the countryId value for this DigitLenEnfProfileKey.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this DigitLenEnfProfileKey.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DigitLenEnfProfileKey)) return false;
        DigitLenEnfProfileKey other = (DigitLenEnfProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.digitLenEnfProfileId==null && other.getDigitLenEnfProfileId()==null) || 
             (this.digitLenEnfProfileId!=null &&
              this.digitLenEnfProfileId.equals(other.getDigitLenEnfProfileId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId())));
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
        if (getDigitLenEnfProfileId() != null) {
            _hashCode += getDigitLenEnfProfileId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DigitLenEnfProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DigitLenEnfProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitLenEnfProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digitLenEnfProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
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
