/**
 * CpcMappingProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CpcMappingProfileKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String cpcMappingProfileId;
    private java.lang.Short mappingType;

    public CpcMappingProfileKey() {
    }

    public CpcMappingProfileKey(
           java.lang.String cpcMappingProfileId,
           java.lang.Short mappingType) {
           this.cpcMappingProfileId = cpcMappingProfileId;
           this.mappingType = mappingType;
    }


    /**
     * Gets the cpcMappingProfileId value for this CpcMappingProfileKey.
     * 
     * @return cpcMappingProfileId
     */
    public java.lang.String getCpcMappingProfileId() {
        return cpcMappingProfileId;
    }


    /**
     * Sets the cpcMappingProfileId value for this CpcMappingProfileKey.
     * 
     * @param cpcMappingProfileId
     */
    public void setCpcMappingProfileId(java.lang.String cpcMappingProfileId) {
        this.cpcMappingProfileId = cpcMappingProfileId;
    }


    /**
     * Gets the mappingType value for this CpcMappingProfileKey.
     * 
     * @return mappingType
     */
    public java.lang.Short getMappingType() {
        return mappingType;
    }


    /**
     * Sets the mappingType value for this CpcMappingProfileKey.
     * 
     * @param mappingType
     */
    public void setMappingType(java.lang.Short mappingType) {
        this.mappingType = mappingType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpcMappingProfileKey)) return false;
        CpcMappingProfileKey other = (CpcMappingProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cpcMappingProfileId==null && other.getCpcMappingProfileId()==null) || 
             (this.cpcMappingProfileId!=null &&
              this.cpcMappingProfileId.equals(other.getCpcMappingProfileId()))) &&
            ((this.mappingType==null && other.getMappingType()==null) || 
             (this.mappingType!=null &&
              this.mappingType.equals(other.getMappingType())));
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
        if (getCpcMappingProfileId() != null) {
            _hashCode += getCpcMappingProfileId().hashCode();
        }
        if (getMappingType() != null) {
            _hashCode += getMappingType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpcMappingProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcMappingProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpcMappingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpcMappingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mappingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
