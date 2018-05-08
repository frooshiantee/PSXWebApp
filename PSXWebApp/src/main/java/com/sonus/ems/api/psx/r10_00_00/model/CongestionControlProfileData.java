/**
 * CongestionControlProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CongestionControlProfileData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String congestionControlProfileId;
    private java.lang.Integer congestionLevel;
    private java.lang.Integer highWaterMark;
    private java.lang.Integer lowWaterMark;
    private java.lang.Integer allowedCalls;
    private java.lang.Integer totalCalls;

    public CongestionControlProfileData() {
    }

    public CongestionControlProfileData(
           java.lang.String congestionControlProfileId,
           java.lang.Integer congestionLevel,
           java.lang.Integer highWaterMark,
           java.lang.Integer lowWaterMark,
           java.lang.Integer allowedCalls,
           java.lang.Integer totalCalls) {
           this.congestionControlProfileId = congestionControlProfileId;
           this.congestionLevel = congestionLevel;
           this.highWaterMark = highWaterMark;
           this.lowWaterMark = lowWaterMark;
           this.allowedCalls = allowedCalls;
           this.totalCalls = totalCalls;
    }


    /**
     * Gets the congestionControlProfileId value for this CongestionControlProfileData.
     * 
     * @return congestionControlProfileId
     */
    public java.lang.String getCongestionControlProfileId() {
        return congestionControlProfileId;
    }


    /**
     * Sets the congestionControlProfileId value for this CongestionControlProfileData.
     * 
     * @param congestionControlProfileId
     */
    public void setCongestionControlProfileId(java.lang.String congestionControlProfileId) {
        this.congestionControlProfileId = congestionControlProfileId;
    }


    /**
     * Gets the congestionLevel value for this CongestionControlProfileData.
     * 
     * @return congestionLevel
     */
    public java.lang.Integer getCongestionLevel() {
        return congestionLevel;
    }


    /**
     * Sets the congestionLevel value for this CongestionControlProfileData.
     * 
     * @param congestionLevel
     */
    public void setCongestionLevel(java.lang.Integer congestionLevel) {
        this.congestionLevel = congestionLevel;
    }


    /**
     * Gets the highWaterMark value for this CongestionControlProfileData.
     * 
     * @return highWaterMark
     */
    public java.lang.Integer getHighWaterMark() {
        return highWaterMark;
    }


    /**
     * Sets the highWaterMark value for this CongestionControlProfileData.
     * 
     * @param highWaterMark
     */
    public void setHighWaterMark(java.lang.Integer highWaterMark) {
        this.highWaterMark = highWaterMark;
    }


    /**
     * Gets the lowWaterMark value for this CongestionControlProfileData.
     * 
     * @return lowWaterMark
     */
    public java.lang.Integer getLowWaterMark() {
        return lowWaterMark;
    }


    /**
     * Sets the lowWaterMark value for this CongestionControlProfileData.
     * 
     * @param lowWaterMark
     */
    public void setLowWaterMark(java.lang.Integer lowWaterMark) {
        this.lowWaterMark = lowWaterMark;
    }


    /**
     * Gets the allowedCalls value for this CongestionControlProfileData.
     * 
     * @return allowedCalls
     */
    public java.lang.Integer getAllowedCalls() {
        return allowedCalls;
    }


    /**
     * Sets the allowedCalls value for this CongestionControlProfileData.
     * 
     * @param allowedCalls
     */
    public void setAllowedCalls(java.lang.Integer allowedCalls) {
        this.allowedCalls = allowedCalls;
    }


    /**
     * Gets the totalCalls value for this CongestionControlProfileData.
     * 
     * @return totalCalls
     */
    public java.lang.Integer getTotalCalls() {
        return totalCalls;
    }


    /**
     * Sets the totalCalls value for this CongestionControlProfileData.
     * 
     * @param totalCalls
     */
    public void setTotalCalls(java.lang.Integer totalCalls) {
        this.totalCalls = totalCalls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CongestionControlProfileData)) return false;
        CongestionControlProfileData other = (CongestionControlProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.congestionControlProfileId==null && other.getCongestionControlProfileId()==null) || 
             (this.congestionControlProfileId!=null &&
              this.congestionControlProfileId.equals(other.getCongestionControlProfileId()))) &&
            ((this.congestionLevel==null && other.getCongestionLevel()==null) || 
             (this.congestionLevel!=null &&
              this.congestionLevel.equals(other.getCongestionLevel()))) &&
            ((this.highWaterMark==null && other.getHighWaterMark()==null) || 
             (this.highWaterMark!=null &&
              this.highWaterMark.equals(other.getHighWaterMark()))) &&
            ((this.lowWaterMark==null && other.getLowWaterMark()==null) || 
             (this.lowWaterMark!=null &&
              this.lowWaterMark.equals(other.getLowWaterMark()))) &&
            ((this.allowedCalls==null && other.getAllowedCalls()==null) || 
             (this.allowedCalls!=null &&
              this.allowedCalls.equals(other.getAllowedCalls()))) &&
            ((this.totalCalls==null && other.getTotalCalls()==null) || 
             (this.totalCalls!=null &&
              this.totalCalls.equals(other.getTotalCalls())));
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
        if (getCongestionControlProfileId() != null) {
            _hashCode += getCongestionControlProfileId().hashCode();
        }
        if (getCongestionLevel() != null) {
            _hashCode += getCongestionLevel().hashCode();
        }
        if (getHighWaterMark() != null) {
            _hashCode += getHighWaterMark().hashCode();
        }
        if (getLowWaterMark() != null) {
            _hashCode += getLowWaterMark().hashCode();
        }
        if (getAllowedCalls() != null) {
            _hashCode += getAllowedCalls().hashCode();
        }
        if (getTotalCalls() != null) {
            _hashCode += getTotalCalls().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CongestionControlProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CongestionControlProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("congestionControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "congestionControlProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("congestionLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "congestionLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highWaterMark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "highWaterMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowWaterMark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lowWaterMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowedCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
