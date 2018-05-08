/**
 * HsxChargingInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxChargingInformation  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String chargingInfoId;

    private java.lang.String primaryEventFunction;

    private java.lang.String secondaryEventFunction;

    private java.lang.String primaryChargingCollFunction;

    private java.lang.String secondaryChargingCollFunction;

    public HsxChargingInformation() {
    }

    public HsxChargingInformation(
           java.lang.String chargingInfoId,
           java.lang.String primaryEventFunction,
           java.lang.String secondaryEventFunction,
           java.lang.String primaryChargingCollFunction,
           java.lang.String secondaryChargingCollFunction) {
        this.chargingInfoId = chargingInfoId;
        this.primaryEventFunction = primaryEventFunction;
        this.secondaryEventFunction = secondaryEventFunction;
        this.primaryChargingCollFunction = primaryChargingCollFunction;
        this.secondaryChargingCollFunction = secondaryChargingCollFunction;
    }


    /**
     * Gets the chargingInfoId value for this HsxChargingInformation.
     * 
     * @return chargingInfoId
     */
    public java.lang.String getChargingInfoId() {
        return chargingInfoId;
    }


    /**
     * Sets the chargingInfoId value for this HsxChargingInformation.
     * 
     * @param chargingInfoId
     */
    public void setChargingInfoId(java.lang.String chargingInfoId) {
        this.chargingInfoId = chargingInfoId;
    }


    /**
     * Gets the primaryEventFunction value for this HsxChargingInformation.
     * 
     * @return primaryEventFunction
     */
    public java.lang.String getPrimaryEventFunction() {
        return primaryEventFunction;
    }


    /**
     * Sets the primaryEventFunction value for this HsxChargingInformation.
     * 
     * @param primaryEventFunction
     */
    public void setPrimaryEventFunction(java.lang.String primaryEventFunction) {
        this.primaryEventFunction = primaryEventFunction;
    }


    /**
     * Gets the secondaryEventFunction value for this HsxChargingInformation.
     * 
     * @return secondaryEventFunction
     */
    public java.lang.String getSecondaryEventFunction() {
        return secondaryEventFunction;
    }


    /**
     * Sets the secondaryEventFunction value for this HsxChargingInformation.
     * 
     * @param secondaryEventFunction
     */
    public void setSecondaryEventFunction(java.lang.String secondaryEventFunction) {
        this.secondaryEventFunction = secondaryEventFunction;
    }


    /**
     * Gets the primaryChargingCollFunction value for this HsxChargingInformation.
     * 
     * @return primaryChargingCollFunction
     */
    public java.lang.String getPrimaryChargingCollFunction() {
        return primaryChargingCollFunction;
    }


    /**
     * Sets the primaryChargingCollFunction value for this HsxChargingInformation.
     * 
     * @param primaryChargingCollFunction
     */
    public void setPrimaryChargingCollFunction(java.lang.String primaryChargingCollFunction) {
        this.primaryChargingCollFunction = primaryChargingCollFunction;
    }


    /**
     * Gets the secondaryChargingCollFunction value for this HsxChargingInformation.
     * 
     * @return secondaryChargingCollFunction
     */
    public java.lang.String getSecondaryChargingCollFunction() {
        return secondaryChargingCollFunction;
    }


    /**
     * Sets the secondaryChargingCollFunction value for this HsxChargingInformation.
     * 
     * @param secondaryChargingCollFunction
     */
    public void setSecondaryChargingCollFunction(java.lang.String secondaryChargingCollFunction) {
        this.secondaryChargingCollFunction = secondaryChargingCollFunction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxChargingInformation)) return false;
        HsxChargingInformation other = (HsxChargingInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.chargingInfoId==null && other.getChargingInfoId()==null) || 
             (this.chargingInfoId!=null &&
              this.chargingInfoId.equals(other.getChargingInfoId()))) &&
            ((this.primaryEventFunction==null && other.getPrimaryEventFunction()==null) || 
             (this.primaryEventFunction!=null &&
              this.primaryEventFunction.equals(other.getPrimaryEventFunction()))) &&
            ((this.secondaryEventFunction==null && other.getSecondaryEventFunction()==null) || 
             (this.secondaryEventFunction!=null &&
              this.secondaryEventFunction.equals(other.getSecondaryEventFunction()))) &&
            ((this.primaryChargingCollFunction==null && other.getPrimaryChargingCollFunction()==null) || 
             (this.primaryChargingCollFunction!=null &&
              this.primaryChargingCollFunction.equals(other.getPrimaryChargingCollFunction()))) &&
            ((this.secondaryChargingCollFunction==null && other.getSecondaryChargingCollFunction()==null) || 
             (this.secondaryChargingCollFunction!=null &&
              this.secondaryChargingCollFunction.equals(other.getSecondaryChargingCollFunction())));
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
        if (getChargingInfoId() != null) {
            _hashCode += getChargingInfoId().hashCode();
        }
        if (getPrimaryEventFunction() != null) {
            _hashCode += getPrimaryEventFunction().hashCode();
        }
        if (getSecondaryEventFunction() != null) {
            _hashCode += getSecondaryEventFunction().hashCode();
        }
        if (getPrimaryChargingCollFunction() != null) {
            _hashCode += getPrimaryChargingCollFunction().hashCode();
        }
        if (getSecondaryChargingCollFunction() != null) {
            _hashCode += getSecondaryChargingCollFunction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxChargingInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxChargingInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargingInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryEventFunction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryEventFunction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryEventFunction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondaryEventFunction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryChargingCollFunction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryChargingCollFunction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryChargingCollFunction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondaryChargingCollFunction"));
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
