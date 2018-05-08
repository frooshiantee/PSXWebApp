/**
 * DnsZoneLabelData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class DnsZoneLabelData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String dnsZoneLabelId;

    private java.lang.String dnsZoneId;

    public DnsZoneLabelData() {
    }

    public DnsZoneLabelData(
           java.lang.String dnsZoneLabelId,
           java.lang.String dnsZoneId) {
        this.dnsZoneLabelId = dnsZoneLabelId;
        this.dnsZoneId = dnsZoneId;
    }


    /**
     * Gets the dnsZoneLabelId value for this DnsZoneLabelData.
     * 
     * @return dnsZoneLabelId
     */
    public java.lang.String getDnsZoneLabelId() {
        return dnsZoneLabelId;
    }


    /**
     * Sets the dnsZoneLabelId value for this DnsZoneLabelData.
     * 
     * @param dnsZoneLabelId
     */
    public void setDnsZoneLabelId(java.lang.String dnsZoneLabelId) {
        this.dnsZoneLabelId = dnsZoneLabelId;
    }


    /**
     * Gets the dnsZoneId value for this DnsZoneLabelData.
     * 
     * @return dnsZoneId
     */
    public java.lang.String getDnsZoneId() {
        return dnsZoneId;
    }


    /**
     * Sets the dnsZoneId value for this DnsZoneLabelData.
     * 
     * @param dnsZoneId
     */
    public void setDnsZoneId(java.lang.String dnsZoneId) {
        this.dnsZoneId = dnsZoneId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DnsZoneLabelData)) return false;
        DnsZoneLabelData other = (DnsZoneLabelData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dnsZoneLabelId==null && other.getDnsZoneLabelId()==null) || 
             (this.dnsZoneLabelId!=null &&
              this.dnsZoneLabelId.equals(other.getDnsZoneLabelId()))) &&
            ((this.dnsZoneId==null && other.getDnsZoneId()==null) || 
             (this.dnsZoneId!=null &&
              this.dnsZoneId.equals(other.getDnsZoneId())));
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
        if (getDnsZoneLabelId() != null) {
            _hashCode += getDnsZoneLabelId().hashCode();
        }
        if (getDnsZoneId() != null) {
            _hashCode += getDnsZoneId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DnsZoneLabelData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DnsZoneLabelData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsZoneLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsZoneLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsZoneId"));
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
