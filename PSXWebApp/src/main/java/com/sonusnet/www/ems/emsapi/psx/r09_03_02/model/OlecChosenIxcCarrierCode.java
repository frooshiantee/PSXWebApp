/**
 * OlecChosenIxcCarrierCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class OlecChosenIxcCarrierCode  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String olecCarrierCode;

    private java.lang.String chosenIxcCarrierCode;

    private java.lang.String scpCarrierCode;

    private java.lang.String carrierCodeProfileId;

    public OlecChosenIxcCarrierCode() {
    }

    public OlecChosenIxcCarrierCode(
           java.lang.String olecCarrierCode,
           java.lang.String chosenIxcCarrierCode,
           java.lang.String scpCarrierCode,
           java.lang.String carrierCodeProfileId) {
        this.olecCarrierCode = olecCarrierCode;
        this.chosenIxcCarrierCode = chosenIxcCarrierCode;
        this.scpCarrierCode = scpCarrierCode;
        this.carrierCodeProfileId = carrierCodeProfileId;
    }


    /**
     * Gets the olecCarrierCode value for this OlecChosenIxcCarrierCode.
     * 
     * @return olecCarrierCode
     */
    public java.lang.String getOlecCarrierCode() {
        return olecCarrierCode;
    }


    /**
     * Sets the olecCarrierCode value for this OlecChosenIxcCarrierCode.
     * 
     * @param olecCarrierCode
     */
    public void setOlecCarrierCode(java.lang.String olecCarrierCode) {
        this.olecCarrierCode = olecCarrierCode;
    }


    /**
     * Gets the chosenIxcCarrierCode value for this OlecChosenIxcCarrierCode.
     * 
     * @return chosenIxcCarrierCode
     */
    public java.lang.String getChosenIxcCarrierCode() {
        return chosenIxcCarrierCode;
    }


    /**
     * Sets the chosenIxcCarrierCode value for this OlecChosenIxcCarrierCode.
     * 
     * @param chosenIxcCarrierCode
     */
    public void setChosenIxcCarrierCode(java.lang.String chosenIxcCarrierCode) {
        this.chosenIxcCarrierCode = chosenIxcCarrierCode;
    }


    /**
     * Gets the scpCarrierCode value for this OlecChosenIxcCarrierCode.
     * 
     * @return scpCarrierCode
     */
    public java.lang.String getScpCarrierCode() {
        return scpCarrierCode;
    }


    /**
     * Sets the scpCarrierCode value for this OlecChosenIxcCarrierCode.
     * 
     * @param scpCarrierCode
     */
    public void setScpCarrierCode(java.lang.String scpCarrierCode) {
        this.scpCarrierCode = scpCarrierCode;
    }


    /**
     * Gets the carrierCodeProfileId value for this OlecChosenIxcCarrierCode.
     * 
     * @return carrierCodeProfileId
     */
    public java.lang.String getCarrierCodeProfileId() {
        return carrierCodeProfileId;
    }


    /**
     * Sets the carrierCodeProfileId value for this OlecChosenIxcCarrierCode.
     * 
     * @param carrierCodeProfileId
     */
    public void setCarrierCodeProfileId(java.lang.String carrierCodeProfileId) {
        this.carrierCodeProfileId = carrierCodeProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OlecChosenIxcCarrierCode)) return false;
        OlecChosenIxcCarrierCode other = (OlecChosenIxcCarrierCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.olecCarrierCode==null && other.getOlecCarrierCode()==null) || 
             (this.olecCarrierCode!=null &&
              this.olecCarrierCode.equals(other.getOlecCarrierCode()))) &&
            ((this.chosenIxcCarrierCode==null && other.getChosenIxcCarrierCode()==null) || 
             (this.chosenIxcCarrierCode!=null &&
              this.chosenIxcCarrierCode.equals(other.getChosenIxcCarrierCode()))) &&
            ((this.scpCarrierCode==null && other.getScpCarrierCode()==null) || 
             (this.scpCarrierCode!=null &&
              this.scpCarrierCode.equals(other.getScpCarrierCode()))) &&
            ((this.carrierCodeProfileId==null && other.getCarrierCodeProfileId()==null) || 
             (this.carrierCodeProfileId!=null &&
              this.carrierCodeProfileId.equals(other.getCarrierCodeProfileId())));
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
        if (getOlecCarrierCode() != null) {
            _hashCode += getOlecCarrierCode().hashCode();
        }
        if (getChosenIxcCarrierCode() != null) {
            _hashCode += getChosenIxcCarrierCode().hashCode();
        }
        if (getScpCarrierCode() != null) {
            _hashCode += getScpCarrierCode().hashCode();
        }
        if (getCarrierCodeProfileId() != null) {
            _hashCode += getCarrierCodeProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OlecChosenIxcCarrierCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OlecChosenIxcCarrierCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("olecCarrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "olecCarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chosenIxcCarrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chosenIxcCarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpCarrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpCarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCodeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCodeProfileId"));
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
