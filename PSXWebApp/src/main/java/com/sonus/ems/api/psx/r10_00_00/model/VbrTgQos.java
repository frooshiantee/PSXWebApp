/**
 * VbrTgQos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class VbrTgQos  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String vbrTg;
    private java.lang.String gatewayId;
    private java.lang.String qosTypeName;
    private java.lang.String value;

    public VbrTgQos() {
    }

    public VbrTgQos(
           java.lang.String vbrTg,
           java.lang.String gatewayId,
           java.lang.String qosTypeName,
           java.lang.String value) {
           this.vbrTg = vbrTg;
           this.gatewayId = gatewayId;
           this.qosTypeName = qosTypeName;
           this.value = value;
    }


    /**
     * Gets the vbrTg value for this VbrTgQos.
     * 
     * @return vbrTg
     */
    public java.lang.String getVbrTg() {
        return vbrTg;
    }


    /**
     * Sets the vbrTg value for this VbrTgQos.
     * 
     * @param vbrTg
     */
    public void setVbrTg(java.lang.String vbrTg) {
        this.vbrTg = vbrTg;
    }


    /**
     * Gets the gatewayId value for this VbrTgQos.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this VbrTgQos.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the qosTypeName value for this VbrTgQos.
     * 
     * @return qosTypeName
     */
    public java.lang.String getQosTypeName() {
        return qosTypeName;
    }


    /**
     * Sets the qosTypeName value for this VbrTgQos.
     * 
     * @param qosTypeName
     */
    public void setQosTypeName(java.lang.String qosTypeName) {
        this.qosTypeName = qosTypeName;
    }


    /**
     * Gets the value value for this VbrTgQos.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this VbrTgQos.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VbrTgQos)) return false;
        VbrTgQos other = (VbrTgQos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vbrTg==null && other.getVbrTg()==null) || 
             (this.vbrTg!=null &&
              this.vbrTg.equals(other.getVbrTg()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.qosTypeName==null && other.getQosTypeName()==null) || 
             (this.qosTypeName!=null &&
              this.qosTypeName.equals(other.getQosTypeName()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getVbrTg() != null) {
            _hashCode += getVbrTg().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getQosTypeName() != null) {
            _hashCode += getQosTypeName().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VbrTgQos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrTgQos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vbrTg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vbrTg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qosTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
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
