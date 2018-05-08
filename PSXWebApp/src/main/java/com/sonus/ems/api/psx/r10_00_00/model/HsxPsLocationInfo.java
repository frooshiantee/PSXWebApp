/**
 * HsxPsLocationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxPsLocationInfo  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String psLocationInfoId;
    private java.lang.String globalCellId;
    private java.lang.String serviceAreaId;
    private java.lang.String locationAreaId;
    private java.lang.String routingAreaId;
    private java.lang.String geographicalInfoId;
    private java.lang.String geodeticInfoId;
    private java.lang.Integer ageOfLocationInfo;
    private java.lang.Integer currentLocationRetrieved;
    private java.lang.String sgsnNumber;

    public HsxPsLocationInfo() {
    }

    public HsxPsLocationInfo(
           java.lang.String psLocationInfoId,
           java.lang.String globalCellId,
           java.lang.String serviceAreaId,
           java.lang.String locationAreaId,
           java.lang.String routingAreaId,
           java.lang.String geographicalInfoId,
           java.lang.String geodeticInfoId,
           java.lang.Integer ageOfLocationInfo,
           java.lang.Integer currentLocationRetrieved,
           java.lang.String sgsnNumber) {
           this.psLocationInfoId = psLocationInfoId;
           this.globalCellId = globalCellId;
           this.serviceAreaId = serviceAreaId;
           this.locationAreaId = locationAreaId;
           this.routingAreaId = routingAreaId;
           this.geographicalInfoId = geographicalInfoId;
           this.geodeticInfoId = geodeticInfoId;
           this.ageOfLocationInfo = ageOfLocationInfo;
           this.currentLocationRetrieved = currentLocationRetrieved;
           this.sgsnNumber = sgsnNumber;
    }


    /**
     * Gets the psLocationInfoId value for this HsxPsLocationInfo.
     * 
     * @return psLocationInfoId
     */
    public java.lang.String getPsLocationInfoId() {
        return psLocationInfoId;
    }


    /**
     * Sets the psLocationInfoId value for this HsxPsLocationInfo.
     * 
     * @param psLocationInfoId
     */
    public void setPsLocationInfoId(java.lang.String psLocationInfoId) {
        this.psLocationInfoId = psLocationInfoId;
    }


    /**
     * Gets the globalCellId value for this HsxPsLocationInfo.
     * 
     * @return globalCellId
     */
    public java.lang.String getGlobalCellId() {
        return globalCellId;
    }


    /**
     * Sets the globalCellId value for this HsxPsLocationInfo.
     * 
     * @param globalCellId
     */
    public void setGlobalCellId(java.lang.String globalCellId) {
        this.globalCellId = globalCellId;
    }


    /**
     * Gets the serviceAreaId value for this HsxPsLocationInfo.
     * 
     * @return serviceAreaId
     */
    public java.lang.String getServiceAreaId() {
        return serviceAreaId;
    }


    /**
     * Sets the serviceAreaId value for this HsxPsLocationInfo.
     * 
     * @param serviceAreaId
     */
    public void setServiceAreaId(java.lang.String serviceAreaId) {
        this.serviceAreaId = serviceAreaId;
    }


    /**
     * Gets the locationAreaId value for this HsxPsLocationInfo.
     * 
     * @return locationAreaId
     */
    public java.lang.String getLocationAreaId() {
        return locationAreaId;
    }


    /**
     * Sets the locationAreaId value for this HsxPsLocationInfo.
     * 
     * @param locationAreaId
     */
    public void setLocationAreaId(java.lang.String locationAreaId) {
        this.locationAreaId = locationAreaId;
    }


    /**
     * Gets the routingAreaId value for this HsxPsLocationInfo.
     * 
     * @return routingAreaId
     */
    public java.lang.String getRoutingAreaId() {
        return routingAreaId;
    }


    /**
     * Sets the routingAreaId value for this HsxPsLocationInfo.
     * 
     * @param routingAreaId
     */
    public void setRoutingAreaId(java.lang.String routingAreaId) {
        this.routingAreaId = routingAreaId;
    }


    /**
     * Gets the geographicalInfoId value for this HsxPsLocationInfo.
     * 
     * @return geographicalInfoId
     */
    public java.lang.String getGeographicalInfoId() {
        return geographicalInfoId;
    }


    /**
     * Sets the geographicalInfoId value for this HsxPsLocationInfo.
     * 
     * @param geographicalInfoId
     */
    public void setGeographicalInfoId(java.lang.String geographicalInfoId) {
        this.geographicalInfoId = geographicalInfoId;
    }


    /**
     * Gets the geodeticInfoId value for this HsxPsLocationInfo.
     * 
     * @return geodeticInfoId
     */
    public java.lang.String getGeodeticInfoId() {
        return geodeticInfoId;
    }


    /**
     * Sets the geodeticInfoId value for this HsxPsLocationInfo.
     * 
     * @param geodeticInfoId
     */
    public void setGeodeticInfoId(java.lang.String geodeticInfoId) {
        this.geodeticInfoId = geodeticInfoId;
    }


    /**
     * Gets the ageOfLocationInfo value for this HsxPsLocationInfo.
     * 
     * @return ageOfLocationInfo
     */
    public java.lang.Integer getAgeOfLocationInfo() {
        return ageOfLocationInfo;
    }


    /**
     * Sets the ageOfLocationInfo value for this HsxPsLocationInfo.
     * 
     * @param ageOfLocationInfo
     */
    public void setAgeOfLocationInfo(java.lang.Integer ageOfLocationInfo) {
        this.ageOfLocationInfo = ageOfLocationInfo;
    }


    /**
     * Gets the currentLocationRetrieved value for this HsxPsLocationInfo.
     * 
     * @return currentLocationRetrieved
     */
    public java.lang.Integer getCurrentLocationRetrieved() {
        return currentLocationRetrieved;
    }


    /**
     * Sets the currentLocationRetrieved value for this HsxPsLocationInfo.
     * 
     * @param currentLocationRetrieved
     */
    public void setCurrentLocationRetrieved(java.lang.Integer currentLocationRetrieved) {
        this.currentLocationRetrieved = currentLocationRetrieved;
    }


    /**
     * Gets the sgsnNumber value for this HsxPsLocationInfo.
     * 
     * @return sgsnNumber
     */
    public java.lang.String getSgsnNumber() {
        return sgsnNumber;
    }


    /**
     * Sets the sgsnNumber value for this HsxPsLocationInfo.
     * 
     * @param sgsnNumber
     */
    public void setSgsnNumber(java.lang.String sgsnNumber) {
        this.sgsnNumber = sgsnNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxPsLocationInfo)) return false;
        HsxPsLocationInfo other = (HsxPsLocationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.psLocationInfoId==null && other.getPsLocationInfoId()==null) || 
             (this.psLocationInfoId!=null &&
              this.psLocationInfoId.equals(other.getPsLocationInfoId()))) &&
            ((this.globalCellId==null && other.getGlobalCellId()==null) || 
             (this.globalCellId!=null &&
              this.globalCellId.equals(other.getGlobalCellId()))) &&
            ((this.serviceAreaId==null && other.getServiceAreaId()==null) || 
             (this.serviceAreaId!=null &&
              this.serviceAreaId.equals(other.getServiceAreaId()))) &&
            ((this.locationAreaId==null && other.getLocationAreaId()==null) || 
             (this.locationAreaId!=null &&
              this.locationAreaId.equals(other.getLocationAreaId()))) &&
            ((this.routingAreaId==null && other.getRoutingAreaId()==null) || 
             (this.routingAreaId!=null &&
              this.routingAreaId.equals(other.getRoutingAreaId()))) &&
            ((this.geographicalInfoId==null && other.getGeographicalInfoId()==null) || 
             (this.geographicalInfoId!=null &&
              this.geographicalInfoId.equals(other.getGeographicalInfoId()))) &&
            ((this.geodeticInfoId==null && other.getGeodeticInfoId()==null) || 
             (this.geodeticInfoId!=null &&
              this.geodeticInfoId.equals(other.getGeodeticInfoId()))) &&
            ((this.ageOfLocationInfo==null && other.getAgeOfLocationInfo()==null) || 
             (this.ageOfLocationInfo!=null &&
              this.ageOfLocationInfo.equals(other.getAgeOfLocationInfo()))) &&
            ((this.currentLocationRetrieved==null && other.getCurrentLocationRetrieved()==null) || 
             (this.currentLocationRetrieved!=null &&
              this.currentLocationRetrieved.equals(other.getCurrentLocationRetrieved()))) &&
            ((this.sgsnNumber==null && other.getSgsnNumber()==null) || 
             (this.sgsnNumber!=null &&
              this.sgsnNumber.equals(other.getSgsnNumber())));
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
        if (getPsLocationInfoId() != null) {
            _hashCode += getPsLocationInfoId().hashCode();
        }
        if (getGlobalCellId() != null) {
            _hashCode += getGlobalCellId().hashCode();
        }
        if (getServiceAreaId() != null) {
            _hashCode += getServiceAreaId().hashCode();
        }
        if (getLocationAreaId() != null) {
            _hashCode += getLocationAreaId().hashCode();
        }
        if (getRoutingAreaId() != null) {
            _hashCode += getRoutingAreaId().hashCode();
        }
        if (getGeographicalInfoId() != null) {
            _hashCode += getGeographicalInfoId().hashCode();
        }
        if (getGeodeticInfoId() != null) {
            _hashCode += getGeodeticInfoId().hashCode();
        }
        if (getAgeOfLocationInfo() != null) {
            _hashCode += getAgeOfLocationInfo().hashCode();
        }
        if (getCurrentLocationRetrieved() != null) {
            _hashCode += getCurrentLocationRetrieved().hashCode();
        }
        if (getSgsnNumber() != null) {
            _hashCode += getSgsnNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxPsLocationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPsLocationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psLocationInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "psLocationInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalCellId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalCellId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceAreaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceAreaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAreaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationAreaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingAreaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingAreaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geographicalInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "geographicalInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geodeticInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "geodeticInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageOfLocationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ageOfLocationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentLocationRetrieved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentLocationRetrieved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sgsnNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sgsnNumber"));
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
