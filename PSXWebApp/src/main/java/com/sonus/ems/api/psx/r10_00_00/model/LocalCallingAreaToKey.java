/**
 * LocalCallingAreaToKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class LocalCallingAreaToKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String callingArea;
    private java.lang.Short localFlag;
    private java.lang.String toCallingArea;

    public LocalCallingAreaToKey() {
    }

    public LocalCallingAreaToKey(
           java.lang.String callingArea,
           java.lang.Short localFlag,
           java.lang.String toCallingArea) {
           this.callingArea = callingArea;
           this.localFlag = localFlag;
           this.toCallingArea = toCallingArea;
    }


    /**
     * Gets the callingArea value for this LocalCallingAreaToKey.
     * 
     * @return callingArea
     */
    public java.lang.String getCallingArea() {
        return callingArea;
    }


    /**
     * Sets the callingArea value for this LocalCallingAreaToKey.
     * 
     * @param callingArea
     */
    public void setCallingArea(java.lang.String callingArea) {
        this.callingArea = callingArea;
    }


    /**
     * Gets the localFlag value for this LocalCallingAreaToKey.
     * 
     * @return localFlag
     */
    public java.lang.Short getLocalFlag() {
        return localFlag;
    }


    /**
     * Sets the localFlag value for this LocalCallingAreaToKey.
     * 
     * @param localFlag
     */
    public void setLocalFlag(java.lang.Short localFlag) {
        this.localFlag = localFlag;
    }


    /**
     * Gets the toCallingArea value for this LocalCallingAreaToKey.
     * 
     * @return toCallingArea
     */
    public java.lang.String getToCallingArea() {
        return toCallingArea;
    }


    /**
     * Sets the toCallingArea value for this LocalCallingAreaToKey.
     * 
     * @param toCallingArea
     */
    public void setToCallingArea(java.lang.String toCallingArea) {
        this.toCallingArea = toCallingArea;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalCallingAreaToKey)) return false;
        LocalCallingAreaToKey other = (LocalCallingAreaToKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callingArea==null && other.getCallingArea()==null) || 
             (this.callingArea!=null &&
              this.callingArea.equals(other.getCallingArea()))) &&
            ((this.localFlag==null && other.getLocalFlag()==null) || 
             (this.localFlag!=null &&
              this.localFlag.equals(other.getLocalFlag()))) &&
            ((this.toCallingArea==null && other.getToCallingArea()==null) || 
             (this.toCallingArea!=null &&
              this.toCallingArea.equals(other.getToCallingArea())));
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
        if (getCallingArea() != null) {
            _hashCode += getCallingArea().hashCode();
        }
        if (getLocalFlag() != null) {
            _hashCode += getLocalFlag().hashCode();
        }
        if (getToCallingArea() != null) {
            _hashCode += getToCallingArea().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalCallingAreaToKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingAreaToKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCallingArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toCallingArea"));
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
