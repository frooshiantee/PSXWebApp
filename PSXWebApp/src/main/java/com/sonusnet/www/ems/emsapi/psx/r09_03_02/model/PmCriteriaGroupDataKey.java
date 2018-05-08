/**
 * PmCriteriaGroupDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class PmCriteriaGroupDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String pmCriteriaGroupId;

    private java.lang.Short pmCriteriaSeq;

    public PmCriteriaGroupDataKey() {
    }

    public PmCriteriaGroupDataKey(
           java.lang.String pmCriteriaGroupId,
           java.lang.Short pmCriteriaSeq) {
        this.pmCriteriaGroupId = pmCriteriaGroupId;
        this.pmCriteriaSeq = pmCriteriaSeq;
    }


    /**
     * Gets the pmCriteriaGroupId value for this PmCriteriaGroupDataKey.
     * 
     * @return pmCriteriaGroupId
     */
    public java.lang.String getPmCriteriaGroupId() {
        return pmCriteriaGroupId;
    }


    /**
     * Sets the pmCriteriaGroupId value for this PmCriteriaGroupDataKey.
     * 
     * @param pmCriteriaGroupId
     */
    public void setPmCriteriaGroupId(java.lang.String pmCriteriaGroupId) {
        this.pmCriteriaGroupId = pmCriteriaGroupId;
    }


    /**
     * Gets the pmCriteriaSeq value for this PmCriteriaGroupDataKey.
     * 
     * @return pmCriteriaSeq
     */
    public java.lang.Short getPmCriteriaSeq() {
        return pmCriteriaSeq;
    }


    /**
     * Sets the pmCriteriaSeq value for this PmCriteriaGroupDataKey.
     * 
     * @param pmCriteriaSeq
     */
    public void setPmCriteriaSeq(java.lang.Short pmCriteriaSeq) {
        this.pmCriteriaSeq = pmCriteriaSeq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PmCriteriaGroupDataKey)) return false;
        PmCriteriaGroupDataKey other = (PmCriteriaGroupDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pmCriteriaGroupId==null && other.getPmCriteriaGroupId()==null) || 
             (this.pmCriteriaGroupId!=null &&
              this.pmCriteriaGroupId.equals(other.getPmCriteriaGroupId()))) &&
            ((this.pmCriteriaSeq==null && other.getPmCriteriaSeq()==null) || 
             (this.pmCriteriaSeq!=null &&
              this.pmCriteriaSeq.equals(other.getPmCriteriaSeq())));
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
        if (getPmCriteriaGroupId() != null) {
            _hashCode += getPmCriteriaGroupId().hashCode();
        }
        if (getPmCriteriaSeq() != null) {
            _hashCode += getPmCriteriaSeq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PmCriteriaGroupDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmCriteriaGroupDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmCriteriaGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmCriteriaGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmCriteriaSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmCriteriaSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
