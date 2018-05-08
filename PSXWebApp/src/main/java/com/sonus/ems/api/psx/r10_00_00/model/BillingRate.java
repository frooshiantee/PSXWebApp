/**
 * BillingRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class BillingRate  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String zoneId;
    private java.lang.String billingPlanId;
    private java.lang.String chargeIndex;

    public BillingRate() {
    }

    public BillingRate(
           java.lang.String zoneId,
           java.lang.String billingPlanId,
           java.lang.String chargeIndex) {
           this.zoneId = zoneId;
           this.billingPlanId = billingPlanId;
           this.chargeIndex = chargeIndex;
    }


    /**
     * Gets the zoneId value for this BillingRate.
     * 
     * @return zoneId
     */
    public java.lang.String getZoneId() {
        return zoneId;
    }


    /**
     * Sets the zoneId value for this BillingRate.
     * 
     * @param zoneId
     */
    public void setZoneId(java.lang.String zoneId) {
        this.zoneId = zoneId;
    }


    /**
     * Gets the billingPlanId value for this BillingRate.
     * 
     * @return billingPlanId
     */
    public java.lang.String getBillingPlanId() {
        return billingPlanId;
    }


    /**
     * Sets the billingPlanId value for this BillingRate.
     * 
     * @param billingPlanId
     */
    public void setBillingPlanId(java.lang.String billingPlanId) {
        this.billingPlanId = billingPlanId;
    }


    /**
     * Gets the chargeIndex value for this BillingRate.
     * 
     * @return chargeIndex
     */
    public java.lang.String getChargeIndex() {
        return chargeIndex;
    }


    /**
     * Sets the chargeIndex value for this BillingRate.
     * 
     * @param chargeIndex
     */
    public void setChargeIndex(java.lang.String chargeIndex) {
        this.chargeIndex = chargeIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingRate)) return false;
        BillingRate other = (BillingRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.zoneId==null && other.getZoneId()==null) || 
             (this.zoneId!=null &&
              this.zoneId.equals(other.getZoneId()))) &&
            ((this.billingPlanId==null && other.getBillingPlanId()==null) || 
             (this.billingPlanId!=null &&
              this.billingPlanId.equals(other.getBillingPlanId()))) &&
            ((this.chargeIndex==null && other.getChargeIndex()==null) || 
             (this.chargeIndex!=null &&
              this.chargeIndex.equals(other.getChargeIndex())));
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
        if (getZoneId() != null) {
            _hashCode += getZoneId().hashCode();
        }
        if (getBillingPlanId() != null) {
            _hashCode += getBillingPlanId().hashCode();
        }
        if (getChargeIndex() != null) {
            _hashCode += getChargeIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeIndex"));
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
