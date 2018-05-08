/**
 * ChargeRateInfoParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ChargeRateInfoParameters  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String chargeInformationId;
    private java.lang.Integer chargeInformationType;
    private java.lang.Integer unitRateIndicator;
    private java.lang.Integer chargeRateInfoCategory;
    private java.lang.Integer initialLumpCallRate;
    private java.lang.Integer firstChargingPeriod;
    private java.lang.Integer secondChargingPeriod;
    private java.lang.Integer thirdChargingPeriod;
    private java.lang.Integer fourthChargingPeriod;

    public ChargeRateInfoParameters() {
    }

    public ChargeRateInfoParameters(
           java.lang.String chargeInformationId,
           java.lang.Integer chargeInformationType,
           java.lang.Integer unitRateIndicator,
           java.lang.Integer chargeRateInfoCategory,
           java.lang.Integer initialLumpCallRate,
           java.lang.Integer firstChargingPeriod,
           java.lang.Integer secondChargingPeriod,
           java.lang.Integer thirdChargingPeriod,
           java.lang.Integer fourthChargingPeriod) {
           this.chargeInformationId = chargeInformationId;
           this.chargeInformationType = chargeInformationType;
           this.unitRateIndicator = unitRateIndicator;
           this.chargeRateInfoCategory = chargeRateInfoCategory;
           this.initialLumpCallRate = initialLumpCallRate;
           this.firstChargingPeriod = firstChargingPeriod;
           this.secondChargingPeriod = secondChargingPeriod;
           this.thirdChargingPeriod = thirdChargingPeriod;
           this.fourthChargingPeriod = fourthChargingPeriod;
    }


    /**
     * Gets the chargeInformationId value for this ChargeRateInfoParameters.
     * 
     * @return chargeInformationId
     */
    public java.lang.String getChargeInformationId() {
        return chargeInformationId;
    }


    /**
     * Sets the chargeInformationId value for this ChargeRateInfoParameters.
     * 
     * @param chargeInformationId
     */
    public void setChargeInformationId(java.lang.String chargeInformationId) {
        this.chargeInformationId = chargeInformationId;
    }


    /**
     * Gets the chargeInformationType value for this ChargeRateInfoParameters.
     * 
     * @return chargeInformationType
     */
    public java.lang.Integer getChargeInformationType() {
        return chargeInformationType;
    }


    /**
     * Sets the chargeInformationType value for this ChargeRateInfoParameters.
     * 
     * @param chargeInformationType
     */
    public void setChargeInformationType(java.lang.Integer chargeInformationType) {
        this.chargeInformationType = chargeInformationType;
    }


    /**
     * Gets the unitRateIndicator value for this ChargeRateInfoParameters.
     * 
     * @return unitRateIndicator
     */
    public java.lang.Integer getUnitRateIndicator() {
        return unitRateIndicator;
    }


    /**
     * Sets the unitRateIndicator value for this ChargeRateInfoParameters.
     * 
     * @param unitRateIndicator
     */
    public void setUnitRateIndicator(java.lang.Integer unitRateIndicator) {
        this.unitRateIndicator = unitRateIndicator;
    }


    /**
     * Gets the chargeRateInfoCategory value for this ChargeRateInfoParameters.
     * 
     * @return chargeRateInfoCategory
     */
    public java.lang.Integer getChargeRateInfoCategory() {
        return chargeRateInfoCategory;
    }


    /**
     * Sets the chargeRateInfoCategory value for this ChargeRateInfoParameters.
     * 
     * @param chargeRateInfoCategory
     */
    public void setChargeRateInfoCategory(java.lang.Integer chargeRateInfoCategory) {
        this.chargeRateInfoCategory = chargeRateInfoCategory;
    }


    /**
     * Gets the initialLumpCallRate value for this ChargeRateInfoParameters.
     * 
     * @return initialLumpCallRate
     */
    public java.lang.Integer getInitialLumpCallRate() {
        return initialLumpCallRate;
    }


    /**
     * Sets the initialLumpCallRate value for this ChargeRateInfoParameters.
     * 
     * @param initialLumpCallRate
     */
    public void setInitialLumpCallRate(java.lang.Integer initialLumpCallRate) {
        this.initialLumpCallRate = initialLumpCallRate;
    }


    /**
     * Gets the firstChargingPeriod value for this ChargeRateInfoParameters.
     * 
     * @return firstChargingPeriod
     */
    public java.lang.Integer getFirstChargingPeriod() {
        return firstChargingPeriod;
    }


    /**
     * Sets the firstChargingPeriod value for this ChargeRateInfoParameters.
     * 
     * @param firstChargingPeriod
     */
    public void setFirstChargingPeriod(java.lang.Integer firstChargingPeriod) {
        this.firstChargingPeriod = firstChargingPeriod;
    }


    /**
     * Gets the secondChargingPeriod value for this ChargeRateInfoParameters.
     * 
     * @return secondChargingPeriod
     */
    public java.lang.Integer getSecondChargingPeriod() {
        return secondChargingPeriod;
    }


    /**
     * Sets the secondChargingPeriod value for this ChargeRateInfoParameters.
     * 
     * @param secondChargingPeriod
     */
    public void setSecondChargingPeriod(java.lang.Integer secondChargingPeriod) {
        this.secondChargingPeriod = secondChargingPeriod;
    }


    /**
     * Gets the thirdChargingPeriod value for this ChargeRateInfoParameters.
     * 
     * @return thirdChargingPeriod
     */
    public java.lang.Integer getThirdChargingPeriod() {
        return thirdChargingPeriod;
    }


    /**
     * Sets the thirdChargingPeriod value for this ChargeRateInfoParameters.
     * 
     * @param thirdChargingPeriod
     */
    public void setThirdChargingPeriod(java.lang.Integer thirdChargingPeriod) {
        this.thirdChargingPeriod = thirdChargingPeriod;
    }


    /**
     * Gets the fourthChargingPeriod value for this ChargeRateInfoParameters.
     * 
     * @return fourthChargingPeriod
     */
    public java.lang.Integer getFourthChargingPeriod() {
        return fourthChargingPeriod;
    }


    /**
     * Sets the fourthChargingPeriod value for this ChargeRateInfoParameters.
     * 
     * @param fourthChargingPeriod
     */
    public void setFourthChargingPeriod(java.lang.Integer fourthChargingPeriod) {
        this.fourthChargingPeriod = fourthChargingPeriod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeRateInfoParameters)) return false;
        ChargeRateInfoParameters other = (ChargeRateInfoParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.chargeInformationId==null && other.getChargeInformationId()==null) || 
             (this.chargeInformationId!=null &&
              this.chargeInformationId.equals(other.getChargeInformationId()))) &&
            ((this.chargeInformationType==null && other.getChargeInformationType()==null) || 
             (this.chargeInformationType!=null &&
              this.chargeInformationType.equals(other.getChargeInformationType()))) &&
            ((this.unitRateIndicator==null && other.getUnitRateIndicator()==null) || 
             (this.unitRateIndicator!=null &&
              this.unitRateIndicator.equals(other.getUnitRateIndicator()))) &&
            ((this.chargeRateInfoCategory==null && other.getChargeRateInfoCategory()==null) || 
             (this.chargeRateInfoCategory!=null &&
              this.chargeRateInfoCategory.equals(other.getChargeRateInfoCategory()))) &&
            ((this.initialLumpCallRate==null && other.getInitialLumpCallRate()==null) || 
             (this.initialLumpCallRate!=null &&
              this.initialLumpCallRate.equals(other.getInitialLumpCallRate()))) &&
            ((this.firstChargingPeriod==null && other.getFirstChargingPeriod()==null) || 
             (this.firstChargingPeriod!=null &&
              this.firstChargingPeriod.equals(other.getFirstChargingPeriod()))) &&
            ((this.secondChargingPeriod==null && other.getSecondChargingPeriod()==null) || 
             (this.secondChargingPeriod!=null &&
              this.secondChargingPeriod.equals(other.getSecondChargingPeriod()))) &&
            ((this.thirdChargingPeriod==null && other.getThirdChargingPeriod()==null) || 
             (this.thirdChargingPeriod!=null &&
              this.thirdChargingPeriod.equals(other.getThirdChargingPeriod()))) &&
            ((this.fourthChargingPeriod==null && other.getFourthChargingPeriod()==null) || 
             (this.fourthChargingPeriod!=null &&
              this.fourthChargingPeriod.equals(other.getFourthChargingPeriod())));
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
        if (getChargeInformationId() != null) {
            _hashCode += getChargeInformationId().hashCode();
        }
        if (getChargeInformationType() != null) {
            _hashCode += getChargeInformationType().hashCode();
        }
        if (getUnitRateIndicator() != null) {
            _hashCode += getUnitRateIndicator().hashCode();
        }
        if (getChargeRateInfoCategory() != null) {
            _hashCode += getChargeRateInfoCategory().hashCode();
        }
        if (getInitialLumpCallRate() != null) {
            _hashCode += getInitialLumpCallRate().hashCode();
        }
        if (getFirstChargingPeriod() != null) {
            _hashCode += getFirstChargingPeriod().hashCode();
        }
        if (getSecondChargingPeriod() != null) {
            _hashCode += getSecondChargingPeriod().hashCode();
        }
        if (getThirdChargingPeriod() != null) {
            _hashCode += getThirdChargingPeriod().hashCode();
        }
        if (getFourthChargingPeriod() != null) {
            _hashCode += getFourthChargingPeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeRateInfoParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeRateInfoParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeInformationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeInformationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeInformationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeInformationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitRateIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitRateIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeRateInfoCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeRateInfoCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialLumpCallRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initialLumpCallRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstChargingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstChargingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondChargingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondChargingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdChargingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thirdChargingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fourthChargingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fourthChargingPeriod"));
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
