/**
 * EnumQueryProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class EnumQueryProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String enumMessageId;
    private java.lang.Integer enumOperationCode;
    private java.lang.Integer enumQueryFlags;
    private java.lang.Integer numberToBeSent;
    private java.lang.Integer enumUseDefaultFlags;
    private java.lang.Integer routingNumberNoa;

    public EnumQueryProfile() {
    }

    public EnumQueryProfile(
           java.lang.String enumMessageId,
           java.lang.Integer enumOperationCode,
           java.lang.Integer enumQueryFlags,
           java.lang.Integer numberToBeSent,
           java.lang.Integer enumUseDefaultFlags,
           java.lang.Integer routingNumberNoa) {
           this.enumMessageId = enumMessageId;
           this.enumOperationCode = enumOperationCode;
           this.enumQueryFlags = enumQueryFlags;
           this.numberToBeSent = numberToBeSent;
           this.enumUseDefaultFlags = enumUseDefaultFlags;
           this.routingNumberNoa = routingNumberNoa;
    }


    /**
     * Gets the enumMessageId value for this EnumQueryProfile.
     * 
     * @return enumMessageId
     */
    public java.lang.String getEnumMessageId() {
        return enumMessageId;
    }


    /**
     * Sets the enumMessageId value for this EnumQueryProfile.
     * 
     * @param enumMessageId
     */
    public void setEnumMessageId(java.lang.String enumMessageId) {
        this.enumMessageId = enumMessageId;
    }


    /**
     * Gets the enumOperationCode value for this EnumQueryProfile.
     * 
     * @return enumOperationCode
     */
    public java.lang.Integer getEnumOperationCode() {
        return enumOperationCode;
    }


    /**
     * Sets the enumOperationCode value for this EnumQueryProfile.
     * 
     * @param enumOperationCode
     */
    public void setEnumOperationCode(java.lang.Integer enumOperationCode) {
        this.enumOperationCode = enumOperationCode;
    }


    /**
     * Gets the enumQueryFlags value for this EnumQueryProfile.
     * 
     * @return enumQueryFlags
     */
    public java.lang.Integer getEnumQueryFlags() {
        return enumQueryFlags;
    }


    /**
     * Sets the enumQueryFlags value for this EnumQueryProfile.
     * 
     * @param enumQueryFlags
     */
    public void setEnumQueryFlags(java.lang.Integer enumQueryFlags) {
        this.enumQueryFlags = enumQueryFlags;
    }


    /**
     * Gets the numberToBeSent value for this EnumQueryProfile.
     * 
     * @return numberToBeSent
     */
    public java.lang.Integer getNumberToBeSent() {
        return numberToBeSent;
    }


    /**
     * Sets the numberToBeSent value for this EnumQueryProfile.
     * 
     * @param numberToBeSent
     */
    public void setNumberToBeSent(java.lang.Integer numberToBeSent) {
        this.numberToBeSent = numberToBeSent;
    }


    /**
     * Gets the enumUseDefaultFlags value for this EnumQueryProfile.
     * 
     * @return enumUseDefaultFlags
     */
    public java.lang.Integer getEnumUseDefaultFlags() {
        return enumUseDefaultFlags;
    }


    /**
     * Sets the enumUseDefaultFlags value for this EnumQueryProfile.
     * 
     * @param enumUseDefaultFlags
     */
    public void setEnumUseDefaultFlags(java.lang.Integer enumUseDefaultFlags) {
        this.enumUseDefaultFlags = enumUseDefaultFlags;
    }


    /**
     * Gets the routingNumberNoa value for this EnumQueryProfile.
     * 
     * @return routingNumberNoa
     */
    public java.lang.Integer getRoutingNumberNoa() {
        return routingNumberNoa;
    }


    /**
     * Sets the routingNumberNoa value for this EnumQueryProfile.
     * 
     * @param routingNumberNoa
     */
    public void setRoutingNumberNoa(java.lang.Integer routingNumberNoa) {
        this.routingNumberNoa = routingNumberNoa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumQueryProfile)) return false;
        EnumQueryProfile other = (EnumQueryProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enumMessageId==null && other.getEnumMessageId()==null) || 
             (this.enumMessageId!=null &&
              this.enumMessageId.equals(other.getEnumMessageId()))) &&
            ((this.enumOperationCode==null && other.getEnumOperationCode()==null) || 
             (this.enumOperationCode!=null &&
              this.enumOperationCode.equals(other.getEnumOperationCode()))) &&
            ((this.enumQueryFlags==null && other.getEnumQueryFlags()==null) || 
             (this.enumQueryFlags!=null &&
              this.enumQueryFlags.equals(other.getEnumQueryFlags()))) &&
            ((this.numberToBeSent==null && other.getNumberToBeSent()==null) || 
             (this.numberToBeSent!=null &&
              this.numberToBeSent.equals(other.getNumberToBeSent()))) &&
            ((this.enumUseDefaultFlags==null && other.getEnumUseDefaultFlags()==null) || 
             (this.enumUseDefaultFlags!=null &&
              this.enumUseDefaultFlags.equals(other.getEnumUseDefaultFlags()))) &&
            ((this.routingNumberNoa==null && other.getRoutingNumberNoa()==null) || 
             (this.routingNumberNoa!=null &&
              this.routingNumberNoa.equals(other.getRoutingNumberNoa())));
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
        if (getEnumMessageId() != null) {
            _hashCode += getEnumMessageId().hashCode();
        }
        if (getEnumOperationCode() != null) {
            _hashCode += getEnumOperationCode().hashCode();
        }
        if (getEnumQueryFlags() != null) {
            _hashCode += getEnumQueryFlags().hashCode();
        }
        if (getNumberToBeSent() != null) {
            _hashCode += getNumberToBeSent().hashCode();
        }
        if (getEnumUseDefaultFlags() != null) {
            _hashCode += getEnumUseDefaultFlags().hashCode();
        }
        if (getRoutingNumberNoa() != null) {
            _hashCode += getRoutingNumberNoa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumQueryProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumQueryProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumOperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumQueryFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumQueryFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberToBeSent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberToBeSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumUseDefaultFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumUseDefaultFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingNumberNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingNumberNoa"));
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
