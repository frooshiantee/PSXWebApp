/**
 * InternalToSipCauseMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class InternalToSipCauseMapping  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Integer internalCauseMappingIndex;

    private java.lang.String internalCauseMappingName;

    public InternalToSipCauseMapping() {
    }

    public InternalToSipCauseMapping(
           java.lang.Integer internalCauseMappingIndex,
           java.lang.String internalCauseMappingName) {
        this.internalCauseMappingIndex = internalCauseMappingIndex;
        this.internalCauseMappingName = internalCauseMappingName;
    }


    /**
     * Gets the internalCauseMappingIndex value for this InternalToSipCauseMapping.
     * 
     * @return internalCauseMappingIndex
     */
    public java.lang.Integer getInternalCauseMappingIndex() {
        return internalCauseMappingIndex;
    }


    /**
     * Sets the internalCauseMappingIndex value for this InternalToSipCauseMapping.
     * 
     * @param internalCauseMappingIndex
     */
    public void setInternalCauseMappingIndex(java.lang.Integer internalCauseMappingIndex) {
        this.internalCauseMappingIndex = internalCauseMappingIndex;
    }


    /**
     * Gets the internalCauseMappingName value for this InternalToSipCauseMapping.
     * 
     * @return internalCauseMappingName
     */
    public java.lang.String getInternalCauseMappingName() {
        return internalCauseMappingName;
    }


    /**
     * Sets the internalCauseMappingName value for this InternalToSipCauseMapping.
     * 
     * @param internalCauseMappingName
     */
    public void setInternalCauseMappingName(java.lang.String internalCauseMappingName) {
        this.internalCauseMappingName = internalCauseMappingName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternalToSipCauseMapping)) return false;
        InternalToSipCauseMapping other = (InternalToSipCauseMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.internalCauseMappingIndex==null && other.getInternalCauseMappingIndex()==null) || 
             (this.internalCauseMappingIndex!=null &&
              this.internalCauseMappingIndex.equals(other.getInternalCauseMappingIndex()))) &&
            ((this.internalCauseMappingName==null && other.getInternalCauseMappingName()==null) || 
             (this.internalCauseMappingName!=null &&
              this.internalCauseMappingName.equals(other.getInternalCauseMappingName())));
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
        if (getInternalCauseMappingIndex() != null) {
            _hashCode += getInternalCauseMappingIndex().hashCode();
        }
        if (getInternalCauseMappingName() != null) {
            _hashCode += getInternalCauseMappingName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternalToSipCauseMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InternalToSipCauseMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCauseMappingIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalCauseMappingIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCauseMappingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalCauseMappingName"));
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
