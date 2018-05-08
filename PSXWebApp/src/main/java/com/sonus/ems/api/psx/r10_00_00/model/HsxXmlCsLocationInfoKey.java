/**
 * HsxXmlCsLocationInfoKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxXmlCsLocationInfoKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String csLocationInfoId;

    public HsxXmlCsLocationInfoKey() {
    }

    public HsxXmlCsLocationInfoKey(
           java.lang.String csLocationInfoId) {
           this.csLocationInfoId = csLocationInfoId;
    }


    /**
     * Gets the csLocationInfoId value for this HsxXmlCsLocationInfoKey.
     * 
     * @return csLocationInfoId
     */
    public java.lang.String getCsLocationInfoId() {
        return csLocationInfoId;
    }


    /**
     * Sets the csLocationInfoId value for this HsxXmlCsLocationInfoKey.
     * 
     * @param csLocationInfoId
     */
    public void setCsLocationInfoId(java.lang.String csLocationInfoId) {
        this.csLocationInfoId = csLocationInfoId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxXmlCsLocationInfoKey)) return false;
        HsxXmlCsLocationInfoKey other = (HsxXmlCsLocationInfoKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.csLocationInfoId==null && other.getCsLocationInfoId()==null) || 
             (this.csLocationInfoId!=null &&
              this.csLocationInfoId.equals(other.getCsLocationInfoId())));
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
        if (getCsLocationInfoId() != null) {
            _hashCode += getCsLocationInfoId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxXmlCsLocationInfoKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlCsLocationInfoKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csLocationInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csLocationInfoId"));
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