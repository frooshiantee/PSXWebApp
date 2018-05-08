/**
 * PmRuleCustomDnis.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class PmRuleCustomDnis  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String pmRuleId;

    private java.lang.Short pmSubruleId;

    private java.lang.Short dnisSequence;

    private java.lang.Integer dnisPosition;

    private java.lang.String dnisDefault;

    private java.lang.String dnisSeparator;

    private java.lang.String dnisDigits;

    public PmRuleCustomDnis() {
    }

    public PmRuleCustomDnis(
           java.lang.String pmRuleId,
           java.lang.Short pmSubruleId,
           java.lang.Short dnisSequence,
           java.lang.Integer dnisPosition,
           java.lang.String dnisDefault,
           java.lang.String dnisSeparator,
           java.lang.String dnisDigits) {
        this.pmRuleId = pmRuleId;
        this.pmSubruleId = pmSubruleId;
        this.dnisSequence = dnisSequence;
        this.dnisPosition = dnisPosition;
        this.dnisDefault = dnisDefault;
        this.dnisSeparator = dnisSeparator;
        this.dnisDigits = dnisDigits;
    }


    /**
     * Gets the pmRuleId value for this PmRuleCustomDnis.
     * 
     * @return pmRuleId
     */
    public java.lang.String getPmRuleId() {
        return pmRuleId;
    }


    /**
     * Sets the pmRuleId value for this PmRuleCustomDnis.
     * 
     * @param pmRuleId
     */
    public void setPmRuleId(java.lang.String pmRuleId) {
        this.pmRuleId = pmRuleId;
    }


    /**
     * Gets the pmSubruleId value for this PmRuleCustomDnis.
     * 
     * @return pmSubruleId
     */
    public java.lang.Short getPmSubruleId() {
        return pmSubruleId;
    }


    /**
     * Sets the pmSubruleId value for this PmRuleCustomDnis.
     * 
     * @param pmSubruleId
     */
    public void setPmSubruleId(java.lang.Short pmSubruleId) {
        this.pmSubruleId = pmSubruleId;
    }


    /**
     * Gets the dnisSequence value for this PmRuleCustomDnis.
     * 
     * @return dnisSequence
     */
    public java.lang.Short getDnisSequence() {
        return dnisSequence;
    }


    /**
     * Sets the dnisSequence value for this PmRuleCustomDnis.
     * 
     * @param dnisSequence
     */
    public void setDnisSequence(java.lang.Short dnisSequence) {
        this.dnisSequence = dnisSequence;
    }


    /**
     * Gets the dnisPosition value for this PmRuleCustomDnis.
     * 
     * @return dnisPosition
     */
    public java.lang.Integer getDnisPosition() {
        return dnisPosition;
    }


    /**
     * Sets the dnisPosition value for this PmRuleCustomDnis.
     * 
     * @param dnisPosition
     */
    public void setDnisPosition(java.lang.Integer dnisPosition) {
        this.dnisPosition = dnisPosition;
    }


    /**
     * Gets the dnisDefault value for this PmRuleCustomDnis.
     * 
     * @return dnisDefault
     */
    public java.lang.String getDnisDefault() {
        return dnisDefault;
    }


    /**
     * Sets the dnisDefault value for this PmRuleCustomDnis.
     * 
     * @param dnisDefault
     */
    public void setDnisDefault(java.lang.String dnisDefault) {
        this.dnisDefault = dnisDefault;
    }


    /**
     * Gets the dnisSeparator value for this PmRuleCustomDnis.
     * 
     * @return dnisSeparator
     */
    public java.lang.String getDnisSeparator() {
        return dnisSeparator;
    }


    /**
     * Sets the dnisSeparator value for this PmRuleCustomDnis.
     * 
     * @param dnisSeparator
     */
    public void setDnisSeparator(java.lang.String dnisSeparator) {
        this.dnisSeparator = dnisSeparator;
    }


    /**
     * Gets the dnisDigits value for this PmRuleCustomDnis.
     * 
     * @return dnisDigits
     */
    public java.lang.String getDnisDigits() {
        return dnisDigits;
    }


    /**
     * Sets the dnisDigits value for this PmRuleCustomDnis.
     * 
     * @param dnisDigits
     */
    public void setDnisDigits(java.lang.String dnisDigits) {
        this.dnisDigits = dnisDigits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PmRuleCustomDnis)) return false;
        PmRuleCustomDnis other = (PmRuleCustomDnis) obj;
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
              this.dnisSequence.equals(other.getDnisSequence()))) &&
            ((this.dnisPosition==null && other.getDnisPosition()==null) || 
             (this.dnisPosition!=null &&
              this.dnisPosition.equals(other.getDnisPosition()))) &&
            ((this.dnisDefault==null && other.getDnisDefault()==null) || 
             (this.dnisDefault!=null &&
              this.dnisDefault.equals(other.getDnisDefault()))) &&
            ((this.dnisSeparator==null && other.getDnisSeparator()==null) || 
             (this.dnisSeparator!=null &&
              this.dnisSeparator.equals(other.getDnisSeparator()))) &&
            ((this.dnisDigits==null && other.getDnisDigits()==null) || 
             (this.dnisDigits!=null &&
              this.dnisDigits.equals(other.getDnisDigits())));
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
        if (getDnisPosition() != null) {
            _hashCode += getDnisPosition().hashCode();
        }
        if (getDnisDefault() != null) {
            _hashCode += getDnisDefault().hashCode();
        }
        if (getDnisSeparator() != null) {
            _hashCode += getDnisSeparator().hashCode();
        }
        if (getDnisDigits() != null) {
            _hashCode += getDnisDigits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PmRuleCustomDnis.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmRuleCustomDnis"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnisPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnisPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnisDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnisDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnisSeparator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnisSeparator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnisDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnisDigits"));
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
