/**
 * HsxIfcSetDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxIfcSetDataKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.Integer ifcSet;
    private java.lang.String initialFilterCriteria;

    public HsxIfcSetDataKey() {
    }

    public HsxIfcSetDataKey(
           java.lang.Integer ifcSet,
           java.lang.String initialFilterCriteria) {
           this.ifcSet = ifcSet;
           this.initialFilterCriteria = initialFilterCriteria;
    }


    /**
     * Gets the ifcSet value for this HsxIfcSetDataKey.
     * 
     * @return ifcSet
     */
    public java.lang.Integer getIfcSet() {
        return ifcSet;
    }


    /**
     * Sets the ifcSet value for this HsxIfcSetDataKey.
     * 
     * @param ifcSet
     */
    public void setIfcSet(java.lang.Integer ifcSet) {
        this.ifcSet = ifcSet;
    }


    /**
     * Gets the initialFilterCriteria value for this HsxIfcSetDataKey.
     * 
     * @return initialFilterCriteria
     */
    public java.lang.String getInitialFilterCriteria() {
        return initialFilterCriteria;
    }


    /**
     * Sets the initialFilterCriteria value for this HsxIfcSetDataKey.
     * 
     * @param initialFilterCriteria
     */
    public void setInitialFilterCriteria(java.lang.String initialFilterCriteria) {
        this.initialFilterCriteria = initialFilterCriteria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxIfcSetDataKey)) return false;
        HsxIfcSetDataKey other = (HsxIfcSetDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ifcSet==null && other.getIfcSet()==null) || 
             (this.ifcSet!=null &&
              this.ifcSet.equals(other.getIfcSet()))) &&
            ((this.initialFilterCriteria==null && other.getInitialFilterCriteria()==null) || 
             (this.initialFilterCriteria!=null &&
              this.initialFilterCriteria.equals(other.getInitialFilterCriteria())));
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
        if (getIfcSet() != null) {
            _hashCode += getIfcSet().hashCode();
        }
        if (getInitialFilterCriteria() != null) {
            _hashCode += getInitialFilterCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxIfcSetDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxIfcSetDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifcSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifcSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialFilterCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initialFilterCriteria"));
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
