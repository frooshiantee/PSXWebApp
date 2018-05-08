/**
 * ZzProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ZzProfileKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String zzProfileId;
    private java.lang.Integer digitCallType;

    public ZzProfileKey() {
    }

    public ZzProfileKey(
           java.lang.String zzProfileId,
           java.lang.Integer digitCallType) {
           this.zzProfileId = zzProfileId;
           this.digitCallType = digitCallType;
    }


    /**
     * Gets the zzProfileId value for this ZzProfileKey.
     * 
     * @return zzProfileId
     */
    public java.lang.String getZzProfileId() {
        return zzProfileId;
    }


    /**
     * Sets the zzProfileId value for this ZzProfileKey.
     * 
     * @param zzProfileId
     */
    public void setZzProfileId(java.lang.String zzProfileId) {
        this.zzProfileId = zzProfileId;
    }


    /**
     * Gets the digitCallType value for this ZzProfileKey.
     * 
     * @return digitCallType
     */
    public java.lang.Integer getDigitCallType() {
        return digitCallType;
    }


    /**
     * Sets the digitCallType value for this ZzProfileKey.
     * 
     * @param digitCallType
     */
    public void setDigitCallType(java.lang.Integer digitCallType) {
        this.digitCallType = digitCallType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZzProfileKey)) return false;
        ZzProfileKey other = (ZzProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.zzProfileId==null && other.getZzProfileId()==null) || 
             (this.zzProfileId!=null &&
              this.zzProfileId.equals(other.getZzProfileId()))) &&
            ((this.digitCallType==null && other.getDigitCallType()==null) || 
             (this.digitCallType!=null &&
              this.digitCallType.equals(other.getDigitCallType())));
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
        if (getZzProfileId() != null) {
            _hashCode += getZzProfileId().hashCode();
        }
        if (getDigitCallType() != null) {
            _hashCode += getDigitCallType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZzProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ZzProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zzProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zzProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitCallType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digitCallType"));
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
