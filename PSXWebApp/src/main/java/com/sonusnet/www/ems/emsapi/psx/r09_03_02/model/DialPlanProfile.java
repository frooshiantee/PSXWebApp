/**
 * DialPlanProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class DialPlanProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String dialPlanProfileId;

    private java.lang.Integer homeNpaLocalCalls;

    private java.lang.Integer homeNpaTollCalls;

    private java.lang.Integer foreignNpaLocalCalls;

    private java.lang.Integer foreignNpaTollCalls;

    private java.lang.Integer attributes;

    private java.lang.String dialPlanTreatmentProfileId;

    private java.lang.String nationalPrefix;

    public DialPlanProfile() {
    }

    public DialPlanProfile(
           java.lang.String dialPlanProfileId,
           java.lang.Integer homeNpaLocalCalls,
           java.lang.Integer homeNpaTollCalls,
           java.lang.Integer foreignNpaLocalCalls,
           java.lang.Integer foreignNpaTollCalls,
           java.lang.Integer attributes,
           java.lang.String dialPlanTreatmentProfileId,
           java.lang.String nationalPrefix) {
        this.dialPlanProfileId = dialPlanProfileId;
        this.homeNpaLocalCalls = homeNpaLocalCalls;
        this.homeNpaTollCalls = homeNpaTollCalls;
        this.foreignNpaLocalCalls = foreignNpaLocalCalls;
        this.foreignNpaTollCalls = foreignNpaTollCalls;
        this.attributes = attributes;
        this.dialPlanTreatmentProfileId = dialPlanTreatmentProfileId;
        this.nationalPrefix = nationalPrefix;
    }


    /**
     * Gets the dialPlanProfileId value for this DialPlanProfile.
     * 
     * @return dialPlanProfileId
     */
    public java.lang.String getDialPlanProfileId() {
        return dialPlanProfileId;
    }


    /**
     * Sets the dialPlanProfileId value for this DialPlanProfile.
     * 
     * @param dialPlanProfileId
     */
    public void setDialPlanProfileId(java.lang.String dialPlanProfileId) {
        this.dialPlanProfileId = dialPlanProfileId;
    }


    /**
     * Gets the homeNpaLocalCalls value for this DialPlanProfile.
     * 
     * @return homeNpaLocalCalls
     */
    public java.lang.Integer getHomeNpaLocalCalls() {
        return homeNpaLocalCalls;
    }


    /**
     * Sets the homeNpaLocalCalls value for this DialPlanProfile.
     * 
     * @param homeNpaLocalCalls
     */
    public void setHomeNpaLocalCalls(java.lang.Integer homeNpaLocalCalls) {
        this.homeNpaLocalCalls = homeNpaLocalCalls;
    }


    /**
     * Gets the homeNpaTollCalls value for this DialPlanProfile.
     * 
     * @return homeNpaTollCalls
     */
    public java.lang.Integer getHomeNpaTollCalls() {
        return homeNpaTollCalls;
    }


    /**
     * Sets the homeNpaTollCalls value for this DialPlanProfile.
     * 
     * @param homeNpaTollCalls
     */
    public void setHomeNpaTollCalls(java.lang.Integer homeNpaTollCalls) {
        this.homeNpaTollCalls = homeNpaTollCalls;
    }


    /**
     * Gets the foreignNpaLocalCalls value for this DialPlanProfile.
     * 
     * @return foreignNpaLocalCalls
     */
    public java.lang.Integer getForeignNpaLocalCalls() {
        return foreignNpaLocalCalls;
    }


    /**
     * Sets the foreignNpaLocalCalls value for this DialPlanProfile.
     * 
     * @param foreignNpaLocalCalls
     */
    public void setForeignNpaLocalCalls(java.lang.Integer foreignNpaLocalCalls) {
        this.foreignNpaLocalCalls = foreignNpaLocalCalls;
    }


    /**
     * Gets the foreignNpaTollCalls value for this DialPlanProfile.
     * 
     * @return foreignNpaTollCalls
     */
    public java.lang.Integer getForeignNpaTollCalls() {
        return foreignNpaTollCalls;
    }


    /**
     * Sets the foreignNpaTollCalls value for this DialPlanProfile.
     * 
     * @param foreignNpaTollCalls
     */
    public void setForeignNpaTollCalls(java.lang.Integer foreignNpaTollCalls) {
        this.foreignNpaTollCalls = foreignNpaTollCalls;
    }


    /**
     * Gets the attributes value for this DialPlanProfile.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this DialPlanProfile.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the dialPlanTreatmentProfileId value for this DialPlanProfile.
     * 
     * @return dialPlanTreatmentProfileId
     */
    public java.lang.String getDialPlanTreatmentProfileId() {
        return dialPlanTreatmentProfileId;
    }


    /**
     * Sets the dialPlanTreatmentProfileId value for this DialPlanProfile.
     * 
     * @param dialPlanTreatmentProfileId
     */
    public void setDialPlanTreatmentProfileId(java.lang.String dialPlanTreatmentProfileId) {
        this.dialPlanTreatmentProfileId = dialPlanTreatmentProfileId;
    }


    /**
     * Gets the nationalPrefix value for this DialPlanProfile.
     * 
     * @return nationalPrefix
     */
    public java.lang.String getNationalPrefix() {
        return nationalPrefix;
    }


    /**
     * Sets the nationalPrefix value for this DialPlanProfile.
     * 
     * @param nationalPrefix
     */
    public void setNationalPrefix(java.lang.String nationalPrefix) {
        this.nationalPrefix = nationalPrefix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DialPlanProfile)) return false;
        DialPlanProfile other = (DialPlanProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dialPlanProfileId==null && other.getDialPlanProfileId()==null) || 
             (this.dialPlanProfileId!=null &&
              this.dialPlanProfileId.equals(other.getDialPlanProfileId()))) &&
            ((this.homeNpaLocalCalls==null && other.getHomeNpaLocalCalls()==null) || 
             (this.homeNpaLocalCalls!=null &&
              this.homeNpaLocalCalls.equals(other.getHomeNpaLocalCalls()))) &&
            ((this.homeNpaTollCalls==null && other.getHomeNpaTollCalls()==null) || 
             (this.homeNpaTollCalls!=null &&
              this.homeNpaTollCalls.equals(other.getHomeNpaTollCalls()))) &&
            ((this.foreignNpaLocalCalls==null && other.getForeignNpaLocalCalls()==null) || 
             (this.foreignNpaLocalCalls!=null &&
              this.foreignNpaLocalCalls.equals(other.getForeignNpaLocalCalls()))) &&
            ((this.foreignNpaTollCalls==null && other.getForeignNpaTollCalls()==null) || 
             (this.foreignNpaTollCalls!=null &&
              this.foreignNpaTollCalls.equals(other.getForeignNpaTollCalls()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.dialPlanTreatmentProfileId==null && other.getDialPlanTreatmentProfileId()==null) || 
             (this.dialPlanTreatmentProfileId!=null &&
              this.dialPlanTreatmentProfileId.equals(other.getDialPlanTreatmentProfileId()))) &&
            ((this.nationalPrefix==null && other.getNationalPrefix()==null) || 
             (this.nationalPrefix!=null &&
              this.nationalPrefix.equals(other.getNationalPrefix())));
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
        if (getDialPlanProfileId() != null) {
            _hashCode += getDialPlanProfileId().hashCode();
        }
        if (getHomeNpaLocalCalls() != null) {
            _hashCode += getHomeNpaLocalCalls().hashCode();
        }
        if (getHomeNpaTollCalls() != null) {
            _hashCode += getHomeNpaTollCalls().hashCode();
        }
        if (getForeignNpaLocalCalls() != null) {
            _hashCode += getForeignNpaLocalCalls().hashCode();
        }
        if (getForeignNpaTollCalls() != null) {
            _hashCode += getForeignNpaTollCalls().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getDialPlanTreatmentProfileId() != null) {
            _hashCode += getDialPlanTreatmentProfileId().hashCode();
        }
        if (getNationalPrefix() != null) {
            _hashCode += getNationalPrefix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DialPlanProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DialPlanProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dialPlanProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dialPlanProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeNpaLocalCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeNpaLocalCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeNpaTollCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeNpaTollCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignNpaLocalCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignNpaLocalCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignNpaTollCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignNpaTollCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dialPlanTreatmentProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dialPlanTreatmentProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalPrefix"));
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
