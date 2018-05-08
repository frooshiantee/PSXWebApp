/**
 * TriggerTypePriority.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class TriggerTypePriority  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.Short callProcessingElementType;

    private java.lang.Short calledPartyFlag;

    private java.lang.Short callingPartyFlag;

    private java.lang.Short triggerPriority;

    private java.lang.Integer priorityTypeFlags;

    public TriggerTypePriority() {
    }

    public TriggerTypePriority(
           java.lang.Short callProcessingElementType,
           java.lang.Short calledPartyFlag,
           java.lang.Short callingPartyFlag,
           java.lang.Short triggerPriority,
           java.lang.Integer priorityTypeFlags) {
        this.callProcessingElementType = callProcessingElementType;
        this.calledPartyFlag = calledPartyFlag;
        this.callingPartyFlag = callingPartyFlag;
        this.triggerPriority = triggerPriority;
        this.priorityTypeFlags = priorityTypeFlags;
    }


    /**
     * Gets the callProcessingElementType value for this TriggerTypePriority.
     * 
     * @return callProcessingElementType
     */
    public java.lang.Short getCallProcessingElementType() {
        return callProcessingElementType;
    }


    /**
     * Sets the callProcessingElementType value for this TriggerTypePriority.
     * 
     * @param callProcessingElementType
     */
    public void setCallProcessingElementType(java.lang.Short callProcessingElementType) {
        this.callProcessingElementType = callProcessingElementType;
    }


    /**
     * Gets the calledPartyFlag value for this TriggerTypePriority.
     * 
     * @return calledPartyFlag
     */
    public java.lang.Short getCalledPartyFlag() {
        return calledPartyFlag;
    }


    /**
     * Sets the calledPartyFlag value for this TriggerTypePriority.
     * 
     * @param calledPartyFlag
     */
    public void setCalledPartyFlag(java.lang.Short calledPartyFlag) {
        this.calledPartyFlag = calledPartyFlag;
    }


    /**
     * Gets the callingPartyFlag value for this TriggerTypePriority.
     * 
     * @return callingPartyFlag
     */
    public java.lang.Short getCallingPartyFlag() {
        return callingPartyFlag;
    }


    /**
     * Sets the callingPartyFlag value for this TriggerTypePriority.
     * 
     * @param callingPartyFlag
     */
    public void setCallingPartyFlag(java.lang.Short callingPartyFlag) {
        this.callingPartyFlag = callingPartyFlag;
    }


    /**
     * Gets the triggerPriority value for this TriggerTypePriority.
     * 
     * @return triggerPriority
     */
    public java.lang.Short getTriggerPriority() {
        return triggerPriority;
    }


    /**
     * Sets the triggerPriority value for this TriggerTypePriority.
     * 
     * @param triggerPriority
     */
    public void setTriggerPriority(java.lang.Short triggerPriority) {
        this.triggerPriority = triggerPriority;
    }


    /**
     * Gets the priorityTypeFlags value for this TriggerTypePriority.
     * 
     * @return priorityTypeFlags
     */
    public java.lang.Integer getPriorityTypeFlags() {
        return priorityTypeFlags;
    }


    /**
     * Sets the priorityTypeFlags value for this TriggerTypePriority.
     * 
     * @param priorityTypeFlags
     */
    public void setPriorityTypeFlags(java.lang.Integer priorityTypeFlags) {
        this.priorityTypeFlags = priorityTypeFlags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TriggerTypePriority)) return false;
        TriggerTypePriority other = (TriggerTypePriority) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callProcessingElementType==null && other.getCallProcessingElementType()==null) || 
             (this.callProcessingElementType!=null &&
              this.callProcessingElementType.equals(other.getCallProcessingElementType()))) &&
            ((this.calledPartyFlag==null && other.getCalledPartyFlag()==null) || 
             (this.calledPartyFlag!=null &&
              this.calledPartyFlag.equals(other.getCalledPartyFlag()))) &&
            ((this.callingPartyFlag==null && other.getCallingPartyFlag()==null) || 
             (this.callingPartyFlag!=null &&
              this.callingPartyFlag.equals(other.getCallingPartyFlag()))) &&
            ((this.triggerPriority==null && other.getTriggerPriority()==null) || 
             (this.triggerPriority!=null &&
              this.triggerPriority.equals(other.getTriggerPriority()))) &&
            ((this.priorityTypeFlags==null && other.getPriorityTypeFlags()==null) || 
             (this.priorityTypeFlags!=null &&
              this.priorityTypeFlags.equals(other.getPriorityTypeFlags())));
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
        if (getCallProcessingElementType() != null) {
            _hashCode += getCallProcessingElementType().hashCode();
        }
        if (getCalledPartyFlag() != null) {
            _hashCode += getCalledPartyFlag().hashCode();
        }
        if (getCallingPartyFlag() != null) {
            _hashCode += getCallingPartyFlag().hashCode();
        }
        if (getTriggerPriority() != null) {
            _hashCode += getTriggerPriority().hashCode();
        }
        if (getPriorityTypeFlags() != null) {
            _hashCode += getPriorityTypeFlags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TriggerTypePriority.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TriggerTypePriority"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElementType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledPartyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledPartyFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingPartyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingPartyFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triggerPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityTypeFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priorityTypeFlags"));
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
