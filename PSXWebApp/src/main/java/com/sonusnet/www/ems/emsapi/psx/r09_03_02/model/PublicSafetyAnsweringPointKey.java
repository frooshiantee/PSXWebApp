/**
 * PublicSafetyAnsweringPointKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class PublicSafetyAnsweringPointKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String agsN;

    private java.lang.String gf;

    public PublicSafetyAnsweringPointKey() {
    }

    public PublicSafetyAnsweringPointKey(
           java.lang.String agsN,
           java.lang.String gf) {
        this.agsN = agsN;
        this.gf = gf;
    }


    /**
     * Gets the agsN value for this PublicSafetyAnsweringPointKey.
     * 
     * @return agsN
     */
    public java.lang.String getAgsN() {
        return agsN;
    }


    /**
     * Sets the agsN value for this PublicSafetyAnsweringPointKey.
     * 
     * @param agsN
     */
    public void setAgsN(java.lang.String agsN) {
        this.agsN = agsN;
    }


    /**
     * Gets the gf value for this PublicSafetyAnsweringPointKey.
     * 
     * @return gf
     */
    public java.lang.String getGf() {
        return gf;
    }


    /**
     * Sets the gf value for this PublicSafetyAnsweringPointKey.
     * 
     * @param gf
     */
    public void setGf(java.lang.String gf) {
        this.gf = gf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublicSafetyAnsweringPointKey)) return false;
        PublicSafetyAnsweringPointKey other = (PublicSafetyAnsweringPointKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.agsN==null && other.getAgsN()==null) || 
             (this.agsN!=null &&
              this.agsN.equals(other.getAgsN()))) &&
            ((this.gf==null && other.getGf()==null) || 
             (this.gf!=null &&
              this.gf.equals(other.getGf())));
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
        if (getAgsN() != null) {
            _hashCode += getAgsN().hashCode();
        }
        if (getGf() != null) {
            _hashCode += getGf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublicSafetyAnsweringPointKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PublicSafetyAnsweringPointKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agsN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agsN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gf"));
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
