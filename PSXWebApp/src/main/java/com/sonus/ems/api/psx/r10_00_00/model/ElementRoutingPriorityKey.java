/**
 * ElementRoutingPriorityKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ElementRoutingPriorityKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String erpProfileId;
    private java.lang.Integer cpCalltype;
    private java.lang.Short cpPriority;
    private java.lang.Short priority;

    public ElementRoutingPriorityKey() {
    }

    public ElementRoutingPriorityKey(
           java.lang.String erpProfileId,
           java.lang.Integer cpCalltype,
           java.lang.Short cpPriority,
           java.lang.Short priority) {
           this.erpProfileId = erpProfileId;
           this.cpCalltype = cpCalltype;
           this.cpPriority = cpPriority;
           this.priority = priority;
    }


    /**
     * Gets the erpProfileId value for this ElementRoutingPriorityKey.
     * 
     * @return erpProfileId
     */
    public java.lang.String getErpProfileId() {
        return erpProfileId;
    }


    /**
     * Sets the erpProfileId value for this ElementRoutingPriorityKey.
     * 
     * @param erpProfileId
     */
    public void setErpProfileId(java.lang.String erpProfileId) {
        this.erpProfileId = erpProfileId;
    }


    /**
     * Gets the cpCalltype value for this ElementRoutingPriorityKey.
     * 
     * @return cpCalltype
     */
    public java.lang.Integer getCpCalltype() {
        return cpCalltype;
    }


    /**
     * Sets the cpCalltype value for this ElementRoutingPriorityKey.
     * 
     * @param cpCalltype
     */
    public void setCpCalltype(java.lang.Integer cpCalltype) {
        this.cpCalltype = cpCalltype;
    }


    /**
     * Gets the cpPriority value for this ElementRoutingPriorityKey.
     * 
     * @return cpPriority
     */
    public java.lang.Short getCpPriority() {
        return cpPriority;
    }


    /**
     * Sets the cpPriority value for this ElementRoutingPriorityKey.
     * 
     * @param cpPriority
     */
    public void setCpPriority(java.lang.Short cpPriority) {
        this.cpPriority = cpPriority;
    }


    /**
     * Gets the priority value for this ElementRoutingPriorityKey.
     * 
     * @return priority
     */
    public java.lang.Short getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ElementRoutingPriorityKey.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Short priority) {
        this.priority = priority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementRoutingPriorityKey)) return false;
        ElementRoutingPriorityKey other = (ElementRoutingPriorityKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.erpProfileId==null && other.getErpProfileId()==null) || 
             (this.erpProfileId!=null &&
              this.erpProfileId.equals(other.getErpProfileId()))) &&
            ((this.cpCalltype==null && other.getCpCalltype()==null) || 
             (this.cpCalltype!=null &&
              this.cpCalltype.equals(other.getCpCalltype()))) &&
            ((this.cpPriority==null && other.getCpPriority()==null) || 
             (this.cpPriority!=null &&
              this.cpPriority.equals(other.getCpPriority()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority())));
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
        if (getErpProfileId() != null) {
            _hashCode += getErpProfileId().hashCode();
        }
        if (getCpCalltype() != null) {
            _hashCode += getCpCalltype().hashCode();
        }
        if (getCpPriority() != null) {
            _hashCode += getCpPriority().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElementRoutingPriorityKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ElementRoutingPriorityKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erpProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erpProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpCalltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpCalltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
