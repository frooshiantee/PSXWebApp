/**
 * LwresdProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class LwresdProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String lwresdProfileId;
    private java.lang.String description;
    private java.lang.Short lwresdListenPort;
    private java.lang.String dnsZoneLabelId;
    private java.lang.Short cacheSize;
    private java.lang.Short logState;
    private java.lang.String lwresdDnsServerId;
    private java.lang.String lwresdDnsArguments;
    private java.lang.String arsProfileId;
    private java.lang.Integer lwresdAtributes;
    private java.lang.Short bufferSize;
    private java.lang.Short monitorInterval;
    private java.lang.Short expiredRecMaxDuration;
    private java.lang.String interfaceNameV4;
    private java.lang.String interfaceNameV6;
    private java.lang.Integer sourcePortRangeStartV4;
    private java.lang.Integer sourcePortRangeEndV4;
    private java.lang.Integer sourcePortRangeStartV6;
    private java.lang.Integer sourcePortRangeEndV6;
    private java.lang.String auxiliaryData;

    public LwresdProfile() {
    }

    public LwresdProfile(
           java.lang.String lwresdProfileId,
           java.lang.String description,
           java.lang.Short lwresdListenPort,
           java.lang.String dnsZoneLabelId,
           java.lang.Short cacheSize,
           java.lang.Short logState,
           java.lang.String lwresdDnsServerId,
           java.lang.String lwresdDnsArguments,
           java.lang.String arsProfileId,
           java.lang.Integer lwresdAtributes,
           java.lang.Short bufferSize,
           java.lang.Short monitorInterval,
           java.lang.Short expiredRecMaxDuration,
           java.lang.String interfaceNameV4,
           java.lang.String interfaceNameV6,
           java.lang.Integer sourcePortRangeStartV4,
           java.lang.Integer sourcePortRangeEndV4,
           java.lang.Integer sourcePortRangeStartV6,
           java.lang.Integer sourcePortRangeEndV6,
           java.lang.String auxiliaryData) {
           this.lwresdProfileId = lwresdProfileId;
           this.description = description;
           this.lwresdListenPort = lwresdListenPort;
           this.dnsZoneLabelId = dnsZoneLabelId;
           this.cacheSize = cacheSize;
           this.logState = logState;
           this.lwresdDnsServerId = lwresdDnsServerId;
           this.lwresdDnsArguments = lwresdDnsArguments;
           this.arsProfileId = arsProfileId;
           this.lwresdAtributes = lwresdAtributes;
           this.bufferSize = bufferSize;
           this.monitorInterval = monitorInterval;
           this.expiredRecMaxDuration = expiredRecMaxDuration;
           this.interfaceNameV4 = interfaceNameV4;
           this.interfaceNameV6 = interfaceNameV6;
           this.sourcePortRangeStartV4 = sourcePortRangeStartV4;
           this.sourcePortRangeEndV4 = sourcePortRangeEndV4;
           this.sourcePortRangeStartV6 = sourcePortRangeStartV6;
           this.sourcePortRangeEndV6 = sourcePortRangeEndV6;
           this.auxiliaryData = auxiliaryData;
    }


    /**
     * Gets the lwresdProfileId value for this LwresdProfile.
     * 
     * @return lwresdProfileId
     */
    public java.lang.String getLwresdProfileId() {
        return lwresdProfileId;
    }


    /**
     * Sets the lwresdProfileId value for this LwresdProfile.
     * 
     * @param lwresdProfileId
     */
    public void setLwresdProfileId(java.lang.String lwresdProfileId) {
        this.lwresdProfileId = lwresdProfileId;
    }


    /**
     * Gets the description value for this LwresdProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LwresdProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the lwresdListenPort value for this LwresdProfile.
     * 
     * @return lwresdListenPort
     */
    public java.lang.Short getLwresdListenPort() {
        return lwresdListenPort;
    }


    /**
     * Sets the lwresdListenPort value for this LwresdProfile.
     * 
     * @param lwresdListenPort
     */
    public void setLwresdListenPort(java.lang.Short lwresdListenPort) {
        this.lwresdListenPort = lwresdListenPort;
    }


    /**
     * Gets the dnsZoneLabelId value for this LwresdProfile.
     * 
     * @return dnsZoneLabelId
     */
    public java.lang.String getDnsZoneLabelId() {
        return dnsZoneLabelId;
    }


    /**
     * Sets the dnsZoneLabelId value for this LwresdProfile.
     * 
     * @param dnsZoneLabelId
     */
    public void setDnsZoneLabelId(java.lang.String dnsZoneLabelId) {
        this.dnsZoneLabelId = dnsZoneLabelId;
    }


    /**
     * Gets the cacheSize value for this LwresdProfile.
     * 
     * @return cacheSize
     */
    public java.lang.Short getCacheSize() {
        return cacheSize;
    }


    /**
     * Sets the cacheSize value for this LwresdProfile.
     * 
     * @param cacheSize
     */
    public void setCacheSize(java.lang.Short cacheSize) {
        this.cacheSize = cacheSize;
    }


    /**
     * Gets the logState value for this LwresdProfile.
     * 
     * @return logState
     */
    public java.lang.Short getLogState() {
        return logState;
    }


    /**
     * Sets the logState value for this LwresdProfile.
     * 
     * @param logState
     */
    public void setLogState(java.lang.Short logState) {
        this.logState = logState;
    }


    /**
     * Gets the lwresdDnsServerId value for this LwresdProfile.
     * 
     * @return lwresdDnsServerId
     */
    public java.lang.String getLwresdDnsServerId() {
        return lwresdDnsServerId;
    }


    /**
     * Sets the lwresdDnsServerId value for this LwresdProfile.
     * 
     * @param lwresdDnsServerId
     */
    public void setLwresdDnsServerId(java.lang.String lwresdDnsServerId) {
        this.lwresdDnsServerId = lwresdDnsServerId;
    }


    /**
     * Gets the lwresdDnsArguments value for this LwresdProfile.
     * 
     * @return lwresdDnsArguments
     */
    public java.lang.String getLwresdDnsArguments() {
        return lwresdDnsArguments;
    }


    /**
     * Sets the lwresdDnsArguments value for this LwresdProfile.
     * 
     * @param lwresdDnsArguments
     */
    public void setLwresdDnsArguments(java.lang.String lwresdDnsArguments) {
        this.lwresdDnsArguments = lwresdDnsArguments;
    }


    /**
     * Gets the arsProfileId value for this LwresdProfile.
     * 
     * @return arsProfileId
     */
    public java.lang.String getArsProfileId() {
        return arsProfileId;
    }


    /**
     * Sets the arsProfileId value for this LwresdProfile.
     * 
     * @param arsProfileId
     */
    public void setArsProfileId(java.lang.String arsProfileId) {
        this.arsProfileId = arsProfileId;
    }


    /**
     * Gets the lwresdAtributes value for this LwresdProfile.
     * 
     * @return lwresdAtributes
     */
    public java.lang.Integer getLwresdAtributes() {
        return lwresdAtributes;
    }


    /**
     * Sets the lwresdAtributes value for this LwresdProfile.
     * 
     * @param lwresdAtributes
     */
    public void setLwresdAtributes(java.lang.Integer lwresdAtributes) {
        this.lwresdAtributes = lwresdAtributes;
    }


    /**
     * Gets the bufferSize value for this LwresdProfile.
     * 
     * @return bufferSize
     */
    public java.lang.Short getBufferSize() {
        return bufferSize;
    }


    /**
     * Sets the bufferSize value for this LwresdProfile.
     * 
     * @param bufferSize
     */
    public void setBufferSize(java.lang.Short bufferSize) {
        this.bufferSize = bufferSize;
    }


    /**
     * Gets the monitorInterval value for this LwresdProfile.
     * 
     * @return monitorInterval
     */
    public java.lang.Short getMonitorInterval() {
        return monitorInterval;
    }


    /**
     * Sets the monitorInterval value for this LwresdProfile.
     * 
     * @param monitorInterval
     */
    public void setMonitorInterval(java.lang.Short monitorInterval) {
        this.monitorInterval = monitorInterval;
    }


    /**
     * Gets the expiredRecMaxDuration value for this LwresdProfile.
     * 
     * @return expiredRecMaxDuration
     */
    public java.lang.Short getExpiredRecMaxDuration() {
        return expiredRecMaxDuration;
    }


    /**
     * Sets the expiredRecMaxDuration value for this LwresdProfile.
     * 
     * @param expiredRecMaxDuration
     */
    public void setExpiredRecMaxDuration(java.lang.Short expiredRecMaxDuration) {
        this.expiredRecMaxDuration = expiredRecMaxDuration;
    }


    /**
     * Gets the interfaceNameV4 value for this LwresdProfile.
     * 
     * @return interfaceNameV4
     */
    public java.lang.String getInterfaceNameV4() {
        return interfaceNameV4;
    }


    /**
     * Sets the interfaceNameV4 value for this LwresdProfile.
     * 
     * @param interfaceNameV4
     */
    public void setInterfaceNameV4(java.lang.String interfaceNameV4) {
        this.interfaceNameV4 = interfaceNameV4;
    }


    /**
     * Gets the interfaceNameV6 value for this LwresdProfile.
     * 
     * @return interfaceNameV6
     */
    public java.lang.String getInterfaceNameV6() {
        return interfaceNameV6;
    }


    /**
     * Sets the interfaceNameV6 value for this LwresdProfile.
     * 
     * @param interfaceNameV6
     */
    public void setInterfaceNameV6(java.lang.String interfaceNameV6) {
        this.interfaceNameV6 = interfaceNameV6;
    }


    /**
     * Gets the sourcePortRangeStartV4 value for this LwresdProfile.
     * 
     * @return sourcePortRangeStartV4
     */
    public java.lang.Integer getSourcePortRangeStartV4() {
        return sourcePortRangeStartV4;
    }


    /**
     * Sets the sourcePortRangeStartV4 value for this LwresdProfile.
     * 
     * @param sourcePortRangeStartV4
     */
    public void setSourcePortRangeStartV4(java.lang.Integer sourcePortRangeStartV4) {
        this.sourcePortRangeStartV4 = sourcePortRangeStartV4;
    }


    /**
     * Gets the sourcePortRangeEndV4 value for this LwresdProfile.
     * 
     * @return sourcePortRangeEndV4
     */
    public java.lang.Integer getSourcePortRangeEndV4() {
        return sourcePortRangeEndV4;
    }


    /**
     * Sets the sourcePortRangeEndV4 value for this LwresdProfile.
     * 
     * @param sourcePortRangeEndV4
     */
    public void setSourcePortRangeEndV4(java.lang.Integer sourcePortRangeEndV4) {
        this.sourcePortRangeEndV4 = sourcePortRangeEndV4;
    }


    /**
     * Gets the sourcePortRangeStartV6 value for this LwresdProfile.
     * 
     * @return sourcePortRangeStartV6
     */
    public java.lang.Integer getSourcePortRangeStartV6() {
        return sourcePortRangeStartV6;
    }


    /**
     * Sets the sourcePortRangeStartV6 value for this LwresdProfile.
     * 
     * @param sourcePortRangeStartV6
     */
    public void setSourcePortRangeStartV6(java.lang.Integer sourcePortRangeStartV6) {
        this.sourcePortRangeStartV6 = sourcePortRangeStartV6;
    }


    /**
     * Gets the sourcePortRangeEndV6 value for this LwresdProfile.
     * 
     * @return sourcePortRangeEndV6
     */
    public java.lang.Integer getSourcePortRangeEndV6() {
        return sourcePortRangeEndV6;
    }


    /**
     * Sets the sourcePortRangeEndV6 value for this LwresdProfile.
     * 
     * @param sourcePortRangeEndV6
     */
    public void setSourcePortRangeEndV6(java.lang.Integer sourcePortRangeEndV6) {
        this.sourcePortRangeEndV6 = sourcePortRangeEndV6;
    }


    /**
     * Gets the auxiliaryData value for this LwresdProfile.
     * 
     * @return auxiliaryData
     */
    public java.lang.String getAuxiliaryData() {
        return auxiliaryData;
    }


    /**
     * Sets the auxiliaryData value for this LwresdProfile.
     * 
     * @param auxiliaryData
     */
    public void setAuxiliaryData(java.lang.String auxiliaryData) {
        this.auxiliaryData = auxiliaryData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LwresdProfile)) return false;
        LwresdProfile other = (LwresdProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lwresdProfileId==null && other.getLwresdProfileId()==null) || 
             (this.lwresdProfileId!=null &&
              this.lwresdProfileId.equals(other.getLwresdProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.lwresdListenPort==null && other.getLwresdListenPort()==null) || 
             (this.lwresdListenPort!=null &&
              this.lwresdListenPort.equals(other.getLwresdListenPort()))) &&
            ((this.dnsZoneLabelId==null && other.getDnsZoneLabelId()==null) || 
             (this.dnsZoneLabelId!=null &&
              this.dnsZoneLabelId.equals(other.getDnsZoneLabelId()))) &&
            ((this.cacheSize==null && other.getCacheSize()==null) || 
             (this.cacheSize!=null &&
              this.cacheSize.equals(other.getCacheSize()))) &&
            ((this.logState==null && other.getLogState()==null) || 
             (this.logState!=null &&
              this.logState.equals(other.getLogState()))) &&
            ((this.lwresdDnsServerId==null && other.getLwresdDnsServerId()==null) || 
             (this.lwresdDnsServerId!=null &&
              this.lwresdDnsServerId.equals(other.getLwresdDnsServerId()))) &&
            ((this.lwresdDnsArguments==null && other.getLwresdDnsArguments()==null) || 
             (this.lwresdDnsArguments!=null &&
              this.lwresdDnsArguments.equals(other.getLwresdDnsArguments()))) &&
            ((this.arsProfileId==null && other.getArsProfileId()==null) || 
             (this.arsProfileId!=null &&
              this.arsProfileId.equals(other.getArsProfileId()))) &&
            ((this.lwresdAtributes==null && other.getLwresdAtributes()==null) || 
             (this.lwresdAtributes!=null &&
              this.lwresdAtributes.equals(other.getLwresdAtributes()))) &&
            ((this.bufferSize==null && other.getBufferSize()==null) || 
             (this.bufferSize!=null &&
              this.bufferSize.equals(other.getBufferSize()))) &&
            ((this.monitorInterval==null && other.getMonitorInterval()==null) || 
             (this.monitorInterval!=null &&
              this.monitorInterval.equals(other.getMonitorInterval()))) &&
            ((this.expiredRecMaxDuration==null && other.getExpiredRecMaxDuration()==null) || 
             (this.expiredRecMaxDuration!=null &&
              this.expiredRecMaxDuration.equals(other.getExpiredRecMaxDuration()))) &&
            ((this.interfaceNameV4==null && other.getInterfaceNameV4()==null) || 
             (this.interfaceNameV4!=null &&
              this.interfaceNameV4.equals(other.getInterfaceNameV4()))) &&
            ((this.interfaceNameV6==null && other.getInterfaceNameV6()==null) || 
             (this.interfaceNameV6!=null &&
              this.interfaceNameV6.equals(other.getInterfaceNameV6()))) &&
            ((this.sourcePortRangeStartV4==null && other.getSourcePortRangeStartV4()==null) || 
             (this.sourcePortRangeStartV4!=null &&
              this.sourcePortRangeStartV4.equals(other.getSourcePortRangeStartV4()))) &&
            ((this.sourcePortRangeEndV4==null && other.getSourcePortRangeEndV4()==null) || 
             (this.sourcePortRangeEndV4!=null &&
              this.sourcePortRangeEndV4.equals(other.getSourcePortRangeEndV4()))) &&
            ((this.sourcePortRangeStartV6==null && other.getSourcePortRangeStartV6()==null) || 
             (this.sourcePortRangeStartV6!=null &&
              this.sourcePortRangeStartV6.equals(other.getSourcePortRangeStartV6()))) &&
            ((this.sourcePortRangeEndV6==null && other.getSourcePortRangeEndV6()==null) || 
             (this.sourcePortRangeEndV6!=null &&
              this.sourcePortRangeEndV6.equals(other.getSourcePortRangeEndV6()))) &&
            ((this.auxiliaryData==null && other.getAuxiliaryData()==null) || 
             (this.auxiliaryData!=null &&
              this.auxiliaryData.equals(other.getAuxiliaryData())));
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
        if (getLwresdProfileId() != null) {
            _hashCode += getLwresdProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLwresdListenPort() != null) {
            _hashCode += getLwresdListenPort().hashCode();
        }
        if (getDnsZoneLabelId() != null) {
            _hashCode += getDnsZoneLabelId().hashCode();
        }
        if (getCacheSize() != null) {
            _hashCode += getCacheSize().hashCode();
        }
        if (getLogState() != null) {
            _hashCode += getLogState().hashCode();
        }
        if (getLwresdDnsServerId() != null) {
            _hashCode += getLwresdDnsServerId().hashCode();
        }
        if (getLwresdDnsArguments() != null) {
            _hashCode += getLwresdDnsArguments().hashCode();
        }
        if (getArsProfileId() != null) {
            _hashCode += getArsProfileId().hashCode();
        }
        if (getLwresdAtributes() != null) {
            _hashCode += getLwresdAtributes().hashCode();
        }
        if (getBufferSize() != null) {
            _hashCode += getBufferSize().hashCode();
        }
        if (getMonitorInterval() != null) {
            _hashCode += getMonitorInterval().hashCode();
        }
        if (getExpiredRecMaxDuration() != null) {
            _hashCode += getExpiredRecMaxDuration().hashCode();
        }
        if (getInterfaceNameV4() != null) {
            _hashCode += getInterfaceNameV4().hashCode();
        }
        if (getInterfaceNameV6() != null) {
            _hashCode += getInterfaceNameV6().hashCode();
        }
        if (getSourcePortRangeStartV4() != null) {
            _hashCode += getSourcePortRangeStartV4().hashCode();
        }
        if (getSourcePortRangeEndV4() != null) {
            _hashCode += getSourcePortRangeEndV4().hashCode();
        }
        if (getSourcePortRangeStartV6() != null) {
            _hashCode += getSourcePortRangeStartV6().hashCode();
        }
        if (getSourcePortRangeEndV6() != null) {
            _hashCode += getSourcePortRangeEndV6().hashCode();
        }
        if (getAuxiliaryData() != null) {
            _hashCode += getAuxiliaryData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LwresdProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LwresdProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lwresdProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lwresdProfileId"));
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
        elemField.setFieldName("lwresdListenPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lwresdListenPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsZoneLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsZoneLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lwresdDnsServerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lwresdDnsServerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lwresdDnsArguments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lwresdDnsArguments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lwresdAtributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lwresdAtributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bufferSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bufferSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitorInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiredRecMaxDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiredRecMaxDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceNameV4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interfaceNameV4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceNameV6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interfaceNameV6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePortRangeStartV4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourcePortRangeStartV4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePortRangeEndV4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourcePortRangeEndV4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePortRangeStartV6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourcePortRangeStartV6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePortRangeEndV6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourcePortRangeEndV6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auxiliaryData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auxiliaryData"));
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
