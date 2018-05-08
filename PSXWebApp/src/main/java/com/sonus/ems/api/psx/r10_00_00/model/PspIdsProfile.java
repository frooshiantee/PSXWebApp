/**
 * PspIdsProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class PspIdsProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String pspIdsProfileId;
    private java.lang.String pspId;
    private java.lang.String hpcPspId;

    public PspIdsProfile() {
    }

    public PspIdsProfile(
           java.lang.String pspIdsProfileId,
           java.lang.String pspId,
           java.lang.String hpcPspId) {
           this.pspIdsProfileId = pspIdsProfileId;
           this.pspId = pspId;
           this.hpcPspId = hpcPspId;
    }


    /**
     * Gets the pspIdsProfileId value for this PspIdsProfile.
     * 
     * @return pspIdsProfileId
     */
    public java.lang.String getPspIdsProfileId() {
        return pspIdsProfileId;
    }


    /**
     * Sets the pspIdsProfileId value for this PspIdsProfile.
     * 
     * @param pspIdsProfileId
     */
    public void setPspIdsProfileId(java.lang.String pspIdsProfileId) {
        this.pspIdsProfileId = pspIdsProfileId;
    }


    /**
     * Gets the pspId value for this PspIdsProfile.
     * 
     * @return pspId
     */
    public java.lang.String getPspId() {
        return pspId;
    }


    /**
     * Sets the pspId value for this PspIdsProfile.
     * 
     * @param pspId
     */
    public void setPspId(java.lang.String pspId) {
        this.pspId = pspId;
    }


    /**
     * Gets the hpcPspId value for this PspIdsProfile.
     * 
     * @return hpcPspId
     */
    public java.lang.String getHpcPspId() {
        return hpcPspId;
    }


    /**
     * Sets the hpcPspId value for this PspIdsProfile.
     * 
     * @param hpcPspId
     */
    public void setHpcPspId(java.lang.String hpcPspId) {
        this.hpcPspId = hpcPspId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PspIdsProfile)) return false;
        PspIdsProfile other = (PspIdsProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pspIdsProfileId==null && other.getPspIdsProfileId()==null) || 
             (this.pspIdsProfileId!=null &&
              this.pspIdsProfileId.equals(other.getPspIdsProfileId()))) &&
            ((this.pspId==null && other.getPspId()==null) || 
             (this.pspId!=null &&
              this.pspId.equals(other.getPspId()))) &&
            ((this.hpcPspId==null && other.getHpcPspId()==null) || 
             (this.hpcPspId!=null &&
              this.hpcPspId.equals(other.getHpcPspId())));
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
        if (getPspIdsProfileId() != null) {
            _hashCode += getPspIdsProfileId().hashCode();
        }
        if (getPspId() != null) {
            _hashCode += getPspId().hashCode();
        }
        if (getHpcPspId() != null) {
            _hashCode += getHpcPspId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PspIdsProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PspIdsProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pspIdsProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pspIdsProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pspId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pspId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hpcPspId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hpcPspId"));
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
