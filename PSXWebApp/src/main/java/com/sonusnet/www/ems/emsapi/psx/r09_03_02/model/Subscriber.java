/**
 * Subscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class Subscriber  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String subscriberId;

    private java.lang.String countryId;

    private java.lang.String owningCarrierId;

    private java.lang.String businessGroupId;

    private java.lang.String interLataCarrierId;

    private java.lang.String intraLataCarrierId;

    private java.lang.String intlCarrierId;

    private java.lang.String assignedCarrierId;

    private java.lang.Short presentationFlag;

    private java.lang.String prfdPacketServiceProfileId;

    private java.lang.Short optionType;

    private java.lang.Short testSubscriber;

    private java.lang.String billingPlanId;

    private java.lang.String localCarrierId;

    private java.lang.String authcodeScriptId;

    private java.lang.Integer elementAttributes;

    private java.lang.String classOfServiceId;

    private java.lang.String pseudoCarrierId;

    private java.lang.String infoDigitId;

    private java.lang.Short scpBusinessServiceGroup;

    private java.lang.String authcodeGroupId;

    private java.lang.String pinDigits;

    private java.lang.Integer svcList1;

    private java.lang.Integer svcList2;

    private java.lang.String exceptionProfileId;

    private java.lang.Short isDestination;

    private java.lang.String defaultCpc;

    private java.lang.Short homeMobileNetwork;

    private java.lang.String origEntityRoutingProfileId;

    private java.lang.String callingArea;

    private java.lang.String businessUnitId;

    private java.lang.String deviceProfileId;

    private java.lang.Short memberStatus;

    private java.lang.String pspIdsProfileId;

    private java.lang.String agsN;

    private java.lang.String gf;

    private java.lang.Integer postalCode;

    private java.lang.String houseNumber;

    private java.lang.String streetName;

    private java.lang.String endPointLocationProfileId;

    public Subscriber() {
    }

    public Subscriber(
           java.lang.String subscriberId,
           java.lang.String countryId,
           java.lang.String owningCarrierId,
           java.lang.String businessGroupId,
           java.lang.String interLataCarrierId,
           java.lang.String intraLataCarrierId,
           java.lang.String intlCarrierId,
           java.lang.String assignedCarrierId,
           java.lang.Short presentationFlag,
           java.lang.String prfdPacketServiceProfileId,
           java.lang.Short optionType,
           java.lang.Short testSubscriber,
           java.lang.String billingPlanId,
           java.lang.String localCarrierId,
           java.lang.String authcodeScriptId,
           java.lang.Integer elementAttributes,
           java.lang.String classOfServiceId,
           java.lang.String pseudoCarrierId,
           java.lang.String infoDigitId,
           java.lang.Short scpBusinessServiceGroup,
           java.lang.String authcodeGroupId,
           java.lang.String pinDigits,
           java.lang.Integer svcList1,
           java.lang.Integer svcList2,
           java.lang.String exceptionProfileId,
           java.lang.Short isDestination,
           java.lang.String defaultCpc,
           java.lang.Short homeMobileNetwork,
           java.lang.String origEntityRoutingProfileId,
           java.lang.String callingArea,
           java.lang.String businessUnitId,
           java.lang.String deviceProfileId,
           java.lang.Short memberStatus,
           java.lang.String pspIdsProfileId,
           java.lang.String agsN,
           java.lang.String gf,
           java.lang.Integer postalCode,
           java.lang.String houseNumber,
           java.lang.String streetName,
           java.lang.String endPointLocationProfileId) {
        this.subscriberId = subscriberId;
        this.countryId = countryId;
        this.owningCarrierId = owningCarrierId;
        this.businessGroupId = businessGroupId;
        this.interLataCarrierId = interLataCarrierId;
        this.intraLataCarrierId = intraLataCarrierId;
        this.intlCarrierId = intlCarrierId;
        this.assignedCarrierId = assignedCarrierId;
        this.presentationFlag = presentationFlag;
        this.prfdPacketServiceProfileId = prfdPacketServiceProfileId;
        this.optionType = optionType;
        this.testSubscriber = testSubscriber;
        this.billingPlanId = billingPlanId;
        this.localCarrierId = localCarrierId;
        this.authcodeScriptId = authcodeScriptId;
        this.elementAttributes = elementAttributes;
        this.classOfServiceId = classOfServiceId;
        this.pseudoCarrierId = pseudoCarrierId;
        this.infoDigitId = infoDigitId;
        this.scpBusinessServiceGroup = scpBusinessServiceGroup;
        this.authcodeGroupId = authcodeGroupId;
        this.pinDigits = pinDigits;
        this.svcList1 = svcList1;
        this.svcList2 = svcList2;
        this.exceptionProfileId = exceptionProfileId;
        this.isDestination = isDestination;
        this.defaultCpc = defaultCpc;
        this.homeMobileNetwork = homeMobileNetwork;
        this.origEntityRoutingProfileId = origEntityRoutingProfileId;
        this.callingArea = callingArea;
        this.businessUnitId = businessUnitId;
        this.deviceProfileId = deviceProfileId;
        this.memberStatus = memberStatus;
        this.pspIdsProfileId = pspIdsProfileId;
        this.agsN = agsN;
        this.gf = gf;
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.endPointLocationProfileId = endPointLocationProfileId;
    }


    /**
     * Gets the subscriberId value for this Subscriber.
     * 
     * @return subscriberId
     */
    public java.lang.String getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this Subscriber.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(java.lang.String subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the countryId value for this Subscriber.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this Subscriber.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the owningCarrierId value for this Subscriber.
     * 
     * @return owningCarrierId
     */
    public java.lang.String getOwningCarrierId() {
        return owningCarrierId;
    }


    /**
     * Sets the owningCarrierId value for this Subscriber.
     * 
     * @param owningCarrierId
     */
    public void setOwningCarrierId(java.lang.String owningCarrierId) {
        this.owningCarrierId = owningCarrierId;
    }


    /**
     * Gets the businessGroupId value for this Subscriber.
     * 
     * @return businessGroupId
     */
    public java.lang.String getBusinessGroupId() {
        return businessGroupId;
    }


    /**
     * Sets the businessGroupId value for this Subscriber.
     * 
     * @param businessGroupId
     */
    public void setBusinessGroupId(java.lang.String businessGroupId) {
        this.businessGroupId = businessGroupId;
    }


    /**
     * Gets the interLataCarrierId value for this Subscriber.
     * 
     * @return interLataCarrierId
     */
    public java.lang.String getInterLataCarrierId() {
        return interLataCarrierId;
    }


    /**
     * Sets the interLataCarrierId value for this Subscriber.
     * 
     * @param interLataCarrierId
     */
    public void setInterLataCarrierId(java.lang.String interLataCarrierId) {
        this.interLataCarrierId = interLataCarrierId;
    }


    /**
     * Gets the intraLataCarrierId value for this Subscriber.
     * 
     * @return intraLataCarrierId
     */
    public java.lang.String getIntraLataCarrierId() {
        return intraLataCarrierId;
    }


    /**
     * Sets the intraLataCarrierId value for this Subscriber.
     * 
     * @param intraLataCarrierId
     */
    public void setIntraLataCarrierId(java.lang.String intraLataCarrierId) {
        this.intraLataCarrierId = intraLataCarrierId;
    }


    /**
     * Gets the intlCarrierId value for this Subscriber.
     * 
     * @return intlCarrierId
     */
    public java.lang.String getIntlCarrierId() {
        return intlCarrierId;
    }


    /**
     * Sets the intlCarrierId value for this Subscriber.
     * 
     * @param intlCarrierId
     */
    public void setIntlCarrierId(java.lang.String intlCarrierId) {
        this.intlCarrierId = intlCarrierId;
    }


    /**
     * Gets the assignedCarrierId value for this Subscriber.
     * 
     * @return assignedCarrierId
     */
    public java.lang.String getAssignedCarrierId() {
        return assignedCarrierId;
    }


    /**
     * Sets the assignedCarrierId value for this Subscriber.
     * 
     * @param assignedCarrierId
     */
    public void setAssignedCarrierId(java.lang.String assignedCarrierId) {
        this.assignedCarrierId = assignedCarrierId;
    }


    /**
     * Gets the presentationFlag value for this Subscriber.
     * 
     * @return presentationFlag
     */
    public java.lang.Short getPresentationFlag() {
        return presentationFlag;
    }


    /**
     * Sets the presentationFlag value for this Subscriber.
     * 
     * @param presentationFlag
     */
    public void setPresentationFlag(java.lang.Short presentationFlag) {
        this.presentationFlag = presentationFlag;
    }


    /**
     * Gets the prfdPacketServiceProfileId value for this Subscriber.
     * 
     * @return prfdPacketServiceProfileId
     */
    public java.lang.String getPrfdPacketServiceProfileId() {
        return prfdPacketServiceProfileId;
    }


    /**
     * Sets the prfdPacketServiceProfileId value for this Subscriber.
     * 
     * @param prfdPacketServiceProfileId
     */
    public void setPrfdPacketServiceProfileId(java.lang.String prfdPacketServiceProfileId) {
        this.prfdPacketServiceProfileId = prfdPacketServiceProfileId;
    }


    /**
     * Gets the optionType value for this Subscriber.
     * 
     * @return optionType
     */
    public java.lang.Short getOptionType() {
        return optionType;
    }


    /**
     * Sets the optionType value for this Subscriber.
     * 
     * @param optionType
     */
    public void setOptionType(java.lang.Short optionType) {
        this.optionType = optionType;
    }


    /**
     * Gets the testSubscriber value for this Subscriber.
     * 
     * @return testSubscriber
     */
    public java.lang.Short getTestSubscriber() {
        return testSubscriber;
    }


    /**
     * Sets the testSubscriber value for this Subscriber.
     * 
     * @param testSubscriber
     */
    public void setTestSubscriber(java.lang.Short testSubscriber) {
        this.testSubscriber = testSubscriber;
    }


    /**
     * Gets the billingPlanId value for this Subscriber.
     * 
     * @return billingPlanId
     */
    public java.lang.String getBillingPlanId() {
        return billingPlanId;
    }


    /**
     * Sets the billingPlanId value for this Subscriber.
     * 
     * @param billingPlanId
     */
    public void setBillingPlanId(java.lang.String billingPlanId) {
        this.billingPlanId = billingPlanId;
    }


    /**
     * Gets the localCarrierId value for this Subscriber.
     * 
     * @return localCarrierId
     */
    public java.lang.String getLocalCarrierId() {
        return localCarrierId;
    }


    /**
     * Sets the localCarrierId value for this Subscriber.
     * 
     * @param localCarrierId
     */
    public void setLocalCarrierId(java.lang.String localCarrierId) {
        this.localCarrierId = localCarrierId;
    }


    /**
     * Gets the authcodeScriptId value for this Subscriber.
     * 
     * @return authcodeScriptId
     */
    public java.lang.String getAuthcodeScriptId() {
        return authcodeScriptId;
    }


    /**
     * Sets the authcodeScriptId value for this Subscriber.
     * 
     * @param authcodeScriptId
     */
    public void setAuthcodeScriptId(java.lang.String authcodeScriptId) {
        this.authcodeScriptId = authcodeScriptId;
    }


    /**
     * Gets the elementAttributes value for this Subscriber.
     * 
     * @return elementAttributes
     */
    public java.lang.Integer getElementAttributes() {
        return elementAttributes;
    }


    /**
     * Sets the elementAttributes value for this Subscriber.
     * 
     * @param elementAttributes
     */
    public void setElementAttributes(java.lang.Integer elementAttributes) {
        this.elementAttributes = elementAttributes;
    }


    /**
     * Gets the classOfServiceId value for this Subscriber.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this Subscriber.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the pseudoCarrierId value for this Subscriber.
     * 
     * @return pseudoCarrierId
     */
    public java.lang.String getPseudoCarrierId() {
        return pseudoCarrierId;
    }


    /**
     * Sets the pseudoCarrierId value for this Subscriber.
     * 
     * @param pseudoCarrierId
     */
    public void setPseudoCarrierId(java.lang.String pseudoCarrierId) {
        this.pseudoCarrierId = pseudoCarrierId;
    }


    /**
     * Gets the infoDigitId value for this Subscriber.
     * 
     * @return infoDigitId
     */
    public java.lang.String getInfoDigitId() {
        return infoDigitId;
    }


    /**
     * Sets the infoDigitId value for this Subscriber.
     * 
     * @param infoDigitId
     */
    public void setInfoDigitId(java.lang.String infoDigitId) {
        this.infoDigitId = infoDigitId;
    }


    /**
     * Gets the scpBusinessServiceGroup value for this Subscriber.
     * 
     * @return scpBusinessServiceGroup
     */
    public java.lang.Short getScpBusinessServiceGroup() {
        return scpBusinessServiceGroup;
    }


    /**
     * Sets the scpBusinessServiceGroup value for this Subscriber.
     * 
     * @param scpBusinessServiceGroup
     */
    public void setScpBusinessServiceGroup(java.lang.Short scpBusinessServiceGroup) {
        this.scpBusinessServiceGroup = scpBusinessServiceGroup;
    }


    /**
     * Gets the authcodeGroupId value for this Subscriber.
     * 
     * @return authcodeGroupId
     */
    public java.lang.String getAuthcodeGroupId() {
        return authcodeGroupId;
    }


    /**
     * Sets the authcodeGroupId value for this Subscriber.
     * 
     * @param authcodeGroupId
     */
    public void setAuthcodeGroupId(java.lang.String authcodeGroupId) {
        this.authcodeGroupId = authcodeGroupId;
    }


    /**
     * Gets the pinDigits value for this Subscriber.
     * 
     * @return pinDigits
     */
    public java.lang.String getPinDigits() {
        return pinDigits;
    }


    /**
     * Sets the pinDigits value for this Subscriber.
     * 
     * @param pinDigits
     */
    public void setPinDigits(java.lang.String pinDigits) {
        this.pinDigits = pinDigits;
    }


    /**
     * Gets the svcList1 value for this Subscriber.
     * 
     * @return svcList1
     */
    public java.lang.Integer getSvcList1() {
        return svcList1;
    }


    /**
     * Sets the svcList1 value for this Subscriber.
     * 
     * @param svcList1
     */
    public void setSvcList1(java.lang.Integer svcList1) {
        this.svcList1 = svcList1;
    }


    /**
     * Gets the svcList2 value for this Subscriber.
     * 
     * @return svcList2
     */
    public java.lang.Integer getSvcList2() {
        return svcList2;
    }


    /**
     * Sets the svcList2 value for this Subscriber.
     * 
     * @param svcList2
     */
    public void setSvcList2(java.lang.Integer svcList2) {
        this.svcList2 = svcList2;
    }


    /**
     * Gets the exceptionProfileId value for this Subscriber.
     * 
     * @return exceptionProfileId
     */
    public java.lang.String getExceptionProfileId() {
        return exceptionProfileId;
    }


    /**
     * Sets the exceptionProfileId value for this Subscriber.
     * 
     * @param exceptionProfileId
     */
    public void setExceptionProfileId(java.lang.String exceptionProfileId) {
        this.exceptionProfileId = exceptionProfileId;
    }


    /**
     * Gets the isDestination value for this Subscriber.
     * 
     * @return isDestination
     */
    public java.lang.Short getIsDestination() {
        return isDestination;
    }


    /**
     * Sets the isDestination value for this Subscriber.
     * 
     * @param isDestination
     */
    public void setIsDestination(java.lang.Short isDestination) {
        this.isDestination = isDestination;
    }


    /**
     * Gets the defaultCpc value for this Subscriber.
     * 
     * @return defaultCpc
     */
    public java.lang.String getDefaultCpc() {
        return defaultCpc;
    }


    /**
     * Sets the defaultCpc value for this Subscriber.
     * 
     * @param defaultCpc
     */
    public void setDefaultCpc(java.lang.String defaultCpc) {
        this.defaultCpc = defaultCpc;
    }


    /**
     * Gets the homeMobileNetwork value for this Subscriber.
     * 
     * @return homeMobileNetwork
     */
    public java.lang.Short getHomeMobileNetwork() {
        return homeMobileNetwork;
    }


    /**
     * Sets the homeMobileNetwork value for this Subscriber.
     * 
     * @param homeMobileNetwork
     */
    public void setHomeMobileNetwork(java.lang.Short homeMobileNetwork) {
        this.homeMobileNetwork = homeMobileNetwork;
    }


    /**
     * Gets the origEntityRoutingProfileId value for this Subscriber.
     * 
     * @return origEntityRoutingProfileId
     */
    public java.lang.String getOrigEntityRoutingProfileId() {
        return origEntityRoutingProfileId;
    }


    /**
     * Sets the origEntityRoutingProfileId value for this Subscriber.
     * 
     * @param origEntityRoutingProfileId
     */
    public void setOrigEntityRoutingProfileId(java.lang.String origEntityRoutingProfileId) {
        this.origEntityRoutingProfileId = origEntityRoutingProfileId;
    }


    /**
     * Gets the callingArea value for this Subscriber.
     * 
     * @return callingArea
     */
    public java.lang.String getCallingArea() {
        return callingArea;
    }


    /**
     * Sets the callingArea value for this Subscriber.
     * 
     * @param callingArea
     */
    public void setCallingArea(java.lang.String callingArea) {
        this.callingArea = callingArea;
    }


    /**
     * Gets the businessUnitId value for this Subscriber.
     * 
     * @return businessUnitId
     */
    public java.lang.String getBusinessUnitId() {
        return businessUnitId;
    }


    /**
     * Sets the businessUnitId value for this Subscriber.
     * 
     * @param businessUnitId
     */
    public void setBusinessUnitId(java.lang.String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }


    /**
     * Gets the deviceProfileId value for this Subscriber.
     * 
     * @return deviceProfileId
     */
    public java.lang.String getDeviceProfileId() {
        return deviceProfileId;
    }


    /**
     * Sets the deviceProfileId value for this Subscriber.
     * 
     * @param deviceProfileId
     */
    public void setDeviceProfileId(java.lang.String deviceProfileId) {
        this.deviceProfileId = deviceProfileId;
    }


    /**
     * Gets the memberStatus value for this Subscriber.
     * 
     * @return memberStatus
     */
    public java.lang.Short getMemberStatus() {
        return memberStatus;
    }


    /**
     * Sets the memberStatus value for this Subscriber.
     * 
     * @param memberStatus
     */
    public void setMemberStatus(java.lang.Short memberStatus) {
        this.memberStatus = memberStatus;
    }


    /**
     * Gets the pspIdsProfileId value for this Subscriber.
     * 
     * @return pspIdsProfileId
     */
    public java.lang.String getPspIdsProfileId() {
        return pspIdsProfileId;
    }


    /**
     * Sets the pspIdsProfileId value for this Subscriber.
     * 
     * @param pspIdsProfileId
     */
    public void setPspIdsProfileId(java.lang.String pspIdsProfileId) {
        this.pspIdsProfileId = pspIdsProfileId;
    }


    /**
     * Gets the agsN value for this Subscriber.
     * 
     * @return agsN
     */
    public java.lang.String getAgsN() {
        return agsN;
    }


    /**
     * Sets the agsN value for this Subscriber.
     * 
     * @param agsN
     */
    public void setAgsN(java.lang.String agsN) {
        this.agsN = agsN;
    }


    /**
     * Gets the gf value for this Subscriber.
     * 
     * @return gf
     */
    public java.lang.String getGf() {
        return gf;
    }


    /**
     * Sets the gf value for this Subscriber.
     * 
     * @param gf
     */
    public void setGf(java.lang.String gf) {
        this.gf = gf;
    }


    /**
     * Gets the postalCode value for this Subscriber.
     * 
     * @return postalCode
     */
    public java.lang.Integer getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this Subscriber.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.Integer postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the houseNumber value for this Subscriber.
     * 
     * @return houseNumber
     */
    public java.lang.String getHouseNumber() {
        return houseNumber;
    }


    /**
     * Sets the houseNumber value for this Subscriber.
     * 
     * @param houseNumber
     */
    public void setHouseNumber(java.lang.String houseNumber) {
        this.houseNumber = houseNumber;
    }


    /**
     * Gets the streetName value for this Subscriber.
     * 
     * @return streetName
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this Subscriber.
     * 
     * @param streetName
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the endPointLocationProfileId value for this Subscriber.
     * 
     * @return endPointLocationProfileId
     */
    public java.lang.String getEndPointLocationProfileId() {
        return endPointLocationProfileId;
    }


    /**
     * Sets the endPointLocationProfileId value for this Subscriber.
     * 
     * @param endPointLocationProfileId
     */
    public void setEndPointLocationProfileId(java.lang.String endPointLocationProfileId) {
        this.endPointLocationProfileId = endPointLocationProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subscriber)) return false;
        Subscriber other = (Subscriber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberId==null && other.getSubscriberId()==null) || 
             (this.subscriberId!=null &&
              this.subscriberId.equals(other.getSubscriberId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.owningCarrierId==null && other.getOwningCarrierId()==null) || 
             (this.owningCarrierId!=null &&
              this.owningCarrierId.equals(other.getOwningCarrierId()))) &&
            ((this.businessGroupId==null && other.getBusinessGroupId()==null) || 
             (this.businessGroupId!=null &&
              this.businessGroupId.equals(other.getBusinessGroupId()))) &&
            ((this.interLataCarrierId==null && other.getInterLataCarrierId()==null) || 
             (this.interLataCarrierId!=null &&
              this.interLataCarrierId.equals(other.getInterLataCarrierId()))) &&
            ((this.intraLataCarrierId==null && other.getIntraLataCarrierId()==null) || 
             (this.intraLataCarrierId!=null &&
              this.intraLataCarrierId.equals(other.getIntraLataCarrierId()))) &&
            ((this.intlCarrierId==null && other.getIntlCarrierId()==null) || 
             (this.intlCarrierId!=null &&
              this.intlCarrierId.equals(other.getIntlCarrierId()))) &&
            ((this.assignedCarrierId==null && other.getAssignedCarrierId()==null) || 
             (this.assignedCarrierId!=null &&
              this.assignedCarrierId.equals(other.getAssignedCarrierId()))) &&
            ((this.presentationFlag==null && other.getPresentationFlag()==null) || 
             (this.presentationFlag!=null &&
              this.presentationFlag.equals(other.getPresentationFlag()))) &&
            ((this.prfdPacketServiceProfileId==null && other.getPrfdPacketServiceProfileId()==null) || 
             (this.prfdPacketServiceProfileId!=null &&
              this.prfdPacketServiceProfileId.equals(other.getPrfdPacketServiceProfileId()))) &&
            ((this.optionType==null && other.getOptionType()==null) || 
             (this.optionType!=null &&
              this.optionType.equals(other.getOptionType()))) &&
            ((this.testSubscriber==null && other.getTestSubscriber()==null) || 
             (this.testSubscriber!=null &&
              this.testSubscriber.equals(other.getTestSubscriber()))) &&
            ((this.billingPlanId==null && other.getBillingPlanId()==null) || 
             (this.billingPlanId!=null &&
              this.billingPlanId.equals(other.getBillingPlanId()))) &&
            ((this.localCarrierId==null && other.getLocalCarrierId()==null) || 
             (this.localCarrierId!=null &&
              this.localCarrierId.equals(other.getLocalCarrierId()))) &&
            ((this.authcodeScriptId==null && other.getAuthcodeScriptId()==null) || 
             (this.authcodeScriptId!=null &&
              this.authcodeScriptId.equals(other.getAuthcodeScriptId()))) &&
            ((this.elementAttributes==null && other.getElementAttributes()==null) || 
             (this.elementAttributes!=null &&
              this.elementAttributes.equals(other.getElementAttributes()))) &&
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.pseudoCarrierId==null && other.getPseudoCarrierId()==null) || 
             (this.pseudoCarrierId!=null &&
              this.pseudoCarrierId.equals(other.getPseudoCarrierId()))) &&
            ((this.infoDigitId==null && other.getInfoDigitId()==null) || 
             (this.infoDigitId!=null &&
              this.infoDigitId.equals(other.getInfoDigitId()))) &&
            ((this.scpBusinessServiceGroup==null && other.getScpBusinessServiceGroup()==null) || 
             (this.scpBusinessServiceGroup!=null &&
              this.scpBusinessServiceGroup.equals(other.getScpBusinessServiceGroup()))) &&
            ((this.authcodeGroupId==null && other.getAuthcodeGroupId()==null) || 
             (this.authcodeGroupId!=null &&
              this.authcodeGroupId.equals(other.getAuthcodeGroupId()))) &&
            ((this.pinDigits==null && other.getPinDigits()==null) || 
             (this.pinDigits!=null &&
              this.pinDigits.equals(other.getPinDigits()))) &&
            ((this.svcList1==null && other.getSvcList1()==null) || 
             (this.svcList1!=null &&
              this.svcList1.equals(other.getSvcList1()))) &&
            ((this.svcList2==null && other.getSvcList2()==null) || 
             (this.svcList2!=null &&
              this.svcList2.equals(other.getSvcList2()))) &&
            ((this.exceptionProfileId==null && other.getExceptionProfileId()==null) || 
             (this.exceptionProfileId!=null &&
              this.exceptionProfileId.equals(other.getExceptionProfileId()))) &&
            ((this.isDestination==null && other.getIsDestination()==null) || 
             (this.isDestination!=null &&
              this.isDestination.equals(other.getIsDestination()))) &&
            ((this.defaultCpc==null && other.getDefaultCpc()==null) || 
             (this.defaultCpc!=null &&
              this.defaultCpc.equals(other.getDefaultCpc()))) &&
            ((this.homeMobileNetwork==null && other.getHomeMobileNetwork()==null) || 
             (this.homeMobileNetwork!=null &&
              this.homeMobileNetwork.equals(other.getHomeMobileNetwork()))) &&
            ((this.origEntityRoutingProfileId==null && other.getOrigEntityRoutingProfileId()==null) || 
             (this.origEntityRoutingProfileId!=null &&
              this.origEntityRoutingProfileId.equals(other.getOrigEntityRoutingProfileId()))) &&
            ((this.callingArea==null && other.getCallingArea()==null) || 
             (this.callingArea!=null &&
              this.callingArea.equals(other.getCallingArea()))) &&
            ((this.businessUnitId==null && other.getBusinessUnitId()==null) || 
             (this.businessUnitId!=null &&
              this.businessUnitId.equals(other.getBusinessUnitId()))) &&
            ((this.deviceProfileId==null && other.getDeviceProfileId()==null) || 
             (this.deviceProfileId!=null &&
              this.deviceProfileId.equals(other.getDeviceProfileId()))) &&
            ((this.memberStatus==null && other.getMemberStatus()==null) || 
             (this.memberStatus!=null &&
              this.memberStatus.equals(other.getMemberStatus()))) &&
            ((this.pspIdsProfileId==null && other.getPspIdsProfileId()==null) || 
             (this.pspIdsProfileId!=null &&
              this.pspIdsProfileId.equals(other.getPspIdsProfileId()))) &&
            ((this.agsN==null && other.getAgsN()==null) || 
             (this.agsN!=null &&
              this.agsN.equals(other.getAgsN()))) &&
            ((this.gf==null && other.getGf()==null) || 
             (this.gf!=null &&
              this.gf.equals(other.getGf()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.houseNumber==null && other.getHouseNumber()==null) || 
             (this.houseNumber!=null &&
              this.houseNumber.equals(other.getHouseNumber()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.endPointLocationProfileId==null && other.getEndPointLocationProfileId()==null) || 
             (this.endPointLocationProfileId!=null &&
              this.endPointLocationProfileId.equals(other.getEndPointLocationProfileId())));
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
        if (getSubscriberId() != null) {
            _hashCode += getSubscriberId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getOwningCarrierId() != null) {
            _hashCode += getOwningCarrierId().hashCode();
        }
        if (getBusinessGroupId() != null) {
            _hashCode += getBusinessGroupId().hashCode();
        }
        if (getInterLataCarrierId() != null) {
            _hashCode += getInterLataCarrierId().hashCode();
        }
        if (getIntraLataCarrierId() != null) {
            _hashCode += getIntraLataCarrierId().hashCode();
        }
        if (getIntlCarrierId() != null) {
            _hashCode += getIntlCarrierId().hashCode();
        }
        if (getAssignedCarrierId() != null) {
            _hashCode += getAssignedCarrierId().hashCode();
        }
        if (getPresentationFlag() != null) {
            _hashCode += getPresentationFlag().hashCode();
        }
        if (getPrfdPacketServiceProfileId() != null) {
            _hashCode += getPrfdPacketServiceProfileId().hashCode();
        }
        if (getOptionType() != null) {
            _hashCode += getOptionType().hashCode();
        }
        if (getTestSubscriber() != null) {
            _hashCode += getTestSubscriber().hashCode();
        }
        if (getBillingPlanId() != null) {
            _hashCode += getBillingPlanId().hashCode();
        }
        if (getLocalCarrierId() != null) {
            _hashCode += getLocalCarrierId().hashCode();
        }
        if (getAuthcodeScriptId() != null) {
            _hashCode += getAuthcodeScriptId().hashCode();
        }
        if (getElementAttributes() != null) {
            _hashCode += getElementAttributes().hashCode();
        }
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getPseudoCarrierId() != null) {
            _hashCode += getPseudoCarrierId().hashCode();
        }
        if (getInfoDigitId() != null) {
            _hashCode += getInfoDigitId().hashCode();
        }
        if (getScpBusinessServiceGroup() != null) {
            _hashCode += getScpBusinessServiceGroup().hashCode();
        }
        if (getAuthcodeGroupId() != null) {
            _hashCode += getAuthcodeGroupId().hashCode();
        }
        if (getPinDigits() != null) {
            _hashCode += getPinDigits().hashCode();
        }
        if (getSvcList1() != null) {
            _hashCode += getSvcList1().hashCode();
        }
        if (getSvcList2() != null) {
            _hashCode += getSvcList2().hashCode();
        }
        if (getExceptionProfileId() != null) {
            _hashCode += getExceptionProfileId().hashCode();
        }
        if (getIsDestination() != null) {
            _hashCode += getIsDestination().hashCode();
        }
        if (getDefaultCpc() != null) {
            _hashCode += getDefaultCpc().hashCode();
        }
        if (getHomeMobileNetwork() != null) {
            _hashCode += getHomeMobileNetwork().hashCode();
        }
        if (getOrigEntityRoutingProfileId() != null) {
            _hashCode += getOrigEntityRoutingProfileId().hashCode();
        }
        if (getCallingArea() != null) {
            _hashCode += getCallingArea().hashCode();
        }
        if (getBusinessUnitId() != null) {
            _hashCode += getBusinessUnitId().hashCode();
        }
        if (getDeviceProfileId() != null) {
            _hashCode += getDeviceProfileId().hashCode();
        }
        if (getMemberStatus() != null) {
            _hashCode += getMemberStatus().hashCode();
        }
        if (getPspIdsProfileId() != null) {
            _hashCode += getPspIdsProfileId().hashCode();
        }
        if (getAgsN() != null) {
            _hashCode += getAgsN().hashCode();
        }
        if (getGf() != null) {
            _hashCode += getGf().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getHouseNumber() != null) {
            _hashCode += getHouseNumber().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getEndPointLocationProfileId() != null) {
            _hashCode += getEndPointLocationProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberId"));
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
        elemField.setFieldName("owningCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owningCarrierId"));
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
        elemField.setFieldName("interLataCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interLataCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intraLataCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intraLataCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intlCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intlCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignedCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentationFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prfdPacketServiceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prfdPacketServiceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "optionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testSubscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "testSubscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authcodeScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authcodeScriptId"));
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
        elemField.setFieldName("classOfServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classOfServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pseudoCarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pseudoCarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoDigitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infoDigitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpBusinessServiceGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpBusinessServiceGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authcodeGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authcodeGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pinDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcList1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcList1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcList2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcList2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDestination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDestination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeMobileNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeMobileNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origEntityRoutingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origEntityRoutingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingArea"));
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
        elemField.setFieldName("deviceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memberStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pspIdsProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pspIdsProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agsN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agsN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("houseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "houseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endPointLocationProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endPointLocationProfileId"));
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
