/**
 * HsxAuthenticationProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxAuthenticationProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String authenticationProfileId;
    private java.lang.Long akaOp;
    private java.lang.Integer akaAmf;
    private java.lang.Integer akaSqnIndSize;

    public HsxAuthenticationProfile() {
    }

    public HsxAuthenticationProfile(
           java.lang.String authenticationProfileId,
           java.lang.Long akaOp,
           java.lang.Integer akaAmf,
           java.lang.Integer akaSqnIndSize) {
           this.authenticationProfileId = authenticationProfileId;
           this.akaOp = akaOp;
           this.akaAmf = akaAmf;
           this.akaSqnIndSize = akaSqnIndSize;
    }


    /**
     * Gets the authenticationProfileId value for this HsxAuthenticationProfile.
     * 
     * @return authenticationProfileId
     */
    public java.lang.String getAuthenticationProfileId() {
        return authenticationProfileId;
    }


    /**
     * Sets the authenticationProfileId value for this HsxAuthenticationProfile.
     * 
     * @param authenticationProfileId
     */
    public void setAuthenticationProfileId(java.lang.String authenticationProfileId) {
        this.authenticationProfileId = authenticationProfileId;
    }


    /**
     * Gets the akaOp value for this HsxAuthenticationProfile.
     * 
     * @return akaOp
     */
    public java.lang.Long getAkaOp() {
        return akaOp;
    }


    /**
     * Sets the akaOp value for this HsxAuthenticationProfile.
     * 
     * @param akaOp
     */
    public void setAkaOp(java.lang.Long akaOp) {
        this.akaOp = akaOp;
    }


    /**
     * Gets the akaAmf value for this HsxAuthenticationProfile.
     * 
     * @return akaAmf
     */
    public java.lang.Integer getAkaAmf() {
        return akaAmf;
    }


    /**
     * Sets the akaAmf value for this HsxAuthenticationProfile.
     * 
     * @param akaAmf
     */
    public void setAkaAmf(java.lang.Integer akaAmf) {
        this.akaAmf = akaAmf;
    }


    /**
     * Gets the akaSqnIndSize value for this HsxAuthenticationProfile.
     * 
     * @return akaSqnIndSize
     */
    public java.lang.Integer getAkaSqnIndSize() {
        return akaSqnIndSize;
    }


    /**
     * Sets the akaSqnIndSize value for this HsxAuthenticationProfile.
     * 
     * @param akaSqnIndSize
     */
    public void setAkaSqnIndSize(java.lang.Integer akaSqnIndSize) {
        this.akaSqnIndSize = akaSqnIndSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxAuthenticationProfile)) return false;
        HsxAuthenticationProfile other = (HsxAuthenticationProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authenticationProfileId==null && other.getAuthenticationProfileId()==null) || 
             (this.authenticationProfileId!=null &&
              this.authenticationProfileId.equals(other.getAuthenticationProfileId()))) &&
            ((this.akaOp==null && other.getAkaOp()==null) || 
             (this.akaOp!=null &&
              this.akaOp.equals(other.getAkaOp()))) &&
            ((this.akaAmf==null && other.getAkaAmf()==null) || 
             (this.akaAmf!=null &&
              this.akaAmf.equals(other.getAkaAmf()))) &&
            ((this.akaSqnIndSize==null && other.getAkaSqnIndSize()==null) || 
             (this.akaSqnIndSize!=null &&
              this.akaSqnIndSize.equals(other.getAkaSqnIndSize())));
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
        if (getAuthenticationProfileId() != null) {
            _hashCode += getAuthenticationProfileId().hashCode();
        }
        if (getAkaOp() != null) {
            _hashCode += getAkaOp().hashCode();
        }
        if (getAkaAmf() != null) {
            _hashCode += getAkaAmf().hashCode();
        }
        if (getAkaSqnIndSize() != null) {
            _hashCode += getAkaSqnIndSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxAuthenticationProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxAuthenticationProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("akaOp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "akaOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("akaAmf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "akaAmf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("akaSqnIndSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "akaSqnIndSize"));
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
