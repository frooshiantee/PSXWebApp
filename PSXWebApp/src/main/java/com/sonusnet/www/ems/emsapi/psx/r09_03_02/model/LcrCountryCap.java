/**
 * LcrCountryCap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class LcrCountryCap  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String countryId;

    private java.lang.String customerId;

    private java.lang.String vendorId;

    private java.lang.Short capRuleType;

    private java.lang.Short status;

    private java.lang.Integer minutesPurchased;

    private java.lang.Integer minutesUsed;

    private java.lang.String dollarsPurchased;

    private java.lang.String dollarsUsed;

    private java.lang.Short capReached;

    private java.lang.String capTimestamp;

    private java.lang.String auditStartDateTime;

    private java.lang.String auditEndDateTime;

    private java.lang.Integer numberOfDays;

    private java.lang.Short recurring;

    private java.lang.Short raiseTrap;

    private java.lang.Short blockCalls;

    private java.lang.Integer sequenceNumber;

    private java.lang.String description;

    public LcrCountryCap() {
    }

    public LcrCountryCap(
           java.lang.String countryId,
           java.lang.String customerId,
           java.lang.String vendorId,
           java.lang.Short capRuleType,
           java.lang.Short status,
           java.lang.Integer minutesPurchased,
           java.lang.Integer minutesUsed,
           java.lang.String dollarsPurchased,
           java.lang.String dollarsUsed,
           java.lang.Short capReached,
           java.lang.String capTimestamp,
           java.lang.String auditStartDateTime,
           java.lang.String auditEndDateTime,
           java.lang.Integer numberOfDays,
           java.lang.Short recurring,
           java.lang.Short raiseTrap,
           java.lang.Short blockCalls,
           java.lang.Integer sequenceNumber,
           java.lang.String description) {
        this.countryId = countryId;
        this.customerId = customerId;
        this.vendorId = vendorId;
        this.capRuleType = capRuleType;
        this.status = status;
        this.minutesPurchased = minutesPurchased;
        this.minutesUsed = minutesUsed;
        this.dollarsPurchased = dollarsPurchased;
        this.dollarsUsed = dollarsUsed;
        this.capReached = capReached;
        this.capTimestamp = capTimestamp;
        this.auditStartDateTime = auditStartDateTime;
        this.auditEndDateTime = auditEndDateTime;
        this.numberOfDays = numberOfDays;
        this.recurring = recurring;
        this.raiseTrap = raiseTrap;
        this.blockCalls = blockCalls;
        this.sequenceNumber = sequenceNumber;
        this.description = description;
    }


    /**
     * Gets the countryId value for this LcrCountryCap.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this LcrCountryCap.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the customerId value for this LcrCountryCap.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this LcrCountryCap.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the vendorId value for this LcrCountryCap.
     * 
     * @return vendorId
     */
    public java.lang.String getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this LcrCountryCap.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.String vendorId) {
        this.vendorId = vendorId;
    }


    /**
     * Gets the capRuleType value for this LcrCountryCap.
     * 
     * @return capRuleType
     */
    public java.lang.Short getCapRuleType() {
        return capRuleType;
    }


    /**
     * Sets the capRuleType value for this LcrCountryCap.
     * 
     * @param capRuleType
     */
    public void setCapRuleType(java.lang.Short capRuleType) {
        this.capRuleType = capRuleType;
    }


    /**
     * Gets the status value for this LcrCountryCap.
     * 
     * @return status
     */
    public java.lang.Short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LcrCountryCap.
     * 
     * @param status
     */
    public void setStatus(java.lang.Short status) {
        this.status = status;
    }


    /**
     * Gets the minutesPurchased value for this LcrCountryCap.
     * 
     * @return minutesPurchased
     */
    public java.lang.Integer getMinutesPurchased() {
        return minutesPurchased;
    }


    /**
     * Sets the minutesPurchased value for this LcrCountryCap.
     * 
     * @param minutesPurchased
     */
    public void setMinutesPurchased(java.lang.Integer minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }


    /**
     * Gets the minutesUsed value for this LcrCountryCap.
     * 
     * @return minutesUsed
     */
    public java.lang.Integer getMinutesUsed() {
        return minutesUsed;
    }


    /**
     * Sets the minutesUsed value for this LcrCountryCap.
     * 
     * @param minutesUsed
     */
    public void setMinutesUsed(java.lang.Integer minutesUsed) {
        this.minutesUsed = minutesUsed;
    }


    /**
     * Gets the dollarsPurchased value for this LcrCountryCap.
     * 
     * @return dollarsPurchased
     */
    public java.lang.String getDollarsPurchased() {
        return dollarsPurchased;
    }


    /**
     * Sets the dollarsPurchased value for this LcrCountryCap.
     * 
     * @param dollarsPurchased
     */
    public void setDollarsPurchased(java.lang.String dollarsPurchased) {
        this.dollarsPurchased = dollarsPurchased;
    }


    /**
     * Gets the dollarsUsed value for this LcrCountryCap.
     * 
     * @return dollarsUsed
     */
    public java.lang.String getDollarsUsed() {
        return dollarsUsed;
    }


    /**
     * Sets the dollarsUsed value for this LcrCountryCap.
     * 
     * @param dollarsUsed
     */
    public void setDollarsUsed(java.lang.String dollarsUsed) {
        this.dollarsUsed = dollarsUsed;
    }


    /**
     * Gets the capReached value for this LcrCountryCap.
     * 
     * @return capReached
     */
    public java.lang.Short getCapReached() {
        return capReached;
    }


    /**
     * Sets the capReached value for this LcrCountryCap.
     * 
     * @param capReached
     */
    public void setCapReached(java.lang.Short capReached) {
        this.capReached = capReached;
    }


    /**
     * Gets the capTimestamp value for this LcrCountryCap.
     * 
     * @return capTimestamp
     */
    public java.lang.String getCapTimestamp() {
        return capTimestamp;
    }


    /**
     * Sets the capTimestamp value for this LcrCountryCap.
     * 
     * @param capTimestamp
     */
    public void setCapTimestamp(java.lang.String capTimestamp) {
        this.capTimestamp = capTimestamp;
    }


    /**
     * Gets the auditStartDateTime value for this LcrCountryCap.
     * 
     * @return auditStartDateTime
     */
    public java.lang.String getAuditStartDateTime() {
        return auditStartDateTime;
    }


    /**
     * Sets the auditStartDateTime value for this LcrCountryCap.
     * 
     * @param auditStartDateTime
     */
    public void setAuditStartDateTime(java.lang.String auditStartDateTime) {
        this.auditStartDateTime = auditStartDateTime;
    }


    /**
     * Gets the auditEndDateTime value for this LcrCountryCap.
     * 
     * @return auditEndDateTime
     */
    public java.lang.String getAuditEndDateTime() {
        return auditEndDateTime;
    }


    /**
     * Sets the auditEndDateTime value for this LcrCountryCap.
     * 
     * @param auditEndDateTime
     */
    public void setAuditEndDateTime(java.lang.String auditEndDateTime) {
        this.auditEndDateTime = auditEndDateTime;
    }


    /**
     * Gets the numberOfDays value for this LcrCountryCap.
     * 
     * @return numberOfDays
     */
    public java.lang.Integer getNumberOfDays() {
        return numberOfDays;
    }


    /**
     * Sets the numberOfDays value for this LcrCountryCap.
     * 
     * @param numberOfDays
     */
    public void setNumberOfDays(java.lang.Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }


    /**
     * Gets the recurring value for this LcrCountryCap.
     * 
     * @return recurring
     */
    public java.lang.Short getRecurring() {
        return recurring;
    }


    /**
     * Sets the recurring value for this LcrCountryCap.
     * 
     * @param recurring
     */
    public void setRecurring(java.lang.Short recurring) {
        this.recurring = recurring;
    }


    /**
     * Gets the raiseTrap value for this LcrCountryCap.
     * 
     * @return raiseTrap
     */
    public java.lang.Short getRaiseTrap() {
        return raiseTrap;
    }


    /**
     * Sets the raiseTrap value for this LcrCountryCap.
     * 
     * @param raiseTrap
     */
    public void setRaiseTrap(java.lang.Short raiseTrap) {
        this.raiseTrap = raiseTrap;
    }


    /**
     * Gets the blockCalls value for this LcrCountryCap.
     * 
     * @return blockCalls
     */
    public java.lang.Short getBlockCalls() {
        return blockCalls;
    }


    /**
     * Sets the blockCalls value for this LcrCountryCap.
     * 
     * @param blockCalls
     */
    public void setBlockCalls(java.lang.Short blockCalls) {
        this.blockCalls = blockCalls;
    }


    /**
     * Gets the sequenceNumber value for this LcrCountryCap.
     * 
     * @return sequenceNumber
     */
    public java.lang.Integer getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this LcrCountryCap.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(java.lang.Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the description value for this LcrCountryCap.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LcrCountryCap.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LcrCountryCap)) return false;
        LcrCountryCap other = (LcrCountryCap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.vendorId==null && other.getVendorId()==null) || 
             (this.vendorId!=null &&
              this.vendorId.equals(other.getVendorId()))) &&
            ((this.capRuleType==null && other.getCapRuleType()==null) || 
             (this.capRuleType!=null &&
              this.capRuleType.equals(other.getCapRuleType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.minutesPurchased==null && other.getMinutesPurchased()==null) || 
             (this.minutesPurchased!=null &&
              this.minutesPurchased.equals(other.getMinutesPurchased()))) &&
            ((this.minutesUsed==null && other.getMinutesUsed()==null) || 
             (this.minutesUsed!=null &&
              this.minutesUsed.equals(other.getMinutesUsed()))) &&
            ((this.dollarsPurchased==null && other.getDollarsPurchased()==null) || 
             (this.dollarsPurchased!=null &&
              this.dollarsPurchased.equals(other.getDollarsPurchased()))) &&
            ((this.dollarsUsed==null && other.getDollarsUsed()==null) || 
             (this.dollarsUsed!=null &&
              this.dollarsUsed.equals(other.getDollarsUsed()))) &&
            ((this.capReached==null && other.getCapReached()==null) || 
             (this.capReached!=null &&
              this.capReached.equals(other.getCapReached()))) &&
            ((this.capTimestamp==null && other.getCapTimestamp()==null) || 
             (this.capTimestamp!=null &&
              this.capTimestamp.equals(other.getCapTimestamp()))) &&
            ((this.auditStartDateTime==null && other.getAuditStartDateTime()==null) || 
             (this.auditStartDateTime!=null &&
              this.auditStartDateTime.equals(other.getAuditStartDateTime()))) &&
            ((this.auditEndDateTime==null && other.getAuditEndDateTime()==null) || 
             (this.auditEndDateTime!=null &&
              this.auditEndDateTime.equals(other.getAuditEndDateTime()))) &&
            ((this.numberOfDays==null && other.getNumberOfDays()==null) || 
             (this.numberOfDays!=null &&
              this.numberOfDays.equals(other.getNumberOfDays()))) &&
            ((this.recurring==null && other.getRecurring()==null) || 
             (this.recurring!=null &&
              this.recurring.equals(other.getRecurring()))) &&
            ((this.raiseTrap==null && other.getRaiseTrap()==null) || 
             (this.raiseTrap!=null &&
              this.raiseTrap.equals(other.getRaiseTrap()))) &&
            ((this.blockCalls==null && other.getBlockCalls()==null) || 
             (this.blockCalls!=null &&
              this.blockCalls.equals(other.getBlockCalls()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        if (getCapRuleType() != null) {
            _hashCode += getCapRuleType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMinutesPurchased() != null) {
            _hashCode += getMinutesPurchased().hashCode();
        }
        if (getMinutesUsed() != null) {
            _hashCode += getMinutesUsed().hashCode();
        }
        if (getDollarsPurchased() != null) {
            _hashCode += getDollarsPurchased().hashCode();
        }
        if (getDollarsUsed() != null) {
            _hashCode += getDollarsUsed().hashCode();
        }
        if (getCapReached() != null) {
            _hashCode += getCapReached().hashCode();
        }
        if (getCapTimestamp() != null) {
            _hashCode += getCapTimestamp().hashCode();
        }
        if (getAuditStartDateTime() != null) {
            _hashCode += getAuditStartDateTime().hashCode();
        }
        if (getAuditEndDateTime() != null) {
            _hashCode += getAuditEndDateTime().hashCode();
        }
        if (getNumberOfDays() != null) {
            _hashCode += getNumberOfDays().hashCode();
        }
        if (getRecurring() != null) {
            _hashCode += getRecurring().hashCode();
        }
        if (getRaiseTrap() != null) {
            _hashCode += getRaiseTrap().hashCode();
        }
        if (getBlockCalls() != null) {
            _hashCode += getBlockCalls().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LcrCountryCap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrCountryCap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capRuleType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capRuleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesPurchased");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minutesPurchased"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minutesUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dollarsPurchased");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dollarsPurchased"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dollarsUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dollarsUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capReached");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capReached"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditStartDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditStartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditEndDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditEndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurring");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raiseTrap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "raiseTrap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
