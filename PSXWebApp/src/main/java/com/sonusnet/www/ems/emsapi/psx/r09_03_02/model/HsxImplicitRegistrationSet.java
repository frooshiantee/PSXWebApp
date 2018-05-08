/**
 * HsxImplicitRegistrationSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxImplicitRegistrationSet  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String implicitRegistrationSet;

    private java.lang.String privateUserId;

    private java.lang.String defaultPublicUserId;

    private java.lang.String capabilityId;

    public HsxImplicitRegistrationSet() {
    }

    public HsxImplicitRegistrationSet(
           java.lang.String implicitRegistrationSet,
           java.lang.String privateUserId,
           java.lang.String defaultPublicUserId,
           java.lang.String capabilityId) {
        this.implicitRegistrationSet = implicitRegistrationSet;
        this.privateUserId = privateUserId;
        this.defaultPublicUserId = defaultPublicUserId;
        this.capabilityId = capabilityId;
    }


    /**
     * Gets the implicitRegistrationSet value for this HsxImplicitRegistrationSet.
     * 
     * @return implicitRegistrationSet
     */
    public java.lang.String getImplicitRegistrationSet() {
        return implicitRegistrationSet;
    }


    /**
     * Sets the implicitRegistrationSet value for this HsxImplicitRegistrationSet.
     * 
     * @param implicitRegistrationSet
     */
    public void setImplicitRegistrationSet(java.lang.String implicitRegistrationSet) {
        this.implicitRegistrationSet = implicitRegistrationSet;
    }


    /**
     * Gets the privateUserId value for this HsxImplicitRegistrationSet.
     * 
     * @return privateUserId
     */
    public java.lang.String getPrivateUserId() {
        return privateUserId;
    }


    /**
     * Sets the privateUserId value for this HsxImplicitRegistrationSet.
     * 
     * @param privateUserId
     */
    public void setPrivateUserId(java.lang.String privateUserId) {
        this.privateUserId = privateUserId;
    }


    /**
     * Gets the defaultPublicUserId value for this HsxImplicitRegistrationSet.
     * 
     * @return defaultPublicUserId
     */
    public java.lang.String getDefaultPublicUserId() {
        return defaultPublicUserId;
    }


    /**
     * Sets the defaultPublicUserId value for this HsxImplicitRegistrationSet.
     * 
     * @param defaultPublicUserId
     */
    public void setDefaultPublicUserId(java.lang.String defaultPublicUserId) {
        this.defaultPublicUserId = defaultPublicUserId;
    }


    /**
     * Gets the capabilityId value for this HsxImplicitRegistrationSet.
     * 
     * @return capabilityId
     */
    public java.lang.String getCapabilityId() {
        return capabilityId;
    }


    /**
     * Sets the capabilityId value for this HsxImplicitRegistrationSet.
     * 
     * @param capabilityId
     */
    public void setCapabilityId(java.lang.String capabilityId) {
        this.capabilityId = capabilityId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxImplicitRegistrationSet)) return false;
        HsxImplicitRegistrationSet other = (HsxImplicitRegistrationSet) obj;
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
              this.privateUserId.equals(other.getPrivateUserId()))) &&
            ((this.defaultPublicUserId==null && other.getDefaultPublicUserId()==null) || 
             (this.defaultPublicUserId!=null &&
              this.defaultPublicUserId.equals(other.getDefaultPublicUserId()))) &&
            ((this.capabilityId==null && other.getCapabilityId()==null) || 
             (this.capabilityId!=null &&
              this.capabilityId.equals(other.getCapabilityId())));
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
        if (getDefaultPublicUserId() != null) {
            _hashCode += getDefaultPublicUserId().hashCode();
        }
        if (getCapabilityId() != null) {
            _hashCode += getCapabilityId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxImplicitRegistrationSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxImplicitRegistrationSet"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPublicUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultPublicUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capabilityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capabilityId"));
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
