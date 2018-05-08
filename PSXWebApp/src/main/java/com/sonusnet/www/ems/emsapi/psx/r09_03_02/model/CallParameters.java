/**
 * CallParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CallParameters  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Short numberingPlanIndicator;

    private java.lang.Short natureOfAddress;

    private java.lang.Short privateCallFlag;

    public CallParameters() {
    }

    public CallParameters(
           java.lang.Short numberingPlanIndicator,
           java.lang.Short natureOfAddress,
           java.lang.Short privateCallFlag) {
        this.numberingPlanIndicator = numberingPlanIndicator;
        this.natureOfAddress = natureOfAddress;
        this.privateCallFlag = privateCallFlag;
    }


    /**
     * Gets the numberingPlanIndicator value for this CallParameters.
     * 
     * @return numberingPlanIndicator
     */
    public java.lang.Short getNumberingPlanIndicator() {
        return numberingPlanIndicator;
    }


    /**
     * Sets the numberingPlanIndicator value for this CallParameters.
     * 
     * @param numberingPlanIndicator
     */
    public void setNumberingPlanIndicator(java.lang.Short numberingPlanIndicator) {
        this.numberingPlanIndicator = numberingPlanIndicator;
    }


    /**
     * Gets the natureOfAddress value for this CallParameters.
     * 
     * @return natureOfAddress
     */
    public java.lang.Short getNatureOfAddress() {
        return natureOfAddress;
    }


    /**
     * Sets the natureOfAddress value for this CallParameters.
     * 
     * @param natureOfAddress
     */
    public void setNatureOfAddress(java.lang.Short natureOfAddress) {
        this.natureOfAddress = natureOfAddress;
    }


    /**
     * Gets the privateCallFlag value for this CallParameters.
     * 
     * @return privateCallFlag
     */
    public java.lang.Short getPrivateCallFlag() {
        return privateCallFlag;
    }


    /**
     * Sets the privateCallFlag value for this CallParameters.
     * 
     * @param privateCallFlag
     */
    public void setPrivateCallFlag(java.lang.Short privateCallFlag) {
        this.privateCallFlag = privateCallFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallParameters)) return false;
        CallParameters other = (CallParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numberingPlanIndicator==null && other.getNumberingPlanIndicator()==null) || 
             (this.numberingPlanIndicator!=null &&
              this.numberingPlanIndicator.equals(other.getNumberingPlanIndicator()))) &&
            ((this.natureOfAddress==null && other.getNatureOfAddress()==null) || 
             (this.natureOfAddress!=null &&
              this.natureOfAddress.equals(other.getNatureOfAddress()))) &&
            ((this.privateCallFlag==null && other.getPrivateCallFlag()==null) || 
             (this.privateCallFlag!=null &&
              this.privateCallFlag.equals(other.getPrivateCallFlag())));
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
        if (getNumberingPlanIndicator() != null) {
            _hashCode += getNumberingPlanIndicator().hashCode();
        }
        if (getNatureOfAddress() != null) {
            _hashCode += getNatureOfAddress().hashCode();
        }
        if (getPrivateCallFlag() != null) {
            _hashCode += getPrivateCallFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberingPlanIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberingPlanIndicator"));
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
        elemField.setFieldName("privateCallFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateCallFlag"));
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
