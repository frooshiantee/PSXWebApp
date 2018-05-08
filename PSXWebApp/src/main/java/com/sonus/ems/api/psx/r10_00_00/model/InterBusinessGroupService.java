/**
 * InterBusinessGroupService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class InterBusinessGroupService  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String fromBusinessGroup;
    private java.lang.String toBusinessGroup;

    public InterBusinessGroupService() {
    }

    public InterBusinessGroupService(
           java.lang.String fromBusinessGroup,
           java.lang.String toBusinessGroup) {
           this.fromBusinessGroup = fromBusinessGroup;
           this.toBusinessGroup = toBusinessGroup;
    }


    /**
     * Gets the fromBusinessGroup value for this InterBusinessGroupService.
     * 
     * @return fromBusinessGroup
     */
    public java.lang.String getFromBusinessGroup() {
        return fromBusinessGroup;
    }


    /**
     * Sets the fromBusinessGroup value for this InterBusinessGroupService.
     * 
     * @param fromBusinessGroup
     */
    public void setFromBusinessGroup(java.lang.String fromBusinessGroup) {
        this.fromBusinessGroup = fromBusinessGroup;
    }


    /**
     * Gets the toBusinessGroup value for this InterBusinessGroupService.
     * 
     * @return toBusinessGroup
     */
    public java.lang.String getToBusinessGroup() {
        return toBusinessGroup;
    }


    /**
     * Sets the toBusinessGroup value for this InterBusinessGroupService.
     * 
     * @param toBusinessGroup
     */
    public void setToBusinessGroup(java.lang.String toBusinessGroup) {
        this.toBusinessGroup = toBusinessGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterBusinessGroupService)) return false;
        InterBusinessGroupService other = (InterBusinessGroupService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fromBusinessGroup==null && other.getFromBusinessGroup()==null) || 
             (this.fromBusinessGroup!=null &&
              this.fromBusinessGroup.equals(other.getFromBusinessGroup()))) &&
            ((this.toBusinessGroup==null && other.getToBusinessGroup()==null) || 
             (this.toBusinessGroup!=null &&
              this.toBusinessGroup.equals(other.getToBusinessGroup())));
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
        if (getFromBusinessGroup() != null) {
            _hashCode += getFromBusinessGroup().hashCode();
        }
        if (getToBusinessGroup() != null) {
            _hashCode += getToBusinessGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterBusinessGroupService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InterBusinessGroupService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromBusinessGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromBusinessGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBusinessGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toBusinessGroup"));
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
