/**
 * EnumDomain.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class EnumDomain  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sipDomainId;

    private java.lang.String sipDomainName;

    private java.lang.String trunkgroupId;

    private java.lang.String gatewayId;

    private java.lang.Integer sipDomainAttr;

    private java.lang.String enumAuthProfileId;

    public EnumDomain() {
    }

    public EnumDomain(
           java.lang.String sipDomainId,
           java.lang.String sipDomainName,
           java.lang.String trunkgroupId,
           java.lang.String gatewayId,
           java.lang.Integer sipDomainAttr,
           java.lang.String enumAuthProfileId) {
        this.sipDomainId = sipDomainId;
        this.sipDomainName = sipDomainName;
        this.trunkgroupId = trunkgroupId;
        this.gatewayId = gatewayId;
        this.sipDomainAttr = sipDomainAttr;
        this.enumAuthProfileId = enumAuthProfileId;
    }


    /**
     * Gets the sipDomainId value for this EnumDomain.
     * 
     * @return sipDomainId
     */
    public java.lang.String getSipDomainId() {
        return sipDomainId;
    }


    /**
     * Sets the sipDomainId value for this EnumDomain.
     * 
     * @param sipDomainId
     */
    public void setSipDomainId(java.lang.String sipDomainId) {
        this.sipDomainId = sipDomainId;
    }


    /**
     * Gets the sipDomainName value for this EnumDomain.
     * 
     * @return sipDomainName
     */
    public java.lang.String getSipDomainName() {
        return sipDomainName;
    }


    /**
     * Sets the sipDomainName value for this EnumDomain.
     * 
     * @param sipDomainName
     */
    public void setSipDomainName(java.lang.String sipDomainName) {
        this.sipDomainName = sipDomainName;
    }


    /**
     * Gets the trunkgroupId value for this EnumDomain.
     * 
     * @return trunkgroupId
     */
    public java.lang.String getTrunkgroupId() {
        return trunkgroupId;
    }


    /**
     * Sets the trunkgroupId value for this EnumDomain.
     * 
     * @param trunkgroupId
     */
    public void setTrunkgroupId(java.lang.String trunkgroupId) {
        this.trunkgroupId = trunkgroupId;
    }


    /**
     * Gets the gatewayId value for this EnumDomain.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this EnumDomain.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the sipDomainAttr value for this EnumDomain.
     * 
     * @return sipDomainAttr
     */
    public java.lang.Integer getSipDomainAttr() {
        return sipDomainAttr;
    }


    /**
     * Sets the sipDomainAttr value for this EnumDomain.
     * 
     * @param sipDomainAttr
     */
    public void setSipDomainAttr(java.lang.Integer sipDomainAttr) {
        this.sipDomainAttr = sipDomainAttr;
    }


    /**
     * Gets the enumAuthProfileId value for this EnumDomain.
     * 
     * @return enumAuthProfileId
     */
    public java.lang.String getEnumAuthProfileId() {
        return enumAuthProfileId;
    }


    /**
     * Sets the enumAuthProfileId value for this EnumDomain.
     * 
     * @param enumAuthProfileId
     */
    public void setEnumAuthProfileId(java.lang.String enumAuthProfileId) {
        this.enumAuthProfileId = enumAuthProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumDomain)) return false;
        EnumDomain other = (EnumDomain) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sipDomainId==null && other.getSipDomainId()==null) || 
             (this.sipDomainId!=null &&
              this.sipDomainId.equals(other.getSipDomainId()))) &&
            ((this.sipDomainName==null && other.getSipDomainName()==null) || 
             (this.sipDomainName!=null &&
              this.sipDomainName.equals(other.getSipDomainName()))) &&
            ((this.trunkgroupId==null && other.getTrunkgroupId()==null) || 
             (this.trunkgroupId!=null &&
              this.trunkgroupId.equals(other.getTrunkgroupId()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.sipDomainAttr==null && other.getSipDomainAttr()==null) || 
             (this.sipDomainAttr!=null &&
              this.sipDomainAttr.equals(other.getSipDomainAttr()))) &&
            ((this.enumAuthProfileId==null && other.getEnumAuthProfileId()==null) || 
             (this.enumAuthProfileId!=null &&
              this.enumAuthProfileId.equals(other.getEnumAuthProfileId())));
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
        if (getSipDomainId() != null) {
            _hashCode += getSipDomainId().hashCode();
        }
        if (getSipDomainName() != null) {
            _hashCode += getSipDomainName().hashCode();
        }
        if (getTrunkgroupId() != null) {
            _hashCode += getTrunkgroupId().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getSipDomainAttr() != null) {
            _hashCode += getSipDomainAttr().hashCode();
        }
        if (getEnumAuthProfileId() != null) {
            _hashCode += getEnumAuthProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumDomain.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnumDomain"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDomainId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDomainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDomainName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDomainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDomainAttr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDomainAttr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumAuthProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumAuthProfileId"));
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
