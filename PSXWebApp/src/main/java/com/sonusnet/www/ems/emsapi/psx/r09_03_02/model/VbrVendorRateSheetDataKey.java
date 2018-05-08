/**
 * VbrVendorRateSheetDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class VbrVendorRateSheetDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String vendorId;

    private java.lang.String ratesheetId;

    private java.lang.String dialCode;

    private java.lang.Integer jurisdiction;

    public VbrVendorRateSheetDataKey() {
    }

    public VbrVendorRateSheetDataKey(
           java.lang.String vendorId,
           java.lang.String ratesheetId,
           java.lang.String dialCode,
           java.lang.Integer jurisdiction) {
        this.vendorId = vendorId;
        this.ratesheetId = ratesheetId;
        this.dialCode = dialCode;
        this.jurisdiction = jurisdiction;
    }


    /**
     * Gets the vendorId value for this VbrVendorRateSheetDataKey.
     * 
     * @return vendorId
     */
    public java.lang.String getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this VbrVendorRateSheetDataKey.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.String vendorId) {
        this.vendorId = vendorId;
    }


    /**
     * Gets the ratesheetId value for this VbrVendorRateSheetDataKey.
     * 
     * @return ratesheetId
     */
    public java.lang.String getRatesheetId() {
        return ratesheetId;
    }


    /**
     * Sets the ratesheetId value for this VbrVendorRateSheetDataKey.
     * 
     * @param ratesheetId
     */
    public void setRatesheetId(java.lang.String ratesheetId) {
        this.ratesheetId = ratesheetId;
    }


    /**
     * Gets the dialCode value for this VbrVendorRateSheetDataKey.
     * 
     * @return dialCode
     */
    public java.lang.String getDialCode() {
        return dialCode;
    }


    /**
     * Sets the dialCode value for this VbrVendorRateSheetDataKey.
     * 
     * @param dialCode
     */
    public void setDialCode(java.lang.String dialCode) {
        this.dialCode = dialCode;
    }


    /**
     * Gets the jurisdiction value for this VbrVendorRateSheetDataKey.
     * 
     * @return jurisdiction
     */
    public java.lang.Integer getJurisdiction() {
        return jurisdiction;
    }


    /**
     * Sets the jurisdiction value for this VbrVendorRateSheetDataKey.
     * 
     * @param jurisdiction
     */
    public void setJurisdiction(java.lang.Integer jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VbrVendorRateSheetDataKey)) return false;
        VbrVendorRateSheetDataKey other = (VbrVendorRateSheetDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vendorId==null && other.getVendorId()==null) || 
             (this.vendorId!=null &&
              this.vendorId.equals(other.getVendorId()))) &&
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
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
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
        new org.apache.axis.description.TypeDesc(VbrVendorRateSheetDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrVendorRateSheetDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorId"));
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
