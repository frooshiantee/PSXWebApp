/**
 * MobileQueryProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class MobileQueryProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String mobileMessageId;

    private java.lang.Integer mobileOperationCode;

    private java.lang.Integer mobileQueryFlags1;

    private java.lang.Integer mobileQueryFlags2;

    private java.lang.Integer useDefaultFlags;

    private java.lang.Integer billMarketId;

    private java.lang.Integer mscMarketId;

    private java.lang.String pointCode;

    private java.lang.Short subSystemNumber;

    private java.lang.Short calledNoa;

    private java.lang.Short calledNpi;

    private java.lang.Short callingNoa;

    private java.lang.Short callingNpi;

    private java.lang.Short callingPartyPresentation;

    private java.lang.Short callingPartyScreening;

    private java.lang.String carrierId;

    private java.lang.Integer transactionCapability;

    private java.lang.Short systemMyTypeCode;

    private java.lang.Integer messageTimeout;

    private java.lang.Integer requestTimeout;

    private java.lang.Short appContextVersion;

    private java.lang.String pmRuleId;

    private java.lang.Integer gttTranslationType;

    private java.lang.Short supportedCamelPhase;

    private java.lang.Integer mobileQueryFlags3;

    private java.lang.Integer mtrrRequestTimeout;

    public MobileQueryProfile() {
    }

    public MobileQueryProfile(
           java.lang.String mobileMessageId,
           java.lang.Integer mobileOperationCode,
           java.lang.Integer mobileQueryFlags1,
           java.lang.Integer mobileQueryFlags2,
           java.lang.Integer useDefaultFlags,
           java.lang.Integer billMarketId,
           java.lang.Integer mscMarketId,
           java.lang.String pointCode,
           java.lang.Short subSystemNumber,
           java.lang.Short calledNoa,
           java.lang.Short calledNpi,
           java.lang.Short callingNoa,
           java.lang.Short callingNpi,
           java.lang.Short callingPartyPresentation,
           java.lang.Short callingPartyScreening,
           java.lang.String carrierId,
           java.lang.Integer transactionCapability,
           java.lang.Short systemMyTypeCode,
           java.lang.Integer messageTimeout,
           java.lang.Integer requestTimeout,
           java.lang.Short appContextVersion,
           java.lang.String pmRuleId,
           java.lang.Integer gttTranslationType,
           java.lang.Short supportedCamelPhase,
           java.lang.Integer mobileQueryFlags3,
           java.lang.Integer mtrrRequestTimeout) {
        this.mobileMessageId = mobileMessageId;
        this.mobileOperationCode = mobileOperationCode;
        this.mobileQueryFlags1 = mobileQueryFlags1;
        this.mobileQueryFlags2 = mobileQueryFlags2;
        this.useDefaultFlags = useDefaultFlags;
        this.billMarketId = billMarketId;
        this.mscMarketId = mscMarketId;
        this.pointCode = pointCode;
        this.subSystemNumber = subSystemNumber;
        this.calledNoa = calledNoa;
        this.calledNpi = calledNpi;
        this.callingNoa = callingNoa;
        this.callingNpi = callingNpi;
        this.callingPartyPresentation = callingPartyPresentation;
        this.callingPartyScreening = callingPartyScreening;
        this.carrierId = carrierId;
        this.transactionCapability = transactionCapability;
        this.systemMyTypeCode = systemMyTypeCode;
        this.messageTimeout = messageTimeout;
        this.requestTimeout = requestTimeout;
        this.appContextVersion = appContextVersion;
        this.pmRuleId = pmRuleId;
        this.gttTranslationType = gttTranslationType;
        this.supportedCamelPhase = supportedCamelPhase;
        this.mobileQueryFlags3 = mobileQueryFlags3;
        this.mtrrRequestTimeout = mtrrRequestTimeout;
    }


    /**
     * Gets the mobileMessageId value for this MobileQueryProfile.
     * 
     * @return mobileMessageId
     */
    public java.lang.String getMobileMessageId() {
        return mobileMessageId;
    }


    /**
     * Sets the mobileMessageId value for this MobileQueryProfile.
     * 
     * @param mobileMessageId
     */
    public void setMobileMessageId(java.lang.String mobileMessageId) {
        this.mobileMessageId = mobileMessageId;
    }


    /**
     * Gets the mobileOperationCode value for this MobileQueryProfile.
     * 
     * @return mobileOperationCode
     */
    public java.lang.Integer getMobileOperationCode() {
        return mobileOperationCode;
    }


    /**
     * Sets the mobileOperationCode value for this MobileQueryProfile.
     * 
     * @param mobileOperationCode
     */
    public void setMobileOperationCode(java.lang.Integer mobileOperationCode) {
        this.mobileOperationCode = mobileOperationCode;
    }


    /**
     * Gets the mobileQueryFlags1 value for this MobileQueryProfile.
     * 
     * @return mobileQueryFlags1
     */
    public java.lang.Integer getMobileQueryFlags1() {
        return mobileQueryFlags1;
    }


    /**
     * Sets the mobileQueryFlags1 value for this MobileQueryProfile.
     * 
     * @param mobileQueryFlags1
     */
    public void setMobileQueryFlags1(java.lang.Integer mobileQueryFlags1) {
        this.mobileQueryFlags1 = mobileQueryFlags1;
    }


    /**
     * Gets the mobileQueryFlags2 value for this MobileQueryProfile.
     * 
     * @return mobileQueryFlags2
     */
    public java.lang.Integer getMobileQueryFlags2() {
        return mobileQueryFlags2;
    }


    /**
     * Sets the mobileQueryFlags2 value for this MobileQueryProfile.
     * 
     * @param mobileQueryFlags2
     */
    public void setMobileQueryFlags2(java.lang.Integer mobileQueryFlags2) {
        this.mobileQueryFlags2 = mobileQueryFlags2;
    }


    /**
     * Gets the useDefaultFlags value for this MobileQueryProfile.
     * 
     * @return useDefaultFlags
     */
    public java.lang.Integer getUseDefaultFlags() {
        return useDefaultFlags;
    }


    /**
     * Sets the useDefaultFlags value for this MobileQueryProfile.
     * 
     * @param useDefaultFlags
     */
    public void setUseDefaultFlags(java.lang.Integer useDefaultFlags) {
        this.useDefaultFlags = useDefaultFlags;
    }


    /**
     * Gets the billMarketId value for this MobileQueryProfile.
     * 
     * @return billMarketId
     */
    public java.lang.Integer getBillMarketId() {
        return billMarketId;
    }


    /**
     * Sets the billMarketId value for this MobileQueryProfile.
     * 
     * @param billMarketId
     */
    public void setBillMarketId(java.lang.Integer billMarketId) {
        this.billMarketId = billMarketId;
    }


    /**
     * Gets the mscMarketId value for this MobileQueryProfile.
     * 
     * @return mscMarketId
     */
    public java.lang.Integer getMscMarketId() {
        return mscMarketId;
    }


    /**
     * Sets the mscMarketId value for this MobileQueryProfile.
     * 
     * @param mscMarketId
     */
    public void setMscMarketId(java.lang.Integer mscMarketId) {
        this.mscMarketId = mscMarketId;
    }


    /**
     * Gets the pointCode value for this MobileQueryProfile.
     * 
     * @return pointCode
     */
    public java.lang.String getPointCode() {
        return pointCode;
    }


    /**
     * Sets the pointCode value for this MobileQueryProfile.
     * 
     * @param pointCode
     */
    public void setPointCode(java.lang.String pointCode) {
        this.pointCode = pointCode;
    }


    /**
     * Gets the subSystemNumber value for this MobileQueryProfile.
     * 
     * @return subSystemNumber
     */
    public java.lang.Short getSubSystemNumber() {
        return subSystemNumber;
    }


    /**
     * Sets the subSystemNumber value for this MobileQueryProfile.
     * 
     * @param subSystemNumber
     */
    public void setSubSystemNumber(java.lang.Short subSystemNumber) {
        this.subSystemNumber = subSystemNumber;
    }


    /**
     * Gets the calledNoa value for this MobileQueryProfile.
     * 
     * @return calledNoa
     */
    public java.lang.Short getCalledNoa() {
        return calledNoa;
    }


    /**
     * Sets the calledNoa value for this MobileQueryProfile.
     * 
     * @param calledNoa
     */
    public void setCalledNoa(java.lang.Short calledNoa) {
        this.calledNoa = calledNoa;
    }


    /**
     * Gets the calledNpi value for this MobileQueryProfile.
     * 
     * @return calledNpi
     */
    public java.lang.Short getCalledNpi() {
        return calledNpi;
    }


    /**
     * Sets the calledNpi value for this MobileQueryProfile.
     * 
     * @param calledNpi
     */
    public void setCalledNpi(java.lang.Short calledNpi) {
        this.calledNpi = calledNpi;
    }


    /**
     * Gets the callingNoa value for this MobileQueryProfile.
     * 
     * @return callingNoa
     */
    public java.lang.Short getCallingNoa() {
        return callingNoa;
    }


    /**
     * Sets the callingNoa value for this MobileQueryProfile.
     * 
     * @param callingNoa
     */
    public void setCallingNoa(java.lang.Short callingNoa) {
        this.callingNoa = callingNoa;
    }


    /**
     * Gets the callingNpi value for this MobileQueryProfile.
     * 
     * @return callingNpi
     */
    public java.lang.Short getCallingNpi() {
        return callingNpi;
    }


    /**
     * Sets the callingNpi value for this MobileQueryProfile.
     * 
     * @param callingNpi
     */
    public void setCallingNpi(java.lang.Short callingNpi) {
        this.callingNpi = callingNpi;
    }


    /**
     * Gets the callingPartyPresentation value for this MobileQueryProfile.
     * 
     * @return callingPartyPresentation
     */
    public java.lang.Short getCallingPartyPresentation() {
        return callingPartyPresentation;
    }


    /**
     * Sets the callingPartyPresentation value for this MobileQueryProfile.
     * 
     * @param callingPartyPresentation
     */
    public void setCallingPartyPresentation(java.lang.Short callingPartyPresentation) {
        this.callingPartyPresentation = callingPartyPresentation;
    }


    /**
     * Gets the callingPartyScreening value for this MobileQueryProfile.
     * 
     * @return callingPartyScreening
     */
    public java.lang.Short getCallingPartyScreening() {
        return callingPartyScreening;
    }


    /**
     * Sets the callingPartyScreening value for this MobileQueryProfile.
     * 
     * @param callingPartyScreening
     */
    public void setCallingPartyScreening(java.lang.Short callingPartyScreening) {
        this.callingPartyScreening = callingPartyScreening;
    }


    /**
     * Gets the carrierId value for this MobileQueryProfile.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this MobileQueryProfile.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the transactionCapability value for this MobileQueryProfile.
     * 
     * @return transactionCapability
     */
    public java.lang.Integer getTransactionCapability() {
        return transactionCapability;
    }


    /**
     * Sets the transactionCapability value for this MobileQueryProfile.
     * 
     * @param transactionCapability
     */
    public void setTransactionCapability(java.lang.Integer transactionCapability) {
        this.transactionCapability = transactionCapability;
    }


    /**
     * Gets the systemMyTypeCode value for this MobileQueryProfile.
     * 
     * @return systemMyTypeCode
     */
    public java.lang.Short getSystemMyTypeCode() {
        return systemMyTypeCode;
    }


    /**
     * Sets the systemMyTypeCode value for this MobileQueryProfile.
     * 
     * @param systemMyTypeCode
     */
    public void setSystemMyTypeCode(java.lang.Short systemMyTypeCode) {
        this.systemMyTypeCode = systemMyTypeCode;
    }


    /**
     * Gets the messageTimeout value for this MobileQueryProfile.
     * 
     * @return messageTimeout
     */
    public java.lang.Integer getMessageTimeout() {
        return messageTimeout;
    }


    /**
     * Sets the messageTimeout value for this MobileQueryProfile.
     * 
     * @param messageTimeout
     */
    public void setMessageTimeout(java.lang.Integer messageTimeout) {
        this.messageTimeout = messageTimeout;
    }


    /**
     * Gets the requestTimeout value for this MobileQueryProfile.
     * 
     * @return requestTimeout
     */
    public java.lang.Integer getRequestTimeout() {
        return requestTimeout;
    }


    /**
     * Sets the requestTimeout value for this MobileQueryProfile.
     * 
     * @param requestTimeout
     */
    public void setRequestTimeout(java.lang.Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
    }


    /**
     * Gets the appContextVersion value for this MobileQueryProfile.
     * 
     * @return appContextVersion
     */
    public java.lang.Short getAppContextVersion() {
        return appContextVersion;
    }


    /**
     * Sets the appContextVersion value for this MobileQueryProfile.
     * 
     * @param appContextVersion
     */
    public void setAppContextVersion(java.lang.Short appContextVersion) {
        this.appContextVersion = appContextVersion;
    }


    /**
     * Gets the pmRuleId value for this MobileQueryProfile.
     * 
     * @return pmRuleId
     */
    public java.lang.String getPmRuleId() {
        return pmRuleId;
    }


    /**
     * Sets the pmRuleId value for this MobileQueryProfile.
     * 
     * @param pmRuleId
     */
    public void setPmRuleId(java.lang.String pmRuleId) {
        this.pmRuleId = pmRuleId;
    }


    /**
     * Gets the gttTranslationType value for this MobileQueryProfile.
     * 
     * @return gttTranslationType
     */
    public java.lang.Integer getGttTranslationType() {
        return gttTranslationType;
    }


    /**
     * Sets the gttTranslationType value for this MobileQueryProfile.
     * 
     * @param gttTranslationType
     */
    public void setGttTranslationType(java.lang.Integer gttTranslationType) {
        this.gttTranslationType = gttTranslationType;
    }


    /**
     * Gets the supportedCamelPhase value for this MobileQueryProfile.
     * 
     * @return supportedCamelPhase
     */
    public java.lang.Short getSupportedCamelPhase() {
        return supportedCamelPhase;
    }


    /**
     * Sets the supportedCamelPhase value for this MobileQueryProfile.
     * 
     * @param supportedCamelPhase
     */
    public void setSupportedCamelPhase(java.lang.Short supportedCamelPhase) {
        this.supportedCamelPhase = supportedCamelPhase;
    }


    /**
     * Gets the mobileQueryFlags3 value for this MobileQueryProfile.
     * 
     * @return mobileQueryFlags3
     */
    public java.lang.Integer getMobileQueryFlags3() {
        return mobileQueryFlags3;
    }


    /**
     * Sets the mobileQueryFlags3 value for this MobileQueryProfile.
     * 
     * @param mobileQueryFlags3
     */
    public void setMobileQueryFlags3(java.lang.Integer mobileQueryFlags3) {
        this.mobileQueryFlags3 = mobileQueryFlags3;
    }


    /**
     * Gets the mtrrRequestTimeout value for this MobileQueryProfile.
     * 
     * @return mtrrRequestTimeout
     */
    public java.lang.Integer getMtrrRequestTimeout() {
        return mtrrRequestTimeout;
    }


    /**
     * Sets the mtrrRequestTimeout value for this MobileQueryProfile.
     * 
     * @param mtrrRequestTimeout
     */
    public void setMtrrRequestTimeout(java.lang.Integer mtrrRequestTimeout) {
        this.mtrrRequestTimeout = mtrrRequestTimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileQueryProfile)) return false;
        MobileQueryProfile other = (MobileQueryProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mobileMessageId==null && other.getMobileMessageId()==null) || 
             (this.mobileMessageId!=null &&
              this.mobileMessageId.equals(other.getMobileMessageId()))) &&
            ((this.mobileOperationCode==null && other.getMobileOperationCode()==null) || 
             (this.mobileOperationCode!=null &&
              this.mobileOperationCode.equals(other.getMobileOperationCode()))) &&
            ((this.mobileQueryFlags1==null && other.getMobileQueryFlags1()==null) || 
             (this.mobileQueryFlags1!=null &&
              this.mobileQueryFlags1.equals(other.getMobileQueryFlags1()))) &&
            ((this.mobileQueryFlags2==null && other.getMobileQueryFlags2()==null) || 
             (this.mobileQueryFlags2!=null &&
              this.mobileQueryFlags2.equals(other.getMobileQueryFlags2()))) &&
            ((this.useDefaultFlags==null && other.getUseDefaultFlags()==null) || 
             (this.useDefaultFlags!=null &&
              this.useDefaultFlags.equals(other.getUseDefaultFlags()))) &&
            ((this.billMarketId==null && other.getBillMarketId()==null) || 
             (this.billMarketId!=null &&
              this.billMarketId.equals(other.getBillMarketId()))) &&
            ((this.mscMarketId==null && other.getMscMarketId()==null) || 
             (this.mscMarketId!=null &&
              this.mscMarketId.equals(other.getMscMarketId()))) &&
            ((this.pointCode==null && other.getPointCode()==null) || 
             (this.pointCode!=null &&
              this.pointCode.equals(other.getPointCode()))) &&
            ((this.subSystemNumber==null && other.getSubSystemNumber()==null) || 
             (this.subSystemNumber!=null &&
              this.subSystemNumber.equals(other.getSubSystemNumber()))) &&
            ((this.calledNoa==null && other.getCalledNoa()==null) || 
             (this.calledNoa!=null &&
              this.calledNoa.equals(other.getCalledNoa()))) &&
            ((this.calledNpi==null && other.getCalledNpi()==null) || 
             (this.calledNpi!=null &&
              this.calledNpi.equals(other.getCalledNpi()))) &&
            ((this.callingNoa==null && other.getCallingNoa()==null) || 
             (this.callingNoa!=null &&
              this.callingNoa.equals(other.getCallingNoa()))) &&
            ((this.callingNpi==null && other.getCallingNpi()==null) || 
             (this.callingNpi!=null &&
              this.callingNpi.equals(other.getCallingNpi()))) &&
            ((this.callingPartyPresentation==null && other.getCallingPartyPresentation()==null) || 
             (this.callingPartyPresentation!=null &&
              this.callingPartyPresentation.equals(other.getCallingPartyPresentation()))) &&
            ((this.callingPartyScreening==null && other.getCallingPartyScreening()==null) || 
             (this.callingPartyScreening!=null &&
              this.callingPartyScreening.equals(other.getCallingPartyScreening()))) &&
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId()))) &&
            ((this.transactionCapability==null && other.getTransactionCapability()==null) || 
             (this.transactionCapability!=null &&
              this.transactionCapability.equals(other.getTransactionCapability()))) &&
            ((this.systemMyTypeCode==null && other.getSystemMyTypeCode()==null) || 
             (this.systemMyTypeCode!=null &&
              this.systemMyTypeCode.equals(other.getSystemMyTypeCode()))) &&
            ((this.messageTimeout==null && other.getMessageTimeout()==null) || 
             (this.messageTimeout!=null &&
              this.messageTimeout.equals(other.getMessageTimeout()))) &&
            ((this.requestTimeout==null && other.getRequestTimeout()==null) || 
             (this.requestTimeout!=null &&
              this.requestTimeout.equals(other.getRequestTimeout()))) &&
            ((this.appContextVersion==null && other.getAppContextVersion()==null) || 
             (this.appContextVersion!=null &&
              this.appContextVersion.equals(other.getAppContextVersion()))) &&
            ((this.pmRuleId==null && other.getPmRuleId()==null) || 
             (this.pmRuleId!=null &&
              this.pmRuleId.equals(other.getPmRuleId()))) &&
            ((this.gttTranslationType==null && other.getGttTranslationType()==null) || 
             (this.gttTranslationType!=null &&
              this.gttTranslationType.equals(other.getGttTranslationType()))) &&
            ((this.supportedCamelPhase==null && other.getSupportedCamelPhase()==null) || 
             (this.supportedCamelPhase!=null &&
              this.supportedCamelPhase.equals(other.getSupportedCamelPhase()))) &&
            ((this.mobileQueryFlags3==null && other.getMobileQueryFlags3()==null) || 
             (this.mobileQueryFlags3!=null &&
              this.mobileQueryFlags3.equals(other.getMobileQueryFlags3()))) &&
            ((this.mtrrRequestTimeout==null && other.getMtrrRequestTimeout()==null) || 
             (this.mtrrRequestTimeout!=null &&
              this.mtrrRequestTimeout.equals(other.getMtrrRequestTimeout())));
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
        if (getMobileMessageId() != null) {
            _hashCode += getMobileMessageId().hashCode();
        }
        if (getMobileOperationCode() != null) {
            _hashCode += getMobileOperationCode().hashCode();
        }
        if (getMobileQueryFlags1() != null) {
            _hashCode += getMobileQueryFlags1().hashCode();
        }
        if (getMobileQueryFlags2() != null) {
            _hashCode += getMobileQueryFlags2().hashCode();
        }
        if (getUseDefaultFlags() != null) {
            _hashCode += getUseDefaultFlags().hashCode();
        }
        if (getBillMarketId() != null) {
            _hashCode += getBillMarketId().hashCode();
        }
        if (getMscMarketId() != null) {
            _hashCode += getMscMarketId().hashCode();
        }
        if (getPointCode() != null) {
            _hashCode += getPointCode().hashCode();
        }
        if (getSubSystemNumber() != null) {
            _hashCode += getSubSystemNumber().hashCode();
        }
        if (getCalledNoa() != null) {
            _hashCode += getCalledNoa().hashCode();
        }
        if (getCalledNpi() != null) {
            _hashCode += getCalledNpi().hashCode();
        }
        if (getCallingNoa() != null) {
            _hashCode += getCallingNoa().hashCode();
        }
        if (getCallingNpi() != null) {
            _hashCode += getCallingNpi().hashCode();
        }
        if (getCallingPartyPresentation() != null) {
            _hashCode += getCallingPartyPresentation().hashCode();
        }
        if (getCallingPartyScreening() != null) {
            _hashCode += getCallingPartyScreening().hashCode();
        }
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        if (getTransactionCapability() != null) {
            _hashCode += getTransactionCapability().hashCode();
        }
        if (getSystemMyTypeCode() != null) {
            _hashCode += getSystemMyTypeCode().hashCode();
        }
        if (getMessageTimeout() != null) {
            _hashCode += getMessageTimeout().hashCode();
        }
        if (getRequestTimeout() != null) {
            _hashCode += getRequestTimeout().hashCode();
        }
        if (getAppContextVersion() != null) {
            _hashCode += getAppContextVersion().hashCode();
        }
        if (getPmRuleId() != null) {
            _hashCode += getPmRuleId().hashCode();
        }
        if (getGttTranslationType() != null) {
            _hashCode += getGttTranslationType().hashCode();
        }
        if (getSupportedCamelPhase() != null) {
            _hashCode += getSupportedCamelPhase().hashCode();
        }
        if (getMobileQueryFlags3() != null) {
            _hashCode += getMobileQueryFlags3().hashCode();
        }
        if (getMtrrRequestTimeout() != null) {
            _hashCode += getMtrrRequestTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileQueryProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MobileQueryProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileOperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileQueryFlags1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileQueryFlags1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileQueryFlags2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileQueryFlags2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDefaultFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useDefaultFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billMarketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billMarketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mscMarketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mscMarketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSystemNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subSystemNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledNoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNpi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledNpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNpi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingPartyPresentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingPartyPresentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingPartyScreening");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingPartyScreening"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemMyTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemMyTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appContextVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appContextVersion"));
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
        elemField.setFieldName("gttTranslationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gttTranslationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedCamelPhase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportedCamelPhase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileQueryFlags3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileQueryFlags3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtrrRequestTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtrrRequestTimeout"));
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
