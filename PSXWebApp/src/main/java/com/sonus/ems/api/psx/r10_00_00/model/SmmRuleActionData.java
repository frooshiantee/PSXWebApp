/**
 * SmmRuleActionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SmmRuleActionData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String smmRuleId;
    private java.lang.String actionId;
    private java.lang.Short actionIndex;

    public SmmRuleActionData() {
    }

    public SmmRuleActionData(
           java.lang.String smmRuleId,
           java.lang.String actionId,
           java.lang.Short actionIndex) {
           this.smmRuleId = smmRuleId;
           this.actionId = actionId;
           this.actionIndex = actionIndex;
    }


    /**
     * Gets the smmRuleId value for this SmmRuleActionData.
     * 
     * @return smmRuleId
     */
    public java.lang.String getSmmRuleId() {
        return smmRuleId;
    }


    /**
     * Sets the smmRuleId value for this SmmRuleActionData.
     * 
     * @param smmRuleId
     */
    public void setSmmRuleId(java.lang.String smmRuleId) {
        this.smmRuleId = smmRuleId;
    }


    /**
     * Gets the actionId value for this SmmRuleActionData.
     * 
     * @return actionId
     */
    public java.lang.String getActionId() {
        return actionId;
    }


    /**
     * Sets the actionId value for this SmmRuleActionData.
     * 
     * @param actionId
     */
    public void setActionId(java.lang.String actionId) {
        this.actionId = actionId;
    }


    /**
     * Gets the actionIndex value for this SmmRuleActionData.
     * 
     * @return actionIndex
     */
    public java.lang.Short getActionIndex() {
        return actionIndex;
    }


    /**
     * Sets the actionIndex value for this SmmRuleActionData.
     * 
     * @param actionIndex
     */
    public void setActionIndex(java.lang.Short actionIndex) {
        this.actionIndex = actionIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmmRuleActionData)) return false;
        SmmRuleActionData other = (SmmRuleActionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.smmRuleId==null && other.getSmmRuleId()==null) || 
             (this.smmRuleId!=null &&
              this.smmRuleId.equals(other.getSmmRuleId()))) &&
            ((this.actionId==null && other.getActionId()==null) || 
             (this.actionId!=null &&
              this.actionId.equals(other.getActionId()))) &&
            ((this.actionIndex==null && other.getActionIndex()==null) || 
             (this.actionIndex!=null &&
              this.actionIndex.equals(other.getActionIndex())));
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
        if (getSmmRuleId() != null) {
            _hashCode += getSmmRuleId().hashCode();
        }
        if (getActionId() != null) {
            _hashCode += getActionId().hashCode();
        }
        if (getActionIndex() != null) {
            _hashCode += getActionIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmmRuleActionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmRuleActionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionIndex"));
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
