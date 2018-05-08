/**
 * PpspIdsProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class PpspIdsProfileKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String ppspIdsProfileId;

    public PpspIdsProfileKey() {
    }

    public PpspIdsProfileKey(
           java.lang.String ppspIdsProfileId) {
           this.ppspIdsProfileId = ppspIdsProfileId;
    }


    /**
     * Gets the ppspIdsProfileId value for this PpspIdsProfileKey.
     * 
     * @return ppspIdsProfileId
     */
    public java.lang.String getPpspIdsProfileId() {
        return ppspIdsProfileId;
    }


    /**
     * Sets the ppspIdsProfileId value for this PpspIdsProfileKey.
     * 
     * @param ppspIdsProfileId
     */
    public void setPpspIdsProfileId(java.lang.String ppspIdsProfileId) {
        this.ppspIdsProfileId = ppspIdsProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PpspIdsProfileKey)) return false;
        PpspIdsProfileKey other = (PpspIdsProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ppspIdsProfileId==null && other.getPpspIdsProfileId()==null) || 
             (this.ppspIdsProfileId!=null &&
              this.ppspIdsProfileId.equals(other.getPpspIdsProfileId())));
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
        if (getPpspIdsProfileId() != null) {
            _hashCode += getPpspIdsProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PpspIdsProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PpspIdsProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppspIdsProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppspIdsProfileId"));
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
