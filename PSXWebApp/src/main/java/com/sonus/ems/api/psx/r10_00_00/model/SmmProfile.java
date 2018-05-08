/**
 * SmmProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SmmProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Short smmProfileId;
    private java.lang.String description;
    private java.lang.Short smmState;

    public SmmProfile() {
    }

    public SmmProfile(
           java.lang.Short smmProfileId,
           java.lang.String description,
           java.lang.Short smmState) {
           this.smmProfileId = smmProfileId;
           this.description = description;
           this.smmState = smmState;
    }


    /**
     * Gets the smmProfileId value for this SmmProfile.
     * 
     * @return smmProfileId
     */
    public java.lang.Short getSmmProfileId() {
        return smmProfileId;
    }


    /**
     * Sets the smmProfileId value for this SmmProfile.
     * 
     * @param smmProfileId
     */
    public void setSmmProfileId(java.lang.Short smmProfileId) {
        this.smmProfileId = smmProfileId;
    }


    /**
     * Gets the description value for this SmmProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SmmProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the smmState value for this SmmProfile.
     * 
     * @return smmState
     */
    public java.lang.Short getSmmState() {
        return smmState;
    }


    /**
     * Sets the smmState value for this SmmProfile.
     * 
     * @param smmState
     */
    public void setSmmState(java.lang.Short smmState) {
        this.smmState = smmState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmmProfile)) return false;
        SmmProfile other = (SmmProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.smmProfileId==null && other.getSmmProfileId()==null) || 
             (this.smmProfileId!=null &&
              this.smmProfileId.equals(other.getSmmProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.smmState==null && other.getSmmState()==null) || 
             (this.smmState!=null &&
              this.smmState.equals(other.getSmmState())));
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
        if (getSmmProfileId() != null) {
            _hashCode += getSmmProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSmmState() != null) {
            _hashCode += getSmmState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmmProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smmProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smmState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmState"));
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
