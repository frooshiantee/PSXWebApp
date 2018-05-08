/**
 * SdEnumMessageMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SdEnumMessageMap  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String serviceId;

    private java.lang.Integer enumOperationCode;

    private java.lang.String enumMessageId;

    public SdEnumMessageMap() {
    }

    public SdEnumMessageMap(
           java.lang.String serviceId,
           java.lang.Integer enumOperationCode,
           java.lang.String enumMessageId) {
        this.serviceId = serviceId;
        this.enumOperationCode = enumOperationCode;
        this.enumMessageId = enumMessageId;
    }


    /**
     * Gets the serviceId value for this SdEnumMessageMap.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this SdEnumMessageMap.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the enumOperationCode value for this SdEnumMessageMap.
     * 
     * @return enumOperationCode
     */
    public java.lang.Integer getEnumOperationCode() {
        return enumOperationCode;
    }


    /**
     * Sets the enumOperationCode value for this SdEnumMessageMap.
     * 
     * @param enumOperationCode
     */
    public void setEnumOperationCode(java.lang.Integer enumOperationCode) {
        this.enumOperationCode = enumOperationCode;
    }


    /**
     * Gets the enumMessageId value for this SdEnumMessageMap.
     * 
     * @return enumMessageId
     */
    public java.lang.String getEnumMessageId() {
        return enumMessageId;
    }


    /**
     * Sets the enumMessageId value for this SdEnumMessageMap.
     * 
     * @param enumMessageId
     */
    public void setEnumMessageId(java.lang.String enumMessageId) {
        this.enumMessageId = enumMessageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SdEnumMessageMap)) return false;
        SdEnumMessageMap other = (SdEnumMessageMap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.enumOperationCode==null && other.getEnumOperationCode()==null) || 
             (this.enumOperationCode!=null &&
              this.enumOperationCode.equals(other.getEnumOperationCode()))) &&
            ((this.enumMessageId==null && other.getEnumMessageId()==null) || 
             (this.enumMessageId!=null &&
              this.enumMessageId.equals(other.getEnumMessageId())));
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
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getEnumOperationCode() != null) {
            _hashCode += getEnumOperationCode().hashCode();
        }
        if (getEnumMessageId() != null) {
            _hashCode += getEnumMessageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SdEnumMessageMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdEnumMessageMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumOperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumMessageId"));
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
