/**
 * ScpaDeviceLabelData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ScpaDeviceLabelData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String deviceLabel;

    private java.lang.String scpaDevice;

    private java.lang.Short scpaDeviceRole;

    public ScpaDeviceLabelData() {
    }

    public ScpaDeviceLabelData(
           java.lang.String deviceLabel,
           java.lang.String scpaDevice,
           java.lang.Short scpaDeviceRole) {
        this.deviceLabel = deviceLabel;
        this.scpaDevice = scpaDevice;
        this.scpaDeviceRole = scpaDeviceRole;
    }


    /**
     * Gets the deviceLabel value for this ScpaDeviceLabelData.
     * 
     * @return deviceLabel
     */
    public java.lang.String getDeviceLabel() {
        return deviceLabel;
    }


    /**
     * Sets the deviceLabel value for this ScpaDeviceLabelData.
     * 
     * @param deviceLabel
     */
    public void setDeviceLabel(java.lang.String deviceLabel) {
        this.deviceLabel = deviceLabel;
    }


    /**
     * Gets the scpaDevice value for this ScpaDeviceLabelData.
     * 
     * @return scpaDevice
     */
    public java.lang.String getScpaDevice() {
        return scpaDevice;
    }


    /**
     * Sets the scpaDevice value for this ScpaDeviceLabelData.
     * 
     * @param scpaDevice
     */
    public void setScpaDevice(java.lang.String scpaDevice) {
        this.scpaDevice = scpaDevice;
    }


    /**
     * Gets the scpaDeviceRole value for this ScpaDeviceLabelData.
     * 
     * @return scpaDeviceRole
     */
    public java.lang.Short getScpaDeviceRole() {
        return scpaDeviceRole;
    }


    /**
     * Sets the scpaDeviceRole value for this ScpaDeviceLabelData.
     * 
     * @param scpaDeviceRole
     */
    public void setScpaDeviceRole(java.lang.Short scpaDeviceRole) {
        this.scpaDeviceRole = scpaDeviceRole;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScpaDeviceLabelData)) return false;
        ScpaDeviceLabelData other = (ScpaDeviceLabelData) obj;
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
            ((this.scpaDevice==null && other.getScpaDevice()==null) || 
             (this.scpaDevice!=null &&
              this.scpaDevice.equals(other.getScpaDevice()))) &&
            ((this.scpaDeviceRole==null && other.getScpaDeviceRole()==null) || 
             (this.scpaDeviceRole!=null &&
              this.scpaDeviceRole.equals(other.getScpaDeviceRole())));
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
        if (getScpaDevice() != null) {
            _hashCode += getScpaDevice().hashCode();
        }
        if (getScpaDeviceRole() != null) {
            _hashCode += getScpaDeviceRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScpaDeviceLabelData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpaDeviceLabelData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpaDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpaDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpaDeviceRole");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpaDeviceRole"));
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
