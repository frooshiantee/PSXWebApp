/**
 * UcOcrCosKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class UcOcrCosKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String ocrProfileId;
    private java.lang.String ocrValue;

    public UcOcrCosKey() {
    }

    public UcOcrCosKey(
           java.lang.String ocrProfileId,
           java.lang.String ocrValue) {
           this.ocrProfileId = ocrProfileId;
           this.ocrValue = ocrValue;
    }


    /**
     * Gets the ocrProfileId value for this UcOcrCosKey.
     * 
     * @return ocrProfileId
     */
    public java.lang.String getOcrProfileId() {
        return ocrProfileId;
    }


    /**
     * Sets the ocrProfileId value for this UcOcrCosKey.
     * 
     * @param ocrProfileId
     */
    public void setOcrProfileId(java.lang.String ocrProfileId) {
        this.ocrProfileId = ocrProfileId;
    }


    /**
     * Gets the ocrValue value for this UcOcrCosKey.
     * 
     * @return ocrValue
     */
    public java.lang.String getOcrValue() {
        return ocrValue;
    }


    /**
     * Sets the ocrValue value for this UcOcrCosKey.
     * 
     * @param ocrValue
     */
    public void setOcrValue(java.lang.String ocrValue) {
        this.ocrValue = ocrValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UcOcrCosKey)) return false;
        UcOcrCosKey other = (UcOcrCosKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ocrProfileId==null && other.getOcrProfileId()==null) || 
             (this.ocrProfileId!=null &&
              this.ocrProfileId.equals(other.getOcrProfileId()))) &&
            ((this.ocrValue==null && other.getOcrValue()==null) || 
             (this.ocrValue!=null &&
              this.ocrValue.equals(other.getOcrValue())));
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
        if (getOcrProfileId() != null) {
            _hashCode += getOcrProfileId().hashCode();
        }
        if (getOcrValue() != null) {
            _hashCode += getOcrValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UcOcrCosKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "UcOcrCosKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocrProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocrProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocrValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocrValue"));
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
