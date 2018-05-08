/**
 * HsxApplicationServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxApplicationServer  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String applicationServerId;

    private java.lang.String sipUrl;

    private java.lang.String subscriptionPermissionsId;

    private java.lang.String originHost;

    private java.lang.String originRealm;

    public HsxApplicationServer() {
    }

    public HsxApplicationServer(
           java.lang.String applicationServerId,
           java.lang.String sipUrl,
           java.lang.String subscriptionPermissionsId,
           java.lang.String originHost,
           java.lang.String originRealm) {
        this.applicationServerId = applicationServerId;
        this.sipUrl = sipUrl;
        this.subscriptionPermissionsId = subscriptionPermissionsId;
        this.originHost = originHost;
        this.originRealm = originRealm;
    }


    /**
     * Gets the applicationServerId value for this HsxApplicationServer.
     * 
     * @return applicationServerId
     */
    public java.lang.String getApplicationServerId() {
        return applicationServerId;
    }


    /**
     * Sets the applicationServerId value for this HsxApplicationServer.
     * 
     * @param applicationServerId
     */
    public void setApplicationServerId(java.lang.String applicationServerId) {
        this.applicationServerId = applicationServerId;
    }


    /**
     * Gets the sipUrl value for this HsxApplicationServer.
     * 
     * @return sipUrl
     */
    public java.lang.String getSipUrl() {
        return sipUrl;
    }


    /**
     * Sets the sipUrl value for this HsxApplicationServer.
     * 
     * @param sipUrl
     */
    public void setSipUrl(java.lang.String sipUrl) {
        this.sipUrl = sipUrl;
    }


    /**
     * Gets the subscriptionPermissionsId value for this HsxApplicationServer.
     * 
     * @return subscriptionPermissionsId
     */
    public java.lang.String getSubscriptionPermissionsId() {
        return subscriptionPermissionsId;
    }


    /**
     * Sets the subscriptionPermissionsId value for this HsxApplicationServer.
     * 
     * @param subscriptionPermissionsId
     */
    public void setSubscriptionPermissionsId(java.lang.String subscriptionPermissionsId) {
        this.subscriptionPermissionsId = subscriptionPermissionsId;
    }


    /**
     * Gets the originHost value for this HsxApplicationServer.
     * 
     * @return originHost
     */
    public java.lang.String getOriginHost() {
        return originHost;
    }


    /**
     * Sets the originHost value for this HsxApplicationServer.
     * 
     * @param originHost
     */
    public void setOriginHost(java.lang.String originHost) {
        this.originHost = originHost;
    }


    /**
     * Gets the originRealm value for this HsxApplicationServer.
     * 
     * @return originRealm
     */
    public java.lang.String getOriginRealm() {
        return originRealm;
    }


    /**
     * Sets the originRealm value for this HsxApplicationServer.
     * 
     * @param originRealm
     */
    public void setOriginRealm(java.lang.String originRealm) {
        this.originRealm = originRealm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxApplicationServer)) return false;
        HsxApplicationServer other = (HsxApplicationServer) obj;
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
            ((this.sipUrl==null && other.getSipUrl()==null) || 
             (this.sipUrl!=null &&
              this.sipUrl.equals(other.getSipUrl()))) &&
            ((this.subscriptionPermissionsId==null && other.getSubscriptionPermissionsId()==null) || 
             (this.subscriptionPermissionsId!=null &&
              this.subscriptionPermissionsId.equals(other.getSubscriptionPermissionsId()))) &&
            ((this.originHost==null && other.getOriginHost()==null) || 
             (this.originHost!=null &&
              this.originHost.equals(other.getOriginHost()))) &&
            ((this.originRealm==null && other.getOriginRealm()==null) || 
             (this.originRealm!=null &&
              this.originRealm.equals(other.getOriginRealm())));
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
        if (getSipUrl() != null) {
            _hashCode += getSipUrl().hashCode();
        }
        if (getSubscriptionPermissionsId() != null) {
            _hashCode += getSubscriptionPermissionsId().hashCode();
        }
        if (getOriginHost() != null) {
            _hashCode += getOriginHost().hashCode();
        }
        if (getOriginRealm() != null) {
            _hashCode += getOriginRealm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxApplicationServer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxApplicationServer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationServerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationServerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionPermissionsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriptionPermissionsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originHost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originRealm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originRealm"));
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
