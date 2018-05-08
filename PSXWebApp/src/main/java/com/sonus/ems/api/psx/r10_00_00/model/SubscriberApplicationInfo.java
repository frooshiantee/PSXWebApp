/**
 * SubscriberApplicationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SubscriberApplicationInfo  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String uniqueInternationalSubscriberId;
    private java.lang.Integer applicationId;
    private java.lang.String applicationServerHostName;
    private java.lang.String applicationServerRealm;

    public SubscriberApplicationInfo() {
    }

    public SubscriberApplicationInfo(
           java.lang.String uniqueInternationalSubscriberId,
           java.lang.Integer applicationId,
           java.lang.String applicationServerHostName,
           java.lang.String applicationServerRealm) {
           this.uniqueInternationalSubscriberId = uniqueInternationalSubscriberId;
           this.applicationId = applicationId;
           this.applicationServerHostName = applicationServerHostName;
           this.applicationServerRealm = applicationServerRealm;
    }


    /**
     * Gets the uniqueInternationalSubscriberId value for this SubscriberApplicationInfo.
     * 
     * @return uniqueInternationalSubscriberId
     */
    public java.lang.String getUniqueInternationalSubscriberId() {
        return uniqueInternationalSubscriberId;
    }


    /**
     * Sets the uniqueInternationalSubscriberId value for this SubscriberApplicationInfo.
     * 
     * @param uniqueInternationalSubscriberId
     */
    public void setUniqueInternationalSubscriberId(java.lang.String uniqueInternationalSubscriberId) {
        this.uniqueInternationalSubscriberId = uniqueInternationalSubscriberId;
    }


    /**
     * Gets the applicationId value for this SubscriberApplicationInfo.
     * 
     * @return applicationId
     */
    public java.lang.Integer getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this SubscriberApplicationInfo.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.Integer applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the applicationServerHostName value for this SubscriberApplicationInfo.
     * 
     * @return applicationServerHostName
     */
    public java.lang.String getApplicationServerHostName() {
        return applicationServerHostName;
    }


    /**
     * Sets the applicationServerHostName value for this SubscriberApplicationInfo.
     * 
     * @param applicationServerHostName
     */
    public void setApplicationServerHostName(java.lang.String applicationServerHostName) {
        this.applicationServerHostName = applicationServerHostName;
    }


    /**
     * Gets the applicationServerRealm value for this SubscriberApplicationInfo.
     * 
     * @return applicationServerRealm
     */
    public java.lang.String getApplicationServerRealm() {
        return applicationServerRealm;
    }


    /**
     * Sets the applicationServerRealm value for this SubscriberApplicationInfo.
     * 
     * @param applicationServerRealm
     */
    public void setApplicationServerRealm(java.lang.String applicationServerRealm) {
        this.applicationServerRealm = applicationServerRealm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberApplicationInfo)) return false;
        SubscriberApplicationInfo other = (SubscriberApplicationInfo) obj;
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
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.applicationServerHostName==null && other.getApplicationServerHostName()==null) || 
             (this.applicationServerHostName!=null &&
              this.applicationServerHostName.equals(other.getApplicationServerHostName()))) &&
            ((this.applicationServerRealm==null && other.getApplicationServerRealm()==null) || 
             (this.applicationServerRealm!=null &&
              this.applicationServerRealm.equals(other.getApplicationServerRealm())));
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
        if (getApplicationServerHostName() != null) {
            _hashCode += getApplicationServerHostName().hashCode();
        }
        if (getApplicationServerRealm() != null) {
            _hashCode += getApplicationServerRealm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberApplicationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SubscriberApplicationInfo"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationServerHostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationServerHostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationServerRealm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationServerRealm"));
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
