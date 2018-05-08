/**
 * Partition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class Partition  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String partitionId;
    private java.lang.String description;
    private java.lang.String ssgId;
    private java.lang.Integer partitionAttributes;
    private java.lang.String pprPartitionId;
    private java.lang.String postTranslationSsgId;

    public Partition() {
    }

    public Partition(
           java.lang.String partitionId,
           java.lang.String description,
           java.lang.String ssgId,
           java.lang.Integer partitionAttributes,
           java.lang.String pprPartitionId,
           java.lang.String postTranslationSsgId) {
           this.partitionId = partitionId;
           this.description = description;
           this.ssgId = ssgId;
           this.partitionAttributes = partitionAttributes;
           this.pprPartitionId = pprPartitionId;
           this.postTranslationSsgId = postTranslationSsgId;
    }


    /**
     * Gets the partitionId value for this Partition.
     * 
     * @return partitionId
     */
    public java.lang.String getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this Partition.
     * 
     * @param partitionId
     */
    public void setPartitionId(java.lang.String partitionId) {
        this.partitionId = partitionId;
    }


    /**
     * Gets the description value for this Partition.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Partition.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the ssgId value for this Partition.
     * 
     * @return ssgId
     */
    public java.lang.String getSsgId() {
        return ssgId;
    }


    /**
     * Sets the ssgId value for this Partition.
     * 
     * @param ssgId
     */
    public void setSsgId(java.lang.String ssgId) {
        this.ssgId = ssgId;
    }


    /**
     * Gets the partitionAttributes value for this Partition.
     * 
     * @return partitionAttributes
     */
    public java.lang.Integer getPartitionAttributes() {
        return partitionAttributes;
    }


    /**
     * Sets the partitionAttributes value for this Partition.
     * 
     * @param partitionAttributes
     */
    public void setPartitionAttributes(java.lang.Integer partitionAttributes) {
        this.partitionAttributes = partitionAttributes;
    }


    /**
     * Gets the pprPartitionId value for this Partition.
     * 
     * @return pprPartitionId
     */
    public java.lang.String getPprPartitionId() {
        return pprPartitionId;
    }


    /**
     * Sets the pprPartitionId value for this Partition.
     * 
     * @param pprPartitionId
     */
    public void setPprPartitionId(java.lang.String pprPartitionId) {
        this.pprPartitionId = pprPartitionId;
    }


    /**
     * Gets the postTranslationSsgId value for this Partition.
     * 
     * @return postTranslationSsgId
     */
    public java.lang.String getPostTranslationSsgId() {
        return postTranslationSsgId;
    }


    /**
     * Sets the postTranslationSsgId value for this Partition.
     * 
     * @param postTranslationSsgId
     */
    public void setPostTranslationSsgId(java.lang.String postTranslationSsgId) {
        this.postTranslationSsgId = postTranslationSsgId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Partition)) return false;
        Partition other = (Partition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.ssgId==null && other.getSsgId()==null) || 
             (this.ssgId!=null &&
              this.ssgId.equals(other.getSsgId()))) &&
            ((this.partitionAttributes==null && other.getPartitionAttributes()==null) || 
             (this.partitionAttributes!=null &&
              this.partitionAttributes.equals(other.getPartitionAttributes()))) &&
            ((this.pprPartitionId==null && other.getPprPartitionId()==null) || 
             (this.pprPartitionId!=null &&
              this.pprPartitionId.equals(other.getPprPartitionId()))) &&
            ((this.postTranslationSsgId==null && other.getPostTranslationSsgId()==null) || 
             (this.postTranslationSsgId!=null &&
              this.postTranslationSsgId.equals(other.getPostTranslationSsgId())));
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
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSsgId() != null) {
            _hashCode += getSsgId().hashCode();
        }
        if (getPartitionAttributes() != null) {
            _hashCode += getPartitionAttributes().hashCode();
        }
        if (getPprPartitionId() != null) {
            _hashCode += getPprPartitionId().hashCode();
        }
        if (getPostTranslationSsgId() != null) {
            _hashCode += getPostTranslationSsgId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Partition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Partition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionId"));
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
        elemField.setFieldName("ssgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pprPartitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pprPartitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postTranslationSsgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postTranslationSsgId"));
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
