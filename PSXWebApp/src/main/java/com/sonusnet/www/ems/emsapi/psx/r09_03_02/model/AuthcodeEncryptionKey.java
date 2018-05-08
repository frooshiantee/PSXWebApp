/**
 * AuthcodeEncryptionKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class AuthcodeEncryptionKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String authcodeId;

    private java.lang.String authcodeGroupId;

    public AuthcodeEncryptionKey() {
    }

    public AuthcodeEncryptionKey(
           java.lang.String authcodeId,
           java.lang.String authcodeGroupId) {
        this.authcodeId = authcodeId;
        this.authcodeGroupId = authcodeGroupId;
    }


    /**
     * Gets the authcodeId value for this AuthcodeEncryptionKey.
     * 
     * @return authcodeId
     */
    public java.lang.String getAuthcodeId() {
        return authcodeId;
    }


    /**
     * Sets the authcodeId value for this AuthcodeEncryptionKey.
     * 
     * @param authcodeId
     */
    public void setAuthcodeId(java.lang.String authcodeId) {
        this.authcodeId = authcodeId;
    }


    /**
     * Gets the authcodeGroupId value for this AuthcodeEncryptionKey.
     * 
     * @return authcodeGroupId
     */
    public java.lang.String getAuthcodeGroupId() {
        return authcodeGroupId;
    }


    /**
     * Sets the authcodeGroupId value for this AuthcodeEncryptionKey.
     * 
     * @param authcodeGroupId
     */
    public void setAuthcodeGroupId(java.lang.String authcodeGroupId) {
        this.authcodeGroupId = authcodeGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthcodeEncryptionKey)) return false;
        AuthcodeEncryptionKey other = (AuthcodeEncryptionKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authcodeId==null && other.getAuthcodeId()==null) || 
             (this.authcodeId!=null &&
              this.authcodeId.equals(other.getAuthcodeId()))) &&
            ((this.authcodeGroupId==null && other.getAuthcodeGroupId()==null) || 
             (this.authcodeGroupId!=null &&
              this.authcodeGroupId.equals(other.getAuthcodeGroupId())));
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
        if (getAuthcodeId() != null) {
            _hashCode += getAuthcodeId().hashCode();
        }
        if (getAuthcodeGroupId() != null) {
            _hashCode += getAuthcodeGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthcodeEncryptionKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AuthcodeEncryptionKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authcodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authcodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authcodeGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authcodeGroupId"));
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
