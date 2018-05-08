/**
 * ElementRoutingPriority.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ElementRoutingPriority  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String erpProfileId;

    private java.lang.Integer cpCalltype;

    private java.lang.Short cpPriority;

    private java.lang.Short priority;

    private java.lang.Short cpOnOffNet;

    private java.lang.Short cpTollIndication;

    private java.lang.Short callProcessingElementType;

    public ElementRoutingPriority() {
    }

    public ElementRoutingPriority(
           java.lang.String erpProfileId,
           java.lang.Integer cpCalltype,
           java.lang.Short cpPriority,
           java.lang.Short priority,
           java.lang.Short cpOnOffNet,
           java.lang.Short cpTollIndication,
           java.lang.Short callProcessingElementType) {
        this.erpProfileId = erpProfileId;
        this.cpCalltype = cpCalltype;
        this.cpPriority = cpPriority;
        this.priority = priority;
        this.cpOnOffNet = cpOnOffNet;
        this.cpTollIndication = cpTollIndication;
        this.callProcessingElementType = callProcessingElementType;
    }


    /**
     * Gets the erpProfileId value for this ElementRoutingPriority.
     * 
     * @return erpProfileId
     */
    public java.lang.String getErpProfileId() {
        return erpProfileId;
    }


    /**
     * Sets the erpProfileId value for this ElementRoutingPriority.
     * 
     * @param erpProfileId
     */
    public void setErpProfileId(java.lang.String erpProfileId) {
        this.erpProfileId = erpProfileId;
    }


    /**
     * Gets the cpCalltype value for this ElementRoutingPriority.
     * 
     * @return cpCalltype
     */
    public java.lang.Integer getCpCalltype() {
        return cpCalltype;
    }


    /**
     * Sets the cpCalltype value for this ElementRoutingPriority.
     * 
     * @param cpCalltype
     */
    public void setCpCalltype(java.lang.Integer cpCalltype) {
        this.cpCalltype = cpCalltype;
    }


    /**
     * Gets the cpPriority value for this ElementRoutingPriority.
     * 
     * @return cpPriority
     */
    public java.lang.Short getCpPriority() {
        return cpPriority;
    }


    /**
     * Sets the cpPriority value for this ElementRoutingPriority.
     * 
     * @param cpPriority
     */
    public void setCpPriority(java.lang.Short cpPriority) {
        this.cpPriority = cpPriority;
    }


    /**
     * Gets the priority value for this ElementRoutingPriority.
     * 
     * @return priority
     */
    public java.lang.Short getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ElementRoutingPriority.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Short priority) {
        this.priority = priority;
    }


    /**
     * Gets the cpOnOffNet value for this ElementRoutingPriority.
     * 
     * @return cpOnOffNet
     */
    public java.lang.Short getCpOnOffNet() {
        return cpOnOffNet;
    }


    /**
     * Sets the cpOnOffNet value for this ElementRoutingPriority.
     * 
     * @param cpOnOffNet
     */
    public void setCpOnOffNet(java.lang.Short cpOnOffNet) {
        this.cpOnOffNet = cpOnOffNet;
    }


    /**
     * Gets the cpTollIndication value for this ElementRoutingPriority.
     * 
     * @return cpTollIndication
     */
    public java.lang.Short getCpTollIndication() {
        return cpTollIndication;
    }


    /**
     * Sets the cpTollIndication value for this ElementRoutingPriority.
     * 
     * @param cpTollIndication
     */
    public void setCpTollIndication(java.lang.Short cpTollIndication) {
        this.cpTollIndication = cpTollIndication;
    }


    /**
     * Gets the callProcessingElementType value for this ElementRoutingPriority.
     * 
     * @return callProcessingElementType
     */
    public java.lang.Short getCallProcessingElementType() {
        return callProcessingElementType;
    }


    /**
     * Sets the callProcessingElementType value for this ElementRoutingPriority.
     * 
     * @param callProcessingElementType
     */
    public void setCallProcessingElementType(java.lang.Short callProcessingElementType) {
        this.callProcessingElementType = callProcessingElementType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementRoutingPriority)) return false;
        ElementRoutingPriority other = (ElementRoutingPriority) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.erpProfileId==null && other.getErpProfileId()==null) || 
             (this.erpProfileId!=null &&
              this.erpProfileId.equals(other.getErpProfileId()))) &&
            ((this.cpCalltype==null && other.getCpCalltype()==null) || 
             (this.cpCalltype!=null &&
              this.cpCalltype.equals(other.getCpCalltype()))) &&
            ((this.cpPriority==null && other.getCpPriority()==null) || 
             (this.cpPriority!=null &&
              this.cpPriority.equals(other.getCpPriority()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.cpOnOffNet==null && other.getCpOnOffNet()==null) || 
             (this.cpOnOffNet!=null &&
              this.cpOnOffNet.equals(other.getCpOnOffNet()))) &&
            ((this.cpTollIndication==null && other.getCpTollIndication()==null) || 
             (this.cpTollIndication!=null &&
              this.cpTollIndication.equals(other.getCpTollIndication()))) &&
            ((this.callProcessingElementType==null && other.getCallProcessingElementType()==null) || 
             (this.callProcessingElementType!=null &&
              this.callProcessingElementType.equals(other.getCallProcessingElementType())));
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
        if (getErpProfileId() != null) {
            _hashCode += getErpProfileId().hashCode();
        }
        if (getCpCalltype() != null) {
            _hashCode += getCpCalltype().hashCode();
        }
        if (getCpPriority() != null) {
            _hashCode += getCpPriority().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getCpOnOffNet() != null) {
            _hashCode += getCpOnOffNet().hashCode();
        }
        if (getCpTollIndication() != null) {
            _hashCode += getCpTollIndication().hashCode();
        }
        if (getCallProcessingElementType() != null) {
            _hashCode += getCallProcessingElementType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElementRoutingPriority.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ElementRoutingPriority"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erpProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erpProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpCalltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpCalltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpOnOffNet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpOnOffNet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpTollIndication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpTollIndication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElementType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElementType"));
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
