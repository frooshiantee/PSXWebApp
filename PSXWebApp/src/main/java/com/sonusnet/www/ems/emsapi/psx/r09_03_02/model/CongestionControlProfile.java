/**
 * CongestionControlProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CongestionControlProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String congestionControlProfileId;

    private java.lang.String description;

    private java.lang.Integer ovldControlType;

    private java.lang.Integer adaptOvldControlInterval;

    private java.lang.Integer cpuTargetUtilization;

    private java.lang.Integer adaptOvldCpuUtilWeight;

    private java.lang.Integer ovldLevelGainFactor;

    private java.lang.Integer inviteRateAverageWeight;

    private java.lang.Integer inviteThrotMaxFillLevel;

    private java.lang.Integer inviteThrotHpcLevelExt;

    private java.lang.Integer kernelSipPolicerRate;

    private java.lang.Integer sipRejectWith503;

    private java.lang.Integer pesTotalCallValue;

    private java.lang.Integer resourceControlType;

    private java.lang.Integer attributes;

    public CongestionControlProfile() {
    }

    public CongestionControlProfile(
           java.lang.String congestionControlProfileId,
           java.lang.String description,
           java.lang.Integer ovldControlType,
           java.lang.Integer adaptOvldControlInterval,
           java.lang.Integer cpuTargetUtilization,
           java.lang.Integer adaptOvldCpuUtilWeight,
           java.lang.Integer ovldLevelGainFactor,
           java.lang.Integer inviteRateAverageWeight,
           java.lang.Integer inviteThrotMaxFillLevel,
           java.lang.Integer inviteThrotHpcLevelExt,
           java.lang.Integer kernelSipPolicerRate,
           java.lang.Integer sipRejectWith503,
           java.lang.Integer pesTotalCallValue,
           java.lang.Integer resourceControlType,
           java.lang.Integer attributes) {
        this.congestionControlProfileId = congestionControlProfileId;
        this.description = description;
        this.ovldControlType = ovldControlType;
        this.adaptOvldControlInterval = adaptOvldControlInterval;
        this.cpuTargetUtilization = cpuTargetUtilization;
        this.adaptOvldCpuUtilWeight = adaptOvldCpuUtilWeight;
        this.ovldLevelGainFactor = ovldLevelGainFactor;
        this.inviteRateAverageWeight = inviteRateAverageWeight;
        this.inviteThrotMaxFillLevel = inviteThrotMaxFillLevel;
        this.inviteThrotHpcLevelExt = inviteThrotHpcLevelExt;
        this.kernelSipPolicerRate = kernelSipPolicerRate;
        this.sipRejectWith503 = sipRejectWith503;
        this.pesTotalCallValue = pesTotalCallValue;
        this.resourceControlType = resourceControlType;
        this.attributes = attributes;
    }


    /**
     * Gets the congestionControlProfileId value for this CongestionControlProfile.
     * 
     * @return congestionControlProfileId
     */
    public java.lang.String getCongestionControlProfileId() {
        return congestionControlProfileId;
    }


    /**
     * Sets the congestionControlProfileId value for this CongestionControlProfile.
     * 
     * @param congestionControlProfileId
     */
    public void setCongestionControlProfileId(java.lang.String congestionControlProfileId) {
        this.congestionControlProfileId = congestionControlProfileId;
    }


    /**
     * Gets the description value for this CongestionControlProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CongestionControlProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the ovldControlType value for this CongestionControlProfile.
     * 
     * @return ovldControlType
     */
    public java.lang.Integer getOvldControlType() {
        return ovldControlType;
    }


    /**
     * Sets the ovldControlType value for this CongestionControlProfile.
     * 
     * @param ovldControlType
     */
    public void setOvldControlType(java.lang.Integer ovldControlType) {
        this.ovldControlType = ovldControlType;
    }


    /**
     * Gets the adaptOvldControlInterval value for this CongestionControlProfile.
     * 
     * @return adaptOvldControlInterval
     */
    public java.lang.Integer getAdaptOvldControlInterval() {
        return adaptOvldControlInterval;
    }


    /**
     * Sets the adaptOvldControlInterval value for this CongestionControlProfile.
     * 
     * @param adaptOvldControlInterval
     */
    public void setAdaptOvldControlInterval(java.lang.Integer adaptOvldControlInterval) {
        this.adaptOvldControlInterval = adaptOvldControlInterval;
    }


    /**
     * Gets the cpuTargetUtilization value for this CongestionControlProfile.
     * 
     * @return cpuTargetUtilization
     */
    public java.lang.Integer getCpuTargetUtilization() {
        return cpuTargetUtilization;
    }


    /**
     * Sets the cpuTargetUtilization value for this CongestionControlProfile.
     * 
     * @param cpuTargetUtilization
     */
    public void setCpuTargetUtilization(java.lang.Integer cpuTargetUtilization) {
        this.cpuTargetUtilization = cpuTargetUtilization;
    }


    /**
     * Gets the adaptOvldCpuUtilWeight value for this CongestionControlProfile.
     * 
     * @return adaptOvldCpuUtilWeight
     */
    public java.lang.Integer getAdaptOvldCpuUtilWeight() {
        return adaptOvldCpuUtilWeight;
    }


    /**
     * Sets the adaptOvldCpuUtilWeight value for this CongestionControlProfile.
     * 
     * @param adaptOvldCpuUtilWeight
     */
    public void setAdaptOvldCpuUtilWeight(java.lang.Integer adaptOvldCpuUtilWeight) {
        this.adaptOvldCpuUtilWeight = adaptOvldCpuUtilWeight;
    }


    /**
     * Gets the ovldLevelGainFactor value for this CongestionControlProfile.
     * 
     * @return ovldLevelGainFactor
     */
    public java.lang.Integer getOvldLevelGainFactor() {
        return ovldLevelGainFactor;
    }


    /**
     * Sets the ovldLevelGainFactor value for this CongestionControlProfile.
     * 
     * @param ovldLevelGainFactor
     */
    public void setOvldLevelGainFactor(java.lang.Integer ovldLevelGainFactor) {
        this.ovldLevelGainFactor = ovldLevelGainFactor;
    }


    /**
     * Gets the inviteRateAverageWeight value for this CongestionControlProfile.
     * 
     * @return inviteRateAverageWeight
     */
    public java.lang.Integer getInviteRateAverageWeight() {
        return inviteRateAverageWeight;
    }


    /**
     * Sets the inviteRateAverageWeight value for this CongestionControlProfile.
     * 
     * @param inviteRateAverageWeight
     */
    public void setInviteRateAverageWeight(java.lang.Integer inviteRateAverageWeight) {
        this.inviteRateAverageWeight = inviteRateAverageWeight;
    }


    /**
     * Gets the inviteThrotMaxFillLevel value for this CongestionControlProfile.
     * 
     * @return inviteThrotMaxFillLevel
     */
    public java.lang.Integer getInviteThrotMaxFillLevel() {
        return inviteThrotMaxFillLevel;
    }


    /**
     * Sets the inviteThrotMaxFillLevel value for this CongestionControlProfile.
     * 
     * @param inviteThrotMaxFillLevel
     */
    public void setInviteThrotMaxFillLevel(java.lang.Integer inviteThrotMaxFillLevel) {
        this.inviteThrotMaxFillLevel = inviteThrotMaxFillLevel;
    }


    /**
     * Gets the inviteThrotHpcLevelExt value for this CongestionControlProfile.
     * 
     * @return inviteThrotHpcLevelExt
     */
    public java.lang.Integer getInviteThrotHpcLevelExt() {
        return inviteThrotHpcLevelExt;
    }


    /**
     * Sets the inviteThrotHpcLevelExt value for this CongestionControlProfile.
     * 
     * @param inviteThrotHpcLevelExt
     */
    public void setInviteThrotHpcLevelExt(java.lang.Integer inviteThrotHpcLevelExt) {
        this.inviteThrotHpcLevelExt = inviteThrotHpcLevelExt;
    }


    /**
     * Gets the kernelSipPolicerRate value for this CongestionControlProfile.
     * 
     * @return kernelSipPolicerRate
     */
    public java.lang.Integer getKernelSipPolicerRate() {
        return kernelSipPolicerRate;
    }


    /**
     * Sets the kernelSipPolicerRate value for this CongestionControlProfile.
     * 
     * @param kernelSipPolicerRate
     */
    public void setKernelSipPolicerRate(java.lang.Integer kernelSipPolicerRate) {
        this.kernelSipPolicerRate = kernelSipPolicerRate;
    }


    /**
     * Gets the sipRejectWith503 value for this CongestionControlProfile.
     * 
     * @return sipRejectWith503
     */
    public java.lang.Integer getSipRejectWith503() {
        return sipRejectWith503;
    }


    /**
     * Sets the sipRejectWith503 value for this CongestionControlProfile.
     * 
     * @param sipRejectWith503
     */
    public void setSipRejectWith503(java.lang.Integer sipRejectWith503) {
        this.sipRejectWith503 = sipRejectWith503;
    }


    /**
     * Gets the pesTotalCallValue value for this CongestionControlProfile.
     * 
     * @return pesTotalCallValue
     */
    public java.lang.Integer getPesTotalCallValue() {
        return pesTotalCallValue;
    }


    /**
     * Sets the pesTotalCallValue value for this CongestionControlProfile.
     * 
     * @param pesTotalCallValue
     */
    public void setPesTotalCallValue(java.lang.Integer pesTotalCallValue) {
        this.pesTotalCallValue = pesTotalCallValue;
    }


    /**
     * Gets the resourceControlType value for this CongestionControlProfile.
     * 
     * @return resourceControlType
     */
    public java.lang.Integer getResourceControlType() {
        return resourceControlType;
    }


    /**
     * Sets the resourceControlType value for this CongestionControlProfile.
     * 
     * @param resourceControlType
     */
    public void setResourceControlType(java.lang.Integer resourceControlType) {
        this.resourceControlType = resourceControlType;
    }


    /**
     * Gets the attributes value for this CongestionControlProfile.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this CongestionControlProfile.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CongestionControlProfile)) return false;
        CongestionControlProfile other = (CongestionControlProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.congestionControlProfileId==null && other.getCongestionControlProfileId()==null) || 
             (this.congestionControlProfileId!=null &&
              this.congestionControlProfileId.equals(other.getCongestionControlProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.ovldControlType==null && other.getOvldControlType()==null) || 
             (this.ovldControlType!=null &&
              this.ovldControlType.equals(other.getOvldControlType()))) &&
            ((this.adaptOvldControlInterval==null && other.getAdaptOvldControlInterval()==null) || 
             (this.adaptOvldControlInterval!=null &&
              this.adaptOvldControlInterval.equals(other.getAdaptOvldControlInterval()))) &&
            ((this.cpuTargetUtilization==null && other.getCpuTargetUtilization()==null) || 
             (this.cpuTargetUtilization!=null &&
              this.cpuTargetUtilization.equals(other.getCpuTargetUtilization()))) &&
            ((this.adaptOvldCpuUtilWeight==null && other.getAdaptOvldCpuUtilWeight()==null) || 
             (this.adaptOvldCpuUtilWeight!=null &&
              this.adaptOvldCpuUtilWeight.equals(other.getAdaptOvldCpuUtilWeight()))) &&
            ((this.ovldLevelGainFactor==null && other.getOvldLevelGainFactor()==null) || 
             (this.ovldLevelGainFactor!=null &&
              this.ovldLevelGainFactor.equals(other.getOvldLevelGainFactor()))) &&
            ((this.inviteRateAverageWeight==null && other.getInviteRateAverageWeight()==null) || 
             (this.inviteRateAverageWeight!=null &&
              this.inviteRateAverageWeight.equals(other.getInviteRateAverageWeight()))) &&
            ((this.inviteThrotMaxFillLevel==null && other.getInviteThrotMaxFillLevel()==null) || 
             (this.inviteThrotMaxFillLevel!=null &&
              this.inviteThrotMaxFillLevel.equals(other.getInviteThrotMaxFillLevel()))) &&
            ((this.inviteThrotHpcLevelExt==null && other.getInviteThrotHpcLevelExt()==null) || 
             (this.inviteThrotHpcLevelExt!=null &&
              this.inviteThrotHpcLevelExt.equals(other.getInviteThrotHpcLevelExt()))) &&
            ((this.kernelSipPolicerRate==null && other.getKernelSipPolicerRate()==null) || 
             (this.kernelSipPolicerRate!=null &&
              this.kernelSipPolicerRate.equals(other.getKernelSipPolicerRate()))) &&
            ((this.sipRejectWith503==null && other.getSipRejectWith503()==null) || 
             (this.sipRejectWith503!=null &&
              this.sipRejectWith503.equals(other.getSipRejectWith503()))) &&
            ((this.pesTotalCallValue==null && other.getPesTotalCallValue()==null) || 
             (this.pesTotalCallValue!=null &&
              this.pesTotalCallValue.equals(other.getPesTotalCallValue()))) &&
            ((this.resourceControlType==null && other.getResourceControlType()==null) || 
             (this.resourceControlType!=null &&
              this.resourceControlType.equals(other.getResourceControlType()))) &&
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
        if (getCongestionControlProfileId() != null) {
            _hashCode += getCongestionControlProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOvldControlType() != null) {
            _hashCode += getOvldControlType().hashCode();
        }
        if (getAdaptOvldControlInterval() != null) {
            _hashCode += getAdaptOvldControlInterval().hashCode();
        }
        if (getCpuTargetUtilization() != null) {
            _hashCode += getCpuTargetUtilization().hashCode();
        }
        if (getAdaptOvldCpuUtilWeight() != null) {
            _hashCode += getAdaptOvldCpuUtilWeight().hashCode();
        }
        if (getOvldLevelGainFactor() != null) {
            _hashCode += getOvldLevelGainFactor().hashCode();
        }
        if (getInviteRateAverageWeight() != null) {
            _hashCode += getInviteRateAverageWeight().hashCode();
        }
        if (getInviteThrotMaxFillLevel() != null) {
            _hashCode += getInviteThrotMaxFillLevel().hashCode();
        }
        if (getInviteThrotHpcLevelExt() != null) {
            _hashCode += getInviteThrotHpcLevelExt().hashCode();
        }
        if (getKernelSipPolicerRate() != null) {
            _hashCode += getKernelSipPolicerRate().hashCode();
        }
        if (getSipRejectWith503() != null) {
            _hashCode += getSipRejectWith503().hashCode();
        }
        if (getPesTotalCallValue() != null) {
            _hashCode += getPesTotalCallValue().hashCode();
        }
        if (getResourceControlType() != null) {
            _hashCode += getResourceControlType().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CongestionControlProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CongestionControlProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("congestionControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "congestionControlProfileId"));
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
        elemField.setFieldName("ovldControlType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ovldControlType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adaptOvldControlInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adaptOvldControlInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuTargetUtilization");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpuTargetUtilization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adaptOvldCpuUtilWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adaptOvldCpuUtilWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovldLevelGainFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ovldLevelGainFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inviteRateAverageWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inviteRateAverageWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inviteThrotMaxFillLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inviteThrotMaxFillLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inviteThrotHpcLevelExt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inviteThrotHpcLevelExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kernelSipPolicerRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kernelSipPolicerRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipRejectWith503");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipRejectWith503"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pesTotalCallValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pesTotalCallValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceControlType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceControlType"));
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
