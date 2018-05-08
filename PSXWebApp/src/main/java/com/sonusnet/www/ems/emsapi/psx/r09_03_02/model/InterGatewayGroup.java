/**
 * InterGatewayGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class InterGatewayGroup  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String fromGatewayGroupId;

    private java.lang.String toGatewayGroupId;

    private java.lang.String packetServiceProfileId;

    public InterGatewayGroup() {
    }

    public InterGatewayGroup(
           java.lang.String fromGatewayGroupId,
           java.lang.String toGatewayGroupId,
           java.lang.String packetServiceProfileId) {
        this.fromGatewayGroupId = fromGatewayGroupId;
        this.toGatewayGroupId = toGatewayGroupId;
        this.packetServiceProfileId = packetServiceProfileId;
    }


    /**
     * Gets the fromGatewayGroupId value for this InterGatewayGroup.
     * 
     * @return fromGatewayGroupId
     */
    public java.lang.String getFromGatewayGroupId() {
        return fromGatewayGroupId;
    }


    /**
     * Sets the fromGatewayGroupId value for this InterGatewayGroup.
     * 
     * @param fromGatewayGroupId
     */
    public void setFromGatewayGroupId(java.lang.String fromGatewayGroupId) {
        this.fromGatewayGroupId = fromGatewayGroupId;
    }


    /**
     * Gets the toGatewayGroupId value for this InterGatewayGroup.
     * 
     * @return toGatewayGroupId
     */
    public java.lang.String getToGatewayGroupId() {
        return toGatewayGroupId;
    }


    /**
     * Sets the toGatewayGroupId value for this InterGatewayGroup.
     * 
     * @param toGatewayGroupId
     */
    public void setToGatewayGroupId(java.lang.String toGatewayGroupId) {
        this.toGatewayGroupId = toGatewayGroupId;
    }


    /**
     * Gets the packetServiceProfileId value for this InterGatewayGroup.
     * 
     * @return packetServiceProfileId
     */
    public java.lang.String getPacketServiceProfileId() {
        return packetServiceProfileId;
    }


    /**
     * Sets the packetServiceProfileId value for this InterGatewayGroup.
     * 
     * @param packetServiceProfileId
     */
    public void setPacketServiceProfileId(java.lang.String packetServiceProfileId) {
        this.packetServiceProfileId = packetServiceProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterGatewayGroup)) return false;
        InterGatewayGroup other = (InterGatewayGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fromGatewayGroupId==null && other.getFromGatewayGroupId()==null) || 
             (this.fromGatewayGroupId!=null &&
              this.fromGatewayGroupId.equals(other.getFromGatewayGroupId()))) &&
            ((this.toGatewayGroupId==null && other.getToGatewayGroupId()==null) || 
             (this.toGatewayGroupId!=null &&
              this.toGatewayGroupId.equals(other.getToGatewayGroupId()))) &&
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
        if (getFromGatewayGroupId() != null) {
            _hashCode += getFromGatewayGroupId().hashCode();
        }
        if (getToGatewayGroupId() != null) {
            _hashCode += getToGatewayGroupId().hashCode();
        }
        if (getPacketServiceProfileId() != null) {
            _hashCode += getPacketServiceProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterGatewayGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InterGatewayGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromGatewayGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromGatewayGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toGatewayGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toGatewayGroupId"));
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
