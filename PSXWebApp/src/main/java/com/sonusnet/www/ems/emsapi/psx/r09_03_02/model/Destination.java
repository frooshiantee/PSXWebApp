/**
 * Destination.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class Destination  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String nationalId;

    private java.lang.String countryId;

    private java.lang.String destSvcScriptId;

    private java.lang.String customScriptId;

    private java.lang.Integer elementAttributes;

    private java.lang.String prfdPacketServiceProfileId;

    private java.lang.String routingLabelId;

    private java.lang.Short isSubscriber;

    private java.lang.Short portedType;

    private java.lang.Short lnpTransitionFlag;

    private java.lang.String homeGateway;

    private java.lang.String exceptionProfileId;

    private java.lang.String businessGroupId;

    private java.lang.String businessUnitId;

    private java.lang.String callParamFilterProfileId;

    public Destination() {
    }

    public Destination(
           java.lang.String nationalId,
           java.lang.String countryId,
           java.lang.String destSvcScriptId,
           java.lang.String customScriptId,
           java.lang.Integer elementAttributes,
           java.lang.String prfdPacketServiceProfileId,
           java.lang.String routingLabelId,
           java.lang.Short isSubscriber,
           java.lang.Short portedType,
           java.lang.Short lnpTransitionFlag,
           java.lang.String homeGateway,
           java.lang.String exceptionProfileId,
           java.lang.String businessGroupId,
           java.lang.String businessUnitId,
           java.lang.String callParamFilterProfileId) {
        this.nationalId = nationalId;
        this.countryId = countryId;
        this.destSvcScriptId = destSvcScriptId;
        this.customScriptId = customScriptId;
        this.elementAttributes = elementAttributes;
        this.prfdPacketServiceProfileId = prfdPacketServiceProfileId;
        this.routingLabelId = routingLabelId;
        this.isSubscriber = isSubscriber;
        this.portedType = portedType;
        this.lnpTransitionFlag = lnpTransitionFlag;
        this.homeGateway = homeGateway;
        this.exceptionProfileId = exceptionProfileId;
        this.businessGroupId = businessGroupId;
        this.businessUnitId = businessUnitId;
        this.callParamFilterProfileId = callParamFilterProfileId;
    }


    /**
     * Gets the nationalId value for this Destination.
     * 
     * @return nationalId
     */
    public java.lang.String getNationalId() {
        return nationalId;
    }


    /**
     * Sets the nationalId value for this Destination.
     * 
     * @param nationalId
     */
    public void setNationalId(java.lang.String nationalId) {
        this.nationalId = nationalId;
    }


    /**
     * Gets the countryId value for this Destination.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this Destination.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the destSvcScriptId value for this Destination.
     * 
     * @return destSvcScriptId
     */
    public java.lang.String getDestSvcScriptId() {
        return destSvcScriptId;
    }


    /**
     * Sets the destSvcScriptId value for this Destination.
     * 
     * @param destSvcScriptId
     */
    public void setDestSvcScriptId(java.lang.String destSvcScriptId) {
        this.destSvcScriptId = destSvcScriptId;
    }


    /**
     * Gets the customScriptId value for this Destination.
     * 
     * @return customScriptId
     */
    public java.lang.String getCustomScriptId() {
        return customScriptId;
    }


    /**
     * Sets the customScriptId value for this Destination.
     * 
     * @param customScriptId
     */
    public void setCustomScriptId(java.lang.String customScriptId) {
        this.customScriptId = customScriptId;
    }


    /**
     * Gets the elementAttributes value for this Destination.
     * 
     * @return elementAttributes
     */
    public java.lang.Integer getElementAttributes() {
        return elementAttributes;
    }


    /**
     * Sets the elementAttributes value for this Destination.
     * 
     * @param elementAttributes
     */
    public void setElementAttributes(java.lang.Integer elementAttributes) {
        this.elementAttributes = elementAttributes;
    }


    /**
     * Gets the prfdPacketServiceProfileId value for this Destination.
     * 
     * @return prfdPacketServiceProfileId
     */
    public java.lang.String getPrfdPacketServiceProfileId() {
        return prfdPacketServiceProfileId;
    }


    /**
     * Sets the prfdPacketServiceProfileId value for this Destination.
     * 
     * @param prfdPacketServiceProfileId
     */
    public void setPrfdPacketServiceProfileId(java.lang.String prfdPacketServiceProfileId) {
        this.prfdPacketServiceProfileId = prfdPacketServiceProfileId;
    }


    /**
     * Gets the routingLabelId value for this Destination.
     * 
     * @return routingLabelId
     */
    public java.lang.String getRoutingLabelId() {
        return routingLabelId;
    }


    /**
     * Sets the routingLabelId value for this Destination.
     * 
     * @param routingLabelId
     */
    public void setRoutingLabelId(java.lang.String routingLabelId) {
        this.routingLabelId = routingLabelId;
    }


    /**
     * Gets the isSubscriber value for this Destination.
     * 
     * @return isSubscriber
     */
    public java.lang.Short getIsSubscriber() {
        return isSubscriber;
    }


    /**
     * Sets the isSubscriber value for this Destination.
     * 
     * @param isSubscriber
     */
    public void setIsSubscriber(java.lang.Short isSubscriber) {
        this.isSubscriber = isSubscriber;
    }


    /**
     * Gets the portedType value for this Destination.
     * 
     * @return portedType
     */
    public java.lang.Short getPortedType() {
        return portedType;
    }


    /**
     * Sets the portedType value for this Destination.
     * 
     * @param portedType
     */
    public void setPortedType(java.lang.Short portedType) {
        this.portedType = portedType;
    }


    /**
     * Gets the lnpTransitionFlag value for this Destination.
     * 
     * @return lnpTransitionFlag
     */
    public java.lang.Short getLnpTransitionFlag() {
        return lnpTransitionFlag;
    }


    /**
     * Sets the lnpTransitionFlag value for this Destination.
     * 
     * @param lnpTransitionFlag
     */
    public void setLnpTransitionFlag(java.lang.Short lnpTransitionFlag) {
        this.lnpTransitionFlag = lnpTransitionFlag;
    }


    /**
     * Gets the homeGateway value for this Destination.
     * 
     * @return homeGateway
     */
    public java.lang.String getHomeGateway() {
        return homeGateway;
    }


    /**
     * Sets the homeGateway value for this Destination.
     * 
     * @param homeGateway
     */
    public void setHomeGateway(java.lang.String homeGateway) {
        this.homeGateway = homeGateway;
    }


    /**
     * Gets the exceptionProfileId value for this Destination.
     * 
     * @return exceptionProfileId
     */
    public java.lang.String getExceptionProfileId() {
        return exceptionProfileId;
    }


    /**
     * Sets the exceptionProfileId value for this Destination.
     * 
     * @param exceptionProfileId
     */
    public void setExceptionProfileId(java.lang.String exceptionProfileId) {
        this.exceptionProfileId = exceptionProfileId;
    }


    /**
     * Gets the businessGroupId value for this Destination.
     * 
     * @return businessGroupId
     */
    public java.lang.String getBusinessGroupId() {
        return businessGroupId;
    }


    /**
     * Sets the businessGroupId value for this Destination.
     * 
     * @param businessGroupId
     */
    public void setBusinessGroupId(java.lang.String businessGroupId) {
        this.businessGroupId = businessGroupId;
    }


    /**
     * Gets the businessUnitId value for this Destination.
     * 
     * @return businessUnitId
     */
    public java.lang.String getBusinessUnitId() {
        return businessUnitId;
    }


    /**
     * Sets the businessUnitId value for this Destination.
     * 
     * @param businessUnitId
     */
    public void setBusinessUnitId(java.lang.String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }


    /**
     * Gets the callParamFilterProfileId value for this Destination.
     * 
     * @return callParamFilterProfileId
     */
    public java.lang.String getCallParamFilterProfileId() {
        return callParamFilterProfileId;
    }


    /**
     * Sets the callParamFilterProfileId value for this Destination.
     * 
     * @param callParamFilterProfileId
     */
    public void setCallParamFilterProfileId(java.lang.String callParamFilterProfileId) {
        this.callParamFilterProfileId = callParamFilterProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Destination)) return false;
        Destination other = (Destination) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nationalId==null && other.getNationalId()==null) || 
             (this.nationalId!=null &&
              this.nationalId.equals(other.getNationalId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.destSvcScriptId==null && other.getDestSvcScriptId()==null) || 
             (this.destSvcScriptId!=null &&
              this.destSvcScriptId.equals(other.getDestSvcScriptId()))) &&
            ((this.customScriptId==null && other.getCustomScriptId()==null) || 
             (this.customScriptId!=null &&
              this.customScriptId.equals(other.getCustomScriptId()))) &&
            ((this.elementAttributes==null && other.getElementAttributes()==null) || 
             (this.elementAttributes!=null &&
              this.elementAttributes.equals(other.getElementAttributes()))) &&
            ((this.prfdPacketServiceProfileId==null && other.getPrfdPacketServiceProfileId()==null) || 
             (this.prfdPacketServiceProfileId!=null &&
              this.prfdPacketServiceProfileId.equals(other.getPrfdPacketServiceProfileId()))) &&
            ((this.routingLabelId==null && other.getRoutingLabelId()==null) || 
             (this.routingLabelId!=null &&
              this.routingLabelId.equals(other.getRoutingLabelId()))) &&
            ((this.isSubscriber==null && other.getIsSubscriber()==null) || 
             (this.isSubscriber!=null &&
              this.isSubscriber.equals(other.getIsSubscriber()))) &&
            ((this.portedType==null && other.getPortedType()==null) || 
             (this.portedType!=null &&
              this.portedType.equals(other.getPortedType()))) &&
            ((this.lnpTransitionFlag==null && other.getLnpTransitionFlag()==null) || 
             (this.lnpTransitionFlag!=null &&
              this.lnpTransitionFlag.equals(other.getLnpTransitionFlag()))) &&
            ((this.homeGateway==null && other.getHomeGateway()==null) || 
             (this.homeGateway!=null &&
              this.homeGateway.equals(other.getHomeGateway()))) &&
            ((this.exceptionProfileId==null && other.getExceptionProfileId()==null) || 
             (this.exceptionProfileId!=null &&
              this.exceptionProfileId.equals(other.getExceptionProfileId()))) &&
            ((this.businessGroupId==null && other.getBusinessGroupId()==null) || 
             (this.businessGroupId!=null &&
              this.businessGroupId.equals(other.getBusinessGroupId()))) &&
            ((this.businessUnitId==null && other.getBusinessUnitId()==null) || 
             (this.businessUnitId!=null &&
              this.businessUnitId.equals(other.getBusinessUnitId()))) &&
            ((this.callParamFilterProfileId==null && other.getCallParamFilterProfileId()==null) || 
             (this.callParamFilterProfileId!=null &&
              this.callParamFilterProfileId.equals(other.getCallParamFilterProfileId())));
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
        if (getNationalId() != null) {
            _hashCode += getNationalId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getDestSvcScriptId() != null) {
            _hashCode += getDestSvcScriptId().hashCode();
        }
        if (getCustomScriptId() != null) {
            _hashCode += getCustomScriptId().hashCode();
        }
        if (getElementAttributes() != null) {
            _hashCode += getElementAttributes().hashCode();
        }
        if (getPrfdPacketServiceProfileId() != null) {
            _hashCode += getPrfdPacketServiceProfileId().hashCode();
        }
        if (getRoutingLabelId() != null) {
            _hashCode += getRoutingLabelId().hashCode();
        }
        if (getIsSubscriber() != null) {
            _hashCode += getIsSubscriber().hashCode();
        }
        if (getPortedType() != null) {
            _hashCode += getPortedType().hashCode();
        }
        if (getLnpTransitionFlag() != null) {
            _hashCode += getLnpTransitionFlag().hashCode();
        }
        if (getHomeGateway() != null) {
            _hashCode += getHomeGateway().hashCode();
        }
        if (getExceptionProfileId() != null) {
            _hashCode += getExceptionProfileId().hashCode();
        }
        if (getBusinessGroupId() != null) {
            _hashCode += getBusinessGroupId().hashCode();
        }
        if (getBusinessUnitId() != null) {
            _hashCode += getBusinessUnitId().hashCode();
        }
        if (getCallParamFilterProfileId() != null) {
            _hashCode += getCallParamFilterProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Destination.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Destination"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destSvcScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destSvcScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customScriptId"));
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
        elemField.setFieldName("prfdPacketServiceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prfdPacketServiceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSubscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isSubscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portedType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portedType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lnpTransitionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lnpTransitionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeGateway");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeGateway"));
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
        elemField.setFieldName("businessGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParamFilterProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterProfileId"));
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
