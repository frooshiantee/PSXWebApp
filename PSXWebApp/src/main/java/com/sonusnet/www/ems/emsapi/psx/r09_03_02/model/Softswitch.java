/**
 * Softswitch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class Softswitch  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String softswitchId;

    private java.lang.String description;

    private java.lang.Integer elementAttributes;

    private java.lang.String classOfServiceId;

    private java.lang.String partitionId;

    private java.lang.String exceptionProfileId;

    private java.lang.Short scpSerialTriggerCount;

    private java.lang.String tandemScriptId;

    private java.lang.String congestionControlProfileId;

    private java.lang.Integer attribute1;

    private java.lang.Integer attribute2;

    private java.lang.String sipDomainId;

    private java.lang.Integer maxRedirectionCount;

    private java.lang.Integer etsDefaultPrioValue;

    private java.lang.Integer hpcSignalingDscp;

    private java.lang.Integer nonHpcSignalingDscp;

    private java.lang.Integer ssRoutingLabelNestingLevels;

    private java.lang.String callContextControlProfile;

    private java.lang.Integer scpTimeoutPercentage;

    private java.lang.Integer callProcWindow;

    private java.lang.Integer callProcHighThreshold;

    private java.lang.Integer callProcLowThreshold;

    private java.lang.Integer cpsLicenseLowThreshold;

    private java.lang.Integer cpsLicenseHighThreshold;

    public Softswitch() {
    }

    public Softswitch(
           java.lang.String softswitchId,
           java.lang.String description,
           java.lang.Integer elementAttributes,
           java.lang.String classOfServiceId,
           java.lang.String partitionId,
           java.lang.String exceptionProfileId,
           java.lang.Short scpSerialTriggerCount,
           java.lang.String tandemScriptId,
           java.lang.String congestionControlProfileId,
           java.lang.Integer attribute1,
           java.lang.Integer attribute2,
           java.lang.String sipDomainId,
           java.lang.Integer maxRedirectionCount,
           java.lang.Integer etsDefaultPrioValue,
           java.lang.Integer hpcSignalingDscp,
           java.lang.Integer nonHpcSignalingDscp,
           java.lang.Integer ssRoutingLabelNestingLevels,
           java.lang.String callContextControlProfile,
           java.lang.Integer scpTimeoutPercentage,
           java.lang.Integer callProcWindow,
           java.lang.Integer callProcHighThreshold,
           java.lang.Integer callProcLowThreshold,
           java.lang.Integer cpsLicenseLowThreshold,
           java.lang.Integer cpsLicenseHighThreshold) {
        this.softswitchId = softswitchId;
        this.description = description;
        this.elementAttributes = elementAttributes;
        this.classOfServiceId = classOfServiceId;
        this.partitionId = partitionId;
        this.exceptionProfileId = exceptionProfileId;
        this.scpSerialTriggerCount = scpSerialTriggerCount;
        this.tandemScriptId = tandemScriptId;
        this.congestionControlProfileId = congestionControlProfileId;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.sipDomainId = sipDomainId;
        this.maxRedirectionCount = maxRedirectionCount;
        this.etsDefaultPrioValue = etsDefaultPrioValue;
        this.hpcSignalingDscp = hpcSignalingDscp;
        this.nonHpcSignalingDscp = nonHpcSignalingDscp;
        this.ssRoutingLabelNestingLevels = ssRoutingLabelNestingLevels;
        this.callContextControlProfile = callContextControlProfile;
        this.scpTimeoutPercentage = scpTimeoutPercentage;
        this.callProcWindow = callProcWindow;
        this.callProcHighThreshold = callProcHighThreshold;
        this.callProcLowThreshold = callProcLowThreshold;
        this.cpsLicenseLowThreshold = cpsLicenseLowThreshold;
        this.cpsLicenseHighThreshold = cpsLicenseHighThreshold;
    }


    /**
     * Gets the softswitchId value for this Softswitch.
     * 
     * @return softswitchId
     */
    public java.lang.String getSoftswitchId() {
        return softswitchId;
    }


    /**
     * Sets the softswitchId value for this Softswitch.
     * 
     * @param softswitchId
     */
    public void setSoftswitchId(java.lang.String softswitchId) {
        this.softswitchId = softswitchId;
    }


    /**
     * Gets the description value for this Softswitch.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Softswitch.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the elementAttributes value for this Softswitch.
     * 
     * @return elementAttributes
     */
    public java.lang.Integer getElementAttributes() {
        return elementAttributes;
    }


    /**
     * Sets the elementAttributes value for this Softswitch.
     * 
     * @param elementAttributes
     */
    public void setElementAttributes(java.lang.Integer elementAttributes) {
        this.elementAttributes = elementAttributes;
    }


    /**
     * Gets the classOfServiceId value for this Softswitch.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this Softswitch.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the partitionId value for this Softswitch.
     * 
     * @return partitionId
     */
    public java.lang.String getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this Softswitch.
     * 
     * @param partitionId
     */
    public void setPartitionId(java.lang.String partitionId) {
        this.partitionId = partitionId;
    }


    /**
     * Gets the exceptionProfileId value for this Softswitch.
     * 
     * @return exceptionProfileId
     */
    public java.lang.String getExceptionProfileId() {
        return exceptionProfileId;
    }


    /**
     * Sets the exceptionProfileId value for this Softswitch.
     * 
     * @param exceptionProfileId
     */
    public void setExceptionProfileId(java.lang.String exceptionProfileId) {
        this.exceptionProfileId = exceptionProfileId;
    }


    /**
     * Gets the scpSerialTriggerCount value for this Softswitch.
     * 
     * @return scpSerialTriggerCount
     */
    public java.lang.Short getScpSerialTriggerCount() {
        return scpSerialTriggerCount;
    }


    /**
     * Sets the scpSerialTriggerCount value for this Softswitch.
     * 
     * @param scpSerialTriggerCount
     */
    public void setScpSerialTriggerCount(java.lang.Short scpSerialTriggerCount) {
        this.scpSerialTriggerCount = scpSerialTriggerCount;
    }


    /**
     * Gets the tandemScriptId value for this Softswitch.
     * 
     * @return tandemScriptId
     */
    public java.lang.String getTandemScriptId() {
        return tandemScriptId;
    }


    /**
     * Sets the tandemScriptId value for this Softswitch.
     * 
     * @param tandemScriptId
     */
    public void setTandemScriptId(java.lang.String tandemScriptId) {
        this.tandemScriptId = tandemScriptId;
    }


    /**
     * Gets the congestionControlProfileId value for this Softswitch.
     * 
     * @return congestionControlProfileId
     */
    public java.lang.String getCongestionControlProfileId() {
        return congestionControlProfileId;
    }


    /**
     * Sets the congestionControlProfileId value for this Softswitch.
     * 
     * @param congestionControlProfileId
     */
    public void setCongestionControlProfileId(java.lang.String congestionControlProfileId) {
        this.congestionControlProfileId = congestionControlProfileId;
    }


    /**
     * Gets the attribute1 value for this Softswitch.
     * 
     * @return attribute1
     */
    public java.lang.Integer getAttribute1() {
        return attribute1;
    }


    /**
     * Sets the attribute1 value for this Softswitch.
     * 
     * @param attribute1
     */
    public void setAttribute1(java.lang.Integer attribute1) {
        this.attribute1 = attribute1;
    }


    /**
     * Gets the attribute2 value for this Softswitch.
     * 
     * @return attribute2
     */
    public java.lang.Integer getAttribute2() {
        return attribute2;
    }


    /**
     * Sets the attribute2 value for this Softswitch.
     * 
     * @param attribute2
     */
    public void setAttribute2(java.lang.Integer attribute2) {
        this.attribute2 = attribute2;
    }


    /**
     * Gets the sipDomainId value for this Softswitch.
     * 
     * @return sipDomainId
     */
    public java.lang.String getSipDomainId() {
        return sipDomainId;
    }


    /**
     * Sets the sipDomainId value for this Softswitch.
     * 
     * @param sipDomainId
     */
    public void setSipDomainId(java.lang.String sipDomainId) {
        this.sipDomainId = sipDomainId;
    }


    /**
     * Gets the maxRedirectionCount value for this Softswitch.
     * 
     * @return maxRedirectionCount
     */
    public java.lang.Integer getMaxRedirectionCount() {
        return maxRedirectionCount;
    }


    /**
     * Sets the maxRedirectionCount value for this Softswitch.
     * 
     * @param maxRedirectionCount
     */
    public void setMaxRedirectionCount(java.lang.Integer maxRedirectionCount) {
        this.maxRedirectionCount = maxRedirectionCount;
    }


    /**
     * Gets the etsDefaultPrioValue value for this Softswitch.
     * 
     * @return etsDefaultPrioValue
     */
    public java.lang.Integer getEtsDefaultPrioValue() {
        return etsDefaultPrioValue;
    }


    /**
     * Sets the etsDefaultPrioValue value for this Softswitch.
     * 
     * @param etsDefaultPrioValue
     */
    public void setEtsDefaultPrioValue(java.lang.Integer etsDefaultPrioValue) {
        this.etsDefaultPrioValue = etsDefaultPrioValue;
    }


    /**
     * Gets the hpcSignalingDscp value for this Softswitch.
     * 
     * @return hpcSignalingDscp
     */
    public java.lang.Integer getHpcSignalingDscp() {
        return hpcSignalingDscp;
    }


    /**
     * Sets the hpcSignalingDscp value for this Softswitch.
     * 
     * @param hpcSignalingDscp
     */
    public void setHpcSignalingDscp(java.lang.Integer hpcSignalingDscp) {
        this.hpcSignalingDscp = hpcSignalingDscp;
    }


    /**
     * Gets the nonHpcSignalingDscp value for this Softswitch.
     * 
     * @return nonHpcSignalingDscp
     */
    public java.lang.Integer getNonHpcSignalingDscp() {
        return nonHpcSignalingDscp;
    }


    /**
     * Sets the nonHpcSignalingDscp value for this Softswitch.
     * 
     * @param nonHpcSignalingDscp
     */
    public void setNonHpcSignalingDscp(java.lang.Integer nonHpcSignalingDscp) {
        this.nonHpcSignalingDscp = nonHpcSignalingDscp;
    }


    /**
     * Gets the ssRoutingLabelNestingLevels value for this Softswitch.
     * 
     * @return ssRoutingLabelNestingLevels
     */
    public java.lang.Integer getSsRoutingLabelNestingLevels() {
        return ssRoutingLabelNestingLevels;
    }


    /**
     * Sets the ssRoutingLabelNestingLevels value for this Softswitch.
     * 
     * @param ssRoutingLabelNestingLevels
     */
    public void setSsRoutingLabelNestingLevels(java.lang.Integer ssRoutingLabelNestingLevels) {
        this.ssRoutingLabelNestingLevels = ssRoutingLabelNestingLevels;
    }


    /**
     * Gets the callContextControlProfile value for this Softswitch.
     * 
     * @return callContextControlProfile
     */
    public java.lang.String getCallContextControlProfile() {
        return callContextControlProfile;
    }


    /**
     * Sets the callContextControlProfile value for this Softswitch.
     * 
     * @param callContextControlProfile
     */
    public void setCallContextControlProfile(java.lang.String callContextControlProfile) {
        this.callContextControlProfile = callContextControlProfile;
    }


    /**
     * Gets the scpTimeoutPercentage value for this Softswitch.
     * 
     * @return scpTimeoutPercentage
     */
    public java.lang.Integer getScpTimeoutPercentage() {
        return scpTimeoutPercentage;
    }


    /**
     * Sets the scpTimeoutPercentage value for this Softswitch.
     * 
     * @param scpTimeoutPercentage
     */
    public void setScpTimeoutPercentage(java.lang.Integer scpTimeoutPercentage) {
        this.scpTimeoutPercentage = scpTimeoutPercentage;
    }


    /**
     * Gets the callProcWindow value for this Softswitch.
     * 
     * @return callProcWindow
     */
    public java.lang.Integer getCallProcWindow() {
        return callProcWindow;
    }


    /**
     * Sets the callProcWindow value for this Softswitch.
     * 
     * @param callProcWindow
     */
    public void setCallProcWindow(java.lang.Integer callProcWindow) {
        this.callProcWindow = callProcWindow;
    }


    /**
     * Gets the callProcHighThreshold value for this Softswitch.
     * 
     * @return callProcHighThreshold
     */
    public java.lang.Integer getCallProcHighThreshold() {
        return callProcHighThreshold;
    }


    /**
     * Sets the callProcHighThreshold value for this Softswitch.
     * 
     * @param callProcHighThreshold
     */
    public void setCallProcHighThreshold(java.lang.Integer callProcHighThreshold) {
        this.callProcHighThreshold = callProcHighThreshold;
    }


    /**
     * Gets the callProcLowThreshold value for this Softswitch.
     * 
     * @return callProcLowThreshold
     */
    public java.lang.Integer getCallProcLowThreshold() {
        return callProcLowThreshold;
    }


    /**
     * Sets the callProcLowThreshold value for this Softswitch.
     * 
     * @param callProcLowThreshold
     */
    public void setCallProcLowThreshold(java.lang.Integer callProcLowThreshold) {
        this.callProcLowThreshold = callProcLowThreshold;
    }


    /**
     * Gets the cpsLicenseLowThreshold value for this Softswitch.
     * 
     * @return cpsLicenseLowThreshold
     */
    public java.lang.Integer getCpsLicenseLowThreshold() {
        return cpsLicenseLowThreshold;
    }


    /**
     * Sets the cpsLicenseLowThreshold value for this Softswitch.
     * 
     * @param cpsLicenseLowThreshold
     */
    public void setCpsLicenseLowThreshold(java.lang.Integer cpsLicenseLowThreshold) {
        this.cpsLicenseLowThreshold = cpsLicenseLowThreshold;
    }


    /**
     * Gets the cpsLicenseHighThreshold value for this Softswitch.
     * 
     * @return cpsLicenseHighThreshold
     */
    public java.lang.Integer getCpsLicenseHighThreshold() {
        return cpsLicenseHighThreshold;
    }


    /**
     * Sets the cpsLicenseHighThreshold value for this Softswitch.
     * 
     * @param cpsLicenseHighThreshold
     */
    public void setCpsLicenseHighThreshold(java.lang.Integer cpsLicenseHighThreshold) {
        this.cpsLicenseHighThreshold = cpsLicenseHighThreshold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Softswitch)) return false;
        Softswitch other = (Softswitch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.softswitchId==null && other.getSoftswitchId()==null) || 
             (this.softswitchId!=null &&
              this.softswitchId.equals(other.getSoftswitchId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.elementAttributes==null && other.getElementAttributes()==null) || 
             (this.elementAttributes!=null &&
              this.elementAttributes.equals(other.getElementAttributes()))) &&
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId()))) &&
            ((this.exceptionProfileId==null && other.getExceptionProfileId()==null) || 
             (this.exceptionProfileId!=null &&
              this.exceptionProfileId.equals(other.getExceptionProfileId()))) &&
            ((this.scpSerialTriggerCount==null && other.getScpSerialTriggerCount()==null) || 
             (this.scpSerialTriggerCount!=null &&
              this.scpSerialTriggerCount.equals(other.getScpSerialTriggerCount()))) &&
            ((this.tandemScriptId==null && other.getTandemScriptId()==null) || 
             (this.tandemScriptId!=null &&
              this.tandemScriptId.equals(other.getTandemScriptId()))) &&
            ((this.congestionControlProfileId==null && other.getCongestionControlProfileId()==null) || 
             (this.congestionControlProfileId!=null &&
              this.congestionControlProfileId.equals(other.getCongestionControlProfileId()))) &&
            ((this.attribute1==null && other.getAttribute1()==null) || 
             (this.attribute1!=null &&
              this.attribute1.equals(other.getAttribute1()))) &&
            ((this.attribute2==null && other.getAttribute2()==null) || 
             (this.attribute2!=null &&
              this.attribute2.equals(other.getAttribute2()))) &&
            ((this.sipDomainId==null && other.getSipDomainId()==null) || 
             (this.sipDomainId!=null &&
              this.sipDomainId.equals(other.getSipDomainId()))) &&
            ((this.maxRedirectionCount==null && other.getMaxRedirectionCount()==null) || 
             (this.maxRedirectionCount!=null &&
              this.maxRedirectionCount.equals(other.getMaxRedirectionCount()))) &&
            ((this.etsDefaultPrioValue==null && other.getEtsDefaultPrioValue()==null) || 
             (this.etsDefaultPrioValue!=null &&
              this.etsDefaultPrioValue.equals(other.getEtsDefaultPrioValue()))) &&
            ((this.hpcSignalingDscp==null && other.getHpcSignalingDscp()==null) || 
             (this.hpcSignalingDscp!=null &&
              this.hpcSignalingDscp.equals(other.getHpcSignalingDscp()))) &&
            ((this.nonHpcSignalingDscp==null && other.getNonHpcSignalingDscp()==null) || 
             (this.nonHpcSignalingDscp!=null &&
              this.nonHpcSignalingDscp.equals(other.getNonHpcSignalingDscp()))) &&
            ((this.ssRoutingLabelNestingLevels==null && other.getSsRoutingLabelNestingLevels()==null) || 
             (this.ssRoutingLabelNestingLevels!=null &&
              this.ssRoutingLabelNestingLevels.equals(other.getSsRoutingLabelNestingLevels()))) &&
            ((this.callContextControlProfile==null && other.getCallContextControlProfile()==null) || 
             (this.callContextControlProfile!=null &&
              this.callContextControlProfile.equals(other.getCallContextControlProfile()))) &&
            ((this.scpTimeoutPercentage==null && other.getScpTimeoutPercentage()==null) || 
             (this.scpTimeoutPercentage!=null &&
              this.scpTimeoutPercentage.equals(other.getScpTimeoutPercentage()))) &&
            ((this.callProcWindow==null && other.getCallProcWindow()==null) || 
             (this.callProcWindow!=null &&
              this.callProcWindow.equals(other.getCallProcWindow()))) &&
            ((this.callProcHighThreshold==null && other.getCallProcHighThreshold()==null) || 
             (this.callProcHighThreshold!=null &&
              this.callProcHighThreshold.equals(other.getCallProcHighThreshold()))) &&
            ((this.callProcLowThreshold==null && other.getCallProcLowThreshold()==null) || 
             (this.callProcLowThreshold!=null &&
              this.callProcLowThreshold.equals(other.getCallProcLowThreshold()))) &&
            ((this.cpsLicenseLowThreshold==null && other.getCpsLicenseLowThreshold()==null) || 
             (this.cpsLicenseLowThreshold!=null &&
              this.cpsLicenseLowThreshold.equals(other.getCpsLicenseLowThreshold()))) &&
            ((this.cpsLicenseHighThreshold==null && other.getCpsLicenseHighThreshold()==null) || 
             (this.cpsLicenseHighThreshold!=null &&
              this.cpsLicenseHighThreshold.equals(other.getCpsLicenseHighThreshold())));
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
        if (getSoftswitchId() != null) {
            _hashCode += getSoftswitchId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getElementAttributes() != null) {
            _hashCode += getElementAttributes().hashCode();
        }
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        if (getExceptionProfileId() != null) {
            _hashCode += getExceptionProfileId().hashCode();
        }
        if (getScpSerialTriggerCount() != null) {
            _hashCode += getScpSerialTriggerCount().hashCode();
        }
        if (getTandemScriptId() != null) {
            _hashCode += getTandemScriptId().hashCode();
        }
        if (getCongestionControlProfileId() != null) {
            _hashCode += getCongestionControlProfileId().hashCode();
        }
        if (getAttribute1() != null) {
            _hashCode += getAttribute1().hashCode();
        }
        if (getAttribute2() != null) {
            _hashCode += getAttribute2().hashCode();
        }
        if (getSipDomainId() != null) {
            _hashCode += getSipDomainId().hashCode();
        }
        if (getMaxRedirectionCount() != null) {
            _hashCode += getMaxRedirectionCount().hashCode();
        }
        if (getEtsDefaultPrioValue() != null) {
            _hashCode += getEtsDefaultPrioValue().hashCode();
        }
        if (getHpcSignalingDscp() != null) {
            _hashCode += getHpcSignalingDscp().hashCode();
        }
        if (getNonHpcSignalingDscp() != null) {
            _hashCode += getNonHpcSignalingDscp().hashCode();
        }
        if (getSsRoutingLabelNestingLevels() != null) {
            _hashCode += getSsRoutingLabelNestingLevels().hashCode();
        }
        if (getCallContextControlProfile() != null) {
            _hashCode += getCallContextControlProfile().hashCode();
        }
        if (getScpTimeoutPercentage() != null) {
            _hashCode += getScpTimeoutPercentage().hashCode();
        }
        if (getCallProcWindow() != null) {
            _hashCode += getCallProcWindow().hashCode();
        }
        if (getCallProcHighThreshold() != null) {
            _hashCode += getCallProcHighThreshold().hashCode();
        }
        if (getCallProcLowThreshold() != null) {
            _hashCode += getCallProcLowThreshold().hashCode();
        }
        if (getCpsLicenseLowThreshold() != null) {
            _hashCode += getCpsLicenseLowThreshold().hashCode();
        }
        if (getCpsLicenseHighThreshold() != null) {
            _hashCode += getCpsLicenseHighThreshold().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Softswitch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Softswitch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softswitchId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "softswitchId"));
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
        elemField.setFieldName("elementAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elementAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classOfServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classOfServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpSerialTriggerCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpSerialTriggerCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tandemScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tandemScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("congestionControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "congestionControlProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDomainId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDomainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRedirectionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxRedirectionCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etsDefaultPrioValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "etsDefaultPrioValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hpcSignalingDscp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hpcSignalingDscp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonHpcSignalingDscp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonHpcSignalingDscp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssRoutingLabelNestingLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssRoutingLabelNestingLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callContextControlProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callContextControlProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpTimeoutPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpTimeoutPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcHighThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcHighThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcLowThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcLowThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpsLicenseLowThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpsLicenseLowThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpsLicenseHighThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpsLicenseHighThreshold"));
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
