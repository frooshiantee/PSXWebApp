/**
 * FilterCriteriaKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class FilterCriteriaKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String filterCriteriaId;

    public FilterCriteriaKey() {
    }

    public FilterCriteriaKey(
           java.lang.String filterCriteriaId) {
        this.filterCriteriaId = filterCriteriaId;
    }


    /**
     * Gets the filterCriteriaId value for this FilterCriteriaKey.
     * 
     * @return filterCriteriaId
     */
    public java.lang.String getFilterCriteriaId() {
        return filterCriteriaId;
    }


    /**
     * Sets the filterCriteriaId value for this FilterCriteriaKey.
     * 
     * @param filterCriteriaId
     */
    public void setFilterCriteriaId(java.lang.String filterCriteriaId) {
        this.filterCriteriaId = filterCriteriaId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilterCriteriaKey)) return false;
        FilterCriteriaKey other = (FilterCriteriaKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.filterCriteriaId==null && other.getFilterCriteriaId()==null) || 
             (this.filterCriteriaId!=null &&
              this.filterCriteriaId.equals(other.getFilterCriteriaId())));
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
        if (getFilterCriteriaId() != null) {
            _hashCode += getFilterCriteriaId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterCriteriaKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "FilterCriteriaKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterCriteriaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterCriteriaId"));
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
