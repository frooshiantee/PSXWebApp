/**
 * SmmAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SmmAction  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String smmActionProfileId;
    private java.lang.Short operationType;
    private java.lang.Short actionType;
    private java.lang.String regexStr;
    private java.lang.Short regexMatchInstance;
    private java.lang.Short fromType;
    private java.lang.Short globalVariableType;
    private java.lang.Short internalVariable;
    private java.lang.String headerName;
    private java.lang.String headerValue;
    private java.lang.Short headerInsertPosition;
    private java.lang.Short headerContentType;
    private java.lang.Short hdrInternalVariableId;
    private java.lang.String paramName;
    private java.lang.String paramValue;
    private java.lang.Short paramType;
    private java.lang.Short paramInternalVariableId;
    private java.lang.Short tokenType;
    private java.lang.Short tokenInternalVariableId;
    private java.lang.String tokenValue;
    private java.lang.Short varInternalVariableId;
    private java.lang.String variableValue;
    private java.lang.Short internalVariableRange;

    public SmmAction() {
    }

    public SmmAction(
           java.lang.String smmActionProfileId,
           java.lang.Short operationType,
           java.lang.Short actionType,
           java.lang.String regexStr,
           java.lang.Short regexMatchInstance,
           java.lang.Short fromType,
           java.lang.Short globalVariableType,
           java.lang.Short internalVariable,
           java.lang.String headerName,
           java.lang.String headerValue,
           java.lang.Short headerInsertPosition,
           java.lang.Short headerContentType,
           java.lang.Short hdrInternalVariableId,
           java.lang.String paramName,
           java.lang.String paramValue,
           java.lang.Short paramType,
           java.lang.Short paramInternalVariableId,
           java.lang.Short tokenType,
           java.lang.Short tokenInternalVariableId,
           java.lang.String tokenValue,
           java.lang.Short varInternalVariableId,
           java.lang.String variableValue,
           java.lang.Short internalVariableRange) {
           this.smmActionProfileId = smmActionProfileId;
           this.operationType = operationType;
           this.actionType = actionType;
           this.regexStr = regexStr;
           this.regexMatchInstance = regexMatchInstance;
           this.fromType = fromType;
           this.globalVariableType = globalVariableType;
           this.internalVariable = internalVariable;
           this.headerName = headerName;
           this.headerValue = headerValue;
           this.headerInsertPosition = headerInsertPosition;
           this.headerContentType = headerContentType;
           this.hdrInternalVariableId = hdrInternalVariableId;
           this.paramName = paramName;
           this.paramValue = paramValue;
           this.paramType = paramType;
           this.paramInternalVariableId = paramInternalVariableId;
           this.tokenType = tokenType;
           this.tokenInternalVariableId = tokenInternalVariableId;
           this.tokenValue = tokenValue;
           this.varInternalVariableId = varInternalVariableId;
           this.variableValue = variableValue;
           this.internalVariableRange = internalVariableRange;
    }


    /**
     * Gets the smmActionProfileId value for this SmmAction.
     * 
     * @return smmActionProfileId
     */
    public java.lang.String getSmmActionProfileId() {
        return smmActionProfileId;
    }


    /**
     * Sets the smmActionProfileId value for this SmmAction.
     * 
     * @param smmActionProfileId
     */
    public void setSmmActionProfileId(java.lang.String smmActionProfileId) {
        this.smmActionProfileId = smmActionProfileId;
    }


    /**
     * Gets the operationType value for this SmmAction.
     * 
     * @return operationType
     */
    public java.lang.Short getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this SmmAction.
     * 
     * @param operationType
     */
    public void setOperationType(java.lang.Short operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the actionType value for this SmmAction.
     * 
     * @return actionType
     */
    public java.lang.Short getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this SmmAction.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.Short actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the regexStr value for this SmmAction.
     * 
     * @return regexStr
     */
    public java.lang.String getRegexStr() {
        return regexStr;
    }


    /**
     * Sets the regexStr value for this SmmAction.
     * 
     * @param regexStr
     */
    public void setRegexStr(java.lang.String regexStr) {
        this.regexStr = regexStr;
    }


    /**
     * Gets the regexMatchInstance value for this SmmAction.
     * 
     * @return regexMatchInstance
     */
    public java.lang.Short getRegexMatchInstance() {
        return regexMatchInstance;
    }


    /**
     * Sets the regexMatchInstance value for this SmmAction.
     * 
     * @param regexMatchInstance
     */
    public void setRegexMatchInstance(java.lang.Short regexMatchInstance) {
        this.regexMatchInstance = regexMatchInstance;
    }


    /**
     * Gets the fromType value for this SmmAction.
     * 
     * @return fromType
     */
    public java.lang.Short getFromType() {
        return fromType;
    }


    /**
     * Sets the fromType value for this SmmAction.
     * 
     * @param fromType
     */
    public void setFromType(java.lang.Short fromType) {
        this.fromType = fromType;
    }


    /**
     * Gets the globalVariableType value for this SmmAction.
     * 
     * @return globalVariableType
     */
    public java.lang.Short getGlobalVariableType() {
        return globalVariableType;
    }


    /**
     * Sets the globalVariableType value for this SmmAction.
     * 
     * @param globalVariableType
     */
    public void setGlobalVariableType(java.lang.Short globalVariableType) {
        this.globalVariableType = globalVariableType;
    }


    /**
     * Gets the internalVariable value for this SmmAction.
     * 
     * @return internalVariable
     */
    public java.lang.Short getInternalVariable() {
        return internalVariable;
    }


    /**
     * Sets the internalVariable value for this SmmAction.
     * 
     * @param internalVariable
     */
    public void setInternalVariable(java.lang.Short internalVariable) {
        this.internalVariable = internalVariable;
    }


    /**
     * Gets the headerName value for this SmmAction.
     * 
     * @return headerName
     */
    public java.lang.String getHeaderName() {
        return headerName;
    }


    /**
     * Sets the headerName value for this SmmAction.
     * 
     * @param headerName
     */
    public void setHeaderName(java.lang.String headerName) {
        this.headerName = headerName;
    }


    /**
     * Gets the headerValue value for this SmmAction.
     * 
     * @return headerValue
     */
    public java.lang.String getHeaderValue() {
        return headerValue;
    }


    /**
     * Sets the headerValue value for this SmmAction.
     * 
     * @param headerValue
     */
    public void setHeaderValue(java.lang.String headerValue) {
        this.headerValue = headerValue;
    }


    /**
     * Gets the headerInsertPosition value for this SmmAction.
     * 
     * @return headerInsertPosition
     */
    public java.lang.Short getHeaderInsertPosition() {
        return headerInsertPosition;
    }


    /**
     * Sets the headerInsertPosition value for this SmmAction.
     * 
     * @param headerInsertPosition
     */
    public void setHeaderInsertPosition(java.lang.Short headerInsertPosition) {
        this.headerInsertPosition = headerInsertPosition;
    }


    /**
     * Gets the headerContentType value for this SmmAction.
     * 
     * @return headerContentType
     */
    public java.lang.Short getHeaderContentType() {
        return headerContentType;
    }


    /**
     * Sets the headerContentType value for this SmmAction.
     * 
     * @param headerContentType
     */
    public void setHeaderContentType(java.lang.Short headerContentType) {
        this.headerContentType = headerContentType;
    }


    /**
     * Gets the hdrInternalVariableId value for this SmmAction.
     * 
     * @return hdrInternalVariableId
     */
    public java.lang.Short getHdrInternalVariableId() {
        return hdrInternalVariableId;
    }


    /**
     * Sets the hdrInternalVariableId value for this SmmAction.
     * 
     * @param hdrInternalVariableId
     */
    public void setHdrInternalVariableId(java.lang.Short hdrInternalVariableId) {
        this.hdrInternalVariableId = hdrInternalVariableId;
    }


    /**
     * Gets the paramName value for this SmmAction.
     * 
     * @return paramName
     */
    public java.lang.String getParamName() {
        return paramName;
    }


    /**
     * Sets the paramName value for this SmmAction.
     * 
     * @param paramName
     */
    public void setParamName(java.lang.String paramName) {
        this.paramName = paramName;
    }


    /**
     * Gets the paramValue value for this SmmAction.
     * 
     * @return paramValue
     */
    public java.lang.String getParamValue() {
        return paramValue;
    }


    /**
     * Sets the paramValue value for this SmmAction.
     * 
     * @param paramValue
     */
    public void setParamValue(java.lang.String paramValue) {
        this.paramValue = paramValue;
    }


    /**
     * Gets the paramType value for this SmmAction.
     * 
     * @return paramType
     */
    public java.lang.Short getParamType() {
        return paramType;
    }


    /**
     * Sets the paramType value for this SmmAction.
     * 
     * @param paramType
     */
    public void setParamType(java.lang.Short paramType) {
        this.paramType = paramType;
    }


    /**
     * Gets the paramInternalVariableId value for this SmmAction.
     * 
     * @return paramInternalVariableId
     */
    public java.lang.Short getParamInternalVariableId() {
        return paramInternalVariableId;
    }


    /**
     * Sets the paramInternalVariableId value for this SmmAction.
     * 
     * @param paramInternalVariableId
     */
    public void setParamInternalVariableId(java.lang.Short paramInternalVariableId) {
        this.paramInternalVariableId = paramInternalVariableId;
    }


    /**
     * Gets the tokenType value for this SmmAction.
     * 
     * @return tokenType
     */
    public java.lang.Short getTokenType() {
        return tokenType;
    }


    /**
     * Sets the tokenType value for this SmmAction.
     * 
     * @param tokenType
     */
    public void setTokenType(java.lang.Short tokenType) {
        this.tokenType = tokenType;
    }


    /**
     * Gets the tokenInternalVariableId value for this SmmAction.
     * 
     * @return tokenInternalVariableId
     */
    public java.lang.Short getTokenInternalVariableId() {
        return tokenInternalVariableId;
    }


    /**
     * Sets the tokenInternalVariableId value for this SmmAction.
     * 
     * @param tokenInternalVariableId
     */
    public void setTokenInternalVariableId(java.lang.Short tokenInternalVariableId) {
        this.tokenInternalVariableId = tokenInternalVariableId;
    }


    /**
     * Gets the tokenValue value for this SmmAction.
     * 
     * @return tokenValue
     */
    public java.lang.String getTokenValue() {
        return tokenValue;
    }


    /**
     * Sets the tokenValue value for this SmmAction.
     * 
     * @param tokenValue
     */
    public void setTokenValue(java.lang.String tokenValue) {
        this.tokenValue = tokenValue;
    }


    /**
     * Gets the varInternalVariableId value for this SmmAction.
     * 
     * @return varInternalVariableId
     */
    public java.lang.Short getVarInternalVariableId() {
        return varInternalVariableId;
    }


    /**
     * Sets the varInternalVariableId value for this SmmAction.
     * 
     * @param varInternalVariableId
     */
    public void setVarInternalVariableId(java.lang.Short varInternalVariableId) {
        this.varInternalVariableId = varInternalVariableId;
    }


    /**
     * Gets the variableValue value for this SmmAction.
     * 
     * @return variableValue
     */
    public java.lang.String getVariableValue() {
        return variableValue;
    }


    /**
     * Sets the variableValue value for this SmmAction.
     * 
     * @param variableValue
     */
    public void setVariableValue(java.lang.String variableValue) {
        this.variableValue = variableValue;
    }


    /**
     * Gets the internalVariableRange value for this SmmAction.
     * 
     * @return internalVariableRange
     */
    public java.lang.Short getInternalVariableRange() {
        return internalVariableRange;
    }


    /**
     * Sets the internalVariableRange value for this SmmAction.
     * 
     * @param internalVariableRange
     */
    public void setInternalVariableRange(java.lang.Short internalVariableRange) {
        this.internalVariableRange = internalVariableRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmmAction)) return false;
        SmmAction other = (SmmAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.smmActionProfileId==null && other.getSmmActionProfileId()==null) || 
             (this.smmActionProfileId!=null &&
              this.smmActionProfileId.equals(other.getSmmActionProfileId()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.regexStr==null && other.getRegexStr()==null) || 
             (this.regexStr!=null &&
              this.regexStr.equals(other.getRegexStr()))) &&
            ((this.regexMatchInstance==null && other.getRegexMatchInstance()==null) || 
             (this.regexMatchInstance!=null &&
              this.regexMatchInstance.equals(other.getRegexMatchInstance()))) &&
            ((this.fromType==null && other.getFromType()==null) || 
             (this.fromType!=null &&
              this.fromType.equals(other.getFromType()))) &&
            ((this.globalVariableType==null && other.getGlobalVariableType()==null) || 
             (this.globalVariableType!=null &&
              this.globalVariableType.equals(other.getGlobalVariableType()))) &&
            ((this.internalVariable==null && other.getInternalVariable()==null) || 
             (this.internalVariable!=null &&
              this.internalVariable.equals(other.getInternalVariable()))) &&
            ((this.headerName==null && other.getHeaderName()==null) || 
             (this.headerName!=null &&
              this.headerName.equals(other.getHeaderName()))) &&
            ((this.headerValue==null && other.getHeaderValue()==null) || 
             (this.headerValue!=null &&
              this.headerValue.equals(other.getHeaderValue()))) &&
            ((this.headerInsertPosition==null && other.getHeaderInsertPosition()==null) || 
             (this.headerInsertPosition!=null &&
              this.headerInsertPosition.equals(other.getHeaderInsertPosition()))) &&
            ((this.headerContentType==null && other.getHeaderContentType()==null) || 
             (this.headerContentType!=null &&
              this.headerContentType.equals(other.getHeaderContentType()))) &&
            ((this.hdrInternalVariableId==null && other.getHdrInternalVariableId()==null) || 
             (this.hdrInternalVariableId!=null &&
              this.hdrInternalVariableId.equals(other.getHdrInternalVariableId()))) &&
            ((this.paramName==null && other.getParamName()==null) || 
             (this.paramName!=null &&
              this.paramName.equals(other.getParamName()))) &&
            ((this.paramValue==null && other.getParamValue()==null) || 
             (this.paramValue!=null &&
              this.paramValue.equals(other.getParamValue()))) &&
            ((this.paramType==null && other.getParamType()==null) || 
             (this.paramType!=null &&
              this.paramType.equals(other.getParamType()))) &&
            ((this.paramInternalVariableId==null && other.getParamInternalVariableId()==null) || 
             (this.paramInternalVariableId!=null &&
              this.paramInternalVariableId.equals(other.getParamInternalVariableId()))) &&
            ((this.tokenType==null && other.getTokenType()==null) || 
             (this.tokenType!=null &&
              this.tokenType.equals(other.getTokenType()))) &&
            ((this.tokenInternalVariableId==null && other.getTokenInternalVariableId()==null) || 
             (this.tokenInternalVariableId!=null &&
              this.tokenInternalVariableId.equals(other.getTokenInternalVariableId()))) &&
            ((this.tokenValue==null && other.getTokenValue()==null) || 
             (this.tokenValue!=null &&
              this.tokenValue.equals(other.getTokenValue()))) &&
            ((this.varInternalVariableId==null && other.getVarInternalVariableId()==null) || 
             (this.varInternalVariableId!=null &&
              this.varInternalVariableId.equals(other.getVarInternalVariableId()))) &&
            ((this.variableValue==null && other.getVariableValue()==null) || 
             (this.variableValue!=null &&
              this.variableValue.equals(other.getVariableValue()))) &&
            ((this.internalVariableRange==null && other.getInternalVariableRange()==null) || 
             (this.internalVariableRange!=null &&
              this.internalVariableRange.equals(other.getInternalVariableRange())));
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
        if (getSmmActionProfileId() != null) {
            _hashCode += getSmmActionProfileId().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getRegexStr() != null) {
            _hashCode += getRegexStr().hashCode();
        }
        if (getRegexMatchInstance() != null) {
            _hashCode += getRegexMatchInstance().hashCode();
        }
        if (getFromType() != null) {
            _hashCode += getFromType().hashCode();
        }
        if (getGlobalVariableType() != null) {
            _hashCode += getGlobalVariableType().hashCode();
        }
        if (getInternalVariable() != null) {
            _hashCode += getInternalVariable().hashCode();
        }
        if (getHeaderName() != null) {
            _hashCode += getHeaderName().hashCode();
        }
        if (getHeaderValue() != null) {
            _hashCode += getHeaderValue().hashCode();
        }
        if (getHeaderInsertPosition() != null) {
            _hashCode += getHeaderInsertPosition().hashCode();
        }
        if (getHeaderContentType() != null) {
            _hashCode += getHeaderContentType().hashCode();
        }
        if (getHdrInternalVariableId() != null) {
            _hashCode += getHdrInternalVariableId().hashCode();
        }
        if (getParamName() != null) {
            _hashCode += getParamName().hashCode();
        }
        if (getParamValue() != null) {
            _hashCode += getParamValue().hashCode();
        }
        if (getParamType() != null) {
            _hashCode += getParamType().hashCode();
        }
        if (getParamInternalVariableId() != null) {
            _hashCode += getParamInternalVariableId().hashCode();
        }
        if (getTokenType() != null) {
            _hashCode += getTokenType().hashCode();
        }
        if (getTokenInternalVariableId() != null) {
            _hashCode += getTokenInternalVariableId().hashCode();
        }
        if (getTokenValue() != null) {
            _hashCode += getTokenValue().hashCode();
        }
        if (getVarInternalVariableId() != null) {
            _hashCode += getVarInternalVariableId().hashCode();
        }
        if (getVariableValue() != null) {
            _hashCode += getVariableValue().hashCode();
        }
        if (getInternalVariableRange() != null) {
            _hashCode += getInternalVariableRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmmAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smmActionProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmActionProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regexStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regexStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regexMatchInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regexMatchInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalVariableType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalVariableType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalVariable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalVariable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerInsertPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headerInsertPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerContentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headerContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hdrInternalVariableId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hdrInternalVariableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramInternalVariableId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramInternalVariableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenInternalVariableId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenInternalVariableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varInternalVariableId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "varInternalVariableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variableValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalVariableRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalVariableRange"));
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
