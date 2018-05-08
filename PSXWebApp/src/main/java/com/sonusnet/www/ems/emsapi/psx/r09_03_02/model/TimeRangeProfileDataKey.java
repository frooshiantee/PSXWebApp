/**
 * TimeRangeProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class TimeRangeProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String timeRangeProfileId;

    private java.lang.Short dayOfWeek;

    private java.lang.String timeOfDay;

    private java.lang.Short holidayFlag;

    private java.lang.String specialDays;

    private java.lang.Short timeZone;

    public TimeRangeProfileDataKey() {
    }

    public TimeRangeProfileDataKey(
           java.lang.String timeRangeProfileId,
           java.lang.Short dayOfWeek,
           java.lang.String timeOfDay,
           java.lang.Short holidayFlag,
           java.lang.String specialDays,
           java.lang.Short timeZone) {
        this.timeRangeProfileId = timeRangeProfileId;
        this.dayOfWeek = dayOfWeek;
        this.timeOfDay = timeOfDay;
        this.holidayFlag = holidayFlag;
        this.specialDays = specialDays;
        this.timeZone = timeZone;
    }


    /**
     * Gets the timeRangeProfileId value for this TimeRangeProfileDataKey.
     * 
     * @return timeRangeProfileId
     */
    public java.lang.String getTimeRangeProfileId() {
        return timeRangeProfileId;
    }


    /**
     * Sets the timeRangeProfileId value for this TimeRangeProfileDataKey.
     * 
     * @param timeRangeProfileId
     */
    public void setTimeRangeProfileId(java.lang.String timeRangeProfileId) {
        this.timeRangeProfileId = timeRangeProfileId;
    }


    /**
     * Gets the dayOfWeek value for this TimeRangeProfileDataKey.
     * 
     * @return dayOfWeek
     */
    public java.lang.Short getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this TimeRangeProfileDataKey.
     * 
     * @param dayOfWeek
     */
    public void setDayOfWeek(java.lang.Short dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the timeOfDay value for this TimeRangeProfileDataKey.
     * 
     * @return timeOfDay
     */
    public java.lang.String getTimeOfDay() {
        return timeOfDay;
    }


    /**
     * Sets the timeOfDay value for this TimeRangeProfileDataKey.
     * 
     * @param timeOfDay
     */
    public void setTimeOfDay(java.lang.String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }


    /**
     * Gets the holidayFlag value for this TimeRangeProfileDataKey.
     * 
     * @return holidayFlag
     */
    public java.lang.Short getHolidayFlag() {
        return holidayFlag;
    }


    /**
     * Sets the holidayFlag value for this TimeRangeProfileDataKey.
     * 
     * @param holidayFlag
     */
    public void setHolidayFlag(java.lang.Short holidayFlag) {
        this.holidayFlag = holidayFlag;
    }


    /**
     * Gets the specialDays value for this TimeRangeProfileDataKey.
     * 
     * @return specialDays
     */
    public java.lang.String getSpecialDays() {
        return specialDays;
    }


    /**
     * Sets the specialDays value for this TimeRangeProfileDataKey.
     * 
     * @param specialDays
     */
    public void setSpecialDays(java.lang.String specialDays) {
        this.specialDays = specialDays;
    }


    /**
     * Gets the timeZone value for this TimeRangeProfileDataKey.
     * 
     * @return timeZone
     */
    public java.lang.Short getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this TimeRangeProfileDataKey.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.Short timeZone) {
        this.timeZone = timeZone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeRangeProfileDataKey)) return false;
        TimeRangeProfileDataKey other = (TimeRangeProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.timeRangeProfileId==null && other.getTimeRangeProfileId()==null) || 
             (this.timeRangeProfileId!=null &&
              this.timeRangeProfileId.equals(other.getTimeRangeProfileId()))) &&
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              this.dayOfWeek.equals(other.getDayOfWeek()))) &&
            ((this.timeOfDay==null && other.getTimeOfDay()==null) || 
             (this.timeOfDay!=null &&
              this.timeOfDay.equals(other.getTimeOfDay()))) &&
            ((this.holidayFlag==null && other.getHolidayFlag()==null) || 
             (this.holidayFlag!=null &&
              this.holidayFlag.equals(other.getHolidayFlag()))) &&
            ((this.specialDays==null && other.getSpecialDays()==null) || 
             (this.specialDays!=null &&
              this.specialDays.equals(other.getSpecialDays()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone())));
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
        if (getTimeRangeProfileId() != null) {
            _hashCode += getTimeRangeProfileId().hashCode();
        }
        if (getDayOfWeek() != null) {
            _hashCode += getDayOfWeek().hashCode();
        }
        if (getTimeOfDay() != null) {
            _hashCode += getTimeOfDay().hashCode();
        }
        if (getHolidayFlag() != null) {
            _hashCode += getHolidayFlag().hashCode();
        }
        if (getSpecialDays() != null) {
            _hashCode += getSpecialDays().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeRangeProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TimeRangeProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRangeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeRangeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOfDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeOfDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidayFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holidayFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specialDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeZone"));
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
