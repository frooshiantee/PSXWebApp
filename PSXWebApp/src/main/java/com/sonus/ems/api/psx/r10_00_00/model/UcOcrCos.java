/**
 * UcOcrCos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class UcOcrCos  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String ocrProfileId;
    private java.lang.Integer enterpriseId;
    private java.lang.String description;
    private java.lang.String ocrValue;
    private java.lang.String ocrDescription;
    private java.lang.String ocrCosId;

    public UcOcrCos() {
    }

    public UcOcrCos(
           java.lang.String ocrProfileId,
           java.lang.Integer enterpriseId,
           java.lang.String description,
           java.lang.String ocrValue,
           java.lang.String ocrDescription,
           java.lang.String ocrCosId) {
           this.ocrProfileId = ocrProfileId;
           this.enterpriseId = enterpriseId;
           this.description = description;
           this.ocrValue = ocrValue;
           this.ocrDescription = ocrDescription;
           this.ocrCosId = ocrCosId;
    }


    /**
     * Gets the ocrProfileId value for this UcOcrCos.
     * 
     * @return ocrProfileId
     */
    public java.lang.String getOcrProfileId() {
        return ocrProfileId;
    }


    /**
     * Sets the ocrProfileId value for this UcOcrCos.
     * 
     * @param ocrProfileId
     */
    public void setOcrProfileId(java.lang.String ocrProfileId) {
        this.ocrProfileId = ocrProfileId;
    }


    /**
     * Gets the enterpriseId value for this UcOcrCos.
     * 
     * @return enterpriseId
     */
    public java.lang.Integer getEnterpriseId() {
        return enterpriseId;
    }


    /**
     * Sets the enterpriseId value for this UcOcrCos.
     * 
     * @param enterpriseId
     */
    public void setEnterpriseId(java.lang.Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }


    /**
     * Gets the description value for this UcOcrCos.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UcOcrCos.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the ocrValue value for this UcOcrCos.
     * 
     * @return ocrValue
     */
    public java.lang.String getOcrValue() {
        return ocrValue;
    }


    /**
     * Sets the ocrValue value for this UcOcrCos.
     * 
     * @param ocrValue
     */
    public void setOcrValue(java.lang.String ocrValue) {
        this.ocrValue = ocrValue;
    }


    /**
     * Gets the ocrDescription value for this UcOcrCos.
     * 
     * @return ocrDescription
     */
    public java.lang.String getOcrDescription() {
        return ocrDescription;
    }


    /**
     * Sets the ocrDescription value for this UcOcrCos.
     * 
     * @param ocrDescription
     */
    public void setOcrDescription(java.lang.String ocrDescription) {
        this.ocrDescription = ocrDescription;
    }


    /**
     * Gets the ocrCosId value for this UcOcrCos.
     * 
     * @return ocrCosId
     */
    public java.lang.String getOcrCosId() {
        return ocrCosId;
    }


    /**
     * Sets the ocrCosId value for this UcOcrCos.
     * 
     * @param ocrCosId
     */
    public void setOcrCosId(java.lang.String ocrCosId) {
        this.ocrCosId = ocrCosId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UcOcrCos)) return false;
        UcOcrCos other = (UcOcrCos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ocrProfileId==null && other.getOcrProfileId()==null) || 
             (this.ocrProfileId!=null &&
              this.ocrProfileId.equals(other.getOcrProfileId()))) &&
            ((this.enterpriseId==null && other.getEnterpriseId()==null) || 
             (this.enterpriseId!=null &&
              this.enterpriseId.equals(other.getEnterpriseId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.ocrValue==null && other.getOcrValue()==null) || 
             (this.ocrValue!=null &&
              this.ocrValue.equals(other.getOcrValue()))) &&
            ((this.ocrDescription==null && other.getOcrDescription()==null) || 
             (this.ocrDescription!=null &&
              this.ocrDescription.equals(other.getOcrDescription()))) &&
            ((this.ocrCosId==null && other.getOcrCosId()==null) || 
             (this.ocrCosId!=null &&
              this.ocrCosId.equals(other.getOcrCosId())));
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
        if (getOcrProfileId() != null) {
            _hashCode += getOcrProfileId().hashCode();
        }
        if (getEnterpriseId() != null) {
            _hashCode += getEnterpriseId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOcrValue() != null) {
            _hashCode += getOcrValue().hashCode();
        }
        if (getOcrDescription() != null) {
            _hashCode += getOcrDescription().hashCode();
        }
        if (getOcrCosId() != null) {
            _hashCode += getOcrCosId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UcOcrCos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "UcOcrCos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocrProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocrProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enterpriseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enterpriseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocrValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocrValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocrDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocrDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocrCosId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocrCosId"));
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
