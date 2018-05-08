/**
 * HomeDomainGroupKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HomeDomainGroupKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String homeDomainGroupId;

    public HomeDomainGroupKey() {
    }

    public HomeDomainGroupKey(
           java.lang.String homeDomainGroupId) {
        this.homeDomainGroupId = homeDomainGroupId;
    }


    /**
     * Gets the homeDomainGroupId value for this HomeDomainGroupKey.
     * 
     * @return homeDomainGroupId
     */
    public java.lang.String getHomeDomainGroupId() {
        return homeDomainGroupId;
    }


    /**
     * Sets the homeDomainGroupId value for this HomeDomainGroupKey.
     * 
     * @param homeDomainGroupId
     */
    public void setHomeDomainGroupId(java.lang.String homeDomainGroupId) {
        this.homeDomainGroupId = homeDomainGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HomeDomainGroupKey)) return false;
        HomeDomainGroupKey other = (HomeDomainGroupKey) obj;
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
              this.homeDomainGroupId.equals(other.getHomeDomainGroupId())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HomeDomainGroupKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HomeDomainGroupKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDomainGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeDomainGroupId"));
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
