/**
 * HsxIfcSetData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxIfcSetData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Integer ifcSet;
    private java.lang.String initialFilterCriteria;
    private java.lang.Integer priority;
    private java.lang.String triggerPoint;
    private java.lang.String applicationServer;
    private java.lang.Integer profilePartIndicator;
    private java.lang.String serviceInformation;
    private java.lang.Integer defaultHandling;

    public HsxIfcSetData() {
    }

    public HsxIfcSetData(
           java.lang.Integer ifcSet,
           java.lang.String initialFilterCriteria,
           java.lang.Integer priority,
           java.lang.String triggerPoint,
           java.lang.String applicationServer,
           java.lang.Integer profilePartIndicator,
           java.lang.String serviceInformation,
           java.lang.Integer defaultHandling) {
           this.ifcSet = ifcSet;
           this.initialFilterCriteria = initialFilterCriteria;
           this.priority = priority;
           this.triggerPoint = triggerPoint;
           this.applicationServer = applicationServer;
           this.profilePartIndicator = profilePartIndicator;
           this.serviceInformation = serviceInformation;
           this.defaultHandling = defaultHandling;
    }


    /**
     * Gets the ifcSet value for this HsxIfcSetData.
     * 
     * @return ifcSet
     */
    public java.lang.Integer getIfcSet() {
        return ifcSet;
    }


    /**
     * Sets the ifcSet value for this HsxIfcSetData.
     * 
     * @param ifcSet
     */
    public void setIfcSet(java.lang.Integer ifcSet) {
        this.ifcSet = ifcSet;
    }


    /**
     * Gets the initialFilterCriteria value for this HsxIfcSetData.
     * 
     * @return initialFilterCriteria
     */
    public java.lang.String getInitialFilterCriteria() {
        return initialFilterCriteria;
    }


    /**
     * Sets the initialFilterCriteria value for this HsxIfcSetData.
     * 
     * @param initialFilterCriteria
     */
    public void setInitialFilterCriteria(java.lang.String initialFilterCriteria) {
        this.initialFilterCriteria = initialFilterCriteria;
    }


    /**
     * Gets the priority value for this HsxIfcSetData.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this HsxIfcSetData.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the triggerPoint value for this HsxIfcSetData.
     * 
     * @return triggerPoint
     */
    public java.lang.String getTriggerPoint() {
        return triggerPoint;
    }


    /**
     * Sets the triggerPoint value for this HsxIfcSetData.
     * 
     * @param triggerPoint
     */
    public void setTriggerPoint(java.lang.String triggerPoint) {
        this.triggerPoint = triggerPoint;
    }


    /**
     * Gets the applicationServer value for this HsxIfcSetData.
     * 
     * @return applicationServer
     */
    public java.lang.String getApplicationServer() {
        return applicationServer;
    }


    /**
     * Sets the applicationServer value for this HsxIfcSetData.
     * 
     * @param applicationServer
     */
    public void setApplicationServer(java.lang.String applicationServer) {
        this.applicationServer = applicationServer;
    }


    /**
     * Gets the profilePartIndicator value for this HsxIfcSetData.
     * 
     * @return profilePartIndicator
     */
    public java.lang.Integer getProfilePartIndicator() {
        return profilePartIndicator;
    }


    /**
     * Sets the profilePartIndicator value for this HsxIfcSetData.
     * 
     * @param profilePartIndicator
     */
    public void setProfilePartIndicator(java.lang.Integer profilePartIndicator) {
        this.profilePartIndicator = profilePartIndicator;
    }


    /**
     * Gets the serviceInformation value for this HsxIfcSetData.
     * 
     * @return serviceInformation
     */
    public java.lang.String getServiceInformation() {
        return serviceInformation;
    }


    /**
     * Sets the serviceInformation value for this HsxIfcSetData.
     * 
     * @param serviceInformation
     */
    public void setServiceInformation(java.lang.String serviceInformation) {
        this.serviceInformation = serviceInformation;
    }


    /**
     * Gets the defaultHandling value for this HsxIfcSetData.
     * 
     * @return defaultHandling
     */
    public java.lang.Integer getDefaultHandling() {
        return defaultHandling;
    }


    /**
     * Sets the defaultHandling value for this HsxIfcSetData.
     * 
     * @param defaultHandling
     */
    public void setDefaultHandling(java.lang.Integer defaultHandling) {
        this.defaultHandling = defaultHandling;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxIfcSetData)) return false;
        HsxIfcSetData other = (HsxIfcSetData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ifcSet==null && other.getIfcSet()==null) || 
             (this.ifcSet!=null &&
              this.ifcSet.equals(other.getIfcSet()))) &&
            ((this.initialFilterCriteria==null && other.getInitialFilterCriteria()==null) || 
             (this.initialFilterCriteria!=null &&
              this.initialFilterCriteria.equals(other.getInitialFilterCriteria()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.triggerPoint==null && other.getTriggerPoint()==null) || 
             (this.triggerPoint!=null &&
              this.triggerPoint.equals(other.getTriggerPoint()))) &&
            ((this.applicationServer==null && other.getApplicationServer()==null) || 
             (this.applicationServer!=null &&
              this.applicationServer.equals(other.getApplicationServer()))) &&
            ((this.profilePartIndicator==null && other.getProfilePartIndicator()==null) || 
             (this.profilePartIndicator!=null &&
              this.profilePartIndicator.equals(other.getProfilePartIndicator()))) &&
            ((this.serviceInformation==null && other.getServiceInformation()==null) || 
             (this.serviceInformation!=null &&
              this.serviceInformation.equals(other.getServiceInformation()))) &&
            ((this.defaultHandling==null && other.getDefaultHandling()==null) || 
             (this.defaultHandling!=null &&
              this.defaultHandling.equals(other.getDefaultHandling())));
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
        if (getIfcSet() != null) {
            _hashCode += getIfcSet().hashCode();
        }
        if (getInitialFilterCriteria() != null) {
            _hashCode += getInitialFilterCriteria().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getTriggerPoint() != null) {
            _hashCode += getTriggerPoint().hashCode();
        }
        if (getApplicationServer() != null) {
            _hashCode += getApplicationServer().hashCode();
        }
        if (getProfilePartIndicator() != null) {
            _hashCode += getProfilePartIndicator().hashCode();
        }
        if (getServiceInformation() != null) {
            _hashCode += getServiceInformation().hashCode();
        }
        if (getDefaultHandling() != null) {
            _hashCode += getDefaultHandling().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxIfcSetData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxIfcSetData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifcSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifcSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialFilterCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initialFilterCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triggerPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationServer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profilePartIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profilePartIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultHandling");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultHandling"));
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
