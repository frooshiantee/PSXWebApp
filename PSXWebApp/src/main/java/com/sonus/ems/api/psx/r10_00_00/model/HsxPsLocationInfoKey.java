/**
 * HsxPsLocationInfoKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxPsLocationInfoKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String psLocationInfoId;

    public HsxPsLocationInfoKey() {
    }

    public HsxPsLocationInfoKey(
           java.lang.String psLocationInfoId) {
           this.psLocationInfoId = psLocationInfoId;
    }


    /**
     * Gets the psLocationInfoId value for this HsxPsLocationInfoKey.
     * 
     * @return psLocationInfoId
     */
    public java.lang.String getPsLocationInfoId() {
        return psLocationInfoId;
    }


    /**
     * Sets the psLocationInfoId value for this HsxPsLocationInfoKey.
     * 
     * @param psLocationInfoId
     */
    public void setPsLocationInfoId(java.lang.String psLocationInfoId) {
        this.psLocationInfoId = psLocationInfoId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxPsLocationInfoKey)) return false;
        HsxPsLocationInfoKey other = (HsxPsLocationInfoKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.psLocationInfoId==null && other.getPsLocationInfoId()==null) || 
             (this.psLocationInfoId!=null &&
              this.psLocationInfoId.equals(other.getPsLocationInfoId())));
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
        if (getPsLocationInfoId() != null) {
            _hashCode += getPsLocationInfoId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxPsLocationInfoKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPsLocationInfoKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psLocationInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "psLocationInfoId"));
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
