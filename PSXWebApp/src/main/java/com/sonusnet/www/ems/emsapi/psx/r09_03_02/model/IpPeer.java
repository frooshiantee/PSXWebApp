/**
 * IpPeer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class IpPeer  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String ipPeerId;

    private java.lang.String description;

    private java.lang.String pspIdsProfileId;

    private java.lang.String ipv6Address;

    private java.lang.Integer ipv6PortNumber;

    private java.lang.String fqdn;

    private java.lang.Integer fqdnPortNumber;

    private java.lang.String ipSignalingProfileId;

    private java.lang.Integer ipPeerAttributes;

    private java.lang.Short defaultForIp;

    private java.lang.Short addressType;

    private java.lang.String addressContext;

    private java.lang.String zoneIndexProfileId;

    public IpPeer() {
    }

    public IpPeer(
           java.lang.String ipPeerId,
           java.lang.String description,
           java.lang.String pspIdsProfileId,
           java.lang.String ipv6Address,
           java.lang.Integer ipv6PortNumber,
           java.lang.String fqdn,
           java.lang.Integer fqdnPortNumber,
           java.lang.String ipSignalingProfileId,
           java.lang.Integer ipPeerAttributes,
           java.lang.Short defaultForIp,
           java.lang.Short addressType,
           java.lang.String addressContext,
           java.lang.String zoneIndexProfileId) {
        this.ipPeerId = ipPeerId;
        this.description = description;
        this.pspIdsProfileId = pspIdsProfileId;
        this.ipv6Address = ipv6Address;
        this.ipv6PortNumber = ipv6PortNumber;
        this.fqdn = fqdn;
        this.fqdnPortNumber = fqdnPortNumber;
        this.ipSignalingProfileId = ipSignalingProfileId;
        this.ipPeerAttributes = ipPeerAttributes;
        this.defaultForIp = defaultForIp;
        this.addressType = addressType;
        this.addressContext = addressContext;
        this.zoneIndexProfileId = zoneIndexProfileId;
    }


    /**
     * Gets the ipPeerId value for this IpPeer.
     * 
     * @return ipPeerId
     */
    public java.lang.String getIpPeerId() {
        return ipPeerId;
    }


    /**
     * Sets the ipPeerId value for this IpPeer.
     * 
     * @param ipPeerId
     */
    public void setIpPeerId(java.lang.String ipPeerId) {
        this.ipPeerId = ipPeerId;
    }


    /**
     * Gets the description value for this IpPeer.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this IpPeer.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the pspIdsProfileId value for this IpPeer.
     * 
     * @return pspIdsProfileId
     */
    public java.lang.String getPspIdsProfileId() {
        return pspIdsProfileId;
    }


    /**
     * Sets the pspIdsProfileId value for this IpPeer.
     * 
     * @param pspIdsProfileId
     */
    public void setPspIdsProfileId(java.lang.String pspIdsProfileId) {
        this.pspIdsProfileId = pspIdsProfileId;
    }


    /**
     * Gets the ipv6Address value for this IpPeer.
     * 
     * @return ipv6Address
     */
    public java.lang.String getIpv6Address() {
        return ipv6Address;
    }


    /**
     * Sets the ipv6Address value for this IpPeer.
     * 
     * @param ipv6Address
     */
    public void setIpv6Address(java.lang.String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }


    /**
     * Gets the ipv6PortNumber value for this IpPeer.
     * 
     * @return ipv6PortNumber
     */
    public java.lang.Integer getIpv6PortNumber() {
        return ipv6PortNumber;
    }


    /**
     * Sets the ipv6PortNumber value for this IpPeer.
     * 
     * @param ipv6PortNumber
     */
    public void setIpv6PortNumber(java.lang.Integer ipv6PortNumber) {
        this.ipv6PortNumber = ipv6PortNumber;
    }


    /**
     * Gets the fqdn value for this IpPeer.
     * 
     * @return fqdn
     */
    public java.lang.String getFqdn() {
        return fqdn;
    }


    /**
     * Sets the fqdn value for this IpPeer.
     * 
     * @param fqdn
     */
    public void setFqdn(java.lang.String fqdn) {
        this.fqdn = fqdn;
    }


    /**
     * Gets the fqdnPortNumber value for this IpPeer.
     * 
     * @return fqdnPortNumber
     */
    public java.lang.Integer getFqdnPortNumber() {
        return fqdnPortNumber;
    }


    /**
     * Sets the fqdnPortNumber value for this IpPeer.
     * 
     * @param fqdnPortNumber
     */
    public void setFqdnPortNumber(java.lang.Integer fqdnPortNumber) {
        this.fqdnPortNumber = fqdnPortNumber;
    }


    /**
     * Gets the ipSignalingProfileId value for this IpPeer.
     * 
     * @return ipSignalingProfileId
     */
    public java.lang.String getIpSignalingProfileId() {
        return ipSignalingProfileId;
    }


    /**
     * Sets the ipSignalingProfileId value for this IpPeer.
     * 
     * @param ipSignalingProfileId
     */
    public void setIpSignalingProfileId(java.lang.String ipSignalingProfileId) {
        this.ipSignalingProfileId = ipSignalingProfileId;
    }


    /**
     * Gets the ipPeerAttributes value for this IpPeer.
     * 
     * @return ipPeerAttributes
     */
    public java.lang.Integer getIpPeerAttributes() {
        return ipPeerAttributes;
    }


    /**
     * Sets the ipPeerAttributes value for this IpPeer.
     * 
     * @param ipPeerAttributes
     */
    public void setIpPeerAttributes(java.lang.Integer ipPeerAttributes) {
        this.ipPeerAttributes = ipPeerAttributes;
    }


    /**
     * Gets the defaultForIp value for this IpPeer.
     * 
     * @return defaultForIp
     */
    public java.lang.Short getDefaultForIp() {
        return defaultForIp;
    }


    /**
     * Sets the defaultForIp value for this IpPeer.
     * 
     * @param defaultForIp
     */
    public void setDefaultForIp(java.lang.Short defaultForIp) {
        this.defaultForIp = defaultForIp;
    }


    /**
     * Gets the addressType value for this IpPeer.
     * 
     * @return addressType
     */
    public java.lang.Short getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this IpPeer.
     * 
     * @param addressType
     */
    public void setAddressType(java.lang.Short addressType) {
        this.addressType = addressType;
    }


    /**
     * Gets the addressContext value for this IpPeer.
     * 
     * @return addressContext
     */
    public java.lang.String getAddressContext() {
        return addressContext;
    }


    /**
     * Sets the addressContext value for this IpPeer.
     * 
     * @param addressContext
     */
    public void setAddressContext(java.lang.String addressContext) {
        this.addressContext = addressContext;
    }


    /**
     * Gets the zoneIndexProfileId value for this IpPeer.
     * 
     * @return zoneIndexProfileId
     */
    public java.lang.String getZoneIndexProfileId() {
        return zoneIndexProfileId;
    }


    /**
     * Sets the zoneIndexProfileId value for this IpPeer.
     * 
     * @param zoneIndexProfileId
     */
    public void setZoneIndexProfileId(java.lang.String zoneIndexProfileId) {
        this.zoneIndexProfileId = zoneIndexProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpPeer)) return false;
        IpPeer other = (IpPeer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipPeerId==null && other.getIpPeerId()==null) || 
             (this.ipPeerId!=null &&
              this.ipPeerId.equals(other.getIpPeerId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.pspIdsProfileId==null && other.getPspIdsProfileId()==null) || 
             (this.pspIdsProfileId!=null &&
              this.pspIdsProfileId.equals(other.getPspIdsProfileId()))) &&
            ((this.ipv6Address==null && other.getIpv6Address()==null) || 
             (this.ipv6Address!=null &&
              this.ipv6Address.equals(other.getIpv6Address()))) &&
            ((this.ipv6PortNumber==null && other.getIpv6PortNumber()==null) || 
             (this.ipv6PortNumber!=null &&
              this.ipv6PortNumber.equals(other.getIpv6PortNumber()))) &&
            ((this.fqdn==null && other.getFqdn()==null) || 
             (this.fqdn!=null &&
              this.fqdn.equals(other.getFqdn()))) &&
            ((this.fqdnPortNumber==null && other.getFqdnPortNumber()==null) || 
             (this.fqdnPortNumber!=null &&
              this.fqdnPortNumber.equals(other.getFqdnPortNumber()))) &&
            ((this.ipSignalingProfileId==null && other.getIpSignalingProfileId()==null) || 
             (this.ipSignalingProfileId!=null &&
              this.ipSignalingProfileId.equals(other.getIpSignalingProfileId()))) &&
            ((this.ipPeerAttributes==null && other.getIpPeerAttributes()==null) || 
             (this.ipPeerAttributes!=null &&
              this.ipPeerAttributes.equals(other.getIpPeerAttributes()))) &&
            ((this.defaultForIp==null && other.getDefaultForIp()==null) || 
             (this.defaultForIp!=null &&
              this.defaultForIp.equals(other.getDefaultForIp()))) &&
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
        if (getIpPeerId() != null) {
            _hashCode += getIpPeerId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPspIdsProfileId() != null) {
            _hashCode += getPspIdsProfileId().hashCode();
        }
        if (getIpv6Address() != null) {
            _hashCode += getIpv6Address().hashCode();
        }
        if (getIpv6PortNumber() != null) {
            _hashCode += getIpv6PortNumber().hashCode();
        }
        if (getFqdn() != null) {
            _hashCode += getFqdn().hashCode();
        }
        if (getFqdnPortNumber() != null) {
            _hashCode += getFqdnPortNumber().hashCode();
        }
        if (getIpSignalingProfileId() != null) {
            _hashCode += getIpSignalingProfileId().hashCode();
        }
        if (getIpPeerAttributes() != null) {
            _hashCode += getIpPeerAttributes().hashCode();
        }
        if (getDefaultForIp() != null) {
            _hashCode += getDefaultForIp().hashCode();
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
        new org.apache.axis.description.TypeDesc(IpPeer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpPeer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipPeerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipPeerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pspIdsProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pspIdsProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("fqdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fqdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fqdnPortNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fqdnPortNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSignalingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSignalingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipPeerAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipPeerAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultForIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultForIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
