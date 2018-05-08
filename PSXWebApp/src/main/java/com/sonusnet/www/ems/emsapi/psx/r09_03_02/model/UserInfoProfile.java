/**
 * UserInfoProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class UserInfoProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String userInfoProfileId;

    private java.lang.String description;

    private java.lang.String userInfoConstantValue;

    public UserInfoProfile() {
    }

    public UserInfoProfile(
           java.lang.String userInfoProfileId,
           java.lang.String description,
           java.lang.String userInfoConstantValue) {
        this.userInfoProfileId = userInfoProfileId;
        this.description = description;
        this.userInfoConstantValue = userInfoConstantValue;
    }


    /**
     * Gets the userInfoProfileId value for this UserInfoProfile.
     * 
     * @return userInfoProfileId
     */
    public java.lang.String getUserInfoProfileId() {
        return userInfoProfileId;
    }


    /**
     * Sets the userInfoProfileId value for this UserInfoProfile.
     * 
     * @param userInfoProfileId
     */
    public void setUserInfoProfileId(java.lang.String userInfoProfileId) {
        this.userInfoProfileId = userInfoProfileId;
    }


    /**
     * Gets the description value for this UserInfoProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UserInfoProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the userInfoConstantValue value for this UserInfoProfile.
     * 
     * @return userInfoConstantValue
     */
    public java.lang.String getUserInfoConstantValue() {
        return userInfoConstantValue;
    }


    /**
     * Sets the userInfoConstantValue value for this UserInfoProfile.
     * 
     * @param userInfoConstantValue
     */
    public void setUserInfoConstantValue(java.lang.String userInfoConstantValue) {
        this.userInfoConstantValue = userInfoConstantValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserInfoProfile)) return false;
        UserInfoProfile other = (UserInfoProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userInfoProfileId==null && other.getUserInfoProfileId()==null) || 
             (this.userInfoProfileId!=null &&
              this.userInfoProfileId.equals(other.getUserInfoProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.userInfoConstantValue==null && other.getUserInfoConstantValue()==null) || 
             (this.userInfoConstantValue!=null &&
              this.userInfoConstantValue.equals(other.getUserInfoConstantValue())));
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
        if (getUserInfoProfileId() != null) {
            _hashCode += getUserInfoProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getUserInfoConstantValue() != null) {
            _hashCode += getUserInfoConstantValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserInfoProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "UserInfoProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfoProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userInfoProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfoConstantValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userInfoConstantValue"));
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
