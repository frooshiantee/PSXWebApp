/**
 * CodecListProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CodecListProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String codecListProfileId;
    private java.lang.String precedenceListItems;
    private java.lang.String purgeListItems;

    public CodecListProfile() {
    }

    public CodecListProfile(
           java.lang.String codecListProfileId,
           java.lang.String precedenceListItems,
           java.lang.String purgeListItems) {
           this.codecListProfileId = codecListProfileId;
           this.precedenceListItems = precedenceListItems;
           this.purgeListItems = purgeListItems;
    }


    /**
     * Gets the codecListProfileId value for this CodecListProfile.
     * 
     * @return codecListProfileId
     */
    public java.lang.String getCodecListProfileId() {
        return codecListProfileId;
    }


    /**
     * Sets the codecListProfileId value for this CodecListProfile.
     * 
     * @param codecListProfileId
     */
    public void setCodecListProfileId(java.lang.String codecListProfileId) {
        this.codecListProfileId = codecListProfileId;
    }


    /**
     * Gets the precedenceListItems value for this CodecListProfile.
     * 
     * @return precedenceListItems
     */
    public java.lang.String getPrecedenceListItems() {
        return precedenceListItems;
    }


    /**
     * Sets the precedenceListItems value for this CodecListProfile.
     * 
     * @param precedenceListItems
     */
    public void setPrecedenceListItems(java.lang.String precedenceListItems) {
        this.precedenceListItems = precedenceListItems;
    }


    /**
     * Gets the purgeListItems value for this CodecListProfile.
     * 
     * @return purgeListItems
     */
    public java.lang.String getPurgeListItems() {
        return purgeListItems;
    }


    /**
     * Sets the purgeListItems value for this CodecListProfile.
     * 
     * @param purgeListItems
     */
    public void setPurgeListItems(java.lang.String purgeListItems) {
        this.purgeListItems = purgeListItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodecListProfile)) return false;
        CodecListProfile other = (CodecListProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codecListProfileId==null && other.getCodecListProfileId()==null) || 
             (this.codecListProfileId!=null &&
              this.codecListProfileId.equals(other.getCodecListProfileId()))) &&
            ((this.precedenceListItems==null && other.getPrecedenceListItems()==null) || 
             (this.precedenceListItems!=null &&
              this.precedenceListItems.equals(other.getPrecedenceListItems()))) &&
            ((this.purgeListItems==null && other.getPurgeListItems()==null) || 
             (this.purgeListItems!=null &&
              this.purgeListItems.equals(other.getPurgeListItems())));
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
        if (getCodecListProfileId() != null) {
            _hashCode += getCodecListProfileId().hashCode();
        }
        if (getPrecedenceListItems() != null) {
            _hashCode += getPrecedenceListItems().hashCode();
        }
        if (getPurgeListItems() != null) {
            _hashCode += getPurgeListItems().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodecListProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecListProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecListProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecListProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precedenceListItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precedenceListItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purgeListItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purgeListItems"));
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
