/**
 * SgxDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SgxDevice  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sgxDeviceId;

    private java.lang.String primaryHostName;

    private java.lang.String primaryNodeName;

    private java.lang.String primaryPointCode;

    private java.lang.Short primarySubsystemNumber;

    private java.lang.String backupHostName;

    private java.lang.String backupNodeName;

    private java.lang.String backupPointCode;

    private java.lang.Short backupSubsystemNumber;

    private java.lang.Short protocolVariant;

    private java.lang.Integer applicationProtocols;

    public SgxDevice() {
    }

    public SgxDevice(
           java.lang.String sgxDeviceId,
           java.lang.String primaryHostName,
           java.lang.String primaryNodeName,
           java.lang.String primaryPointCode,
           java.lang.Short primarySubsystemNumber,
           java.lang.String backupHostName,
           java.lang.String backupNodeName,
           java.lang.String backupPointCode,
           java.lang.Short backupSubsystemNumber,
           java.lang.Short protocolVariant,
           java.lang.Integer applicationProtocols) {
        this.sgxDeviceId = sgxDeviceId;
        this.primaryHostName = primaryHostName;
        this.primaryNodeName = primaryNodeName;
        this.primaryPointCode = primaryPointCode;
        this.primarySubsystemNumber = primarySubsystemNumber;
        this.backupHostName = backupHostName;
        this.backupNodeName = backupNodeName;
        this.backupPointCode = backupPointCode;
        this.backupSubsystemNumber = backupSubsystemNumber;
        this.protocolVariant = protocolVariant;
        this.applicationProtocols = applicationProtocols;
    }


    /**
     * Gets the sgxDeviceId value for this SgxDevice.
     * 
     * @return sgxDeviceId
     */
    public java.lang.String getSgxDeviceId() {
        return sgxDeviceId;
    }


    /**
     * Sets the sgxDeviceId value for this SgxDevice.
     * 
     * @param sgxDeviceId
     */
    public void setSgxDeviceId(java.lang.String sgxDeviceId) {
        this.sgxDeviceId = sgxDeviceId;
    }


    /**
     * Gets the primaryHostName value for this SgxDevice.
     * 
     * @return primaryHostName
     */
    public java.lang.String getPrimaryHostName() {
        return primaryHostName;
    }


    /**
     * Sets the primaryHostName value for this SgxDevice.
     * 
     * @param primaryHostName
     */
    public void setPrimaryHostName(java.lang.String primaryHostName) {
        this.primaryHostName = primaryHostName;
    }


    /**
     * Gets the primaryNodeName value for this SgxDevice.
     * 
     * @return primaryNodeName
     */
    public java.lang.String getPrimaryNodeName() {
        return primaryNodeName;
    }


    /**
     * Sets the primaryNodeName value for this SgxDevice.
     * 
     * @param primaryNodeName
     */
    public void setPrimaryNodeName(java.lang.String primaryNodeName) {
        this.primaryNodeName = primaryNodeName;
    }


    /**
     * Gets the primaryPointCode value for this SgxDevice.
     * 
     * @return primaryPointCode
     */
    public java.lang.String getPrimaryPointCode() {
        return primaryPointCode;
    }


    /**
     * Sets the primaryPointCode value for this SgxDevice.
     * 
     * @param primaryPointCode
     */
    public void setPrimaryPointCode(java.lang.String primaryPointCode) {
        this.primaryPointCode = primaryPointCode;
    }


    /**
     * Gets the primarySubsystemNumber value for this SgxDevice.
     * 
     * @return primarySubsystemNumber
     */
    public java.lang.Short getPrimarySubsystemNumber() {
        return primarySubsystemNumber;
    }


    /**
     * Sets the primarySubsystemNumber value for this SgxDevice.
     * 
     * @param primarySubsystemNumber
     */
    public void setPrimarySubsystemNumber(java.lang.Short primarySubsystemNumber) {
        this.primarySubsystemNumber = primarySubsystemNumber;
    }


    /**
     * Gets the backupHostName value for this SgxDevice.
     * 
     * @return backupHostName
     */
    public java.lang.String getBackupHostName() {
        return backupHostName;
    }


    /**
     * Sets the backupHostName value for this SgxDevice.
     * 
     * @param backupHostName
     */
    public void setBackupHostName(java.lang.String backupHostName) {
        this.backupHostName = backupHostName;
    }


    /**
     * Gets the backupNodeName value for this SgxDevice.
     * 
     * @return backupNodeName
     */
    public java.lang.String getBackupNodeName() {
        return backupNodeName;
    }


    /**
     * Sets the backupNodeName value for this SgxDevice.
     * 
     * @param backupNodeName
     */
    public void setBackupNodeName(java.lang.String backupNodeName) {
        this.backupNodeName = backupNodeName;
    }


    /**
     * Gets the backupPointCode value for this SgxDevice.
     * 
     * @return backupPointCode
     */
    public java.lang.String getBackupPointCode() {
        return backupPointCode;
    }


    /**
     * Sets the backupPointCode value for this SgxDevice.
     * 
     * @param backupPointCode
     */
    public void setBackupPointCode(java.lang.String backupPointCode) {
        this.backupPointCode = backupPointCode;
    }


    /**
     * Gets the backupSubsystemNumber value for this SgxDevice.
     * 
     * @return backupSubsystemNumber
     */
    public java.lang.Short getBackupSubsystemNumber() {
        return backupSubsystemNumber;
    }


    /**
     * Sets the backupSubsystemNumber value for this SgxDevice.
     * 
     * @param backupSubsystemNumber
     */
    public void setBackupSubsystemNumber(java.lang.Short backupSubsystemNumber) {
        this.backupSubsystemNumber = backupSubsystemNumber;
    }


    /**
     * Gets the protocolVariant value for this SgxDevice.
     * 
     * @return protocolVariant
     */
    public java.lang.Short getProtocolVariant() {
        return protocolVariant;
    }


    /**
     * Sets the protocolVariant value for this SgxDevice.
     * 
     * @param protocolVariant
     */
    public void setProtocolVariant(java.lang.Short protocolVariant) {
        this.protocolVariant = protocolVariant;
    }


    /**
     * Gets the applicationProtocols value for this SgxDevice.
     * 
     * @return applicationProtocols
     */
    public java.lang.Integer getApplicationProtocols() {
        return applicationProtocols;
    }


    /**
     * Sets the applicationProtocols value for this SgxDevice.
     * 
     * @param applicationProtocols
     */
    public void setApplicationProtocols(java.lang.Integer applicationProtocols) {
        this.applicationProtocols = applicationProtocols;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SgxDevice)) return false;
        SgxDevice other = (SgxDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sgxDeviceId==null && other.getSgxDeviceId()==null) || 
             (this.sgxDeviceId!=null &&
              this.sgxDeviceId.equals(other.getSgxDeviceId()))) &&
            ((this.primaryHostName==null && other.getPrimaryHostName()==null) || 
             (this.primaryHostName!=null &&
              this.primaryHostName.equals(other.getPrimaryHostName()))) &&
            ((this.primaryNodeName==null && other.getPrimaryNodeName()==null) || 
             (this.primaryNodeName!=null &&
              this.primaryNodeName.equals(other.getPrimaryNodeName()))) &&
            ((this.primaryPointCode==null && other.getPrimaryPointCode()==null) || 
             (this.primaryPointCode!=null &&
              this.primaryPointCode.equals(other.getPrimaryPointCode()))) &&
            ((this.primarySubsystemNumber==null && other.getPrimarySubsystemNumber()==null) || 
             (this.primarySubsystemNumber!=null &&
              this.primarySubsystemNumber.equals(other.getPrimarySubsystemNumber()))) &&
            ((this.backupHostName==null && other.getBackupHostName()==null) || 
             (this.backupHostName!=null &&
              this.backupHostName.equals(other.getBackupHostName()))) &&
            ((this.backupNodeName==null && other.getBackupNodeName()==null) || 
             (this.backupNodeName!=null &&
              this.backupNodeName.equals(other.getBackupNodeName()))) &&
            ((this.backupPointCode==null && other.getBackupPointCode()==null) || 
             (this.backupPointCode!=null &&
              this.backupPointCode.equals(other.getBackupPointCode()))) &&
            ((this.backupSubsystemNumber==null && other.getBackupSubsystemNumber()==null) || 
             (this.backupSubsystemNumber!=null &&
              this.backupSubsystemNumber.equals(other.getBackupSubsystemNumber()))) &&
            ((this.protocolVariant==null && other.getProtocolVariant()==null) || 
             (this.protocolVariant!=null &&
              this.protocolVariant.equals(other.getProtocolVariant()))) &&
            ((this.applicationProtocols==null && other.getApplicationProtocols()==null) || 
             (this.applicationProtocols!=null &&
              this.applicationProtocols.equals(other.getApplicationProtocols())));
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
        if (getSgxDeviceId() != null) {
            _hashCode += getSgxDeviceId().hashCode();
        }
        if (getPrimaryHostName() != null) {
            _hashCode += getPrimaryHostName().hashCode();
        }
        if (getPrimaryNodeName() != null) {
            _hashCode += getPrimaryNodeName().hashCode();
        }
        if (getPrimaryPointCode() != null) {
            _hashCode += getPrimaryPointCode().hashCode();
        }
        if (getPrimarySubsystemNumber() != null) {
            _hashCode += getPrimarySubsystemNumber().hashCode();
        }
        if (getBackupHostName() != null) {
            _hashCode += getBackupHostName().hashCode();
        }
        if (getBackupNodeName() != null) {
            _hashCode += getBackupNodeName().hashCode();
        }
        if (getBackupPointCode() != null) {
            _hashCode += getBackupPointCode().hashCode();
        }
        if (getBackupSubsystemNumber() != null) {
            _hashCode += getBackupSubsystemNumber().hashCode();
        }
        if (getProtocolVariant() != null) {
            _hashCode += getProtocolVariant().hashCode();
        }
        if (getApplicationProtocols() != null) {
            _hashCode += getApplicationProtocols().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SgxDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SgxDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sgxDeviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sgxDeviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryHostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryHostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryNodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryNodeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryPointCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryPointCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySubsystemNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primarySubsystemNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupHostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupHostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupNodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupNodeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupPointCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupPointCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupSubsystemNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupSubsystemNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocolVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationProtocols");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationProtocols"));
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
