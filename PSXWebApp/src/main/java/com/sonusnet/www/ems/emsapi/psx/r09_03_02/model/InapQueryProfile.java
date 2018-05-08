/**
 * InapQueryProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class InapQueryProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String inapMessageId;

    private java.lang.Integer inapOperationCode;

    private java.lang.Integer inapQueryFlags1;

    private java.lang.Integer inapQueryFlags2;

    private java.lang.Integer inapQueryFlags3;

    private java.lang.Integer inapUseDefaultFlags;

    private java.lang.Integer inapApplicationTimer;

    private java.lang.Integer inapTrunkgroupOffset;

    private java.lang.Integer inapTrunkgroupLength;

    private java.lang.Integer inapSwitchOffset;

    private java.lang.Integer inapSwitchLength;

    private java.lang.Integer initialdpSspId;

    private java.lang.String inapApplicationContextName;

    public InapQueryProfile() {
    }

    public InapQueryProfile(
           java.lang.String inapMessageId,
           java.lang.Integer inapOperationCode,
           java.lang.Integer inapQueryFlags1,
           java.lang.Integer inapQueryFlags2,
           java.lang.Integer inapQueryFlags3,
           java.lang.Integer inapUseDefaultFlags,
           java.lang.Integer inapApplicationTimer,
           java.lang.Integer inapTrunkgroupOffset,
           java.lang.Integer inapTrunkgroupLength,
           java.lang.Integer inapSwitchOffset,
           java.lang.Integer inapSwitchLength,
           java.lang.Integer initialdpSspId,
           java.lang.String inapApplicationContextName) {
        this.inapMessageId = inapMessageId;
        this.inapOperationCode = inapOperationCode;
        this.inapQueryFlags1 = inapQueryFlags1;
        this.inapQueryFlags2 = inapQueryFlags2;
        this.inapQueryFlags3 = inapQueryFlags3;
        this.inapUseDefaultFlags = inapUseDefaultFlags;
        this.inapApplicationTimer = inapApplicationTimer;
        this.inapTrunkgroupOffset = inapTrunkgroupOffset;
        this.inapTrunkgroupLength = inapTrunkgroupLength;
        this.inapSwitchOffset = inapSwitchOffset;
        this.inapSwitchLength = inapSwitchLength;
        this.initialdpSspId = initialdpSspId;
        this.inapApplicationContextName = inapApplicationContextName;
    }


    /**
     * Gets the inapMessageId value for this InapQueryProfile.
     * 
     * @return inapMessageId
     */
    public java.lang.String getInapMessageId() {
        return inapMessageId;
    }


    /**
     * Sets the inapMessageId value for this InapQueryProfile.
     * 
     * @param inapMessageId
     */
    public void setInapMessageId(java.lang.String inapMessageId) {
        this.inapMessageId = inapMessageId;
    }


    /**
     * Gets the inapOperationCode value for this InapQueryProfile.
     * 
     * @return inapOperationCode
     */
    public java.lang.Integer getInapOperationCode() {
        return inapOperationCode;
    }


    /**
     * Sets the inapOperationCode value for this InapQueryProfile.
     * 
     * @param inapOperationCode
     */
    public void setInapOperationCode(java.lang.Integer inapOperationCode) {
        this.inapOperationCode = inapOperationCode;
    }


    /**
     * Gets the inapQueryFlags1 value for this InapQueryProfile.
     * 
     * @return inapQueryFlags1
     */
    public java.lang.Integer getInapQueryFlags1() {
        return inapQueryFlags1;
    }


    /**
     * Sets the inapQueryFlags1 value for this InapQueryProfile.
     * 
     * @param inapQueryFlags1
     */
    public void setInapQueryFlags1(java.lang.Integer inapQueryFlags1) {
        this.inapQueryFlags1 = inapQueryFlags1;
    }


    /**
     * Gets the inapQueryFlags2 value for this InapQueryProfile.
     * 
     * @return inapQueryFlags2
     */
    public java.lang.Integer getInapQueryFlags2() {
        return inapQueryFlags2;
    }


    /**
     * Sets the inapQueryFlags2 value for this InapQueryProfile.
     * 
     * @param inapQueryFlags2
     */
    public void setInapQueryFlags2(java.lang.Integer inapQueryFlags2) {
        this.inapQueryFlags2 = inapQueryFlags2;
    }


    /**
     * Gets the inapQueryFlags3 value for this InapQueryProfile.
     * 
     * @return inapQueryFlags3
     */
    public java.lang.Integer getInapQueryFlags3() {
        return inapQueryFlags3;
    }


    /**
     * Sets the inapQueryFlags3 value for this InapQueryProfile.
     * 
     * @param inapQueryFlags3
     */
    public void setInapQueryFlags3(java.lang.Integer inapQueryFlags3) {
        this.inapQueryFlags3 = inapQueryFlags3;
    }


    /**
     * Gets the inapUseDefaultFlags value for this InapQueryProfile.
     * 
     * @return inapUseDefaultFlags
     */
    public java.lang.Integer getInapUseDefaultFlags() {
        return inapUseDefaultFlags;
    }


    /**
     * Sets the inapUseDefaultFlags value for this InapQueryProfile.
     * 
     * @param inapUseDefaultFlags
     */
    public void setInapUseDefaultFlags(java.lang.Integer inapUseDefaultFlags) {
        this.inapUseDefaultFlags = inapUseDefaultFlags;
    }


    /**
     * Gets the inapApplicationTimer value for this InapQueryProfile.
     * 
     * @return inapApplicationTimer
     */
    public java.lang.Integer getInapApplicationTimer() {
        return inapApplicationTimer;
    }


    /**
     * Sets the inapApplicationTimer value for this InapQueryProfile.
     * 
     * @param inapApplicationTimer
     */
    public void setInapApplicationTimer(java.lang.Integer inapApplicationTimer) {
        this.inapApplicationTimer = inapApplicationTimer;
    }


    /**
     * Gets the inapTrunkgroupOffset value for this InapQueryProfile.
     * 
     * @return inapTrunkgroupOffset
     */
    public java.lang.Integer getInapTrunkgroupOffset() {
        return inapTrunkgroupOffset;
    }


    /**
     * Sets the inapTrunkgroupOffset value for this InapQueryProfile.
     * 
     * @param inapTrunkgroupOffset
     */
    public void setInapTrunkgroupOffset(java.lang.Integer inapTrunkgroupOffset) {
        this.inapTrunkgroupOffset = inapTrunkgroupOffset;
    }


    /**
     * Gets the inapTrunkgroupLength value for this InapQueryProfile.
     * 
     * @return inapTrunkgroupLength
     */
    public java.lang.Integer getInapTrunkgroupLength() {
        return inapTrunkgroupLength;
    }


    /**
     * Sets the inapTrunkgroupLength value for this InapQueryProfile.
     * 
     * @param inapTrunkgroupLength
     */
    public void setInapTrunkgroupLength(java.lang.Integer inapTrunkgroupLength) {
        this.inapTrunkgroupLength = inapTrunkgroupLength;
    }


    /**
     * Gets the inapSwitchOffset value for this InapQueryProfile.
     * 
     * @return inapSwitchOffset
     */
    public java.lang.Integer getInapSwitchOffset() {
        return inapSwitchOffset;
    }


    /**
     * Sets the inapSwitchOffset value for this InapQueryProfile.
     * 
     * @param inapSwitchOffset
     */
    public void setInapSwitchOffset(java.lang.Integer inapSwitchOffset) {
        this.inapSwitchOffset = inapSwitchOffset;
    }


    /**
     * Gets the inapSwitchLength value for this InapQueryProfile.
     * 
     * @return inapSwitchLength
     */
    public java.lang.Integer getInapSwitchLength() {
        return inapSwitchLength;
    }


    /**
     * Sets the inapSwitchLength value for this InapQueryProfile.
     * 
     * @param inapSwitchLength
     */
    public void setInapSwitchLength(java.lang.Integer inapSwitchLength) {
        this.inapSwitchLength = inapSwitchLength;
    }


    /**
     * Gets the initialdpSspId value for this InapQueryProfile.
     * 
     * @return initialdpSspId
     */
    public java.lang.Integer getInitialdpSspId() {
        return initialdpSspId;
    }


    /**
     * Sets the initialdpSspId value for this InapQueryProfile.
     * 
     * @param initialdpSspId
     */
    public void setInitialdpSspId(java.lang.Integer initialdpSspId) {
        this.initialdpSspId = initialdpSspId;
    }


    /**
     * Gets the inapApplicationContextName value for this InapQueryProfile.
     * 
     * @return inapApplicationContextName
     */
    public java.lang.String getInapApplicationContextName() {
        return inapApplicationContextName;
    }


    /**
     * Sets the inapApplicationContextName value for this InapQueryProfile.
     * 
     * @param inapApplicationContextName
     */
    public void setInapApplicationContextName(java.lang.String inapApplicationContextName) {
        this.inapApplicationContextName = inapApplicationContextName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InapQueryProfile)) return false;
        InapQueryProfile other = (InapQueryProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.inapMessageId==null && other.getInapMessageId()==null) || 
             (this.inapMessageId!=null &&
              this.inapMessageId.equals(other.getInapMessageId()))) &&
            ((this.inapOperationCode==null && other.getInapOperationCode()==null) || 
             (this.inapOperationCode!=null &&
              this.inapOperationCode.equals(other.getInapOperationCode()))) &&
            ((this.inapQueryFlags1==null && other.getInapQueryFlags1()==null) || 
             (this.inapQueryFlags1!=null &&
              this.inapQueryFlags1.equals(other.getInapQueryFlags1()))) &&
            ((this.inapQueryFlags2==null && other.getInapQueryFlags2()==null) || 
             (this.inapQueryFlags2!=null &&
              this.inapQueryFlags2.equals(other.getInapQueryFlags2()))) &&
            ((this.inapQueryFlags3==null && other.getInapQueryFlags3()==null) || 
             (this.inapQueryFlags3!=null &&
              this.inapQueryFlags3.equals(other.getInapQueryFlags3()))) &&
            ((this.inapUseDefaultFlags==null && other.getInapUseDefaultFlags()==null) || 
             (this.inapUseDefaultFlags!=null &&
              this.inapUseDefaultFlags.equals(other.getInapUseDefaultFlags()))) &&
            ((this.inapApplicationTimer==null && other.getInapApplicationTimer()==null) || 
             (this.inapApplicationTimer!=null &&
              this.inapApplicationTimer.equals(other.getInapApplicationTimer()))) &&
            ((this.inapTrunkgroupOffset==null && other.getInapTrunkgroupOffset()==null) || 
             (this.inapTrunkgroupOffset!=null &&
              this.inapTrunkgroupOffset.equals(other.getInapTrunkgroupOffset()))) &&
            ((this.inapTrunkgroupLength==null && other.getInapTrunkgroupLength()==null) || 
             (this.inapTrunkgroupLength!=null &&
              this.inapTrunkgroupLength.equals(other.getInapTrunkgroupLength()))) &&
            ((this.inapSwitchOffset==null && other.getInapSwitchOffset()==null) || 
             (this.inapSwitchOffset!=null &&
              this.inapSwitchOffset.equals(other.getInapSwitchOffset()))) &&
            ((this.inapSwitchLength==null && other.getInapSwitchLength()==null) || 
             (this.inapSwitchLength!=null &&
              this.inapSwitchLength.equals(other.getInapSwitchLength()))) &&
            ((this.initialdpSspId==null && other.getInitialdpSspId()==null) || 
             (this.initialdpSspId!=null &&
              this.initialdpSspId.equals(other.getInitialdpSspId()))) &&
            ((this.inapApplicationContextName==null && other.getInapApplicationContextName()==null) || 
             (this.inapApplicationContextName!=null &&
              this.inapApplicationContextName.equals(other.getInapApplicationContextName())));
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
        if (getInapMessageId() != null) {
            _hashCode += getInapMessageId().hashCode();
        }
        if (getInapOperationCode() != null) {
            _hashCode += getInapOperationCode().hashCode();
        }
        if (getInapQueryFlags1() != null) {
            _hashCode += getInapQueryFlags1().hashCode();
        }
        if (getInapQueryFlags2() != null) {
            _hashCode += getInapQueryFlags2().hashCode();
        }
        if (getInapQueryFlags3() != null) {
            _hashCode += getInapQueryFlags3().hashCode();
        }
        if (getInapUseDefaultFlags() != null) {
            _hashCode += getInapUseDefaultFlags().hashCode();
        }
        if (getInapApplicationTimer() != null) {
            _hashCode += getInapApplicationTimer().hashCode();
        }
        if (getInapTrunkgroupOffset() != null) {
            _hashCode += getInapTrunkgroupOffset().hashCode();
        }
        if (getInapTrunkgroupLength() != null) {
            _hashCode += getInapTrunkgroupLength().hashCode();
        }
        if (getInapSwitchOffset() != null) {
            _hashCode += getInapSwitchOffset().hashCode();
        }
        if (getInapSwitchLength() != null) {
            _hashCode += getInapSwitchLength().hashCode();
        }
        if (getInitialdpSspId() != null) {
            _hashCode += getInitialdpSspId().hashCode();
        }
        if (getInapApplicationContextName() != null) {
            _hashCode += getInapApplicationContextName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InapQueryProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InapQueryProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapOperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapQueryFlags1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapQueryFlags1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapQueryFlags2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapQueryFlags2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapQueryFlags3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapQueryFlags3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapUseDefaultFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapUseDefaultFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapApplicationTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapApplicationTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapTrunkgroupOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapTrunkgroupOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapTrunkgroupLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapTrunkgroupLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapSwitchOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapSwitchOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapSwitchLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapSwitchLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialdpSspId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initialdpSspId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapApplicationContextName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapApplicationContextName"));
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
