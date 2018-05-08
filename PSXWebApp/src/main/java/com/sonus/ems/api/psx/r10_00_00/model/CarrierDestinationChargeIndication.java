/**
 * CarrierDestinationChargeIndication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CarrierDestinationChargeIndication  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String carrierId;
    private java.lang.String countryId;
    private java.lang.String nationalId;
    private java.lang.Short anmChargeInd;
    private java.lang.Short acmChargeInd;
    private java.lang.Short treatmentAcmChargeInd;
    private java.lang.String callParamFilterGroupId;

    public CarrierDestinationChargeIndication() {
    }

    public CarrierDestinationChargeIndication(
           java.lang.String carrierId,
           java.lang.String countryId,
           java.lang.String nationalId,
           java.lang.Short anmChargeInd,
           java.lang.Short acmChargeInd,
           java.lang.Short treatmentAcmChargeInd,
           java.lang.String callParamFilterGroupId) {
           this.carrierId = carrierId;
           this.countryId = countryId;
           this.nationalId = nationalId;
           this.anmChargeInd = anmChargeInd;
           this.acmChargeInd = acmChargeInd;
           this.treatmentAcmChargeInd = treatmentAcmChargeInd;
           this.callParamFilterGroupId = callParamFilterGroupId;
    }


    /**
     * Gets the carrierId value for this CarrierDestinationChargeIndication.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this CarrierDestinationChargeIndication.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the countryId value for this CarrierDestinationChargeIndication.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this CarrierDestinationChargeIndication.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the nationalId value for this CarrierDestinationChargeIndication.
     * 
     * @return nationalId
     */
    public java.lang.String getNationalId() {
        return nationalId;
    }


    /**
     * Sets the nationalId value for this CarrierDestinationChargeIndication.
     * 
     * @param nationalId
     */
    public void setNationalId(java.lang.String nationalId) {
        this.nationalId = nationalId;
    }


    /**
     * Gets the anmChargeInd value for this CarrierDestinationChargeIndication.
     * 
     * @return anmChargeInd
     */
    public java.lang.Short getAnmChargeInd() {
        return anmChargeInd;
    }


    /**
     * Sets the anmChargeInd value for this CarrierDestinationChargeIndication.
     * 
     * @param anmChargeInd
     */
    public void setAnmChargeInd(java.lang.Short anmChargeInd) {
        this.anmChargeInd = anmChargeInd;
    }


    /**
     * Gets the acmChargeInd value for this CarrierDestinationChargeIndication.
     * 
     * @return acmChargeInd
     */
    public java.lang.Short getAcmChargeInd() {
        return acmChargeInd;
    }


    /**
     * Sets the acmChargeInd value for this CarrierDestinationChargeIndication.
     * 
     * @param acmChargeInd
     */
    public void setAcmChargeInd(java.lang.Short acmChargeInd) {
        this.acmChargeInd = acmChargeInd;
    }


    /**
     * Gets the treatmentAcmChargeInd value for this CarrierDestinationChargeIndication.
     * 
     * @return treatmentAcmChargeInd
     */
    public java.lang.Short getTreatmentAcmChargeInd() {
        return treatmentAcmChargeInd;
    }


    /**
     * Sets the treatmentAcmChargeInd value for this CarrierDestinationChargeIndication.
     * 
     * @param treatmentAcmChargeInd
     */
    public void setTreatmentAcmChargeInd(java.lang.Short treatmentAcmChargeInd) {
        this.treatmentAcmChargeInd = treatmentAcmChargeInd;
    }


    /**
     * Gets the callParamFilterGroupId value for this CarrierDestinationChargeIndication.
     * 
     * @return callParamFilterGroupId
     */
    public java.lang.String getCallParamFilterGroupId() {
        return callParamFilterGroupId;
    }


    /**
     * Sets the callParamFilterGroupId value for this CarrierDestinationChargeIndication.
     * 
     * @param callParamFilterGroupId
     */
    public void setCallParamFilterGroupId(java.lang.String callParamFilterGroupId) {
        this.callParamFilterGroupId = callParamFilterGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarrierDestinationChargeIndication)) return false;
        CarrierDestinationChargeIndication other = (CarrierDestinationChargeIndication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.nationalId==null && other.getNationalId()==null) || 
             (this.nationalId!=null &&
              this.nationalId.equals(other.getNationalId()))) &&
            ((this.anmChargeInd==null && other.getAnmChargeInd()==null) || 
             (this.anmChargeInd!=null &&
              this.anmChargeInd.equals(other.getAnmChargeInd()))) &&
            ((this.acmChargeInd==null && other.getAcmChargeInd()==null) || 
             (this.acmChargeInd!=null &&
              this.acmChargeInd.equals(other.getAcmChargeInd()))) &&
            ((this.treatmentAcmChargeInd==null && other.getTreatmentAcmChargeInd()==null) || 
             (this.treatmentAcmChargeInd!=null &&
              this.treatmentAcmChargeInd.equals(other.getTreatmentAcmChargeInd()))) &&
            ((this.callParamFilterGroupId==null && other.getCallParamFilterGroupId()==null) || 
             (this.callParamFilterGroupId!=null &&
              this.callParamFilterGroupId.equals(other.getCallParamFilterGroupId())));
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
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getNationalId() != null) {
            _hashCode += getNationalId().hashCode();
        }
        if (getAnmChargeInd() != null) {
            _hashCode += getAnmChargeInd().hashCode();
        }
        if (getAcmChargeInd() != null) {
            _hashCode += getAcmChargeInd().hashCode();
        }
        if (getTreatmentAcmChargeInd() != null) {
            _hashCode += getTreatmentAcmChargeInd().hashCode();
        }
        if (getCallParamFilterGroupId() != null) {
            _hashCode += getCallParamFilterGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarrierDestinationChargeIndication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierDestinationChargeIndication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("nationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anmChargeInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anmChargeInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmChargeInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acmChargeInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatmentAcmChargeInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "treatmentAcmChargeInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParamFilterGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterGroupId"));
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
