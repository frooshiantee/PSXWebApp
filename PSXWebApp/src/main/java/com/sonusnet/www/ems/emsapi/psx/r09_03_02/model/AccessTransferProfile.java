/**
 * AccessTransferProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class AccessTransferProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String accessTransferProfileId;

    private java.lang.Short accessTransferType;

    private java.lang.Integer featureCapabitlityIndicator;

    private java.lang.Integer atcfAttributes;

    public AccessTransferProfile() {
    }

    public AccessTransferProfile(
           java.lang.String accessTransferProfileId,
           java.lang.Short accessTransferType,
           java.lang.Integer featureCapabitlityIndicator,
           java.lang.Integer atcfAttributes) {
        this.accessTransferProfileId = accessTransferProfileId;
        this.accessTransferType = accessTransferType;
        this.featureCapabitlityIndicator = featureCapabitlityIndicator;
        this.atcfAttributes = atcfAttributes;
    }


    /**
     * Gets the accessTransferProfileId value for this AccessTransferProfile.
     * 
     * @return accessTransferProfileId
     */
    public java.lang.String getAccessTransferProfileId() {
        return accessTransferProfileId;
    }


    /**
     * Sets the accessTransferProfileId value for this AccessTransferProfile.
     * 
     * @param accessTransferProfileId
     */
    public void setAccessTransferProfileId(java.lang.String accessTransferProfileId) {
        this.accessTransferProfileId = accessTransferProfileId;
    }


    /**
     * Gets the accessTransferType value for this AccessTransferProfile.
     * 
     * @return accessTransferType
     */
    public java.lang.Short getAccessTransferType() {
        return accessTransferType;
    }


    /**
     * Sets the accessTransferType value for this AccessTransferProfile.
     * 
     * @param accessTransferType
     */
    public void setAccessTransferType(java.lang.Short accessTransferType) {
        this.accessTransferType = accessTransferType;
    }


    /**
     * Gets the featureCapabitlityIndicator value for this AccessTransferProfile.
     * 
     * @return featureCapabitlityIndicator
     */
    public java.lang.Integer getFeatureCapabitlityIndicator() {
        return featureCapabitlityIndicator;
    }


    /**
     * Sets the featureCapabitlityIndicator value for this AccessTransferProfile.
     * 
     * @param featureCapabitlityIndicator
     */
    public void setFeatureCapabitlityIndicator(java.lang.Integer featureCapabitlityIndicator) {
        this.featureCapabitlityIndicator = featureCapabitlityIndicator;
    }


    /**
     * Gets the atcfAttributes value for this AccessTransferProfile.
     * 
     * @return atcfAttributes
     */
    public java.lang.Integer getAtcfAttributes() {
        return atcfAttributes;
    }


    /**
     * Sets the atcfAttributes value for this AccessTransferProfile.
     * 
     * @param atcfAttributes
     */
    public void setAtcfAttributes(java.lang.Integer atcfAttributes) {
        this.atcfAttributes = atcfAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccessTransferProfile)) return false;
        AccessTransferProfile other = (AccessTransferProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accessTransferProfileId==null && other.getAccessTransferProfileId()==null) || 
             (this.accessTransferProfileId!=null &&
              this.accessTransferProfileId.equals(other.getAccessTransferProfileId()))) &&
            ((this.accessTransferType==null && other.getAccessTransferType()==null) || 
             (this.accessTransferType!=null &&
              this.accessTransferType.equals(other.getAccessTransferType()))) &&
            ((this.featureCapabitlityIndicator==null && other.getFeatureCapabitlityIndicator()==null) || 
             (this.featureCapabitlityIndicator!=null &&
              this.featureCapabitlityIndicator.equals(other.getFeatureCapabitlityIndicator()))) &&
            ((this.atcfAttributes==null && other.getAtcfAttributes()==null) || 
             (this.atcfAttributes!=null &&
              this.atcfAttributes.equals(other.getAtcfAttributes())));
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
        if (getAccessTransferProfileId() != null) {
            _hashCode += getAccessTransferProfileId().hashCode();
        }
        if (getAccessTransferType() != null) {
            _hashCode += getAccessTransferType().hashCode();
        }
        if (getFeatureCapabitlityIndicator() != null) {
            _hashCode += getFeatureCapabitlityIndicator().hashCode();
        }
        if (getAtcfAttributes() != null) {
            _hashCode += getAtcfAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccessTransferProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AccessTransferProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessTransferProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessTransferProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessTransferType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessTransferType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureCapabitlityIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "featureCapabitlityIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atcfAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atcfAttributes"));
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
