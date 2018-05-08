/**
 * ForwardersDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ForwardersDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String dnsZoneId;

    private java.lang.Integer forwarderPriority;

    private java.lang.String forwarderIpAddress;

    public ForwardersDataKey() {
    }

    public ForwardersDataKey(
           java.lang.String dnsZoneId,
           java.lang.Integer forwarderPriority,
           java.lang.String forwarderIpAddress) {
        this.dnsZoneId = dnsZoneId;
        this.forwarderPriority = forwarderPriority;
        this.forwarderIpAddress = forwarderIpAddress;
    }


    /**
     * Gets the dnsZoneId value for this ForwardersDataKey.
     * 
     * @return dnsZoneId
     */
    public java.lang.String getDnsZoneId() {
        return dnsZoneId;
    }


    /**
     * Sets the dnsZoneId value for this ForwardersDataKey.
     * 
     * @param dnsZoneId
     */
    public void setDnsZoneId(java.lang.String dnsZoneId) {
        this.dnsZoneId = dnsZoneId;
    }


    /**
     * Gets the forwarderPriority value for this ForwardersDataKey.
     * 
     * @return forwarderPriority
     */
    public java.lang.Integer getForwarderPriority() {
        return forwarderPriority;
    }


    /**
     * Sets the forwarderPriority value for this ForwardersDataKey.
     * 
     * @param forwarderPriority
     */
    public void setForwarderPriority(java.lang.Integer forwarderPriority) {
        this.forwarderPriority = forwarderPriority;
    }


    /**
     * Gets the forwarderIpAddress value for this ForwardersDataKey.
     * 
     * @return forwarderIpAddress
     */
    public java.lang.String getForwarderIpAddress() {
        return forwarderIpAddress;
    }


    /**
     * Sets the forwarderIpAddress value for this ForwardersDataKey.
     * 
     * @param forwarderIpAddress
     */
    public void setForwarderIpAddress(java.lang.String forwarderIpAddress) {
        this.forwarderIpAddress = forwarderIpAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForwardersDataKey)) return false;
        ForwardersDataKey other = (ForwardersDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dnsZoneId==null && other.getDnsZoneId()==null) || 
             (this.dnsZoneId!=null &&
              this.dnsZoneId.equals(other.getDnsZoneId()))) &&
            ((this.forwarderPriority==null && other.getForwarderPriority()==null) || 
             (this.forwarderPriority!=null &&
              this.forwarderPriority.equals(other.getForwarderPriority()))) &&
            ((this.forwarderIpAddress==null && other.getForwarderIpAddress()==null) || 
             (this.forwarderIpAddress!=null &&
              this.forwarderIpAddress.equals(other.getForwarderIpAddress())));
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
        if (getDnsZoneId() != null) {
            _hashCode += getDnsZoneId().hashCode();
        }
        if (getForwarderPriority() != null) {
            _hashCode += getForwarderPriority().hashCode();
        }
        if (getForwarderIpAddress() != null) {
            _hashCode += getForwarderIpAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForwardersDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ForwardersDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwarderPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwarderPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwarderIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwarderIpAddress"));
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
