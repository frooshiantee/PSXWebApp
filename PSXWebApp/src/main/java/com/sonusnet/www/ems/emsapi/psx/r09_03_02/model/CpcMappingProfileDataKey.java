/**
 * CpcMappingProfileDataKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CpcMappingProfileDataKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String cpcMappingProfileId;

    private java.lang.Short mappingType;

    private java.lang.Short inCpcOli;

    private java.lang.Integer inDestSwType;

    private java.lang.Integer egDestSwType;

    public CpcMappingProfileDataKey() {
    }

    public CpcMappingProfileDataKey(
           java.lang.String cpcMappingProfileId,
           java.lang.Short mappingType,
           java.lang.Short inCpcOli,
           java.lang.Integer inDestSwType,
           java.lang.Integer egDestSwType) {
        this.cpcMappingProfileId = cpcMappingProfileId;
        this.mappingType = mappingType;
        this.inCpcOli = inCpcOli;
        this.inDestSwType = inDestSwType;
        this.egDestSwType = egDestSwType;
    }


    /**
     * Gets the cpcMappingProfileId value for this CpcMappingProfileDataKey.
     * 
     * @return cpcMappingProfileId
     */
    public java.lang.String getCpcMappingProfileId() {
        return cpcMappingProfileId;
    }


    /**
     * Sets the cpcMappingProfileId value for this CpcMappingProfileDataKey.
     * 
     * @param cpcMappingProfileId
     */
    public void setCpcMappingProfileId(java.lang.String cpcMappingProfileId) {
        this.cpcMappingProfileId = cpcMappingProfileId;
    }


    /**
     * Gets the mappingType value for this CpcMappingProfileDataKey.
     * 
     * @return mappingType
     */
    public java.lang.Short getMappingType() {
        return mappingType;
    }


    /**
     * Sets the mappingType value for this CpcMappingProfileDataKey.
     * 
     * @param mappingType
     */
    public void setMappingType(java.lang.Short mappingType) {
        this.mappingType = mappingType;
    }


    /**
     * Gets the inCpcOli value for this CpcMappingProfileDataKey.
     * 
     * @return inCpcOli
     */
    public java.lang.Short getInCpcOli() {
        return inCpcOli;
    }


    /**
     * Sets the inCpcOli value for this CpcMappingProfileDataKey.
     * 
     * @param inCpcOli
     */
    public void setInCpcOli(java.lang.Short inCpcOli) {
        this.inCpcOli = inCpcOli;
    }


    /**
     * Gets the inDestSwType value for this CpcMappingProfileDataKey.
     * 
     * @return inDestSwType
     */
    public java.lang.Integer getInDestSwType() {
        return inDestSwType;
    }


    /**
     * Sets the inDestSwType value for this CpcMappingProfileDataKey.
     * 
     * @param inDestSwType
     */
    public void setInDestSwType(java.lang.Integer inDestSwType) {
        this.inDestSwType = inDestSwType;
    }


    /**
     * Gets the egDestSwType value for this CpcMappingProfileDataKey.
     * 
     * @return egDestSwType
     */
    public java.lang.Integer getEgDestSwType() {
        return egDestSwType;
    }


    /**
     * Sets the egDestSwType value for this CpcMappingProfileDataKey.
     * 
     * @param egDestSwType
     */
    public void setEgDestSwType(java.lang.Integer egDestSwType) {
        this.egDestSwType = egDestSwType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpcMappingProfileDataKey)) return false;
        CpcMappingProfileDataKey other = (CpcMappingProfileDataKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cpcMappingProfileId==null && other.getCpcMappingProfileId()==null) || 
             (this.cpcMappingProfileId!=null &&
              this.cpcMappingProfileId.equals(other.getCpcMappingProfileId()))) &&
            ((this.mappingType==null && other.getMappingType()==null) || 
             (this.mappingType!=null &&
              this.mappingType.equals(other.getMappingType()))) &&
            ((this.inCpcOli==null && other.getInCpcOli()==null) || 
             (this.inCpcOli!=null &&
              this.inCpcOli.equals(other.getInCpcOli()))) &&
            ((this.inDestSwType==null && other.getInDestSwType()==null) || 
             (this.inDestSwType!=null &&
              this.inDestSwType.equals(other.getInDestSwType()))) &&
            ((this.egDestSwType==null && other.getEgDestSwType()==null) || 
             (this.egDestSwType!=null &&
              this.egDestSwType.equals(other.getEgDestSwType())));
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
        if (getCpcMappingProfileId() != null) {
            _hashCode += getCpcMappingProfileId().hashCode();
        }
        if (getMappingType() != null) {
            _hashCode += getMappingType().hashCode();
        }
        if (getInCpcOli() != null) {
            _hashCode += getInCpcOli().hashCode();
        }
        if (getInDestSwType() != null) {
            _hashCode += getInDestSwType().hashCode();
        }
        if (getEgDestSwType() != null) {
            _hashCode += getEgDestSwType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpcMappingProfileDataKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CpcMappingProfileDataKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpcMappingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpcMappingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mappingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inCpcOli");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inCpcOli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inDestSwType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inDestSwType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egDestSwType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "egDestSwType"));
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
