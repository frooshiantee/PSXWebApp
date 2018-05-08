/**
 * CarrierTypeProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CarrierTypeProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String carrierTypeProfileId;

    private java.lang.Integer ingressTgDestSwitchType;

    private java.lang.Integer egressTgDestSwitchType;

    private java.lang.Integer calltype;

    public CarrierTypeProfileDataKey() {
    }

    public CarrierTypeProfileDataKey(
           java.lang.String carrierTypeProfileId,
           java.lang.Integer ingressTgDestSwitchType,
           java.lang.Integer egressTgDestSwitchType,
           java.lang.Integer calltype) {
        this.carrierTypeProfileId = carrierTypeProfileId;
        this.ingressTgDestSwitchType = ingressTgDestSwitchType;
        this.egressTgDestSwitchType = egressTgDestSwitchType;
        this.calltype = calltype;
    }


    /**
     * Gets the carrierTypeProfileId value for this CarrierTypeProfileDataKey.
     * 
     * @return carrierTypeProfileId
     */
    public java.lang.String getCarrierTypeProfileId() {
        return carrierTypeProfileId;
    }


    /**
     * Sets the carrierTypeProfileId value for this CarrierTypeProfileDataKey.
     * 
     * @param carrierTypeProfileId
     */
    public void setCarrierTypeProfileId(java.lang.String carrierTypeProfileId) {
        this.carrierTypeProfileId = carrierTypeProfileId;
    }


    /**
     * Gets the ingressTgDestSwitchType value for this CarrierTypeProfileDataKey.
     * 
     * @return ingressTgDestSwitchType
     */
    public java.lang.Integer getIngressTgDestSwitchType() {
        return ingressTgDestSwitchType;
    }


    /**
     * Sets the ingressTgDestSwitchType value for this CarrierTypeProfileDataKey.
     * 
     * @param ingressTgDestSwitchType
     */
    public void setIngressTgDestSwitchType(java.lang.Integer ingressTgDestSwitchType) {
        this.ingressTgDestSwitchType = ingressTgDestSwitchType;
    }


    /**
     * Gets the egressTgDestSwitchType value for this CarrierTypeProfileDataKey.
     * 
     * @return egressTgDestSwitchType
     */
    public java.lang.Integer getEgressTgDestSwitchType() {
        return egressTgDestSwitchType;
    }


    /**
     * Sets the egressTgDestSwitchType value for this CarrierTypeProfileDataKey.
     * 
     * @param egressTgDestSwitchType
     */
    public void setEgressTgDestSwitchType(java.lang.Integer egressTgDestSwitchType) {
        this.egressTgDestSwitchType = egressTgDestSwitchType;
    }


    /**
     * Gets the calltype value for this CarrierTypeProfileDataKey.
     * 
     * @return calltype
     */
    public java.lang.Integer getCalltype() {
        return calltype;
    }


    /**
     * Sets the calltype value for this CarrierTypeProfileDataKey.
     * 
     * @param calltype
     */
    public void setCalltype(java.lang.Integer calltype) {
        this.calltype = calltype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarrierTypeProfileDataKey)) return false;
        CarrierTypeProfileDataKey other = (CarrierTypeProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.carrierTypeProfileId==null && other.getCarrierTypeProfileId()==null) || 
             (this.carrierTypeProfileId!=null &&
              this.carrierTypeProfileId.equals(other.getCarrierTypeProfileId()))) &&
            ((this.ingressTgDestSwitchType==null && other.getIngressTgDestSwitchType()==null) || 
             (this.ingressTgDestSwitchType!=null &&
              this.ingressTgDestSwitchType.equals(other.getIngressTgDestSwitchType()))) &&
            ((this.egressTgDestSwitchType==null && other.getEgressTgDestSwitchType()==null) || 
             (this.egressTgDestSwitchType!=null &&
              this.egressTgDestSwitchType.equals(other.getEgressTgDestSwitchType()))) &&
            ((this.calltype==null && other.getCalltype()==null) || 
             (this.calltype!=null &&
              this.calltype.equals(other.getCalltype())));
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
        if (getCarrierTypeProfileId() != null) {
            _hashCode += getCarrierTypeProfileId().hashCode();
        }
        if (getIngressTgDestSwitchType() != null) {
            _hashCode += getIngressTgDestSwitchType().hashCode();
        }
        if (getEgressTgDestSwitchType() != null) {
            _hashCode += getEgressTgDestSwitchType().hashCode();
        }
        if (getCalltype() != null) {
            _hashCode += getCalltype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarrierTypeProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierTypeProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierTypeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierTypeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressTgDestSwitchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressTgDestSwitchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egressTgDestSwitchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "egressTgDestSwitchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calltype"));
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
