/**
 * OwningCarrierProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class OwningCarrierProfileKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String owningCarrierProfileId;

    public OwningCarrierProfileKey() {
    }

    public OwningCarrierProfileKey(
           java.lang.String owningCarrierProfileId) {
        this.owningCarrierProfileId = owningCarrierProfileId;
    }


    /**
     * Gets the owningCarrierProfileId value for this OwningCarrierProfileKey.
     * 
     * @return owningCarrierProfileId
     */
    public java.lang.String getOwningCarrierProfileId() {
        return owningCarrierProfileId;
    }


    /**
     * Sets the owningCarrierProfileId value for this OwningCarrierProfileKey.
     * 
     * @param owningCarrierProfileId
     */
    public void setOwningCarrierProfileId(java.lang.String owningCarrierProfileId) {
        this.owningCarrierProfileId = owningCarrierProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OwningCarrierProfileKey)) return false;
        OwningCarrierProfileKey other = (OwningCarrierProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.owningCarrierProfileId==null && other.getOwningCarrierProfileId()==null) || 
             (this.owningCarrierProfileId!=null &&
              this.owningCarrierProfileId.equals(other.getOwningCarrierProfileId())));
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
        if (getOwningCarrierProfileId() != null) {
            _hashCode += getOwningCarrierProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OwningCarrierProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OwningCarrierProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owningCarrierProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owningCarrierProfileId"));
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
