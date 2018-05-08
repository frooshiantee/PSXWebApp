/**
 * SdMobileMessageMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SdMobileMessageMap  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String serviceId;
    private java.lang.Integer mobileOperationCode;
    private java.lang.String mobileMessageId;

    public SdMobileMessageMap() {
    }

    public SdMobileMessageMap(
           java.lang.String serviceId,
           java.lang.Integer mobileOperationCode,
           java.lang.String mobileMessageId) {
           this.serviceId = serviceId;
           this.mobileOperationCode = mobileOperationCode;
           this.mobileMessageId = mobileMessageId;
    }


    /**
     * Gets the serviceId value for this SdMobileMessageMap.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this SdMobileMessageMap.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the mobileOperationCode value for this SdMobileMessageMap.
     * 
     * @return mobileOperationCode
     */
    public java.lang.Integer getMobileOperationCode() {
        return mobileOperationCode;
    }


    /**
     * Sets the mobileOperationCode value for this SdMobileMessageMap.
     * 
     * @param mobileOperationCode
     */
    public void setMobileOperationCode(java.lang.Integer mobileOperationCode) {
        this.mobileOperationCode = mobileOperationCode;
    }


    /**
     * Gets the mobileMessageId value for this SdMobileMessageMap.
     * 
     * @return mobileMessageId
     */
    public java.lang.String getMobileMessageId() {
        return mobileMessageId;
    }


    /**
     * Sets the mobileMessageId value for this SdMobileMessageMap.
     * 
     * @param mobileMessageId
     */
    public void setMobileMessageId(java.lang.String mobileMessageId) {
        this.mobileMessageId = mobileMessageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SdMobileMessageMap)) return false;
        SdMobileMessageMap other = (SdMobileMessageMap) obj;
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
            ((this.mobileOperationCode==null && other.getMobileOperationCode()==null) || 
             (this.mobileOperationCode!=null &&
              this.mobileOperationCode.equals(other.getMobileOperationCode()))) &&
            ((this.mobileMessageId==null && other.getMobileMessageId()==null) || 
             (this.mobileMessageId!=null &&
              this.mobileMessageId.equals(other.getMobileMessageId())));
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
        if (getMobileOperationCode() != null) {
            _hashCode += getMobileOperationCode().hashCode();
        }
        if (getMobileMessageId() != null) {
            _hashCode += getMobileMessageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SdMobileMessageMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdMobileMessageMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileOperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileMessageId"));
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
