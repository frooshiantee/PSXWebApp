/**
 * SecureCryptoSuiteProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SecureCryptoSuiteProfileDataKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String securityCryptoSuiteId;
    private java.lang.Integer sequenceNumber;

    public SecureCryptoSuiteProfileDataKey() {
    }

    public SecureCryptoSuiteProfileDataKey(
           java.lang.String securityCryptoSuiteId,
           java.lang.Integer sequenceNumber) {
           this.securityCryptoSuiteId = securityCryptoSuiteId;
           this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the securityCryptoSuiteId value for this SecureCryptoSuiteProfileDataKey.
     * 
     * @return securityCryptoSuiteId
     */
    public java.lang.String getSecurityCryptoSuiteId() {
        return securityCryptoSuiteId;
    }


    /**
     * Sets the securityCryptoSuiteId value for this SecureCryptoSuiteProfileDataKey.
     * 
     * @param securityCryptoSuiteId
     */
    public void setSecurityCryptoSuiteId(java.lang.String securityCryptoSuiteId) {
        this.securityCryptoSuiteId = securityCryptoSuiteId;
    }


    /**
     * Gets the sequenceNumber value for this SecureCryptoSuiteProfileDataKey.
     * 
     * @return sequenceNumber
     */
    public java.lang.Integer getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this SecureCryptoSuiteProfileDataKey.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(java.lang.Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecureCryptoSuiteProfileDataKey)) return false;
        SecureCryptoSuiteProfileDataKey other = (SecureCryptoSuiteProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.securityCryptoSuiteId==null && other.getSecurityCryptoSuiteId()==null) || 
             (this.securityCryptoSuiteId!=null &&
              this.securityCryptoSuiteId.equals(other.getSecurityCryptoSuiteId()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber())));
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
        if (getSecurityCryptoSuiteId() != null) {
            _hashCode += getSecurityCryptoSuiteId().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecureCryptoSuiteProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SecureCryptoSuiteProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityCryptoSuiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securityCryptoSuiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenceNumber"));
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
