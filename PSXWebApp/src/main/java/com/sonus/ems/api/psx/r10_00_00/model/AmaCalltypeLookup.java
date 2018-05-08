/**
 * AmaCalltypeLookup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class AmaCalltypeLookup  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Integer callCondition;
    private java.lang.String amaCalltype;

    public AmaCalltypeLookup() {
    }

    public AmaCalltypeLookup(
           java.lang.Integer callCondition,
           java.lang.String amaCalltype) {
           this.callCondition = callCondition;
           this.amaCalltype = amaCalltype;
    }


    /**
     * Gets the callCondition value for this AmaCalltypeLookup.
     * 
     * @return callCondition
     */
    public java.lang.Integer getCallCondition() {
        return callCondition;
    }


    /**
     * Sets the callCondition value for this AmaCalltypeLookup.
     * 
     * @param callCondition
     */
    public void setCallCondition(java.lang.Integer callCondition) {
        this.callCondition = callCondition;
    }


    /**
     * Gets the amaCalltype value for this AmaCalltypeLookup.
     * 
     * @return amaCalltype
     */
    public java.lang.String getAmaCalltype() {
        return amaCalltype;
    }


    /**
     * Sets the amaCalltype value for this AmaCalltypeLookup.
     * 
     * @param amaCalltype
     */
    public void setAmaCalltype(java.lang.String amaCalltype) {
        this.amaCalltype = amaCalltype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AmaCalltypeLookup)) return false;
        AmaCalltypeLookup other = (AmaCalltypeLookup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callCondition==null && other.getCallCondition()==null) || 
             (this.callCondition!=null &&
              this.callCondition.equals(other.getCallCondition()))) &&
            ((this.amaCalltype==null && other.getAmaCalltype()==null) || 
             (this.amaCalltype!=null &&
              this.amaCalltype.equals(other.getAmaCalltype())));
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
        if (getCallCondition() != null) {
            _hashCode += getCallCondition().hashCode();
        }
        if (getAmaCalltype() != null) {
            _hashCode += getAmaCalltype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AmaCalltypeLookup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AmaCalltypeLookup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amaCalltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amaCalltype"));
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
