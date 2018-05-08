/**
 * EndPointLocationProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class EndPointLocationProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String endPointLocationProfileId;

    private java.lang.String jipId;

    private java.lang.String lataId;

    private java.lang.String regionId;

    private java.lang.Short dfltCpnPresentation;

    private java.lang.String billingId;

    private java.lang.Short billingNoa;

    private java.lang.Short billingNpi;

    public EndPointLocationProfile() {
    }

    public EndPointLocationProfile(
           java.lang.String endPointLocationProfileId,
           java.lang.String jipId,
           java.lang.String lataId,
           java.lang.String regionId,
           java.lang.Short dfltCpnPresentation,
           java.lang.String billingId,
           java.lang.Short billingNoa,
           java.lang.Short billingNpi) {
        this.endPointLocationProfileId = endPointLocationProfileId;
        this.jipId = jipId;
        this.lataId = lataId;
        this.regionId = regionId;
        this.dfltCpnPresentation = dfltCpnPresentation;
        this.billingId = billingId;
        this.billingNoa = billingNoa;
        this.billingNpi = billingNpi;
    }


    /**
     * Gets the endPointLocationProfileId value for this EndPointLocationProfile.
     * 
     * @return endPointLocationProfileId
     */
    public java.lang.String getEndPointLocationProfileId() {
        return endPointLocationProfileId;
    }


    /**
     * Sets the endPointLocationProfileId value for this EndPointLocationProfile.
     * 
     * @param endPointLocationProfileId
     */
    public void setEndPointLocationProfileId(java.lang.String endPointLocationProfileId) {
        this.endPointLocationProfileId = endPointLocationProfileId;
    }


    /**
     * Gets the jipId value for this EndPointLocationProfile.
     * 
     * @return jipId
     */
    public java.lang.String getJipId() {
        return jipId;
    }


    /**
     * Sets the jipId value for this EndPointLocationProfile.
     * 
     * @param jipId
     */
    public void setJipId(java.lang.String jipId) {
        this.jipId = jipId;
    }


    /**
     * Gets the lataId value for this EndPointLocationProfile.
     * 
     * @return lataId
     */
    public java.lang.String getLataId() {
        return lataId;
    }


    /**
     * Sets the lataId value for this EndPointLocationProfile.
     * 
     * @param lataId
     */
    public void setLataId(java.lang.String lataId) {
        this.lataId = lataId;
    }


    /**
     * Gets the regionId value for this EndPointLocationProfile.
     * 
     * @return regionId
     */
    public java.lang.String getRegionId() {
        return regionId;
    }


    /**
     * Sets the regionId value for this EndPointLocationProfile.
     * 
     * @param regionId
     */
    public void setRegionId(java.lang.String regionId) {
        this.regionId = regionId;
    }


    /**
     * Gets the dfltCpnPresentation value for this EndPointLocationProfile.
     * 
     * @return dfltCpnPresentation
     */
    public java.lang.Short getDfltCpnPresentation() {
        return dfltCpnPresentation;
    }


    /**
     * Sets the dfltCpnPresentation value for this EndPointLocationProfile.
     * 
     * @param dfltCpnPresentation
     */
    public void setDfltCpnPresentation(java.lang.Short dfltCpnPresentation) {
        this.dfltCpnPresentation = dfltCpnPresentation;
    }


    /**
     * Gets the billingId value for this EndPointLocationProfile.
     * 
     * @return billingId
     */
    public java.lang.String getBillingId() {
        return billingId;
    }


    /**
     * Sets the billingId value for this EndPointLocationProfile.
     * 
     * @param billingId
     */
    public void setBillingId(java.lang.String billingId) {
        this.billingId = billingId;
    }


    /**
     * Gets the billingNoa value for this EndPointLocationProfile.
     * 
     * @return billingNoa
     */
    public java.lang.Short getBillingNoa() {
        return billingNoa;
    }


    /**
     * Sets the billingNoa value for this EndPointLocationProfile.
     * 
     * @param billingNoa
     */
    public void setBillingNoa(java.lang.Short billingNoa) {
        this.billingNoa = billingNoa;
    }


    /**
     * Gets the billingNpi value for this EndPointLocationProfile.
     * 
     * @return billingNpi
     */
    public java.lang.Short getBillingNpi() {
        return billingNpi;
    }


    /**
     * Sets the billingNpi value for this EndPointLocationProfile.
     * 
     * @param billingNpi
     */
    public void setBillingNpi(java.lang.Short billingNpi) {
        this.billingNpi = billingNpi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EndPointLocationProfile)) return false;
        EndPointLocationProfile other = (EndPointLocationProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.endPointLocationProfileId==null && other.getEndPointLocationProfileId()==null) || 
             (this.endPointLocationProfileId!=null &&
              this.endPointLocationProfileId.equals(other.getEndPointLocationProfileId()))) &&
            ((this.jipId==null && other.getJipId()==null) || 
             (this.jipId!=null &&
              this.jipId.equals(other.getJipId()))) &&
            ((this.lataId==null && other.getLataId()==null) || 
             (this.lataId!=null &&
              this.lataId.equals(other.getLataId()))) &&
            ((this.regionId==null && other.getRegionId()==null) || 
             (this.regionId!=null &&
              this.regionId.equals(other.getRegionId()))) &&
            ((this.dfltCpnPresentation==null && other.getDfltCpnPresentation()==null) || 
             (this.dfltCpnPresentation!=null &&
              this.dfltCpnPresentation.equals(other.getDfltCpnPresentation()))) &&
            ((this.billingId==null && other.getBillingId()==null) || 
             (this.billingId!=null &&
              this.billingId.equals(other.getBillingId()))) &&
            ((this.billingNoa==null && other.getBillingNoa()==null) || 
             (this.billingNoa!=null &&
              this.billingNoa.equals(other.getBillingNoa()))) &&
            ((this.billingNpi==null && other.getBillingNpi()==null) || 
             (this.billingNpi!=null &&
              this.billingNpi.equals(other.getBillingNpi())));
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
        if (getEndPointLocationProfileId() != null) {
            _hashCode += getEndPointLocationProfileId().hashCode();
        }
        if (getJipId() != null) {
            _hashCode += getJipId().hashCode();
        }
        if (getLataId() != null) {
            _hashCode += getLataId().hashCode();
        }
        if (getRegionId() != null) {
            _hashCode += getRegionId().hashCode();
        }
        if (getDfltCpnPresentation() != null) {
            _hashCode += getDfltCpnPresentation().hashCode();
        }
        if (getBillingId() != null) {
            _hashCode += getBillingId().hashCode();
        }
        if (getBillingNoa() != null) {
            _hashCode += getBillingNoa().hashCode();
        }
        if (getBillingNpi() != null) {
            _hashCode += getBillingNpi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EndPointLocationProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EndPointLocationProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endPointLocationProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endPointLocationProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jipId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jipId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lataId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lataId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfltCpnPresentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dfltCpnPresentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingNoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingNpi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingNpi"));
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
