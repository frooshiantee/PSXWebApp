/**
 * DpcInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class DpcInformation  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String gatewayId;

    private java.lang.String nationalId;

    private java.lang.String countryId;

    private java.lang.String dpc1;

    private java.lang.String dpc2;

    private java.lang.Integer dpcInfoAttributes;

    private java.lang.String numberControlProfileId;

    public DpcInformation() {
    }

    public DpcInformation(
           java.lang.String gatewayId,
           java.lang.String nationalId,
           java.lang.String countryId,
           java.lang.String dpc1,
           java.lang.String dpc2,
           java.lang.Integer dpcInfoAttributes,
           java.lang.String numberControlProfileId) {
        this.gatewayId = gatewayId;
        this.nationalId = nationalId;
        this.countryId = countryId;
        this.dpc1 = dpc1;
        this.dpc2 = dpc2;
        this.dpcInfoAttributes = dpcInfoAttributes;
        this.numberControlProfileId = numberControlProfileId;
    }


    /**
     * Gets the gatewayId value for this DpcInformation.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this DpcInformation.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the nationalId value for this DpcInformation.
     * 
     * @return nationalId
     */
    public java.lang.String getNationalId() {
        return nationalId;
    }


    /**
     * Sets the nationalId value for this DpcInformation.
     * 
     * @param nationalId
     */
    public void setNationalId(java.lang.String nationalId) {
        this.nationalId = nationalId;
    }


    /**
     * Gets the countryId value for this DpcInformation.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this DpcInformation.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the dpc1 value for this DpcInformation.
     * 
     * @return dpc1
     */
    public java.lang.String getDpc1() {
        return dpc1;
    }


    /**
     * Sets the dpc1 value for this DpcInformation.
     * 
     * @param dpc1
     */
    public void setDpc1(java.lang.String dpc1) {
        this.dpc1 = dpc1;
    }


    /**
     * Gets the dpc2 value for this DpcInformation.
     * 
     * @return dpc2
     */
    public java.lang.String getDpc2() {
        return dpc2;
    }


    /**
     * Sets the dpc2 value for this DpcInformation.
     * 
     * @param dpc2
     */
    public void setDpc2(java.lang.String dpc2) {
        this.dpc2 = dpc2;
    }


    /**
     * Gets the dpcInfoAttributes value for this DpcInformation.
     * 
     * @return dpcInfoAttributes
     */
    public java.lang.Integer getDpcInfoAttributes() {
        return dpcInfoAttributes;
    }


    /**
     * Sets the dpcInfoAttributes value for this DpcInformation.
     * 
     * @param dpcInfoAttributes
     */
    public void setDpcInfoAttributes(java.lang.Integer dpcInfoAttributes) {
        this.dpcInfoAttributes = dpcInfoAttributes;
    }


    /**
     * Gets the numberControlProfileId value for this DpcInformation.
     * 
     * @return numberControlProfileId
     */
    public java.lang.String getNumberControlProfileId() {
        return numberControlProfileId;
    }


    /**
     * Sets the numberControlProfileId value for this DpcInformation.
     * 
     * @param numberControlProfileId
     */
    public void setNumberControlProfileId(java.lang.String numberControlProfileId) {
        this.numberControlProfileId = numberControlProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpcInformation)) return false;
        DpcInformation other = (DpcInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.nationalId==null && other.getNationalId()==null) || 
             (this.nationalId!=null &&
              this.nationalId.equals(other.getNationalId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.dpc1==null && other.getDpc1()==null) || 
             (this.dpc1!=null &&
              this.dpc1.equals(other.getDpc1()))) &&
            ((this.dpc2==null && other.getDpc2()==null) || 
             (this.dpc2!=null &&
              this.dpc2.equals(other.getDpc2()))) &&
            ((this.dpcInfoAttributes==null && other.getDpcInfoAttributes()==null) || 
             (this.dpcInfoAttributes!=null &&
              this.dpcInfoAttributes.equals(other.getDpcInfoAttributes()))) &&
            ((this.numberControlProfileId==null && other.getNumberControlProfileId()==null) || 
             (this.numberControlProfileId!=null &&
              this.numberControlProfileId.equals(other.getNumberControlProfileId())));
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
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getNationalId() != null) {
            _hashCode += getNationalId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getDpc1() != null) {
            _hashCode += getDpc1().hashCode();
        }
        if (getDpc2() != null) {
            _hashCode += getDpc2().hashCode();
        }
        if (getDpcInfoAttributes() != null) {
            _hashCode += getDpcInfoAttributes().hashCode();
        }
        if (getNumberControlProfileId() != null) {
            _hashCode += getNumberControlProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DpcInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DpcInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
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
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpc1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpc1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpc2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpc2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpcInfoAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpcInfoAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberControlProfileId"));
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
