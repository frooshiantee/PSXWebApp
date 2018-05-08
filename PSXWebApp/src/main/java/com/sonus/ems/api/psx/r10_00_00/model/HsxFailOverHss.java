/**
 * HsxFailOverHss.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxFailOverHss  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String hssId;
    private java.lang.String failOverHssId;

    public HsxFailOverHss() {
    }

    public HsxFailOverHss(
           java.lang.String hssId,
           java.lang.String failOverHssId) {
           this.hssId = hssId;
           this.failOverHssId = failOverHssId;
    }


    /**
     * Gets the hssId value for this HsxFailOverHss.
     * 
     * @return hssId
     */
    public java.lang.String getHssId() {
        return hssId;
    }


    /**
     * Sets the hssId value for this HsxFailOverHss.
     * 
     * @param hssId
     */
    public void setHssId(java.lang.String hssId) {
        this.hssId = hssId;
    }


    /**
     * Gets the failOverHssId value for this HsxFailOverHss.
     * 
     * @return failOverHssId
     */
    public java.lang.String getFailOverHssId() {
        return failOverHssId;
    }


    /**
     * Sets the failOverHssId value for this HsxFailOverHss.
     * 
     * @param failOverHssId
     */
    public void setFailOverHssId(java.lang.String failOverHssId) {
        this.failOverHssId = failOverHssId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxFailOverHss)) return false;
        HsxFailOverHss other = (HsxFailOverHss) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hssId==null && other.getHssId()==null) || 
             (this.hssId!=null &&
              this.hssId.equals(other.getHssId()))) &&
            ((this.failOverHssId==null && other.getFailOverHssId()==null) || 
             (this.failOverHssId!=null &&
              this.failOverHssId.equals(other.getFailOverHssId())));
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
        if (getHssId() != null) {
            _hashCode += getHssId().hashCode();
        }
        if (getFailOverHssId() != null) {
            _hashCode += getFailOverHssId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxFailOverHss.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxFailOverHss"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hssId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hssId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failOverHssId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failOverHssId"));
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
