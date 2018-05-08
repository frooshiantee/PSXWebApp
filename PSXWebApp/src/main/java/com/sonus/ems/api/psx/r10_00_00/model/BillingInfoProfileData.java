/**
 * BillingInfoProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class BillingInfoProfileData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String billingInfoId;
    private java.lang.Short variant;
    private java.lang.Integer billingInfoAttributes;
    private java.lang.Integer tag;
    private java.lang.Short maxLength;
    private java.lang.String defaultValue;
    private java.lang.Short priority;
    private java.lang.Integer calltype1;
    private java.lang.Integer calltype2;

    public BillingInfoProfileData() {
    }

    public BillingInfoProfileData(
           java.lang.String billingInfoId,
           java.lang.Short variant,
           java.lang.Integer billingInfoAttributes,
           java.lang.Integer tag,
           java.lang.Short maxLength,
           java.lang.String defaultValue,
           java.lang.Short priority,
           java.lang.Integer calltype1,
           java.lang.Integer calltype2) {
           this.billingInfoId = billingInfoId;
           this.variant = variant;
           this.billingInfoAttributes = billingInfoAttributes;
           this.tag = tag;
           this.maxLength = maxLength;
           this.defaultValue = defaultValue;
           this.priority = priority;
           this.calltype1 = calltype1;
           this.calltype2 = calltype2;
    }


    /**
     * Gets the billingInfoId value for this BillingInfoProfileData.
     * 
     * @return billingInfoId
     */
    public java.lang.String getBillingInfoId() {
        return billingInfoId;
    }


    /**
     * Sets the billingInfoId value for this BillingInfoProfileData.
     * 
     * @param billingInfoId
     */
    public void setBillingInfoId(java.lang.String billingInfoId) {
        this.billingInfoId = billingInfoId;
    }


    /**
     * Gets the variant value for this BillingInfoProfileData.
     * 
     * @return variant
     */
    public java.lang.Short getVariant() {
        return variant;
    }


    /**
     * Sets the variant value for this BillingInfoProfileData.
     * 
     * @param variant
     */
    public void setVariant(java.lang.Short variant) {
        this.variant = variant;
    }


    /**
     * Gets the billingInfoAttributes value for this BillingInfoProfileData.
     * 
     * @return billingInfoAttributes
     */
    public java.lang.Integer getBillingInfoAttributes() {
        return billingInfoAttributes;
    }


    /**
     * Sets the billingInfoAttributes value for this BillingInfoProfileData.
     * 
     * @param billingInfoAttributes
     */
    public void setBillingInfoAttributes(java.lang.Integer billingInfoAttributes) {
        this.billingInfoAttributes = billingInfoAttributes;
    }


    /**
     * Gets the tag value for this BillingInfoProfileData.
     * 
     * @return tag
     */
    public java.lang.Integer getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this BillingInfoProfileData.
     * 
     * @param tag
     */
    public void setTag(java.lang.Integer tag) {
        this.tag = tag;
    }


    /**
     * Gets the maxLength value for this BillingInfoProfileData.
     * 
     * @return maxLength
     */
    public java.lang.Short getMaxLength() {
        return maxLength;
    }


    /**
     * Sets the maxLength value for this BillingInfoProfileData.
     * 
     * @param maxLength
     */
    public void setMaxLength(java.lang.Short maxLength) {
        this.maxLength = maxLength;
    }


    /**
     * Gets the defaultValue value for this BillingInfoProfileData.
     * 
     * @return defaultValue
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this BillingInfoProfileData.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the priority value for this BillingInfoProfileData.
     * 
     * @return priority
     */
    public java.lang.Short getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this BillingInfoProfileData.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Short priority) {
        this.priority = priority;
    }


    /**
     * Gets the calltype1 value for this BillingInfoProfileData.
     * 
     * @return calltype1
     */
    public java.lang.Integer getCalltype1() {
        return calltype1;
    }


    /**
     * Sets the calltype1 value for this BillingInfoProfileData.
     * 
     * @param calltype1
     */
    public void setCalltype1(java.lang.Integer calltype1) {
        this.calltype1 = calltype1;
    }


    /**
     * Gets the calltype2 value for this BillingInfoProfileData.
     * 
     * @return calltype2
     */
    public java.lang.Integer getCalltype2() {
        return calltype2;
    }


    /**
     * Sets the calltype2 value for this BillingInfoProfileData.
     * 
     * @param calltype2
     */
    public void setCalltype2(java.lang.Integer calltype2) {
        this.calltype2 = calltype2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingInfoProfileData)) return false;
        BillingInfoProfileData other = (BillingInfoProfileData) obj;
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
              this.billingInfoAttributes.equals(other.getBillingInfoAttributes()))) &&
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              this.tag.equals(other.getTag()))) &&
            ((this.maxLength==null && other.getMaxLength()==null) || 
             (this.maxLength!=null &&
              this.maxLength.equals(other.getMaxLength()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.calltype1==null && other.getCalltype1()==null) || 
             (this.calltype1!=null &&
              this.calltype1.equals(other.getCalltype1()))) &&
            ((this.calltype2==null && other.getCalltype2()==null) || 
             (this.calltype2!=null &&
              this.calltype2.equals(other.getCalltype2())));
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
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        if (getMaxLength() != null) {
            _hashCode += getMaxLength().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getCalltype1() != null) {
            _hashCode += getCalltype1().hashCode();
        }
        if (getCalltype2() != null) {
            _hashCode += getCalltype2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingInfoProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingInfoProfileData"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calltype1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calltype1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calltype2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calltype2"));
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
