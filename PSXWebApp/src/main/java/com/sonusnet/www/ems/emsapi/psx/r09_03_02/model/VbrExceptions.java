/**
 * VbrExceptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class VbrExceptions  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Integer exceptionType;

    private java.lang.String customerId;

    private java.lang.String offerId;

    private java.lang.String value1;

    private java.lang.String value2;

    private java.lang.Short systemException;

    private java.lang.String value3;

    private java.lang.String description;

    private java.lang.String dateSaved;

    public VbrExceptions() {
    }

    public VbrExceptions(
           java.lang.Integer exceptionType,
           java.lang.String customerId,
           java.lang.String offerId,
           java.lang.String value1,
           java.lang.String value2,
           java.lang.Short systemException,
           java.lang.String value3,
           java.lang.String description,
           java.lang.String dateSaved) {
        this.exceptionType = exceptionType;
        this.customerId = customerId;
        this.offerId = offerId;
        this.value1 = value1;
        this.value2 = value2;
        this.systemException = systemException;
        this.value3 = value3;
        this.description = description;
        this.dateSaved = dateSaved;
    }


    /**
     * Gets the exceptionType value for this VbrExceptions.
     * 
     * @return exceptionType
     */
    public java.lang.Integer getExceptionType() {
        return exceptionType;
    }


    /**
     * Sets the exceptionType value for this VbrExceptions.
     * 
     * @param exceptionType
     */
    public void setExceptionType(java.lang.Integer exceptionType) {
        this.exceptionType = exceptionType;
    }


    /**
     * Gets the customerId value for this VbrExceptions.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this VbrExceptions.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the offerId value for this VbrExceptions.
     * 
     * @return offerId
     */
    public java.lang.String getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this VbrExceptions.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.String offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the value1 value for this VbrExceptions.
     * 
     * @return value1
     */
    public java.lang.String getValue1() {
        return value1;
    }


    /**
     * Sets the value1 value for this VbrExceptions.
     * 
     * @param value1
     */
    public void setValue1(java.lang.String value1) {
        this.value1 = value1;
    }


    /**
     * Gets the value2 value for this VbrExceptions.
     * 
     * @return value2
     */
    public java.lang.String getValue2() {
        return value2;
    }


    /**
     * Sets the value2 value for this VbrExceptions.
     * 
     * @param value2
     */
    public void setValue2(java.lang.String value2) {
        this.value2 = value2;
    }


    /**
     * Gets the systemException value for this VbrExceptions.
     * 
     * @return systemException
     */
    public java.lang.Short getSystemException() {
        return systemException;
    }


    /**
     * Sets the systemException value for this VbrExceptions.
     * 
     * @param systemException
     */
    public void setSystemException(java.lang.Short systemException) {
        this.systemException = systemException;
    }


    /**
     * Gets the value3 value for this VbrExceptions.
     * 
     * @return value3
     */
    public java.lang.String getValue3() {
        return value3;
    }


    /**
     * Sets the value3 value for this VbrExceptions.
     * 
     * @param value3
     */
    public void setValue3(java.lang.String value3) {
        this.value3 = value3;
    }


    /**
     * Gets the description value for this VbrExceptions.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this VbrExceptions.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dateSaved value for this VbrExceptions.
     * 
     * @return dateSaved
     */
    public java.lang.String getDateSaved() {
        return dateSaved;
    }


    /**
     * Sets the dateSaved value for this VbrExceptions.
     * 
     * @param dateSaved
     */
    public void setDateSaved(java.lang.String dateSaved) {
        this.dateSaved = dateSaved;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VbrExceptions)) return false;
        VbrExceptions other = (VbrExceptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.exceptionType==null && other.getExceptionType()==null) || 
             (this.exceptionType!=null &&
              this.exceptionType.equals(other.getExceptionType()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.offerId==null && other.getOfferId()==null) || 
             (this.offerId!=null &&
              this.offerId.equals(other.getOfferId()))) &&
            ((this.value1==null && other.getValue1()==null) || 
             (this.value1!=null &&
              this.value1.equals(other.getValue1()))) &&
            ((this.value2==null && other.getValue2()==null) || 
             (this.value2!=null &&
              this.value2.equals(other.getValue2()))) &&
            ((this.systemException==null && other.getSystemException()==null) || 
             (this.systemException!=null &&
              this.systemException.equals(other.getSystemException()))) &&
            ((this.value3==null && other.getValue3()==null) || 
             (this.value3!=null &&
              this.value3.equals(other.getValue3()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dateSaved==null && other.getDateSaved()==null) || 
             (this.dateSaved!=null &&
              this.dateSaved.equals(other.getDateSaved())));
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
        if (getExceptionType() != null) {
            _hashCode += getExceptionType().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getOfferId() != null) {
            _hashCode += getOfferId().hashCode();
        }
        if (getValue1() != null) {
            _hashCode += getValue1().hashCode();
        }
        if (getValue2() != null) {
            _hashCode += getValue2().hashCode();
        }
        if (getSystemException() != null) {
            _hashCode += getSystemException().hashCode();
        }
        if (getValue3() != null) {
            _hashCode += getValue3().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDateSaved() != null) {
            _hashCode += getDateSaved().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VbrExceptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrExceptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("systemException");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemException"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateSaved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateSaved"));
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
