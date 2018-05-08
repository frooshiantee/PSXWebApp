/**
 * SdAinMessageMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SdAinMessageMap  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String serviceId;
    private java.lang.Integer scpOperationCode;
    private java.lang.String scpAinMessageId;

    public SdAinMessageMap() {
    }

    public SdAinMessageMap(
           java.lang.String serviceId,
           java.lang.Integer scpOperationCode,
           java.lang.String scpAinMessageId) {
           this.serviceId = serviceId;
           this.scpOperationCode = scpOperationCode;
           this.scpAinMessageId = scpAinMessageId;
    }


    /**
     * Gets the serviceId value for this SdAinMessageMap.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this SdAinMessageMap.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the scpOperationCode value for this SdAinMessageMap.
     * 
     * @return scpOperationCode
     */
    public java.lang.Integer getScpOperationCode() {
        return scpOperationCode;
    }


    /**
     * Sets the scpOperationCode value for this SdAinMessageMap.
     * 
     * @param scpOperationCode
     */
    public void setScpOperationCode(java.lang.Integer scpOperationCode) {
        this.scpOperationCode = scpOperationCode;
    }


    /**
     * Gets the scpAinMessageId value for this SdAinMessageMap.
     * 
     * @return scpAinMessageId
     */
    public java.lang.String getScpAinMessageId() {
        return scpAinMessageId;
    }


    /**
     * Sets the scpAinMessageId value for this SdAinMessageMap.
     * 
     * @param scpAinMessageId
     */
    public void setScpAinMessageId(java.lang.String scpAinMessageId) {
        this.scpAinMessageId = scpAinMessageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SdAinMessageMap)) return false;
        SdAinMessageMap other = (SdAinMessageMap) obj;
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
            ((this.scpOperationCode==null && other.getScpOperationCode()==null) || 
             (this.scpOperationCode!=null &&
              this.scpOperationCode.equals(other.getScpOperationCode()))) &&
            ((this.scpAinMessageId==null && other.getScpAinMessageId()==null) || 
             (this.scpAinMessageId!=null &&
              this.scpAinMessageId.equals(other.getScpAinMessageId())));
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
        if (getScpOperationCode() != null) {
            _hashCode += getScpOperationCode().hashCode();
        }
        if (getScpAinMessageId() != null) {
            _hashCode += getScpAinMessageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SdAinMessageMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdAinMessageMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpOperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpAinMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpAinMessageId"));
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
