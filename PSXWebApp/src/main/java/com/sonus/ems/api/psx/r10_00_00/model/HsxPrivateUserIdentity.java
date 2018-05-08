/**
 * HsxPrivateUserIdentity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxPrivateUserIdentity  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String privateUserId;
    private java.lang.String authenticationProfileId;
    private java.lang.String key;
    private java.lang.String capabilityId;
    private java.lang.Integer isPrivateServiceId;

    public HsxPrivateUserIdentity() {
    }

    public HsxPrivateUserIdentity(
           java.lang.String privateUserId,
           java.lang.String authenticationProfileId,
           java.lang.String key,
           java.lang.String capabilityId,
           java.lang.Integer isPrivateServiceId) {
           this.privateUserId = privateUserId;
           this.authenticationProfileId = authenticationProfileId;
           this.key = key;
           this.capabilityId = capabilityId;
           this.isPrivateServiceId = isPrivateServiceId;
    }


    /**
     * Gets the privateUserId value for this HsxPrivateUserIdentity.
     * 
     * @return privateUserId
     */
    public java.lang.String getPrivateUserId() {
        return privateUserId;
    }


    /**
     * Sets the privateUserId value for this HsxPrivateUserIdentity.
     * 
     * @param privateUserId
     */
    public void setPrivateUserId(java.lang.String privateUserId) {
        this.privateUserId = privateUserId;
    }


    /**
     * Gets the authenticationProfileId value for this HsxPrivateUserIdentity.
     * 
     * @return authenticationProfileId
     */
    public java.lang.String getAuthenticationProfileId() {
        return authenticationProfileId;
    }


    /**
     * Sets the authenticationProfileId value for this HsxPrivateUserIdentity.
     * 
     * @param authenticationProfileId
     */
    public void setAuthenticationProfileId(java.lang.String authenticationProfileId) {
        this.authenticationProfileId = authenticationProfileId;
    }


    /**
     * Gets the key value for this HsxPrivateUserIdentity.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this HsxPrivateUserIdentity.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the capabilityId value for this HsxPrivateUserIdentity.
     * 
     * @return capabilityId
     */
    public java.lang.String getCapabilityId() {
        return capabilityId;
    }


    /**
     * Sets the capabilityId value for this HsxPrivateUserIdentity.
     * 
     * @param capabilityId
     */
    public void setCapabilityId(java.lang.String capabilityId) {
        this.capabilityId = capabilityId;
    }


    /**
     * Gets the isPrivateServiceId value for this HsxPrivateUserIdentity.
     * 
     * @return isPrivateServiceId
     */
    public java.lang.Integer getIsPrivateServiceId() {
        return isPrivateServiceId;
    }


    /**
     * Sets the isPrivateServiceId value for this HsxPrivateUserIdentity.
     * 
     * @param isPrivateServiceId
     */
    public void setIsPrivateServiceId(java.lang.Integer isPrivateServiceId) {
        this.isPrivateServiceId = isPrivateServiceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxPrivateUserIdentity)) return false;
        HsxPrivateUserIdentity other = (HsxPrivateUserIdentity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.privateUserId==null && other.getPrivateUserId()==null) || 
             (this.privateUserId!=null &&
              this.privateUserId.equals(other.getPrivateUserId()))) &&
            ((this.authenticationProfileId==null && other.getAuthenticationProfileId()==null) || 
             (this.authenticationProfileId!=null &&
              this.authenticationProfileId.equals(other.getAuthenticationProfileId()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.capabilityId==null && other.getCapabilityId()==null) || 
             (this.capabilityId!=null &&
              this.capabilityId.equals(other.getCapabilityId()))) &&
            ((this.isPrivateServiceId==null && other.getIsPrivateServiceId()==null) || 
             (this.isPrivateServiceId!=null &&
              this.isPrivateServiceId.equals(other.getIsPrivateServiceId())));
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
        if (getPrivateUserId() != null) {
            _hashCode += getPrivateUserId().hashCode();
        }
        if (getAuthenticationProfileId() != null) {
            _hashCode += getAuthenticationProfileId().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getCapabilityId() != null) {
            _hashCode += getCapabilityId().hashCode();
        }
        if (getIsPrivateServiceId() != null) {
            _hashCode += getIsPrivateServiceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxPrivateUserIdentity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPrivateUserIdentity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capabilityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capabilityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrivateServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPrivateServiceId"));
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
