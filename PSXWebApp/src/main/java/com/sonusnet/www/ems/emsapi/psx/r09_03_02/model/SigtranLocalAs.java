/**
 * SigtranLocalAs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SigtranLocalAs  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Short sigtranLocalAsId;

    private java.lang.String description;

    private java.lang.Short asMode;

    private java.lang.String suaSpLabelId;

    private java.lang.String pointCode;

    private java.lang.Short subSystemNumber;

    private java.lang.String suaNetworkAppearanceId;

    private java.lang.String suaProtocolProfileId;

    public SigtranLocalAs() {
    }

    public SigtranLocalAs(
           java.lang.Short sigtranLocalAsId,
           java.lang.String description,
           java.lang.Short asMode,
           java.lang.String suaSpLabelId,
           java.lang.String pointCode,
           java.lang.Short subSystemNumber,
           java.lang.String suaNetworkAppearanceId,
           java.lang.String suaProtocolProfileId) {
        this.sigtranLocalAsId = sigtranLocalAsId;
        this.description = description;
        this.asMode = asMode;
        this.suaSpLabelId = suaSpLabelId;
        this.pointCode = pointCode;
        this.subSystemNumber = subSystemNumber;
        this.suaNetworkAppearanceId = suaNetworkAppearanceId;
        this.suaProtocolProfileId = suaProtocolProfileId;
    }


    /**
     * Gets the sigtranLocalAsId value for this SigtranLocalAs.
     * 
     * @return sigtranLocalAsId
     */
    public java.lang.Short getSigtranLocalAsId() {
        return sigtranLocalAsId;
    }


    /**
     * Sets the sigtranLocalAsId value for this SigtranLocalAs.
     * 
     * @param sigtranLocalAsId
     */
    public void setSigtranLocalAsId(java.lang.Short sigtranLocalAsId) {
        this.sigtranLocalAsId = sigtranLocalAsId;
    }


    /**
     * Gets the description value for this SigtranLocalAs.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SigtranLocalAs.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the asMode value for this SigtranLocalAs.
     * 
     * @return asMode
     */
    public java.lang.Short getAsMode() {
        return asMode;
    }


    /**
     * Sets the asMode value for this SigtranLocalAs.
     * 
     * @param asMode
     */
    public void setAsMode(java.lang.Short asMode) {
        this.asMode = asMode;
    }


    /**
     * Gets the suaSpLabelId value for this SigtranLocalAs.
     * 
     * @return suaSpLabelId
     */
    public java.lang.String getSuaSpLabelId() {
        return suaSpLabelId;
    }


    /**
     * Sets the suaSpLabelId value for this SigtranLocalAs.
     * 
     * @param suaSpLabelId
     */
    public void setSuaSpLabelId(java.lang.String suaSpLabelId) {
        this.suaSpLabelId = suaSpLabelId;
    }


    /**
     * Gets the pointCode value for this SigtranLocalAs.
     * 
     * @return pointCode
     */
    public java.lang.String getPointCode() {
        return pointCode;
    }


    /**
     * Sets the pointCode value for this SigtranLocalAs.
     * 
     * @param pointCode
     */
    public void setPointCode(java.lang.String pointCode) {
        this.pointCode = pointCode;
    }


    /**
     * Gets the subSystemNumber value for this SigtranLocalAs.
     * 
     * @return subSystemNumber
     */
    public java.lang.Short getSubSystemNumber() {
        return subSystemNumber;
    }


    /**
     * Sets the subSystemNumber value for this SigtranLocalAs.
     * 
     * @param subSystemNumber
     */
    public void setSubSystemNumber(java.lang.Short subSystemNumber) {
        this.subSystemNumber = subSystemNumber;
    }


    /**
     * Gets the suaNetworkAppearanceId value for this SigtranLocalAs.
     * 
     * @return suaNetworkAppearanceId
     */
    public java.lang.String getSuaNetworkAppearanceId() {
        return suaNetworkAppearanceId;
    }


    /**
     * Sets the suaNetworkAppearanceId value for this SigtranLocalAs.
     * 
     * @param suaNetworkAppearanceId
     */
    public void setSuaNetworkAppearanceId(java.lang.String suaNetworkAppearanceId) {
        this.suaNetworkAppearanceId = suaNetworkAppearanceId;
    }


    /**
     * Gets the suaProtocolProfileId value for this SigtranLocalAs.
     * 
     * @return suaProtocolProfileId
     */
    public java.lang.String getSuaProtocolProfileId() {
        return suaProtocolProfileId;
    }


    /**
     * Sets the suaProtocolProfileId value for this SigtranLocalAs.
     * 
     * @param suaProtocolProfileId
     */
    public void setSuaProtocolProfileId(java.lang.String suaProtocolProfileId) {
        this.suaProtocolProfileId = suaProtocolProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SigtranLocalAs)) return false;
        SigtranLocalAs other = (SigtranLocalAs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sigtranLocalAsId==null && other.getSigtranLocalAsId()==null) || 
             (this.sigtranLocalAsId!=null &&
              this.sigtranLocalAsId.equals(other.getSigtranLocalAsId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.asMode==null && other.getAsMode()==null) || 
             (this.asMode!=null &&
              this.asMode.equals(other.getAsMode()))) &&
            ((this.suaSpLabelId==null && other.getSuaSpLabelId()==null) || 
             (this.suaSpLabelId!=null &&
              this.suaSpLabelId.equals(other.getSuaSpLabelId()))) &&
            ((this.pointCode==null && other.getPointCode()==null) || 
             (this.pointCode!=null &&
              this.pointCode.equals(other.getPointCode()))) &&
            ((this.subSystemNumber==null && other.getSubSystemNumber()==null) || 
             (this.subSystemNumber!=null &&
              this.subSystemNumber.equals(other.getSubSystemNumber()))) &&
            ((this.suaNetworkAppearanceId==null && other.getSuaNetworkAppearanceId()==null) || 
             (this.suaNetworkAppearanceId!=null &&
              this.suaNetworkAppearanceId.equals(other.getSuaNetworkAppearanceId()))) &&
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
        if (getSigtranLocalAsId() != null) {
            _hashCode += getSigtranLocalAsId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAsMode() != null) {
            _hashCode += getAsMode().hashCode();
        }
        if (getSuaSpLabelId() != null) {
            _hashCode += getSuaSpLabelId().hashCode();
        }
        if (getPointCode() != null) {
            _hashCode += getPointCode().hashCode();
        }
        if (getSubSystemNumber() != null) {
            _hashCode += getSubSystemNumber().hashCode();
        }
        if (getSuaNetworkAppearanceId() != null) {
            _hashCode += getSuaNetworkAppearanceId().hashCode();
        }
        if (getSuaProtocolProfileId() != null) {
            _hashCode += getSuaProtocolProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SigtranLocalAs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SigtranLocalAs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigtranLocalAsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigtranLocalAsId"));
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
        elemField.setFieldName("asMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suaSpLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suaSpLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSystemNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subSystemNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suaNetworkAppearanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suaNetworkAppearanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
