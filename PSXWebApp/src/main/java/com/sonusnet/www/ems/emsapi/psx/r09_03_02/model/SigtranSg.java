/**
 * SigtranSg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class SigtranSg  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Short sigtranSgId;

    private java.lang.String description;

    private java.lang.Short sgMode;

    private java.lang.String suaSpLabelId;

    private java.lang.String suaProtocolProfileId;

    private java.lang.Short sgPriority;

    public SigtranSg() {
    }

    public SigtranSg(
           java.lang.Short sigtranSgId,
           java.lang.String description,
           java.lang.Short sgMode,
           java.lang.String suaSpLabelId,
           java.lang.String suaProtocolProfileId,
           java.lang.Short sgPriority) {
        this.sigtranSgId = sigtranSgId;
        this.description = description;
        this.sgMode = sgMode;
        this.suaSpLabelId = suaSpLabelId;
        this.suaProtocolProfileId = suaProtocolProfileId;
        this.sgPriority = sgPriority;
    }


    /**
     * Gets the sigtranSgId value for this SigtranSg.
     * 
     * @return sigtranSgId
     */
    public java.lang.Short getSigtranSgId() {
        return sigtranSgId;
    }


    /**
     * Sets the sigtranSgId value for this SigtranSg.
     * 
     * @param sigtranSgId
     */
    public void setSigtranSgId(java.lang.Short sigtranSgId) {
        this.sigtranSgId = sigtranSgId;
    }


    /**
     * Gets the description value for this SigtranSg.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SigtranSg.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the sgMode value for this SigtranSg.
     * 
     * @return sgMode
     */
    public java.lang.Short getSgMode() {
        return sgMode;
    }


    /**
     * Sets the sgMode value for this SigtranSg.
     * 
     * @param sgMode
     */
    public void setSgMode(java.lang.Short sgMode) {
        this.sgMode = sgMode;
    }


    /**
     * Gets the suaSpLabelId value for this SigtranSg.
     * 
     * @return suaSpLabelId
     */
    public java.lang.String getSuaSpLabelId() {
        return suaSpLabelId;
    }


    /**
     * Sets the suaSpLabelId value for this SigtranSg.
     * 
     * @param suaSpLabelId
     */
    public void setSuaSpLabelId(java.lang.String suaSpLabelId) {
        this.suaSpLabelId = suaSpLabelId;
    }


    /**
     * Gets the suaProtocolProfileId value for this SigtranSg.
     * 
     * @return suaProtocolProfileId
     */
    public java.lang.String getSuaProtocolProfileId() {
        return suaProtocolProfileId;
    }


    /**
     * Sets the suaProtocolProfileId value for this SigtranSg.
     * 
     * @param suaProtocolProfileId
     */
    public void setSuaProtocolProfileId(java.lang.String suaProtocolProfileId) {
        this.suaProtocolProfileId = suaProtocolProfileId;
    }


    /**
     * Gets the sgPriority value for this SigtranSg.
     * 
     * @return sgPriority
     */
    public java.lang.Short getSgPriority() {
        return sgPriority;
    }


    /**
     * Sets the sgPriority value for this SigtranSg.
     * 
     * @param sgPriority
     */
    public void setSgPriority(java.lang.Short sgPriority) {
        this.sgPriority = sgPriority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SigtranSg)) return false;
        SigtranSg other = (SigtranSg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sigtranSgId==null && other.getSigtranSgId()==null) || 
             (this.sigtranSgId!=null &&
              this.sigtranSgId.equals(other.getSigtranSgId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.sgMode==null && other.getSgMode()==null) || 
             (this.sgMode!=null &&
              this.sgMode.equals(other.getSgMode()))) &&
            ((this.suaSpLabelId==null && other.getSuaSpLabelId()==null) || 
             (this.suaSpLabelId!=null &&
              this.suaSpLabelId.equals(other.getSuaSpLabelId()))) &&
            ((this.suaProtocolProfileId==null && other.getSuaProtocolProfileId()==null) || 
             (this.suaProtocolProfileId!=null &&
              this.suaProtocolProfileId.equals(other.getSuaProtocolProfileId()))) &&
            ((this.sgPriority==null && other.getSgPriority()==null) || 
             (this.sgPriority!=null &&
              this.sgPriority.equals(other.getSgPriority())));
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
        if (getSigtranSgId() != null) {
            _hashCode += getSigtranSgId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSgMode() != null) {
            _hashCode += getSgMode().hashCode();
        }
        if (getSuaSpLabelId() != null) {
            _hashCode += getSuaSpLabelId().hashCode();
        }
        if (getSuaProtocolProfileId() != null) {
            _hashCode += getSuaProtocolProfileId().hashCode();
        }
        if (getSgPriority() != null) {
            _hashCode += getSgPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SigtranSg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SigtranSg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigtranSgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigtranSgId"));
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
        elemField.setFieldName("sgMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sgMode"));
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
        elemField.setFieldName("suaProtocolProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suaProtocolProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sgPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sgPriority"));
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
