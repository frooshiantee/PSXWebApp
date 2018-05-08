/**
 * LwresdDnsServerDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class LwresdDnsServerDataKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String lwresdDnsServerId;
    private java.lang.String lwresdDnsServerIp;

    public LwresdDnsServerDataKey() {
    }

    public LwresdDnsServerDataKey(
           java.lang.String lwresdDnsServerId,
           java.lang.String lwresdDnsServerIp) {
           this.lwresdDnsServerId = lwresdDnsServerId;
           this.lwresdDnsServerIp = lwresdDnsServerIp;
    }


    /**
     * Gets the lwresdDnsServerId value for this LwresdDnsServerDataKey.
     * 
     * @return lwresdDnsServerId
     */
    public java.lang.String getLwresdDnsServerId() {
        return lwresdDnsServerId;
    }


    /**
     * Sets the lwresdDnsServerId value for this LwresdDnsServerDataKey.
     * 
     * @param lwresdDnsServerId
     */
    public void setLwresdDnsServerId(java.lang.String lwresdDnsServerId) {
        this.lwresdDnsServerId = lwresdDnsServerId;
    }


    /**
     * Gets the lwresdDnsServerIp value for this LwresdDnsServerDataKey.
     * 
     * @return lwresdDnsServerIp
     */
    public java.lang.String getLwresdDnsServerIp() {
        return lwresdDnsServerIp;
    }


    /**
     * Sets the lwresdDnsServerIp value for this LwresdDnsServerDataKey.
     * 
     * @param lwresdDnsServerIp
     */
    public void setLwresdDnsServerIp(java.lang.String lwresdDnsServerIp) {
        this.lwresdDnsServerIp = lwresdDnsServerIp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LwresdDnsServerDataKey)) return false;
        LwresdDnsServerDataKey other = (LwresdDnsServerDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lwresdDnsServerId==null && other.getLwresdDnsServerId()==null) || 
             (this.lwresdDnsServerId!=null &&
              this.lwresdDnsServerId.equals(other.getLwresdDnsServerId()))) &&
            ((this.lwresdDnsServerIp==null && other.getLwresdDnsServerIp()==null) || 
             (this.lwresdDnsServerIp!=null &&
              this.lwresdDnsServerIp.equals(other.getLwresdDnsServerIp())));
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
        if (getLwresdDnsServerId() != null) {
            _hashCode += getLwresdDnsServerId().hashCode();
        }
        if (getLwresdDnsServerIp() != null) {
            _hashCode += getLwresdDnsServerIp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LwresdDnsServerDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LwresdDnsServerDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lwresdDnsServerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lwresdDnsServerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lwresdDnsServerIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lwresdDnsServerIp"));
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
