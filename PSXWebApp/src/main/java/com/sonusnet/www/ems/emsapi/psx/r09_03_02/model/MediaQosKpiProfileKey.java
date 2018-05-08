/**
 * MediaQosKpiProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class MediaQosKpiProfileKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String mediaQosKpiProfileId;

    public MediaQosKpiProfileKey() {
    }

    public MediaQosKpiProfileKey(
           java.lang.String mediaQosKpiProfileId) {
        this.mediaQosKpiProfileId = mediaQosKpiProfileId;
    }


    /**
     * Gets the mediaQosKpiProfileId value for this MediaQosKpiProfileKey.
     * 
     * @return mediaQosKpiProfileId
     */
    public java.lang.String getMediaQosKpiProfileId() {
        return mediaQosKpiProfileId;
    }


    /**
     * Sets the mediaQosKpiProfileId value for this MediaQosKpiProfileKey.
     * 
     * @param mediaQosKpiProfileId
     */
    public void setMediaQosKpiProfileId(java.lang.String mediaQosKpiProfileId) {
        this.mediaQosKpiProfileId = mediaQosKpiProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MediaQosKpiProfileKey)) return false;
        MediaQosKpiProfileKey other = (MediaQosKpiProfileKey) obj;
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
              this.mediaQosKpiProfileId.equals(other.getMediaQosKpiProfileId())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MediaQosKpiProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MediaQosKpiProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaQosKpiProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaQosKpiProfileId"));
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
