/**
 * LcrOffer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class LcrOffer  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String offerId;
    private java.lang.String offerName;
    private java.lang.String description;
    private java.lang.String marginProfileId;
    private java.lang.String qosProfileId;
    private java.lang.String directoryPath;
    private java.lang.String templateFile;

    public LcrOffer() {
    }

    public LcrOffer(
           java.lang.String offerId,
           java.lang.String offerName,
           java.lang.String description,
           java.lang.String marginProfileId,
           java.lang.String qosProfileId,
           java.lang.String directoryPath,
           java.lang.String templateFile) {
           this.offerId = offerId;
           this.offerName = offerName;
           this.description = description;
           this.marginProfileId = marginProfileId;
           this.qosProfileId = qosProfileId;
           this.directoryPath = directoryPath;
           this.templateFile = templateFile;
    }


    /**
     * Gets the offerId value for this LcrOffer.
     * 
     * @return offerId
     */
    public java.lang.String getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this LcrOffer.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.String offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the offerName value for this LcrOffer.
     * 
     * @return offerName
     */
    public java.lang.String getOfferName() {
        return offerName;
    }


    /**
     * Sets the offerName value for this LcrOffer.
     * 
     * @param offerName
     */
    public void setOfferName(java.lang.String offerName) {
        this.offerName = offerName;
    }


    /**
     * Gets the description value for this LcrOffer.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LcrOffer.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the marginProfileId value for this LcrOffer.
     * 
     * @return marginProfileId
     */
    public java.lang.String getMarginProfileId() {
        return marginProfileId;
    }


    /**
     * Sets the marginProfileId value for this LcrOffer.
     * 
     * @param marginProfileId
     */
    public void setMarginProfileId(java.lang.String marginProfileId) {
        this.marginProfileId = marginProfileId;
    }


    /**
     * Gets the qosProfileId value for this LcrOffer.
     * 
     * @return qosProfileId
     */
    public java.lang.String getQosProfileId() {
        return qosProfileId;
    }


    /**
     * Sets the qosProfileId value for this LcrOffer.
     * 
     * @param qosProfileId
     */
    public void setQosProfileId(java.lang.String qosProfileId) {
        this.qosProfileId = qosProfileId;
    }


    /**
     * Gets the directoryPath value for this LcrOffer.
     * 
     * @return directoryPath
     */
    public java.lang.String getDirectoryPath() {
        return directoryPath;
    }


    /**
     * Sets the directoryPath value for this LcrOffer.
     * 
     * @param directoryPath
     */
    public void setDirectoryPath(java.lang.String directoryPath) {
        this.directoryPath = directoryPath;
    }


    /**
     * Gets the templateFile value for this LcrOffer.
     * 
     * @return templateFile
     */
    public java.lang.String getTemplateFile() {
        return templateFile;
    }


    /**
     * Sets the templateFile value for this LcrOffer.
     * 
     * @param templateFile
     */
    public void setTemplateFile(java.lang.String templateFile) {
        this.templateFile = templateFile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LcrOffer)) return false;
        LcrOffer other = (LcrOffer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.offerId==null && other.getOfferId()==null) || 
             (this.offerId!=null &&
              this.offerId.equals(other.getOfferId()))) &&
            ((this.offerName==null && other.getOfferName()==null) || 
             (this.offerName!=null &&
              this.offerName.equals(other.getOfferName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.marginProfileId==null && other.getMarginProfileId()==null) || 
             (this.marginProfileId!=null &&
              this.marginProfileId.equals(other.getMarginProfileId()))) &&
            ((this.qosProfileId==null && other.getQosProfileId()==null) || 
             (this.qosProfileId!=null &&
              this.qosProfileId.equals(other.getQosProfileId()))) &&
            ((this.directoryPath==null && other.getDirectoryPath()==null) || 
             (this.directoryPath!=null &&
              this.directoryPath.equals(other.getDirectoryPath()))) &&
            ((this.templateFile==null && other.getTemplateFile()==null) || 
             (this.templateFile!=null &&
              this.templateFile.equals(other.getTemplateFile())));
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
        if (getOfferId() != null) {
            _hashCode += getOfferId().hashCode();
        }
        if (getOfferName() != null) {
            _hashCode += getOfferName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMarginProfileId() != null) {
            _hashCode += getMarginProfileId().hashCode();
        }
        if (getQosProfileId() != null) {
            _hashCode += getQosProfileId().hashCode();
        }
        if (getDirectoryPath() != null) {
            _hashCode += getDirectoryPath().hashCode();
        }
        if (getTemplateFile() != null) {
            _hashCode += getTemplateFile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LcrOffer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOffer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerName"));
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
        elemField.setFieldName("marginProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marginProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qosProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directoryPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directoryPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateFile"));
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
