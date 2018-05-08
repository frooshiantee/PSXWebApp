/**
 * AuthcodeEncryption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class AuthcodeEncryption  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String authcodeId;

    private java.lang.String authcodeGroupId;

    private java.lang.Integer elementAttributes;

    private java.lang.String classOfServiceId;

    private java.lang.String vpnPrivateCallingNumber;

    private java.lang.String exceptionProfileId;

    private java.lang.String currentPin;

    private java.lang.String newPin;

    public AuthcodeEncryption() {
    }

    public AuthcodeEncryption(
           java.lang.String authcodeId,
           java.lang.String authcodeGroupId,
           java.lang.Integer elementAttributes,
           java.lang.String classOfServiceId,
           java.lang.String vpnPrivateCallingNumber,
           java.lang.String exceptionProfileId,
           java.lang.String currentPin,
           java.lang.String newPin) {
        this.authcodeId = authcodeId;
        this.authcodeGroupId = authcodeGroupId;
        this.elementAttributes = elementAttributes;
        this.classOfServiceId = classOfServiceId;
        this.vpnPrivateCallingNumber = vpnPrivateCallingNumber;
        this.exceptionProfileId = exceptionProfileId;
        this.currentPin = currentPin;
        this.newPin = newPin;
    }


    /**
     * Gets the authcodeId value for this AuthcodeEncryption.
     * 
     * @return authcodeId
     */
    public java.lang.String getAuthcodeId() {
        return authcodeId;
    }


    /**
     * Sets the authcodeId value for this AuthcodeEncryption.
     * 
     * @param authcodeId
     */
    public void setAuthcodeId(java.lang.String authcodeId) {
        this.authcodeId = authcodeId;
    }


    /**
     * Gets the authcodeGroupId value for this AuthcodeEncryption.
     * 
     * @return authcodeGroupId
     */
    public java.lang.String getAuthcodeGroupId() {
        return authcodeGroupId;
    }


    /**
     * Sets the authcodeGroupId value for this AuthcodeEncryption.
     * 
     * @param authcodeGroupId
     */
    public void setAuthcodeGroupId(java.lang.String authcodeGroupId) {
        this.authcodeGroupId = authcodeGroupId;
    }


    /**
     * Gets the elementAttributes value for this AuthcodeEncryption.
     * 
     * @return elementAttributes
     */
    public java.lang.Integer getElementAttributes() {
        return elementAttributes;
    }


    /**
     * Sets the elementAttributes value for this AuthcodeEncryption.
     * 
     * @param elementAttributes
     */
    public void setElementAttributes(java.lang.Integer elementAttributes) {
        this.elementAttributes = elementAttributes;
    }


    /**
     * Gets the classOfServiceId value for this AuthcodeEncryption.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this AuthcodeEncryption.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the vpnPrivateCallingNumber value for this AuthcodeEncryption.
     * 
     * @return vpnPrivateCallingNumber
     */
    public java.lang.String getVpnPrivateCallingNumber() {
        return vpnPrivateCallingNumber;
    }


    /**
     * Sets the vpnPrivateCallingNumber value for this AuthcodeEncryption.
     * 
     * @param vpnPrivateCallingNumber
     */
    public void setVpnPrivateCallingNumber(java.lang.String vpnPrivateCallingNumber) {
        this.vpnPrivateCallingNumber = vpnPrivateCallingNumber;
    }


    /**
     * Gets the exceptionProfileId value for this AuthcodeEncryption.
     * 
     * @return exceptionProfileId
     */
    public java.lang.String getExceptionProfileId() {
        return exceptionProfileId;
    }


    /**
     * Sets the exceptionProfileId value for this AuthcodeEncryption.
     * 
     * @param exceptionProfileId
     */
    public void setExceptionProfileId(java.lang.String exceptionProfileId) {
        this.exceptionProfileId = exceptionProfileId;
    }


    /**
     * Gets the currentPin value for this AuthcodeEncryption.
     * 
     * @return currentPin
     */
    public java.lang.String getCurrentPin() {
        return currentPin;
    }


    /**
     * Sets the currentPin value for this AuthcodeEncryption.
     * 
     * @param currentPin
     */
    public void setCurrentPin(java.lang.String currentPin) {
        this.currentPin = currentPin;
    }


    /**
     * Gets the newPin value for this AuthcodeEncryption.
     * 
     * @return newPin
     */
    public java.lang.String getNewPin() {
        return newPin;
    }


    /**
     * Sets the newPin value for this AuthcodeEncryption.
     * 
     * @param newPin
     */
    public void setNewPin(java.lang.String newPin) {
        this.newPin = newPin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthcodeEncryption)) return false;
        AuthcodeEncryption other = (AuthcodeEncryption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authcodeId==null && other.getAuthcodeId()==null) || 
             (this.authcodeId!=null &&
              this.authcodeId.equals(other.getAuthcodeId()))) &&
            ((this.authcodeGroupId==null && other.getAuthcodeGroupId()==null) || 
             (this.authcodeGroupId!=null &&
              this.authcodeGroupId.equals(other.getAuthcodeGroupId()))) &&
            ((this.elementAttributes==null && other.getElementAttributes()==null) || 
             (this.elementAttributes!=null &&
              this.elementAttributes.equals(other.getElementAttributes()))) &&
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.vpnPrivateCallingNumber==null && other.getVpnPrivateCallingNumber()==null) || 
             (this.vpnPrivateCallingNumber!=null &&
              this.vpnPrivateCallingNumber.equals(other.getVpnPrivateCallingNumber()))) &&
            ((this.exceptionProfileId==null && other.getExceptionProfileId()==null) || 
             (this.exceptionProfileId!=null &&
              this.exceptionProfileId.equals(other.getExceptionProfileId()))) &&
            ((this.currentPin==null && other.getCurrentPin()==null) || 
             (this.currentPin!=null &&
              this.currentPin.equals(other.getCurrentPin()))) &&
            ((this.newPin==null && other.getNewPin()==null) || 
             (this.newPin!=null &&
              this.newPin.equals(other.getNewPin())));
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
        if (getAuthcodeId() != null) {
            _hashCode += getAuthcodeId().hashCode();
        }
        if (getAuthcodeGroupId() != null) {
            _hashCode += getAuthcodeGroupId().hashCode();
        }
        if (getElementAttributes() != null) {
            _hashCode += getElementAttributes().hashCode();
        }
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getVpnPrivateCallingNumber() != null) {
            _hashCode += getVpnPrivateCallingNumber().hashCode();
        }
        if (getExceptionProfileId() != null) {
            _hashCode += getExceptionProfileId().hashCode();
        }
        if (getCurrentPin() != null) {
            _hashCode += getCurrentPin().hashCode();
        }
        if (getNewPin() != null) {
            _hashCode += getNewPin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthcodeEncryption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AuthcodeEncryption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authcodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authcodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authcodeGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authcodeGroupId"));
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
        elemField.setFieldName("classOfServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classOfServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vpnPrivateCallingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vpnPrivateCallingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentPin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newPin"));
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
