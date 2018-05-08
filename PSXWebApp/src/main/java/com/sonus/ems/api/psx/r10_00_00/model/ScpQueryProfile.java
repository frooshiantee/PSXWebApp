/**
 * ScpQueryProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ScpQueryProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String scpAinMessageId;
    private java.lang.Short scpOperationCode;
    private java.lang.Short userIdFormat;
    private java.lang.Short bearerCapabilityDefault;
    private java.lang.Short chargeStationDefault;
    private java.lang.Integer scpQueryFlags;
    private java.lang.Integer scpQueryFlags2;
    private java.lang.Integer scpQueryFlags3;
    private java.lang.Short trunkgroupOffset;
    private java.lang.Short trunkgroupLength;
    private java.lang.Short switchOffset;
    private java.lang.Short switchLength;
    private java.lang.Short trunkgroupTreatment;
    private java.lang.Integer useDefaultFlags;
    private java.lang.Short calledNoa;
    private java.lang.Short calledNpi;
    private java.lang.String assignmentAuthority;
    private java.lang.Short collectedAddrNoa;
    private java.lang.Short collectedAddrNpi;
    private java.lang.Short collectedDigitsNoa;
    private java.lang.Short collectedDigitsNpi;
    private java.lang.Short scpBsgSource;
    private java.lang.Integer extensionParameterFlags;
    private java.lang.Short collectedAddrSource;
    private java.lang.Short callingNoa;
    private java.lang.Short callingNpi;
    private java.lang.String lataId;
    private java.lang.Integer scpQueryFlags4;
    private java.lang.Integer scpQueryFlags5;
    private java.lang.Integer tstrcTimer;
    private java.lang.String scriptId;

    public ScpQueryProfile() {
    }

    public ScpQueryProfile(
           java.lang.String scpAinMessageId,
           java.lang.Short scpOperationCode,
           java.lang.Short userIdFormat,
           java.lang.Short bearerCapabilityDefault,
           java.lang.Short chargeStationDefault,
           java.lang.Integer scpQueryFlags,
           java.lang.Integer scpQueryFlags2,
           java.lang.Integer scpQueryFlags3,
           java.lang.Short trunkgroupOffset,
           java.lang.Short trunkgroupLength,
           java.lang.Short switchOffset,
           java.lang.Short switchLength,
           java.lang.Short trunkgroupTreatment,
           java.lang.Integer useDefaultFlags,
           java.lang.Short calledNoa,
           java.lang.Short calledNpi,
           java.lang.String assignmentAuthority,
           java.lang.Short collectedAddrNoa,
           java.lang.Short collectedAddrNpi,
           java.lang.Short collectedDigitsNoa,
           java.lang.Short collectedDigitsNpi,
           java.lang.Short scpBsgSource,
           java.lang.Integer extensionParameterFlags,
           java.lang.Short collectedAddrSource,
           java.lang.Short callingNoa,
           java.lang.Short callingNpi,
           java.lang.String lataId,
           java.lang.Integer scpQueryFlags4,
           java.lang.Integer scpQueryFlags5,
           java.lang.Integer tstrcTimer,
           java.lang.String scriptId) {
           this.scpAinMessageId = scpAinMessageId;
           this.scpOperationCode = scpOperationCode;
           this.userIdFormat = userIdFormat;
           this.bearerCapabilityDefault = bearerCapabilityDefault;
           this.chargeStationDefault = chargeStationDefault;
           this.scpQueryFlags = scpQueryFlags;
           this.scpQueryFlags2 = scpQueryFlags2;
           this.scpQueryFlags3 = scpQueryFlags3;
           this.trunkgroupOffset = trunkgroupOffset;
           this.trunkgroupLength = trunkgroupLength;
           this.switchOffset = switchOffset;
           this.switchLength = switchLength;
           this.trunkgroupTreatment = trunkgroupTreatment;
           this.useDefaultFlags = useDefaultFlags;
           this.calledNoa = calledNoa;
           this.calledNpi = calledNpi;
           this.assignmentAuthority = assignmentAuthority;
           this.collectedAddrNoa = collectedAddrNoa;
           this.collectedAddrNpi = collectedAddrNpi;
           this.collectedDigitsNoa = collectedDigitsNoa;
           this.collectedDigitsNpi = collectedDigitsNpi;
           this.scpBsgSource = scpBsgSource;
           this.extensionParameterFlags = extensionParameterFlags;
           this.collectedAddrSource = collectedAddrSource;
           this.callingNoa = callingNoa;
           this.callingNpi = callingNpi;
           this.lataId = lataId;
           this.scpQueryFlags4 = scpQueryFlags4;
           this.scpQueryFlags5 = scpQueryFlags5;
           this.tstrcTimer = tstrcTimer;
           this.scriptId = scriptId;
    }


    /**
     * Gets the scpAinMessageId value for this ScpQueryProfile.
     * 
     * @return scpAinMessageId
     */
    public java.lang.String getScpAinMessageId() {
        return scpAinMessageId;
    }


    /**
     * Sets the scpAinMessageId value for this ScpQueryProfile.
     * 
     * @param scpAinMessageId
     */
    public void setScpAinMessageId(java.lang.String scpAinMessageId) {
        this.scpAinMessageId = scpAinMessageId;
    }


    /**
     * Gets the scpOperationCode value for this ScpQueryProfile.
     * 
     * @return scpOperationCode
     */
    public java.lang.Short getScpOperationCode() {
        return scpOperationCode;
    }


    /**
     * Sets the scpOperationCode value for this ScpQueryProfile.
     * 
     * @param scpOperationCode
     */
    public void setScpOperationCode(java.lang.Short scpOperationCode) {
        this.scpOperationCode = scpOperationCode;
    }


    /**
     * Gets the userIdFormat value for this ScpQueryProfile.
     * 
     * @return userIdFormat
     */
    public java.lang.Short getUserIdFormat() {
        return userIdFormat;
    }


    /**
     * Sets the userIdFormat value for this ScpQueryProfile.
     * 
     * @param userIdFormat
     */
    public void setUserIdFormat(java.lang.Short userIdFormat) {
        this.userIdFormat = userIdFormat;
    }


    /**
     * Gets the bearerCapabilityDefault value for this ScpQueryProfile.
     * 
     * @return bearerCapabilityDefault
     */
    public java.lang.Short getBearerCapabilityDefault() {
        return bearerCapabilityDefault;
    }


    /**
     * Sets the bearerCapabilityDefault value for this ScpQueryProfile.
     * 
     * @param bearerCapabilityDefault
     */
    public void setBearerCapabilityDefault(java.lang.Short bearerCapabilityDefault) {
        this.bearerCapabilityDefault = bearerCapabilityDefault;
    }


    /**
     * Gets the chargeStationDefault value for this ScpQueryProfile.
     * 
     * @return chargeStationDefault
     */
    public java.lang.Short getChargeStationDefault() {
        return chargeStationDefault;
    }


    /**
     * Sets the chargeStationDefault value for this ScpQueryProfile.
     * 
     * @param chargeStationDefault
     */
    public void setChargeStationDefault(java.lang.Short chargeStationDefault) {
        this.chargeStationDefault = chargeStationDefault;
    }


    /**
     * Gets the scpQueryFlags value for this ScpQueryProfile.
     * 
     * @return scpQueryFlags
     */
    public java.lang.Integer getScpQueryFlags() {
        return scpQueryFlags;
    }


    /**
     * Sets the scpQueryFlags value for this ScpQueryProfile.
     * 
     * @param scpQueryFlags
     */
    public void setScpQueryFlags(java.lang.Integer scpQueryFlags) {
        this.scpQueryFlags = scpQueryFlags;
    }


    /**
     * Gets the scpQueryFlags2 value for this ScpQueryProfile.
     * 
     * @return scpQueryFlags2
     */
    public java.lang.Integer getScpQueryFlags2() {
        return scpQueryFlags2;
    }


    /**
     * Sets the scpQueryFlags2 value for this ScpQueryProfile.
     * 
     * @param scpQueryFlags2
     */
    public void setScpQueryFlags2(java.lang.Integer scpQueryFlags2) {
        this.scpQueryFlags2 = scpQueryFlags2;
    }


    /**
     * Gets the scpQueryFlags3 value for this ScpQueryProfile.
     * 
     * @return scpQueryFlags3
     */
    public java.lang.Integer getScpQueryFlags3() {
        return scpQueryFlags3;
    }


    /**
     * Sets the scpQueryFlags3 value for this ScpQueryProfile.
     * 
     * @param scpQueryFlags3
     */
    public void setScpQueryFlags3(java.lang.Integer scpQueryFlags3) {
        this.scpQueryFlags3 = scpQueryFlags3;
    }


    /**
     * Gets the trunkgroupOffset value for this ScpQueryProfile.
     * 
     * @return trunkgroupOffset
     */
    public java.lang.Short getTrunkgroupOffset() {
        return trunkgroupOffset;
    }


    /**
     * Sets the trunkgroupOffset value for this ScpQueryProfile.
     * 
     * @param trunkgroupOffset
     */
    public void setTrunkgroupOffset(java.lang.Short trunkgroupOffset) {
        this.trunkgroupOffset = trunkgroupOffset;
    }


    /**
     * Gets the trunkgroupLength value for this ScpQueryProfile.
     * 
     * @return trunkgroupLength
     */
    public java.lang.Short getTrunkgroupLength() {
        return trunkgroupLength;
    }


    /**
     * Sets the trunkgroupLength value for this ScpQueryProfile.
     * 
     * @param trunkgroupLength
     */
    public void setTrunkgroupLength(java.lang.Short trunkgroupLength) {
        this.trunkgroupLength = trunkgroupLength;
    }


    /**
     * Gets the switchOffset value for this ScpQueryProfile.
     * 
     * @return switchOffset
     */
    public java.lang.Short getSwitchOffset() {
        return switchOffset;
    }


    /**
     * Sets the switchOffset value for this ScpQueryProfile.
     * 
     * @param switchOffset
     */
    public void setSwitchOffset(java.lang.Short switchOffset) {
        this.switchOffset = switchOffset;
    }


    /**
     * Gets the switchLength value for this ScpQueryProfile.
     * 
     * @return switchLength
     */
    public java.lang.Short getSwitchLength() {
        return switchLength;
    }


    /**
     * Sets the switchLength value for this ScpQueryProfile.
     * 
     * @param switchLength
     */
    public void setSwitchLength(java.lang.Short switchLength) {
        this.switchLength = switchLength;
    }


    /**
     * Gets the trunkgroupTreatment value for this ScpQueryProfile.
     * 
     * @return trunkgroupTreatment
     */
    public java.lang.Short getTrunkgroupTreatment() {
        return trunkgroupTreatment;
    }


    /**
     * Sets the trunkgroupTreatment value for this ScpQueryProfile.
     * 
     * @param trunkgroupTreatment
     */
    public void setTrunkgroupTreatment(java.lang.Short trunkgroupTreatment) {
        this.trunkgroupTreatment = trunkgroupTreatment;
    }


    /**
     * Gets the useDefaultFlags value for this ScpQueryProfile.
     * 
     * @return useDefaultFlags
     */
    public java.lang.Integer getUseDefaultFlags() {
        return useDefaultFlags;
    }


    /**
     * Sets the useDefaultFlags value for this ScpQueryProfile.
     * 
     * @param useDefaultFlags
     */
    public void setUseDefaultFlags(java.lang.Integer useDefaultFlags) {
        this.useDefaultFlags = useDefaultFlags;
    }


    /**
     * Gets the calledNoa value for this ScpQueryProfile.
     * 
     * @return calledNoa
     */
    public java.lang.Short getCalledNoa() {
        return calledNoa;
    }


    /**
     * Sets the calledNoa value for this ScpQueryProfile.
     * 
     * @param calledNoa
     */
    public void setCalledNoa(java.lang.Short calledNoa) {
        this.calledNoa = calledNoa;
    }


    /**
     * Gets the calledNpi value for this ScpQueryProfile.
     * 
     * @return calledNpi
     */
    public java.lang.Short getCalledNpi() {
        return calledNpi;
    }


    /**
     * Sets the calledNpi value for this ScpQueryProfile.
     * 
     * @param calledNpi
     */
    public void setCalledNpi(java.lang.Short calledNpi) {
        this.calledNpi = calledNpi;
    }


    /**
     * Gets the assignmentAuthority value for this ScpQueryProfile.
     * 
     * @return assignmentAuthority
     */
    public java.lang.String getAssignmentAuthority() {
        return assignmentAuthority;
    }


    /**
     * Sets the assignmentAuthority value for this ScpQueryProfile.
     * 
     * @param assignmentAuthority
     */
    public void setAssignmentAuthority(java.lang.String assignmentAuthority) {
        this.assignmentAuthority = assignmentAuthority;
    }


    /**
     * Gets the collectedAddrNoa value for this ScpQueryProfile.
     * 
     * @return collectedAddrNoa
     */
    public java.lang.Short getCollectedAddrNoa() {
        return collectedAddrNoa;
    }


    /**
     * Sets the collectedAddrNoa value for this ScpQueryProfile.
     * 
     * @param collectedAddrNoa
     */
    public void setCollectedAddrNoa(java.lang.Short collectedAddrNoa) {
        this.collectedAddrNoa = collectedAddrNoa;
    }


    /**
     * Gets the collectedAddrNpi value for this ScpQueryProfile.
     * 
     * @return collectedAddrNpi
     */
    public java.lang.Short getCollectedAddrNpi() {
        return collectedAddrNpi;
    }


    /**
     * Sets the collectedAddrNpi value for this ScpQueryProfile.
     * 
     * @param collectedAddrNpi
     */
    public void setCollectedAddrNpi(java.lang.Short collectedAddrNpi) {
        this.collectedAddrNpi = collectedAddrNpi;
    }


    /**
     * Gets the collectedDigitsNoa value for this ScpQueryProfile.
     * 
     * @return collectedDigitsNoa
     */
    public java.lang.Short getCollectedDigitsNoa() {
        return collectedDigitsNoa;
    }


    /**
     * Sets the collectedDigitsNoa value for this ScpQueryProfile.
     * 
     * @param collectedDigitsNoa
     */
    public void setCollectedDigitsNoa(java.lang.Short collectedDigitsNoa) {
        this.collectedDigitsNoa = collectedDigitsNoa;
    }


    /**
     * Gets the collectedDigitsNpi value for this ScpQueryProfile.
     * 
     * @return collectedDigitsNpi
     */
    public java.lang.Short getCollectedDigitsNpi() {
        return collectedDigitsNpi;
    }


    /**
     * Sets the collectedDigitsNpi value for this ScpQueryProfile.
     * 
     * @param collectedDigitsNpi
     */
    public void setCollectedDigitsNpi(java.lang.Short collectedDigitsNpi) {
        this.collectedDigitsNpi = collectedDigitsNpi;
    }


    /**
     * Gets the scpBsgSource value for this ScpQueryProfile.
     * 
     * @return scpBsgSource
     */
    public java.lang.Short getScpBsgSource() {
        return scpBsgSource;
    }


    /**
     * Sets the scpBsgSource value for this ScpQueryProfile.
     * 
     * @param scpBsgSource
     */
    public void setScpBsgSource(java.lang.Short scpBsgSource) {
        this.scpBsgSource = scpBsgSource;
    }


    /**
     * Gets the extensionParameterFlags value for this ScpQueryProfile.
     * 
     * @return extensionParameterFlags
     */
    public java.lang.Integer getExtensionParameterFlags() {
        return extensionParameterFlags;
    }


    /**
     * Sets the extensionParameterFlags value for this ScpQueryProfile.
     * 
     * @param extensionParameterFlags
     */
    public void setExtensionParameterFlags(java.lang.Integer extensionParameterFlags) {
        this.extensionParameterFlags = extensionParameterFlags;
    }


    /**
     * Gets the collectedAddrSource value for this ScpQueryProfile.
     * 
     * @return collectedAddrSource
     */
    public java.lang.Short getCollectedAddrSource() {
        return collectedAddrSource;
    }


    /**
     * Sets the collectedAddrSource value for this ScpQueryProfile.
     * 
     * @param collectedAddrSource
     */
    public void setCollectedAddrSource(java.lang.Short collectedAddrSource) {
        this.collectedAddrSource = collectedAddrSource;
    }


    /**
     * Gets the callingNoa value for this ScpQueryProfile.
     * 
     * @return callingNoa
     */
    public java.lang.Short getCallingNoa() {
        return callingNoa;
    }


    /**
     * Sets the callingNoa value for this ScpQueryProfile.
     * 
     * @param callingNoa
     */
    public void setCallingNoa(java.lang.Short callingNoa) {
        this.callingNoa = callingNoa;
    }


    /**
     * Gets the callingNpi value for this ScpQueryProfile.
     * 
     * @return callingNpi
     */
    public java.lang.Short getCallingNpi() {
        return callingNpi;
    }


    /**
     * Sets the callingNpi value for this ScpQueryProfile.
     * 
     * @param callingNpi
     */
    public void setCallingNpi(java.lang.Short callingNpi) {
        this.callingNpi = callingNpi;
    }


    /**
     * Gets the lataId value for this ScpQueryProfile.
     * 
     * @return lataId
     */
    public java.lang.String getLataId() {
        return lataId;
    }


    /**
     * Sets the lataId value for this ScpQueryProfile.
     * 
     * @param lataId
     */
    public void setLataId(java.lang.String lataId) {
        this.lataId = lataId;
    }


    /**
     * Gets the scpQueryFlags4 value for this ScpQueryProfile.
     * 
     * @return scpQueryFlags4
     */
    public java.lang.Integer getScpQueryFlags4() {
        return scpQueryFlags4;
    }


    /**
     * Sets the scpQueryFlags4 value for this ScpQueryProfile.
     * 
     * @param scpQueryFlags4
     */
    public void setScpQueryFlags4(java.lang.Integer scpQueryFlags4) {
        this.scpQueryFlags4 = scpQueryFlags4;
    }


    /**
     * Gets the scpQueryFlags5 value for this ScpQueryProfile.
     * 
     * @return scpQueryFlags5
     */
    public java.lang.Integer getScpQueryFlags5() {
        return scpQueryFlags5;
    }


    /**
     * Sets the scpQueryFlags5 value for this ScpQueryProfile.
     * 
     * @param scpQueryFlags5
     */
    public void setScpQueryFlags5(java.lang.Integer scpQueryFlags5) {
        this.scpQueryFlags5 = scpQueryFlags5;
    }


    /**
     * Gets the tstrcTimer value for this ScpQueryProfile.
     * 
     * @return tstrcTimer
     */
    public java.lang.Integer getTstrcTimer() {
        return tstrcTimer;
    }


    /**
     * Sets the tstrcTimer value for this ScpQueryProfile.
     * 
     * @param tstrcTimer
     */
    public void setTstrcTimer(java.lang.Integer tstrcTimer) {
        this.tstrcTimer = tstrcTimer;
    }


    /**
     * Gets the scriptId value for this ScpQueryProfile.
     * 
     * @return scriptId
     */
    public java.lang.String getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this ScpQueryProfile.
     * 
     * @param scriptId
     */
    public void setScriptId(java.lang.String scriptId) {
        this.scriptId = scriptId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScpQueryProfile)) return false;
        ScpQueryProfile other = (ScpQueryProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scpAinMessageId==null && other.getScpAinMessageId()==null) || 
             (this.scpAinMessageId!=null &&
              this.scpAinMessageId.equals(other.getScpAinMessageId()))) &&
            ((this.scpOperationCode==null && other.getScpOperationCode()==null) || 
             (this.scpOperationCode!=null &&
              this.scpOperationCode.equals(other.getScpOperationCode()))) &&
            ((this.userIdFormat==null && other.getUserIdFormat()==null) || 
             (this.userIdFormat!=null &&
              this.userIdFormat.equals(other.getUserIdFormat()))) &&
            ((this.bearerCapabilityDefault==null && other.getBearerCapabilityDefault()==null) || 
             (this.bearerCapabilityDefault!=null &&
              this.bearerCapabilityDefault.equals(other.getBearerCapabilityDefault()))) &&
            ((this.chargeStationDefault==null && other.getChargeStationDefault()==null) || 
             (this.chargeStationDefault!=null &&
              this.chargeStationDefault.equals(other.getChargeStationDefault()))) &&
            ((this.scpQueryFlags==null && other.getScpQueryFlags()==null) || 
             (this.scpQueryFlags!=null &&
              this.scpQueryFlags.equals(other.getScpQueryFlags()))) &&
            ((this.scpQueryFlags2==null && other.getScpQueryFlags2()==null) || 
             (this.scpQueryFlags2!=null &&
              this.scpQueryFlags2.equals(other.getScpQueryFlags2()))) &&
            ((this.scpQueryFlags3==null && other.getScpQueryFlags3()==null) || 
             (this.scpQueryFlags3!=null &&
              this.scpQueryFlags3.equals(other.getScpQueryFlags3()))) &&
            ((this.trunkgroupOffset==null && other.getTrunkgroupOffset()==null) || 
             (this.trunkgroupOffset!=null &&
              this.trunkgroupOffset.equals(other.getTrunkgroupOffset()))) &&
            ((this.trunkgroupLength==null && other.getTrunkgroupLength()==null) || 
             (this.trunkgroupLength!=null &&
              this.trunkgroupLength.equals(other.getTrunkgroupLength()))) &&
            ((this.switchOffset==null && other.getSwitchOffset()==null) || 
             (this.switchOffset!=null &&
              this.switchOffset.equals(other.getSwitchOffset()))) &&
            ((this.switchLength==null && other.getSwitchLength()==null) || 
             (this.switchLength!=null &&
              this.switchLength.equals(other.getSwitchLength()))) &&
            ((this.trunkgroupTreatment==null && other.getTrunkgroupTreatment()==null) || 
             (this.trunkgroupTreatment!=null &&
              this.trunkgroupTreatment.equals(other.getTrunkgroupTreatment()))) &&
            ((this.useDefaultFlags==null && other.getUseDefaultFlags()==null) || 
             (this.useDefaultFlags!=null &&
              this.useDefaultFlags.equals(other.getUseDefaultFlags()))) &&
            ((this.calledNoa==null && other.getCalledNoa()==null) || 
             (this.calledNoa!=null &&
              this.calledNoa.equals(other.getCalledNoa()))) &&
            ((this.calledNpi==null && other.getCalledNpi()==null) || 
             (this.calledNpi!=null &&
              this.calledNpi.equals(other.getCalledNpi()))) &&
            ((this.assignmentAuthority==null && other.getAssignmentAuthority()==null) || 
             (this.assignmentAuthority!=null &&
              this.assignmentAuthority.equals(other.getAssignmentAuthority()))) &&
            ((this.collectedAddrNoa==null && other.getCollectedAddrNoa()==null) || 
             (this.collectedAddrNoa!=null &&
              this.collectedAddrNoa.equals(other.getCollectedAddrNoa()))) &&
            ((this.collectedAddrNpi==null && other.getCollectedAddrNpi()==null) || 
             (this.collectedAddrNpi!=null &&
              this.collectedAddrNpi.equals(other.getCollectedAddrNpi()))) &&
            ((this.collectedDigitsNoa==null && other.getCollectedDigitsNoa()==null) || 
             (this.collectedDigitsNoa!=null &&
              this.collectedDigitsNoa.equals(other.getCollectedDigitsNoa()))) &&
            ((this.collectedDigitsNpi==null && other.getCollectedDigitsNpi()==null) || 
             (this.collectedDigitsNpi!=null &&
              this.collectedDigitsNpi.equals(other.getCollectedDigitsNpi()))) &&
            ((this.scpBsgSource==null && other.getScpBsgSource()==null) || 
             (this.scpBsgSource!=null &&
              this.scpBsgSource.equals(other.getScpBsgSource()))) &&
            ((this.extensionParameterFlags==null && other.getExtensionParameterFlags()==null) || 
             (this.extensionParameterFlags!=null &&
              this.extensionParameterFlags.equals(other.getExtensionParameterFlags()))) &&
            ((this.collectedAddrSource==null && other.getCollectedAddrSource()==null) || 
             (this.collectedAddrSource!=null &&
              this.collectedAddrSource.equals(other.getCollectedAddrSource()))) &&
            ((this.callingNoa==null && other.getCallingNoa()==null) || 
             (this.callingNoa!=null &&
              this.callingNoa.equals(other.getCallingNoa()))) &&
            ((this.callingNpi==null && other.getCallingNpi()==null) || 
             (this.callingNpi!=null &&
              this.callingNpi.equals(other.getCallingNpi()))) &&
            ((this.lataId==null && other.getLataId()==null) || 
             (this.lataId!=null &&
              this.lataId.equals(other.getLataId()))) &&
            ((this.scpQueryFlags4==null && other.getScpQueryFlags4()==null) || 
             (this.scpQueryFlags4!=null &&
              this.scpQueryFlags4.equals(other.getScpQueryFlags4()))) &&
            ((this.scpQueryFlags5==null && other.getScpQueryFlags5()==null) || 
             (this.scpQueryFlags5!=null &&
              this.scpQueryFlags5.equals(other.getScpQueryFlags5()))) &&
            ((this.tstrcTimer==null && other.getTstrcTimer()==null) || 
             (this.tstrcTimer!=null &&
              this.tstrcTimer.equals(other.getTstrcTimer()))) &&
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              this.scriptId.equals(other.getScriptId())));
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
        if (getScpAinMessageId() != null) {
            _hashCode += getScpAinMessageId().hashCode();
        }
        if (getScpOperationCode() != null) {
            _hashCode += getScpOperationCode().hashCode();
        }
        if (getUserIdFormat() != null) {
            _hashCode += getUserIdFormat().hashCode();
        }
        if (getBearerCapabilityDefault() != null) {
            _hashCode += getBearerCapabilityDefault().hashCode();
        }
        if (getChargeStationDefault() != null) {
            _hashCode += getChargeStationDefault().hashCode();
        }
        if (getScpQueryFlags() != null) {
            _hashCode += getScpQueryFlags().hashCode();
        }
        if (getScpQueryFlags2() != null) {
            _hashCode += getScpQueryFlags2().hashCode();
        }
        if (getScpQueryFlags3() != null) {
            _hashCode += getScpQueryFlags3().hashCode();
        }
        if (getTrunkgroupOffset() != null) {
            _hashCode += getTrunkgroupOffset().hashCode();
        }
        if (getTrunkgroupLength() != null) {
            _hashCode += getTrunkgroupLength().hashCode();
        }
        if (getSwitchOffset() != null) {
            _hashCode += getSwitchOffset().hashCode();
        }
        if (getSwitchLength() != null) {
            _hashCode += getSwitchLength().hashCode();
        }
        if (getTrunkgroupTreatment() != null) {
            _hashCode += getTrunkgroupTreatment().hashCode();
        }
        if (getUseDefaultFlags() != null) {
            _hashCode += getUseDefaultFlags().hashCode();
        }
        if (getCalledNoa() != null) {
            _hashCode += getCalledNoa().hashCode();
        }
        if (getCalledNpi() != null) {
            _hashCode += getCalledNpi().hashCode();
        }
        if (getAssignmentAuthority() != null) {
            _hashCode += getAssignmentAuthority().hashCode();
        }
        if (getCollectedAddrNoa() != null) {
            _hashCode += getCollectedAddrNoa().hashCode();
        }
        if (getCollectedAddrNpi() != null) {
            _hashCode += getCollectedAddrNpi().hashCode();
        }
        if (getCollectedDigitsNoa() != null) {
            _hashCode += getCollectedDigitsNoa().hashCode();
        }
        if (getCollectedDigitsNpi() != null) {
            _hashCode += getCollectedDigitsNpi().hashCode();
        }
        if (getScpBsgSource() != null) {
            _hashCode += getScpBsgSource().hashCode();
        }
        if (getExtensionParameterFlags() != null) {
            _hashCode += getExtensionParameterFlags().hashCode();
        }
        if (getCollectedAddrSource() != null) {
            _hashCode += getCollectedAddrSource().hashCode();
        }
        if (getCallingNoa() != null) {
            _hashCode += getCallingNoa().hashCode();
        }
        if (getCallingNpi() != null) {
            _hashCode += getCallingNpi().hashCode();
        }
        if (getLataId() != null) {
            _hashCode += getLataId().hashCode();
        }
        if (getScpQueryFlags4() != null) {
            _hashCode += getScpQueryFlags4().hashCode();
        }
        if (getScpQueryFlags5() != null) {
            _hashCode += getScpQueryFlags5().hashCode();
        }
        if (getTstrcTimer() != null) {
            _hashCode += getTstrcTimer().hashCode();
        }
        if (getScriptId() != null) {
            _hashCode += getScriptId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScpQueryProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpQueryProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpAinMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpAinMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpOperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIdFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userIdFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bearerCapabilityDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bearerCapabilityDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeStationDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeStationDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpQueryFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpQueryFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpQueryFlags2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpQueryFlags2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpQueryFlags3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpQueryFlags3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkgroupTreatment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunkgroupTreatment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDefaultFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useDefaultFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("assignmentAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignmentAuthority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectedAddrNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectedAddrNoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectedAddrNpi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectedAddrNpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectedDigitsNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectedDigitsNoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectedDigitsNpi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectedDigitsNpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpBsgSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpBsgSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionParameterFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extensionParameterFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectedAddrSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectedAddrSource"));
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
        elemField.setFieldName("lataId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lataId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpQueryFlags4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpQueryFlags4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpQueryFlags5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpQueryFlags5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tstrcTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tstrcTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scriptId"));
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
