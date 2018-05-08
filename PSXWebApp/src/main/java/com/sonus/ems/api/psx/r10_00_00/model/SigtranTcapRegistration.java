/**
 * SigtranTcapRegistration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class SigtranTcapRegistration  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String sigtranTcapRegistrationId;
    private java.lang.Short sigtranTcapProtocolVariant;
    private java.lang.Short tcapLogicalUserId;
    private java.lang.Short sigtranLocalAsId;
    private java.lang.Short tcapMinDialogId;
    private java.lang.Short tcapMaxDialogId;
    private java.lang.Integer sigtranApplicationProtocols;

    public SigtranTcapRegistration() {
    }

    public SigtranTcapRegistration(
           java.lang.String sigtranTcapRegistrationId,
           java.lang.Short sigtranTcapProtocolVariant,
           java.lang.Short tcapLogicalUserId,
           java.lang.Short sigtranLocalAsId,
           java.lang.Short tcapMinDialogId,
           java.lang.Short tcapMaxDialogId,
           java.lang.Integer sigtranApplicationProtocols) {
           this.sigtranTcapRegistrationId = sigtranTcapRegistrationId;
           this.sigtranTcapProtocolVariant = sigtranTcapProtocolVariant;
           this.tcapLogicalUserId = tcapLogicalUserId;
           this.sigtranLocalAsId = sigtranLocalAsId;
           this.tcapMinDialogId = tcapMinDialogId;
           this.tcapMaxDialogId = tcapMaxDialogId;
           this.sigtranApplicationProtocols = sigtranApplicationProtocols;
    }


    /**
     * Gets the sigtranTcapRegistrationId value for this SigtranTcapRegistration.
     * 
     * @return sigtranTcapRegistrationId
     */
    public java.lang.String getSigtranTcapRegistrationId() {
        return sigtranTcapRegistrationId;
    }


    /**
     * Sets the sigtranTcapRegistrationId value for this SigtranTcapRegistration.
     * 
     * @param sigtranTcapRegistrationId
     */
    public void setSigtranTcapRegistrationId(java.lang.String sigtranTcapRegistrationId) {
        this.sigtranTcapRegistrationId = sigtranTcapRegistrationId;
    }


    /**
     * Gets the sigtranTcapProtocolVariant value for this SigtranTcapRegistration.
     * 
     * @return sigtranTcapProtocolVariant
     */
    public java.lang.Short getSigtranTcapProtocolVariant() {
        return sigtranTcapProtocolVariant;
    }


    /**
     * Sets the sigtranTcapProtocolVariant value for this SigtranTcapRegistration.
     * 
     * @param sigtranTcapProtocolVariant
     */
    public void setSigtranTcapProtocolVariant(java.lang.Short sigtranTcapProtocolVariant) {
        this.sigtranTcapProtocolVariant = sigtranTcapProtocolVariant;
    }


    /**
     * Gets the tcapLogicalUserId value for this SigtranTcapRegistration.
     * 
     * @return tcapLogicalUserId
     */
    public java.lang.Short getTcapLogicalUserId() {
        return tcapLogicalUserId;
    }


    /**
     * Sets the tcapLogicalUserId value for this SigtranTcapRegistration.
     * 
     * @param tcapLogicalUserId
     */
    public void setTcapLogicalUserId(java.lang.Short tcapLogicalUserId) {
        this.tcapLogicalUserId = tcapLogicalUserId;
    }


    /**
     * Gets the sigtranLocalAsId value for this SigtranTcapRegistration.
     * 
     * @return sigtranLocalAsId
     */
    public java.lang.Short getSigtranLocalAsId() {
        return sigtranLocalAsId;
    }


    /**
     * Sets the sigtranLocalAsId value for this SigtranTcapRegistration.
     * 
     * @param sigtranLocalAsId
     */
    public void setSigtranLocalAsId(java.lang.Short sigtranLocalAsId) {
        this.sigtranLocalAsId = sigtranLocalAsId;
    }


    /**
     * Gets the tcapMinDialogId value for this SigtranTcapRegistration.
     * 
     * @return tcapMinDialogId
     */
    public java.lang.Short getTcapMinDialogId() {
        return tcapMinDialogId;
    }


    /**
     * Sets the tcapMinDialogId value for this SigtranTcapRegistration.
     * 
     * @param tcapMinDialogId
     */
    public void setTcapMinDialogId(java.lang.Short tcapMinDialogId) {
        this.tcapMinDialogId = tcapMinDialogId;
    }


    /**
     * Gets the tcapMaxDialogId value for this SigtranTcapRegistration.
     * 
     * @return tcapMaxDialogId
     */
    public java.lang.Short getTcapMaxDialogId() {
        return tcapMaxDialogId;
    }


    /**
     * Sets the tcapMaxDialogId value for this SigtranTcapRegistration.
     * 
     * @param tcapMaxDialogId
     */
    public void setTcapMaxDialogId(java.lang.Short tcapMaxDialogId) {
        this.tcapMaxDialogId = tcapMaxDialogId;
    }


    /**
     * Gets the sigtranApplicationProtocols value for this SigtranTcapRegistration.
     * 
     * @return sigtranApplicationProtocols
     */
    public java.lang.Integer getSigtranApplicationProtocols() {
        return sigtranApplicationProtocols;
    }


    /**
     * Sets the sigtranApplicationProtocols value for this SigtranTcapRegistration.
     * 
     * @param sigtranApplicationProtocols
     */
    public void setSigtranApplicationProtocols(java.lang.Integer sigtranApplicationProtocols) {
        this.sigtranApplicationProtocols = sigtranApplicationProtocols;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SigtranTcapRegistration)) return false;
        SigtranTcapRegistration other = (SigtranTcapRegistration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sigtranTcapRegistrationId==null && other.getSigtranTcapRegistrationId()==null) || 
             (this.sigtranTcapRegistrationId!=null &&
              this.sigtranTcapRegistrationId.equals(other.getSigtranTcapRegistrationId()))) &&
            ((this.sigtranTcapProtocolVariant==null && other.getSigtranTcapProtocolVariant()==null) || 
             (this.sigtranTcapProtocolVariant!=null &&
              this.sigtranTcapProtocolVariant.equals(other.getSigtranTcapProtocolVariant()))) &&
            ((this.tcapLogicalUserId==null && other.getTcapLogicalUserId()==null) || 
             (this.tcapLogicalUserId!=null &&
              this.tcapLogicalUserId.equals(other.getTcapLogicalUserId()))) &&
            ((this.sigtranLocalAsId==null && other.getSigtranLocalAsId()==null) || 
             (this.sigtranLocalAsId!=null &&
              this.sigtranLocalAsId.equals(other.getSigtranLocalAsId()))) &&
            ((this.tcapMinDialogId==null && other.getTcapMinDialogId()==null) || 
             (this.tcapMinDialogId!=null &&
              this.tcapMinDialogId.equals(other.getTcapMinDialogId()))) &&
            ((this.tcapMaxDialogId==null && other.getTcapMaxDialogId()==null) || 
             (this.tcapMaxDialogId!=null &&
              this.tcapMaxDialogId.equals(other.getTcapMaxDialogId()))) &&
            ((this.sigtranApplicationProtocols==null && other.getSigtranApplicationProtocols()==null) || 
             (this.sigtranApplicationProtocols!=null &&
              this.sigtranApplicationProtocols.equals(other.getSigtranApplicationProtocols())));
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
        if (getSigtranTcapRegistrationId() != null) {
            _hashCode += getSigtranTcapRegistrationId().hashCode();
        }
        if (getSigtranTcapProtocolVariant() != null) {
            _hashCode += getSigtranTcapProtocolVariant().hashCode();
        }
        if (getTcapLogicalUserId() != null) {
            _hashCode += getTcapLogicalUserId().hashCode();
        }
        if (getSigtranLocalAsId() != null) {
            _hashCode += getSigtranLocalAsId().hashCode();
        }
        if (getTcapMinDialogId() != null) {
            _hashCode += getTcapMinDialogId().hashCode();
        }
        if (getTcapMaxDialogId() != null) {
            _hashCode += getTcapMaxDialogId().hashCode();
        }
        if (getSigtranApplicationProtocols() != null) {
            _hashCode += getSigtranApplicationProtocols().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SigtranTcapRegistration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranTcapRegistration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigtranTcapRegistrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigtranTcapRegistrationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigtranTcapProtocolVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigtranTcapProtocolVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcapLogicalUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcapLogicalUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigtranLocalAsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigtranLocalAsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcapMinDialogId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcapMinDialogId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcapMaxDialogId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcapMaxDialogId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigtranApplicationProtocols");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigtranApplicationProtocols"));
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
