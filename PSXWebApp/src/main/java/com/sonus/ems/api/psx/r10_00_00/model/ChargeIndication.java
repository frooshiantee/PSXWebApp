/**
 * ChargeIndication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ChargeIndication  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Short carrierType;
    private java.lang.Integer callType;
    private java.lang.Short acmChargeInd;
    private java.lang.Short anmChargeInd;

    public ChargeIndication() {
    }

    public ChargeIndication(
           java.lang.Short carrierType,
           java.lang.Integer callType,
           java.lang.Short acmChargeInd,
           java.lang.Short anmChargeInd) {
           this.carrierType = carrierType;
           this.callType = callType;
           this.acmChargeInd = acmChargeInd;
           this.anmChargeInd = anmChargeInd;
    }


    /**
     * Gets the carrierType value for this ChargeIndication.
     * 
     * @return carrierType
     */
    public java.lang.Short getCarrierType() {
        return carrierType;
    }


    /**
     * Sets the carrierType value for this ChargeIndication.
     * 
     * @param carrierType
     */
    public void setCarrierType(java.lang.Short carrierType) {
        this.carrierType = carrierType;
    }


    /**
     * Gets the callType value for this ChargeIndication.
     * 
     * @return callType
     */
    public java.lang.Integer getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this ChargeIndication.
     * 
     * @param callType
     */
    public void setCallType(java.lang.Integer callType) {
        this.callType = callType;
    }


    /**
     * Gets the acmChargeInd value for this ChargeIndication.
     * 
     * @return acmChargeInd
     */
    public java.lang.Short getAcmChargeInd() {
        return acmChargeInd;
    }


    /**
     * Sets the acmChargeInd value for this ChargeIndication.
     * 
     * @param acmChargeInd
     */
    public void setAcmChargeInd(java.lang.Short acmChargeInd) {
        this.acmChargeInd = acmChargeInd;
    }


    /**
     * Gets the anmChargeInd value for this ChargeIndication.
     * 
     * @return anmChargeInd
     */
    public java.lang.Short getAnmChargeInd() {
        return anmChargeInd;
    }


    /**
     * Sets the anmChargeInd value for this ChargeIndication.
     * 
     * @param anmChargeInd
     */
    public void setAnmChargeInd(java.lang.Short anmChargeInd) {
        this.anmChargeInd = anmChargeInd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeIndication)) return false;
        ChargeIndication other = (ChargeIndication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.carrierType==null && other.getCarrierType()==null) || 
             (this.carrierType!=null &&
              this.carrierType.equals(other.getCarrierType()))) &&
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
            ((this.acmChargeInd==null && other.getAcmChargeInd()==null) || 
             (this.acmChargeInd!=null &&
              this.acmChargeInd.equals(other.getAcmChargeInd()))) &&
            ((this.anmChargeInd==null && other.getAnmChargeInd()==null) || 
             (this.anmChargeInd!=null &&
              this.anmChargeInd.equals(other.getAnmChargeInd())));
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
        if (getCarrierType() != null) {
            _hashCode += getCarrierType().hashCode();
        }
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
        }
        if (getAcmChargeInd() != null) {
            _hashCode += getAcmChargeInd().hashCode();
        }
        if (getAnmChargeInd() != null) {
            _hashCode += getAnmChargeInd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeIndication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeIndication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmChargeInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acmChargeInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anmChargeInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anmChargeInd"));
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
