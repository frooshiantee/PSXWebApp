/**
 * ForcedOffnetLocationKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ForcedOffnetLocationKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String businessGroupId;
    private java.lang.String fromBusinessLocationId;
    private java.lang.String toBusinessLocationId;

    public ForcedOffnetLocationKey() {
    }

    public ForcedOffnetLocationKey(
           java.lang.String businessGroupId,
           java.lang.String fromBusinessLocationId,
           java.lang.String toBusinessLocationId) {
           this.businessGroupId = businessGroupId;
           this.fromBusinessLocationId = fromBusinessLocationId;
           this.toBusinessLocationId = toBusinessLocationId;
    }


    /**
     * Gets the businessGroupId value for this ForcedOffnetLocationKey.
     * 
     * @return businessGroupId
     */
    public java.lang.String getBusinessGroupId() {
        return businessGroupId;
    }


    /**
     * Sets the businessGroupId value for this ForcedOffnetLocationKey.
     * 
     * @param businessGroupId
     */
    public void setBusinessGroupId(java.lang.String businessGroupId) {
        this.businessGroupId = businessGroupId;
    }


    /**
     * Gets the fromBusinessLocationId value for this ForcedOffnetLocationKey.
     * 
     * @return fromBusinessLocationId
     */
    public java.lang.String getFromBusinessLocationId() {
        return fromBusinessLocationId;
    }


    /**
     * Sets the fromBusinessLocationId value for this ForcedOffnetLocationKey.
     * 
     * @param fromBusinessLocationId
     */
    public void setFromBusinessLocationId(java.lang.String fromBusinessLocationId) {
        this.fromBusinessLocationId = fromBusinessLocationId;
    }


    /**
     * Gets the toBusinessLocationId value for this ForcedOffnetLocationKey.
     * 
     * @return toBusinessLocationId
     */
    public java.lang.String getToBusinessLocationId() {
        return toBusinessLocationId;
    }


    /**
     * Sets the toBusinessLocationId value for this ForcedOffnetLocationKey.
     * 
     * @param toBusinessLocationId
     */
    public void setToBusinessLocationId(java.lang.String toBusinessLocationId) {
        this.toBusinessLocationId = toBusinessLocationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForcedOffnetLocationKey)) return false;
        ForcedOffnetLocationKey other = (ForcedOffnetLocationKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessGroupId==null && other.getBusinessGroupId()==null) || 
             (this.businessGroupId!=null &&
              this.businessGroupId.equals(other.getBusinessGroupId()))) &&
            ((this.fromBusinessLocationId==null && other.getFromBusinessLocationId()==null) || 
             (this.fromBusinessLocationId!=null &&
              this.fromBusinessLocationId.equals(other.getFromBusinessLocationId()))) &&
            ((this.toBusinessLocationId==null && other.getToBusinessLocationId()==null) || 
             (this.toBusinessLocationId!=null &&
              this.toBusinessLocationId.equals(other.getToBusinessLocationId())));
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
        if (getBusinessGroupId() != null) {
            _hashCode += getBusinessGroupId().hashCode();
        }
        if (getFromBusinessLocationId() != null) {
            _hashCode += getFromBusinessLocationId().hashCode();
        }
        if (getToBusinessLocationId() != null) {
            _hashCode += getToBusinessLocationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForcedOffnetLocationKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ForcedOffnetLocationKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromBusinessLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromBusinessLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBusinessLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toBusinessLocationId"));
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
