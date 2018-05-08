/**
 * PpspIdsProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class PpspIdsProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String ppspIdsProfileId;
    private java.lang.String ppspId;
    private java.lang.String hpcPpspId;

    public PpspIdsProfile() {
    }

    public PpspIdsProfile(
           java.lang.String ppspIdsProfileId,
           java.lang.String ppspId,
           java.lang.String hpcPpspId) {
           this.ppspIdsProfileId = ppspIdsProfileId;
           this.ppspId = ppspId;
           this.hpcPpspId = hpcPpspId;
    }


    /**
     * Gets the ppspIdsProfileId value for this PpspIdsProfile.
     * 
     * @return ppspIdsProfileId
     */
    public java.lang.String getPpspIdsProfileId() {
        return ppspIdsProfileId;
    }


    /**
     * Sets the ppspIdsProfileId value for this PpspIdsProfile.
     * 
     * @param ppspIdsProfileId
     */
    public void setPpspIdsProfileId(java.lang.String ppspIdsProfileId) {
        this.ppspIdsProfileId = ppspIdsProfileId;
    }


    /**
     * Gets the ppspId value for this PpspIdsProfile.
     * 
     * @return ppspId
     */
    public java.lang.String getPpspId() {
        return ppspId;
    }


    /**
     * Sets the ppspId value for this PpspIdsProfile.
     * 
     * @param ppspId
     */
    public void setPpspId(java.lang.String ppspId) {
        this.ppspId = ppspId;
    }


    /**
     * Gets the hpcPpspId value for this PpspIdsProfile.
     * 
     * @return hpcPpspId
     */
    public java.lang.String getHpcPpspId() {
        return hpcPpspId;
    }


    /**
     * Sets the hpcPpspId value for this PpspIdsProfile.
     * 
     * @param hpcPpspId
     */
    public void setHpcPpspId(java.lang.String hpcPpspId) {
        this.hpcPpspId = hpcPpspId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PpspIdsProfile)) return false;
        PpspIdsProfile other = (PpspIdsProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ppspIdsProfileId==null && other.getPpspIdsProfileId()==null) || 
             (this.ppspIdsProfileId!=null &&
              this.ppspIdsProfileId.equals(other.getPpspIdsProfileId()))) &&
            ((this.ppspId==null && other.getPpspId()==null) || 
             (this.ppspId!=null &&
              this.ppspId.equals(other.getPpspId()))) &&
            ((this.hpcPpspId==null && other.getHpcPpspId()==null) || 
             (this.hpcPpspId!=null &&
              this.hpcPpspId.equals(other.getHpcPpspId())));
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
        if (getPpspIdsProfileId() != null) {
            _hashCode += getPpspIdsProfileId().hashCode();
        }
        if (getPpspId() != null) {
            _hashCode += getPpspId().hashCode();
        }
        if (getHpcPpspId() != null) {
            _hashCode += getHpcPpspId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PpspIdsProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PpspIdsProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppspIdsProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppspIdsProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppspId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppspId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hpcPpspId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hpcPpspId"));
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
