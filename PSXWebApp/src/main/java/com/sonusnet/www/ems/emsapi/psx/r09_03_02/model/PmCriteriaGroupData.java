/**
 * PmCriteriaGroupData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class PmCriteriaGroupData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String pmCriteriaGroupId;

    private java.lang.Short pmCriteriaSeq;

    private java.lang.String pmCriteriaId;

    private java.lang.Integer attributes;

    public PmCriteriaGroupData() {
    }

    public PmCriteriaGroupData(
           java.lang.String pmCriteriaGroupId,
           java.lang.Short pmCriteriaSeq,
           java.lang.String pmCriteriaId,
           java.lang.Integer attributes) {
        this.pmCriteriaGroupId = pmCriteriaGroupId;
        this.pmCriteriaSeq = pmCriteriaSeq;
        this.pmCriteriaId = pmCriteriaId;
        this.attributes = attributes;
    }


    /**
     * Gets the pmCriteriaGroupId value for this PmCriteriaGroupData.
     * 
     * @return pmCriteriaGroupId
     */
    public java.lang.String getPmCriteriaGroupId() {
        return pmCriteriaGroupId;
    }


    /**
     * Sets the pmCriteriaGroupId value for this PmCriteriaGroupData.
     * 
     * @param pmCriteriaGroupId
     */
    public void setPmCriteriaGroupId(java.lang.String pmCriteriaGroupId) {
        this.pmCriteriaGroupId = pmCriteriaGroupId;
    }


    /**
     * Gets the pmCriteriaSeq value for this PmCriteriaGroupData.
     * 
     * @return pmCriteriaSeq
     */
    public java.lang.Short getPmCriteriaSeq() {
        return pmCriteriaSeq;
    }


    /**
     * Sets the pmCriteriaSeq value for this PmCriteriaGroupData.
     * 
     * @param pmCriteriaSeq
     */
    public void setPmCriteriaSeq(java.lang.Short pmCriteriaSeq) {
        this.pmCriteriaSeq = pmCriteriaSeq;
    }


    /**
     * Gets the pmCriteriaId value for this PmCriteriaGroupData.
     * 
     * @return pmCriteriaId
     */
    public java.lang.String getPmCriteriaId() {
        return pmCriteriaId;
    }


    /**
     * Sets the pmCriteriaId value for this PmCriteriaGroupData.
     * 
     * @param pmCriteriaId
     */
    public void setPmCriteriaId(java.lang.String pmCriteriaId) {
        this.pmCriteriaId = pmCriteriaId;
    }


    /**
     * Gets the attributes value for this PmCriteriaGroupData.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this PmCriteriaGroupData.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PmCriteriaGroupData)) return false;
        PmCriteriaGroupData other = (PmCriteriaGroupData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pmCriteriaGroupId==null && other.getPmCriteriaGroupId()==null) || 
             (this.pmCriteriaGroupId!=null &&
              this.pmCriteriaGroupId.equals(other.getPmCriteriaGroupId()))) &&
            ((this.pmCriteriaSeq==null && other.getPmCriteriaSeq()==null) || 
             (this.pmCriteriaSeq!=null &&
              this.pmCriteriaSeq.equals(other.getPmCriteriaSeq()))) &&
            ((this.pmCriteriaId==null && other.getPmCriteriaId()==null) || 
             (this.pmCriteriaId!=null &&
              this.pmCriteriaId.equals(other.getPmCriteriaId()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes())));
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
        if (getPmCriteriaGroupId() != null) {
            _hashCode += getPmCriteriaGroupId().hashCode();
        }
        if (getPmCriteriaSeq() != null) {
            _hashCode += getPmCriteriaSeq().hashCode();
        }
        if (getPmCriteriaId() != null) {
            _hashCode += getPmCriteriaId().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PmCriteriaGroupData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmCriteriaGroupData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmCriteriaGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmCriteriaGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmCriteriaSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmCriteriaSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmCriteriaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmCriteriaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
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
