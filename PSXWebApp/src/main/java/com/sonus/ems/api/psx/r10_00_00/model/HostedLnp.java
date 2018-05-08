/**
 * HostedLnp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HostedLnp  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Integer regionId;
    private java.lang.Integer lnpDataType;
    private java.lang.String nationalId;
    private java.lang.String countryId;
    private java.lang.Integer lnpDataId;
    private java.lang.String locationRoutingNumber;
    private java.lang.String serviceProviderId;
    private java.lang.String altSvcProviderId;
    private java.lang.String transactionId;

    public HostedLnp() {
    }

    public HostedLnp(
           java.lang.Integer regionId,
           java.lang.Integer lnpDataType,
           java.lang.String nationalId,
           java.lang.String countryId,
           java.lang.Integer lnpDataId,
           java.lang.String locationRoutingNumber,
           java.lang.String serviceProviderId,
           java.lang.String altSvcProviderId,
           java.lang.String transactionId) {
           this.regionId = regionId;
           this.lnpDataType = lnpDataType;
           this.nationalId = nationalId;
           this.countryId = countryId;
           this.lnpDataId = lnpDataId;
           this.locationRoutingNumber = locationRoutingNumber;
           this.serviceProviderId = serviceProviderId;
           this.altSvcProviderId = altSvcProviderId;
           this.transactionId = transactionId;
    }


    /**
     * Gets the regionId value for this HostedLnp.
     * 
     * @return regionId
     */
    public java.lang.Integer getRegionId() {
        return regionId;
    }


    /**
     * Sets the regionId value for this HostedLnp.
     * 
     * @param regionId
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }


    /**
     * Gets the lnpDataType value for this HostedLnp.
     * 
     * @return lnpDataType
     */
    public java.lang.Integer getLnpDataType() {
        return lnpDataType;
    }


    /**
     * Sets the lnpDataType value for this HostedLnp.
     * 
     * @param lnpDataType
     */
    public void setLnpDataType(java.lang.Integer lnpDataType) {
        this.lnpDataType = lnpDataType;
    }


    /**
     * Gets the nationalId value for this HostedLnp.
     * 
     * @return nationalId
     */
    public java.lang.String getNationalId() {
        return nationalId;
    }


    /**
     * Sets the nationalId value for this HostedLnp.
     * 
     * @param nationalId
     */
    public void setNationalId(java.lang.String nationalId) {
        this.nationalId = nationalId;
    }


    /**
     * Gets the countryId value for this HostedLnp.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this HostedLnp.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the lnpDataId value for this HostedLnp.
     * 
     * @return lnpDataId
     */
    public java.lang.Integer getLnpDataId() {
        return lnpDataId;
    }


    /**
     * Sets the lnpDataId value for this HostedLnp.
     * 
     * @param lnpDataId
     */
    public void setLnpDataId(java.lang.Integer lnpDataId) {
        this.lnpDataId = lnpDataId;
    }


    /**
     * Gets the locationRoutingNumber value for this HostedLnp.
     * 
     * @return locationRoutingNumber
     */
    public java.lang.String getLocationRoutingNumber() {
        return locationRoutingNumber;
    }


    /**
     * Sets the locationRoutingNumber value for this HostedLnp.
     * 
     * @param locationRoutingNumber
     */
    public void setLocationRoutingNumber(java.lang.String locationRoutingNumber) {
        this.locationRoutingNumber = locationRoutingNumber;
    }


    /**
     * Gets the serviceProviderId value for this HostedLnp.
     * 
     * @return serviceProviderId
     */
    public java.lang.String getServiceProviderId() {
        return serviceProviderId;
    }


    /**
     * Sets the serviceProviderId value for this HostedLnp.
     * 
     * @param serviceProviderId
     */
    public void setServiceProviderId(java.lang.String serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }


    /**
     * Gets the altSvcProviderId value for this HostedLnp.
     * 
     * @return altSvcProviderId
     */
    public java.lang.String getAltSvcProviderId() {
        return altSvcProviderId;
    }


    /**
     * Sets the altSvcProviderId value for this HostedLnp.
     * 
     * @param altSvcProviderId
     */
    public void setAltSvcProviderId(java.lang.String altSvcProviderId) {
        this.altSvcProviderId = altSvcProviderId;
    }


    /**
     * Gets the transactionId value for this HostedLnp.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this HostedLnp.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostedLnp)) return false;
        HostedLnp other = (HostedLnp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.regionId==null && other.getRegionId()==null) || 
             (this.regionId!=null &&
              this.regionId.equals(other.getRegionId()))) &&
            ((this.lnpDataType==null && other.getLnpDataType()==null) || 
             (this.lnpDataType!=null &&
              this.lnpDataType.equals(other.getLnpDataType()))) &&
            ((this.nationalId==null && other.getNationalId()==null) || 
             (this.nationalId!=null &&
              this.nationalId.equals(other.getNationalId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.lnpDataId==null && other.getLnpDataId()==null) || 
             (this.lnpDataId!=null &&
              this.lnpDataId.equals(other.getLnpDataId()))) &&
            ((this.locationRoutingNumber==null && other.getLocationRoutingNumber()==null) || 
             (this.locationRoutingNumber!=null &&
              this.locationRoutingNumber.equals(other.getLocationRoutingNumber()))) &&
            ((this.serviceProviderId==null && other.getServiceProviderId()==null) || 
             (this.serviceProviderId!=null &&
              this.serviceProviderId.equals(other.getServiceProviderId()))) &&
            ((this.altSvcProviderId==null && other.getAltSvcProviderId()==null) || 
             (this.altSvcProviderId!=null &&
              this.altSvcProviderId.equals(other.getAltSvcProviderId()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getRegionId() != null) {
            _hashCode += getRegionId().hashCode();
        }
        if (getLnpDataType() != null) {
            _hashCode += getLnpDataType().hashCode();
        }
        if (getNationalId() != null) {
            _hashCode += getNationalId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getLnpDataId() != null) {
            _hashCode += getLnpDataId().hashCode();
        }
        if (getLocationRoutingNumber() != null) {
            _hashCode += getLocationRoutingNumber().hashCode();
        }
        if (getServiceProviderId() != null) {
            _hashCode += getServiceProviderId().hashCode();
        }
        if (getAltSvcProviderId() != null) {
            _hashCode += getAltSvcProviderId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostedLnp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HostedLnp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lnpDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lnpDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("lnpDataId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lnpDataId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationRoutingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationRoutingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProviderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceProviderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSvcProviderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altSvcProviderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
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
