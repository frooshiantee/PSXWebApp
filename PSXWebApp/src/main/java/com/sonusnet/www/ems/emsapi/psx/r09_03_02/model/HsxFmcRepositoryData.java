/**
 * HsxFmcRepositoryData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxFmcRepositoryData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String publicUserId;

    private java.lang.String defaultDomain;

    private java.lang.String fdi;

    private java.lang.String fdn;

    private java.lang.String deviceType;

    private java.lang.String alternateDevice;

    private java.lang.String cs2IpDomainTransfer;

    private java.lang.String ip2CsDomainTransfer;

    public HsxFmcRepositoryData() {
    }

    public HsxFmcRepositoryData(
           java.lang.String publicUserId,
           java.lang.String defaultDomain,
           java.lang.String fdi,
           java.lang.String fdn,
           java.lang.String deviceType,
           java.lang.String alternateDevice,
           java.lang.String cs2IpDomainTransfer,
           java.lang.String ip2CsDomainTransfer) {
        this.publicUserId = publicUserId;
        this.defaultDomain = defaultDomain;
        this.fdi = fdi;
        this.fdn = fdn;
        this.deviceType = deviceType;
        this.alternateDevice = alternateDevice;
        this.cs2IpDomainTransfer = cs2IpDomainTransfer;
        this.ip2CsDomainTransfer = ip2CsDomainTransfer;
    }


    /**
     * Gets the publicUserId value for this HsxFmcRepositoryData.
     * 
     * @return publicUserId
     */
    public java.lang.String getPublicUserId() {
        return publicUserId;
    }


    /**
     * Sets the publicUserId value for this HsxFmcRepositoryData.
     * 
     * @param publicUserId
     */
    public void setPublicUserId(java.lang.String publicUserId) {
        this.publicUserId = publicUserId;
    }


    /**
     * Gets the defaultDomain value for this HsxFmcRepositoryData.
     * 
     * @return defaultDomain
     */
    public java.lang.String getDefaultDomain() {
        return defaultDomain;
    }


    /**
     * Sets the defaultDomain value for this HsxFmcRepositoryData.
     * 
     * @param defaultDomain
     */
    public void setDefaultDomain(java.lang.String defaultDomain) {
        this.defaultDomain = defaultDomain;
    }


    /**
     * Gets the fdi value for this HsxFmcRepositoryData.
     * 
     * @return fdi
     */
    public java.lang.String getFdi() {
        return fdi;
    }


    /**
     * Sets the fdi value for this HsxFmcRepositoryData.
     * 
     * @param fdi
     */
    public void setFdi(java.lang.String fdi) {
        this.fdi = fdi;
    }


    /**
     * Gets the fdn value for this HsxFmcRepositoryData.
     * 
     * @return fdn
     */
    public java.lang.String getFdn() {
        return fdn;
    }


    /**
     * Sets the fdn value for this HsxFmcRepositoryData.
     * 
     * @param fdn
     */
    public void setFdn(java.lang.String fdn) {
        this.fdn = fdn;
    }


    /**
     * Gets the deviceType value for this HsxFmcRepositoryData.
     * 
     * @return deviceType
     */
    public java.lang.String getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this HsxFmcRepositoryData.
     * 
     * @param deviceType
     */
    public void setDeviceType(java.lang.String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the alternateDevice value for this HsxFmcRepositoryData.
     * 
     * @return alternateDevice
     */
    public java.lang.String getAlternateDevice() {
        return alternateDevice;
    }


    /**
     * Sets the alternateDevice value for this HsxFmcRepositoryData.
     * 
     * @param alternateDevice
     */
    public void setAlternateDevice(java.lang.String alternateDevice) {
        this.alternateDevice = alternateDevice;
    }


    /**
     * Gets the cs2IpDomainTransfer value for this HsxFmcRepositoryData.
     * 
     * @return cs2IpDomainTransfer
     */
    public java.lang.String getCs2IpDomainTransfer() {
        return cs2IpDomainTransfer;
    }


    /**
     * Sets the cs2IpDomainTransfer value for this HsxFmcRepositoryData.
     * 
     * @param cs2IpDomainTransfer
     */
    public void setCs2IpDomainTransfer(java.lang.String cs2IpDomainTransfer) {
        this.cs2IpDomainTransfer = cs2IpDomainTransfer;
    }


    /**
     * Gets the ip2CsDomainTransfer value for this HsxFmcRepositoryData.
     * 
     * @return ip2CsDomainTransfer
     */
    public java.lang.String getIp2CsDomainTransfer() {
        return ip2CsDomainTransfer;
    }


    /**
     * Sets the ip2CsDomainTransfer value for this HsxFmcRepositoryData.
     * 
     * @param ip2CsDomainTransfer
     */
    public void setIp2CsDomainTransfer(java.lang.String ip2CsDomainTransfer) {
        this.ip2CsDomainTransfer = ip2CsDomainTransfer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxFmcRepositoryData)) return false;
        HsxFmcRepositoryData other = (HsxFmcRepositoryData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.publicUserId==null && other.getPublicUserId()==null) || 
             (this.publicUserId!=null &&
              this.publicUserId.equals(other.getPublicUserId()))) &&
            ((this.defaultDomain==null && other.getDefaultDomain()==null) || 
             (this.defaultDomain!=null &&
              this.defaultDomain.equals(other.getDefaultDomain()))) &&
            ((this.fdi==null && other.getFdi()==null) || 
             (this.fdi!=null &&
              this.fdi.equals(other.getFdi()))) &&
            ((this.fdn==null && other.getFdn()==null) || 
             (this.fdn!=null &&
              this.fdn.equals(other.getFdn()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.alternateDevice==null && other.getAlternateDevice()==null) || 
             (this.alternateDevice!=null &&
              this.alternateDevice.equals(other.getAlternateDevice()))) &&
            ((this.cs2IpDomainTransfer==null && other.getCs2IpDomainTransfer()==null) || 
             (this.cs2IpDomainTransfer!=null &&
              this.cs2IpDomainTransfer.equals(other.getCs2IpDomainTransfer()))) &&
            ((this.ip2CsDomainTransfer==null && other.getIp2CsDomainTransfer()==null) || 
             (this.ip2CsDomainTransfer!=null &&
              this.ip2CsDomainTransfer.equals(other.getIp2CsDomainTransfer())));
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
        if (getPublicUserId() != null) {
            _hashCode += getPublicUserId().hashCode();
        }
        if (getDefaultDomain() != null) {
            _hashCode += getDefaultDomain().hashCode();
        }
        if (getFdi() != null) {
            _hashCode += getFdi().hashCode();
        }
        if (getFdn() != null) {
            _hashCode += getFdn().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getAlternateDevice() != null) {
            _hashCode += getAlternateDevice().hashCode();
        }
        if (getCs2IpDomainTransfer() != null) {
            _hashCode += getCs2IpDomainTransfer().hashCode();
        }
        if (getIp2CsDomainTransfer() != null) {
            _hashCode += getIp2CsDomainTransfer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxFmcRepositoryData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxFmcRepositoryData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fdi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fdi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alternateDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cs2IpDomainTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cs2ipDomainTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip2CsDomainTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip2csDomainTransfer"));
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
