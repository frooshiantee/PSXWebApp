/**
 * Country.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class Country  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String countryId;
    private java.lang.String description;
    private java.lang.String calledNationalIdMatching;
    private java.lang.String callingNationalIdMatching;
    private java.lang.String servicesNationalIdMatching;
    private java.lang.String tollfreePrefixMatching;
    private java.lang.Short localizationType;
    private java.lang.Short maxExchangeLength;
    private java.lang.String erpProfileId;
    private java.lang.String rcProfileId;
    private java.lang.Integer attributes;
    private java.lang.String localCallingAreaIdMatching;

    public Country() {
    }

    public Country(
           java.lang.String countryId,
           java.lang.String description,
           java.lang.String calledNationalIdMatching,
           java.lang.String callingNationalIdMatching,
           java.lang.String servicesNationalIdMatching,
           java.lang.String tollfreePrefixMatching,
           java.lang.Short localizationType,
           java.lang.Short maxExchangeLength,
           java.lang.String erpProfileId,
           java.lang.String rcProfileId,
           java.lang.Integer attributes,
           java.lang.String localCallingAreaIdMatching) {
           this.countryId = countryId;
           this.description = description;
           this.calledNationalIdMatching = calledNationalIdMatching;
           this.callingNationalIdMatching = callingNationalIdMatching;
           this.servicesNationalIdMatching = servicesNationalIdMatching;
           this.tollfreePrefixMatching = tollfreePrefixMatching;
           this.localizationType = localizationType;
           this.maxExchangeLength = maxExchangeLength;
           this.erpProfileId = erpProfileId;
           this.rcProfileId = rcProfileId;
           this.attributes = attributes;
           this.localCallingAreaIdMatching = localCallingAreaIdMatching;
    }


    /**
     * Gets the countryId value for this Country.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this Country.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the description value for this Country.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Country.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the calledNationalIdMatching value for this Country.
     * 
     * @return calledNationalIdMatching
     */
    public java.lang.String getCalledNationalIdMatching() {
        return calledNationalIdMatching;
    }


    /**
     * Sets the calledNationalIdMatching value for this Country.
     * 
     * @param calledNationalIdMatching
     */
    public void setCalledNationalIdMatching(java.lang.String calledNationalIdMatching) {
        this.calledNationalIdMatching = calledNationalIdMatching;
    }


    /**
     * Gets the callingNationalIdMatching value for this Country.
     * 
     * @return callingNationalIdMatching
     */
    public java.lang.String getCallingNationalIdMatching() {
        return callingNationalIdMatching;
    }


    /**
     * Sets the callingNationalIdMatching value for this Country.
     * 
     * @param callingNationalIdMatching
     */
    public void setCallingNationalIdMatching(java.lang.String callingNationalIdMatching) {
        this.callingNationalIdMatching = callingNationalIdMatching;
    }


    /**
     * Gets the servicesNationalIdMatching value for this Country.
     * 
     * @return servicesNationalIdMatching
     */
    public java.lang.String getServicesNationalIdMatching() {
        return servicesNationalIdMatching;
    }


    /**
     * Sets the servicesNationalIdMatching value for this Country.
     * 
     * @param servicesNationalIdMatching
     */
    public void setServicesNationalIdMatching(java.lang.String servicesNationalIdMatching) {
        this.servicesNationalIdMatching = servicesNationalIdMatching;
    }


    /**
     * Gets the tollfreePrefixMatching value for this Country.
     * 
     * @return tollfreePrefixMatching
     */
    public java.lang.String getTollfreePrefixMatching() {
        return tollfreePrefixMatching;
    }


    /**
     * Sets the tollfreePrefixMatching value for this Country.
     * 
     * @param tollfreePrefixMatching
     */
    public void setTollfreePrefixMatching(java.lang.String tollfreePrefixMatching) {
        this.tollfreePrefixMatching = tollfreePrefixMatching;
    }


    /**
     * Gets the localizationType value for this Country.
     * 
     * @return localizationType
     */
    public java.lang.Short getLocalizationType() {
        return localizationType;
    }


    /**
     * Sets the localizationType value for this Country.
     * 
     * @param localizationType
     */
    public void setLocalizationType(java.lang.Short localizationType) {
        this.localizationType = localizationType;
    }


    /**
     * Gets the maxExchangeLength value for this Country.
     * 
     * @return maxExchangeLength
     */
    public java.lang.Short getMaxExchangeLength() {
        return maxExchangeLength;
    }


    /**
     * Sets the maxExchangeLength value for this Country.
     * 
     * @param maxExchangeLength
     */
    public void setMaxExchangeLength(java.lang.Short maxExchangeLength) {
        this.maxExchangeLength = maxExchangeLength;
    }


    /**
     * Gets the erpProfileId value for this Country.
     * 
     * @return erpProfileId
     */
    public java.lang.String getErpProfileId() {
        return erpProfileId;
    }


    /**
     * Sets the erpProfileId value for this Country.
     * 
     * @param erpProfileId
     */
    public void setErpProfileId(java.lang.String erpProfileId) {
        this.erpProfileId = erpProfileId;
    }


    /**
     * Gets the rcProfileId value for this Country.
     * 
     * @return rcProfileId
     */
    public java.lang.String getRcProfileId() {
        return rcProfileId;
    }


    /**
     * Sets the rcProfileId value for this Country.
     * 
     * @param rcProfileId
     */
    public void setRcProfileId(java.lang.String rcProfileId) {
        this.rcProfileId = rcProfileId;
    }


    /**
     * Gets the attributes value for this Country.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this Country.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the localCallingAreaIdMatching value for this Country.
     * 
     * @return localCallingAreaIdMatching
     */
    public java.lang.String getLocalCallingAreaIdMatching() {
        return localCallingAreaIdMatching;
    }


    /**
     * Sets the localCallingAreaIdMatching value for this Country.
     * 
     * @param localCallingAreaIdMatching
     */
    public void setLocalCallingAreaIdMatching(java.lang.String localCallingAreaIdMatching) {
        this.localCallingAreaIdMatching = localCallingAreaIdMatching;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Country)) return false;
        Country other = (Country) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.calledNationalIdMatching==null && other.getCalledNationalIdMatching()==null) || 
             (this.calledNationalIdMatching!=null &&
              this.calledNationalIdMatching.equals(other.getCalledNationalIdMatching()))) &&
            ((this.callingNationalIdMatching==null && other.getCallingNationalIdMatching()==null) || 
             (this.callingNationalIdMatching!=null &&
              this.callingNationalIdMatching.equals(other.getCallingNationalIdMatching()))) &&
            ((this.servicesNationalIdMatching==null && other.getServicesNationalIdMatching()==null) || 
             (this.servicesNationalIdMatching!=null &&
              this.servicesNationalIdMatching.equals(other.getServicesNationalIdMatching()))) &&
            ((this.tollfreePrefixMatching==null && other.getTollfreePrefixMatching()==null) || 
             (this.tollfreePrefixMatching!=null &&
              this.tollfreePrefixMatching.equals(other.getTollfreePrefixMatching()))) &&
            ((this.localizationType==null && other.getLocalizationType()==null) || 
             (this.localizationType!=null &&
              this.localizationType.equals(other.getLocalizationType()))) &&
            ((this.maxExchangeLength==null && other.getMaxExchangeLength()==null) || 
             (this.maxExchangeLength!=null &&
              this.maxExchangeLength.equals(other.getMaxExchangeLength()))) &&
            ((this.erpProfileId==null && other.getErpProfileId()==null) || 
             (this.erpProfileId!=null &&
              this.erpProfileId.equals(other.getErpProfileId()))) &&
            ((this.rcProfileId==null && other.getRcProfileId()==null) || 
             (this.rcProfileId!=null &&
              this.rcProfileId.equals(other.getRcProfileId()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.localCallingAreaIdMatching==null && other.getLocalCallingAreaIdMatching()==null) || 
             (this.localCallingAreaIdMatching!=null &&
              this.localCallingAreaIdMatching.equals(other.getLocalCallingAreaIdMatching())));
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
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCalledNationalIdMatching() != null) {
            _hashCode += getCalledNationalIdMatching().hashCode();
        }
        if (getCallingNationalIdMatching() != null) {
            _hashCode += getCallingNationalIdMatching().hashCode();
        }
        if (getServicesNationalIdMatching() != null) {
            _hashCode += getServicesNationalIdMatching().hashCode();
        }
        if (getTollfreePrefixMatching() != null) {
            _hashCode += getTollfreePrefixMatching().hashCode();
        }
        if (getLocalizationType() != null) {
            _hashCode += getLocalizationType().hashCode();
        }
        if (getMaxExchangeLength() != null) {
            _hashCode += getMaxExchangeLength().hashCode();
        }
        if (getErpProfileId() != null) {
            _hashCode += getErpProfileId().hashCode();
        }
        if (getRcProfileId() != null) {
            _hashCode += getRcProfileId().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getLocalCallingAreaIdMatching() != null) {
            _hashCode += getLocalCallingAreaIdMatching().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Country.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Country"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNationalIdMatching");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledNationalIdMatching"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNationalIdMatching");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNationalIdMatching"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicesNationalIdMatching");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicesNationalIdMatching"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tollfreePrefixMatching");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tollfreePrefixMatching"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxExchangeLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxExchangeLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erpProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erpProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rcProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localCallingAreaIdMatching");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localCallingAreaIdMatching"));
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
