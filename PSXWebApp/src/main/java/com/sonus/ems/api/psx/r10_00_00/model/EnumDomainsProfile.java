/**
 * EnumDomainsProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class EnumDomainsProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String enumDomainProfileId;
    private java.lang.String description;
    private java.lang.String primaryDomain;
    private java.lang.String secondaryDomain;
    private java.lang.Integer attributes;

    public EnumDomainsProfile() {
    }

    public EnumDomainsProfile(
           java.lang.String enumDomainProfileId,
           java.lang.String description,
           java.lang.String primaryDomain,
           java.lang.String secondaryDomain,
           java.lang.Integer attributes) {
           this.enumDomainProfileId = enumDomainProfileId;
           this.description = description;
           this.primaryDomain = primaryDomain;
           this.secondaryDomain = secondaryDomain;
           this.attributes = attributes;
    }


    /**
     * Gets the enumDomainProfileId value for this EnumDomainsProfile.
     * 
     * @return enumDomainProfileId
     */
    public java.lang.String getEnumDomainProfileId() {
        return enumDomainProfileId;
    }


    /**
     * Sets the enumDomainProfileId value for this EnumDomainsProfile.
     * 
     * @param enumDomainProfileId
     */
    public void setEnumDomainProfileId(java.lang.String enumDomainProfileId) {
        this.enumDomainProfileId = enumDomainProfileId;
    }


    /**
     * Gets the description value for this EnumDomainsProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this EnumDomainsProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the primaryDomain value for this EnumDomainsProfile.
     * 
     * @return primaryDomain
     */
    public java.lang.String getPrimaryDomain() {
        return primaryDomain;
    }


    /**
     * Sets the primaryDomain value for this EnumDomainsProfile.
     * 
     * @param primaryDomain
     */
    public void setPrimaryDomain(java.lang.String primaryDomain) {
        this.primaryDomain = primaryDomain;
    }


    /**
     * Gets the secondaryDomain value for this EnumDomainsProfile.
     * 
     * @return secondaryDomain
     */
    public java.lang.String getSecondaryDomain() {
        return secondaryDomain;
    }


    /**
     * Sets the secondaryDomain value for this EnumDomainsProfile.
     * 
     * @param secondaryDomain
     */
    public void setSecondaryDomain(java.lang.String secondaryDomain) {
        this.secondaryDomain = secondaryDomain;
    }


    /**
     * Gets the attributes value for this EnumDomainsProfile.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this EnumDomainsProfile.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumDomainsProfile)) return false;
        EnumDomainsProfile other = (EnumDomainsProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enumDomainProfileId==null && other.getEnumDomainProfileId()==null) || 
             (this.enumDomainProfileId!=null &&
              this.enumDomainProfileId.equals(other.getEnumDomainProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.primaryDomain==null && other.getPrimaryDomain()==null) || 
             (this.primaryDomain!=null &&
              this.primaryDomain.equals(other.getPrimaryDomain()))) &&
            ((this.secondaryDomain==null && other.getSecondaryDomain()==null) || 
             (this.secondaryDomain!=null &&
              this.secondaryDomain.equals(other.getSecondaryDomain()))) &&
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
        if (getEnumDomainProfileId() != null) {
            _hashCode += getEnumDomainProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPrimaryDomain() != null) {
            _hashCode += getPrimaryDomain().hashCode();
        }
        if (getSecondaryDomain() != null) {
            _hashCode += getSecondaryDomain().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumDomainsProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumDomainsProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumDomainProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumDomainProfileId"));
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
        elemField.setFieldName("primaryDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondaryDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
