/**
 * SuaProtocolProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SuaProtocolProfileKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String suaProtocolProfileId;

    public SuaProtocolProfileKey() {
    }

    public SuaProtocolProfileKey(
           java.lang.String suaProtocolProfileId) {
           this.suaProtocolProfileId = suaProtocolProfileId;
    }


    /**
     * Gets the suaProtocolProfileId value for this SuaProtocolProfileKey.
     * 
     * @return suaProtocolProfileId
     */
    public java.lang.String getSuaProtocolProfileId() {
        return suaProtocolProfileId;
    }


    /**
     * Sets the suaProtocolProfileId value for this SuaProtocolProfileKey.
     * 
     * @param suaProtocolProfileId
     */
    public void setSuaProtocolProfileId(java.lang.String suaProtocolProfileId) {
        this.suaProtocolProfileId = suaProtocolProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuaProtocolProfileKey)) return false;
        SuaProtocolProfileKey other = (SuaProtocolProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.suaProtocolProfileId==null && other.getSuaProtocolProfileId()==null) || 
             (this.suaProtocolProfileId!=null &&
              this.suaProtocolProfileId.equals(other.getSuaProtocolProfileId())));
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
        if (getSuaProtocolProfileId() != null) {
            _hashCode += getSuaProtocolProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SuaProtocolProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaProtocolProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suaProtocolProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suaProtocolProfileId"));
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
