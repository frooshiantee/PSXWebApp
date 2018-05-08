/**
 * ChargeBandProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ChargeBandProfileData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String chargeBandProfileId;
    private java.lang.String calledCountryId;
    private java.lang.String calledNationalId;
    private java.lang.String callingCountryId;
    private java.lang.String callingNationalId;
    private java.lang.Integer chargeBandId;
    private java.lang.String chargeRateProfileId;

    public ChargeBandProfileData() {
    }

    public ChargeBandProfileData(
           java.lang.String chargeBandProfileId,
           java.lang.String calledCountryId,
           java.lang.String calledNationalId,
           java.lang.String callingCountryId,
           java.lang.String callingNationalId,
           java.lang.Integer chargeBandId,
           java.lang.String chargeRateProfileId) {
           this.chargeBandProfileId = chargeBandProfileId;
           this.calledCountryId = calledCountryId;
           this.calledNationalId = calledNationalId;
           this.callingCountryId = callingCountryId;
           this.callingNationalId = callingNationalId;
           this.chargeBandId = chargeBandId;
           this.chargeRateProfileId = chargeRateProfileId;
    }


    /**
     * Gets the chargeBandProfileId value for this ChargeBandProfileData.
     * 
     * @return chargeBandProfileId
     */
    public java.lang.String getChargeBandProfileId() {
        return chargeBandProfileId;
    }


    /**
     * Sets the chargeBandProfileId value for this ChargeBandProfileData.
     * 
     * @param chargeBandProfileId
     */
    public void setChargeBandProfileId(java.lang.String chargeBandProfileId) {
        this.chargeBandProfileId = chargeBandProfileId;
    }


    /**
     * Gets the calledCountryId value for this ChargeBandProfileData.
     * 
     * @return calledCountryId
     */
    public java.lang.String getCalledCountryId() {
        return calledCountryId;
    }


    /**
     * Sets the calledCountryId value for this ChargeBandProfileData.
     * 
     * @param calledCountryId
     */
    public void setCalledCountryId(java.lang.String calledCountryId) {
        this.calledCountryId = calledCountryId;
    }


    /**
     * Gets the calledNationalId value for this ChargeBandProfileData.
     * 
     * @return calledNationalId
     */
    public java.lang.String getCalledNationalId() {
        return calledNationalId;
    }


    /**
     * Sets the calledNationalId value for this ChargeBandProfileData.
     * 
     * @param calledNationalId
     */
    public void setCalledNationalId(java.lang.String calledNationalId) {
        this.calledNationalId = calledNationalId;
    }


    /**
     * Gets the callingCountryId value for this ChargeBandProfileData.
     * 
     * @return callingCountryId
     */
    public java.lang.String getCallingCountryId() {
        return callingCountryId;
    }


    /**
     * Sets the callingCountryId value for this ChargeBandProfileData.
     * 
     * @param callingCountryId
     */
    public void setCallingCountryId(java.lang.String callingCountryId) {
        this.callingCountryId = callingCountryId;
    }


    /**
     * Gets the callingNationalId value for this ChargeBandProfileData.
     * 
     * @return callingNationalId
     */
    public java.lang.String getCallingNationalId() {
        return callingNationalId;
    }


    /**
     * Sets the callingNationalId value for this ChargeBandProfileData.
     * 
     * @param callingNationalId
     */
    public void setCallingNationalId(java.lang.String callingNationalId) {
        this.callingNationalId = callingNationalId;
    }


    /**
     * Gets the chargeBandId value for this ChargeBandProfileData.
     * 
     * @return chargeBandId
     */
    public java.lang.Integer getChargeBandId() {
        return chargeBandId;
    }


    /**
     * Sets the chargeBandId value for this ChargeBandProfileData.
     * 
     * @param chargeBandId
     */
    public void setChargeBandId(java.lang.Integer chargeBandId) {
        this.chargeBandId = chargeBandId;
    }


    /**
     * Gets the chargeRateProfileId value for this ChargeBandProfileData.
     * 
     * @return chargeRateProfileId
     */
    public java.lang.String getChargeRateProfileId() {
        return chargeRateProfileId;
    }


    /**
     * Sets the chargeRateProfileId value for this ChargeBandProfileData.
     * 
     * @param chargeRateProfileId
     */
    public void setChargeRateProfileId(java.lang.String chargeRateProfileId) {
        this.chargeRateProfileId = chargeRateProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeBandProfileData)) return false;
        ChargeBandProfileData other = (ChargeBandProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.chargeBandProfileId==null && other.getChargeBandProfileId()==null) || 
             (this.chargeBandProfileId!=null &&
              this.chargeBandProfileId.equals(other.getChargeBandProfileId()))) &&
            ((this.calledCountryId==null && other.getCalledCountryId()==null) || 
             (this.calledCountryId!=null &&
              this.calledCountryId.equals(other.getCalledCountryId()))) &&
            ((this.calledNationalId==null && other.getCalledNationalId()==null) || 
             (this.calledNationalId!=null &&
              this.calledNationalId.equals(other.getCalledNationalId()))) &&
            ((this.callingCountryId==null && other.getCallingCountryId()==null) || 
             (this.callingCountryId!=null &&
              this.callingCountryId.equals(other.getCallingCountryId()))) &&
            ((this.callingNationalId==null && other.getCallingNationalId()==null) || 
             (this.callingNationalId!=null &&
              this.callingNationalId.equals(other.getCallingNationalId()))) &&
            ((this.chargeBandId==null && other.getChargeBandId()==null) || 
             (this.chargeBandId!=null &&
              this.chargeBandId.equals(other.getChargeBandId()))) &&
            ((this.chargeRateProfileId==null && other.getChargeRateProfileId()==null) || 
             (this.chargeRateProfileId!=null &&
              this.chargeRateProfileId.equals(other.getChargeRateProfileId())));
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
        if (getChargeBandProfileId() != null) {
            _hashCode += getChargeBandProfileId().hashCode();
        }
        if (getCalledCountryId() != null) {
            _hashCode += getCalledCountryId().hashCode();
        }
        if (getCalledNationalId() != null) {
            _hashCode += getCalledNationalId().hashCode();
        }
        if (getCallingCountryId() != null) {
            _hashCode += getCallingCountryId().hashCode();
        }
        if (getCallingNationalId() != null) {
            _hashCode += getCallingNationalId().hashCode();
        }
        if (getChargeBandId() != null) {
            _hashCode += getChargeBandId().hashCode();
        }
        if (getChargeRateProfileId() != null) {
            _hashCode += getChargeRateProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeBandProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeBandProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeBandProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeBandProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledCountryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledCountryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledNationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingCountryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingCountryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeBandId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeBandId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeRateProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeRateProfileId"));
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
