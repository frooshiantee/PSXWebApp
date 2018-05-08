/**
 * H323ZoneNetwork.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class H323ZoneNetwork  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String h323ZoneId;
    private java.lang.Short networkPrefixLength;
    private java.lang.String ipAddress;

    public H323ZoneNetwork() {
    }

    public H323ZoneNetwork(
           java.lang.String h323ZoneId,
           java.lang.Short networkPrefixLength,
           java.lang.String ipAddress) {
           this.h323ZoneId = h323ZoneId;
           this.networkPrefixLength = networkPrefixLength;
           this.ipAddress = ipAddress;
    }


    /**
     * Gets the h323ZoneId value for this H323ZoneNetwork.
     * 
     * @return h323ZoneId
     */
    public java.lang.String getH323ZoneId() {
        return h323ZoneId;
    }


    /**
     * Sets the h323ZoneId value for this H323ZoneNetwork.
     * 
     * @param h323ZoneId
     */
    public void setH323ZoneId(java.lang.String h323ZoneId) {
        this.h323ZoneId = h323ZoneId;
    }


    /**
     * Gets the networkPrefixLength value for this H323ZoneNetwork.
     * 
     * @return networkPrefixLength
     */
    public java.lang.Short getNetworkPrefixLength() {
        return networkPrefixLength;
    }


    /**
     * Sets the networkPrefixLength value for this H323ZoneNetwork.
     * 
     * @param networkPrefixLength
     */
    public void setNetworkPrefixLength(java.lang.Short networkPrefixLength) {
        this.networkPrefixLength = networkPrefixLength;
    }


    /**
     * Gets the ipAddress value for this H323ZoneNetwork.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this H323ZoneNetwork.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof H323ZoneNetwork)) return false;
        H323ZoneNetwork other = (H323ZoneNetwork) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.h323ZoneId==null && other.getH323ZoneId()==null) || 
             (this.h323ZoneId!=null &&
              this.h323ZoneId.equals(other.getH323ZoneId()))) &&
            ((this.networkPrefixLength==null && other.getNetworkPrefixLength()==null) || 
             (this.networkPrefixLength!=null &&
              this.networkPrefixLength.equals(other.getNetworkPrefixLength()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress())));
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
        if (getH323ZoneId() != null) {
            _hashCode += getH323ZoneId().hashCode();
        }
        if (getNetworkPrefixLength() != null) {
            _hashCode += getNetworkPrefixLength().hashCode();
        }
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(H323ZoneNetwork.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "H323ZoneNetwork"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("h323ZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "h323ZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkPrefixLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkPrefixLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipAddress"));
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
