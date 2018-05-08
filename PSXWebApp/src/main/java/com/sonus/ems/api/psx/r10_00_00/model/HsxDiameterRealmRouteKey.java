/**
 * HsxDiameterRealmRouteKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxDiameterRealmRouteKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String processName;
    private java.lang.String serverName;
    private java.lang.String realm;
    private java.lang.Integer diameterApplication;

    public HsxDiameterRealmRouteKey() {
    }

    public HsxDiameterRealmRouteKey(
           java.lang.String processName,
           java.lang.String serverName,
           java.lang.String realm,
           java.lang.Integer diameterApplication) {
           this.processName = processName;
           this.serverName = serverName;
           this.realm = realm;
           this.diameterApplication = diameterApplication;
    }


    /**
     * Gets the processName value for this HsxDiameterRealmRouteKey.
     * 
     * @return processName
     */
    public java.lang.String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this HsxDiameterRealmRouteKey.
     * 
     * @param processName
     */
    public void setProcessName(java.lang.String processName) {
        this.processName = processName;
    }


    /**
     * Gets the serverName value for this HsxDiameterRealmRouteKey.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this HsxDiameterRealmRouteKey.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the realm value for this HsxDiameterRealmRouteKey.
     * 
     * @return realm
     */
    public java.lang.String getRealm() {
        return realm;
    }


    /**
     * Sets the realm value for this HsxDiameterRealmRouteKey.
     * 
     * @param realm
     */
    public void setRealm(java.lang.String realm) {
        this.realm = realm;
    }


    /**
     * Gets the diameterApplication value for this HsxDiameterRealmRouteKey.
     * 
     * @return diameterApplication
     */
    public java.lang.Integer getDiameterApplication() {
        return diameterApplication;
    }


    /**
     * Sets the diameterApplication value for this HsxDiameterRealmRouteKey.
     * 
     * @param diameterApplication
     */
    public void setDiameterApplication(java.lang.Integer diameterApplication) {
        this.diameterApplication = diameterApplication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxDiameterRealmRouteKey)) return false;
        HsxDiameterRealmRouteKey other = (HsxDiameterRealmRouteKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.processName==null && other.getProcessName()==null) || 
             (this.processName!=null &&
              this.processName.equals(other.getProcessName()))) &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.realm==null && other.getRealm()==null) || 
             (this.realm!=null &&
              this.realm.equals(other.getRealm()))) &&
            ((this.diameterApplication==null && other.getDiameterApplication()==null) || 
             (this.diameterApplication!=null &&
              this.diameterApplication.equals(other.getDiameterApplication())));
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
        if (getProcessName() != null) {
            _hashCode += getProcessName().hashCode();
        }
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getRealm() != null) {
            _hashCode += getRealm().hashCode();
        }
        if (getDiameterApplication() != null) {
            _hashCode += getDiameterApplication().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxDiameterRealmRouteKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxDiameterRealmRouteKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diameterApplication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diameterApplication"));
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
