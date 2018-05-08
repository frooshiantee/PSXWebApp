/**
 * CosCpcScreenKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CosCpcScreenKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String classOfServiceId;
    private java.lang.String cpcScreeningId;
    private java.lang.Integer additionalCpc;

    public CosCpcScreenKey() {
    }

    public CosCpcScreenKey(
           java.lang.String classOfServiceId,
           java.lang.String cpcScreeningId,
           java.lang.Integer additionalCpc) {
           this.classOfServiceId = classOfServiceId;
           this.cpcScreeningId = cpcScreeningId;
           this.additionalCpc = additionalCpc;
    }


    /**
     * Gets the classOfServiceId value for this CosCpcScreenKey.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this CosCpcScreenKey.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the cpcScreeningId value for this CosCpcScreenKey.
     * 
     * @return cpcScreeningId
     */
    public java.lang.String getCpcScreeningId() {
        return cpcScreeningId;
    }


    /**
     * Sets the cpcScreeningId value for this CosCpcScreenKey.
     * 
     * @param cpcScreeningId
     */
    public void setCpcScreeningId(java.lang.String cpcScreeningId) {
        this.cpcScreeningId = cpcScreeningId;
    }


    /**
     * Gets the additionalCpc value for this CosCpcScreenKey.
     * 
     * @return additionalCpc
     */
    public java.lang.Integer getAdditionalCpc() {
        return additionalCpc;
    }


    /**
     * Sets the additionalCpc value for this CosCpcScreenKey.
     * 
     * @param additionalCpc
     */
    public void setAdditionalCpc(java.lang.Integer additionalCpc) {
        this.additionalCpc = additionalCpc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CosCpcScreenKey)) return false;
        CosCpcScreenKey other = (CosCpcScreenKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.cpcScreeningId==null && other.getCpcScreeningId()==null) || 
             (this.cpcScreeningId!=null &&
              this.cpcScreeningId.equals(other.getCpcScreeningId()))) &&
            ((this.additionalCpc==null && other.getAdditionalCpc()==null) || 
             (this.additionalCpc!=null &&
              this.additionalCpc.equals(other.getAdditionalCpc())));
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
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getCpcScreeningId() != null) {
            _hashCode += getCpcScreeningId().hashCode();
        }
        if (getAdditionalCpc() != null) {
            _hashCode += getAdditionalCpc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CosCpcScreenKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosCpcScreenKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classOfServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classOfServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpcScreeningId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpcScreeningId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
