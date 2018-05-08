/**
 * DomainControllerProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class DomainControllerProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String adProfileId;

    private java.lang.String domainControllerProfileId;

    private java.lang.String description;

    private java.lang.String primaryDc;

    private java.lang.String secondaryDc;

    private java.lang.Integer dcPort;

    private java.lang.Integer attributes;

    private java.lang.String username;

    private java.lang.String password;

    private java.lang.String searchScope;

    private java.lang.String searchFilter;

    public DomainControllerProfile() {
    }

    public DomainControllerProfile(
           java.lang.String adProfileId,
           java.lang.String domainControllerProfileId,
           java.lang.String description,
           java.lang.String primaryDc,
           java.lang.String secondaryDc,
           java.lang.Integer dcPort,
           java.lang.Integer attributes,
           java.lang.String username,
           java.lang.String password,
           java.lang.String searchScope,
           java.lang.String searchFilter) {
        this.adProfileId = adProfileId;
        this.domainControllerProfileId = domainControllerProfileId;
        this.description = description;
        this.primaryDc = primaryDc;
        this.secondaryDc = secondaryDc;
        this.dcPort = dcPort;
        this.attributes = attributes;
        this.username = username;
        this.password = password;
        this.searchScope = searchScope;
        this.searchFilter = searchFilter;
    }


    /**
     * Gets the adProfileId value for this DomainControllerProfile.
     * 
     * @return adProfileId
     */
    public java.lang.String getAdProfileId() {
        return adProfileId;
    }


    /**
     * Sets the adProfileId value for this DomainControllerProfile.
     * 
     * @param adProfileId
     */
    public void setAdProfileId(java.lang.String adProfileId) {
        this.adProfileId = adProfileId;
    }


    /**
     * Gets the domainControllerProfileId value for this DomainControllerProfile.
     * 
     * @return domainControllerProfileId
     */
    public java.lang.String getDomainControllerProfileId() {
        return domainControllerProfileId;
    }


    /**
     * Sets the domainControllerProfileId value for this DomainControllerProfile.
     * 
     * @param domainControllerProfileId
     */
    public void setDomainControllerProfileId(java.lang.String domainControllerProfileId) {
        this.domainControllerProfileId = domainControllerProfileId;
    }


    /**
     * Gets the description value for this DomainControllerProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DomainControllerProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the primaryDc value for this DomainControllerProfile.
     * 
     * @return primaryDc
     */
    public java.lang.String getPrimaryDc() {
        return primaryDc;
    }


    /**
     * Sets the primaryDc value for this DomainControllerProfile.
     * 
     * @param primaryDc
     */
    public void setPrimaryDc(java.lang.String primaryDc) {
        this.primaryDc = primaryDc;
    }


    /**
     * Gets the secondaryDc value for this DomainControllerProfile.
     * 
     * @return secondaryDc
     */
    public java.lang.String getSecondaryDc() {
        return secondaryDc;
    }


    /**
     * Sets the secondaryDc value for this DomainControllerProfile.
     * 
     * @param secondaryDc
     */
    public void setSecondaryDc(java.lang.String secondaryDc) {
        this.secondaryDc = secondaryDc;
    }


    /**
     * Gets the dcPort value for this DomainControllerProfile.
     * 
     * @return dcPort
     */
    public java.lang.Integer getDcPort() {
        return dcPort;
    }


    /**
     * Sets the dcPort value for this DomainControllerProfile.
     * 
     * @param dcPort
     */
    public void setDcPort(java.lang.Integer dcPort) {
        this.dcPort = dcPort;
    }


    /**
     * Gets the attributes value for this DomainControllerProfile.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this DomainControllerProfile.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the username value for this DomainControllerProfile.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this DomainControllerProfile.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this DomainControllerProfile.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this DomainControllerProfile.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the searchScope value for this DomainControllerProfile.
     * 
     * @return searchScope
     */
    public java.lang.String getSearchScope() {
        return searchScope;
    }


    /**
     * Sets the searchScope value for this DomainControllerProfile.
     * 
     * @param searchScope
     */
    public void setSearchScope(java.lang.String searchScope) {
        this.searchScope = searchScope;
    }


    /**
     * Gets the searchFilter value for this DomainControllerProfile.
     * 
     * @return searchFilter
     */
    public java.lang.String getSearchFilter() {
        return searchFilter;
    }


    /**
     * Sets the searchFilter value for this DomainControllerProfile.
     * 
     * @param searchFilter
     */
    public void setSearchFilter(java.lang.String searchFilter) {
        this.searchFilter = searchFilter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomainControllerProfile)) return false;
        DomainControllerProfile other = (DomainControllerProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adProfileId==null && other.getAdProfileId()==null) || 
             (this.adProfileId!=null &&
              this.adProfileId.equals(other.getAdProfileId()))) &&
            ((this.domainControllerProfileId==null && other.getDomainControllerProfileId()==null) || 
             (this.domainControllerProfileId!=null &&
              this.domainControllerProfileId.equals(other.getDomainControllerProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.primaryDc==null && other.getPrimaryDc()==null) || 
             (this.primaryDc!=null &&
              this.primaryDc.equals(other.getPrimaryDc()))) &&
            ((this.secondaryDc==null && other.getSecondaryDc()==null) || 
             (this.secondaryDc!=null &&
              this.secondaryDc.equals(other.getSecondaryDc()))) &&
            ((this.dcPort==null && other.getDcPort()==null) || 
             (this.dcPort!=null &&
              this.dcPort.equals(other.getDcPort()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.searchScope==null && other.getSearchScope()==null) || 
             (this.searchScope!=null &&
              this.searchScope.equals(other.getSearchScope()))) &&
            ((this.searchFilter==null && other.getSearchFilter()==null) || 
             (this.searchFilter!=null &&
              this.searchFilter.equals(other.getSearchFilter())));
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
        if (getAdProfileId() != null) {
            _hashCode += getAdProfileId().hashCode();
        }
        if (getDomainControllerProfileId() != null) {
            _hashCode += getDomainControllerProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPrimaryDc() != null) {
            _hashCode += getPrimaryDc().hashCode();
        }
        if (getSecondaryDc() != null) {
            _hashCode += getSecondaryDc().hashCode();
        }
        if (getDcPort() != null) {
            _hashCode += getDcPort().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getSearchScope() != null) {
            _hashCode += getSearchScope().hashCode();
        }
        if (getSearchFilter() != null) {
            _hashCode += getSearchFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainControllerProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DomainControllerProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainControllerProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainControllerProfileId"));
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
        elemField.setFieldName("primaryDc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryDc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryDc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondaryDc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dcPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dcPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchScope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchFilter"));
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
