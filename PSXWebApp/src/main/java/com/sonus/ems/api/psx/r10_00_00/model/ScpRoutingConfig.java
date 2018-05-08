/**
 * ScpRoutingConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ScpRoutingConfig  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String scpRoutingConfigId;
    private java.lang.Short scpSubsystemNumber;
    private java.lang.Short scpTranslationType;
    private java.lang.String scpDestinationPointCode;
    private java.lang.Short scpGlobalTitleTrans;
    private java.lang.Short scpGlobalTitleLen;
    private java.lang.Integer scpRequestTimeout;
    private java.lang.Short routingType;
    private java.lang.Short inGttTranslationType;
    private java.lang.Short inGttGlobalTitleTrans;
    private java.lang.Short inGttGlobalTitleLen;
    private java.lang.Short inGttRoutingType;
    private java.lang.String scpGttFixedDigits;
    private java.lang.String inGttFixedDigits;
    private java.lang.String pcSsnProfileId;
    private java.lang.Integer usePcSsnProfile;
    private java.lang.String scpGtProfileId;
    private java.lang.String inGtProfileId;
    private java.lang.Integer scpAttributes;

    public ScpRoutingConfig() {
    }

    public ScpRoutingConfig(
           java.lang.String scpRoutingConfigId,
           java.lang.Short scpSubsystemNumber,
           java.lang.Short scpTranslationType,
           java.lang.String scpDestinationPointCode,
           java.lang.Short scpGlobalTitleTrans,
           java.lang.Short scpGlobalTitleLen,
           java.lang.Integer scpRequestTimeout,
           java.lang.Short routingType,
           java.lang.Short inGttTranslationType,
           java.lang.Short inGttGlobalTitleTrans,
           java.lang.Short inGttGlobalTitleLen,
           java.lang.Short inGttRoutingType,
           java.lang.String scpGttFixedDigits,
           java.lang.String inGttFixedDigits,
           java.lang.String pcSsnProfileId,
           java.lang.Integer usePcSsnProfile,
           java.lang.String scpGtProfileId,
           java.lang.String inGtProfileId,
           java.lang.Integer scpAttributes) {
           this.scpRoutingConfigId = scpRoutingConfigId;
           this.scpSubsystemNumber = scpSubsystemNumber;
           this.scpTranslationType = scpTranslationType;
           this.scpDestinationPointCode = scpDestinationPointCode;
           this.scpGlobalTitleTrans = scpGlobalTitleTrans;
           this.scpGlobalTitleLen = scpGlobalTitleLen;
           this.scpRequestTimeout = scpRequestTimeout;
           this.routingType = routingType;
           this.inGttTranslationType = inGttTranslationType;
           this.inGttGlobalTitleTrans = inGttGlobalTitleTrans;
           this.inGttGlobalTitleLen = inGttGlobalTitleLen;
           this.inGttRoutingType = inGttRoutingType;
           this.scpGttFixedDigits = scpGttFixedDigits;
           this.inGttFixedDigits = inGttFixedDigits;
           this.pcSsnProfileId = pcSsnProfileId;
           this.usePcSsnProfile = usePcSsnProfile;
           this.scpGtProfileId = scpGtProfileId;
           this.inGtProfileId = inGtProfileId;
           this.scpAttributes = scpAttributes;
    }


    /**
     * Gets the scpRoutingConfigId value for this ScpRoutingConfig.
     * 
     * @return scpRoutingConfigId
     */
    public java.lang.String getScpRoutingConfigId() {
        return scpRoutingConfigId;
    }


    /**
     * Sets the scpRoutingConfigId value for this ScpRoutingConfig.
     * 
     * @param scpRoutingConfigId
     */
    public void setScpRoutingConfigId(java.lang.String scpRoutingConfigId) {
        this.scpRoutingConfigId = scpRoutingConfigId;
    }


    /**
     * Gets the scpSubsystemNumber value for this ScpRoutingConfig.
     * 
     * @return scpSubsystemNumber
     */
    public java.lang.Short getScpSubsystemNumber() {
        return scpSubsystemNumber;
    }


    /**
     * Sets the scpSubsystemNumber value for this ScpRoutingConfig.
     * 
     * @param scpSubsystemNumber
     */
    public void setScpSubsystemNumber(java.lang.Short scpSubsystemNumber) {
        this.scpSubsystemNumber = scpSubsystemNumber;
    }


    /**
     * Gets the scpTranslationType value for this ScpRoutingConfig.
     * 
     * @return scpTranslationType
     */
    public java.lang.Short getScpTranslationType() {
        return scpTranslationType;
    }


    /**
     * Sets the scpTranslationType value for this ScpRoutingConfig.
     * 
     * @param scpTranslationType
     */
    public void setScpTranslationType(java.lang.Short scpTranslationType) {
        this.scpTranslationType = scpTranslationType;
    }


    /**
     * Gets the scpDestinationPointCode value for this ScpRoutingConfig.
     * 
     * @return scpDestinationPointCode
     */
    public java.lang.String getScpDestinationPointCode() {
        return scpDestinationPointCode;
    }


    /**
     * Sets the scpDestinationPointCode value for this ScpRoutingConfig.
     * 
     * @param scpDestinationPointCode
     */
    public void setScpDestinationPointCode(java.lang.String scpDestinationPointCode) {
        this.scpDestinationPointCode = scpDestinationPointCode;
    }


    /**
     * Gets the scpGlobalTitleTrans value for this ScpRoutingConfig.
     * 
     * @return scpGlobalTitleTrans
     */
    public java.lang.Short getScpGlobalTitleTrans() {
        return scpGlobalTitleTrans;
    }


    /**
     * Sets the scpGlobalTitleTrans value for this ScpRoutingConfig.
     * 
     * @param scpGlobalTitleTrans
     */
    public void setScpGlobalTitleTrans(java.lang.Short scpGlobalTitleTrans) {
        this.scpGlobalTitleTrans = scpGlobalTitleTrans;
    }


    /**
     * Gets the scpGlobalTitleLen value for this ScpRoutingConfig.
     * 
     * @return scpGlobalTitleLen
     */
    public java.lang.Short getScpGlobalTitleLen() {
        return scpGlobalTitleLen;
    }


    /**
     * Sets the scpGlobalTitleLen value for this ScpRoutingConfig.
     * 
     * @param scpGlobalTitleLen
     */
    public void setScpGlobalTitleLen(java.lang.Short scpGlobalTitleLen) {
        this.scpGlobalTitleLen = scpGlobalTitleLen;
    }


    /**
     * Gets the scpRequestTimeout value for this ScpRoutingConfig.
     * 
     * @return scpRequestTimeout
     */
    public java.lang.Integer getScpRequestTimeout() {
        return scpRequestTimeout;
    }


    /**
     * Sets the scpRequestTimeout value for this ScpRoutingConfig.
     * 
     * @param scpRequestTimeout
     */
    public void setScpRequestTimeout(java.lang.Integer scpRequestTimeout) {
        this.scpRequestTimeout = scpRequestTimeout;
    }


    /**
     * Gets the routingType value for this ScpRoutingConfig.
     * 
     * @return routingType
     */
    public java.lang.Short getRoutingType() {
        return routingType;
    }


    /**
     * Sets the routingType value for this ScpRoutingConfig.
     * 
     * @param routingType
     */
    public void setRoutingType(java.lang.Short routingType) {
        this.routingType = routingType;
    }


    /**
     * Gets the inGttTranslationType value for this ScpRoutingConfig.
     * 
     * @return inGttTranslationType
     */
    public java.lang.Short getInGttTranslationType() {
        return inGttTranslationType;
    }


    /**
     * Sets the inGttTranslationType value for this ScpRoutingConfig.
     * 
     * @param inGttTranslationType
     */
    public void setInGttTranslationType(java.lang.Short inGttTranslationType) {
        this.inGttTranslationType = inGttTranslationType;
    }


    /**
     * Gets the inGttGlobalTitleTrans value for this ScpRoutingConfig.
     * 
     * @return inGttGlobalTitleTrans
     */
    public java.lang.Short getInGttGlobalTitleTrans() {
        return inGttGlobalTitleTrans;
    }


    /**
     * Sets the inGttGlobalTitleTrans value for this ScpRoutingConfig.
     * 
     * @param inGttGlobalTitleTrans
     */
    public void setInGttGlobalTitleTrans(java.lang.Short inGttGlobalTitleTrans) {
        this.inGttGlobalTitleTrans = inGttGlobalTitleTrans;
    }


    /**
     * Gets the inGttGlobalTitleLen value for this ScpRoutingConfig.
     * 
     * @return inGttGlobalTitleLen
     */
    public java.lang.Short getInGttGlobalTitleLen() {
        return inGttGlobalTitleLen;
    }


    /**
     * Sets the inGttGlobalTitleLen value for this ScpRoutingConfig.
     * 
     * @param inGttGlobalTitleLen
     */
    public void setInGttGlobalTitleLen(java.lang.Short inGttGlobalTitleLen) {
        this.inGttGlobalTitleLen = inGttGlobalTitleLen;
    }


    /**
     * Gets the inGttRoutingType value for this ScpRoutingConfig.
     * 
     * @return inGttRoutingType
     */
    public java.lang.Short getInGttRoutingType() {
        return inGttRoutingType;
    }


    /**
     * Sets the inGttRoutingType value for this ScpRoutingConfig.
     * 
     * @param inGttRoutingType
     */
    public void setInGttRoutingType(java.lang.Short inGttRoutingType) {
        this.inGttRoutingType = inGttRoutingType;
    }


    /**
     * Gets the scpGttFixedDigits value for this ScpRoutingConfig.
     * 
     * @return scpGttFixedDigits
     */
    public java.lang.String getScpGttFixedDigits() {
        return scpGttFixedDigits;
    }


    /**
     * Sets the scpGttFixedDigits value for this ScpRoutingConfig.
     * 
     * @param scpGttFixedDigits
     */
    public void setScpGttFixedDigits(java.lang.String scpGttFixedDigits) {
        this.scpGttFixedDigits = scpGttFixedDigits;
    }


    /**
     * Gets the inGttFixedDigits value for this ScpRoutingConfig.
     * 
     * @return inGttFixedDigits
     */
    public java.lang.String getInGttFixedDigits() {
        return inGttFixedDigits;
    }


    /**
     * Sets the inGttFixedDigits value for this ScpRoutingConfig.
     * 
     * @param inGttFixedDigits
     */
    public void setInGttFixedDigits(java.lang.String inGttFixedDigits) {
        this.inGttFixedDigits = inGttFixedDigits;
    }


    /**
     * Gets the pcSsnProfileId value for this ScpRoutingConfig.
     * 
     * @return pcSsnProfileId
     */
    public java.lang.String getPcSsnProfileId() {
        return pcSsnProfileId;
    }


    /**
     * Sets the pcSsnProfileId value for this ScpRoutingConfig.
     * 
     * @param pcSsnProfileId
     */
    public void setPcSsnProfileId(java.lang.String pcSsnProfileId) {
        this.pcSsnProfileId = pcSsnProfileId;
    }


    /**
     * Gets the usePcSsnProfile value for this ScpRoutingConfig.
     * 
     * @return usePcSsnProfile
     */
    public java.lang.Integer getUsePcSsnProfile() {
        return usePcSsnProfile;
    }


    /**
     * Sets the usePcSsnProfile value for this ScpRoutingConfig.
     * 
     * @param usePcSsnProfile
     */
    public void setUsePcSsnProfile(java.lang.Integer usePcSsnProfile) {
        this.usePcSsnProfile = usePcSsnProfile;
    }


    /**
     * Gets the scpGtProfileId value for this ScpRoutingConfig.
     * 
     * @return scpGtProfileId
     */
    public java.lang.String getScpGtProfileId() {
        return scpGtProfileId;
    }


    /**
     * Sets the scpGtProfileId value for this ScpRoutingConfig.
     * 
     * @param scpGtProfileId
     */
    public void setScpGtProfileId(java.lang.String scpGtProfileId) {
        this.scpGtProfileId = scpGtProfileId;
    }


    /**
     * Gets the inGtProfileId value for this ScpRoutingConfig.
     * 
     * @return inGtProfileId
     */
    public java.lang.String getInGtProfileId() {
        return inGtProfileId;
    }


    /**
     * Sets the inGtProfileId value for this ScpRoutingConfig.
     * 
     * @param inGtProfileId
     */
    public void setInGtProfileId(java.lang.String inGtProfileId) {
        this.inGtProfileId = inGtProfileId;
    }


    /**
     * Gets the scpAttributes value for this ScpRoutingConfig.
     * 
     * @return scpAttributes
     */
    public java.lang.Integer getScpAttributes() {
        return scpAttributes;
    }


    /**
     * Sets the scpAttributes value for this ScpRoutingConfig.
     * 
     * @param scpAttributes
     */
    public void setScpAttributes(java.lang.Integer scpAttributes) {
        this.scpAttributes = scpAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScpRoutingConfig)) return false;
        ScpRoutingConfig other = (ScpRoutingConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scpRoutingConfigId==null && other.getScpRoutingConfigId()==null) || 
             (this.scpRoutingConfigId!=null &&
              this.scpRoutingConfigId.equals(other.getScpRoutingConfigId()))) &&
            ((this.scpSubsystemNumber==null && other.getScpSubsystemNumber()==null) || 
             (this.scpSubsystemNumber!=null &&
              this.scpSubsystemNumber.equals(other.getScpSubsystemNumber()))) &&
            ((this.scpTranslationType==null && other.getScpTranslationType()==null) || 
             (this.scpTranslationType!=null &&
              this.scpTranslationType.equals(other.getScpTranslationType()))) &&
            ((this.scpDestinationPointCode==null && other.getScpDestinationPointCode()==null) || 
             (this.scpDestinationPointCode!=null &&
              this.scpDestinationPointCode.equals(other.getScpDestinationPointCode()))) &&
            ((this.scpGlobalTitleTrans==null && other.getScpGlobalTitleTrans()==null) || 
             (this.scpGlobalTitleTrans!=null &&
              this.scpGlobalTitleTrans.equals(other.getScpGlobalTitleTrans()))) &&
            ((this.scpGlobalTitleLen==null && other.getScpGlobalTitleLen()==null) || 
             (this.scpGlobalTitleLen!=null &&
              this.scpGlobalTitleLen.equals(other.getScpGlobalTitleLen()))) &&
            ((this.scpRequestTimeout==null && other.getScpRequestTimeout()==null) || 
             (this.scpRequestTimeout!=null &&
              this.scpRequestTimeout.equals(other.getScpRequestTimeout()))) &&
            ((this.routingType==null && other.getRoutingType()==null) || 
             (this.routingType!=null &&
              this.routingType.equals(other.getRoutingType()))) &&
            ((this.inGttTranslationType==null && other.getInGttTranslationType()==null) || 
             (this.inGttTranslationType!=null &&
              this.inGttTranslationType.equals(other.getInGttTranslationType()))) &&
            ((this.inGttGlobalTitleTrans==null && other.getInGttGlobalTitleTrans()==null) || 
             (this.inGttGlobalTitleTrans!=null &&
              this.inGttGlobalTitleTrans.equals(other.getInGttGlobalTitleTrans()))) &&
            ((this.inGttGlobalTitleLen==null && other.getInGttGlobalTitleLen()==null) || 
             (this.inGttGlobalTitleLen!=null &&
              this.inGttGlobalTitleLen.equals(other.getInGttGlobalTitleLen()))) &&
            ((this.inGttRoutingType==null && other.getInGttRoutingType()==null) || 
             (this.inGttRoutingType!=null &&
              this.inGttRoutingType.equals(other.getInGttRoutingType()))) &&
            ((this.scpGttFixedDigits==null && other.getScpGttFixedDigits()==null) || 
             (this.scpGttFixedDigits!=null &&
              this.scpGttFixedDigits.equals(other.getScpGttFixedDigits()))) &&
            ((this.inGttFixedDigits==null && other.getInGttFixedDigits()==null) || 
             (this.inGttFixedDigits!=null &&
              this.inGttFixedDigits.equals(other.getInGttFixedDigits()))) &&
            ((this.pcSsnProfileId==null && other.getPcSsnProfileId()==null) || 
             (this.pcSsnProfileId!=null &&
              this.pcSsnProfileId.equals(other.getPcSsnProfileId()))) &&
            ((this.usePcSsnProfile==null && other.getUsePcSsnProfile()==null) || 
             (this.usePcSsnProfile!=null &&
              this.usePcSsnProfile.equals(other.getUsePcSsnProfile()))) &&
            ((this.scpGtProfileId==null && other.getScpGtProfileId()==null) || 
             (this.scpGtProfileId!=null &&
              this.scpGtProfileId.equals(other.getScpGtProfileId()))) &&
            ((this.inGtProfileId==null && other.getInGtProfileId()==null) || 
             (this.inGtProfileId!=null &&
              this.inGtProfileId.equals(other.getInGtProfileId()))) &&
            ((this.scpAttributes==null && other.getScpAttributes()==null) || 
             (this.scpAttributes!=null &&
              this.scpAttributes.equals(other.getScpAttributes())));
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
        if (getScpRoutingConfigId() != null) {
            _hashCode += getScpRoutingConfigId().hashCode();
        }
        if (getScpSubsystemNumber() != null) {
            _hashCode += getScpSubsystemNumber().hashCode();
        }
        if (getScpTranslationType() != null) {
            _hashCode += getScpTranslationType().hashCode();
        }
        if (getScpDestinationPointCode() != null) {
            _hashCode += getScpDestinationPointCode().hashCode();
        }
        if (getScpGlobalTitleTrans() != null) {
            _hashCode += getScpGlobalTitleTrans().hashCode();
        }
        if (getScpGlobalTitleLen() != null) {
            _hashCode += getScpGlobalTitleLen().hashCode();
        }
        if (getScpRequestTimeout() != null) {
            _hashCode += getScpRequestTimeout().hashCode();
        }
        if (getRoutingType() != null) {
            _hashCode += getRoutingType().hashCode();
        }
        if (getInGttTranslationType() != null) {
            _hashCode += getInGttTranslationType().hashCode();
        }
        if (getInGttGlobalTitleTrans() != null) {
            _hashCode += getInGttGlobalTitleTrans().hashCode();
        }
        if (getInGttGlobalTitleLen() != null) {
            _hashCode += getInGttGlobalTitleLen().hashCode();
        }
        if (getInGttRoutingType() != null) {
            _hashCode += getInGttRoutingType().hashCode();
        }
        if (getScpGttFixedDigits() != null) {
            _hashCode += getScpGttFixedDigits().hashCode();
        }
        if (getInGttFixedDigits() != null) {
            _hashCode += getInGttFixedDigits().hashCode();
        }
        if (getPcSsnProfileId() != null) {
            _hashCode += getPcSsnProfileId().hashCode();
        }
        if (getUsePcSsnProfile() != null) {
            _hashCode += getUsePcSsnProfile().hashCode();
        }
        if (getScpGtProfileId() != null) {
            _hashCode += getScpGtProfileId().hashCode();
        }
        if (getInGtProfileId() != null) {
            _hashCode += getInGtProfileId().hashCode();
        }
        if (getScpAttributes() != null) {
            _hashCode += getScpAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScpRoutingConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpRoutingConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpRoutingConfigId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpRoutingConfigId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpSubsystemNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpSubsystemNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpTranslationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpTranslationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpDestinationPointCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpDestinationPointCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpGlobalTitleTrans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpGlobalTitleTrans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpGlobalTitleLen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpGlobalTitleLen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpRequestTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpRequestTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inGttTranslationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inGttTranslationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inGttGlobalTitleTrans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inGttGlobalTitleTrans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inGttGlobalTitleLen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inGttGlobalTitleLen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inGttRoutingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inGttRoutingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpGttFixedDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpGttFixedDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inGttFixedDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inGttFixedDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcSsnProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcSsnProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usePcSsnProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usePcSsnProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpGtProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpGtProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inGtProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inGtProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpAttributes"));
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
