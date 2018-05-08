/**
 * CpcScreeningKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CpcScreeningKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String cpcScreeningId;
    private java.lang.String cpcValue;

    public CpcScreeningKey() {
    }

    public CpcScreeningKey(
           java.lang.String cpcScreeningId,
           java.lang.String cpcValue) {
           this.cpcScreeningId = cpcScreeningId;
           this.cpcValue = cpcValue;
    }


    /**
     * Gets the cpcScreeningId value for this CpcScreeningKey.
     * 
     * @return cpcScreeningId
     */
    public java.lang.String getCpcScreeningId() {
        return cpcScreeningId;
    }


    /**
     * Sets the cpcScreeningId value for this CpcScreeningKey.
     * 
     * @param cpcScreeningId
     */
    public void setCpcScreeningId(java.lang.String cpcScreeningId) {
        this.cpcScreeningId = cpcScreeningId;
    }


    /**
     * Gets the cpcValue value for this CpcScreeningKey.
     * 
     * @return cpcValue
     */
    public java.lang.String getCpcValue() {
        return cpcValue;
    }


    /**
     * Sets the cpcValue value for this CpcScreeningKey.
     * 
     * @param cpcValue
     */
    public void setCpcValue(java.lang.String cpcValue) {
        this.cpcValue = cpcValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpcScreeningKey)) return false;
        CpcScreeningKey other = (CpcScreeningKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cpcScreeningId==null && other.getCpcScreeningId()==null) || 
             (this.cpcScreeningId!=null &&
              this.cpcScreeningId.equals(other.getCpcScreeningId()))) &&
            ((this.cpcValue==null && other.getCpcValue()==null) || 
             (this.cpcValue!=null &&
              this.cpcValue.equals(other.getCpcValue())));
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
        if (getCpcScreeningId() != null) {
            _hashCode += getCpcScreeningId().hashCode();
        }
        if (getCpcValue() != null) {
            _hashCode += getCpcValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpcScreeningKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcScreeningKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpcScreeningId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpcScreeningId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpcValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpcValue"));
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
