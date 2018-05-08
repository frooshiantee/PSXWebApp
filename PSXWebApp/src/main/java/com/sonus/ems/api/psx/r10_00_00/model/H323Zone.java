/**
 * H323Zone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class H323Zone  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String h323ZoneId;
    private java.lang.Short primaryPortNumber;
    private java.lang.String primaryIpAddress;
    private java.lang.Short secondaryPortNumber;
    private java.lang.String secondaryIpAddress;
    private java.lang.String gatewayId;
    private java.lang.Integer h323ZoneAttributes;

    public H323Zone() {
    }

    public H323Zone(
           java.lang.String h323ZoneId,
           java.lang.Short primaryPortNumber,
           java.lang.String primaryIpAddress,
           java.lang.Short secondaryPortNumber,
           java.lang.String secondaryIpAddress,
           java.lang.String gatewayId,
           java.lang.Integer h323ZoneAttributes) {
           this.h323ZoneId = h323ZoneId;
           this.primaryPortNumber = primaryPortNumber;
           this.primaryIpAddress = primaryIpAddress;
           this.secondaryPortNumber = secondaryPortNumber;
           this.secondaryIpAddress = secondaryIpAddress;
           this.gatewayId = gatewayId;
           this.h323ZoneAttributes = h323ZoneAttributes;
    }


    /**
     * Gets the h323ZoneId value for this H323Zone.
     * 
     * @return h323ZoneId
     */
    public java.lang.String getH323ZoneId() {
        return h323ZoneId;
    }


    /**
     * Sets the h323ZoneId value for this H323Zone.
     * 
     * @param h323ZoneId
     */
    public void setH323ZoneId(java.lang.String h323ZoneId) {
        this.h323ZoneId = h323ZoneId;
    }


    /**
     * Gets the primaryPortNumber value for this H323Zone.
     * 
     * @return primaryPortNumber
     */
    public java.lang.Short getPrimaryPortNumber() {
        return primaryPortNumber;
    }


    /**
     * Sets the primaryPortNumber value for this H323Zone.
     * 
     * @param primaryPortNumber
     */
    public void setPrimaryPortNumber(java.lang.Short primaryPortNumber) {
        this.primaryPortNumber = primaryPortNumber;
    }


    /**
     * Gets the primaryIpAddress value for this H323Zone.
     * 
     * @return primaryIpAddress
     */
    public java.lang.String getPrimaryIpAddress() {
        return primaryIpAddress;
    }


    /**
     * Sets the primaryIpAddress value for this H323Zone.
     * 
     * @param primaryIpAddress
     */
    public void setPrimaryIpAddress(java.lang.String primaryIpAddress) {
        this.primaryIpAddress = primaryIpAddress;
    }


    /**
     * Gets the secondaryPortNumber value for this H323Zone.
     * 
     * @return secondaryPortNumber
     */
    public java.lang.Short getSecondaryPortNumber() {
        return secondaryPortNumber;
    }


    /**
     * Sets the secondaryPortNumber value for this H323Zone.
     * 
     * @param secondaryPortNumber
     */
    public void setSecondaryPortNumber(java.lang.Short secondaryPortNumber) {
        this.secondaryPortNumber = secondaryPortNumber;
    }


    /**
     * Gets the secondaryIpAddress value for this H323Zone.
     * 
     * @return secondaryIpAddress
     */
    public java.lang.String getSecondaryIpAddress() {
        return secondaryIpAddress;
    }


    /**
     * Sets the secondaryIpAddress value for this H323Zone.
     * 
     * @param secondaryIpAddress
     */
    public void setSecondaryIpAddress(java.lang.String secondaryIpAddress) {
        this.secondaryIpAddress = secondaryIpAddress;
    }


    /**
     * Gets the gatewayId value for this H323Zone.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this H323Zone.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the h323ZoneAttributes value for this H323Zone.
     * 
     * @return h323ZoneAttributes
     */
    public java.lang.Integer getH323ZoneAttributes() {
        return h323ZoneAttributes;
    }


    /**
     * Sets the h323ZoneAttributes value for this H323Zone.
     * 
     * @param h323ZoneAttributes
     */
    public void setH323ZoneAttributes(java.lang.Integer h323ZoneAttributes) {
        this.h323ZoneAttributes = h323ZoneAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof H323Zone)) return false;
        H323Zone other = (H323Zone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.h323ZoneId==null && other.getH323ZoneId()==null) || 
             (this.h323ZoneId!=null &&
              this.h323ZoneId.equals(other.getH323ZoneId()))) &&
            ((this.primaryPortNumber==null && other.getPrimaryPortNumber()==null) || 
             (this.primaryPortNumber!=null &&
              this.primaryPortNumber.equals(other.getPrimaryPortNumber()))) &&
            ((this.primaryIpAddress==null && other.getPrimaryIpAddress()==null) || 
             (this.primaryIpAddress!=null &&
              this.primaryIpAddress.equals(other.getPrimaryIpAddress()))) &&
            ((this.secondaryPortNumber==null && other.getSecondaryPortNumber()==null) || 
             (this.secondaryPortNumber!=null &&
              this.secondaryPortNumber.equals(other.getSecondaryPortNumber()))) &&
            ((this.secondaryIpAddress==null && other.getSecondaryIpAddress()==null) || 
             (this.secondaryIpAddress!=null &&
              this.secondaryIpAddress.equals(other.getSecondaryIpAddress()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.h323ZoneAttributes==null && other.getH323ZoneAttributes()==null) || 
             (this.h323ZoneAttributes!=null &&
              this.h323ZoneAttributes.equals(other.getH323ZoneAttributes())));
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
        if (getH323ZoneId() != null) {
            _hashCode += getH323ZoneId().hashCode();
        }
        if (getPrimaryPortNumber() != null) {
            _hashCode += getPrimaryPortNumber().hashCode();
        }
        if (getPrimaryIpAddress() != null) {
            _hashCode += getPrimaryIpAddress().hashCode();
        }
        if (getSecondaryPortNumber() != null) {
            _hashCode += getSecondaryPortNumber().hashCode();
        }
        if (getSecondaryIpAddress() != null) {
            _hashCode += getSecondaryIpAddress().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getH323ZoneAttributes() != null) {
            _hashCode += getH323ZoneAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(H323Zone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "H323Zone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("h323ZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "h323ZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryPortNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryPortNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryIpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryPortNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondaryPortNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondaryIpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("h323ZoneAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "h323ZoneAttributes"));
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
