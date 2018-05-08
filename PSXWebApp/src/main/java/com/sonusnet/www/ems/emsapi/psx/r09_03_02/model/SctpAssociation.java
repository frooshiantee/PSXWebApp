/**
 * SctpAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SctpAssociation  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sctpAssociationId;

    private java.lang.Short sourceSuaSpId;

    private java.lang.Short destinationSuaSpId;

    private java.lang.Short maxInStreams;

    private java.lang.Short maxOutStreams;

    private java.lang.Integer attributes;

    public SctpAssociation() {
    }

    public SctpAssociation(
           java.lang.String sctpAssociationId,
           java.lang.Short sourceSuaSpId,
           java.lang.Short destinationSuaSpId,
           java.lang.Short maxInStreams,
           java.lang.Short maxOutStreams,
           java.lang.Integer attributes) {
        this.sctpAssociationId = sctpAssociationId;
        this.sourceSuaSpId = sourceSuaSpId;
        this.destinationSuaSpId = destinationSuaSpId;
        this.maxInStreams = maxInStreams;
        this.maxOutStreams = maxOutStreams;
        this.attributes = attributes;
    }


    /**
     * Gets the sctpAssociationId value for this SctpAssociation.
     * 
     * @return sctpAssociationId
     */
    public java.lang.String getSctpAssociationId() {
        return sctpAssociationId;
    }


    /**
     * Sets the sctpAssociationId value for this SctpAssociation.
     * 
     * @param sctpAssociationId
     */
    public void setSctpAssociationId(java.lang.String sctpAssociationId) {
        this.sctpAssociationId = sctpAssociationId;
    }


    /**
     * Gets the sourceSuaSpId value for this SctpAssociation.
     * 
     * @return sourceSuaSpId
     */
    public java.lang.Short getSourceSuaSpId() {
        return sourceSuaSpId;
    }


    /**
     * Sets the sourceSuaSpId value for this SctpAssociation.
     * 
     * @param sourceSuaSpId
     */
    public void setSourceSuaSpId(java.lang.Short sourceSuaSpId) {
        this.sourceSuaSpId = sourceSuaSpId;
    }


    /**
     * Gets the destinationSuaSpId value for this SctpAssociation.
     * 
     * @return destinationSuaSpId
     */
    public java.lang.Short getDestinationSuaSpId() {
        return destinationSuaSpId;
    }


    /**
     * Sets the destinationSuaSpId value for this SctpAssociation.
     * 
     * @param destinationSuaSpId
     */
    public void setDestinationSuaSpId(java.lang.Short destinationSuaSpId) {
        this.destinationSuaSpId = destinationSuaSpId;
    }


    /**
     * Gets the maxInStreams value for this SctpAssociation.
     * 
     * @return maxInStreams
     */
    public java.lang.Short getMaxInStreams() {
        return maxInStreams;
    }


    /**
     * Sets the maxInStreams value for this SctpAssociation.
     * 
     * @param maxInStreams
     */
    public void setMaxInStreams(java.lang.Short maxInStreams) {
        this.maxInStreams = maxInStreams;
    }


    /**
     * Gets the maxOutStreams value for this SctpAssociation.
     * 
     * @return maxOutStreams
     */
    public java.lang.Short getMaxOutStreams() {
        return maxOutStreams;
    }


    /**
     * Sets the maxOutStreams value for this SctpAssociation.
     * 
     * @param maxOutStreams
     */
    public void setMaxOutStreams(java.lang.Short maxOutStreams) {
        this.maxOutStreams = maxOutStreams;
    }


    /**
     * Gets the attributes value for this SctpAssociation.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this SctpAssociation.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SctpAssociation)) return false;
        SctpAssociation other = (SctpAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sctpAssociationId==null && other.getSctpAssociationId()==null) || 
             (this.sctpAssociationId!=null &&
              this.sctpAssociationId.equals(other.getSctpAssociationId()))) &&
            ((this.sourceSuaSpId==null && other.getSourceSuaSpId()==null) || 
             (this.sourceSuaSpId!=null &&
              this.sourceSuaSpId.equals(other.getSourceSuaSpId()))) &&
            ((this.destinationSuaSpId==null && other.getDestinationSuaSpId()==null) || 
             (this.destinationSuaSpId!=null &&
              this.destinationSuaSpId.equals(other.getDestinationSuaSpId()))) &&
            ((this.maxInStreams==null && other.getMaxInStreams()==null) || 
             (this.maxInStreams!=null &&
              this.maxInStreams.equals(other.getMaxInStreams()))) &&
            ((this.maxOutStreams==null && other.getMaxOutStreams()==null) || 
             (this.maxOutStreams!=null &&
              this.maxOutStreams.equals(other.getMaxOutStreams()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes())));
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
        if (getSctpAssociationId() != null) {
            _hashCode += getSctpAssociationId().hashCode();
        }
        if (getSourceSuaSpId() != null) {
            _hashCode += getSourceSuaSpId().hashCode();
        }
        if (getDestinationSuaSpId() != null) {
            _hashCode += getDestinationSuaSpId().hashCode();
        }
        if (getMaxInStreams() != null) {
            _hashCode += getMaxInStreams().hashCode();
        }
        if (getMaxOutStreams() != null) {
            _hashCode += getMaxOutStreams().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SctpAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SctpAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sctpAssociationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sctpAssociationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceSuaSpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceSuaSpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationSuaSpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationSuaSpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxInStreams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxInStreams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxOutStreams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxOutStreams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
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
