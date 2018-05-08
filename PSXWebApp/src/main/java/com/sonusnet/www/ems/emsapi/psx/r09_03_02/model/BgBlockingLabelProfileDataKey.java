/**
 * BgBlockingLabelProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class BgBlockingLabelProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String blockingProfileId;

    private java.lang.String businessGroupId;

    private java.lang.String businessUnitId;

    private java.lang.String vpnSubscriberId;

    public BgBlockingLabelProfileDataKey() {
    }

    public BgBlockingLabelProfileDataKey(
           java.lang.String blockingProfileId,
           java.lang.String businessGroupId,
           java.lang.String businessUnitId,
           java.lang.String vpnSubscriberId) {
        this.blockingProfileId = blockingProfileId;
        this.businessGroupId = businessGroupId;
        this.businessUnitId = businessUnitId;
        this.vpnSubscriberId = vpnSubscriberId;
    }


    /**
     * Gets the blockingProfileId value for this BgBlockingLabelProfileDataKey.
     * 
     * @return blockingProfileId
     */
    public java.lang.String getBlockingProfileId() {
        return blockingProfileId;
    }


    /**
     * Sets the blockingProfileId value for this BgBlockingLabelProfileDataKey.
     * 
     * @param blockingProfileId
     */
    public void setBlockingProfileId(java.lang.String blockingProfileId) {
        this.blockingProfileId = blockingProfileId;
    }


    /**
     * Gets the businessGroupId value for this BgBlockingLabelProfileDataKey.
     * 
     * @return businessGroupId
     */
    public java.lang.String getBusinessGroupId() {
        return businessGroupId;
    }


    /**
     * Sets the businessGroupId value for this BgBlockingLabelProfileDataKey.
     * 
     * @param businessGroupId
     */
    public void setBusinessGroupId(java.lang.String businessGroupId) {
        this.businessGroupId = businessGroupId;
    }


    /**
     * Gets the businessUnitId value for this BgBlockingLabelProfileDataKey.
     * 
     * @return businessUnitId
     */
    public java.lang.String getBusinessUnitId() {
        return businessUnitId;
    }


    /**
     * Sets the businessUnitId value for this BgBlockingLabelProfileDataKey.
     * 
     * @param businessUnitId
     */
    public void setBusinessUnitId(java.lang.String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }


    /**
     * Gets the vpnSubscriberId value for this BgBlockingLabelProfileDataKey.
     * 
     * @return vpnSubscriberId
     */
    public java.lang.String getVpnSubscriberId() {
        return vpnSubscriberId;
    }


    /**
     * Sets the vpnSubscriberId value for this BgBlockingLabelProfileDataKey.
     * 
     * @param vpnSubscriberId
     */
    public void setVpnSubscriberId(java.lang.String vpnSubscriberId) {
        this.vpnSubscriberId = vpnSubscriberId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BgBlockingLabelProfileDataKey)) return false;
        BgBlockingLabelProfileDataKey other = (BgBlockingLabelProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.blockingProfileId==null && other.getBlockingProfileId()==null) || 
             (this.blockingProfileId!=null &&
              this.blockingProfileId.equals(other.getBlockingProfileId()))) &&
            ((this.businessGroupId==null && other.getBusinessGroupId()==null) || 
             (this.businessGroupId!=null &&
              this.businessGroupId.equals(other.getBusinessGroupId()))) &&
            ((this.businessUnitId==null && other.getBusinessUnitId()==null) || 
             (this.businessUnitId!=null &&
              this.businessUnitId.equals(other.getBusinessUnitId()))) &&
            ((this.vpnSubscriberId==null && other.getVpnSubscriberId()==null) || 
             (this.vpnSubscriberId!=null &&
              this.vpnSubscriberId.equals(other.getVpnSubscriberId())));
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
        if (getBlockingProfileId() != null) {
            _hashCode += getBlockingProfileId().hashCode();
        }
        if (getBusinessGroupId() != null) {
            _hashCode += getBusinessGroupId().hashCode();
        }
        if (getBusinessUnitId() != null) {
            _hashCode += getBusinessUnitId().hashCode();
        }
        if (getVpnSubscriberId() != null) {
            _hashCode += getVpnSubscriberId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BgBlockingLabelProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BgBlockingLabelProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vpnSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vpnSubscriberId"));
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
