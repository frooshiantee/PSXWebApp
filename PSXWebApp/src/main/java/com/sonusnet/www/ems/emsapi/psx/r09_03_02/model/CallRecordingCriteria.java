/**
 * CallRecordingCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CallRecordingCriteria  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String callRecordingCriteria;

    private java.lang.String recorderName;

    private java.lang.String ingressTgId;

    private java.lang.String egressTgId;

    private java.lang.String callingPartyId;

    private java.lang.String calledPartyId;

    private java.lang.String ipAddress1;

    private java.lang.String ipAddress2;

    private java.lang.String gatewayId;

    private java.lang.Integer recordingType;

    private java.lang.Integer maxNumberOfCalls;

    private java.lang.Integer recordingDuration;

    private java.lang.Integer recordingStatus;

    private java.lang.String ipv6Address1;

    private java.lang.String ipv6Address2;

    private java.lang.Integer recorderType;

    private java.lang.Integer crcAttributes;

    public CallRecordingCriteria() {
    }

    public CallRecordingCriteria(
           java.lang.String callRecordingCriteria,
           java.lang.String recorderName,
           java.lang.String ingressTgId,
           java.lang.String egressTgId,
           java.lang.String callingPartyId,
           java.lang.String calledPartyId,
           java.lang.String ipAddress1,
           java.lang.String ipAddress2,
           java.lang.String gatewayId,
           java.lang.Integer recordingType,
           java.lang.Integer maxNumberOfCalls,
           java.lang.Integer recordingDuration,
           java.lang.Integer recordingStatus,
           java.lang.String ipv6Address1,
           java.lang.String ipv6Address2,
           java.lang.Integer recorderType,
           java.lang.Integer crcAttributes) {
        this.callRecordingCriteria = callRecordingCriteria;
        this.recorderName = recorderName;
        this.ingressTgId = ingressTgId;
        this.egressTgId = egressTgId;
        this.callingPartyId = callingPartyId;
        this.calledPartyId = calledPartyId;
        this.ipAddress1 = ipAddress1;
        this.ipAddress2 = ipAddress2;
        this.gatewayId = gatewayId;
        this.recordingType = recordingType;
        this.maxNumberOfCalls = maxNumberOfCalls;
        this.recordingDuration = recordingDuration;
        this.recordingStatus = recordingStatus;
        this.ipv6Address1 = ipv6Address1;
        this.ipv6Address2 = ipv6Address2;
        this.recorderType = recorderType;
        this.crcAttributes = crcAttributes;
    }


    /**
     * Gets the callRecordingCriteria value for this CallRecordingCriteria.
     * 
     * @return callRecordingCriteria
     */
    public java.lang.String getCallRecordingCriteria() {
        return callRecordingCriteria;
    }


    /**
     * Sets the callRecordingCriteria value for this CallRecordingCriteria.
     * 
     * @param callRecordingCriteria
     */
    public void setCallRecordingCriteria(java.lang.String callRecordingCriteria) {
        this.callRecordingCriteria = callRecordingCriteria;
    }


    /**
     * Gets the recorderName value for this CallRecordingCriteria.
     * 
     * @return recorderName
     */
    public java.lang.String getRecorderName() {
        return recorderName;
    }


    /**
     * Sets the recorderName value for this CallRecordingCriteria.
     * 
     * @param recorderName
     */
    public void setRecorderName(java.lang.String recorderName) {
        this.recorderName = recorderName;
    }


    /**
     * Gets the ingressTgId value for this CallRecordingCriteria.
     * 
     * @return ingressTgId
     */
    public java.lang.String getIngressTgId() {
        return ingressTgId;
    }


    /**
     * Sets the ingressTgId value for this CallRecordingCriteria.
     * 
     * @param ingressTgId
     */
    public void setIngressTgId(java.lang.String ingressTgId) {
        this.ingressTgId = ingressTgId;
    }


    /**
     * Gets the egressTgId value for this CallRecordingCriteria.
     * 
     * @return egressTgId
     */
    public java.lang.String getEgressTgId() {
        return egressTgId;
    }


    /**
     * Sets the egressTgId value for this CallRecordingCriteria.
     * 
     * @param egressTgId
     */
    public void setEgressTgId(java.lang.String egressTgId) {
        this.egressTgId = egressTgId;
    }


    /**
     * Gets the callingPartyId value for this CallRecordingCriteria.
     * 
     * @return callingPartyId
     */
    public java.lang.String getCallingPartyId() {
        return callingPartyId;
    }


    /**
     * Sets the callingPartyId value for this CallRecordingCriteria.
     * 
     * @param callingPartyId
     */
    public void setCallingPartyId(java.lang.String callingPartyId) {
        this.callingPartyId = callingPartyId;
    }


    /**
     * Gets the calledPartyId value for this CallRecordingCriteria.
     * 
     * @return calledPartyId
     */
    public java.lang.String getCalledPartyId() {
        return calledPartyId;
    }


    /**
     * Sets the calledPartyId value for this CallRecordingCriteria.
     * 
     * @param calledPartyId
     */
    public void setCalledPartyId(java.lang.String calledPartyId) {
        this.calledPartyId = calledPartyId;
    }


    /**
     * Gets the ipAddress1 value for this CallRecordingCriteria.
     * 
     * @return ipAddress1
     */
    public java.lang.String getIpAddress1() {
        return ipAddress1;
    }


    /**
     * Sets the ipAddress1 value for this CallRecordingCriteria.
     * 
     * @param ipAddress1
     */
    public void setIpAddress1(java.lang.String ipAddress1) {
        this.ipAddress1 = ipAddress1;
    }


    /**
     * Gets the ipAddress2 value for this CallRecordingCriteria.
     * 
     * @return ipAddress2
     */
    public java.lang.String getIpAddress2() {
        return ipAddress2;
    }


    /**
     * Sets the ipAddress2 value for this CallRecordingCriteria.
     * 
     * @param ipAddress2
     */
    public void setIpAddress2(java.lang.String ipAddress2) {
        this.ipAddress2 = ipAddress2;
    }


    /**
     * Gets the gatewayId value for this CallRecordingCriteria.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this CallRecordingCriteria.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the recordingType value for this CallRecordingCriteria.
     * 
     * @return recordingType
     */
    public java.lang.Integer getRecordingType() {
        return recordingType;
    }


    /**
     * Sets the recordingType value for this CallRecordingCriteria.
     * 
     * @param recordingType
     */
    public void setRecordingType(java.lang.Integer recordingType) {
        this.recordingType = recordingType;
    }


    /**
     * Gets the maxNumberOfCalls value for this CallRecordingCriteria.
     * 
     * @return maxNumberOfCalls
     */
    public java.lang.Integer getMaxNumberOfCalls() {
        return maxNumberOfCalls;
    }


    /**
     * Sets the maxNumberOfCalls value for this CallRecordingCriteria.
     * 
     * @param maxNumberOfCalls
     */
    public void setMaxNumberOfCalls(java.lang.Integer maxNumberOfCalls) {
        this.maxNumberOfCalls = maxNumberOfCalls;
    }


    /**
     * Gets the recordingDuration value for this CallRecordingCriteria.
     * 
     * @return recordingDuration
     */
    public java.lang.Integer getRecordingDuration() {
        return recordingDuration;
    }


    /**
     * Sets the recordingDuration value for this CallRecordingCriteria.
     * 
     * @param recordingDuration
     */
    public void setRecordingDuration(java.lang.Integer recordingDuration) {
        this.recordingDuration = recordingDuration;
    }


    /**
     * Gets the recordingStatus value for this CallRecordingCriteria.
     * 
     * @return recordingStatus
     */
    public java.lang.Integer getRecordingStatus() {
        return recordingStatus;
    }


    /**
     * Sets the recordingStatus value for this CallRecordingCriteria.
     * 
     * @param recordingStatus
     */
    public void setRecordingStatus(java.lang.Integer recordingStatus) {
        this.recordingStatus = recordingStatus;
    }


    /**
     * Gets the ipv6Address1 value for this CallRecordingCriteria.
     * 
     * @return ipv6Address1
     */
    public java.lang.String getIpv6Address1() {
        return ipv6Address1;
    }


    /**
     * Sets the ipv6Address1 value for this CallRecordingCriteria.
     * 
     * @param ipv6Address1
     */
    public void setIpv6Address1(java.lang.String ipv6Address1) {
        this.ipv6Address1 = ipv6Address1;
    }


    /**
     * Gets the ipv6Address2 value for this CallRecordingCriteria.
     * 
     * @return ipv6Address2
     */
    public java.lang.String getIpv6Address2() {
        return ipv6Address2;
    }


    /**
     * Sets the ipv6Address2 value for this CallRecordingCriteria.
     * 
     * @param ipv6Address2
     */
    public void setIpv6Address2(java.lang.String ipv6Address2) {
        this.ipv6Address2 = ipv6Address2;
    }


    /**
     * Gets the recorderType value for this CallRecordingCriteria.
     * 
     * @return recorderType
     */
    public java.lang.Integer getRecorderType() {
        return recorderType;
    }


    /**
     * Sets the recorderType value for this CallRecordingCriteria.
     * 
     * @param recorderType
     */
    public void setRecorderType(java.lang.Integer recorderType) {
        this.recorderType = recorderType;
    }


    /**
     * Gets the crcAttributes value for this CallRecordingCriteria.
     * 
     * @return crcAttributes
     */
    public java.lang.Integer getCrcAttributes() {
        return crcAttributes;
    }


    /**
     * Sets the crcAttributes value for this CallRecordingCriteria.
     * 
     * @param crcAttributes
     */
    public void setCrcAttributes(java.lang.Integer crcAttributes) {
        this.crcAttributes = crcAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallRecordingCriteria)) return false;
        CallRecordingCriteria other = (CallRecordingCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callRecordingCriteria==null && other.getCallRecordingCriteria()==null) || 
             (this.callRecordingCriteria!=null &&
              this.callRecordingCriteria.equals(other.getCallRecordingCriteria()))) &&
            ((this.recorderName==null && other.getRecorderName()==null) || 
             (this.recorderName!=null &&
              this.recorderName.equals(other.getRecorderName()))) &&
            ((this.ingressTgId==null && other.getIngressTgId()==null) || 
             (this.ingressTgId!=null &&
              this.ingressTgId.equals(other.getIngressTgId()))) &&
            ((this.egressTgId==null && other.getEgressTgId()==null) || 
             (this.egressTgId!=null &&
              this.egressTgId.equals(other.getEgressTgId()))) &&
            ((this.callingPartyId==null && other.getCallingPartyId()==null) || 
             (this.callingPartyId!=null &&
              this.callingPartyId.equals(other.getCallingPartyId()))) &&
            ((this.calledPartyId==null && other.getCalledPartyId()==null) || 
             (this.calledPartyId!=null &&
              this.calledPartyId.equals(other.getCalledPartyId()))) &&
            ((this.ipAddress1==null && other.getIpAddress1()==null) || 
             (this.ipAddress1!=null &&
              this.ipAddress1.equals(other.getIpAddress1()))) &&
            ((this.ipAddress2==null && other.getIpAddress2()==null) || 
             (this.ipAddress2!=null &&
              this.ipAddress2.equals(other.getIpAddress2()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.recordingType==null && other.getRecordingType()==null) || 
             (this.recordingType!=null &&
              this.recordingType.equals(other.getRecordingType()))) &&
            ((this.maxNumberOfCalls==null && other.getMaxNumberOfCalls()==null) || 
             (this.maxNumberOfCalls!=null &&
              this.maxNumberOfCalls.equals(other.getMaxNumberOfCalls()))) &&
            ((this.recordingDuration==null && other.getRecordingDuration()==null) || 
             (this.recordingDuration!=null &&
              this.recordingDuration.equals(other.getRecordingDuration()))) &&
            ((this.recordingStatus==null && other.getRecordingStatus()==null) || 
             (this.recordingStatus!=null &&
              this.recordingStatus.equals(other.getRecordingStatus()))) &&
            ((this.ipv6Address1==null && other.getIpv6Address1()==null) || 
             (this.ipv6Address1!=null &&
              this.ipv6Address1.equals(other.getIpv6Address1()))) &&
            ((this.ipv6Address2==null && other.getIpv6Address2()==null) || 
             (this.ipv6Address2!=null &&
              this.ipv6Address2.equals(other.getIpv6Address2()))) &&
            ((this.recorderType==null && other.getRecorderType()==null) || 
             (this.recorderType!=null &&
              this.recorderType.equals(other.getRecorderType()))) &&
            ((this.crcAttributes==null && other.getCrcAttributes()==null) || 
             (this.crcAttributes!=null &&
              this.crcAttributes.equals(other.getCrcAttributes())));
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
        if (getCallRecordingCriteria() != null) {
            _hashCode += getCallRecordingCriteria().hashCode();
        }
        if (getRecorderName() != null) {
            _hashCode += getRecorderName().hashCode();
        }
        if (getIngressTgId() != null) {
            _hashCode += getIngressTgId().hashCode();
        }
        if (getEgressTgId() != null) {
            _hashCode += getEgressTgId().hashCode();
        }
        if (getCallingPartyId() != null) {
            _hashCode += getCallingPartyId().hashCode();
        }
        if (getCalledPartyId() != null) {
            _hashCode += getCalledPartyId().hashCode();
        }
        if (getIpAddress1() != null) {
            _hashCode += getIpAddress1().hashCode();
        }
        if (getIpAddress2() != null) {
            _hashCode += getIpAddress2().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getRecordingType() != null) {
            _hashCode += getRecordingType().hashCode();
        }
        if (getMaxNumberOfCalls() != null) {
            _hashCode += getMaxNumberOfCalls().hashCode();
        }
        if (getRecordingDuration() != null) {
            _hashCode += getRecordingDuration().hashCode();
        }
        if (getRecordingStatus() != null) {
            _hashCode += getRecordingStatus().hashCode();
        }
        if (getIpv6Address1() != null) {
            _hashCode += getIpv6Address1().hashCode();
        }
        if (getIpv6Address2() != null) {
            _hashCode += getIpv6Address2().hashCode();
        }
        if (getRecorderType() != null) {
            _hashCode += getRecorderType().hashCode();
        }
        if (getCrcAttributes() != null) {
            _hashCode += getCrcAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallRecordingCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallRecordingCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callRecordingCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callRecordingCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recorderName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recorderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressTgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressTgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egressTgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "egressTgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumberOfCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxNumberOfCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordingDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordingDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Address1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6Address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Address2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recorderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recorderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crcAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crcAttributes"));
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
