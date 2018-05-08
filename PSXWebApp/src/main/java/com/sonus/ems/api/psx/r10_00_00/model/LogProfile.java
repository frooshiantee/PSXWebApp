/**
 * LogProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class LogProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String logProfileId;
    private java.lang.Integer logProfileType;
    private java.lang.String description;
    private java.lang.Integer logLevels;
    private java.lang.Integer logProcessLayers;

    public LogProfile() {
    }

    public LogProfile(
           java.lang.String logProfileId,
           java.lang.Integer logProfileType,
           java.lang.String description,
           java.lang.Integer logLevels,
           java.lang.Integer logProcessLayers) {
           this.logProfileId = logProfileId;
           this.logProfileType = logProfileType;
           this.description = description;
           this.logLevels = logLevels;
           this.logProcessLayers = logProcessLayers;
    }


    /**
     * Gets the logProfileId value for this LogProfile.
     * 
     * @return logProfileId
     */
    public java.lang.String getLogProfileId() {
        return logProfileId;
    }


    /**
     * Sets the logProfileId value for this LogProfile.
     * 
     * @param logProfileId
     */
    public void setLogProfileId(java.lang.String logProfileId) {
        this.logProfileId = logProfileId;
    }


    /**
     * Gets the logProfileType value for this LogProfile.
     * 
     * @return logProfileType
     */
    public java.lang.Integer getLogProfileType() {
        return logProfileType;
    }


    /**
     * Sets the logProfileType value for this LogProfile.
     * 
     * @param logProfileType
     */
    public void setLogProfileType(java.lang.Integer logProfileType) {
        this.logProfileType = logProfileType;
    }


    /**
     * Gets the description value for this LogProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LogProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the logLevels value for this LogProfile.
     * 
     * @return logLevels
     */
    public java.lang.Integer getLogLevels() {
        return logLevels;
    }


    /**
     * Sets the logLevels value for this LogProfile.
     * 
     * @param logLevels
     */
    public void setLogLevels(java.lang.Integer logLevels) {
        this.logLevels = logLevels;
    }


    /**
     * Gets the logProcessLayers value for this LogProfile.
     * 
     * @return logProcessLayers
     */
    public java.lang.Integer getLogProcessLayers() {
        return logProcessLayers;
    }


    /**
     * Sets the logProcessLayers value for this LogProfile.
     * 
     * @param logProcessLayers
     */
    public void setLogProcessLayers(java.lang.Integer logProcessLayers) {
        this.logProcessLayers = logProcessLayers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogProfile)) return false;
        LogProfile other = (LogProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.logProfileId==null && other.getLogProfileId()==null) || 
             (this.logProfileId!=null &&
              this.logProfileId.equals(other.getLogProfileId()))) &&
            ((this.logProfileType==null && other.getLogProfileType()==null) || 
             (this.logProfileType!=null &&
              this.logProfileType.equals(other.getLogProfileType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.logLevels==null && other.getLogLevels()==null) || 
             (this.logLevels!=null &&
              this.logLevels.equals(other.getLogLevels()))) &&
            ((this.logProcessLayers==null && other.getLogProcessLayers()==null) || 
             (this.logProcessLayers!=null &&
              this.logProcessLayers.equals(other.getLogProcessLayers())));
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
        if (getLogProfileId() != null) {
            _hashCode += getLogProfileId().hashCode();
        }
        if (getLogProfileType() != null) {
            _hashCode += getLogProfileType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLogLevels() != null) {
            _hashCode += getLogLevels().hashCode();
        }
        if (getLogProcessLayers() != null) {
            _hashCode += getLogProcessLayers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LogProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logProfileType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logProfileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logProcessLayers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logProcessLayers"));
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
