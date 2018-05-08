/**
 * HsxPublicUserIdentity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxPublicUserIdentity  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String publicUserId;
    private java.lang.String serviceProfileId;
    private java.lang.String privateUserId;
    private java.lang.String sCscfId;
    private java.lang.String chargingInfoId;
    private java.lang.Integer identityType;
    private java.lang.String url;
    private java.lang.String authorizationKey;
    private java.lang.Integer barringIndication;
    private java.lang.Integer userRegistrationState;
    private java.lang.String capabilityId;
    private java.lang.String partitionId;
    private java.lang.Integer isPublicServiceId;
    private java.lang.Integer psiActivationState;
    private java.lang.Integer unregisteredServices;
    private java.lang.Integer authenticationPending;
    private java.lang.String provisionedUrl;
    private java.lang.String implicitRegistrationSet;
    private java.lang.String displayName;
    private java.lang.Integer isWildcardedPsi;

    public HsxPublicUserIdentity() {
    }

    public HsxPublicUserIdentity(
           java.lang.String publicUserId,
           java.lang.String serviceProfileId,
           java.lang.String privateUserId,
           java.lang.String sCscfId,
           java.lang.String chargingInfoId,
           java.lang.Integer identityType,
           java.lang.String url,
           java.lang.String authorizationKey,
           java.lang.Integer barringIndication,
           java.lang.Integer userRegistrationState,
           java.lang.String capabilityId,
           java.lang.String partitionId,
           java.lang.Integer isPublicServiceId,
           java.lang.Integer psiActivationState,
           java.lang.Integer unregisteredServices,
           java.lang.Integer authenticationPending,
           java.lang.String provisionedUrl,
           java.lang.String implicitRegistrationSet,
           java.lang.String displayName,
           java.lang.Integer isWildcardedPsi) {
           this.publicUserId = publicUserId;
           this.serviceProfileId = serviceProfileId;
           this.privateUserId = privateUserId;
           this.sCscfId = sCscfId;
           this.chargingInfoId = chargingInfoId;
           this.identityType = identityType;
           this.url = url;
           this.authorizationKey = authorizationKey;
           this.barringIndication = barringIndication;
           this.userRegistrationState = userRegistrationState;
           this.capabilityId = capabilityId;
           this.partitionId = partitionId;
           this.isPublicServiceId = isPublicServiceId;
           this.psiActivationState = psiActivationState;
           this.unregisteredServices = unregisteredServices;
           this.authenticationPending = authenticationPending;
           this.provisionedUrl = provisionedUrl;
           this.implicitRegistrationSet = implicitRegistrationSet;
           this.displayName = displayName;
           this.isWildcardedPsi = isWildcardedPsi;
    }


    /**
     * Gets the publicUserId value for this HsxPublicUserIdentity.
     * 
     * @return publicUserId
     */
    public java.lang.String getPublicUserId() {
        return publicUserId;
    }


    /**
     * Sets the publicUserId value for this HsxPublicUserIdentity.
     * 
     * @param publicUserId
     */
    public void setPublicUserId(java.lang.String publicUserId) {
        this.publicUserId = publicUserId;
    }


    /**
     * Gets the serviceProfileId value for this HsxPublicUserIdentity.
     * 
     * @return serviceProfileId
     */
    public java.lang.String getServiceProfileId() {
        return serviceProfileId;
    }


    /**
     * Sets the serviceProfileId value for this HsxPublicUserIdentity.
     * 
     * @param serviceProfileId
     */
    public void setServiceProfileId(java.lang.String serviceProfileId) {
        this.serviceProfileId = serviceProfileId;
    }


    /**
     * Gets the privateUserId value for this HsxPublicUserIdentity.
     * 
     * @return privateUserId
     */
    public java.lang.String getPrivateUserId() {
        return privateUserId;
    }


    /**
     * Sets the privateUserId value for this HsxPublicUserIdentity.
     * 
     * @param privateUserId
     */
    public void setPrivateUserId(java.lang.String privateUserId) {
        this.privateUserId = privateUserId;
    }


    /**
     * Gets the sCscfId value for this HsxPublicUserIdentity.
     * 
     * @return sCscfId
     */
    public java.lang.String getSCscfId() {
        return sCscfId;
    }


    /**
     * Sets the sCscfId value for this HsxPublicUserIdentity.
     * 
     * @param sCscfId
     */
    public void setSCscfId(java.lang.String sCscfId) {
        this.sCscfId = sCscfId;
    }


    /**
     * Gets the chargingInfoId value for this HsxPublicUserIdentity.
     * 
     * @return chargingInfoId
     */
    public java.lang.String getChargingInfoId() {
        return chargingInfoId;
    }


    /**
     * Sets the chargingInfoId value for this HsxPublicUserIdentity.
     * 
     * @param chargingInfoId
     */
    public void setChargingInfoId(java.lang.String chargingInfoId) {
        this.chargingInfoId = chargingInfoId;
    }


    /**
     * Gets the identityType value for this HsxPublicUserIdentity.
     * 
     * @return identityType
     */
    public java.lang.Integer getIdentityType() {
        return identityType;
    }


    /**
     * Sets the identityType value for this HsxPublicUserIdentity.
     * 
     * @param identityType
     */
    public void setIdentityType(java.lang.Integer identityType) {
        this.identityType = identityType;
    }


    /**
     * Gets the url value for this HsxPublicUserIdentity.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this HsxPublicUserIdentity.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the authorizationKey value for this HsxPublicUserIdentity.
     * 
     * @return authorizationKey
     */
    public java.lang.String getAuthorizationKey() {
        return authorizationKey;
    }


    /**
     * Sets the authorizationKey value for this HsxPublicUserIdentity.
     * 
     * @param authorizationKey
     */
    public void setAuthorizationKey(java.lang.String authorizationKey) {
        this.authorizationKey = authorizationKey;
    }


    /**
     * Gets the barringIndication value for this HsxPublicUserIdentity.
     * 
     * @return barringIndication
     */
    public java.lang.Integer getBarringIndication() {
        return barringIndication;
    }


    /**
     * Sets the barringIndication value for this HsxPublicUserIdentity.
     * 
     * @param barringIndication
     */
    public void setBarringIndication(java.lang.Integer barringIndication) {
        this.barringIndication = barringIndication;
    }


    /**
     * Gets the userRegistrationState value for this HsxPublicUserIdentity.
     * 
     * @return userRegistrationState
     */
    public java.lang.Integer getUserRegistrationState() {
        return userRegistrationState;
    }


    /**
     * Sets the userRegistrationState value for this HsxPublicUserIdentity.
     * 
     * @param userRegistrationState
     */
    public void setUserRegistrationState(java.lang.Integer userRegistrationState) {
        this.userRegistrationState = userRegistrationState;
    }


    /**
     * Gets the capabilityId value for this HsxPublicUserIdentity.
     * 
     * @return capabilityId
     */
    public java.lang.String getCapabilityId() {
        return capabilityId;
    }


    /**
     * Sets the capabilityId value for this HsxPublicUserIdentity.
     * 
     * @param capabilityId
     */
    public void setCapabilityId(java.lang.String capabilityId) {
        this.capabilityId = capabilityId;
    }


    /**
     * Gets the partitionId value for this HsxPublicUserIdentity.
     * 
     * @return partitionId
     */
    public java.lang.String getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this HsxPublicUserIdentity.
     * 
     * @param partitionId
     */
    public void setPartitionId(java.lang.String partitionId) {
        this.partitionId = partitionId;
    }


    /**
     * Gets the isPublicServiceId value for this HsxPublicUserIdentity.
     * 
     * @return isPublicServiceId
     */
    public java.lang.Integer getIsPublicServiceId() {
        return isPublicServiceId;
    }


    /**
     * Sets the isPublicServiceId value for this HsxPublicUserIdentity.
     * 
     * @param isPublicServiceId
     */
    public void setIsPublicServiceId(java.lang.Integer isPublicServiceId) {
        this.isPublicServiceId = isPublicServiceId;
    }


    /**
     * Gets the psiActivationState value for this HsxPublicUserIdentity.
     * 
     * @return psiActivationState
     */
    public java.lang.Integer getPsiActivationState() {
        return psiActivationState;
    }


    /**
     * Sets the psiActivationState value for this HsxPublicUserIdentity.
     * 
     * @param psiActivationState
     */
    public void setPsiActivationState(java.lang.Integer psiActivationState) {
        this.psiActivationState = psiActivationState;
    }


    /**
     * Gets the unregisteredServices value for this HsxPublicUserIdentity.
     * 
     * @return unregisteredServices
     */
    public java.lang.Integer getUnregisteredServices() {
        return unregisteredServices;
    }


    /**
     * Sets the unregisteredServices value for this HsxPublicUserIdentity.
     * 
     * @param unregisteredServices
     */
    public void setUnregisteredServices(java.lang.Integer unregisteredServices) {
        this.unregisteredServices = unregisteredServices;
    }


    /**
     * Gets the authenticationPending value for this HsxPublicUserIdentity.
     * 
     * @return authenticationPending
     */
    public java.lang.Integer getAuthenticationPending() {
        return authenticationPending;
    }


    /**
     * Sets the authenticationPending value for this HsxPublicUserIdentity.
     * 
     * @param authenticationPending
     */
    public void setAuthenticationPending(java.lang.Integer authenticationPending) {
        this.authenticationPending = authenticationPending;
    }


    /**
     * Gets the provisionedUrl value for this HsxPublicUserIdentity.
     * 
     * @return provisionedUrl
     */
    public java.lang.String getProvisionedUrl() {
        return provisionedUrl;
    }


    /**
     * Sets the provisionedUrl value for this HsxPublicUserIdentity.
     * 
     * @param provisionedUrl
     */
    public void setProvisionedUrl(java.lang.String provisionedUrl) {
        this.provisionedUrl = provisionedUrl;
    }


    /**
     * Gets the implicitRegistrationSet value for this HsxPublicUserIdentity.
     * 
     * @return implicitRegistrationSet
     */
    public java.lang.String getImplicitRegistrationSet() {
        return implicitRegistrationSet;
    }


    /**
     * Sets the implicitRegistrationSet value for this HsxPublicUserIdentity.
     * 
     * @param implicitRegistrationSet
     */
    public void setImplicitRegistrationSet(java.lang.String implicitRegistrationSet) {
        this.implicitRegistrationSet = implicitRegistrationSet;
    }


    /**
     * Gets the displayName value for this HsxPublicUserIdentity.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this HsxPublicUserIdentity.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the isWildcardedPsi value for this HsxPublicUserIdentity.
     * 
     * @return isWildcardedPsi
     */
    public java.lang.Integer getIsWildcardedPsi() {
        return isWildcardedPsi;
    }


    /**
     * Sets the isWildcardedPsi value for this HsxPublicUserIdentity.
     * 
     * @param isWildcardedPsi
     */
    public void setIsWildcardedPsi(java.lang.Integer isWildcardedPsi) {
        this.isWildcardedPsi = isWildcardedPsi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxPublicUserIdentity)) return false;
        HsxPublicUserIdentity other = (HsxPublicUserIdentity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.publicUserId==null && other.getPublicUserId()==null) || 
             (this.publicUserId!=null &&
              this.publicUserId.equals(other.getPublicUserId()))) &&
            ((this.serviceProfileId==null && other.getServiceProfileId()==null) || 
             (this.serviceProfileId!=null &&
              this.serviceProfileId.equals(other.getServiceProfileId()))) &&
            ((this.privateUserId==null && other.getPrivateUserId()==null) || 
             (this.privateUserId!=null &&
              this.privateUserId.equals(other.getPrivateUserId()))) &&
            ((this.sCscfId==null && other.getSCscfId()==null) || 
             (this.sCscfId!=null &&
              this.sCscfId.equals(other.getSCscfId()))) &&
            ((this.chargingInfoId==null && other.getChargingInfoId()==null) || 
             (this.chargingInfoId!=null &&
              this.chargingInfoId.equals(other.getChargingInfoId()))) &&
            ((this.identityType==null && other.getIdentityType()==null) || 
             (this.identityType!=null &&
              this.identityType.equals(other.getIdentityType()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.authorizationKey==null && other.getAuthorizationKey()==null) || 
             (this.authorizationKey!=null &&
              this.authorizationKey.equals(other.getAuthorizationKey()))) &&
            ((this.barringIndication==null && other.getBarringIndication()==null) || 
             (this.barringIndication!=null &&
              this.barringIndication.equals(other.getBarringIndication()))) &&
            ((this.userRegistrationState==null && other.getUserRegistrationState()==null) || 
             (this.userRegistrationState!=null &&
              this.userRegistrationState.equals(other.getUserRegistrationState()))) &&
            ((this.capabilityId==null && other.getCapabilityId()==null) || 
             (this.capabilityId!=null &&
              this.capabilityId.equals(other.getCapabilityId()))) &&
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId()))) &&
            ((this.isPublicServiceId==null && other.getIsPublicServiceId()==null) || 
             (this.isPublicServiceId!=null &&
              this.isPublicServiceId.equals(other.getIsPublicServiceId()))) &&
            ((this.psiActivationState==null && other.getPsiActivationState()==null) || 
             (this.psiActivationState!=null &&
              this.psiActivationState.equals(other.getPsiActivationState()))) &&
            ((this.unregisteredServices==null && other.getUnregisteredServices()==null) || 
             (this.unregisteredServices!=null &&
              this.unregisteredServices.equals(other.getUnregisteredServices()))) &&
            ((this.authenticationPending==null && other.getAuthenticationPending()==null) || 
             (this.authenticationPending!=null &&
              this.authenticationPending.equals(other.getAuthenticationPending()))) &&
            ((this.provisionedUrl==null && other.getProvisionedUrl()==null) || 
             (this.provisionedUrl!=null &&
              this.provisionedUrl.equals(other.getProvisionedUrl()))) &&
            ((this.implicitRegistrationSet==null && other.getImplicitRegistrationSet()==null) || 
             (this.implicitRegistrationSet!=null &&
              this.implicitRegistrationSet.equals(other.getImplicitRegistrationSet()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.isWildcardedPsi==null && other.getIsWildcardedPsi()==null) || 
             (this.isWildcardedPsi!=null &&
              this.isWildcardedPsi.equals(other.getIsWildcardedPsi())));
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
        if (getPublicUserId() != null) {
            _hashCode += getPublicUserId().hashCode();
        }
        if (getServiceProfileId() != null) {
            _hashCode += getServiceProfileId().hashCode();
        }
        if (getPrivateUserId() != null) {
            _hashCode += getPrivateUserId().hashCode();
        }
        if (getSCscfId() != null) {
            _hashCode += getSCscfId().hashCode();
        }
        if (getChargingInfoId() != null) {
            _hashCode += getChargingInfoId().hashCode();
        }
        if (getIdentityType() != null) {
            _hashCode += getIdentityType().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getAuthorizationKey() != null) {
            _hashCode += getAuthorizationKey().hashCode();
        }
        if (getBarringIndication() != null) {
            _hashCode += getBarringIndication().hashCode();
        }
        if (getUserRegistrationState() != null) {
            _hashCode += getUserRegistrationState().hashCode();
        }
        if (getCapabilityId() != null) {
            _hashCode += getCapabilityId().hashCode();
        }
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        if (getIsPublicServiceId() != null) {
            _hashCode += getIsPublicServiceId().hashCode();
        }
        if (getPsiActivationState() != null) {
            _hashCode += getPsiActivationState().hashCode();
        }
        if (getUnregisteredServices() != null) {
            _hashCode += getUnregisteredServices().hashCode();
        }
        if (getAuthenticationPending() != null) {
            _hashCode += getAuthenticationPending().hashCode();
        }
        if (getProvisionedUrl() != null) {
            _hashCode += getProvisionedUrl().hashCode();
        }
        if (getImplicitRegistrationSet() != null) {
            _hashCode += getImplicitRegistrationSet().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getIsWildcardedPsi() != null) {
            _hashCode += getIsWildcardedPsi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxPublicUserIdentity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPublicUserIdentity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCscfId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sCscfId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargingInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barringIndication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "barringIndication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRegistrationState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userRegistrationState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capabilityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capabilityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPublicServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPublicServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psiActivationState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "psiActivationState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unregisteredServices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unregisteredServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationPending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisionedUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "provisionedUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implicitRegistrationSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "implicitRegistrationSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWildcardedPsi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isWildcardedPsi"));
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
