/**
 * SplitAreaCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SplitAreaCode  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String fromAreaCode;

    private java.lang.String toAreaCode;

    public SplitAreaCode() {
    }

    public SplitAreaCode(
           java.lang.String fromAreaCode,
           java.lang.String toAreaCode) {
        this.fromAreaCode = fromAreaCode;
        this.toAreaCode = toAreaCode;
    }


    /**
     * Gets the fromAreaCode value for this SplitAreaCode.
     * 
     * @return fromAreaCode
     */
    public java.lang.String getFromAreaCode() {
        return fromAreaCode;
    }


    /**
     * Sets the fromAreaCode value for this SplitAreaCode.
     * 
     * @param fromAreaCode
     */
    public void setFromAreaCode(java.lang.String fromAreaCode) {
        this.fromAreaCode = fromAreaCode;
    }


    /**
     * Gets the toAreaCode value for this SplitAreaCode.
     * 
     * @return toAreaCode
     */
    public java.lang.String getToAreaCode() {
        return toAreaCode;
    }


    /**
     * Sets the toAreaCode value for this SplitAreaCode.
     * 
     * @param toAreaCode
     */
    public void setToAreaCode(java.lang.String toAreaCode) {
        this.toAreaCode = toAreaCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SplitAreaCode)) return false;
        SplitAreaCode other = (SplitAreaCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fromAreaCode==null && other.getFromAreaCode()==null) || 
             (this.fromAreaCode!=null &&
              this.fromAreaCode.equals(other.getFromAreaCode()))) &&
            ((this.toAreaCode==null && other.getToAreaCode()==null) || 
             (this.toAreaCode!=null &&
              this.toAreaCode.equals(other.getToAreaCode())));
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
        if (getFromAreaCode() != null) {
            _hashCode += getFromAreaCode().hashCode();
        }
        if (getToAreaCode() != null) {
            _hashCode += getToAreaCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SplitAreaCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SplitAreaCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toAreaCode"));
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
