/**
 * SecureCryptoSuiteProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SecureCryptoSuiteProfileData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String securityCryptoSuiteId;

    private java.lang.Integer sequenceNumber;

    private java.lang.Integer cryptoSuite;

    private java.lang.Integer sessionParameterMask;

    public SecureCryptoSuiteProfileData() {
    }

    public SecureCryptoSuiteProfileData(
           java.lang.String securityCryptoSuiteId,
           java.lang.Integer sequenceNumber,
           java.lang.Integer cryptoSuite,
           java.lang.Integer sessionParameterMask) {
        this.securityCryptoSuiteId = securityCryptoSuiteId;
        this.sequenceNumber = sequenceNumber;
        this.cryptoSuite = cryptoSuite;
        this.sessionParameterMask = sessionParameterMask;
    }


    /**
     * Gets the securityCryptoSuiteId value for this SecureCryptoSuiteProfileData.
     * 
     * @return securityCryptoSuiteId
     */
    public java.lang.String getSecurityCryptoSuiteId() {
        return securityCryptoSuiteId;
    }


    /**
     * Sets the securityCryptoSuiteId value for this SecureCryptoSuiteProfileData.
     * 
     * @param securityCryptoSuiteId
     */
    public void setSecurityCryptoSuiteId(java.lang.String securityCryptoSuiteId) {
        this.securityCryptoSuiteId = securityCryptoSuiteId;
    }


    /**
     * Gets the sequenceNumber value for this SecureCryptoSuiteProfileData.
     * 
     * @return sequenceNumber
     */
    public java.lang.Integer getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this SecureCryptoSuiteProfileData.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(java.lang.Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the cryptoSuite value for this SecureCryptoSuiteProfileData.
     * 
     * @return cryptoSuite
     */
    public java.lang.Integer getCryptoSuite() {
        return cryptoSuite;
    }


    /**
     * Sets the cryptoSuite value for this SecureCryptoSuiteProfileData.
     * 
     * @param cryptoSuite
     */
    public void setCryptoSuite(java.lang.Integer cryptoSuite) {
        this.cryptoSuite = cryptoSuite;
    }


    /**
     * Gets the sessionParameterMask value for this SecureCryptoSuiteProfileData.
     * 
     * @return sessionParameterMask
     */
    public java.lang.Integer getSessionParameterMask() {
        return sessionParameterMask;
    }


    /**
     * Sets the sessionParameterMask value for this SecureCryptoSuiteProfileData.
     * 
     * @param sessionParameterMask
     */
    public void setSessionParameterMask(java.lang.Integer sessionParameterMask) {
        this.sessionParameterMask = sessionParameterMask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecureCryptoSuiteProfileData)) return false;
        SecureCryptoSuiteProfileData other = (SecureCryptoSuiteProfileData) obj;
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
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.cryptoSuite==null && other.getCryptoSuite()==null) || 
             (this.cryptoSuite!=null &&
              this.cryptoSuite.equals(other.getCryptoSuite()))) &&
            ((this.sessionParameterMask==null && other.getSessionParameterMask()==null) || 
             (this.sessionParameterMask!=null &&
              this.sessionParameterMask.equals(other.getSessionParameterMask())));
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
        if (getCryptoSuite() != null) {
            _hashCode += getCryptoSuite().hashCode();
        }
        if (getSessionParameterMask() != null) {
            _hashCode += getSessionParameterMask().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecureCryptoSuiteProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SecureCryptoSuiteProfileData"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cryptoSuite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoSuite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionParameterMask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionParameterMask"));
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
