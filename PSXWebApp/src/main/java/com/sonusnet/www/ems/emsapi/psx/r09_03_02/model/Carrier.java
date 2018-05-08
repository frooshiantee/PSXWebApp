/**
 * Carrier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class Carrier  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String carrierId;

    private java.lang.String partitionId;

    private java.lang.String tandemScriptId;

    private java.lang.String nonSubScriptId;

    private java.lang.String casualRteId;

    private java.lang.String tfCacId;

    private java.lang.String signalingProfileId;

    private java.lang.String prfdPacketServiceProfileId;

    private java.lang.Short carrierInTrial;

    private java.lang.String sipDomainId;

    private java.lang.Integer elementAttributes;

    private java.lang.String classOfServiceId;

    private java.lang.String exceptionProfileId;

    private java.lang.Short isEscaped;

    private java.lang.String numberingPlanId;

    private java.lang.String callParamFilterGroupId;

    private java.lang.Integer serviceProviderId;

    public Carrier() {
    }

    public Carrier(
           java.lang.String carrierId,
           java.lang.String partitionId,
           java.lang.String tandemScriptId,
           java.lang.String nonSubScriptId,
           java.lang.String casualRteId,
           java.lang.String tfCacId,
           java.lang.String signalingProfileId,
           java.lang.String prfdPacketServiceProfileId,
           java.lang.Short carrierInTrial,
           java.lang.String sipDomainId,
           java.lang.Integer elementAttributes,
           java.lang.String classOfServiceId,
           java.lang.String exceptionProfileId,
           java.lang.Short isEscaped,
           java.lang.String numberingPlanId,
           java.lang.String callParamFilterGroupId,
           java.lang.Integer serviceProviderId) {
        this.carrierId = carrierId;
        this.partitionId = partitionId;
        this.tandemScriptId = tandemScriptId;
        this.nonSubScriptId = nonSubScriptId;
        this.casualRteId = casualRteId;
        this.tfCacId = tfCacId;
        this.signalingProfileId = signalingProfileId;
        this.prfdPacketServiceProfileId = prfdPacketServiceProfileId;
        this.carrierInTrial = carrierInTrial;
        this.sipDomainId = sipDomainId;
        this.elementAttributes = elementAttributes;
        this.classOfServiceId = classOfServiceId;
        this.exceptionProfileId = exceptionProfileId;
        this.isEscaped = isEscaped;
        this.numberingPlanId = numberingPlanId;
        this.callParamFilterGroupId = callParamFilterGroupId;
        this.serviceProviderId = serviceProviderId;
    }


    /**
     * Gets the carrierId value for this Carrier.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this Carrier.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the partitionId value for this Carrier.
     * 
     * @return partitionId
     */
    public java.lang.String getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this Carrier.
     * 
     * @param partitionId
     */
    public void setPartitionId(java.lang.String partitionId) {
        this.partitionId = partitionId;
    }


    /**
     * Gets the tandemScriptId value for this Carrier.
     * 
     * @return tandemScriptId
     */
    public java.lang.String getTandemScriptId() {
        return tandemScriptId;
    }


    /**
     * Sets the tandemScriptId value for this Carrier.
     * 
     * @param tandemScriptId
     */
    public void setTandemScriptId(java.lang.String tandemScriptId) {
        this.tandemScriptId = tandemScriptId;
    }


    /**
     * Gets the nonSubScriptId value for this Carrier.
     * 
     * @return nonSubScriptId
     */
    public java.lang.String getNonSubScriptId() {
        return nonSubScriptId;
    }


    /**
     * Sets the nonSubScriptId value for this Carrier.
     * 
     * @param nonSubScriptId
     */
    public void setNonSubScriptId(java.lang.String nonSubScriptId) {
        this.nonSubScriptId = nonSubScriptId;
    }


    /**
     * Gets the casualRteId value for this Carrier.
     * 
     * @return casualRteId
     */
    public java.lang.String getCasualRteId() {
        return casualRteId;
    }


    /**
     * Sets the casualRteId value for this Carrier.
     * 
     * @param casualRteId
     */
    public void setCasualRteId(java.lang.String casualRteId) {
        this.casualRteId = casualRteId;
    }


    /**
     * Gets the tfCacId value for this Carrier.
     * 
     * @return tfCacId
     */
    public java.lang.String getTfCacId() {
        return tfCacId;
    }


    /**
     * Sets the tfCacId value for this Carrier.
     * 
     * @param tfCacId
     */
    public void setTfCacId(java.lang.String tfCacId) {
        this.tfCacId = tfCacId;
    }


    /**
     * Gets the signalingProfileId value for this Carrier.
     * 
     * @return signalingProfileId
     */
    public java.lang.String getSignalingProfileId() {
        return signalingProfileId;
    }


    /**
     * Sets the signalingProfileId value for this Carrier.
     * 
     * @param signalingProfileId
     */
    public void setSignalingProfileId(java.lang.String signalingProfileId) {
        this.signalingProfileId = signalingProfileId;
    }


    /**
     * Gets the prfdPacketServiceProfileId value for this Carrier.
     * 
     * @return prfdPacketServiceProfileId
     */
    public java.lang.String getPrfdPacketServiceProfileId() {
        return prfdPacketServiceProfileId;
    }


    /**
     * Sets the prfdPacketServiceProfileId value for this Carrier.
     * 
     * @param prfdPacketServiceProfileId
     */
    public void setPrfdPacketServiceProfileId(java.lang.String prfdPacketServiceProfileId) {
        this.prfdPacketServiceProfileId = prfdPacketServiceProfileId;
    }


    /**
     * Gets the carrierInTrial value for this Carrier.
     * 
     * @return carrierInTrial
     */
    public java.lang.Short getCarrierInTrial() {
        return carrierInTrial;
    }


    /**
     * Sets the carrierInTrial value for this Carrier.
     * 
     * @param carrierInTrial
     */
    public void setCarrierInTrial(java.lang.Short carrierInTrial) {
        this.carrierInTrial = carrierInTrial;
    }


    /**
     * Gets the sipDomainId value for this Carrier.
     * 
     * @return sipDomainId
     */
    public java.lang.String getSipDomainId() {
        return sipDomainId;
    }


    /**
     * Sets the sipDomainId value for this Carrier.
     * 
     * @param sipDomainId
     */
    public void setSipDomainId(java.lang.String sipDomainId) {
        this.sipDomainId = sipDomainId;
    }


    /**
     * Gets the elementAttributes value for this Carrier.
     * 
     * @return elementAttributes
     */
    public java.lang.Integer getElementAttributes() {
        return elementAttributes;
    }


    /**
     * Sets the elementAttributes value for this Carrier.
     * 
     * @param elementAttributes
     */
    public void setElementAttributes(java.lang.Integer elementAttributes) {
        this.elementAttributes = elementAttributes;
    }


    /**
     * Gets the classOfServiceId value for this Carrier.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this Carrier.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the exceptionProfileId value for this Carrier.
     * 
     * @return exceptionProfileId
     */
    public java.lang.String getExceptionProfileId() {
        return exceptionProfileId;
    }


    /**
     * Sets the exceptionProfileId value for this Carrier.
     * 
     * @param exceptionProfileId
     */
    public void setExceptionProfileId(java.lang.String exceptionProfileId) {
        this.exceptionProfileId = exceptionProfileId;
    }


    /**
     * Gets the isEscaped value for this Carrier.
     * 
     * @return isEscaped
     */
    public java.lang.Short getIsEscaped() {
        return isEscaped;
    }


    /**
     * Sets the isEscaped value for this Carrier.
     * 
     * @param isEscaped
     */
    public void setIsEscaped(java.lang.Short isEscaped) {
        this.isEscaped = isEscaped;
    }


    /**
     * Gets the numberingPlanId value for this Carrier.
     * 
     * @return numberingPlanId
     */
    public java.lang.String getNumberingPlanId() {
        return numberingPlanId;
    }


    /**
     * Sets the numberingPlanId value for this Carrier.
     * 
     * @param numberingPlanId
     */
    public void setNumberingPlanId(java.lang.String numberingPlanId) {
        this.numberingPlanId = numberingPlanId;
    }


    /**
     * Gets the callParamFilterGroupId value for this Carrier.
     * 
     * @return callParamFilterGroupId
     */
    public java.lang.String getCallParamFilterGroupId() {
        return callParamFilterGroupId;
    }


    /**
     * Sets the callParamFilterGroupId value for this Carrier.
     * 
     * @param callParamFilterGroupId
     */
    public void setCallParamFilterGroupId(java.lang.String callParamFilterGroupId) {
        this.callParamFilterGroupId = callParamFilterGroupId;
    }


    /**
     * Gets the serviceProviderId value for this Carrier.
     * 
     * @return serviceProviderId
     */
    public java.lang.Integer getServiceProviderId() {
        return serviceProviderId;
    }


    /**
     * Sets the serviceProviderId value for this Carrier.
     * 
     * @param serviceProviderId
     */
    public void setServiceProviderId(java.lang.Integer serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Carrier)) return false;
        Carrier other = (Carrier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId()))) &&
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId()))) &&
            ((this.tandemScriptId==null && other.getTandemScriptId()==null) || 
             (this.tandemScriptId!=null &&
              this.tandemScriptId.equals(other.getTandemScriptId()))) &&
            ((this.nonSubScriptId==null && other.getNonSubScriptId()==null) || 
             (this.nonSubScriptId!=null &&
              this.nonSubScriptId.equals(other.getNonSubScriptId()))) &&
            ((this.casualRteId==null && other.getCasualRteId()==null) || 
             (this.casualRteId!=null &&
              this.casualRteId.equals(other.getCasualRteId()))) &&
            ((this.tfCacId==null && other.getTfCacId()==null) || 
             (this.tfCacId!=null &&
              this.tfCacId.equals(other.getTfCacId()))) &&
            ((this.signalingProfileId==null && other.getSignalingProfileId()==null) || 
             (this.signalingProfileId!=null &&
              this.signalingProfileId.equals(other.getSignalingProfileId()))) &&
            ((this.prfdPacketServiceProfileId==null && other.getPrfdPacketServiceProfileId()==null) || 
             (this.prfdPacketServiceProfileId!=null &&
              this.prfdPacketServiceProfileId.equals(other.getPrfdPacketServiceProfileId()))) &&
            ((this.carrierInTrial==null && other.getCarrierInTrial()==null) || 
             (this.carrierInTrial!=null &&
              this.carrierInTrial.equals(other.getCarrierInTrial()))) &&
            ((this.sipDomainId==null && other.getSipDomainId()==null) || 
             (this.sipDomainId!=null &&
              this.sipDomainId.equals(other.getSipDomainId()))) &&
            ((this.elementAttributes==null && other.getElementAttributes()==null) || 
             (this.elementAttributes!=null &&
              this.elementAttributes.equals(other.getElementAttributes()))) &&
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.exceptionProfileId==null && other.getExceptionProfileId()==null) || 
             (this.exceptionProfileId!=null &&
              this.exceptionProfileId.equals(other.getExceptionProfileId()))) &&
            ((this.isEscaped==null && other.getIsEscaped()==null) || 
             (this.isEscaped!=null &&
              this.isEscaped.equals(other.getIsEscaped()))) &&
            ((this.numberingPlanId==null && other.getNumberingPlanId()==null) || 
             (this.numberingPlanId!=null &&
              this.numberingPlanId.equals(other.getNumberingPlanId()))) &&
            ((this.callParamFilterGroupId==null && other.getCallParamFilterGroupId()==null) || 
             (this.callParamFilterGroupId!=null &&
              this.callParamFilterGroupId.equals(other.getCallParamFilterGroupId()))) &&
            ((this.serviceProviderId==null && other.getServiceProviderId()==null) || 
             (this.serviceProviderId!=null &&
              this.serviceProviderId.equals(other.getServiceProviderId())));
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
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        if (getTandemScriptId() != null) {
            _hashCode += getTandemScriptId().hashCode();
        }
        if (getNonSubScriptId() != null) {
            _hashCode += getNonSubScriptId().hashCode();
        }
        if (getCasualRteId() != null) {
            _hashCode += getCasualRteId().hashCode();
        }
        if (getTfCacId() != null) {
            _hashCode += getTfCacId().hashCode();
        }
        if (getSignalingProfileId() != null) {
            _hashCode += getSignalingProfileId().hashCode();
        }
        if (getPrfdPacketServiceProfileId() != null) {
            _hashCode += getPrfdPacketServiceProfileId().hashCode();
        }
        if (getCarrierInTrial() != null) {
            _hashCode += getCarrierInTrial().hashCode();
        }
        if (getSipDomainId() != null) {
            _hashCode += getSipDomainId().hashCode();
        }
        if (getElementAttributes() != null) {
            _hashCode += getElementAttributes().hashCode();
        }
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getExceptionProfileId() != null) {
            _hashCode += getExceptionProfileId().hashCode();
        }
        if (getIsEscaped() != null) {
            _hashCode += getIsEscaped().hashCode();
        }
        if (getNumberingPlanId() != null) {
            _hashCode += getNumberingPlanId().hashCode();
        }
        if (getCallParamFilterGroupId() != null) {
            _hashCode += getCallParamFilterGroupId().hashCode();
        }
        if (getServiceProviderId() != null) {
            _hashCode += getServiceProviderId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Carrier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Carrier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tandemScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tandemScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonSubScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonSubScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("casualRteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "casualRteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tfCacId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tfCacId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signalingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prfdPacketServiceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prfdPacketServiceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierInTrial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierInTrial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDomainId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDomainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elementAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classOfServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classOfServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEscaped");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isEscaped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberingPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParamFilterGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProviderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceProviderId"));
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
