/**
 * CpcScreening.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CpcScreening  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String cpcScreeningId;
    private java.lang.String cpcValue;
    private java.lang.String scriptId;

    public CpcScreening() {
    }

    public CpcScreening(
           java.lang.String cpcScreeningId,
           java.lang.String cpcValue,
           java.lang.String scriptId) {
           this.cpcScreeningId = cpcScreeningId;
           this.cpcValue = cpcValue;
           this.scriptId = scriptId;
    }


    /**
     * Gets the cpcScreeningId value for this CpcScreening.
     * 
     * @return cpcScreeningId
     */
    public java.lang.String getCpcScreeningId() {
        return cpcScreeningId;
    }


    /**
     * Sets the cpcScreeningId value for this CpcScreening.
     * 
     * @param cpcScreeningId
     */
    public void setCpcScreeningId(java.lang.String cpcScreeningId) {
        this.cpcScreeningId = cpcScreeningId;
    }


    /**
     * Gets the cpcValue value for this CpcScreening.
     * 
     * @return cpcValue
     */
    public java.lang.String getCpcValue() {
        return cpcValue;
    }


    /**
     * Sets the cpcValue value for this CpcScreening.
     * 
     * @param cpcValue
     */
    public void setCpcValue(java.lang.String cpcValue) {
        this.cpcValue = cpcValue;
    }


    /**
     * Gets the scriptId value for this CpcScreening.
     * 
     * @return scriptId
     */
    public java.lang.String getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this CpcScreening.
     * 
     * @param scriptId
     */
    public void setScriptId(java.lang.String scriptId) {
        this.scriptId = scriptId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpcScreening)) return false;
        CpcScreening other = (CpcScreening) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cpcScreeningId==null && other.getCpcScreeningId()==null) || 
             (this.cpcScreeningId!=null &&
              this.cpcScreeningId.equals(other.getCpcScreeningId()))) &&
            ((this.cpcValue==null && other.getCpcValue()==null) || 
             (this.cpcValue!=null &&
              this.cpcValue.equals(other.getCpcValue()))) &&
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              this.scriptId.equals(other.getScriptId())));
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
        if (getCpcScreeningId() != null) {
            _hashCode += getCpcScreeningId().hashCode();
        }
        if (getCpcValue() != null) {
            _hashCode += getCpcValue().hashCode();
        }
        if (getScriptId() != null) {
            _hashCode += getScriptId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpcScreening.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcScreening"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpcScreeningId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpcScreeningId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpcValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpcValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scriptId"));
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
