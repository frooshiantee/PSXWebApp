/**
 * PprProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class PprProfile  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String pprProfileId;

    private java.lang.String defaultPartitionId;

    private java.lang.Integer startLocation;

    private java.lang.Integer totalDigits;

    private java.lang.Integer partitionOffset;

    private java.lang.Integer partitionLength;

    private java.lang.Integer minLength;

    private java.lang.String prefixDigits;

    private java.lang.String suffixDigits;

    private java.lang.Integer attributes1;

    private java.lang.Integer attributes2;

    public PprProfile() {
    }

    public PprProfile(
           java.lang.String pprProfileId,
           java.lang.String defaultPartitionId,
           java.lang.Integer startLocation,
           java.lang.Integer totalDigits,
           java.lang.Integer partitionOffset,
           java.lang.Integer partitionLength,
           java.lang.Integer minLength,
           java.lang.String prefixDigits,
           java.lang.String suffixDigits,
           java.lang.Integer attributes1,
           java.lang.Integer attributes2) {
        this.pprProfileId = pprProfileId;
        this.defaultPartitionId = defaultPartitionId;
        this.startLocation = startLocation;
        this.totalDigits = totalDigits;
        this.partitionOffset = partitionOffset;
        this.partitionLength = partitionLength;
        this.minLength = minLength;
        this.prefixDigits = prefixDigits;
        this.suffixDigits = suffixDigits;
        this.attributes1 = attributes1;
        this.attributes2 = attributes2;
    }


    /**
     * Gets the pprProfileId value for this PprProfile.
     * 
     * @return pprProfileId
     */
    public java.lang.String getPprProfileId() {
        return pprProfileId;
    }


    /**
     * Sets the pprProfileId value for this PprProfile.
     * 
     * @param pprProfileId
     */
    public void setPprProfileId(java.lang.String pprProfileId) {
        this.pprProfileId = pprProfileId;
    }


    /**
     * Gets the defaultPartitionId value for this PprProfile.
     * 
     * @return defaultPartitionId
     */
    public java.lang.String getDefaultPartitionId() {
        return defaultPartitionId;
    }


    /**
     * Sets the defaultPartitionId value for this PprProfile.
     * 
     * @param defaultPartitionId
     */
    public void setDefaultPartitionId(java.lang.String defaultPartitionId) {
        this.defaultPartitionId = defaultPartitionId;
    }


    /**
     * Gets the startLocation value for this PprProfile.
     * 
     * @return startLocation
     */
    public java.lang.Integer getStartLocation() {
        return startLocation;
    }


    /**
     * Sets the startLocation value for this PprProfile.
     * 
     * @param startLocation
     */
    public void setStartLocation(java.lang.Integer startLocation) {
        this.startLocation = startLocation;
    }


    /**
     * Gets the totalDigits value for this PprProfile.
     * 
     * @return totalDigits
     */
    public java.lang.Integer getTotalDigits() {
        return totalDigits;
    }


    /**
     * Sets the totalDigits value for this PprProfile.
     * 
     * @param totalDigits
     */
    public void setTotalDigits(java.lang.Integer totalDigits) {
        this.totalDigits = totalDigits;
    }


    /**
     * Gets the partitionOffset value for this PprProfile.
     * 
     * @return partitionOffset
     */
    public java.lang.Integer getPartitionOffset() {
        return partitionOffset;
    }


    /**
     * Sets the partitionOffset value for this PprProfile.
     * 
     * @param partitionOffset
     */
    public void setPartitionOffset(java.lang.Integer partitionOffset) {
        this.partitionOffset = partitionOffset;
    }


    /**
     * Gets the partitionLength value for this PprProfile.
     * 
     * @return partitionLength
     */
    public java.lang.Integer getPartitionLength() {
        return partitionLength;
    }


    /**
     * Sets the partitionLength value for this PprProfile.
     * 
     * @param partitionLength
     */
    public void setPartitionLength(java.lang.Integer partitionLength) {
        this.partitionLength = partitionLength;
    }


    /**
     * Gets the minLength value for this PprProfile.
     * 
     * @return minLength
     */
    public java.lang.Integer getMinLength() {
        return minLength;
    }


    /**
     * Sets the minLength value for this PprProfile.
     * 
     * @param minLength
     */
    public void setMinLength(java.lang.Integer minLength) {
        this.minLength = minLength;
    }


    /**
     * Gets the prefixDigits value for this PprProfile.
     * 
     * @return prefixDigits
     */
    public java.lang.String getPrefixDigits() {
        return prefixDigits;
    }


    /**
     * Sets the prefixDigits value for this PprProfile.
     * 
     * @param prefixDigits
     */
    public void setPrefixDigits(java.lang.String prefixDigits) {
        this.prefixDigits = prefixDigits;
    }


    /**
     * Gets the suffixDigits value for this PprProfile.
     * 
     * @return suffixDigits
     */
    public java.lang.String getSuffixDigits() {
        return suffixDigits;
    }


    /**
     * Sets the suffixDigits value for this PprProfile.
     * 
     * @param suffixDigits
     */
    public void setSuffixDigits(java.lang.String suffixDigits) {
        this.suffixDigits = suffixDigits;
    }


    /**
     * Gets the attributes1 value for this PprProfile.
     * 
     * @return attributes1
     */
    public java.lang.Integer getAttributes1() {
        return attributes1;
    }


    /**
     * Sets the attributes1 value for this PprProfile.
     * 
     * @param attributes1
     */
    public void setAttributes1(java.lang.Integer attributes1) {
        this.attributes1 = attributes1;
    }


    /**
     * Gets the attributes2 value for this PprProfile.
     * 
     * @return attributes2
     */
    public java.lang.Integer getAttributes2() {
        return attributes2;
    }


    /**
     * Sets the attributes2 value for this PprProfile.
     * 
     * @param attributes2
     */
    public void setAttributes2(java.lang.Integer attributes2) {
        this.attributes2 = attributes2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PprProfile)) return false;
        PprProfile other = (PprProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pprProfileId==null && other.getPprProfileId()==null) || 
             (this.pprProfileId!=null &&
              this.pprProfileId.equals(other.getPprProfileId()))) &&
            ((this.defaultPartitionId==null && other.getDefaultPartitionId()==null) || 
             (this.defaultPartitionId!=null &&
              this.defaultPartitionId.equals(other.getDefaultPartitionId()))) &&
            ((this.startLocation==null && other.getStartLocation()==null) || 
             (this.startLocation!=null &&
              this.startLocation.equals(other.getStartLocation()))) &&
            ((this.totalDigits==null && other.getTotalDigits()==null) || 
             (this.totalDigits!=null &&
              this.totalDigits.equals(other.getTotalDigits()))) &&
            ((this.partitionOffset==null && other.getPartitionOffset()==null) || 
             (this.partitionOffset!=null &&
              this.partitionOffset.equals(other.getPartitionOffset()))) &&
            ((this.partitionLength==null && other.getPartitionLength()==null) || 
             (this.partitionLength!=null &&
              this.partitionLength.equals(other.getPartitionLength()))) &&
            ((this.minLength==null && other.getMinLength()==null) || 
             (this.minLength!=null &&
              this.minLength.equals(other.getMinLength()))) &&
            ((this.prefixDigits==null && other.getPrefixDigits()==null) || 
             (this.prefixDigits!=null &&
              this.prefixDigits.equals(other.getPrefixDigits()))) &&
            ((this.suffixDigits==null && other.getSuffixDigits()==null) || 
             (this.suffixDigits!=null &&
              this.suffixDigits.equals(other.getSuffixDigits()))) &&
            ((this.attributes1==null && other.getAttributes1()==null) || 
             (this.attributes1!=null &&
              this.attributes1.equals(other.getAttributes1()))) &&
            ((this.attributes2==null && other.getAttributes2()==null) || 
             (this.attributes2!=null &&
              this.attributes2.equals(other.getAttributes2())));
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
        if (getPprProfileId() != null) {
            _hashCode += getPprProfileId().hashCode();
        }
        if (getDefaultPartitionId() != null) {
            _hashCode += getDefaultPartitionId().hashCode();
        }
        if (getStartLocation() != null) {
            _hashCode += getStartLocation().hashCode();
        }
        if (getTotalDigits() != null) {
            _hashCode += getTotalDigits().hashCode();
        }
        if (getPartitionOffset() != null) {
            _hashCode += getPartitionOffset().hashCode();
        }
        if (getPartitionLength() != null) {
            _hashCode += getPartitionLength().hashCode();
        }
        if (getMinLength() != null) {
            _hashCode += getMinLength().hashCode();
        }
        if (getPrefixDigits() != null) {
            _hashCode += getPrefixDigits().hashCode();
        }
        if (getSuffixDigits() != null) {
            _hashCode += getSuffixDigits().hashCode();
        }
        if (getAttributes1() != null) {
            _hashCode += getAttributes1().hashCode();
        }
        if (getAttributes2() != null) {
            _hashCode += getAttributes2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PprProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PprProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pprProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pprProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPartitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultPartitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffixDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suffixDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes2"));
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
