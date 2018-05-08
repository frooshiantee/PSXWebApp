/**
 * TranslationNumberKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class TranslationNumberKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String translationLabelId;

    private java.lang.Short numberSequence;

    public TranslationNumberKey() {
    }

    public TranslationNumberKey(
           java.lang.String translationLabelId,
           java.lang.Short numberSequence) {
        this.translationLabelId = translationLabelId;
        this.numberSequence = numberSequence;
    }


    /**
     * Gets the translationLabelId value for this TranslationNumberKey.
     * 
     * @return translationLabelId
     */
    public java.lang.String getTranslationLabelId() {
        return translationLabelId;
    }


    /**
     * Sets the translationLabelId value for this TranslationNumberKey.
     * 
     * @param translationLabelId
     */
    public void setTranslationLabelId(java.lang.String translationLabelId) {
        this.translationLabelId = translationLabelId;
    }


    /**
     * Gets the numberSequence value for this TranslationNumberKey.
     * 
     * @return numberSequence
     */
    public java.lang.Short getNumberSequence() {
        return numberSequence;
    }


    /**
     * Sets the numberSequence value for this TranslationNumberKey.
     * 
     * @param numberSequence
     */
    public void setNumberSequence(java.lang.Short numberSequence) {
        this.numberSequence = numberSequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TranslationNumberKey)) return false;
        TranslationNumberKey other = (TranslationNumberKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.translationLabelId==null && other.getTranslationLabelId()==null) || 
             (this.translationLabelId!=null &&
              this.translationLabelId.equals(other.getTranslationLabelId()))) &&
            ((this.numberSequence==null && other.getNumberSequence()==null) || 
             (this.numberSequence!=null &&
              this.numberSequence.equals(other.getNumberSequence())));
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
        if (getTranslationLabelId() != null) {
            _hashCode += getTranslationLabelId().hashCode();
        }
        if (getNumberSequence() != null) {
            _hashCode += getNumberSequence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TranslationNumberKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TranslationNumberKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translationLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
