/**
 * PcSsnRoutingProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class PcSsnRoutingProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String pcSsnProfileId;
    private java.lang.Integer pcSsnLoadDistribution;

    public PcSsnRoutingProfile() {
    }

    public PcSsnRoutingProfile(
           java.lang.String pcSsnProfileId,
           java.lang.Integer pcSsnLoadDistribution) {
           this.pcSsnProfileId = pcSsnProfileId;
           this.pcSsnLoadDistribution = pcSsnLoadDistribution;
    }


    /**
     * Gets the pcSsnProfileId value for this PcSsnRoutingProfile.
     * 
     * @return pcSsnProfileId
     */
    public java.lang.String getPcSsnProfileId() {
        return pcSsnProfileId;
    }


    /**
     * Sets the pcSsnProfileId value for this PcSsnRoutingProfile.
     * 
     * @param pcSsnProfileId
     */
    public void setPcSsnProfileId(java.lang.String pcSsnProfileId) {
        this.pcSsnProfileId = pcSsnProfileId;
    }


    /**
     * Gets the pcSsnLoadDistribution value for this PcSsnRoutingProfile.
     * 
     * @return pcSsnLoadDistribution
     */
    public java.lang.Integer getPcSsnLoadDistribution() {
        return pcSsnLoadDistribution;
    }


    /**
     * Sets the pcSsnLoadDistribution value for this PcSsnRoutingProfile.
     * 
     * @param pcSsnLoadDistribution
     */
    public void setPcSsnLoadDistribution(java.lang.Integer pcSsnLoadDistribution) {
        this.pcSsnLoadDistribution = pcSsnLoadDistribution;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PcSsnRoutingProfile)) return false;
        PcSsnRoutingProfile other = (PcSsnRoutingProfile) obj;
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
              this.pcSsnProfileId.equals(other.getPcSsnProfileId()))) &&
            ((this.pcSsnLoadDistribution==null && other.getPcSsnLoadDistribution()==null) || 
             (this.pcSsnLoadDistribution!=null &&
              this.pcSsnLoadDistribution.equals(other.getPcSsnLoadDistribution())));
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
        if (getPcSsnLoadDistribution() != null) {
            _hashCode += getPcSsnLoadDistribution().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PcSsnRoutingProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PcSsnRoutingProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcSsnProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcSsnProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcSsnLoadDistribution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcSsnLoadDistribution"));
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
