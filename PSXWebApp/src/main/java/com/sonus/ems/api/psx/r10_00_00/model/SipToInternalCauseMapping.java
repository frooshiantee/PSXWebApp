/**
 * SipToInternalCauseMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SipToInternalCauseMapping  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Integer sipCauseMappingIndex;
    private java.lang.String sipCauseMappingName;

    public SipToInternalCauseMapping() {
    }

    public SipToInternalCauseMapping(
           java.lang.Integer sipCauseMappingIndex,
           java.lang.String sipCauseMappingName) {
           this.sipCauseMappingIndex = sipCauseMappingIndex;
           this.sipCauseMappingName = sipCauseMappingName;
    }


    /**
     * Gets the sipCauseMappingIndex value for this SipToInternalCauseMapping.
     * 
     * @return sipCauseMappingIndex
     */
    public java.lang.Integer getSipCauseMappingIndex() {
        return sipCauseMappingIndex;
    }


    /**
     * Sets the sipCauseMappingIndex value for this SipToInternalCauseMapping.
     * 
     * @param sipCauseMappingIndex
     */
    public void setSipCauseMappingIndex(java.lang.Integer sipCauseMappingIndex) {
        this.sipCauseMappingIndex = sipCauseMappingIndex;
    }


    /**
     * Gets the sipCauseMappingName value for this SipToInternalCauseMapping.
     * 
     * @return sipCauseMappingName
     */
    public java.lang.String getSipCauseMappingName() {
        return sipCauseMappingName;
    }


    /**
     * Sets the sipCauseMappingName value for this SipToInternalCauseMapping.
     * 
     * @param sipCauseMappingName
     */
    public void setSipCauseMappingName(java.lang.String sipCauseMappingName) {
        this.sipCauseMappingName = sipCauseMappingName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipToInternalCauseMapping)) return false;
        SipToInternalCauseMapping other = (SipToInternalCauseMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sipCauseMappingIndex==null && other.getSipCauseMappingIndex()==null) || 
             (this.sipCauseMappingIndex!=null &&
              this.sipCauseMappingIndex.equals(other.getSipCauseMappingIndex()))) &&
            ((this.sipCauseMappingName==null && other.getSipCauseMappingName()==null) || 
             (this.sipCauseMappingName!=null &&
              this.sipCauseMappingName.equals(other.getSipCauseMappingName())));
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
        if (getSipCauseMappingIndex() != null) {
            _hashCode += getSipCauseMappingIndex().hashCode();
        }
        if (getSipCauseMappingName() != null) {
            _hashCode += getSipCauseMappingName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipToInternalCauseMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipToInternalCauseMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipCauseMappingIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipCauseMappingIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipCauseMappingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipCauseMappingName"));
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
