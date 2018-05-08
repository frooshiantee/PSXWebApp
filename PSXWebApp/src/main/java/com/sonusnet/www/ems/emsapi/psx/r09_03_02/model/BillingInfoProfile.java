/**
 * BillingInfoProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class BillingInfoProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String billingInfoId;

    private java.lang.Short variant;

    private java.lang.Integer billingInfoAttributes;

    public BillingInfoProfile() {
    }

    public BillingInfoProfile(
           java.lang.String billingInfoId,
           java.lang.Short variant,
           java.lang.Integer billingInfoAttributes) {
        this.billingInfoId = billingInfoId;
        this.variant = variant;
        this.billingInfoAttributes = billingInfoAttributes;
    }


    /**
     * Gets the billingInfoId value for this BillingInfoProfile.
     * 
     * @return billingInfoId
     */
    public java.lang.String getBillingInfoId() {
        return billingInfoId;
    }


    /**
     * Sets the billingInfoId value for this BillingInfoProfile.
     * 
     * @param billingInfoId
     */
    public void setBillingInfoId(java.lang.String billingInfoId) {
        this.billingInfoId = billingInfoId;
    }


    /**
     * Gets the variant value for this BillingInfoProfile.
     * 
     * @return variant
     */
    public java.lang.Short getVariant() {
        return variant;
    }


    /**
     * Sets the variant value for this BillingInfoProfile.
     * 
     * @param variant
     */
    public void setVariant(java.lang.Short variant) {
        this.variant = variant;
    }


    /**
     * Gets the billingInfoAttributes value for this BillingInfoProfile.
     * 
     * @return billingInfoAttributes
     */
    public java.lang.Integer getBillingInfoAttributes() {
        return billingInfoAttributes;
    }


    /**
     * Sets the billingInfoAttributes value for this BillingInfoProfile.
     * 
     * @param billingInfoAttributes
     */
    public void setBillingInfoAttributes(java.lang.Integer billingInfoAttributes) {
        this.billingInfoAttributes = billingInfoAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingInfoProfile)) return false;
        BillingInfoProfile other = (BillingInfoProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.billingInfoId==null && other.getBillingInfoId()==null) || 
             (this.billingInfoId!=null &&
              this.billingInfoId.equals(other.getBillingInfoId()))) &&
            ((this.variant==null && other.getVariant()==null) || 
             (this.variant!=null &&
              this.variant.equals(other.getVariant()))) &&
            ((this.billingInfoAttributes==null && other.getBillingInfoAttributes()==null) || 
             (this.billingInfoAttributes!=null &&
              this.billingInfoAttributes.equals(other.getBillingInfoAttributes())));
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
        if (getBillingInfoId() != null) {
            _hashCode += getBillingInfoId().hashCode();
        }
        if (getVariant() != null) {
            _hashCode += getVariant().hashCode();
        }
        if (getBillingInfoAttributes() != null) {
            _hashCode += getBillingInfoAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingInfoProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingInfoProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingInfoAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingInfoAttributes"));
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
