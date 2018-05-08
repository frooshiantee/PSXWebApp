/**
 * IpSignalingPeerGroupData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class IpSignalingPeerGroupData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String ipSignalingPeerGroupId;

    private java.lang.Integer sequenceNumber;

    private java.lang.Short serviceStatus;

    private java.lang.String ipAddress;

    private java.lang.Integer portNumber;

    private java.lang.String serverFqdn;

    private java.lang.Integer serverFqdnPortNumber;

    private java.lang.Integer attributes;

    public IpSignalingPeerGroupData() {
    }

    public IpSignalingPeerGroupData(
           java.lang.String ipSignalingPeerGroupId,
           java.lang.Integer sequenceNumber,
           java.lang.Short serviceStatus,
           java.lang.String ipAddress,
           java.lang.Integer portNumber,
           java.lang.String serverFqdn,
           java.lang.Integer serverFqdnPortNumber,
           java.lang.Integer attributes) {
        this.ipSignalingPeerGroupId = ipSignalingPeerGroupId;
        this.sequenceNumber = sequenceNumber;
        this.serviceStatus = serviceStatus;
        this.ipAddress = ipAddress;
        this.portNumber = portNumber;
        this.serverFqdn = serverFqdn;
        this.serverFqdnPortNumber = serverFqdnPortNumber;
        this.attributes = attributes;
    }


    /**
     * Gets the ipSignalingPeerGroupId value for this IpSignalingPeerGroupData.
     * 
     * @return ipSignalingPeerGroupId
     */
    public java.lang.String getIpSignalingPeerGroupId() {
        return ipSignalingPeerGroupId;
    }


    /**
     * Sets the ipSignalingPeerGroupId value for this IpSignalingPeerGroupData.
     * 
     * @param ipSignalingPeerGroupId
     */
    public void setIpSignalingPeerGroupId(java.lang.String ipSignalingPeerGroupId) {
        this.ipSignalingPeerGroupId = ipSignalingPeerGroupId;
    }


    /**
     * Gets the sequenceNumber value for this IpSignalingPeerGroupData.
     * 
     * @return sequenceNumber
     */
    public java.lang.Integer getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this IpSignalingPeerGroupData.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(java.lang.Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the serviceStatus value for this IpSignalingPeerGroupData.
     * 
     * @return serviceStatus
     */
    public java.lang.Short getServiceStatus() {
        return serviceStatus;
    }


    /**
     * Sets the serviceStatus value for this IpSignalingPeerGroupData.
     * 
     * @param serviceStatus
     */
    public void setServiceStatus(java.lang.Short serviceStatus) {
        this.serviceStatus = serviceStatus;
    }


    /**
     * Gets the ipAddress value for this IpSignalingPeerGroupData.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this IpSignalingPeerGroupData.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the portNumber value for this IpSignalingPeerGroupData.
     * 
     * @return portNumber
     */
    public java.lang.Integer getPortNumber() {
        return portNumber;
    }


    /**
     * Sets the portNumber value for this IpSignalingPeerGroupData.
     * 
     * @param portNumber
     */
    public void setPortNumber(java.lang.Integer portNumber) {
        this.portNumber = portNumber;
    }


    /**
     * Gets the serverFqdn value for this IpSignalingPeerGroupData.
     * 
     * @return serverFqdn
     */
    public java.lang.String getServerFqdn() {
        return serverFqdn;
    }


    /**
     * Sets the serverFqdn value for this IpSignalingPeerGroupData.
     * 
     * @param serverFqdn
     */
    public void setServerFqdn(java.lang.String serverFqdn) {
        this.serverFqdn = serverFqdn;
    }


    /**
     * Gets the serverFqdnPortNumber value for this IpSignalingPeerGroupData.
     * 
     * @return serverFqdnPortNumber
     */
    public java.lang.Integer getServerFqdnPortNumber() {
        return serverFqdnPortNumber;
    }


    /**
     * Sets the serverFqdnPortNumber value for this IpSignalingPeerGroupData.
     * 
     * @param serverFqdnPortNumber
     */
    public void setServerFqdnPortNumber(java.lang.Integer serverFqdnPortNumber) {
        this.serverFqdnPortNumber = serverFqdnPortNumber;
    }


    /**
     * Gets the attributes value for this IpSignalingPeerGroupData.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this IpSignalingPeerGroupData.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpSignalingPeerGroupData)) return false;
        IpSignalingPeerGroupData other = (IpSignalingPeerGroupData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipSignalingPeerGroupId==null && other.getIpSignalingPeerGroupId()==null) || 
             (this.ipSignalingPeerGroupId!=null &&
              this.ipSignalingPeerGroupId.equals(other.getIpSignalingPeerGroupId()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.serviceStatus==null && other.getServiceStatus()==null) || 
             (this.serviceStatus!=null &&
              this.serviceStatus.equals(other.getServiceStatus()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.portNumber==null && other.getPortNumber()==null) || 
             (this.portNumber!=null &&
              this.portNumber.equals(other.getPortNumber()))) &&
            ((this.serverFqdn==null && other.getServerFqdn()==null) || 
             (this.serverFqdn!=null &&
              this.serverFqdn.equals(other.getServerFqdn()))) &&
            ((this.serverFqdnPortNumber==null && other.getServerFqdnPortNumber()==null) || 
             (this.serverFqdnPortNumber!=null &&
              this.serverFqdnPortNumber.equals(other.getServerFqdnPortNumber()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes())));
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
        if (getIpSignalingPeerGroupId() != null) {
            _hashCode += getIpSignalingPeerGroupId().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getServiceStatus() != null) {
            _hashCode += getServiceStatus().hashCode();
        }
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getPortNumber() != null) {
            _hashCode += getPortNumber().hashCode();
        }
        if (getServerFqdn() != null) {
            _hashCode += getServerFqdn().hashCode();
        }
        if (getServerFqdnPortNumber() != null) {
            _hashCode += getServerFqdnPortNumber().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpSignalingPeerGroupData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpSignalingPeerGroupData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSignalingPeerGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSignalingPeerGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverFqdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverFqdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverFqdnPortNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverFqdnPortNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
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
