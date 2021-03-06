/**
 * HsxXmlRepositoryDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxXmlRepositoryDataKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String publicUserId;
    private java.lang.String serviceIndication;

    public HsxXmlRepositoryDataKey() {
    }

    public HsxXmlRepositoryDataKey(
           java.lang.String publicUserId,
           java.lang.String serviceIndication) {
           this.publicUserId = publicUserId;
           this.serviceIndication = serviceIndication;
    }


    /**
     * Gets the publicUserId value for this HsxXmlRepositoryDataKey.
     * 
     * @return publicUserId
     */
    public java.lang.String getPublicUserId() {
        return publicUserId;
    }


    /**
     * Sets the publicUserId value for this HsxXmlRepositoryDataKey.
     * 
     * @param publicUserId
     */
    public void setPublicUserId(java.lang.String publicUserId) {
        this.publicUserId = publicUserId;
    }


    /**
     * Gets the serviceIndication value for this HsxXmlRepositoryDataKey.
     * 
     * @return serviceIndication
     */
    public java.lang.String getServiceIndication() {
        return serviceIndication;
    }


    /**
     * Sets the serviceIndication value for this HsxXmlRepositoryDataKey.
     * 
     * @param serviceIndication
     */
    public void setServiceIndication(java.lang.String serviceIndication) {
        this.serviceIndication = serviceIndication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxXmlRepositoryDataKey)) return false;
        HsxXmlRepositoryDataKey other = (HsxXmlRepositoryDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.publicUserId==null && other.getPublicUserId()==null) || 
             (this.publicUserId!=null &&
              this.publicUserId.equals(other.getPublicUserId()))) &&
            ((this.serviceIndication==null && other.getServiceIndication()==null) || 
             (this.serviceIndication!=null &&
              this.serviceIndication.equals(other.getServiceIndication())));
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
        if (getPublicUserId() != null) {
            _hashCode += getPublicUserId().hashCode();
        }
        if (getServiceIndication() != null) {
            _hashCode += getServiceIndication().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxXmlRepositoryDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlRepositoryDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceIndication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceIndication"));
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
