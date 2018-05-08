/**
 * DdiRangeProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class DdiRangeProfileData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String ddiRangeProfileId;

    private java.lang.String fromNumber;

    private java.lang.String toNumber;

    public DdiRangeProfileData() {
    }

    public DdiRangeProfileData(
           java.lang.String ddiRangeProfileId,
           java.lang.String fromNumber,
           java.lang.String toNumber) {
        this.ddiRangeProfileId = ddiRangeProfileId;
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
    }


    /**
     * Gets the ddiRangeProfileId value for this DdiRangeProfileData.
     * 
     * @return ddiRangeProfileId
     */
    public java.lang.String getDdiRangeProfileId() {
        return ddiRangeProfileId;
    }


    /**
     * Sets the ddiRangeProfileId value for this DdiRangeProfileData.
     * 
     * @param ddiRangeProfileId
     */
    public void setDdiRangeProfileId(java.lang.String ddiRangeProfileId) {
        this.ddiRangeProfileId = ddiRangeProfileId;
    }


    /**
     * Gets the fromNumber value for this DdiRangeProfileData.
     * 
     * @return fromNumber
     */
    public java.lang.String getFromNumber() {
        return fromNumber;
    }


    /**
     * Sets the fromNumber value for this DdiRangeProfileData.
     * 
     * @param fromNumber
     */
    public void setFromNumber(java.lang.String fromNumber) {
        this.fromNumber = fromNumber;
    }


    /**
     * Gets the toNumber value for this DdiRangeProfileData.
     * 
     * @return toNumber
     */
    public java.lang.String getToNumber() {
        return toNumber;
    }


    /**
     * Sets the toNumber value for this DdiRangeProfileData.
     * 
     * @param toNumber
     */
    public void setToNumber(java.lang.String toNumber) {
        this.toNumber = toNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DdiRangeProfileData)) return false;
        DdiRangeProfileData other = (DdiRangeProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ddiRangeProfileId==null && other.getDdiRangeProfileId()==null) || 
             (this.ddiRangeProfileId!=null &&
              this.ddiRangeProfileId.equals(other.getDdiRangeProfileId()))) &&
            ((this.fromNumber==null && other.getFromNumber()==null) || 
             (this.fromNumber!=null &&
              this.fromNumber.equals(other.getFromNumber()))) &&
            ((this.toNumber==null && other.getToNumber()==null) || 
             (this.toNumber!=null &&
              this.toNumber.equals(other.getToNumber())));
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
        if (getDdiRangeProfileId() != null) {
            _hashCode += getDdiRangeProfileId().hashCode();
        }
        if (getFromNumber() != null) {
            _hashCode += getFromNumber().hashCode();
        }
        if (getToNumber() != null) {
            _hashCode += getToNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DdiRangeProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DdiRangeProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddiRangeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ddiRangeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toNumber"));
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
