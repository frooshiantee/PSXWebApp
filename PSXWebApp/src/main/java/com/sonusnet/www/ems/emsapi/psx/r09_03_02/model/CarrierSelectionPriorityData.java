/**
 * CarrierSelectionPriorityData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CarrierSelectionPriorityData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String carrierSelectionPriorityId;

    private java.lang.Short priority;

    private java.lang.Short source;

    private java.lang.Integer usageFlags;

    public CarrierSelectionPriorityData() {
    }

    public CarrierSelectionPriorityData(
           java.lang.String carrierSelectionPriorityId,
           java.lang.Short priority,
           java.lang.Short source,
           java.lang.Integer usageFlags) {
        this.carrierSelectionPriorityId = carrierSelectionPriorityId;
        this.priority = priority;
        this.source = source;
        this.usageFlags = usageFlags;
    }


    /**
     * Gets the carrierSelectionPriorityId value for this CarrierSelectionPriorityData.
     * 
     * @return carrierSelectionPriorityId
     */
    public java.lang.String getCarrierSelectionPriorityId() {
        return carrierSelectionPriorityId;
    }


    /**
     * Sets the carrierSelectionPriorityId value for this CarrierSelectionPriorityData.
     * 
     * @param carrierSelectionPriorityId
     */
    public void setCarrierSelectionPriorityId(java.lang.String carrierSelectionPriorityId) {
        this.carrierSelectionPriorityId = carrierSelectionPriorityId;
    }


    /**
     * Gets the priority value for this CarrierSelectionPriorityData.
     * 
     * @return priority
     */
    public java.lang.Short getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this CarrierSelectionPriorityData.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Short priority) {
        this.priority = priority;
    }


    /**
     * Gets the source value for this CarrierSelectionPriorityData.
     * 
     * @return source
     */
    public java.lang.Short getSource() {
        return source;
    }


    /**
     * Sets the source value for this CarrierSelectionPriorityData.
     * 
     * @param source
     */
    public void setSource(java.lang.Short source) {
        this.source = source;
    }


    /**
     * Gets the usageFlags value for this CarrierSelectionPriorityData.
     * 
     * @return usageFlags
     */
    public java.lang.Integer getUsageFlags() {
        return usageFlags;
    }


    /**
     * Sets the usageFlags value for this CarrierSelectionPriorityData.
     * 
     * @param usageFlags
     */
    public void setUsageFlags(java.lang.Integer usageFlags) {
        this.usageFlags = usageFlags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarrierSelectionPriorityData)) return false;
        CarrierSelectionPriorityData other = (CarrierSelectionPriorityData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.carrierSelectionPriorityId==null && other.getCarrierSelectionPriorityId()==null) || 
             (this.carrierSelectionPriorityId!=null &&
              this.carrierSelectionPriorityId.equals(other.getCarrierSelectionPriorityId()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.usageFlags==null && other.getUsageFlags()==null) || 
             (this.usageFlags!=null &&
              this.usageFlags.equals(other.getUsageFlags())));
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
        if (getCarrierSelectionPriorityId() != null) {
            _hashCode += getCarrierSelectionPriorityId().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getUsageFlags() != null) {
            _hashCode += getUsageFlags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarrierSelectionPriorityData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierSelectionPriorityData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierSelectionPriorityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierSelectionPriorityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageFlags"));
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
