/**
 * ServiceExceptionProfileData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class ServiceExceptionProfileData  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String exceptionProfileId;
    private java.lang.Integer entityServiceType;
    private java.lang.Integer cosServiceType;
    private java.lang.Integer calltype;
    private java.lang.Integer userCalltype;
    private java.lang.Integer subCalltype;
    private java.lang.Integer userSubCalltype;
    private java.lang.Integer tollIndication;
    private java.lang.String callingNationalId;
    private java.lang.String callingCountryId;
    private java.lang.String destinationNationalId;
    private java.lang.String destinationCountryId;

    public ServiceExceptionProfileData() {
    }

    public ServiceExceptionProfileData(
           java.lang.String exceptionProfileId,
           java.lang.Integer entityServiceType,
           java.lang.Integer cosServiceType,
           java.lang.Integer calltype,
           java.lang.Integer userCalltype,
           java.lang.Integer subCalltype,
           java.lang.Integer userSubCalltype,
           java.lang.Integer tollIndication,
           java.lang.String callingNationalId,
           java.lang.String callingCountryId,
           java.lang.String destinationNationalId,
           java.lang.String destinationCountryId) {
           this.exceptionProfileId = exceptionProfileId;
           this.entityServiceType = entityServiceType;
           this.cosServiceType = cosServiceType;
           this.calltype = calltype;
           this.userCalltype = userCalltype;
           this.subCalltype = subCalltype;
           this.userSubCalltype = userSubCalltype;
           this.tollIndication = tollIndication;
           this.callingNationalId = callingNationalId;
           this.callingCountryId = callingCountryId;
           this.destinationNationalId = destinationNationalId;
           this.destinationCountryId = destinationCountryId;
    }


    /**
     * Gets the exceptionProfileId value for this ServiceExceptionProfileData.
     * 
     * @return exceptionProfileId
     */
    public java.lang.String getExceptionProfileId() {
        return exceptionProfileId;
    }


    /**
     * Sets the exceptionProfileId value for this ServiceExceptionProfileData.
     * 
     * @param exceptionProfileId
     */
    public void setExceptionProfileId(java.lang.String exceptionProfileId) {
        this.exceptionProfileId = exceptionProfileId;
    }


    /**
     * Gets the entityServiceType value for this ServiceExceptionProfileData.
     * 
     * @return entityServiceType
     */
    public java.lang.Integer getEntityServiceType() {
        return entityServiceType;
    }


    /**
     * Sets the entityServiceType value for this ServiceExceptionProfileData.
     * 
     * @param entityServiceType
     */
    public void setEntityServiceType(java.lang.Integer entityServiceType) {
        this.entityServiceType = entityServiceType;
    }


    /**
     * Gets the cosServiceType value for this ServiceExceptionProfileData.
     * 
     * @return cosServiceType
     */
    public java.lang.Integer getCosServiceType() {
        return cosServiceType;
    }


    /**
     * Sets the cosServiceType value for this ServiceExceptionProfileData.
     * 
     * @param cosServiceType
     */
    public void setCosServiceType(java.lang.Integer cosServiceType) {
        this.cosServiceType = cosServiceType;
    }


    /**
     * Gets the calltype value for this ServiceExceptionProfileData.
     * 
     * @return calltype
     */
    public java.lang.Integer getCalltype() {
        return calltype;
    }


    /**
     * Sets the calltype value for this ServiceExceptionProfileData.
     * 
     * @param calltype
     */
    public void setCalltype(java.lang.Integer calltype) {
        this.calltype = calltype;
    }


    /**
     * Gets the userCalltype value for this ServiceExceptionProfileData.
     * 
     * @return userCalltype
     */
    public java.lang.Integer getUserCalltype() {
        return userCalltype;
    }


    /**
     * Sets the userCalltype value for this ServiceExceptionProfileData.
     * 
     * @param userCalltype
     */
    public void setUserCalltype(java.lang.Integer userCalltype) {
        this.userCalltype = userCalltype;
    }


    /**
     * Gets the subCalltype value for this ServiceExceptionProfileData.
     * 
     * @return subCalltype
     */
    public java.lang.Integer getSubCalltype() {
        return subCalltype;
    }


    /**
     * Sets the subCalltype value for this ServiceExceptionProfileData.
     * 
     * @param subCalltype
     */
    public void setSubCalltype(java.lang.Integer subCalltype) {
        this.subCalltype = subCalltype;
    }


    /**
     * Gets the userSubCalltype value for this ServiceExceptionProfileData.
     * 
     * @return userSubCalltype
     */
    public java.lang.Integer getUserSubCalltype() {
        return userSubCalltype;
    }


    /**
     * Sets the userSubCalltype value for this ServiceExceptionProfileData.
     * 
     * @param userSubCalltype
     */
    public void setUserSubCalltype(java.lang.Integer userSubCalltype) {
        this.userSubCalltype = userSubCalltype;
    }


    /**
     * Gets the tollIndication value for this ServiceExceptionProfileData.
     * 
     * @return tollIndication
     */
    public java.lang.Integer getTollIndication() {
        return tollIndication;
    }


    /**
     * Sets the tollIndication value for this ServiceExceptionProfileData.
     * 
     * @param tollIndication
     */
    public void setTollIndication(java.lang.Integer tollIndication) {
        this.tollIndication = tollIndication;
    }


    /**
     * Gets the callingNationalId value for this ServiceExceptionProfileData.
     * 
     * @return callingNationalId
     */
    public java.lang.String getCallingNationalId() {
        return callingNationalId;
    }


    /**
     * Sets the callingNationalId value for this ServiceExceptionProfileData.
     * 
     * @param callingNationalId
     */
    public void setCallingNationalId(java.lang.String callingNationalId) {
        this.callingNationalId = callingNationalId;
    }


    /**
     * Gets the callingCountryId value for this ServiceExceptionProfileData.
     * 
     * @return callingCountryId
     */
    public java.lang.String getCallingCountryId() {
        return callingCountryId;
    }


    /**
     * Sets the callingCountryId value for this ServiceExceptionProfileData.
     * 
     * @param callingCountryId
     */
    public void setCallingCountryId(java.lang.String callingCountryId) {
        this.callingCountryId = callingCountryId;
    }


    /**
     * Gets the destinationNationalId value for this ServiceExceptionProfileData.
     * 
     * @return destinationNationalId
     */
    public java.lang.String getDestinationNationalId() {
        return destinationNationalId;
    }


    /**
     * Sets the destinationNationalId value for this ServiceExceptionProfileData.
     * 
     * @param destinationNationalId
     */
    public void setDestinationNationalId(java.lang.String destinationNationalId) {
        this.destinationNationalId = destinationNationalId;
    }


    /**
     * Gets the destinationCountryId value for this ServiceExceptionProfileData.
     * 
     * @return destinationCountryId
     */
    public java.lang.String getDestinationCountryId() {
        return destinationCountryId;
    }


    /**
     * Sets the destinationCountryId value for this ServiceExceptionProfileData.
     * 
     * @param destinationCountryId
     */
    public void setDestinationCountryId(java.lang.String destinationCountryId) {
        this.destinationCountryId = destinationCountryId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceExceptionProfileData)) return false;
        ServiceExceptionProfileData other = (ServiceExceptionProfileData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.exceptionProfileId==null && other.getExceptionProfileId()==null) || 
             (this.exceptionProfileId!=null &&
              this.exceptionProfileId.equals(other.getExceptionProfileId()))) &&
            ((this.entityServiceType==null && other.getEntityServiceType()==null) || 
             (this.entityServiceType!=null &&
              this.entityServiceType.equals(other.getEntityServiceType()))) &&
            ((this.cosServiceType==null && other.getCosServiceType()==null) || 
             (this.cosServiceType!=null &&
              this.cosServiceType.equals(other.getCosServiceType()))) &&
            ((this.calltype==null && other.getCalltype()==null) || 
             (this.calltype!=null &&
              this.calltype.equals(other.getCalltype()))) &&
            ((this.userCalltype==null && other.getUserCalltype()==null) || 
             (this.userCalltype!=null &&
              this.userCalltype.equals(other.getUserCalltype()))) &&
            ((this.subCalltype==null && other.getSubCalltype()==null) || 
             (this.subCalltype!=null &&
              this.subCalltype.equals(other.getSubCalltype()))) &&
            ((this.userSubCalltype==null && other.getUserSubCalltype()==null) || 
             (this.userSubCalltype!=null &&
              this.userSubCalltype.equals(other.getUserSubCalltype()))) &&
            ((this.tollIndication==null && other.getTollIndication()==null) || 
             (this.tollIndication!=null &&
              this.tollIndication.equals(other.getTollIndication()))) &&
            ((this.callingNationalId==null && other.getCallingNationalId()==null) || 
             (this.callingNationalId!=null &&
              this.callingNationalId.equals(other.getCallingNationalId()))) &&
            ((this.callingCountryId==null && other.getCallingCountryId()==null) || 
             (this.callingCountryId!=null &&
              this.callingCountryId.equals(other.getCallingCountryId()))) &&
            ((this.destinationNationalId==null && other.getDestinationNationalId()==null) || 
             (this.destinationNationalId!=null &&
              this.destinationNationalId.equals(other.getDestinationNationalId()))) &&
            ((this.destinationCountryId==null && other.getDestinationCountryId()==null) || 
             (this.destinationCountryId!=null &&
              this.destinationCountryId.equals(other.getDestinationCountryId())));
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
        if (getExceptionProfileId() != null) {
            _hashCode += getExceptionProfileId().hashCode();
        }
        if (getEntityServiceType() != null) {
            _hashCode += getEntityServiceType().hashCode();
        }
        if (getCosServiceType() != null) {
            _hashCode += getCosServiceType().hashCode();
        }
        if (getCalltype() != null) {
            _hashCode += getCalltype().hashCode();
        }
        if (getUserCalltype() != null) {
            _hashCode += getUserCalltype().hashCode();
        }
        if (getSubCalltype() != null) {
            _hashCode += getSubCalltype().hashCode();
        }
        if (getUserSubCalltype() != null) {
            _hashCode += getUserSubCalltype().hashCode();
        }
        if (getTollIndication() != null) {
            _hashCode += getTollIndication().hashCode();
        }
        if (getCallingNationalId() != null) {
            _hashCode += getCallingNationalId().hashCode();
        }
        if (getCallingCountryId() != null) {
            _hashCode += getCallingCountryId().hashCode();
        }
        if (getDestinationNationalId() != null) {
            _hashCode += getDestinationNationalId().hashCode();
        }
        if (getDestinationCountryId() != null) {
            _hashCode += getDestinationCountryId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceExceptionProfileData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceExceptionProfileData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptionProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityServiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cosServiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cosServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCalltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCalltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCalltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subCalltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSubCalltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userSubCalltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tollIndication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tollIndication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingCountryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingCountryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationNationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationNationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationCountryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationCountryId"));
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
