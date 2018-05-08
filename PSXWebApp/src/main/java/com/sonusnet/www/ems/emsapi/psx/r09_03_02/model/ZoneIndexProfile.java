/**
 * ZoneIndexProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ZoneIndexProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String zoneIndexProfileId;

    private java.lang.String description;

    private java.lang.Integer zoneIndex;

    public ZoneIndexProfile() {
    }

    public ZoneIndexProfile(
           java.lang.String zoneIndexProfileId,
           java.lang.String description,
           java.lang.Integer zoneIndex) {
        this.zoneIndexProfileId = zoneIndexProfileId;
        this.description = description;
        this.zoneIndex = zoneIndex;
    }


    /**
     * Gets the zoneIndexProfileId value for this ZoneIndexProfile.
     * 
     * @return zoneIndexProfileId
     */
    public java.lang.String getZoneIndexProfileId() {
        return zoneIndexProfileId;
    }


    /**
     * Sets the zoneIndexProfileId value for this ZoneIndexProfile.
     * 
     * @param zoneIndexProfileId
     */
    public void setZoneIndexProfileId(java.lang.String zoneIndexProfileId) {
        this.zoneIndexProfileId = zoneIndexProfileId;
    }


    /**
     * Gets the description value for this ZoneIndexProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ZoneIndexProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the zoneIndex value for this ZoneIndexProfile.
     * 
     * @return zoneIndex
     */
    public java.lang.Integer getZoneIndex() {
        return zoneIndex;
    }


    /**
     * Sets the zoneIndex value for this ZoneIndexProfile.
     * 
     * @param zoneIndex
     */
    public void setZoneIndex(java.lang.Integer zoneIndex) {
        this.zoneIndex = zoneIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZoneIndexProfile)) return false;
        ZoneIndexProfile other = (ZoneIndexProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.zoneIndexProfileId==null && other.getZoneIndexProfileId()==null) || 
             (this.zoneIndexProfileId!=null &&
              this.zoneIndexProfileId.equals(other.getZoneIndexProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.zoneIndex==null && other.getZoneIndex()==null) || 
             (this.zoneIndex!=null &&
              this.zoneIndex.equals(other.getZoneIndex())));
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
        if (getZoneIndexProfileId() != null) {
            _hashCode += getZoneIndexProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getZoneIndex() != null) {
            _hashCode += getZoneIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZoneIndexProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ZoneIndexProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneIndexProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zoneIndexProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zoneIndex"));
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
