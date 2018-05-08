/**
 * HsxIfcSetUsageData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxIfcSetUsageData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String serviceProfileId;

    private java.lang.Integer ifcSet;

    private java.lang.Integer usage;

    public HsxIfcSetUsageData() {
    }

    public HsxIfcSetUsageData(
           java.lang.String serviceProfileId,
           java.lang.Integer ifcSet,
           java.lang.Integer usage) {
        this.serviceProfileId = serviceProfileId;
        this.ifcSet = ifcSet;
        this.usage = usage;
    }


    /**
     * Gets the serviceProfileId value for this HsxIfcSetUsageData.
     * 
     * @return serviceProfileId
     */
    public java.lang.String getServiceProfileId() {
        return serviceProfileId;
    }


    /**
     * Sets the serviceProfileId value for this HsxIfcSetUsageData.
     * 
     * @param serviceProfileId
     */
    public void setServiceProfileId(java.lang.String serviceProfileId) {
        this.serviceProfileId = serviceProfileId;
    }


    /**
     * Gets the ifcSet value for this HsxIfcSetUsageData.
     * 
     * @return ifcSet
     */
    public java.lang.Integer getIfcSet() {
        return ifcSet;
    }


    /**
     * Sets the ifcSet value for this HsxIfcSetUsageData.
     * 
     * @param ifcSet
     */
    public void setIfcSet(java.lang.Integer ifcSet) {
        this.ifcSet = ifcSet;
    }


    /**
     * Gets the usage value for this HsxIfcSetUsageData.
     * 
     * @return usage
     */
    public java.lang.Integer getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this HsxIfcSetUsageData.
     * 
     * @param usage
     */
    public void setUsage(java.lang.Integer usage) {
        this.usage = usage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxIfcSetUsageData)) return false;
        HsxIfcSetUsageData other = (HsxIfcSetUsageData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceProfileId==null && other.getServiceProfileId()==null) || 
             (this.serviceProfileId!=null &&
              this.serviceProfileId.equals(other.getServiceProfileId()))) &&
            ((this.ifcSet==null && other.getIfcSet()==null) || 
             (this.ifcSet!=null &&
              this.ifcSet.equals(other.getIfcSet()))) &&
            ((this.usage==null && other.getUsage()==null) || 
             (this.usage!=null &&
              this.usage.equals(other.getUsage())));
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
        if (getServiceProfileId() != null) {
            _hashCode += getServiceProfileId().hashCode();
        }
        if (getIfcSet() != null) {
            _hashCode += getIfcSet().hashCode();
        }
        if (getUsage() != null) {
            _hashCode += getUsage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxIfcSetUsageData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxIfcSetUsageData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifcSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifcSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usage"));
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
