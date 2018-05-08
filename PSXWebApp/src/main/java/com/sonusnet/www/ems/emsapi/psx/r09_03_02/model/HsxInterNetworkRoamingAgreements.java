/**
 * HsxInterNetworkRoamingAgreements.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxInterNetworkRoamingAgreements  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String origNetworkId;

    private java.lang.String visitedNetworkId;

    private java.lang.Integer agreementInfo;

    public HsxInterNetworkRoamingAgreements() {
    }

    public HsxInterNetworkRoamingAgreements(
           java.lang.String origNetworkId,
           java.lang.String visitedNetworkId,
           java.lang.Integer agreementInfo) {
        this.origNetworkId = origNetworkId;
        this.visitedNetworkId = visitedNetworkId;
        this.agreementInfo = agreementInfo;
    }


    /**
     * Gets the origNetworkId value for this HsxInterNetworkRoamingAgreements.
     * 
     * @return origNetworkId
     */
    public java.lang.String getOrigNetworkId() {
        return origNetworkId;
    }


    /**
     * Sets the origNetworkId value for this HsxInterNetworkRoamingAgreements.
     * 
     * @param origNetworkId
     */
    public void setOrigNetworkId(java.lang.String origNetworkId) {
        this.origNetworkId = origNetworkId;
    }


    /**
     * Gets the visitedNetworkId value for this HsxInterNetworkRoamingAgreements.
     * 
     * @return visitedNetworkId
     */
    public java.lang.String getVisitedNetworkId() {
        return visitedNetworkId;
    }


    /**
     * Sets the visitedNetworkId value for this HsxInterNetworkRoamingAgreements.
     * 
     * @param visitedNetworkId
     */
    public void setVisitedNetworkId(java.lang.String visitedNetworkId) {
        this.visitedNetworkId = visitedNetworkId;
    }


    /**
     * Gets the agreementInfo value for this HsxInterNetworkRoamingAgreements.
     * 
     * @return agreementInfo
     */
    public java.lang.Integer getAgreementInfo() {
        return agreementInfo;
    }


    /**
     * Sets the agreementInfo value for this HsxInterNetworkRoamingAgreements.
     * 
     * @param agreementInfo
     */
    public void setAgreementInfo(java.lang.Integer agreementInfo) {
        this.agreementInfo = agreementInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxInterNetworkRoamingAgreements)) return false;
        HsxInterNetworkRoamingAgreements other = (HsxInterNetworkRoamingAgreements) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.origNetworkId==null && other.getOrigNetworkId()==null) || 
             (this.origNetworkId!=null &&
              this.origNetworkId.equals(other.getOrigNetworkId()))) &&
            ((this.visitedNetworkId==null && other.getVisitedNetworkId()==null) || 
             (this.visitedNetworkId!=null &&
              this.visitedNetworkId.equals(other.getVisitedNetworkId()))) &&
            ((this.agreementInfo==null && other.getAgreementInfo()==null) || 
             (this.agreementInfo!=null &&
              this.agreementInfo.equals(other.getAgreementInfo())));
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
        if (getOrigNetworkId() != null) {
            _hashCode += getOrigNetworkId().hashCode();
        }
        if (getVisitedNetworkId() != null) {
            _hashCode += getVisitedNetworkId().hashCode();
        }
        if (getAgreementInfo() != null) {
            _hashCode += getAgreementInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxInterNetworkRoamingAgreements.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxInterNetworkRoamingAgreements"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origNetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origNetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visitedNetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visitedNetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreementInfo"));
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
