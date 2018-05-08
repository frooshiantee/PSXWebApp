/**
 * PlmnProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class PlmnProfileKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String plmnId;

    public PlmnProfileKey() {
    }

    public PlmnProfileKey(
           java.lang.String plmnId) {
           this.plmnId = plmnId;
    }


    /**
     * Gets the plmnId value for this PlmnProfileKey.
     * 
     * @return plmnId
     */
    public java.lang.String getPlmnId() {
        return plmnId;
    }


    /**
     * Sets the plmnId value for this PlmnProfileKey.
     * 
     * @param plmnId
     */
    public void setPlmnId(java.lang.String plmnId) {
        this.plmnId = plmnId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlmnProfileKey)) return false;
        PlmnProfileKey other = (PlmnProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.plmnId==null && other.getPlmnId()==null) || 
             (this.plmnId!=null &&
              this.plmnId.equals(other.getPlmnId())));
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
        if (getPlmnId() != null) {
            _hashCode += getPlmnId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlmnProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PlmnProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plmnId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plmnId"));
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