/**
 * Enterprise.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class Enterprise  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Integer enterpriseId;
    private java.lang.String enterpriseName;

    public Enterprise() {
    }

    public Enterprise(
           java.lang.Integer enterpriseId,
           java.lang.String enterpriseName) {
           this.enterpriseId = enterpriseId;
           this.enterpriseName = enterpriseName;
    }


    /**
     * Gets the enterpriseId value for this Enterprise.
     * 
     * @return enterpriseId
     */
    public java.lang.Integer getEnterpriseId() {
        return enterpriseId;
    }


    /**
     * Sets the enterpriseId value for this Enterprise.
     * 
     * @param enterpriseId
     */
    public void setEnterpriseId(java.lang.Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }


    /**
     * Gets the enterpriseName value for this Enterprise.
     * 
     * @return enterpriseName
     */
    public java.lang.String getEnterpriseName() {
        return enterpriseName;
    }


    /**
     * Sets the enterpriseName value for this Enterprise.
     * 
     * @param enterpriseName
     */
    public void setEnterpriseName(java.lang.String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Enterprise)) return false;
        Enterprise other = (Enterprise) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enterpriseId==null && other.getEnterpriseId()==null) || 
             (this.enterpriseId!=null &&
              this.enterpriseId.equals(other.getEnterpriseId()))) &&
            ((this.enterpriseName==null && other.getEnterpriseName()==null) || 
             (this.enterpriseName!=null &&
              this.enterpriseName.equals(other.getEnterpriseName())));
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
        if (getEnterpriseId() != null) {
            _hashCode += getEnterpriseId().hashCode();
        }
        if (getEnterpriseName() != null) {
            _hashCode += getEnterpriseName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Enterprise.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Enterprise"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enterpriseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enterpriseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enterpriseName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enterpriseName"));
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
