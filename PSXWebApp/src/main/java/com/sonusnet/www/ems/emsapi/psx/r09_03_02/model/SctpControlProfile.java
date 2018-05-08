/**
 * SctpControlProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SctpControlProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sctpControlProfileId;

    private java.lang.String description;

    private java.lang.Short maxDialog;

    private java.lang.Short connectionType;

    private java.lang.Short idleTimeout;

    private java.lang.Short connectionTimeout;

    private java.lang.Short retransmissionTimeout;

    private java.lang.Short retransmissionAttempt;

    private java.lang.String sctpHostName;

    public SctpControlProfile() {
    }

    public SctpControlProfile(
           java.lang.String sctpControlProfileId,
           java.lang.String description,
           java.lang.Short maxDialog,
           java.lang.Short connectionType,
           java.lang.Short idleTimeout,
           java.lang.Short connectionTimeout,
           java.lang.Short retransmissionTimeout,
           java.lang.Short retransmissionAttempt,
           java.lang.String sctpHostName) {
        this.sctpControlProfileId = sctpControlProfileId;
        this.description = description;
        this.maxDialog = maxDialog;
        this.connectionType = connectionType;
        this.idleTimeout = idleTimeout;
        this.connectionTimeout = connectionTimeout;
        this.retransmissionTimeout = retransmissionTimeout;
        this.retransmissionAttempt = retransmissionAttempt;
        this.sctpHostName = sctpHostName;
    }


    /**
     * Gets the sctpControlProfileId value for this SctpControlProfile.
     * 
     * @return sctpControlProfileId
     */
    public java.lang.String getSctpControlProfileId() {
        return sctpControlProfileId;
    }


    /**
     * Sets the sctpControlProfileId value for this SctpControlProfile.
     * 
     * @param sctpControlProfileId
     */
    public void setSctpControlProfileId(java.lang.String sctpControlProfileId) {
        this.sctpControlProfileId = sctpControlProfileId;
    }


    /**
     * Gets the description value for this SctpControlProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SctpControlProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the maxDialog value for this SctpControlProfile.
     * 
     * @return maxDialog
     */
    public java.lang.Short getMaxDialog() {
        return maxDialog;
    }


    /**
     * Sets the maxDialog value for this SctpControlProfile.
     * 
     * @param maxDialog
     */
    public void setMaxDialog(java.lang.Short maxDialog) {
        this.maxDialog = maxDialog;
    }


    /**
     * Gets the connectionType value for this SctpControlProfile.
     * 
     * @return connectionType
     */
    public java.lang.Short getConnectionType() {
        return connectionType;
    }


    /**
     * Sets the connectionType value for this SctpControlProfile.
     * 
     * @param connectionType
     */
    public void setConnectionType(java.lang.Short connectionType) {
        this.connectionType = connectionType;
    }


    /**
     * Gets the idleTimeout value for this SctpControlProfile.
     * 
     * @return idleTimeout
     */
    public java.lang.Short getIdleTimeout() {
        return idleTimeout;
    }


    /**
     * Sets the idleTimeout value for this SctpControlProfile.
     * 
     * @param idleTimeout
     */
    public void setIdleTimeout(java.lang.Short idleTimeout) {
        this.idleTimeout = idleTimeout;
    }


    /**
     * Gets the connectionTimeout value for this SctpControlProfile.
     * 
     * @return connectionTimeout
     */
    public java.lang.Short getConnectionTimeout() {
        return connectionTimeout;
    }


    /**
     * Sets the connectionTimeout value for this SctpControlProfile.
     * 
     * @param connectionTimeout
     */
    public void setConnectionTimeout(java.lang.Short connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }


    /**
     * Gets the retransmissionTimeout value for this SctpControlProfile.
     * 
     * @return retransmissionTimeout
     */
    public java.lang.Short getRetransmissionTimeout() {
        return retransmissionTimeout;
    }


    /**
     * Sets the retransmissionTimeout value for this SctpControlProfile.
     * 
     * @param retransmissionTimeout
     */
    public void setRetransmissionTimeout(java.lang.Short retransmissionTimeout) {
        this.retransmissionTimeout = retransmissionTimeout;
    }


    /**
     * Gets the retransmissionAttempt value for this SctpControlProfile.
     * 
     * @return retransmissionAttempt
     */
    public java.lang.Short getRetransmissionAttempt() {
        return retransmissionAttempt;
    }


    /**
     * Sets the retransmissionAttempt value for this SctpControlProfile.
     * 
     * @param retransmissionAttempt
     */
    public void setRetransmissionAttempt(java.lang.Short retransmissionAttempt) {
        this.retransmissionAttempt = retransmissionAttempt;
    }


    /**
     * Gets the sctpHostName value for this SctpControlProfile.
     * 
     * @return sctpHostName
     */
    public java.lang.String getSctpHostName() {
        return sctpHostName;
    }


    /**
     * Sets the sctpHostName value for this SctpControlProfile.
     * 
     * @param sctpHostName
     */
    public void setSctpHostName(java.lang.String sctpHostName) {
        this.sctpHostName = sctpHostName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SctpControlProfile)) return false;
        SctpControlProfile other = (SctpControlProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sctpControlProfileId==null && other.getSctpControlProfileId()==null) || 
             (this.sctpControlProfileId!=null &&
              this.sctpControlProfileId.equals(other.getSctpControlProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.maxDialog==null && other.getMaxDialog()==null) || 
             (this.maxDialog!=null &&
              this.maxDialog.equals(other.getMaxDialog()))) &&
            ((this.connectionType==null && other.getConnectionType()==null) || 
             (this.connectionType!=null &&
              this.connectionType.equals(other.getConnectionType()))) &&
            ((this.idleTimeout==null && other.getIdleTimeout()==null) || 
             (this.idleTimeout!=null &&
              this.idleTimeout.equals(other.getIdleTimeout()))) &&
            ((this.connectionTimeout==null && other.getConnectionTimeout()==null) || 
             (this.connectionTimeout!=null &&
              this.connectionTimeout.equals(other.getConnectionTimeout()))) &&
            ((this.retransmissionTimeout==null && other.getRetransmissionTimeout()==null) || 
             (this.retransmissionTimeout!=null &&
              this.retransmissionTimeout.equals(other.getRetransmissionTimeout()))) &&
            ((this.retransmissionAttempt==null && other.getRetransmissionAttempt()==null) || 
             (this.retransmissionAttempt!=null &&
              this.retransmissionAttempt.equals(other.getRetransmissionAttempt()))) &&
            ((this.sctpHostName==null && other.getSctpHostName()==null) || 
             (this.sctpHostName!=null &&
              this.sctpHostName.equals(other.getSctpHostName())));
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
        if (getSctpControlProfileId() != null) {
            _hashCode += getSctpControlProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMaxDialog() != null) {
            _hashCode += getMaxDialog().hashCode();
        }
        if (getConnectionType() != null) {
            _hashCode += getConnectionType().hashCode();
        }
        if (getIdleTimeout() != null) {
            _hashCode += getIdleTimeout().hashCode();
        }
        if (getConnectionTimeout() != null) {
            _hashCode += getConnectionTimeout().hashCode();
        }
        if (getRetransmissionTimeout() != null) {
            _hashCode += getRetransmissionTimeout().hashCode();
        }
        if (getRetransmissionAttempt() != null) {
            _hashCode += getRetransmissionAttempt().hashCode();
        }
        if (getSctpHostName() != null) {
            _hashCode += getSctpHostName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SctpControlProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SctpControlProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sctpControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sctpControlProfileId"));
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
        elemField.setFieldName("maxDialog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxDialog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idleTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idleTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retransmissionTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retransmissionTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retransmissionAttempt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retransmissionAttempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sctpHostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sctpHostName"));
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
