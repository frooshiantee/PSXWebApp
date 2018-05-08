/**
 * HsxCapabilitiesProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxCapabilitiesProfileData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String capabilityId;

    private java.lang.Integer sequenceNumber;

    private java.lang.Integer mandatoryCapabilities;

    private java.lang.Integer optionalCapabilities;

    private java.lang.String sCscfId;

    public HsxCapabilitiesProfileData() {
    }

    public HsxCapabilitiesProfileData(
           java.lang.String capabilityId,
           java.lang.Integer sequenceNumber,
           java.lang.Integer mandatoryCapabilities,
           java.lang.Integer optionalCapabilities,
           java.lang.String sCscfId) {
        this.capabilityId = capabilityId;
        this.sequenceNumber = sequenceNumber;
        this.mandatoryCapabilities = mandatoryCapabilities;
        this.optionalCapabilities = optionalCapabilities;
        this.sCscfId = sCscfId;
    }


    /**
     * Gets the capabilityId value for this HsxCapabilitiesProfileData.
     * 
     * @return capabilityId
     */
    public java.lang.String getCapabilityId() {
        return capabilityId;
    }


    /**
     * Sets the capabilityId value for this HsxCapabilitiesProfileData.
     * 
     * @param capabilityId
     */
    public void setCapabilityId(java.lang.String capabilityId) {
        this.capabilityId = capabilityId;
    }


    /**
     * Gets the sequenceNumber value for this HsxCapabilitiesProfileData.
     * 
     * @return sequenceNumber
     */
    public java.lang.Integer getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this HsxCapabilitiesProfileData.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(java.lang.Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the mandatoryCapabilities value for this HsxCapabilitiesProfileData.
     * 
     * @return mandatoryCapabilities
     */
    public java.lang.Integer getMandatoryCapabilities() {
        return mandatoryCapabilities;
    }


    /**
     * Sets the mandatoryCapabilities value for this HsxCapabilitiesProfileData.
     * 
     * @param mandatoryCapabilities
     */
    public void setMandatoryCapabilities(java.lang.Integer mandatoryCapabilities) {
        this.mandatoryCapabilities = mandatoryCapabilities;
    }


    /**
     * Gets the optionalCapabilities value for this HsxCapabilitiesProfileData.
     * 
     * @return optionalCapabilities
     */
    public java.lang.Integer getOptionalCapabilities() {
        return optionalCapabilities;
    }


    /**
     * Sets the optionalCapabilities value for this HsxCapabilitiesProfileData.
     * 
     * @param optionalCapabilities
     */
    public void setOptionalCapabilities(java.lang.Integer optionalCapabilities) {
        this.optionalCapabilities = optionalCapabilities;
    }


    /**
     * Gets the sCscfId value for this HsxCapabilitiesProfileData.
     * 
     * @return sCscfId
     */
    public java.lang.String getSCscfId() {
        return sCscfId;
    }


    /**
     * Sets the sCscfId value for this HsxCapabilitiesProfileData.
     * 
     * @param sCscfId
     */
    public void setSCscfId(java.lang.String sCscfId) {
        this.sCscfId = sCscfId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxCapabilitiesProfileData)) return false;
        HsxCapabilitiesProfileData other = (HsxCapabilitiesProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.capabilityId==null && other.getCapabilityId()==null) || 
             (this.capabilityId!=null &&
              this.capabilityId.equals(other.getCapabilityId()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.mandatoryCapabilities==null && other.getMandatoryCapabilities()==null) || 
             (this.mandatoryCapabilities!=null &&
              this.mandatoryCapabilities.equals(other.getMandatoryCapabilities()))) &&
            ((this.optionalCapabilities==null && other.getOptionalCapabilities()==null) || 
             (this.optionalCapabilities!=null &&
              this.optionalCapabilities.equals(other.getOptionalCapabilities()))) &&
            ((this.sCscfId==null && other.getSCscfId()==null) || 
             (this.sCscfId!=null &&
              this.sCscfId.equals(other.getSCscfId())));
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
        if (getCapabilityId() != null) {
            _hashCode += getCapabilityId().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getMandatoryCapabilities() != null) {
            _hashCode += getMandatoryCapabilities().hashCode();
        }
        if (getOptionalCapabilities() != null) {
            _hashCode += getOptionalCapabilities().hashCode();
        }
        if (getSCscfId() != null) {
            _hashCode += getSCscfId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxCapabilitiesProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxCapabilitiesProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capabilityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capabilityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatoryCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mandatoryCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionalCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "optionalCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCscfId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sCscfId"));
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
