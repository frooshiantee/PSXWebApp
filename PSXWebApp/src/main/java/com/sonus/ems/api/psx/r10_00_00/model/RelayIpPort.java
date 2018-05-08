/**
 * RelayIpPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class RelayIpPort  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String relayIpPortId;
    private java.lang.Short sipSignalingTransportType;
    private java.lang.String ipv6Address;
    private java.lang.Integer ipv6PortNumber;
    private java.lang.Short addressType;
    private java.lang.String addressContext;
    private java.lang.String zoneIndexProfileId;

    public RelayIpPort() {
    }

    public RelayIpPort(
           java.lang.String relayIpPortId,
           java.lang.Short sipSignalingTransportType,
           java.lang.String ipv6Address,
           java.lang.Integer ipv6PortNumber,
           java.lang.Short addressType,
           java.lang.String addressContext,
           java.lang.String zoneIndexProfileId) {
           this.relayIpPortId = relayIpPortId;
           this.sipSignalingTransportType = sipSignalingTransportType;
           this.ipv6Address = ipv6Address;
           this.ipv6PortNumber = ipv6PortNumber;
           this.addressType = addressType;
           this.addressContext = addressContext;
           this.zoneIndexProfileId = zoneIndexProfileId;
    }


    /**
     * Gets the relayIpPortId value for this RelayIpPort.
     * 
     * @return relayIpPortId
     */
    public java.lang.String getRelayIpPortId() {
        return relayIpPortId;
    }


    /**
     * Sets the relayIpPortId value for this RelayIpPort.
     * 
     * @param relayIpPortId
     */
    public void setRelayIpPortId(java.lang.String relayIpPortId) {
        this.relayIpPortId = relayIpPortId;
    }


    /**
     * Gets the sipSignalingTransportType value for this RelayIpPort.
     * 
     * @return sipSignalingTransportType
     */
    public java.lang.Short getSipSignalingTransportType() {
        return sipSignalingTransportType;
    }


    /**
     * Sets the sipSignalingTransportType value for this RelayIpPort.
     * 
     * @param sipSignalingTransportType
     */
    public void setSipSignalingTransportType(java.lang.Short sipSignalingTransportType) {
        this.sipSignalingTransportType = sipSignalingTransportType;
    }


    /**
     * Gets the ipv6Address value for this RelayIpPort.
     * 
     * @return ipv6Address
     */
    public java.lang.String getIpv6Address() {
        return ipv6Address;
    }


    /**
     * Sets the ipv6Address value for this RelayIpPort.
     * 
     * @param ipv6Address
     */
    public void setIpv6Address(java.lang.String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }


    /**
     * Gets the ipv6PortNumber value for this RelayIpPort.
     * 
     * @return ipv6PortNumber
     */
    public java.lang.Integer getIpv6PortNumber() {
        return ipv6PortNumber;
    }


    /**
     * Sets the ipv6PortNumber value for this RelayIpPort.
     * 
     * @param ipv6PortNumber
     */
    public void setIpv6PortNumber(java.lang.Integer ipv6PortNumber) {
        this.ipv6PortNumber = ipv6PortNumber;
    }


    /**
     * Gets the addressType value for this RelayIpPort.
     * 
     * @return addressType
     */
    public java.lang.Short getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this RelayIpPort.
     * 
     * @param addressType
     */
    public void setAddressType(java.lang.Short addressType) {
        this.addressType = addressType;
    }


    /**
     * Gets the addressContext value for this RelayIpPort.
     * 
     * @return addressContext
     */
    public java.lang.String getAddressContext() {
        return addressContext;
    }


    /**
     * Sets the addressContext value for this RelayIpPort.
     * 
     * @param addressContext
     */
    public void setAddressContext(java.lang.String addressContext) {
        this.addressContext = addressContext;
    }


    /**
     * Gets the zoneIndexProfileId value for this RelayIpPort.
     * 
     * @return zoneIndexProfileId
     */
    public java.lang.String getZoneIndexProfileId() {
        return zoneIndexProfileId;
    }


    /**
     * Sets the zoneIndexProfileId value for this RelayIpPort.
     * 
     * @param zoneIndexProfileId
     */
    public void setZoneIndexProfileId(java.lang.String zoneIndexProfileId) {
        this.zoneIndexProfileId = zoneIndexProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelayIpPort)) return false;
        RelayIpPort other = (RelayIpPort) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.relayIpPortId==null && other.getRelayIpPortId()==null) || 
             (this.relayIpPortId!=null &&
              this.relayIpPortId.equals(other.getRelayIpPortId()))) &&
            ((this.sipSignalingTransportType==null && other.getSipSignalingTransportType()==null) || 
             (this.sipSignalingTransportType!=null &&
              this.sipSignalingTransportType.equals(other.getSipSignalingTransportType()))) &&
            ((this.ipv6Address==null && other.getIpv6Address()==null) || 
             (this.ipv6Address!=null &&
              this.ipv6Address.equals(other.getIpv6Address()))) &&
            ((this.ipv6PortNumber==null && other.getIpv6PortNumber()==null) || 
             (this.ipv6PortNumber!=null &&
              this.ipv6PortNumber.equals(other.getIpv6PortNumber()))) &&
            ((this.addressType==null && other.getAddressType()==null) || 
             (this.addressType!=null &&
              this.addressType.equals(other.getAddressType()))) &&
            ((this.addressContext==null && other.getAddressContext()==null) || 
             (this.addressContext!=null &&
              this.addressContext.equals(other.getAddressContext()))) &&
            ((this.zoneIndexProfileId==null && other.getZoneIndexProfileId()==null) || 
             (this.zoneIndexProfileId!=null &&
              this.zoneIndexProfileId.equals(other.getZoneIndexProfileId())));
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
        if (getRelayIpPortId() != null) {
            _hashCode += getRelayIpPortId().hashCode();
        }
        if (getSipSignalingTransportType() != null) {
            _hashCode += getSipSignalingTransportType().hashCode();
        }
        if (getIpv6Address() != null) {
            _hashCode += getIpv6Address().hashCode();
        }
        if (getIpv6PortNumber() != null) {
            _hashCode += getIpv6PortNumber().hashCode();
        }
        if (getAddressType() != null) {
            _hashCode += getAddressType().hashCode();
        }
        if (getAddressContext() != null) {
            _hashCode += getAddressContext().hashCode();
        }
        if (getZoneIndexProfileId() != null) {
            _hashCode += getZoneIndexProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelayIpPort.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RelayIpPort"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relayIpPortId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relayIpPortId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipSignalingTransportType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipSignalingTransportType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6PortNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6PortNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneIndexProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zoneIndexProfileId"));
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
