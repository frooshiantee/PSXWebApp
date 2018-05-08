/**
 * DeviceProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class DeviceProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String deviceProfileId;

    private java.lang.Integer registrationTimer;

    public DeviceProfile() {
    }

    public DeviceProfile(
           java.lang.String deviceProfileId,
           java.lang.Integer registrationTimer) {
        this.deviceProfileId = deviceProfileId;
        this.registrationTimer = registrationTimer;
    }


    /**
     * Gets the deviceProfileId value for this DeviceProfile.
     * 
     * @return deviceProfileId
     */
    public java.lang.String getDeviceProfileId() {
        return deviceProfileId;
    }


    /**
     * Sets the deviceProfileId value for this DeviceProfile.
     * 
     * @param deviceProfileId
     */
    public void setDeviceProfileId(java.lang.String deviceProfileId) {
        this.deviceProfileId = deviceProfileId;
    }


    /**
     * Gets the registrationTimer value for this DeviceProfile.
     * 
     * @return registrationTimer
     */
    public java.lang.Integer getRegistrationTimer() {
        return registrationTimer;
    }


    /**
     * Sets the registrationTimer value for this DeviceProfile.
     * 
     * @param registrationTimer
     */
    public void setRegistrationTimer(java.lang.Integer registrationTimer) {
        this.registrationTimer = registrationTimer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceProfile)) return false;
        DeviceProfile other = (DeviceProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceProfileId==null && other.getDeviceProfileId()==null) || 
             (this.deviceProfileId!=null &&
              this.deviceProfileId.equals(other.getDeviceProfileId()))) &&
            ((this.registrationTimer==null && other.getRegistrationTimer()==null) || 
             (this.registrationTimer!=null &&
              this.registrationTimer.equals(other.getRegistrationTimer())));
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
        if (getDeviceProfileId() != null) {
            _hashCode += getDeviceProfileId().hashCode();
        }
        if (getRegistrationTimer() != null) {
            _hashCode += getRegistrationTimer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DeviceProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationTimer"));
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
