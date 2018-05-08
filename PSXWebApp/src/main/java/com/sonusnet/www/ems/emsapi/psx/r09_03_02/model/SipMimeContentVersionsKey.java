/**
 * SipMimeContentVersionsKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SipMimeContentVersionsKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.Short mimeContentTypeVersionId;

    private java.lang.String mimeContentTypeVersionName;

    public SipMimeContentVersionsKey() {
    }

    public SipMimeContentVersionsKey(
           java.lang.Short mimeContentTypeVersionId,
           java.lang.String mimeContentTypeVersionName) {
        this.mimeContentTypeVersionId = mimeContentTypeVersionId;
        this.mimeContentTypeVersionName = mimeContentTypeVersionName;
    }


    /**
     * Gets the mimeContentTypeVersionId value for this SipMimeContentVersionsKey.
     * 
     * @return mimeContentTypeVersionId
     */
    public java.lang.Short getMimeContentTypeVersionId() {
        return mimeContentTypeVersionId;
    }


    /**
     * Sets the mimeContentTypeVersionId value for this SipMimeContentVersionsKey.
     * 
     * @param mimeContentTypeVersionId
     */
    public void setMimeContentTypeVersionId(java.lang.Short mimeContentTypeVersionId) {
        this.mimeContentTypeVersionId = mimeContentTypeVersionId;
    }


    /**
     * Gets the mimeContentTypeVersionName value for this SipMimeContentVersionsKey.
     * 
     * @return mimeContentTypeVersionName
     */
    public java.lang.String getMimeContentTypeVersionName() {
        return mimeContentTypeVersionName;
    }


    /**
     * Sets the mimeContentTypeVersionName value for this SipMimeContentVersionsKey.
     * 
     * @param mimeContentTypeVersionName
     */
    public void setMimeContentTypeVersionName(java.lang.String mimeContentTypeVersionName) {
        this.mimeContentTypeVersionName = mimeContentTypeVersionName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipMimeContentVersionsKey)) return false;
        SipMimeContentVersionsKey other = (SipMimeContentVersionsKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mimeContentTypeVersionId==null && other.getMimeContentTypeVersionId()==null) || 
             (this.mimeContentTypeVersionId!=null &&
              this.mimeContentTypeVersionId.equals(other.getMimeContentTypeVersionId()))) &&
            ((this.mimeContentTypeVersionName==null && other.getMimeContentTypeVersionName()==null) || 
             (this.mimeContentTypeVersionName!=null &&
              this.mimeContentTypeVersionName.equals(other.getMimeContentTypeVersionName())));
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
        if (getMimeContentTypeVersionId() != null) {
            _hashCode += getMimeContentTypeVersionId().hashCode();
        }
        if (getMimeContentTypeVersionName() != null) {
            _hashCode += getMimeContentTypeVersionName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipMimeContentVersionsKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipMimeContentVersionsKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeContentTypeVersionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mimeContentTypeVersionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeContentTypeVersionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mimeContentTypeVersionName"));
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
