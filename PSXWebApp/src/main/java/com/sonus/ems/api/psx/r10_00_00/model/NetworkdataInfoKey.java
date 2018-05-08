/**
 * NetworkdataInfoKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class NetworkdataInfoKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.Integer networkdataPartition;
    private java.lang.Integer networkdataNet;

    public NetworkdataInfoKey() {
    }

    public NetworkdataInfoKey(
           java.lang.Integer networkdataPartition,
           java.lang.Integer networkdataNet) {
           this.networkdataPartition = networkdataPartition;
           this.networkdataNet = networkdataNet;
    }


    /**
     * Gets the networkdataPartition value for this NetworkdataInfoKey.
     * 
     * @return networkdataPartition
     */
    public java.lang.Integer getNetworkdataPartition() {
        return networkdataPartition;
    }


    /**
     * Sets the networkdataPartition value for this NetworkdataInfoKey.
     * 
     * @param networkdataPartition
     */
    public void setNetworkdataPartition(java.lang.Integer networkdataPartition) {
        this.networkdataPartition = networkdataPartition;
    }


    /**
     * Gets the networkdataNet value for this NetworkdataInfoKey.
     * 
     * @return networkdataNet
     */
    public java.lang.Integer getNetworkdataNet() {
        return networkdataNet;
    }


    /**
     * Sets the networkdataNet value for this NetworkdataInfoKey.
     * 
     * @param networkdataNet
     */
    public void setNetworkdataNet(java.lang.Integer networkdataNet) {
        this.networkdataNet = networkdataNet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkdataInfoKey)) return false;
        NetworkdataInfoKey other = (NetworkdataInfoKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.networkdataPartition==null && other.getNetworkdataPartition()==null) || 
             (this.networkdataPartition!=null &&
              this.networkdataPartition.equals(other.getNetworkdataPartition()))) &&
            ((this.networkdataNet==null && other.getNetworkdataNet()==null) || 
             (this.networkdataNet!=null &&
              this.networkdataNet.equals(other.getNetworkdataNet())));
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
        if (getNetworkdataPartition() != null) {
            _hashCode += getNetworkdataPartition().hashCode();
        }
        if (getNetworkdataNet() != null) {
            _hashCode += getNetworkdataNet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkdataInfoKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NetworkdataInfoKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkdataPartition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkdataPartition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkdataNet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkdataNet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
