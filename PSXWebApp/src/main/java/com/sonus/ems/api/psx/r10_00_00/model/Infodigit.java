/**
 * Infodigit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class Infodigit  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String infodigitId;
    private java.lang.String description;
    private java.lang.Integer elementAttributes;
    private java.lang.String classOfServiceId;
    private java.lang.String pseudoCarrierId;
    private java.lang.String exceptionProfileId;

    public Infodigit() {
    }

    public Infodigit(
           java.lang.String infodigitId,
           java.lang.String description,
           java.lang.Integer elementAttributes,
           java.lang.String classOfServiceId,
           java.lang.String pseudoCarrierId,
           java.lang.String exceptionProfileId) {
           this.infodigitId = infodigitId;
           this.description = description;
           this.elementAttributes = elementAttributes;
           this.classOfServiceId = classOfServiceId;
           this.pseudoCarrierId = pseudoCarrierId;
           this.exceptionProfileId = exceptionProfileId;
    }


    /**
     * Gets the infodigitId value for this Infodigit.
     * 
     * @return infodigitId
     */
    public java.lang.String getInfodigitId() {
        return infodigitId;
    }


    /**
     * Sets the infodigitId value for this Infodigit.
     * 
     * @param infodigitId
     */
    public void setInfodigitId(java.lang.String infodigitId) {
        this.infodigitId = infodigitId;
    }


    /**
     * Gets the description value for this Infodigit.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Infodigit.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the elementAttributes value for this Infodigit.
     * 
     * @return elementAttributes
     */
    public java.lang.Integer getElementAttributes() {
        return elementAttributes;
    }


    /**
     * Sets the elementAttributes value for this Infodigit.
     * 
     * @param elementAttributes
     */
    public void setElementAttributes(java.lang.Integer elementAttributes) {
        this.elementAttributes = elementAttributes;
    }


    /**
     * Gets the classOfServiceId value for this Infodigit.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this Infodigit.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the pseudoCarrierId value for this Infodigit.
     * 
     * @return pseudoCarrierId
     */
    public java.lang.String getPseudoCarrierId() {
        return pseudoCarrierId;
    }


    /**
     * Sets the pseudoCarrierId value for this Infodigit.
     * 
     * @param pseudoCarrierId
     */
    public void setPseudoCarrierId(java.lang.String pseudoCarrierId) {
        this.pseudoCarrierId = pseudoCarrierId;
    }


    /**
     * Gets the exceptionProfileId value for this Infodigit.
     * 
     * @return exceptionProfileId
     */
    public java.lang.String getExceptionProfileId() {
        return exceptionProfileId;
    }


    /**
     * Sets the exceptionProfileId value for this Infodigit.
     * 
     * @param exceptionProfileId
     */
    public void setExceptionProfileId(java.lang.String exceptionProfileId) {
        this.exceptionProfileId = exceptionProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Infodigit)) return false;
        Infodigit other = (Infodigit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.infodigitId==null && other.getInfodigitId()==null) || 
             (this.infodigitId!=null &&
              this.infodigitId.equals(other.getInfodigitId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.elementAttributes==null && other.getElementAttributes()==null) || 
             (this.elementAttributes!=null &&
              this.elementAttributes.equals(other.getElementAttributes()))) &&
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.pseudoCarrierId==null && other.getPseudoCarrierId()==null) || 
             (this.pseudoCarrierId!=null &&
              this.pseudoCarrierId.equals(other.getPseudoCarrierId()))) &&
            ((this.exceptionProfileId==null && other.getExceptionProfileId()==null) || 
             (this.exceptionProfileId!=null &&
              this.exceptionProfileId.equals(other.getExceptionProfileId())));
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
        if (getInfodigitId() != null) {
            _hashCode += getInfodigitId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getElementAttributes() != null) {
            _hashCode += getElementAttributes().hashCode();
        }
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getPseudoCarrierId() != null) {
            _hashCode += getPseudoCarrierId().hashCode();
        }
        if (getExceptionProfileId() != null) {
            _hashCode += getExceptionProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Infodigit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Infodigit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infodigitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infodigitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elementAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classOfServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classOfServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pseudoCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pseudoCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionProfileId"));
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
