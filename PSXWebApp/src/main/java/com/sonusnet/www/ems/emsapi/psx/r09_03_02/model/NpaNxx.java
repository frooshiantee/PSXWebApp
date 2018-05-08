/**
 * NpaNxx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class NpaNxx  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String carrierId;

    private java.lang.String countryId;

    private java.lang.String nationalId;

    private java.lang.String lataId;

    private java.lang.String regionId;

    private java.lang.Short portedFlag;

    private java.lang.String rateCenter;

    private java.lang.Short lookupType;

    private java.lang.String primaryMtaId;

    private java.lang.String secondaryMtaId;

    public NpaNxx() {
    }

    public NpaNxx(
           java.lang.String carrierId,
           java.lang.String countryId,
           java.lang.String nationalId,
           java.lang.String lataId,
           java.lang.String regionId,
           java.lang.Short portedFlag,
           java.lang.String rateCenter,
           java.lang.Short lookupType,
           java.lang.String primaryMtaId,
           java.lang.String secondaryMtaId) {
        this.carrierId = carrierId;
        this.countryId = countryId;
        this.nationalId = nationalId;
        this.lataId = lataId;
        this.regionId = regionId;
        this.portedFlag = portedFlag;
        this.rateCenter = rateCenter;
        this.lookupType = lookupType;
        this.primaryMtaId = primaryMtaId;
        this.secondaryMtaId = secondaryMtaId;
    }


    /**
     * Gets the carrierId value for this NpaNxx.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this NpaNxx.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the countryId value for this NpaNxx.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this NpaNxx.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the nationalId value for this NpaNxx.
     * 
     * @return nationalId
     */
    public java.lang.String getNationalId() {
        return nationalId;
    }


    /**
     * Sets the nationalId value for this NpaNxx.
     * 
     * @param nationalId
     */
    public void setNationalId(java.lang.String nationalId) {
        this.nationalId = nationalId;
    }


    /**
     * Gets the lataId value for this NpaNxx.
     * 
     * @return lataId
     */
    public java.lang.String getLataId() {
        return lataId;
    }


    /**
     * Sets the lataId value for this NpaNxx.
     * 
     * @param lataId
     */
    public void setLataId(java.lang.String lataId) {
        this.lataId = lataId;
    }


    /**
     * Gets the regionId value for this NpaNxx.
     * 
     * @return regionId
     */
    public java.lang.String getRegionId() {
        return regionId;
    }


    /**
     * Sets the regionId value for this NpaNxx.
     * 
     * @param regionId
     */
    public void setRegionId(java.lang.String regionId) {
        this.regionId = regionId;
    }


    /**
     * Gets the portedFlag value for this NpaNxx.
     * 
     * @return portedFlag
     */
    public java.lang.Short getPortedFlag() {
        return portedFlag;
    }


    /**
     * Sets the portedFlag value for this NpaNxx.
     * 
     * @param portedFlag
     */
    public void setPortedFlag(java.lang.Short portedFlag) {
        this.portedFlag = portedFlag;
    }


    /**
     * Gets the rateCenter value for this NpaNxx.
     * 
     * @return rateCenter
     */
    public java.lang.String getRateCenter() {
        return rateCenter;
    }


    /**
     * Sets the rateCenter value for this NpaNxx.
     * 
     * @param rateCenter
     */
    public void setRateCenter(java.lang.String rateCenter) {
        this.rateCenter = rateCenter;
    }


    /**
     * Gets the lookupType value for this NpaNxx.
     * 
     * @return lookupType
     */
    public java.lang.Short getLookupType() {
        return lookupType;
    }


    /**
     * Sets the lookupType value for this NpaNxx.
     * 
     * @param lookupType
     */
    public void setLookupType(java.lang.Short lookupType) {
        this.lookupType = lookupType;
    }


    /**
     * Gets the primaryMtaId value for this NpaNxx.
     * 
     * @return primaryMtaId
     */
    public java.lang.String getPrimaryMtaId() {
        return primaryMtaId;
    }


    /**
     * Sets the primaryMtaId value for this NpaNxx.
     * 
     * @param primaryMtaId
     */
    public void setPrimaryMtaId(java.lang.String primaryMtaId) {
        this.primaryMtaId = primaryMtaId;
    }


    /**
     * Gets the secondaryMtaId value for this NpaNxx.
     * 
     * @return secondaryMtaId
     */
    public java.lang.String getSecondaryMtaId() {
        return secondaryMtaId;
    }


    /**
     * Sets the secondaryMtaId value for this NpaNxx.
     * 
     * @param secondaryMtaId
     */
    public void setSecondaryMtaId(java.lang.String secondaryMtaId) {
        this.secondaryMtaId = secondaryMtaId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NpaNxx)) return false;
        NpaNxx other = (NpaNxx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.nationalId==null && other.getNationalId()==null) || 
             (this.nationalId!=null &&
              this.nationalId.equals(other.getNationalId()))) &&
            ((this.lataId==null && other.getLataId()==null) || 
             (this.lataId!=null &&
              this.lataId.equals(other.getLataId()))) &&
            ((this.regionId==null && other.getRegionId()==null) || 
             (this.regionId!=null &&
              this.regionId.equals(other.getRegionId()))) &&
            ((this.portedFlag==null && other.getPortedFlag()==null) || 
             (this.portedFlag!=null &&
              this.portedFlag.equals(other.getPortedFlag()))) &&
            ((this.rateCenter==null && other.getRateCenter()==null) || 
             (this.rateCenter!=null &&
              this.rateCenter.equals(other.getRateCenter()))) &&
            ((this.lookupType==null && other.getLookupType()==null) || 
             (this.lookupType!=null &&
              this.lookupType.equals(other.getLookupType()))) &&
            ((this.primaryMtaId==null && other.getPrimaryMtaId()==null) || 
             (this.primaryMtaId!=null &&
              this.primaryMtaId.equals(other.getPrimaryMtaId()))) &&
            ((this.secondaryMtaId==null && other.getSecondaryMtaId()==null) || 
             (this.secondaryMtaId!=null &&
              this.secondaryMtaId.equals(other.getSecondaryMtaId())));
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
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getNationalId() != null) {
            _hashCode += getNationalId().hashCode();
        }
        if (getLataId() != null) {
            _hashCode += getLataId().hashCode();
        }
        if (getRegionId() != null) {
            _hashCode += getRegionId().hashCode();
        }
        if (getPortedFlag() != null) {
            _hashCode += getPortedFlag().hashCode();
        }
        if (getRateCenter() != null) {
            _hashCode += getRateCenter().hashCode();
        }
        if (getLookupType() != null) {
            _hashCode += getLookupType().hashCode();
        }
        if (getPrimaryMtaId() != null) {
            _hashCode += getPrimaryMtaId().hashCode();
        }
        if (getSecondaryMtaId() != null) {
            _hashCode += getSecondaryMtaId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NpaNxx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NpaNxx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierId"));
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
        elemField.setFieldName("nationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lataId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lataId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lookupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryMtaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryMtaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryMtaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondaryMtaId"));
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
