/**
 * SignalingQosKpiProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SignalingQosKpiProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String signalingQosProfileId;

    private java.lang.Short profileActive;

    private java.lang.Short signalingQosKpiFlags;

    private java.lang.Short asrThreshold;

    private java.lang.Short cluThreshold;

    private java.lang.Short scruThreshold;

    private java.lang.Short pgrdThreshold;

    private java.lang.String kpiExpression;

    public SignalingQosKpiProfile() {
    }

    public SignalingQosKpiProfile(
           java.lang.String signalingQosProfileId,
           java.lang.Short profileActive,
           java.lang.Short signalingQosKpiFlags,
           java.lang.Short asrThreshold,
           java.lang.Short cluThreshold,
           java.lang.Short scruThreshold,
           java.lang.Short pgrdThreshold,
           java.lang.String kpiExpression) {
        this.signalingQosProfileId = signalingQosProfileId;
        this.profileActive = profileActive;
        this.signalingQosKpiFlags = signalingQosKpiFlags;
        this.asrThreshold = asrThreshold;
        this.cluThreshold = cluThreshold;
        this.scruThreshold = scruThreshold;
        this.pgrdThreshold = pgrdThreshold;
        this.kpiExpression = kpiExpression;
    }


    /**
     * Gets the signalingQosProfileId value for this SignalingQosKpiProfile.
     * 
     * @return signalingQosProfileId
     */
    public java.lang.String getSignalingQosProfileId() {
        return signalingQosProfileId;
    }


    /**
     * Sets the signalingQosProfileId value for this SignalingQosKpiProfile.
     * 
     * @param signalingQosProfileId
     */
    public void setSignalingQosProfileId(java.lang.String signalingQosProfileId) {
        this.signalingQosProfileId = signalingQosProfileId;
    }


    /**
     * Gets the profileActive value for this SignalingQosKpiProfile.
     * 
     * @return profileActive
     */
    public java.lang.Short getProfileActive() {
        return profileActive;
    }


    /**
     * Sets the profileActive value for this SignalingQosKpiProfile.
     * 
     * @param profileActive
     */
    public void setProfileActive(java.lang.Short profileActive) {
        this.profileActive = profileActive;
    }


    /**
     * Gets the signalingQosKpiFlags value for this SignalingQosKpiProfile.
     * 
     * @return signalingQosKpiFlags
     */
    public java.lang.Short getSignalingQosKpiFlags() {
        return signalingQosKpiFlags;
    }


    /**
     * Sets the signalingQosKpiFlags value for this SignalingQosKpiProfile.
     * 
     * @param signalingQosKpiFlags
     */
    public void setSignalingQosKpiFlags(java.lang.Short signalingQosKpiFlags) {
        this.signalingQosKpiFlags = signalingQosKpiFlags;
    }


    /**
     * Gets the asrThreshold value for this SignalingQosKpiProfile.
     * 
     * @return asrThreshold
     */
    public java.lang.Short getAsrThreshold() {
        return asrThreshold;
    }


    /**
     * Sets the asrThreshold value for this SignalingQosKpiProfile.
     * 
     * @param asrThreshold
     */
    public void setAsrThreshold(java.lang.Short asrThreshold) {
        this.asrThreshold = asrThreshold;
    }


    /**
     * Gets the cluThreshold value for this SignalingQosKpiProfile.
     * 
     * @return cluThreshold
     */
    public java.lang.Short getCluThreshold() {
        return cluThreshold;
    }


    /**
     * Sets the cluThreshold value for this SignalingQosKpiProfile.
     * 
     * @param cluThreshold
     */
    public void setCluThreshold(java.lang.Short cluThreshold) {
        this.cluThreshold = cluThreshold;
    }


    /**
     * Gets the scruThreshold value for this SignalingQosKpiProfile.
     * 
     * @return scruThreshold
     */
    public java.lang.Short getScruThreshold() {
        return scruThreshold;
    }


    /**
     * Sets the scruThreshold value for this SignalingQosKpiProfile.
     * 
     * @param scruThreshold
     */
    public void setScruThreshold(java.lang.Short scruThreshold) {
        this.scruThreshold = scruThreshold;
    }


    /**
     * Gets the pgrdThreshold value for this SignalingQosKpiProfile.
     * 
     * @return pgrdThreshold
     */
    public java.lang.Short getPgrdThreshold() {
        return pgrdThreshold;
    }


    /**
     * Sets the pgrdThreshold value for this SignalingQosKpiProfile.
     * 
     * @param pgrdThreshold
     */
    public void setPgrdThreshold(java.lang.Short pgrdThreshold) {
        this.pgrdThreshold = pgrdThreshold;
    }


    /**
     * Gets the kpiExpression value for this SignalingQosKpiProfile.
     * 
     * @return kpiExpression
     */
    public java.lang.String getKpiExpression() {
        return kpiExpression;
    }


    /**
     * Sets the kpiExpression value for this SignalingQosKpiProfile.
     * 
     * @param kpiExpression
     */
    public void setKpiExpression(java.lang.String kpiExpression) {
        this.kpiExpression = kpiExpression;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignalingQosKpiProfile)) return false;
        SignalingQosKpiProfile other = (SignalingQosKpiProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.signalingQosProfileId==null && other.getSignalingQosProfileId()==null) || 
             (this.signalingQosProfileId!=null &&
              this.signalingQosProfileId.equals(other.getSignalingQosProfileId()))) &&
            ((this.profileActive==null && other.getProfileActive()==null) || 
             (this.profileActive!=null &&
              this.profileActive.equals(other.getProfileActive()))) &&
            ((this.signalingQosKpiFlags==null && other.getSignalingQosKpiFlags()==null) || 
             (this.signalingQosKpiFlags!=null &&
              this.signalingQosKpiFlags.equals(other.getSignalingQosKpiFlags()))) &&
            ((this.asrThreshold==null && other.getAsrThreshold()==null) || 
             (this.asrThreshold!=null &&
              this.asrThreshold.equals(other.getAsrThreshold()))) &&
            ((this.cluThreshold==null && other.getCluThreshold()==null) || 
             (this.cluThreshold!=null &&
              this.cluThreshold.equals(other.getCluThreshold()))) &&
            ((this.scruThreshold==null && other.getScruThreshold()==null) || 
             (this.scruThreshold!=null &&
              this.scruThreshold.equals(other.getScruThreshold()))) &&
            ((this.pgrdThreshold==null && other.getPgrdThreshold()==null) || 
             (this.pgrdThreshold!=null &&
              this.pgrdThreshold.equals(other.getPgrdThreshold()))) &&
            ((this.kpiExpression==null && other.getKpiExpression()==null) || 
             (this.kpiExpression!=null &&
              this.kpiExpression.equals(other.getKpiExpression())));
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
        if (getSignalingQosProfileId() != null) {
            _hashCode += getSignalingQosProfileId().hashCode();
        }
        if (getProfileActive() != null) {
            _hashCode += getProfileActive().hashCode();
        }
        if (getSignalingQosKpiFlags() != null) {
            _hashCode += getSignalingQosKpiFlags().hashCode();
        }
        if (getAsrThreshold() != null) {
            _hashCode += getAsrThreshold().hashCode();
        }
        if (getCluThreshold() != null) {
            _hashCode += getCluThreshold().hashCode();
        }
        if (getScruThreshold() != null) {
            _hashCode += getScruThreshold().hashCode();
        }
        if (getPgrdThreshold() != null) {
            _hashCode += getPgrdThreshold().hashCode();
        }
        if (getKpiExpression() != null) {
            _hashCode += getKpiExpression().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignalingQosKpiProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SignalingQosKpiProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalingQosProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signalingQosProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profileActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalingQosKpiFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signalingQosKpiFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asrThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asrThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cluThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scruThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scruThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pgrdThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pgrdThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kpiExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kpiExpression"));
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
