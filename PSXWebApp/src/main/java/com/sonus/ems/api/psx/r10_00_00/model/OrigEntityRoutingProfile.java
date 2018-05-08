/**
 * OrigEntityRoutingProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class OrigEntityRoutingProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String origEntityRoutingProfileId;
    private java.lang.String description;

    public OrigEntityRoutingProfile() {
    }

    public OrigEntityRoutingProfile(
           java.lang.String origEntityRoutingProfileId,
           java.lang.String description) {
           this.origEntityRoutingProfileId = origEntityRoutingProfileId;
           this.description = description;
    }


    /**
     * Gets the origEntityRoutingProfileId value for this OrigEntityRoutingProfile.
     * 
     * @return origEntityRoutingProfileId
     */
    public java.lang.String getOrigEntityRoutingProfileId() {
        return origEntityRoutingProfileId;
    }


    /**
     * Sets the origEntityRoutingProfileId value for this OrigEntityRoutingProfile.
     * 
     * @param origEntityRoutingProfileId
     */
    public void setOrigEntityRoutingProfileId(java.lang.String origEntityRoutingProfileId) {
        this.origEntityRoutingProfileId = origEntityRoutingProfileId;
    }


    /**
     * Gets the description value for this OrigEntityRoutingProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OrigEntityRoutingProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrigEntityRoutingProfile)) return false;
        OrigEntityRoutingProfile other = (OrigEntityRoutingProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.origEntityRoutingProfileId==null && other.getOrigEntityRoutingProfileId()==null) || 
             (this.origEntityRoutingProfileId!=null &&
              this.origEntityRoutingProfileId.equals(other.getOrigEntityRoutingProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getOrigEntityRoutingProfileId() != null) {
            _hashCode += getOrigEntityRoutingProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrigEntityRoutingProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OrigEntityRoutingProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origEntityRoutingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origEntityRoutingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
