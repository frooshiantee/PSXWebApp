/**
 * HsxTriggerPointData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxTriggerPointData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String triggerPointId;
    private java.lang.Integer groupId;
    private java.lang.Integer sequenceNumber;
    private java.lang.Integer conditionNegated;
    private java.lang.Integer registrationType;
    private java.lang.Integer registrationType2;
    private java.lang.Integer attribute;
    private java.lang.Integer attributeType;
    private java.lang.String value1;
    private java.lang.String value2;

    public HsxTriggerPointData() {
    }

    public HsxTriggerPointData(
           java.lang.String triggerPointId,
           java.lang.Integer groupId,
           java.lang.Integer sequenceNumber,
           java.lang.Integer conditionNegated,
           java.lang.Integer registrationType,
           java.lang.Integer registrationType2,
           java.lang.Integer attribute,
           java.lang.Integer attributeType,
           java.lang.String value1,
           java.lang.String value2) {
           this.triggerPointId = triggerPointId;
           this.groupId = groupId;
           this.sequenceNumber = sequenceNumber;
           this.conditionNegated = conditionNegated;
           this.registrationType = registrationType;
           this.registrationType2 = registrationType2;
           this.attribute = attribute;
           this.attributeType = attributeType;
           this.value1 = value1;
           this.value2 = value2;
    }


    /**
     * Gets the triggerPointId value for this HsxTriggerPointData.
     * 
     * @return triggerPointId
     */
    public java.lang.String getTriggerPointId() {
        return triggerPointId;
    }


    /**
     * Sets the triggerPointId value for this HsxTriggerPointData.
     * 
     * @param triggerPointId
     */
    public void setTriggerPointId(java.lang.String triggerPointId) {
        this.triggerPointId = triggerPointId;
    }


    /**
     * Gets the groupId value for this HsxTriggerPointData.
     * 
     * @return groupId
     */
    public java.lang.Integer getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this HsxTriggerPointData.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the sequenceNumber value for this HsxTriggerPointData.
     * 
     * @return sequenceNumber
     */
    public java.lang.Integer getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this HsxTriggerPointData.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(java.lang.Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the conditionNegated value for this HsxTriggerPointData.
     * 
     * @return conditionNegated
     */
    public java.lang.Integer getConditionNegated() {
        return conditionNegated;
    }


    /**
     * Sets the conditionNegated value for this HsxTriggerPointData.
     * 
     * @param conditionNegated
     */
    public void setConditionNegated(java.lang.Integer conditionNegated) {
        this.conditionNegated = conditionNegated;
    }


    /**
     * Gets the registrationType value for this HsxTriggerPointData.
     * 
     * @return registrationType
     */
    public java.lang.Integer getRegistrationType() {
        return registrationType;
    }


    /**
     * Sets the registrationType value for this HsxTriggerPointData.
     * 
     * @param registrationType
     */
    public void setRegistrationType(java.lang.Integer registrationType) {
        this.registrationType = registrationType;
    }


    /**
     * Gets the registrationType2 value for this HsxTriggerPointData.
     * 
     * @return registrationType2
     */
    public java.lang.Integer getRegistrationType2() {
        return registrationType2;
    }


    /**
     * Sets the registrationType2 value for this HsxTriggerPointData.
     * 
     * @param registrationType2
     */
    public void setRegistrationType2(java.lang.Integer registrationType2) {
        this.registrationType2 = registrationType2;
    }


    /**
     * Gets the attribute value for this HsxTriggerPointData.
     * 
     * @return attribute
     */
    public java.lang.Integer getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this HsxTriggerPointData.
     * 
     * @param attribute
     */
    public void setAttribute(java.lang.Integer attribute) {
        this.attribute = attribute;
    }


    /**
     * Gets the attributeType value for this HsxTriggerPointData.
     * 
     * @return attributeType
     */
    public java.lang.Integer getAttributeType() {
        return attributeType;
    }


    /**
     * Sets the attributeType value for this HsxTriggerPointData.
     * 
     * @param attributeType
     */
    public void setAttributeType(java.lang.Integer attributeType) {
        this.attributeType = attributeType;
    }


    /**
     * Gets the value1 value for this HsxTriggerPointData.
     * 
     * @return value1
     */
    public java.lang.String getValue1() {
        return value1;
    }


    /**
     * Sets the value1 value for this HsxTriggerPointData.
     * 
     * @param value1
     */
    public void setValue1(java.lang.String value1) {
        this.value1 = value1;
    }


    /**
     * Gets the value2 value for this HsxTriggerPointData.
     * 
     * @return value2
     */
    public java.lang.String getValue2() {
        return value2;
    }


    /**
     * Sets the value2 value for this HsxTriggerPointData.
     * 
     * @param value2
     */
    public void setValue2(java.lang.String value2) {
        this.value2 = value2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxTriggerPointData)) return false;
        HsxTriggerPointData other = (HsxTriggerPointData) obj;
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
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.conditionNegated==null && other.getConditionNegated()==null) || 
             (this.conditionNegated!=null &&
              this.conditionNegated.equals(other.getConditionNegated()))) &&
            ((this.registrationType==null && other.getRegistrationType()==null) || 
             (this.registrationType!=null &&
              this.registrationType.equals(other.getRegistrationType()))) &&
            ((this.registrationType2==null && other.getRegistrationType2()==null) || 
             (this.registrationType2!=null &&
              this.registrationType2.equals(other.getRegistrationType2()))) &&
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              this.attribute.equals(other.getAttribute()))) &&
            ((this.attributeType==null && other.getAttributeType()==null) || 
             (this.attributeType!=null &&
              this.attributeType.equals(other.getAttributeType()))) &&
            ((this.value1==null && other.getValue1()==null) || 
             (this.value1!=null &&
              this.value1.equals(other.getValue1()))) &&
            ((this.value2==null && other.getValue2()==null) || 
             (this.value2!=null &&
              this.value2.equals(other.getValue2())));
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
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getConditionNegated() != null) {
            _hashCode += getConditionNegated().hashCode();
        }
        if (getRegistrationType() != null) {
            _hashCode += getRegistrationType().hashCode();
        }
        if (getRegistrationType2() != null) {
            _hashCode += getRegistrationType2().hashCode();
        }
        if (getAttribute() != null) {
            _hashCode += getAttribute().hashCode();
        }
        if (getAttributeType() != null) {
            _hashCode += getAttributeType().hashCode();
        }
        if (getValue1() != null) {
            _hashCode += getValue1().hashCode();
        }
        if (getValue2() != null) {
            _hashCode += getValue2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxTriggerPointData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxTriggerPointData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerPointId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triggerPointId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionNegated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conditionNegated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationType2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationType2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value2"));
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
