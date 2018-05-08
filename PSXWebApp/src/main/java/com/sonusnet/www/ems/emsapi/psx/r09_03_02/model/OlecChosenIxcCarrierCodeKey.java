/**
 * OlecChosenIxcCarrierCodeKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class OlecChosenIxcCarrierCodeKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String olecCarrierCode;

    private java.lang.String chosenIxcCarrierCode;

    public OlecChosenIxcCarrierCodeKey() {
    }

    public OlecChosenIxcCarrierCodeKey(
           java.lang.String olecCarrierCode,
           java.lang.String chosenIxcCarrierCode) {
        this.olecCarrierCode = olecCarrierCode;
        this.chosenIxcCarrierCode = chosenIxcCarrierCode;
    }


    /**
     * Gets the olecCarrierCode value for this OlecChosenIxcCarrierCodeKey.
     * 
     * @return olecCarrierCode
     */
    public java.lang.String getOlecCarrierCode() {
        return olecCarrierCode;
    }


    /**
     * Sets the olecCarrierCode value for this OlecChosenIxcCarrierCodeKey.
     * 
     * @param olecCarrierCode
     */
    public void setOlecCarrierCode(java.lang.String olecCarrierCode) {
        this.olecCarrierCode = olecCarrierCode;
    }


    /**
     * Gets the chosenIxcCarrierCode value for this OlecChosenIxcCarrierCodeKey.
     * 
     * @return chosenIxcCarrierCode
     */
    public java.lang.String getChosenIxcCarrierCode() {
        return chosenIxcCarrierCode;
    }


    /**
     * Sets the chosenIxcCarrierCode value for this OlecChosenIxcCarrierCodeKey.
     * 
     * @param chosenIxcCarrierCode
     */
    public void setChosenIxcCarrierCode(java.lang.String chosenIxcCarrierCode) {
        this.chosenIxcCarrierCode = chosenIxcCarrierCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OlecChosenIxcCarrierCodeKey)) return false;
        OlecChosenIxcCarrierCodeKey other = (OlecChosenIxcCarrierCodeKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.olecCarrierCode==null && other.getOlecCarrierCode()==null) || 
             (this.olecCarrierCode!=null &&
              this.olecCarrierCode.equals(other.getOlecCarrierCode()))) &&
            ((this.chosenIxcCarrierCode==null && other.getChosenIxcCarrierCode()==null) || 
             (this.chosenIxcCarrierCode!=null &&
              this.chosenIxcCarrierCode.equals(other.getChosenIxcCarrierCode())));
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
        if (getOlecCarrierCode() != null) {
            _hashCode += getOlecCarrierCode().hashCode();
        }
        if (getChosenIxcCarrierCode() != null) {
            _hashCode += getChosenIxcCarrierCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OlecChosenIxcCarrierCodeKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OlecChosenIxcCarrierCodeKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("olecCarrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "olecCarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chosenIxcCarrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chosenIxcCarrierCode"));
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
