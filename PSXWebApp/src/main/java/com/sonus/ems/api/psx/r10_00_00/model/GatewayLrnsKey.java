/**
 * GatewayLrnsKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class GatewayLrnsKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String gatewayId;
    private java.lang.String lrnId;
    private java.lang.Short lrnType;
    private java.lang.String countryId;

    public GatewayLrnsKey() {
    }

    public GatewayLrnsKey(
           java.lang.String gatewayId,
           java.lang.String lrnId,
           java.lang.Short lrnType,
           java.lang.String countryId) {
           this.gatewayId = gatewayId;
           this.lrnId = lrnId;
           this.lrnType = lrnType;
           this.countryId = countryId;
    }


    /**
     * Gets the gatewayId value for this GatewayLrnsKey.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this GatewayLrnsKey.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the lrnId value for this GatewayLrnsKey.
     * 
     * @return lrnId
     */
    public java.lang.String getLrnId() {
        return lrnId;
    }


    /**
     * Sets the lrnId value for this GatewayLrnsKey.
     * 
     * @param lrnId
     */
    public void setLrnId(java.lang.String lrnId) {
        this.lrnId = lrnId;
    }


    /**
     * Gets the lrnType value for this GatewayLrnsKey.
     * 
     * @return lrnType
     */
    public java.lang.Short getLrnType() {
        return lrnType;
    }


    /**
     * Sets the lrnType value for this GatewayLrnsKey.
     * 
     * @param lrnType
     */
    public void setLrnType(java.lang.Short lrnType) {
        this.lrnType = lrnType;
    }


    /**
     * Gets the countryId value for this GatewayLrnsKey.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this GatewayLrnsKey.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GatewayLrnsKey)) return false;
        GatewayLrnsKey other = (GatewayLrnsKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.lrnId==null && other.getLrnId()==null) || 
             (this.lrnId!=null &&
              this.lrnId.equals(other.getLrnId()))) &&
            ((this.lrnType==null && other.getLrnType()==null) || 
             (this.lrnType!=null &&
              this.lrnType.equals(other.getLrnType()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId())));
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
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getLrnId() != null) {
            _hashCode += getLrnId().hashCode();
        }
        if (getLrnType() != null) {
            _hashCode += getLrnType().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GatewayLrnsKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayLrnsKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lrnId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lrnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lrnType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lrnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
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
