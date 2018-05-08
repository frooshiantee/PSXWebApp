/**
 * FeatureControlProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.model;

public class FeatureControlProfile  extends com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String featureControlProfileId;
    private java.lang.Integer featureList1;
    private java.lang.Integer featureList2;
    private java.lang.Integer featureList3;
    private java.lang.Integer featureList4;
    private java.lang.Integer featureList5;
    private java.lang.Integer genericAttributes1;
    private java.lang.Integer genericAttributes2;
    private java.lang.Integer genericAttributes3;
    private java.lang.Integer genericAttributes4;

    public FeatureControlProfile() {
    }

    public FeatureControlProfile(
           java.lang.String featureControlProfileId,
           java.lang.Integer featureList1,
           java.lang.Integer featureList2,
           java.lang.Integer featureList3,
           java.lang.Integer featureList4,
           java.lang.Integer featureList5,
           java.lang.Integer genericAttributes1,
           java.lang.Integer genericAttributes2,
           java.lang.Integer genericAttributes3,
           java.lang.Integer genericAttributes4) {
           this.featureControlProfileId = featureControlProfileId;
           this.featureList1 = featureList1;
           this.featureList2 = featureList2;
           this.featureList3 = featureList3;
           this.featureList4 = featureList4;
           this.featureList5 = featureList5;
           this.genericAttributes1 = genericAttributes1;
           this.genericAttributes2 = genericAttributes2;
           this.genericAttributes3 = genericAttributes3;
           this.genericAttributes4 = genericAttributes4;
    }


    /**
     * Gets the featureControlProfileId value for this FeatureControlProfile.
     * 
     * @return featureControlProfileId
     */
    public java.lang.String getFeatureControlProfileId() {
        return featureControlProfileId;
    }


    /**
     * Sets the featureControlProfileId value for this FeatureControlProfile.
     * 
     * @param featureControlProfileId
     */
    public void setFeatureControlProfileId(java.lang.String featureControlProfileId) {
        this.featureControlProfileId = featureControlProfileId;
    }


    /**
     * Gets the featureList1 value for this FeatureControlProfile.
     * 
     * @return featureList1
     */
    public java.lang.Integer getFeatureList1() {
        return featureList1;
    }


    /**
     * Sets the featureList1 value for this FeatureControlProfile.
     * 
     * @param featureList1
     */
    public void setFeatureList1(java.lang.Integer featureList1) {
        this.featureList1 = featureList1;
    }


    /**
     * Gets the featureList2 value for this FeatureControlProfile.
     * 
     * @return featureList2
     */
    public java.lang.Integer getFeatureList2() {
        return featureList2;
    }


    /**
     * Sets the featureList2 value for this FeatureControlProfile.
     * 
     * @param featureList2
     */
    public void setFeatureList2(java.lang.Integer featureList2) {
        this.featureList2 = featureList2;
    }


    /**
     * Gets the featureList3 value for this FeatureControlProfile.
     * 
     * @return featureList3
     */
    public java.lang.Integer getFeatureList3() {
        return featureList3;
    }


    /**
     * Sets the featureList3 value for this FeatureControlProfile.
     * 
     * @param featureList3
     */
    public void setFeatureList3(java.lang.Integer featureList3) {
        this.featureList3 = featureList3;
    }


    /**
     * Gets the featureList4 value for this FeatureControlProfile.
     * 
     * @return featureList4
     */
    public java.lang.Integer getFeatureList4() {
        return featureList4;
    }


    /**
     * Sets the featureList4 value for this FeatureControlProfile.
     * 
     * @param featureList4
     */
    public void setFeatureList4(java.lang.Integer featureList4) {
        this.featureList4 = featureList4;
    }


    /**
     * Gets the featureList5 value for this FeatureControlProfile.
     * 
     * @return featureList5
     */
    public java.lang.Integer getFeatureList5() {
        return featureList5;
    }


    /**
     * Sets the featureList5 value for this FeatureControlProfile.
     * 
     * @param featureList5
     */
    public void setFeatureList5(java.lang.Integer featureList5) {
        this.featureList5 = featureList5;
    }


    /**
     * Gets the genericAttributes1 value for this FeatureControlProfile.
     * 
     * @return genericAttributes1
     */
    public java.lang.Integer getGenericAttributes1() {
        return genericAttributes1;
    }


    /**
     * Sets the genericAttributes1 value for this FeatureControlProfile.
     * 
     * @param genericAttributes1
     */
    public void setGenericAttributes1(java.lang.Integer genericAttributes1) {
        this.genericAttributes1 = genericAttributes1;
    }


    /**
     * Gets the genericAttributes2 value for this FeatureControlProfile.
     * 
     * @return genericAttributes2
     */
    public java.lang.Integer getGenericAttributes2() {
        return genericAttributes2;
    }


    /**
     * Sets the genericAttributes2 value for this FeatureControlProfile.
     * 
     * @param genericAttributes2
     */
    public void setGenericAttributes2(java.lang.Integer genericAttributes2) {
        this.genericAttributes2 = genericAttributes2;
    }


    /**
     * Gets the genericAttributes3 value for this FeatureControlProfile.
     * 
     * @return genericAttributes3
     */
    public java.lang.Integer getGenericAttributes3() {
        return genericAttributes3;
    }


    /**
     * Sets the genericAttributes3 value for this FeatureControlProfile.
     * 
     * @param genericAttributes3
     */
    public void setGenericAttributes3(java.lang.Integer genericAttributes3) {
        this.genericAttributes3 = genericAttributes3;
    }


    /**
     * Gets the genericAttributes4 value for this FeatureControlProfile.
     * 
     * @return genericAttributes4
     */
    public java.lang.Integer getGenericAttributes4() {
        return genericAttributes4;
    }


    /**
     * Sets the genericAttributes4 value for this FeatureControlProfile.
     * 
     * @param genericAttributes4
     */
    public void setGenericAttributes4(java.lang.Integer genericAttributes4) {
        this.genericAttributes4 = genericAttributes4;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureControlProfile)) return false;
        FeatureControlProfile other = (FeatureControlProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.featureControlProfileId==null && other.getFeatureControlProfileId()==null) || 
             (this.featureControlProfileId!=null &&
              this.featureControlProfileId.equals(other.getFeatureControlProfileId()))) &&
            ((this.featureList1==null && other.getFeatureList1()==null) || 
             (this.featureList1!=null &&
              this.featureList1.equals(other.getFeatureList1()))) &&
            ((this.featureList2==null && other.getFeatureList2()==null) || 
             (this.featureList2!=null &&
              this.featureList2.equals(other.getFeatureList2()))) &&
            ((this.featureList3==null && other.getFeatureList3()==null) || 
             (this.featureList3!=null &&
              this.featureList3.equals(other.getFeatureList3()))) &&
            ((this.featureList4==null && other.getFeatureList4()==null) || 
             (this.featureList4!=null &&
              this.featureList4.equals(other.getFeatureList4()))) &&
            ((this.featureList5==null && other.getFeatureList5()==null) || 
             (this.featureList5!=null &&
              this.featureList5.equals(other.getFeatureList5()))) &&
            ((this.genericAttributes1==null && other.getGenericAttributes1()==null) || 
             (this.genericAttributes1!=null &&
              this.genericAttributes1.equals(other.getGenericAttributes1()))) &&
            ((this.genericAttributes2==null && other.getGenericAttributes2()==null) || 
             (this.genericAttributes2!=null &&
              this.genericAttributes2.equals(other.getGenericAttributes2()))) &&
            ((this.genericAttributes3==null && other.getGenericAttributes3()==null) || 
             (this.genericAttributes3!=null &&
              this.genericAttributes3.equals(other.getGenericAttributes3()))) &&
            ((this.genericAttributes4==null && other.getGenericAttributes4()==null) || 
             (this.genericAttributes4!=null &&
              this.genericAttributes4.equals(other.getGenericAttributes4())));
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
        if (getFeatureControlProfileId() != null) {
            _hashCode += getFeatureControlProfileId().hashCode();
        }
        if (getFeatureList1() != null) {
            _hashCode += getFeatureList1().hashCode();
        }
        if (getFeatureList2() != null) {
            _hashCode += getFeatureList2().hashCode();
        }
        if (getFeatureList3() != null) {
            _hashCode += getFeatureList3().hashCode();
        }
        if (getFeatureList4() != null) {
            _hashCode += getFeatureList4().hashCode();
        }
        if (getFeatureList5() != null) {
            _hashCode += getFeatureList5().hashCode();
        }
        if (getGenericAttributes1() != null) {
            _hashCode += getGenericAttributes1().hashCode();
        }
        if (getGenericAttributes2() != null) {
            _hashCode += getGenericAttributes2().hashCode();
        }
        if (getGenericAttributes3() != null) {
            _hashCode += getGenericAttributes3().hashCode();
        }
        if (getGenericAttributes4() != null) {
            _hashCode += getGenericAttributes4().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureControlProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FeatureControlProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureControlProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "featureControlProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureList1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "featureList1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureList2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "featureList2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureList3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "featureList3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureList4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "featureList4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureList5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "featureList5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericAttributes1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericAttributes1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericAttributes2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericAttributes2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericAttributes3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericAttributes3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericAttributes4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericAttributes4"));
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
