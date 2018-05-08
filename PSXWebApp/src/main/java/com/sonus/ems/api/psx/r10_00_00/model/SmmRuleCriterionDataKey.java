/**
 * SmmRuleCriterionDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SmmRuleCriterionDataKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String smmRuleId;
    private java.lang.String criterionId;

    public SmmRuleCriterionDataKey() {
    }

    public SmmRuleCriterionDataKey(
           java.lang.String smmRuleId,
           java.lang.String criterionId) {
           this.smmRuleId = smmRuleId;
           this.criterionId = criterionId;
    }


    /**
     * Gets the smmRuleId value for this SmmRuleCriterionDataKey.
     * 
     * @return smmRuleId
     */
    public java.lang.String getSmmRuleId() {
        return smmRuleId;
    }


    /**
     * Sets the smmRuleId value for this SmmRuleCriterionDataKey.
     * 
     * @param smmRuleId
     */
    public void setSmmRuleId(java.lang.String smmRuleId) {
        this.smmRuleId = smmRuleId;
    }


    /**
     * Gets the criterionId value for this SmmRuleCriterionDataKey.
     * 
     * @return criterionId
     */
    public java.lang.String getCriterionId() {
        return criterionId;
    }


    /**
     * Sets the criterionId value for this SmmRuleCriterionDataKey.
     * 
     * @param criterionId
     */
    public void setCriterionId(java.lang.String criterionId) {
        this.criterionId = criterionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmmRuleCriterionDataKey)) return false;
        SmmRuleCriterionDataKey other = (SmmRuleCriterionDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.smmRuleId==null && other.getSmmRuleId()==null) || 
             (this.smmRuleId!=null &&
              this.smmRuleId.equals(other.getSmmRuleId()))) &&
            ((this.criterionId==null && other.getCriterionId()==null) || 
             (this.criterionId!=null &&
              this.criterionId.equals(other.getCriterionId())));
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
        if (getSmmRuleId() != null) {
            _hashCode += getSmmRuleId().hashCode();
        }
        if (getCriterionId() != null) {
            _hashCode += getCriterionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmmRuleCriterionDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmRuleCriterionDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criterionId"));
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
