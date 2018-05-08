/**
 * HsxPartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxPartition  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String partitionId;
    private java.lang.String primaryHssId;

    public HsxPartition() {
    }

    public HsxPartition(
           java.lang.String partitionId,
           java.lang.String primaryHssId) {
           this.partitionId = partitionId;
           this.primaryHssId = primaryHssId;
    }


    /**
     * Gets the partitionId value for this HsxPartition.
     * 
     * @return partitionId
     */
    public java.lang.String getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this HsxPartition.
     * 
     * @param partitionId
     */
    public void setPartitionId(java.lang.String partitionId) {
        this.partitionId = partitionId;
    }


    /**
     * Gets the primaryHssId value for this HsxPartition.
     * 
     * @return primaryHssId
     */
    public java.lang.String getPrimaryHssId() {
        return primaryHssId;
    }


    /**
     * Sets the primaryHssId value for this HsxPartition.
     * 
     * @param primaryHssId
     */
    public void setPrimaryHssId(java.lang.String primaryHssId) {
        this.primaryHssId = primaryHssId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxPartition)) return false;
        HsxPartition other = (HsxPartition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId()))) &&
            ((this.primaryHssId==null && other.getPrimaryHssId()==null) || 
             (this.primaryHssId!=null &&
              this.primaryHssId.equals(other.getPrimaryHssId())));
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
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        if (getPrimaryHssId() != null) {
            _hashCode += getPrimaryHssId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxPartition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPartition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryHssId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryHssId"));
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
