/**
 * Script.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class Script  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String scriptId;

    private java.lang.String description;

    private java.lang.Short majorVersion;

    private java.lang.Short minorVersion;

    private java.lang.Short majorCplVersionId;

    private java.lang.Short minorCplVersionId;

    private java.lang.Integer terminatingFlag;

    private java.lang.Integer routeRequiredFlag;

    private java.lang.Integer announcementTerminateFlag;

    private java.lang.Integer callWithoutAnnouncementsFlag;

    private java.lang.String scriptData;

    private java.lang.Integer twoStateCallFlag;

    private java.lang.Integer runtimePropertyFlag;

    private java.lang.String xmlData;

    private java.lang.String variableList;

    private java.lang.Short asxCallScriptFlag;

    private java.lang.Short testCallScriptFlag;

    private java.lang.Integer scriptAttributes;

    public Script() {
    }

    public Script(
           java.lang.String scriptId,
           java.lang.String description,
           java.lang.Short majorVersion,
           java.lang.Short minorVersion,
           java.lang.Short majorCplVersionId,
           java.lang.Short minorCplVersionId,
           java.lang.Integer terminatingFlag,
           java.lang.Integer routeRequiredFlag,
           java.lang.Integer announcementTerminateFlag,
           java.lang.Integer callWithoutAnnouncementsFlag,
           java.lang.String scriptData,
           java.lang.Integer twoStateCallFlag,
           java.lang.Integer runtimePropertyFlag,
           java.lang.String xmlData,
           java.lang.String variableList,
           java.lang.Short asxCallScriptFlag,
           java.lang.Short testCallScriptFlag,
           java.lang.Integer scriptAttributes) {
        this.scriptId = scriptId;
        this.description = description;
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.majorCplVersionId = majorCplVersionId;
        this.minorCplVersionId = minorCplVersionId;
        this.terminatingFlag = terminatingFlag;
        this.routeRequiredFlag = routeRequiredFlag;
        this.announcementTerminateFlag = announcementTerminateFlag;
        this.callWithoutAnnouncementsFlag = callWithoutAnnouncementsFlag;
        this.scriptData = scriptData;
        this.twoStateCallFlag = twoStateCallFlag;
        this.runtimePropertyFlag = runtimePropertyFlag;
        this.xmlData = xmlData;
        this.variableList = variableList;
        this.asxCallScriptFlag = asxCallScriptFlag;
        this.testCallScriptFlag = testCallScriptFlag;
        this.scriptAttributes = scriptAttributes;
    }


    /**
     * Gets the scriptId value for this Script.
     * 
     * @return scriptId
     */
    public java.lang.String getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this Script.
     * 
     * @param scriptId
     */
    public void setScriptId(java.lang.String scriptId) {
        this.scriptId = scriptId;
    }


    /**
     * Gets the description value for this Script.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Script.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the majorVersion value for this Script.
     * 
     * @return majorVersion
     */
    public java.lang.Short getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this Script.
     * 
     * @param majorVersion
     */
    public void setMajorVersion(java.lang.Short majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the minorVersion value for this Script.
     * 
     * @return minorVersion
     */
    public java.lang.Short getMinorVersion() {
        return minorVersion;
    }


    /**
     * Sets the minorVersion value for this Script.
     * 
     * @param minorVersion
     */
    public void setMinorVersion(java.lang.Short minorVersion) {
        this.minorVersion = minorVersion;
    }


    /**
     * Gets the majorCplVersionId value for this Script.
     * 
     * @return majorCplVersionId
     */
    public java.lang.Short getMajorCplVersionId() {
        return majorCplVersionId;
    }


    /**
     * Sets the majorCplVersionId value for this Script.
     * 
     * @param majorCplVersionId
     */
    public void setMajorCplVersionId(java.lang.Short majorCplVersionId) {
        this.majorCplVersionId = majorCplVersionId;
    }


    /**
     * Gets the minorCplVersionId value for this Script.
     * 
     * @return minorCplVersionId
     */
    public java.lang.Short getMinorCplVersionId() {
        return minorCplVersionId;
    }


    /**
     * Sets the minorCplVersionId value for this Script.
     * 
     * @param minorCplVersionId
     */
    public void setMinorCplVersionId(java.lang.Short minorCplVersionId) {
        this.minorCplVersionId = minorCplVersionId;
    }


    /**
     * Gets the terminatingFlag value for this Script.
     * 
     * @return terminatingFlag
     */
    public java.lang.Integer getTerminatingFlag() {
        return terminatingFlag;
    }


    /**
     * Sets the terminatingFlag value for this Script.
     * 
     * @param terminatingFlag
     */
    public void setTerminatingFlag(java.lang.Integer terminatingFlag) {
        this.terminatingFlag = terminatingFlag;
    }


    /**
     * Gets the routeRequiredFlag value for this Script.
     * 
     * @return routeRequiredFlag
     */
    public java.lang.Integer getRouteRequiredFlag() {
        return routeRequiredFlag;
    }


    /**
     * Sets the routeRequiredFlag value for this Script.
     * 
     * @param routeRequiredFlag
     */
    public void setRouteRequiredFlag(java.lang.Integer routeRequiredFlag) {
        this.routeRequiredFlag = routeRequiredFlag;
    }


    /**
     * Gets the announcementTerminateFlag value for this Script.
     * 
     * @return announcementTerminateFlag
     */
    public java.lang.Integer getAnnouncementTerminateFlag() {
        return announcementTerminateFlag;
    }


    /**
     * Sets the announcementTerminateFlag value for this Script.
     * 
     * @param announcementTerminateFlag
     */
    public void setAnnouncementTerminateFlag(java.lang.Integer announcementTerminateFlag) {
        this.announcementTerminateFlag = announcementTerminateFlag;
    }


    /**
     * Gets the callWithoutAnnouncementsFlag value for this Script.
     * 
     * @return callWithoutAnnouncementsFlag
     */
    public java.lang.Integer getCallWithoutAnnouncementsFlag() {
        return callWithoutAnnouncementsFlag;
    }


    /**
     * Sets the callWithoutAnnouncementsFlag value for this Script.
     * 
     * @param callWithoutAnnouncementsFlag
     */
    public void setCallWithoutAnnouncementsFlag(java.lang.Integer callWithoutAnnouncementsFlag) {
        this.callWithoutAnnouncementsFlag = callWithoutAnnouncementsFlag;
    }


    /**
     * Gets the scriptData value for this Script.
     * 
     * @return scriptData
     */
    public java.lang.String getScriptData() {
        return scriptData;
    }


    /**
     * Sets the scriptData value for this Script.
     * 
     * @param scriptData
     */
    public void setScriptData(java.lang.String scriptData) {
        this.scriptData = scriptData;
    }


    /**
     * Gets the twoStateCallFlag value for this Script.
     * 
     * @return twoStateCallFlag
     */
    public java.lang.Integer getTwoStateCallFlag() {
        return twoStateCallFlag;
    }


    /**
     * Sets the twoStateCallFlag value for this Script.
     * 
     * @param twoStateCallFlag
     */
    public void setTwoStateCallFlag(java.lang.Integer twoStateCallFlag) {
        this.twoStateCallFlag = twoStateCallFlag;
    }


    /**
     * Gets the runtimePropertyFlag value for this Script.
     * 
     * @return runtimePropertyFlag
     */
    public java.lang.Integer getRuntimePropertyFlag() {
        return runtimePropertyFlag;
    }


    /**
     * Sets the runtimePropertyFlag value for this Script.
     * 
     * @param runtimePropertyFlag
     */
    public void setRuntimePropertyFlag(java.lang.Integer runtimePropertyFlag) {
        this.runtimePropertyFlag = runtimePropertyFlag;
    }


    /**
     * Gets the xmlData value for this Script.
     * 
     * @return xmlData
     */
    public java.lang.String getXmlData() {
        return xmlData;
    }


    /**
     * Sets the xmlData value for this Script.
     * 
     * @param xmlData
     */
    public void setXmlData(java.lang.String xmlData) {
        this.xmlData = xmlData;
    }


    /**
     * Gets the variableList value for this Script.
     * 
     * @return variableList
     */
    public java.lang.String getVariableList() {
        return variableList;
    }


    /**
     * Sets the variableList value for this Script.
     * 
     * @param variableList
     */
    public void setVariableList(java.lang.String variableList) {
        this.variableList = variableList;
    }


    /**
     * Gets the asxCallScriptFlag value for this Script.
     * 
     * @return asxCallScriptFlag
     */
    public java.lang.Short getAsxCallScriptFlag() {
        return asxCallScriptFlag;
    }


    /**
     * Sets the asxCallScriptFlag value for this Script.
     * 
     * @param asxCallScriptFlag
     */
    public void setAsxCallScriptFlag(java.lang.Short asxCallScriptFlag) {
        this.asxCallScriptFlag = asxCallScriptFlag;
    }


    /**
     * Gets the testCallScriptFlag value for this Script.
     * 
     * @return testCallScriptFlag
     */
    public java.lang.Short getTestCallScriptFlag() {
        return testCallScriptFlag;
    }


    /**
     * Sets the testCallScriptFlag value for this Script.
     * 
     * @param testCallScriptFlag
     */
    public void setTestCallScriptFlag(java.lang.Short testCallScriptFlag) {
        this.testCallScriptFlag = testCallScriptFlag;
    }


    /**
     * Gets the scriptAttributes value for this Script.
     * 
     * @return scriptAttributes
     */
    public java.lang.Integer getScriptAttributes() {
        return scriptAttributes;
    }


    /**
     * Sets the scriptAttributes value for this Script.
     * 
     * @param scriptAttributes
     */
    public void setScriptAttributes(java.lang.Integer scriptAttributes) {
        this.scriptAttributes = scriptAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Script)) return false;
        Script other = (Script) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              this.scriptId.equals(other.getScriptId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.majorVersion==null && other.getMajorVersion()==null) || 
             (this.majorVersion!=null &&
              this.majorVersion.equals(other.getMajorVersion()))) &&
            ((this.minorVersion==null && other.getMinorVersion()==null) || 
             (this.minorVersion!=null &&
              this.minorVersion.equals(other.getMinorVersion()))) &&
            ((this.majorCplVersionId==null && other.getMajorCplVersionId()==null) || 
             (this.majorCplVersionId!=null &&
              this.majorCplVersionId.equals(other.getMajorCplVersionId()))) &&
            ((this.minorCplVersionId==null && other.getMinorCplVersionId()==null) || 
             (this.minorCplVersionId!=null &&
              this.minorCplVersionId.equals(other.getMinorCplVersionId()))) &&
            ((this.terminatingFlag==null && other.getTerminatingFlag()==null) || 
             (this.terminatingFlag!=null &&
              this.terminatingFlag.equals(other.getTerminatingFlag()))) &&
            ((this.routeRequiredFlag==null && other.getRouteRequiredFlag()==null) || 
             (this.routeRequiredFlag!=null &&
              this.routeRequiredFlag.equals(other.getRouteRequiredFlag()))) &&
            ((this.announcementTerminateFlag==null && other.getAnnouncementTerminateFlag()==null) || 
             (this.announcementTerminateFlag!=null &&
              this.announcementTerminateFlag.equals(other.getAnnouncementTerminateFlag()))) &&
            ((this.callWithoutAnnouncementsFlag==null && other.getCallWithoutAnnouncementsFlag()==null) || 
             (this.callWithoutAnnouncementsFlag!=null &&
              this.callWithoutAnnouncementsFlag.equals(other.getCallWithoutAnnouncementsFlag()))) &&
            ((this.scriptData==null && other.getScriptData()==null) || 
             (this.scriptData!=null &&
              this.scriptData.equals(other.getScriptData()))) &&
            ((this.twoStateCallFlag==null && other.getTwoStateCallFlag()==null) || 
             (this.twoStateCallFlag!=null &&
              this.twoStateCallFlag.equals(other.getTwoStateCallFlag()))) &&
            ((this.runtimePropertyFlag==null && other.getRuntimePropertyFlag()==null) || 
             (this.runtimePropertyFlag!=null &&
              this.runtimePropertyFlag.equals(other.getRuntimePropertyFlag()))) &&
            ((this.xmlData==null && other.getXmlData()==null) || 
             (this.xmlData!=null &&
              this.xmlData.equals(other.getXmlData()))) &&
            ((this.variableList==null && other.getVariableList()==null) || 
             (this.variableList!=null &&
              this.variableList.equals(other.getVariableList()))) &&
            ((this.asxCallScriptFlag==null && other.getAsxCallScriptFlag()==null) || 
             (this.asxCallScriptFlag!=null &&
              this.asxCallScriptFlag.equals(other.getAsxCallScriptFlag()))) &&
            ((this.testCallScriptFlag==null && other.getTestCallScriptFlag()==null) || 
             (this.testCallScriptFlag!=null &&
              this.testCallScriptFlag.equals(other.getTestCallScriptFlag()))) &&
            ((this.scriptAttributes==null && other.getScriptAttributes()==null) || 
             (this.scriptAttributes!=null &&
              this.scriptAttributes.equals(other.getScriptAttributes())));
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
        if (getScriptId() != null) {
            _hashCode += getScriptId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMajorVersion() != null) {
            _hashCode += getMajorVersion().hashCode();
        }
        if (getMinorVersion() != null) {
            _hashCode += getMinorVersion().hashCode();
        }
        if (getMajorCplVersionId() != null) {
            _hashCode += getMajorCplVersionId().hashCode();
        }
        if (getMinorCplVersionId() != null) {
            _hashCode += getMinorCplVersionId().hashCode();
        }
        if (getTerminatingFlag() != null) {
            _hashCode += getTerminatingFlag().hashCode();
        }
        if (getRouteRequiredFlag() != null) {
            _hashCode += getRouteRequiredFlag().hashCode();
        }
        if (getAnnouncementTerminateFlag() != null) {
            _hashCode += getAnnouncementTerminateFlag().hashCode();
        }
        if (getCallWithoutAnnouncementsFlag() != null) {
            _hashCode += getCallWithoutAnnouncementsFlag().hashCode();
        }
        if (getScriptData() != null) {
            _hashCode += getScriptData().hashCode();
        }
        if (getTwoStateCallFlag() != null) {
            _hashCode += getTwoStateCallFlag().hashCode();
        }
        if (getRuntimePropertyFlag() != null) {
            _hashCode += getRuntimePropertyFlag().hashCode();
        }
        if (getXmlData() != null) {
            _hashCode += getXmlData().hashCode();
        }
        if (getVariableList() != null) {
            _hashCode += getVariableList().hashCode();
        }
        if (getAsxCallScriptFlag() != null) {
            _hashCode += getAsxCallScriptFlag().hashCode();
        }
        if (getTestCallScriptFlag() != null) {
            _hashCode += getTestCallScriptFlag().hashCode();
        }
        if (getScriptAttributes() != null) {
            _hashCode += getScriptAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Script.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Script"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scriptId"));
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
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "majorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorCplVersionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "majorCplVersionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorCplVersionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorCplVersionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminatingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminatingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeRequiredFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routeRequiredFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("announcementTerminateFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "announcementTerminateFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callWithoutAnnouncementsFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callWithoutAnnouncementsFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scriptData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("twoStateCallFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "twoStateCallFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runtimePropertyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "runtimePropertyFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variableList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asxCallScriptFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asxCallScriptFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCallScriptFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "testCallScriptFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scriptAttributes"));
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
