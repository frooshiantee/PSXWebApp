/**
 * InterGatewayGroupSigKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class InterGatewayGroupSigKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String fromGatewayGroupSigId;

    private java.lang.String toGatewayGroupSigId;

    public InterGatewayGroupSigKey() {
    }

    public InterGatewayGroupSigKey(
           java.lang.String fromGatewayGroupSigId,
           java.lang.String toGatewayGroupSigId) {
        this.fromGatewayGroupSigId = fromGatewayGroupSigId;
        this.toGatewayGroupSigId = toGatewayGroupSigId;
    }


    /**
     * Gets the fromGatewayGroupSigId value for this InterGatewayGroupSigKey.
     * 
     * @return fromGatewayGroupSigId
     */
    public java.lang.String getFromGatewayGroupSigId() {
        return fromGatewayGroupSigId;
    }


    /**
     * Sets the fromGatewayGroupSigId value for this InterGatewayGroupSigKey.
     * 
     * @param fromGatewayGroupSigId
     */
    public void setFromGatewayGroupSigId(java.lang.String fromGatewayGroupSigId) {
        this.fromGatewayGroupSigId = fromGatewayGroupSigId;
    }


    /**
     * Gets the toGatewayGroupSigId value for this InterGatewayGroupSigKey.
     * 
     * @return toGatewayGroupSigId
     */
    public java.lang.String getToGatewayGroupSigId() {
        return toGatewayGroupSigId;
    }


    /**
     * Sets the toGatewayGroupSigId value for this InterGatewayGroupSigKey.
     * 
     * @param toGatewayGroupSigId
     */
    public void setToGatewayGroupSigId(java.lang.String toGatewayGroupSigId) {
        this.toGatewayGroupSigId = toGatewayGroupSigId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterGatewayGroupSigKey)) return false;
        InterGatewayGroupSigKey other = (InterGatewayGroupSigKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fromGatewayGroupSigId==null && other.getFromGatewayGroupSigId()==null) || 
             (this.fromGatewayGroupSigId!=null &&
              this.fromGatewayGroupSigId.equals(other.getFromGatewayGroupSigId()))) &&
            ((this.toGatewayGroupSigId==null && other.getToGatewayGroupSigId()==null) || 
             (this.toGatewayGroupSigId!=null &&
              this.toGatewayGroupSigId.equals(other.getToGatewayGroupSigId())));
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
        if (getFromGatewayGroupSigId() != null) {
            _hashCode += getFromGatewayGroupSigId().hashCode();
        }
        if (getToGatewayGroupSigId() != null) {
            _hashCode += getToGatewayGroupSigId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterGatewayGroupSigKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InterGatewayGroupSigKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromGatewayGroupSigId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromGatewayGroupSigId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toGatewayGroupSigId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toGatewayGroupSigId"));
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
