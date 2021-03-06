/**
 * SipScpDeviceDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SipScpDeviceDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String sipDeviceId;

    private java.lang.Integer sipScpPriority;

    public SipScpDeviceDataKey() {
    }

    public SipScpDeviceDataKey(
           java.lang.String sipDeviceId,
           java.lang.Integer sipScpPriority) {
        this.sipDeviceId = sipDeviceId;
        this.sipScpPriority = sipScpPriority;
    }


    /**
     * Gets the sipDeviceId value for this SipScpDeviceDataKey.
     * 
     * @return sipDeviceId
     */
    public java.lang.String getSipDeviceId() {
        return sipDeviceId;
    }


    /**
     * Sets the sipDeviceId value for this SipScpDeviceDataKey.
     * 
     * @param sipDeviceId
     */
    public void setSipDeviceId(java.lang.String sipDeviceId) {
        this.sipDeviceId = sipDeviceId;
    }


    /**
     * Gets the sipScpPriority value for this SipScpDeviceDataKey.
     * 
     * @return sipScpPriority
     */
    public java.lang.Integer getSipScpPriority() {
        return sipScpPriority;
    }


    /**
     * Sets the sipScpPriority value for this SipScpDeviceDataKey.
     * 
     * @param sipScpPriority
     */
    public void setSipScpPriority(java.lang.Integer sipScpPriority) {
        this.sipScpPriority = sipScpPriority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipScpDeviceDataKey)) return false;
        SipScpDeviceDataKey other = (SipScpDeviceDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sipDeviceId==null && other.getSipDeviceId()==null) || 
             (this.sipDeviceId!=null &&
              this.sipDeviceId.equals(other.getSipDeviceId()))) &&
            ((this.sipScpPriority==null && other.getSipScpPriority()==null) || 
             (this.sipScpPriority!=null &&
              this.sipScpPriority.equals(other.getSipScpPriority())));
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
        if (getSipDeviceId() != null) {
            _hashCode += getSipDeviceId().hashCode();
        }
        if (getSipScpPriority() != null) {
            _hashCode += getSipScpPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipScpDeviceDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpDeviceDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDeviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDeviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipScpPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipScpPriority"));
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
