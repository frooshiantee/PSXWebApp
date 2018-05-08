/**
 * CallingPartyBillingNumberDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CallingPartyBillingNumberDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String callingBillingControlId;

    private java.lang.Short ingressCpn;

    private java.lang.Short ingressCpnPresentation;

    private java.lang.Short ingressBn;

    public CallingPartyBillingNumberDataKey() {
    }

    public CallingPartyBillingNumberDataKey(
           java.lang.String callingBillingControlId,
           java.lang.Short ingressCpn,
           java.lang.Short ingressCpnPresentation,
           java.lang.Short ingressBn) {
        this.callingBillingControlId = callingBillingControlId;
        this.ingressCpn = ingressCpn;
        this.ingressCpnPresentation = ingressCpnPresentation;
        this.ingressBn = ingressBn;
    }


    /**
     * Gets the callingBillingControlId value for this CallingPartyBillingNumberDataKey.
     * 
     * @return callingBillingControlId
     */
    public java.lang.String getCallingBillingControlId() {
        return callingBillingControlId;
    }


    /**
     * Sets the callingBillingControlId value for this CallingPartyBillingNumberDataKey.
     * 
     * @param callingBillingControlId
     */
    public void setCallingBillingControlId(java.lang.String callingBillingControlId) {
        this.callingBillingControlId = callingBillingControlId;
    }


    /**
     * Gets the ingressCpn value for this CallingPartyBillingNumberDataKey.
     * 
     * @return ingressCpn
     */
    public java.lang.Short getIngressCpn() {
        return ingressCpn;
    }


    /**
     * Sets the ingressCpn value for this CallingPartyBillingNumberDataKey.
     * 
     * @param ingressCpn
     */
    public void setIngressCpn(java.lang.Short ingressCpn) {
        this.ingressCpn = ingressCpn;
    }


    /**
     * Gets the ingressCpnPresentation value for this CallingPartyBillingNumberDataKey.
     * 
     * @return ingressCpnPresentation
     */
    public java.lang.Short getIngressCpnPresentation() {
        return ingressCpnPresentation;
    }


    /**
     * Sets the ingressCpnPresentation value for this CallingPartyBillingNumberDataKey.
     * 
     * @param ingressCpnPresentation
     */
    public void setIngressCpnPresentation(java.lang.Short ingressCpnPresentation) {
        this.ingressCpnPresentation = ingressCpnPresentation;
    }


    /**
     * Gets the ingressBn value for this CallingPartyBillingNumberDataKey.
     * 
     * @return ingressBn
     */
    public java.lang.Short getIngressBn() {
        return ingressBn;
    }


    /**
     * Sets the ingressBn value for this CallingPartyBillingNumberDataKey.
     * 
     * @param ingressBn
     */
    public void setIngressBn(java.lang.Short ingressBn) {
        this.ingressBn = ingressBn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallingPartyBillingNumberDataKey)) return false;
        CallingPartyBillingNumberDataKey other = (CallingPartyBillingNumberDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callingBillingControlId==null && other.getCallingBillingControlId()==null) || 
             (this.callingBillingControlId!=null &&
              this.callingBillingControlId.equals(other.getCallingBillingControlId()))) &&
            ((this.ingressCpn==null && other.getIngressCpn()==null) || 
             (this.ingressCpn!=null &&
              this.ingressCpn.equals(other.getIngressCpn()))) &&
            ((this.ingressCpnPresentation==null && other.getIngressCpnPresentation()==null) || 
             (this.ingressCpnPresentation!=null &&
              this.ingressCpnPresentation.equals(other.getIngressCpnPresentation()))) &&
            ((this.ingressBn==null && other.getIngressBn()==null) || 
             (this.ingressBn!=null &&
              this.ingressBn.equals(other.getIngressBn())));
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
        if (getCallingBillingControlId() != null) {
            _hashCode += getCallingBillingControlId().hashCode();
        }
        if (getIngressCpn() != null) {
            _hashCode += getIngressCpn().hashCode();
        }
        if (getIngressCpnPresentation() != null) {
            _hashCode += getIngressCpnPresentation().hashCode();
        }
        if (getIngressBn() != null) {
            _hashCode += getIngressBn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallingPartyBillingNumberDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallingPartyBillingNumberDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingBillingControlId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingBillingControlId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressCpn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressCpn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressCpnPresentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressCpnPresentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressBn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressBn"));
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
