/**
 * RouteRangeProfileDataSplit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class RouteRangeProfileDataSplit  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String rangeProfileId;
    private java.lang.Integer subrangeNumber;
    private java.lang.String fromNumber;
    private java.lang.String toNumber;
    private java.lang.String splitFirstFromNumber;
    private java.lang.String splitFirstToNumber;
    private java.lang.String splitNextFromNumber;
    private java.lang.String splitNextToNumber;

    public RouteRangeProfileDataSplit() {
    }

    public RouteRangeProfileDataSplit(
           java.lang.String rangeProfileId,
           java.lang.Integer subrangeNumber,
           java.lang.String fromNumber,
           java.lang.String toNumber,
           java.lang.String splitFirstFromNumber,
           java.lang.String splitFirstToNumber,
           java.lang.String splitNextFromNumber,
           java.lang.String splitNextToNumber) {
           this.rangeProfileId = rangeProfileId;
           this.subrangeNumber = subrangeNumber;
           this.fromNumber = fromNumber;
           this.toNumber = toNumber;
           this.splitFirstFromNumber = splitFirstFromNumber;
           this.splitFirstToNumber = splitFirstToNumber;
           this.splitNextFromNumber = splitNextFromNumber;
           this.splitNextToNumber = splitNextToNumber;
    }


    /**
     * Gets the rangeProfileId value for this RouteRangeProfileDataSplit.
     * 
     * @return rangeProfileId
     */
    public java.lang.String getRangeProfileId() {
        return rangeProfileId;
    }


    /**
     * Sets the rangeProfileId value for this RouteRangeProfileDataSplit.
     * 
     * @param rangeProfileId
     */
    public void setRangeProfileId(java.lang.String rangeProfileId) {
        this.rangeProfileId = rangeProfileId;
    }


    /**
     * Gets the subrangeNumber value for this RouteRangeProfileDataSplit.
     * 
     * @return subrangeNumber
     */
    public java.lang.Integer getSubrangeNumber() {
        return subrangeNumber;
    }


    /**
     * Sets the subrangeNumber value for this RouteRangeProfileDataSplit.
     * 
     * @param subrangeNumber
     */
    public void setSubrangeNumber(java.lang.Integer subrangeNumber) {
        this.subrangeNumber = subrangeNumber;
    }


    /**
     * Gets the fromNumber value for this RouteRangeProfileDataSplit.
     * 
     * @return fromNumber
     */
    public java.lang.String getFromNumber() {
        return fromNumber;
    }


    /**
     * Sets the fromNumber value for this RouteRangeProfileDataSplit.
     * 
     * @param fromNumber
     */
    public void setFromNumber(java.lang.String fromNumber) {
        this.fromNumber = fromNumber;
    }


    /**
     * Gets the toNumber value for this RouteRangeProfileDataSplit.
     * 
     * @return toNumber
     */
    public java.lang.String getToNumber() {
        return toNumber;
    }


    /**
     * Sets the toNumber value for this RouteRangeProfileDataSplit.
     * 
     * @param toNumber
     */
    public void setToNumber(java.lang.String toNumber) {
        this.toNumber = toNumber;
    }


    /**
     * Gets the splitFirstFromNumber value for this RouteRangeProfileDataSplit.
     * 
     * @return splitFirstFromNumber
     */
    public java.lang.String getSplitFirstFromNumber() {
        return splitFirstFromNumber;
    }


    /**
     * Sets the splitFirstFromNumber value for this RouteRangeProfileDataSplit.
     * 
     * @param splitFirstFromNumber
     */
    public void setSplitFirstFromNumber(java.lang.String splitFirstFromNumber) {
        this.splitFirstFromNumber = splitFirstFromNumber;
    }


    /**
     * Gets the splitFirstToNumber value for this RouteRangeProfileDataSplit.
     * 
     * @return splitFirstToNumber
     */
    public java.lang.String getSplitFirstToNumber() {
        return splitFirstToNumber;
    }


    /**
     * Sets the splitFirstToNumber value for this RouteRangeProfileDataSplit.
     * 
     * @param splitFirstToNumber
     */
    public void setSplitFirstToNumber(java.lang.String splitFirstToNumber) {
        this.splitFirstToNumber = splitFirstToNumber;
    }


    /**
     * Gets the splitNextFromNumber value for this RouteRangeProfileDataSplit.
     * 
     * @return splitNextFromNumber
     */
    public java.lang.String getSplitNextFromNumber() {
        return splitNextFromNumber;
    }


    /**
     * Sets the splitNextFromNumber value for this RouteRangeProfileDataSplit.
     * 
     * @param splitNextFromNumber
     */
    public void setSplitNextFromNumber(java.lang.String splitNextFromNumber) {
        this.splitNextFromNumber = splitNextFromNumber;
    }


    /**
     * Gets the splitNextToNumber value for this RouteRangeProfileDataSplit.
     * 
     * @return splitNextToNumber
     */
    public java.lang.String getSplitNextToNumber() {
        return splitNextToNumber;
    }


    /**
     * Sets the splitNextToNumber value for this RouteRangeProfileDataSplit.
     * 
     * @param splitNextToNumber
     */
    public void setSplitNextToNumber(java.lang.String splitNextToNumber) {
        this.splitNextToNumber = splitNextToNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteRangeProfileDataSplit)) return false;
        RouteRangeProfileDataSplit other = (RouteRangeProfileDataSplit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rangeProfileId==null && other.getRangeProfileId()==null) || 
             (this.rangeProfileId!=null &&
              this.rangeProfileId.equals(other.getRangeProfileId()))) &&
            ((this.subrangeNumber==null && other.getSubrangeNumber()==null) || 
             (this.subrangeNumber!=null &&
              this.subrangeNumber.equals(other.getSubrangeNumber()))) &&
            ((this.fromNumber==null && other.getFromNumber()==null) || 
             (this.fromNumber!=null &&
              this.fromNumber.equals(other.getFromNumber()))) &&
            ((this.toNumber==null && other.getToNumber()==null) || 
             (this.toNumber!=null &&
              this.toNumber.equals(other.getToNumber()))) &&
            ((this.splitFirstFromNumber==null && other.getSplitFirstFromNumber()==null) || 
             (this.splitFirstFromNumber!=null &&
              this.splitFirstFromNumber.equals(other.getSplitFirstFromNumber()))) &&
            ((this.splitFirstToNumber==null && other.getSplitFirstToNumber()==null) || 
             (this.splitFirstToNumber!=null &&
              this.splitFirstToNumber.equals(other.getSplitFirstToNumber()))) &&
            ((this.splitNextFromNumber==null && other.getSplitNextFromNumber()==null) || 
             (this.splitNextFromNumber!=null &&
              this.splitNextFromNumber.equals(other.getSplitNextFromNumber()))) &&
            ((this.splitNextToNumber==null && other.getSplitNextToNumber()==null) || 
             (this.splitNextToNumber!=null &&
              this.splitNextToNumber.equals(other.getSplitNextToNumber())));
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
        if (getRangeProfileId() != null) {
            _hashCode += getRangeProfileId().hashCode();
        }
        if (getSubrangeNumber() != null) {
            _hashCode += getSubrangeNumber().hashCode();
        }
        if (getFromNumber() != null) {
            _hashCode += getFromNumber().hashCode();
        }
        if (getToNumber() != null) {
            _hashCode += getToNumber().hashCode();
        }
        if (getSplitFirstFromNumber() != null) {
            _hashCode += getSplitFirstFromNumber().hashCode();
        }
        if (getSplitFirstToNumber() != null) {
            _hashCode += getSplitFirstToNumber().hashCode();
        }
        if (getSplitNextFromNumber() != null) {
            _hashCode += getSplitNextFromNumber().hashCode();
        }
        if (getSplitNextToNumber() != null) {
            _hashCode += getSplitNextToNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteRangeProfileDataSplit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteRangeProfileDataSplit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangeProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subrangeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subrangeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitFirstFromNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "splitFirstFromNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitFirstToNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "splitFirstToNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitNextFromNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "splitNextFromNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitNextToNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "splitNextToNumber"));
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
