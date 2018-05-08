/**
 * HtrProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HtrProfileData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String htrProfileId;

    private java.lang.String nationalId;

    private java.lang.String countryId;

    private java.lang.Short natureOfAddress;

    private java.lang.String trafficControlProfileId;

    public HtrProfileData() {
    }

    public HtrProfileData(
           java.lang.String htrProfileId,
           java.lang.String nationalId,
           java.lang.String countryId,
           java.lang.Short natureOfAddress,
           java.lang.String trafficControlProfileId) {
        this.htrProfileId = htrProfileId;
        this.nationalId = nationalId;
        this.countryId = countryId;
        this.natureOfAddress = natureOfAddress;
        this.trafficControlProfileId = trafficControlProfileId;
    }


    /**
     * Gets the htrProfileId value for this HtrProfileData.
     * 
     * @return htrProfileId
     */
    public java.lang.String getHtrProfileId() {
        return htrProfileId;
    }


    /**
     * Sets the htrProfileId value for this HtrProfileData.
     * 
     * @param htrProfileId
     */
    public void setHtrProfileId(java.lang.String htrProfileId) {
        this.htrProfileId = htrProfileId;
    }


    /**
     * Gets the nationalId value for this HtrProfileData.
     * 
     * @return nationalId
     */
    public java.lang.String getNationalId() {
        return nationalId;
    }


    /**
     * Sets the nationalId value for this HtrProfileData.
     * 
     * @param nationalId
     */
    public void setNationalId(java.lang.String nationalId) {
        this.nationalId = nationalId;
    }


    /**
     * Gets the countryId value for this HtrProfileData.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this HtrProfileData.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the natureOfAddress value for this HtrProfileData.
     * 
     * @return natureOfAddress
     */
    public java.lang.Short getNatureOfAddress() {
        return natureOfAddress;
    }


    /**
     * Sets the natureOfAddress value for this HtrProfileData.
     * 
     * @param natureOfAddress
     */
    public void setNatureOfAddress(java.lang.Short natureOfAddress) {
        this.natureOfAddress = natureOfAddress;
    }


    /**
     * Gets the trafficControlProfileId value for this HtrProfileData.
     * 
     * @return trafficControlProfileId
     */
    public java.lang.String getTrafficControlProfileId() {
        return trafficControlProfileId;
    }


    /**
     * Sets the trafficControlProfileId value for this HtrProfileData.
     * 
     * @param trafficControlProfileId
     */
    public void setTrafficControlProfileId(java.lang.String trafficControlProfileId) {
        this.trafficControlProfileId = trafficControlProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HtrProfileData)) return false;
        HtrProfileData other = (HtrProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.htrProfileId==null && other.getHtrProfileId()==null) || 
             (this.htrProfileId!=null &&
              this.htrProfileId.equals(other.getHtrProfileId()))) &&
            ((this.nationalId==null && other.getNationalId()==null) || 
             (this.nationalId!=null &&
              this.nationalId.equals(other.getNationalId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.natureOfAddress==null && other.getNatureOfAddress()==null) || 
             (this.natureOfAddress!=null &&
              this.natureOfAddress.equals(other.getNatureOfAddress()))) &&
            ((this.trafficControlProfileId==null && other.getTrafficControlProfileId()==null) || 
             (this.trafficControlProfileId!=null &&
              this.trafficControlProfileId.equals(other.getTrafficControlProfileId())));
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
        if (getHtrProfileId() != null) {
            _hashCode += getHtrProfileId().hashCode();
        }
        if (getNationalId() != null) {
            _hashCode += getNationalId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getNatureOfAddress() != null) {
            _hashCode += getNatureOfAddress().hashCode();
        }
        if (getTrafficControlProfileId() != null) {
            _hashCode += getTrafficControlProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HtrProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HtrProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htrProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "htrProfileId"));
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
        elemField.setFieldName("natureOfAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natureOfAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficControlProfileId"));
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
