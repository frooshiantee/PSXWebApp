/**
 * InterworkingKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class InterworkingKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.Integer callType;

    private java.lang.Integer userCalltype;

    private java.lang.Integer itgSignalingFlag;

    private java.lang.Integer otgSignalingFlag;

    public InterworkingKey() {
    }

    public InterworkingKey(
           java.lang.Integer callType,
           java.lang.Integer userCalltype,
           java.lang.Integer itgSignalingFlag,
           java.lang.Integer otgSignalingFlag) {
        this.callType = callType;
        this.userCalltype = userCalltype;
        this.itgSignalingFlag = itgSignalingFlag;
        this.otgSignalingFlag = otgSignalingFlag;
    }


    /**
     * Gets the callType value for this InterworkingKey.
     * 
     * @return callType
     */
    public java.lang.Integer getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this InterworkingKey.
     * 
     * @param callType
     */
    public void setCallType(java.lang.Integer callType) {
        this.callType = callType;
    }


    /**
     * Gets the userCalltype value for this InterworkingKey.
     * 
     * @return userCalltype
     */
    public java.lang.Integer getUserCalltype() {
        return userCalltype;
    }


    /**
     * Sets the userCalltype value for this InterworkingKey.
     * 
     * @param userCalltype
     */
    public void setUserCalltype(java.lang.Integer userCalltype) {
        this.userCalltype = userCalltype;
    }


    /**
     * Gets the itgSignalingFlag value for this InterworkingKey.
     * 
     * @return itgSignalingFlag
     */
    public java.lang.Integer getItgSignalingFlag() {
        return itgSignalingFlag;
    }


    /**
     * Sets the itgSignalingFlag value for this InterworkingKey.
     * 
     * @param itgSignalingFlag
     */
    public void setItgSignalingFlag(java.lang.Integer itgSignalingFlag) {
        this.itgSignalingFlag = itgSignalingFlag;
    }


    /**
     * Gets the otgSignalingFlag value for this InterworkingKey.
     * 
     * @return otgSignalingFlag
     */
    public java.lang.Integer getOtgSignalingFlag() {
        return otgSignalingFlag;
    }


    /**
     * Sets the otgSignalingFlag value for this InterworkingKey.
     * 
     * @param otgSignalingFlag
     */
    public void setOtgSignalingFlag(java.lang.Integer otgSignalingFlag) {
        this.otgSignalingFlag = otgSignalingFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterworkingKey)) return false;
        InterworkingKey other = (InterworkingKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
            ((this.userCalltype==null && other.getUserCalltype()==null) || 
             (this.userCalltype!=null &&
              this.userCalltype.equals(other.getUserCalltype()))) &&
            ((this.itgSignalingFlag==null && other.getItgSignalingFlag()==null) || 
             (this.itgSignalingFlag!=null &&
              this.itgSignalingFlag.equals(other.getItgSignalingFlag()))) &&
            ((this.otgSignalingFlag==null && other.getOtgSignalingFlag()==null) || 
             (this.otgSignalingFlag!=null &&
              this.otgSignalingFlag.equals(other.getOtgSignalingFlag())));
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
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
        }
        if (getUserCalltype() != null) {
            _hashCode += getUserCalltype().hashCode();
        }
        if (getItgSignalingFlag() != null) {
            _hashCode += getItgSignalingFlag().hashCode();
        }
        if (getOtgSignalingFlag() != null) {
            _hashCode += getOtgSignalingFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterworkingKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InterworkingKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCalltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCalltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itgSignalingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itgSignalingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otgSignalingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otgSignalingFlag"));
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
