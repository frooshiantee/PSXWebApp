/**
 * HsxSCscf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxSCscf  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sCscfId;

    private java.lang.String sCscfName;

    private java.lang.String originHost;

    private java.lang.String originRealm;

    public HsxSCscf() {
    }

    public HsxSCscf(
           java.lang.String sCscfId,
           java.lang.String sCscfName,
           java.lang.String originHost,
           java.lang.String originRealm) {
        this.sCscfId = sCscfId;
        this.sCscfName = sCscfName;
        this.originHost = originHost;
        this.originRealm = originRealm;
    }


    /**
     * Gets the sCscfId value for this HsxSCscf.
     * 
     * @return sCscfId
     */
    public java.lang.String getSCscfId() {
        return sCscfId;
    }


    /**
     * Sets the sCscfId value for this HsxSCscf.
     * 
     * @param sCscfId
     */
    public void setSCscfId(java.lang.String sCscfId) {
        this.sCscfId = sCscfId;
    }


    /**
     * Gets the sCscfName value for this HsxSCscf.
     * 
     * @return sCscfName
     */
    public java.lang.String getSCscfName() {
        return sCscfName;
    }


    /**
     * Sets the sCscfName value for this HsxSCscf.
     * 
     * @param sCscfName
     */
    public void setSCscfName(java.lang.String sCscfName) {
        this.sCscfName = sCscfName;
    }


    /**
     * Gets the originHost value for this HsxSCscf.
     * 
     * @return originHost
     */
    public java.lang.String getOriginHost() {
        return originHost;
    }


    /**
     * Sets the originHost value for this HsxSCscf.
     * 
     * @param originHost
     */
    public void setOriginHost(java.lang.String originHost) {
        this.originHost = originHost;
    }


    /**
     * Gets the originRealm value for this HsxSCscf.
     * 
     * @return originRealm
     */
    public java.lang.String getOriginRealm() {
        return originRealm;
    }


    /**
     * Sets the originRealm value for this HsxSCscf.
     * 
     * @param originRealm
     */
    public void setOriginRealm(java.lang.String originRealm) {
        this.originRealm = originRealm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxSCscf)) return false;
        HsxSCscf other = (HsxSCscf) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sCscfId==null && other.getSCscfId()==null) || 
             (this.sCscfId!=null &&
              this.sCscfId.equals(other.getSCscfId()))) &&
            ((this.sCscfName==null && other.getSCscfName()==null) || 
             (this.sCscfName!=null &&
              this.sCscfName.equals(other.getSCscfName()))) &&
            ((this.originHost==null && other.getOriginHost()==null) || 
             (this.originHost!=null &&
              this.originHost.equals(other.getOriginHost()))) &&
            ((this.originRealm==null && other.getOriginRealm()==null) || 
             (this.originRealm!=null &&
              this.originRealm.equals(other.getOriginRealm())));
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
        if (getSCscfId() != null) {
            _hashCode += getSCscfId().hashCode();
        }
        if (getSCscfName() != null) {
            _hashCode += getSCscfName().hashCode();
        }
        if (getOriginHost() != null) {
            _hashCode += getOriginHost().hashCode();
        }
        if (getOriginRealm() != null) {
            _hashCode += getOriginRealm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxSCscf.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxSCscf"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCscfId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sCscfId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCscfName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sCscfName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originHost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originRealm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originRealm"));
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
