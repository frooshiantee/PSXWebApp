/**
 * TrunkgroupGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class TrunkgroupGroup  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String trunkgroupGroupId;
    private java.lang.String description;

    public TrunkgroupGroup() {
    }

    public TrunkgroupGroup(
           java.lang.String trunkgroupGroupId,
           java.lang.String description) {
           this.trunkgroupGroupId = trunkgroupGroupId;
           this.description = description;
    }


    /**
     * Gets the trunkgroupGroupId value for this TrunkgroupGroup.
     * 
     * @return trunkgroupGroupId
     */
    public java.lang.String getTrunkgroupGroupId() {
        return trunkgroupGroupId;
    }


    /**
     * Sets the trunkgroupGroupId value for this TrunkgroupGroup.
     * 
     * @param trunkgroupGroupId
     */
    public void setTrunkgroupGroupId(java.lang.String trunkgroupGroupId) {
        this.trunkgroupGroupId = trunkgroupGroupId;
    }


    /**
     * Gets the description value for this TrunkgroupGroup.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TrunkgroupGroup.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrunkgroupGroup)) return false;
        TrunkgroupGroup other = (TrunkgroupGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.trunkgroupGroupId==null && other.getTrunkgroupGroupId()==null) || 
             (this.trunkgroupGroupId!=null &&
              this.trunkgroupGroupId.equals(other.getTrunkgroupGroupId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getTrunkgroupGroupId() != null) {
            _hashCode += getTrunkgroupGroupId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrunkgroupGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
