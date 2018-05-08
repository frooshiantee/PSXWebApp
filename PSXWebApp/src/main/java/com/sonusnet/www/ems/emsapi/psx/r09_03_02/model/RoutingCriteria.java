/**
 * RoutingCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class RoutingCriteria  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String rcProfileId;

    private java.lang.Integer cpCalltype;

    private java.lang.Short cpPriority;

    private java.lang.Short cpOnOffNet;

    private java.lang.Short cpTollIndication;

    private java.lang.Short serviceCodeUseFlag;

    private java.lang.Short calltypeUseFlag;

    private java.lang.Short destinationUseFlag;

    private java.lang.Short partitionUseFlag;

    public RoutingCriteria() {
    }

    public RoutingCriteria(
           java.lang.String rcProfileId,
           java.lang.Integer cpCalltype,
           java.lang.Short cpPriority,
           java.lang.Short cpOnOffNet,
           java.lang.Short cpTollIndication,
           java.lang.Short serviceCodeUseFlag,
           java.lang.Short calltypeUseFlag,
           java.lang.Short destinationUseFlag,
           java.lang.Short partitionUseFlag) {
        this.rcProfileId = rcProfileId;
        this.cpCalltype = cpCalltype;
        this.cpPriority = cpPriority;
        this.cpOnOffNet = cpOnOffNet;
        this.cpTollIndication = cpTollIndication;
        this.serviceCodeUseFlag = serviceCodeUseFlag;
        this.calltypeUseFlag = calltypeUseFlag;
        this.destinationUseFlag = destinationUseFlag;
        this.partitionUseFlag = partitionUseFlag;
    }


    /**
     * Gets the rcProfileId value for this RoutingCriteria.
     * 
     * @return rcProfileId
     */
    public java.lang.String getRcProfileId() {
        return rcProfileId;
    }


    /**
     * Sets the rcProfileId value for this RoutingCriteria.
     * 
     * @param rcProfileId
     */
    public void setRcProfileId(java.lang.String rcProfileId) {
        this.rcProfileId = rcProfileId;
    }


    /**
     * Gets the cpCalltype value for this RoutingCriteria.
     * 
     * @return cpCalltype
     */
    public java.lang.Integer getCpCalltype() {
        return cpCalltype;
    }


    /**
     * Sets the cpCalltype value for this RoutingCriteria.
     * 
     * @param cpCalltype
     */
    public void setCpCalltype(java.lang.Integer cpCalltype) {
        this.cpCalltype = cpCalltype;
    }


    /**
     * Gets the cpPriority value for this RoutingCriteria.
     * 
     * @return cpPriority
     */
    public java.lang.Short getCpPriority() {
        return cpPriority;
    }


    /**
     * Sets the cpPriority value for this RoutingCriteria.
     * 
     * @param cpPriority
     */
    public void setCpPriority(java.lang.Short cpPriority) {
        this.cpPriority = cpPriority;
    }


    /**
     * Gets the cpOnOffNet value for this RoutingCriteria.
     * 
     * @return cpOnOffNet
     */
    public java.lang.Short getCpOnOffNet() {
        return cpOnOffNet;
    }


    /**
     * Sets the cpOnOffNet value for this RoutingCriteria.
     * 
     * @param cpOnOffNet
     */
    public void setCpOnOffNet(java.lang.Short cpOnOffNet) {
        this.cpOnOffNet = cpOnOffNet;
    }


    /**
     * Gets the cpTollIndication value for this RoutingCriteria.
     * 
     * @return cpTollIndication
     */
    public java.lang.Short getCpTollIndication() {
        return cpTollIndication;
    }


    /**
     * Sets the cpTollIndication value for this RoutingCriteria.
     * 
     * @param cpTollIndication
     */
    public void setCpTollIndication(java.lang.Short cpTollIndication) {
        this.cpTollIndication = cpTollIndication;
    }


    /**
     * Gets the serviceCodeUseFlag value for this RoutingCriteria.
     * 
     * @return serviceCodeUseFlag
     */
    public java.lang.Short getServiceCodeUseFlag() {
        return serviceCodeUseFlag;
    }


    /**
     * Sets the serviceCodeUseFlag value for this RoutingCriteria.
     * 
     * @param serviceCodeUseFlag
     */
    public void setServiceCodeUseFlag(java.lang.Short serviceCodeUseFlag) {
        this.serviceCodeUseFlag = serviceCodeUseFlag;
    }


    /**
     * Gets the calltypeUseFlag value for this RoutingCriteria.
     * 
     * @return calltypeUseFlag
     */
    public java.lang.Short getCalltypeUseFlag() {
        return calltypeUseFlag;
    }


    /**
     * Sets the calltypeUseFlag value for this RoutingCriteria.
     * 
     * @param calltypeUseFlag
     */
    public void setCalltypeUseFlag(java.lang.Short calltypeUseFlag) {
        this.calltypeUseFlag = calltypeUseFlag;
    }


    /**
     * Gets the destinationUseFlag value for this RoutingCriteria.
     * 
     * @return destinationUseFlag
     */
    public java.lang.Short getDestinationUseFlag() {
        return destinationUseFlag;
    }


    /**
     * Sets the destinationUseFlag value for this RoutingCriteria.
     * 
     * @param destinationUseFlag
     */
    public void setDestinationUseFlag(java.lang.Short destinationUseFlag) {
        this.destinationUseFlag = destinationUseFlag;
    }


    /**
     * Gets the partitionUseFlag value for this RoutingCriteria.
     * 
     * @return partitionUseFlag
     */
    public java.lang.Short getPartitionUseFlag() {
        return partitionUseFlag;
    }


    /**
     * Sets the partitionUseFlag value for this RoutingCriteria.
     * 
     * @param partitionUseFlag
     */
    public void setPartitionUseFlag(java.lang.Short partitionUseFlag) {
        this.partitionUseFlag = partitionUseFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutingCriteria)) return false;
        RoutingCriteria other = (RoutingCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rcProfileId==null && other.getRcProfileId()==null) || 
             (this.rcProfileId!=null &&
              this.rcProfileId.equals(other.getRcProfileId()))) &&
            ((this.cpCalltype==null && other.getCpCalltype()==null) || 
             (this.cpCalltype!=null &&
              this.cpCalltype.equals(other.getCpCalltype()))) &&
            ((this.cpPriority==null && other.getCpPriority()==null) || 
             (this.cpPriority!=null &&
              this.cpPriority.equals(other.getCpPriority()))) &&
            ((this.cpOnOffNet==null && other.getCpOnOffNet()==null) || 
             (this.cpOnOffNet!=null &&
              this.cpOnOffNet.equals(other.getCpOnOffNet()))) &&
            ((this.cpTollIndication==null && other.getCpTollIndication()==null) || 
             (this.cpTollIndication!=null &&
              this.cpTollIndication.equals(other.getCpTollIndication()))) &&
            ((this.serviceCodeUseFlag==null && other.getServiceCodeUseFlag()==null) || 
             (this.serviceCodeUseFlag!=null &&
              this.serviceCodeUseFlag.equals(other.getServiceCodeUseFlag()))) &&
            ((this.calltypeUseFlag==null && other.getCalltypeUseFlag()==null) || 
             (this.calltypeUseFlag!=null &&
              this.calltypeUseFlag.equals(other.getCalltypeUseFlag()))) &&
            ((this.destinationUseFlag==null && other.getDestinationUseFlag()==null) || 
             (this.destinationUseFlag!=null &&
              this.destinationUseFlag.equals(other.getDestinationUseFlag()))) &&
            ((this.partitionUseFlag==null && other.getPartitionUseFlag()==null) || 
             (this.partitionUseFlag!=null &&
              this.partitionUseFlag.equals(other.getPartitionUseFlag())));
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
        if (getRcProfileId() != null) {
            _hashCode += getRcProfileId().hashCode();
        }
        if (getCpCalltype() != null) {
            _hashCode += getCpCalltype().hashCode();
        }
        if (getCpPriority() != null) {
            _hashCode += getCpPriority().hashCode();
        }
        if (getCpOnOffNet() != null) {
            _hashCode += getCpOnOffNet().hashCode();
        }
        if (getCpTollIndication() != null) {
            _hashCode += getCpTollIndication().hashCode();
        }
        if (getServiceCodeUseFlag() != null) {
            _hashCode += getServiceCodeUseFlag().hashCode();
        }
        if (getCalltypeUseFlag() != null) {
            _hashCode += getCalltypeUseFlag().hashCode();
        }
        if (getDestinationUseFlag() != null) {
            _hashCode += getDestinationUseFlag().hashCode();
        }
        if (getPartitionUseFlag() != null) {
            _hashCode += getPartitionUseFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutingCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RoutingCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rcProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpCalltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpCalltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpOnOffNet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpOnOffNet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpTollIndication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpTollIndication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCodeUseFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceCodeUseFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calltypeUseFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calltypeUseFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUseFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationUseFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionUseFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionUseFlag"));
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
