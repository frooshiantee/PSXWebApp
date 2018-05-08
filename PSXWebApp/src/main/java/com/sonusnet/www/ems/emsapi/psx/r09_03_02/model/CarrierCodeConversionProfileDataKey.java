/**
 * CarrierCodeConversionProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CarrierCodeConversionProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String carrierCodeConvrId;

    private java.lang.String callParameterFilterProfile;

    private java.lang.String fromCarrierCode;

    private java.lang.String toCarrierCode;

    public CarrierCodeConversionProfileDataKey() {
    }

    public CarrierCodeConversionProfileDataKey(
           java.lang.String carrierCodeConvrId,
           java.lang.String callParameterFilterProfile,
           java.lang.String fromCarrierCode,
           java.lang.String toCarrierCode) {
        this.carrierCodeConvrId = carrierCodeConvrId;
        this.callParameterFilterProfile = callParameterFilterProfile;
        this.fromCarrierCode = fromCarrierCode;
        this.toCarrierCode = toCarrierCode;
    }


    /**
     * Gets the carrierCodeConvrId value for this CarrierCodeConversionProfileDataKey.
     * 
     * @return carrierCodeConvrId
     */
    public java.lang.String getCarrierCodeConvrId() {
        return carrierCodeConvrId;
    }


    /**
     * Sets the carrierCodeConvrId value for this CarrierCodeConversionProfileDataKey.
     * 
     * @param carrierCodeConvrId
     */
    public void setCarrierCodeConvrId(java.lang.String carrierCodeConvrId) {
        this.carrierCodeConvrId = carrierCodeConvrId;
    }


    /**
     * Gets the callParameterFilterProfile value for this CarrierCodeConversionProfileDataKey.
     * 
     * @return callParameterFilterProfile
     */
    public java.lang.String getCallParameterFilterProfile() {
        return callParameterFilterProfile;
    }


    /**
     * Sets the callParameterFilterProfile value for this CarrierCodeConversionProfileDataKey.
     * 
     * @param callParameterFilterProfile
     */
    public void setCallParameterFilterProfile(java.lang.String callParameterFilterProfile) {
        this.callParameterFilterProfile = callParameterFilterProfile;
    }


    /**
     * Gets the fromCarrierCode value for this CarrierCodeConversionProfileDataKey.
     * 
     * @return fromCarrierCode
     */
    public java.lang.String getFromCarrierCode() {
        return fromCarrierCode;
    }


    /**
     * Sets the fromCarrierCode value for this CarrierCodeConversionProfileDataKey.
     * 
     * @param fromCarrierCode
     */
    public void setFromCarrierCode(java.lang.String fromCarrierCode) {
        this.fromCarrierCode = fromCarrierCode;
    }


    /**
     * Gets the toCarrierCode value for this CarrierCodeConversionProfileDataKey.
     * 
     * @return toCarrierCode
     */
    public java.lang.String getToCarrierCode() {
        return toCarrierCode;
    }


    /**
     * Sets the toCarrierCode value for this CarrierCodeConversionProfileDataKey.
     * 
     * @param toCarrierCode
     */
    public void setToCarrierCode(java.lang.String toCarrierCode) {
        this.toCarrierCode = toCarrierCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarrierCodeConversionProfileDataKey)) return false;
        CarrierCodeConversionProfileDataKey other = (CarrierCodeConversionProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.carrierCodeConvrId==null && other.getCarrierCodeConvrId()==null) || 
             (this.carrierCodeConvrId!=null &&
              this.carrierCodeConvrId.equals(other.getCarrierCodeConvrId()))) &&
            ((this.callParameterFilterProfile==null && other.getCallParameterFilterProfile()==null) || 
             (this.callParameterFilterProfile!=null &&
              this.callParameterFilterProfile.equals(other.getCallParameterFilterProfile()))) &&
            ((this.fromCarrierCode==null && other.getFromCarrierCode()==null) || 
             (this.fromCarrierCode!=null &&
              this.fromCarrierCode.equals(other.getFromCarrierCode()))) &&
            ((this.toCarrierCode==null && other.getToCarrierCode()==null) || 
             (this.toCarrierCode!=null &&
              this.toCarrierCode.equals(other.getToCarrierCode())));
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
        if (getCarrierCodeConvrId() != null) {
            _hashCode += getCarrierCodeConvrId().hashCode();
        }
        if (getCallParameterFilterProfile() != null) {
            _hashCode += getCallParameterFilterProfile().hashCode();
        }
        if (getFromCarrierCode() != null) {
            _hashCode += getFromCarrierCode().hashCode();
        }
        if (getToCarrierCode() != null) {
            _hashCode += getToCarrierCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarrierCodeConversionProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierCodeConversionProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCodeConvrId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCodeConvrId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParameterFilterProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParameterFilterProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCarrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromCarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCarrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toCarrierCode"));
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
