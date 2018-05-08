/**
 * ReleaseCauseInTriggerProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ReleaseCauseInTriggerProfileData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String releaseCauseInTriggerProfileId;
    private java.lang.Short protocol;
    private java.lang.Short causeCode;
    private java.lang.Short inTrigger;

    public ReleaseCauseInTriggerProfileData() {
    }

    public ReleaseCauseInTriggerProfileData(
           java.lang.String releaseCauseInTriggerProfileId,
           java.lang.Short protocol,
           java.lang.Short causeCode,
           java.lang.Short inTrigger) {
           this.releaseCauseInTriggerProfileId = releaseCauseInTriggerProfileId;
           this.protocol = protocol;
           this.causeCode = causeCode;
           this.inTrigger = inTrigger;
    }


    /**
     * Gets the releaseCauseInTriggerProfileId value for this ReleaseCauseInTriggerProfileData.
     * 
     * @return releaseCauseInTriggerProfileId
     */
    public java.lang.String getReleaseCauseInTriggerProfileId() {
        return releaseCauseInTriggerProfileId;
    }


    /**
     * Sets the releaseCauseInTriggerProfileId value for this ReleaseCauseInTriggerProfileData.
     * 
     * @param releaseCauseInTriggerProfileId
     */
    public void setReleaseCauseInTriggerProfileId(java.lang.String releaseCauseInTriggerProfileId) {
        this.releaseCauseInTriggerProfileId = releaseCauseInTriggerProfileId;
    }


    /**
     * Gets the protocol value for this ReleaseCauseInTriggerProfileData.
     * 
     * @return protocol
     */
    public java.lang.Short getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this ReleaseCauseInTriggerProfileData.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.Short protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the causeCode value for this ReleaseCauseInTriggerProfileData.
     * 
     * @return causeCode
     */
    public java.lang.Short getCauseCode() {
        return causeCode;
    }


    /**
     * Sets the causeCode value for this ReleaseCauseInTriggerProfileData.
     * 
     * @param causeCode
     */
    public void setCauseCode(java.lang.Short causeCode) {
        this.causeCode = causeCode;
    }


    /**
     * Gets the inTrigger value for this ReleaseCauseInTriggerProfileData.
     * 
     * @return inTrigger
     */
    public java.lang.Short getInTrigger() {
        return inTrigger;
    }


    /**
     * Sets the inTrigger value for this ReleaseCauseInTriggerProfileData.
     * 
     * @param inTrigger
     */
    public void setInTrigger(java.lang.Short inTrigger) {
        this.inTrigger = inTrigger;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReleaseCauseInTriggerProfileData)) return false;
        ReleaseCauseInTriggerProfileData other = (ReleaseCauseInTriggerProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.releaseCauseInTriggerProfileId==null && other.getReleaseCauseInTriggerProfileId()==null) || 
             (this.releaseCauseInTriggerProfileId!=null &&
              this.releaseCauseInTriggerProfileId.equals(other.getReleaseCauseInTriggerProfileId()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.causeCode==null && other.getCauseCode()==null) || 
             (this.causeCode!=null &&
              this.causeCode.equals(other.getCauseCode()))) &&
            ((this.inTrigger==null && other.getInTrigger()==null) || 
             (this.inTrigger!=null &&
              this.inTrigger.equals(other.getInTrigger())));
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
        if (getReleaseCauseInTriggerProfileId() != null) {
            _hashCode += getReleaseCauseInTriggerProfileId().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getCauseCode() != null) {
            _hashCode += getCauseCode().hashCode();
        }
        if (getInTrigger() != null) {
            _hashCode += getInTrigger().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReleaseCauseInTriggerProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ReleaseCauseInTriggerProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseCauseInTriggerProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseCauseInTriggerProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "causeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inTrigger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inTrigger"));
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
