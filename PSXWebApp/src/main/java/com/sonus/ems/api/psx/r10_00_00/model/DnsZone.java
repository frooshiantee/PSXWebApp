/**
 * DnsZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class DnsZone  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String dnsZoneId;
    private java.lang.String dnsZoneName;
    private java.lang.Integer dnsZoneLoadDistribution;
    private java.lang.Integer dnsZoneType;
    private java.lang.Integer queryRetryTimer;

    public DnsZone() {
    }

    public DnsZone(
           java.lang.String dnsZoneId,
           java.lang.String dnsZoneName,
           java.lang.Integer dnsZoneLoadDistribution,
           java.lang.Integer dnsZoneType,
           java.lang.Integer queryRetryTimer) {
           this.dnsZoneId = dnsZoneId;
           this.dnsZoneName = dnsZoneName;
           this.dnsZoneLoadDistribution = dnsZoneLoadDistribution;
           this.dnsZoneType = dnsZoneType;
           this.queryRetryTimer = queryRetryTimer;
    }


    /**
     * Gets the dnsZoneId value for this DnsZone.
     * 
     * @return dnsZoneId
     */
    public java.lang.String getDnsZoneId() {
        return dnsZoneId;
    }


    /**
     * Sets the dnsZoneId value for this DnsZone.
     * 
     * @param dnsZoneId
     */
    public void setDnsZoneId(java.lang.String dnsZoneId) {
        this.dnsZoneId = dnsZoneId;
    }


    /**
     * Gets the dnsZoneName value for this DnsZone.
     * 
     * @return dnsZoneName
     */
    public java.lang.String getDnsZoneName() {
        return dnsZoneName;
    }


    /**
     * Sets the dnsZoneName value for this DnsZone.
     * 
     * @param dnsZoneName
     */
    public void setDnsZoneName(java.lang.String dnsZoneName) {
        this.dnsZoneName = dnsZoneName;
    }


    /**
     * Gets the dnsZoneLoadDistribution value for this DnsZone.
     * 
     * @return dnsZoneLoadDistribution
     */
    public java.lang.Integer getDnsZoneLoadDistribution() {
        return dnsZoneLoadDistribution;
    }


    /**
     * Sets the dnsZoneLoadDistribution value for this DnsZone.
     * 
     * @param dnsZoneLoadDistribution
     */
    public void setDnsZoneLoadDistribution(java.lang.Integer dnsZoneLoadDistribution) {
        this.dnsZoneLoadDistribution = dnsZoneLoadDistribution;
    }


    /**
     * Gets the dnsZoneType value for this DnsZone.
     * 
     * @return dnsZoneType
     */
    public java.lang.Integer getDnsZoneType() {
        return dnsZoneType;
    }


    /**
     * Sets the dnsZoneType value for this DnsZone.
     * 
     * @param dnsZoneType
     */
    public void setDnsZoneType(java.lang.Integer dnsZoneType) {
        this.dnsZoneType = dnsZoneType;
    }


    /**
     * Gets the queryRetryTimer value for this DnsZone.
     * 
     * @return queryRetryTimer
     */
    public java.lang.Integer getQueryRetryTimer() {
        return queryRetryTimer;
    }


    /**
     * Sets the queryRetryTimer value for this DnsZone.
     * 
     * @param queryRetryTimer
     */
    public void setQueryRetryTimer(java.lang.Integer queryRetryTimer) {
        this.queryRetryTimer = queryRetryTimer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DnsZone)) return false;
        DnsZone other = (DnsZone) obj;
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
            ((this.dnsZoneName==null && other.getDnsZoneName()==null) || 
             (this.dnsZoneName!=null &&
              this.dnsZoneName.equals(other.getDnsZoneName()))) &&
            ((this.dnsZoneLoadDistribution==null && other.getDnsZoneLoadDistribution()==null) || 
             (this.dnsZoneLoadDistribution!=null &&
              this.dnsZoneLoadDistribution.equals(other.getDnsZoneLoadDistribution()))) &&
            ((this.dnsZoneType==null && other.getDnsZoneType()==null) || 
             (this.dnsZoneType!=null &&
              this.dnsZoneType.equals(other.getDnsZoneType()))) &&
            ((this.queryRetryTimer==null && other.getQueryRetryTimer()==null) || 
             (this.queryRetryTimer!=null &&
              this.queryRetryTimer.equals(other.getQueryRetryTimer())));
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
        if (getDnsZoneName() != null) {
            _hashCode += getDnsZoneName().hashCode();
        }
        if (getDnsZoneLoadDistribution() != null) {
            _hashCode += getDnsZoneLoadDistribution().hashCode();
        }
        if (getDnsZoneType() != null) {
            _hashCode += getDnsZoneType().hashCode();
        }
        if (getQueryRetryTimer() != null) {
            _hashCode += getQueryRetryTimer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DnsZone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DnsZone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsZoneName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsZoneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsZoneLoadDistribution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsZoneLoadDistribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsZoneType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsZoneType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryRetryTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryRetryTimer"));
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
