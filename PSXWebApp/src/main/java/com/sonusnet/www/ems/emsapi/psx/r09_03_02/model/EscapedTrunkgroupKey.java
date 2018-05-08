/**
 * EscapedTrunkgroupKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class EscapedTrunkgroupKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String trunkgroupId;

    private java.lang.String gatewayId;

    public EscapedTrunkgroupKey() {
    }

    public EscapedTrunkgroupKey(
           java.lang.String trunkgroupId,
           java.lang.String gatewayId) {
        this.trunkgroupId = trunkgroupId;
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the trunkgroupId value for this EscapedTrunkgroupKey.
     * 
     * @return trunkgroupId
     */
    public java.lang.String getTrunkgroupId() {
        return trunkgroupId;
    }


    /**
     * Sets the trunkgroupId value for this EscapedTrunkgroupKey.
     * 
     * @param trunkgroupId
     */
    public void setTrunkgroupId(java.lang.String trunkgroupId) {
        this.trunkgroupId = trunkgroupId;
    }


    /**
     * Gets the gatewayId value for this EscapedTrunkgroupKey.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this EscapedTrunkgroupKey.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EscapedTrunkgroupKey)) return false;
        EscapedTrunkgroupKey other = (EscapedTrunkgroupKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.trunkgroupId==null && other.getTrunkgroupId()==null) || 
             (this.trunkgroupId!=null &&
              this.trunkgroupId.equals(other.getTrunkgroupId()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId())));
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
        if (getTrunkgroupId() != null) {
            _hashCode += getTrunkgroupId().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EscapedTrunkgroupKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EscapedTrunkgroupKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
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
