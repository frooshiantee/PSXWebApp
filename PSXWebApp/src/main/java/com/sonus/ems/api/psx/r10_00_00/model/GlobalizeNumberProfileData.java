/**
 * GlobalizeNumberProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class GlobalizeNumberProfileData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String globalizeProfileId;
    private java.lang.Integer numberType;
    private java.lang.Integer digitType;
    private java.lang.Short countryCode;
    private java.lang.Short globalizeFlag;

    public GlobalizeNumberProfileData() {
    }

    public GlobalizeNumberProfileData(
           java.lang.String globalizeProfileId,
           java.lang.Integer numberType,
           java.lang.Integer digitType,
           java.lang.Short countryCode,
           java.lang.Short globalizeFlag) {
           this.globalizeProfileId = globalizeProfileId;
           this.numberType = numberType;
           this.digitType = digitType;
           this.countryCode = countryCode;
           this.globalizeFlag = globalizeFlag;
    }


    /**
     * Gets the globalizeProfileId value for this GlobalizeNumberProfileData.
     * 
     * @return globalizeProfileId
     */
    public java.lang.String getGlobalizeProfileId() {
        return globalizeProfileId;
    }


    /**
     * Sets the globalizeProfileId value for this GlobalizeNumberProfileData.
     * 
     * @param globalizeProfileId
     */
    public void setGlobalizeProfileId(java.lang.String globalizeProfileId) {
        this.globalizeProfileId = globalizeProfileId;
    }


    /**
     * Gets the numberType value for this GlobalizeNumberProfileData.
     * 
     * @return numberType
     */
    public java.lang.Integer getNumberType() {
        return numberType;
    }


    /**
     * Sets the numberType value for this GlobalizeNumberProfileData.
     * 
     * @param numberType
     */
    public void setNumberType(java.lang.Integer numberType) {
        this.numberType = numberType;
    }


    /**
     * Gets the digitType value for this GlobalizeNumberProfileData.
     * 
     * @return digitType
     */
    public java.lang.Integer getDigitType() {
        return digitType;
    }


    /**
     * Sets the digitType value for this GlobalizeNumberProfileData.
     * 
     * @param digitType
     */
    public void setDigitType(java.lang.Integer digitType) {
        this.digitType = digitType;
    }


    /**
     * Gets the countryCode value for this GlobalizeNumberProfileData.
     * 
     * @return countryCode
     */
    public java.lang.Short getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this GlobalizeNumberProfileData.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.Short countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the globalizeFlag value for this GlobalizeNumberProfileData.
     * 
     * @return globalizeFlag
     */
    public java.lang.Short getGlobalizeFlag() {
        return globalizeFlag;
    }


    /**
     * Sets the globalizeFlag value for this GlobalizeNumberProfileData.
     * 
     * @param globalizeFlag
     */
    public void setGlobalizeFlag(java.lang.Short globalizeFlag) {
        this.globalizeFlag = globalizeFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalizeNumberProfileData)) return false;
        GlobalizeNumberProfileData other = (GlobalizeNumberProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.globalizeProfileId==null && other.getGlobalizeProfileId()==null) || 
             (this.globalizeProfileId!=null &&
              this.globalizeProfileId.equals(other.getGlobalizeProfileId()))) &&
            ((this.numberType==null && other.getNumberType()==null) || 
             (this.numberType!=null &&
              this.numberType.equals(other.getNumberType()))) &&
            ((this.digitType==null && other.getDigitType()==null) || 
             (this.digitType!=null &&
              this.digitType.equals(other.getDigitType()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.globalizeFlag==null && other.getGlobalizeFlag()==null) || 
             (this.globalizeFlag!=null &&
              this.globalizeFlag.equals(other.getGlobalizeFlag())));
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
        if (getGlobalizeProfileId() != null) {
            _hashCode += getGlobalizeProfileId().hashCode();
        }
        if (getNumberType() != null) {
            _hashCode += getNumberType().hashCode();
        }
        if (getDigitType() != null) {
            _hashCode += getDigitType().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getGlobalizeFlag() != null) {
            _hashCode += getGlobalizeFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalizeNumberProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GlobalizeNumberProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalizeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalizeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalizeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalizeFlag"));
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
