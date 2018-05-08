/**
 * NumberAnalysisProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class NumberAnalysisProfileData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String numberAnalysisProfileId;

    private java.lang.Short numberType;

    private java.lang.Integer analysisFlags;

    private java.lang.Short normalizationPriority;

    private java.lang.Short destinationPriority;

    private java.lang.Short originatingPriority;

    private java.lang.Short routingPriority;

    public NumberAnalysisProfileData() {
    }

    public NumberAnalysisProfileData(
           java.lang.String numberAnalysisProfileId,
           java.lang.Short numberType,
           java.lang.Integer analysisFlags,
           java.lang.Short normalizationPriority,
           java.lang.Short destinationPriority,
           java.lang.Short originatingPriority,
           java.lang.Short routingPriority) {
        this.numberAnalysisProfileId = numberAnalysisProfileId;
        this.numberType = numberType;
        this.analysisFlags = analysisFlags;
        this.normalizationPriority = normalizationPriority;
        this.destinationPriority = destinationPriority;
        this.originatingPriority = originatingPriority;
        this.routingPriority = routingPriority;
    }


    /**
     * Gets the numberAnalysisProfileId value for this NumberAnalysisProfileData.
     * 
     * @return numberAnalysisProfileId
     */
    public java.lang.String getNumberAnalysisProfileId() {
        return numberAnalysisProfileId;
    }


    /**
     * Sets the numberAnalysisProfileId value for this NumberAnalysisProfileData.
     * 
     * @param numberAnalysisProfileId
     */
    public void setNumberAnalysisProfileId(java.lang.String numberAnalysisProfileId) {
        this.numberAnalysisProfileId = numberAnalysisProfileId;
    }


    /**
     * Gets the numberType value for this NumberAnalysisProfileData.
     * 
     * @return numberType
     */
    public java.lang.Short getNumberType() {
        return numberType;
    }


    /**
     * Sets the numberType value for this NumberAnalysisProfileData.
     * 
     * @param numberType
     */
    public void setNumberType(java.lang.Short numberType) {
        this.numberType = numberType;
    }


    /**
     * Gets the analysisFlags value for this NumberAnalysisProfileData.
     * 
     * @return analysisFlags
     */
    public java.lang.Integer getAnalysisFlags() {
        return analysisFlags;
    }


    /**
     * Sets the analysisFlags value for this NumberAnalysisProfileData.
     * 
     * @param analysisFlags
     */
    public void setAnalysisFlags(java.lang.Integer analysisFlags) {
        this.analysisFlags = analysisFlags;
    }


    /**
     * Gets the normalizationPriority value for this NumberAnalysisProfileData.
     * 
     * @return normalizationPriority
     */
    public java.lang.Short getNormalizationPriority() {
        return normalizationPriority;
    }


    /**
     * Sets the normalizationPriority value for this NumberAnalysisProfileData.
     * 
     * @param normalizationPriority
     */
    public void setNormalizationPriority(java.lang.Short normalizationPriority) {
        this.normalizationPriority = normalizationPriority;
    }


    /**
     * Gets the destinationPriority value for this NumberAnalysisProfileData.
     * 
     * @return destinationPriority
     */
    public java.lang.Short getDestinationPriority() {
        return destinationPriority;
    }


    /**
     * Sets the destinationPriority value for this NumberAnalysisProfileData.
     * 
     * @param destinationPriority
     */
    public void setDestinationPriority(java.lang.Short destinationPriority) {
        this.destinationPriority = destinationPriority;
    }


    /**
     * Gets the originatingPriority value for this NumberAnalysisProfileData.
     * 
     * @return originatingPriority
     */
    public java.lang.Short getOriginatingPriority() {
        return originatingPriority;
    }


    /**
     * Sets the originatingPriority value for this NumberAnalysisProfileData.
     * 
     * @param originatingPriority
     */
    public void setOriginatingPriority(java.lang.Short originatingPriority) {
        this.originatingPriority = originatingPriority;
    }


    /**
     * Gets the routingPriority value for this NumberAnalysisProfileData.
     * 
     * @return routingPriority
     */
    public java.lang.Short getRoutingPriority() {
        return routingPriority;
    }


    /**
     * Sets the routingPriority value for this NumberAnalysisProfileData.
     * 
     * @param routingPriority
     */
    public void setRoutingPriority(java.lang.Short routingPriority) {
        this.routingPriority = routingPriority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumberAnalysisProfileData)) return false;
        NumberAnalysisProfileData other = (NumberAnalysisProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numberAnalysisProfileId==null && other.getNumberAnalysisProfileId()==null) || 
             (this.numberAnalysisProfileId!=null &&
              this.numberAnalysisProfileId.equals(other.getNumberAnalysisProfileId()))) &&
            ((this.numberType==null && other.getNumberType()==null) || 
             (this.numberType!=null &&
              this.numberType.equals(other.getNumberType()))) &&
            ((this.analysisFlags==null && other.getAnalysisFlags()==null) || 
             (this.analysisFlags!=null &&
              this.analysisFlags.equals(other.getAnalysisFlags()))) &&
            ((this.normalizationPriority==null && other.getNormalizationPriority()==null) || 
             (this.normalizationPriority!=null &&
              this.normalizationPriority.equals(other.getNormalizationPriority()))) &&
            ((this.destinationPriority==null && other.getDestinationPriority()==null) || 
             (this.destinationPriority!=null &&
              this.destinationPriority.equals(other.getDestinationPriority()))) &&
            ((this.originatingPriority==null && other.getOriginatingPriority()==null) || 
             (this.originatingPriority!=null &&
              this.originatingPriority.equals(other.getOriginatingPriority()))) &&
            ((this.routingPriority==null && other.getRoutingPriority()==null) || 
             (this.routingPriority!=null &&
              this.routingPriority.equals(other.getRoutingPriority())));
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
        if (getNumberAnalysisProfileId() != null) {
            _hashCode += getNumberAnalysisProfileId().hashCode();
        }
        if (getNumberType() != null) {
            _hashCode += getNumberType().hashCode();
        }
        if (getAnalysisFlags() != null) {
            _hashCode += getAnalysisFlags().hashCode();
        }
        if (getNormalizationPriority() != null) {
            _hashCode += getNormalizationPriority().hashCode();
        }
        if (getDestinationPriority() != null) {
            _hashCode += getDestinationPriority().hashCode();
        }
        if (getOriginatingPriority() != null) {
            _hashCode += getOriginatingPriority().hashCode();
        }
        if (getRoutingPriority() != null) {
            _hashCode += getRoutingPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumberAnalysisProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberAnalysisProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberAnalysisProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberAnalysisProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("analysisFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "analysisFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normalizationPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "normalizationPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originatingPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingPriority"));
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
