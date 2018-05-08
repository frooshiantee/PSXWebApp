/**
 * RoutingLabelQueryKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class RoutingLabelQueryKey  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey  implements java.io.Serializable {
    private java.lang.String routingLabelId;

    private java.lang.String rteEndPoint1;

    private java.lang.String rteEndPoint2;

    private java.lang.String rteEndPoint3;

    public RoutingLabelQueryKey() {
    }

    public RoutingLabelQueryKey(
           java.lang.String routingLabelId,
           java.lang.String rteEndPoint1,
           java.lang.String rteEndPoint2,
           java.lang.String rteEndPoint3) {
        this.routingLabelId = routingLabelId;
        this.rteEndPoint1 = rteEndPoint1;
        this.rteEndPoint2 = rteEndPoint2;
        this.rteEndPoint3 = rteEndPoint3;
    }


    /**
     * Gets the routingLabelId value for this RoutingLabelQueryKey.
     * 
     * @return routingLabelId
     */
    public java.lang.String getRoutingLabelId() {
        return routingLabelId;
    }


    /**
     * Sets the routingLabelId value for this RoutingLabelQueryKey.
     * 
     * @param routingLabelId
     */
    public void setRoutingLabelId(java.lang.String routingLabelId) {
        this.routingLabelId = routingLabelId;
    }


    /**
     * Gets the rteEndPoint1 value for this RoutingLabelQueryKey.
     * 
     * @return rteEndPoint1
     */
    public java.lang.String getRteEndPoint1() {
        return rteEndPoint1;
    }


    /**
     * Sets the rteEndPoint1 value for this RoutingLabelQueryKey.
     * 
     * @param rteEndPoint1
     */
    public void setRteEndPoint1(java.lang.String rteEndPoint1) {
        this.rteEndPoint1 = rteEndPoint1;
    }


    /**
     * Gets the rteEndPoint2 value for this RoutingLabelQueryKey.
     * 
     * @return rteEndPoint2
     */
    public java.lang.String getRteEndPoint2() {
        return rteEndPoint2;
    }


    /**
     * Sets the rteEndPoint2 value for this RoutingLabelQueryKey.
     * 
     * @param rteEndPoint2
     */
    public void setRteEndPoint2(java.lang.String rteEndPoint2) {
        this.rteEndPoint2 = rteEndPoint2;
    }


    /**
     * Gets the rteEndPoint3 value for this RoutingLabelQueryKey.
     * 
     * @return rteEndPoint3
     */
    public java.lang.String getRteEndPoint3() {
        return rteEndPoint3;
    }


    /**
     * Sets the rteEndPoint3 value for this RoutingLabelQueryKey.
     * 
     * @param rteEndPoint3
     */
    public void setRteEndPoint3(java.lang.String rteEndPoint3) {
        this.rteEndPoint3 = rteEndPoint3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutingLabelQueryKey)) return false;
        RoutingLabelQueryKey other = (RoutingLabelQueryKey) obj;
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
            ((this.rteEndPoint1==null && other.getRteEndPoint1()==null) || 
             (this.rteEndPoint1!=null &&
              this.rteEndPoint1.equals(other.getRteEndPoint1()))) &&
            ((this.rteEndPoint2==null && other.getRteEndPoint2()==null) || 
             (this.rteEndPoint2!=null &&
              this.rteEndPoint2.equals(other.getRteEndPoint2()))) &&
            ((this.rteEndPoint3==null && other.getRteEndPoint3()==null) || 
             (this.rteEndPoint3!=null &&
              this.rteEndPoint3.equals(other.getRteEndPoint3())));
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
        if (getRteEndPoint1() != null) {
            _hashCode += getRteEndPoint1().hashCode();
        }
        if (getRteEndPoint2() != null) {
            _hashCode += getRteEndPoint2().hashCode();
        }
        if (getRteEndPoint3() != null) {
            _hashCode += getRteEndPoint3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutingLabelQueryKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RoutingLabelQueryKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rteEndPoint1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rteEndPoint1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rteEndPoint2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rteEndPoint2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rteEndPoint3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rteEndPoint3"));
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
