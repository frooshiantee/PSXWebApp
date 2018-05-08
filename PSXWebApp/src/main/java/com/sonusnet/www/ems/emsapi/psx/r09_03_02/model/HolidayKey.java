/**
 * HolidayKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HolidayKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String countryId;

    private java.lang.Short monthOfYear;

    private java.lang.Short dayOfMonth;

    public HolidayKey() {
    }

    public HolidayKey(
           java.lang.String countryId,
           java.lang.Short monthOfYear,
           java.lang.Short dayOfMonth) {
        this.countryId = countryId;
        this.monthOfYear = monthOfYear;
        this.dayOfMonth = dayOfMonth;
    }


    /**
     * Gets the countryId value for this HolidayKey.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this HolidayKey.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the monthOfYear value for this HolidayKey.
     * 
     * @return monthOfYear
     */
    public java.lang.Short getMonthOfYear() {
        return monthOfYear;
    }


    /**
     * Sets the monthOfYear value for this HolidayKey.
     * 
     * @param monthOfYear
     */
    public void setMonthOfYear(java.lang.Short monthOfYear) {
        this.monthOfYear = monthOfYear;
    }


    /**
     * Gets the dayOfMonth value for this HolidayKey.
     * 
     * @return dayOfMonth
     */
    public java.lang.Short getDayOfMonth() {
        return dayOfMonth;
    }


    /**
     * Sets the dayOfMonth value for this HolidayKey.
     * 
     * @param dayOfMonth
     */
    public void setDayOfMonth(java.lang.Short dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HolidayKey)) return false;
        HolidayKey other = (HolidayKey) obj;
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
            ((this.monthOfYear==null && other.getMonthOfYear()==null) || 
             (this.monthOfYear!=null &&
              this.monthOfYear.equals(other.getMonthOfYear()))) &&
            ((this.dayOfMonth==null && other.getDayOfMonth()==null) || 
             (this.dayOfMonth!=null &&
              this.dayOfMonth.equals(other.getDayOfMonth())));
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
        if (getMonthOfYear() != null) {
            _hashCode += getMonthOfYear().hashCode();
        }
        if (getDayOfMonth() != null) {
            _hashCode += getDayOfMonth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HolidayKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HolidayKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthOfYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthOfYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayOfMonth"));
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
