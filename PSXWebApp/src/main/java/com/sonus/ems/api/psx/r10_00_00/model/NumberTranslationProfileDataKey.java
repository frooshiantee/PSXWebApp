/**
 * NumberTranslationProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class NumberTranslationProfileDataKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String translationProfileId;
    private java.lang.String callProcessingElement1Id;
    private java.lang.String callProcessingElement2Id;
    private java.lang.String callProcessingElement3Id;
    private java.lang.String callProcessingElement4Id;
    private java.lang.Integer callProcessingElementType;

    public NumberTranslationProfileDataKey() {
    }

    public NumberTranslationProfileDataKey(
           java.lang.String translationProfileId,
           java.lang.String callProcessingElement1Id,
           java.lang.String callProcessingElement2Id,
           java.lang.String callProcessingElement3Id,
           java.lang.String callProcessingElement4Id,
           java.lang.Integer callProcessingElementType) {
           this.translationProfileId = translationProfileId;
           this.callProcessingElement1Id = callProcessingElement1Id;
           this.callProcessingElement2Id = callProcessingElement2Id;
           this.callProcessingElement3Id = callProcessingElement3Id;
           this.callProcessingElement4Id = callProcessingElement4Id;
           this.callProcessingElementType = callProcessingElementType;
    }


    /**
     * Gets the translationProfileId value for this NumberTranslationProfileDataKey.
     * 
     * @return translationProfileId
     */
    public java.lang.String getTranslationProfileId() {
        return translationProfileId;
    }


    /**
     * Sets the translationProfileId value for this NumberTranslationProfileDataKey.
     * 
     * @param translationProfileId
     */
    public void setTranslationProfileId(java.lang.String translationProfileId) {
        this.translationProfileId = translationProfileId;
    }


    /**
     * Gets the callProcessingElement1Id value for this NumberTranslationProfileDataKey.
     * 
     * @return callProcessingElement1Id
     */
    public java.lang.String getCallProcessingElement1Id() {
        return callProcessingElement1Id;
    }


    /**
     * Sets the callProcessingElement1Id value for this NumberTranslationProfileDataKey.
     * 
     * @param callProcessingElement1Id
     */
    public void setCallProcessingElement1Id(java.lang.String callProcessingElement1Id) {
        this.callProcessingElement1Id = callProcessingElement1Id;
    }


    /**
     * Gets the callProcessingElement2Id value for this NumberTranslationProfileDataKey.
     * 
     * @return callProcessingElement2Id
     */
    public java.lang.String getCallProcessingElement2Id() {
        return callProcessingElement2Id;
    }


    /**
     * Sets the callProcessingElement2Id value for this NumberTranslationProfileDataKey.
     * 
     * @param callProcessingElement2Id
     */
    public void setCallProcessingElement2Id(java.lang.String callProcessingElement2Id) {
        this.callProcessingElement2Id = callProcessingElement2Id;
    }


    /**
     * Gets the callProcessingElement3Id value for this NumberTranslationProfileDataKey.
     * 
     * @return callProcessingElement3Id
     */
    public java.lang.String getCallProcessingElement3Id() {
        return callProcessingElement3Id;
    }


    /**
     * Sets the callProcessingElement3Id value for this NumberTranslationProfileDataKey.
     * 
     * @param callProcessingElement3Id
     */
    public void setCallProcessingElement3Id(java.lang.String callProcessingElement3Id) {
        this.callProcessingElement3Id = callProcessingElement3Id;
    }


    /**
     * Gets the callProcessingElement4Id value for this NumberTranslationProfileDataKey.
     * 
     * @return callProcessingElement4Id
     */
    public java.lang.String getCallProcessingElement4Id() {
        return callProcessingElement4Id;
    }


    /**
     * Sets the callProcessingElement4Id value for this NumberTranslationProfileDataKey.
     * 
     * @param callProcessingElement4Id
     */
    public void setCallProcessingElement4Id(java.lang.String callProcessingElement4Id) {
        this.callProcessingElement4Id = callProcessingElement4Id;
    }


    /**
     * Gets the callProcessingElementType value for this NumberTranslationProfileDataKey.
     * 
     * @return callProcessingElementType
     */
    public java.lang.Integer getCallProcessingElementType() {
        return callProcessingElementType;
    }


    /**
     * Sets the callProcessingElementType value for this NumberTranslationProfileDataKey.
     * 
     * @param callProcessingElementType
     */
    public void setCallProcessingElementType(java.lang.Integer callProcessingElementType) {
        this.callProcessingElementType = callProcessingElementType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumberTranslationProfileDataKey)) return false;
        NumberTranslationProfileDataKey other = (NumberTranslationProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.translationProfileId==null && other.getTranslationProfileId()==null) || 
             (this.translationProfileId!=null &&
              this.translationProfileId.equals(other.getTranslationProfileId()))) &&
            ((this.callProcessingElement1Id==null && other.getCallProcessingElement1Id()==null) || 
             (this.callProcessingElement1Id!=null &&
              this.callProcessingElement1Id.equals(other.getCallProcessingElement1Id()))) &&
            ((this.callProcessingElement2Id==null && other.getCallProcessingElement2Id()==null) || 
             (this.callProcessingElement2Id!=null &&
              this.callProcessingElement2Id.equals(other.getCallProcessingElement2Id()))) &&
            ((this.callProcessingElement3Id==null && other.getCallProcessingElement3Id()==null) || 
             (this.callProcessingElement3Id!=null &&
              this.callProcessingElement3Id.equals(other.getCallProcessingElement3Id()))) &&
            ((this.callProcessingElement4Id==null && other.getCallProcessingElement4Id()==null) || 
             (this.callProcessingElement4Id!=null &&
              this.callProcessingElement4Id.equals(other.getCallProcessingElement4Id()))) &&
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
        if (getTranslationProfileId() != null) {
            _hashCode += getTranslationProfileId().hashCode();
        }
        if (getCallProcessingElement1Id() != null) {
            _hashCode += getCallProcessingElement1Id().hashCode();
        }
        if (getCallProcessingElement2Id() != null) {
            _hashCode += getCallProcessingElement2Id().hashCode();
        }
        if (getCallProcessingElement3Id() != null) {
            _hashCode += getCallProcessingElement3Id().hashCode();
        }
        if (getCallProcessingElement4Id() != null) {
            _hashCode += getCallProcessingElement4Id().hashCode();
        }
        if (getCallProcessingElementType() != null) {
            _hashCode += getCallProcessingElementType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumberTranslationProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translationProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElement1Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElement1Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElement2Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElement2Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElement3Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElement3Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElement4Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElement4Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
