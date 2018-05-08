/**
 * PostTranslationSsgData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class PostTranslationSsgData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String ssgId;

    private java.lang.Integer priority;

    private java.lang.Integer callProcessingElementType;

    public PostTranslationSsgData() {
    }

    public PostTranslationSsgData(
           java.lang.String ssgId,
           java.lang.Integer priority,
           java.lang.Integer callProcessingElementType) {
        this.ssgId = ssgId;
        this.priority = priority;
        this.callProcessingElementType = callProcessingElementType;
    }


    /**
     * Gets the ssgId value for this PostTranslationSsgData.
     * 
     * @return ssgId
     */
    public java.lang.String getSsgId() {
        return ssgId;
    }


    /**
     * Sets the ssgId value for this PostTranslationSsgData.
     * 
     * @param ssgId
     */
    public void setSsgId(java.lang.String ssgId) {
        this.ssgId = ssgId;
    }


    /**
     * Gets the priority value for this PostTranslationSsgData.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this PostTranslationSsgData.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the callProcessingElementType value for this PostTranslationSsgData.
     * 
     * @return callProcessingElementType
     */
    public java.lang.Integer getCallProcessingElementType() {
        return callProcessingElementType;
    }


    /**
     * Sets the callProcessingElementType value for this PostTranslationSsgData.
     * 
     * @param callProcessingElementType
     */
    public void setCallProcessingElementType(java.lang.Integer callProcessingElementType) {
        this.callProcessingElementType = callProcessingElementType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostTranslationSsgData)) return false;
        PostTranslationSsgData other = (PostTranslationSsgData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ssgId==null && other.getSsgId()==null) || 
             (this.ssgId!=null &&
              this.ssgId.equals(other.getSsgId()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.callProcessingElementType==null && other.getCallProcessingElementType()==null) || 
             (this.callProcessingElementType!=null &&
              this.callProcessingElementType.equals(other.getCallProcessingElementType())));
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
        if (getSsgId() != null) {
            _hashCode += getSsgId().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getCallProcessingElementType() != null) {
            _hashCode += getCallProcessingElementType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostTranslationSsgData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PostTranslationSsgData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElementType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElementType"));
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
