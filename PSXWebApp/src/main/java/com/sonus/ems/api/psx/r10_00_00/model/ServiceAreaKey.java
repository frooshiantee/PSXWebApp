/**
 * ServiceAreaKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ServiceAreaKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String serviceAreaId;
    private java.lang.String countryId;
    private java.lang.String serviceAreaCode;

    public ServiceAreaKey() {
    }

    public ServiceAreaKey(
           java.lang.String serviceAreaId,
           java.lang.String countryId,
           java.lang.String serviceAreaCode) {
           this.serviceAreaId = serviceAreaId;
           this.countryId = countryId;
           this.serviceAreaCode = serviceAreaCode;
    }


    /**
     * Gets the serviceAreaId value for this ServiceAreaKey.
     * 
     * @return serviceAreaId
     */
    public java.lang.String getServiceAreaId() {
        return serviceAreaId;
    }


    /**
     * Sets the serviceAreaId value for this ServiceAreaKey.
     * 
     * @param serviceAreaId
     */
    public void setServiceAreaId(java.lang.String serviceAreaId) {
        this.serviceAreaId = serviceAreaId;
    }


    /**
     * Gets the countryId value for this ServiceAreaKey.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this ServiceAreaKey.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the serviceAreaCode value for this ServiceAreaKey.
     * 
     * @return serviceAreaCode
     */
    public java.lang.String getServiceAreaCode() {
        return serviceAreaCode;
    }


    /**
     * Sets the serviceAreaCode value for this ServiceAreaKey.
     * 
     * @param serviceAreaCode
     */
    public void setServiceAreaCode(java.lang.String serviceAreaCode) {
        this.serviceAreaCode = serviceAreaCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceAreaKey)) return false;
        ServiceAreaKey other = (ServiceAreaKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceAreaId==null && other.getServiceAreaId()==null) || 
             (this.serviceAreaId!=null &&
              this.serviceAreaId.equals(other.getServiceAreaId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.serviceAreaCode==null && other.getServiceAreaCode()==null) || 
             (this.serviceAreaCode!=null &&
              this.serviceAreaCode.equals(other.getServiceAreaCode())));
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
        if (getServiceAreaId() != null) {
            _hashCode += getServiceAreaId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getServiceAreaCode() != null) {
            _hashCode += getServiceAreaCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceAreaKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceAreaKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceAreaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceAreaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceAreaCode"));
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
