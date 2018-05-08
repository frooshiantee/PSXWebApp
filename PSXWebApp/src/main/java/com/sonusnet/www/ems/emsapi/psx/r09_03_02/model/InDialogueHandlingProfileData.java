/**
 * InDialogueHandlingProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class InDialogueHandlingProfileData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String inDialogueHandlingProfileId;

    private java.lang.Integer inServiceKey;

    private java.lang.Short protocol;

    private java.lang.Short attributes;

    public InDialogueHandlingProfileData() {
    }

    public InDialogueHandlingProfileData(
           java.lang.String inDialogueHandlingProfileId,
           java.lang.Integer inServiceKey,
           java.lang.Short protocol,
           java.lang.Short attributes) {
        this.inDialogueHandlingProfileId = inDialogueHandlingProfileId;
        this.inServiceKey = inServiceKey;
        this.protocol = protocol;
        this.attributes = attributes;
    }


    /**
     * Gets the inDialogueHandlingProfileId value for this InDialogueHandlingProfileData.
     * 
     * @return inDialogueHandlingProfileId
     */
    public java.lang.String getInDialogueHandlingProfileId() {
        return inDialogueHandlingProfileId;
    }


    /**
     * Sets the inDialogueHandlingProfileId value for this InDialogueHandlingProfileData.
     * 
     * @param inDialogueHandlingProfileId
     */
    public void setInDialogueHandlingProfileId(java.lang.String inDialogueHandlingProfileId) {
        this.inDialogueHandlingProfileId = inDialogueHandlingProfileId;
    }


    /**
     * Gets the inServiceKey value for this InDialogueHandlingProfileData.
     * 
     * @return inServiceKey
     */
    public java.lang.Integer getInServiceKey() {
        return inServiceKey;
    }


    /**
     * Sets the inServiceKey value for this InDialogueHandlingProfileData.
     * 
     * @param inServiceKey
     */
    public void setInServiceKey(java.lang.Integer inServiceKey) {
        this.inServiceKey = inServiceKey;
    }


    /**
     * Gets the protocol value for this InDialogueHandlingProfileData.
     * 
     * @return protocol
     */
    public java.lang.Short getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this InDialogueHandlingProfileData.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.Short protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the attributes value for this InDialogueHandlingProfileData.
     * 
     * @return attributes
     */
    public java.lang.Short getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this InDialogueHandlingProfileData.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Short attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InDialogueHandlingProfileData)) return false;
        InDialogueHandlingProfileData other = (InDialogueHandlingProfileData) obj;
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
            ((this.inServiceKey==null && other.getInServiceKey()==null) || 
             (this.inServiceKey!=null &&
              this.inServiceKey.equals(other.getInServiceKey()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes())));
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
        if (getInServiceKey() != null) {
            _hashCode += getInServiceKey().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InDialogueHandlingProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InDialogueHandlingProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inDialogueHandlingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inDialogueHandlingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inServiceKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inServiceKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
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
