/**
 * HsxDiameterRealmRoute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class HsxDiameterRealmRoute  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String processName;

    private java.lang.String serverName;

    private java.lang.String realm;

    private java.lang.Integer diameterApplication;

    private java.lang.Integer priority;

    public HsxDiameterRealmRoute() {
    }

    public HsxDiameterRealmRoute(
           java.lang.String processName,
           java.lang.String serverName,
           java.lang.String realm,
           java.lang.Integer diameterApplication,
           java.lang.Integer priority) {
        this.processName = processName;
        this.serverName = serverName;
        this.realm = realm;
        this.diameterApplication = diameterApplication;
        this.priority = priority;
    }


    /**
     * Gets the processName value for this HsxDiameterRealmRoute.
     * 
     * @return processName
     */
    public java.lang.String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this HsxDiameterRealmRoute.
     * 
     * @param processName
     */
    public void setProcessName(java.lang.String processName) {
        this.processName = processName;
    }


    /**
     * Gets the serverName value for this HsxDiameterRealmRoute.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this HsxDiameterRealmRoute.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the realm value for this HsxDiameterRealmRoute.
     * 
     * @return realm
     */
    public java.lang.String getRealm() {
        return realm;
    }


    /**
     * Sets the realm value for this HsxDiameterRealmRoute.
     * 
     * @param realm
     */
    public void setRealm(java.lang.String realm) {
        this.realm = realm;
    }


    /**
     * Gets the diameterApplication value for this HsxDiameterRealmRoute.
     * 
     * @return diameterApplication
     */
    public java.lang.Integer getDiameterApplication() {
        return diameterApplication;
    }


    /**
     * Sets the diameterApplication value for this HsxDiameterRealmRoute.
     * 
     * @param diameterApplication
     */
    public void setDiameterApplication(java.lang.Integer diameterApplication) {
        this.diameterApplication = diameterApplication;
    }


    /**
     * Gets the priority value for this HsxDiameterRealmRoute.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this HsxDiameterRealmRoute.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxDiameterRealmRoute)) return false;
        HsxDiameterRealmRoute other = (HsxDiameterRealmRoute) obj;
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
              this.diameterApplication.equals(other.getDiameterApplication()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority())));
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
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxDiameterRealmRoute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxDiameterRealmRoute"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
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
