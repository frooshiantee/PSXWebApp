/**
 * InfoTransCapProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class InfoTransCapProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String infoTransCapProfileId;

    private java.lang.String description;

    private java.lang.Integer allowedItc;

    public InfoTransCapProfile() {
    }

    public InfoTransCapProfile(
           java.lang.String infoTransCapProfileId,
           java.lang.String description,
           java.lang.Integer allowedItc) {
        this.infoTransCapProfileId = infoTransCapProfileId;
        this.description = description;
        this.allowedItc = allowedItc;
    }


    /**
     * Gets the infoTransCapProfileId value for this InfoTransCapProfile.
     * 
     * @return infoTransCapProfileId
     */
    public java.lang.String getInfoTransCapProfileId() {
        return infoTransCapProfileId;
    }


    /**
     * Sets the infoTransCapProfileId value for this InfoTransCapProfile.
     * 
     * @param infoTransCapProfileId
     */
    public void setInfoTransCapProfileId(java.lang.String infoTransCapProfileId) {
        this.infoTransCapProfileId = infoTransCapProfileId;
    }


    /**
     * Gets the description value for this InfoTransCapProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InfoTransCapProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the allowedItc value for this InfoTransCapProfile.
     * 
     * @return allowedItc
     */
    public java.lang.Integer getAllowedItc() {
        return allowedItc;
    }


    /**
     * Sets the allowedItc value for this InfoTransCapProfile.
     * 
     * @param allowedItc
     */
    public void setAllowedItc(java.lang.Integer allowedItc) {
        this.allowedItc = allowedItc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoTransCapProfile)) return false;
        InfoTransCapProfile other = (InfoTransCapProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.infoTransCapProfileId==null && other.getInfoTransCapProfileId()==null) || 
             (this.infoTransCapProfileId!=null &&
              this.infoTransCapProfileId.equals(other.getInfoTransCapProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.allowedItc==null && other.getAllowedItc()==null) || 
             (this.allowedItc!=null &&
              this.allowedItc.equals(other.getAllowedItc())));
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
        if (getInfoTransCapProfileId() != null) {
            _hashCode += getInfoTransCapProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAllowedItc() != null) {
            _hashCode += getAllowedItc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoTransCapProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InfoTransCapProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoTransCapProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infoTransCapProfileId"));
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
        elemField.setFieldName("allowedItc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowedItc"));
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
