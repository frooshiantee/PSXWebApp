/**
 * SipHeaderParserProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SipHeaderParserProfileDataKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String sipHeaderParserProfileId;
    private java.lang.Integer sipHeaderEnum;

    public SipHeaderParserProfileDataKey() {
    }

    public SipHeaderParserProfileDataKey(
           java.lang.String sipHeaderParserProfileId,
           java.lang.Integer sipHeaderEnum) {
           this.sipHeaderParserProfileId = sipHeaderParserProfileId;
           this.sipHeaderEnum = sipHeaderEnum;
    }


    /**
     * Gets the sipHeaderParserProfileId value for this SipHeaderParserProfileDataKey.
     * 
     * @return sipHeaderParserProfileId
     */
    public java.lang.String getSipHeaderParserProfileId() {
        return sipHeaderParserProfileId;
    }


    /**
     * Sets the sipHeaderParserProfileId value for this SipHeaderParserProfileDataKey.
     * 
     * @param sipHeaderParserProfileId
     */
    public void setSipHeaderParserProfileId(java.lang.String sipHeaderParserProfileId) {
        this.sipHeaderParserProfileId = sipHeaderParserProfileId;
    }


    /**
     * Gets the sipHeaderEnum value for this SipHeaderParserProfileDataKey.
     * 
     * @return sipHeaderEnum
     */
    public java.lang.Integer getSipHeaderEnum() {
        return sipHeaderEnum;
    }


    /**
     * Sets the sipHeaderEnum value for this SipHeaderParserProfileDataKey.
     * 
     * @param sipHeaderEnum
     */
    public void setSipHeaderEnum(java.lang.Integer sipHeaderEnum) {
        this.sipHeaderEnum = sipHeaderEnum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipHeaderParserProfileDataKey)) return false;
        SipHeaderParserProfileDataKey other = (SipHeaderParserProfileDataKey) obj;
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
            ((this.sipHeaderEnum==null && other.getSipHeaderEnum()==null) || 
             (this.sipHeaderEnum!=null &&
              this.sipHeaderEnum.equals(other.getSipHeaderEnum())));
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
        if (getSipHeaderEnum() != null) {
            _hashCode += getSipHeaderEnum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipHeaderParserProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipHeaderParserProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipHeaderParserProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipHeaderParserProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipHeaderEnum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipHeaderEnum"));
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
