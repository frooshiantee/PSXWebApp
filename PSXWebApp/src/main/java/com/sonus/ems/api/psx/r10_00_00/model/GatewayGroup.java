/**
 * GatewayGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class GatewayGroup  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String gatewayGroupId;
    private java.lang.String packetServiceProfileId;

    public GatewayGroup() {
    }

    public GatewayGroup(
           java.lang.String gatewayGroupId,
           java.lang.String packetServiceProfileId) {
           this.gatewayGroupId = gatewayGroupId;
           this.packetServiceProfileId = packetServiceProfileId;
    }


    /**
     * Gets the gatewayGroupId value for this GatewayGroup.
     * 
     * @return gatewayGroupId
     */
    public java.lang.String getGatewayGroupId() {
        return gatewayGroupId;
    }


    /**
     * Sets the gatewayGroupId value for this GatewayGroup.
     * 
     * @param gatewayGroupId
     */
    public void setGatewayGroupId(java.lang.String gatewayGroupId) {
        this.gatewayGroupId = gatewayGroupId;
    }


    /**
     * Gets the packetServiceProfileId value for this GatewayGroup.
     * 
     * @return packetServiceProfileId
     */
    public java.lang.String getPacketServiceProfileId() {
        return packetServiceProfileId;
    }


    /**
     * Sets the packetServiceProfileId value for this GatewayGroup.
     * 
     * @param packetServiceProfileId
     */
    public void setPacketServiceProfileId(java.lang.String packetServiceProfileId) {
        this.packetServiceProfileId = packetServiceProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GatewayGroup)) return false;
        GatewayGroup other = (GatewayGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.gatewayGroupId==null && other.getGatewayGroupId()==null) || 
             (this.gatewayGroupId!=null &&
              this.gatewayGroupId.equals(other.getGatewayGroupId()))) &&
            ((this.packetServiceProfileId==null && other.getPacketServiceProfileId()==null) || 
             (this.packetServiceProfileId!=null &&
              this.packetServiceProfileId.equals(other.getPacketServiceProfileId())));
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
        if (getGatewayGroupId() != null) {
            _hashCode += getGatewayGroupId().hashCode();
        }
        if (getPacketServiceProfileId() != null) {
            _hashCode += getPacketServiceProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GatewayGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetServiceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packetServiceProfileId"));
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
