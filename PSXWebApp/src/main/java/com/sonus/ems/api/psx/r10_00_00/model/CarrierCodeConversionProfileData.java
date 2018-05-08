/**
 * CarrierCodeConversionProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CarrierCodeConversionProfileData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String carrierCodeConvrId;
    private java.lang.String callParameterFilterProfile;
    private java.lang.Integer attributes;
    private java.lang.Integer carrierType;
    private java.lang.String fromCarrierCode;
    private java.lang.String toCarrierCode;

    public CarrierCodeConversionProfileData() {
    }

    public CarrierCodeConversionProfileData(
           java.lang.String carrierCodeConvrId,
           java.lang.String callParameterFilterProfile,
           java.lang.Integer attributes,
           java.lang.Integer carrierType,
           java.lang.String fromCarrierCode,
           java.lang.String toCarrierCode) {
           this.carrierCodeConvrId = carrierCodeConvrId;
           this.callParameterFilterProfile = callParameterFilterProfile;
           this.attributes = attributes;
           this.carrierType = carrierType;
           this.fromCarrierCode = fromCarrierCode;
           this.toCarrierCode = toCarrierCode;
    }


    /**
     * Gets the carrierCodeConvrId value for this CarrierCodeConversionProfileData.
     * 
     * @return carrierCodeConvrId
     */
    public java.lang.String getCarrierCodeConvrId() {
        return carrierCodeConvrId;
    }


    /**
     * Sets the carrierCodeConvrId value for this CarrierCodeConversionProfileData.
     * 
     * @param carrierCodeConvrId
     */
    public void setCarrierCodeConvrId(java.lang.String carrierCodeConvrId) {
        this.carrierCodeConvrId = carrierCodeConvrId;
    }


    /**
     * Gets the callParameterFilterProfile value for this CarrierCodeConversionProfileData.
     * 
     * @return callParameterFilterProfile
     */
    public java.lang.String getCallParameterFilterProfile() {
        return callParameterFilterProfile;
    }


    /**
     * Sets the callParameterFilterProfile value for this CarrierCodeConversionProfileData.
     * 
     * @param callParameterFilterProfile
     */
    public void setCallParameterFilterProfile(java.lang.String callParameterFilterProfile) {
        this.callParameterFilterProfile = callParameterFilterProfile;
    }


    /**
     * Gets the attributes value for this CarrierCodeConversionProfileData.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this CarrierCodeConversionProfileData.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the carrierType value for this CarrierCodeConversionProfileData.
     * 
     * @return carrierType
     */
    public java.lang.Integer getCarrierType() {
        return carrierType;
    }


    /**
     * Sets the carrierType value for this CarrierCodeConversionProfileData.
     * 
     * @param carrierType
     */
    public void setCarrierType(java.lang.Integer carrierType) {
        this.carrierType = carrierType;
    }


    /**
     * Gets the fromCarrierCode value for this CarrierCodeConversionProfileData.
     * 
     * @return fromCarrierCode
     */
    public java.lang.String getFromCarrierCode() {
        return fromCarrierCode;
    }


    /**
     * Sets the fromCarrierCode value for this CarrierCodeConversionProfileData.
     * 
     * @param fromCarrierCode
     */
    public void setFromCarrierCode(java.lang.String fromCarrierCode) {
        this.fromCarrierCode = fromCarrierCode;
    }


    /**
     * Gets the toCarrierCode value for this CarrierCodeConversionProfileData.
     * 
     * @return toCarrierCode
     */
    public java.lang.String getToCarrierCode() {
        return toCarrierCode;
    }


    /**
     * Sets the toCarrierCode value for this CarrierCodeConversionProfileData.
     * 
     * @param toCarrierCode
     */
    public void setToCarrierCode(java.lang.String toCarrierCode) {
        this.toCarrierCode = toCarrierCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarrierCodeConversionProfileData)) return false;
        CarrierCodeConversionProfileData other = (CarrierCodeConversionProfileData) obj;
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
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.carrierType==null && other.getCarrierType()==null) || 
             (this.carrierType!=null &&
              this.carrierType.equals(other.getCarrierType()))) &&
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
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getCarrierType() != null) {
            _hashCode += getCarrierType().hashCode();
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
        new org.apache.axis.description.TypeDesc(CarrierCodeConversionProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierCodeConversionProfileData"));
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
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
