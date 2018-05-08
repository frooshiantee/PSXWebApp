/**
 * RedirectionInfoProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class RedirectionInfoProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String redirectionInfoId;
    private java.lang.Integer fwdInfoTypeId;
    private java.lang.Integer fwdInfoReason;
    private java.lang.Integer fwdInfoPossibleInd;
    private java.lang.Integer capInd;
    private java.lang.Integer fwdInfoEgressFlags;
    private java.lang.Integer capInfoEgressFlags;
    private java.lang.Integer attributes;

    public RedirectionInfoProfile() {
    }

    public RedirectionInfoProfile(
           java.lang.String redirectionInfoId,
           java.lang.Integer fwdInfoTypeId,
           java.lang.Integer fwdInfoReason,
           java.lang.Integer fwdInfoPossibleInd,
           java.lang.Integer capInd,
           java.lang.Integer fwdInfoEgressFlags,
           java.lang.Integer capInfoEgressFlags,
           java.lang.Integer attributes) {
           this.redirectionInfoId = redirectionInfoId;
           this.fwdInfoTypeId = fwdInfoTypeId;
           this.fwdInfoReason = fwdInfoReason;
           this.fwdInfoPossibleInd = fwdInfoPossibleInd;
           this.capInd = capInd;
           this.fwdInfoEgressFlags = fwdInfoEgressFlags;
           this.capInfoEgressFlags = capInfoEgressFlags;
           this.attributes = attributes;
    }


    /**
     * Gets the redirectionInfoId value for this RedirectionInfoProfile.
     * 
     * @return redirectionInfoId
     */
    public java.lang.String getRedirectionInfoId() {
        return redirectionInfoId;
    }


    /**
     * Sets the redirectionInfoId value for this RedirectionInfoProfile.
     * 
     * @param redirectionInfoId
     */
    public void setRedirectionInfoId(java.lang.String redirectionInfoId) {
        this.redirectionInfoId = redirectionInfoId;
    }


    /**
     * Gets the fwdInfoTypeId value for this RedirectionInfoProfile.
     * 
     * @return fwdInfoTypeId
     */
    public java.lang.Integer getFwdInfoTypeId() {
        return fwdInfoTypeId;
    }


    /**
     * Sets the fwdInfoTypeId value for this RedirectionInfoProfile.
     * 
     * @param fwdInfoTypeId
     */
    public void setFwdInfoTypeId(java.lang.Integer fwdInfoTypeId) {
        this.fwdInfoTypeId = fwdInfoTypeId;
    }


    /**
     * Gets the fwdInfoReason value for this RedirectionInfoProfile.
     * 
     * @return fwdInfoReason
     */
    public java.lang.Integer getFwdInfoReason() {
        return fwdInfoReason;
    }


    /**
     * Sets the fwdInfoReason value for this RedirectionInfoProfile.
     * 
     * @param fwdInfoReason
     */
    public void setFwdInfoReason(java.lang.Integer fwdInfoReason) {
        this.fwdInfoReason = fwdInfoReason;
    }


    /**
     * Gets the fwdInfoPossibleInd value for this RedirectionInfoProfile.
     * 
     * @return fwdInfoPossibleInd
     */
    public java.lang.Integer getFwdInfoPossibleInd() {
        return fwdInfoPossibleInd;
    }


    /**
     * Sets the fwdInfoPossibleInd value for this RedirectionInfoProfile.
     * 
     * @param fwdInfoPossibleInd
     */
    public void setFwdInfoPossibleInd(java.lang.Integer fwdInfoPossibleInd) {
        this.fwdInfoPossibleInd = fwdInfoPossibleInd;
    }


    /**
     * Gets the capInd value for this RedirectionInfoProfile.
     * 
     * @return capInd
     */
    public java.lang.Integer getCapInd() {
        return capInd;
    }


    /**
     * Sets the capInd value for this RedirectionInfoProfile.
     * 
     * @param capInd
     */
    public void setCapInd(java.lang.Integer capInd) {
        this.capInd = capInd;
    }


    /**
     * Gets the fwdInfoEgressFlags value for this RedirectionInfoProfile.
     * 
     * @return fwdInfoEgressFlags
     */
    public java.lang.Integer getFwdInfoEgressFlags() {
        return fwdInfoEgressFlags;
    }


    /**
     * Sets the fwdInfoEgressFlags value for this RedirectionInfoProfile.
     * 
     * @param fwdInfoEgressFlags
     */
    public void setFwdInfoEgressFlags(java.lang.Integer fwdInfoEgressFlags) {
        this.fwdInfoEgressFlags = fwdInfoEgressFlags;
    }


    /**
     * Gets the capInfoEgressFlags value for this RedirectionInfoProfile.
     * 
     * @return capInfoEgressFlags
     */
    public java.lang.Integer getCapInfoEgressFlags() {
        return capInfoEgressFlags;
    }


    /**
     * Sets the capInfoEgressFlags value for this RedirectionInfoProfile.
     * 
     * @param capInfoEgressFlags
     */
    public void setCapInfoEgressFlags(java.lang.Integer capInfoEgressFlags) {
        this.capInfoEgressFlags = capInfoEgressFlags;
    }


    /**
     * Gets the attributes value for this RedirectionInfoProfile.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this RedirectionInfoProfile.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RedirectionInfoProfile)) return false;
        RedirectionInfoProfile other = (RedirectionInfoProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.redirectionInfoId==null && other.getRedirectionInfoId()==null) || 
             (this.redirectionInfoId!=null &&
              this.redirectionInfoId.equals(other.getRedirectionInfoId()))) &&
            ((this.fwdInfoTypeId==null && other.getFwdInfoTypeId()==null) || 
             (this.fwdInfoTypeId!=null &&
              this.fwdInfoTypeId.equals(other.getFwdInfoTypeId()))) &&
            ((this.fwdInfoReason==null && other.getFwdInfoReason()==null) || 
             (this.fwdInfoReason!=null &&
              this.fwdInfoReason.equals(other.getFwdInfoReason()))) &&
            ((this.fwdInfoPossibleInd==null && other.getFwdInfoPossibleInd()==null) || 
             (this.fwdInfoPossibleInd!=null &&
              this.fwdInfoPossibleInd.equals(other.getFwdInfoPossibleInd()))) &&
            ((this.capInd==null && other.getCapInd()==null) || 
             (this.capInd!=null &&
              this.capInd.equals(other.getCapInd()))) &&
            ((this.fwdInfoEgressFlags==null && other.getFwdInfoEgressFlags()==null) || 
             (this.fwdInfoEgressFlags!=null &&
              this.fwdInfoEgressFlags.equals(other.getFwdInfoEgressFlags()))) &&
            ((this.capInfoEgressFlags==null && other.getCapInfoEgressFlags()==null) || 
             (this.capInfoEgressFlags!=null &&
              this.capInfoEgressFlags.equals(other.getCapInfoEgressFlags()))) &&
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
        if (getRedirectionInfoId() != null) {
            _hashCode += getRedirectionInfoId().hashCode();
        }
        if (getFwdInfoTypeId() != null) {
            _hashCode += getFwdInfoTypeId().hashCode();
        }
        if (getFwdInfoReason() != null) {
            _hashCode += getFwdInfoReason().hashCode();
        }
        if (getFwdInfoPossibleInd() != null) {
            _hashCode += getFwdInfoPossibleInd().hashCode();
        }
        if (getCapInd() != null) {
            _hashCode += getCapInd().hashCode();
        }
        if (getFwdInfoEgressFlags() != null) {
            _hashCode += getFwdInfoEgressFlags().hashCode();
        }
        if (getCapInfoEgressFlags() != null) {
            _hashCode += getCapInfoEgressFlags().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RedirectionInfoProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RedirectionInfoProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectionInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirectionInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fwdInfoTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fwdInfoTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fwdInfoReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fwdInfoReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fwdInfoPossibleInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fwdInfoPossibleInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fwdInfoEgressFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fwdInfoEgressFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capInfoEgressFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capInfoEgressFlags"));
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
