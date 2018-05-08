/**
 * PmRuleCustomDnisKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class PmRuleCustomDnisKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String pmRuleId;

    private java.lang.Short pmSubruleId;

    private java.lang.Short dnisSequence;

    public PmRuleCustomDnisKey() {
    }

    public PmRuleCustomDnisKey(
           java.lang.String pmRuleId,
           java.lang.Short pmSubruleId,
           java.lang.Short dnisSequence) {
        this.pmRuleId = pmRuleId;
        this.pmSubruleId = pmSubruleId;
        this.dnisSequence = dnisSequence;
    }


    /**
     * Gets the pmRuleId value for this PmRuleCustomDnisKey.
     * 
     * @return pmRuleId
     */
    public java.lang.String getPmRuleId() {
        return pmRuleId;
    }


    /**
     * Sets the pmRuleId value for this PmRuleCustomDnisKey.
     * 
     * @param pmRuleId
     */
    public void setPmRuleId(java.lang.String pmRuleId) {
        this.pmRuleId = pmRuleId;
    }


    /**
     * Gets the pmSubruleId value for this PmRuleCustomDnisKey.
     * 
     * @return pmSubruleId
     */
    public java.lang.Short getPmSubruleId() {
        return pmSubruleId;
    }


    /**
     * Sets the pmSubruleId value for this PmRuleCustomDnisKey.
     * 
     * @param pmSubruleId
     */
    public void setPmSubruleId(java.lang.Short pmSubruleId) {
        this.pmSubruleId = pmSubruleId;
    }


    /**
     * Gets the dnisSequence value for this PmRuleCustomDnisKey.
     * 
     * @return dnisSequence
     */
    public java.lang.Short getDnisSequence() {
        return dnisSequence;
    }


    /**
     * Sets the dnisSequence value for this PmRuleCustomDnisKey.
     * 
     * @param dnisSequence
     */
    public void setDnisSequence(java.lang.Short dnisSequence) {
        this.dnisSequence = dnisSequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PmRuleCustomDnisKey)) return false;
        PmRuleCustomDnisKey other = (PmRuleCustomDnisKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pmRuleId==null && other.getPmRuleId()==null) || 
             (this.pmRuleId!=null &&
              this.pmRuleId.equals(other.getPmRuleId()))) &&
            ((this.pmSubruleId==null && other.getPmSubruleId()==null) || 
             (this.pmSubruleId!=null &&
              this.pmSubruleId.equals(other.getPmSubruleId()))) &&
            ((this.dnisSequence==null && other.getDnisSequence()==null) || 
             (this.dnisSequence!=null &&
              this.dnisSequence.equals(other.getDnisSequence())));
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
        if (getPmRuleId() != null) {
            _hashCode += getPmRuleId().hashCode();
        }
        if (getPmSubruleId() != null) {
            _hashCode += getPmSubruleId().hashCode();
        }
        if (getDnisSequence() != null) {
            _hashCode += getDnisSequence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PmRuleCustomDnisKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmRuleCustomDnisKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmSubruleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmSubruleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnisSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnisSequence"));
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
