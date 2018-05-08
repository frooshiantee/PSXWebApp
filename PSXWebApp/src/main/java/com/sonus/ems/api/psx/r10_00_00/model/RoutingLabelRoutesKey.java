/**
 * RoutingLabelRoutesKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class RoutingLabelRoutesKey  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String routingLabelId;
    private java.lang.Short routeSequence;

    public RoutingLabelRoutesKey() {
    }

    public RoutingLabelRoutesKey(
           java.lang.String routingLabelId,
           java.lang.Short routeSequence) {
           this.routingLabelId = routingLabelId;
           this.routeSequence = routeSequence;
    }


    /**
     * Gets the routingLabelId value for this RoutingLabelRoutesKey.
     * 
     * @return routingLabelId
     */
    public java.lang.String getRoutingLabelId() {
        return routingLabelId;
    }


    /**
     * Sets the routingLabelId value for this RoutingLabelRoutesKey.
     * 
     * @param routingLabelId
     */
    public void setRoutingLabelId(java.lang.String routingLabelId) {
        this.routingLabelId = routingLabelId;
    }


    /**
     * Gets the routeSequence value for this RoutingLabelRoutesKey.
     * 
     * @return routeSequence
     */
    public java.lang.Short getRouteSequence() {
        return routeSequence;
    }


    /**
     * Sets the routeSequence value for this RoutingLabelRoutesKey.
     * 
     * @param routeSequence
     */
    public void setRouteSequence(java.lang.Short routeSequence) {
        this.routeSequence = routeSequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutingLabelRoutesKey)) return false;
        RoutingLabelRoutesKey other = (RoutingLabelRoutesKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.routingLabelId==null && other.getRoutingLabelId()==null) || 
             (this.routingLabelId!=null &&
              this.routingLabelId.equals(other.getRoutingLabelId()))) &&
            ((this.routeSequence==null && other.getRouteSequence()==null) || 
             (this.routeSequence!=null &&
              this.routeSequence.equals(other.getRouteSequence())));
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
        if (getRoutingLabelId() != null) {
            _hashCode += getRoutingLabelId().hashCode();
        }
        if (getRouteSequence() != null) {
            _hashCode += getRouteSequence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutingLabelRoutesKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingLabelRoutesKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routeSequence"));
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
