/**
 * SignalingQosKpiProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SignalingQosKpiProfileKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String signalingQosProfileId;

    public SignalingQosKpiProfileKey() {
    }

    public SignalingQosKpiProfileKey(
           java.lang.String signalingQosProfileId) {
        this.signalingQosProfileId = signalingQosProfileId;
    }


    /**
     * Gets the signalingQosProfileId value for this SignalingQosKpiProfileKey.
     * 
     * @return signalingQosProfileId
     */
    public java.lang.String getSignalingQosProfileId() {
        return signalingQosProfileId;
    }


    /**
     * Sets the signalingQosProfileId value for this SignalingQosKpiProfileKey.
     * 
     * @param signalingQosProfileId
     */
    public void setSignalingQosProfileId(java.lang.String signalingQosProfileId) {
        this.signalingQosProfileId = signalingQosProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignalingQosKpiProfileKey)) return false;
        SignalingQosKpiProfileKey other = (SignalingQosKpiProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.signalingQosProfileId==null && other.getSignalingQosProfileId()==null) || 
             (this.signalingQosProfileId!=null &&
              this.signalingQosProfileId.equals(other.getSignalingQosProfileId())));
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
        if (getSignalingQosProfileId() != null) {
            _hashCode += getSignalingQosProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignalingQosKpiProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SignalingQosKpiProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalingQosProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signalingQosProfileId"));
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
