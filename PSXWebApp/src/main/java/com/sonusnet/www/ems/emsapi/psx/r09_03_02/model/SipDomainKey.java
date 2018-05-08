/**
 * SipDomainKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SipDomainKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String sipDomainId;

    private java.lang.String sipDomainName;

    public SipDomainKey() {
    }

    public SipDomainKey(
           java.lang.String sipDomainId,
           java.lang.String sipDomainName) {
        this.sipDomainId = sipDomainId;
        this.sipDomainName = sipDomainName;
    }


    /**
     * Gets the sipDomainId value for this SipDomainKey.
     * 
     * @return sipDomainId
     */
    public java.lang.String getSipDomainId() {
        return sipDomainId;
    }


    /**
     * Sets the sipDomainId value for this SipDomainKey.
     * 
     * @param sipDomainId
     */
    public void setSipDomainId(java.lang.String sipDomainId) {
        this.sipDomainId = sipDomainId;
    }


    /**
     * Gets the sipDomainName value for this SipDomainKey.
     * 
     * @return sipDomainName
     */
    public java.lang.String getSipDomainName() {
        return sipDomainName;
    }


    /**
     * Sets the sipDomainName value for this SipDomainKey.
     * 
     * @param sipDomainName
     */
    public void setSipDomainName(java.lang.String sipDomainName) {
        this.sipDomainName = sipDomainName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipDomainKey)) return false;
        SipDomainKey other = (SipDomainKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sipDomainId==null && other.getSipDomainId()==null) || 
             (this.sipDomainId!=null &&
              this.sipDomainId.equals(other.getSipDomainId()))) &&
            ((this.sipDomainName==null && other.getSipDomainName()==null) || 
             (this.sipDomainName!=null &&
              this.sipDomainName.equals(other.getSipDomainName())));
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
        if (getSipDomainId() != null) {
            _hashCode += getSipDomainId().hashCode();
        }
        if (getSipDomainName() != null) {
            _hashCode += getSipDomainName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipDomainKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipDomainKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDomainId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDomainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDomainName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDomainName"));
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
