/**
 * HsxInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxInstance  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String hssId;

    private java.lang.String fqdn;

    private java.lang.Integer fqdnPort;

    private java.lang.Integer isActive;

    private java.lang.Integer hssInstanceAttributes;

    private java.lang.String peerId;

    private java.lang.Integer isSlf;

    public HsxInstance() {
    }

    public HsxInstance(
           java.lang.String hssId,
           java.lang.String fqdn,
           java.lang.Integer fqdnPort,
           java.lang.Integer isActive,
           java.lang.Integer hssInstanceAttributes,
           java.lang.String peerId,
           java.lang.Integer isSlf) {
        this.hssId = hssId;
        this.fqdn = fqdn;
        this.fqdnPort = fqdnPort;
        this.isActive = isActive;
        this.hssInstanceAttributes = hssInstanceAttributes;
        this.peerId = peerId;
        this.isSlf = isSlf;
    }


    /**
     * Gets the hssId value for this HsxInstance.
     * 
     * @return hssId
     */
    public java.lang.String getHssId() {
        return hssId;
    }


    /**
     * Sets the hssId value for this HsxInstance.
     * 
     * @param hssId
     */
    public void setHssId(java.lang.String hssId) {
        this.hssId = hssId;
    }


    /**
     * Gets the fqdn value for this HsxInstance.
     * 
     * @return fqdn
     */
    public java.lang.String getFqdn() {
        return fqdn;
    }


    /**
     * Sets the fqdn value for this HsxInstance.
     * 
     * @param fqdn
     */
    public void setFqdn(java.lang.String fqdn) {
        this.fqdn = fqdn;
    }


    /**
     * Gets the fqdnPort value for this HsxInstance.
     * 
     * @return fqdnPort
     */
    public java.lang.Integer getFqdnPort() {
        return fqdnPort;
    }


    /**
     * Sets the fqdnPort value for this HsxInstance.
     * 
     * @param fqdnPort
     */
    public void setFqdnPort(java.lang.Integer fqdnPort) {
        this.fqdnPort = fqdnPort;
    }


    /**
     * Gets the isActive value for this HsxInstance.
     * 
     * @return isActive
     */
    public java.lang.Integer getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this HsxInstance.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Integer isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the hssInstanceAttributes value for this HsxInstance.
     * 
     * @return hssInstanceAttributes
     */
    public java.lang.Integer getHssInstanceAttributes() {
        return hssInstanceAttributes;
    }


    /**
     * Sets the hssInstanceAttributes value for this HsxInstance.
     * 
     * @param hssInstanceAttributes
     */
    public void setHssInstanceAttributes(java.lang.Integer hssInstanceAttributes) {
        this.hssInstanceAttributes = hssInstanceAttributes;
    }


    /**
     * Gets the peerId value for this HsxInstance.
     * 
     * @return peerId
     */
    public java.lang.String getPeerId() {
        return peerId;
    }


    /**
     * Sets the peerId value for this HsxInstance.
     * 
     * @param peerId
     */
    public void setPeerId(java.lang.String peerId) {
        this.peerId = peerId;
    }


    /**
     * Gets the isSlf value for this HsxInstance.
     * 
     * @return isSlf
     */
    public java.lang.Integer getIsSlf() {
        return isSlf;
    }


    /**
     * Sets the isSlf value for this HsxInstance.
     * 
     * @param isSlf
     */
    public void setIsSlf(java.lang.Integer isSlf) {
        this.isSlf = isSlf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxInstance)) return false;
        HsxInstance other = (HsxInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hssId==null && other.getHssId()==null) || 
             (this.hssId!=null &&
              this.hssId.equals(other.getHssId()))) &&
            ((this.fqdn==null && other.getFqdn()==null) || 
             (this.fqdn!=null &&
              this.fqdn.equals(other.getFqdn()))) &&
            ((this.fqdnPort==null && other.getFqdnPort()==null) || 
             (this.fqdnPort!=null &&
              this.fqdnPort.equals(other.getFqdnPort()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.hssInstanceAttributes==null && other.getHssInstanceAttributes()==null) || 
             (this.hssInstanceAttributes!=null &&
              this.hssInstanceAttributes.equals(other.getHssInstanceAttributes()))) &&
            ((this.peerId==null && other.getPeerId()==null) || 
             (this.peerId!=null &&
              this.peerId.equals(other.getPeerId()))) &&
            ((this.isSlf==null && other.getIsSlf()==null) || 
             (this.isSlf!=null &&
              this.isSlf.equals(other.getIsSlf())));
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
        if (getHssId() != null) {
            _hashCode += getHssId().hashCode();
        }
        if (getFqdn() != null) {
            _hashCode += getFqdn().hashCode();
        }
        if (getFqdnPort() != null) {
            _hashCode += getFqdnPort().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getHssInstanceAttributes() != null) {
            _hashCode += getHssInstanceAttributes().hashCode();
        }
        if (getPeerId() != null) {
            _hashCode += getPeerId().hashCode();
        }
        if (getIsSlf() != null) {
            _hashCode += getIsSlf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hssId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hssId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fqdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fqdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fqdnPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fqdnPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hssInstanceAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hssInstanceAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSlf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isSlf"));
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
