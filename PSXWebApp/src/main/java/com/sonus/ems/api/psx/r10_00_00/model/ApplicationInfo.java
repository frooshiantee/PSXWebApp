/**
 * ApplicationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ApplicationInfo  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String applicationInfoProfileId;
    private java.lang.String countryId;
    private java.lang.String prefixToStrip;
    private java.lang.Integer attributes;
    private java.lang.String subscriberIdMatching;

    public ApplicationInfo() {
    }

    public ApplicationInfo(
           java.lang.String applicationInfoProfileId,
           java.lang.String countryId,
           java.lang.String prefixToStrip,
           java.lang.Integer attributes,
           java.lang.String subscriberIdMatching) {
           this.applicationInfoProfileId = applicationInfoProfileId;
           this.countryId = countryId;
           this.prefixToStrip = prefixToStrip;
           this.attributes = attributes;
           this.subscriberIdMatching = subscriberIdMatching;
    }


    /**
     * Gets the applicationInfoProfileId value for this ApplicationInfo.
     * 
     * @return applicationInfoProfileId
     */
    public java.lang.String getApplicationInfoProfileId() {
        return applicationInfoProfileId;
    }


    /**
     * Sets the applicationInfoProfileId value for this ApplicationInfo.
     * 
     * @param applicationInfoProfileId
     */
    public void setApplicationInfoProfileId(java.lang.String applicationInfoProfileId) {
        this.applicationInfoProfileId = applicationInfoProfileId;
    }


    /**
     * Gets the countryId value for this ApplicationInfo.
     * 
     * @return countryId
     */
    public java.lang.String getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this ApplicationInfo.
     * 
     * @param countryId
     */
    public void setCountryId(java.lang.String countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the prefixToStrip value for this ApplicationInfo.
     * 
     * @return prefixToStrip
     */
    public java.lang.String getPrefixToStrip() {
        return prefixToStrip;
    }


    /**
     * Sets the prefixToStrip value for this ApplicationInfo.
     * 
     * @param prefixToStrip
     */
    public void setPrefixToStrip(java.lang.String prefixToStrip) {
        this.prefixToStrip = prefixToStrip;
    }


    /**
     * Gets the attributes value for this ApplicationInfo.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this ApplicationInfo.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the subscriberIdMatching value for this ApplicationInfo.
     * 
     * @return subscriberIdMatching
     */
    public java.lang.String getSubscriberIdMatching() {
        return subscriberIdMatching;
    }


    /**
     * Sets the subscriberIdMatching value for this ApplicationInfo.
     * 
     * @param subscriberIdMatching
     */
    public void setSubscriberIdMatching(java.lang.String subscriberIdMatching) {
        this.subscriberIdMatching = subscriberIdMatching;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplicationInfo)) return false;
        ApplicationInfo other = (ApplicationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applicationInfoProfileId==null && other.getApplicationInfoProfileId()==null) || 
             (this.applicationInfoProfileId!=null &&
              this.applicationInfoProfileId.equals(other.getApplicationInfoProfileId()))) &&
            ((this.countryId==null && other.getCountryId()==null) || 
             (this.countryId!=null &&
              this.countryId.equals(other.getCountryId()))) &&
            ((this.prefixToStrip==null && other.getPrefixToStrip()==null) || 
             (this.prefixToStrip!=null &&
              this.prefixToStrip.equals(other.getPrefixToStrip()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.subscriberIdMatching==null && other.getSubscriberIdMatching()==null) || 
             (this.subscriberIdMatching!=null &&
              this.subscriberIdMatching.equals(other.getSubscriberIdMatching())));
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
        if (getApplicationInfoProfileId() != null) {
            _hashCode += getApplicationInfoProfileId().hashCode();
        }
        if (getCountryId() != null) {
            _hashCode += getCountryId().hashCode();
        }
        if (getPrefixToStrip() != null) {
            _hashCode += getPrefixToStrip().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getSubscriberIdMatching() != null) {
            _hashCode += getSubscriberIdMatching().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplicationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ApplicationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationInfoProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationInfoProfileId"));
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
        elemField.setFieldName("prefixToStrip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixToStrip"));
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
        elemField.setFieldName("subscriberIdMatching");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberIdMatching"));
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
