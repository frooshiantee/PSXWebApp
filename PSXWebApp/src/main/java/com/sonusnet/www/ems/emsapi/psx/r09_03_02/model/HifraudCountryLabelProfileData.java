/**
 * HifraudCountryLabelProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HifraudCountryLabelProfileData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String blockingProfileId;

    private java.lang.String nationalId;

    private java.lang.String countryId;

    private java.lang.Integer calltype;

    private java.lang.Integer userCalltype;

    private java.lang.Short tollIndication;

    public HifraudCountryLabelProfileData() {
    }

    public HifraudCountryLabelProfileData(
           java.lang.String blockingProfileId,
           java.lang.String nationalId,
           java.lang.String countryId,
           java.lang.Integer calltype,
           java.lang.Integer userCalltype,
           java.lang.Short tollIndication) {
        this.blockingProfileId = blockingProfileId;
        this.nationalId = nationalId;
        this.countryId = countryId;
        this.calltype = calltype;
        this.userCalltype = userCalltype;
        this.tollIndication = tollIndication;
    }


    /**
     * Gets the blockingProfileId value for this HifraudCountryLabelProfileData.
     * 
     * @return blockingProfileId
     */
    public java.lang.String getBlockingProfileId() {
        return blockingProfileId;
    }


    /**
     * Sets the blockingProfileId value for this HifraudCountryLabelProfileData.
     * 
     * @param blockingProfileId
     */
    public void setBlockingProfileId(java.lang.String blockingProfileId) {
        this.blockingProfileId = blockingProfileId;
    }


    /**
     * Gets the nationalId value for this HifraudCountryLabelProfileData.
     * 
     * @return nationalId
     */
    public java.lang.String getNationalId() {
        return nationalId;
    }


    /**
     * Sets the nationalId value for this HifraudCountryLabelProfileData.
     * 
     * @param nationalId
     */
    public void setNationalId(java.lang.String nationalId) {
        this.nationalId = nationalId;
    }


    /**
     * Gets the countryId value for this HifraudCountryLabelProfileData.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this HifraudCountryLabelProfileData.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the calltype value for this HifraudCountryLabelProfileData.
     * 
     * @return calltype
     */
    public java.lang.Integer getCalltype() {
        return calltype;
    }


    /**
     * Sets the calltype value for this HifraudCountryLabelProfileData.
     * 
     * @param calltype
     */
    public void setCalltype(java.lang.Integer calltype) {
        this.calltype = calltype;
    }


    /**
     * Gets the userCalltype value for this HifraudCountryLabelProfileData.
     * 
     * @return userCalltype
     */
    public java.lang.Integer getUserCalltype() {
        return userCalltype;
    }


    /**
     * Sets the userCalltype value for this HifraudCountryLabelProfileData.
     * 
     * @param userCalltype
     */
    public void setUserCalltype(java.lang.Integer userCalltype) {
        this.userCalltype = userCalltype;
    }


    /**
     * Gets the tollIndication value for this HifraudCountryLabelProfileData.
     * 
     * @return tollIndication
     */
    public java.lang.Short getTollIndication() {
        return tollIndication;
    }


    /**
     * Sets the tollIndication value for this HifraudCountryLabelProfileData.
     * 
     * @param tollIndication
     */
    public void setTollIndication(java.lang.Short tollIndication) {
        this.tollIndication = tollIndication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HifraudCountryLabelProfileData)) return false;
        HifraudCountryLabelProfileData other = (HifraudCountryLabelProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.blockingProfileId==null && other.getBlockingProfileId()==null) || 
             (this.blockingProfileId!=null &&
              this.blockingProfileId.equals(other.getBlockingProfileId()))) &&
            ((this.nationalId==null && other.getNationalId()==null) || 
             (this.nationalId!=null &&
              this.nationalId.equals(other.getNationalId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.calltype==null && other.getCalltype()==null) || 
             (this.calltype!=null &&
              this.calltype.equals(other.getCalltype()))) &&
            ((this.userCalltype==null && other.getUserCalltype()==null) || 
             (this.userCalltype!=null &&
              this.userCalltype.equals(other.getUserCalltype()))) &&
            ((this.tollIndication==null && other.getTollIndication()==null) || 
             (this.tollIndication!=null &&
              this.tollIndication.equals(other.getTollIndication())));
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
        if (getBlockingProfileId() != null) {
            _hashCode += getBlockingProfileId().hashCode();
        }
        if (getNationalId() != null) {
            _hashCode += getNationalId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getCalltype() != null) {
            _hashCode += getCalltype().hashCode();
        }
        if (getUserCalltype() != null) {
            _hashCode += getUserCalltype().hashCode();
        }
        if (getTollIndication() != null) {
            _hashCode += getTollIndication().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HifraudCountryLabelProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HifraudCountryLabelProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCalltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCalltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tollIndication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tollIndication"));
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
