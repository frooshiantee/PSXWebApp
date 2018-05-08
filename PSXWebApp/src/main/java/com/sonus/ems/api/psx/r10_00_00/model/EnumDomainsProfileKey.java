/**
 * EnumDomainsProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class EnumDomainsProfileKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String enumDomainProfileId;

    public EnumDomainsProfileKey() {
    }

    public EnumDomainsProfileKey(
           java.lang.String enumDomainProfileId) {
           this.enumDomainProfileId = enumDomainProfileId;
    }


    /**
     * Gets the enumDomainProfileId value for this EnumDomainsProfileKey.
     * 
     * @return enumDomainProfileId
     */
    public java.lang.String getEnumDomainProfileId() {
        return enumDomainProfileId;
    }


    /**
     * Sets the enumDomainProfileId value for this EnumDomainsProfileKey.
     * 
     * @param enumDomainProfileId
     */
    public void setEnumDomainProfileId(java.lang.String enumDomainProfileId) {
        this.enumDomainProfileId = enumDomainProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumDomainsProfileKey)) return false;
        EnumDomainsProfileKey other = (EnumDomainsProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enumDomainProfileId==null && other.getEnumDomainProfileId()==null) || 
             (this.enumDomainProfileId!=null &&
              this.enumDomainProfileId.equals(other.getEnumDomainProfileId())));
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
        if (getEnumDomainProfileId() != null) {
            _hashCode += getEnumDomainProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumDomainsProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumDomainsProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumDomainProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumDomainProfileId"));
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
