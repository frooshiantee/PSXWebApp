/**
 * RoutingCriteriaKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class RoutingCriteriaKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String rcProfileId;

    private java.lang.Integer cpCalltype;

    private java.lang.Short cpPriority;

    public RoutingCriteriaKey() {
    }

    public RoutingCriteriaKey(
           java.lang.String rcProfileId,
           java.lang.Integer cpCalltype,
           java.lang.Short cpPriority) {
        this.rcProfileId = rcProfileId;
        this.cpCalltype = cpCalltype;
        this.cpPriority = cpPriority;
    }


    /**
     * Gets the rcProfileId value for this RoutingCriteriaKey.
     * 
     * @return rcProfileId
     */
    public java.lang.String getRcProfileId() {
        return rcProfileId;
    }


    /**
     * Sets the rcProfileId value for this RoutingCriteriaKey.
     * 
     * @param rcProfileId
     */
    public void setRcProfileId(java.lang.String rcProfileId) {
        this.rcProfileId = rcProfileId;
    }


    /**
     * Gets the cpCalltype value for this RoutingCriteriaKey.
     * 
     * @return cpCalltype
     */
    public java.lang.Integer getCpCalltype() {
        return cpCalltype;
    }


    /**
     * Sets the cpCalltype value for this RoutingCriteriaKey.
     * 
     * @param cpCalltype
     */
    public void setCpCalltype(java.lang.Integer cpCalltype) {
        this.cpCalltype = cpCalltype;
    }


    /**
     * Gets the cpPriority value for this RoutingCriteriaKey.
     * 
     * @return cpPriority
     */
    public java.lang.Short getCpPriority() {
        return cpPriority;
    }


    /**
     * Sets the cpPriority value for this RoutingCriteriaKey.
     * 
     * @param cpPriority
     */
    public void setCpPriority(java.lang.Short cpPriority) {
        this.cpPriority = cpPriority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutingCriteriaKey)) return false;
        RoutingCriteriaKey other = (RoutingCriteriaKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rcProfileId==null && other.getRcProfileId()==null) || 
             (this.rcProfileId!=null &&
              this.rcProfileId.equals(other.getRcProfileId()))) &&
            ((this.cpCalltype==null && other.getCpCalltype()==null) || 
             (this.cpCalltype!=null &&
              this.cpCalltype.equals(other.getCpCalltype()))) &&
            ((this.cpPriority==null && other.getCpPriority()==null) || 
             (this.cpPriority!=null &&
              this.cpPriority.equals(other.getCpPriority())));
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
        if (getRcProfileId() != null) {
            _hashCode += getRcProfileId().hashCode();
        }
        if (getCpCalltype() != null) {
            _hashCode += getCpCalltype().hashCode();
        }
        if (getCpPriority() != null) {
            _hashCode += getCpPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutingCriteriaKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RoutingCriteriaKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rcProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpCalltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpCalltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpPriority"));
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
