/**
 * HsxRepositoryData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxRepositoryData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String publicUserId;

    private java.lang.String serviceIndication;

    private java.lang.String serviceData;

    private java.lang.Integer serviceDataSequenceNumber;

    private java.lang.Integer isAliasesData;

    public HsxRepositoryData() {
    }

    public HsxRepositoryData(
           java.lang.String publicUserId,
           java.lang.String serviceIndication,
           java.lang.String serviceData,
           java.lang.Integer serviceDataSequenceNumber,
           java.lang.Integer isAliasesData) {
        this.publicUserId = publicUserId;
        this.serviceIndication = serviceIndication;
        this.serviceData = serviceData;
        this.serviceDataSequenceNumber = serviceDataSequenceNumber;
        this.isAliasesData = isAliasesData;
    }


    /**
     * Gets the publicUserId value for this HsxRepositoryData.
     * 
     * @return publicUserId
     */
    public java.lang.String getPublicUserId() {
        return publicUserId;
    }


    /**
     * Sets the publicUserId value for this HsxRepositoryData.
     * 
     * @param publicUserId
     */
    public void setPublicUserId(java.lang.String publicUserId) {
        this.publicUserId = publicUserId;
    }


    /**
     * Gets the serviceIndication value for this HsxRepositoryData.
     * 
     * @return serviceIndication
     */
    public java.lang.String getServiceIndication() {
        return serviceIndication;
    }


    /**
     * Sets the serviceIndication value for this HsxRepositoryData.
     * 
     * @param serviceIndication
     */
    public void setServiceIndication(java.lang.String serviceIndication) {
        this.serviceIndication = serviceIndication;
    }


    /**
     * Gets the serviceData value for this HsxRepositoryData.
     * 
     * @return serviceData
     */
    public java.lang.String getServiceData() {
        return serviceData;
    }


    /**
     * Sets the serviceData value for this HsxRepositoryData.
     * 
     * @param serviceData
     */
    public void setServiceData(java.lang.String serviceData) {
        this.serviceData = serviceData;
    }


    /**
     * Gets the serviceDataSequenceNumber value for this HsxRepositoryData.
     * 
     * @return serviceDataSequenceNumber
     */
    public java.lang.Integer getServiceDataSequenceNumber() {
        return serviceDataSequenceNumber;
    }


    /**
     * Sets the serviceDataSequenceNumber value for this HsxRepositoryData.
     * 
     * @param serviceDataSequenceNumber
     */
    public void setServiceDataSequenceNumber(java.lang.Integer serviceDataSequenceNumber) {
        this.serviceDataSequenceNumber = serviceDataSequenceNumber;
    }


    /**
     * Gets the isAliasesData value for this HsxRepositoryData.
     * 
     * @return isAliasesData
     */
    public java.lang.Integer getIsAliasesData() {
        return isAliasesData;
    }


    /**
     * Sets the isAliasesData value for this HsxRepositoryData.
     * 
     * @param isAliasesData
     */
    public void setIsAliasesData(java.lang.Integer isAliasesData) {
        this.isAliasesData = isAliasesData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxRepositoryData)) return false;
        HsxRepositoryData other = (HsxRepositoryData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.publicUserId==null && other.getPublicUserId()==null) || 
             (this.publicUserId!=null &&
              this.publicUserId.equals(other.getPublicUserId()))) &&
            ((this.serviceIndication==null && other.getServiceIndication()==null) || 
             (this.serviceIndication!=null &&
              this.serviceIndication.equals(other.getServiceIndication()))) &&
            ((this.serviceData==null && other.getServiceData()==null) || 
             (this.serviceData!=null &&
              this.serviceData.equals(other.getServiceData()))) &&
            ((this.serviceDataSequenceNumber==null && other.getServiceDataSequenceNumber()==null) || 
             (this.serviceDataSequenceNumber!=null &&
              this.serviceDataSequenceNumber.equals(other.getServiceDataSequenceNumber()))) &&
            ((this.isAliasesData==null && other.getIsAliasesData()==null) || 
             (this.isAliasesData!=null &&
              this.isAliasesData.equals(other.getIsAliasesData())));
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
        if (getPublicUserId() != null) {
            _hashCode += getPublicUserId().hashCode();
        }
        if (getServiceIndication() != null) {
            _hashCode += getServiceIndication().hashCode();
        }
        if (getServiceData() != null) {
            _hashCode += getServiceData().hashCode();
        }
        if (getServiceDataSequenceNumber() != null) {
            _hashCode += getServiceDataSequenceNumber().hashCode();
        }
        if (getIsAliasesData() != null) {
            _hashCode += getIsAliasesData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxRepositoryData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxRepositoryData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceIndication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceIndication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDataSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceDataSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAliasesData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isAliasesData"));
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
