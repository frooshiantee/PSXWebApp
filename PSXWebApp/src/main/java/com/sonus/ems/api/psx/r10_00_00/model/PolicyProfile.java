/**
 * PolicyProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class PolicyProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String policyProfileId;
    private java.lang.String description;
    private java.lang.String callParamFilterProfileId;
    private java.lang.String callParamFilterGroupId;
    private java.lang.String packetServiceProfileId;
    private java.lang.String ipSignalingProfileId;
    private java.lang.Integer uriAction;
    private java.lang.Integer policyAttributes;

    public PolicyProfile() {
    }

    public PolicyProfile(
           java.lang.String policyProfileId,
           java.lang.String description,
           java.lang.String callParamFilterProfileId,
           java.lang.String callParamFilterGroupId,
           java.lang.String packetServiceProfileId,
           java.lang.String ipSignalingProfileId,
           java.lang.Integer uriAction,
           java.lang.Integer policyAttributes) {
           this.policyProfileId = policyProfileId;
           this.description = description;
           this.callParamFilterProfileId = callParamFilterProfileId;
           this.callParamFilterGroupId = callParamFilterGroupId;
           this.packetServiceProfileId = packetServiceProfileId;
           this.ipSignalingProfileId = ipSignalingProfileId;
           this.uriAction = uriAction;
           this.policyAttributes = policyAttributes;
    }


    /**
     * Gets the policyProfileId value for this PolicyProfile.
     * 
     * @return policyProfileId
     */
    public java.lang.String getPolicyProfileId() {
        return policyProfileId;
    }


    /**
     * Sets the policyProfileId value for this PolicyProfile.
     * 
     * @param policyProfileId
     */
    public void setPolicyProfileId(java.lang.String policyProfileId) {
        this.policyProfileId = policyProfileId;
    }


    /**
     * Gets the description value for this PolicyProfile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PolicyProfile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the callParamFilterProfileId value for this PolicyProfile.
     * 
     * @return callParamFilterProfileId
     */
    public java.lang.String getCallParamFilterProfileId() {
        return callParamFilterProfileId;
    }


    /**
     * Sets the callParamFilterProfileId value for this PolicyProfile.
     * 
     * @param callParamFilterProfileId
     */
    public void setCallParamFilterProfileId(java.lang.String callParamFilterProfileId) {
        this.callParamFilterProfileId = callParamFilterProfileId;
    }


    /**
     * Gets the callParamFilterGroupId value for this PolicyProfile.
     * 
     * @return callParamFilterGroupId
     */
    public java.lang.String getCallParamFilterGroupId() {
        return callParamFilterGroupId;
    }


    /**
     * Sets the callParamFilterGroupId value for this PolicyProfile.
     * 
     * @param callParamFilterGroupId
     */
    public void setCallParamFilterGroupId(java.lang.String callParamFilterGroupId) {
        this.callParamFilterGroupId = callParamFilterGroupId;
    }


    /**
     * Gets the packetServiceProfileId value for this PolicyProfile.
     * 
     * @return packetServiceProfileId
     */
    public java.lang.String getPacketServiceProfileId() {
        return packetServiceProfileId;
    }


    /**
     * Sets the packetServiceProfileId value for this PolicyProfile.
     * 
     * @param packetServiceProfileId
     */
    public void setPacketServiceProfileId(java.lang.String packetServiceProfileId) {
        this.packetServiceProfileId = packetServiceProfileId;
    }


    /**
     * Gets the ipSignalingProfileId value for this PolicyProfile.
     * 
     * @return ipSignalingProfileId
     */
    public java.lang.String getIpSignalingProfileId() {
        return ipSignalingProfileId;
    }


    /**
     * Sets the ipSignalingProfileId value for this PolicyProfile.
     * 
     * @param ipSignalingProfileId
     */
    public void setIpSignalingProfileId(java.lang.String ipSignalingProfileId) {
        this.ipSignalingProfileId = ipSignalingProfileId;
    }


    /**
     * Gets the uriAction value for this PolicyProfile.
     * 
     * @return uriAction
     */
    public java.lang.Integer getUriAction() {
        return uriAction;
    }


    /**
     * Sets the uriAction value for this PolicyProfile.
     * 
     * @param uriAction
     */
    public void setUriAction(java.lang.Integer uriAction) {
        this.uriAction = uriAction;
    }


    /**
     * Gets the policyAttributes value for this PolicyProfile.
     * 
     * @return policyAttributes
     */
    public java.lang.Integer getPolicyAttributes() {
        return policyAttributes;
    }


    /**
     * Sets the policyAttributes value for this PolicyProfile.
     * 
     * @param policyAttributes
     */
    public void setPolicyAttributes(java.lang.Integer policyAttributes) {
        this.policyAttributes = policyAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyProfile)) return false;
        PolicyProfile other = (PolicyProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.policyProfileId==null && other.getPolicyProfileId()==null) || 
             (this.policyProfileId!=null &&
              this.policyProfileId.equals(other.getPolicyProfileId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.callParamFilterProfileId==null && other.getCallParamFilterProfileId()==null) || 
             (this.callParamFilterProfileId!=null &&
              this.callParamFilterProfileId.equals(other.getCallParamFilterProfileId()))) &&
            ((this.callParamFilterGroupId==null && other.getCallParamFilterGroupId()==null) || 
             (this.callParamFilterGroupId!=null &&
              this.callParamFilterGroupId.equals(other.getCallParamFilterGroupId()))) &&
            ((this.packetServiceProfileId==null && other.getPacketServiceProfileId()==null) || 
             (this.packetServiceProfileId!=null &&
              this.packetServiceProfileId.equals(other.getPacketServiceProfileId()))) &&
            ((this.ipSignalingProfileId==null && other.getIpSignalingProfileId()==null) || 
             (this.ipSignalingProfileId!=null &&
              this.ipSignalingProfileId.equals(other.getIpSignalingProfileId()))) &&
            ((this.uriAction==null && other.getUriAction()==null) || 
             (this.uriAction!=null &&
              this.uriAction.equals(other.getUriAction()))) &&
            ((this.policyAttributes==null && other.getPolicyAttributes()==null) || 
             (this.policyAttributes!=null &&
              this.policyAttributes.equals(other.getPolicyAttributes())));
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
        if (getPolicyProfileId() != null) {
            _hashCode += getPolicyProfileId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCallParamFilterProfileId() != null) {
            _hashCode += getCallParamFilterProfileId().hashCode();
        }
        if (getCallParamFilterGroupId() != null) {
            _hashCode += getCallParamFilterGroupId().hashCode();
        }
        if (getPacketServiceProfileId() != null) {
            _hashCode += getPacketServiceProfileId().hashCode();
        }
        if (getIpSignalingProfileId() != null) {
            _hashCode += getIpSignalingProfileId().hashCode();
        }
        if (getUriAction() != null) {
            _hashCode += getUriAction().hashCode();
        }
        if (getPolicyAttributes() != null) {
            _hashCode += getPolicyAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PolicyProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyProfileId"));
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
        elemField.setFieldName("callParamFilterProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParamFilterGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetServiceProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packetServiceProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSignalingProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSignalingProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uriAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uriAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyAttributes"));
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
