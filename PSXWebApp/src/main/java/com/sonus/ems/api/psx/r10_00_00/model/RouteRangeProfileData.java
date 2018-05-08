/**
 * RouteRangeProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class RouteRangeProfileData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String rangeProfileId;
    private java.lang.Integer subrangeNumber;
    private java.lang.String fromNumber;
    private java.lang.String toNumber;
    private java.lang.Short routesExist;

    public RouteRangeProfileData() {
    }

    public RouteRangeProfileData(
           java.lang.String rangeProfileId,
           java.lang.Integer subrangeNumber,
           java.lang.String fromNumber,
           java.lang.String toNumber,
           java.lang.Short routesExist) {
           this.rangeProfileId = rangeProfileId;
           this.subrangeNumber = subrangeNumber;
           this.fromNumber = fromNumber;
           this.toNumber = toNumber;
           this.routesExist = routesExist;
    }


    /**
     * Gets the rangeProfileId value for this RouteRangeProfileData.
     * 
     * @return rangeProfileId
     */
    public java.lang.String getRangeProfileId() {
        return rangeProfileId;
    }


    /**
     * Sets the rangeProfileId value for this RouteRangeProfileData.
     * 
     * @param rangeProfileId
     */
    public void setRangeProfileId(java.lang.String rangeProfileId) {
        this.rangeProfileId = rangeProfileId;
    }


    /**
     * Gets the subrangeNumber value for this RouteRangeProfileData.
     * 
     * @return subrangeNumber
     */
    public java.lang.Integer getSubrangeNumber() {
        return subrangeNumber;
    }


    /**
     * Sets the subrangeNumber value for this RouteRangeProfileData.
     * 
     * @param subrangeNumber
     */
    public void setSubrangeNumber(java.lang.Integer subrangeNumber) {
        this.subrangeNumber = subrangeNumber;
    }


    /**
     * Gets the fromNumber value for this RouteRangeProfileData.
     * 
     * @return fromNumber
     */
    public java.lang.String getFromNumber() {
        return fromNumber;
    }


    /**
     * Sets the fromNumber value for this RouteRangeProfileData.
     * 
     * @param fromNumber
     */
    public void setFromNumber(java.lang.String fromNumber) {
        this.fromNumber = fromNumber;
    }


    /**
     * Gets the toNumber value for this RouteRangeProfileData.
     * 
     * @return toNumber
     */
    public java.lang.String getToNumber() {
        return toNumber;
    }


    /**
     * Sets the toNumber value for this RouteRangeProfileData.
     * 
     * @param toNumber
     */
    public void setToNumber(java.lang.String toNumber) {
        this.toNumber = toNumber;
    }


    /**
     * Gets the routesExist value for this RouteRangeProfileData.
     * 
     * @return routesExist
     */
    public java.lang.Short getRoutesExist() {
        return routesExist;
    }


    /**
     * Sets the routesExist value for this RouteRangeProfileData.
     * 
     * @param routesExist
     */
    public void setRoutesExist(java.lang.Short routesExist) {
        this.routesExist = routesExist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteRangeProfileData)) return false;
        RouteRangeProfileData other = (RouteRangeProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rangeProfileId==null && other.getRangeProfileId()==null) || 
             (this.rangeProfileId!=null &&
              this.rangeProfileId.equals(other.getRangeProfileId()))) &&
            ((this.subrangeNumber==null && other.getSubrangeNumber()==null) || 
             (this.subrangeNumber!=null &&
              this.subrangeNumber.equals(other.getSubrangeNumber()))) &&
            ((this.fromNumber==null && other.getFromNumber()==null) || 
             (this.fromNumber!=null &&
              this.fromNumber.equals(other.getFromNumber()))) &&
            ((this.toNumber==null && other.getToNumber()==null) || 
             (this.toNumber!=null &&
              this.toNumber.equals(other.getToNumber()))) &&
            ((this.routesExist==null && other.getRoutesExist()==null) || 
             (this.routesExist!=null &&
              this.routesExist.equals(other.getRoutesExist())));
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
        if (getRangeProfileId() != null) {
            _hashCode += getRangeProfileId().hashCode();
        }
        if (getSubrangeNumber() != null) {
            _hashCode += getSubrangeNumber().hashCode();
        }
        if (getFromNumber() != null) {
            _hashCode += getFromNumber().hashCode();
        }
        if (getToNumber() != null) {
            _hashCode += getToNumber().hashCode();
        }
        if (getRoutesExist() != null) {
            _hashCode += getRoutesExist().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteRangeProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteRangeProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subrangeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subrangeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routesExist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routesExist"));
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
