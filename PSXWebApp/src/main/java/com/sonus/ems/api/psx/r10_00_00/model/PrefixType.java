/**
 * PrefixType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class PrefixType  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Short prefixTypeId;
    private java.lang.String prefixTypeName;

    public PrefixType() {
    }

    public PrefixType(
           java.lang.Short prefixTypeId,
           java.lang.String prefixTypeName) {
           this.prefixTypeId = prefixTypeId;
           this.prefixTypeName = prefixTypeName;
    }


    /**
     * Gets the prefixTypeId value for this PrefixType.
     * 
     * @return prefixTypeId
     */
    public java.lang.Short getPrefixTypeId() {
        return prefixTypeId;
    }


    /**
     * Sets the prefixTypeId value for this PrefixType.
     * 
     * @param prefixTypeId
     */
    public void setPrefixTypeId(java.lang.Short prefixTypeId) {
        this.prefixTypeId = prefixTypeId;
    }


    /**
     * Gets the prefixTypeName value for this PrefixType.
     * 
     * @return prefixTypeName
     */
    public java.lang.String getPrefixTypeName() {
        return prefixTypeName;
    }


    /**
     * Sets the prefixTypeName value for this PrefixType.
     * 
     * @param prefixTypeName
     */
    public void setPrefixTypeName(java.lang.String prefixTypeName) {
        this.prefixTypeName = prefixTypeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrefixType)) return false;
        PrefixType other = (PrefixType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prefixTypeId==null && other.getPrefixTypeId()==null) || 
             (this.prefixTypeId!=null &&
              this.prefixTypeId.equals(other.getPrefixTypeId()))) &&
            ((this.prefixTypeName==null && other.getPrefixTypeName()==null) || 
             (this.prefixTypeName!=null &&
              this.prefixTypeName.equals(other.getPrefixTypeName())));
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
        if (getPrefixTypeId() != null) {
            _hashCode += getPrefixTypeId().hashCode();
        }
        if (getPrefixTypeName() != null) {
            _hashCode += getPrefixTypeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrefixType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PrefixType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixTypeName"));
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
