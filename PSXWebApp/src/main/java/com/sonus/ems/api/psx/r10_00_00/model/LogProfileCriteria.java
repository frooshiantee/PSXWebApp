/**
 * LogProfileCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class LogProfileCriteria  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String logProfileId;
    private java.lang.Integer criteriaType;
    private java.lang.String criteriaValue1;
    private java.lang.String criteriaValue2;
    private java.lang.String criteriaValue3;

    public LogProfileCriteria() {
    }

    public LogProfileCriteria(
           java.lang.String logProfileId,
           java.lang.Integer criteriaType,
           java.lang.String criteriaValue1,
           java.lang.String criteriaValue2,
           java.lang.String criteriaValue3) {
           this.logProfileId = logProfileId;
           this.criteriaType = criteriaType;
           this.criteriaValue1 = criteriaValue1;
           this.criteriaValue2 = criteriaValue2;
           this.criteriaValue3 = criteriaValue3;
    }


    /**
     * Gets the logProfileId value for this LogProfileCriteria.
     * 
     * @return logProfileId
     */
    public java.lang.String getLogProfileId() {
        return logProfileId;
    }


    /**
     * Sets the logProfileId value for this LogProfileCriteria.
     * 
     * @param logProfileId
     */
    public void setLogProfileId(java.lang.String logProfileId) {
        this.logProfileId = logProfileId;
    }


    /**
     * Gets the criteriaType value for this LogProfileCriteria.
     * 
     * @return criteriaType
     */
    public java.lang.Integer getCriteriaType() {
        return criteriaType;
    }


    /**
     * Sets the criteriaType value for this LogProfileCriteria.
     * 
     * @param criteriaType
     */
    public void setCriteriaType(java.lang.Integer criteriaType) {
        this.criteriaType = criteriaType;
    }


    /**
     * Gets the criteriaValue1 value for this LogProfileCriteria.
     * 
     * @return criteriaValue1
     */
    public java.lang.String getCriteriaValue1() {
        return criteriaValue1;
    }


    /**
     * Sets the criteriaValue1 value for this LogProfileCriteria.
     * 
     * @param criteriaValue1
     */
    public void setCriteriaValue1(java.lang.String criteriaValue1) {
        this.criteriaValue1 = criteriaValue1;
    }


    /**
     * Gets the criteriaValue2 value for this LogProfileCriteria.
     * 
     * @return criteriaValue2
     */
    public java.lang.String getCriteriaValue2() {
        return criteriaValue2;
    }


    /**
     * Sets the criteriaValue2 value for this LogProfileCriteria.
     * 
     * @param criteriaValue2
     */
    public void setCriteriaValue2(java.lang.String criteriaValue2) {
        this.criteriaValue2 = criteriaValue2;
    }


    /**
     * Gets the criteriaValue3 value for this LogProfileCriteria.
     * 
     * @return criteriaValue3
     */
    public java.lang.String getCriteriaValue3() {
        return criteriaValue3;
    }


    /**
     * Sets the criteriaValue3 value for this LogProfileCriteria.
     * 
     * @param criteriaValue3
     */
    public void setCriteriaValue3(java.lang.String criteriaValue3) {
        this.criteriaValue3 = criteriaValue3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogProfileCriteria)) return false;
        LogProfileCriteria other = (LogProfileCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.logProfileId==null && other.getLogProfileId()==null) || 
             (this.logProfileId!=null &&
              this.logProfileId.equals(other.getLogProfileId()))) &&
            ((this.criteriaType==null && other.getCriteriaType()==null) || 
             (this.criteriaType!=null &&
              this.criteriaType.equals(other.getCriteriaType()))) &&
            ((this.criteriaValue1==null && other.getCriteriaValue1()==null) || 
             (this.criteriaValue1!=null &&
              this.criteriaValue1.equals(other.getCriteriaValue1()))) &&
            ((this.criteriaValue2==null && other.getCriteriaValue2()==null) || 
             (this.criteriaValue2!=null &&
              this.criteriaValue2.equals(other.getCriteriaValue2()))) &&
            ((this.criteriaValue3==null && other.getCriteriaValue3()==null) || 
             (this.criteriaValue3!=null &&
              this.criteriaValue3.equals(other.getCriteriaValue3())));
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
        if (getLogProfileId() != null) {
            _hashCode += getLogProfileId().hashCode();
        }
        if (getCriteriaType() != null) {
            _hashCode += getCriteriaType().hashCode();
        }
        if (getCriteriaValue1() != null) {
            _hashCode += getCriteriaValue1().hashCode();
        }
        if (getCriteriaValue2() != null) {
            _hashCode += getCriteriaValue2().hashCode();
        }
        if (getCriteriaValue3() != null) {
            _hashCode += getCriteriaValue3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogProfileCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LogProfileCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaValue1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriaValue1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriaValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaValue3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriaValue3"));
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
