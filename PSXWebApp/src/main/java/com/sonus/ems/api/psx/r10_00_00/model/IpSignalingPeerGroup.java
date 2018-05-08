/**
 * IpSignalingPeerGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class IpSignalingPeerGroup  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String ipSignalingPeerGroupId;
    private java.lang.String description;
    private java.lang.Short attributes;

    public IpSignalingPeerGroup() {
    }

    public IpSignalingPeerGroup(
           java.lang.String ipSignalingPeerGroupId,
           java.lang.String description,
           java.lang.Short attributes) {
           this.ipSignalingPeerGroupId = ipSignalingPeerGroupId;
           this.description = description;
           this.attributes = attributes;
    }


    /**
     * Gets the ipSignalingPeerGroupId value for this IpSignalingPeerGroup.
     * 
     * @return ipSignalingPeerGroupId
     */
    public java.lang.String getIpSignalingPeerGroupId() {
        return ipSignalingPeerGroupId;
    }


    /**
     * Sets the ipSignalingPeerGroupId value for this IpSignalingPeerGroup.
     * 
     * @param ipSignalingPeerGroupId
     */
    public void setIpSignalingPeerGroupId(java.lang.String ipSignalingPeerGroupId) {
        this.ipSignalingPeerGroupId = ipSignalingPeerGroupId;
    }


    /**
     * Gets the description value for this IpSignalingPeerGroup.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this IpSignalingPeerGroup.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the attributes value for this IpSignalingPeerGroup.
     * 
     * @return attributes
     */
    public java.lang.Short getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this IpSignalingPeerGroup.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.Short attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpSignalingPeerGroup)) return false;
        IpSignalingPeerGroup other = (IpSignalingPeerGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipSignalingPeerGroupId==null && other.getIpSignalingPeerGroupId()==null) || 
             (this.ipSignalingPeerGroupId!=null &&
              this.ipSignalingPeerGroupId.equals(other.getIpSignalingPeerGroupId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes())));
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
        if (getIpSignalingPeerGroupId() != null) {
            _hashCode += getIpSignalingPeerGroupId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpSignalingPeerGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingPeerGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipSignalingPeerGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipSignalingPeerGroupId"));
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
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
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
