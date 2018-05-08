/**
 * SipHeaderParserProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SipHeaderParserProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sipHeaderParserProfileId;
    private java.lang.String description;
    private java.lang.String sipHeaderName;

    public SipHeaderParserProfile() {
    }

    public SipHeaderParserProfile(
           java.lang.String sipHeaderParserProfileId,
           java.lang.String description,
           java.lang.String sipHeaderName) {
           this.sipHeaderParserProfileId = sipHeaderParserProfileId;
           this.description = description;
           this.sipHeaderName = sipHeaderName;
    }


    /**
     * Gets the sipHeaderParserProfileId value for this SipHeaderParserProfile.
     * 
     * @return sipHeaderParserProfileId
     */
    public java.lang.String getSipHeaderParserProfileId() {
        return sipHeaderParserProfileId;
    }


    /**
     * Sets the sipHeaderParserProfileId value for this SipHeaderParserProfile.
     * 
     * @param sipHeaderParserProfileId
     */
    public void setSipHeaderParserProfileId(java.lang.String sipHeaderParserProfileId) {
        this.sipHeaderParserProfileId = sipHeaderParserProfileId;
    }


    /**
     * Gets the description value for this SipHeaderParserProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SipHeaderParserProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the sipHeaderName value for this SipHeaderParserProfile.
     * 
     * @return sipHeaderName
     */
    public java.lang.String getSipHeaderName() {
        return sipHeaderName;
    }


    /**
     * Sets the sipHeaderName value for this SipHeaderParserProfile.
     * 
     * @param sipHeaderName
     */
    public void setSipHeaderName(java.lang.String sipHeaderName) {
        this.sipHeaderName = sipHeaderName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipHeaderParserProfile)) return false;
        SipHeaderParserProfile other = (SipHeaderParserProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sipHeaderParserProfileId==null && other.getSipHeaderParserProfileId()==null) || 
             (this.sipHeaderParserProfileId!=null &&
              this.sipHeaderParserProfileId.equals(other.getSipHeaderParserProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.sipHeaderName==null && other.getSipHeaderName()==null) || 
             (this.sipHeaderName!=null &&
              this.sipHeaderName.equals(other.getSipHeaderName())));
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
        if (getSipHeaderParserProfileId() != null) {
            _hashCode += getSipHeaderParserProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSipHeaderName() != null) {
            _hashCode += getSipHeaderName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipHeaderParserProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipHeaderParserProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipHeaderParserProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipHeaderParserProfileId"));
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
        elemField.setFieldName("sipHeaderName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipHeaderName"));
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
