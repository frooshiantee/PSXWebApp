/**
 * LcrVendor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class LcrVendor  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String vendorId;

    private java.lang.String vendorName;

    private java.lang.String description;

    private java.lang.String routingLabelId;

    private java.lang.String contactAddress;

    private java.lang.String contactPhone;

    private java.lang.String contactPerson;

    private java.lang.String contactEmail;

    private java.lang.Integer mou;

    private java.lang.Integer mouPriority;

    private java.lang.String directoryPath;

    private java.lang.String templateFile;

    private java.lang.Short resetMou;

    private java.lang.Integer minutesUsed;

    private java.lang.Integer minutesPurchased;

    public LcrVendor() {
    }

    public LcrVendor(
           java.lang.String vendorId,
           java.lang.String vendorName,
           java.lang.String description,
           java.lang.String routingLabelId,
           java.lang.String contactAddress,
           java.lang.String contactPhone,
           java.lang.String contactPerson,
           java.lang.String contactEmail,
           java.lang.Integer mou,
           java.lang.Integer mouPriority,
           java.lang.String directoryPath,
           java.lang.String templateFile,
           java.lang.Short resetMou,
           java.lang.Integer minutesUsed,
           java.lang.Integer minutesPurchased) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.description = description;
        this.routingLabelId = routingLabelId;
        this.contactAddress = contactAddress;
        this.contactPhone = contactPhone;
        this.contactPerson = contactPerson;
        this.contactEmail = contactEmail;
        this.mou = mou;
        this.mouPriority = mouPriority;
        this.directoryPath = directoryPath;
        this.templateFile = templateFile;
        this.resetMou = resetMou;
        this.minutesUsed = minutesUsed;
        this.minutesPurchased = minutesPurchased;
    }


    /**
     * Gets the vendorId value for this LcrVendor.
     * 
     * @return vendorId
     */
    public java.lang.String getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this LcrVendor.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.String vendorId) {
        this.vendorId = vendorId;
    }


    /**
     * Gets the vendorName value for this LcrVendor.
     * 
     * @return vendorName
     */
    public java.lang.String getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this LcrVendor.
     * 
     * @param vendorName
     */
    public void setVendorName(java.lang.String vendorName) {
        this.vendorName = vendorName;
    }


    /**
     * Gets the description value for this LcrVendor.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LcrVendor.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the routingLabelId value for this LcrVendor.
     * 
     * @return routingLabelId
     */
    public java.lang.String getRoutingLabelId() {
        return routingLabelId;
    }


    /**
     * Sets the routingLabelId value for this LcrVendor.
     * 
     * @param routingLabelId
     */
    public void setRoutingLabelId(java.lang.String routingLabelId) {
        this.routingLabelId = routingLabelId;
    }


    /**
     * Gets the contactAddress value for this LcrVendor.
     * 
     * @return contactAddress
     */
    public java.lang.String getContactAddress() {
        return contactAddress;
    }


    /**
     * Sets the contactAddress value for this LcrVendor.
     * 
     * @param contactAddress
     */
    public void setContactAddress(java.lang.String contactAddress) {
        this.contactAddress = contactAddress;
    }


    /**
     * Gets the contactPhone value for this LcrVendor.
     * 
     * @return contactPhone
     */
    public java.lang.String getContactPhone() {
        return contactPhone;
    }


    /**
     * Sets the contactPhone value for this LcrVendor.
     * 
     * @param contactPhone
     */
    public void setContactPhone(java.lang.String contactPhone) {
        this.contactPhone = contactPhone;
    }


    /**
     * Gets the contactPerson value for this LcrVendor.
     * 
     * @return contactPerson
     */
    public java.lang.String getContactPerson() {
        return contactPerson;
    }


    /**
     * Sets the contactPerson value for this LcrVendor.
     * 
     * @param contactPerson
     */
    public void setContactPerson(java.lang.String contactPerson) {
        this.contactPerson = contactPerson;
    }


    /**
     * Gets the contactEmail value for this LcrVendor.
     * 
     * @return contactEmail
     */
    public java.lang.String getContactEmail() {
        return contactEmail;
    }


    /**
     * Sets the contactEmail value for this LcrVendor.
     * 
     * @param contactEmail
     */
    public void setContactEmail(java.lang.String contactEmail) {
        this.contactEmail = contactEmail;
    }


    /**
     * Gets the mou value for this LcrVendor.
     * 
     * @return mou
     */
    public java.lang.Integer getMou() {
        return mou;
    }


    /**
     * Sets the mou value for this LcrVendor.
     * 
     * @param mou
     */
    public void setMou(java.lang.Integer mou) {
        this.mou = mou;
    }


    /**
     * Gets the mouPriority value for this LcrVendor.
     * 
     * @return mouPriority
     */
    public java.lang.Integer getMouPriority() {
        return mouPriority;
    }


    /**
     * Sets the mouPriority value for this LcrVendor.
     * 
     * @param mouPriority
     */
    public void setMouPriority(java.lang.Integer mouPriority) {
        this.mouPriority = mouPriority;
    }


    /**
     * Gets the directoryPath value for this LcrVendor.
     * 
     * @return directoryPath
     */
    public java.lang.String getDirectoryPath() {
        return directoryPath;
    }


    /**
     * Sets the directoryPath value for this LcrVendor.
     * 
     * @param directoryPath
     */
    public void setDirectoryPath(java.lang.String directoryPath) {
        this.directoryPath = directoryPath;
    }


    /**
     * Gets the templateFile value for this LcrVendor.
     * 
     * @return templateFile
     */
    public java.lang.String getTemplateFile() {
        return templateFile;
    }


    /**
     * Sets the templateFile value for this LcrVendor.
     * 
     * @param templateFile
     */
    public void setTemplateFile(java.lang.String templateFile) {
        this.templateFile = templateFile;
    }


    /**
     * Gets the resetMou value for this LcrVendor.
     * 
     * @return resetMou
     */
    public java.lang.Short getResetMou() {
        return resetMou;
    }


    /**
     * Sets the resetMou value for this LcrVendor.
     * 
     * @param resetMou
     */
    public void setResetMou(java.lang.Short resetMou) {
        this.resetMou = resetMou;
    }


    /**
     * Gets the minutesUsed value for this LcrVendor.
     * 
     * @return minutesUsed
     */
    public java.lang.Integer getMinutesUsed() {
        return minutesUsed;
    }


    /**
     * Sets the minutesUsed value for this LcrVendor.
     * 
     * @param minutesUsed
     */
    public void setMinutesUsed(java.lang.Integer minutesUsed) {
        this.minutesUsed = minutesUsed;
    }


    /**
     * Gets the minutesPurchased value for this LcrVendor.
     * 
     * @return minutesPurchased
     */
    public java.lang.Integer getMinutesPurchased() {
        return minutesPurchased;
    }


    /**
     * Sets the minutesPurchased value for this LcrVendor.
     * 
     * @param minutesPurchased
     */
    public void setMinutesPurchased(java.lang.Integer minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LcrVendor)) return false;
        LcrVendor other = (LcrVendor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vendorId==null && other.getVendorId()==null) || 
             (this.vendorId!=null &&
              this.vendorId.equals(other.getVendorId()))) &&
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              this.vendorName.equals(other.getVendorName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.routingLabelId==null && other.getRoutingLabelId()==null) || 
             (this.routingLabelId!=null &&
              this.routingLabelId.equals(other.getRoutingLabelId()))) &&
            ((this.contactAddress==null && other.getContactAddress()==null) || 
             (this.contactAddress!=null &&
              this.contactAddress.equals(other.getContactAddress()))) &&
            ((this.contactPhone==null && other.getContactPhone()==null) || 
             (this.contactPhone!=null &&
              this.contactPhone.equals(other.getContactPhone()))) &&
            ((this.contactPerson==null && other.getContactPerson()==null) || 
             (this.contactPerson!=null &&
              this.contactPerson.equals(other.getContactPerson()))) &&
            ((this.contactEmail==null && other.getContactEmail()==null) || 
             (this.contactEmail!=null &&
              this.contactEmail.equals(other.getContactEmail()))) &&
            ((this.mou==null && other.getMou()==null) || 
             (this.mou!=null &&
              this.mou.equals(other.getMou()))) &&
            ((this.mouPriority==null && other.getMouPriority()==null) || 
             (this.mouPriority!=null &&
              this.mouPriority.equals(other.getMouPriority()))) &&
            ((this.directoryPath==null && other.getDirectoryPath()==null) || 
             (this.directoryPath!=null &&
              this.directoryPath.equals(other.getDirectoryPath()))) &&
            ((this.templateFile==null && other.getTemplateFile()==null) || 
             (this.templateFile!=null &&
              this.templateFile.equals(other.getTemplateFile()))) &&
            ((this.resetMou==null && other.getResetMou()==null) || 
             (this.resetMou!=null &&
              this.resetMou.equals(other.getResetMou()))) &&
            ((this.minutesUsed==null && other.getMinutesUsed()==null) || 
             (this.minutesUsed!=null &&
              this.minutesUsed.equals(other.getMinutesUsed()))) &&
            ((this.minutesPurchased==null && other.getMinutesPurchased()==null) || 
             (this.minutesPurchased!=null &&
              this.minutesPurchased.equals(other.getMinutesPurchased())));
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
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        if (getVendorName() != null) {
            _hashCode += getVendorName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRoutingLabelId() != null) {
            _hashCode += getRoutingLabelId().hashCode();
        }
        if (getContactAddress() != null) {
            _hashCode += getContactAddress().hashCode();
        }
        if (getContactPhone() != null) {
            _hashCode += getContactPhone().hashCode();
        }
        if (getContactPerson() != null) {
            _hashCode += getContactPerson().hashCode();
        }
        if (getContactEmail() != null) {
            _hashCode += getContactEmail().hashCode();
        }
        if (getMou() != null) {
            _hashCode += getMou().hashCode();
        }
        if (getMouPriority() != null) {
            _hashCode += getMouPriority().hashCode();
        }
        if (getDirectoryPath() != null) {
            _hashCode += getDirectoryPath().hashCode();
        }
        if (getTemplateFile() != null) {
            _hashCode += getTemplateFile().hashCode();
        }
        if (getResetMou() != null) {
            _hashCode += getResetMou().hashCode();
        }
        if (getMinutesUsed() != null) {
            _hashCode += getMinutesUsed().hashCode();
        }
        if (getMinutesPurchased() != null) {
            _hashCode += getMinutesPurchased().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LcrVendor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrVendor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorName"));
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
        elemField.setFieldName("routingLabelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingLabelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mou");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mou"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mouPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mouPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directoryPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directoryPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resetMou");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resetMou"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minutesUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutesPurchased");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minutesPurchased"));
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
