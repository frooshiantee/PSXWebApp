/**
 * HsxMsisdn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxMsisdn  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String publicUserId;

    private java.lang.String psLocationInfoId;

    private java.lang.String csLocationInfoId;

    private java.lang.Integer psUserState;

    private java.lang.Integer csUserState;

    public HsxMsisdn() {
    }

    public HsxMsisdn(
           java.lang.String msisdn,
           java.lang.String publicUserId,
           java.lang.String psLocationInfoId,
           java.lang.String csLocationInfoId,
           java.lang.Integer psUserState,
           java.lang.Integer csUserState) {
        this.msisdn = msisdn;
        this.publicUserId = publicUserId;
        this.psLocationInfoId = psLocationInfoId;
        this.csLocationInfoId = csLocationInfoId;
        this.psUserState = psUserState;
        this.csUserState = csUserState;
    }


    /**
     * Gets the msisdn value for this HsxMsisdn.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this HsxMsisdn.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the publicUserId value for this HsxMsisdn.
     * 
     * @return publicUserId
     */
    public java.lang.String getPublicUserId() {
        return publicUserId;
    }


    /**
     * Sets the publicUserId value for this HsxMsisdn.
     * 
     * @param publicUserId
     */
    public void setPublicUserId(java.lang.String publicUserId) {
        this.publicUserId = publicUserId;
    }


    /**
     * Gets the psLocationInfoId value for this HsxMsisdn.
     * 
     * @return psLocationInfoId
     */
    public java.lang.String getPsLocationInfoId() {
        return psLocationInfoId;
    }


    /**
     * Sets the psLocationInfoId value for this HsxMsisdn.
     * 
     * @param psLocationInfoId
     */
    public void setPsLocationInfoId(java.lang.String psLocationInfoId) {
        this.psLocationInfoId = psLocationInfoId;
    }


    /**
     * Gets the csLocationInfoId value for this HsxMsisdn.
     * 
     * @return csLocationInfoId
     */
    public java.lang.String getCsLocationInfoId() {
        return csLocationInfoId;
    }


    /**
     * Sets the csLocationInfoId value for this HsxMsisdn.
     * 
     * @param csLocationInfoId
     */
    public void setCsLocationInfoId(java.lang.String csLocationInfoId) {
        this.csLocationInfoId = csLocationInfoId;
    }


    /**
     * Gets the psUserState value for this HsxMsisdn.
     * 
     * @return psUserState
     */
    public java.lang.Integer getPsUserState() {
        return psUserState;
    }


    /**
     * Sets the psUserState value for this HsxMsisdn.
     * 
     * @param psUserState
     */
    public void setPsUserState(java.lang.Integer psUserState) {
        this.psUserState = psUserState;
    }


    /**
     * Gets the csUserState value for this HsxMsisdn.
     * 
     * @return csUserState
     */
    public java.lang.Integer getCsUserState() {
        return csUserState;
    }


    /**
     * Sets the csUserState value for this HsxMsisdn.
     * 
     * @param csUserState
     */
    public void setCsUserState(java.lang.Integer csUserState) {
        this.csUserState = csUserState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxMsisdn)) return false;
        HsxMsisdn other = (HsxMsisdn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.publicUserId==null && other.getPublicUserId()==null) || 
             (this.publicUserId!=null &&
              this.publicUserId.equals(other.getPublicUserId()))) &&
            ((this.psLocationInfoId==null && other.getPsLocationInfoId()==null) || 
             (this.psLocationInfoId!=null &&
              this.psLocationInfoId.equals(other.getPsLocationInfoId()))) &&
            ((this.csLocationInfoId==null && other.getCsLocationInfoId()==null) || 
             (this.csLocationInfoId!=null &&
              this.csLocationInfoId.equals(other.getCsLocationInfoId()))) &&
            ((this.psUserState==null && other.getPsUserState()==null) || 
             (this.psUserState!=null &&
              this.psUserState.equals(other.getPsUserState()))) &&
            ((this.csUserState==null && other.getCsUserState()==null) || 
             (this.csUserState!=null &&
              this.csUserState.equals(other.getCsUserState())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getPublicUserId() != null) {
            _hashCode += getPublicUserId().hashCode();
        }
        if (getPsLocationInfoId() != null) {
            _hashCode += getPsLocationInfoId().hashCode();
        }
        if (getCsLocationInfoId() != null) {
            _hashCode += getCsLocationInfoId().hashCode();
        }
        if (getPsUserState() != null) {
            _hashCode += getPsUserState().hashCode();
        }
        if (getCsUserState() != null) {
            _hashCode += getCsUserState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxMsisdn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxMsisdn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psLocationInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "psLocationInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csLocationInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csLocationInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psUserState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "psUserState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csUserState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csUserState"));
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
