/**
 * SdSipMessageMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SdSipMessageMap  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String serviceId;

    private java.lang.Integer sipScpOperationCode;

    private java.lang.String sipScpMessageId;

    public SdSipMessageMap() {
    }

    public SdSipMessageMap(
           java.lang.String serviceId,
           java.lang.Integer sipScpOperationCode,
           java.lang.String sipScpMessageId) {
        this.serviceId = serviceId;
        this.sipScpOperationCode = sipScpOperationCode;
        this.sipScpMessageId = sipScpMessageId;
    }


    /**
     * Gets the serviceId value for this SdSipMessageMap.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this SdSipMessageMap.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the sipScpOperationCode value for this SdSipMessageMap.
     * 
     * @return sipScpOperationCode
     */
    public java.lang.Integer getSipScpOperationCode() {
        return sipScpOperationCode;
    }


    /**
     * Sets the sipScpOperationCode value for this SdSipMessageMap.
     * 
     * @param sipScpOperationCode
     */
    public void setSipScpOperationCode(java.lang.Integer sipScpOperationCode) {
        this.sipScpOperationCode = sipScpOperationCode;
    }


    /**
     * Gets the sipScpMessageId value for this SdSipMessageMap.
     * 
     * @return sipScpMessageId
     */
    public java.lang.String getSipScpMessageId() {
        return sipScpMessageId;
    }


    /**
     * Sets the sipScpMessageId value for this SdSipMessageMap.
     * 
     * @param sipScpMessageId
     */
    public void setSipScpMessageId(java.lang.String sipScpMessageId) {
        this.sipScpMessageId = sipScpMessageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SdSipMessageMap)) return false;
        SdSipMessageMap other = (SdSipMessageMap) obj;
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
            ((this.sipScpOperationCode==null && other.getSipScpOperationCode()==null) || 
             (this.sipScpOperationCode!=null &&
              this.sipScpOperationCode.equals(other.getSipScpOperationCode()))) &&
            ((this.sipScpMessageId==null && other.getSipScpMessageId()==null) || 
             (this.sipScpMessageId!=null &&
              this.sipScpMessageId.equals(other.getSipScpMessageId())));
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
        if (getSipScpOperationCode() != null) {
            _hashCode += getSipScpOperationCode().hashCode();
        }
        if (getSipScpMessageId() != null) {
            _hashCode += getSipScpMessageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SdSipMessageMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdSipMessageMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipScpOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipScpOperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipScpMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipScpMessageId"));
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
