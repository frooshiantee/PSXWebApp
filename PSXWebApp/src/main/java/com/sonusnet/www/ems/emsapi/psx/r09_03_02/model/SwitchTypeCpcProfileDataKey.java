/**
 * SwitchTypeCpcProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SwitchTypeCpcProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String switchTypeCpcProfileId;

    private java.lang.Integer egDestSwType;

    public SwitchTypeCpcProfileDataKey() {
    }

    public SwitchTypeCpcProfileDataKey(
           java.lang.String switchTypeCpcProfileId,
           java.lang.Integer egDestSwType) {
        this.switchTypeCpcProfileId = switchTypeCpcProfileId;
        this.egDestSwType = egDestSwType;
    }


    /**
     * Gets the switchTypeCpcProfileId value for this SwitchTypeCpcProfileDataKey.
     * 
     * @return switchTypeCpcProfileId
     */
    public java.lang.String getSwitchTypeCpcProfileId() {
        return switchTypeCpcProfileId;
    }


    /**
     * Sets the switchTypeCpcProfileId value for this SwitchTypeCpcProfileDataKey.
     * 
     * @param switchTypeCpcProfileId
     */
    public void setSwitchTypeCpcProfileId(java.lang.String switchTypeCpcProfileId) {
        this.switchTypeCpcProfileId = switchTypeCpcProfileId;
    }


    /**
     * Gets the egDestSwType value for this SwitchTypeCpcProfileDataKey.
     * 
     * @return egDestSwType
     */
    public java.lang.Integer getEgDestSwType() {
        return egDestSwType;
    }


    /**
     * Sets the egDestSwType value for this SwitchTypeCpcProfileDataKey.
     * 
     * @param egDestSwType
     */
    public void setEgDestSwType(java.lang.Integer egDestSwType) {
        this.egDestSwType = egDestSwType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwitchTypeCpcProfileDataKey)) return false;
        SwitchTypeCpcProfileDataKey other = (SwitchTypeCpcProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.switchTypeCpcProfileId==null && other.getSwitchTypeCpcProfileId()==null) || 
             (this.switchTypeCpcProfileId!=null &&
              this.switchTypeCpcProfileId.equals(other.getSwitchTypeCpcProfileId()))) &&
            ((this.egDestSwType==null && other.getEgDestSwType()==null) || 
             (this.egDestSwType!=null &&
              this.egDestSwType.equals(other.getEgDestSwType())));
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
        if (getSwitchTypeCpcProfileId() != null) {
            _hashCode += getSwitchTypeCpcProfileId().hashCode();
        }
        if (getEgDestSwType() != null) {
            _hashCode += getEgDestSwType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwitchTypeCpcProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SwitchTypeCpcProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchTypeCpcProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchTypeCpcProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egDestSwType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "egDestSwType"));
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
