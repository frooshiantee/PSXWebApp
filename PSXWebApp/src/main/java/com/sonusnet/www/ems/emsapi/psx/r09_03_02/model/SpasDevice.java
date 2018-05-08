/**
 * SpasDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SpasDevice  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String spasDevice;

    private java.lang.String description;

    private java.lang.String hostName;

    private java.lang.Short portNumber;

    private java.lang.Integer maxKeepAlivesMissed;

    private java.lang.Integer keepAliveTimer;

    private java.lang.Integer interKeepAliveTimer;

    private java.lang.Integer attributes;

    public SpasDevice() {
    }

    public SpasDevice(
           java.lang.String spasDevice,
           java.lang.String description,
           java.lang.String hostName,
           java.lang.Short portNumber,
           java.lang.Integer maxKeepAlivesMissed,
           java.lang.Integer keepAliveTimer,
           java.lang.Integer interKeepAliveTimer,
           java.lang.Integer attributes) {
        this.spasDevice = spasDevice;
        this.description = description;
        this.hostName = hostName;
        this.portNumber = portNumber;
        this.maxKeepAlivesMissed = maxKeepAlivesMissed;
        this.keepAliveTimer = keepAliveTimer;
        this.interKeepAliveTimer = interKeepAliveTimer;
        this.attributes = attributes;
    }


    /**
     * Gets the spasDevice value for this SpasDevice.
     * 
     * @return spasDevice
     */
    public java.lang.String getSpasDevice() {
        return spasDevice;
    }


    /**
     * Sets the spasDevice value for this SpasDevice.
     * 
     * @param spasDevice
     */
    public void setSpasDevice(java.lang.String spasDevice) {
        this.spasDevice = spasDevice;
    }


    /**
     * Gets the description value for this SpasDevice.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SpasDevice.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the hostName value for this SpasDevice.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this SpasDevice.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the portNumber value for this SpasDevice.
     * 
     * @return portNumber
     */
    public java.lang.Short getPortNumber() {
        return portNumber;
    }


    /**
     * Sets the portNumber value for this SpasDevice.
     * 
     * @param portNumber
     */
    public void setPortNumber(java.lang.Short portNumber) {
        this.portNumber = portNumber;
    }


    /**
     * Gets the maxKeepAlivesMissed value for this SpasDevice.
     * 
     * @return maxKeepAlivesMissed
     */
    public java.lang.Integer getMaxKeepAlivesMissed() {
        return maxKeepAlivesMissed;
    }


    /**
     * Sets the maxKeepAlivesMissed value for this SpasDevice.
     * 
     * @param maxKeepAlivesMissed
     */
    public void setMaxKeepAlivesMissed(java.lang.Integer maxKeepAlivesMissed) {
        this.maxKeepAlivesMissed = maxKeepAlivesMissed;
    }


    /**
     * Gets the keepAliveTimer value for this SpasDevice.
     * 
     * @return keepAliveTimer
     */
    public java.lang.Integer getKeepAliveTimer() {
        return keepAliveTimer;
    }


    /**
     * Sets the keepAliveTimer value for this SpasDevice.
     * 
     * @param keepAliveTimer
     */
    public void setKeepAliveTimer(java.lang.Integer keepAliveTimer) {
        this.keepAliveTimer = keepAliveTimer;
    }


    /**
     * Gets the interKeepAliveTimer value for this SpasDevice.
     * 
     * @return interKeepAliveTimer
     */
    public java.lang.Integer getInterKeepAliveTimer() {
        return interKeepAliveTimer;
    }


    /**
     * Sets the interKeepAliveTimer value for this SpasDevice.
     * 
     * @param interKeepAliveTimer
     */
    public void setInterKeepAliveTimer(java.lang.Integer interKeepAliveTimer) {
        this.interKeepAliveTimer = interKeepAliveTimer;
    }


    /**
     * Gets the attributes value for this SpasDevice.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this SpasDevice.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpasDevice)) return false;
        SpasDevice other = (SpasDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.spasDevice==null && other.getSpasDevice()==null) || 
             (this.spasDevice!=null &&
              this.spasDevice.equals(other.getSpasDevice()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.portNumber==null && other.getPortNumber()==null) || 
             (this.portNumber!=null &&
              this.portNumber.equals(other.getPortNumber()))) &&
            ((this.maxKeepAlivesMissed==null && other.getMaxKeepAlivesMissed()==null) || 
             (this.maxKeepAlivesMissed!=null &&
              this.maxKeepAlivesMissed.equals(other.getMaxKeepAlivesMissed()))) &&
            ((this.keepAliveTimer==null && other.getKeepAliveTimer()==null) || 
             (this.keepAliveTimer!=null &&
              this.keepAliveTimer.equals(other.getKeepAliveTimer()))) &&
            ((this.interKeepAliveTimer==null && other.getInterKeepAliveTimer()==null) || 
             (this.interKeepAliveTimer!=null &&
              this.interKeepAliveTimer.equals(other.getInterKeepAliveTimer()))) &&
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
        if (getSpasDevice() != null) {
            _hashCode += getSpasDevice().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getPortNumber() != null) {
            _hashCode += getPortNumber().hashCode();
        }
        if (getMaxKeepAlivesMissed() != null) {
            _hashCode += getMaxKeepAlivesMissed().hashCode();
        }
        if (getKeepAliveTimer() != null) {
            _hashCode += getKeepAliveTimer().hashCode();
        }
        if (getInterKeepAliveTimer() != null) {
            _hashCode += getInterKeepAliveTimer().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpasDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SpasDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spasDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spasDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("maxKeepAlivesMissed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxKeepAlivesMissed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keepAliveTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keepAliveTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interKeepAliveTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interKeepAliveTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
