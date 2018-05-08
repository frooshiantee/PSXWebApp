/**
 * CarrierSelectionPriority.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CarrierSelectionPriority  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String carrierSelectionPriorityId;

    public CarrierSelectionPriority() {
    }

    public CarrierSelectionPriority(
           java.lang.String carrierSelectionPriorityId) {
        this.carrierSelectionPriorityId = carrierSelectionPriorityId;
    }


    /**
     * Gets the carrierSelectionPriorityId value for this CarrierSelectionPriority.
     * 
     * @return carrierSelectionPriorityId
     */
    public java.lang.String getCarrierSelectionPriorityId() {
        return carrierSelectionPriorityId;
    }


    /**
     * Sets the carrierSelectionPriorityId value for this CarrierSelectionPriority.
     * 
     * @param carrierSelectionPriorityId
     */
    public void setCarrierSelectionPriorityId(java.lang.String carrierSelectionPriorityId) {
        this.carrierSelectionPriorityId = carrierSelectionPriorityId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarrierSelectionPriority)) return false;
        CarrierSelectionPriority other = (CarrierSelectionPriority) obj;
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
              this.carrierSelectionPriorityId.equals(other.getCarrierSelectionPriorityId())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarrierSelectionPriority.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierSelectionPriority"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierSelectionPriorityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierSelectionPriorityId"));
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
