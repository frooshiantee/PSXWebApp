/**
 * HsxDiameterPeer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxDiameterPeer  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String processName;
    private java.lang.String peerName;
    private java.lang.String ipAddressTcpportSctpport;
    private java.lang.String virtualPeer;
    private java.lang.Integer peerProtocol;
    private java.lang.Integer peerPriority;

    public HsxDiameterPeer() {
    }

    public HsxDiameterPeer(
           java.lang.String processName,
           java.lang.String peerName,
           java.lang.String ipAddressTcpportSctpport,
           java.lang.String virtualPeer,
           java.lang.Integer peerProtocol,
           java.lang.Integer peerPriority) {
           this.processName = processName;
           this.peerName = peerName;
           this.ipAddressTcpportSctpport = ipAddressTcpportSctpport;
           this.virtualPeer = virtualPeer;
           this.peerProtocol = peerProtocol;
           this.peerPriority = peerPriority;
    }


    /**
     * Gets the processName value for this HsxDiameterPeer.
     * 
     * @return processName
     */
    public java.lang.String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this HsxDiameterPeer.
     * 
     * @param processName
     */
    public void setProcessName(java.lang.String processName) {
        this.processName = processName;
    }


    /**
     * Gets the peerName value for this HsxDiameterPeer.
     * 
     * @return peerName
     */
    public java.lang.String getPeerName() {
        return peerName;
    }


    /**
     * Sets the peerName value for this HsxDiameterPeer.
     * 
     * @param peerName
     */
    public void setPeerName(java.lang.String peerName) {
        this.peerName = peerName;
    }


    /**
     * Gets the ipAddressTcpportSctpport value for this HsxDiameterPeer.
     * 
     * @return ipAddressTcpportSctpport
     */
    public java.lang.String getIpAddressTcpportSctpport() {
        return ipAddressTcpportSctpport;
    }


    /**
     * Sets the ipAddressTcpportSctpport value for this HsxDiameterPeer.
     * 
     * @param ipAddressTcpportSctpport
     */
    public void setIpAddressTcpportSctpport(java.lang.String ipAddressTcpportSctpport) {
        this.ipAddressTcpportSctpport = ipAddressTcpportSctpport;
    }


    /**
     * Gets the virtualPeer value for this HsxDiameterPeer.
     * 
     * @return virtualPeer
     */
    public java.lang.String getVirtualPeer() {
        return virtualPeer;
    }


    /**
     * Sets the virtualPeer value for this HsxDiameterPeer.
     * 
     * @param virtualPeer
     */
    public void setVirtualPeer(java.lang.String virtualPeer) {
        this.virtualPeer = virtualPeer;
    }


    /**
     * Gets the peerProtocol value for this HsxDiameterPeer.
     * 
     * @return peerProtocol
     */
    public java.lang.Integer getPeerProtocol() {
        return peerProtocol;
    }


    /**
     * Sets the peerProtocol value for this HsxDiameterPeer.
     * 
     * @param peerProtocol
     */
    public void setPeerProtocol(java.lang.Integer peerProtocol) {
        this.peerProtocol = peerProtocol;
    }


    /**
     * Gets the peerPriority value for this HsxDiameterPeer.
     * 
     * @return peerPriority
     */
    public java.lang.Integer getPeerPriority() {
        return peerPriority;
    }


    /**
     * Sets the peerPriority value for this HsxDiameterPeer.
     * 
     * @param peerPriority
     */
    public void setPeerPriority(java.lang.Integer peerPriority) {
        this.peerPriority = peerPriority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxDiameterPeer)) return false;
        HsxDiameterPeer other = (HsxDiameterPeer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.processName==null && other.getProcessName()==null) || 
             (this.processName!=null &&
              this.processName.equals(other.getProcessName()))) &&
            ((this.peerName==null && other.getPeerName()==null) || 
             (this.peerName!=null &&
              this.peerName.equals(other.getPeerName()))) &&
            ((this.ipAddressTcpportSctpport==null && other.getIpAddressTcpportSctpport()==null) || 
             (this.ipAddressTcpportSctpport!=null &&
              this.ipAddressTcpportSctpport.equals(other.getIpAddressTcpportSctpport()))) &&
            ((this.virtualPeer==null && other.getVirtualPeer()==null) || 
             (this.virtualPeer!=null &&
              this.virtualPeer.equals(other.getVirtualPeer()))) &&
            ((this.peerProtocol==null && other.getPeerProtocol()==null) || 
             (this.peerProtocol!=null &&
              this.peerProtocol.equals(other.getPeerProtocol()))) &&
            ((this.peerPriority==null && other.getPeerPriority()==null) || 
             (this.peerPriority!=null &&
              this.peerPriority.equals(other.getPeerPriority())));
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
        if (getProcessName() != null) {
            _hashCode += getProcessName().hashCode();
        }
        if (getPeerName() != null) {
            _hashCode += getPeerName().hashCode();
        }
        if (getIpAddressTcpportSctpport() != null) {
            _hashCode += getIpAddressTcpportSctpport().hashCode();
        }
        if (getVirtualPeer() != null) {
            _hashCode += getVirtualPeer().hashCode();
        }
        if (getPeerProtocol() != null) {
            _hashCode += getPeerProtocol().hashCode();
        }
        if (getPeerPriority() != null) {
            _hashCode += getPeerPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxDiameterPeer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxDiameterPeer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddressTcpportSctpport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipAddressTcpportSctpport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualPeer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "virtualPeer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peerProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peerProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peerPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peerPriority"));
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
