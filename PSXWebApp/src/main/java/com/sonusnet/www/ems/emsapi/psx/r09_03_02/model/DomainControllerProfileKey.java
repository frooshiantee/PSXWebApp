/**
 * DomainControllerProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class DomainControllerProfileKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String adProfileId;

    private java.lang.String domainControllerProfileId;

    public DomainControllerProfileKey() {
    }

    public DomainControllerProfileKey(
           java.lang.String adProfileId,
           java.lang.String domainControllerProfileId) {
        this.adProfileId = adProfileId;
        this.domainControllerProfileId = domainControllerProfileId;
    }


    /**
     * Gets the adProfileId value for this DomainControllerProfileKey.
     * 
     * @return adProfileId
     */
    public java.lang.String getAdProfileId() {
        return adProfileId;
    }


    /**
     * Sets the adProfileId value for this DomainControllerProfileKey.
     * 
     * @param adProfileId
     */
    public void setAdProfileId(java.lang.String adProfileId) {
        this.adProfileId = adProfileId;
    }


    /**
     * Gets the domainControllerProfileId value for this DomainControllerProfileKey.
     * 
     * @return domainControllerProfileId
     */
    public java.lang.String getDomainControllerProfileId() {
        return domainControllerProfileId;
    }


    /**
     * Sets the domainControllerProfileId value for this DomainControllerProfileKey.
     * 
     * @param domainControllerProfileId
     */
    public void setDomainControllerProfileId(java.lang.String domainControllerProfileId) {
        this.domainControllerProfileId = domainControllerProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomainControllerProfileKey)) return false;
        DomainControllerProfileKey other = (DomainControllerProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adProfileId==null && other.getAdProfileId()==null) || 
             (this.adProfileId!=null &&
              this.adProfileId.equals(other.getAdProfileId()))) &&
            ((this.domainControllerProfileId==null && other.getDomainControllerProfileId()==null) || 
             (this.domainControllerProfileId!=null &&
              this.domainControllerProfileId.equals(other.getDomainControllerProfileId())));
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
        if (getAdProfileId() != null) {
            _hashCode += getAdProfileId().hashCode();
        }
        if (getDomainControllerProfileId() != null) {
            _hashCode += getDomainControllerProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainControllerProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DomainControllerProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainControllerProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainControllerProfileId"));
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
