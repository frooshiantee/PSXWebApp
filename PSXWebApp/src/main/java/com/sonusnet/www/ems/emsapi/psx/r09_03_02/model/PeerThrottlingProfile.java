/**
 * PeerThrottlingProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class PeerThrottlingProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String peerThrottlingProfileId;

    private java.lang.Short samplingPeriod;

    private java.lang.Short stepDownGain;

    private java.lang.Short rejectThreshold;

    private java.lang.Short discardPeriod;

    public PeerThrottlingProfile() {
    }

    public PeerThrottlingProfile(
           java.lang.String peerThrottlingProfileId,
           java.lang.Short samplingPeriod,
           java.lang.Short stepDownGain,
           java.lang.Short rejectThreshold,
           java.lang.Short discardPeriod) {
        this.peerThrottlingProfileId = peerThrottlingProfileId;
        this.samplingPeriod = samplingPeriod;
        this.stepDownGain = stepDownGain;
        this.rejectThreshold = rejectThreshold;
        this.discardPeriod = discardPeriod;
    }


    /**
     * Gets the peerThrottlingProfileId value for this PeerThrottlingProfile.
     * 
     * @return peerThrottlingProfileId
     */
    public java.lang.String getPeerThrottlingProfileId() {
        return peerThrottlingProfileId;
    }


    /**
     * Sets the peerThrottlingProfileId value for this PeerThrottlingProfile.
     * 
     * @param peerThrottlingProfileId
     */
    public void setPeerThrottlingProfileId(java.lang.String peerThrottlingProfileId) {
        this.peerThrottlingProfileId = peerThrottlingProfileId;
    }


    /**
     * Gets the samplingPeriod value for this PeerThrottlingProfile.
     * 
     * @return samplingPeriod
     */
    public java.lang.Short getSamplingPeriod() {
        return samplingPeriod;
    }


    /**
     * Sets the samplingPeriod value for this PeerThrottlingProfile.
     * 
     * @param samplingPeriod
     */
    public void setSamplingPeriod(java.lang.Short samplingPeriod) {
        this.samplingPeriod = samplingPeriod;
    }


    /**
     * Gets the stepDownGain value for this PeerThrottlingProfile.
     * 
     * @return stepDownGain
     */
    public java.lang.Short getStepDownGain() {
        return stepDownGain;
    }


    /**
     * Sets the stepDownGain value for this PeerThrottlingProfile.
     * 
     * @param stepDownGain
     */
    public void setStepDownGain(java.lang.Short stepDownGain) {
        this.stepDownGain = stepDownGain;
    }


    /**
     * Gets the rejectThreshold value for this PeerThrottlingProfile.
     * 
     * @return rejectThreshold
     */
    public java.lang.Short getRejectThreshold() {
        return rejectThreshold;
    }


    /**
     * Sets the rejectThreshold value for this PeerThrottlingProfile.
     * 
     * @param rejectThreshold
     */
    public void setRejectThreshold(java.lang.Short rejectThreshold) {
        this.rejectThreshold = rejectThreshold;
    }


    /**
     * Gets the discardPeriod value for this PeerThrottlingProfile.
     * 
     * @return discardPeriod
     */
    public java.lang.Short getDiscardPeriod() {
        return discardPeriod;
    }


    /**
     * Sets the discardPeriod value for this PeerThrottlingProfile.
     * 
     * @param discardPeriod
     */
    public void setDiscardPeriod(java.lang.Short discardPeriod) {
        this.discardPeriod = discardPeriod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PeerThrottlingProfile)) return false;
        PeerThrottlingProfile other = (PeerThrottlingProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.peerThrottlingProfileId==null && other.getPeerThrottlingProfileId()==null) || 
             (this.peerThrottlingProfileId!=null &&
              this.peerThrottlingProfileId.equals(other.getPeerThrottlingProfileId()))) &&
            ((this.samplingPeriod==null && other.getSamplingPeriod()==null) || 
             (this.samplingPeriod!=null &&
              this.samplingPeriod.equals(other.getSamplingPeriod()))) &&
            ((this.stepDownGain==null && other.getStepDownGain()==null) || 
             (this.stepDownGain!=null &&
              this.stepDownGain.equals(other.getStepDownGain()))) &&
            ((this.rejectThreshold==null && other.getRejectThreshold()==null) || 
             (this.rejectThreshold!=null &&
              this.rejectThreshold.equals(other.getRejectThreshold()))) &&
            ((this.discardPeriod==null && other.getDiscardPeriod()==null) || 
             (this.discardPeriod!=null &&
              this.discardPeriod.equals(other.getDiscardPeriod())));
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
        if (getPeerThrottlingProfileId() != null) {
            _hashCode += getPeerThrottlingProfileId().hashCode();
        }
        if (getSamplingPeriod() != null) {
            _hashCode += getSamplingPeriod().hashCode();
        }
        if (getStepDownGain() != null) {
            _hashCode += getStepDownGain().hashCode();
        }
        if (getRejectThreshold() != null) {
            _hashCode += getRejectThreshold().hashCode();
        }
        if (getDiscardPeriod() != null) {
            _hashCode += getDiscardPeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PeerThrottlingProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PeerThrottlingProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peerThrottlingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peerThrottlingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samplingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samplingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stepDownGain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stepDownGain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rejectThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discardPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discardPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
