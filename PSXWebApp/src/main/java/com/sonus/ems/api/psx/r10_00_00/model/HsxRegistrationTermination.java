/**
 * HsxRegistrationTermination.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class HsxRegistrationTermination  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String publicUserId;
    private java.lang.Integer deregistrationCode;
    private java.lang.String deregistrationReason;
    private java.lang.Integer isPublicServiceId;
    private java.lang.Integer psiActivationState;

    public HsxRegistrationTermination() {
    }

    public HsxRegistrationTermination(
           java.lang.String publicUserId,
           java.lang.Integer deregistrationCode,
           java.lang.String deregistrationReason,
           java.lang.Integer isPublicServiceId,
           java.lang.Integer psiActivationState) {
           this.publicUserId = publicUserId;
           this.deregistrationCode = deregistrationCode;
           this.deregistrationReason = deregistrationReason;
           this.isPublicServiceId = isPublicServiceId;
           this.psiActivationState = psiActivationState;
    }


    /**
     * Gets the publicUserId value for this HsxRegistrationTermination.
     * 
     * @return publicUserId
     */
    public java.lang.String getPublicUserId() {
        return publicUserId;
    }


    /**
     * Sets the publicUserId value for this HsxRegistrationTermination.
     * 
     * @param publicUserId
     */
    public void setPublicUserId(java.lang.String publicUserId) {
        this.publicUserId = publicUserId;
    }


    /**
     * Gets the deregistrationCode value for this HsxRegistrationTermination.
     * 
     * @return deregistrationCode
     */
    public java.lang.Integer getDeregistrationCode() {
        return deregistrationCode;
    }


    /**
     * Sets the deregistrationCode value for this HsxRegistrationTermination.
     * 
     * @param deregistrationCode
     */
    public void setDeregistrationCode(java.lang.Integer deregistrationCode) {
        this.deregistrationCode = deregistrationCode;
    }


    /**
     * Gets the deregistrationReason value for this HsxRegistrationTermination.
     * 
     * @return deregistrationReason
     */
    public java.lang.String getDeregistrationReason() {
        return deregistrationReason;
    }


    /**
     * Sets the deregistrationReason value for this HsxRegistrationTermination.
     * 
     * @param deregistrationReason
     */
    public void setDeregistrationReason(java.lang.String deregistrationReason) {
        this.deregistrationReason = deregistrationReason;
    }


    /**
     * Gets the isPublicServiceId value for this HsxRegistrationTermination.
     * 
     * @return isPublicServiceId
     */
    public java.lang.Integer getIsPublicServiceId() {
        return isPublicServiceId;
    }


    /**
     * Sets the isPublicServiceId value for this HsxRegistrationTermination.
     * 
     * @param isPublicServiceId
     */
    public void setIsPublicServiceId(java.lang.Integer isPublicServiceId) {
        this.isPublicServiceId = isPublicServiceId;
    }


    /**
     * Gets the psiActivationState value for this HsxRegistrationTermination.
     * 
     * @return psiActivationState
     */
    public java.lang.Integer getPsiActivationState() {
        return psiActivationState;
    }


    /**
     * Sets the psiActivationState value for this HsxRegistrationTermination.
     * 
     * @param psiActivationState
     */
    public void setPsiActivationState(java.lang.Integer psiActivationState) {
        this.psiActivationState = psiActivationState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HsxRegistrationTermination)) return false;
        HsxRegistrationTermination other = (HsxRegistrationTermination) obj;
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
            ((this.deregistrationCode==null && other.getDeregistrationCode()==null) || 
             (this.deregistrationCode!=null &&
              this.deregistrationCode.equals(other.getDeregistrationCode()))) &&
            ((this.deregistrationReason==null && other.getDeregistrationReason()==null) || 
             (this.deregistrationReason!=null &&
              this.deregistrationReason.equals(other.getDeregistrationReason()))) &&
            ((this.isPublicServiceId==null && other.getIsPublicServiceId()==null) || 
             (this.isPublicServiceId!=null &&
              this.isPublicServiceId.equals(other.getIsPublicServiceId()))) &&
            ((this.psiActivationState==null && other.getPsiActivationState()==null) || 
             (this.psiActivationState!=null &&
              this.psiActivationState.equals(other.getPsiActivationState())));
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
        if (getDeregistrationCode() != null) {
            _hashCode += getDeregistrationCode().hashCode();
        }
        if (getDeregistrationReason() != null) {
            _hashCode += getDeregistrationReason().hashCode();
        }
        if (getIsPublicServiceId() != null) {
            _hashCode += getIsPublicServiceId().hashCode();
        }
        if (getPsiActivationState() != null) {
            _hashCode += getPsiActivationState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HsxRegistrationTermination.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxRegistrationTermination"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deregistrationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deregistrationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deregistrationReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deregistrationReason"));
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
