/**
 * NumberControlProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class NumberControlProfileData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String numberControlProfileId;

    private java.lang.String countryId;

    private java.lang.String nationalId;

    private java.lang.Integer redirectionCapabilityFlag;

    private java.lang.Integer attributes;

    private java.lang.String callParamFilterGroupId;

    private java.lang.String carrierCodeProfileId;

    private java.lang.String redirectionInfoId;

    private java.lang.String canonicalName;

    public NumberControlProfileData() {
    }

    public NumberControlProfileData(
           java.lang.String numberControlProfileId,
           java.lang.String countryId,
           java.lang.String nationalId,
           java.lang.Integer redirectionCapabilityFlag,
           java.lang.Integer attributes,
           java.lang.String callParamFilterGroupId,
           java.lang.String carrierCodeProfileId,
           java.lang.String redirectionInfoId,
           java.lang.String canonicalName) {
        this.numberControlProfileId = numberControlProfileId;
        this.countryId = countryId;
        this.nationalId = nationalId;
        this.redirectionCapabilityFlag = redirectionCapabilityFlag;
        this.attributes = attributes;
        this.callParamFilterGroupId = callParamFilterGroupId;
        this.carrierCodeProfileId = carrierCodeProfileId;
        this.redirectionInfoId = redirectionInfoId;
        this.canonicalName = canonicalName;
    }


    /**
     * Gets the numberControlProfileId value for this NumberControlProfileData.
     * 
     * @return numberControlProfileId
     */
    public java.lang.String getNumberControlProfileId() {
        return numberControlProfileId;
    }


    /**
     * Sets the numberControlProfileId value for this NumberControlProfileData.
     * 
     * @param numberControlProfileId
     */
    public void setNumberControlProfileId(java.lang.String numberControlProfileId) {
        this.numberControlProfileId = numberControlProfileId;
    }


    /**
     * Gets the countryId value for this NumberControlProfileData.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this NumberControlProfileData.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the nationalId value for this NumberControlProfileData.
     * 
     * @return nationalId
     */
    public java.lang.String getNationalId() {
        return nationalId;
    }


    /**
     * Sets the nationalId value for this NumberControlProfileData.
     * 
     * @param nationalId
     */
    public void setNationalId(java.lang.String nationalId) {
        this.nationalId = nationalId;
    }


    /**
     * Gets the redirectionCapabilityFlag value for this NumberControlProfileData.
     * 
     * @return redirectionCapabilityFlag
     */
    public java.lang.Integer getRedirectionCapabilityFlag() {
        return redirectionCapabilityFlag;
    }


    /**
     * Sets the redirectionCapabilityFlag value for this NumberControlProfileData.
     * 
     * @param redirectionCapabilityFlag
     */
    public void setRedirectionCapabilityFlag(java.lang.Integer redirectionCapabilityFlag) {
        this.redirectionCapabilityFlag = redirectionCapabilityFlag;
    }


    /**
     * Gets the attributes value for this NumberControlProfileData.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this NumberControlProfileData.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the callParamFilterGroupId value for this NumberControlProfileData.
     * 
     * @return callParamFilterGroupId
     */
    public java.lang.String getCallParamFilterGroupId() {
        return callParamFilterGroupId;
    }


    /**
     * Sets the callParamFilterGroupId value for this NumberControlProfileData.
     * 
     * @param callParamFilterGroupId
     */
    public void setCallParamFilterGroupId(java.lang.String callParamFilterGroupId) {
        this.callParamFilterGroupId = callParamFilterGroupId;
    }


    /**
     * Gets the carrierCodeProfileId value for this NumberControlProfileData.
     * 
     * @return carrierCodeProfileId
     */
    public java.lang.String getCarrierCodeProfileId() {
        return carrierCodeProfileId;
    }


    /**
     * Sets the carrierCodeProfileId value for this NumberControlProfileData.
     * 
     * @param carrierCodeProfileId
     */
    public void setCarrierCodeProfileId(java.lang.String carrierCodeProfileId) {
        this.carrierCodeProfileId = carrierCodeProfileId;
    }


    /**
     * Gets the redirectionInfoId value for this NumberControlProfileData.
     * 
     * @return redirectionInfoId
     */
    public java.lang.String getRedirectionInfoId() {
        return redirectionInfoId;
    }


    /**
     * Sets the redirectionInfoId value for this NumberControlProfileData.
     * 
     * @param redirectionInfoId
     */
    public void setRedirectionInfoId(java.lang.String redirectionInfoId) {
        this.redirectionInfoId = redirectionInfoId;
    }


    /**
     * Gets the canonicalName value for this NumberControlProfileData.
     * 
     * @return canonicalName
     */
    public java.lang.String getCanonicalName() {
        return canonicalName;
    }


    /**
     * Sets the canonicalName value for this NumberControlProfileData.
     * 
     * @param canonicalName
     */
    public void setCanonicalName(java.lang.String canonicalName) {
        this.canonicalName = canonicalName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumberControlProfileData)) return false;
        NumberControlProfileData other = (NumberControlProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numberControlProfileId==null && other.getNumberControlProfileId()==null) || 
             (this.numberControlProfileId!=null &&
              this.numberControlProfileId.equals(other.getNumberControlProfileId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.nationalId==null && other.getNationalId()==null) || 
             (this.nationalId!=null &&
              this.nationalId.equals(other.getNationalId()))) &&
            ((this.redirectionCapabilityFlag==null && other.getRedirectionCapabilityFlag()==null) || 
             (this.redirectionCapabilityFlag!=null &&
              this.redirectionCapabilityFlag.equals(other.getRedirectionCapabilityFlag()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.callParamFilterGroupId==null && other.getCallParamFilterGroupId()==null) || 
             (this.callParamFilterGroupId!=null &&
              this.callParamFilterGroupId.equals(other.getCallParamFilterGroupId()))) &&
            ((this.carrierCodeProfileId==null && other.getCarrierCodeProfileId()==null) || 
             (this.carrierCodeProfileId!=null &&
              this.carrierCodeProfileId.equals(other.getCarrierCodeProfileId()))) &&
            ((this.redirectionInfoId==null && other.getRedirectionInfoId()==null) || 
             (this.redirectionInfoId!=null &&
              this.redirectionInfoId.equals(other.getRedirectionInfoId()))) &&
            ((this.canonicalName==null && other.getCanonicalName()==null) || 
             (this.canonicalName!=null &&
              this.canonicalName.equals(other.getCanonicalName())));
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
        if (getNumberControlProfileId() != null) {
            _hashCode += getNumberControlProfileId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getNationalId() != null) {
            _hashCode += getNationalId().hashCode();
        }
        if (getRedirectionCapabilityFlag() != null) {
            _hashCode += getRedirectionCapabilityFlag().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getCallParamFilterGroupId() != null) {
            _hashCode += getCallParamFilterGroupId().hashCode();
        }
        if (getCarrierCodeProfileId() != null) {
            _hashCode += getCarrierCodeProfileId().hashCode();
        }
        if (getRedirectionInfoId() != null) {
            _hashCode += getRedirectionInfoId().hashCode();
        }
        if (getCanonicalName() != null) {
            _hashCode += getCanonicalName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumberControlProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberControlProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberControlProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectionCapabilityFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirectionCapabilityFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParamFilterGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCodeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCodeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectionInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirectionInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canonicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canonicalName"));
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
