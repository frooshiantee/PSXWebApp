/**
 * BillingZoneKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class BillingZoneKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String fromCallingArea;

    private java.lang.String toCallingArea;

    public BillingZoneKey() {
    }

    public BillingZoneKey(
           java.lang.String fromCallingArea,
           java.lang.String toCallingArea) {
        this.fromCallingArea = fromCallingArea;
        this.toCallingArea = toCallingArea;
    }


    /**
     * Gets the fromCallingArea value for this BillingZoneKey.
     * 
     * @return fromCallingArea
     */
    public java.lang.String getFromCallingArea() {
        return fromCallingArea;
    }


    /**
     * Sets the fromCallingArea value for this BillingZoneKey.
     * 
     * @param fromCallingArea
     */
    public void setFromCallingArea(java.lang.String fromCallingArea) {
        this.fromCallingArea = fromCallingArea;
    }


    /**
     * Gets the toCallingArea value for this BillingZoneKey.
     * 
     * @return toCallingArea
     */
    public java.lang.String getToCallingArea() {
        return toCallingArea;
    }


    /**
     * Sets the toCallingArea value for this BillingZoneKey.
     * 
     * @param toCallingArea
     */
    public void setToCallingArea(java.lang.String toCallingArea) {
        this.toCallingArea = toCallingArea;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingZoneKey)) return false;
        BillingZoneKey other = (BillingZoneKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fromCallingArea==null && other.getFromCallingArea()==null) || 
             (this.fromCallingArea!=null &&
              this.fromCallingArea.equals(other.getFromCallingArea()))) &&
            ((this.toCallingArea==null && other.getToCallingArea()==null) || 
             (this.toCallingArea!=null &&
              this.toCallingArea.equals(other.getToCallingArea())));
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
        if (getFromCallingArea() != null) {
            _hashCode += getFromCallingArea().hashCode();
        }
        if (getToCallingArea() != null) {
            _hashCode += getToCallingArea().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingZoneKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingZoneKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCallingArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromCallingArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCallingArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toCallingArea"));
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
