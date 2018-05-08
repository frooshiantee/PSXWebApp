/**
 * ScpaDeviceLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ScpaDeviceLabel  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String deviceLabel;

    private java.lang.Short deviceSelection;

    public ScpaDeviceLabel() {
    }

    public ScpaDeviceLabel(
           java.lang.String deviceLabel,
           java.lang.Short deviceSelection) {
        this.deviceLabel = deviceLabel;
        this.deviceSelection = deviceSelection;
    }


    /**
     * Gets the deviceLabel value for this ScpaDeviceLabel.
     * 
     * @return deviceLabel
     */
    public java.lang.String getDeviceLabel() {
        return deviceLabel;
    }


    /**
     * Sets the deviceLabel value for this ScpaDeviceLabel.
     * 
     * @param deviceLabel
     */
    public void setDeviceLabel(java.lang.String deviceLabel) {
        this.deviceLabel = deviceLabel;
    }


    /**
     * Gets the deviceSelection value for this ScpaDeviceLabel.
     * 
     * @return deviceSelection
     */
    public java.lang.Short getDeviceSelection() {
        return deviceSelection;
    }


    /**
     * Sets the deviceSelection value for this ScpaDeviceLabel.
     * 
     * @param deviceSelection
     */
    public void setDeviceSelection(java.lang.Short deviceSelection) {
        this.deviceSelection = deviceSelection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScpaDeviceLabel)) return false;
        ScpaDeviceLabel other = (ScpaDeviceLabel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceLabel==null && other.getDeviceLabel()==null) || 
             (this.deviceLabel!=null &&
              this.deviceLabel.equals(other.getDeviceLabel()))) &&
            ((this.deviceSelection==null && other.getDeviceSelection()==null) || 
             (this.deviceSelection!=null &&
              this.deviceSelection.equals(other.getDeviceSelection())));
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
        if (getDeviceLabel() != null) {
            _hashCode += getDeviceLabel().hashCode();
        }
        if (getDeviceSelection() != null) {
            _hashCode += getDeviceSelection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScpaDeviceLabel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpaDeviceLabel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceSelection"));
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
