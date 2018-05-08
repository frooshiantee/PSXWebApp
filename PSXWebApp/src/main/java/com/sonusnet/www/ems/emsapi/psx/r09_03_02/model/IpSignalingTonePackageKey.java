/**
 * IpSignalingTonePackageKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class IpSignalingTonePackageKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.Short signalingTonePackageId;

    private java.lang.String signalingTonePackageName;

    public IpSignalingTonePackageKey() {
    }

    public IpSignalingTonePackageKey(
           java.lang.Short signalingTonePackageId,
           java.lang.String signalingTonePackageName) {
        this.signalingTonePackageId = signalingTonePackageId;
        this.signalingTonePackageName = signalingTonePackageName;
    }


    /**
     * Gets the signalingTonePackageId value for this IpSignalingTonePackageKey.
     * 
     * @return signalingTonePackageId
     */
    public java.lang.Short getSignalingTonePackageId() {
        return signalingTonePackageId;
    }


    /**
     * Sets the signalingTonePackageId value for this IpSignalingTonePackageKey.
     * 
     * @param signalingTonePackageId
     */
    public void setSignalingTonePackageId(java.lang.Short signalingTonePackageId) {
        this.signalingTonePackageId = signalingTonePackageId;
    }


    /**
     * Gets the signalingTonePackageName value for this IpSignalingTonePackageKey.
     * 
     * @return signalingTonePackageName
     */
    public java.lang.String getSignalingTonePackageName() {
        return signalingTonePackageName;
    }


    /**
     * Sets the signalingTonePackageName value for this IpSignalingTonePackageKey.
     * 
     * @param signalingTonePackageName
     */
    public void setSignalingTonePackageName(java.lang.String signalingTonePackageName) {
        this.signalingTonePackageName = signalingTonePackageName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpSignalingTonePackageKey)) return false;
        IpSignalingTonePackageKey other = (IpSignalingTonePackageKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.signalingTonePackageId==null && other.getSignalingTonePackageId()==null) || 
             (this.signalingTonePackageId!=null &&
              this.signalingTonePackageId.equals(other.getSignalingTonePackageId()))) &&
            ((this.signalingTonePackageName==null && other.getSignalingTonePackageName()==null) || 
             (this.signalingTonePackageName!=null &&
              this.signalingTonePackageName.equals(other.getSignalingTonePackageName())));
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
        if (getSignalingTonePackageId() != null) {
            _hashCode += getSignalingTonePackageId().hashCode();
        }
        if (getSignalingTonePackageName() != null) {
            _hashCode += getSignalingTonePackageName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpSignalingTonePackageKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpSignalingTonePackageKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalingTonePackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signalingTonePackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalingTonePackageName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signalingTonePackageName"));
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
