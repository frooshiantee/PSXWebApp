/**
 * CarrierGroupData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CarrierGroupData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String carrierGroupId;

    private java.lang.String carrierId;

    private java.lang.Short carrierType;

    private java.lang.Integer attributes;

    public CarrierGroupData() {
    }

    public CarrierGroupData(
           java.lang.String carrierGroupId,
           java.lang.String carrierId,
           java.lang.Short carrierType,
           java.lang.Integer attributes) {
        this.carrierGroupId = carrierGroupId;
        this.carrierId = carrierId;
        this.carrierType = carrierType;
        this.attributes = attributes;
    }


    /**
     * Gets the carrierGroupId value for this CarrierGroupData.
     * 
     * @return carrierGroupId
     */
    public java.lang.String getCarrierGroupId() {
        return carrierGroupId;
    }


    /**
     * Sets the carrierGroupId value for this CarrierGroupData.
     * 
     * @param carrierGroupId
     */
    public void setCarrierGroupId(java.lang.String carrierGroupId) {
        this.carrierGroupId = carrierGroupId;
    }


    /**
     * Gets the carrierId value for this CarrierGroupData.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this CarrierGroupData.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the carrierType value for this CarrierGroupData.
     * 
     * @return carrierType
     */
    public java.lang.Short getCarrierType() {
        return carrierType;
    }


    /**
     * Sets the carrierType value for this CarrierGroupData.
     * 
     * @param carrierType
     */
    public void setCarrierType(java.lang.Short carrierType) {
        this.carrierType = carrierType;
    }


    /**
     * Gets the attributes value for this CarrierGroupData.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this CarrierGroupData.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarrierGroupData)) return false;
        CarrierGroupData other = (CarrierGroupData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.carrierGroupId==null && other.getCarrierGroupId()==null) || 
             (this.carrierGroupId!=null &&
              this.carrierGroupId.equals(other.getCarrierGroupId()))) &&
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId()))) &&
            ((this.carrierType==null && other.getCarrierType()==null) || 
             (this.carrierType!=null &&
              this.carrierType.equals(other.getCarrierType()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes())));
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
        if (getCarrierGroupId() != null) {
            _hashCode += getCarrierGroupId().hashCode();
        }
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        if (getCarrierType() != null) {
            _hashCode += getCarrierType().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarrierGroupData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierGroupData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
