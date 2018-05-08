/**
 * SipLrProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SipLrProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sipLrProfileId;
    private java.lang.String description;
    private java.lang.Integer lrAttributes;

    public SipLrProfile() {
    }

    public SipLrProfile(
           java.lang.String sipLrProfileId,
           java.lang.String description,
           java.lang.Integer lrAttributes) {
           this.sipLrProfileId = sipLrProfileId;
           this.description = description;
           this.lrAttributes = lrAttributes;
    }


    /**
     * Gets the sipLrProfileId value for this SipLrProfile.
     * 
     * @return sipLrProfileId
     */
    public java.lang.String getSipLrProfileId() {
        return sipLrProfileId;
    }


    /**
     * Sets the sipLrProfileId value for this SipLrProfile.
     * 
     * @param sipLrProfileId
     */
    public void setSipLrProfileId(java.lang.String sipLrProfileId) {
        this.sipLrProfileId = sipLrProfileId;
    }


    /**
     * Gets the description value for this SipLrProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SipLrProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the lrAttributes value for this SipLrProfile.
     * 
     * @return lrAttributes
     */
    public java.lang.Integer getLrAttributes() {
        return lrAttributes;
    }


    /**
     * Sets the lrAttributes value for this SipLrProfile.
     * 
     * @param lrAttributes
     */
    public void setLrAttributes(java.lang.Integer lrAttributes) {
        this.lrAttributes = lrAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipLrProfile)) return false;
        SipLrProfile other = (SipLrProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sipLrProfileId==null && other.getSipLrProfileId()==null) || 
             (this.sipLrProfileId!=null &&
              this.sipLrProfileId.equals(other.getSipLrProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.lrAttributes==null && other.getLrAttributes()==null) || 
             (this.lrAttributes!=null &&
              this.lrAttributes.equals(other.getLrAttributes())));
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
        if (getSipLrProfileId() != null) {
            _hashCode += getSipLrProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLrAttributes() != null) {
            _hashCode += getLrAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipLrProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipLrProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipLrProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipLrProfileId"));
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
        elemField.setFieldName("lrAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lrAttributes"));
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
