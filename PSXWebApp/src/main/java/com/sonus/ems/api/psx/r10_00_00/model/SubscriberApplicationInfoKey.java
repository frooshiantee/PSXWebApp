/**
 * SubscriberApplicationInfoKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SubscriberApplicationInfoKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String uniqueInternationalSubscriberId;
    private java.lang.Integer applicationId;

    public SubscriberApplicationInfoKey() {
    }

    public SubscriberApplicationInfoKey(
           java.lang.String uniqueInternationalSubscriberId,
           java.lang.Integer applicationId) {
           this.uniqueInternationalSubscriberId = uniqueInternationalSubscriberId;
           this.applicationId = applicationId;
    }


    /**
     * Gets the uniqueInternationalSubscriberId value for this SubscriberApplicationInfoKey.
     * 
     * @return uniqueInternationalSubscriberId
     */
    public java.lang.String getUniqueInternationalSubscriberId() {
        return uniqueInternationalSubscriberId;
    }


    /**
     * Sets the uniqueInternationalSubscriberId value for this SubscriberApplicationInfoKey.
     * 
     * @param uniqueInternationalSubscriberId
     */
    public void setUniqueInternationalSubscriberId(java.lang.String uniqueInternationalSubscriberId) {
        this.uniqueInternationalSubscriberId = uniqueInternationalSubscriberId;
    }


    /**
     * Gets the applicationId value for this SubscriberApplicationInfoKey.
     * 
     * @return applicationId
     */
    public java.lang.Integer getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this SubscriberApplicationInfoKey.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.Integer applicationId) {
        this.applicationId = applicationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberApplicationInfoKey)) return false;
        SubscriberApplicationInfoKey other = (SubscriberApplicationInfoKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uniqueInternationalSubscriberId==null && other.getUniqueInternationalSubscriberId()==null) || 
             (this.uniqueInternationalSubscriberId!=null &&
              this.uniqueInternationalSubscriberId.equals(other.getUniqueInternationalSubscriberId()))) &&
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId())));
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
        if (getUniqueInternationalSubscriberId() != null) {
            _hashCode += getUniqueInternationalSubscriberId().hashCode();
        }
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberApplicationInfoKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SubscriberApplicationInfoKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueInternationalSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uniqueInternationalSubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationId"));
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
