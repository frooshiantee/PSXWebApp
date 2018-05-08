/**
 * AdMsgProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class AdMsgProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String adMsgProfileId;
    private java.lang.String callParamFilterGroupId;
    private java.lang.Integer adAttributesList;

    public AdMsgProfile() {
    }

    public AdMsgProfile(
           java.lang.String adMsgProfileId,
           java.lang.String callParamFilterGroupId,
           java.lang.Integer adAttributesList) {
           this.adMsgProfileId = adMsgProfileId;
           this.callParamFilterGroupId = callParamFilterGroupId;
           this.adAttributesList = adAttributesList;
    }


    /**
     * Gets the adMsgProfileId value for this AdMsgProfile.
     * 
     * @return adMsgProfileId
     */
    public java.lang.String getAdMsgProfileId() {
        return adMsgProfileId;
    }


    /**
     * Sets the adMsgProfileId value for this AdMsgProfile.
     * 
     * @param adMsgProfileId
     */
    public void setAdMsgProfileId(java.lang.String adMsgProfileId) {
        this.adMsgProfileId = adMsgProfileId;
    }


    /**
     * Gets the callParamFilterGroupId value for this AdMsgProfile.
     * 
     * @return callParamFilterGroupId
     */
    public java.lang.String getCallParamFilterGroupId() {
        return callParamFilterGroupId;
    }


    /**
     * Sets the callParamFilterGroupId value for this AdMsgProfile.
     * 
     * @param callParamFilterGroupId
     */
    public void setCallParamFilterGroupId(java.lang.String callParamFilterGroupId) {
        this.callParamFilterGroupId = callParamFilterGroupId;
    }


    /**
     * Gets the adAttributesList value for this AdMsgProfile.
     * 
     * @return adAttributesList
     */
    public java.lang.Integer getAdAttributesList() {
        return adAttributesList;
    }


    /**
     * Sets the adAttributesList value for this AdMsgProfile.
     * 
     * @param adAttributesList
     */
    public void setAdAttributesList(java.lang.Integer adAttributesList) {
        this.adAttributesList = adAttributesList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdMsgProfile)) return false;
        AdMsgProfile other = (AdMsgProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adMsgProfileId==null && other.getAdMsgProfileId()==null) || 
             (this.adMsgProfileId!=null &&
              this.adMsgProfileId.equals(other.getAdMsgProfileId()))) &&
            ((this.callParamFilterGroupId==null && other.getCallParamFilterGroupId()==null) || 
             (this.callParamFilterGroupId!=null &&
              this.callParamFilterGroupId.equals(other.getCallParamFilterGroupId()))) &&
            ((this.adAttributesList==null && other.getAdAttributesList()==null) || 
             (this.adAttributesList!=null &&
              this.adAttributesList.equals(other.getAdAttributesList())));
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
        if (getAdMsgProfileId() != null) {
            _hashCode += getAdMsgProfileId().hashCode();
        }
        if (getCallParamFilterGroupId() != null) {
            _hashCode += getCallParamFilterGroupId().hashCode();
        }
        if (getAdAttributesList() != null) {
            _hashCode += getAdAttributesList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdMsgProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AdMsgProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adMsgProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adMsgProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParamFilterGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adAttributesList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adAttributesList"));
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
