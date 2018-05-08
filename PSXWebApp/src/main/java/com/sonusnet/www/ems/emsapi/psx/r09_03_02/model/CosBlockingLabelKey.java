/**
 * CosBlockingLabelKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CosBlockingLabelKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String classOfServiceId;

    private java.lang.String blockingProfileId;

    private java.lang.Integer serviceType;

    private java.lang.Integer profileSequence;

    public CosBlockingLabelKey() {
    }

    public CosBlockingLabelKey(
           java.lang.String classOfServiceId,
           java.lang.String blockingProfileId,
           java.lang.Integer serviceType,
           java.lang.Integer profileSequence) {
        this.classOfServiceId = classOfServiceId;
        this.blockingProfileId = blockingProfileId;
        this.serviceType = serviceType;
        this.profileSequence = profileSequence;
    }


    /**
     * Gets the classOfServiceId value for this CosBlockingLabelKey.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this CosBlockingLabelKey.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the blockingProfileId value for this CosBlockingLabelKey.
     * 
     * @return blockingProfileId
     */
    public java.lang.String getBlockingProfileId() {
        return blockingProfileId;
    }


    /**
     * Sets the blockingProfileId value for this CosBlockingLabelKey.
     * 
     * @param blockingProfileId
     */
    public void setBlockingProfileId(java.lang.String blockingProfileId) {
        this.blockingProfileId = blockingProfileId;
    }


    /**
     * Gets the serviceType value for this CosBlockingLabelKey.
     * 
     * @return serviceType
     */
    public java.lang.Integer getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this CosBlockingLabelKey.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.Integer serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the profileSequence value for this CosBlockingLabelKey.
     * 
     * @return profileSequence
     */
    public java.lang.Integer getProfileSequence() {
        return profileSequence;
    }


    /**
     * Sets the profileSequence value for this CosBlockingLabelKey.
     * 
     * @param profileSequence
     */
    public void setProfileSequence(java.lang.Integer profileSequence) {
        this.profileSequence = profileSequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CosBlockingLabelKey)) return false;
        CosBlockingLabelKey other = (CosBlockingLabelKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.blockingProfileId==null && other.getBlockingProfileId()==null) || 
             (this.blockingProfileId!=null &&
              this.blockingProfileId.equals(other.getBlockingProfileId()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.profileSequence==null && other.getProfileSequence()==null) || 
             (this.profileSequence!=null &&
              this.profileSequence.equals(other.getProfileSequence())));
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
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getBlockingProfileId() != null) {
            _hashCode += getBlockingProfileId().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getProfileSequence() != null) {
            _hashCode += getProfileSequence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CosBlockingLabelKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CosBlockingLabelKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classOfServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classOfServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profileSequence"));
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
