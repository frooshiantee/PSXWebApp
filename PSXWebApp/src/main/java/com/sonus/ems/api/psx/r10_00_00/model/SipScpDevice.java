/**
 * SipScpDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SipScpDevice  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sipDeviceId;
    private java.lang.Integer loadDistribution;
    private java.lang.Integer sipScpRetryTimer;
    private java.lang.Integer sipDeviceType;

    public SipScpDevice() {
    }

    public SipScpDevice(
           java.lang.String sipDeviceId,
           java.lang.Integer loadDistribution,
           java.lang.Integer sipScpRetryTimer,
           java.lang.Integer sipDeviceType) {
           this.sipDeviceId = sipDeviceId;
           this.loadDistribution = loadDistribution;
           this.sipScpRetryTimer = sipScpRetryTimer;
           this.sipDeviceType = sipDeviceType;
    }


    /**
     * Gets the sipDeviceId value for this SipScpDevice.
     * 
     * @return sipDeviceId
     */
    public java.lang.String getSipDeviceId() {
        return sipDeviceId;
    }


    /**
     * Sets the sipDeviceId value for this SipScpDevice.
     * 
     * @param sipDeviceId
     */
    public void setSipDeviceId(java.lang.String sipDeviceId) {
        this.sipDeviceId = sipDeviceId;
    }


    /**
     * Gets the loadDistribution value for this SipScpDevice.
     * 
     * @return loadDistribution
     */
    public java.lang.Integer getLoadDistribution() {
        return loadDistribution;
    }


    /**
     * Sets the loadDistribution value for this SipScpDevice.
     * 
     * @param loadDistribution
     */
    public void setLoadDistribution(java.lang.Integer loadDistribution) {
        this.loadDistribution = loadDistribution;
    }


    /**
     * Gets the sipScpRetryTimer value for this SipScpDevice.
     * 
     * @return sipScpRetryTimer
     */
    public java.lang.Integer getSipScpRetryTimer() {
        return sipScpRetryTimer;
    }


    /**
     * Sets the sipScpRetryTimer value for this SipScpDevice.
     * 
     * @param sipScpRetryTimer
     */
    public void setSipScpRetryTimer(java.lang.Integer sipScpRetryTimer) {
        this.sipScpRetryTimer = sipScpRetryTimer;
    }


    /**
     * Gets the sipDeviceType value for this SipScpDevice.
     * 
     * @return sipDeviceType
     */
    public java.lang.Integer getSipDeviceType() {
        return sipDeviceType;
    }


    /**
     * Sets the sipDeviceType value for this SipScpDevice.
     * 
     * @param sipDeviceType
     */
    public void setSipDeviceType(java.lang.Integer sipDeviceType) {
        this.sipDeviceType = sipDeviceType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipScpDevice)) return false;
        SipScpDevice other = (SipScpDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sipDeviceId==null && other.getSipDeviceId()==null) || 
             (this.sipDeviceId!=null &&
              this.sipDeviceId.equals(other.getSipDeviceId()))) &&
            ((this.loadDistribution==null && other.getLoadDistribution()==null) || 
             (this.loadDistribution!=null &&
              this.loadDistribution.equals(other.getLoadDistribution()))) &&
            ((this.sipScpRetryTimer==null && other.getSipScpRetryTimer()==null) || 
             (this.sipScpRetryTimer!=null &&
              this.sipScpRetryTimer.equals(other.getSipScpRetryTimer()))) &&
            ((this.sipDeviceType==null && other.getSipDeviceType()==null) || 
             (this.sipDeviceType!=null &&
              this.sipDeviceType.equals(other.getSipDeviceType())));
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
        if (getSipDeviceId() != null) {
            _hashCode += getSipDeviceId().hashCode();
        }
        if (getLoadDistribution() != null) {
            _hashCode += getLoadDistribution().hashCode();
        }
        if (getSipScpRetryTimer() != null) {
            _hashCode += getSipScpRetryTimer().hashCode();
        }
        if (getSipDeviceType() != null) {
            _hashCode += getSipDeviceType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipScpDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDeviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDeviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadDistribution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadDistribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipScpRetryTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipScpRetryTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDeviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDeviceType"));
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
