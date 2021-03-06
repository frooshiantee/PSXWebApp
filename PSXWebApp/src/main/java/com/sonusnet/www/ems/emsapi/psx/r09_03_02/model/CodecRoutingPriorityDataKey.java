/**
 * CodecRoutingPriorityDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CodecRoutingPriorityDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String ingressCodecGroupId;

    private java.lang.Integer priority;

    public CodecRoutingPriorityDataKey() {
    }

    public CodecRoutingPriorityDataKey(
           java.lang.String ingressCodecGroupId,
           java.lang.Integer priority) {
        this.ingressCodecGroupId = ingressCodecGroupId;
        this.priority = priority;
    }


    /**
     * Gets the ingressCodecGroupId value for this CodecRoutingPriorityDataKey.
     * 
     * @return ingressCodecGroupId
     */
    public java.lang.String getIngressCodecGroupId() {
        return ingressCodecGroupId;
    }


    /**
     * Sets the ingressCodecGroupId value for this CodecRoutingPriorityDataKey.
     * 
     * @param ingressCodecGroupId
     */
    public void setIngressCodecGroupId(java.lang.String ingressCodecGroupId) {
        this.ingressCodecGroupId = ingressCodecGroupId;
    }


    /**
     * Gets the priority value for this CodecRoutingPriorityDataKey.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this CodecRoutingPriorityDataKey.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodecRoutingPriorityDataKey)) return false;
        CodecRoutingPriorityDataKey other = (CodecRoutingPriorityDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ingressCodecGroupId==null && other.getIngressCodecGroupId()==null) || 
             (this.ingressCodecGroupId!=null &&
              this.ingressCodecGroupId.equals(other.getIngressCodecGroupId()))) &&
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
        if (getIngressCodecGroupId() != null) {
            _hashCode += getIngressCodecGroupId().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodecRoutingPriorityDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CodecRoutingPriorityDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressCodecGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressCodecGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
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
