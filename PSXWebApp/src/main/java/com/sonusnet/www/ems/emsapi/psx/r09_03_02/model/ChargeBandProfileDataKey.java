/**
 * ChargeBandProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ChargeBandProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String chargeBandProfileId;

    private java.lang.String calledCountryId;

    private java.lang.String calledNationalId;

    private java.lang.String callingCountryId;

    private java.lang.String callingNationalId;

    public ChargeBandProfileDataKey() {
    }

    public ChargeBandProfileDataKey(
           java.lang.String chargeBandProfileId,
           java.lang.String calledCountryId,
           java.lang.String calledNationalId,
           java.lang.String callingCountryId,
           java.lang.String callingNationalId) {
        this.chargeBandProfileId = chargeBandProfileId;
        this.calledCountryId = calledCountryId;
        this.calledNationalId = calledNationalId;
        this.callingCountryId = callingCountryId;
        this.callingNationalId = callingNationalId;
    }


    /**
     * Gets the chargeBandProfileId value for this ChargeBandProfileDataKey.
     * 
     * @return chargeBandProfileId
     */
    public java.lang.String getChargeBandProfileId() {
        return chargeBandProfileId;
    }


    /**
     * Sets the chargeBandProfileId value for this ChargeBandProfileDataKey.
     * 
     * @param chargeBandProfileId
     */
    public void setChargeBandProfileId(java.lang.String chargeBandProfileId) {
        this.chargeBandProfileId = chargeBandProfileId;
    }


    /**
     * Gets the calledCountryId value for this ChargeBandProfileDataKey.
     * 
     * @return calledCountryId
     */
    public java.lang.String getCalledCountryId() {
        return calledCountryId;
    }


    /**
     * Sets the calledCountryId value for this ChargeBandProfileDataKey.
     * 
     * @param calledCountryId
     */
    public void setCalledCountryId(java.lang.String calledCountryId) {
        this.calledCountryId = calledCountryId;
    }


    /**
     * Gets the calledNationalId value for this ChargeBandProfileDataKey.
     * 
     * @return calledNationalId
     */
    public java.lang.String getCalledNationalId() {
        return calledNationalId;
    }


    /**
     * Sets the calledNationalId value for this ChargeBandProfileDataKey.
     * 
     * @param calledNationalId
     */
    public void setCalledNationalId(java.lang.String calledNationalId) {
        this.calledNationalId = calledNationalId;
    }


    /**
     * Gets the callingCountryId value for this ChargeBandProfileDataKey.
     * 
     * @return callingCountryId
     */
    public java.lang.String getCallingCountryId() {
        return callingCountryId;
    }


    /**
     * Sets the callingCountryId value for this ChargeBandProfileDataKey.
     * 
     * @param callingCountryId
     */
    public void setCallingCountryId(java.lang.String callingCountryId) {
        this.callingCountryId = callingCountryId;
    }


    /**
     * Gets the callingNationalId value for this ChargeBandProfileDataKey.
     * 
     * @return callingNationalId
     */
    public java.lang.String getCallingNationalId() {
        return callingNationalId;
    }


    /**
     * Sets the callingNationalId value for this ChargeBandProfileDataKey.
     * 
     * @param callingNationalId
     */
    public void setCallingNationalId(java.lang.String callingNationalId) {
        this.callingNationalId = callingNationalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeBandProfileDataKey)) return false;
        ChargeBandProfileDataKey other = (ChargeBandProfileDataKey) obj;
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
              this.callingNationalId.equals(other.getCallingNationalId())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeBandProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeBandProfileDataKey"));
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
