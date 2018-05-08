/**
 * SctpHostNameProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SctpHostNameProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sctpHostName;
    private java.lang.String primaryHostIp;
    private java.lang.String secondaryHostIp;
    private java.lang.Short numOfInboundStreams;
    private java.lang.Short numOfOutboundStreams;
    private java.lang.String primaryHostIpv6Address;
    private java.lang.String secIpv6HostAddress;
    private java.lang.Integer hostNameAttributes;

    public SctpHostNameProfile() {
    }

    public SctpHostNameProfile(
           java.lang.String sctpHostName,
           java.lang.String primaryHostIp,
           java.lang.String secondaryHostIp,
           java.lang.Short numOfInboundStreams,
           java.lang.Short numOfOutboundStreams,
           java.lang.String primaryHostIpv6Address,
           java.lang.String secIpv6HostAddress,
           java.lang.Integer hostNameAttributes) {
           this.sctpHostName = sctpHostName;
           this.primaryHostIp = primaryHostIp;
           this.secondaryHostIp = secondaryHostIp;
           this.numOfInboundStreams = numOfInboundStreams;
           this.numOfOutboundStreams = numOfOutboundStreams;
           this.primaryHostIpv6Address = primaryHostIpv6Address;
           this.secIpv6HostAddress = secIpv6HostAddress;
           this.hostNameAttributes = hostNameAttributes;
    }


    /**
     * Gets the sctpHostName value for this SctpHostNameProfile.
     * 
     * @return sctpHostName
     */
    public java.lang.String getSctpHostName() {
        return sctpHostName;
    }


    /**
     * Sets the sctpHostName value for this SctpHostNameProfile.
     * 
     * @param sctpHostName
     */
    public void setSctpHostName(java.lang.String sctpHostName) {
        this.sctpHostName = sctpHostName;
    }


    /**
     * Gets the primaryHostIp value for this SctpHostNameProfile.
     * 
     * @return primaryHostIp
     */
    public java.lang.String getPrimaryHostIp() {
        return primaryHostIp;
    }


    /**
     * Sets the primaryHostIp value for this SctpHostNameProfile.
     * 
     * @param primaryHostIp
     */
    public void setPrimaryHostIp(java.lang.String primaryHostIp) {
        this.primaryHostIp = primaryHostIp;
    }


    /**
     * Gets the secondaryHostIp value for this SctpHostNameProfile.
     * 
     * @return secondaryHostIp
     */
    public java.lang.String getSecondaryHostIp() {
        return secondaryHostIp;
    }


    /**
     * Sets the secondaryHostIp value for this SctpHostNameProfile.
     * 
     * @param secondaryHostIp
     */
    public void setSecondaryHostIp(java.lang.String secondaryHostIp) {
        this.secondaryHostIp = secondaryHostIp;
    }


    /**
     * Gets the numOfInboundStreams value for this SctpHostNameProfile.
     * 
     * @return numOfInboundStreams
     */
    public java.lang.Short getNumOfInboundStreams() {
        return numOfInboundStreams;
    }


    /**
     * Sets the numOfInboundStreams value for this SctpHostNameProfile.
     * 
     * @param numOfInboundStreams
     */
    public void setNumOfInboundStreams(java.lang.Short numOfInboundStreams) {
        this.numOfInboundStreams = numOfInboundStreams;
    }


    /**
     * Gets the numOfOutboundStreams value for this SctpHostNameProfile.
     * 
     * @return numOfOutboundStreams
     */
    public java.lang.Short getNumOfOutboundStreams() {
        return numOfOutboundStreams;
    }


    /**
     * Sets the numOfOutboundStreams value for this SctpHostNameProfile.
     * 
     * @param numOfOutboundStreams
     */
    public void setNumOfOutboundStreams(java.lang.Short numOfOutboundStreams) {
        this.numOfOutboundStreams = numOfOutboundStreams;
    }


    /**
     * Gets the primaryHostIpv6Address value for this SctpHostNameProfile.
     * 
     * @return primaryHostIpv6Address
     */
    public java.lang.String getPrimaryHostIpv6Address() {
        return primaryHostIpv6Address;
    }


    /**
     * Sets the primaryHostIpv6Address value for this SctpHostNameProfile.
     * 
     * @param primaryHostIpv6Address
     */
    public void setPrimaryHostIpv6Address(java.lang.String primaryHostIpv6Address) {
        this.primaryHostIpv6Address = primaryHostIpv6Address;
    }


    /**
     * Gets the secIpv6HostAddress value for this SctpHostNameProfile.
     * 
     * @return secIpv6HostAddress
     */
    public java.lang.String getSecIpv6HostAddress() {
        return secIpv6HostAddress;
    }


    /**
     * Sets the secIpv6HostAddress value for this SctpHostNameProfile.
     * 
     * @param secIpv6HostAddress
     */
    public void setSecIpv6HostAddress(java.lang.String secIpv6HostAddress) {
        this.secIpv6HostAddress = secIpv6HostAddress;
    }


    /**
     * Gets the hostNameAttributes value for this SctpHostNameProfile.
     * 
     * @return hostNameAttributes
     */
    public java.lang.Integer getHostNameAttributes() {
        return hostNameAttributes;
    }


    /**
     * Sets the hostNameAttributes value for this SctpHostNameProfile.
     * 
     * @param hostNameAttributes
     */
    public void setHostNameAttributes(java.lang.Integer hostNameAttributes) {
        this.hostNameAttributes = hostNameAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SctpHostNameProfile)) return false;
        SctpHostNameProfile other = (SctpHostNameProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sctpHostName==null && other.getSctpHostName()==null) || 
             (this.sctpHostName!=null &&
              this.sctpHostName.equals(other.getSctpHostName()))) &&
            ((this.primaryHostIp==null && other.getPrimaryHostIp()==null) || 
             (this.primaryHostIp!=null &&
              this.primaryHostIp.equals(other.getPrimaryHostIp()))) &&
            ((this.secondaryHostIp==null && other.getSecondaryHostIp()==null) || 
             (this.secondaryHostIp!=null &&
              this.secondaryHostIp.equals(other.getSecondaryHostIp()))) &&
            ((this.numOfInboundStreams==null && other.getNumOfInboundStreams()==null) || 
             (this.numOfInboundStreams!=null &&
              this.numOfInboundStreams.equals(other.getNumOfInboundStreams()))) &&
            ((this.numOfOutboundStreams==null && other.getNumOfOutboundStreams()==null) || 
             (this.numOfOutboundStreams!=null &&
              this.numOfOutboundStreams.equals(other.getNumOfOutboundStreams()))) &&
            ((this.primaryHostIpv6Address==null && other.getPrimaryHostIpv6Address()==null) || 
             (this.primaryHostIpv6Address!=null &&
              this.primaryHostIpv6Address.equals(other.getPrimaryHostIpv6Address()))) &&
            ((this.secIpv6HostAddress==null && other.getSecIpv6HostAddress()==null) || 
             (this.secIpv6HostAddress!=null &&
              this.secIpv6HostAddress.equals(other.getSecIpv6HostAddress()))) &&
            ((this.hostNameAttributes==null && other.getHostNameAttributes()==null) || 
             (this.hostNameAttributes!=null &&
              this.hostNameAttributes.equals(other.getHostNameAttributes())));
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
        if (getSctpHostName() != null) {
            _hashCode += getSctpHostName().hashCode();
        }
        if (getPrimaryHostIp() != null) {
            _hashCode += getPrimaryHostIp().hashCode();
        }
        if (getSecondaryHostIp() != null) {
            _hashCode += getSecondaryHostIp().hashCode();
        }
        if (getNumOfInboundStreams() != null) {
            _hashCode += getNumOfInboundStreams().hashCode();
        }
        if (getNumOfOutboundStreams() != null) {
            _hashCode += getNumOfOutboundStreams().hashCode();
        }
        if (getPrimaryHostIpv6Address() != null) {
            _hashCode += getPrimaryHostIpv6Address().hashCode();
        }
        if (getSecIpv6HostAddress() != null) {
            _hashCode += getSecIpv6HostAddress().hashCode();
        }
        if (getHostNameAttributes() != null) {
            _hashCode += getHostNameAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SctpHostNameProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpHostNameProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sctpHostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sctpHostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryHostIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryHostIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryHostIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondaryHostIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfInboundStreams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numOfInboundStreams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfOutboundStreams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numOfOutboundStreams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryHostIpv6Address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryHostIpv6Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secIpv6HostAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secIpv6HostAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostNameAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostNameAttributes"));
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
