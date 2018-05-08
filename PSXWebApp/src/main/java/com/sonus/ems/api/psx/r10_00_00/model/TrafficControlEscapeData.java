/**
 * TrafficControlEscapeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class TrafficControlEscapeData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String tcEscapeProfileId;
    private java.lang.Integer escapeType;
    private java.lang.Integer escapeData;
    private java.lang.Integer trafficControlType;

    public TrafficControlEscapeData() {
    }

    public TrafficControlEscapeData(
           java.lang.String tcEscapeProfileId,
           java.lang.Integer escapeType,
           java.lang.Integer escapeData,
           java.lang.Integer trafficControlType) {
           this.tcEscapeProfileId = tcEscapeProfileId;
           this.escapeType = escapeType;
           this.escapeData = escapeData;
           this.trafficControlType = trafficControlType;
    }


    /**
     * Gets the tcEscapeProfileId value for this TrafficControlEscapeData.
     * 
     * @return tcEscapeProfileId
     */
    public java.lang.String getTcEscapeProfileId() {
        return tcEscapeProfileId;
    }


    /**
     * Sets the tcEscapeProfileId value for this TrafficControlEscapeData.
     * 
     * @param tcEscapeProfileId
     */
    public void setTcEscapeProfileId(java.lang.String tcEscapeProfileId) {
        this.tcEscapeProfileId = tcEscapeProfileId;
    }


    /**
     * Gets the escapeType value for this TrafficControlEscapeData.
     * 
     * @return escapeType
     */
    public java.lang.Integer getEscapeType() {
        return escapeType;
    }


    /**
     * Sets the escapeType value for this TrafficControlEscapeData.
     * 
     * @param escapeType
     */
    public void setEscapeType(java.lang.Integer escapeType) {
        this.escapeType = escapeType;
    }


    /**
     * Gets the escapeData value for this TrafficControlEscapeData.
     * 
     * @return escapeData
     */
    public java.lang.Integer getEscapeData() {
        return escapeData;
    }


    /**
     * Sets the escapeData value for this TrafficControlEscapeData.
     * 
     * @param escapeData
     */
    public void setEscapeData(java.lang.Integer escapeData) {
        this.escapeData = escapeData;
    }


    /**
     * Gets the trafficControlType value for this TrafficControlEscapeData.
     * 
     * @return trafficControlType
     */
    public java.lang.Integer getTrafficControlType() {
        return trafficControlType;
    }


    /**
     * Sets the trafficControlType value for this TrafficControlEscapeData.
     * 
     * @param trafficControlType
     */
    public void setTrafficControlType(java.lang.Integer trafficControlType) {
        this.trafficControlType = trafficControlType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficControlEscapeData)) return false;
        TrafficControlEscapeData other = (TrafficControlEscapeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tcEscapeProfileId==null && other.getTcEscapeProfileId()==null) || 
             (this.tcEscapeProfileId!=null &&
              this.tcEscapeProfileId.equals(other.getTcEscapeProfileId()))) &&
            ((this.escapeType==null && other.getEscapeType()==null) || 
             (this.escapeType!=null &&
              this.escapeType.equals(other.getEscapeType()))) &&
            ((this.escapeData==null && other.getEscapeData()==null) || 
             (this.escapeData!=null &&
              this.escapeData.equals(other.getEscapeData()))) &&
            ((this.trafficControlType==null && other.getTrafficControlType()==null) || 
             (this.trafficControlType!=null &&
              this.trafficControlType.equals(other.getTrafficControlType())));
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
        if (getTcEscapeProfileId() != null) {
            _hashCode += getTcEscapeProfileId().hashCode();
        }
        if (getEscapeType() != null) {
            _hashCode += getEscapeType().hashCode();
        }
        if (getEscapeData() != null) {
            _hashCode += getEscapeData().hashCode();
        }
        if (getTrafficControlType() != null) {
            _hashCode += getTrafficControlType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrafficControlEscapeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlEscapeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcEscapeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcEscapeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escapeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "escapeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escapeData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "escapeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficControlType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficControlType"));
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
