/**
 * InDialogueHandlingProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class InDialogueHandlingProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String inDialogueHandlingProfileId;

    private java.lang.String description;

    public InDialogueHandlingProfile() {
    }

    public InDialogueHandlingProfile(
           java.lang.String inDialogueHandlingProfileId,
           java.lang.String description) {
        this.inDialogueHandlingProfileId = inDialogueHandlingProfileId;
        this.description = description;
    }


    /**
     * Gets the inDialogueHandlingProfileId value for this InDialogueHandlingProfile.
     * 
     * @return inDialogueHandlingProfileId
     */
    public java.lang.String getInDialogueHandlingProfileId() {
        return inDialogueHandlingProfileId;
    }


    /**
     * Sets the inDialogueHandlingProfileId value for this InDialogueHandlingProfile.
     * 
     * @param inDialogueHandlingProfileId
     */
    public void setInDialogueHandlingProfileId(java.lang.String inDialogueHandlingProfileId) {
        this.inDialogueHandlingProfileId = inDialogueHandlingProfileId;
    }


    /**
     * Gets the description value for this InDialogueHandlingProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InDialogueHandlingProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InDialogueHandlingProfile)) return false;
        InDialogueHandlingProfile other = (InDialogueHandlingProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.inDialogueHandlingProfileId==null && other.getInDialogueHandlingProfileId()==null) || 
             (this.inDialogueHandlingProfileId!=null &&
              this.inDialogueHandlingProfileId.equals(other.getInDialogueHandlingProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getInDialogueHandlingProfileId() != null) {
            _hashCode += getInDialogueHandlingProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InDialogueHandlingProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InDialogueHandlingProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inDialogueHandlingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inDialogueHandlingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
