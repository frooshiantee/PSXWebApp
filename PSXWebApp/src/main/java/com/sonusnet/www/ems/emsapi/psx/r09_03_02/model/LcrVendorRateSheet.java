/**
 * LcrVendorRateSheet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class LcrVendorRateSheet  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String vendorId;

    private java.lang.String ratesheetId;

    private java.lang.String description;

    private java.lang.Integer lcrStatus;

    private java.lang.String currencyCode;

    private java.lang.String dateLoaded;

    private java.lang.String effectiveDate;

    private java.lang.String expiryDate;

    private java.lang.String rateSheetFile;

    public LcrVendorRateSheet() {
    }

    public LcrVendorRateSheet(
           java.lang.String vendorId,
           java.lang.String ratesheetId,
           java.lang.String description,
           java.lang.Integer lcrStatus,
           java.lang.String currencyCode,
           java.lang.String dateLoaded,
           java.lang.String effectiveDate,
           java.lang.String expiryDate,
           java.lang.String rateSheetFile) {
        this.vendorId = vendorId;
        this.ratesheetId = ratesheetId;
        this.description = description;
        this.lcrStatus = lcrStatus;
        this.currencyCode = currencyCode;
        this.dateLoaded = dateLoaded;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
        this.rateSheetFile = rateSheetFile;
    }


    /**
     * Gets the vendorId value for this LcrVendorRateSheet.
     * 
     * @return vendorId
     */
    public java.lang.String getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this LcrVendorRateSheet.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.String vendorId) {
        this.vendorId = vendorId;
    }


    /**
     * Gets the ratesheetId value for this LcrVendorRateSheet.
     * 
     * @return ratesheetId
     */
    public java.lang.String getRatesheetId() {
        return ratesheetId;
    }


    /**
     * Sets the ratesheetId value for this LcrVendorRateSheet.
     * 
     * @param ratesheetId
     */
    public void setRatesheetId(java.lang.String ratesheetId) {
        this.ratesheetId = ratesheetId;
    }


    /**
     * Gets the description value for this LcrVendorRateSheet.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LcrVendorRateSheet.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the lcrStatus value for this LcrVendorRateSheet.
     * 
     * @return lcrStatus
     */
    public java.lang.Integer getLcrStatus() {
        return lcrStatus;
    }


    /**
     * Sets the lcrStatus value for this LcrVendorRateSheet.
     * 
     * @param lcrStatus
     */
    public void setLcrStatus(java.lang.Integer lcrStatus) {
        this.lcrStatus = lcrStatus;
    }


    /**
     * Gets the currencyCode value for this LcrVendorRateSheet.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this LcrVendorRateSheet.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the dateLoaded value for this LcrVendorRateSheet.
     * 
     * @return dateLoaded
     */
    public java.lang.String getDateLoaded() {
        return dateLoaded;
    }


    /**
     * Sets the dateLoaded value for this LcrVendorRateSheet.
     * 
     * @param dateLoaded
     */
    public void setDateLoaded(java.lang.String dateLoaded) {
        this.dateLoaded = dateLoaded;
    }


    /**
     * Gets the effectiveDate value for this LcrVendorRateSheet.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this LcrVendorRateSheet.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expiryDate value for this LcrVendorRateSheet.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this LcrVendorRateSheet.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the rateSheetFile value for this LcrVendorRateSheet.
     * 
     * @return rateSheetFile
     */
    public java.lang.String getRateSheetFile() {
        return rateSheetFile;
    }


    /**
     * Sets the rateSheetFile value for this LcrVendorRateSheet.
     * 
     * @param rateSheetFile
     */
    public void setRateSheetFile(java.lang.String rateSheetFile) {
        this.rateSheetFile = rateSheetFile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LcrVendorRateSheet)) return false;
        LcrVendorRateSheet other = (LcrVendorRateSheet) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.lcrStatus==null && other.getLcrStatus()==null) || 
             (this.lcrStatus!=null &&
              this.lcrStatus.equals(other.getLcrStatus()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.dateLoaded==null && other.getDateLoaded()==null) || 
             (this.dateLoaded!=null &&
              this.dateLoaded.equals(other.getDateLoaded()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.rateSheetFile==null && other.getRateSheetFile()==null) || 
             (this.rateSheetFile!=null &&
              this.rateSheetFile.equals(other.getRateSheetFile())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLcrStatus() != null) {
            _hashCode += getLcrStatus().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getDateLoaded() != null) {
            _hashCode += getDateLoaded().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getRateSheetFile() != null) {
            _hashCode += getRateSheetFile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LcrVendorRateSheet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrVendorRateSheet"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lcrStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lcrStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLoaded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateLoaded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateSheetFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateSheetFile"));
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
