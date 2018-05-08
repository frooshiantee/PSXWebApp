/**
 * CallingPartyBillingNumberData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class CallingPartyBillingNumberData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String callingBillingControlId;
    private java.lang.Short ingressCpn;
    private java.lang.Short ingressCpnPresentation;
    private java.lang.Short ingressBn;
    private java.lang.Short egressCpn;
    private java.lang.Short egressBn;
    private java.lang.String pmRuleId;

    public CallingPartyBillingNumberData() {
    }

    public CallingPartyBillingNumberData(
           java.lang.String callingBillingControlId,
           java.lang.Short ingressCpn,
           java.lang.Short ingressCpnPresentation,
           java.lang.Short ingressBn,
           java.lang.Short egressCpn,
           java.lang.Short egressBn,
           java.lang.String pmRuleId) {
           this.callingBillingControlId = callingBillingControlId;
           this.ingressCpn = ingressCpn;
           this.ingressCpnPresentation = ingressCpnPresentation;
           this.ingressBn = ingressBn;
           this.egressCpn = egressCpn;
           this.egressBn = egressBn;
           this.pmRuleId = pmRuleId;
    }


    /**
     * Gets the callingBillingControlId value for this CallingPartyBillingNumberData.
     * 
     * @return callingBillingControlId
     */
    public java.lang.String getCallingBillingControlId() {
        return callingBillingControlId;
    }


    /**
     * Sets the callingBillingControlId value for this CallingPartyBillingNumberData.
     * 
     * @param callingBillingControlId
     */
    public void setCallingBillingControlId(java.lang.String callingBillingControlId) {
        this.callingBillingControlId = callingBillingControlId;
    }


    /**
     * Gets the ingressCpn value for this CallingPartyBillingNumberData.
     * 
     * @return ingressCpn
     */
    public java.lang.Short getIngressCpn() {
        return ingressCpn;
    }


    /**
     * Sets the ingressCpn value for this CallingPartyBillingNumberData.
     * 
     * @param ingressCpn
     */
    public void setIngressCpn(java.lang.Short ingressCpn) {
        this.ingressCpn = ingressCpn;
    }


    /**
     * Gets the ingressCpnPresentation value for this CallingPartyBillingNumberData.
     * 
     * @return ingressCpnPresentation
     */
    public java.lang.Short getIngressCpnPresentation() {
        return ingressCpnPresentation;
    }


    /**
     * Sets the ingressCpnPresentation value for this CallingPartyBillingNumberData.
     * 
     * @param ingressCpnPresentation
     */
    public void setIngressCpnPresentation(java.lang.Short ingressCpnPresentation) {
        this.ingressCpnPresentation = ingressCpnPresentation;
    }


    /**
     * Gets the ingressBn value for this CallingPartyBillingNumberData.
     * 
     * @return ingressBn
     */
    public java.lang.Short getIngressBn() {
        return ingressBn;
    }


    /**
     * Sets the ingressBn value for this CallingPartyBillingNumberData.
     * 
     * @param ingressBn
     */
    public void setIngressBn(java.lang.Short ingressBn) {
        this.ingressBn = ingressBn;
    }


    /**
     * Gets the egressCpn value for this CallingPartyBillingNumberData.
     * 
     * @return egressCpn
     */
    public java.lang.Short getEgressCpn() {
        return egressCpn;
    }


    /**
     * Sets the egressCpn value for this CallingPartyBillingNumberData.
     * 
     * @param egressCpn
     */
    public void setEgressCpn(java.lang.Short egressCpn) {
        this.egressCpn = egressCpn;
    }


    /**
     * Gets the egressBn value for this CallingPartyBillingNumberData.
     * 
     * @return egressBn
     */
    public java.lang.Short getEgressBn() {
        return egressBn;
    }


    /**
     * Sets the egressBn value for this CallingPartyBillingNumberData.
     * 
     * @param egressBn
     */
    public void setEgressBn(java.lang.Short egressBn) {
        this.egressBn = egressBn;
    }


    /**
     * Gets the pmRuleId value for this CallingPartyBillingNumberData.
     * 
     * @return pmRuleId
     */
    public java.lang.String getPmRuleId() {
        return pmRuleId;
    }


    /**
     * Sets the pmRuleId value for this CallingPartyBillingNumberData.
     * 
     * @param pmRuleId
     */
    public void setPmRuleId(java.lang.String pmRuleId) {
        this.pmRuleId = pmRuleId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallingPartyBillingNumberData)) return false;
        CallingPartyBillingNumberData other = (CallingPartyBillingNumberData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callingBillingControlId==null && other.getCallingBillingControlId()==null) || 
             (this.callingBillingControlId!=null &&
              this.callingBillingControlId.equals(other.getCallingBillingControlId()))) &&
            ((this.ingressCpn==null && other.getIngressCpn()==null) || 
             (this.ingressCpn!=null &&
              this.ingressCpn.equals(other.getIngressCpn()))) &&
            ((this.ingressCpnPresentation==null && other.getIngressCpnPresentation()==null) || 
             (this.ingressCpnPresentation!=null &&
              this.ingressCpnPresentation.equals(other.getIngressCpnPresentation()))) &&
            ((this.ingressBn==null && other.getIngressBn()==null) || 
             (this.ingressBn!=null &&
              this.ingressBn.equals(other.getIngressBn()))) &&
            ((this.egressCpn==null && other.getEgressCpn()==null) || 
             (this.egressCpn!=null &&
              this.egressCpn.equals(other.getEgressCpn()))) &&
            ((this.egressBn==null && other.getEgressBn()==null) || 
             (this.egressBn!=null &&
              this.egressBn.equals(other.getEgressBn()))) &&
            ((this.pmRuleId==null && other.getPmRuleId()==null) || 
             (this.pmRuleId!=null &&
              this.pmRuleId.equals(other.getPmRuleId())));
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
        if (getCallingBillingControlId() != null) {
            _hashCode += getCallingBillingControlId().hashCode();
        }
        if (getIngressCpn() != null) {
            _hashCode += getIngressCpn().hashCode();
        }
        if (getIngressCpnPresentation() != null) {
            _hashCode += getIngressCpnPresentation().hashCode();
        }
        if (getIngressBn() != null) {
            _hashCode += getIngressBn().hashCode();
        }
        if (getEgressCpn() != null) {
            _hashCode += getEgressCpn().hashCode();
        }
        if (getEgressBn() != null) {
            _hashCode += getEgressBn().hashCode();
        }
        if (getPmRuleId() != null) {
            _hashCode += getPmRuleId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallingPartyBillingNumberData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallingPartyBillingNumberData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingBillingControlId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingBillingControlId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressCpn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressCpn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressCpnPresentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressCpnPresentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressBn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressBn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egressCpn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "egressCpn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egressBn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "egressBn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmRuleId"));
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
