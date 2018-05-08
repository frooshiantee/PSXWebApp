/**
 * GlobalTitleProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class GlobalTitleProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String globalTitleProfileId;

    private java.lang.String description;

    private java.lang.Short globalTitleInd;

    private java.lang.Short natureOfAddrInd;

    private java.lang.Short globalTitleNumberingPlanIndicator;

    private java.lang.Short encodingScheme;

    private java.lang.String pmRuleId;

    public GlobalTitleProfile() {
    }

    public GlobalTitleProfile(
           java.lang.String globalTitleProfileId,
           java.lang.String description,
           java.lang.Short globalTitleInd,
           java.lang.Short natureOfAddrInd,
           java.lang.Short globalTitleNumberingPlanIndicator,
           java.lang.Short encodingScheme,
           java.lang.String pmRuleId) {
        this.globalTitleProfileId = globalTitleProfileId;
        this.description = description;
        this.globalTitleInd = globalTitleInd;
        this.natureOfAddrInd = natureOfAddrInd;
        this.globalTitleNumberingPlanIndicator = globalTitleNumberingPlanIndicator;
        this.encodingScheme = encodingScheme;
        this.pmRuleId = pmRuleId;
    }


    /**
     * Gets the globalTitleProfileId value for this GlobalTitleProfile.
     * 
     * @return globalTitleProfileId
     */
    public java.lang.String getGlobalTitleProfileId() {
        return globalTitleProfileId;
    }


    /**
     * Sets the globalTitleProfileId value for this GlobalTitleProfile.
     * 
     * @param globalTitleProfileId
     */
    public void setGlobalTitleProfileId(java.lang.String globalTitleProfileId) {
        this.globalTitleProfileId = globalTitleProfileId;
    }


    /**
     * Gets the description value for this GlobalTitleProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this GlobalTitleProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the globalTitleInd value for this GlobalTitleProfile.
     * 
     * @return globalTitleInd
     */
    public java.lang.Short getGlobalTitleInd() {
        return globalTitleInd;
    }


    /**
     * Sets the globalTitleInd value for this GlobalTitleProfile.
     * 
     * @param globalTitleInd
     */
    public void setGlobalTitleInd(java.lang.Short globalTitleInd) {
        this.globalTitleInd = globalTitleInd;
    }


    /**
     * Gets the natureOfAddrInd value for this GlobalTitleProfile.
     * 
     * @return natureOfAddrInd
     */
    public java.lang.Short getNatureOfAddrInd() {
        return natureOfAddrInd;
    }


    /**
     * Sets the natureOfAddrInd value for this GlobalTitleProfile.
     * 
     * @param natureOfAddrInd
     */
    public void setNatureOfAddrInd(java.lang.Short natureOfAddrInd) {
        this.natureOfAddrInd = natureOfAddrInd;
    }


    /**
     * Gets the globalTitleNumberingPlanIndicator value for this GlobalTitleProfile.
     * 
     * @return globalTitleNumberingPlanIndicator
     */
    public java.lang.Short getGlobalTitleNumberingPlanIndicator() {
        return globalTitleNumberingPlanIndicator;
    }


    /**
     * Sets the globalTitleNumberingPlanIndicator value for this GlobalTitleProfile.
     * 
     * @param globalTitleNumberingPlanIndicator
     */
    public void setGlobalTitleNumberingPlanIndicator(java.lang.Short globalTitleNumberingPlanIndicator) {
        this.globalTitleNumberingPlanIndicator = globalTitleNumberingPlanIndicator;
    }


    /**
     * Gets the encodingScheme value for this GlobalTitleProfile.
     * 
     * @return encodingScheme
     */
    public java.lang.Short getEncodingScheme() {
        return encodingScheme;
    }


    /**
     * Sets the encodingScheme value for this GlobalTitleProfile.
     * 
     * @param encodingScheme
     */
    public void setEncodingScheme(java.lang.Short encodingScheme) {
        this.encodingScheme = encodingScheme;
    }


    /**
     * Gets the pmRuleId value for this GlobalTitleProfile.
     * 
     * @return pmRuleId
     */
    public java.lang.String getPmRuleId() {
        return pmRuleId;
    }


    /**
     * Sets the pmRuleId value for this GlobalTitleProfile.
     * 
     * @param pmRuleId
     */
    public void setPmRuleId(java.lang.String pmRuleId) {
        this.pmRuleId = pmRuleId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalTitleProfile)) return false;
        GlobalTitleProfile other = (GlobalTitleProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.globalTitleProfileId==null && other.getGlobalTitleProfileId()==null) || 
             (this.globalTitleProfileId!=null &&
              this.globalTitleProfileId.equals(other.getGlobalTitleProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.globalTitleInd==null && other.getGlobalTitleInd()==null) || 
             (this.globalTitleInd!=null &&
              this.globalTitleInd.equals(other.getGlobalTitleInd()))) &&
            ((this.natureOfAddrInd==null && other.getNatureOfAddrInd()==null) || 
             (this.natureOfAddrInd!=null &&
              this.natureOfAddrInd.equals(other.getNatureOfAddrInd()))) &&
            ((this.globalTitleNumberingPlanIndicator==null && other.getGlobalTitleNumberingPlanIndicator()==null) || 
             (this.globalTitleNumberingPlanIndicator!=null &&
              this.globalTitleNumberingPlanIndicator.equals(other.getGlobalTitleNumberingPlanIndicator()))) &&
            ((this.encodingScheme==null && other.getEncodingScheme()==null) || 
             (this.encodingScheme!=null &&
              this.encodingScheme.equals(other.getEncodingScheme()))) &&
            ((this.pmRuleId==null && other.getPmRuleId()==null) || 
             (this.pmRuleId!=null &&
              this.pmRuleId.equals(other.getPmRuleId())));
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
        if (getGlobalTitleProfileId() != null) {
            _hashCode += getGlobalTitleProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getGlobalTitleInd() != null) {
            _hashCode += getGlobalTitleInd().hashCode();
        }
        if (getNatureOfAddrInd() != null) {
            _hashCode += getNatureOfAddrInd().hashCode();
        }
        if (getGlobalTitleNumberingPlanIndicator() != null) {
            _hashCode += getGlobalTitleNumberingPlanIndicator().hashCode();
        }
        if (getEncodingScheme() != null) {
            _hashCode += getEncodingScheme().hashCode();
        }
        if (getPmRuleId() != null) {
            _hashCode += getPmRuleId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalTitleProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GlobalTitleProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalTitleProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalTitleProfileId"));
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
        elemField.setFieldName("globalTitleInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalTitleInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natureOfAddrInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natureOfAddrInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalTitleNumberingPlanIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalTitleNumberingPlanIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encodingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encodingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmRuleId"));
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
