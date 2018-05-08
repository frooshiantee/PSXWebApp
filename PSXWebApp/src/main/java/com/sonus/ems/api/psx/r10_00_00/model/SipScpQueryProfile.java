/**
 * SipScpQueryProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SipScpQueryProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sipScpMessageId;
    private java.lang.Integer sipScpOperationCode;
    private java.lang.Integer sipScpQueryFlags;
    private java.lang.Integer sipScpTrunkgroupTreatment;
    private java.lang.Integer sipScpUseDefaultFlags;
    private java.lang.Short calledNoa;
    private java.lang.Short calledNpi;
    private java.lang.Short calledUriParamUser;
    private java.lang.Short calledUriScheme;
    private java.lang.Short calledUriPresentation;
    private java.lang.Short callingNoa;

    public SipScpQueryProfile() {
    }

    public SipScpQueryProfile(
           java.lang.String sipScpMessageId,
           java.lang.Integer sipScpOperationCode,
           java.lang.Integer sipScpQueryFlags,
           java.lang.Integer sipScpTrunkgroupTreatment,
           java.lang.Integer sipScpUseDefaultFlags,
           java.lang.Short calledNoa,
           java.lang.Short calledNpi,
           java.lang.Short calledUriParamUser,
           java.lang.Short calledUriScheme,
           java.lang.Short calledUriPresentation,
           java.lang.Short callingNoa) {
           this.sipScpMessageId = sipScpMessageId;
           this.sipScpOperationCode = sipScpOperationCode;
           this.sipScpQueryFlags = sipScpQueryFlags;
           this.sipScpTrunkgroupTreatment = sipScpTrunkgroupTreatment;
           this.sipScpUseDefaultFlags = sipScpUseDefaultFlags;
           this.calledNoa = calledNoa;
           this.calledNpi = calledNpi;
           this.calledUriParamUser = calledUriParamUser;
           this.calledUriScheme = calledUriScheme;
           this.calledUriPresentation = calledUriPresentation;
           this.callingNoa = callingNoa;
    }


    /**
     * Gets the sipScpMessageId value for this SipScpQueryProfile.
     * 
     * @return sipScpMessageId
     */
    public java.lang.String getSipScpMessageId() {
        return sipScpMessageId;
    }


    /**
     * Sets the sipScpMessageId value for this SipScpQueryProfile.
     * 
     * @param sipScpMessageId
     */
    public void setSipScpMessageId(java.lang.String sipScpMessageId) {
        this.sipScpMessageId = sipScpMessageId;
    }


    /**
     * Gets the sipScpOperationCode value for this SipScpQueryProfile.
     * 
     * @return sipScpOperationCode
     */
    public java.lang.Integer getSipScpOperationCode() {
        return sipScpOperationCode;
    }


    /**
     * Sets the sipScpOperationCode value for this SipScpQueryProfile.
     * 
     * @param sipScpOperationCode
     */
    public void setSipScpOperationCode(java.lang.Integer sipScpOperationCode) {
        this.sipScpOperationCode = sipScpOperationCode;
    }


    /**
     * Gets the sipScpQueryFlags value for this SipScpQueryProfile.
     * 
     * @return sipScpQueryFlags
     */
    public java.lang.Integer getSipScpQueryFlags() {
        return sipScpQueryFlags;
    }


    /**
     * Sets the sipScpQueryFlags value for this SipScpQueryProfile.
     * 
     * @param sipScpQueryFlags
     */
    public void setSipScpQueryFlags(java.lang.Integer sipScpQueryFlags) {
        this.sipScpQueryFlags = sipScpQueryFlags;
    }


    /**
     * Gets the sipScpTrunkgroupTreatment value for this SipScpQueryProfile.
     * 
     * @return sipScpTrunkgroupTreatment
     */
    public java.lang.Integer getSipScpTrunkgroupTreatment() {
        return sipScpTrunkgroupTreatment;
    }


    /**
     * Sets the sipScpTrunkgroupTreatment value for this SipScpQueryProfile.
     * 
     * @param sipScpTrunkgroupTreatment
     */
    public void setSipScpTrunkgroupTreatment(java.lang.Integer sipScpTrunkgroupTreatment) {
        this.sipScpTrunkgroupTreatment = sipScpTrunkgroupTreatment;
    }


    /**
     * Gets the sipScpUseDefaultFlags value for this SipScpQueryProfile.
     * 
     * @return sipScpUseDefaultFlags
     */
    public java.lang.Integer getSipScpUseDefaultFlags() {
        return sipScpUseDefaultFlags;
    }


    /**
     * Sets the sipScpUseDefaultFlags value for this SipScpQueryProfile.
     * 
     * @param sipScpUseDefaultFlags
     */
    public void setSipScpUseDefaultFlags(java.lang.Integer sipScpUseDefaultFlags) {
        this.sipScpUseDefaultFlags = sipScpUseDefaultFlags;
    }


    /**
     * Gets the calledNoa value for this SipScpQueryProfile.
     * 
     * @return calledNoa
     */
    public java.lang.Short getCalledNoa() {
        return calledNoa;
    }


    /**
     * Sets the calledNoa value for this SipScpQueryProfile.
     * 
     * @param calledNoa
     */
    public void setCalledNoa(java.lang.Short calledNoa) {
        this.calledNoa = calledNoa;
    }


    /**
     * Gets the calledNpi value for this SipScpQueryProfile.
     * 
     * @return calledNpi
     */
    public java.lang.Short getCalledNpi() {
        return calledNpi;
    }


    /**
     * Sets the calledNpi value for this SipScpQueryProfile.
     * 
     * @param calledNpi
     */
    public void setCalledNpi(java.lang.Short calledNpi) {
        this.calledNpi = calledNpi;
    }


    /**
     * Gets the calledUriParamUser value for this SipScpQueryProfile.
     * 
     * @return calledUriParamUser
     */
    public java.lang.Short getCalledUriParamUser() {
        return calledUriParamUser;
    }


    /**
     * Sets the calledUriParamUser value for this SipScpQueryProfile.
     * 
     * @param calledUriParamUser
     */
    public void setCalledUriParamUser(java.lang.Short calledUriParamUser) {
        this.calledUriParamUser = calledUriParamUser;
    }


    /**
     * Gets the calledUriScheme value for this SipScpQueryProfile.
     * 
     * @return calledUriScheme
     */
    public java.lang.Short getCalledUriScheme() {
        return calledUriScheme;
    }


    /**
     * Sets the calledUriScheme value for this SipScpQueryProfile.
     * 
     * @param calledUriScheme
     */
    public void setCalledUriScheme(java.lang.Short calledUriScheme) {
        this.calledUriScheme = calledUriScheme;
    }


    /**
     * Gets the calledUriPresentation value for this SipScpQueryProfile.
     * 
     * @return calledUriPresentation
     */
    public java.lang.Short getCalledUriPresentation() {
        return calledUriPresentation;
    }


    /**
     * Sets the calledUriPresentation value for this SipScpQueryProfile.
     * 
     * @param calledUriPresentation
     */
    public void setCalledUriPresentation(java.lang.Short calledUriPresentation) {
        this.calledUriPresentation = calledUriPresentation;
    }


    /**
     * Gets the callingNoa value for this SipScpQueryProfile.
     * 
     * @return callingNoa
     */
    public java.lang.Short getCallingNoa() {
        return callingNoa;
    }


    /**
     * Sets the callingNoa value for this SipScpQueryProfile.
     * 
     * @param callingNoa
     */
    public void setCallingNoa(java.lang.Short callingNoa) {
        this.callingNoa = callingNoa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SipScpQueryProfile)) return false;
        SipScpQueryProfile other = (SipScpQueryProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sipScpMessageId==null && other.getSipScpMessageId()==null) || 
             (this.sipScpMessageId!=null &&
              this.sipScpMessageId.equals(other.getSipScpMessageId()))) &&
            ((this.sipScpOperationCode==null && other.getSipScpOperationCode()==null) || 
             (this.sipScpOperationCode!=null &&
              this.sipScpOperationCode.equals(other.getSipScpOperationCode()))) &&
            ((this.sipScpQueryFlags==null && other.getSipScpQueryFlags()==null) || 
             (this.sipScpQueryFlags!=null &&
              this.sipScpQueryFlags.equals(other.getSipScpQueryFlags()))) &&
            ((this.sipScpTrunkgroupTreatment==null && other.getSipScpTrunkgroupTreatment()==null) || 
             (this.sipScpTrunkgroupTreatment!=null &&
              this.sipScpTrunkgroupTreatment.equals(other.getSipScpTrunkgroupTreatment()))) &&
            ((this.sipScpUseDefaultFlags==null && other.getSipScpUseDefaultFlags()==null) || 
             (this.sipScpUseDefaultFlags!=null &&
              this.sipScpUseDefaultFlags.equals(other.getSipScpUseDefaultFlags()))) &&
            ((this.calledNoa==null && other.getCalledNoa()==null) || 
             (this.calledNoa!=null &&
              this.calledNoa.equals(other.getCalledNoa()))) &&
            ((this.calledNpi==null && other.getCalledNpi()==null) || 
             (this.calledNpi!=null &&
              this.calledNpi.equals(other.getCalledNpi()))) &&
            ((this.calledUriParamUser==null && other.getCalledUriParamUser()==null) || 
             (this.calledUriParamUser!=null &&
              this.calledUriParamUser.equals(other.getCalledUriParamUser()))) &&
            ((this.calledUriScheme==null && other.getCalledUriScheme()==null) || 
             (this.calledUriScheme!=null &&
              this.calledUriScheme.equals(other.getCalledUriScheme()))) &&
            ((this.calledUriPresentation==null && other.getCalledUriPresentation()==null) || 
             (this.calledUriPresentation!=null &&
              this.calledUriPresentation.equals(other.getCalledUriPresentation()))) &&
            ((this.callingNoa==null && other.getCallingNoa()==null) || 
             (this.callingNoa!=null &&
              this.callingNoa.equals(other.getCallingNoa())));
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
        if (getSipScpMessageId() != null) {
            _hashCode += getSipScpMessageId().hashCode();
        }
        if (getSipScpOperationCode() != null) {
            _hashCode += getSipScpOperationCode().hashCode();
        }
        if (getSipScpQueryFlags() != null) {
            _hashCode += getSipScpQueryFlags().hashCode();
        }
        if (getSipScpTrunkgroupTreatment() != null) {
            _hashCode += getSipScpTrunkgroupTreatment().hashCode();
        }
        if (getSipScpUseDefaultFlags() != null) {
            _hashCode += getSipScpUseDefaultFlags().hashCode();
        }
        if (getCalledNoa() != null) {
            _hashCode += getCalledNoa().hashCode();
        }
        if (getCalledNpi() != null) {
            _hashCode += getCalledNpi().hashCode();
        }
        if (getCalledUriParamUser() != null) {
            _hashCode += getCalledUriParamUser().hashCode();
        }
        if (getCalledUriScheme() != null) {
            _hashCode += getCalledUriScheme().hashCode();
        }
        if (getCalledUriPresentation() != null) {
            _hashCode += getCalledUriPresentation().hashCode();
        }
        if (getCallingNoa() != null) {
            _hashCode += getCallingNoa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SipScpQueryProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpQueryProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipScpMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipScpMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipScpOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipScpOperationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipScpQueryFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipScpQueryFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipScpTrunkgroupTreatment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipScpTrunkgroupTreatment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipScpUseDefaultFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipScpUseDefaultFlags"));
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
        elemField.setFieldName("calledUriParamUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledUriParamUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledUriScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledUriScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledUriPresentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledUriPresentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
