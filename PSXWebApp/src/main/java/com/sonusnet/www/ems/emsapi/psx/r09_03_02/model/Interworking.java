/**
 * Interworking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class Interworking  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Integer callType;

    private java.lang.Integer userCalltype;

    private java.lang.Integer itgSignalingFlag;

    private java.lang.Integer otgSignalingFlag;

    private java.lang.Integer sequenceNumber;

    private java.lang.Short acmChargeInd;

    private java.lang.Short anmChargeInd;

    private java.lang.Integer attributes;

    public Interworking() {
    }

    public Interworking(
           java.lang.Integer callType,
           java.lang.Integer userCalltype,
           java.lang.Integer itgSignalingFlag,
           java.lang.Integer otgSignalingFlag,
           java.lang.Integer sequenceNumber,
           java.lang.Short acmChargeInd,
           java.lang.Short anmChargeInd,
           java.lang.Integer attributes) {
        this.callType = callType;
        this.userCalltype = userCalltype;
        this.itgSignalingFlag = itgSignalingFlag;
        this.otgSignalingFlag = otgSignalingFlag;
        this.sequenceNumber = sequenceNumber;
        this.acmChargeInd = acmChargeInd;
        this.anmChargeInd = anmChargeInd;
        this.attributes = attributes;
    }


    /**
     * Gets the callType value for this Interworking.
     * 
     * @return callType
     */
    public java.lang.Integer getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this Interworking.
     * 
     * @param callType
     */
    public void setCallType(java.lang.Integer callType) {
        this.callType = callType;
    }


    /**
     * Gets the userCalltype value for this Interworking.
     * 
     * @return userCalltype
     */
    public java.lang.Integer getUserCalltype() {
        return userCalltype;
    }


    /**
     * Sets the userCalltype value for this Interworking.
     * 
     * @param userCalltype
     */
    public void setUserCalltype(java.lang.Integer userCalltype) {
        this.userCalltype = userCalltype;
    }


    /**
     * Gets the itgSignalingFlag value for this Interworking.
     * 
     * @return itgSignalingFlag
     */
    public java.lang.Integer getItgSignalingFlag() {
        return itgSignalingFlag;
    }


    /**
     * Sets the itgSignalingFlag value for this Interworking.
     * 
     * @param itgSignalingFlag
     */
    public void setItgSignalingFlag(java.lang.Integer itgSignalingFlag) {
        this.itgSignalingFlag = itgSignalingFlag;
    }


    /**
     * Gets the otgSignalingFlag value for this Interworking.
     * 
     * @return otgSignalingFlag
     */
    public java.lang.Integer getOtgSignalingFlag() {
        return otgSignalingFlag;
    }


    /**
     * Sets the otgSignalingFlag value for this Interworking.
     * 
     * @param otgSignalingFlag
     */
    public void setOtgSignalingFlag(java.lang.Integer otgSignalingFlag) {
        this.otgSignalingFlag = otgSignalingFlag;
    }


    /**
     * Gets the sequenceNumber value for this Interworking.
     * 
     * @return sequenceNumber
     */
    public java.lang.Integer getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this Interworking.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(java.lang.Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the acmChargeInd value for this Interworking.
     * 
     * @return acmChargeInd
     */
    public java.lang.Short getAcmChargeInd() {
        return acmChargeInd;
    }


    /**
     * Sets the acmChargeInd value for this Interworking.
     * 
     * @param acmChargeInd
     */
    public void setAcmChargeInd(java.lang.Short acmChargeInd) {
        this.acmChargeInd = acmChargeInd;
    }


    /**
     * Gets the anmChargeInd value for this Interworking.
     * 
     * @return anmChargeInd
     */
    public java.lang.Short getAnmChargeInd() {
        return anmChargeInd;
    }


    /**
     * Sets the anmChargeInd value for this Interworking.
     * 
     * @param anmChargeInd
     */
    public void setAnmChargeInd(java.lang.Short anmChargeInd) {
        this.anmChargeInd = anmChargeInd;
    }


    /**
     * Gets the attributes value for this Interworking.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this Interworking.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Interworking)) return false;
        Interworking other = (Interworking) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
            ((this.userCalltype==null && other.getUserCalltype()==null) || 
             (this.userCalltype!=null &&
              this.userCalltype.equals(other.getUserCalltype()))) &&
            ((this.itgSignalingFlag==null && other.getItgSignalingFlag()==null) || 
             (this.itgSignalingFlag!=null &&
              this.itgSignalingFlag.equals(other.getItgSignalingFlag()))) &&
            ((this.otgSignalingFlag==null && other.getOtgSignalingFlag()==null) || 
             (this.otgSignalingFlag!=null &&
              this.otgSignalingFlag.equals(other.getOtgSignalingFlag()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.acmChargeInd==null && other.getAcmChargeInd()==null) || 
             (this.acmChargeInd!=null &&
              this.acmChargeInd.equals(other.getAcmChargeInd()))) &&
            ((this.anmChargeInd==null && other.getAnmChargeInd()==null) || 
             (this.anmChargeInd!=null &&
              this.anmChargeInd.equals(other.getAnmChargeInd()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes())));
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
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
        }
        if (getUserCalltype() != null) {
            _hashCode += getUserCalltype().hashCode();
        }
        if (getItgSignalingFlag() != null) {
            _hashCode += getItgSignalingFlag().hashCode();
        }
        if (getOtgSignalingFlag() != null) {
            _hashCode += getOtgSignalingFlag().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getAcmChargeInd() != null) {
            _hashCode += getAcmChargeInd().hashCode();
        }
        if (getAnmChargeInd() != null) {
            _hashCode += getAnmChargeInd().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Interworking.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Interworking"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCalltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCalltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itgSignalingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itgSignalingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otgSignalingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otgSignalingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmChargeInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acmChargeInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anmChargeInd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anmChargeInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
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
