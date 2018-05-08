/**
 * PrefixProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class PrefixProfileDataKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String prefixProfileId;
    private java.lang.String prefix;
    private java.lang.Short matchStartLocation;
    private java.lang.Short totalMinDigits;
    private java.lang.Short totalMaxDigits;

    public PrefixProfileDataKey() {
    }

    public PrefixProfileDataKey(
           java.lang.String prefixProfileId,
           java.lang.String prefix,
           java.lang.Short matchStartLocation,
           java.lang.Short totalMinDigits,
           java.lang.Short totalMaxDigits) {
           this.prefixProfileId = prefixProfileId;
           this.prefix = prefix;
           this.matchStartLocation = matchStartLocation;
           this.totalMinDigits = totalMinDigits;
           this.totalMaxDigits = totalMaxDigits;
    }


    /**
     * Gets the prefixProfileId value for this PrefixProfileDataKey.
     * 
     * @return prefixProfileId
     */
    public java.lang.String getPrefixProfileId() {
        return prefixProfileId;
    }


    /**
     * Sets the prefixProfileId value for this PrefixProfileDataKey.
     * 
     * @param prefixProfileId
     */
    public void setPrefixProfileId(java.lang.String prefixProfileId) {
        this.prefixProfileId = prefixProfileId;
    }


    /**
     * Gets the prefix value for this PrefixProfileDataKey.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this PrefixProfileDataKey.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the matchStartLocation value for this PrefixProfileDataKey.
     * 
     * @return matchStartLocation
     */
    public java.lang.Short getMatchStartLocation() {
        return matchStartLocation;
    }


    /**
     * Sets the matchStartLocation value for this PrefixProfileDataKey.
     * 
     * @param matchStartLocation
     */
    public void setMatchStartLocation(java.lang.Short matchStartLocation) {
        this.matchStartLocation = matchStartLocation;
    }


    /**
     * Gets the totalMinDigits value for this PrefixProfileDataKey.
     * 
     * @return totalMinDigits
     */
    public java.lang.Short getTotalMinDigits() {
        return totalMinDigits;
    }


    /**
     * Sets the totalMinDigits value for this PrefixProfileDataKey.
     * 
     * @param totalMinDigits
     */
    public void setTotalMinDigits(java.lang.Short totalMinDigits) {
        this.totalMinDigits = totalMinDigits;
    }


    /**
     * Gets the totalMaxDigits value for this PrefixProfileDataKey.
     * 
     * @return totalMaxDigits
     */
    public java.lang.Short getTotalMaxDigits() {
        return totalMaxDigits;
    }


    /**
     * Sets the totalMaxDigits value for this PrefixProfileDataKey.
     * 
     * @param totalMaxDigits
     */
    public void setTotalMaxDigits(java.lang.Short totalMaxDigits) {
        this.totalMaxDigits = totalMaxDigits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrefixProfileDataKey)) return false;
        PrefixProfileDataKey other = (PrefixProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prefixProfileId==null && other.getPrefixProfileId()==null) || 
             (this.prefixProfileId!=null &&
              this.prefixProfileId.equals(other.getPrefixProfileId()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.matchStartLocation==null && other.getMatchStartLocation()==null) || 
             (this.matchStartLocation!=null &&
              this.matchStartLocation.equals(other.getMatchStartLocation()))) &&
            ((this.totalMinDigits==null && other.getTotalMinDigits()==null) || 
             (this.totalMinDigits!=null &&
              this.totalMinDigits.equals(other.getTotalMinDigits()))) &&
            ((this.totalMaxDigits==null && other.getTotalMaxDigits()==null) || 
             (this.totalMaxDigits!=null &&
              this.totalMaxDigits.equals(other.getTotalMaxDigits())));
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
        if (getPrefixProfileId() != null) {
            _hashCode += getPrefixProfileId().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getMatchStartLocation() != null) {
            _hashCode += getMatchStartLocation().hashCode();
        }
        if (getTotalMinDigits() != null) {
            _hashCode += getTotalMinDigits().hashCode();
        }
        if (getTotalMaxDigits() != null) {
            _hashCode += getTotalMaxDigits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrefixProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PrefixProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchStartLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchStartLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMinDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalMinDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMaxDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalMaxDigits"));
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
