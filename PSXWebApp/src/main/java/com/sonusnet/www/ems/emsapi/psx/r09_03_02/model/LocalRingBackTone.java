/**
 * LocalRingBackTone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class LocalRingBackTone  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String localRingBackToneId;

    private java.lang.Short makeInbandToneAvailable;

    private java.lang.Short signalingTonePackageId;

    private java.lang.Integer attributes;

    private java.lang.Short precedence;

    private java.lang.Short mpAnnouncementPackageIndex;

    private java.lang.Short mpTonePackageIndex;

    public LocalRingBackTone() {
    }

    public LocalRingBackTone(
           java.lang.String localRingBackToneId,
           java.lang.Short makeInbandToneAvailable,
           java.lang.Short signalingTonePackageId,
           java.lang.Integer attributes,
           java.lang.Short precedence,
           java.lang.Short mpAnnouncementPackageIndex,
           java.lang.Short mpTonePackageIndex) {
        this.localRingBackToneId = localRingBackToneId;
        this.makeInbandToneAvailable = makeInbandToneAvailable;
        this.signalingTonePackageId = signalingTonePackageId;
        this.attributes = attributes;
        this.precedence = precedence;
        this.mpAnnouncementPackageIndex = mpAnnouncementPackageIndex;
        this.mpTonePackageIndex = mpTonePackageIndex;
    }


    /**
     * Gets the localRingBackToneId value for this LocalRingBackTone.
     * 
     * @return localRingBackToneId
     */
    public java.lang.String getLocalRingBackToneId() {
        return localRingBackToneId;
    }


    /**
     * Sets the localRingBackToneId value for this LocalRingBackTone.
     * 
     * @param localRingBackToneId
     */
    public void setLocalRingBackToneId(java.lang.String localRingBackToneId) {
        this.localRingBackToneId = localRingBackToneId;
    }


    /**
     * Gets the makeInbandToneAvailable value for this LocalRingBackTone.
     * 
     * @return makeInbandToneAvailable
     */
    public java.lang.Short getMakeInbandToneAvailable() {
        return makeInbandToneAvailable;
    }


    /**
     * Sets the makeInbandToneAvailable value for this LocalRingBackTone.
     * 
     * @param makeInbandToneAvailable
     */
    public void setMakeInbandToneAvailable(java.lang.Short makeInbandToneAvailable) {
        this.makeInbandToneAvailable = makeInbandToneAvailable;
    }


    /**
     * Gets the signalingTonePackageId value for this LocalRingBackTone.
     * 
     * @return signalingTonePackageId
     */
    public java.lang.Short getSignalingTonePackageId() {
        return signalingTonePackageId;
    }


    /**
     * Sets the signalingTonePackageId value for this LocalRingBackTone.
     * 
     * @param signalingTonePackageId
     */
    public void setSignalingTonePackageId(java.lang.Short signalingTonePackageId) {
        this.signalingTonePackageId = signalingTonePackageId;
    }


    /**
     * Gets the attributes value for this LocalRingBackTone.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this LocalRingBackTone.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the precedence value for this LocalRingBackTone.
     * 
     * @return precedence
     */
    public java.lang.Short getPrecedence() {
        return precedence;
    }


    /**
     * Sets the precedence value for this LocalRingBackTone.
     * 
     * @param precedence
     */
    public void setPrecedence(java.lang.Short precedence) {
        this.precedence = precedence;
    }


    /**
     * Gets the mpAnnouncementPackageIndex value for this LocalRingBackTone.
     * 
     * @return mpAnnouncementPackageIndex
     */
    public java.lang.Short getMpAnnouncementPackageIndex() {
        return mpAnnouncementPackageIndex;
    }


    /**
     * Sets the mpAnnouncementPackageIndex value for this LocalRingBackTone.
     * 
     * @param mpAnnouncementPackageIndex
     */
    public void setMpAnnouncementPackageIndex(java.lang.Short mpAnnouncementPackageIndex) {
        this.mpAnnouncementPackageIndex = mpAnnouncementPackageIndex;
    }


    /**
     * Gets the mpTonePackageIndex value for this LocalRingBackTone.
     * 
     * @return mpTonePackageIndex
     */
    public java.lang.Short getMpTonePackageIndex() {
        return mpTonePackageIndex;
    }


    /**
     * Sets the mpTonePackageIndex value for this LocalRingBackTone.
     * 
     * @param mpTonePackageIndex
     */
    public void setMpTonePackageIndex(java.lang.Short mpTonePackageIndex) {
        this.mpTonePackageIndex = mpTonePackageIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalRingBackTone)) return false;
        LocalRingBackTone other = (LocalRingBackTone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.localRingBackToneId==null && other.getLocalRingBackToneId()==null) || 
             (this.localRingBackToneId!=null &&
              this.localRingBackToneId.equals(other.getLocalRingBackToneId()))) &&
            ((this.makeInbandToneAvailable==null && other.getMakeInbandToneAvailable()==null) || 
             (this.makeInbandToneAvailable!=null &&
              this.makeInbandToneAvailable.equals(other.getMakeInbandToneAvailable()))) &&
            ((this.signalingTonePackageId==null && other.getSignalingTonePackageId()==null) || 
             (this.signalingTonePackageId!=null &&
              this.signalingTonePackageId.equals(other.getSignalingTonePackageId()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.precedence==null && other.getPrecedence()==null) || 
             (this.precedence!=null &&
              this.precedence.equals(other.getPrecedence()))) &&
            ((this.mpAnnouncementPackageIndex==null && other.getMpAnnouncementPackageIndex()==null) || 
             (this.mpAnnouncementPackageIndex!=null &&
              this.mpAnnouncementPackageIndex.equals(other.getMpAnnouncementPackageIndex()))) &&
            ((this.mpTonePackageIndex==null && other.getMpTonePackageIndex()==null) || 
             (this.mpTonePackageIndex!=null &&
              this.mpTonePackageIndex.equals(other.getMpTonePackageIndex())));
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
        if (getLocalRingBackToneId() != null) {
            _hashCode += getLocalRingBackToneId().hashCode();
        }
        if (getMakeInbandToneAvailable() != null) {
            _hashCode += getMakeInbandToneAvailable().hashCode();
        }
        if (getSignalingTonePackageId() != null) {
            _hashCode += getSignalingTonePackageId().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getPrecedence() != null) {
            _hashCode += getPrecedence().hashCode();
        }
        if (getMpAnnouncementPackageIndex() != null) {
            _hashCode += getMpAnnouncementPackageIndex().hashCode();
        }
        if (getMpTonePackageIndex() != null) {
            _hashCode += getMpTonePackageIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalRingBackTone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LocalRingBackTone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localRingBackToneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localRingBackToneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInbandToneAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "makeInbandToneAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalingTonePackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signalingTonePackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precedence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precedence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpAnnouncementPackageIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpAnnouncementPackageIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpTonePackageIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpTonePackageIndex"));
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
