/**
 * ChargeIndex.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ChargeIndex  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String chargeIndex;

    private java.lang.String amaCalltype;

    private java.lang.String mbi;

    public ChargeIndex() {
    }

    public ChargeIndex(
           java.lang.String chargeIndex,
           java.lang.String amaCalltype,
           java.lang.String mbi) {
        this.chargeIndex = chargeIndex;
        this.amaCalltype = amaCalltype;
        this.mbi = mbi;
    }


    /**
     * Gets the chargeIndex value for this ChargeIndex.
     * 
     * @return chargeIndex
     */
    public java.lang.String getChargeIndex() {
        return chargeIndex;
    }


    /**
     * Sets the chargeIndex value for this ChargeIndex.
     * 
     * @param chargeIndex
     */
    public void setChargeIndex(java.lang.String chargeIndex) {
        this.chargeIndex = chargeIndex;
    }


    /**
     * Gets the amaCalltype value for this ChargeIndex.
     * 
     * @return amaCalltype
     */
    public java.lang.String getAmaCalltype() {
        return amaCalltype;
    }


    /**
     * Sets the amaCalltype value for this ChargeIndex.
     * 
     * @param amaCalltype
     */
    public void setAmaCalltype(java.lang.String amaCalltype) {
        this.amaCalltype = amaCalltype;
    }


    /**
     * Gets the mbi value for this ChargeIndex.
     * 
     * @return mbi
     */
    public java.lang.String getMbi() {
        return mbi;
    }


    /**
     * Sets the mbi value for this ChargeIndex.
     * 
     * @param mbi
     */
    public void setMbi(java.lang.String mbi) {
        this.mbi = mbi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeIndex)) return false;
        ChargeIndex other = (ChargeIndex) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.chargeIndex==null && other.getChargeIndex()==null) || 
             (this.chargeIndex!=null &&
              this.chargeIndex.equals(other.getChargeIndex()))) &&
            ((this.amaCalltype==null && other.getAmaCalltype()==null) || 
             (this.amaCalltype!=null &&
              this.amaCalltype.equals(other.getAmaCalltype()))) &&
            ((this.mbi==null && other.getMbi()==null) || 
             (this.mbi!=null &&
              this.mbi.equals(other.getMbi())));
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
        if (getChargeIndex() != null) {
            _hashCode += getChargeIndex().hashCode();
        }
        if (getAmaCalltype() != null) {
            _hashCode += getAmaCalltype().hashCode();
        }
        if (getMbi() != null) {
            _hashCode += getMbi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeIndex.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeIndex"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amaCalltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amaCalltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mbi"));
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
