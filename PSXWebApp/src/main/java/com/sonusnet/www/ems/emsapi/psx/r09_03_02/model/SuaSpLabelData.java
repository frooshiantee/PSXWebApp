/**
 * SuaSpLabelData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SuaSpLabelData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String suaSpLabelId;

    private java.lang.Short suaSpId;

    public SuaSpLabelData() {
    }

    public SuaSpLabelData(
           java.lang.String suaSpLabelId,
           java.lang.Short suaSpId) {
        this.suaSpLabelId = suaSpLabelId;
        this.suaSpId = suaSpId;
    }


    /**
     * Gets the suaSpLabelId value for this SuaSpLabelData.
     * 
     * @return suaSpLabelId
     */
    public java.lang.String getSuaSpLabelId() {
        return suaSpLabelId;
    }


    /**
     * Sets the suaSpLabelId value for this SuaSpLabelData.
     * 
     * @param suaSpLabelId
     */
    public void setSuaSpLabelId(java.lang.String suaSpLabelId) {
        this.suaSpLabelId = suaSpLabelId;
    }


    /**
     * Gets the suaSpId value for this SuaSpLabelData.
     * 
     * @return suaSpId
     */
    public java.lang.Short getSuaSpId() {
        return suaSpId;
    }


    /**
     * Sets the suaSpId value for this SuaSpLabelData.
     * 
     * @param suaSpId
     */
    public void setSuaSpId(java.lang.Short suaSpId) {
        this.suaSpId = suaSpId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuaSpLabelData)) return false;
        SuaSpLabelData other = (SuaSpLabelData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.suaSpLabelId==null && other.getSuaSpLabelId()==null) || 
             (this.suaSpLabelId!=null &&
              this.suaSpLabelId.equals(other.getSuaSpLabelId()))) &&
            ((this.suaSpId==null && other.getSuaSpId()==null) || 
             (this.suaSpId!=null &&
              this.suaSpId.equals(other.getSuaSpId())));
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
        if (getSuaSpLabelId() != null) {
            _hashCode += getSuaSpLabelId().hashCode();
        }
        if (getSuaSpId() != null) {
            _hashCode += getSuaSpId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SuaSpLabelData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SuaSpLabelData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suaSpLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suaSpLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suaSpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suaSpId"));
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
