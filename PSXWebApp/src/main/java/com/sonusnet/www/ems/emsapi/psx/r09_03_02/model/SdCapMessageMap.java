/**
 * SdCapMessageMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SdCapMessageMap  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String serviceId;

    private java.lang.Integer capOperationCode;

    private java.lang.String capMessageId;

    public SdCapMessageMap() {
    }

    public SdCapMessageMap(
           java.lang.String serviceId,
           java.lang.Integer capOperationCode,
           java.lang.String capMessageId) {
        this.serviceId = serviceId;
        this.capOperationCode = capOperationCode;
        this.capMessageId = capMessageId;
    }


    /**
     * Gets the serviceId value for this SdCapMessageMap.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this SdCapMessageMap.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the capOperationCode value for this SdCapMessageMap.
     * 
     * @return capOperationCode
     */
    public java.lang.Integer getCapOperationCode() {
        return capOperationCode;
    }


    /**
     * Sets the capOperationCode value for this SdCapMessageMap.
     * 
     * @param capOperationCode
     */
    public void setCapOperationCode(java.lang.Integer capOperationCode) {
        this.capOperationCode = capOperationCode;
    }


    /**
     * Gets the capMessageId value for this SdCapMessageMap.
     * 
     * @return capMessageId
     */
    public java.lang.String getCapMessageId() {
        return capMessageId;
    }


    /**
     * Sets the capMessageId value for this SdCapMessageMap.
     * 
     * @param capMessageId
     */
    public void setCapMessageId(java.lang.String capMessageId) {
        this.capMessageId = capMessageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SdCapMessageMap)) return false;
        SdCapMessageMap other = (SdCapMessageMap) obj;
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
            ((this.capOperationCode==null && other.getCapOperationCode()==null) || 
             (this.capOperationCode!=null &&
              this.capOperationCode.equals(other.getCapOperationCode()))) &&
            ((this.capMessageId==null && other.getCapMessageId()==null) || 
             (this.capMessageId!=null &&
              this.capMessageId.equals(other.getCapMessageId())));
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
        if (getCapOperationCode() != null) {
            _hashCode += getCapOperationCode().hashCode();
        }
        if (getCapMessageId() != null) {
            _hashCode += getCapMessageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SdCapMessageMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdCapMessageMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capOperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capMessageId"));
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
