/**
 * NumberAnalysisProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class NumberAnalysisProfileDataKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String numberAnalysisProfileId;
    private java.lang.Short numberType;

    public NumberAnalysisProfileDataKey() {
    }

    public NumberAnalysisProfileDataKey(
           java.lang.String numberAnalysisProfileId,
           java.lang.Short numberType) {
           this.numberAnalysisProfileId = numberAnalysisProfileId;
           this.numberType = numberType;
    }


    /**
     * Gets the numberAnalysisProfileId value for this NumberAnalysisProfileDataKey.
     * 
     * @return numberAnalysisProfileId
     */
    public java.lang.String getNumberAnalysisProfileId() {
        return numberAnalysisProfileId;
    }


    /**
     * Sets the numberAnalysisProfileId value for this NumberAnalysisProfileDataKey.
     * 
     * @param numberAnalysisProfileId
     */
    public void setNumberAnalysisProfileId(java.lang.String numberAnalysisProfileId) {
        this.numberAnalysisProfileId = numberAnalysisProfileId;
    }


    /**
     * Gets the numberType value for this NumberAnalysisProfileDataKey.
     * 
     * @return numberType
     */
    public java.lang.Short getNumberType() {
        return numberType;
    }


    /**
     * Sets the numberType value for this NumberAnalysisProfileDataKey.
     * 
     * @param numberType
     */
    public void setNumberType(java.lang.Short numberType) {
        this.numberType = numberType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumberAnalysisProfileDataKey)) return false;
        NumberAnalysisProfileDataKey other = (NumberAnalysisProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numberAnalysisProfileId==null && other.getNumberAnalysisProfileId()==null) || 
             (this.numberAnalysisProfileId!=null &&
              this.numberAnalysisProfileId.equals(other.getNumberAnalysisProfileId()))) &&
            ((this.numberType==null && other.getNumberType()==null) || 
             (this.numberType!=null &&
              this.numberType.equals(other.getNumberType())));
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
        if (getNumberAnalysisProfileId() != null) {
            _hashCode += getNumberAnalysisProfileId().hashCode();
        }
        if (getNumberType() != null) {
            _hashCode += getNumberType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumberAnalysisProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberAnalysisProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberAnalysisProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberAnalysisProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberType"));
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
