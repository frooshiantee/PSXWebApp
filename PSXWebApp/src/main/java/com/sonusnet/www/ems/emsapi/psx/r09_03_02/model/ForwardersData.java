/**
 * ForwardersData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ForwardersData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String dnsZoneId;

    private java.lang.Integer forwarderPriority;

    private java.lang.String forwarderIpAddress;

    private java.lang.String forwarderDescription;

    private java.lang.Integer percentageDistribution;

    private java.lang.Integer ipType;

    public ForwardersData() {
    }

    public ForwardersData(
           java.lang.String dnsZoneId,
           java.lang.Integer forwarderPriority,
           java.lang.String forwarderIpAddress,
           java.lang.String forwarderDescription,
           java.lang.Integer percentageDistribution,
           java.lang.Integer ipType) {
        this.dnsZoneId = dnsZoneId;
        this.forwarderPriority = forwarderPriority;
        this.forwarderIpAddress = forwarderIpAddress;
        this.forwarderDescription = forwarderDescription;
        this.percentageDistribution = percentageDistribution;
        this.ipType = ipType;
    }


    /**
     * Gets the dnsZoneId value for this ForwardersData.
     * 
     * @return dnsZoneId
     */
    public java.lang.String getDnsZoneId() {
        return dnsZoneId;
    }


    /**
     * Sets the dnsZoneId value for this ForwardersData.
     * 
     * @param dnsZoneId
     */
    public void setDnsZoneId(java.lang.String dnsZoneId) {
        this.dnsZoneId = dnsZoneId;
    }


    /**
     * Gets the forwarderPriority value for this ForwardersData.
     * 
     * @return forwarderPriority
     */
    public java.lang.Integer getForwarderPriority() {
        return forwarderPriority;
    }


    /**
     * Sets the forwarderPriority value for this ForwardersData.
     * 
     * @param forwarderPriority
     */
    public void setForwarderPriority(java.lang.Integer forwarderPriority) {
        this.forwarderPriority = forwarderPriority;
    }


    /**
     * Gets the forwarderIpAddress value for this ForwardersData.
     * 
     * @return forwarderIpAddress
     */
    public java.lang.String getForwarderIpAddress() {
        return forwarderIpAddress;
    }


    /**
     * Sets the forwarderIpAddress value for this ForwardersData.
     * 
     * @param forwarderIpAddress
     */
    public void setForwarderIpAddress(java.lang.String forwarderIpAddress) {
        this.forwarderIpAddress = forwarderIpAddress;
    }


    /**
     * Gets the forwarderDescription value for this ForwardersData.
     * 
     * @return forwarderDescription
     */
    public java.lang.String getForwarderDescription() {
        return forwarderDescription;
    }


    /**
     * Sets the forwarderDescription value for this ForwardersData.
     * 
     * @param forwarderDescription
     */
    public void setForwarderDescription(java.lang.String forwarderDescription) {
        this.forwarderDescription = forwarderDescription;
    }


    /**
     * Gets the percentageDistribution value for this ForwardersData.
     * 
     * @return percentageDistribution
     */
    public java.lang.Integer getPercentageDistribution() {
        return percentageDistribution;
    }


    /**
     * Sets the percentageDistribution value for this ForwardersData.
     * 
     * @param percentageDistribution
     */
    public void setPercentageDistribution(java.lang.Integer percentageDistribution) {
        this.percentageDistribution = percentageDistribution;
    }


    /**
     * Gets the ipType value for this ForwardersData.
     * 
     * @return ipType
     */
    public java.lang.Integer getIpType() {
        return ipType;
    }


    /**
     * Sets the ipType value for this ForwardersData.
     * 
     * @param ipType
     */
    public void setIpType(java.lang.Integer ipType) {
        this.ipType = ipType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForwardersData)) return false;
        ForwardersData other = (ForwardersData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dnsZoneId==null && other.getDnsZoneId()==null) || 
             (this.dnsZoneId!=null &&
              this.dnsZoneId.equals(other.getDnsZoneId()))) &&
            ((this.forwarderPriority==null && other.getForwarderPriority()==null) || 
             (this.forwarderPriority!=null &&
              this.forwarderPriority.equals(other.getForwarderPriority()))) &&
            ((this.forwarderIpAddress==null && other.getForwarderIpAddress()==null) || 
             (this.forwarderIpAddress!=null &&
              this.forwarderIpAddress.equals(other.getForwarderIpAddress()))) &&
            ((this.forwarderDescription==null && other.getForwarderDescription()==null) || 
             (this.forwarderDescription!=null &&
              this.forwarderDescription.equals(other.getForwarderDescription()))) &&
            ((this.percentageDistribution==null && other.getPercentageDistribution()==null) || 
             (this.percentageDistribution!=null &&
              this.percentageDistribution.equals(other.getPercentageDistribution()))) &&
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
        if (getDnsZoneId() != null) {
            _hashCode += getDnsZoneId().hashCode();
        }
        if (getForwarderPriority() != null) {
            _hashCode += getForwarderPriority().hashCode();
        }
        if (getForwarderIpAddress() != null) {
            _hashCode += getForwarderIpAddress().hashCode();
        }
        if (getForwarderDescription() != null) {
            _hashCode += getForwarderDescription().hashCode();
        }
        if (getPercentageDistribution() != null) {
            _hashCode += getPercentageDistribution().hashCode();
        }
        if (getIpType() != null) {
            _hashCode += getIpType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForwardersData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ForwardersData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwarderPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwarderPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwarderIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwarderIpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwarderDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwarderDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentageDistribution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentageDistribution"));
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
