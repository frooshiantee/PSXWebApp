/**
 * ScpRoutingConfigKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ScpRoutingConfigKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String scpRoutingConfigId;

    public ScpRoutingConfigKey() {
    }

    public ScpRoutingConfigKey(
           java.lang.String scpRoutingConfigId) {
           this.scpRoutingConfigId = scpRoutingConfigId;
    }


    /**
     * Gets the scpRoutingConfigId value for this ScpRoutingConfigKey.
     * 
     * @return scpRoutingConfigId
     */
    public java.lang.String getScpRoutingConfigId() {
        return scpRoutingConfigId;
    }


    /**
     * Sets the scpRoutingConfigId value for this ScpRoutingConfigKey.
     * 
     * @param scpRoutingConfigId
     */
    public void setScpRoutingConfigId(java.lang.String scpRoutingConfigId) {
        this.scpRoutingConfigId = scpRoutingConfigId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScpRoutingConfigKey)) return false;
        ScpRoutingConfigKey other = (ScpRoutingConfigKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scpRoutingConfigId==null && other.getScpRoutingConfigId()==null) || 
             (this.scpRoutingConfigId!=null &&
              this.scpRoutingConfigId.equals(other.getScpRoutingConfigId())));
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
        if (getScpRoutingConfigId() != null) {
            _hashCode += getScpRoutingConfigId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScpRoutingConfigKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpRoutingConfigKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpRoutingConfigId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpRoutingConfigId"));
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
