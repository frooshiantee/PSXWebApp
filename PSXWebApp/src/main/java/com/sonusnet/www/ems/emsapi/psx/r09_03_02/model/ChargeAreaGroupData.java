/**
 * ChargeAreaGroupData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ChargeAreaGroupData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String chargeAreaGroupId;

    private java.lang.String chargeArea;

    private java.lang.Integer attributes;

    public ChargeAreaGroupData() {
    }

    public ChargeAreaGroupData(
           java.lang.String chargeAreaGroupId,
           java.lang.String chargeArea,
           java.lang.Integer attributes) {
        this.chargeAreaGroupId = chargeAreaGroupId;
        this.chargeArea = chargeArea;
        this.attributes = attributes;
    }


    /**
     * Gets the chargeAreaGroupId value for this ChargeAreaGroupData.
     * 
     * @return chargeAreaGroupId
     */
    public java.lang.String getChargeAreaGroupId() {
        return chargeAreaGroupId;
    }


    /**
     * Sets the chargeAreaGroupId value for this ChargeAreaGroupData.
     * 
     * @param chargeAreaGroupId
     */
    public void setChargeAreaGroupId(java.lang.String chargeAreaGroupId) {
        this.chargeAreaGroupId = chargeAreaGroupId;
    }


    /**
     * Gets the chargeArea value for this ChargeAreaGroupData.
     * 
     * @return chargeArea
     */
    public java.lang.String getChargeArea() {
        return chargeArea;
    }


    /**
     * Sets the chargeArea value for this ChargeAreaGroupData.
     * 
     * @param chargeArea
     */
    public void setChargeArea(java.lang.String chargeArea) {
        this.chargeArea = chargeArea;
    }


    /**
     * Gets the attributes value for this ChargeAreaGroupData.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this ChargeAreaGroupData.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeAreaGroupData)) return false;
        ChargeAreaGroupData other = (ChargeAreaGroupData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.chargeAreaGroupId==null && other.getChargeAreaGroupId()==null) || 
             (this.chargeAreaGroupId!=null &&
              this.chargeAreaGroupId.equals(other.getChargeAreaGroupId()))) &&
            ((this.chargeArea==null && other.getChargeArea()==null) || 
             (this.chargeArea!=null &&
              this.chargeArea.equals(other.getChargeArea()))) &&
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
        if (getChargeAreaGroupId() != null) {
            _hashCode += getChargeAreaGroupId().hashCode();
        }
        if (getChargeArea() != null) {
            _hashCode += getChargeArea().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeAreaGroupData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeAreaGroupData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeAreaGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeAreaGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
