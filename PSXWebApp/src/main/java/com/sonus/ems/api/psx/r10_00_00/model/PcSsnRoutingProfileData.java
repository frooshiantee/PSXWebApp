/**
 * PcSsnRoutingProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class PcSsnRoutingProfileData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String pcSsnProfileId;
    private java.lang.Integer priority;
    private java.lang.String pointCode;
    private java.lang.Integer subsystemNumber;
    private java.lang.Integer percentageDistribution;

    public PcSsnRoutingProfileData() {
    }

    public PcSsnRoutingProfileData(
           java.lang.String pcSsnProfileId,
           java.lang.Integer priority,
           java.lang.String pointCode,
           java.lang.Integer subsystemNumber,
           java.lang.Integer percentageDistribution) {
           this.pcSsnProfileId = pcSsnProfileId;
           this.priority = priority;
           this.pointCode = pointCode;
           this.subsystemNumber = subsystemNumber;
           this.percentageDistribution = percentageDistribution;
    }


    /**
     * Gets the pcSsnProfileId value for this PcSsnRoutingProfileData.
     * 
     * @return pcSsnProfileId
     */
    public java.lang.String getPcSsnProfileId() {
        return pcSsnProfileId;
    }


    /**
     * Sets the pcSsnProfileId value for this PcSsnRoutingProfileData.
     * 
     * @param pcSsnProfileId
     */
    public void setPcSsnProfileId(java.lang.String pcSsnProfileId) {
        this.pcSsnProfileId = pcSsnProfileId;
    }


    /**
     * Gets the priority value for this PcSsnRoutingProfileData.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this PcSsnRoutingProfileData.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the pointCode value for this PcSsnRoutingProfileData.
     * 
     * @return pointCode
     */
    public java.lang.String getPointCode() {
        return pointCode;
    }


    /**
     * Sets the pointCode value for this PcSsnRoutingProfileData.
     * 
     * @param pointCode
     */
    public void setPointCode(java.lang.String pointCode) {
        this.pointCode = pointCode;
    }


    /**
     * Gets the subsystemNumber value for this PcSsnRoutingProfileData.
     * 
     * @return subsystemNumber
     */
    public java.lang.Integer getSubsystemNumber() {
        return subsystemNumber;
    }


    /**
     * Sets the subsystemNumber value for this PcSsnRoutingProfileData.
     * 
     * @param subsystemNumber
     */
    public void setSubsystemNumber(java.lang.Integer subsystemNumber) {
        this.subsystemNumber = subsystemNumber;
    }


    /**
     * Gets the percentageDistribution value for this PcSsnRoutingProfileData.
     * 
     * @return percentageDistribution
     */
    public java.lang.Integer getPercentageDistribution() {
        return percentageDistribution;
    }


    /**
     * Sets the percentageDistribution value for this PcSsnRoutingProfileData.
     * 
     * @param percentageDistribution
     */
    public void setPercentageDistribution(java.lang.Integer percentageDistribution) {
        this.percentageDistribution = percentageDistribution;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PcSsnRoutingProfileData)) return false;
        PcSsnRoutingProfileData other = (PcSsnRoutingProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pcSsnProfileId==null && other.getPcSsnProfileId()==null) || 
             (this.pcSsnProfileId!=null &&
              this.pcSsnProfileId.equals(other.getPcSsnProfileId()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.pointCode==null && other.getPointCode()==null) || 
             (this.pointCode!=null &&
              this.pointCode.equals(other.getPointCode()))) &&
            ((this.subsystemNumber==null && other.getSubsystemNumber()==null) || 
             (this.subsystemNumber!=null &&
              this.subsystemNumber.equals(other.getSubsystemNumber()))) &&
            ((this.percentageDistribution==null && other.getPercentageDistribution()==null) || 
             (this.percentageDistribution!=null &&
              this.percentageDistribution.equals(other.getPercentageDistribution())));
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
        if (getPcSsnProfileId() != null) {
            _hashCode += getPcSsnProfileId().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getPointCode() != null) {
            _hashCode += getPointCode().hashCode();
        }
        if (getSubsystemNumber() != null) {
            _hashCode += getSubsystemNumber().hashCode();
        }
        if (getPercentageDistribution() != null) {
            _hashCode += getPercentageDistribution().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PcSsnRoutingProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PcSsnRoutingProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcSsnProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcSsnProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsystemNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subsystemNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentageDistribution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentageDistribution"));
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
