/**
 * HsxTriggerPoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxTriggerPoint  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String triggerPointId;

    private java.lang.Integer expressionType;

    public HsxTriggerPoint() {
    }

    public HsxTriggerPoint(
           java.lang.String triggerPointId,
           java.lang.Integer expressionType) {
        this.triggerPointId = triggerPointId;
        this.expressionType = expressionType;
    }


    /**
     * Gets the triggerPointId value for this HsxTriggerPoint.
     * 
     * @return triggerPointId
     */
    public java.lang.String getTriggerPointId() {
        return triggerPointId;
    }


    /**
     * Sets the triggerPointId value for this HsxTriggerPoint.
     * 
     * @param triggerPointId
     */
    public void setTriggerPointId(java.lang.String triggerPointId) {
        this.triggerPointId = triggerPointId;
    }


    /**
     * Gets the expressionType value for this HsxTriggerPoint.
     * 
     * @return expressionType
     */
    public java.lang.Integer getExpressionType() {
        return expressionType;
    }


    /**
     * Sets the expressionType value for this HsxTriggerPoint.
     * 
     * @param expressionType
     */
    public void setExpressionType(java.lang.Integer expressionType) {
        this.expressionType = expressionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxTriggerPoint)) return false;
        HsxTriggerPoint other = (HsxTriggerPoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.triggerPointId==null && other.getTriggerPointId()==null) || 
             (this.triggerPointId!=null &&
              this.triggerPointId.equals(other.getTriggerPointId()))) &&
            ((this.expressionType==null && other.getExpressionType()==null) || 
             (this.expressionType!=null &&
              this.expressionType.equals(other.getExpressionType())));
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
        if (getTriggerPointId() != null) {
            _hashCode += getTriggerPointId().hashCode();
        }
        if (getExpressionType() != null) {
            _hashCode += getExpressionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxTriggerPoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxTriggerPoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerPointId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triggerPointId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expressionType"));
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
