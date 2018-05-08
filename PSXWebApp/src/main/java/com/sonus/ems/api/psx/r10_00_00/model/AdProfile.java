/**
 * AdProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class AdProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String adProfileId;
    private java.lang.Short adEnable;
    private java.lang.Integer adAttributesList;
    private java.lang.Integer updateFrequency;
    private java.lang.String delayedSync;

    public AdProfile() {
    }

    public AdProfile(
           java.lang.String adProfileId,
           java.lang.Short adEnable,
           java.lang.Integer adAttributesList,
           java.lang.Integer updateFrequency,
           java.lang.String delayedSync) {
           this.adProfileId = adProfileId;
           this.adEnable = adEnable;
           this.adAttributesList = adAttributesList;
           this.updateFrequency = updateFrequency;
           this.delayedSync = delayedSync;
    }


    /**
     * Gets the adProfileId value for this AdProfile.
     * 
     * @return adProfileId
     */
    public java.lang.String getAdProfileId() {
        return adProfileId;
    }


    /**
     * Sets the adProfileId value for this AdProfile.
     * 
     * @param adProfileId
     */
    public void setAdProfileId(java.lang.String adProfileId) {
        this.adProfileId = adProfileId;
    }


    /**
     * Gets the adEnable value for this AdProfile.
     * 
     * @return adEnable
     */
    public java.lang.Short getAdEnable() {
        return adEnable;
    }


    /**
     * Sets the adEnable value for this AdProfile.
     * 
     * @param adEnable
     */
    public void setAdEnable(java.lang.Short adEnable) {
        this.adEnable = adEnable;
    }


    /**
     * Gets the adAttributesList value for this AdProfile.
     * 
     * @return adAttributesList
     */
    public java.lang.Integer getAdAttributesList() {
        return adAttributesList;
    }


    /**
     * Sets the adAttributesList value for this AdProfile.
     * 
     * @param adAttributesList
     */
    public void setAdAttributesList(java.lang.Integer adAttributesList) {
        this.adAttributesList = adAttributesList;
    }


    /**
     * Gets the updateFrequency value for this AdProfile.
     * 
     * @return updateFrequency
     */
    public java.lang.Integer getUpdateFrequency() {
        return updateFrequency;
    }


    /**
     * Sets the updateFrequency value for this AdProfile.
     * 
     * @param updateFrequency
     */
    public void setUpdateFrequency(java.lang.Integer updateFrequency) {
        this.updateFrequency = updateFrequency;
    }


    /**
     * Gets the delayedSync value for this AdProfile.
     * 
     * @return delayedSync
     */
    public java.lang.String getDelayedSync() {
        return delayedSync;
    }


    /**
     * Sets the delayedSync value for this AdProfile.
     * 
     * @param delayedSync
     */
    public void setDelayedSync(java.lang.String delayedSync) {
        this.delayedSync = delayedSync;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdProfile)) return false;
        AdProfile other = (AdProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adProfileId==null && other.getAdProfileId()==null) || 
             (this.adProfileId!=null &&
              this.adProfileId.equals(other.getAdProfileId()))) &&
            ((this.adEnable==null && other.getAdEnable()==null) || 
             (this.adEnable!=null &&
              this.adEnable.equals(other.getAdEnable()))) &&
            ((this.adAttributesList==null && other.getAdAttributesList()==null) || 
             (this.adAttributesList!=null &&
              this.adAttributesList.equals(other.getAdAttributesList()))) &&
            ((this.updateFrequency==null && other.getUpdateFrequency()==null) || 
             (this.updateFrequency!=null &&
              this.updateFrequency.equals(other.getUpdateFrequency()))) &&
            ((this.delayedSync==null && other.getDelayedSync()==null) || 
             (this.delayedSync!=null &&
              this.delayedSync.equals(other.getDelayedSync())));
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
        if (getAdProfileId() != null) {
            _hashCode += getAdProfileId().hashCode();
        }
        if (getAdEnable() != null) {
            _hashCode += getAdEnable().hashCode();
        }
        if (getAdAttributesList() != null) {
            _hashCode += getAdAttributesList().hashCode();
        }
        if (getUpdateFrequency() != null) {
            _hashCode += getUpdateFrequency().hashCode();
        }
        if (getDelayedSync() != null) {
            _hashCode += getDelayedSync().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AdProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adEnable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adAttributesList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adAttributesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delayedSync");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delayedSync"));
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
