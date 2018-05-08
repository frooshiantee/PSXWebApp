/**
 * SuaNetworkAppearance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SuaNetworkAppearance  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String suaNetworkAppearanceId;
    private java.lang.Short networkAppearance;
    private java.lang.Short networkStandard;
    private java.lang.Short networkIdentity;
    private java.lang.String suaProtocolProfileId;

    public SuaNetworkAppearance() {
    }

    public SuaNetworkAppearance(
           java.lang.String suaNetworkAppearanceId,
           java.lang.Short networkAppearance,
           java.lang.Short networkStandard,
           java.lang.Short networkIdentity,
           java.lang.String suaProtocolProfileId) {
           this.suaNetworkAppearanceId = suaNetworkAppearanceId;
           this.networkAppearance = networkAppearance;
           this.networkStandard = networkStandard;
           this.networkIdentity = networkIdentity;
           this.suaProtocolProfileId = suaProtocolProfileId;
    }


    /**
     * Gets the suaNetworkAppearanceId value for this SuaNetworkAppearance.
     * 
     * @return suaNetworkAppearanceId
     */
    public java.lang.String getSuaNetworkAppearanceId() {
        return suaNetworkAppearanceId;
    }


    /**
     * Sets the suaNetworkAppearanceId value for this SuaNetworkAppearance.
     * 
     * @param suaNetworkAppearanceId
     */
    public void setSuaNetworkAppearanceId(java.lang.String suaNetworkAppearanceId) {
        this.suaNetworkAppearanceId = suaNetworkAppearanceId;
    }


    /**
     * Gets the networkAppearance value for this SuaNetworkAppearance.
     * 
     * @return networkAppearance
     */
    public java.lang.Short getNetworkAppearance() {
        return networkAppearance;
    }


    /**
     * Sets the networkAppearance value for this SuaNetworkAppearance.
     * 
     * @param networkAppearance
     */
    public void setNetworkAppearance(java.lang.Short networkAppearance) {
        this.networkAppearance = networkAppearance;
    }


    /**
     * Gets the networkStandard value for this SuaNetworkAppearance.
     * 
     * @return networkStandard
     */
    public java.lang.Short getNetworkStandard() {
        return networkStandard;
    }


    /**
     * Sets the networkStandard value for this SuaNetworkAppearance.
     * 
     * @param networkStandard
     */
    public void setNetworkStandard(java.lang.Short networkStandard) {
        this.networkStandard = networkStandard;
    }


    /**
     * Gets the networkIdentity value for this SuaNetworkAppearance.
     * 
     * @return networkIdentity
     */
    public java.lang.Short getNetworkIdentity() {
        return networkIdentity;
    }


    /**
     * Sets the networkIdentity value for this SuaNetworkAppearance.
     * 
     * @param networkIdentity
     */
    public void setNetworkIdentity(java.lang.Short networkIdentity) {
        this.networkIdentity = networkIdentity;
    }


    /**
     * Gets the suaProtocolProfileId value for this SuaNetworkAppearance.
     * 
     * @return suaProtocolProfileId
     */
    public java.lang.String getSuaProtocolProfileId() {
        return suaProtocolProfileId;
    }


    /**
     * Sets the suaProtocolProfileId value for this SuaNetworkAppearance.
     * 
     * @param suaProtocolProfileId
     */
    public void setSuaProtocolProfileId(java.lang.String suaProtocolProfileId) {
        this.suaProtocolProfileId = suaProtocolProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuaNetworkAppearance)) return false;
        SuaNetworkAppearance other = (SuaNetworkAppearance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.suaNetworkAppearanceId==null && other.getSuaNetworkAppearanceId()==null) || 
             (this.suaNetworkAppearanceId!=null &&
              this.suaNetworkAppearanceId.equals(other.getSuaNetworkAppearanceId()))) &&
            ((this.networkAppearance==null && other.getNetworkAppearance()==null) || 
             (this.networkAppearance!=null &&
              this.networkAppearance.equals(other.getNetworkAppearance()))) &&
            ((this.networkStandard==null && other.getNetworkStandard()==null) || 
             (this.networkStandard!=null &&
              this.networkStandard.equals(other.getNetworkStandard()))) &&
            ((this.networkIdentity==null && other.getNetworkIdentity()==null) || 
             (this.networkIdentity!=null &&
              this.networkIdentity.equals(other.getNetworkIdentity()))) &&
            ((this.suaProtocolProfileId==null && other.getSuaProtocolProfileId()==null) || 
             (this.suaProtocolProfileId!=null &&
              this.suaProtocolProfileId.equals(other.getSuaProtocolProfileId())));
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
        if (getSuaNetworkAppearanceId() != null) {
            _hashCode += getSuaNetworkAppearanceId().hashCode();
        }
        if (getNetworkAppearance() != null) {
            _hashCode += getNetworkAppearance().hashCode();
        }
        if (getNetworkStandard() != null) {
            _hashCode += getNetworkStandard().hashCode();
        }
        if (getNetworkIdentity() != null) {
            _hashCode += getNetworkIdentity().hashCode();
        }
        if (getSuaProtocolProfileId() != null) {
            _hashCode += getSuaProtocolProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SuaNetworkAppearance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaNetworkAppearance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suaNetworkAppearanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suaNetworkAppearanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkAppearance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkAppearance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkStandard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkStandard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suaProtocolProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suaProtocolProfileId"));
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
