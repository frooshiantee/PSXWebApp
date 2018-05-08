/**
 * SdRoutingConfigMapKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SdRoutingConfigMapKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String serviceId;

    private java.lang.Integer scpRoutingConfigType;

    public SdRoutingConfigMapKey() {
    }

    public SdRoutingConfigMapKey(
           java.lang.String serviceId,
           java.lang.Integer scpRoutingConfigType) {
        this.serviceId = serviceId;
        this.scpRoutingConfigType = scpRoutingConfigType;
    }


    /**
     * Gets the serviceId value for this SdRoutingConfigMapKey.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this SdRoutingConfigMapKey.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the scpRoutingConfigType value for this SdRoutingConfigMapKey.
     * 
     * @return scpRoutingConfigType
     */
    public java.lang.Integer getScpRoutingConfigType() {
        return scpRoutingConfigType;
    }


    /**
     * Sets the scpRoutingConfigType value for this SdRoutingConfigMapKey.
     * 
     * @param scpRoutingConfigType
     */
    public void setScpRoutingConfigType(java.lang.Integer scpRoutingConfigType) {
        this.scpRoutingConfigType = scpRoutingConfigType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SdRoutingConfigMapKey)) return false;
        SdRoutingConfigMapKey other = (SdRoutingConfigMapKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.scpRoutingConfigType==null && other.getScpRoutingConfigType()==null) || 
             (this.scpRoutingConfigType!=null &&
              this.scpRoutingConfigType.equals(other.getScpRoutingConfigType())));
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
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getScpRoutingConfigType() != null) {
            _hashCode += getScpRoutingConfigType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SdRoutingConfigMapKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdRoutingConfigMapKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpRoutingConfigType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpRoutingConfigType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
