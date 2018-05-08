/**
 * SuaSp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SuaSp  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Short suaSpId;

    private java.lang.String description;

    private java.lang.Short spType;

    private java.lang.String sctpIpAddressId;

    private java.lang.Short portNumber;

    private java.lang.Short spRole;

    private java.lang.Short tidLabel;

    private java.lang.String suaProtocolProfileId;

    public SuaSp() {
    }

    public SuaSp(
           java.lang.Short suaSpId,
           java.lang.String description,
           java.lang.Short spType,
           java.lang.String sctpIpAddressId,
           java.lang.Short portNumber,
           java.lang.Short spRole,
           java.lang.Short tidLabel,
           java.lang.String suaProtocolProfileId) {
        this.suaSpId = suaSpId;
        this.description = description;
        this.spType = spType;
        this.sctpIpAddressId = sctpIpAddressId;
        this.portNumber = portNumber;
        this.spRole = spRole;
        this.tidLabel = tidLabel;
        this.suaProtocolProfileId = suaProtocolProfileId;
    }


    /**
     * Gets the suaSpId value for this SuaSp.
     * 
     * @return suaSpId
     */
    public java.lang.Short getSuaSpId() {
        return suaSpId;
    }


    /**
     * Sets the suaSpId value for this SuaSp.
     * 
     * @param suaSpId
     */
    public void setSuaSpId(java.lang.Short suaSpId) {
        this.suaSpId = suaSpId;
    }


    /**
     * Gets the description value for this SuaSp.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SuaSp.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the spType value for this SuaSp.
     * 
     * @return spType
     */
    public java.lang.Short getSpType() {
        return spType;
    }


    /**
     * Sets the spType value for this SuaSp.
     * 
     * @param spType
     */
    public void setSpType(java.lang.Short spType) {
        this.spType = spType;
    }


    /**
     * Gets the sctpIpAddressId value for this SuaSp.
     * 
     * @return sctpIpAddressId
     */
    public java.lang.String getSctpIpAddressId() {
        return sctpIpAddressId;
    }


    /**
     * Sets the sctpIpAddressId value for this SuaSp.
     * 
     * @param sctpIpAddressId
     */
    public void setSctpIpAddressId(java.lang.String sctpIpAddressId) {
        this.sctpIpAddressId = sctpIpAddressId;
    }


    /**
     * Gets the portNumber value for this SuaSp.
     * 
     * @return portNumber
     */
    public java.lang.Short getPortNumber() {
        return portNumber;
    }


    /**
     * Sets the portNumber value for this SuaSp.
     * 
     * @param portNumber
     */
    public void setPortNumber(java.lang.Short portNumber) {
        this.portNumber = portNumber;
    }


    /**
     * Gets the spRole value for this SuaSp.
     * 
     * @return spRole
     */
    public java.lang.Short getSpRole() {
        return spRole;
    }


    /**
     * Sets the spRole value for this SuaSp.
     * 
     * @param spRole
     */
    public void setSpRole(java.lang.Short spRole) {
        this.spRole = spRole;
    }


    /**
     * Gets the tidLabel value for this SuaSp.
     * 
     * @return tidLabel
     */
    public java.lang.Short getTidLabel() {
        return tidLabel;
    }


    /**
     * Sets the tidLabel value for this SuaSp.
     * 
     * @param tidLabel
     */
    public void setTidLabel(java.lang.Short tidLabel) {
        this.tidLabel = tidLabel;
    }


    /**
     * Gets the suaProtocolProfileId value for this SuaSp.
     * 
     * @return suaProtocolProfileId
     */
    public java.lang.String getSuaProtocolProfileId() {
        return suaProtocolProfileId;
    }


    /**
     * Sets the suaProtocolProfileId value for this SuaSp.
     * 
     * @param suaProtocolProfileId
     */
    public void setSuaProtocolProfileId(java.lang.String suaProtocolProfileId) {
        this.suaProtocolProfileId = suaProtocolProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuaSp)) return false;
        SuaSp other = (SuaSp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.suaSpId==null && other.getSuaSpId()==null) || 
             (this.suaSpId!=null &&
              this.suaSpId.equals(other.getSuaSpId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.spType==null && other.getSpType()==null) || 
             (this.spType!=null &&
              this.spType.equals(other.getSpType()))) &&
            ((this.sctpIpAddressId==null && other.getSctpIpAddressId()==null) || 
             (this.sctpIpAddressId!=null &&
              this.sctpIpAddressId.equals(other.getSctpIpAddressId()))) &&
            ((this.portNumber==null && other.getPortNumber()==null) || 
             (this.portNumber!=null &&
              this.portNumber.equals(other.getPortNumber()))) &&
            ((this.spRole==null && other.getSpRole()==null) || 
             (this.spRole!=null &&
              this.spRole.equals(other.getSpRole()))) &&
            ((this.tidLabel==null && other.getTidLabel()==null) || 
             (this.tidLabel!=null &&
              this.tidLabel.equals(other.getTidLabel()))) &&
            ((this.suaProtocolProfileId==null && other.getSuaProtocolProfileId()==null) || 
             (this.suaProtocolProfileId!=null &&
              this.suaProtocolProfileId.equals(other.getSuaProtocolProfileId())));
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
        if (getSuaSpId() != null) {
            _hashCode += getSuaSpId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSpType() != null) {
            _hashCode += getSpType().hashCode();
        }
        if (getSctpIpAddressId() != null) {
            _hashCode += getSctpIpAddressId().hashCode();
        }
        if (getPortNumber() != null) {
            _hashCode += getPortNumber().hashCode();
        }
        if (getSpRole() != null) {
            _hashCode += getSpRole().hashCode();
        }
        if (getTidLabel() != null) {
            _hashCode += getTidLabel().hashCode();
        }
        if (getSuaProtocolProfileId() != null) {
            _hashCode += getSuaProtocolProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SuaSp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SuaSp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suaSpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suaSpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sctpIpAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sctpIpAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spRole");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tidLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tidLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suaProtocolProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suaProtocolProfileId"));
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
