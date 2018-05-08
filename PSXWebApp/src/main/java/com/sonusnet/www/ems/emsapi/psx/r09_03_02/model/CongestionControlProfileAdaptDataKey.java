/**
 * CongestionControlProfileAdaptDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CongestionControlProfileAdaptDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String congestionControlProfileId;

    private java.lang.Integer adaptCongestionLevel;

    public CongestionControlProfileAdaptDataKey() {
    }

    public CongestionControlProfileAdaptDataKey(
           java.lang.String congestionControlProfileId,
           java.lang.Integer adaptCongestionLevel) {
        this.congestionControlProfileId = congestionControlProfileId;
        this.adaptCongestionLevel = adaptCongestionLevel;
    }


    /**
     * Gets the congestionControlProfileId value for this CongestionControlProfileAdaptDataKey.
     * 
     * @return congestionControlProfileId
     */
    public java.lang.String getCongestionControlProfileId() {
        return congestionControlProfileId;
    }


    /**
     * Sets the congestionControlProfileId value for this CongestionControlProfileAdaptDataKey.
     * 
     * @param congestionControlProfileId
     */
    public void setCongestionControlProfileId(java.lang.String congestionControlProfileId) {
        this.congestionControlProfileId = congestionControlProfileId;
    }


    /**
     * Gets the adaptCongestionLevel value for this CongestionControlProfileAdaptDataKey.
     * 
     * @return adaptCongestionLevel
     */
    public java.lang.Integer getAdaptCongestionLevel() {
        return adaptCongestionLevel;
    }


    /**
     * Sets the adaptCongestionLevel value for this CongestionControlProfileAdaptDataKey.
     * 
     * @param adaptCongestionLevel
     */
    public void setAdaptCongestionLevel(java.lang.Integer adaptCongestionLevel) {
        this.adaptCongestionLevel = adaptCongestionLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CongestionControlProfileAdaptDataKey)) return false;
        CongestionControlProfileAdaptDataKey other = (CongestionControlProfileAdaptDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.congestionControlProfileId==null && other.getCongestionControlProfileId()==null) || 
             (this.congestionControlProfileId!=null &&
              this.congestionControlProfileId.equals(other.getCongestionControlProfileId()))) &&
            ((this.adaptCongestionLevel==null && other.getAdaptCongestionLevel()==null) || 
             (this.adaptCongestionLevel!=null &&
              this.adaptCongestionLevel.equals(other.getAdaptCongestionLevel())));
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
        if (getCongestionControlProfileId() != null) {
            _hashCode += getCongestionControlProfileId().hashCode();
        }
        if (getAdaptCongestionLevel() != null) {
            _hashCode += getAdaptCongestionLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CongestionControlProfileAdaptDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CongestionControlProfileAdaptDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("congestionControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "congestionControlProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adaptCongestionLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adaptCongestionLevel"));
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
