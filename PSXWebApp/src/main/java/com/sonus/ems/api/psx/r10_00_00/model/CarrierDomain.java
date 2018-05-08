/**
 * CarrierDomain.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CarrierDomain  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String carrierDomainId;
    private java.lang.String description;
    private java.lang.Integer carrierDomainAttributes;

    public CarrierDomain() {
    }

    public CarrierDomain(
           java.lang.String carrierDomainId,
           java.lang.String description,
           java.lang.Integer carrierDomainAttributes) {
           this.carrierDomainId = carrierDomainId;
           this.description = description;
           this.carrierDomainAttributes = carrierDomainAttributes;
    }


    /**
     * Gets the carrierDomainId value for this CarrierDomain.
     * 
     * @return carrierDomainId
     */
    public java.lang.String getCarrierDomainId() {
        return carrierDomainId;
    }


    /**
     * Sets the carrierDomainId value for this CarrierDomain.
     * 
     * @param carrierDomainId
     */
    public void setCarrierDomainId(java.lang.String carrierDomainId) {
        this.carrierDomainId = carrierDomainId;
    }


    /**
     * Gets the description value for this CarrierDomain.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CarrierDomain.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the carrierDomainAttributes value for this CarrierDomain.
     * 
     * @return carrierDomainAttributes
     */
    public java.lang.Integer getCarrierDomainAttributes() {
        return carrierDomainAttributes;
    }


    /**
     * Sets the carrierDomainAttributes value for this CarrierDomain.
     * 
     * @param carrierDomainAttributes
     */
    public void setCarrierDomainAttributes(java.lang.Integer carrierDomainAttributes) {
        this.carrierDomainAttributes = carrierDomainAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarrierDomain)) return false;
        CarrierDomain other = (CarrierDomain) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.carrierDomainId==null && other.getCarrierDomainId()==null) || 
             (this.carrierDomainId!=null &&
              this.carrierDomainId.equals(other.getCarrierDomainId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.carrierDomainAttributes==null && other.getCarrierDomainAttributes()==null) || 
             (this.carrierDomainAttributes!=null &&
              this.carrierDomainAttributes.equals(other.getCarrierDomainAttributes())));
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
        if (getCarrierDomainId() != null) {
            _hashCode += getCarrierDomainId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCarrierDomainAttributes() != null) {
            _hashCode += getCarrierDomainAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarrierDomain.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierDomain"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierDomainId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierDomainId"));
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
        elemField.setFieldName("carrierDomainAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierDomainAttributes"));
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
