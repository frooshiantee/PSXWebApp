/**
 * Route.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class Route  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String callProcessingElement1Id;
    private java.lang.String callProcessingElement2Id;
    private java.lang.String callProcessingElement3Id;
    private java.lang.String callProcessingElement4Id;
    private java.lang.Short callProcessingElementType;
    private java.lang.Short routingType;
    private java.lang.String destinationNationalId;
    private java.lang.String destinationCountryId;
    private java.lang.String partitionId;
    private java.lang.Integer calltype;
    private java.lang.String routingLabelId;
    private java.lang.Long transmissionMedium;
    private java.lang.Integer userCallType;
    private java.lang.Integer digitType;
    private java.lang.String timeRangeProfileId;
    private java.lang.String callParamFilterProfileId;
    private java.lang.String domainName;
    private java.lang.String callParamFilterGroupId;

    public Route() {
    }

    public Route(
           java.lang.String callProcessingElement1Id,
           java.lang.String callProcessingElement2Id,
           java.lang.String callProcessingElement3Id,
           java.lang.String callProcessingElement4Id,
           java.lang.Short callProcessingElementType,
           java.lang.Short routingType,
           java.lang.String destinationNationalId,
           java.lang.String destinationCountryId,
           java.lang.String partitionId,
           java.lang.Integer calltype,
           java.lang.String routingLabelId,
           java.lang.Long transmissionMedium,
           java.lang.Integer userCallType,
           java.lang.Integer digitType,
           java.lang.String timeRangeProfileId,
           java.lang.String callParamFilterProfileId,
           java.lang.String domainName,
           java.lang.String callParamFilterGroupId) {
           this.callProcessingElement1Id = callProcessingElement1Id;
           this.callProcessingElement2Id = callProcessingElement2Id;
           this.callProcessingElement3Id = callProcessingElement3Id;
           this.callProcessingElement4Id = callProcessingElement4Id;
           this.callProcessingElementType = callProcessingElementType;
           this.routingType = routingType;
           this.destinationNationalId = destinationNationalId;
           this.destinationCountryId = destinationCountryId;
           this.partitionId = partitionId;
           this.calltype = calltype;
           this.routingLabelId = routingLabelId;
           this.transmissionMedium = transmissionMedium;
           this.userCallType = userCallType;
           this.digitType = digitType;
           this.timeRangeProfileId = timeRangeProfileId;
           this.callParamFilterProfileId = callParamFilterProfileId;
           this.domainName = domainName;
           this.callParamFilterGroupId = callParamFilterGroupId;
    }


    /**
     * Gets the callProcessingElement1Id value for this Route.
     * 
     * @return callProcessingElement1Id
     */
    public java.lang.String getCallProcessingElement1Id() {
        return callProcessingElement1Id;
    }


    /**
     * Sets the callProcessingElement1Id value for this Route.
     * 
     * @param callProcessingElement1Id
     */
    public void setCallProcessingElement1Id(java.lang.String callProcessingElement1Id) {
        this.callProcessingElement1Id = callProcessingElement1Id;
    }


    /**
     * Gets the callProcessingElement2Id value for this Route.
     * 
     * @return callProcessingElement2Id
     */
    public java.lang.String getCallProcessingElement2Id() {
        return callProcessingElement2Id;
    }


    /**
     * Sets the callProcessingElement2Id value for this Route.
     * 
     * @param callProcessingElement2Id
     */
    public void setCallProcessingElement2Id(java.lang.String callProcessingElement2Id) {
        this.callProcessingElement2Id = callProcessingElement2Id;
    }


    /**
     * Gets the callProcessingElement3Id value for this Route.
     * 
     * @return callProcessingElement3Id
     */
    public java.lang.String getCallProcessingElement3Id() {
        return callProcessingElement3Id;
    }


    /**
     * Sets the callProcessingElement3Id value for this Route.
     * 
     * @param callProcessingElement3Id
     */
    public void setCallProcessingElement3Id(java.lang.String callProcessingElement3Id) {
        this.callProcessingElement3Id = callProcessingElement3Id;
    }


    /**
     * Gets the callProcessingElement4Id value for this Route.
     * 
     * @return callProcessingElement4Id
     */
    public java.lang.String getCallProcessingElement4Id() {
        return callProcessingElement4Id;
    }


    /**
     * Sets the callProcessingElement4Id value for this Route.
     * 
     * @param callProcessingElement4Id
     */
    public void setCallProcessingElement4Id(java.lang.String callProcessingElement4Id) {
        this.callProcessingElement4Id = callProcessingElement4Id;
    }


    /**
     * Gets the callProcessingElementType value for this Route.
     * 
     * @return callProcessingElementType
     */
    public java.lang.Short getCallProcessingElementType() {
        return callProcessingElementType;
    }


    /**
     * Sets the callProcessingElementType value for this Route.
     * 
     * @param callProcessingElementType
     */
    public void setCallProcessingElementType(java.lang.Short callProcessingElementType) {
        this.callProcessingElementType = callProcessingElementType;
    }


    /**
     * Gets the routingType value for this Route.
     * 
     * @return routingType
     */
    public java.lang.Short getRoutingType() {
        return routingType;
    }


    /**
     * Sets the routingType value for this Route.
     * 
     * @param routingType
     */
    public void setRoutingType(java.lang.Short routingType) {
        this.routingType = routingType;
    }


    /**
     * Gets the destinationNationalId value for this Route.
     * 
     * @return destinationNationalId
     */
    public java.lang.String getDestinationNationalId() {
        return destinationNationalId;
    }


    /**
     * Sets the destinationNationalId value for this Route.
     * 
     * @param destinationNationalId
     */
    public void setDestinationNationalId(java.lang.String destinationNationalId) {
        this.destinationNationalId = destinationNationalId;
    }


    /**
     * Gets the destinationCountryId value for this Route.
     * 
     * @return destinationCountryId
     */
    public java.lang.String getDestinationCountryId() {
        return destinationCountryId;
    }


    /**
     * Sets the destinationCountryId value for this Route.
     * 
     * @param destinationCountryId
     */
    public void setDestinationCountryId(java.lang.String destinationCountryId) {
        this.destinationCountryId = destinationCountryId;
    }


    /**
     * Gets the partitionId value for this Route.
     * 
     * @return partitionId
     */
    public java.lang.String getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this Route.
     * 
     * @param partitionId
     */
    public void setPartitionId(java.lang.String partitionId) {
        this.partitionId = partitionId;
    }


    /**
     * Gets the calltype value for this Route.
     * 
     * @return calltype
     */
    public java.lang.Integer getCalltype() {
        return calltype;
    }


    /**
     * Sets the calltype value for this Route.
     * 
     * @param calltype
     */
    public void setCalltype(java.lang.Integer calltype) {
        this.calltype = calltype;
    }


    /**
     * Gets the routingLabelId value for this Route.
     * 
     * @return routingLabelId
     */
    public java.lang.String getRoutingLabelId() {
        return routingLabelId;
    }


    /**
     * Sets the routingLabelId value for this Route.
     * 
     * @param routingLabelId
     */
    public void setRoutingLabelId(java.lang.String routingLabelId) {
        this.routingLabelId = routingLabelId;
    }


    /**
     * Gets the transmissionMedium value for this Route.
     * 
     * @return transmissionMedium
     */
    public java.lang.Long getTransmissionMedium() {
        return transmissionMedium;
    }


    /**
     * Sets the transmissionMedium value for this Route.
     * 
     * @param transmissionMedium
     */
    public void setTransmissionMedium(java.lang.Long transmissionMedium) {
        this.transmissionMedium = transmissionMedium;
    }


    /**
     * Gets the userCallType value for this Route.
     * 
     * @return userCallType
     */
    public java.lang.Integer getUserCallType() {
        return userCallType;
    }


    /**
     * Sets the userCallType value for this Route.
     * 
     * @param userCallType
     */
    public void setUserCallType(java.lang.Integer userCallType) {
        this.userCallType = userCallType;
    }


    /**
     * Gets the digitType value for this Route.
     * 
     * @return digitType
     */
    public java.lang.Integer getDigitType() {
        return digitType;
    }


    /**
     * Sets the digitType value for this Route.
     * 
     * @param digitType
     */
    public void setDigitType(java.lang.Integer digitType) {
        this.digitType = digitType;
    }


    /**
     * Gets the timeRangeProfileId value for this Route.
     * 
     * @return timeRangeProfileId
     */
    public java.lang.String getTimeRangeProfileId() {
        return timeRangeProfileId;
    }


    /**
     * Sets the timeRangeProfileId value for this Route.
     * 
     * @param timeRangeProfileId
     */
    public void setTimeRangeProfileId(java.lang.String timeRangeProfileId) {
        this.timeRangeProfileId = timeRangeProfileId;
    }


    /**
     * Gets the callParamFilterProfileId value for this Route.
     * 
     * @return callParamFilterProfileId
     */
    public java.lang.String getCallParamFilterProfileId() {
        return callParamFilterProfileId;
    }


    /**
     * Sets the callParamFilterProfileId value for this Route.
     * 
     * @param callParamFilterProfileId
     */
    public void setCallParamFilterProfileId(java.lang.String callParamFilterProfileId) {
        this.callParamFilterProfileId = callParamFilterProfileId;
    }


    /**
     * Gets the domainName value for this Route.
     * 
     * @return domainName
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this Route.
     * 
     * @param domainName
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the callParamFilterGroupId value for this Route.
     * 
     * @return callParamFilterGroupId
     */
    public java.lang.String getCallParamFilterGroupId() {
        return callParamFilterGroupId;
    }


    /**
     * Sets the callParamFilterGroupId value for this Route.
     * 
     * @param callParamFilterGroupId
     */
    public void setCallParamFilterGroupId(java.lang.String callParamFilterGroupId) {
        this.callParamFilterGroupId = callParamFilterGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Route)) return false;
        Route other = (Route) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callProcessingElement1Id==null && other.getCallProcessingElement1Id()==null) || 
             (this.callProcessingElement1Id!=null &&
              this.callProcessingElement1Id.equals(other.getCallProcessingElement1Id()))) &&
            ((this.callProcessingElement2Id==null && other.getCallProcessingElement2Id()==null) || 
             (this.callProcessingElement2Id!=null &&
              this.callProcessingElement2Id.equals(other.getCallProcessingElement2Id()))) &&
            ((this.callProcessingElement3Id==null && other.getCallProcessingElement3Id()==null) || 
             (this.callProcessingElement3Id!=null &&
              this.callProcessingElement3Id.equals(other.getCallProcessingElement3Id()))) &&
            ((this.callProcessingElement4Id==null && other.getCallProcessingElement4Id()==null) || 
             (this.callProcessingElement4Id!=null &&
              this.callProcessingElement4Id.equals(other.getCallProcessingElement4Id()))) &&
            ((this.callProcessingElementType==null && other.getCallProcessingElementType()==null) || 
             (this.callProcessingElementType!=null &&
              this.callProcessingElementType.equals(other.getCallProcessingElementType()))) &&
            ((this.routingType==null && other.getRoutingType()==null) || 
             (this.routingType!=null &&
              this.routingType.equals(other.getRoutingType()))) &&
            ((this.destinationNationalId==null && other.getDestinationNationalId()==null) || 
             (this.destinationNationalId!=null &&
              this.destinationNationalId.equals(other.getDestinationNationalId()))) &&
            ((this.destinationCountryId==null && other.getDestinationCountryId()==null) || 
             (this.destinationCountryId!=null &&
              this.destinationCountryId.equals(other.getDestinationCountryId()))) &&
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId()))) &&
            ((this.calltype==null && other.getCalltype()==null) || 
             (this.calltype!=null &&
              this.calltype.equals(other.getCalltype()))) &&
            ((this.routingLabelId==null && other.getRoutingLabelId()==null) || 
             (this.routingLabelId!=null &&
              this.routingLabelId.equals(other.getRoutingLabelId()))) &&
            ((this.transmissionMedium==null && other.getTransmissionMedium()==null) || 
             (this.transmissionMedium!=null &&
              this.transmissionMedium.equals(other.getTransmissionMedium()))) &&
            ((this.userCallType==null && other.getUserCallType()==null) || 
             (this.userCallType!=null &&
              this.userCallType.equals(other.getUserCallType()))) &&
            ((this.digitType==null && other.getDigitType()==null) || 
             (this.digitType!=null &&
              this.digitType.equals(other.getDigitType()))) &&
            ((this.timeRangeProfileId==null && other.getTimeRangeProfileId()==null) || 
             (this.timeRangeProfileId!=null &&
              this.timeRangeProfileId.equals(other.getTimeRangeProfileId()))) &&
            ((this.callParamFilterProfileId==null && other.getCallParamFilterProfileId()==null) || 
             (this.callParamFilterProfileId!=null &&
              this.callParamFilterProfileId.equals(other.getCallParamFilterProfileId()))) &&
            ((this.domainName==null && other.getDomainName()==null) || 
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
            ((this.callParamFilterGroupId==null && other.getCallParamFilterGroupId()==null) || 
             (this.callParamFilterGroupId!=null &&
              this.callParamFilterGroupId.equals(other.getCallParamFilterGroupId())));
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
        if (getCallProcessingElement1Id() != null) {
            _hashCode += getCallProcessingElement1Id().hashCode();
        }
        if (getCallProcessingElement2Id() != null) {
            _hashCode += getCallProcessingElement2Id().hashCode();
        }
        if (getCallProcessingElement3Id() != null) {
            _hashCode += getCallProcessingElement3Id().hashCode();
        }
        if (getCallProcessingElement4Id() != null) {
            _hashCode += getCallProcessingElement4Id().hashCode();
        }
        if (getCallProcessingElementType() != null) {
            _hashCode += getCallProcessingElementType().hashCode();
        }
        if (getRoutingType() != null) {
            _hashCode += getRoutingType().hashCode();
        }
        if (getDestinationNationalId() != null) {
            _hashCode += getDestinationNationalId().hashCode();
        }
        if (getDestinationCountryId() != null) {
            _hashCode += getDestinationCountryId().hashCode();
        }
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        if (getCalltype() != null) {
            _hashCode += getCalltype().hashCode();
        }
        if (getRoutingLabelId() != null) {
            _hashCode += getRoutingLabelId().hashCode();
        }
        if (getTransmissionMedium() != null) {
            _hashCode += getTransmissionMedium().hashCode();
        }
        if (getUserCallType() != null) {
            _hashCode += getUserCallType().hashCode();
        }
        if (getDigitType() != null) {
            _hashCode += getDigitType().hashCode();
        }
        if (getTimeRangeProfileId() != null) {
            _hashCode += getTimeRangeProfileId().hashCode();
        }
        if (getCallParamFilterProfileId() != null) {
            _hashCode += getCallParamFilterProfileId().hashCode();
        }
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        if (getCallParamFilterGroupId() != null) {
            _hashCode += getCallParamFilterGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Route.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Route"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElement1Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElement1Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElement2Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElement2Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElement3Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElement3Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElement4Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElement4Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callProcessingElementType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callProcessingElementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationNationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationNationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationCountryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationCountryId"));
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
        elemField.setFieldName("calltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transmissionMedium");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transmissionMedium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCallType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCallType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRangeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeRangeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParamFilterProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParamFilterGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterGroupId"));
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
