/**
 * HomeDomainGroupDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HomeDomainGroupDataKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String homeDomainGroupId;
    private java.lang.String homeDomainGroupDataId;

    public HomeDomainGroupDataKey() {
    }

    public HomeDomainGroupDataKey(
           java.lang.String homeDomainGroupId,
           java.lang.String homeDomainGroupDataId) {
           this.homeDomainGroupId = homeDomainGroupId;
           this.homeDomainGroupDataId = homeDomainGroupDataId;
    }


    /**
     * Gets the homeDomainGroupId value for this HomeDomainGroupDataKey.
     * 
     * @return homeDomainGroupId
     */
    public java.lang.String getHomeDomainGroupId() {
        return homeDomainGroupId;
    }


    /**
     * Sets the homeDomainGroupId value for this HomeDomainGroupDataKey.
     * 
     * @param homeDomainGroupId
     */
    public void setHomeDomainGroupId(java.lang.String homeDomainGroupId) {
        this.homeDomainGroupId = homeDomainGroupId;
    }


    /**
     * Gets the homeDomainGroupDataId value for this HomeDomainGroupDataKey.
     * 
     * @return homeDomainGroupDataId
     */
    public java.lang.String getHomeDomainGroupDataId() {
        return homeDomainGroupDataId;
    }


    /**
     * Sets the homeDomainGroupDataId value for this HomeDomainGroupDataKey.
     * 
     * @param homeDomainGroupDataId
     */
    public void setHomeDomainGroupDataId(java.lang.String homeDomainGroupDataId) {
        this.homeDomainGroupDataId = homeDomainGroupDataId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HomeDomainGroupDataKey)) return false;
        HomeDomainGroupDataKey other = (HomeDomainGroupDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.homeDomainGroupId==null && other.getHomeDomainGroupId()==null) || 
             (this.homeDomainGroupId!=null &&
              this.homeDomainGroupId.equals(other.getHomeDomainGroupId()))) &&
            ((this.homeDomainGroupDataId==null && other.getHomeDomainGroupDataId()==null) || 
             (this.homeDomainGroupDataId!=null &&
              this.homeDomainGroupDataId.equals(other.getHomeDomainGroupDataId())));
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
        if (getHomeDomainGroupId() != null) {
            _hashCode += getHomeDomainGroupId().hashCode();
        }
        if (getHomeDomainGroupDataId() != null) {
            _hashCode += getHomeDomainGroupDataId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HomeDomainGroupDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HomeDomainGroupDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDomainGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeDomainGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDomainGroupDataId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeDomainGroupDataId"));
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
