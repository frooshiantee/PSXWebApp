/**
 * ProvApiBatchException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ProvApiBatchException  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException  implements java.io.Serializable {
    private com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ErrorEntity[] allErrors;

    private com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[] allSuccesses;

    public ProvApiBatchException() {
    }

    public ProvApiBatchException(
           java.lang.String errorCode,
           java.lang.String message1,
           java.lang.String rootCause,
           com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ErrorEntity[] allErrors,
           com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[] allSuccesses) {
        super(
            errorCode,
            message1,
            rootCause);
        this.allErrors = allErrors;
        this.allSuccesses = allSuccesses;
    }


    /**
     * Gets the allErrors value for this ProvApiBatchException.
     * 
     * @return allErrors
     */
    public com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ErrorEntity[] getAllErrors() {
        return allErrors;
    }


    /**
     * Sets the allErrors value for this ProvApiBatchException.
     * 
     * @param allErrors
     */
    public void setAllErrors(com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ErrorEntity[] allErrors) {
        this.allErrors = allErrors;
    }


    /**
     * Gets the allSuccesses value for this ProvApiBatchException.
     * 
     * @return allSuccesses
     */
    public com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[] getAllSuccesses() {
        return allSuccesses;
    }


    /**
     * Sets the allSuccesses value for this ProvApiBatchException.
     * 
     * @param allSuccesses
     */
    public void setAllSuccesses(com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[] allSuccesses) {
        this.allSuccesses = allSuccesses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProvApiBatchException)) return false;
        ProvApiBatchException other = (ProvApiBatchException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allErrors==null && other.getAllErrors()==null) || 
             (this.allErrors!=null &&
              java.util.Arrays.equals(this.allErrors, other.getAllErrors()))) &&
            ((this.allSuccesses==null && other.getAllSuccesses()==null) || 
             (this.allSuccesses!=null &&
              java.util.Arrays.equals(this.allSuccesses, other.getAllSuccesses())));
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
        if (getAllErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllSuccesses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllSuccesses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllSuccesses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProvApiBatchException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiBatchException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ErrorEntity"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allSuccesses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allSuccesses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityKey"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
