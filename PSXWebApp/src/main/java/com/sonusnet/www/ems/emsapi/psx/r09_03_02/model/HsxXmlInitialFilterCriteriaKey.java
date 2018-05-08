/**
 * HsxXmlInitialFilterCriteriaKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxXmlInitialFilterCriteriaKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String serviceProfileId;

    private java.lang.String applicationServerId;

    public HsxXmlInitialFilterCriteriaKey() {
    }

    public HsxXmlInitialFilterCriteriaKey(
           java.lang.String serviceProfileId,
           java.lang.String applicationServerId) {
        this.serviceProfileId = serviceProfileId;
        this.applicationServerId = applicationServerId;
    }


    /**
     * Gets the serviceProfileId value for this HsxXmlInitialFilterCriteriaKey.
     * 
     * @return serviceProfileId
     */
    public java.lang.String getServiceProfileId() {
        return serviceProfileId;
    }


    /**
     * Sets the serviceProfileId value for this HsxXmlInitialFilterCriteriaKey.
     * 
     * @param serviceProfileId
     */
    public void setServiceProfileId(java.lang.String serviceProfileId) {
        this.serviceProfileId = serviceProfileId;
    }


    /**
     * Gets the applicationServerId value for this HsxXmlInitialFilterCriteriaKey.
     * 
     * @return applicationServerId
     */
    public java.lang.String getApplicationServerId() {
        return applicationServerId;
    }


    /**
     * Sets the applicationServerId value for this HsxXmlInitialFilterCriteriaKey.
     * 
     * @param applicationServerId
     */
    public void setApplicationServerId(java.lang.String applicationServerId) {
        this.applicationServerId = applicationServerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxXmlInitialFilterCriteriaKey)) return false;
        HsxXmlInitialFilterCriteriaKey other = (HsxXmlInitialFilterCriteriaKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceProfileId==null && other.getServiceProfileId()==null) || 
             (this.serviceProfileId!=null &&
              this.serviceProfileId.equals(other.getServiceProfileId()))) &&
            ((this.applicationServerId==null && other.getApplicationServerId()==null) || 
             (this.applicationServerId!=null &&
              this.applicationServerId.equals(other.getApplicationServerId())));
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
        if (getServiceProfileId() != null) {
            _hashCode += getServiceProfileId().hashCode();
        }
        if (getApplicationServerId() != null) {
            _hashCode += getApplicationServerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxXmlInitialFilterCriteriaKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlInitialFilterCriteriaKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationServerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationServerId"));
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
