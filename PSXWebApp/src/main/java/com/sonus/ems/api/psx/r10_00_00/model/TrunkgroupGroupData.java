/**
 * TrunkgroupGroupData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class TrunkgroupGroupData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String trunkgroupGroupId;
    private java.lang.String trunkgroupId;
    private java.lang.String gatewayId;

    public TrunkgroupGroupData() {
    }

    public TrunkgroupGroupData(
           java.lang.String trunkgroupGroupId,
           java.lang.String trunkgroupId,
           java.lang.String gatewayId) {
           this.trunkgroupGroupId = trunkgroupGroupId;
           this.trunkgroupId = trunkgroupId;
           this.gatewayId = gatewayId;
    }


    /**
     * Gets the trunkgroupGroupId value for this TrunkgroupGroupData.
     * 
     * @return trunkgroupGroupId
     */
    public java.lang.String getTrunkgroupGroupId() {
        return trunkgroupGroupId;
    }


    /**
     * Sets the trunkgroupGroupId value for this TrunkgroupGroupData.
     * 
     * @param trunkgroupGroupId
     */
    public void setTrunkgroupGroupId(java.lang.String trunkgroupGroupId) {
        this.trunkgroupGroupId = trunkgroupGroupId;
    }


    /**
     * Gets the trunkgroupId value for this TrunkgroupGroupData.
     * 
     * @return trunkgroupId
     */
    public java.lang.String getTrunkgroupId() {
        return trunkgroupId;
    }


    /**
     * Sets the trunkgroupId value for this TrunkgroupGroupData.
     * 
     * @param trunkgroupId
     */
    public void setTrunkgroupId(java.lang.String trunkgroupId) {
        this.trunkgroupId = trunkgroupId;
    }


    /**
     * Gets the gatewayId value for this TrunkgroupGroupData.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this TrunkgroupGroupData.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrunkgroupGroupData)) return false;
        TrunkgroupGroupData other = (TrunkgroupGroupData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.trunkgroupGroupId==null && other.getTrunkgroupGroupId()==null) || 
             (this.trunkgroupGroupId!=null &&
              this.trunkgroupGroupId.equals(other.getTrunkgroupGroupId()))) &&
            ((this.trunkgroupId==null && other.getTrunkgroupId()==null) || 
             (this.trunkgroupId!=null &&
              this.trunkgroupId.equals(other.getTrunkgroupId()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId())));
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
        if (getTrunkgroupGroupId() != null) {
            _hashCode += getTrunkgroupGroupId().hashCode();
        }
        if (getTrunkgroupId() != null) {
            _hashCode += getTrunkgroupId().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrunkgroupGroupData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupGroupData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
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
