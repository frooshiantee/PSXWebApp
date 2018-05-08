/**
 * RouteSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class RouteSet  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String rangeProfileId;
    private java.lang.Integer subrangeNumber;
    private java.lang.String fromNumber;
    private java.lang.String toNumber;
    private java.lang.Short routesExist;
    private java.lang.String routeSetName;
    private java.lang.String callProcessingElement1Id;
    private java.lang.String callProcessingElement2Id;
    private java.lang.String callProcessingElement3Id;
    private java.lang.String callProcessingElement4Id;
    private java.lang.Short callProcessingElementType;
    private java.lang.Short routingType;
    private java.lang.String destinationCountryId;
    private java.lang.String partitionId;
    private java.lang.Integer callType;
    private java.lang.String routingLabelId;
    private java.lang.Long transmissionMedium;
    private java.lang.Integer userCallType;
    private java.lang.Integer digitType;
    private java.lang.String timeRangeProfileId;
    private java.lang.String callParamFilterProfileId;
    private java.lang.String domainName;
    private java.lang.String callParamFilterGroupId;

    public RouteSet() {
    }

    public RouteSet(
           java.lang.String rangeProfileId,
           java.lang.Integer subrangeNumber,
           java.lang.String fromNumber,
           java.lang.String toNumber,
           java.lang.Short routesExist,
           java.lang.String routeSetName,
           java.lang.String callProcessingElement1Id,
           java.lang.String callProcessingElement2Id,
           java.lang.String callProcessingElement3Id,
           java.lang.String callProcessingElement4Id,
           java.lang.Short callProcessingElementType,
           java.lang.Short routingType,
           java.lang.String destinationCountryId,
           java.lang.String partitionId,
           java.lang.Integer callType,
           java.lang.String routingLabelId,
           java.lang.Long transmissionMedium,
           java.lang.Integer userCallType,
           java.lang.Integer digitType,
           java.lang.String timeRangeProfileId,
           java.lang.String callParamFilterProfileId,
           java.lang.String domainName,
           java.lang.String callParamFilterGroupId) {
           this.rangeProfileId = rangeProfileId;
           this.subrangeNumber = subrangeNumber;
           this.fromNumber = fromNumber;
           this.toNumber = toNumber;
           this.routesExist = routesExist;
           this.routeSetName = routeSetName;
           this.callProcessingElement1Id = callProcessingElement1Id;
           this.callProcessingElement2Id = callProcessingElement2Id;
           this.callProcessingElement3Id = callProcessingElement3Id;
           this.callProcessingElement4Id = callProcessingElement4Id;
           this.callProcessingElementType = callProcessingElementType;
           this.routingType = routingType;
           this.destinationCountryId = destinationCountryId;
           this.partitionId = partitionId;
           this.callType = callType;
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
     * Gets the rangeProfileId value for this RouteSet.
     * 
     * @return rangeProfileId
     */
    public java.lang.String getRangeProfileId() {
        return rangeProfileId;
    }


    /**
     * Sets the rangeProfileId value for this RouteSet.
     * 
     * @param rangeProfileId
     */
    public void setRangeProfileId(java.lang.String rangeProfileId) {
        this.rangeProfileId = rangeProfileId;
    }


    /**
     * Gets the subrangeNumber value for this RouteSet.
     * 
     * @return subrangeNumber
     */
    public java.lang.Integer getSubrangeNumber() {
        return subrangeNumber;
    }


    /**
     * Sets the subrangeNumber value for this RouteSet.
     * 
     * @param subrangeNumber
     */
    public void setSubrangeNumber(java.lang.Integer subrangeNumber) {
        this.subrangeNumber = subrangeNumber;
    }


    /**
     * Gets the fromNumber value for this RouteSet.
     * 
     * @return fromNumber
     */
    public java.lang.String getFromNumber() {
        return fromNumber;
    }


    /**
     * Sets the fromNumber value for this RouteSet.
     * 
     * @param fromNumber
     */
    public void setFromNumber(java.lang.String fromNumber) {
        this.fromNumber = fromNumber;
    }


    /**
     * Gets the toNumber value for this RouteSet.
     * 
     * @return toNumber
     */
    public java.lang.String getToNumber() {
        return toNumber;
    }


    /**
     * Sets the toNumber value for this RouteSet.
     * 
     * @param toNumber
     */
    public void setToNumber(java.lang.String toNumber) {
        this.toNumber = toNumber;
    }


    /**
     * Gets the routesExist value for this RouteSet.
     * 
     * @return routesExist
     */
    public java.lang.Short getRoutesExist() {
        return routesExist;
    }


    /**
     * Sets the routesExist value for this RouteSet.
     * 
     * @param routesExist
     */
    public void setRoutesExist(java.lang.Short routesExist) {
        this.routesExist = routesExist;
    }


    /**
     * Gets the routeSetName value for this RouteSet.
     * 
     * @return routeSetName
     */
    public java.lang.String getRouteSetName() {
        return routeSetName;
    }


    /**
     * Sets the routeSetName value for this RouteSet.
     * 
     * @param routeSetName
     */
    public void setRouteSetName(java.lang.String routeSetName) {
        this.routeSetName = routeSetName;
    }


    /**
     * Gets the callProcessingElement1Id value for this RouteSet.
     * 
     * @return callProcessingElement1Id
     */
    public java.lang.String getCallProcessingElement1Id() {
        return callProcessingElement1Id;
    }


    /**
     * Sets the callProcessingElement1Id value for this RouteSet.
     * 
     * @param callProcessingElement1Id
     */
    public void setCallProcessingElement1Id(java.lang.String callProcessingElement1Id) {
        this.callProcessingElement1Id = callProcessingElement1Id;
    }


    /**
     * Gets the callProcessingElement2Id value for this RouteSet.
     * 
     * @return callProcessingElement2Id
     */
    public java.lang.String getCallProcessingElement2Id() {
        return callProcessingElement2Id;
    }


    /**
     * Sets the callProcessingElement2Id value for this RouteSet.
     * 
     * @param callProcessingElement2Id
     */
    public void setCallProcessingElement2Id(java.lang.String callProcessingElement2Id) {
        this.callProcessingElement2Id = callProcessingElement2Id;
    }


    /**
     * Gets the callProcessingElement3Id value for this RouteSet.
     * 
     * @return callProcessingElement3Id
     */
    public java.lang.String getCallProcessingElement3Id() {
        return callProcessingElement3Id;
    }


    /**
     * Sets the callProcessingElement3Id value for this RouteSet.
     * 
     * @param callProcessingElement3Id
     */
    public void setCallProcessingElement3Id(java.lang.String callProcessingElement3Id) {
        this.callProcessingElement3Id = callProcessingElement3Id;
    }


    /**
     * Gets the callProcessingElement4Id value for this RouteSet.
     * 
     * @return callProcessingElement4Id
     */
    public java.lang.String getCallProcessingElement4Id() {
        return callProcessingElement4Id;
    }


    /**
     * Sets the callProcessingElement4Id value for this RouteSet.
     * 
     * @param callProcessingElement4Id
     */
    public void setCallProcessingElement4Id(java.lang.String callProcessingElement4Id) {
        this.callProcessingElement4Id = callProcessingElement4Id;
    }


    /**
     * Gets the callProcessingElementType value for this RouteSet.
     * 
     * @return callProcessingElementType
     */
    public java.lang.Short getCallProcessingElementType() {
        return callProcessingElementType;
    }


    /**
     * Sets the callProcessingElementType value for this RouteSet.
     * 
     * @param callProcessingElementType
     */
    public void setCallProcessingElementType(java.lang.Short callProcessingElementType) {
        this.callProcessingElementType = callProcessingElementType;
    }


    /**
     * Gets the routingType value for this RouteSet.
     * 
     * @return routingType
     */
    public java.lang.Short getRoutingType() {
        return routingType;
    }


    /**
     * Sets the routingType value for this RouteSet.
     * 
     * @param routingType
     */
    public void setRoutingType(java.lang.Short routingType) {
        this.routingType = routingType;
    }


    /**
     * Gets the destinationCountryId value for this RouteSet.
     * 
     * @return destinationCountryId
     */
    public java.lang.String getDestinationCountryId() {
        return destinationCountryId;
    }


    /**
     * Sets the destinationCountryId value for this RouteSet.
     * 
     * @param destinationCountryId
     */
    public void setDestinationCountryId(java.lang.String destinationCountryId) {
        this.destinationCountryId = destinationCountryId;
    }


    /**
     * Gets the partitionId value for this RouteSet.
     * 
     * @return partitionId
     */
    public java.lang.String getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this RouteSet.
     * 
     * @param partitionId
     */
    public void setPartitionId(java.lang.String partitionId) {
        this.partitionId = partitionId;
    }


    /**
     * Gets the callType value for this RouteSet.
     * 
     * @return callType
     */
    public java.lang.Integer getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this RouteSet.
     * 
     * @param callType
     */
    public void setCallType(java.lang.Integer callType) {
        this.callType = callType;
    }


    /**
     * Gets the routingLabelId value for this RouteSet.
     * 
     * @return routingLabelId
     */
    public java.lang.String getRoutingLabelId() {
        return routingLabelId;
    }


    /**
     * Sets the routingLabelId value for this RouteSet.
     * 
     * @param routingLabelId
     */
    public void setRoutingLabelId(java.lang.String routingLabelId) {
        this.routingLabelId = routingLabelId;
    }


    /**
     * Gets the transmissionMedium value for this RouteSet.
     * 
     * @return transmissionMedium
     */
    public java.lang.Long getTransmissionMedium() {
        return transmissionMedium;
    }


    /**
     * Sets the transmissionMedium value for this RouteSet.
     * 
     * @param transmissionMedium
     */
    public void setTransmissionMedium(java.lang.Long transmissionMedium) {
        this.transmissionMedium = transmissionMedium;
    }


    /**
     * Gets the userCallType value for this RouteSet.
     * 
     * @return userCallType
     */
    public java.lang.Integer getUserCallType() {
        return userCallType;
    }


    /**
     * Sets the userCallType value for this RouteSet.
     * 
     * @param userCallType
     */
    public void setUserCallType(java.lang.Integer userCallType) {
        this.userCallType = userCallType;
    }


    /**
     * Gets the digitType value for this RouteSet.
     * 
     * @return digitType
     */
    public java.lang.Integer getDigitType() {
        return digitType;
    }


    /**
     * Sets the digitType value for this RouteSet.
     * 
     * @param digitType
     */
    public void setDigitType(java.lang.Integer digitType) {
        this.digitType = digitType;
    }


    /**
     * Gets the timeRangeProfileId value for this RouteSet.
     * 
     * @return timeRangeProfileId
     */
    public java.lang.String getTimeRangeProfileId() {
        return timeRangeProfileId;
    }


    /**
     * Sets the timeRangeProfileId value for this RouteSet.
     * 
     * @param timeRangeProfileId
     */
    public void setTimeRangeProfileId(java.lang.String timeRangeProfileId) {
        this.timeRangeProfileId = timeRangeProfileId;
    }


    /**
     * Gets the callParamFilterProfileId value for this RouteSet.
     * 
     * @return callParamFilterProfileId
     */
    public java.lang.String getCallParamFilterProfileId() {
        return callParamFilterProfileId;
    }


    /**
     * Sets the callParamFilterProfileId value for this RouteSet.
     * 
     * @param callParamFilterProfileId
     */
    public void setCallParamFilterProfileId(java.lang.String callParamFilterProfileId) {
        this.callParamFilterProfileId = callParamFilterProfileId;
    }


    /**
     * Gets the domainName value for this RouteSet.
     * 
     * @return domainName
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this RouteSet.
     * 
     * @param domainName
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the callParamFilterGroupId value for this RouteSet.
     * 
     * @return callParamFilterGroupId
     */
    public java.lang.String getCallParamFilterGroupId() {
        return callParamFilterGroupId;
    }


    /**
     * Sets the callParamFilterGroupId value for this RouteSet.
     * 
     * @param callParamFilterGroupId
     */
    public void setCallParamFilterGroupId(java.lang.String callParamFilterGroupId) {
        this.callParamFilterGroupId = callParamFilterGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteSet)) return false;
        RouteSet other = (RouteSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rangeProfileId==null && other.getRangeProfileId()==null) || 
             (this.rangeProfileId!=null &&
              this.rangeProfileId.equals(other.getRangeProfileId()))) &&
            ((this.subrangeNumber==null && other.getSubrangeNumber()==null) || 
             (this.subrangeNumber!=null &&
              this.subrangeNumber.equals(other.getSubrangeNumber()))) &&
            ((this.fromNumber==null && other.getFromNumber()==null) || 
             (this.fromNumber!=null &&
              this.fromNumber.equals(other.getFromNumber()))) &&
            ((this.toNumber==null && other.getToNumber()==null) || 
             (this.toNumber!=null &&
              this.toNumber.equals(other.getToNumber()))) &&
            ((this.routesExist==null && other.getRoutesExist()==null) || 
             (this.routesExist!=null &&
              this.routesExist.equals(other.getRoutesExist()))) &&
            ((this.routeSetName==null && other.getRouteSetName()==null) || 
             (this.routeSetName!=null &&
              this.routeSetName.equals(other.getRouteSetName()))) &&
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
            ((this.destinationCountryId==null && other.getDestinationCountryId()==null) || 
             (this.destinationCountryId!=null &&
              this.destinationCountryId.equals(other.getDestinationCountryId()))) &&
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId()))) &&
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
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
        if (getRangeProfileId() != null) {
            _hashCode += getRangeProfileId().hashCode();
        }
        if (getSubrangeNumber() != null) {
            _hashCode += getSubrangeNumber().hashCode();
        }
        if (getFromNumber() != null) {
            _hashCode += getFromNumber().hashCode();
        }
        if (getToNumber() != null) {
            _hashCode += getToNumber().hashCode();
        }
        if (getRoutesExist() != null) {
            _hashCode += getRoutesExist().hashCode();
        }
        if (getRouteSetName() != null) {
            _hashCode += getRouteSetName().hashCode();
        }
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
        if (getDestinationCountryId() != null) {
            _hashCode += getDestinationCountryId().hashCode();
        }
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
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
        new org.apache.axis.description.TypeDesc(RouteSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subrangeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subrangeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routesExist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routesExist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeSetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routeSetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callType"));
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
