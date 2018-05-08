/**
 * EchoCancelCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class EchoCancelCriteria  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String callingCountryId;

    private java.lang.String callingNationalId;

    private java.lang.String calledCountryId;

    private java.lang.String calledNationalId;

    private java.lang.String calledInCountryId;

    private java.lang.String calledInNationalId;

    private java.lang.Integer elementAttributes;

    public EchoCancelCriteria() {
    }

    public EchoCancelCriteria(
           java.lang.String callingCountryId,
           java.lang.String callingNationalId,
           java.lang.String calledCountryId,
           java.lang.String calledNationalId,
           java.lang.String calledInCountryId,
           java.lang.String calledInNationalId,
           java.lang.Integer elementAttributes) {
        this.callingCountryId = callingCountryId;
        this.callingNationalId = callingNationalId;
        this.calledCountryId = calledCountryId;
        this.calledNationalId = calledNationalId;
        this.calledInCountryId = calledInCountryId;
        this.calledInNationalId = calledInNationalId;
        this.elementAttributes = elementAttributes;
    }


    /**
     * Gets the callingCountryId value for this EchoCancelCriteria.
     * 
     * @return callingCountryId
     */
    public java.lang.String getCallingCountryId() {
        return callingCountryId;
    }


    /**
     * Sets the callingCountryId value for this EchoCancelCriteria.
     * 
     * @param callingCountryId
     */
    public void setCallingCountryId(java.lang.String callingCountryId) {
        this.callingCountryId = callingCountryId;
    }


    /**
     * Gets the callingNationalId value for this EchoCancelCriteria.
     * 
     * @return callingNationalId
     */
    public java.lang.String getCallingNationalId() {
        return callingNationalId;
    }


    /**
     * Sets the callingNationalId value for this EchoCancelCriteria.
     * 
     * @param callingNationalId
     */
    public void setCallingNationalId(java.lang.String callingNationalId) {
        this.callingNationalId = callingNationalId;
    }


    /**
     * Gets the calledCountryId value for this EchoCancelCriteria.
     * 
     * @return calledCountryId
     */
    public java.lang.String getCalledCountryId() {
        return calledCountryId;
    }


    /**
     * Sets the calledCountryId value for this EchoCancelCriteria.
     * 
     * @param calledCountryId
     */
    public void setCalledCountryId(java.lang.String calledCountryId) {
        this.calledCountryId = calledCountryId;
    }


    /**
     * Gets the calledNationalId value for this EchoCancelCriteria.
     * 
     * @return calledNationalId
     */
    public java.lang.String getCalledNationalId() {
        return calledNationalId;
    }


    /**
     * Sets the calledNationalId value for this EchoCancelCriteria.
     * 
     * @param calledNationalId
     */
    public void setCalledNationalId(java.lang.String calledNationalId) {
        this.calledNationalId = calledNationalId;
    }


    /**
     * Gets the calledInCountryId value for this EchoCancelCriteria.
     * 
     * @return calledInCountryId
     */
    public java.lang.String getCalledInCountryId() {
        return calledInCountryId;
    }


    /**
     * Sets the calledInCountryId value for this EchoCancelCriteria.
     * 
     * @param calledInCountryId
     */
    public void setCalledInCountryId(java.lang.String calledInCountryId) {
        this.calledInCountryId = calledInCountryId;
    }


    /**
     * Gets the calledInNationalId value for this EchoCancelCriteria.
     * 
     * @return calledInNationalId
     */
    public java.lang.String getCalledInNationalId() {
        return calledInNationalId;
    }


    /**
     * Sets the calledInNationalId value for this EchoCancelCriteria.
     * 
     * @param calledInNationalId
     */
    public void setCalledInNationalId(java.lang.String calledInNationalId) {
        this.calledInNationalId = calledInNationalId;
    }


    /**
     * Gets the elementAttributes value for this EchoCancelCriteria.
     * 
     * @return elementAttributes
     */
    public java.lang.Integer getElementAttributes() {
        return elementAttributes;
    }


    /**
     * Sets the elementAttributes value for this EchoCancelCriteria.
     * 
     * @param elementAttributes
     */
    public void setElementAttributes(java.lang.Integer elementAttributes) {
        this.elementAttributes = elementAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EchoCancelCriteria)) return false;
        EchoCancelCriteria other = (EchoCancelCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callingCountryId==null && other.getCallingCountryId()==null) || 
             (this.callingCountryId!=null &&
              this.callingCountryId.equals(other.getCallingCountryId()))) &&
            ((this.callingNationalId==null && other.getCallingNationalId()==null) || 
             (this.callingNationalId!=null &&
              this.callingNationalId.equals(other.getCallingNationalId()))) &&
            ((this.calledCountryId==null && other.getCalledCountryId()==null) || 
             (this.calledCountryId!=null &&
              this.calledCountryId.equals(other.getCalledCountryId()))) &&
            ((this.calledNationalId==null && other.getCalledNationalId()==null) || 
             (this.calledNationalId!=null &&
              this.calledNationalId.equals(other.getCalledNationalId()))) &&
            ((this.calledInCountryId==null && other.getCalledInCountryId()==null) || 
             (this.calledInCountryId!=null &&
              this.calledInCountryId.equals(other.getCalledInCountryId()))) &&
            ((this.calledInNationalId==null && other.getCalledInNationalId()==null) || 
             (this.calledInNationalId!=null &&
              this.calledInNationalId.equals(other.getCalledInNationalId()))) &&
            ((this.elementAttributes==null && other.getElementAttributes()==null) || 
             (this.elementAttributes!=null &&
              this.elementAttributes.equals(other.getElementAttributes())));
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
        if (getCallingCountryId() != null) {
            _hashCode += getCallingCountryId().hashCode();
        }
        if (getCallingNationalId() != null) {
            _hashCode += getCallingNationalId().hashCode();
        }
        if (getCalledCountryId() != null) {
            _hashCode += getCalledCountryId().hashCode();
        }
        if (getCalledNationalId() != null) {
            _hashCode += getCalledNationalId().hashCode();
        }
        if (getCalledInCountryId() != null) {
            _hashCode += getCalledInCountryId().hashCode();
        }
        if (getCalledInNationalId() != null) {
            _hashCode += getCalledInNationalId().hashCode();
        }
        if (getElementAttributes() != null) {
            _hashCode += getElementAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EchoCancelCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EchoCancelCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingCountryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingCountryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledCountryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledCountryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledNationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledInCountryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledInCountryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledInNationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledInNationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elementAttributes"));
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
