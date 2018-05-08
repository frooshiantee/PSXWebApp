/**
 * ServiceDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class ServiceDefinition  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String serviceId;

    private java.lang.Short scpQueryPriority;

    private java.lang.String serviceDescription;

    private java.lang.Short ainTriggerType;

    private java.lang.String servicePmRuleId;

    private java.lang.String serviceInPmRuleId;

    private java.lang.String serviceOutPmRuleId;

    private java.lang.String triggerCriteria;

    private java.lang.String escapeCriteria;

    private java.lang.Short scpTriggerTreatment;

    private java.lang.Short scpTriggerActive;

    private java.lang.Short scpAllowMultipleQueries;

    private java.lang.Integer serviceNumber;

    private java.lang.Short serviceDeviceType;

    private java.lang.Short serviceType;

    private java.lang.String locReqRspSubsvc;

    private java.lang.String analyzeRouteSubsvc;

    private java.lang.String tranNumReqRspSubsvc;

    private java.lang.String rchReqSubsvc;

    private java.lang.String sriQueryRspSubsvc;

    private java.lang.Integer attributes;

    private java.lang.String triggerFilterCriteriaId;

    private java.lang.String escapeFilterCriteriaId;

    private java.lang.Integer sipScpService;

    private java.lang.String sipDeviceId;

    private java.lang.Integer scpRequestTimeout;

    private java.lang.Integer translationCriteria;

    private java.lang.Integer scpRequestTimeout2;

    private java.lang.Integer scpRequestTimeout3;

    private java.lang.Integer scpRequestTimeout4;

    private java.lang.Integer scpRequestTimeout5;

    private java.lang.Integer inServiceKey;

    private java.lang.String gsmscfAddress;

    private java.lang.Integer detectionPoint;

    private java.lang.String domainName;

    private java.lang.Integer inapVariant;

    private java.lang.String e911VpcDeviceId;

    private java.lang.Integer routingPrecedenceType;

    private java.lang.Integer sccpClass;

    private java.lang.Integer capMapSs7Stack;

    private java.lang.Integer qorRelCause1;

    private java.lang.Integer qorRelCause2;

    private java.lang.String numberControlProfileId;

    private java.lang.String releaseCauseInTriggerProfileId;

    private java.lang.String dtProfileId;

    private java.lang.String inDialogueHandlingProfileId;

    private java.lang.String rexServiceId;

    private java.lang.Integer attributes2;

    private java.lang.String userInfoProfileId;

    private java.lang.Integer ttlTimer;

    public ServiceDefinition() {
    }

    public ServiceDefinition(
           java.lang.String serviceId,
           java.lang.Short scpQueryPriority,
           java.lang.String serviceDescription,
           java.lang.Short ainTriggerType,
           java.lang.String servicePmRuleId,
           java.lang.String serviceInPmRuleId,
           java.lang.String serviceOutPmRuleId,
           java.lang.String triggerCriteria,
           java.lang.String escapeCriteria,
           java.lang.Short scpTriggerTreatment,
           java.lang.Short scpTriggerActive,
           java.lang.Short scpAllowMultipleQueries,
           java.lang.Integer serviceNumber,
           java.lang.Short serviceDeviceType,
           java.lang.Short serviceType,
           java.lang.String locReqRspSubsvc,
           java.lang.String analyzeRouteSubsvc,
           java.lang.String tranNumReqRspSubsvc,
           java.lang.String rchReqSubsvc,
           java.lang.String sriQueryRspSubsvc,
           java.lang.Integer attributes,
           java.lang.String triggerFilterCriteriaId,
           java.lang.String escapeFilterCriteriaId,
           java.lang.Integer sipScpService,
           java.lang.String sipDeviceId,
           java.lang.Integer scpRequestTimeout,
           java.lang.Integer translationCriteria,
           java.lang.Integer scpRequestTimeout2,
           java.lang.Integer scpRequestTimeout3,
           java.lang.Integer scpRequestTimeout4,
           java.lang.Integer scpRequestTimeout5,
           java.lang.Integer inServiceKey,
           java.lang.String gsmscfAddress,
           java.lang.Integer detectionPoint,
           java.lang.String domainName,
           java.lang.Integer inapVariant,
           java.lang.String e911VpcDeviceId,
           java.lang.Integer routingPrecedenceType,
           java.lang.Integer sccpClass,
           java.lang.Integer capMapSs7Stack,
           java.lang.Integer qorRelCause1,
           java.lang.Integer qorRelCause2,
           java.lang.String numberControlProfileId,
           java.lang.String releaseCauseInTriggerProfileId,
           java.lang.String dtProfileId,
           java.lang.String inDialogueHandlingProfileId,
           java.lang.String rexServiceId,
           java.lang.Integer attributes2,
           java.lang.String userInfoProfileId,
           java.lang.Integer ttlTimer) {
        this.serviceId = serviceId;
        this.scpQueryPriority = scpQueryPriority;
        this.serviceDescription = serviceDescription;
        this.ainTriggerType = ainTriggerType;
        this.servicePmRuleId = servicePmRuleId;
        this.serviceInPmRuleId = serviceInPmRuleId;
        this.serviceOutPmRuleId = serviceOutPmRuleId;
        this.triggerCriteria = triggerCriteria;
        this.escapeCriteria = escapeCriteria;
        this.scpTriggerTreatment = scpTriggerTreatment;
        this.scpTriggerActive = scpTriggerActive;
        this.scpAllowMultipleQueries = scpAllowMultipleQueries;
        this.serviceNumber = serviceNumber;
        this.serviceDeviceType = serviceDeviceType;
        this.serviceType = serviceType;
        this.locReqRspSubsvc = locReqRspSubsvc;
        this.analyzeRouteSubsvc = analyzeRouteSubsvc;
        this.tranNumReqRspSubsvc = tranNumReqRspSubsvc;
        this.rchReqSubsvc = rchReqSubsvc;
        this.sriQueryRspSubsvc = sriQueryRspSubsvc;
        this.attributes = attributes;
        this.triggerFilterCriteriaId = triggerFilterCriteriaId;
        this.escapeFilterCriteriaId = escapeFilterCriteriaId;
        this.sipScpService = sipScpService;
        this.sipDeviceId = sipDeviceId;
        this.scpRequestTimeout = scpRequestTimeout;
        this.translationCriteria = translationCriteria;
        this.scpRequestTimeout2 = scpRequestTimeout2;
        this.scpRequestTimeout3 = scpRequestTimeout3;
        this.scpRequestTimeout4 = scpRequestTimeout4;
        this.scpRequestTimeout5 = scpRequestTimeout5;
        this.inServiceKey = inServiceKey;
        this.gsmscfAddress = gsmscfAddress;
        this.detectionPoint = detectionPoint;
        this.domainName = domainName;
        this.inapVariant = inapVariant;
        this.e911VpcDeviceId = e911VpcDeviceId;
        this.routingPrecedenceType = routingPrecedenceType;
        this.sccpClass = sccpClass;
        this.capMapSs7Stack = capMapSs7Stack;
        this.qorRelCause1 = qorRelCause1;
        this.qorRelCause2 = qorRelCause2;
        this.numberControlProfileId = numberControlProfileId;
        this.releaseCauseInTriggerProfileId = releaseCauseInTriggerProfileId;
        this.dtProfileId = dtProfileId;
        this.inDialogueHandlingProfileId = inDialogueHandlingProfileId;
        this.rexServiceId = rexServiceId;
        this.attributes2 = attributes2;
        this.userInfoProfileId = userInfoProfileId;
        this.ttlTimer = ttlTimer;
    }


    /**
     * Gets the serviceId value for this ServiceDefinition.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ServiceDefinition.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the scpQueryPriority value for this ServiceDefinition.
     * 
     * @return scpQueryPriority
     */
    public java.lang.Short getScpQueryPriority() {
        return scpQueryPriority;
    }


    /**
     * Sets the scpQueryPriority value for this ServiceDefinition.
     * 
     * @param scpQueryPriority
     */
    public void setScpQueryPriority(java.lang.Short scpQueryPriority) {
        this.scpQueryPriority = scpQueryPriority;
    }


    /**
     * Gets the serviceDescription value for this ServiceDefinition.
     * 
     * @return serviceDescription
     */
    public java.lang.String getServiceDescription() {
        return serviceDescription;
    }


    /**
     * Sets the serviceDescription value for this ServiceDefinition.
     * 
     * @param serviceDescription
     */
    public void setServiceDescription(java.lang.String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }


    /**
     * Gets the ainTriggerType value for this ServiceDefinition.
     * 
     * @return ainTriggerType
     */
    public java.lang.Short getAinTriggerType() {
        return ainTriggerType;
    }


    /**
     * Sets the ainTriggerType value for this ServiceDefinition.
     * 
     * @param ainTriggerType
     */
    public void setAinTriggerType(java.lang.Short ainTriggerType) {
        this.ainTriggerType = ainTriggerType;
    }


    /**
     * Gets the servicePmRuleId value for this ServiceDefinition.
     * 
     * @return servicePmRuleId
     */
    public java.lang.String getServicePmRuleId() {
        return servicePmRuleId;
    }


    /**
     * Sets the servicePmRuleId value for this ServiceDefinition.
     * 
     * @param servicePmRuleId
     */
    public void setServicePmRuleId(java.lang.String servicePmRuleId) {
        this.servicePmRuleId = servicePmRuleId;
    }


    /**
     * Gets the serviceInPmRuleId value for this ServiceDefinition.
     * 
     * @return serviceInPmRuleId
     */
    public java.lang.String getServiceInPmRuleId() {
        return serviceInPmRuleId;
    }


    /**
     * Sets the serviceInPmRuleId value for this ServiceDefinition.
     * 
     * @param serviceInPmRuleId
     */
    public void setServiceInPmRuleId(java.lang.String serviceInPmRuleId) {
        this.serviceInPmRuleId = serviceInPmRuleId;
    }


    /**
     * Gets the serviceOutPmRuleId value for this ServiceDefinition.
     * 
     * @return serviceOutPmRuleId
     */
    public java.lang.String getServiceOutPmRuleId() {
        return serviceOutPmRuleId;
    }


    /**
     * Sets the serviceOutPmRuleId value for this ServiceDefinition.
     * 
     * @param serviceOutPmRuleId
     */
    public void setServiceOutPmRuleId(java.lang.String serviceOutPmRuleId) {
        this.serviceOutPmRuleId = serviceOutPmRuleId;
    }


    /**
     * Gets the triggerCriteria value for this ServiceDefinition.
     * 
     * @return triggerCriteria
     */
    public java.lang.String getTriggerCriteria() {
        return triggerCriteria;
    }


    /**
     * Sets the triggerCriteria value for this ServiceDefinition.
     * 
     * @param triggerCriteria
     */
    public void setTriggerCriteria(java.lang.String triggerCriteria) {
        this.triggerCriteria = triggerCriteria;
    }


    /**
     * Gets the escapeCriteria value for this ServiceDefinition.
     * 
     * @return escapeCriteria
     */
    public java.lang.String getEscapeCriteria() {
        return escapeCriteria;
    }


    /**
     * Sets the escapeCriteria value for this ServiceDefinition.
     * 
     * @param escapeCriteria
     */
    public void setEscapeCriteria(java.lang.String escapeCriteria) {
        this.escapeCriteria = escapeCriteria;
    }


    /**
     * Gets the scpTriggerTreatment value for this ServiceDefinition.
     * 
     * @return scpTriggerTreatment
     */
    public java.lang.Short getScpTriggerTreatment() {
        return scpTriggerTreatment;
    }


    /**
     * Sets the scpTriggerTreatment value for this ServiceDefinition.
     * 
     * @param scpTriggerTreatment
     */
    public void setScpTriggerTreatment(java.lang.Short scpTriggerTreatment) {
        this.scpTriggerTreatment = scpTriggerTreatment;
    }


    /**
     * Gets the scpTriggerActive value for this ServiceDefinition.
     * 
     * @return scpTriggerActive
     */
    public java.lang.Short getScpTriggerActive() {
        return scpTriggerActive;
    }


    /**
     * Sets the scpTriggerActive value for this ServiceDefinition.
     * 
     * @param scpTriggerActive
     */
    public void setScpTriggerActive(java.lang.Short scpTriggerActive) {
        this.scpTriggerActive = scpTriggerActive;
    }


    /**
     * Gets the scpAllowMultipleQueries value for this ServiceDefinition.
     * 
     * @return scpAllowMultipleQueries
     */
    public java.lang.Short getScpAllowMultipleQueries() {
        return scpAllowMultipleQueries;
    }


    /**
     * Sets the scpAllowMultipleQueries value for this ServiceDefinition.
     * 
     * @param scpAllowMultipleQueries
     */
    public void setScpAllowMultipleQueries(java.lang.Short scpAllowMultipleQueries) {
        this.scpAllowMultipleQueries = scpAllowMultipleQueries;
    }


    /**
     * Gets the serviceNumber value for this ServiceDefinition.
     * 
     * @return serviceNumber
     */
    public java.lang.Integer getServiceNumber() {
        return serviceNumber;
    }


    /**
     * Sets the serviceNumber value for this ServiceDefinition.
     * 
     * @param serviceNumber
     */
    public void setServiceNumber(java.lang.Integer serviceNumber) {
        this.serviceNumber = serviceNumber;
    }


    /**
     * Gets the serviceDeviceType value for this ServiceDefinition.
     * 
     * @return serviceDeviceType
     */
    public java.lang.Short getServiceDeviceType() {
        return serviceDeviceType;
    }


    /**
     * Sets the serviceDeviceType value for this ServiceDefinition.
     * 
     * @param serviceDeviceType
     */
    public void setServiceDeviceType(java.lang.Short serviceDeviceType) {
        this.serviceDeviceType = serviceDeviceType;
    }


    /**
     * Gets the serviceType value for this ServiceDefinition.
     * 
     * @return serviceType
     */
    public java.lang.Short getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this ServiceDefinition.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.Short serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the locReqRspSubsvc value for this ServiceDefinition.
     * 
     * @return locReqRspSubsvc
     */
    public java.lang.String getLocReqRspSubsvc() {
        return locReqRspSubsvc;
    }


    /**
     * Sets the locReqRspSubsvc value for this ServiceDefinition.
     * 
     * @param locReqRspSubsvc
     */
    public void setLocReqRspSubsvc(java.lang.String locReqRspSubsvc) {
        this.locReqRspSubsvc = locReqRspSubsvc;
    }


    /**
     * Gets the analyzeRouteSubsvc value for this ServiceDefinition.
     * 
     * @return analyzeRouteSubsvc
     */
    public java.lang.String getAnalyzeRouteSubsvc() {
        return analyzeRouteSubsvc;
    }


    /**
     * Sets the analyzeRouteSubsvc value for this ServiceDefinition.
     * 
     * @param analyzeRouteSubsvc
     */
    public void setAnalyzeRouteSubsvc(java.lang.String analyzeRouteSubsvc) {
        this.analyzeRouteSubsvc = analyzeRouteSubsvc;
    }


    /**
     * Gets the tranNumReqRspSubsvc value for this ServiceDefinition.
     * 
     * @return tranNumReqRspSubsvc
     */
    public java.lang.String getTranNumReqRspSubsvc() {
        return tranNumReqRspSubsvc;
    }


    /**
     * Sets the tranNumReqRspSubsvc value for this ServiceDefinition.
     * 
     * @param tranNumReqRspSubsvc
     */
    public void setTranNumReqRspSubsvc(java.lang.String tranNumReqRspSubsvc) {
        this.tranNumReqRspSubsvc = tranNumReqRspSubsvc;
    }


    /**
     * Gets the rchReqSubsvc value for this ServiceDefinition.
     * 
     * @return rchReqSubsvc
     */
    public java.lang.String getRchReqSubsvc() {
        return rchReqSubsvc;
    }


    /**
     * Sets the rchReqSubsvc value for this ServiceDefinition.
     * 
     * @param rchReqSubsvc
     */
    public void setRchReqSubsvc(java.lang.String rchReqSubsvc) {
        this.rchReqSubsvc = rchReqSubsvc;
    }


    /**
     * Gets the sriQueryRspSubsvc value for this ServiceDefinition.
     * 
     * @return sriQueryRspSubsvc
     */
    public java.lang.String getSriQueryRspSubsvc() {
        return sriQueryRspSubsvc;
    }


    /**
     * Sets the sriQueryRspSubsvc value for this ServiceDefinition.
     * 
     * @param sriQueryRspSubsvc
     */
    public void setSriQueryRspSubsvc(java.lang.String sriQueryRspSubsvc) {
        this.sriQueryRspSubsvc = sriQueryRspSubsvc;
    }


    /**
     * Gets the attributes value for this ServiceDefinition.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this ServiceDefinition.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the triggerFilterCriteriaId value for this ServiceDefinition.
     * 
     * @return triggerFilterCriteriaId
     */
    public java.lang.String getTriggerFilterCriteriaId() {
        return triggerFilterCriteriaId;
    }


    /**
     * Sets the triggerFilterCriteriaId value for this ServiceDefinition.
     * 
     * @param triggerFilterCriteriaId
     */
    public void setTriggerFilterCriteriaId(java.lang.String triggerFilterCriteriaId) {
        this.triggerFilterCriteriaId = triggerFilterCriteriaId;
    }


    /**
     * Gets the escapeFilterCriteriaId value for this ServiceDefinition.
     * 
     * @return escapeFilterCriteriaId
     */
    public java.lang.String getEscapeFilterCriteriaId() {
        return escapeFilterCriteriaId;
    }


    /**
     * Sets the escapeFilterCriteriaId value for this ServiceDefinition.
     * 
     * @param escapeFilterCriteriaId
     */
    public void setEscapeFilterCriteriaId(java.lang.String escapeFilterCriteriaId) {
        this.escapeFilterCriteriaId = escapeFilterCriteriaId;
    }


    /**
     * Gets the sipScpService value for this ServiceDefinition.
     * 
     * @return sipScpService
     */
    public java.lang.Integer getSipScpService() {
        return sipScpService;
    }


    /**
     * Sets the sipScpService value for this ServiceDefinition.
     * 
     * @param sipScpService
     */
    public void setSipScpService(java.lang.Integer sipScpService) {
        this.sipScpService = sipScpService;
    }


    /**
     * Gets the sipDeviceId value for this ServiceDefinition.
     * 
     * @return sipDeviceId
     */
    public java.lang.String getSipDeviceId() {
        return sipDeviceId;
    }


    /**
     * Sets the sipDeviceId value for this ServiceDefinition.
     * 
     * @param sipDeviceId
     */
    public void setSipDeviceId(java.lang.String sipDeviceId) {
        this.sipDeviceId = sipDeviceId;
    }


    /**
     * Gets the scpRequestTimeout value for this ServiceDefinition.
     * 
     * @return scpRequestTimeout
     */
    public java.lang.Integer getScpRequestTimeout() {
        return scpRequestTimeout;
    }


    /**
     * Sets the scpRequestTimeout value for this ServiceDefinition.
     * 
     * @param scpRequestTimeout
     */
    public void setScpRequestTimeout(java.lang.Integer scpRequestTimeout) {
        this.scpRequestTimeout = scpRequestTimeout;
    }


    /**
     * Gets the translationCriteria value for this ServiceDefinition.
     * 
     * @return translationCriteria
     */
    public java.lang.Integer getTranslationCriteria() {
        return translationCriteria;
    }


    /**
     * Sets the translationCriteria value for this ServiceDefinition.
     * 
     * @param translationCriteria
     */
    public void setTranslationCriteria(java.lang.Integer translationCriteria) {
        this.translationCriteria = translationCriteria;
    }


    /**
     * Gets the scpRequestTimeout2 value for this ServiceDefinition.
     * 
     * @return scpRequestTimeout2
     */
    public java.lang.Integer getScpRequestTimeout2() {
        return scpRequestTimeout2;
    }


    /**
     * Sets the scpRequestTimeout2 value for this ServiceDefinition.
     * 
     * @param scpRequestTimeout2
     */
    public void setScpRequestTimeout2(java.lang.Integer scpRequestTimeout2) {
        this.scpRequestTimeout2 = scpRequestTimeout2;
    }


    /**
     * Gets the scpRequestTimeout3 value for this ServiceDefinition.
     * 
     * @return scpRequestTimeout3
     */
    public java.lang.Integer getScpRequestTimeout3() {
        return scpRequestTimeout3;
    }


    /**
     * Sets the scpRequestTimeout3 value for this ServiceDefinition.
     * 
     * @param scpRequestTimeout3
     */
    public void setScpRequestTimeout3(java.lang.Integer scpRequestTimeout3) {
        this.scpRequestTimeout3 = scpRequestTimeout3;
    }


    /**
     * Gets the scpRequestTimeout4 value for this ServiceDefinition.
     * 
     * @return scpRequestTimeout4
     */
    public java.lang.Integer getScpRequestTimeout4() {
        return scpRequestTimeout4;
    }


    /**
     * Sets the scpRequestTimeout4 value for this ServiceDefinition.
     * 
     * @param scpRequestTimeout4
     */
    public void setScpRequestTimeout4(java.lang.Integer scpRequestTimeout4) {
        this.scpRequestTimeout4 = scpRequestTimeout4;
    }


    /**
     * Gets the scpRequestTimeout5 value for this ServiceDefinition.
     * 
     * @return scpRequestTimeout5
     */
    public java.lang.Integer getScpRequestTimeout5() {
        return scpRequestTimeout5;
    }


    /**
     * Sets the scpRequestTimeout5 value for this ServiceDefinition.
     * 
     * @param scpRequestTimeout5
     */
    public void setScpRequestTimeout5(java.lang.Integer scpRequestTimeout5) {
        this.scpRequestTimeout5 = scpRequestTimeout5;
    }


    /**
     * Gets the inServiceKey value for this ServiceDefinition.
     * 
     * @return inServiceKey
     */
    public java.lang.Integer getInServiceKey() {
        return inServiceKey;
    }


    /**
     * Sets the inServiceKey value for this ServiceDefinition.
     * 
     * @param inServiceKey
     */
    public void setInServiceKey(java.lang.Integer inServiceKey) {
        this.inServiceKey = inServiceKey;
    }


    /**
     * Gets the gsmscfAddress value for this ServiceDefinition.
     * 
     * @return gsmscfAddress
     */
    public java.lang.String getGsmscfAddress() {
        return gsmscfAddress;
    }


    /**
     * Sets the gsmscfAddress value for this ServiceDefinition.
     * 
     * @param gsmscfAddress
     */
    public void setGsmscfAddress(java.lang.String gsmscfAddress) {
        this.gsmscfAddress = gsmscfAddress;
    }


    /**
     * Gets the detectionPoint value for this ServiceDefinition.
     * 
     * @return detectionPoint
     */
    public java.lang.Integer getDetectionPoint() {
        return detectionPoint;
    }


    /**
     * Sets the detectionPoint value for this ServiceDefinition.
     * 
     * @param detectionPoint
     */
    public void setDetectionPoint(java.lang.Integer detectionPoint) {
        this.detectionPoint = detectionPoint;
    }


    /**
     * Gets the domainName value for this ServiceDefinition.
     * 
     * @return domainName
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this ServiceDefinition.
     * 
     * @param domainName
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the inapVariant value for this ServiceDefinition.
     * 
     * @return inapVariant
     */
    public java.lang.Integer getInapVariant() {
        return inapVariant;
    }


    /**
     * Sets the inapVariant value for this ServiceDefinition.
     * 
     * @param inapVariant
     */
    public void setInapVariant(java.lang.Integer inapVariant) {
        this.inapVariant = inapVariant;
    }


    /**
     * Gets the e911VpcDeviceId value for this ServiceDefinition.
     * 
     * @return e911VpcDeviceId
     */
    public java.lang.String getE911VpcDeviceId() {
        return e911VpcDeviceId;
    }


    /**
     * Sets the e911VpcDeviceId value for this ServiceDefinition.
     * 
     * @param e911VpcDeviceId
     */
    public void setE911VpcDeviceId(java.lang.String e911VpcDeviceId) {
        this.e911VpcDeviceId = e911VpcDeviceId;
    }


    /**
     * Gets the routingPrecedenceType value for this ServiceDefinition.
     * 
     * @return routingPrecedenceType
     */
    public java.lang.Integer getRoutingPrecedenceType() {
        return routingPrecedenceType;
    }


    /**
     * Sets the routingPrecedenceType value for this ServiceDefinition.
     * 
     * @param routingPrecedenceType
     */
    public void setRoutingPrecedenceType(java.lang.Integer routingPrecedenceType) {
        this.routingPrecedenceType = routingPrecedenceType;
    }


    /**
     * Gets the sccpClass value for this ServiceDefinition.
     * 
     * @return sccpClass
     */
    public java.lang.Integer getSccpClass() {
        return sccpClass;
    }


    /**
     * Sets the sccpClass value for this ServiceDefinition.
     * 
     * @param sccpClass
     */
    public void setSccpClass(java.lang.Integer sccpClass) {
        this.sccpClass = sccpClass;
    }


    /**
     * Gets the capMapSs7Stack value for this ServiceDefinition.
     * 
     * @return capMapSs7Stack
     */
    public java.lang.Integer getCapMapSs7Stack() {
        return capMapSs7Stack;
    }


    /**
     * Sets the capMapSs7Stack value for this ServiceDefinition.
     * 
     * @param capMapSs7Stack
     */
    public void setCapMapSs7Stack(java.lang.Integer capMapSs7Stack) {
        this.capMapSs7Stack = capMapSs7Stack;
    }


    /**
     * Gets the qorRelCause1 value for this ServiceDefinition.
     * 
     * @return qorRelCause1
     */
    public java.lang.Integer getQorRelCause1() {
        return qorRelCause1;
    }


    /**
     * Sets the qorRelCause1 value for this ServiceDefinition.
     * 
     * @param qorRelCause1
     */
    public void setQorRelCause1(java.lang.Integer qorRelCause1) {
        this.qorRelCause1 = qorRelCause1;
    }


    /**
     * Gets the qorRelCause2 value for this ServiceDefinition.
     * 
     * @return qorRelCause2
     */
    public java.lang.Integer getQorRelCause2() {
        return qorRelCause2;
    }


    /**
     * Sets the qorRelCause2 value for this ServiceDefinition.
     * 
     * @param qorRelCause2
     */
    public void setQorRelCause2(java.lang.Integer qorRelCause2) {
        this.qorRelCause2 = qorRelCause2;
    }


    /**
     * Gets the numberControlProfileId value for this ServiceDefinition.
     * 
     * @return numberControlProfileId
     */
    public java.lang.String getNumberControlProfileId() {
        return numberControlProfileId;
    }


    /**
     * Sets the numberControlProfileId value for this ServiceDefinition.
     * 
     * @param numberControlProfileId
     */
    public void setNumberControlProfileId(java.lang.String numberControlProfileId) {
        this.numberControlProfileId = numberControlProfileId;
    }


    /**
     * Gets the releaseCauseInTriggerProfileId value for this ServiceDefinition.
     * 
     * @return releaseCauseInTriggerProfileId
     */
    public java.lang.String getReleaseCauseInTriggerProfileId() {
        return releaseCauseInTriggerProfileId;
    }


    /**
     * Sets the releaseCauseInTriggerProfileId value for this ServiceDefinition.
     * 
     * @param releaseCauseInTriggerProfileId
     */
    public void setReleaseCauseInTriggerProfileId(java.lang.String releaseCauseInTriggerProfileId) {
        this.releaseCauseInTriggerProfileId = releaseCauseInTriggerProfileId;
    }


    /**
     * Gets the dtProfileId value for this ServiceDefinition.
     * 
     * @return dtProfileId
     */
    public java.lang.String getDtProfileId() {
        return dtProfileId;
    }


    /**
     * Sets the dtProfileId value for this ServiceDefinition.
     * 
     * @param dtProfileId
     */
    public void setDtProfileId(java.lang.String dtProfileId) {
        this.dtProfileId = dtProfileId;
    }


    /**
     * Gets the inDialogueHandlingProfileId value for this ServiceDefinition.
     * 
     * @return inDialogueHandlingProfileId
     */
    public java.lang.String getInDialogueHandlingProfileId() {
        return inDialogueHandlingProfileId;
    }


    /**
     * Sets the inDialogueHandlingProfileId value for this ServiceDefinition.
     * 
     * @param inDialogueHandlingProfileId
     */
    public void setInDialogueHandlingProfileId(java.lang.String inDialogueHandlingProfileId) {
        this.inDialogueHandlingProfileId = inDialogueHandlingProfileId;
    }


    /**
     * Gets the rexServiceId value for this ServiceDefinition.
     * 
     * @return rexServiceId
     */
    public java.lang.String getRexServiceId() {
        return rexServiceId;
    }


    /**
     * Sets the rexServiceId value for this ServiceDefinition.
     * 
     * @param rexServiceId
     */
    public void setRexServiceId(java.lang.String rexServiceId) {
        this.rexServiceId = rexServiceId;
    }


    /**
     * Gets the attributes2 value for this ServiceDefinition.
     * 
     * @return attributes2
     */
    public java.lang.Integer getAttributes2() {
        return attributes2;
    }


    /**
     * Sets the attributes2 value for this ServiceDefinition.
     * 
     * @param attributes2
     */
    public void setAttributes2(java.lang.Integer attributes2) {
        this.attributes2 = attributes2;
    }


    /**
     * Gets the userInfoProfileId value for this ServiceDefinition.
     * 
     * @return userInfoProfileId
     */
    public java.lang.String getUserInfoProfileId() {
        return userInfoProfileId;
    }


    /**
     * Sets the userInfoProfileId value for this ServiceDefinition.
     * 
     * @param userInfoProfileId
     */
    public void setUserInfoProfileId(java.lang.String userInfoProfileId) {
        this.userInfoProfileId = userInfoProfileId;
    }


    /**
     * Gets the ttlTimer value for this ServiceDefinition.
     * 
     * @return ttlTimer
     */
    public java.lang.Integer getTtlTimer() {
        return ttlTimer;
    }


    /**
     * Sets the ttlTimer value for this ServiceDefinition.
     * 
     * @param ttlTimer
     */
    public void setTtlTimer(java.lang.Integer ttlTimer) {
        this.ttlTimer = ttlTimer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceDefinition)) return false;
        ServiceDefinition other = (ServiceDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.scpQueryPriority==null && other.getScpQueryPriority()==null) || 
             (this.scpQueryPriority!=null &&
              this.scpQueryPriority.equals(other.getScpQueryPriority()))) &&
            ((this.serviceDescription==null && other.getServiceDescription()==null) || 
             (this.serviceDescription!=null &&
              this.serviceDescription.equals(other.getServiceDescription()))) &&
            ((this.ainTriggerType==null && other.getAinTriggerType()==null) || 
             (this.ainTriggerType!=null &&
              this.ainTriggerType.equals(other.getAinTriggerType()))) &&
            ((this.servicePmRuleId==null && other.getServicePmRuleId()==null) || 
             (this.servicePmRuleId!=null &&
              this.servicePmRuleId.equals(other.getServicePmRuleId()))) &&
            ((this.serviceInPmRuleId==null && other.getServiceInPmRuleId()==null) || 
             (this.serviceInPmRuleId!=null &&
              this.serviceInPmRuleId.equals(other.getServiceInPmRuleId()))) &&
            ((this.serviceOutPmRuleId==null && other.getServiceOutPmRuleId()==null) || 
             (this.serviceOutPmRuleId!=null &&
              this.serviceOutPmRuleId.equals(other.getServiceOutPmRuleId()))) &&
            ((this.triggerCriteria==null && other.getTriggerCriteria()==null) || 
             (this.triggerCriteria!=null &&
              this.triggerCriteria.equals(other.getTriggerCriteria()))) &&
            ((this.escapeCriteria==null && other.getEscapeCriteria()==null) || 
             (this.escapeCriteria!=null &&
              this.escapeCriteria.equals(other.getEscapeCriteria()))) &&
            ((this.scpTriggerTreatment==null && other.getScpTriggerTreatment()==null) || 
             (this.scpTriggerTreatment!=null &&
              this.scpTriggerTreatment.equals(other.getScpTriggerTreatment()))) &&
            ((this.scpTriggerActive==null && other.getScpTriggerActive()==null) || 
             (this.scpTriggerActive!=null &&
              this.scpTriggerActive.equals(other.getScpTriggerActive()))) &&
            ((this.scpAllowMultipleQueries==null && other.getScpAllowMultipleQueries()==null) || 
             (this.scpAllowMultipleQueries!=null &&
              this.scpAllowMultipleQueries.equals(other.getScpAllowMultipleQueries()))) &&
            ((this.serviceNumber==null && other.getServiceNumber()==null) || 
             (this.serviceNumber!=null &&
              this.serviceNumber.equals(other.getServiceNumber()))) &&
            ((this.serviceDeviceType==null && other.getServiceDeviceType()==null) || 
             (this.serviceDeviceType!=null &&
              this.serviceDeviceType.equals(other.getServiceDeviceType()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.locReqRspSubsvc==null && other.getLocReqRspSubsvc()==null) || 
             (this.locReqRspSubsvc!=null &&
              this.locReqRspSubsvc.equals(other.getLocReqRspSubsvc()))) &&
            ((this.analyzeRouteSubsvc==null && other.getAnalyzeRouteSubsvc()==null) || 
             (this.analyzeRouteSubsvc!=null &&
              this.analyzeRouteSubsvc.equals(other.getAnalyzeRouteSubsvc()))) &&
            ((this.tranNumReqRspSubsvc==null && other.getTranNumReqRspSubsvc()==null) || 
             (this.tranNumReqRspSubsvc!=null &&
              this.tranNumReqRspSubsvc.equals(other.getTranNumReqRspSubsvc()))) &&
            ((this.rchReqSubsvc==null && other.getRchReqSubsvc()==null) || 
             (this.rchReqSubsvc!=null &&
              this.rchReqSubsvc.equals(other.getRchReqSubsvc()))) &&
            ((this.sriQueryRspSubsvc==null && other.getSriQueryRspSubsvc()==null) || 
             (this.sriQueryRspSubsvc!=null &&
              this.sriQueryRspSubsvc.equals(other.getSriQueryRspSubsvc()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.triggerFilterCriteriaId==null && other.getTriggerFilterCriteriaId()==null) || 
             (this.triggerFilterCriteriaId!=null &&
              this.triggerFilterCriteriaId.equals(other.getTriggerFilterCriteriaId()))) &&
            ((this.escapeFilterCriteriaId==null && other.getEscapeFilterCriteriaId()==null) || 
             (this.escapeFilterCriteriaId!=null &&
              this.escapeFilterCriteriaId.equals(other.getEscapeFilterCriteriaId()))) &&
            ((this.sipScpService==null && other.getSipScpService()==null) || 
             (this.sipScpService!=null &&
              this.sipScpService.equals(other.getSipScpService()))) &&
            ((this.sipDeviceId==null && other.getSipDeviceId()==null) || 
             (this.sipDeviceId!=null &&
              this.sipDeviceId.equals(other.getSipDeviceId()))) &&
            ((this.scpRequestTimeout==null && other.getScpRequestTimeout()==null) || 
             (this.scpRequestTimeout!=null &&
              this.scpRequestTimeout.equals(other.getScpRequestTimeout()))) &&
            ((this.translationCriteria==null && other.getTranslationCriteria()==null) || 
             (this.translationCriteria!=null &&
              this.translationCriteria.equals(other.getTranslationCriteria()))) &&
            ((this.scpRequestTimeout2==null && other.getScpRequestTimeout2()==null) || 
             (this.scpRequestTimeout2!=null &&
              this.scpRequestTimeout2.equals(other.getScpRequestTimeout2()))) &&
            ((this.scpRequestTimeout3==null && other.getScpRequestTimeout3()==null) || 
             (this.scpRequestTimeout3!=null &&
              this.scpRequestTimeout3.equals(other.getScpRequestTimeout3()))) &&
            ((this.scpRequestTimeout4==null && other.getScpRequestTimeout4()==null) || 
             (this.scpRequestTimeout4!=null &&
              this.scpRequestTimeout4.equals(other.getScpRequestTimeout4()))) &&
            ((this.scpRequestTimeout5==null && other.getScpRequestTimeout5()==null) || 
             (this.scpRequestTimeout5!=null &&
              this.scpRequestTimeout5.equals(other.getScpRequestTimeout5()))) &&
            ((this.inServiceKey==null && other.getInServiceKey()==null) || 
             (this.inServiceKey!=null &&
              this.inServiceKey.equals(other.getInServiceKey()))) &&
            ((this.gsmscfAddress==null && other.getGsmscfAddress()==null) || 
             (this.gsmscfAddress!=null &&
              this.gsmscfAddress.equals(other.getGsmscfAddress()))) &&
            ((this.detectionPoint==null && other.getDetectionPoint()==null) || 
             (this.detectionPoint!=null &&
              this.detectionPoint.equals(other.getDetectionPoint()))) &&
            ((this.domainName==null && other.getDomainName()==null) || 
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
            ((this.inapVariant==null && other.getInapVariant()==null) || 
             (this.inapVariant!=null &&
              this.inapVariant.equals(other.getInapVariant()))) &&
            ((this.e911VpcDeviceId==null && other.getE911VpcDeviceId()==null) || 
             (this.e911VpcDeviceId!=null &&
              this.e911VpcDeviceId.equals(other.getE911VpcDeviceId()))) &&
            ((this.routingPrecedenceType==null && other.getRoutingPrecedenceType()==null) || 
             (this.routingPrecedenceType!=null &&
              this.routingPrecedenceType.equals(other.getRoutingPrecedenceType()))) &&
            ((this.sccpClass==null && other.getSccpClass()==null) || 
             (this.sccpClass!=null &&
              this.sccpClass.equals(other.getSccpClass()))) &&
            ((this.capMapSs7Stack==null && other.getCapMapSs7Stack()==null) || 
             (this.capMapSs7Stack!=null &&
              this.capMapSs7Stack.equals(other.getCapMapSs7Stack()))) &&
            ((this.qorRelCause1==null && other.getQorRelCause1()==null) || 
             (this.qorRelCause1!=null &&
              this.qorRelCause1.equals(other.getQorRelCause1()))) &&
            ((this.qorRelCause2==null && other.getQorRelCause2()==null) || 
             (this.qorRelCause2!=null &&
              this.qorRelCause2.equals(other.getQorRelCause2()))) &&
            ((this.numberControlProfileId==null && other.getNumberControlProfileId()==null) || 
             (this.numberControlProfileId!=null &&
              this.numberControlProfileId.equals(other.getNumberControlProfileId()))) &&
            ((this.releaseCauseInTriggerProfileId==null && other.getReleaseCauseInTriggerProfileId()==null) || 
             (this.releaseCauseInTriggerProfileId!=null &&
              this.releaseCauseInTriggerProfileId.equals(other.getReleaseCauseInTriggerProfileId()))) &&
            ((this.dtProfileId==null && other.getDtProfileId()==null) || 
             (this.dtProfileId!=null &&
              this.dtProfileId.equals(other.getDtProfileId()))) &&
            ((this.inDialogueHandlingProfileId==null && other.getInDialogueHandlingProfileId()==null) || 
             (this.inDialogueHandlingProfileId!=null &&
              this.inDialogueHandlingProfileId.equals(other.getInDialogueHandlingProfileId()))) &&
            ((this.rexServiceId==null && other.getRexServiceId()==null) || 
             (this.rexServiceId!=null &&
              this.rexServiceId.equals(other.getRexServiceId()))) &&
            ((this.attributes2==null && other.getAttributes2()==null) || 
             (this.attributes2!=null &&
              this.attributes2.equals(other.getAttributes2()))) &&
            ((this.userInfoProfileId==null && other.getUserInfoProfileId()==null) || 
             (this.userInfoProfileId!=null &&
              this.userInfoProfileId.equals(other.getUserInfoProfileId()))) &&
            ((this.ttlTimer==null && other.getTtlTimer()==null) || 
             (this.ttlTimer!=null &&
              this.ttlTimer.equals(other.getTtlTimer())));
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
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getScpQueryPriority() != null) {
            _hashCode += getScpQueryPriority().hashCode();
        }
        if (getServiceDescription() != null) {
            _hashCode += getServiceDescription().hashCode();
        }
        if (getAinTriggerType() != null) {
            _hashCode += getAinTriggerType().hashCode();
        }
        if (getServicePmRuleId() != null) {
            _hashCode += getServicePmRuleId().hashCode();
        }
        if (getServiceInPmRuleId() != null) {
            _hashCode += getServiceInPmRuleId().hashCode();
        }
        if (getServiceOutPmRuleId() != null) {
            _hashCode += getServiceOutPmRuleId().hashCode();
        }
        if (getTriggerCriteria() != null) {
            _hashCode += getTriggerCriteria().hashCode();
        }
        if (getEscapeCriteria() != null) {
            _hashCode += getEscapeCriteria().hashCode();
        }
        if (getScpTriggerTreatment() != null) {
            _hashCode += getScpTriggerTreatment().hashCode();
        }
        if (getScpTriggerActive() != null) {
            _hashCode += getScpTriggerActive().hashCode();
        }
        if (getScpAllowMultipleQueries() != null) {
            _hashCode += getScpAllowMultipleQueries().hashCode();
        }
        if (getServiceNumber() != null) {
            _hashCode += getServiceNumber().hashCode();
        }
        if (getServiceDeviceType() != null) {
            _hashCode += getServiceDeviceType().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getLocReqRspSubsvc() != null) {
            _hashCode += getLocReqRspSubsvc().hashCode();
        }
        if (getAnalyzeRouteSubsvc() != null) {
            _hashCode += getAnalyzeRouteSubsvc().hashCode();
        }
        if (getTranNumReqRspSubsvc() != null) {
            _hashCode += getTranNumReqRspSubsvc().hashCode();
        }
        if (getRchReqSubsvc() != null) {
            _hashCode += getRchReqSubsvc().hashCode();
        }
        if (getSriQueryRspSubsvc() != null) {
            _hashCode += getSriQueryRspSubsvc().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getTriggerFilterCriteriaId() != null) {
            _hashCode += getTriggerFilterCriteriaId().hashCode();
        }
        if (getEscapeFilterCriteriaId() != null) {
            _hashCode += getEscapeFilterCriteriaId().hashCode();
        }
        if (getSipScpService() != null) {
            _hashCode += getSipScpService().hashCode();
        }
        if (getSipDeviceId() != null) {
            _hashCode += getSipDeviceId().hashCode();
        }
        if (getScpRequestTimeout() != null) {
            _hashCode += getScpRequestTimeout().hashCode();
        }
        if (getTranslationCriteria() != null) {
            _hashCode += getTranslationCriteria().hashCode();
        }
        if (getScpRequestTimeout2() != null) {
            _hashCode += getScpRequestTimeout2().hashCode();
        }
        if (getScpRequestTimeout3() != null) {
            _hashCode += getScpRequestTimeout3().hashCode();
        }
        if (getScpRequestTimeout4() != null) {
            _hashCode += getScpRequestTimeout4().hashCode();
        }
        if (getScpRequestTimeout5() != null) {
            _hashCode += getScpRequestTimeout5().hashCode();
        }
        if (getInServiceKey() != null) {
            _hashCode += getInServiceKey().hashCode();
        }
        if (getGsmscfAddress() != null) {
            _hashCode += getGsmscfAddress().hashCode();
        }
        if (getDetectionPoint() != null) {
            _hashCode += getDetectionPoint().hashCode();
        }
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        if (getInapVariant() != null) {
            _hashCode += getInapVariant().hashCode();
        }
        if (getE911VpcDeviceId() != null) {
            _hashCode += getE911VpcDeviceId().hashCode();
        }
        if (getRoutingPrecedenceType() != null) {
            _hashCode += getRoutingPrecedenceType().hashCode();
        }
        if (getSccpClass() != null) {
            _hashCode += getSccpClass().hashCode();
        }
        if (getCapMapSs7Stack() != null) {
            _hashCode += getCapMapSs7Stack().hashCode();
        }
        if (getQorRelCause1() != null) {
            _hashCode += getQorRelCause1().hashCode();
        }
        if (getQorRelCause2() != null) {
            _hashCode += getQorRelCause2().hashCode();
        }
        if (getNumberControlProfileId() != null) {
            _hashCode += getNumberControlProfileId().hashCode();
        }
        if (getReleaseCauseInTriggerProfileId() != null) {
            _hashCode += getReleaseCauseInTriggerProfileId().hashCode();
        }
        if (getDtProfileId() != null) {
            _hashCode += getDtProfileId().hashCode();
        }
        if (getInDialogueHandlingProfileId() != null) {
            _hashCode += getInDialogueHandlingProfileId().hashCode();
        }
        if (getRexServiceId() != null) {
            _hashCode += getRexServiceId().hashCode();
        }
        if (getAttributes2() != null) {
            _hashCode += getAttributes2().hashCode();
        }
        if (getUserInfoProfileId() != null) {
            _hashCode += getUserInfoProfileId().hashCode();
        }
        if (getTtlTimer() != null) {
            _hashCode += getTtlTimer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ServiceDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpQueryPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpQueryPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ainTriggerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ainTriggerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicePmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceInPmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceInPmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOutPmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceOutPmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triggerCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escapeCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "escapeCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpTriggerTreatment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpTriggerTreatment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpTriggerActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpTriggerActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpAllowMultipleQueries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpAllowMultipleQueries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDeviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceDeviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locReqRspSubsvc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locReqRspSubsvc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("analyzeRouteSubsvc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "analyzeRouteSubsvc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranNumReqRspSubsvc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tranNumReqRspSubsvc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rchReqSubsvc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rchReqSubsvc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sriQueryRspSubsvc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sriQueryRspSubsvc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerFilterCriteriaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triggerFilterCriteriaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escapeFilterCriteriaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "escapeFilterCriteriaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipScpService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipScpService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipDeviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipDeviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpRequestTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpRequestTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translationCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpRequestTimeout2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpRequestTimeout2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpRequestTimeout3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpRequestTimeout3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpRequestTimeout4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpRequestTimeout4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpRequestTimeout5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpRequestTimeout5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inServiceKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inServiceKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gsmscfAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gsmscfAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detectionPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detectionPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inapVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e911VpcDeviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "e911VpcDeviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingPrecedenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingPrecedenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sccpClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sccpClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMapSs7Stack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capMapSs7Stack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qorRelCause1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qorRelCause1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qorRelCause2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qorRelCause2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberControlProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseCauseInTriggerProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseCauseInTriggerProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inDialogueHandlingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inDialogueHandlingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rexServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rexServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfoProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userInfoProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttlTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttlTimer"));
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
