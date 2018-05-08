/**
 * TranslationLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class TranslationLabel  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String translationLabelId;
    private java.lang.String scriptId;
    private java.lang.Short useScriptFlag;

    public TranslationLabel() {
    }

    public TranslationLabel(
           java.lang.String translationLabelId,
           java.lang.String scriptId,
           java.lang.Short useScriptFlag) {
           this.translationLabelId = translationLabelId;
           this.scriptId = scriptId;
           this.useScriptFlag = useScriptFlag;
    }


    /**
     * Gets the translationLabelId value for this TranslationLabel.
     * 
     * @return translationLabelId
     */
    public java.lang.String getTranslationLabelId() {
        return translationLabelId;
    }


    /**
     * Sets the translationLabelId value for this TranslationLabel.
     * 
     * @param translationLabelId
     */
    public void setTranslationLabelId(java.lang.String translationLabelId) {
        this.translationLabelId = translationLabelId;
    }


    /**
     * Gets the scriptId value for this TranslationLabel.
     * 
     * @return scriptId
     */
    public java.lang.String getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this TranslationLabel.
     * 
     * @param scriptId
     */
    public void setScriptId(java.lang.String scriptId) {
        this.scriptId = scriptId;
    }


    /**
     * Gets the useScriptFlag value for this TranslationLabel.
     * 
     * @return useScriptFlag
     */
    public java.lang.Short getUseScriptFlag() {
        return useScriptFlag;
    }


    /**
     * Sets the useScriptFlag value for this TranslationLabel.
     * 
     * @param useScriptFlag
     */
    public void setUseScriptFlag(java.lang.Short useScriptFlag) {
        this.useScriptFlag = useScriptFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TranslationLabel)) return false;
        TranslationLabel other = (TranslationLabel) obj;
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
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              this.scriptId.equals(other.getScriptId()))) &&
            ((this.useScriptFlag==null && other.getUseScriptFlag()==null) || 
             (this.useScriptFlag!=null &&
              this.useScriptFlag.equals(other.getUseScriptFlag())));
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
        if (getScriptId() != null) {
            _hashCode += getScriptId().hashCode();
        }
        if (getUseScriptFlag() != null) {
            _hashCode += getUseScriptFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TranslationLabel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TranslationLabel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translationLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useScriptFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useScriptFlag"));
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
