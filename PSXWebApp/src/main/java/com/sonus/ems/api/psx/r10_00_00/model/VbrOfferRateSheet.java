/**
 * VbrOfferRateSheet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class VbrOfferRateSheet  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String offerId;
    private java.lang.String ratesheetId;
    private java.lang.String description;
    private java.lang.Integer vbrStatus;
    private java.lang.String currencyCode;
    private java.lang.String dateLoaded;
    private java.lang.String effectiveDate;
    private java.lang.String expiryDate;
    private java.lang.String rateSheetFile;
    private java.lang.Integer lcrRateSheetType;

    public VbrOfferRateSheet() {
    }

    public VbrOfferRateSheet(
           java.lang.String offerId,
           java.lang.String ratesheetId,
           java.lang.String description,
           java.lang.Integer vbrStatus,
           java.lang.String currencyCode,
           java.lang.String dateLoaded,
           java.lang.String effectiveDate,
           java.lang.String expiryDate,
           java.lang.String rateSheetFile,
           java.lang.Integer lcrRateSheetType) {
           this.offerId = offerId;
           this.ratesheetId = ratesheetId;
           this.description = description;
           this.vbrStatus = vbrStatus;
           this.currencyCode = currencyCode;
           this.dateLoaded = dateLoaded;
           this.effectiveDate = effectiveDate;
           this.expiryDate = expiryDate;
           this.rateSheetFile = rateSheetFile;
           this.lcrRateSheetType = lcrRateSheetType;
    }


    /**
     * Gets the offerId value for this VbrOfferRateSheet.
     * 
     * @return offerId
     */
    public java.lang.String getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this VbrOfferRateSheet.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.String offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the ratesheetId value for this VbrOfferRateSheet.
     * 
     * @return ratesheetId
     */
    public java.lang.String getRatesheetId() {
        return ratesheetId;
    }


    /**
     * Sets the ratesheetId value for this VbrOfferRateSheet.
     * 
     * @param ratesheetId
     */
    public void setRatesheetId(java.lang.String ratesheetId) {
        this.ratesheetId = ratesheetId;
    }


    /**
     * Gets the description value for this VbrOfferRateSheet.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this VbrOfferRateSheet.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the vbrStatus value for this VbrOfferRateSheet.
     * 
     * @return vbrStatus
     */
    public java.lang.Integer getVbrStatus() {
        return vbrStatus;
    }


    /**
     * Sets the vbrStatus value for this VbrOfferRateSheet.
     * 
     * @param vbrStatus
     */
    public void setVbrStatus(java.lang.Integer vbrStatus) {
        this.vbrStatus = vbrStatus;
    }


    /**
     * Gets the currencyCode value for this VbrOfferRateSheet.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this VbrOfferRateSheet.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the dateLoaded value for this VbrOfferRateSheet.
     * 
     * @return dateLoaded
     */
    public java.lang.String getDateLoaded() {
        return dateLoaded;
    }


    /**
     * Sets the dateLoaded value for this VbrOfferRateSheet.
     * 
     * @param dateLoaded
     */
    public void setDateLoaded(java.lang.String dateLoaded) {
        this.dateLoaded = dateLoaded;
    }


    /**
     * Gets the effectiveDate value for this VbrOfferRateSheet.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this VbrOfferRateSheet.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expiryDate value for this VbrOfferRateSheet.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this VbrOfferRateSheet.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the rateSheetFile value for this VbrOfferRateSheet.
     * 
     * @return rateSheetFile
     */
    public java.lang.String getRateSheetFile() {
        return rateSheetFile;
    }


    /**
     * Sets the rateSheetFile value for this VbrOfferRateSheet.
     * 
     * @param rateSheetFile
     */
    public void setRateSheetFile(java.lang.String rateSheetFile) {
        this.rateSheetFile = rateSheetFile;
    }


    /**
     * Gets the lcrRateSheetType value for this VbrOfferRateSheet.
     * 
     * @return lcrRateSheetType
     */
    public java.lang.Integer getLcrRateSheetType() {
        return lcrRateSheetType;
    }


    /**
     * Sets the lcrRateSheetType value for this VbrOfferRateSheet.
     * 
     * @param lcrRateSheetType
     */
    public void setLcrRateSheetType(java.lang.Integer lcrRateSheetType) {
        this.lcrRateSheetType = lcrRateSheetType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VbrOfferRateSheet)) return false;
        VbrOfferRateSheet other = (VbrOfferRateSheet) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.vbrStatus==null && other.getVbrStatus()==null) || 
             (this.vbrStatus!=null &&
              this.vbrStatus.equals(other.getVbrStatus()))) &&
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
              this.rateSheetFile.equals(other.getRateSheetFile()))) &&
            ((this.lcrRateSheetType==null && other.getLcrRateSheetType()==null) || 
             (this.lcrRateSheetType!=null &&
              this.lcrRateSheetType.equals(other.getLcrRateSheetType())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getVbrStatus() != null) {
            _hashCode += getVbrStatus().hashCode();
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
        if (getLcrRateSheetType() != null) {
            _hashCode += getLcrRateSheetType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VbrOfferRateSheet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferRateSheet"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vbrStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vbrStatus"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lcrRateSheetType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lcrRateSheetType"));
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
