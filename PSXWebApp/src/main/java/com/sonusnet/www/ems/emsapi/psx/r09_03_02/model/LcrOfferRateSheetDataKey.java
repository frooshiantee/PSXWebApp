/**
 * LcrOfferRateSheetDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class LcrOfferRateSheetDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String offerId;

    private java.lang.String ratesheetId;

    private java.lang.String dialCode;

    private java.lang.Integer jurisdiction;

    public LcrOfferRateSheetDataKey() {
    }

    public LcrOfferRateSheetDataKey(
           java.lang.String offerId,
           java.lang.String ratesheetId,
           java.lang.String dialCode,
           java.lang.Integer jurisdiction) {
        this.offerId = offerId;
        this.ratesheetId = ratesheetId;
        this.dialCode = dialCode;
        this.jurisdiction = jurisdiction;
    }


    /**
     * Gets the offerId value for this LcrOfferRateSheetDataKey.
     * 
     * @return offerId
     */
    public java.lang.String getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this LcrOfferRateSheetDataKey.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.String offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the ratesheetId value for this LcrOfferRateSheetDataKey.
     * 
     * @return ratesheetId
     */
    public java.lang.String getRatesheetId() {
        return ratesheetId;
    }


    /**
     * Sets the ratesheetId value for this LcrOfferRateSheetDataKey.
     * 
     * @param ratesheetId
     */
    public void setRatesheetId(java.lang.String ratesheetId) {
        this.ratesheetId = ratesheetId;
    }


    /**
     * Gets the dialCode value for this LcrOfferRateSheetDataKey.
     * 
     * @return dialCode
     */
    public java.lang.String getDialCode() {
        return dialCode;
    }


    /**
     * Sets the dialCode value for this LcrOfferRateSheetDataKey.
     * 
     * @param dialCode
     */
    public void setDialCode(java.lang.String dialCode) {
        this.dialCode = dialCode;
    }


    /**
     * Gets the jurisdiction value for this LcrOfferRateSheetDataKey.
     * 
     * @return jurisdiction
     */
    public java.lang.Integer getJurisdiction() {
        return jurisdiction;
    }


    /**
     * Sets the jurisdiction value for this LcrOfferRateSheetDataKey.
     * 
     * @param jurisdiction
     */
    public void setJurisdiction(java.lang.Integer jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LcrOfferRateSheetDataKey)) return false;
        LcrOfferRateSheetDataKey other = (LcrOfferRateSheetDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.offerId==null && other.getOfferId()==null) || 
             (this.offerId!=null &&
              this.offerId.equals(other.getOfferId()))) &&
            ((this.ratesheetId==null && other.getRatesheetId()==null) || 
             (this.ratesheetId!=null &&
              this.ratesheetId.equals(other.getRatesheetId()))) &&
            ((this.dialCode==null && other.getDialCode()==null) || 
             (this.dialCode!=null &&
              this.dialCode.equals(other.getDialCode()))) &&
            ((this.jurisdiction==null && other.getJurisdiction()==null) || 
             (this.jurisdiction!=null &&
              this.jurisdiction.equals(other.getJurisdiction())));
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
        if (getOfferId() != null) {
            _hashCode += getOfferId().hashCode();
        }
        if (getRatesheetId() != null) {
            _hashCode += getRatesheetId().hashCode();
        }
        if (getDialCode() != null) {
            _hashCode += getDialCode().hashCode();
        }
        if (getJurisdiction() != null) {
            _hashCode += getJurisdiction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LcrOfferRateSheetDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrOfferRateSheetDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratesheetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratesheetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dialCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dialCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jurisdiction"));
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
