/**
 * HsxImplicitRegistrationSetKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxImplicitRegistrationSetKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String implicitRegistrationSet;
    private java.lang.String privateUserId;

    public HsxImplicitRegistrationSetKey() {
    }

    public HsxImplicitRegistrationSetKey(
           java.lang.String implicitRegistrationSet,
           java.lang.String privateUserId) {
           this.implicitRegistrationSet = implicitRegistrationSet;
           this.privateUserId = privateUserId;
    }


    /**
     * Gets the implicitRegistrationSet value for this HsxImplicitRegistrationSetKey.
     * 
     * @return implicitRegistrationSet
     */
    public java.lang.String getImplicitRegistrationSet() {
        return implicitRegistrationSet;
    }


    /**
     * Sets the implicitRegistrationSet value for this HsxImplicitRegistrationSetKey.
     * 
     * @param implicitRegistrationSet
     */
    public void setImplicitRegistrationSet(java.lang.String implicitRegistrationSet) {
        this.implicitRegistrationSet = implicitRegistrationSet;
    }


    /**
     * Gets the privateUserId value for this HsxImplicitRegistrationSetKey.
     * 
     * @return privateUserId
     */
    public java.lang.String getPrivateUserId() {
        return privateUserId;
    }


    /**
     * Sets the privateUserId value for this HsxImplicitRegistrationSetKey.
     * 
     * @param privateUserId
     */
    public void setPrivateUserId(java.lang.String privateUserId) {
        this.privateUserId = privateUserId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxImplicitRegistrationSetKey)) return false;
        HsxImplicitRegistrationSetKey other = (HsxImplicitRegistrationSetKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.implicitRegistrationSet==null && other.getImplicitRegistrationSet()==null) || 
             (this.implicitRegistrationSet!=null &&
              this.implicitRegistrationSet.equals(other.getImplicitRegistrationSet()))) &&
            ((this.privateUserId==null && other.getPrivateUserId()==null) || 
             (this.privateUserId!=null &&
              this.privateUserId.equals(other.getPrivateUserId())));
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
        if (getImplicitRegistrationSet() != null) {
            _hashCode += getImplicitRegistrationSet().hashCode();
        }
        if (getPrivateUserId() != null) {
            _hashCode += getPrivateUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxImplicitRegistrationSetKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxImplicitRegistrationSetKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implicitRegistrationSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "implicitRegistrationSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateUserId"));
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
