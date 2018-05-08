/**
 * LcrTgQosKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class LcrTgQosKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String lcrTg;
    private java.lang.String gatewayId;
    private java.lang.String qosTypeName;

    public LcrTgQosKey() {
    }

    public LcrTgQosKey(
           java.lang.String lcrTg,
           java.lang.String gatewayId,
           java.lang.String qosTypeName) {
           this.lcrTg = lcrTg;
           this.gatewayId = gatewayId;
           this.qosTypeName = qosTypeName;
    }


    /**
     * Gets the lcrTg value for this LcrTgQosKey.
     * 
     * @return lcrTg
     */
    public java.lang.String getLcrTg() {
        return lcrTg;
    }


    /**
     * Sets the lcrTg value for this LcrTgQosKey.
     * 
     * @param lcrTg
     */
    public void setLcrTg(java.lang.String lcrTg) {
        this.lcrTg = lcrTg;
    }


    /**
     * Gets the gatewayId value for this LcrTgQosKey.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this LcrTgQosKey.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the qosTypeName value for this LcrTgQosKey.
     * 
     * @return qosTypeName
     */
    public java.lang.String getQosTypeName() {
        return qosTypeName;
    }


    /**
     * Sets the qosTypeName value for this LcrTgQosKey.
     * 
     * @param qosTypeName
     */
    public void setQosTypeName(java.lang.String qosTypeName) {
        this.qosTypeName = qosTypeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LcrTgQosKey)) return false;
        LcrTgQosKey other = (LcrTgQosKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lcrTg==null && other.getLcrTg()==null) || 
             (this.lcrTg!=null &&
              this.lcrTg.equals(other.getLcrTg()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.qosTypeName==null && other.getQosTypeName()==null) || 
             (this.qosTypeName!=null &&
              this.qosTypeName.equals(other.getQosTypeName())));
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
        if (getLcrTg() != null) {
            _hashCode += getLcrTg().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getQosTypeName() != null) {
            _hashCode += getQosTypeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LcrTgQosKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrTgQosKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lcrTg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lcrTg"));
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
