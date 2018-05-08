/**
 * GatewayGroupSig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class GatewayGroupSig  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String gatewayGroupSigId;

    private java.lang.String ipSignalingProfileId;

    public GatewayGroupSig() {
    }

    public GatewayGroupSig(
           java.lang.String gatewayGroupSigId,
           java.lang.String ipSignalingProfileId) {
        this.gatewayGroupSigId = gatewayGroupSigId;
        this.ipSignalingProfileId = ipSignalingProfileId;
    }


    /**
     * Gets the gatewayGroupSigId value for this GatewayGroupSig.
     * 
     * @return gatewayGroupSigId
     */
    public java.lang.String getGatewayGroupSigId() {
        return gatewayGroupSigId;
    }


    /**
     * Sets the gatewayGroupSigId value for this GatewayGroupSig.
     * 
     * @param gatewayGroupSigId
     */
    public void setGatewayGroupSigId(java.lang.String gatewayGroupSigId) {
        this.gatewayGroupSigId = gatewayGroupSigId;
    }


    /**
     * Gets the ipSignalingProfileId value for this GatewayGroupSig.
     * 
     * @return ipSignalingProfileId
     */
    public java.lang.String getIpSignalingProfileId() {
        return ipSignalingProfileId;
    }


    /**
     * Sets the ipSignalingProfileId value for this GatewayGroupSig.
     * 
     * @param ipSignalingProfileId
     */
    public void setIpSignalingProfileId(java.lang.String ipSignalingProfileId) {
        this.ipSignalingProfileId = ipSignalingProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GatewayGroupSig)) return false;
        GatewayGroupSig other = (GatewayGroupSig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.gatewayGroupSigId==null && other.getGatewayGroupSigId()==null) || 
             (this.gatewayGroupSigId!=null &&
              this.gatewayGroupSigId.equals(other.getGatewayGroupSigId()))) &&
            ((this.ipSignalingProfileId==null && other.getIpSignalingProfileId()==null) || 
             (this.ipSignalingProfileId!=null &&
              this.ipSignalingProfileId.equals(other.getIpSignalingProfileId())));
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
        if (getGatewayGroupSigId() != null) {
            _hashCode += getGatewayGroupSigId().hashCode();
        }
        if (getIpSignalingProfileId() != null) {
            _hashCode += getIpSignalingProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GatewayGroupSig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GatewayGroupSig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayGroupSigId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayGroupSigId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSignalingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSignalingProfileId"));
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
