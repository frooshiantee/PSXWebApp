/**
 * FlexibleVariableRulesData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class FlexibleVariableRulesData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String flexibleVariableRuleId;
    private java.lang.Short flexibleVariable;
    private java.lang.Short lookupType;
    private java.lang.String lookupData;

    public FlexibleVariableRulesData() {
    }

    public FlexibleVariableRulesData(
           java.lang.String flexibleVariableRuleId,
           java.lang.Short flexibleVariable,
           java.lang.Short lookupType,
           java.lang.String lookupData) {
           this.flexibleVariableRuleId = flexibleVariableRuleId;
           this.flexibleVariable = flexibleVariable;
           this.lookupType = lookupType;
           this.lookupData = lookupData;
    }


    /**
     * Gets the flexibleVariableRuleId value for this FlexibleVariableRulesData.
     * 
     * @return flexibleVariableRuleId
     */
    public java.lang.String getFlexibleVariableRuleId() {
        return flexibleVariableRuleId;
    }


    /**
     * Sets the flexibleVariableRuleId value for this FlexibleVariableRulesData.
     * 
     * @param flexibleVariableRuleId
     */
    public void setFlexibleVariableRuleId(java.lang.String flexibleVariableRuleId) {
        this.flexibleVariableRuleId = flexibleVariableRuleId;
    }


    /**
     * Gets the flexibleVariable value for this FlexibleVariableRulesData.
     * 
     * @return flexibleVariable
     */
    public java.lang.Short getFlexibleVariable() {
        return flexibleVariable;
    }


    /**
     * Sets the flexibleVariable value for this FlexibleVariableRulesData.
     * 
     * @param flexibleVariable
     */
    public void setFlexibleVariable(java.lang.Short flexibleVariable) {
        this.flexibleVariable = flexibleVariable;
    }


    /**
     * Gets the lookupType value for this FlexibleVariableRulesData.
     * 
     * @return lookupType
     */
    public java.lang.Short getLookupType() {
        return lookupType;
    }


    /**
     * Sets the lookupType value for this FlexibleVariableRulesData.
     * 
     * @param lookupType
     */
    public void setLookupType(java.lang.Short lookupType) {
        this.lookupType = lookupType;
    }


    /**
     * Gets the lookupData value for this FlexibleVariableRulesData.
     * 
     * @return lookupData
     */
    public java.lang.String getLookupData() {
        return lookupData;
    }


    /**
     * Sets the lookupData value for this FlexibleVariableRulesData.
     * 
     * @param lookupData
     */
    public void setLookupData(java.lang.String lookupData) {
        this.lookupData = lookupData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlexibleVariableRulesData)) return false;
        FlexibleVariableRulesData other = (FlexibleVariableRulesData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.flexibleVariableRuleId==null && other.getFlexibleVariableRuleId()==null) || 
             (this.flexibleVariableRuleId!=null &&
              this.flexibleVariableRuleId.equals(other.getFlexibleVariableRuleId()))) &&
            ((this.flexibleVariable==null && other.getFlexibleVariable()==null) || 
             (this.flexibleVariable!=null &&
              this.flexibleVariable.equals(other.getFlexibleVariable()))) &&
            ((this.lookupType==null && other.getLookupType()==null) || 
             (this.lookupType!=null &&
              this.lookupType.equals(other.getLookupType()))) &&
            ((this.lookupData==null && other.getLookupData()==null) || 
             (this.lookupData!=null &&
              this.lookupData.equals(other.getLookupData())));
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
        if (getFlexibleVariableRuleId() != null) {
            _hashCode += getFlexibleVariableRuleId().hashCode();
        }
        if (getFlexibleVariable() != null) {
            _hashCode += getFlexibleVariable().hashCode();
        }
        if (getLookupType() != null) {
            _hashCode += getLookupType().hashCode();
        }
        if (getLookupData() != null) {
            _hashCode += getLookupData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlexibleVariableRulesData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FlexibleVariableRulesData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexibleVariableRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flexibleVariableRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexibleVariable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flexibleVariable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lookupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookupData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lookupData"));
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
