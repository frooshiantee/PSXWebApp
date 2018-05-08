/**
 * DdiRangeProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class DdiRangeProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String ddiRangeProfileId;

    private java.lang.String description;

    private java.lang.Integer screeningIndicator;

    private java.lang.Integer defaultAsCli;

    private java.lang.Integer ddiRangeAttributes;

    public DdiRangeProfile() {
    }

    public DdiRangeProfile(
           java.lang.String ddiRangeProfileId,
           java.lang.String description,
           java.lang.Integer screeningIndicator,
           java.lang.Integer defaultAsCli,
           java.lang.Integer ddiRangeAttributes) {
        this.ddiRangeProfileId = ddiRangeProfileId;
        this.description = description;
        this.screeningIndicator = screeningIndicator;
        this.defaultAsCli = defaultAsCli;
        this.ddiRangeAttributes = ddiRangeAttributes;
    }


    /**
     * Gets the ddiRangeProfileId value for this DdiRangeProfile.
     * 
     * @return ddiRangeProfileId
     */
    public java.lang.String getDdiRangeProfileId() {
        return ddiRangeProfileId;
    }


    /**
     * Sets the ddiRangeProfileId value for this DdiRangeProfile.
     * 
     * @param ddiRangeProfileId
     */
    public void setDdiRangeProfileId(java.lang.String ddiRangeProfileId) {
        this.ddiRangeProfileId = ddiRangeProfileId;
    }


    /**
     * Gets the description value for this DdiRangeProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DdiRangeProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the screeningIndicator value for this DdiRangeProfile.
     * 
     * @return screeningIndicator
     */
    public java.lang.Integer getScreeningIndicator() {
        return screeningIndicator;
    }


    /**
     * Sets the screeningIndicator value for this DdiRangeProfile.
     * 
     * @param screeningIndicator
     */
    public void setScreeningIndicator(java.lang.Integer screeningIndicator) {
        this.screeningIndicator = screeningIndicator;
    }


    /**
     * Gets the defaultAsCli value for this DdiRangeProfile.
     * 
     * @return defaultAsCli
     */
    public java.lang.Integer getDefaultAsCli() {
        return defaultAsCli;
    }


    /**
     * Sets the defaultAsCli value for this DdiRangeProfile.
     * 
     * @param defaultAsCli
     */
    public void setDefaultAsCli(java.lang.Integer defaultAsCli) {
        this.defaultAsCli = defaultAsCli;
    }


    /**
     * Gets the ddiRangeAttributes value for this DdiRangeProfile.
     * 
     * @return ddiRangeAttributes
     */
    public java.lang.Integer getDdiRangeAttributes() {
        return ddiRangeAttributes;
    }


    /**
     * Sets the ddiRangeAttributes value for this DdiRangeProfile.
     * 
     * @param ddiRangeAttributes
     */
    public void setDdiRangeAttributes(java.lang.Integer ddiRangeAttributes) {
        this.ddiRangeAttributes = ddiRangeAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DdiRangeProfile)) return false;
        DdiRangeProfile other = (DdiRangeProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ddiRangeProfileId==null && other.getDdiRangeProfileId()==null) || 
             (this.ddiRangeProfileId!=null &&
              this.ddiRangeProfileId.equals(other.getDdiRangeProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.screeningIndicator==null && other.getScreeningIndicator()==null) || 
             (this.screeningIndicator!=null &&
              this.screeningIndicator.equals(other.getScreeningIndicator()))) &&
            ((this.defaultAsCli==null && other.getDefaultAsCli()==null) || 
             (this.defaultAsCli!=null &&
              this.defaultAsCli.equals(other.getDefaultAsCli()))) &&
            ((this.ddiRangeAttributes==null && other.getDdiRangeAttributes()==null) || 
             (this.ddiRangeAttributes!=null &&
              this.ddiRangeAttributes.equals(other.getDdiRangeAttributes())));
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
        if (getDdiRangeProfileId() != null) {
            _hashCode += getDdiRangeProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getScreeningIndicator() != null) {
            _hashCode += getScreeningIndicator().hashCode();
        }
        if (getDefaultAsCli() != null) {
            _hashCode += getDefaultAsCli().hashCode();
        }
        if (getDdiRangeAttributes() != null) {
            _hashCode += getDdiRangeAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DdiRangeProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DdiRangeProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddiRangeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ddiRangeProfileId"));
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
        elemField.setFieldName("screeningIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "screeningIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAsCli");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultAsCli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddiRangeAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ddiRangeAttributes"));
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
