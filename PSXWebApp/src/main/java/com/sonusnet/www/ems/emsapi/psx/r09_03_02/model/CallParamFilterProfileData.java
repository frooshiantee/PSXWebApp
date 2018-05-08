/**
 * CallParamFilterProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CallParamFilterProfileData  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String callParamFilterProfileId;

    private java.lang.Integer type;

    private java.lang.String value1;

    private java.lang.String value2;

    private java.lang.String carrierId;

    private java.lang.Integer attributes;

    private java.lang.String carrierGroupId;

    private java.lang.String chargeAreaGroupId;

    private java.lang.String groupId;

    private java.lang.String regexProfileId;

    public CallParamFilterProfileData() {
    }

    public CallParamFilterProfileData(
           java.lang.String callParamFilterProfileId,
           java.lang.Integer type,
           java.lang.String value1,
           java.lang.String value2,
           java.lang.String carrierId,
           java.lang.Integer attributes,
           java.lang.String carrierGroupId,
           java.lang.String chargeAreaGroupId,
           java.lang.String groupId,
           java.lang.String regexProfileId) {
        this.callParamFilterProfileId = callParamFilterProfileId;
        this.type = type;
        this.value1 = value1;
        this.value2 = value2;
        this.carrierId = carrierId;
        this.attributes = attributes;
        this.carrierGroupId = carrierGroupId;
        this.chargeAreaGroupId = chargeAreaGroupId;
        this.groupId = groupId;
        this.regexProfileId = regexProfileId;
    }


    /**
     * Gets the callParamFilterProfileId value for this CallParamFilterProfileData.
     * 
     * @return callParamFilterProfileId
     */
    public java.lang.String getCallParamFilterProfileId() {
        return callParamFilterProfileId;
    }


    /**
     * Sets the callParamFilterProfileId value for this CallParamFilterProfileData.
     * 
     * @param callParamFilterProfileId
     */
    public void setCallParamFilterProfileId(java.lang.String callParamFilterProfileId) {
        this.callParamFilterProfileId = callParamFilterProfileId;
    }


    /**
     * Gets the type value for this CallParamFilterProfileData.
     * 
     * @return type
     */
    public java.lang.Integer getType() {
        return type;
    }


    /**
     * Sets the type value for this CallParamFilterProfileData.
     * 
     * @param type
     */
    public void setType(java.lang.Integer type) {
        this.type = type;
    }


    /**
     * Gets the value1 value for this CallParamFilterProfileData.
     * 
     * @return value1
     */
    public java.lang.String getValue1() {
        return value1;
    }


    /**
     * Sets the value1 value for this CallParamFilterProfileData.
     * 
     * @param value1
     */
    public void setValue1(java.lang.String value1) {
        this.value1 = value1;
    }


    /**
     * Gets the value2 value for this CallParamFilterProfileData.
     * 
     * @return value2
     */
    public java.lang.String getValue2() {
        return value2;
    }


    /**
     * Sets the value2 value for this CallParamFilterProfileData.
     * 
     * @param value2
     */
    public void setValue2(java.lang.String value2) {
        this.value2 = value2;
    }


    /**
     * Gets the carrierId value for this CallParamFilterProfileData.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this CallParamFilterProfileData.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the attributes value for this CallParamFilterProfileData.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this CallParamFilterProfileData.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the carrierGroupId value for this CallParamFilterProfileData.
     * 
     * @return carrierGroupId
     */
    public java.lang.String getCarrierGroupId() {
        return carrierGroupId;
    }


    /**
     * Sets the carrierGroupId value for this CallParamFilterProfileData.
     * 
     * @param carrierGroupId
     */
    public void setCarrierGroupId(java.lang.String carrierGroupId) {
        this.carrierGroupId = carrierGroupId;
    }


    /**
     * Gets the chargeAreaGroupId value for this CallParamFilterProfileData.
     * 
     * @return chargeAreaGroupId
     */
    public java.lang.String getChargeAreaGroupId() {
        return chargeAreaGroupId;
    }


    /**
     * Sets the chargeAreaGroupId value for this CallParamFilterProfileData.
     * 
     * @param chargeAreaGroupId
     */
    public void setChargeAreaGroupId(java.lang.String chargeAreaGroupId) {
        this.chargeAreaGroupId = chargeAreaGroupId;
    }


    /**
     * Gets the groupId value for this CallParamFilterProfileData.
     * 
     * @return groupId
     */
    public java.lang.String getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this CallParamFilterProfileData.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.String groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the regexProfileId value for this CallParamFilterProfileData.
     * 
     * @return regexProfileId
     */
    public java.lang.String getRegexProfileId() {
        return regexProfileId;
    }


    /**
     * Sets the regexProfileId value for this CallParamFilterProfileData.
     * 
     * @param regexProfileId
     */
    public void setRegexProfileId(java.lang.String regexProfileId) {
        this.regexProfileId = regexProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallParamFilterProfileData)) return false;
        CallParamFilterProfileData other = (CallParamFilterProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callParamFilterProfileId==null && other.getCallParamFilterProfileId()==null) || 
             (this.callParamFilterProfileId!=null &&
              this.callParamFilterProfileId.equals(other.getCallParamFilterProfileId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.value1==null && other.getValue1()==null) || 
             (this.value1!=null &&
              this.value1.equals(other.getValue1()))) &&
            ((this.value2==null && other.getValue2()==null) || 
             (this.value2!=null &&
              this.value2.equals(other.getValue2()))) &&
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.carrierGroupId==null && other.getCarrierGroupId()==null) || 
             (this.carrierGroupId!=null &&
              this.carrierGroupId.equals(other.getCarrierGroupId()))) &&
            ((this.chargeAreaGroupId==null && other.getChargeAreaGroupId()==null) || 
             (this.chargeAreaGroupId!=null &&
              this.chargeAreaGroupId.equals(other.getChargeAreaGroupId()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.regexProfileId==null && other.getRegexProfileId()==null) || 
             (this.regexProfileId!=null &&
              this.regexProfileId.equals(other.getRegexProfileId())));
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
        if (getCallParamFilterProfileId() != null) {
            _hashCode += getCallParamFilterProfileId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValue1() != null) {
            _hashCode += getValue1().hashCode();
        }
        if (getValue2() != null) {
            _hashCode += getValue2().hashCode();
        }
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getCarrierGroupId() != null) {
            _hashCode += getCarrierGroupId().hashCode();
        }
        if (getChargeAreaGroupId() != null) {
            _hashCode += getChargeAreaGroupId().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getRegexProfileId() != null) {
            _hashCode += getRegexProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallParamFilterProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallParamFilterProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParamFilterProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeAreaGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeAreaGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regexProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regexProfileId"));
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
