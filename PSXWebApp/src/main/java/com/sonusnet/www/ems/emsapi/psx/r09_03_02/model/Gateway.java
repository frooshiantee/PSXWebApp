/**
 * Gateway.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class Gateway  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String gatewayId;

    private java.lang.String switchId;

    private java.lang.Short portNumber;

    private java.lang.String ipAddress;

    private java.lang.Integer sipIpSh;

    private java.lang.String sipIpSt;

    private java.lang.Short h323IpSh;

    private java.lang.String h323IpSt;

    private java.lang.String gatewayGroupId;

    private java.lang.Short gatewayType;

    private java.lang.String routingLabelId;

    private java.lang.Integer h323ControlFlags;

    private java.lang.Integer elementAttributes;

    private java.lang.String classOfServiceId;

    private java.lang.String clusterProfileId;

    private java.lang.Short usePartialCli;

    private java.lang.String switchType;

    private java.lang.String switchNumber;

    private java.lang.String switchIdentifier;

    private java.lang.String optionalDigits;

    private java.lang.String exceptionProfileId;

    private java.lang.String defaultTrunkgroupId;

    private java.lang.String chargeBandProfileId;

    private java.lang.Short trafficManagementFlag;

    private java.lang.String transitRouteLabel;

    private java.lang.String parentGatewayId;

    private java.lang.String rasIpAddress;

    private java.lang.String tcEscapeProfileId;

    private java.lang.Short mobileSwitchId;

    private java.lang.String gatewayGroupSigId;

    private java.lang.Short gatewayTypeAttributes;

    private java.lang.String zoneIndexProfileId;

    private java.lang.String enumAuthProfileId;

    private java.lang.Short ipv6PortNumber;

    private java.lang.String ipv6Address;

    private java.lang.Integer sipIpv6Sh;

    private java.lang.String sipIpv6St;

    private java.lang.Short h323Ipv6Sh;

    private java.lang.String h323Ipv6St;

    private java.lang.String rasIpv6Address;

    private java.lang.Integer gatewayAttribute;

    private java.lang.String sipFqdn;

    private java.lang.Integer sipFqdnPort;

    private java.lang.Integer sipCntlFlags;

    private java.lang.String arsProfileId;

    private java.lang.String smmProfileGroupId;

    private java.lang.String peerThrottlingProfileId;

    public Gateway() {
    }

    public Gateway(
           java.lang.String gatewayId,
           java.lang.String switchId,
           java.lang.Short portNumber,
           java.lang.String ipAddress,
           java.lang.Integer sipIpSh,
           java.lang.String sipIpSt,
           java.lang.Short h323IpSh,
           java.lang.String h323IpSt,
           java.lang.String gatewayGroupId,
           java.lang.Short gatewayType,
           java.lang.String routingLabelId,
           java.lang.Integer h323ControlFlags,
           java.lang.Integer elementAttributes,
           java.lang.String classOfServiceId,
           java.lang.String clusterProfileId,
           java.lang.Short usePartialCli,
           java.lang.String switchType,
           java.lang.String switchNumber,
           java.lang.String switchIdentifier,
           java.lang.String optionalDigits,
           java.lang.String exceptionProfileId,
           java.lang.String defaultTrunkgroupId,
           java.lang.String chargeBandProfileId,
           java.lang.Short trafficManagementFlag,
           java.lang.String transitRouteLabel,
           java.lang.String parentGatewayId,
           java.lang.String rasIpAddress,
           java.lang.String tcEscapeProfileId,
           java.lang.Short mobileSwitchId,
           java.lang.String gatewayGroupSigId,
           java.lang.Short gatewayTypeAttributes,
           java.lang.String zoneIndexProfileId,
           java.lang.String enumAuthProfileId,
           java.lang.Short ipv6PortNumber,
           java.lang.String ipv6Address,
           java.lang.Integer sipIpv6Sh,
           java.lang.String sipIpv6St,
           java.lang.Short h323Ipv6Sh,
           java.lang.String h323Ipv6St,
           java.lang.String rasIpv6Address,
           java.lang.Integer gatewayAttribute,
           java.lang.String sipFqdn,
           java.lang.Integer sipFqdnPort,
           java.lang.Integer sipCntlFlags,
           java.lang.String arsProfileId,
           java.lang.String smmProfileGroupId,
           java.lang.String peerThrottlingProfileId) {
        this.gatewayId = gatewayId;
        this.switchId = switchId;
        this.portNumber = portNumber;
        this.ipAddress = ipAddress;
        this.sipIpSh = sipIpSh;
        this.sipIpSt = sipIpSt;
        this.h323IpSh = h323IpSh;
        this.h323IpSt = h323IpSt;
        this.gatewayGroupId = gatewayGroupId;
        this.gatewayType = gatewayType;
        this.routingLabelId = routingLabelId;
        this.h323ControlFlags = h323ControlFlags;
        this.elementAttributes = elementAttributes;
        this.classOfServiceId = classOfServiceId;
        this.clusterProfileId = clusterProfileId;
        this.usePartialCli = usePartialCli;
        this.switchType = switchType;
        this.switchNumber = switchNumber;
        this.switchIdentifier = switchIdentifier;
        this.optionalDigits = optionalDigits;
        this.exceptionProfileId = exceptionProfileId;
        this.defaultTrunkgroupId = defaultTrunkgroupId;
        this.chargeBandProfileId = chargeBandProfileId;
        this.trafficManagementFlag = trafficManagementFlag;
        this.transitRouteLabel = transitRouteLabel;
        this.parentGatewayId = parentGatewayId;
        this.rasIpAddress = rasIpAddress;
        this.tcEscapeProfileId = tcEscapeProfileId;
        this.mobileSwitchId = mobileSwitchId;
        this.gatewayGroupSigId = gatewayGroupSigId;
        this.gatewayTypeAttributes = gatewayTypeAttributes;
        this.zoneIndexProfileId = zoneIndexProfileId;
        this.enumAuthProfileId = enumAuthProfileId;
        this.ipv6PortNumber = ipv6PortNumber;
        this.ipv6Address = ipv6Address;
        this.sipIpv6Sh = sipIpv6Sh;
        this.sipIpv6St = sipIpv6St;
        this.h323Ipv6Sh = h323Ipv6Sh;
        this.h323Ipv6St = h323Ipv6St;
        this.rasIpv6Address = rasIpv6Address;
        this.gatewayAttribute = gatewayAttribute;
        this.sipFqdn = sipFqdn;
        this.sipFqdnPort = sipFqdnPort;
        this.sipCntlFlags = sipCntlFlags;
        this.arsProfileId = arsProfileId;
        this.smmProfileGroupId = smmProfileGroupId;
        this.peerThrottlingProfileId = peerThrottlingProfileId;
    }


    /**
     * Gets the gatewayId value for this Gateway.
     * 
     * @return gatewayId
     */
    public java.lang.String getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this Gateway.
     * 
     * @param gatewayId
     */
    public void setGatewayId(java.lang.String gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the switchId value for this Gateway.
     * 
     * @return switchId
     */
    public java.lang.String getSwitchId() {
        return switchId;
    }


    /**
     * Sets the switchId value for this Gateway.
     * 
     * @param switchId
     */
    public void setSwitchId(java.lang.String switchId) {
        this.switchId = switchId;
    }


    /**
     * Gets the portNumber value for this Gateway.
     * 
     * @return portNumber
     */
    public java.lang.Short getPortNumber() {
        return portNumber;
    }


    /**
     * Sets the portNumber value for this Gateway.
     * 
     * @param portNumber
     */
    public void setPortNumber(java.lang.Short portNumber) {
        this.portNumber = portNumber;
    }


    /**
     * Gets the ipAddress value for this Gateway.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this Gateway.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the sipIpSh value for this Gateway.
     * 
     * @return sipIpSh
     */
    public java.lang.Integer getSipIpSh() {
        return sipIpSh;
    }


    /**
     * Sets the sipIpSh value for this Gateway.
     * 
     * @param sipIpSh
     */
    public void setSipIpSh(java.lang.Integer sipIpSh) {
        this.sipIpSh = sipIpSh;
    }


    /**
     * Gets the sipIpSt value for this Gateway.
     * 
     * @return sipIpSt
     */
    public java.lang.String getSipIpSt() {
        return sipIpSt;
    }


    /**
     * Sets the sipIpSt value for this Gateway.
     * 
     * @param sipIpSt
     */
    public void setSipIpSt(java.lang.String sipIpSt) {
        this.sipIpSt = sipIpSt;
    }


    /**
     * Gets the h323IpSh value for this Gateway.
     * 
     * @return h323IpSh
     */
    public java.lang.Short getH323IpSh() {
        return h323IpSh;
    }


    /**
     * Sets the h323IpSh value for this Gateway.
     * 
     * @param h323IpSh
     */
    public void setH323IpSh(java.lang.Short h323IpSh) {
        this.h323IpSh = h323IpSh;
    }


    /**
     * Gets the h323IpSt value for this Gateway.
     * 
     * @return h323IpSt
     */
    public java.lang.String getH323IpSt() {
        return h323IpSt;
    }


    /**
     * Sets the h323IpSt value for this Gateway.
     * 
     * @param h323IpSt
     */
    public void setH323IpSt(java.lang.String h323IpSt) {
        this.h323IpSt = h323IpSt;
    }


    /**
     * Gets the gatewayGroupId value for this Gateway.
     * 
     * @return gatewayGroupId
     */
    public java.lang.String getGatewayGroupId() {
        return gatewayGroupId;
    }


    /**
     * Sets the gatewayGroupId value for this Gateway.
     * 
     * @param gatewayGroupId
     */
    public void setGatewayGroupId(java.lang.String gatewayGroupId) {
        this.gatewayGroupId = gatewayGroupId;
    }


    /**
     * Gets the gatewayType value for this Gateway.
     * 
     * @return gatewayType
     */
    public java.lang.Short getGatewayType() {
        return gatewayType;
    }


    /**
     * Sets the gatewayType value for this Gateway.
     * 
     * @param gatewayType
     */
    public void setGatewayType(java.lang.Short gatewayType) {
        this.gatewayType = gatewayType;
    }


    /**
     * Gets the routingLabelId value for this Gateway.
     * 
     * @return routingLabelId
     */
    public java.lang.String getRoutingLabelId() {
        return routingLabelId;
    }


    /**
     * Sets the routingLabelId value for this Gateway.
     * 
     * @param routingLabelId
     */
    public void setRoutingLabelId(java.lang.String routingLabelId) {
        this.routingLabelId = routingLabelId;
    }


    /**
     * Gets the h323ControlFlags value for this Gateway.
     * 
     * @return h323ControlFlags
     */
    public java.lang.Integer getH323ControlFlags() {
        return h323ControlFlags;
    }


    /**
     * Sets the h323ControlFlags value for this Gateway.
     * 
     * @param h323ControlFlags
     */
    public void setH323ControlFlags(java.lang.Integer h323ControlFlags) {
        this.h323ControlFlags = h323ControlFlags;
    }


    /**
     * Gets the elementAttributes value for this Gateway.
     * 
     * @return elementAttributes
     */
    public java.lang.Integer getElementAttributes() {
        return elementAttributes;
    }


    /**
     * Sets the elementAttributes value for this Gateway.
     * 
     * @param elementAttributes
     */
    public void setElementAttributes(java.lang.Integer elementAttributes) {
        this.elementAttributes = elementAttributes;
    }


    /**
     * Gets the classOfServiceId value for this Gateway.
     * 
     * @return classOfServiceId
     */
    public java.lang.String getClassOfServiceId() {
        return classOfServiceId;
    }


    /**
     * Sets the classOfServiceId value for this Gateway.
     * 
     * @param classOfServiceId
     */
    public void setClassOfServiceId(java.lang.String classOfServiceId) {
        this.classOfServiceId = classOfServiceId;
    }


    /**
     * Gets the clusterProfileId value for this Gateway.
     * 
     * @return clusterProfileId
     */
    public java.lang.String getClusterProfileId() {
        return clusterProfileId;
    }


    /**
     * Sets the clusterProfileId value for this Gateway.
     * 
     * @param clusterProfileId
     */
    public void setClusterProfileId(java.lang.String clusterProfileId) {
        this.clusterProfileId = clusterProfileId;
    }


    /**
     * Gets the usePartialCli value for this Gateway.
     * 
     * @return usePartialCli
     */
    public java.lang.Short getUsePartialCli() {
        return usePartialCli;
    }


    /**
     * Sets the usePartialCli value for this Gateway.
     * 
     * @param usePartialCli
     */
    public void setUsePartialCli(java.lang.Short usePartialCli) {
        this.usePartialCli = usePartialCli;
    }


    /**
     * Gets the switchType value for this Gateway.
     * 
     * @return switchType
     */
    public java.lang.String getSwitchType() {
        return switchType;
    }


    /**
     * Sets the switchType value for this Gateway.
     * 
     * @param switchType
     */
    public void setSwitchType(java.lang.String switchType) {
        this.switchType = switchType;
    }


    /**
     * Gets the switchNumber value for this Gateway.
     * 
     * @return switchNumber
     */
    public java.lang.String getSwitchNumber() {
        return switchNumber;
    }


    /**
     * Sets the switchNumber value for this Gateway.
     * 
     * @param switchNumber
     */
    public void setSwitchNumber(java.lang.String switchNumber) {
        this.switchNumber = switchNumber;
    }


    /**
     * Gets the switchIdentifier value for this Gateway.
     * 
     * @return switchIdentifier
     */
    public java.lang.String getSwitchIdentifier() {
        return switchIdentifier;
    }


    /**
     * Sets the switchIdentifier value for this Gateway.
     * 
     * @param switchIdentifier
     */
    public void setSwitchIdentifier(java.lang.String switchIdentifier) {
        this.switchIdentifier = switchIdentifier;
    }


    /**
     * Gets the optionalDigits value for this Gateway.
     * 
     * @return optionalDigits
     */
    public java.lang.String getOptionalDigits() {
        return optionalDigits;
    }


    /**
     * Sets the optionalDigits value for this Gateway.
     * 
     * @param optionalDigits
     */
    public void setOptionalDigits(java.lang.String optionalDigits) {
        this.optionalDigits = optionalDigits;
    }


    /**
     * Gets the exceptionProfileId value for this Gateway.
     * 
     * @return exceptionProfileId
     */
    public java.lang.String getExceptionProfileId() {
        return exceptionProfileId;
    }


    /**
     * Sets the exceptionProfileId value for this Gateway.
     * 
     * @param exceptionProfileId
     */
    public void setExceptionProfileId(java.lang.String exceptionProfileId) {
        this.exceptionProfileId = exceptionProfileId;
    }


    /**
     * Gets the defaultTrunkgroupId value for this Gateway.
     * 
     * @return defaultTrunkgroupId
     */
    public java.lang.String getDefaultTrunkgroupId() {
        return defaultTrunkgroupId;
    }


    /**
     * Sets the defaultTrunkgroupId value for this Gateway.
     * 
     * @param defaultTrunkgroupId
     */
    public void setDefaultTrunkgroupId(java.lang.String defaultTrunkgroupId) {
        this.defaultTrunkgroupId = defaultTrunkgroupId;
    }


    /**
     * Gets the chargeBandProfileId value for this Gateway.
     * 
     * @return chargeBandProfileId
     */
    public java.lang.String getChargeBandProfileId() {
        return chargeBandProfileId;
    }


    /**
     * Sets the chargeBandProfileId value for this Gateway.
     * 
     * @param chargeBandProfileId
     */
    public void setChargeBandProfileId(java.lang.String chargeBandProfileId) {
        this.chargeBandProfileId = chargeBandProfileId;
    }


    /**
     * Gets the trafficManagementFlag value for this Gateway.
     * 
     * @return trafficManagementFlag
     */
    public java.lang.Short getTrafficManagementFlag() {
        return trafficManagementFlag;
    }


    /**
     * Sets the trafficManagementFlag value for this Gateway.
     * 
     * @param trafficManagementFlag
     */
    public void setTrafficManagementFlag(java.lang.Short trafficManagementFlag) {
        this.trafficManagementFlag = trafficManagementFlag;
    }


    /**
     * Gets the transitRouteLabel value for this Gateway.
     * 
     * @return transitRouteLabel
     */
    public java.lang.String getTransitRouteLabel() {
        return transitRouteLabel;
    }


    /**
     * Sets the transitRouteLabel value for this Gateway.
     * 
     * @param transitRouteLabel
     */
    public void setTransitRouteLabel(java.lang.String transitRouteLabel) {
        this.transitRouteLabel = transitRouteLabel;
    }


    /**
     * Gets the parentGatewayId value for this Gateway.
     * 
     * @return parentGatewayId
     */
    public java.lang.String getParentGatewayId() {
        return parentGatewayId;
    }


    /**
     * Sets the parentGatewayId value for this Gateway.
     * 
     * @param parentGatewayId
     */
    public void setParentGatewayId(java.lang.String parentGatewayId) {
        this.parentGatewayId = parentGatewayId;
    }


    /**
     * Gets the rasIpAddress value for this Gateway.
     * 
     * @return rasIpAddress
     */
    public java.lang.String getRasIpAddress() {
        return rasIpAddress;
    }


    /**
     * Sets the rasIpAddress value for this Gateway.
     * 
     * @param rasIpAddress
     */
    public void setRasIpAddress(java.lang.String rasIpAddress) {
        this.rasIpAddress = rasIpAddress;
    }


    /**
     * Gets the tcEscapeProfileId value for this Gateway.
     * 
     * @return tcEscapeProfileId
     */
    public java.lang.String getTcEscapeProfileId() {
        return tcEscapeProfileId;
    }


    /**
     * Sets the tcEscapeProfileId value for this Gateway.
     * 
     * @param tcEscapeProfileId
     */
    public void setTcEscapeProfileId(java.lang.String tcEscapeProfileId) {
        this.tcEscapeProfileId = tcEscapeProfileId;
    }


    /**
     * Gets the mobileSwitchId value for this Gateway.
     * 
     * @return mobileSwitchId
     */
    public java.lang.Short getMobileSwitchId() {
        return mobileSwitchId;
    }


    /**
     * Sets the mobileSwitchId value for this Gateway.
     * 
     * @param mobileSwitchId
     */
    public void setMobileSwitchId(java.lang.Short mobileSwitchId) {
        this.mobileSwitchId = mobileSwitchId;
    }


    /**
     * Gets the gatewayGroupSigId value for this Gateway.
     * 
     * @return gatewayGroupSigId
     */
    public java.lang.String getGatewayGroupSigId() {
        return gatewayGroupSigId;
    }


    /**
     * Sets the gatewayGroupSigId value for this Gateway.
     * 
     * @param gatewayGroupSigId
     */
    public void setGatewayGroupSigId(java.lang.String gatewayGroupSigId) {
        this.gatewayGroupSigId = gatewayGroupSigId;
    }


    /**
     * Gets the gatewayTypeAttributes value for this Gateway.
     * 
     * @return gatewayTypeAttributes
     */
    public java.lang.Short getGatewayTypeAttributes() {
        return gatewayTypeAttributes;
    }


    /**
     * Sets the gatewayTypeAttributes value for this Gateway.
     * 
     * @param gatewayTypeAttributes
     */
    public void setGatewayTypeAttributes(java.lang.Short gatewayTypeAttributes) {
        this.gatewayTypeAttributes = gatewayTypeAttributes;
    }


    /**
     * Gets the zoneIndexProfileId value for this Gateway.
     * 
     * @return zoneIndexProfileId
     */
    public java.lang.String getZoneIndexProfileId() {
        return zoneIndexProfileId;
    }


    /**
     * Sets the zoneIndexProfileId value for this Gateway.
     * 
     * @param zoneIndexProfileId
     */
    public void setZoneIndexProfileId(java.lang.String zoneIndexProfileId) {
        this.zoneIndexProfileId = zoneIndexProfileId;
    }


    /**
     * Gets the enumAuthProfileId value for this Gateway.
     * 
     * @return enumAuthProfileId
     */
    public java.lang.String getEnumAuthProfileId() {
        return enumAuthProfileId;
    }


    /**
     * Sets the enumAuthProfileId value for this Gateway.
     * 
     * @param enumAuthProfileId
     */
    public void setEnumAuthProfileId(java.lang.String enumAuthProfileId) {
        this.enumAuthProfileId = enumAuthProfileId;
    }


    /**
     * Gets the ipv6PortNumber value for this Gateway.
     * 
     * @return ipv6PortNumber
     */
    public java.lang.Short getIpv6PortNumber() {
        return ipv6PortNumber;
    }


    /**
     * Sets the ipv6PortNumber value for this Gateway.
     * 
     * @param ipv6PortNumber
     */
    public void setIpv6PortNumber(java.lang.Short ipv6PortNumber) {
        this.ipv6PortNumber = ipv6PortNumber;
    }


    /**
     * Gets the ipv6Address value for this Gateway.
     * 
     * @return ipv6Address
     */
    public java.lang.String getIpv6Address() {
        return ipv6Address;
    }


    /**
     * Sets the ipv6Address value for this Gateway.
     * 
     * @param ipv6Address
     */
    public void setIpv6Address(java.lang.String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }


    /**
     * Gets the sipIpv6Sh value for this Gateway.
     * 
     * @return sipIpv6Sh
     */
    public java.lang.Integer getSipIpv6Sh() {
        return sipIpv6Sh;
    }


    /**
     * Sets the sipIpv6Sh value for this Gateway.
     * 
     * @param sipIpv6Sh
     */
    public void setSipIpv6Sh(java.lang.Integer sipIpv6Sh) {
        this.sipIpv6Sh = sipIpv6Sh;
    }


    /**
     * Gets the sipIpv6St value for this Gateway.
     * 
     * @return sipIpv6St
     */
    public java.lang.String getSipIpv6St() {
        return sipIpv6St;
    }


    /**
     * Sets the sipIpv6St value for this Gateway.
     * 
     * @param sipIpv6St
     */
    public void setSipIpv6St(java.lang.String sipIpv6St) {
        this.sipIpv6St = sipIpv6St;
    }


    /**
     * Gets the h323Ipv6Sh value for this Gateway.
     * 
     * @return h323Ipv6Sh
     */
    public java.lang.Short getH323Ipv6Sh() {
        return h323Ipv6Sh;
    }


    /**
     * Sets the h323Ipv6Sh value for this Gateway.
     * 
     * @param h323Ipv6Sh
     */
    public void setH323Ipv6Sh(java.lang.Short h323Ipv6Sh) {
        this.h323Ipv6Sh = h323Ipv6Sh;
    }


    /**
     * Gets the h323Ipv6St value for this Gateway.
     * 
     * @return h323Ipv6St
     */
    public java.lang.String getH323Ipv6St() {
        return h323Ipv6St;
    }


    /**
     * Sets the h323Ipv6St value for this Gateway.
     * 
     * @param h323Ipv6St
     */
    public void setH323Ipv6St(java.lang.String h323Ipv6St) {
        this.h323Ipv6St = h323Ipv6St;
    }


    /**
     * Gets the rasIpv6Address value for this Gateway.
     * 
     * @return rasIpv6Address
     */
    public java.lang.String getRasIpv6Address() {
        return rasIpv6Address;
    }


    /**
     * Sets the rasIpv6Address value for this Gateway.
     * 
     * @param rasIpv6Address
     */
    public void setRasIpv6Address(java.lang.String rasIpv6Address) {
        this.rasIpv6Address = rasIpv6Address;
    }


    /**
     * Gets the gatewayAttribute value for this Gateway.
     * 
     * @return gatewayAttribute
     */
    public java.lang.Integer getGatewayAttribute() {
        return gatewayAttribute;
    }


    /**
     * Sets the gatewayAttribute value for this Gateway.
     * 
     * @param gatewayAttribute
     */
    public void setGatewayAttribute(java.lang.Integer gatewayAttribute) {
        this.gatewayAttribute = gatewayAttribute;
    }


    /**
     * Gets the sipFqdn value for this Gateway.
     * 
     * @return sipFqdn
     */
    public java.lang.String getSipFqdn() {
        return sipFqdn;
    }


    /**
     * Sets the sipFqdn value for this Gateway.
     * 
     * @param sipFqdn
     */
    public void setSipFqdn(java.lang.String sipFqdn) {
        this.sipFqdn = sipFqdn;
    }


    /**
     * Gets the sipFqdnPort value for this Gateway.
     * 
     * @return sipFqdnPort
     */
    public java.lang.Integer getSipFqdnPort() {
        return sipFqdnPort;
    }


    /**
     * Sets the sipFqdnPort value for this Gateway.
     * 
     * @param sipFqdnPort
     */
    public void setSipFqdnPort(java.lang.Integer sipFqdnPort) {
        this.sipFqdnPort = sipFqdnPort;
    }


    /**
     * Gets the sipCntlFlags value for this Gateway.
     * 
     * @return sipCntlFlags
     */
    public java.lang.Integer getSipCntlFlags() {
        return sipCntlFlags;
    }


    /**
     * Sets the sipCntlFlags value for this Gateway.
     * 
     * @param sipCntlFlags
     */
    public void setSipCntlFlags(java.lang.Integer sipCntlFlags) {
        this.sipCntlFlags = sipCntlFlags;
    }


    /**
     * Gets the arsProfileId value for this Gateway.
     * 
     * @return arsProfileId
     */
    public java.lang.String getArsProfileId() {
        return arsProfileId;
    }


    /**
     * Sets the arsProfileId value for this Gateway.
     * 
     * @param arsProfileId
     */
    public void setArsProfileId(java.lang.String arsProfileId) {
        this.arsProfileId = arsProfileId;
    }


    /**
     * Gets the smmProfileGroupId value for this Gateway.
     * 
     * @return smmProfileGroupId
     */
    public java.lang.String getSmmProfileGroupId() {
        return smmProfileGroupId;
    }


    /**
     * Sets the smmProfileGroupId value for this Gateway.
     * 
     * @param smmProfileGroupId
     */
    public void setSmmProfileGroupId(java.lang.String smmProfileGroupId) {
        this.smmProfileGroupId = smmProfileGroupId;
    }


    /**
     * Gets the peerThrottlingProfileId value for this Gateway.
     * 
     * @return peerThrottlingProfileId
     */
    public java.lang.String getPeerThrottlingProfileId() {
        return peerThrottlingProfileId;
    }


    /**
     * Sets the peerThrottlingProfileId value for this Gateway.
     * 
     * @param peerThrottlingProfileId
     */
    public void setPeerThrottlingProfileId(java.lang.String peerThrottlingProfileId) {
        this.peerThrottlingProfileId = peerThrottlingProfileId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gateway)) return false;
        Gateway other = (Gateway) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.switchId==null && other.getSwitchId()==null) || 
             (this.switchId!=null &&
              this.switchId.equals(other.getSwitchId()))) &&
            ((this.portNumber==null && other.getPortNumber()==null) || 
             (this.portNumber!=null &&
              this.portNumber.equals(other.getPortNumber()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.sipIpSh==null && other.getSipIpSh()==null) || 
             (this.sipIpSh!=null &&
              this.sipIpSh.equals(other.getSipIpSh()))) &&
            ((this.sipIpSt==null && other.getSipIpSt()==null) || 
             (this.sipIpSt!=null &&
              this.sipIpSt.equals(other.getSipIpSt()))) &&
            ((this.h323IpSh==null && other.getH323IpSh()==null) || 
             (this.h323IpSh!=null &&
              this.h323IpSh.equals(other.getH323IpSh()))) &&
            ((this.h323IpSt==null && other.getH323IpSt()==null) || 
             (this.h323IpSt!=null &&
              this.h323IpSt.equals(other.getH323IpSt()))) &&
            ((this.gatewayGroupId==null && other.getGatewayGroupId()==null) || 
             (this.gatewayGroupId!=null &&
              this.gatewayGroupId.equals(other.getGatewayGroupId()))) &&
            ((this.gatewayType==null && other.getGatewayType()==null) || 
             (this.gatewayType!=null &&
              this.gatewayType.equals(other.getGatewayType()))) &&
            ((this.routingLabelId==null && other.getRoutingLabelId()==null) || 
             (this.routingLabelId!=null &&
              this.routingLabelId.equals(other.getRoutingLabelId()))) &&
            ((this.h323ControlFlags==null && other.getH323ControlFlags()==null) || 
             (this.h323ControlFlags!=null &&
              this.h323ControlFlags.equals(other.getH323ControlFlags()))) &&
            ((this.elementAttributes==null && other.getElementAttributes()==null) || 
             (this.elementAttributes!=null &&
              this.elementAttributes.equals(other.getElementAttributes()))) &&
            ((this.classOfServiceId==null && other.getClassOfServiceId()==null) || 
             (this.classOfServiceId!=null &&
              this.classOfServiceId.equals(other.getClassOfServiceId()))) &&
            ((this.clusterProfileId==null && other.getClusterProfileId()==null) || 
             (this.clusterProfileId!=null &&
              this.clusterProfileId.equals(other.getClusterProfileId()))) &&
            ((this.usePartialCli==null && other.getUsePartialCli()==null) || 
             (this.usePartialCli!=null &&
              this.usePartialCli.equals(other.getUsePartialCli()))) &&
            ((this.switchType==null && other.getSwitchType()==null) || 
             (this.switchType!=null &&
              this.switchType.equals(other.getSwitchType()))) &&
            ((this.switchNumber==null && other.getSwitchNumber()==null) || 
             (this.switchNumber!=null &&
              this.switchNumber.equals(other.getSwitchNumber()))) &&
            ((this.switchIdentifier==null && other.getSwitchIdentifier()==null) || 
             (this.switchIdentifier!=null &&
              this.switchIdentifier.equals(other.getSwitchIdentifier()))) &&
            ((this.optionalDigits==null && other.getOptionalDigits()==null) || 
             (this.optionalDigits!=null &&
              this.optionalDigits.equals(other.getOptionalDigits()))) &&
            ((this.exceptionProfileId==null && other.getExceptionProfileId()==null) || 
             (this.exceptionProfileId!=null &&
              this.exceptionProfileId.equals(other.getExceptionProfileId()))) &&
            ((this.defaultTrunkgroupId==null && other.getDefaultTrunkgroupId()==null) || 
             (this.defaultTrunkgroupId!=null &&
              this.defaultTrunkgroupId.equals(other.getDefaultTrunkgroupId()))) &&
            ((this.chargeBandProfileId==null && other.getChargeBandProfileId()==null) || 
             (this.chargeBandProfileId!=null &&
              this.chargeBandProfileId.equals(other.getChargeBandProfileId()))) &&
            ((this.trafficManagementFlag==null && other.getTrafficManagementFlag()==null) || 
             (this.trafficManagementFlag!=null &&
              this.trafficManagementFlag.equals(other.getTrafficManagementFlag()))) &&
            ((this.transitRouteLabel==null && other.getTransitRouteLabel()==null) || 
             (this.transitRouteLabel!=null &&
              this.transitRouteLabel.equals(other.getTransitRouteLabel()))) &&
            ((this.parentGatewayId==null && other.getParentGatewayId()==null) || 
             (this.parentGatewayId!=null &&
              this.parentGatewayId.equals(other.getParentGatewayId()))) &&
            ((this.rasIpAddress==null && other.getRasIpAddress()==null) || 
             (this.rasIpAddress!=null &&
              this.rasIpAddress.equals(other.getRasIpAddress()))) &&
            ((this.tcEscapeProfileId==null && other.getTcEscapeProfileId()==null) || 
             (this.tcEscapeProfileId!=null &&
              this.tcEscapeProfileId.equals(other.getTcEscapeProfileId()))) &&
            ((this.mobileSwitchId==null && other.getMobileSwitchId()==null) || 
             (this.mobileSwitchId!=null &&
              this.mobileSwitchId.equals(other.getMobileSwitchId()))) &&
            ((this.gatewayGroupSigId==null && other.getGatewayGroupSigId()==null) || 
             (this.gatewayGroupSigId!=null &&
              this.gatewayGroupSigId.equals(other.getGatewayGroupSigId()))) &&
            ((this.gatewayTypeAttributes==null && other.getGatewayTypeAttributes()==null) || 
             (this.gatewayTypeAttributes!=null &&
              this.gatewayTypeAttributes.equals(other.getGatewayTypeAttributes()))) &&
            ((this.zoneIndexProfileId==null && other.getZoneIndexProfileId()==null) || 
             (this.zoneIndexProfileId!=null &&
              this.zoneIndexProfileId.equals(other.getZoneIndexProfileId()))) &&
            ((this.enumAuthProfileId==null && other.getEnumAuthProfileId()==null) || 
             (this.enumAuthProfileId!=null &&
              this.enumAuthProfileId.equals(other.getEnumAuthProfileId()))) &&
            ((this.ipv6PortNumber==null && other.getIpv6PortNumber()==null) || 
             (this.ipv6PortNumber!=null &&
              this.ipv6PortNumber.equals(other.getIpv6PortNumber()))) &&
            ((this.ipv6Address==null && other.getIpv6Address()==null) || 
             (this.ipv6Address!=null &&
              this.ipv6Address.equals(other.getIpv6Address()))) &&
            ((this.sipIpv6Sh==null && other.getSipIpv6Sh()==null) || 
             (this.sipIpv6Sh!=null &&
              this.sipIpv6Sh.equals(other.getSipIpv6Sh()))) &&
            ((this.sipIpv6St==null && other.getSipIpv6St()==null) || 
             (this.sipIpv6St!=null &&
              this.sipIpv6St.equals(other.getSipIpv6St()))) &&
            ((this.h323Ipv6Sh==null && other.getH323Ipv6Sh()==null) || 
             (this.h323Ipv6Sh!=null &&
              this.h323Ipv6Sh.equals(other.getH323Ipv6Sh()))) &&
            ((this.h323Ipv6St==null && other.getH323Ipv6St()==null) || 
             (this.h323Ipv6St!=null &&
              this.h323Ipv6St.equals(other.getH323Ipv6St()))) &&
            ((this.rasIpv6Address==null && other.getRasIpv6Address()==null) || 
             (this.rasIpv6Address!=null &&
              this.rasIpv6Address.equals(other.getRasIpv6Address()))) &&
            ((this.gatewayAttribute==null && other.getGatewayAttribute()==null) || 
             (this.gatewayAttribute!=null &&
              this.gatewayAttribute.equals(other.getGatewayAttribute()))) &&
            ((this.sipFqdn==null && other.getSipFqdn()==null) || 
             (this.sipFqdn!=null &&
              this.sipFqdn.equals(other.getSipFqdn()))) &&
            ((this.sipFqdnPort==null && other.getSipFqdnPort()==null) || 
             (this.sipFqdnPort!=null &&
              this.sipFqdnPort.equals(other.getSipFqdnPort()))) &&
            ((this.sipCntlFlags==null && other.getSipCntlFlags()==null) || 
             (this.sipCntlFlags!=null &&
              this.sipCntlFlags.equals(other.getSipCntlFlags()))) &&
            ((this.arsProfileId==null && other.getArsProfileId()==null) || 
             (this.arsProfileId!=null &&
              this.arsProfileId.equals(other.getArsProfileId()))) &&
            ((this.smmProfileGroupId==null && other.getSmmProfileGroupId()==null) || 
             (this.smmProfileGroupId!=null &&
              this.smmProfileGroupId.equals(other.getSmmProfileGroupId()))) &&
            ((this.peerThrottlingProfileId==null && other.getPeerThrottlingProfileId()==null) || 
             (this.peerThrottlingProfileId!=null &&
              this.peerThrottlingProfileId.equals(other.getPeerThrottlingProfileId())));
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
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getSwitchId() != null) {
            _hashCode += getSwitchId().hashCode();
        }
        if (getPortNumber() != null) {
            _hashCode += getPortNumber().hashCode();
        }
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getSipIpSh() != null) {
            _hashCode += getSipIpSh().hashCode();
        }
        if (getSipIpSt() != null) {
            _hashCode += getSipIpSt().hashCode();
        }
        if (getH323IpSh() != null) {
            _hashCode += getH323IpSh().hashCode();
        }
        if (getH323IpSt() != null) {
            _hashCode += getH323IpSt().hashCode();
        }
        if (getGatewayGroupId() != null) {
            _hashCode += getGatewayGroupId().hashCode();
        }
        if (getGatewayType() != null) {
            _hashCode += getGatewayType().hashCode();
        }
        if (getRoutingLabelId() != null) {
            _hashCode += getRoutingLabelId().hashCode();
        }
        if (getH323ControlFlags() != null) {
            _hashCode += getH323ControlFlags().hashCode();
        }
        if (getElementAttributes() != null) {
            _hashCode += getElementAttributes().hashCode();
        }
        if (getClassOfServiceId() != null) {
            _hashCode += getClassOfServiceId().hashCode();
        }
        if (getClusterProfileId() != null) {
            _hashCode += getClusterProfileId().hashCode();
        }
        if (getUsePartialCli() != null) {
            _hashCode += getUsePartialCli().hashCode();
        }
        if (getSwitchType() != null) {
            _hashCode += getSwitchType().hashCode();
        }
        if (getSwitchNumber() != null) {
            _hashCode += getSwitchNumber().hashCode();
        }
        if (getSwitchIdentifier() != null) {
            _hashCode += getSwitchIdentifier().hashCode();
        }
        if (getOptionalDigits() != null) {
            _hashCode += getOptionalDigits().hashCode();
        }
        if (getExceptionProfileId() != null) {
            _hashCode += getExceptionProfileId().hashCode();
        }
        if (getDefaultTrunkgroupId() != null) {
            _hashCode += getDefaultTrunkgroupId().hashCode();
        }
        if (getChargeBandProfileId() != null) {
            _hashCode += getChargeBandProfileId().hashCode();
        }
        if (getTrafficManagementFlag() != null) {
            _hashCode += getTrafficManagementFlag().hashCode();
        }
        if (getTransitRouteLabel() != null) {
            _hashCode += getTransitRouteLabel().hashCode();
        }
        if (getParentGatewayId() != null) {
            _hashCode += getParentGatewayId().hashCode();
        }
        if (getRasIpAddress() != null) {
            _hashCode += getRasIpAddress().hashCode();
        }
        if (getTcEscapeProfileId() != null) {
            _hashCode += getTcEscapeProfileId().hashCode();
        }
        if (getMobileSwitchId() != null) {
            _hashCode += getMobileSwitchId().hashCode();
        }
        if (getGatewayGroupSigId() != null) {
            _hashCode += getGatewayGroupSigId().hashCode();
        }
        if (getGatewayTypeAttributes() != null) {
            _hashCode += getGatewayTypeAttributes().hashCode();
        }
        if (getZoneIndexProfileId() != null) {
            _hashCode += getZoneIndexProfileId().hashCode();
        }
        if (getEnumAuthProfileId() != null) {
            _hashCode += getEnumAuthProfileId().hashCode();
        }
        if (getIpv6PortNumber() != null) {
            _hashCode += getIpv6PortNumber().hashCode();
        }
        if (getIpv6Address() != null) {
            _hashCode += getIpv6Address().hashCode();
        }
        if (getSipIpv6Sh() != null) {
            _hashCode += getSipIpv6Sh().hashCode();
        }
        if (getSipIpv6St() != null) {
            _hashCode += getSipIpv6St().hashCode();
        }
        if (getH323Ipv6Sh() != null) {
            _hashCode += getH323Ipv6Sh().hashCode();
        }
        if (getH323Ipv6St() != null) {
            _hashCode += getH323Ipv6St().hashCode();
        }
        if (getRasIpv6Address() != null) {
            _hashCode += getRasIpv6Address().hashCode();
        }
        if (getGatewayAttribute() != null) {
            _hashCode += getGatewayAttribute().hashCode();
        }
        if (getSipFqdn() != null) {
            _hashCode += getSipFqdn().hashCode();
        }
        if (getSipFqdnPort() != null) {
            _hashCode += getSipFqdnPort().hashCode();
        }
        if (getSipCntlFlags() != null) {
            _hashCode += getSipCntlFlags().hashCode();
        }
        if (getArsProfileId() != null) {
            _hashCode += getArsProfileId().hashCode();
        }
        if (getSmmProfileGroupId() != null) {
            _hashCode += getSmmProfileGroupId().hashCode();
        }
        if (getPeerThrottlingProfileId() != null) {
            _hashCode += getPeerThrottlingProfileId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gateway.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Gateway"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipIpSh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipIpSh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipIpSt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipIpSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("h323IpSh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "h323IpSh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("h323IpSt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "h323IpSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("h323ControlFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "h323ControlFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("clusterProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clusterProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usePartialCli");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usePartialCli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionalDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "optionalDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultTrunkgroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultTrunkgroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeBandProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeBandProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficManagementFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficManagementFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitRouteLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transitRouteLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentGatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentGatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rasIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rasIpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcEscapeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcEscapeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileSwitchId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileSwitchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayGroupSigId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayGroupSigId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayTypeAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayTypeAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneIndexProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zoneIndexProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumAuthProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumAuthProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6PortNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6PortNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipIpv6Sh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipIpv6Sh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipIpv6St");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipIpv6St"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("h323Ipv6Sh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "h323Ipv6Sh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("h323Ipv6St");
        elemField.setXmlName(new javax.xml.namespace.QName("", "h323Ipv6St"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rasIpv6Address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rasIpv6Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipFqdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipFqdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipFqdnPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipFqdnPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipCntlFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipCntlFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arsProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arsProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smmProfileGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smmProfileGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peerThrottlingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peerThrottlingProfileId"));
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
