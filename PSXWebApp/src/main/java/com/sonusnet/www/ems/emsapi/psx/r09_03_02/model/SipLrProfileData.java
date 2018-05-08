/**
 * SipLrProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SipLrProfileData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sipLrProfileId;

    private java.lang.String sipLrData;

    public SipLrProfileData() {
    }

    public SipLrProfileData(
           java.lang.String sipLrProfileId,
           java.lang.String sipLrData) {
        this.sipLrProfileId = sipLrProfileId;
        this.sipLrData = sipLrData;
    }


    /**
     * Gets the sipLrProfileId value for this SipLrProfileData.
     * 
     * @return sipLrProfileId
     */
    public java.lang.String getSipLrProfileId() {
        return sipLrProfileId;
    }


    /**
     * Sets the sipLrProfileId value for this SipLrProfileData.
     * 
     * @param sipLrProfileId
     */
    public void setSipLrProfileId(java.lang.String sipLrProfileId) {
        this.sipLrProfileId = sipLrProfileId;
    }


    /**
     * Gets the sipLrData value for this SipLrProfileData.
     * 
     * @return sipLrData
     */
    public java.lang.String getSipLrData() {
        return sipLrData;
    }


    /**
     * Sets the sipLrData value for this SipLrProfileData.
     * 
     * @param sipLrData
     */
    public void setSipLrData(java.lang.String sipLrData) {
        this.sipLrData = sipLrData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipLrProfileData)) return false;
        SipLrProfileData other = (SipLrProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sipLrProfileId==null && other.getSipLrProfileId()==null) || 
             (this.sipLrProfileId!=null &&
              this.sipLrProfileId.equals(other.getSipLrProfileId()))) &&
            ((this.sipLrData==null && other.getSipLrData()==null) || 
             (this.sipLrData!=null &&
              this.sipLrData.equals(other.getSipLrData())));
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
        if (getSipLrProfileId() != null) {
            _hashCode += getSipLrProfileId().hashCode();
        }
        if (getSipLrData() != null) {
            _hashCode += getSipLrData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipLrProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipLrProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipLrProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipLrProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipLrData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipLrData"));
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
