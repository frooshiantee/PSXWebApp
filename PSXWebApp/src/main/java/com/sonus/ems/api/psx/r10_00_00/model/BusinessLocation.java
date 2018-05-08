/**
 * BusinessLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class BusinessLocation  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String businessGroupId;
    private java.lang.String businessLocationId;
    private java.lang.String interLataCarrierId;
    private java.lang.String intraLataCarrierId;
    private java.lang.String intlCarrierId;
    private java.lang.String localCarrierId;
    private java.lang.String locationPrefix;
    private java.lang.String locationName;
    private java.lang.String numberingPlanId;

    public BusinessLocation() {
    }

    public BusinessLocation(
           java.lang.String businessGroupId,
           java.lang.String businessLocationId,
           java.lang.String interLataCarrierId,
           java.lang.String intraLataCarrierId,
           java.lang.String intlCarrierId,
           java.lang.String localCarrierId,
           java.lang.String locationPrefix,
           java.lang.String locationName,
           java.lang.String numberingPlanId) {
           this.businessGroupId = businessGroupId;
           this.businessLocationId = businessLocationId;
           this.interLataCarrierId = interLataCarrierId;
           this.intraLataCarrierId = intraLataCarrierId;
           this.intlCarrierId = intlCarrierId;
           this.localCarrierId = localCarrierId;
           this.locationPrefix = locationPrefix;
           this.locationName = locationName;
           this.numberingPlanId = numberingPlanId;
    }


    /**
     * Gets the businessGroupId value for this BusinessLocation.
     * 
     * @return businessGroupId
     */
    public java.lang.String getBusinessGroupId() {
        return businessGroupId;
    }


    /**
     * Sets the businessGroupId value for this BusinessLocation.
     * 
     * @param businessGroupId
     */
    public void setBusinessGroupId(java.lang.String businessGroupId) {
        this.businessGroupId = businessGroupId;
    }


    /**
     * Gets the businessLocationId value for this BusinessLocation.
     * 
     * @return businessLocationId
     */
    public java.lang.String getBusinessLocationId() {
        return businessLocationId;
    }


    /**
     * Sets the businessLocationId value for this BusinessLocation.
     * 
     * @param businessLocationId
     */
    public void setBusinessLocationId(java.lang.String businessLocationId) {
        this.businessLocationId = businessLocationId;
    }


    /**
     * Gets the interLataCarrierId value for this BusinessLocation.
     * 
     * @return interLataCarrierId
     */
    public java.lang.String getInterLataCarrierId() {
        return interLataCarrierId;
    }


    /**
     * Sets the interLataCarrierId value for this BusinessLocation.
     * 
     * @param interLataCarrierId
     */
    public void setInterLataCarrierId(java.lang.String interLataCarrierId) {
        this.interLataCarrierId = interLataCarrierId;
    }


    /**
     * Gets the intraLataCarrierId value for this BusinessLocation.
     * 
     * @return intraLataCarrierId
     */
    public java.lang.String getIntraLataCarrierId() {
        return intraLataCarrierId;
    }


    /**
     * Sets the intraLataCarrierId value for this BusinessLocation.
     * 
     * @param intraLataCarrierId
     */
    public void setIntraLataCarrierId(java.lang.String intraLataCarrierId) {
        this.intraLataCarrierId = intraLataCarrierId;
    }


    /**
     * Gets the intlCarrierId value for this BusinessLocation.
     * 
     * @return intlCarrierId
     */
    public java.lang.String getIntlCarrierId() {
        return intlCarrierId;
    }


    /**
     * Sets the intlCarrierId value for this BusinessLocation.
     * 
     * @param intlCarrierId
     */
    public void setIntlCarrierId(java.lang.String intlCarrierId) {
        this.intlCarrierId = intlCarrierId;
    }


    /**
     * Gets the localCarrierId value for this BusinessLocation.
     * 
     * @return localCarrierId
     */
    public java.lang.String getLocalCarrierId() {
        return localCarrierId;
    }


    /**
     * Sets the localCarrierId value for this BusinessLocation.
     * 
     * @param localCarrierId
     */
    public void setLocalCarrierId(java.lang.String localCarrierId) {
        this.localCarrierId = localCarrierId;
    }


    /**
     * Gets the locationPrefix value for this BusinessLocation.
     * 
     * @return locationPrefix
     */
    public java.lang.String getLocationPrefix() {
        return locationPrefix;
    }


    /**
     * Sets the locationPrefix value for this BusinessLocation.
     * 
     * @param locationPrefix
     */
    public void setLocationPrefix(java.lang.String locationPrefix) {
        this.locationPrefix = locationPrefix;
    }


    /**
     * Gets the locationName value for this BusinessLocation.
     * 
     * @return locationName
     */
    public java.lang.String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this BusinessLocation.
     * 
     * @param locationName
     */
    public void setLocationName(java.lang.String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the numberingPlanId value for this BusinessLocation.
     * 
     * @return numberingPlanId
     */
    public java.lang.String getNumberingPlanId() {
        return numberingPlanId;
    }


    /**
     * Sets the numberingPlanId value for this BusinessLocation.
     * 
     * @param numberingPlanId
     */
    public void setNumberingPlanId(java.lang.String numberingPlanId) {
        this.numberingPlanId = numberingPlanId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessLocation)) return false;
        BusinessLocation other = (BusinessLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessGroupId==null && other.getBusinessGroupId()==null) || 
             (this.businessGroupId!=null &&
              this.businessGroupId.equals(other.getBusinessGroupId()))) &&
            ((this.businessLocationId==null && other.getBusinessLocationId()==null) || 
             (this.businessLocationId!=null &&
              this.businessLocationId.equals(other.getBusinessLocationId()))) &&
            ((this.interLataCarrierId==null && other.getInterLataCarrierId()==null) || 
             (this.interLataCarrierId!=null &&
              this.interLataCarrierId.equals(other.getInterLataCarrierId()))) &&
            ((this.intraLataCarrierId==null && other.getIntraLataCarrierId()==null) || 
             (this.intraLataCarrierId!=null &&
              this.intraLataCarrierId.equals(other.getIntraLataCarrierId()))) &&
            ((this.intlCarrierId==null && other.getIntlCarrierId()==null) || 
             (this.intlCarrierId!=null &&
              this.intlCarrierId.equals(other.getIntlCarrierId()))) &&
            ((this.localCarrierId==null && other.getLocalCarrierId()==null) || 
             (this.localCarrierId!=null &&
              this.localCarrierId.equals(other.getLocalCarrierId()))) &&
            ((this.locationPrefix==null && other.getLocationPrefix()==null) || 
             (this.locationPrefix!=null &&
              this.locationPrefix.equals(other.getLocationPrefix()))) &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.numberingPlanId==null && other.getNumberingPlanId()==null) || 
             (this.numberingPlanId!=null &&
              this.numberingPlanId.equals(other.getNumberingPlanId())));
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
        if (getBusinessGroupId() != null) {
            _hashCode += getBusinessGroupId().hashCode();
        }
        if (getBusinessLocationId() != null) {
            _hashCode += getBusinessLocationId().hashCode();
        }
        if (getInterLataCarrierId() != null) {
            _hashCode += getInterLataCarrierId().hashCode();
        }
        if (getIntraLataCarrierId() != null) {
            _hashCode += getIntraLataCarrierId().hashCode();
        }
        if (getIntlCarrierId() != null) {
            _hashCode += getIntlCarrierId().hashCode();
        }
        if (getLocalCarrierId() != null) {
            _hashCode += getLocalCarrierId().hashCode();
        }
        if (getLocationPrefix() != null) {
            _hashCode += getLocationPrefix().hashCode();
        }
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getNumberingPlanId() != null) {
            _hashCode += getNumberingPlanId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BusinessLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interLataCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interLataCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intraLataCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intraLataCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intlCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intlCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberingPlanId"));
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
