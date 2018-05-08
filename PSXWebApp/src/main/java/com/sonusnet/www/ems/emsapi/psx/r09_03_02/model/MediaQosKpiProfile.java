/**
 * MediaQosKpiProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class MediaQosKpiProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String mediaQosKpiProfileId;

    private java.lang.Short profileActive;

    private java.lang.Short mediaQosKpiFlags;

    private java.lang.Short rFactorThreshold;

    public MediaQosKpiProfile() {
    }

    public MediaQosKpiProfile(
           java.lang.String mediaQosKpiProfileId,
           java.lang.Short profileActive,
           java.lang.Short mediaQosKpiFlags,
           java.lang.Short rFactorThreshold) {
        this.mediaQosKpiProfileId = mediaQosKpiProfileId;
        this.profileActive = profileActive;
        this.mediaQosKpiFlags = mediaQosKpiFlags;
        this.rFactorThreshold = rFactorThreshold;
    }


    /**
     * Gets the mediaQosKpiProfileId value for this MediaQosKpiProfile.
     * 
     * @return mediaQosKpiProfileId
     */
    public java.lang.String getMediaQosKpiProfileId() {
        return mediaQosKpiProfileId;
    }


    /**
     * Sets the mediaQosKpiProfileId value for this MediaQosKpiProfile.
     * 
     * @param mediaQosKpiProfileId
     */
    public void setMediaQosKpiProfileId(java.lang.String mediaQosKpiProfileId) {
        this.mediaQosKpiProfileId = mediaQosKpiProfileId;
    }


    /**
     * Gets the profileActive value for this MediaQosKpiProfile.
     * 
     * @return profileActive
     */
    public java.lang.Short getProfileActive() {
        return profileActive;
    }


    /**
     * Sets the profileActive value for this MediaQosKpiProfile.
     * 
     * @param profileActive
     */
    public void setProfileActive(java.lang.Short profileActive) {
        this.profileActive = profileActive;
    }


    /**
     * Gets the mediaQosKpiFlags value for this MediaQosKpiProfile.
     * 
     * @return mediaQosKpiFlags
     */
    public java.lang.Short getMediaQosKpiFlags() {
        return mediaQosKpiFlags;
    }


    /**
     * Sets the mediaQosKpiFlags value for this MediaQosKpiProfile.
     * 
     * @param mediaQosKpiFlags
     */
    public void setMediaQosKpiFlags(java.lang.Short mediaQosKpiFlags) {
        this.mediaQosKpiFlags = mediaQosKpiFlags;
    }


    /**
     * Gets the rFactorThreshold value for this MediaQosKpiProfile.
     * 
     * @return rFactorThreshold
     */
    public java.lang.Short getRFactorThreshold() {
        return rFactorThreshold;
    }


    /**
     * Sets the rFactorThreshold value for this MediaQosKpiProfile.
     * 
     * @param rFactorThreshold
     */
    public void setRFactorThreshold(java.lang.Short rFactorThreshold) {
        this.rFactorThreshold = rFactorThreshold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MediaQosKpiProfile)) return false;
        MediaQosKpiProfile other = (MediaQosKpiProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mediaQosKpiProfileId==null && other.getMediaQosKpiProfileId()==null) || 
             (this.mediaQosKpiProfileId!=null &&
              this.mediaQosKpiProfileId.equals(other.getMediaQosKpiProfileId()))) &&
            ((this.profileActive==null && other.getProfileActive()==null) || 
             (this.profileActive!=null &&
              this.profileActive.equals(other.getProfileActive()))) &&
            ((this.mediaQosKpiFlags==null && other.getMediaQosKpiFlags()==null) || 
             (this.mediaQosKpiFlags!=null &&
              this.mediaQosKpiFlags.equals(other.getMediaQosKpiFlags()))) &&
            ((this.rFactorThreshold==null && other.getRFactorThreshold()==null) || 
             (this.rFactorThreshold!=null &&
              this.rFactorThreshold.equals(other.getRFactorThreshold())));
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
        if (getMediaQosKpiProfileId() != null) {
            _hashCode += getMediaQosKpiProfileId().hashCode();
        }
        if (getProfileActive() != null) {
            _hashCode += getProfileActive().hashCode();
        }
        if (getMediaQosKpiFlags() != null) {
            _hashCode += getMediaQosKpiFlags().hashCode();
        }
        if (getRFactorThreshold() != null) {
            _hashCode += getRFactorThreshold().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MediaQosKpiProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MediaQosKpiProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaQosKpiProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaQosKpiProfileId"));
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
        elemField.setFieldName("mediaQosKpiFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaQosKpiFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RFactorThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rFactorThreshold"));
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
