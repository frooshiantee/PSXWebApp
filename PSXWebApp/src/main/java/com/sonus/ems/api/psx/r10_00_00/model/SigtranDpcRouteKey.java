/**
 * SigtranDpcRouteKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SigtranDpcRouteKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String sigtranDestinationPointCode;
    private java.lang.Short sigtranDpcPriority;
    private java.lang.Short sigtranSgId;
    private java.lang.String suaNetworkAppearanceId;

    public SigtranDpcRouteKey() {
    }

    public SigtranDpcRouteKey(
           java.lang.String sigtranDestinationPointCode,
           java.lang.Short sigtranDpcPriority,
           java.lang.Short sigtranSgId,
           java.lang.String suaNetworkAppearanceId) {
           this.sigtranDestinationPointCode = sigtranDestinationPointCode;
           this.sigtranDpcPriority = sigtranDpcPriority;
           this.sigtranSgId = sigtranSgId;
           this.suaNetworkAppearanceId = suaNetworkAppearanceId;
    }


    /**
     * Gets the sigtranDestinationPointCode value for this SigtranDpcRouteKey.
     * 
     * @return sigtranDestinationPointCode
     */
    public java.lang.String getSigtranDestinationPointCode() {
        return sigtranDestinationPointCode;
    }


    /**
     * Sets the sigtranDestinationPointCode value for this SigtranDpcRouteKey.
     * 
     * @param sigtranDestinationPointCode
     */
    public void setSigtranDestinationPointCode(java.lang.String sigtranDestinationPointCode) {
        this.sigtranDestinationPointCode = sigtranDestinationPointCode;
    }


    /**
     * Gets the sigtranDpcPriority value for this SigtranDpcRouteKey.
     * 
     * @return sigtranDpcPriority
     */
    public java.lang.Short getSigtranDpcPriority() {
        return sigtranDpcPriority;
    }


    /**
     * Sets the sigtranDpcPriority value for this SigtranDpcRouteKey.
     * 
     * @param sigtranDpcPriority
     */
    public void setSigtranDpcPriority(java.lang.Short sigtranDpcPriority) {
        this.sigtranDpcPriority = sigtranDpcPriority;
    }


    /**
     * Gets the sigtranSgId value for this SigtranDpcRouteKey.
     * 
     * @return sigtranSgId
     */
    public java.lang.Short getSigtranSgId() {
        return sigtranSgId;
    }


    /**
     * Sets the sigtranSgId value for this SigtranDpcRouteKey.
     * 
     * @param sigtranSgId
     */
    public void setSigtranSgId(java.lang.Short sigtranSgId) {
        this.sigtranSgId = sigtranSgId;
    }


    /**
     * Gets the suaNetworkAppearanceId value for this SigtranDpcRouteKey.
     * 
     * @return suaNetworkAppearanceId
     */
    public java.lang.String getSuaNetworkAppearanceId() {
        return suaNetworkAppearanceId;
    }


    /**
     * Sets the suaNetworkAppearanceId value for this SigtranDpcRouteKey.
     * 
     * @param suaNetworkAppearanceId
     */
    public void setSuaNetworkAppearanceId(java.lang.String suaNetworkAppearanceId) {
        this.suaNetworkAppearanceId = suaNetworkAppearanceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SigtranDpcRouteKey)) return false;
        SigtranDpcRouteKey other = (SigtranDpcRouteKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sigtranDestinationPointCode==null && other.getSigtranDestinationPointCode()==null) || 
             (this.sigtranDestinationPointCode!=null &&
              this.sigtranDestinationPointCode.equals(other.getSigtranDestinationPointCode()))) &&
            ((this.sigtranDpcPriority==null && other.getSigtranDpcPriority()==null) || 
             (this.sigtranDpcPriority!=null &&
              this.sigtranDpcPriority.equals(other.getSigtranDpcPriority()))) &&
            ((this.sigtranSgId==null && other.getSigtranSgId()==null) || 
             (this.sigtranSgId!=null &&
              this.sigtranSgId.equals(other.getSigtranSgId()))) &&
            ((this.suaNetworkAppearanceId==null && other.getSuaNetworkAppearanceId()==null) || 
             (this.suaNetworkAppearanceId!=null &&
              this.suaNetworkAppearanceId.equals(other.getSuaNetworkAppearanceId())));
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
        if (getSigtranDestinationPointCode() != null) {
            _hashCode += getSigtranDestinationPointCode().hashCode();
        }
        if (getSigtranDpcPriority() != null) {
            _hashCode += getSigtranDpcPriority().hashCode();
        }
        if (getSigtranSgId() != null) {
            _hashCode += getSigtranSgId().hashCode();
        }
        if (getSuaNetworkAppearanceId() != null) {
            _hashCode += getSuaNetworkAppearanceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SigtranDpcRouteKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranDpcRouteKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigtranDestinationPointCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigtranDestinationPointCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigtranDpcPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigtranDpcPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigtranSgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigtranSgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suaNetworkAppearanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suaNetworkAppearanceId"));
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
