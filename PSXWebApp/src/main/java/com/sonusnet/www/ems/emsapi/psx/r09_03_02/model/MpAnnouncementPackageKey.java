/**
 * MpAnnouncementPackageKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class MpAnnouncementPackageKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.Short mpAnnouncementPackageIndex;

    public MpAnnouncementPackageKey() {
    }

    public MpAnnouncementPackageKey(
           java.lang.Short mpAnnouncementPackageIndex) {
        this.mpAnnouncementPackageIndex = mpAnnouncementPackageIndex;
    }


    /**
     * Gets the mpAnnouncementPackageIndex value for this MpAnnouncementPackageKey.
     * 
     * @return mpAnnouncementPackageIndex
     */
    public java.lang.Short getMpAnnouncementPackageIndex() {
        return mpAnnouncementPackageIndex;
    }


    /**
     * Sets the mpAnnouncementPackageIndex value for this MpAnnouncementPackageKey.
     * 
     * @param mpAnnouncementPackageIndex
     */
    public void setMpAnnouncementPackageIndex(java.lang.Short mpAnnouncementPackageIndex) {
        this.mpAnnouncementPackageIndex = mpAnnouncementPackageIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MpAnnouncementPackageKey)) return false;
        MpAnnouncementPackageKey other = (MpAnnouncementPackageKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mpAnnouncementPackageIndex==null && other.getMpAnnouncementPackageIndex()==null) || 
             (this.mpAnnouncementPackageIndex!=null &&
              this.mpAnnouncementPackageIndex.equals(other.getMpAnnouncementPackageIndex())));
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
        if (getMpAnnouncementPackageIndex() != null) {
            _hashCode += getMpAnnouncementPackageIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MpAnnouncementPackageKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MpAnnouncementPackageKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpAnnouncementPackageIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpAnnouncementPackageIndex"));
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
