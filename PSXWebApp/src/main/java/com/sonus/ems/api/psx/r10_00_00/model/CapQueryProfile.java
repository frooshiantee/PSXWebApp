/**
 * CapQueryProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CapQueryProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String capMessageId;
    private java.lang.Integer capOperationCode;
    private java.lang.Integer capQueryFlags1;
    private java.lang.Integer capQueryFlags2;
    private java.lang.Integer useDefaultFlags;
    private java.lang.Integer applicationTimer;
    private java.lang.String pmRuleId;
    private java.lang.Integer capVersion;
    private java.lang.String routingLabelId;
    private java.lang.Integer ipspcapabilitiesStandardPart;
    private java.lang.String ipspcapabilitiesBilateralPart;

    public CapQueryProfile() {
    }

    public CapQueryProfile(
           java.lang.String capMessageId,
           java.lang.Integer capOperationCode,
           java.lang.Integer capQueryFlags1,
           java.lang.Integer capQueryFlags2,
           java.lang.Integer useDefaultFlags,
           java.lang.Integer applicationTimer,
           java.lang.String pmRuleId,
           java.lang.Integer capVersion,
           java.lang.String routingLabelId,
           java.lang.Integer ipspcapabilitiesStandardPart,
           java.lang.String ipspcapabilitiesBilateralPart) {
           this.capMessageId = capMessageId;
           this.capOperationCode = capOperationCode;
           this.capQueryFlags1 = capQueryFlags1;
           this.capQueryFlags2 = capQueryFlags2;
           this.useDefaultFlags = useDefaultFlags;
           this.applicationTimer = applicationTimer;
           this.pmRuleId = pmRuleId;
           this.capVersion = capVersion;
           this.routingLabelId = routingLabelId;
           this.ipspcapabilitiesStandardPart = ipspcapabilitiesStandardPart;
           this.ipspcapabilitiesBilateralPart = ipspcapabilitiesBilateralPart;
    }


    /**
     * Gets the capMessageId value for this CapQueryProfile.
     * 
     * @return capMessageId
     */
    public java.lang.String getCapMessageId() {
        return capMessageId;
    }


    /**
     * Sets the capMessageId value for this CapQueryProfile.
     * 
     * @param capMessageId
     */
    public void setCapMessageId(java.lang.String capMessageId) {
        this.capMessageId = capMessageId;
    }


    /**
     * Gets the capOperationCode value for this CapQueryProfile.
     * 
     * @return capOperationCode
     */
    public java.lang.Integer getCapOperationCode() {
        return capOperationCode;
    }


    /**
     * Sets the capOperationCode value for this CapQueryProfile.
     * 
     * @param capOperationCode
     */
    public void setCapOperationCode(java.lang.Integer capOperationCode) {
        this.capOperationCode = capOperationCode;
    }


    /**
     * Gets the capQueryFlags1 value for this CapQueryProfile.
     * 
     * @return capQueryFlags1
     */
    public java.lang.Integer getCapQueryFlags1() {
        return capQueryFlags1;
    }


    /**
     * Sets the capQueryFlags1 value for this CapQueryProfile.
     * 
     * @param capQueryFlags1
     */
    public void setCapQueryFlags1(java.lang.Integer capQueryFlags1) {
        this.capQueryFlags1 = capQueryFlags1;
    }


    /**
     * Gets the capQueryFlags2 value for this CapQueryProfile.
     * 
     * @return capQueryFlags2
     */
    public java.lang.Integer getCapQueryFlags2() {
        return capQueryFlags2;
    }


    /**
     * Sets the capQueryFlags2 value for this CapQueryProfile.
     * 
     * @param capQueryFlags2
     */
    public void setCapQueryFlags2(java.lang.Integer capQueryFlags2) {
        this.capQueryFlags2 = capQueryFlags2;
    }


    /**
     * Gets the useDefaultFlags value for this CapQueryProfile.
     * 
     * @return useDefaultFlags
     */
    public java.lang.Integer getUseDefaultFlags() {
        return useDefaultFlags;
    }


    /**
     * Sets the useDefaultFlags value for this CapQueryProfile.
     * 
     * @param useDefaultFlags
     */
    public void setUseDefaultFlags(java.lang.Integer useDefaultFlags) {
        this.useDefaultFlags = useDefaultFlags;
    }


    /**
     * Gets the applicationTimer value for this CapQueryProfile.
     * 
     * @return applicationTimer
     */
    public java.lang.Integer getApplicationTimer() {
        return applicationTimer;
    }


    /**
     * Sets the applicationTimer value for this CapQueryProfile.
     * 
     * @param applicationTimer
     */
    public void setApplicationTimer(java.lang.Integer applicationTimer) {
        this.applicationTimer = applicationTimer;
    }


    /**
     * Gets the pmRuleId value for this CapQueryProfile.
     * 
     * @return pmRuleId
     */
    public java.lang.String getPmRuleId() {
        return pmRuleId;
    }


    /**
     * Sets the pmRuleId value for this CapQueryProfile.
     * 
     * @param pmRuleId
     */
    public void setPmRuleId(java.lang.String pmRuleId) {
        this.pmRuleId = pmRuleId;
    }


    /**
     * Gets the capVersion value for this CapQueryProfile.
     * 
     * @return capVersion
     */
    public java.lang.Integer getCapVersion() {
        return capVersion;
    }


    /**
     * Sets the capVersion value for this CapQueryProfile.
     * 
     * @param capVersion
     */
    public void setCapVersion(java.lang.Integer capVersion) {
        this.capVersion = capVersion;
    }


    /**
     * Gets the routingLabelId value for this CapQueryProfile.
     * 
     * @return routingLabelId
     */
    public java.lang.String getRoutingLabelId() {
        return routingLabelId;
    }


    /**
     * Sets the routingLabelId value for this CapQueryProfile.
     * 
     * @param routingLabelId
     */
    public void setRoutingLabelId(java.lang.String routingLabelId) {
        this.routingLabelId = routingLabelId;
    }


    /**
     * Gets the ipspcapabilitiesStandardPart value for this CapQueryProfile.
     * 
     * @return ipspcapabilitiesStandardPart
     */
    public java.lang.Integer getIpspcapabilitiesStandardPart() {
        return ipspcapabilitiesStandardPart;
    }


    /**
     * Sets the ipspcapabilitiesStandardPart value for this CapQueryProfile.
     * 
     * @param ipspcapabilitiesStandardPart
     */
    public void setIpspcapabilitiesStandardPart(java.lang.Integer ipspcapabilitiesStandardPart) {
        this.ipspcapabilitiesStandardPart = ipspcapabilitiesStandardPart;
    }


    /**
     * Gets the ipspcapabilitiesBilateralPart value for this CapQueryProfile.
     * 
     * @return ipspcapabilitiesBilateralPart
     */
    public java.lang.String getIpspcapabilitiesBilateralPart() {
        return ipspcapabilitiesBilateralPart;
    }


    /**
     * Sets the ipspcapabilitiesBilateralPart value for this CapQueryProfile.
     * 
     * @param ipspcapabilitiesBilateralPart
     */
    public void setIpspcapabilitiesBilateralPart(java.lang.String ipspcapabilitiesBilateralPart) {
        this.ipspcapabilitiesBilateralPart = ipspcapabilitiesBilateralPart;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapQueryProfile)) return false;
        CapQueryProfile other = (CapQueryProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.capMessageId==null && other.getCapMessageId()==null) || 
             (this.capMessageId!=null &&
              this.capMessageId.equals(other.getCapMessageId()))) &&
            ((this.capOperationCode==null && other.getCapOperationCode()==null) || 
             (this.capOperationCode!=null &&
              this.capOperationCode.equals(other.getCapOperationCode()))) &&
            ((this.capQueryFlags1==null && other.getCapQueryFlags1()==null) || 
             (this.capQueryFlags1!=null &&
              this.capQueryFlags1.equals(other.getCapQueryFlags1()))) &&
            ((this.capQueryFlags2==null && other.getCapQueryFlags2()==null) || 
             (this.capQueryFlags2!=null &&
              this.capQueryFlags2.equals(other.getCapQueryFlags2()))) &&
            ((this.useDefaultFlags==null && other.getUseDefaultFlags()==null) || 
             (this.useDefaultFlags!=null &&
              this.useDefaultFlags.equals(other.getUseDefaultFlags()))) &&
            ((this.applicationTimer==null && other.getApplicationTimer()==null) || 
             (this.applicationTimer!=null &&
              this.applicationTimer.equals(other.getApplicationTimer()))) &&
            ((this.pmRuleId==null && other.getPmRuleId()==null) || 
             (this.pmRuleId!=null &&
              this.pmRuleId.equals(other.getPmRuleId()))) &&
            ((this.capVersion==null && other.getCapVersion()==null) || 
             (this.capVersion!=null &&
              this.capVersion.equals(other.getCapVersion()))) &&
            ((this.routingLabelId==null && other.getRoutingLabelId()==null) || 
             (this.routingLabelId!=null &&
              this.routingLabelId.equals(other.getRoutingLabelId()))) &&
            ((this.ipspcapabilitiesStandardPart==null && other.getIpspcapabilitiesStandardPart()==null) || 
             (this.ipspcapabilitiesStandardPart!=null &&
              this.ipspcapabilitiesStandardPart.equals(other.getIpspcapabilitiesStandardPart()))) &&
            ((this.ipspcapabilitiesBilateralPart==null && other.getIpspcapabilitiesBilateralPart()==null) || 
             (this.ipspcapabilitiesBilateralPart!=null &&
              this.ipspcapabilitiesBilateralPart.equals(other.getIpspcapabilitiesBilateralPart())));
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
        if (getCapMessageId() != null) {
            _hashCode += getCapMessageId().hashCode();
        }
        if (getCapOperationCode() != null) {
            _hashCode += getCapOperationCode().hashCode();
        }
        if (getCapQueryFlags1() != null) {
            _hashCode += getCapQueryFlags1().hashCode();
        }
        if (getCapQueryFlags2() != null) {
            _hashCode += getCapQueryFlags2().hashCode();
        }
        if (getUseDefaultFlags() != null) {
            _hashCode += getUseDefaultFlags().hashCode();
        }
        if (getApplicationTimer() != null) {
            _hashCode += getApplicationTimer().hashCode();
        }
        if (getPmRuleId() != null) {
            _hashCode += getPmRuleId().hashCode();
        }
        if (getCapVersion() != null) {
            _hashCode += getCapVersion().hashCode();
        }
        if (getRoutingLabelId() != null) {
            _hashCode += getRoutingLabelId().hashCode();
        }
        if (getIpspcapabilitiesStandardPart() != null) {
            _hashCode += getIpspcapabilitiesStandardPart().hashCode();
        }
        if (getIpspcapabilitiesBilateralPart() != null) {
            _hashCode += getIpspcapabilitiesBilateralPart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CapQueryProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CapQueryProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capOperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capQueryFlags1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capQueryFlags1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capQueryFlags2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capQueryFlags2"));
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
        elemField.setFieldName("applicationTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipspcapabilitiesStandardPart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipspcapabilitiesStandardPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipspcapabilitiesBilateralPart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipspcapabilitiesBilateralPart"));
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
