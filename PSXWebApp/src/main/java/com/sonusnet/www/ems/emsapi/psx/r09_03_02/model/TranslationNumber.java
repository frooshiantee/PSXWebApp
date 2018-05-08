/**
 * TranslationNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class TranslationNumber  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String translationLabelId;

    private java.lang.Short numberSequence;

    private java.lang.Short allocation;

    private java.lang.String terminationNumber;

    private java.lang.String carrierId;

    private java.lang.String countryId;

    private java.lang.Integer calltype;

    private java.lang.Short numberPlanIndicator;

    private java.lang.Short natureOfAddress;

    private java.lang.String routingLabelId;

    public TranslationNumber() {
    }

    public TranslationNumber(
           java.lang.String translationLabelId,
           java.lang.Short numberSequence,
           java.lang.Short allocation,
           java.lang.String terminationNumber,
           java.lang.String carrierId,
           java.lang.String countryId,
           java.lang.Integer calltype,
           java.lang.Short numberPlanIndicator,
           java.lang.Short natureOfAddress,
           java.lang.String routingLabelId) {
        this.translationLabelId = translationLabelId;
        this.numberSequence = numberSequence;
        this.allocation = allocation;
        this.terminationNumber = terminationNumber;
        this.carrierId = carrierId;
        this.countryId = countryId;
        this.calltype = calltype;
        this.numberPlanIndicator = numberPlanIndicator;
        this.natureOfAddress = natureOfAddress;
        this.routingLabelId = routingLabelId;
    }


    /**
     * Gets the translationLabelId value for this TranslationNumber.
     * 
     * @return translationLabelId
     */
    public java.lang.String getTranslationLabelId() {
        return translationLabelId;
    }


    /**
     * Sets the translationLabelId value for this TranslationNumber.
     * 
     * @param translationLabelId
     */
    public void setTranslationLabelId(java.lang.String translationLabelId) {
        this.translationLabelId = translationLabelId;
    }


    /**
     * Gets the numberSequence value for this TranslationNumber.
     * 
     * @return numberSequence
     */
    public java.lang.Short getNumberSequence() {
        return numberSequence;
    }


    /**
     * Sets the numberSequence value for this TranslationNumber.
     * 
     * @param numberSequence
     */
    public void setNumberSequence(java.lang.Short numberSequence) {
        this.numberSequence = numberSequence;
    }


    /**
     * Gets the allocation value for this TranslationNumber.
     * 
     * @return allocation
     */
    public java.lang.Short getAllocation() {
        return allocation;
    }


    /**
     * Sets the allocation value for this TranslationNumber.
     * 
     * @param allocation
     */
    public void setAllocation(java.lang.Short allocation) {
        this.allocation = allocation;
    }


    /**
     * Gets the terminationNumber value for this TranslationNumber.
     * 
     * @return terminationNumber
     */
    public java.lang.String getTerminationNumber() {
        return terminationNumber;
    }


    /**
     * Sets the terminationNumber value for this TranslationNumber.
     * 
     * @param terminationNumber
     */
    public void setTerminationNumber(java.lang.String terminationNumber) {
        this.terminationNumber = terminationNumber;
    }


    /**
     * Gets the carrierId value for this TranslationNumber.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this TranslationNumber.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the countryId value for this TranslationNumber.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this TranslationNumber.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the calltype value for this TranslationNumber.
     * 
     * @return calltype
     */
    public java.lang.Integer getCalltype() {
        return calltype;
    }


    /**
     * Sets the calltype value for this TranslationNumber.
     * 
     * @param calltype
     */
    public void setCalltype(java.lang.Integer calltype) {
        this.calltype = calltype;
    }


    /**
     * Gets the numberPlanIndicator value for this TranslationNumber.
     * 
     * @return numberPlanIndicator
     */
    public java.lang.Short getNumberPlanIndicator() {
        return numberPlanIndicator;
    }


    /**
     * Sets the numberPlanIndicator value for this TranslationNumber.
     * 
     * @param numberPlanIndicator
     */
    public void setNumberPlanIndicator(java.lang.Short numberPlanIndicator) {
        this.numberPlanIndicator = numberPlanIndicator;
    }


    /**
     * Gets the natureOfAddress value for this TranslationNumber.
     * 
     * @return natureOfAddress
     */
    public java.lang.Short getNatureOfAddress() {
        return natureOfAddress;
    }


    /**
     * Sets the natureOfAddress value for this TranslationNumber.
     * 
     * @param natureOfAddress
     */
    public void setNatureOfAddress(java.lang.Short natureOfAddress) {
        this.natureOfAddress = natureOfAddress;
    }


    /**
     * Gets the routingLabelId value for this TranslationNumber.
     * 
     * @return routingLabelId
     */
    public java.lang.String getRoutingLabelId() {
        return routingLabelId;
    }


    /**
     * Sets the routingLabelId value for this TranslationNumber.
     * 
     * @param routingLabelId
     */
    public void setRoutingLabelId(java.lang.String routingLabelId) {
        this.routingLabelId = routingLabelId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TranslationNumber)) return false;
        TranslationNumber other = (TranslationNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.translationLabelId==null && other.getTranslationLabelId()==null) || 
             (this.translationLabelId!=null &&
              this.translationLabelId.equals(other.getTranslationLabelId()))) &&
            ((this.numberSequence==null && other.getNumberSequence()==null) || 
             (this.numberSequence!=null &&
              this.numberSequence.equals(other.getNumberSequence()))) &&
            ((this.allocation==null && other.getAllocation()==null) || 
             (this.allocation!=null &&
              this.allocation.equals(other.getAllocation()))) &&
            ((this.terminationNumber==null && other.getTerminationNumber()==null) || 
             (this.terminationNumber!=null &&
              this.terminationNumber.equals(other.getTerminationNumber()))) &&
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.calltype==null && other.getCalltype()==null) || 
             (this.calltype!=null &&
              this.calltype.equals(other.getCalltype()))) &&
            ((this.numberPlanIndicator==null && other.getNumberPlanIndicator()==null) || 
             (this.numberPlanIndicator!=null &&
              this.numberPlanIndicator.equals(other.getNumberPlanIndicator()))) &&
            ((this.natureOfAddress==null && other.getNatureOfAddress()==null) || 
             (this.natureOfAddress!=null &&
              this.natureOfAddress.equals(other.getNatureOfAddress()))) &&
            ((this.routingLabelId==null && other.getRoutingLabelId()==null) || 
             (this.routingLabelId!=null &&
              this.routingLabelId.equals(other.getRoutingLabelId())));
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
        if (getTranslationLabelId() != null) {
            _hashCode += getTranslationLabelId().hashCode();
        }
        if (getNumberSequence() != null) {
            _hashCode += getNumberSequence().hashCode();
        }
        if (getAllocation() != null) {
            _hashCode += getAllocation().hashCode();
        }
        if (getTerminationNumber() != null) {
            _hashCode += getTerminationNumber().hashCode();
        }
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getCalltype() != null) {
            _hashCode += getCalltype().hashCode();
        }
        if (getNumberPlanIndicator() != null) {
            _hashCode += getNumberPlanIndicator().hashCode();
        }
        if (getNatureOfAddress() != null) {
            _hashCode += getNatureOfAddress().hashCode();
        }
        if (getRoutingLabelId() != null) {
            _hashCode += getRoutingLabelId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TranslationNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TranslationNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translationLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminationNumber"));
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
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberPlanIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberPlanIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natureOfAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natureOfAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingLabelId"));
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
