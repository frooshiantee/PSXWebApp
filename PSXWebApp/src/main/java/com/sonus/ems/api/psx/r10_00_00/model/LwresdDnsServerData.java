/**
 * LwresdDnsServerData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class LwresdDnsServerData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String lwresdDnsServerId;
    private java.lang.String lwresdDnsServerIp;
    private java.lang.Integer edns;
    private java.lang.Integer ipType;

    public LwresdDnsServerData() {
    }

    public LwresdDnsServerData(
           java.lang.String lwresdDnsServerId,
           java.lang.String lwresdDnsServerIp,
           java.lang.Integer edns,
           java.lang.Integer ipType) {
           this.lwresdDnsServerId = lwresdDnsServerId;
           this.lwresdDnsServerIp = lwresdDnsServerIp;
           this.edns = edns;
           this.ipType = ipType;
    }


    /**
     * Gets the lwresdDnsServerId value for this LwresdDnsServerData.
     * 
     * @return lwresdDnsServerId
     */
    public java.lang.String getLwresdDnsServerId() {
        return lwresdDnsServerId;
    }


    /**
     * Sets the lwresdDnsServerId value for this LwresdDnsServerData.
     * 
     * @param lwresdDnsServerId
     */
    public void setLwresdDnsServerId(java.lang.String lwresdDnsServerId) {
        this.lwresdDnsServerId = lwresdDnsServerId;
    }


    /**
     * Gets the lwresdDnsServerIp value for this LwresdDnsServerData.
     * 
     * @return lwresdDnsServerIp
     */
    public java.lang.String getLwresdDnsServerIp() {
        return lwresdDnsServerIp;
    }


    /**
     * Sets the lwresdDnsServerIp value for this LwresdDnsServerData.
     * 
     * @param lwresdDnsServerIp
     */
    public void setLwresdDnsServerIp(java.lang.String lwresdDnsServerIp) {
        this.lwresdDnsServerIp = lwresdDnsServerIp;
    }


    /**
     * Gets the edns value for this LwresdDnsServerData.
     * 
     * @return edns
     */
    public java.lang.Integer getEdns() {
        return edns;
    }


    /**
     * Sets the edns value for this LwresdDnsServerData.
     * 
     * @param edns
     */
    public void setEdns(java.lang.Integer edns) {
        this.edns = edns;
    }


    /**
     * Gets the ipType value for this LwresdDnsServerData.
     * 
     * @return ipType
     */
    public java.lang.Integer getIpType() {
        return ipType;
    }


    /**
     * Sets the ipType value for this LwresdDnsServerData.
     * 
     * @param ipType
     */
    public void setIpType(java.lang.Integer ipType) {
        this.ipType = ipType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LwresdDnsServerData)) return false;
        LwresdDnsServerData other = (LwresdDnsServerData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lwresdDnsServerId==null && other.getLwresdDnsServerId()==null) || 
             (this.lwresdDnsServerId!=null &&
              this.lwresdDnsServerId.equals(other.getLwresdDnsServerId()))) &&
            ((this.lwresdDnsServerIp==null && other.getLwresdDnsServerIp()==null) || 
             (this.lwresdDnsServerIp!=null &&
              this.lwresdDnsServerIp.equals(other.getLwresdDnsServerIp()))) &&
            ((this.edns==null && other.getEdns()==null) || 
             (this.edns!=null &&
              this.edns.equals(other.getEdns()))) &&
            ((this.ipType==null && other.getIpType()==null) || 
             (this.ipType!=null &&
              this.ipType.equals(other.getIpType())));
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
        if (getLwresdDnsServerId() != null) {
            _hashCode += getLwresdDnsServerId().hashCode();
        }
        if (getLwresdDnsServerIp() != null) {
            _hashCode += getLwresdDnsServerIp().hashCode();
        }
        if (getEdns() != null) {
            _hashCode += getEdns().hashCode();
        }
        if (getIpType() != null) {
            _hashCode += getIpType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LwresdDnsServerData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LwresdDnsServerData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lwresdDnsServerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lwresdDnsServerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lwresdDnsServerIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lwresdDnsServerIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "edns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipType"));
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
