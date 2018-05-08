/**
 * BillingInfoProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class BillingInfoProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String billingInfoId;

    private java.lang.Integer tag;

    public BillingInfoProfileDataKey() {
    }

    public BillingInfoProfileDataKey(
           java.lang.String billingInfoId,
           java.lang.Integer tag) {
        this.billingInfoId = billingInfoId;
        this.tag = tag;
    }


    /**
     * Gets the billingInfoId value for this BillingInfoProfileDataKey.
     * 
     * @return billingInfoId
     */
    public java.lang.String getBillingInfoId() {
        return billingInfoId;
    }


    /**
     * Sets the billingInfoId value for this BillingInfoProfileDataKey.
     * 
     * @param billingInfoId
     */
    public void setBillingInfoId(java.lang.String billingInfoId) {
        this.billingInfoId = billingInfoId;
    }


    /**
     * Gets the tag value for this BillingInfoProfileDataKey.
     * 
     * @return tag
     */
    public java.lang.Integer getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this BillingInfoProfileDataKey.
     * 
     * @param tag
     */
    public void setTag(java.lang.Integer tag) {
        this.tag = tag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingInfoProfileDataKey)) return false;
        BillingInfoProfileDataKey other = (BillingInfoProfileDataKey) obj;
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
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              this.tag.equals(other.getTag())));
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
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingInfoProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingInfoProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag"));
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
