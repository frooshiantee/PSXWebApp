/**
 * SmmCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SmmCriteria  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String smmCriteriaId;
    private java.lang.Short criterionType;
    private java.lang.Short criterionQualifier;
    private java.lang.String regexStr;
    private java.lang.Short regexMatch;
    private java.lang.Short msgClass;
    private java.lang.Short sipMsgType;
    private java.lang.Short sipResponseCode;
    private java.lang.Short sipResponseCodeRange;
    private java.lang.String headerName;
    private java.lang.Short headerInstanceIndex;
    private java.lang.Short headerInstanceRange;
    private java.lang.Short totalHeaderInstance;
    private java.lang.Short totalHeaderInstanceCondition;
    private java.lang.String headerValue;
    private java.lang.Short sipParamType;
    private java.lang.String sipParamName;
    private java.lang.String sipParamValue;
    private java.lang.Short sipTokenType;
    private java.lang.String sipTokenValue;
    private java.lang.Short variableType;
    private java.lang.String variableValue;
    private java.lang.Short globalVariableType;
    private java.lang.String globalVariableValue;

    public SmmCriteria() {
    }

    public SmmCriteria(
           java.lang.String smmCriteriaId,
           java.lang.Short criterionType,
           java.lang.Short criterionQualifier,
           java.lang.String regexStr,
           java.lang.Short regexMatch,
           java.lang.Short msgClass,
           java.lang.Short sipMsgType,
           java.lang.Short sipResponseCode,
           java.lang.Short sipResponseCodeRange,
           java.lang.String headerName,
           java.lang.Short headerInstanceIndex,
           java.lang.Short headerInstanceRange,
           java.lang.Short totalHeaderInstance,
           java.lang.Short totalHeaderInstanceCondition,
           java.lang.String headerValue,
           java.lang.Short sipParamType,
           java.lang.String sipParamName,
           java.lang.String sipParamValue,
           java.lang.Short sipTokenType,
           java.lang.String sipTokenValue,
           java.lang.Short variableType,
           java.lang.String variableValue,
           java.lang.Short globalVariableType,
           java.lang.String globalVariableValue) {
           this.smmCriteriaId = smmCriteriaId;
           this.criterionType = criterionType;
           this.criterionQualifier = criterionQualifier;
           this.regexStr = regexStr;
           this.regexMatch = regexMatch;
           this.msgClass = msgClass;
           this.sipMsgType = sipMsgType;
           this.sipResponseCode = sipResponseCode;
           this.sipResponseCodeRange = sipResponseCodeRange;
           this.headerName = headerName;
           this.headerInstanceIndex = headerInstanceIndex;
           this.headerInstanceRange = headerInstanceRange;
           this.totalHeaderInstance = totalHeaderInstance;
           this.totalHeaderInstanceCondition = totalHeaderInstanceCondition;
           this.headerValue = headerValue;
           this.sipParamType = sipParamType;
           this.sipParamName = sipParamName;
           this.sipParamValue = sipParamValue;
           this.sipTokenType = sipTokenType;
           this.sipTokenValue = sipTokenValue;
           this.variableType = variableType;
           this.variableValue = variableValue;
           this.globalVariableType = globalVariableType;
           this.globalVariableValue = globalVariableValue;
    }


    /**
     * Gets the smmCriteriaId value for this SmmCriteria.
     * 
     * @return smmCriteriaId
     */
    public java.lang.String getSmmCriteriaId() {
        return smmCriteriaId;
    }


    /**
     * Sets the smmCriteriaId value for this SmmCriteria.
     * 
     * @param smmCriteriaId
     */
    public void setSmmCriteriaId(java.lang.String smmCriteriaId) {
        this.smmCriteriaId = smmCriteriaId;
    }


    /**
     * Gets the criterionType value for this SmmCriteria.
     * 
     * @return criterionType
     */
    public java.lang.Short getCriterionType() {
        return criterionType;
    }


    /**
     * Sets the criterionType value for this SmmCriteria.
     * 
     * @param criterionType
     */
    public void setCriterionType(java.lang.Short criterionType) {
        this.criterionType = criterionType;
    }


    /**
     * Gets the criterionQualifier value for this SmmCriteria.
     * 
     * @return criterionQualifier
     */
    public java.lang.Short getCriterionQualifier() {
        return criterionQualifier;
    }


    /**
     * Sets the criterionQualifier value for this SmmCriteria.
     * 
     * @param criterionQualifier
     */
    public void setCriterionQualifier(java.lang.Short criterionQualifier) {
        this.criterionQualifier = criterionQualifier;
    }


    /**
     * Gets the regexStr value for this SmmCriteria.
     * 
     * @return regexStr
     */
    public java.lang.String getRegexStr() {
        return regexStr;
    }


    /**
     * Sets the regexStr value for this SmmCriteria.
     * 
     * @param regexStr
     */
    public void setRegexStr(java.lang.String regexStr) {
        this.regexStr = regexStr;
    }


    /**
     * Gets the regexMatch value for this SmmCriteria.
     * 
     * @return regexMatch
     */
    public java.lang.Short getRegexMatch() {
        return regexMatch;
    }


    /**
     * Sets the regexMatch value for this SmmCriteria.
     * 
     * @param regexMatch
     */
    public void setRegexMatch(java.lang.Short regexMatch) {
        this.regexMatch = regexMatch;
    }


    /**
     * Gets the msgClass value for this SmmCriteria.
     * 
     * @return msgClass
     */
    public java.lang.Short getMsgClass() {
        return msgClass;
    }


    /**
     * Sets the msgClass value for this SmmCriteria.
     * 
     * @param msgClass
     */
    public void setMsgClass(java.lang.Short msgClass) {
        this.msgClass = msgClass;
    }


    /**
     * Gets the sipMsgType value for this SmmCriteria.
     * 
     * @return sipMsgType
     */
    public java.lang.Short getSipMsgType() {
        return sipMsgType;
    }


    /**
     * Sets the sipMsgType value for this SmmCriteria.
     * 
     * @param sipMsgType
     */
    public void setSipMsgType(java.lang.Short sipMsgType) {
        this.sipMsgType = sipMsgType;
    }


    /**
     * Gets the sipResponseCode value for this SmmCriteria.
     * 
     * @return sipResponseCode
     */
    public java.lang.Short getSipResponseCode() {
        return sipResponseCode;
    }


    /**
     * Sets the sipResponseCode value for this SmmCriteria.
     * 
     * @param sipResponseCode
     */
    public void setSipResponseCode(java.lang.Short sipResponseCode) {
        this.sipResponseCode = sipResponseCode;
    }


    /**
     * Gets the sipResponseCodeRange value for this SmmCriteria.
     * 
     * @return sipResponseCodeRange
     */
    public java.lang.Short getSipResponseCodeRange() {
        return sipResponseCodeRange;
    }


    /**
     * Sets the sipResponseCodeRange value for this SmmCriteria.
     * 
     * @param sipResponseCodeRange
     */
    public void setSipResponseCodeRange(java.lang.Short sipResponseCodeRange) {
        this.sipResponseCodeRange = sipResponseCodeRange;
    }


    /**
     * Gets the headerName value for this SmmCriteria.
     * 
     * @return headerName
     */
    public java.lang.String getHeaderName() {
        return headerName;
    }


    /**
     * Sets the headerName value for this SmmCriteria.
     * 
     * @param headerName
     */
    public void setHeaderName(java.lang.String headerName) {
        this.headerName = headerName;
    }


    /**
     * Gets the headerInstanceIndex value for this SmmCriteria.
     * 
     * @return headerInstanceIndex
     */
    public java.lang.Short getHeaderInstanceIndex() {
        return headerInstanceIndex;
    }


    /**
     * Sets the headerInstanceIndex value for this SmmCriteria.
     * 
     * @param headerInstanceIndex
     */
    public void setHeaderInstanceIndex(java.lang.Short headerInstanceIndex) {
        this.headerInstanceIndex = headerInstanceIndex;
    }


    /**
     * Gets the headerInstanceRange value for this SmmCriteria.
     * 
     * @return headerInstanceRange
     */
    public java.lang.Short getHeaderInstanceRange() {
        return headerInstanceRange;
    }


    /**
     * Sets the headerInstanceRange value for this SmmCriteria.
     * 
     * @param headerInstanceRange
     */
    public void setHeaderInstanceRange(java.lang.Short headerInstanceRange) {
        this.headerInstanceRange = headerInstanceRange;
    }


    /**
     * Gets the totalHeaderInstance value for this SmmCriteria.
     * 
     * @return totalHeaderInstance
     */
    public java.lang.Short getTotalHeaderInstance() {
        return totalHeaderInstance;
    }


    /**
     * Sets the totalHeaderInstance value for this SmmCriteria.
     * 
     * @param totalHeaderInstance
     */
    public void setTotalHeaderInstance(java.lang.Short totalHeaderInstance) {
        this.totalHeaderInstance = totalHeaderInstance;
    }


    /**
     * Gets the totalHeaderInstanceCondition value for this SmmCriteria.
     * 
     * @return totalHeaderInstanceCondition
     */
    public java.lang.Short getTotalHeaderInstanceCondition() {
        return totalHeaderInstanceCondition;
    }


    /**
     * Sets the totalHeaderInstanceCondition value for this SmmCriteria.
     * 
     * @param totalHeaderInstanceCondition
     */
    public void setTotalHeaderInstanceCondition(java.lang.Short totalHeaderInstanceCondition) {
        this.totalHeaderInstanceCondition = totalHeaderInstanceCondition;
    }


    /**
     * Gets the headerValue value for this SmmCriteria.
     * 
     * @return headerValue
     */
    public java.lang.String getHeaderValue() {
        return headerValue;
    }


    /**
     * Sets the headerValue value for this SmmCriteria.
     * 
     * @param headerValue
     */
    public void setHeaderValue(java.lang.String headerValue) {
        this.headerValue = headerValue;
    }


    /**
     * Gets the sipParamType value for this SmmCriteria.
     * 
     * @return sipParamType
     */
    public java.lang.Short getSipParamType() {
        return sipParamType;
    }


    /**
     * Sets the sipParamType value for this SmmCriteria.
     * 
     * @param sipParamType
     */
    public void setSipParamType(java.lang.Short sipParamType) {
        this.sipParamType = sipParamType;
    }


    /**
     * Gets the sipParamName value for this SmmCriteria.
     * 
     * @return sipParamName
     */
    public java.lang.String getSipParamName() {
        return sipParamName;
    }


    /**
     * Sets the sipParamName value for this SmmCriteria.
     * 
     * @param sipParamName
     */
    public void setSipParamName(java.lang.String sipParamName) {
        this.sipParamName = sipParamName;
    }


    /**
     * Gets the sipParamValue value for this SmmCriteria.
     * 
     * @return sipParamValue
     */
    public java.lang.String getSipParamValue() {
        return sipParamValue;
    }


    /**
     * Sets the sipParamValue value for this SmmCriteria.
     * 
     * @param sipParamValue
     */
    public void setSipParamValue(java.lang.String sipParamValue) {
        this.sipParamValue = sipParamValue;
    }


    /**
     * Gets the sipTokenType value for this SmmCriteria.
     * 
     * @return sipTokenType
     */
    public java.lang.Short getSipTokenType() {
        return sipTokenType;
    }


    /**
     * Sets the sipTokenType value for this SmmCriteria.
     * 
     * @param sipTokenType
     */
    public void setSipTokenType(java.lang.Short sipTokenType) {
        this.sipTokenType = sipTokenType;
    }


    /**
     * Gets the sipTokenValue value for this SmmCriteria.
     * 
     * @return sipTokenValue
     */
    public java.lang.String getSipTokenValue() {
        return sipTokenValue;
    }


    /**
     * Sets the sipTokenValue value for this SmmCriteria.
     * 
     * @param sipTokenValue
     */
    public void setSipTokenValue(java.lang.String sipTokenValue) {
        this.sipTokenValue = sipTokenValue;
    }


    /**
     * Gets the variableType value for this SmmCriteria.
     * 
     * @return variableType
     */
    public java.lang.Short getVariableType() {
        return variableType;
    }


    /**
     * Sets the variableType value for this SmmCriteria.
     * 
     * @param variableType
     */
    public void setVariableType(java.lang.Short variableType) {
        this.variableType = variableType;
    }


    /**
     * Gets the variableValue value for this SmmCriteria.
     * 
     * @return variableValue
     */
    public java.lang.String getVariableValue() {
        return variableValue;
    }


    /**
     * Sets the variableValue value for this SmmCriteria.
     * 
     * @param variableValue
     */
    public void setVariableValue(java.lang.String variableValue) {
        this.variableValue = variableValue;
    }


    /**
     * Gets the globalVariableType value for this SmmCriteria.
     * 
     * @return globalVariableType
     */
    public java.lang.Short getGlobalVariableType() {
        return globalVariableType;
    }


    /**
     * Sets the globalVariableType value for this SmmCriteria.
     * 
     * @param globalVariableType
     */
    public void setGlobalVariableType(java.lang.Short globalVariableType) {
        this.globalVariableType = globalVariableType;
    }


    /**
     * Gets the globalVariableValue value for this SmmCriteria.
     * 
     * @return globalVariableValue
     */
    public java.lang.String getGlobalVariableValue() {
        return globalVariableValue;
    }


    /**
     * Sets the globalVariableValue value for this SmmCriteria.
     * 
     * @param globalVariableValue
     */
    public void setGlobalVariableValue(java.lang.String globalVariableValue) {
        this.globalVariableValue = globalVariableValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmmCriteria)) return false;
        SmmCriteria other = (SmmCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.smmCriteriaId==null && other.getSmmCriteriaId()==null) || 
             (this.smmCriteriaId!=null &&
              this.smmCriteriaId.equals(other.getSmmCriteriaId()))) &&
            ((this.criterionType==null && other.getCriterionType()==null) || 
             (this.criterionType!=null &&
              this.criterionType.equals(other.getCriterionType()))) &&
            ((this.criterionQualifier==null && other.getCriterionQualifier()==null) || 
             (this.criterionQualifier!=null &&
              this.criterionQualifier.equals(other.getCriterionQualifier()))) &&
            ((this.regexStr==null && other.getRegexStr()==null) || 
             (this.regexStr!=null &&
              this.regexStr.equals(other.getRegexStr()))) &&
            ((this.regexMatch==null && other.getRegexMatch()==null) || 
             (this.regexMatch!=null &&
              this.regexMatch.equals(other.getRegexMatch()))) &&
            ((this.msgClass==null && other.getMsgClass()==null) || 
             (this.msgClass!=null &&
              this.msgClass.equals(other.getMsgClass()))) &&
            ((this.sipMsgType==null && other.getSipMsgType()==null) || 
             (this.sipMsgType!=null &&
              this.sipMsgType.equals(other.getSipMsgType()))) &&
            ((this.sipResponseCode==null && other.getSipResponseCode()==null) || 
             (this.sipResponseCode!=null &&
              this.sipResponseCode.equals(other.getSipResponseCode()))) &&
            ((this.sipResponseCodeRange==null && other.getSipResponseCodeRange()==null) || 
             (this.sipResponseCodeRange!=null &&
              this.sipResponseCodeRange.equals(other.getSipResponseCodeRange()))) &&
            ((this.headerName==null && other.getHeaderName()==null) || 
             (this.headerName!=null &&
              this.headerName.equals(other.getHeaderName()))) &&
            ((this.headerInstanceIndex==null && other.getHeaderInstanceIndex()==null) || 
             (this.headerInstanceIndex!=null &&
              this.headerInstanceIndex.equals(other.getHeaderInstanceIndex()))) &&
            ((this.headerInstanceRange==null && other.getHeaderInstanceRange()==null) || 
             (this.headerInstanceRange!=null &&
              this.headerInstanceRange.equals(other.getHeaderInstanceRange()))) &&
            ((this.totalHeaderInstance==null && other.getTotalHeaderInstance()==null) || 
             (this.totalHeaderInstance!=null &&
              this.totalHeaderInstance.equals(other.getTotalHeaderInstance()))) &&
            ((this.totalHeaderInstanceCondition==null && other.getTotalHeaderInstanceCondition()==null) || 
             (this.totalHeaderInstanceCondition!=null &&
              this.totalHeaderInstanceCondition.equals(other.getTotalHeaderInstanceCondition()))) &&
            ((this.headerValue==null && other.getHeaderValue()==null) || 
             (this.headerValue!=null &&
              this.headerValue.equals(other.getHeaderValue()))) &&
            ((this.sipParamType==null && other.getSipParamType()==null) || 
             (this.sipParamType!=null &&
              this.sipParamType.equals(other.getSipParamType()))) &&
            ((this.sipParamName==null && other.getSipParamName()==null) || 
             (this.sipParamName!=null &&
              this.sipParamName.equals(other.getSipParamName()))) &&
            ((this.sipParamValue==null && other.getSipParamValue()==null) || 
             (this.sipParamValue!=null &&
              this.sipParamValue.equals(other.getSipParamValue()))) &&
            ((this.sipTokenType==null && other.getSipTokenType()==null) || 
             (this.sipTokenType!=null &&
              this.sipTokenType.equals(other.getSipTokenType()))) &&
            ((this.sipTokenValue==null && other.getSipTokenValue()==null) || 
             (this.sipTokenValue!=null &&
              this.sipTokenValue.equals(other.getSipTokenValue()))) &&
            ((this.variableType==null && other.getVariableType()==null) || 
             (this.variableType!=null &&
              this.variableType.equals(other.getVariableType()))) &&
            ((this.variableValue==null && other.getVariableValue()==null) || 
             (this.variableValue!=null &&
              this.variableValue.equals(other.getVariableValue()))) &&
            ((this.globalVariableType==null && other.getGlobalVariableType()==null) || 
             (this.globalVariableType!=null &&
              this.globalVariableType.equals(other.getGlobalVariableType()))) &&
            ((this.globalVariableValue==null && other.getGlobalVariableValue()==null) || 
             (this.globalVariableValue!=null &&
              this.globalVariableValue.equals(other.getGlobalVariableValue())));
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
        if (getSmmCriteriaId() != null) {
            _hashCode += getSmmCriteriaId().hashCode();
        }
        if (getCriterionType() != null) {
            _hashCode += getCriterionType().hashCode();
        }
        if (getCriterionQualifier() != null) {
            _hashCode += getCriterionQualifier().hashCode();
        }
        if (getRegexStr() != null) {
            _hashCode += getRegexStr().hashCode();
        }
        if (getRegexMatch() != null) {
            _hashCode += getRegexMatch().hashCode();
        }
        if (getMsgClass() != null) {
            _hashCode += getMsgClass().hashCode();
        }
        if (getSipMsgType() != null) {
            _hashCode += getSipMsgType().hashCode();
        }
        if (getSipResponseCode() != null) {
            _hashCode += getSipResponseCode().hashCode();
        }
        if (getSipResponseCodeRange() != null) {
            _hashCode += getSipResponseCodeRange().hashCode();
        }
        if (getHeaderName() != null) {
            _hashCode += getHeaderName().hashCode();
        }
        if (getHeaderInstanceIndex() != null) {
            _hashCode += getHeaderInstanceIndex().hashCode();
        }
        if (getHeaderInstanceRange() != null) {
            _hashCode += getHeaderInstanceRange().hashCode();
        }
        if (getTotalHeaderInstance() != null) {
            _hashCode += getTotalHeaderInstance().hashCode();
        }
        if (getTotalHeaderInstanceCondition() != null) {
            _hashCode += getTotalHeaderInstanceCondition().hashCode();
        }
        if (getHeaderValue() != null) {
            _hashCode += getHeaderValue().hashCode();
        }
        if (getSipParamType() != null) {
            _hashCode += getSipParamType().hashCode();
        }
        if (getSipParamName() != null) {
            _hashCode += getSipParamName().hashCode();
        }
        if (getSipParamValue() != null) {
            _hashCode += getSipParamValue().hashCode();
        }
        if (getSipTokenType() != null) {
            _hashCode += getSipTokenType().hashCode();
        }
        if (getSipTokenValue() != null) {
            _hashCode += getSipTokenValue().hashCode();
        }
        if (getVariableType() != null) {
            _hashCode += getVariableType().hashCode();
        }
        if (getVariableValue() != null) {
            _hashCode += getVariableValue().hashCode();
        }
        if (getGlobalVariableType() != null) {
            _hashCode += getGlobalVariableType().hashCode();
        }
        if (getGlobalVariableValue() != null) {
            _hashCode += getGlobalVariableValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmmCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smmCriteriaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmCriteriaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criterionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criterionQualifier"));
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
        elemField.setFieldName("regexMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regexMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msgClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipMsgType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipMsgType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipResponseCodeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipResponseCodeRange"));
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
        elemField.setFieldName("headerInstanceIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headerInstanceIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerInstanceRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headerInstanceRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalHeaderInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalHeaderInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalHeaderInstanceCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalHeaderInstanceCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipParamType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipParamType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipParamName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipParamName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipParamValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipParamValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipTokenType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipTokenType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipTokenValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipTokenValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variableType"));
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
        elemField.setFieldName("globalVariableType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalVariableType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalVariableValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalVariableValue"));
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
