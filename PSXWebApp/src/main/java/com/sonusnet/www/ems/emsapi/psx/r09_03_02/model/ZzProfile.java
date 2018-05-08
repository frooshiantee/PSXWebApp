/**
 * ZzProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ZzProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String zzProfileId;

    private java.lang.Integer digitCallType;

    private java.lang.Short circuitCode;

    private java.lang.String zzCode;

    public ZzProfile() {
    }

    public ZzProfile(
           java.lang.String zzProfileId,
           java.lang.Integer digitCallType,
           java.lang.Short circuitCode,
           java.lang.String zzCode) {
        this.zzProfileId = zzProfileId;
        this.digitCallType = digitCallType;
        this.circuitCode = circuitCode;
        this.zzCode = zzCode;
    }


    /**
     * Gets the zzProfileId value for this ZzProfile.
     * 
     * @return zzProfileId
     */
    public java.lang.String getZzProfileId() {
        return zzProfileId;
    }


    /**
     * Sets the zzProfileId value for this ZzProfile.
     * 
     * @param zzProfileId
     */
    public void setZzProfileId(java.lang.String zzProfileId) {
        this.zzProfileId = zzProfileId;
    }


    /**
     * Gets the digitCallType value for this ZzProfile.
     * 
     * @return digitCallType
     */
    public java.lang.Integer getDigitCallType() {
        return digitCallType;
    }


    /**
     * Sets the digitCallType value for this ZzProfile.
     * 
     * @param digitCallType
     */
    public void setDigitCallType(java.lang.Integer digitCallType) {
        this.digitCallType = digitCallType;
    }


    /**
     * Gets the circuitCode value for this ZzProfile.
     * 
     * @return circuitCode
     */
    public java.lang.Short getCircuitCode() {
        return circuitCode;
    }


    /**
     * Sets the circuitCode value for this ZzProfile.
     * 
     * @param circuitCode
     */
    public void setCircuitCode(java.lang.Short circuitCode) {
        this.circuitCode = circuitCode;
    }


    /**
     * Gets the zzCode value for this ZzProfile.
     * 
     * @return zzCode
     */
    public java.lang.String getZzCode() {
        return zzCode;
    }


    /**
     * Sets the zzCode value for this ZzProfile.
     * 
     * @param zzCode
     */
    public void setZzCode(java.lang.String zzCode) {
        this.zzCode = zzCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZzProfile)) return false;
        ZzProfile other = (ZzProfile) obj;
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
              this.digitCallType.equals(other.getDigitCallType()))) &&
            ((this.circuitCode==null && other.getCircuitCode()==null) || 
             (this.circuitCode!=null &&
              this.circuitCode.equals(other.getCircuitCode()))) &&
            ((this.zzCode==null && other.getZzCode()==null) || 
             (this.zzCode!=null &&
              this.zzCode.equals(other.getZzCode())));
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
        if (getCircuitCode() != null) {
            _hashCode += getCircuitCode().hashCode();
        }
        if (getZzCode() != null) {
            _hashCode += getZzCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZzProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ZzProfile"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circuitCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "circuitCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zzCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zzCode"));
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
