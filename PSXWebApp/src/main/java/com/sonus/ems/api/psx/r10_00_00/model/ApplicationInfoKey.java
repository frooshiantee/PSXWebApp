/**
 * ApplicationInfoKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ApplicationInfoKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String applicationInfoProfileId;

    public ApplicationInfoKey() {
    }

    public ApplicationInfoKey(
           java.lang.String applicationInfoProfileId) {
           this.applicationInfoProfileId = applicationInfoProfileId;
    }


    /**
     * Gets the applicationInfoProfileId value for this ApplicationInfoKey.
     * 
     * @return applicationInfoProfileId
     */
    public java.lang.String getApplicationInfoProfileId() {
        return applicationInfoProfileId;
    }


    /**
     * Sets the applicationInfoProfileId value for this ApplicationInfoKey.
     * 
     * @param applicationInfoProfileId
     */
    public void setApplicationInfoProfileId(java.lang.String applicationInfoProfileId) {
        this.applicationInfoProfileId = applicationInfoProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplicationInfoKey)) return false;
        ApplicationInfoKey other = (ApplicationInfoKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applicationInfoProfileId==null && other.getApplicationInfoProfileId()==null) || 
             (this.applicationInfoProfileId!=null &&
              this.applicationInfoProfileId.equals(other.getApplicationInfoProfileId())));
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
        if (getApplicationInfoProfileId() != null) {
            _hashCode += getApplicationInfoProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplicationInfoKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ApplicationInfoKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationInfoProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationInfoProfileId"));
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
