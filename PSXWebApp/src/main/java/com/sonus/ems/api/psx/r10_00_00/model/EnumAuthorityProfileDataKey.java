/**
 * EnumAuthorityProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class EnumAuthorityProfileDataKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String enumAuthProfileId;
    private java.lang.String nameServerName;

    public EnumAuthorityProfileDataKey() {
    }

    public EnumAuthorityProfileDataKey(
           java.lang.String enumAuthProfileId,
           java.lang.String nameServerName) {
           this.enumAuthProfileId = enumAuthProfileId;
           this.nameServerName = nameServerName;
    }


    /**
     * Gets the enumAuthProfileId value for this EnumAuthorityProfileDataKey.
     * 
     * @return enumAuthProfileId
     */
    public java.lang.String getEnumAuthProfileId() {
        return enumAuthProfileId;
    }


    /**
     * Sets the enumAuthProfileId value for this EnumAuthorityProfileDataKey.
     * 
     * @param enumAuthProfileId
     */
    public void setEnumAuthProfileId(java.lang.String enumAuthProfileId) {
        this.enumAuthProfileId = enumAuthProfileId;
    }


    /**
     * Gets the nameServerName value for this EnumAuthorityProfileDataKey.
     * 
     * @return nameServerName
     */
    public java.lang.String getNameServerName() {
        return nameServerName;
    }


    /**
     * Sets the nameServerName value for this EnumAuthorityProfileDataKey.
     * 
     * @param nameServerName
     */
    public void setNameServerName(java.lang.String nameServerName) {
        this.nameServerName = nameServerName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumAuthorityProfileDataKey)) return false;
        EnumAuthorityProfileDataKey other = (EnumAuthorityProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enumAuthProfileId==null && other.getEnumAuthProfileId()==null) || 
             (this.enumAuthProfileId!=null &&
              this.enumAuthProfileId.equals(other.getEnumAuthProfileId()))) &&
            ((this.nameServerName==null && other.getNameServerName()==null) || 
             (this.nameServerName!=null &&
              this.nameServerName.equals(other.getNameServerName())));
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
        if (getEnumAuthProfileId() != null) {
            _hashCode += getEnumAuthProfileId().hashCode();
        }
        if (getNameServerName() != null) {
            _hashCode += getNameServerName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumAuthorityProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumAuthorityProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumAuthProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumAuthProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameServerName"));
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
