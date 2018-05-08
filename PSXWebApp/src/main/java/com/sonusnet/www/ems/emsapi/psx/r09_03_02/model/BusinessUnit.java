/**
 * BusinessUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class BusinessUnit  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String businessGroupId;

    private java.lang.String businessUnitId;

    private java.lang.String businessUnitName;

    private java.lang.String callingPartyId;

    private java.lang.String classOfServiceId;

    private java.lang.Integer elementAttributes;

    private java.lang.String billingNumber;

    private java.lang.String exceptionProfileId;

    public BusinessUnit() {
    }

    public BusinessUnit(
           java.lang.String businessGroupId,
           java.lang.String businessUnitId,
           java.lang.String businessUnitName,
           java.lang.String callingPartyId,
           java.lang.String classOfServiceId,
           java.lang.Integer elementAttributes,
           java.lang.String billingNumber,
           java.lang.String exceptionProfileId) {
        this.businessGroupId = businessGroupId;
        this.businessUnitId = businessUnitId;
        this.businessUnitName = businessUnitName;
        this.callingPartyId = callingPartyId;
        this.classOfServiceId = classOfServiceId;
        this.elementAttributes = elementAttributes;
        this.billingNumber = billingNumber;
        this.exceptionProfileId = exceptionProfileId;
    }


    /**
     * Gets the businessGroupId value for this BusinessUnit.
     * 
     * @return businessGroupId
     */
    public java.lang.String getBusinessGroupId() {
        return businessGroupId;
    }


    /**
     * Sets the businessGroupId value for this BusinessUnit.
     * 
     * @param businessGroupId
     */
    public void setBusinessGroupId(java.lang.String businessGroupId) {
        this.businessGroupId = businessGroupId;
    }


    /**
     * Gets the businessUnitId value for this BusinessUnit.
     * 
     * @return businessUnitId
     */
    public java.lang.String getBusinessUnitId() {
        return businessUnitId;
    }


    /**
     * Sets the businessUnitId value for this BusinessUnit.
     * 
     * @param businessUnitId
     */
    public void setBusinessUnitId(java.lang.String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }


    /**
     * Gets the businessUnitName value for this BusinessUnit.
     * 
     * @return businessUnitName
     */
    public java.lang.String getBusinessUnitName() {
        return businessUnitName;
    }


    /**
     * Sets the businessUnitName value for this BusinessUnit.
     * 
     * @param businessUnitName
     */
    public void setBusinessUnitName(java.lang.String businessUnitName) {
        this.businessUnitName = businessUnitName;
    }


    /**
     * Gets the callingPartyId value for this BusinessUnit.
     * 
     * @return callingPartyId
     */
    public java.lang.String getCallingPartyId() {
        return callingPartyId;
    }


    /**
     * Sets the callingPartyId value for this BusinessUnit.
     * 
     * @param callingPartyId
     */
    public void setCallingPartyId(java.lang.String callingPartyId) {
        this.callingPartyId = callingPartyId;
    }


    /**
     * Gets the classOfServiceId value for this BusinessUnit.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this BusinessUnit.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the elementAttributes value for this BusinessUnit.
     * 
     * @return elementAttributes
     */
    public java.lang.Integer getElementAttributes() {
        return elementAttributes;
    }


    /**
     * Sets the elementAttributes value for this BusinessUnit.
     * 
     * @param elementAttributes
     */
    public void setElementAttributes(java.lang.Integer elementAttributes) {
        this.elementAttributes = elementAttributes;
    }


    /**
     * Gets the billingNumber value for this BusinessUnit.
     * 
     * @return billingNumber
     */
    public java.lang.String getBillingNumber() {
        return billingNumber;
    }


    /**
     * Sets the billingNumber value for this BusinessUnit.
     * 
     * @param billingNumber
     */
    public void setBillingNumber(java.lang.String billingNumber) {
        this.billingNumber = billingNumber;
    }


    /**
     * Gets the exceptionProfileId value for this BusinessUnit.
     * 
     * @return exceptionProfileId
     */
    public java.lang.String getExceptionProfileId() {
        return exceptionProfileId;
    }


    /**
     * Sets the exceptionProfileId value for this BusinessUnit.
     * 
     * @param exceptionProfileId
     */
    public void setExceptionProfileId(java.lang.String exceptionProfileId) {
        this.exceptionProfileId = exceptionProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessUnit)) return false;
        BusinessUnit other = (BusinessUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessGroupId==null && other.getBusinessGroupId()==null) || 
             (this.businessGroupId!=null &&
              this.businessGroupId.equals(other.getBusinessGroupId()))) &&
            ((this.businessUnitId==null && other.getBusinessUnitId()==null) || 
             (this.businessUnitId!=null &&
              this.businessUnitId.equals(other.getBusinessUnitId()))) &&
            ((this.businessUnitName==null && other.getBusinessUnitName()==null) || 
             (this.businessUnitName!=null &&
              this.businessUnitName.equals(other.getBusinessUnitName()))) &&
            ((this.callingPartyId==null && other.getCallingPartyId()==null) || 
             (this.callingPartyId!=null &&
              this.callingPartyId.equals(other.getCallingPartyId()))) &&
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.elementAttributes==null && other.getElementAttributes()==null) || 
             (this.elementAttributes!=null &&
              this.elementAttributes.equals(other.getElementAttributes()))) &&
            ((this.billingNumber==null && other.getBillingNumber()==null) || 
             (this.billingNumber!=null &&
              this.billingNumber.equals(other.getBillingNumber()))) &&
            ((this.exceptionProfileId==null && other.getExceptionProfileId()==null) || 
             (this.exceptionProfileId!=null &&
              this.exceptionProfileId.equals(other.getExceptionProfileId())));
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
        if (getBusinessGroupId() != null) {
            _hashCode += getBusinessGroupId().hashCode();
        }
        if (getBusinessUnitId() != null) {
            _hashCode += getBusinessUnitId().hashCode();
        }
        if (getBusinessUnitName() != null) {
            _hashCode += getBusinessUnitName().hashCode();
        }
        if (getCallingPartyId() != null) {
            _hashCode += getCallingPartyId().hashCode();
        }
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getElementAttributes() != null) {
            _hashCode += getElementAttributes().hashCode();
        }
        if (getBillingNumber() != null) {
            _hashCode += getBillingNumber().hashCode();
        }
        if (getExceptionProfileId() != null) {
            _hashCode += getExceptionProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BusinessUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classOfServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classOfServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elementAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionProfileId"));
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
