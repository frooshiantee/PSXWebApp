/**
 * ChargeRateProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ChargeRateProfileData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String chargeRateProfileId;
    private java.lang.String timeRangeProfileId;
    private java.lang.Integer callAttemptCharge;
    private java.lang.Integer callCompletionCharge;
    private java.lang.Integer subtariff1;
    private java.lang.Integer subtariff2;
    private java.lang.Integer subtariff3;
    private java.lang.Integer subtariff4;
    private java.lang.Integer subtariff1Duration;
    private java.lang.Integer subtariff2Duration;
    private java.lang.Integer subtariff3Duration;
    private java.lang.Integer subtariff4Duration;
    private java.lang.Integer subtariff1TimeInterval;
    private java.lang.Integer subtariff2TimeInterval;
    private java.lang.Integer subtariff3TimeInterval;
    private java.lang.Integer subtariff4TimeInterval;
    private java.lang.Integer attributes;

    public ChargeRateProfileData() {
    }

    public ChargeRateProfileData(
           java.lang.String chargeRateProfileId,
           java.lang.String timeRangeProfileId,
           java.lang.Integer callAttemptCharge,
           java.lang.Integer callCompletionCharge,
           java.lang.Integer subtariff1,
           java.lang.Integer subtariff2,
           java.lang.Integer subtariff3,
           java.lang.Integer subtariff4,
           java.lang.Integer subtariff1Duration,
           java.lang.Integer subtariff2Duration,
           java.lang.Integer subtariff3Duration,
           java.lang.Integer subtariff4Duration,
           java.lang.Integer subtariff1TimeInterval,
           java.lang.Integer subtariff2TimeInterval,
           java.lang.Integer subtariff3TimeInterval,
           java.lang.Integer subtariff4TimeInterval,
           java.lang.Integer attributes) {
           this.chargeRateProfileId = chargeRateProfileId;
           this.timeRangeProfileId = timeRangeProfileId;
           this.callAttemptCharge = callAttemptCharge;
           this.callCompletionCharge = callCompletionCharge;
           this.subtariff1 = subtariff1;
           this.subtariff2 = subtariff2;
           this.subtariff3 = subtariff3;
           this.subtariff4 = subtariff4;
           this.subtariff1Duration = subtariff1Duration;
           this.subtariff2Duration = subtariff2Duration;
           this.subtariff3Duration = subtariff3Duration;
           this.subtariff4Duration = subtariff4Duration;
           this.subtariff1TimeInterval = subtariff1TimeInterval;
           this.subtariff2TimeInterval = subtariff2TimeInterval;
           this.subtariff3TimeInterval = subtariff3TimeInterval;
           this.subtariff4TimeInterval = subtariff4TimeInterval;
           this.attributes = attributes;
    }


    /**
     * Gets the chargeRateProfileId value for this ChargeRateProfileData.
     * 
     * @return chargeRateProfileId
     */
    public java.lang.String getChargeRateProfileId() {
        return chargeRateProfileId;
    }


    /**
     * Sets the chargeRateProfileId value for this ChargeRateProfileData.
     * 
     * @param chargeRateProfileId
     */
    public void setChargeRateProfileId(java.lang.String chargeRateProfileId) {
        this.chargeRateProfileId = chargeRateProfileId;
    }


    /**
     * Gets the timeRangeProfileId value for this ChargeRateProfileData.
     * 
     * @return timeRangeProfileId
     */
    public java.lang.String getTimeRangeProfileId() {
        return timeRangeProfileId;
    }


    /**
     * Sets the timeRangeProfileId value for this ChargeRateProfileData.
     * 
     * @param timeRangeProfileId
     */
    public void setTimeRangeProfileId(java.lang.String timeRangeProfileId) {
        this.timeRangeProfileId = timeRangeProfileId;
    }


    /**
     * Gets the callAttemptCharge value for this ChargeRateProfileData.
     * 
     * @return callAttemptCharge
     */
    public java.lang.Integer getCallAttemptCharge() {
        return callAttemptCharge;
    }


    /**
     * Sets the callAttemptCharge value for this ChargeRateProfileData.
     * 
     * @param callAttemptCharge
     */
    public void setCallAttemptCharge(java.lang.Integer callAttemptCharge) {
        this.callAttemptCharge = callAttemptCharge;
    }


    /**
     * Gets the callCompletionCharge value for this ChargeRateProfileData.
     * 
     * @return callCompletionCharge
     */
    public java.lang.Integer getCallCompletionCharge() {
        return callCompletionCharge;
    }


    /**
     * Sets the callCompletionCharge value for this ChargeRateProfileData.
     * 
     * @param callCompletionCharge
     */
    public void setCallCompletionCharge(java.lang.Integer callCompletionCharge) {
        this.callCompletionCharge = callCompletionCharge;
    }


    /**
     * Gets the subtariff1 value for this ChargeRateProfileData.
     * 
     * @return subtariff1
     */
    public java.lang.Integer getSubtariff1() {
        return subtariff1;
    }


    /**
     * Sets the subtariff1 value for this ChargeRateProfileData.
     * 
     * @param subtariff1
     */
    public void setSubtariff1(java.lang.Integer subtariff1) {
        this.subtariff1 = subtariff1;
    }


    /**
     * Gets the subtariff2 value for this ChargeRateProfileData.
     * 
     * @return subtariff2
     */
    public java.lang.Integer getSubtariff2() {
        return subtariff2;
    }


    /**
     * Sets the subtariff2 value for this ChargeRateProfileData.
     * 
     * @param subtariff2
     */
    public void setSubtariff2(java.lang.Integer subtariff2) {
        this.subtariff2 = subtariff2;
    }


    /**
     * Gets the subtariff3 value for this ChargeRateProfileData.
     * 
     * @return subtariff3
     */
    public java.lang.Integer getSubtariff3() {
        return subtariff3;
    }


    /**
     * Sets the subtariff3 value for this ChargeRateProfileData.
     * 
     * @param subtariff3
     */
    public void setSubtariff3(java.lang.Integer subtariff3) {
        this.subtariff3 = subtariff3;
    }


    /**
     * Gets the subtariff4 value for this ChargeRateProfileData.
     * 
     * @return subtariff4
     */
    public java.lang.Integer getSubtariff4() {
        return subtariff4;
    }


    /**
     * Sets the subtariff4 value for this ChargeRateProfileData.
     * 
     * @param subtariff4
     */
    public void setSubtariff4(java.lang.Integer subtariff4) {
        this.subtariff4 = subtariff4;
    }


    /**
     * Gets the subtariff1Duration value for this ChargeRateProfileData.
     * 
     * @return subtariff1Duration
     */
    public java.lang.Integer getSubtariff1Duration() {
        return subtariff1Duration;
    }


    /**
     * Sets the subtariff1Duration value for this ChargeRateProfileData.
     * 
     * @param subtariff1Duration
     */
    public void setSubtariff1Duration(java.lang.Integer subtariff1Duration) {
        this.subtariff1Duration = subtariff1Duration;
    }


    /**
     * Gets the subtariff2Duration value for this ChargeRateProfileData.
     * 
     * @return subtariff2Duration
     */
    public java.lang.Integer getSubtariff2Duration() {
        return subtariff2Duration;
    }


    /**
     * Sets the subtariff2Duration value for this ChargeRateProfileData.
     * 
     * @param subtariff2Duration
     */
    public void setSubtariff2Duration(java.lang.Integer subtariff2Duration) {
        this.subtariff2Duration = subtariff2Duration;
    }


    /**
     * Gets the subtariff3Duration value for this ChargeRateProfileData.
     * 
     * @return subtariff3Duration
     */
    public java.lang.Integer getSubtariff3Duration() {
        return subtariff3Duration;
    }


    /**
     * Sets the subtariff3Duration value for this ChargeRateProfileData.
     * 
     * @param subtariff3Duration
     */
    public void setSubtariff3Duration(java.lang.Integer subtariff3Duration) {
        this.subtariff3Duration = subtariff3Duration;
    }


    /**
     * Gets the subtariff4Duration value for this ChargeRateProfileData.
     * 
     * @return subtariff4Duration
     */
    public java.lang.Integer getSubtariff4Duration() {
        return subtariff4Duration;
    }


    /**
     * Sets the subtariff4Duration value for this ChargeRateProfileData.
     * 
     * @param subtariff4Duration
     */
    public void setSubtariff4Duration(java.lang.Integer subtariff4Duration) {
        this.subtariff4Duration = subtariff4Duration;
    }


    /**
     * Gets the subtariff1TimeInterval value for this ChargeRateProfileData.
     * 
     * @return subtariff1TimeInterval
     */
    public java.lang.Integer getSubtariff1TimeInterval() {
        return subtariff1TimeInterval;
    }


    /**
     * Sets the subtariff1TimeInterval value for this ChargeRateProfileData.
     * 
     * @param subtariff1TimeInterval
     */
    public void setSubtariff1TimeInterval(java.lang.Integer subtariff1TimeInterval) {
        this.subtariff1TimeInterval = subtariff1TimeInterval;
    }


    /**
     * Gets the subtariff2TimeInterval value for this ChargeRateProfileData.
     * 
     * @return subtariff2TimeInterval
     */
    public java.lang.Integer getSubtariff2TimeInterval() {
        return subtariff2TimeInterval;
    }


    /**
     * Sets the subtariff2TimeInterval value for this ChargeRateProfileData.
     * 
     * @param subtariff2TimeInterval
     */
    public void setSubtariff2TimeInterval(java.lang.Integer subtariff2TimeInterval) {
        this.subtariff2TimeInterval = subtariff2TimeInterval;
    }


    /**
     * Gets the subtariff3TimeInterval value for this ChargeRateProfileData.
     * 
     * @return subtariff3TimeInterval
     */
    public java.lang.Integer getSubtariff3TimeInterval() {
        return subtariff3TimeInterval;
    }


    /**
     * Sets the subtariff3TimeInterval value for this ChargeRateProfileData.
     * 
     * @param subtariff3TimeInterval
     */
    public void setSubtariff3TimeInterval(java.lang.Integer subtariff3TimeInterval) {
        this.subtariff3TimeInterval = subtariff3TimeInterval;
    }


    /**
     * Gets the subtariff4TimeInterval value for this ChargeRateProfileData.
     * 
     * @return subtariff4TimeInterval
     */
    public java.lang.Integer getSubtariff4TimeInterval() {
        return subtariff4TimeInterval;
    }


    /**
     * Sets the subtariff4TimeInterval value for this ChargeRateProfileData.
     * 
     * @param subtariff4TimeInterval
     */
    public void setSubtariff4TimeInterval(java.lang.Integer subtariff4TimeInterval) {
        this.subtariff4TimeInterval = subtariff4TimeInterval;
    }


    /**
     * Gets the attributes value for this ChargeRateProfileData.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this ChargeRateProfileData.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeRateProfileData)) return false;
        ChargeRateProfileData other = (ChargeRateProfileData) obj;
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
            ((this.timeRangeProfileId==null && other.getTimeRangeProfileId()==null) || 
             (this.timeRangeProfileId!=null &&
              this.timeRangeProfileId.equals(other.getTimeRangeProfileId()))) &&
            ((this.callAttemptCharge==null && other.getCallAttemptCharge()==null) || 
             (this.callAttemptCharge!=null &&
              this.callAttemptCharge.equals(other.getCallAttemptCharge()))) &&
            ((this.callCompletionCharge==null && other.getCallCompletionCharge()==null) || 
             (this.callCompletionCharge!=null &&
              this.callCompletionCharge.equals(other.getCallCompletionCharge()))) &&
            ((this.subtariff1==null && other.getSubtariff1()==null) || 
             (this.subtariff1!=null &&
              this.subtariff1.equals(other.getSubtariff1()))) &&
            ((this.subtariff2==null && other.getSubtariff2()==null) || 
             (this.subtariff2!=null &&
              this.subtariff2.equals(other.getSubtariff2()))) &&
            ((this.subtariff3==null && other.getSubtariff3()==null) || 
             (this.subtariff3!=null &&
              this.subtariff3.equals(other.getSubtariff3()))) &&
            ((this.subtariff4==null && other.getSubtariff4()==null) || 
             (this.subtariff4!=null &&
              this.subtariff4.equals(other.getSubtariff4()))) &&
            ((this.subtariff1Duration==null && other.getSubtariff1Duration()==null) || 
             (this.subtariff1Duration!=null &&
              this.subtariff1Duration.equals(other.getSubtariff1Duration()))) &&
            ((this.subtariff2Duration==null && other.getSubtariff2Duration()==null) || 
             (this.subtariff2Duration!=null &&
              this.subtariff2Duration.equals(other.getSubtariff2Duration()))) &&
            ((this.subtariff3Duration==null && other.getSubtariff3Duration()==null) || 
             (this.subtariff3Duration!=null &&
              this.subtariff3Duration.equals(other.getSubtariff3Duration()))) &&
            ((this.subtariff4Duration==null && other.getSubtariff4Duration()==null) || 
             (this.subtariff4Duration!=null &&
              this.subtariff4Duration.equals(other.getSubtariff4Duration()))) &&
            ((this.subtariff1TimeInterval==null && other.getSubtariff1TimeInterval()==null) || 
             (this.subtariff1TimeInterval!=null &&
              this.subtariff1TimeInterval.equals(other.getSubtariff1TimeInterval()))) &&
            ((this.subtariff2TimeInterval==null && other.getSubtariff2TimeInterval()==null) || 
             (this.subtariff2TimeInterval!=null &&
              this.subtariff2TimeInterval.equals(other.getSubtariff2TimeInterval()))) &&
            ((this.subtariff3TimeInterval==null && other.getSubtariff3TimeInterval()==null) || 
             (this.subtariff3TimeInterval!=null &&
              this.subtariff3TimeInterval.equals(other.getSubtariff3TimeInterval()))) &&
            ((this.subtariff4TimeInterval==null && other.getSubtariff4TimeInterval()==null) || 
             (this.subtariff4TimeInterval!=null &&
              this.subtariff4TimeInterval.equals(other.getSubtariff4TimeInterval()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes())));
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
        if (getTimeRangeProfileId() != null) {
            _hashCode += getTimeRangeProfileId().hashCode();
        }
        if (getCallAttemptCharge() != null) {
            _hashCode += getCallAttemptCharge().hashCode();
        }
        if (getCallCompletionCharge() != null) {
            _hashCode += getCallCompletionCharge().hashCode();
        }
        if (getSubtariff1() != null) {
            _hashCode += getSubtariff1().hashCode();
        }
        if (getSubtariff2() != null) {
            _hashCode += getSubtariff2().hashCode();
        }
        if (getSubtariff3() != null) {
            _hashCode += getSubtariff3().hashCode();
        }
        if (getSubtariff4() != null) {
            _hashCode += getSubtariff4().hashCode();
        }
        if (getSubtariff1Duration() != null) {
            _hashCode += getSubtariff1Duration().hashCode();
        }
        if (getSubtariff2Duration() != null) {
            _hashCode += getSubtariff2Duration().hashCode();
        }
        if (getSubtariff3Duration() != null) {
            _hashCode += getSubtariff3Duration().hashCode();
        }
        if (getSubtariff4Duration() != null) {
            _hashCode += getSubtariff4Duration().hashCode();
        }
        if (getSubtariff1TimeInterval() != null) {
            _hashCode += getSubtariff1TimeInterval().hashCode();
        }
        if (getSubtariff2TimeInterval() != null) {
            _hashCode += getSubtariff2TimeInterval().hashCode();
        }
        if (getSubtariff3TimeInterval() != null) {
            _hashCode += getSubtariff3TimeInterval().hashCode();
        }
        if (getSubtariff4TimeInterval() != null) {
            _hashCode += getSubtariff4TimeInterval().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeRateProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeRateProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeRateProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeRateProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRangeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeRangeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callAttemptCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callAttemptCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callCompletionCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callCompletionCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtariff1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtariff1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtariff2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtariff2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtariff3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtariff3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtariff4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtariff4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtariff1Duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtariff1Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtariff2Duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtariff2Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtariff3Duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtariff3Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtariff4Duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtariff4Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtariff1TimeInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtariff1TimeInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtariff2TimeInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtariff2TimeInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtariff3TimeInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtariff3TimeInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtariff4TimeInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtariff4TimeInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
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
