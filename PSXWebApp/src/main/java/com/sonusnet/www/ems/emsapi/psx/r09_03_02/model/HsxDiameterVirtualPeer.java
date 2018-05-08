/**
 * HsxDiameterVirtualPeer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxDiameterVirtualPeer  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String virtualProcessName;

    private java.lang.String virtualPeerName;

    private java.lang.Integer peerMode;

    public HsxDiameterVirtualPeer() {
    }

    public HsxDiameterVirtualPeer(
           java.lang.String virtualProcessName,
           java.lang.String virtualPeerName,
           java.lang.Integer peerMode) {
        this.virtualProcessName = virtualProcessName;
        this.virtualPeerName = virtualPeerName;
        this.peerMode = peerMode;
    }


    /**
     * Gets the virtualProcessName value for this HsxDiameterVirtualPeer.
     * 
     * @return virtualProcessName
     */
    public java.lang.String getVirtualProcessName() {
        return virtualProcessName;
    }


    /**
     * Sets the virtualProcessName value for this HsxDiameterVirtualPeer.
     * 
     * @param virtualProcessName
     */
    public void setVirtualProcessName(java.lang.String virtualProcessName) {
        this.virtualProcessName = virtualProcessName;
    }


    /**
     * Gets the virtualPeerName value for this HsxDiameterVirtualPeer.
     * 
     * @return virtualPeerName
     */
    public java.lang.String getVirtualPeerName() {
        return virtualPeerName;
    }


    /**
     * Sets the virtualPeerName value for this HsxDiameterVirtualPeer.
     * 
     * @param virtualPeerName
     */
    public void setVirtualPeerName(java.lang.String virtualPeerName) {
        this.virtualPeerName = virtualPeerName;
    }


    /**
     * Gets the peerMode value for this HsxDiameterVirtualPeer.
     * 
     * @return peerMode
     */
    public java.lang.Integer getPeerMode() {
        return peerMode;
    }


    /**
     * Sets the peerMode value for this HsxDiameterVirtualPeer.
     * 
     * @param peerMode
     */
    public void setPeerMode(java.lang.Integer peerMode) {
        this.peerMode = peerMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxDiameterVirtualPeer)) return false;
        HsxDiameterVirtualPeer other = (HsxDiameterVirtualPeer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.virtualProcessName==null && other.getVirtualProcessName()==null) || 
             (this.virtualProcessName!=null &&
              this.virtualProcessName.equals(other.getVirtualProcessName()))) &&
            ((this.virtualPeerName==null && other.getVirtualPeerName()==null) || 
             (this.virtualPeerName!=null &&
              this.virtualPeerName.equals(other.getVirtualPeerName()))) &&
            ((this.peerMode==null && other.getPeerMode()==null) || 
             (this.peerMode!=null &&
              this.peerMode.equals(other.getPeerMode())));
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
        if (getVirtualProcessName() != null) {
            _hashCode += getVirtualProcessName().hashCode();
        }
        if (getVirtualPeerName() != null) {
            _hashCode += getVirtualPeerName().hashCode();
        }
        if (getPeerMode() != null) {
            _hashCode += getPeerMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxDiameterVirtualPeer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxDiameterVirtualPeer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualProcessName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "virtualProcessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualPeerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "virtualPeerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peerMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peerMode"));
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
