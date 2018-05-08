/**
 * SipScpMappingProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SipScpMappingProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String sipScpMappingProfileId;

    private java.lang.Integer type;

    private java.lang.Integer parameterType;

    private java.lang.String parameterValue;

    public SipScpMappingProfileDataKey() {
    }

    public SipScpMappingProfileDataKey(
           java.lang.String sipScpMappingProfileId,
           java.lang.Integer type,
           java.lang.Integer parameterType,
           java.lang.String parameterValue) {
        this.sipScpMappingProfileId = sipScpMappingProfileId;
        this.type = type;
        this.parameterType = parameterType;
        this.parameterValue = parameterValue;
    }


    /**
     * Gets the sipScpMappingProfileId value for this SipScpMappingProfileDataKey.
     * 
     * @return sipScpMappingProfileId
     */
    public java.lang.String getSipScpMappingProfileId() {
        return sipScpMappingProfileId;
    }


    /**
     * Sets the sipScpMappingProfileId value for this SipScpMappingProfileDataKey.
     * 
     * @param sipScpMappingProfileId
     */
    public void setSipScpMappingProfileId(java.lang.String sipScpMappingProfileId) {
        this.sipScpMappingProfileId = sipScpMappingProfileId;
    }


    /**
     * Gets the type value for this SipScpMappingProfileDataKey.
     * 
     * @return type
     */
    public java.lang.Integer getType() {
        return type;
    }


    /**
     * Sets the type value for this SipScpMappingProfileDataKey.
     * 
     * @param type
     */
    public void setType(java.lang.Integer type) {
        this.type = type;
    }


    /**
     * Gets the parameterType value for this SipScpMappingProfileDataKey.
     * 
     * @return parameterType
     */
    public java.lang.Integer getParameterType() {
        return parameterType;
    }


    /**
     * Sets the parameterType value for this SipScpMappingProfileDataKey.
     * 
     * @param parameterType
     */
    public void setParameterType(java.lang.Integer parameterType) {
        this.parameterType = parameterType;
    }


    /**
     * Gets the parameterValue value for this SipScpMappingProfileDataKey.
     * 
     * @return parameterValue
     */
    public java.lang.String getParameterValue() {
        return parameterValue;
    }


    /**
     * Sets the parameterValue value for this SipScpMappingProfileDataKey.
     * 
     * @param parameterValue
     */
    public void setParameterValue(java.lang.String parameterValue) {
        this.parameterValue = parameterValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipScpMappingProfileDataKey)) return false;
        SipScpMappingProfileDataKey other = (SipScpMappingProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sipScpMappingProfileId==null && other.getSipScpMappingProfileId()==null) || 
             (this.sipScpMappingProfileId!=null &&
              this.sipScpMappingProfileId.equals(other.getSipScpMappingProfileId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.parameterType==null && other.getParameterType()==null) || 
             (this.parameterType!=null &&
              this.parameterType.equals(other.getParameterType()))) &&
            ((this.parameterValue==null && other.getParameterValue()==null) || 
             (this.parameterValue!=null &&
              this.parameterValue.equals(other.getParameterValue())));
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
        if (getSipScpMappingProfileId() != null) {
            _hashCode += getSipScpMappingProfileId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getParameterType() != null) {
            _hashCode += getParameterType().hashCode();
        }
        if (getParameterValue() != null) {
            _hashCode += getParameterValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipScpMappingProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpMappingProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipScpMappingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipScpMappingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterValue"));
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
