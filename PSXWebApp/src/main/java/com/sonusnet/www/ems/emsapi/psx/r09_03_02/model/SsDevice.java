/**
 * SsDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SsDevice  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String ssDeviceId;

    private java.lang.Short deviceType;

    private java.lang.String hostName;

    private java.lang.Short portNumber;

    private java.lang.Integer keepAliveTimer;

    private java.lang.Integer maxKeepAlivesMissed;

    private java.lang.Integer maxTransactionTimer;

    private java.lang.Integer maxTransactionRetries;

    private java.lang.Integer registrationTimer;

    public SsDevice() {
    }

    public SsDevice(
           java.lang.String ssDeviceId,
           java.lang.Short deviceType,
           java.lang.String hostName,
           java.lang.Short portNumber,
           java.lang.Integer keepAliveTimer,
           java.lang.Integer maxKeepAlivesMissed,
           java.lang.Integer maxTransactionTimer,
           java.lang.Integer maxTransactionRetries,
           java.lang.Integer registrationTimer) {
        this.ssDeviceId = ssDeviceId;
        this.deviceType = deviceType;
        this.hostName = hostName;
        this.portNumber = portNumber;
        this.keepAliveTimer = keepAliveTimer;
        this.maxKeepAlivesMissed = maxKeepAlivesMissed;
        this.maxTransactionTimer = maxTransactionTimer;
        this.maxTransactionRetries = maxTransactionRetries;
        this.registrationTimer = registrationTimer;
    }


    /**
     * Gets the ssDeviceId value for this SsDevice.
     * 
     * @return ssDeviceId
     */
    public java.lang.String getSsDeviceId() {
        return ssDeviceId;
    }


    /**
     * Sets the ssDeviceId value for this SsDevice.
     * 
     * @param ssDeviceId
     */
    public void setSsDeviceId(java.lang.String ssDeviceId) {
        this.ssDeviceId = ssDeviceId;
    }


    /**
     * Gets the deviceType value for this SsDevice.
     * 
     * @return deviceType
     */
    public java.lang.Short getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this SsDevice.
     * 
     * @param deviceType
     */
    public void setDeviceType(java.lang.Short deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the hostName value for this SsDevice.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this SsDevice.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the portNumber value for this SsDevice.
     * 
     * @return portNumber
     */
    public java.lang.Short getPortNumber() {
        return portNumber;
    }


    /**
     * Sets the portNumber value for this SsDevice.
     * 
     * @param portNumber
     */
    public void setPortNumber(java.lang.Short portNumber) {
        this.portNumber = portNumber;
    }


    /**
     * Gets the keepAliveTimer value for this SsDevice.
     * 
     * @return keepAliveTimer
     */
    public java.lang.Integer getKeepAliveTimer() {
        return keepAliveTimer;
    }


    /**
     * Sets the keepAliveTimer value for this SsDevice.
     * 
     * @param keepAliveTimer
     */
    public void setKeepAliveTimer(java.lang.Integer keepAliveTimer) {
        this.keepAliveTimer = keepAliveTimer;
    }


    /**
     * Gets the maxKeepAlivesMissed value for this SsDevice.
     * 
     * @return maxKeepAlivesMissed
     */
    public java.lang.Integer getMaxKeepAlivesMissed() {
        return maxKeepAlivesMissed;
    }


    /**
     * Sets the maxKeepAlivesMissed value for this SsDevice.
     * 
     * @param maxKeepAlivesMissed
     */
    public void setMaxKeepAlivesMissed(java.lang.Integer maxKeepAlivesMissed) {
        this.maxKeepAlivesMissed = maxKeepAlivesMissed;
    }


    /**
     * Gets the maxTransactionTimer value for this SsDevice.
     * 
     * @return maxTransactionTimer
     */
    public java.lang.Integer getMaxTransactionTimer() {
        return maxTransactionTimer;
    }


    /**
     * Sets the maxTransactionTimer value for this SsDevice.
     * 
     * @param maxTransactionTimer
     */
    public void setMaxTransactionTimer(java.lang.Integer maxTransactionTimer) {
        this.maxTransactionTimer = maxTransactionTimer;
    }


    /**
     * Gets the maxTransactionRetries value for this SsDevice.
     * 
     * @return maxTransactionRetries
     */
    public java.lang.Integer getMaxTransactionRetries() {
        return maxTransactionRetries;
    }


    /**
     * Sets the maxTransactionRetries value for this SsDevice.
     * 
     * @param maxTransactionRetries
     */
    public void setMaxTransactionRetries(java.lang.Integer maxTransactionRetries) {
        this.maxTransactionRetries = maxTransactionRetries;
    }


    /**
     * Gets the registrationTimer value for this SsDevice.
     * 
     * @return registrationTimer
     */
    public java.lang.Integer getRegistrationTimer() {
        return registrationTimer;
    }


    /**
     * Sets the registrationTimer value for this SsDevice.
     * 
     * @param registrationTimer
     */
    public void setRegistrationTimer(java.lang.Integer registrationTimer) {
        this.registrationTimer = registrationTimer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SsDevice)) return false;
        SsDevice other = (SsDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ssDeviceId==null && other.getSsDeviceId()==null) || 
             (this.ssDeviceId!=null &&
              this.ssDeviceId.equals(other.getSsDeviceId()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.portNumber==null && other.getPortNumber()==null) || 
             (this.portNumber!=null &&
              this.portNumber.equals(other.getPortNumber()))) &&
            ((this.keepAliveTimer==null && other.getKeepAliveTimer()==null) || 
             (this.keepAliveTimer!=null &&
              this.keepAliveTimer.equals(other.getKeepAliveTimer()))) &&
            ((this.maxKeepAlivesMissed==null && other.getMaxKeepAlivesMissed()==null) || 
             (this.maxKeepAlivesMissed!=null &&
              this.maxKeepAlivesMissed.equals(other.getMaxKeepAlivesMissed()))) &&
            ((this.maxTransactionTimer==null && other.getMaxTransactionTimer()==null) || 
             (this.maxTransactionTimer!=null &&
              this.maxTransactionTimer.equals(other.getMaxTransactionTimer()))) &&
            ((this.maxTransactionRetries==null && other.getMaxTransactionRetries()==null) || 
             (this.maxTransactionRetries!=null &&
              this.maxTransactionRetries.equals(other.getMaxTransactionRetries()))) &&
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
        if (getSsDeviceId() != null) {
            _hashCode += getSsDeviceId().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getPortNumber() != null) {
            _hashCode += getPortNumber().hashCode();
        }
        if (getKeepAliveTimer() != null) {
            _hashCode += getKeepAliveTimer().hashCode();
        }
        if (getMaxKeepAlivesMissed() != null) {
            _hashCode += getMaxKeepAlivesMissed().hashCode();
        }
        if (getMaxTransactionTimer() != null) {
            _hashCode += getMaxTransactionTimer().hashCode();
        }
        if (getMaxTransactionRetries() != null) {
            _hashCode += getMaxTransactionRetries().hashCode();
        }
        if (getRegistrationTimer() != null) {
            _hashCode += getRegistrationTimer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SsDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SsDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssDeviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssDeviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keepAliveTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keepAliveTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxKeepAlivesMissed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxKeepAlivesMissed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTransactionTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxTransactionTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTransactionRetries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxTransactionRetries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
