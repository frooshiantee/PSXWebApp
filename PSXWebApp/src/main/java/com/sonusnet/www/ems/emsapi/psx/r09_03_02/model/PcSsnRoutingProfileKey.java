/**
 * PcSsnRoutingProfileKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class PcSsnRoutingProfileKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String pcSsnProfileId;

    public PcSsnRoutingProfileKey() {
    }

    public PcSsnRoutingProfileKey(
           java.lang.String pcSsnProfileId) {
        this.pcSsnProfileId = pcSsnProfileId;
    }


    /**
     * Gets the pcSsnProfileId value for this PcSsnRoutingProfileKey.
     * 
     * @return pcSsnProfileId
     */
    public java.lang.String getPcSsnProfileId() {
        return pcSsnProfileId;
    }


    /**
     * Sets the pcSsnProfileId value for this PcSsnRoutingProfileKey.
     * 
     * @param pcSsnProfileId
     */
    public void setPcSsnProfileId(java.lang.String pcSsnProfileId) {
        this.pcSsnProfileId = pcSsnProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PcSsnRoutingProfileKey)) return false;
        PcSsnRoutingProfileKey other = (PcSsnRoutingProfileKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pcSsnProfileId==null && other.getPcSsnProfileId()==null) || 
             (this.pcSsnProfileId!=null &&
              this.pcSsnProfileId.equals(other.getPcSsnProfileId())));
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
        if (getPcSsnProfileId() != null) {
            _hashCode += getPcSsnProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PcSsnRoutingProfileKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PcSsnRoutingProfileKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcSsnProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcSsnProfileId"));
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
