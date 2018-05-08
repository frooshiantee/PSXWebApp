/**
 * ArsProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ArsProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String arsProfileId;
    private java.lang.Integer arsAttributes;
    private java.lang.Integer arsTimeoutsDur;
    private java.lang.Integer arsNumOfTimeouts;
    private java.lang.Integer arsProbeMethod;
    private java.lang.Integer arsProbeInterval;
    private java.lang.Integer arsProbeNumResp;
    private java.lang.Integer arsAutoRecTimer;
    private java.lang.Integer arsRecHighWmTimer;
    private java.lang.Integer arsMonitorInterval;
    private java.lang.Integer arsMonitorFailureResp;
    private java.lang.Integer monitorDuration;

    public ArsProfile() {
    }

    public ArsProfile(
           java.lang.String arsProfileId,
           java.lang.Integer arsAttributes,
           java.lang.Integer arsTimeoutsDur,
           java.lang.Integer arsNumOfTimeouts,
           java.lang.Integer arsProbeMethod,
           java.lang.Integer arsProbeInterval,
           java.lang.Integer arsProbeNumResp,
           java.lang.Integer arsAutoRecTimer,
           java.lang.Integer arsRecHighWmTimer,
           java.lang.Integer arsMonitorInterval,
           java.lang.Integer arsMonitorFailureResp,
           java.lang.Integer monitorDuration) {
           this.arsProfileId = arsProfileId;
           this.arsAttributes = arsAttributes;
           this.arsTimeoutsDur = arsTimeoutsDur;
           this.arsNumOfTimeouts = arsNumOfTimeouts;
           this.arsProbeMethod = arsProbeMethod;
           this.arsProbeInterval = arsProbeInterval;
           this.arsProbeNumResp = arsProbeNumResp;
           this.arsAutoRecTimer = arsAutoRecTimer;
           this.arsRecHighWmTimer = arsRecHighWmTimer;
           this.arsMonitorInterval = arsMonitorInterval;
           this.arsMonitorFailureResp = arsMonitorFailureResp;
           this.monitorDuration = monitorDuration;
    }


    /**
     * Gets the arsProfileId value for this ArsProfile.
     * 
     * @return arsProfileId
     */
    public java.lang.String getArsProfileId() {
        return arsProfileId;
    }


    /**
     * Sets the arsProfileId value for this ArsProfile.
     * 
     * @param arsProfileId
     */
    public void setArsProfileId(java.lang.String arsProfileId) {
        this.arsProfileId = arsProfileId;
    }


    /**
     * Gets the arsAttributes value for this ArsProfile.
     * 
     * @return arsAttributes
     */
    public java.lang.Integer getArsAttributes() {
        return arsAttributes;
    }


    /**
     * Sets the arsAttributes value for this ArsProfile.
     * 
     * @param arsAttributes
     */
    public void setArsAttributes(java.lang.Integer arsAttributes) {
        this.arsAttributes = arsAttributes;
    }


    /**
     * Gets the arsTimeoutsDur value for this ArsProfile.
     * 
     * @return arsTimeoutsDur
     */
    public java.lang.Integer getArsTimeoutsDur() {
        return arsTimeoutsDur;
    }


    /**
     * Sets the arsTimeoutsDur value for this ArsProfile.
     * 
     * @param arsTimeoutsDur
     */
    public void setArsTimeoutsDur(java.lang.Integer arsTimeoutsDur) {
        this.arsTimeoutsDur = arsTimeoutsDur;
    }


    /**
     * Gets the arsNumOfTimeouts value for this ArsProfile.
     * 
     * @return arsNumOfTimeouts
     */
    public java.lang.Integer getArsNumOfTimeouts() {
        return arsNumOfTimeouts;
    }


    /**
     * Sets the arsNumOfTimeouts value for this ArsProfile.
     * 
     * @param arsNumOfTimeouts
     */
    public void setArsNumOfTimeouts(java.lang.Integer arsNumOfTimeouts) {
        this.arsNumOfTimeouts = arsNumOfTimeouts;
    }


    /**
     * Gets the arsProbeMethod value for this ArsProfile.
     * 
     * @return arsProbeMethod
     */
    public java.lang.Integer getArsProbeMethod() {
        return arsProbeMethod;
    }


    /**
     * Sets the arsProbeMethod value for this ArsProfile.
     * 
     * @param arsProbeMethod
     */
    public void setArsProbeMethod(java.lang.Integer arsProbeMethod) {
        this.arsProbeMethod = arsProbeMethod;
    }


    /**
     * Gets the arsProbeInterval value for this ArsProfile.
     * 
     * @return arsProbeInterval
     */
    public java.lang.Integer getArsProbeInterval() {
        return arsProbeInterval;
    }


    /**
     * Sets the arsProbeInterval value for this ArsProfile.
     * 
     * @param arsProbeInterval
     */
    public void setArsProbeInterval(java.lang.Integer arsProbeInterval) {
        this.arsProbeInterval = arsProbeInterval;
    }


    /**
     * Gets the arsProbeNumResp value for this ArsProfile.
     * 
     * @return arsProbeNumResp
     */
    public java.lang.Integer getArsProbeNumResp() {
        return arsProbeNumResp;
    }


    /**
     * Sets the arsProbeNumResp value for this ArsProfile.
     * 
     * @param arsProbeNumResp
     */
    public void setArsProbeNumResp(java.lang.Integer arsProbeNumResp) {
        this.arsProbeNumResp = arsProbeNumResp;
    }


    /**
     * Gets the arsAutoRecTimer value for this ArsProfile.
     * 
     * @return arsAutoRecTimer
     */
    public java.lang.Integer getArsAutoRecTimer() {
        return arsAutoRecTimer;
    }


    /**
     * Sets the arsAutoRecTimer value for this ArsProfile.
     * 
     * @param arsAutoRecTimer
     */
    public void setArsAutoRecTimer(java.lang.Integer arsAutoRecTimer) {
        this.arsAutoRecTimer = arsAutoRecTimer;
    }


    /**
     * Gets the arsRecHighWmTimer value for this ArsProfile.
     * 
     * @return arsRecHighWmTimer
     */
    public java.lang.Integer getArsRecHighWmTimer() {
        return arsRecHighWmTimer;
    }


    /**
     * Sets the arsRecHighWmTimer value for this ArsProfile.
     * 
     * @param arsRecHighWmTimer
     */
    public void setArsRecHighWmTimer(java.lang.Integer arsRecHighWmTimer) {
        this.arsRecHighWmTimer = arsRecHighWmTimer;
    }


    /**
     * Gets the arsMonitorInterval value for this ArsProfile.
     * 
     * @return arsMonitorInterval
     */
    public java.lang.Integer getArsMonitorInterval() {
        return arsMonitorInterval;
    }


    /**
     * Sets the arsMonitorInterval value for this ArsProfile.
     * 
     * @param arsMonitorInterval
     */
    public void setArsMonitorInterval(java.lang.Integer arsMonitorInterval) {
        this.arsMonitorInterval = arsMonitorInterval;
    }


    /**
     * Gets the arsMonitorFailureResp value for this ArsProfile.
     * 
     * @return arsMonitorFailureResp
     */
    public java.lang.Integer getArsMonitorFailureResp() {
        return arsMonitorFailureResp;
    }


    /**
     * Sets the arsMonitorFailureResp value for this ArsProfile.
     * 
     * @param arsMonitorFailureResp
     */
    public void setArsMonitorFailureResp(java.lang.Integer arsMonitorFailureResp) {
        this.arsMonitorFailureResp = arsMonitorFailureResp;
    }


    /**
     * Gets the monitorDuration value for this ArsProfile.
     * 
     * @return monitorDuration
     */
    public java.lang.Integer getMonitorDuration() {
        return monitorDuration;
    }


    /**
     * Sets the monitorDuration value for this ArsProfile.
     * 
     * @param monitorDuration
     */
    public void setMonitorDuration(java.lang.Integer monitorDuration) {
        this.monitorDuration = monitorDuration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArsProfile)) return false;
        ArsProfile other = (ArsProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.arsProfileId==null && other.getArsProfileId()==null) || 
             (this.arsProfileId!=null &&
              this.arsProfileId.equals(other.getArsProfileId()))) &&
            ((this.arsAttributes==null && other.getArsAttributes()==null) || 
             (this.arsAttributes!=null &&
              this.arsAttributes.equals(other.getArsAttributes()))) &&
            ((this.arsTimeoutsDur==null && other.getArsTimeoutsDur()==null) || 
             (this.arsTimeoutsDur!=null &&
              this.arsTimeoutsDur.equals(other.getArsTimeoutsDur()))) &&
            ((this.arsNumOfTimeouts==null && other.getArsNumOfTimeouts()==null) || 
             (this.arsNumOfTimeouts!=null &&
              this.arsNumOfTimeouts.equals(other.getArsNumOfTimeouts()))) &&
            ((this.arsProbeMethod==null && other.getArsProbeMethod()==null) || 
             (this.arsProbeMethod!=null &&
              this.arsProbeMethod.equals(other.getArsProbeMethod()))) &&
            ((this.arsProbeInterval==null && other.getArsProbeInterval()==null) || 
             (this.arsProbeInterval!=null &&
              this.arsProbeInterval.equals(other.getArsProbeInterval()))) &&
            ((this.arsProbeNumResp==null && other.getArsProbeNumResp()==null) || 
             (this.arsProbeNumResp!=null &&
              this.arsProbeNumResp.equals(other.getArsProbeNumResp()))) &&
            ((this.arsAutoRecTimer==null && other.getArsAutoRecTimer()==null) || 
             (this.arsAutoRecTimer!=null &&
              this.arsAutoRecTimer.equals(other.getArsAutoRecTimer()))) &&
            ((this.arsRecHighWmTimer==null && other.getArsRecHighWmTimer()==null) || 
             (this.arsRecHighWmTimer!=null &&
              this.arsRecHighWmTimer.equals(other.getArsRecHighWmTimer()))) &&
            ((this.arsMonitorInterval==null && other.getArsMonitorInterval()==null) || 
             (this.arsMonitorInterval!=null &&
              this.arsMonitorInterval.equals(other.getArsMonitorInterval()))) &&
            ((this.arsMonitorFailureResp==null && other.getArsMonitorFailureResp()==null) || 
             (this.arsMonitorFailureResp!=null &&
              this.arsMonitorFailureResp.equals(other.getArsMonitorFailureResp()))) &&
            ((this.monitorDuration==null && other.getMonitorDuration()==null) || 
             (this.monitorDuration!=null &&
              this.monitorDuration.equals(other.getMonitorDuration())));
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
        if (getArsProfileId() != null) {
            _hashCode += getArsProfileId().hashCode();
        }
        if (getArsAttributes() != null) {
            _hashCode += getArsAttributes().hashCode();
        }
        if (getArsTimeoutsDur() != null) {
            _hashCode += getArsTimeoutsDur().hashCode();
        }
        if (getArsNumOfTimeouts() != null) {
            _hashCode += getArsNumOfTimeouts().hashCode();
        }
        if (getArsProbeMethod() != null) {
            _hashCode += getArsProbeMethod().hashCode();
        }
        if (getArsProbeInterval() != null) {
            _hashCode += getArsProbeInterval().hashCode();
        }
        if (getArsProbeNumResp() != null) {
            _hashCode += getArsProbeNumResp().hashCode();
        }
        if (getArsAutoRecTimer() != null) {
            _hashCode += getArsAutoRecTimer().hashCode();
        }
        if (getArsRecHighWmTimer() != null) {
            _hashCode += getArsRecHighWmTimer().hashCode();
        }
        if (getArsMonitorInterval() != null) {
            _hashCode += getArsMonitorInterval().hashCode();
        }
        if (getArsMonitorFailureResp() != null) {
            _hashCode += getArsMonitorFailureResp().hashCode();
        }
        if (getMonitorDuration() != null) {
            _hashCode += getMonitorDuration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArsProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ArsProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsTimeoutsDur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsTimeoutsDur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsNumOfTimeouts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsNumOfTimeouts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsProbeMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsProbeMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsProbeInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsProbeInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsProbeNumResp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsProbeNumResp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsAutoRecTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsAutoRecTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsRecHighWmTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsRecHighWmTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsMonitorInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsMonitorInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsMonitorFailureResp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsMonitorFailureResp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitorDuration"));
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
