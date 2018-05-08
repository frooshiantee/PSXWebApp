/**
 * ReleaseCauseInTriggerProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ReleaseCauseInTriggerProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String releaseCauseInTriggerProfileId;

    private java.lang.Short protocol;

    private java.lang.Short causeCode;

    public ReleaseCauseInTriggerProfileDataKey() {
    }

    public ReleaseCauseInTriggerProfileDataKey(
           java.lang.String releaseCauseInTriggerProfileId,
           java.lang.Short protocol,
           java.lang.Short causeCode) {
        this.releaseCauseInTriggerProfileId = releaseCauseInTriggerProfileId;
        this.protocol = protocol;
        this.causeCode = causeCode;
    }


    /**
     * Gets the releaseCauseInTriggerProfileId value for this ReleaseCauseInTriggerProfileDataKey.
     * 
     * @return releaseCauseInTriggerProfileId
     */
    public java.lang.String getReleaseCauseInTriggerProfileId() {
        return releaseCauseInTriggerProfileId;
    }


    /**
     * Sets the releaseCauseInTriggerProfileId value for this ReleaseCauseInTriggerProfileDataKey.
     * 
     * @param releaseCauseInTriggerProfileId
     */
    public void setReleaseCauseInTriggerProfileId(java.lang.String releaseCauseInTriggerProfileId) {
        this.releaseCauseInTriggerProfileId = releaseCauseInTriggerProfileId;
    }


    /**
     * Gets the protocol value for this ReleaseCauseInTriggerProfileDataKey.
     * 
     * @return protocol
     */
    public java.lang.Short getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this ReleaseCauseInTriggerProfileDataKey.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.Short protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the causeCode value for this ReleaseCauseInTriggerProfileDataKey.
     * 
     * @return causeCode
     */
    public java.lang.Short getCauseCode() {
        return causeCode;
    }


    /**
     * Sets the causeCode value for this ReleaseCauseInTriggerProfileDataKey.
     * 
     * @param causeCode
     */
    public void setCauseCode(java.lang.Short causeCode) {
        this.causeCode = causeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReleaseCauseInTriggerProfileDataKey)) return false;
        ReleaseCauseInTriggerProfileDataKey other = (ReleaseCauseInTriggerProfileDataKey) obj;
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
              this.causeCode.equals(other.getCauseCode())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReleaseCauseInTriggerProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ReleaseCauseInTriggerProfileDataKey"));
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
