/**
 * HsxCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxCapability  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Integer capabilityNumber;

    private java.lang.String capabilityName;

    private java.lang.String description;

    public HsxCapability() {
    }

    public HsxCapability(
           java.lang.Integer capabilityNumber,
           java.lang.String capabilityName,
           java.lang.String description) {
        this.capabilityNumber = capabilityNumber;
        this.capabilityName = capabilityName;
        this.description = description;
    }


    /**
     * Gets the capabilityNumber value for this HsxCapability.
     * 
     * @return capabilityNumber
     */
    public java.lang.Integer getCapabilityNumber() {
        return capabilityNumber;
    }


    /**
     * Sets the capabilityNumber value for this HsxCapability.
     * 
     * @param capabilityNumber
     */
    public void setCapabilityNumber(java.lang.Integer capabilityNumber) {
        this.capabilityNumber = capabilityNumber;
    }


    /**
     * Gets the capabilityName value for this HsxCapability.
     * 
     * @return capabilityName
     */
    public java.lang.String getCapabilityName() {
        return capabilityName;
    }


    /**
     * Sets the capabilityName value for this HsxCapability.
     * 
     * @param capabilityName
     */
    public void setCapabilityName(java.lang.String capabilityName) {
        this.capabilityName = capabilityName;
    }


    /**
     * Gets the description value for this HsxCapability.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this HsxCapability.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxCapability)) return false;
        HsxCapability other = (HsxCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.capabilityNumber==null && other.getCapabilityNumber()==null) || 
             (this.capabilityNumber!=null &&
              this.capabilityNumber.equals(other.getCapabilityNumber()))) &&
            ((this.capabilityName==null && other.getCapabilityName()==null) || 
             (this.capabilityName!=null &&
              this.capabilityName.equals(other.getCapabilityName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getCapabilityNumber() != null) {
            _hashCode += getCapabilityNumber().hashCode();
        }
        if (getCapabilityName() != null) {
            _hashCode += getCapabilityName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capabilityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capabilityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capabilityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capabilityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
