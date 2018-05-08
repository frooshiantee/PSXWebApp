/**
 * SmmRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SmmRule  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String smmRuleId;
    private java.lang.String description;
    private java.lang.Short smmHdrstartintance;
    private java.lang.Short smmHdrmatchrange;

    public SmmRule() {
    }

    public SmmRule(
           java.lang.String smmRuleId,
           java.lang.String description,
           java.lang.Short smmHdrstartintance,
           java.lang.Short smmHdrmatchrange) {
           this.smmRuleId = smmRuleId;
           this.description = description;
           this.smmHdrstartintance = smmHdrstartintance;
           this.smmHdrmatchrange = smmHdrmatchrange;
    }


    /**
     * Gets the smmRuleId value for this SmmRule.
     * 
     * @return smmRuleId
     */
    public java.lang.String getSmmRuleId() {
        return smmRuleId;
    }


    /**
     * Sets the smmRuleId value for this SmmRule.
     * 
     * @param smmRuleId
     */
    public void setSmmRuleId(java.lang.String smmRuleId) {
        this.smmRuleId = smmRuleId;
    }


    /**
     * Gets the description value for this SmmRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SmmRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the smmHdrstartintance value for this SmmRule.
     * 
     * @return smmHdrstartintance
     */
    public java.lang.Short getSmmHdrstartintance() {
        return smmHdrstartintance;
    }


    /**
     * Sets the smmHdrstartintance value for this SmmRule.
     * 
     * @param smmHdrstartintance
     */
    public void setSmmHdrstartintance(java.lang.Short smmHdrstartintance) {
        this.smmHdrstartintance = smmHdrstartintance;
    }


    /**
     * Gets the smmHdrmatchrange value for this SmmRule.
     * 
     * @return smmHdrmatchrange
     */
    public java.lang.Short getSmmHdrmatchrange() {
        return smmHdrmatchrange;
    }


    /**
     * Sets the smmHdrmatchrange value for this SmmRule.
     * 
     * @param smmHdrmatchrange
     */
    public void setSmmHdrmatchrange(java.lang.Short smmHdrmatchrange) {
        this.smmHdrmatchrange = smmHdrmatchrange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmmRule)) return false;
        SmmRule other = (SmmRule) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.smmHdrstartintance==null && other.getSmmHdrstartintance()==null) || 
             (this.smmHdrstartintance!=null &&
              this.smmHdrstartintance.equals(other.getSmmHdrstartintance()))) &&
            ((this.smmHdrmatchrange==null && other.getSmmHdrmatchrange()==null) || 
             (this.smmHdrmatchrange!=null &&
              this.smmHdrmatchrange.equals(other.getSmmHdrmatchrange())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSmmHdrstartintance() != null) {
            _hashCode += getSmmHdrstartintance().hashCode();
        }
        if (getSmmHdrmatchrange() != null) {
            _hashCode += getSmmHdrmatchrange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmmRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmRuleId"));
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
        elemField.setFieldName("smmHdrstartintance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmHdrstartintance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smmHdrmatchrange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmHdrmatchrange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
