/**
 * ChargeRateProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ChargeRateProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String chargeRateProfileId;

    private java.lang.String description;

    private java.lang.Short chargeUnit;

    private java.lang.Short currencyType;

    private java.lang.Short currencyScale;

    private java.lang.Short timeUnit;

    private java.lang.Integer nationalRegAuth;

    private java.lang.Integer network;

    public ChargeRateProfile() {
    }

    public ChargeRateProfile(
           java.lang.String chargeRateProfileId,
           java.lang.String description,
           java.lang.Short chargeUnit,
           java.lang.Short currencyType,
           java.lang.Short currencyScale,
           java.lang.Short timeUnit,
           java.lang.Integer nationalRegAuth,
           java.lang.Integer network) {
        this.chargeRateProfileId = chargeRateProfileId;
        this.description = description;
        this.chargeUnit = chargeUnit;
        this.currencyType = currencyType;
        this.currencyScale = currencyScale;
        this.timeUnit = timeUnit;
        this.nationalRegAuth = nationalRegAuth;
        this.network = network;
    }


    /**
     * Gets the chargeRateProfileId value for this ChargeRateProfile.
     * 
     * @return chargeRateProfileId
     */
    public java.lang.String getChargeRateProfileId() {
        return chargeRateProfileId;
    }


    /**
     * Sets the chargeRateProfileId value for this ChargeRateProfile.
     * 
     * @param chargeRateProfileId
     */
    public void setChargeRateProfileId(java.lang.String chargeRateProfileId) {
        this.chargeRateProfileId = chargeRateProfileId;
    }


    /**
     * Gets the description value for this ChargeRateProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ChargeRateProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the chargeUnit value for this ChargeRateProfile.
     * 
     * @return chargeUnit
     */
    public java.lang.Short getChargeUnit() {
        return chargeUnit;
    }


    /**
     * Sets the chargeUnit value for this ChargeRateProfile.
     * 
     * @param chargeUnit
     */
    public void setChargeUnit(java.lang.Short chargeUnit) {
        this.chargeUnit = chargeUnit;
    }


    /**
     * Gets the currencyType value for this ChargeRateProfile.
     * 
     * @return currencyType
     */
    public java.lang.Short getCurrencyType() {
        return currencyType;
    }


    /**
     * Sets the currencyType value for this ChargeRateProfile.
     * 
     * @param currencyType
     */
    public void setCurrencyType(java.lang.Short currencyType) {
        this.currencyType = currencyType;
    }


    /**
     * Gets the currencyScale value for this ChargeRateProfile.
     * 
     * @return currencyScale
     */
    public java.lang.Short getCurrencyScale() {
        return currencyScale;
    }


    /**
     * Sets the currencyScale value for this ChargeRateProfile.
     * 
     * @param currencyScale
     */
    public void setCurrencyScale(java.lang.Short currencyScale) {
        this.currencyScale = currencyScale;
    }


    /**
     * Gets the timeUnit value for this ChargeRateProfile.
     * 
     * @return timeUnit
     */
    public java.lang.Short getTimeUnit() {
        return timeUnit;
    }


    /**
     * Sets the timeUnit value for this ChargeRateProfile.
     * 
     * @param timeUnit
     */
    public void setTimeUnit(java.lang.Short timeUnit) {
        this.timeUnit = timeUnit;
    }


    /**
     * Gets the nationalRegAuth value for this ChargeRateProfile.
     * 
     * @return nationalRegAuth
     */
    public java.lang.Integer getNationalRegAuth() {
        return nationalRegAuth;
    }


    /**
     * Sets the nationalRegAuth value for this ChargeRateProfile.
     * 
     * @param nationalRegAuth
     */
    public void setNationalRegAuth(java.lang.Integer nationalRegAuth) {
        this.nationalRegAuth = nationalRegAuth;
    }


    /**
     * Gets the network value for this ChargeRateProfile.
     * 
     * @return network
     */
    public java.lang.Integer getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this ChargeRateProfile.
     * 
     * @param network
     */
    public void setNetwork(java.lang.Integer network) {
        this.network = network;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeRateProfile)) return false;
        ChargeRateProfile other = (ChargeRateProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.chargeRateProfileId==null && other.getChargeRateProfileId()==null) || 
             (this.chargeRateProfileId!=null &&
              this.chargeRateProfileId.equals(other.getChargeRateProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.chargeUnit==null && other.getChargeUnit()==null) || 
             (this.chargeUnit!=null &&
              this.chargeUnit.equals(other.getChargeUnit()))) &&
            ((this.currencyType==null && other.getCurrencyType()==null) || 
             (this.currencyType!=null &&
              this.currencyType.equals(other.getCurrencyType()))) &&
            ((this.currencyScale==null && other.getCurrencyScale()==null) || 
             (this.currencyScale!=null &&
              this.currencyScale.equals(other.getCurrencyScale()))) &&
            ((this.timeUnit==null && other.getTimeUnit()==null) || 
             (this.timeUnit!=null &&
              this.timeUnit.equals(other.getTimeUnit()))) &&
            ((this.nationalRegAuth==null && other.getNationalRegAuth()==null) || 
             (this.nationalRegAuth!=null &&
              this.nationalRegAuth.equals(other.getNationalRegAuth()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork())));
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
        if (getChargeRateProfileId() != null) {
            _hashCode += getChargeRateProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getChargeUnit() != null) {
            _hashCode += getChargeUnit().hashCode();
        }
        if (getCurrencyType() != null) {
            _hashCode += getCurrencyType().hashCode();
        }
        if (getCurrencyScale() != null) {
            _hashCode += getCurrencyScale().hashCode();
        }
        if (getTimeUnit() != null) {
            _hashCode += getTimeUnit().hashCode();
        }
        if (getNationalRegAuth() != null) {
            _hashCode += getNationalRegAuth().hashCode();
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeRateProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeRateProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeRateProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeRateProfileId"));
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
        elemField.setFieldName("chargeUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyScale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyScale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalRegAuth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalRegAuth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network"));
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
