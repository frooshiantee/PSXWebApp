/**
 * RoutingLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class RoutingLabel  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String routingLabelId;
    private java.lang.String overflowNumber;
    private java.lang.Short overflowNoa;
    private java.lang.Short overflowNpi;
    private java.lang.Short routePrioritizationType;
    private java.lang.String scriptId;
    private java.lang.Short action;
    private java.lang.Integer rlUseTarRoutes;
    private java.lang.String rlCpcScreeningId;
    private java.lang.Short numberOfRoutesRequested;
    private java.lang.String pmRuleId;
    private java.lang.Short applyLaterPmRulesFlag;
    private java.lang.Short tarRoutePrioritizationType;
    private java.lang.String partitionId;
    private java.lang.Integer routingCriteria;
    private java.lang.Integer numberOfRoutesPerCall;
    private java.lang.Integer attributes;
    private java.lang.String callParamFilterGroupId;
    private java.lang.String callParamFilterProfileScript;

    public RoutingLabel() {
    }

    public RoutingLabel(
           java.lang.String routingLabelId,
           java.lang.String overflowNumber,
           java.lang.Short overflowNoa,
           java.lang.Short overflowNpi,
           java.lang.Short routePrioritizationType,
           java.lang.String scriptId,
           java.lang.Short action,
           java.lang.Integer rlUseTarRoutes,
           java.lang.String rlCpcScreeningId,
           java.lang.Short numberOfRoutesRequested,
           java.lang.String pmRuleId,
           java.lang.Short applyLaterPmRulesFlag,
           java.lang.Short tarRoutePrioritizationType,
           java.lang.String partitionId,
           java.lang.Integer routingCriteria,
           java.lang.Integer numberOfRoutesPerCall,
           java.lang.Integer attributes,
           java.lang.String callParamFilterGroupId,
           java.lang.String callParamFilterProfileScript) {
           this.routingLabelId = routingLabelId;
           this.overflowNumber = overflowNumber;
           this.overflowNoa = overflowNoa;
           this.overflowNpi = overflowNpi;
           this.routePrioritizationType = routePrioritizationType;
           this.scriptId = scriptId;
           this.action = action;
           this.rlUseTarRoutes = rlUseTarRoutes;
           this.rlCpcScreeningId = rlCpcScreeningId;
           this.numberOfRoutesRequested = numberOfRoutesRequested;
           this.pmRuleId = pmRuleId;
           this.applyLaterPmRulesFlag = applyLaterPmRulesFlag;
           this.tarRoutePrioritizationType = tarRoutePrioritizationType;
           this.partitionId = partitionId;
           this.routingCriteria = routingCriteria;
           this.numberOfRoutesPerCall = numberOfRoutesPerCall;
           this.attributes = attributes;
           this.callParamFilterGroupId = callParamFilterGroupId;
           this.callParamFilterProfileScript = callParamFilterProfileScript;
    }


    /**
     * Gets the routingLabelId value for this RoutingLabel.
     * 
     * @return routingLabelId
     */
    public java.lang.String getRoutingLabelId() {
        return routingLabelId;
    }


    /**
     * Sets the routingLabelId value for this RoutingLabel.
     * 
     * @param routingLabelId
     */
    public void setRoutingLabelId(java.lang.String routingLabelId) {
        this.routingLabelId = routingLabelId;
    }


    /**
     * Gets the overflowNumber value for this RoutingLabel.
     * 
     * @return overflowNumber
     */
    public java.lang.String getOverflowNumber() {
        return overflowNumber;
    }


    /**
     * Sets the overflowNumber value for this RoutingLabel.
     * 
     * @param overflowNumber
     */
    public void setOverflowNumber(java.lang.String overflowNumber) {
        this.overflowNumber = overflowNumber;
    }


    /**
     * Gets the overflowNoa value for this RoutingLabel.
     * 
     * @return overflowNoa
     */
    public java.lang.Short getOverflowNoa() {
        return overflowNoa;
    }


    /**
     * Sets the overflowNoa value for this RoutingLabel.
     * 
     * @param overflowNoa
     */
    public void setOverflowNoa(java.lang.Short overflowNoa) {
        this.overflowNoa = overflowNoa;
    }


    /**
     * Gets the overflowNpi value for this RoutingLabel.
     * 
     * @return overflowNpi
     */
    public java.lang.Short getOverflowNpi() {
        return overflowNpi;
    }


    /**
     * Sets the overflowNpi value for this RoutingLabel.
     * 
     * @param overflowNpi
     */
    public void setOverflowNpi(java.lang.Short overflowNpi) {
        this.overflowNpi = overflowNpi;
    }


    /**
     * Gets the routePrioritizationType value for this RoutingLabel.
     * 
     * @return routePrioritizationType
     */
    public java.lang.Short getRoutePrioritizationType() {
        return routePrioritizationType;
    }


    /**
     * Sets the routePrioritizationType value for this RoutingLabel.
     * 
     * @param routePrioritizationType
     */
    public void setRoutePrioritizationType(java.lang.Short routePrioritizationType) {
        this.routePrioritizationType = routePrioritizationType;
    }


    /**
     * Gets the scriptId value for this RoutingLabel.
     * 
     * @return scriptId
     */
    public java.lang.String getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this RoutingLabel.
     * 
     * @param scriptId
     */
    public void setScriptId(java.lang.String scriptId) {
        this.scriptId = scriptId;
    }


    /**
     * Gets the action value for this RoutingLabel.
     * 
     * @return action
     */
    public java.lang.Short getAction() {
        return action;
    }


    /**
     * Sets the action value for this RoutingLabel.
     * 
     * @param action
     */
    public void setAction(java.lang.Short action) {
        this.action = action;
    }


    /**
     * Gets the rlUseTarRoutes value for this RoutingLabel.
     * 
     * @return rlUseTarRoutes
     */
    public java.lang.Integer getRlUseTarRoutes() {
        return rlUseTarRoutes;
    }


    /**
     * Sets the rlUseTarRoutes value for this RoutingLabel.
     * 
     * @param rlUseTarRoutes
     */
    public void setRlUseTarRoutes(java.lang.Integer rlUseTarRoutes) {
        this.rlUseTarRoutes = rlUseTarRoutes;
    }


    /**
     * Gets the rlCpcScreeningId value for this RoutingLabel.
     * 
     * @return rlCpcScreeningId
     */
    public java.lang.String getRlCpcScreeningId() {
        return rlCpcScreeningId;
    }


    /**
     * Sets the rlCpcScreeningId value for this RoutingLabel.
     * 
     * @param rlCpcScreeningId
     */
    public void setRlCpcScreeningId(java.lang.String rlCpcScreeningId) {
        this.rlCpcScreeningId = rlCpcScreeningId;
    }


    /**
     * Gets the numberOfRoutesRequested value for this RoutingLabel.
     * 
     * @return numberOfRoutesRequested
     */
    public java.lang.Short getNumberOfRoutesRequested() {
        return numberOfRoutesRequested;
    }


    /**
     * Sets the numberOfRoutesRequested value for this RoutingLabel.
     * 
     * @param numberOfRoutesRequested
     */
    public void setNumberOfRoutesRequested(java.lang.Short numberOfRoutesRequested) {
        this.numberOfRoutesRequested = numberOfRoutesRequested;
    }


    /**
     * Gets the pmRuleId value for this RoutingLabel.
     * 
     * @return pmRuleId
     */
    public java.lang.String getPmRuleId() {
        return pmRuleId;
    }


    /**
     * Sets the pmRuleId value for this RoutingLabel.
     * 
     * @param pmRuleId
     */
    public void setPmRuleId(java.lang.String pmRuleId) {
        this.pmRuleId = pmRuleId;
    }


    /**
     * Gets the applyLaterPmRulesFlag value for this RoutingLabel.
     * 
     * @return applyLaterPmRulesFlag
     */
    public java.lang.Short getApplyLaterPmRulesFlag() {
        return applyLaterPmRulesFlag;
    }


    /**
     * Sets the applyLaterPmRulesFlag value for this RoutingLabel.
     * 
     * @param applyLaterPmRulesFlag
     */
    public void setApplyLaterPmRulesFlag(java.lang.Short applyLaterPmRulesFlag) {
        this.applyLaterPmRulesFlag = applyLaterPmRulesFlag;
    }


    /**
     * Gets the tarRoutePrioritizationType value for this RoutingLabel.
     * 
     * @return tarRoutePrioritizationType
     */
    public java.lang.Short getTarRoutePrioritizationType() {
        return tarRoutePrioritizationType;
    }


    /**
     * Sets the tarRoutePrioritizationType value for this RoutingLabel.
     * 
     * @param tarRoutePrioritizationType
     */
    public void setTarRoutePrioritizationType(java.lang.Short tarRoutePrioritizationType) {
        this.tarRoutePrioritizationType = tarRoutePrioritizationType;
    }


    /**
     * Gets the partitionId value for this RoutingLabel.
     * 
     * @return partitionId
     */
    public java.lang.String getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this RoutingLabel.
     * 
     * @param partitionId
     */
    public void setPartitionId(java.lang.String partitionId) {
        this.partitionId = partitionId;
    }


    /**
     * Gets the routingCriteria value for this RoutingLabel.
     * 
     * @return routingCriteria
     */
    public java.lang.Integer getRoutingCriteria() {
        return routingCriteria;
    }


    /**
     * Sets the routingCriteria value for this RoutingLabel.
     * 
     * @param routingCriteria
     */
    public void setRoutingCriteria(java.lang.Integer routingCriteria) {
        this.routingCriteria = routingCriteria;
    }


    /**
     * Gets the numberOfRoutesPerCall value for this RoutingLabel.
     * 
     * @return numberOfRoutesPerCall
     */
    public java.lang.Integer getNumberOfRoutesPerCall() {
        return numberOfRoutesPerCall;
    }


    /**
     * Sets the numberOfRoutesPerCall value for this RoutingLabel.
     * 
     * @param numberOfRoutesPerCall
     */
    public void setNumberOfRoutesPerCall(java.lang.Integer numberOfRoutesPerCall) {
        this.numberOfRoutesPerCall = numberOfRoutesPerCall;
    }


    /**
     * Gets the attributes value for this RoutingLabel.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this RoutingLabel.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the callParamFilterGroupId value for this RoutingLabel.
     * 
     * @return callParamFilterGroupId
     */
    public java.lang.String getCallParamFilterGroupId() {
        return callParamFilterGroupId;
    }


    /**
     * Sets the callParamFilterGroupId value for this RoutingLabel.
     * 
     * @param callParamFilterGroupId
     */
    public void setCallParamFilterGroupId(java.lang.String callParamFilterGroupId) {
        this.callParamFilterGroupId = callParamFilterGroupId;
    }


    /**
     * Gets the callParamFilterProfileScript value for this RoutingLabel.
     * 
     * @return callParamFilterProfileScript
     */
    public java.lang.String getCallParamFilterProfileScript() {
        return callParamFilterProfileScript;
    }


    /**
     * Sets the callParamFilterProfileScript value for this RoutingLabel.
     * 
     * @param callParamFilterProfileScript
     */
    public void setCallParamFilterProfileScript(java.lang.String callParamFilterProfileScript) {
        this.callParamFilterProfileScript = callParamFilterProfileScript;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutingLabel)) return false;
        RoutingLabel other = (RoutingLabel) obj;
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
            ((this.overflowNumber==null && other.getOverflowNumber()==null) || 
             (this.overflowNumber!=null &&
              this.overflowNumber.equals(other.getOverflowNumber()))) &&
            ((this.overflowNoa==null && other.getOverflowNoa()==null) || 
             (this.overflowNoa!=null &&
              this.overflowNoa.equals(other.getOverflowNoa()))) &&
            ((this.overflowNpi==null && other.getOverflowNpi()==null) || 
             (this.overflowNpi!=null &&
              this.overflowNpi.equals(other.getOverflowNpi()))) &&
            ((this.routePrioritizationType==null && other.getRoutePrioritizationType()==null) || 
             (this.routePrioritizationType!=null &&
              this.routePrioritizationType.equals(other.getRoutePrioritizationType()))) &&
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              this.scriptId.equals(other.getScriptId()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.rlUseTarRoutes==null && other.getRlUseTarRoutes()==null) || 
             (this.rlUseTarRoutes!=null &&
              this.rlUseTarRoutes.equals(other.getRlUseTarRoutes()))) &&
            ((this.rlCpcScreeningId==null && other.getRlCpcScreeningId()==null) || 
             (this.rlCpcScreeningId!=null &&
              this.rlCpcScreeningId.equals(other.getRlCpcScreeningId()))) &&
            ((this.numberOfRoutesRequested==null && other.getNumberOfRoutesRequested()==null) || 
             (this.numberOfRoutesRequested!=null &&
              this.numberOfRoutesRequested.equals(other.getNumberOfRoutesRequested()))) &&
            ((this.pmRuleId==null && other.getPmRuleId()==null) || 
             (this.pmRuleId!=null &&
              this.pmRuleId.equals(other.getPmRuleId()))) &&
            ((this.applyLaterPmRulesFlag==null && other.getApplyLaterPmRulesFlag()==null) || 
             (this.applyLaterPmRulesFlag!=null &&
              this.applyLaterPmRulesFlag.equals(other.getApplyLaterPmRulesFlag()))) &&
            ((this.tarRoutePrioritizationType==null && other.getTarRoutePrioritizationType()==null) || 
             (this.tarRoutePrioritizationType!=null &&
              this.tarRoutePrioritizationType.equals(other.getTarRoutePrioritizationType()))) &&
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId()))) &&
            ((this.routingCriteria==null && other.getRoutingCriteria()==null) || 
             (this.routingCriteria!=null &&
              this.routingCriteria.equals(other.getRoutingCriteria()))) &&
            ((this.numberOfRoutesPerCall==null && other.getNumberOfRoutesPerCall()==null) || 
             (this.numberOfRoutesPerCall!=null &&
              this.numberOfRoutesPerCall.equals(other.getNumberOfRoutesPerCall()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.callParamFilterGroupId==null && other.getCallParamFilterGroupId()==null) || 
             (this.callParamFilterGroupId!=null &&
              this.callParamFilterGroupId.equals(other.getCallParamFilterGroupId()))) &&
            ((this.callParamFilterProfileScript==null && other.getCallParamFilterProfileScript()==null) || 
             (this.callParamFilterProfileScript!=null &&
              this.callParamFilterProfileScript.equals(other.getCallParamFilterProfileScript())));
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
        if (getOverflowNumber() != null) {
            _hashCode += getOverflowNumber().hashCode();
        }
        if (getOverflowNoa() != null) {
            _hashCode += getOverflowNoa().hashCode();
        }
        if (getOverflowNpi() != null) {
            _hashCode += getOverflowNpi().hashCode();
        }
        if (getRoutePrioritizationType() != null) {
            _hashCode += getRoutePrioritizationType().hashCode();
        }
        if (getScriptId() != null) {
            _hashCode += getScriptId().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getRlUseTarRoutes() != null) {
            _hashCode += getRlUseTarRoutes().hashCode();
        }
        if (getRlCpcScreeningId() != null) {
            _hashCode += getRlCpcScreeningId().hashCode();
        }
        if (getNumberOfRoutesRequested() != null) {
            _hashCode += getNumberOfRoutesRequested().hashCode();
        }
        if (getPmRuleId() != null) {
            _hashCode += getPmRuleId().hashCode();
        }
        if (getApplyLaterPmRulesFlag() != null) {
            _hashCode += getApplyLaterPmRulesFlag().hashCode();
        }
        if (getTarRoutePrioritizationType() != null) {
            _hashCode += getTarRoutePrioritizationType().hashCode();
        }
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        if (getRoutingCriteria() != null) {
            _hashCode += getRoutingCriteria().hashCode();
        }
        if (getNumberOfRoutesPerCall() != null) {
            _hashCode += getNumberOfRoutesPerCall().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getCallParamFilterGroupId() != null) {
            _hashCode += getCallParamFilterGroupId().hashCode();
        }
        if (getCallParamFilterProfileScript() != null) {
            _hashCode += getCallParamFilterProfileScript().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutingLabel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingLabel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overflowNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overflowNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overflowNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overflowNoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overflowNpi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overflowNpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routePrioritizationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routePrioritizationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rlUseTarRoutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rlUseTarRoutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rlCpcScreeningId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rlCpcScreeningId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfRoutesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfRoutesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyLaterPmRulesFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applyLaterPmRulesFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarRoutePrioritizationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarRoutePrioritizationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfRoutesPerCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfRoutesPerCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParamFilterGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParamFilterProfileScript");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterProfileScript"));
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
