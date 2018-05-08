/**
 * SmmProfileGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SmmProfileGroup  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String smmProfileGroupId;
    private java.lang.String description;
    private java.lang.Short smmIngressProfileId;
    private java.lang.Short smmEgressProfileId;

    public SmmProfileGroup() {
    }

    public SmmProfileGroup(
           java.lang.String smmProfileGroupId,
           java.lang.String description,
           java.lang.Short smmIngressProfileId,
           java.lang.Short smmEgressProfileId) {
           this.smmProfileGroupId = smmProfileGroupId;
           this.description = description;
           this.smmIngressProfileId = smmIngressProfileId;
           this.smmEgressProfileId = smmEgressProfileId;
    }


    /**
     * Gets the smmProfileGroupId value for this SmmProfileGroup.
     * 
     * @return smmProfileGroupId
     */
    public java.lang.String getSmmProfileGroupId() {
        return smmProfileGroupId;
    }


    /**
     * Sets the smmProfileGroupId value for this SmmProfileGroup.
     * 
     * @param smmProfileGroupId
     */
    public void setSmmProfileGroupId(java.lang.String smmProfileGroupId) {
        this.smmProfileGroupId = smmProfileGroupId;
    }


    /**
     * Gets the description value for this SmmProfileGroup.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SmmProfileGroup.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the smmIngressProfileId value for this SmmProfileGroup.
     * 
     * @return smmIngressProfileId
     */
    public java.lang.Short getSmmIngressProfileId() {
        return smmIngressProfileId;
    }


    /**
     * Sets the smmIngressProfileId value for this SmmProfileGroup.
     * 
     * @param smmIngressProfileId
     */
    public void setSmmIngressProfileId(java.lang.Short smmIngressProfileId) {
        this.smmIngressProfileId = smmIngressProfileId;
    }


    /**
     * Gets the smmEgressProfileId value for this SmmProfileGroup.
     * 
     * @return smmEgressProfileId
     */
    public java.lang.Short getSmmEgressProfileId() {
        return smmEgressProfileId;
    }


    /**
     * Sets the smmEgressProfileId value for this SmmProfileGroup.
     * 
     * @param smmEgressProfileId
     */
    public void setSmmEgressProfileId(java.lang.Short smmEgressProfileId) {
        this.smmEgressProfileId = smmEgressProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmmProfileGroup)) return false;
        SmmProfileGroup other = (SmmProfileGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.smmProfileGroupId==null && other.getSmmProfileGroupId()==null) || 
             (this.smmProfileGroupId!=null &&
              this.smmProfileGroupId.equals(other.getSmmProfileGroupId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.smmIngressProfileId==null && other.getSmmIngressProfileId()==null) || 
             (this.smmIngressProfileId!=null &&
              this.smmIngressProfileId.equals(other.getSmmIngressProfileId()))) &&
            ((this.smmEgressProfileId==null && other.getSmmEgressProfileId()==null) || 
             (this.smmEgressProfileId!=null &&
              this.smmEgressProfileId.equals(other.getSmmEgressProfileId())));
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
        if (getSmmProfileGroupId() != null) {
            _hashCode += getSmmProfileGroupId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSmmIngressProfileId() != null) {
            _hashCode += getSmmIngressProfileId().hashCode();
        }
        if (getSmmEgressProfileId() != null) {
            _hashCode += getSmmEgressProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmmProfileGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmProfileGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smmProfileGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmProfileGroupId"));
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
        elemField.setFieldName("smmIngressProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmIngressProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smmEgressProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmEgressProfileId"));
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
