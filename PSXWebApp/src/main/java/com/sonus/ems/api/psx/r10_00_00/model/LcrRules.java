/**
 * LcrRules.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class LcrRules  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String qosProfileId;
    private java.lang.Integer rule;
    private java.lang.String qosTypeName;
    private java.lang.String minValue;
    private java.lang.String maxValue;

    public LcrRules() {
    }

    public LcrRules(
           java.lang.String qosProfileId,
           java.lang.Integer rule,
           java.lang.String qosTypeName,
           java.lang.String minValue,
           java.lang.String maxValue) {
           this.qosProfileId = qosProfileId;
           this.rule = rule;
           this.qosTypeName = qosTypeName;
           this.minValue = minValue;
           this.maxValue = maxValue;
    }


    /**
     * Gets the qosProfileId value for this LcrRules.
     * 
     * @return qosProfileId
     */
    public java.lang.String getQosProfileId() {
        return qosProfileId;
    }


    /**
     * Sets the qosProfileId value for this LcrRules.
     * 
     * @param qosProfileId
     */
    public void setQosProfileId(java.lang.String qosProfileId) {
        this.qosProfileId = qosProfileId;
    }


    /**
     * Gets the rule value for this LcrRules.
     * 
     * @return rule
     */
    public java.lang.Integer getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this LcrRules.
     * 
     * @param rule
     */
    public void setRule(java.lang.Integer rule) {
        this.rule = rule;
    }


    /**
     * Gets the qosTypeName value for this LcrRules.
     * 
     * @return qosTypeName
     */
    public java.lang.String getQosTypeName() {
        return qosTypeName;
    }


    /**
     * Sets the qosTypeName value for this LcrRules.
     * 
     * @param qosTypeName
     */
    public void setQosTypeName(java.lang.String qosTypeName) {
        this.qosTypeName = qosTypeName;
    }


    /**
     * Gets the minValue value for this LcrRules.
     * 
     * @return minValue
     */
    public java.lang.String getMinValue() {
        return minValue;
    }


    /**
     * Sets the minValue value for this LcrRules.
     * 
     * @param minValue
     */
    public void setMinValue(java.lang.String minValue) {
        this.minValue = minValue;
    }


    /**
     * Gets the maxValue value for this LcrRules.
     * 
     * @return maxValue
     */
    public java.lang.String getMaxValue() {
        return maxValue;
    }


    /**
     * Sets the maxValue value for this LcrRules.
     * 
     * @param maxValue
     */
    public void setMaxValue(java.lang.String maxValue) {
        this.maxValue = maxValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LcrRules)) return false;
        LcrRules other = (LcrRules) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.qosProfileId==null && other.getQosProfileId()==null) || 
             (this.qosProfileId!=null &&
              this.qosProfileId.equals(other.getQosProfileId()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.qosTypeName==null && other.getQosTypeName()==null) || 
             (this.qosTypeName!=null &&
              this.qosTypeName.equals(other.getQosTypeName()))) &&
            ((this.minValue==null && other.getMinValue()==null) || 
             (this.minValue!=null &&
              this.minValue.equals(other.getMinValue()))) &&
            ((this.maxValue==null && other.getMaxValue()==null) || 
             (this.maxValue!=null &&
              this.maxValue.equals(other.getMaxValue())));
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
        if (getQosProfileId() != null) {
            _hashCode += getQosProfileId().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getQosTypeName() != null) {
            _hashCode += getQosTypeName().hashCode();
        }
        if (getMinValue() != null) {
            _hashCode += getMinValue().hashCode();
        }
        if (getMaxValue() != null) {
            _hashCode += getMaxValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LcrRules.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrRules"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qosProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qosTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxValue"));
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
