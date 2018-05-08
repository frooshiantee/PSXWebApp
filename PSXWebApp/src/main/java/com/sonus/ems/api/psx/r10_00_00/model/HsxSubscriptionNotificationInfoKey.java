/**
 * HsxSubscriptionNotificationInfoKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxSubscriptionNotificationInfoKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String applicationServerId;
    private java.lang.String publicUserId;
    private java.lang.Integer requestedDataType;
    private java.lang.String serviceIndication;
    private java.lang.Integer identitySet;

    public HsxSubscriptionNotificationInfoKey() {
    }

    public HsxSubscriptionNotificationInfoKey(
           java.lang.String applicationServerId,
           java.lang.String publicUserId,
           java.lang.Integer requestedDataType,
           java.lang.String serviceIndication,
           java.lang.Integer identitySet) {
           this.applicationServerId = applicationServerId;
           this.publicUserId = publicUserId;
           this.requestedDataType = requestedDataType;
           this.serviceIndication = serviceIndication;
           this.identitySet = identitySet;
    }


    /**
     * Gets the applicationServerId value for this HsxSubscriptionNotificationInfoKey.
     * 
     * @return applicationServerId
     */
    public java.lang.String getApplicationServerId() {
        return applicationServerId;
    }


    /**
     * Sets the applicationServerId value for this HsxSubscriptionNotificationInfoKey.
     * 
     * @param applicationServerId
     */
    public void setApplicationServerId(java.lang.String applicationServerId) {
        this.applicationServerId = applicationServerId;
    }


    /**
     * Gets the publicUserId value for this HsxSubscriptionNotificationInfoKey.
     * 
     * @return publicUserId
     */
    public java.lang.String getPublicUserId() {
        return publicUserId;
    }


    /**
     * Sets the publicUserId value for this HsxSubscriptionNotificationInfoKey.
     * 
     * @param publicUserId
     */
    public void setPublicUserId(java.lang.String publicUserId) {
        this.publicUserId = publicUserId;
    }


    /**
     * Gets the requestedDataType value for this HsxSubscriptionNotificationInfoKey.
     * 
     * @return requestedDataType
     */
    public java.lang.Integer getRequestedDataType() {
        return requestedDataType;
    }


    /**
     * Sets the requestedDataType value for this HsxSubscriptionNotificationInfoKey.
     * 
     * @param requestedDataType
     */
    public void setRequestedDataType(java.lang.Integer requestedDataType) {
        this.requestedDataType = requestedDataType;
    }


    /**
     * Gets the serviceIndication value for this HsxSubscriptionNotificationInfoKey.
     * 
     * @return serviceIndication
     */
    public java.lang.String getServiceIndication() {
        return serviceIndication;
    }


    /**
     * Sets the serviceIndication value for this HsxSubscriptionNotificationInfoKey.
     * 
     * @param serviceIndication
     */
    public void setServiceIndication(java.lang.String serviceIndication) {
        this.serviceIndication = serviceIndication;
    }


    /**
     * Gets the identitySet value for this HsxSubscriptionNotificationInfoKey.
     * 
     * @return identitySet
     */
    public java.lang.Integer getIdentitySet() {
        return identitySet;
    }


    /**
     * Sets the identitySet value for this HsxSubscriptionNotificationInfoKey.
     * 
     * @param identitySet
     */
    public void setIdentitySet(java.lang.Integer identitySet) {
        this.identitySet = identitySet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxSubscriptionNotificationInfoKey)) return false;
        HsxSubscriptionNotificationInfoKey other = (HsxSubscriptionNotificationInfoKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applicationServerId==null && other.getApplicationServerId()==null) || 
             (this.applicationServerId!=null &&
              this.applicationServerId.equals(other.getApplicationServerId()))) &&
            ((this.publicUserId==null && other.getPublicUserId()==null) || 
             (this.publicUserId!=null &&
              this.publicUserId.equals(other.getPublicUserId()))) &&
            ((this.requestedDataType==null && other.getRequestedDataType()==null) || 
             (this.requestedDataType!=null &&
              this.requestedDataType.equals(other.getRequestedDataType()))) &&
            ((this.serviceIndication==null && other.getServiceIndication()==null) || 
             (this.serviceIndication!=null &&
              this.serviceIndication.equals(other.getServiceIndication()))) &&
            ((this.identitySet==null && other.getIdentitySet()==null) || 
             (this.identitySet!=null &&
              this.identitySet.equals(other.getIdentitySet())));
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
        if (getApplicationServerId() != null) {
            _hashCode += getApplicationServerId().hashCode();
        }
        if (getPublicUserId() != null) {
            _hashCode += getPublicUserId().hashCode();
        }
        if (getRequestedDataType() != null) {
            _hashCode += getRequestedDataType().hashCode();
        }
        if (getServiceIndication() != null) {
            _hashCode += getServiceIndication().hashCode();
        }
        if (getIdentitySet() != null) {
            _hashCode += getIdentitySet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxSubscriptionNotificationInfoKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSubscriptionNotificationInfoKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationServerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationServerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestedDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceIndication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceIndication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identitySet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identitySet"));
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
