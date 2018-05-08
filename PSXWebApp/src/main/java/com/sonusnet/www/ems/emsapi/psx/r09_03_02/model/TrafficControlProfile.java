/**
 * TrafficControlProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class TrafficControlProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String trafficControlProfileId;

    private java.lang.String description;

    private java.lang.Short controlAction;

    private java.lang.Short gapInterval;

    private java.lang.Short percentageFlow;

    public TrafficControlProfile() {
    }

    public TrafficControlProfile(
           java.lang.String trafficControlProfileId,
           java.lang.String description,
           java.lang.Short controlAction,
           java.lang.Short gapInterval,
           java.lang.Short percentageFlow) {
        this.trafficControlProfileId = trafficControlProfileId;
        this.description = description;
        this.controlAction = controlAction;
        this.gapInterval = gapInterval;
        this.percentageFlow = percentageFlow;
    }


    /**
     * Gets the trafficControlProfileId value for this TrafficControlProfile.
     * 
     * @return trafficControlProfileId
     */
    public java.lang.String getTrafficControlProfileId() {
        return trafficControlProfileId;
    }


    /**
     * Sets the trafficControlProfileId value for this TrafficControlProfile.
     * 
     * @param trafficControlProfileId
     */
    public void setTrafficControlProfileId(java.lang.String trafficControlProfileId) {
        this.trafficControlProfileId = trafficControlProfileId;
    }


    /**
     * Gets the description value for this TrafficControlProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TrafficControlProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the controlAction value for this TrafficControlProfile.
     * 
     * @return controlAction
     */
    public java.lang.Short getControlAction() {
        return controlAction;
    }


    /**
     * Sets the controlAction value for this TrafficControlProfile.
     * 
     * @param controlAction
     */
    public void setControlAction(java.lang.Short controlAction) {
        this.controlAction = controlAction;
    }


    /**
     * Gets the gapInterval value for this TrafficControlProfile.
     * 
     * @return gapInterval
     */
    public java.lang.Short getGapInterval() {
        return gapInterval;
    }


    /**
     * Sets the gapInterval value for this TrafficControlProfile.
     * 
     * @param gapInterval
     */
    public void setGapInterval(java.lang.Short gapInterval) {
        this.gapInterval = gapInterval;
    }


    /**
     * Gets the percentageFlow value for this TrafficControlProfile.
     * 
     * @return percentageFlow
     */
    public java.lang.Short getPercentageFlow() {
        return percentageFlow;
    }


    /**
     * Sets the percentageFlow value for this TrafficControlProfile.
     * 
     * @param percentageFlow
     */
    public void setPercentageFlow(java.lang.Short percentageFlow) {
        this.percentageFlow = percentageFlow;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficControlProfile)) return false;
        TrafficControlProfile other = (TrafficControlProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.trafficControlProfileId==null && other.getTrafficControlProfileId()==null) || 
             (this.trafficControlProfileId!=null &&
              this.trafficControlProfileId.equals(other.getTrafficControlProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.controlAction==null && other.getControlAction()==null) || 
             (this.controlAction!=null &&
              this.controlAction.equals(other.getControlAction()))) &&
            ((this.gapInterval==null && other.getGapInterval()==null) || 
             (this.gapInterval!=null &&
              this.gapInterval.equals(other.getGapInterval()))) &&
            ((this.percentageFlow==null && other.getPercentageFlow()==null) || 
             (this.percentageFlow!=null &&
              this.percentageFlow.equals(other.getPercentageFlow())));
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
        if (getTrafficControlProfileId() != null) {
            _hashCode += getTrafficControlProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getControlAction() != null) {
            _hashCode += getControlAction().hashCode();
        }
        if (getGapInterval() != null) {
            _hashCode += getGapInterval().hashCode();
        }
        if (getPercentageFlow() != null) {
            _hashCode += getPercentageFlow().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrafficControlProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrafficControlProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficControlProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controlAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gapInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gapInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentageFlow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentageFlow"));
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
