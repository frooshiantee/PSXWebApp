/**
 * CongestionControlProfileAdaptData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CongestionControlProfileAdaptData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String congestionControlProfileId;
    private java.lang.Integer adaptCongestionLevel;
    private java.lang.Integer adaptHighWaterMark;
    private java.lang.Integer adaptLowWaterMark;

    public CongestionControlProfileAdaptData() {
    }

    public CongestionControlProfileAdaptData(
           java.lang.String congestionControlProfileId,
           java.lang.Integer adaptCongestionLevel,
           java.lang.Integer adaptHighWaterMark,
           java.lang.Integer adaptLowWaterMark) {
           this.congestionControlProfileId = congestionControlProfileId;
           this.adaptCongestionLevel = adaptCongestionLevel;
           this.adaptHighWaterMark = adaptHighWaterMark;
           this.adaptLowWaterMark = adaptLowWaterMark;
    }


    /**
     * Gets the congestionControlProfileId value for this CongestionControlProfileAdaptData.
     * 
     * @return congestionControlProfileId
     */
    public java.lang.String getCongestionControlProfileId() {
        return congestionControlProfileId;
    }


    /**
     * Sets the congestionControlProfileId value for this CongestionControlProfileAdaptData.
     * 
     * @param congestionControlProfileId
     */
    public void setCongestionControlProfileId(java.lang.String congestionControlProfileId) {
        this.congestionControlProfileId = congestionControlProfileId;
    }


    /**
     * Gets the adaptCongestionLevel value for this CongestionControlProfileAdaptData.
     * 
     * @return adaptCongestionLevel
     */
    public java.lang.Integer getAdaptCongestionLevel() {
        return adaptCongestionLevel;
    }


    /**
     * Sets the adaptCongestionLevel value for this CongestionControlProfileAdaptData.
     * 
     * @param adaptCongestionLevel
     */
    public void setAdaptCongestionLevel(java.lang.Integer adaptCongestionLevel) {
        this.adaptCongestionLevel = adaptCongestionLevel;
    }


    /**
     * Gets the adaptHighWaterMark value for this CongestionControlProfileAdaptData.
     * 
     * @return adaptHighWaterMark
     */
    public java.lang.Integer getAdaptHighWaterMark() {
        return adaptHighWaterMark;
    }


    /**
     * Sets the adaptHighWaterMark value for this CongestionControlProfileAdaptData.
     * 
     * @param adaptHighWaterMark
     */
    public void setAdaptHighWaterMark(java.lang.Integer adaptHighWaterMark) {
        this.adaptHighWaterMark = adaptHighWaterMark;
    }


    /**
     * Gets the adaptLowWaterMark value for this CongestionControlProfileAdaptData.
     * 
     * @return adaptLowWaterMark
     */
    public java.lang.Integer getAdaptLowWaterMark() {
        return adaptLowWaterMark;
    }


    /**
     * Sets the adaptLowWaterMark value for this CongestionControlProfileAdaptData.
     * 
     * @param adaptLowWaterMark
     */
    public void setAdaptLowWaterMark(java.lang.Integer adaptLowWaterMark) {
        this.adaptLowWaterMark = adaptLowWaterMark;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CongestionControlProfileAdaptData)) return false;
        CongestionControlProfileAdaptData other = (CongestionControlProfileAdaptData) obj;
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
              this.adaptCongestionLevel.equals(other.getAdaptCongestionLevel()))) &&
            ((this.adaptHighWaterMark==null && other.getAdaptHighWaterMark()==null) || 
             (this.adaptHighWaterMark!=null &&
              this.adaptHighWaterMark.equals(other.getAdaptHighWaterMark()))) &&
            ((this.adaptLowWaterMark==null && other.getAdaptLowWaterMark()==null) || 
             (this.adaptLowWaterMark!=null &&
              this.adaptLowWaterMark.equals(other.getAdaptLowWaterMark())));
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
        if (getAdaptHighWaterMark() != null) {
            _hashCode += getAdaptHighWaterMark().hashCode();
        }
        if (getAdaptLowWaterMark() != null) {
            _hashCode += getAdaptLowWaterMark().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CongestionControlProfileAdaptData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CongestionControlProfileAdaptData"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adaptHighWaterMark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adaptHighWaterMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adaptLowWaterMark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adaptLowWaterMark"));
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
