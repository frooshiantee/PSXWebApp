/**
 * LogProfileCriteriaKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class LogProfileCriteriaKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String logProfileId;
    private java.lang.Integer criteriaType;

    public LogProfileCriteriaKey() {
    }

    public LogProfileCriteriaKey(
           java.lang.String logProfileId,
           java.lang.Integer criteriaType) {
           this.logProfileId = logProfileId;
           this.criteriaType = criteriaType;
    }


    /**
     * Gets the logProfileId value for this LogProfileCriteriaKey.
     * 
     * @return logProfileId
     */
    public java.lang.String getLogProfileId() {
        return logProfileId;
    }


    /**
     * Sets the logProfileId value for this LogProfileCriteriaKey.
     * 
     * @param logProfileId
     */
    public void setLogProfileId(java.lang.String logProfileId) {
        this.logProfileId = logProfileId;
    }


    /**
     * Gets the criteriaType value for this LogProfileCriteriaKey.
     * 
     * @return criteriaType
     */
    public java.lang.Integer getCriteriaType() {
        return criteriaType;
    }


    /**
     * Sets the criteriaType value for this LogProfileCriteriaKey.
     * 
     * @param criteriaType
     */
    public void setCriteriaType(java.lang.Integer criteriaType) {
        this.criteriaType = criteriaType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogProfileCriteriaKey)) return false;
        LogProfileCriteriaKey other = (LogProfileCriteriaKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.logProfileId==null && other.getLogProfileId()==null) || 
             (this.logProfileId!=null &&
              this.logProfileId.equals(other.getLogProfileId()))) &&
            ((this.criteriaType==null && other.getCriteriaType()==null) || 
             (this.criteriaType!=null &&
              this.criteriaType.equals(other.getCriteriaType())));
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
        if (getLogProfileId() != null) {
            _hashCode += getLogProfileId().hashCode();
        }
        if (getCriteriaType() != null) {
            _hashCode += getCriteriaType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogProfileCriteriaKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LogProfileCriteriaKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriaType"));
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
