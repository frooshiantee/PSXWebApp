/**
 * CarrierTypeProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CarrierTypeProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String carrierTypeProfileId;
    private java.lang.String description;
    private java.lang.Integer elementAttributes;

    public CarrierTypeProfile() {
    }

    public CarrierTypeProfile(
           java.lang.String carrierTypeProfileId,
           java.lang.String description,
           java.lang.Integer elementAttributes) {
           this.carrierTypeProfileId = carrierTypeProfileId;
           this.description = description;
           this.elementAttributes = elementAttributes;
    }


    /**
     * Gets the carrierTypeProfileId value for this CarrierTypeProfile.
     * 
     * @return carrierTypeProfileId
     */
    public java.lang.String getCarrierTypeProfileId() {
        return carrierTypeProfileId;
    }


    /**
     * Sets the carrierTypeProfileId value for this CarrierTypeProfile.
     * 
     * @param carrierTypeProfileId
     */
    public void setCarrierTypeProfileId(java.lang.String carrierTypeProfileId) {
        this.carrierTypeProfileId = carrierTypeProfileId;
    }


    /**
     * Gets the description value for this CarrierTypeProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CarrierTypeProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the elementAttributes value for this CarrierTypeProfile.
     * 
     * @return elementAttributes
     */
    public java.lang.Integer getElementAttributes() {
        return elementAttributes;
    }


    /**
     * Sets the elementAttributes value for this CarrierTypeProfile.
     * 
     * @param elementAttributes
     */
    public void setElementAttributes(java.lang.Integer elementAttributes) {
        this.elementAttributes = elementAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarrierTypeProfile)) return false;
        CarrierTypeProfile other = (CarrierTypeProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.carrierTypeProfileId==null && other.getCarrierTypeProfileId()==null) || 
             (this.carrierTypeProfileId!=null &&
              this.carrierTypeProfileId.equals(other.getCarrierTypeProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.elementAttributes==null && other.getElementAttributes()==null) || 
             (this.elementAttributes!=null &&
              this.elementAttributes.equals(other.getElementAttributes())));
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
        if (getCarrierTypeProfileId() != null) {
            _hashCode += getCarrierTypeProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getElementAttributes() != null) {
            _hashCode += getElementAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarrierTypeProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierTypeProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierTypeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierTypeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elementAttributes"));
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
