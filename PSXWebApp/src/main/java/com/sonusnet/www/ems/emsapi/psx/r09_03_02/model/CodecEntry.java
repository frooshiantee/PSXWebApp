/**
 * CodecEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class CodecEntry  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String codecEntryId;

    private java.lang.Short codec;

    private java.lang.Short packetSize;

    private java.lang.Integer attributes;

    private java.lang.Integer attributes2;

    private java.lang.Integer attributes3;

    private java.lang.Short prfdRtpPayloadType;

    private java.lang.Short dtmfDurationValue;

    private java.lang.Integer maxAverageBitRate;

    public CodecEntry() {
    }

    public CodecEntry(
           java.lang.String codecEntryId,
           java.lang.Short codec,
           java.lang.Short packetSize,
           java.lang.Integer attributes,
           java.lang.Integer attributes2,
           java.lang.Integer attributes3,
           java.lang.Short prfdRtpPayloadType,
           java.lang.Short dtmfDurationValue,
           java.lang.Integer maxAverageBitRate) {
        this.codecEntryId = codecEntryId;
        this.codec = codec;
        this.packetSize = packetSize;
        this.attributes = attributes;
        this.attributes2 = attributes2;
        this.attributes3 = attributes3;
        this.prfdRtpPayloadType = prfdRtpPayloadType;
        this.dtmfDurationValue = dtmfDurationValue;
        this.maxAverageBitRate = maxAverageBitRate;
    }


    /**
     * Gets the codecEntryId value for this CodecEntry.
     * 
     * @return codecEntryId
     */
    public java.lang.String getCodecEntryId() {
        return codecEntryId;
    }


    /**
     * Sets the codecEntryId value for this CodecEntry.
     * 
     * @param codecEntryId
     */
    public void setCodecEntryId(java.lang.String codecEntryId) {
        this.codecEntryId = codecEntryId;
    }


    /**
     * Gets the codec value for this CodecEntry.
     * 
     * @return codec
     */
    public java.lang.Short getCodec() {
        return codec;
    }


    /**
     * Sets the codec value for this CodecEntry.
     * 
     * @param codec
     */
    public void setCodec(java.lang.Short codec) {
        this.codec = codec;
    }


    /**
     * Gets the packetSize value for this CodecEntry.
     * 
     * @return packetSize
     */
    public java.lang.Short getPacketSize() {
        return packetSize;
    }


    /**
     * Sets the packetSize value for this CodecEntry.
     * 
     * @param packetSize
     */
    public void setPacketSize(java.lang.Short packetSize) {
        this.packetSize = packetSize;
    }


    /**
     * Gets the attributes value for this CodecEntry.
     * 
     * @return attributes
     */
    public java.lang.Integer getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this CodecEntry.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Integer attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the attributes2 value for this CodecEntry.
     * 
     * @return attributes2
     */
    public java.lang.Integer getAttributes2() {
        return attributes2;
    }


    /**
     * Sets the attributes2 value for this CodecEntry.
     * 
     * @param attributes2
     */
    public void setAttributes2(java.lang.Integer attributes2) {
        this.attributes2 = attributes2;
    }


    /**
     * Gets the attributes3 value for this CodecEntry.
     * 
     * @return attributes3
     */
    public java.lang.Integer getAttributes3() {
        return attributes3;
    }


    /**
     * Sets the attributes3 value for this CodecEntry.
     * 
     * @param attributes3
     */
    public void setAttributes3(java.lang.Integer attributes3) {
        this.attributes3 = attributes3;
    }


    /**
     * Gets the prfdRtpPayloadType value for this CodecEntry.
     * 
     * @return prfdRtpPayloadType
     */
    public java.lang.Short getPrfdRtpPayloadType() {
        return prfdRtpPayloadType;
    }


    /**
     * Sets the prfdRtpPayloadType value for this CodecEntry.
     * 
     * @param prfdRtpPayloadType
     */
    public void setPrfdRtpPayloadType(java.lang.Short prfdRtpPayloadType) {
        this.prfdRtpPayloadType = prfdRtpPayloadType;
    }


    /**
     * Gets the dtmfDurationValue value for this CodecEntry.
     * 
     * @return dtmfDurationValue
     */
    public java.lang.Short getDtmfDurationValue() {
        return dtmfDurationValue;
    }


    /**
     * Sets the dtmfDurationValue value for this CodecEntry.
     * 
     * @param dtmfDurationValue
     */
    public void setDtmfDurationValue(java.lang.Short dtmfDurationValue) {
        this.dtmfDurationValue = dtmfDurationValue;
    }


    /**
     * Gets the maxAverageBitRate value for this CodecEntry.
     * 
     * @return maxAverageBitRate
     */
    public java.lang.Integer getMaxAverageBitRate() {
        return maxAverageBitRate;
    }


    /**
     * Sets the maxAverageBitRate value for this CodecEntry.
     * 
     * @param maxAverageBitRate
     */
    public void setMaxAverageBitRate(java.lang.Integer maxAverageBitRate) {
        this.maxAverageBitRate = maxAverageBitRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodecEntry)) return false;
        CodecEntry other = (CodecEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codecEntryId==null && other.getCodecEntryId()==null) || 
             (this.codecEntryId!=null &&
              this.codecEntryId.equals(other.getCodecEntryId()))) &&
            ((this.codec==null && other.getCodec()==null) || 
             (this.codec!=null &&
              this.codec.equals(other.getCodec()))) &&
            ((this.packetSize==null && other.getPacketSize()==null) || 
             (this.packetSize!=null &&
              this.packetSize.equals(other.getPacketSize()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.attributes2==null && other.getAttributes2()==null) || 
             (this.attributes2!=null &&
              this.attributes2.equals(other.getAttributes2()))) &&
            ((this.attributes3==null && other.getAttributes3()==null) || 
             (this.attributes3!=null &&
              this.attributes3.equals(other.getAttributes3()))) &&
            ((this.prfdRtpPayloadType==null && other.getPrfdRtpPayloadType()==null) || 
             (this.prfdRtpPayloadType!=null &&
              this.prfdRtpPayloadType.equals(other.getPrfdRtpPayloadType()))) &&
            ((this.dtmfDurationValue==null && other.getDtmfDurationValue()==null) || 
             (this.dtmfDurationValue!=null &&
              this.dtmfDurationValue.equals(other.getDtmfDurationValue()))) &&
            ((this.maxAverageBitRate==null && other.getMaxAverageBitRate()==null) || 
             (this.maxAverageBitRate!=null &&
              this.maxAverageBitRate.equals(other.getMaxAverageBitRate())));
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
        if (getCodecEntryId() != null) {
            _hashCode += getCodecEntryId().hashCode();
        }
        if (getCodec() != null) {
            _hashCode += getCodec().hashCode();
        }
        if (getPacketSize() != null) {
            _hashCode += getPacketSize().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getAttributes2() != null) {
            _hashCode += getAttributes2().hashCode();
        }
        if (getAttributes3() != null) {
            _hashCode += getAttributes3().hashCode();
        }
        if (getPrfdRtpPayloadType() != null) {
            _hashCode += getPrfdRtpPayloadType().hashCode();
        }
        if (getDtmfDurationValue() != null) {
            _hashCode += getDtmfDurationValue().hashCode();
        }
        if (getMaxAverageBitRate() != null) {
            _hashCode += getMaxAverageBitRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodecEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CodecEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecEntryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codecEntryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prfdRtpPayloadType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prfdRtpPayloadType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtmfDurationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtmfDurationValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAverageBitRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAverageBitRate"));
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
