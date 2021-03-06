/**
 * NetworkdataInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class NetworkdataInfo  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Integer networkdataPartition;

    private java.lang.Integer networkdataNet;

    private java.lang.String partitionId;

    public NetworkdataInfo() {
    }

    public NetworkdataInfo(
           java.lang.Integer networkdataPartition,
           java.lang.Integer networkdataNet,
           java.lang.String partitionId) {
        this.networkdataPartition = networkdataPartition;
        this.networkdataNet = networkdataNet;
        this.partitionId = partitionId;
    }


    /**
     * Gets the networkdataPartition value for this NetworkdataInfo.
     * 
     * @return networkdataPartition
     */
    public java.lang.Integer getNetworkdataPartition() {
        return networkdataPartition;
    }


    /**
     * Sets the networkdataPartition value for this NetworkdataInfo.
     * 
     * @param networkdataPartition
     */
    public void setNetworkdataPartition(java.lang.Integer networkdataPartition) {
        this.networkdataPartition = networkdataPartition;
    }


    /**
     * Gets the networkdataNet value for this NetworkdataInfo.
     * 
     * @return networkdataNet
     */
    public java.lang.Integer getNetworkdataNet() {
        return networkdataNet;
    }


    /**
     * Sets the networkdataNet value for this NetworkdataInfo.
     * 
     * @param networkdataNet
     */
    public void setNetworkdataNet(java.lang.Integer networkdataNet) {
        this.networkdataNet = networkdataNet;
    }


    /**
     * Gets the partitionId value for this NetworkdataInfo.
     * 
     * @return partitionId
     */
    public java.lang.String getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this NetworkdataInfo.
     * 
     * @param partitionId
     */
    public void setPartitionId(java.lang.String partitionId) {
        this.partitionId = partitionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkdataInfo)) return false;
        NetworkdataInfo other = (NetworkdataInfo) obj;
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
              this.networkdataNet.equals(other.getNetworkdataNet()))) &&
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId())));
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
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkdataInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NetworkdataInfo"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionId"));
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
