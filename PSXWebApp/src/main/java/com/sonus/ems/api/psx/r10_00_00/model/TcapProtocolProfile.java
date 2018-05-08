/**
 * TcapProtocolProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class TcapProtocolProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String tcapProtocolProfileId;
    private java.lang.Short tcapEncodingForm;
    private java.lang.Short tcapMaxDialogues;
    private java.lang.Short tcapMaxInvokes;
    private java.lang.Short tcapMaxInvPerDlg;

    public TcapProtocolProfile() {
    }

    public TcapProtocolProfile(
           java.lang.String tcapProtocolProfileId,
           java.lang.Short tcapEncodingForm,
           java.lang.Short tcapMaxDialogues,
           java.lang.Short tcapMaxInvokes,
           java.lang.Short tcapMaxInvPerDlg) {
           this.tcapProtocolProfileId = tcapProtocolProfileId;
           this.tcapEncodingForm = tcapEncodingForm;
           this.tcapMaxDialogues = tcapMaxDialogues;
           this.tcapMaxInvokes = tcapMaxInvokes;
           this.tcapMaxInvPerDlg = tcapMaxInvPerDlg;
    }


    /**
     * Gets the tcapProtocolProfileId value for this TcapProtocolProfile.
     * 
     * @return tcapProtocolProfileId
     */
    public java.lang.String getTcapProtocolProfileId() {
        return tcapProtocolProfileId;
    }


    /**
     * Sets the tcapProtocolProfileId value for this TcapProtocolProfile.
     * 
     * @param tcapProtocolProfileId
     */
    public void setTcapProtocolProfileId(java.lang.String tcapProtocolProfileId) {
        this.tcapProtocolProfileId = tcapProtocolProfileId;
    }


    /**
     * Gets the tcapEncodingForm value for this TcapProtocolProfile.
     * 
     * @return tcapEncodingForm
     */
    public java.lang.Short getTcapEncodingForm() {
        return tcapEncodingForm;
    }


    /**
     * Sets the tcapEncodingForm value for this TcapProtocolProfile.
     * 
     * @param tcapEncodingForm
     */
    public void setTcapEncodingForm(java.lang.Short tcapEncodingForm) {
        this.tcapEncodingForm = tcapEncodingForm;
    }


    /**
     * Gets the tcapMaxDialogues value for this TcapProtocolProfile.
     * 
     * @return tcapMaxDialogues
     */
    public java.lang.Short getTcapMaxDialogues() {
        return tcapMaxDialogues;
    }


    /**
     * Sets the tcapMaxDialogues value for this TcapProtocolProfile.
     * 
     * @param tcapMaxDialogues
     */
    public void setTcapMaxDialogues(java.lang.Short tcapMaxDialogues) {
        this.tcapMaxDialogues = tcapMaxDialogues;
    }


    /**
     * Gets the tcapMaxInvokes value for this TcapProtocolProfile.
     * 
     * @return tcapMaxInvokes
     */
    public java.lang.Short getTcapMaxInvokes() {
        return tcapMaxInvokes;
    }


    /**
     * Sets the tcapMaxInvokes value for this TcapProtocolProfile.
     * 
     * @param tcapMaxInvokes
     */
    public void setTcapMaxInvokes(java.lang.Short tcapMaxInvokes) {
        this.tcapMaxInvokes = tcapMaxInvokes;
    }


    /**
     * Gets the tcapMaxInvPerDlg value for this TcapProtocolProfile.
     * 
     * @return tcapMaxInvPerDlg
     */
    public java.lang.Short getTcapMaxInvPerDlg() {
        return tcapMaxInvPerDlg;
    }


    /**
     * Sets the tcapMaxInvPerDlg value for this TcapProtocolProfile.
     * 
     * @param tcapMaxInvPerDlg
     */
    public void setTcapMaxInvPerDlg(java.lang.Short tcapMaxInvPerDlg) {
        this.tcapMaxInvPerDlg = tcapMaxInvPerDlg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TcapProtocolProfile)) return false;
        TcapProtocolProfile other = (TcapProtocolProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tcapProtocolProfileId==null && other.getTcapProtocolProfileId()==null) || 
             (this.tcapProtocolProfileId!=null &&
              this.tcapProtocolProfileId.equals(other.getTcapProtocolProfileId()))) &&
            ((this.tcapEncodingForm==null && other.getTcapEncodingForm()==null) || 
             (this.tcapEncodingForm!=null &&
              this.tcapEncodingForm.equals(other.getTcapEncodingForm()))) &&
            ((this.tcapMaxDialogues==null && other.getTcapMaxDialogues()==null) || 
             (this.tcapMaxDialogues!=null &&
              this.tcapMaxDialogues.equals(other.getTcapMaxDialogues()))) &&
            ((this.tcapMaxInvokes==null && other.getTcapMaxInvokes()==null) || 
             (this.tcapMaxInvokes!=null &&
              this.tcapMaxInvokes.equals(other.getTcapMaxInvokes()))) &&
            ((this.tcapMaxInvPerDlg==null && other.getTcapMaxInvPerDlg()==null) || 
             (this.tcapMaxInvPerDlg!=null &&
              this.tcapMaxInvPerDlg.equals(other.getTcapMaxInvPerDlg())));
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
        if (getTcapProtocolProfileId() != null) {
            _hashCode += getTcapProtocolProfileId().hashCode();
        }
        if (getTcapEncodingForm() != null) {
            _hashCode += getTcapEncodingForm().hashCode();
        }
        if (getTcapMaxDialogues() != null) {
            _hashCode += getTcapMaxDialogues().hashCode();
        }
        if (getTcapMaxInvokes() != null) {
            _hashCode += getTcapMaxInvokes().hashCode();
        }
        if (getTcapMaxInvPerDlg() != null) {
            _hashCode += getTcapMaxInvPerDlg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TcapProtocolProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TcapProtocolProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcapProtocolProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcapProtocolProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcapEncodingForm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcapEncodingForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcapMaxDialogues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcapMaxDialogues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcapMaxInvokes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcapMaxInvokes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcapMaxInvPerDlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcapMaxInvPerDlg"));
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
