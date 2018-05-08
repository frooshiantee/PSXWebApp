/**
 * BillingZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class BillingZone  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String fromCallingArea;

    private java.lang.String toCallingArea;

    private java.lang.String zoneId;

    public BillingZone() {
    }

    public BillingZone(
           java.lang.String fromCallingArea,
           java.lang.String toCallingArea,
           java.lang.String zoneId) {
        this.fromCallingArea = fromCallingArea;
        this.toCallingArea = toCallingArea;
        this.zoneId = zoneId;
    }


    /**
     * Gets the fromCallingArea value for this BillingZone.
     * 
     * @return fromCallingArea
     */
    public java.lang.String getFromCallingArea() {
        return fromCallingArea;
    }


    /**
     * Sets the fromCallingArea value for this BillingZone.
     * 
     * @param fromCallingArea
     */
    public void setFromCallingArea(java.lang.String fromCallingArea) {
        this.fromCallingArea = fromCallingArea;
    }


    /**
     * Gets the toCallingArea value for this BillingZone.
     * 
     * @return toCallingArea
     */
    public java.lang.String getToCallingArea() {
        return toCallingArea;
    }


    /**
     * Sets the toCallingArea value for this BillingZone.
     * 
     * @param toCallingArea
     */
    public void setToCallingArea(java.lang.String toCallingArea) {
        this.toCallingArea = toCallingArea;
    }


    /**
     * Gets the zoneId value for this BillingZone.
     * 
     * @return zoneId
     */
    public java.lang.String getZoneId() {
        return zoneId;
    }


    /**
     * Sets the zoneId value for this BillingZone.
     * 
     * @param zoneId
     */
    public void setZoneId(java.lang.String zoneId) {
        this.zoneId = zoneId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingZone)) return false;
        BillingZone other = (BillingZone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fromCallingArea==null && other.getFromCallingArea()==null) || 
             (this.fromCallingArea!=null &&
              this.fromCallingArea.equals(other.getFromCallingArea()))) &&
            ((this.toCallingArea==null && other.getToCallingArea()==null) || 
             (this.toCallingArea!=null &&
              this.toCallingArea.equals(other.getToCallingArea()))) &&
            ((this.zoneId==null && other.getZoneId()==null) || 
             (this.zoneId!=null &&
              this.zoneId.equals(other.getZoneId())));
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
        if (getFromCallingArea() != null) {
            _hashCode += getFromCallingArea().hashCode();
        }
        if (getToCallingArea() != null) {
            _hashCode += getToCallingArea().hashCode();
        }
        if (getZoneId() != null) {
            _hashCode += getZoneId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingZone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingZone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCallingArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromCallingArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCallingArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toCallingArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zoneId"));
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
