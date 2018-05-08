/**
 * VbrMarginProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class VbrMarginProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String marginProfileId;

    private java.lang.Integer marginType;

    private java.lang.Integer marginPercent;

    private java.lang.Integer percentOrCurrency;

    private java.lang.String marginCurrency;

    private java.lang.String currencyCode;

    public VbrMarginProfile() {
    }

    public VbrMarginProfile(
           java.lang.String marginProfileId,
           java.lang.Integer marginType,
           java.lang.Integer marginPercent,
           java.lang.Integer percentOrCurrency,
           java.lang.String marginCurrency,
           java.lang.String currencyCode) {
        this.marginProfileId = marginProfileId;
        this.marginType = marginType;
        this.marginPercent = marginPercent;
        this.percentOrCurrency = percentOrCurrency;
        this.marginCurrency = marginCurrency;
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the marginProfileId value for this VbrMarginProfile.
     * 
     * @return marginProfileId
     */
    public java.lang.String getMarginProfileId() {
        return marginProfileId;
    }


    /**
     * Sets the marginProfileId value for this VbrMarginProfile.
     * 
     * @param marginProfileId
     */
    public void setMarginProfileId(java.lang.String marginProfileId) {
        this.marginProfileId = marginProfileId;
    }


    /**
     * Gets the marginType value for this VbrMarginProfile.
     * 
     * @return marginType
     */
    public java.lang.Integer getMarginType() {
        return marginType;
    }


    /**
     * Sets the marginType value for this VbrMarginProfile.
     * 
     * @param marginType
     */
    public void setMarginType(java.lang.Integer marginType) {
        this.marginType = marginType;
    }


    /**
     * Gets the marginPercent value for this VbrMarginProfile.
     * 
     * @return marginPercent
     */
    public java.lang.Integer getMarginPercent() {
        return marginPercent;
    }


    /**
     * Sets the marginPercent value for this VbrMarginProfile.
     * 
     * @param marginPercent
     */
    public void setMarginPercent(java.lang.Integer marginPercent) {
        this.marginPercent = marginPercent;
    }


    /**
     * Gets the percentOrCurrency value for this VbrMarginProfile.
     * 
     * @return percentOrCurrency
     */
    public java.lang.Integer getPercentOrCurrency() {
        return percentOrCurrency;
    }


    /**
     * Sets the percentOrCurrency value for this VbrMarginProfile.
     * 
     * @param percentOrCurrency
     */
    public void setPercentOrCurrency(java.lang.Integer percentOrCurrency) {
        this.percentOrCurrency = percentOrCurrency;
    }


    /**
     * Gets the marginCurrency value for this VbrMarginProfile.
     * 
     * @return marginCurrency
     */
    public java.lang.String getMarginCurrency() {
        return marginCurrency;
    }


    /**
     * Sets the marginCurrency value for this VbrMarginProfile.
     * 
     * @param marginCurrency
     */
    public void setMarginCurrency(java.lang.String marginCurrency) {
        this.marginCurrency = marginCurrency;
    }


    /**
     * Gets the currencyCode value for this VbrMarginProfile.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this VbrMarginProfile.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VbrMarginProfile)) return false;
        VbrMarginProfile other = (VbrMarginProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.marginProfileId==null && other.getMarginProfileId()==null) || 
             (this.marginProfileId!=null &&
              this.marginProfileId.equals(other.getMarginProfileId()))) &&
            ((this.marginType==null && other.getMarginType()==null) || 
             (this.marginType!=null &&
              this.marginType.equals(other.getMarginType()))) &&
            ((this.marginPercent==null && other.getMarginPercent()==null) || 
             (this.marginPercent!=null &&
              this.marginPercent.equals(other.getMarginPercent()))) &&
            ((this.percentOrCurrency==null && other.getPercentOrCurrency()==null) || 
             (this.percentOrCurrency!=null &&
              this.percentOrCurrency.equals(other.getPercentOrCurrency()))) &&
            ((this.marginCurrency==null && other.getMarginCurrency()==null) || 
             (this.marginCurrency!=null &&
              this.marginCurrency.equals(other.getMarginCurrency()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode())));
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
        if (getMarginProfileId() != null) {
            _hashCode += getMarginProfileId().hashCode();
        }
        if (getMarginType() != null) {
            _hashCode += getMarginType().hashCode();
        }
        if (getMarginPercent() != null) {
            _hashCode += getMarginPercent().hashCode();
        }
        if (getPercentOrCurrency() != null) {
            _hashCode += getPercentOrCurrency().hashCode();
        }
        if (getMarginCurrency() != null) {
            _hashCode += getMarginCurrency().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VbrMarginProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrMarginProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marginProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marginType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marginPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentOrCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentOrCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marginCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
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
