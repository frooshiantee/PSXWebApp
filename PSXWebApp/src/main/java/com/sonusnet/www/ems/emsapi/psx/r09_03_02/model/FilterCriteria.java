/**
 * FilterCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.model;

public class FilterCriteria  extends com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue  implements java.io.Serializable {
    private java.lang.String filterCriteriaId;

    private java.lang.String calledNoa;

    private java.lang.String calledNpi;

    private java.lang.String oli;

    private java.lang.String cpc;

    private java.lang.String csi;

    private java.lang.String ingressSignalingFlag;

    private java.lang.String ingressDestSwitchType;

    private java.lang.String ingressTdmTrunkType;

    private java.lang.Short lookupType;

    private java.lang.String callParamFilterGroupId;

    public FilterCriteria() {
    }

    public FilterCriteria(
           java.lang.String filterCriteriaId,
           java.lang.String calledNoa,
           java.lang.String calledNpi,
           java.lang.String oli,
           java.lang.String cpc,
           java.lang.String csi,
           java.lang.String ingressSignalingFlag,
           java.lang.String ingressDestSwitchType,
           java.lang.String ingressTdmTrunkType,
           java.lang.Short lookupType,
           java.lang.String callParamFilterGroupId) {
        this.filterCriteriaId = filterCriteriaId;
        this.calledNoa = calledNoa;
        this.calledNpi = calledNpi;
        this.oli = oli;
        this.cpc = cpc;
        this.csi = csi;
        this.ingressSignalingFlag = ingressSignalingFlag;
        this.ingressDestSwitchType = ingressDestSwitchType;
        this.ingressTdmTrunkType = ingressTdmTrunkType;
        this.lookupType = lookupType;
        this.callParamFilterGroupId = callParamFilterGroupId;
    }


    /**
     * Gets the filterCriteriaId value for this FilterCriteria.
     * 
     * @return filterCriteriaId
     */
    public java.lang.String getFilterCriteriaId() {
        return filterCriteriaId;
    }


    /**
     * Sets the filterCriteriaId value for this FilterCriteria.
     * 
     * @param filterCriteriaId
     */
    public void setFilterCriteriaId(java.lang.String filterCriteriaId) {
        this.filterCriteriaId = filterCriteriaId;
    }


    /**
     * Gets the calledNoa value for this FilterCriteria.
     * 
     * @return calledNoa
     */
    public java.lang.String getCalledNoa() {
        return calledNoa;
    }


    /**
     * Sets the calledNoa value for this FilterCriteria.
     * 
     * @param calledNoa
     */
    public void setCalledNoa(java.lang.String calledNoa) {
        this.calledNoa = calledNoa;
    }


    /**
     * Gets the calledNpi value for this FilterCriteria.
     * 
     * @return calledNpi
     */
    public java.lang.String getCalledNpi() {
        return calledNpi;
    }


    /**
     * Sets the calledNpi value for this FilterCriteria.
     * 
     * @param calledNpi
     */
    public void setCalledNpi(java.lang.String calledNpi) {
        this.calledNpi = calledNpi;
    }


    /**
     * Gets the oli value for this FilterCriteria.
     * 
     * @return oli
     */
    public java.lang.String getOli() {
        return oli;
    }


    /**
     * Sets the oli value for this FilterCriteria.
     * 
     * @param oli
     */
    public void setOli(java.lang.String oli) {
        this.oli = oli;
    }


    /**
     * Gets the cpc value for this FilterCriteria.
     * 
     * @return cpc
     */
    public java.lang.String getCpc() {
        return cpc;
    }


    /**
     * Sets the cpc value for this FilterCriteria.
     * 
     * @param cpc
     */
    public void setCpc(java.lang.String cpc) {
        this.cpc = cpc;
    }


    /**
     * Gets the csi value for this FilterCriteria.
     * 
     * @return csi
     */
    public java.lang.String getCsi() {
        return csi;
    }


    /**
     * Sets the csi value for this FilterCriteria.
     * 
     * @param csi
     */
    public void setCsi(java.lang.String csi) {
        this.csi = csi;
    }


    /**
     * Gets the ingressSignalingFlag value for this FilterCriteria.
     * 
     * @return ingressSignalingFlag
     */
    public java.lang.String getIngressSignalingFlag() {
        return ingressSignalingFlag;
    }


    /**
     * Sets the ingressSignalingFlag value for this FilterCriteria.
     * 
     * @param ingressSignalingFlag
     */
    public void setIngressSignalingFlag(java.lang.String ingressSignalingFlag) {
        this.ingressSignalingFlag = ingressSignalingFlag;
    }


    /**
     * Gets the ingressDestSwitchType value for this FilterCriteria.
     * 
     * @return ingressDestSwitchType
     */
    public java.lang.String getIngressDestSwitchType() {
        return ingressDestSwitchType;
    }


    /**
     * Sets the ingressDestSwitchType value for this FilterCriteria.
     * 
     * @param ingressDestSwitchType
     */
    public void setIngressDestSwitchType(java.lang.String ingressDestSwitchType) {
        this.ingressDestSwitchType = ingressDestSwitchType;
    }


    /**
     * Gets the ingressTdmTrunkType value for this FilterCriteria.
     * 
     * @return ingressTdmTrunkType
     */
    public java.lang.String getIngressTdmTrunkType() {
        return ingressTdmTrunkType;
    }


    /**
     * Sets the ingressTdmTrunkType value for this FilterCriteria.
     * 
     * @param ingressTdmTrunkType
     */
    public void setIngressTdmTrunkType(java.lang.String ingressTdmTrunkType) {
        this.ingressTdmTrunkType = ingressTdmTrunkType;
    }


    /**
     * Gets the lookupType value for this FilterCriteria.
     * 
     * @return lookupType
     */
    public java.lang.Short getLookupType() {
        return lookupType;
    }


    /**
     * Sets the lookupType value for this FilterCriteria.
     * 
     * @param lookupType
     */
    public void setLookupType(java.lang.Short lookupType) {
        this.lookupType = lookupType;
    }


    /**
     * Gets the callParamFilterGroupId value for this FilterCriteria.
     * 
     * @return callParamFilterGroupId
     */
    public java.lang.String getCallParamFilterGroupId() {
        return callParamFilterGroupId;
    }


    /**
     * Sets the callParamFilterGroupId value for this FilterCriteria.
     * 
     * @param callParamFilterGroupId
     */
    public void setCallParamFilterGroupId(java.lang.String callParamFilterGroupId) {
        this.callParamFilterGroupId = callParamFilterGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilterCriteria)) return false;
        FilterCriteria other = (FilterCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.filterCriteriaId==null && other.getFilterCriteriaId()==null) || 
             (this.filterCriteriaId!=null &&
              this.filterCriteriaId.equals(other.getFilterCriteriaId()))) &&
            ((this.calledNoa==null && other.getCalledNoa()==null) || 
             (this.calledNoa!=null &&
              this.calledNoa.equals(other.getCalledNoa()))) &&
            ((this.calledNpi==null && other.getCalledNpi()==null) || 
             (this.calledNpi!=null &&
              this.calledNpi.equals(other.getCalledNpi()))) &&
            ((this.oli==null && other.getOli()==null) || 
             (this.oli!=null &&
              this.oli.equals(other.getOli()))) &&
            ((this.cpc==null && other.getCpc()==null) || 
             (this.cpc!=null &&
              this.cpc.equals(other.getCpc()))) &&
            ((this.csi==null && other.getCsi()==null) || 
             (this.csi!=null &&
              this.csi.equals(other.getCsi()))) &&
            ((this.ingressSignalingFlag==null && other.getIngressSignalingFlag()==null) || 
             (this.ingressSignalingFlag!=null &&
              this.ingressSignalingFlag.equals(other.getIngressSignalingFlag()))) &&
            ((this.ingressDestSwitchType==null && other.getIngressDestSwitchType()==null) || 
             (this.ingressDestSwitchType!=null &&
              this.ingressDestSwitchType.equals(other.getIngressDestSwitchType()))) &&
            ((this.ingressTdmTrunkType==null && other.getIngressTdmTrunkType()==null) || 
             (this.ingressTdmTrunkType!=null &&
              this.ingressTdmTrunkType.equals(other.getIngressTdmTrunkType()))) &&
            ((this.lookupType==null && other.getLookupType()==null) || 
             (this.lookupType!=null &&
              this.lookupType.equals(other.getLookupType()))) &&
            ((this.callParamFilterGroupId==null && other.getCallParamFilterGroupId()==null) || 
             (this.callParamFilterGroupId!=null &&
              this.callParamFilterGroupId.equals(other.getCallParamFilterGroupId())));
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
        if (getFilterCriteriaId() != null) {
            _hashCode += getFilterCriteriaId().hashCode();
        }
        if (getCalledNoa() != null) {
            _hashCode += getCalledNoa().hashCode();
        }
        if (getCalledNpi() != null) {
            _hashCode += getCalledNpi().hashCode();
        }
        if (getOli() != null) {
            _hashCode += getOli().hashCode();
        }
        if (getCpc() != null) {
            _hashCode += getCpc().hashCode();
        }
        if (getCsi() != null) {
            _hashCode += getCsi().hashCode();
        }
        if (getIngressSignalingFlag() != null) {
            _hashCode += getIngressSignalingFlag().hashCode();
        }
        if (getIngressDestSwitchType() != null) {
            _hashCode += getIngressDestSwitchType().hashCode();
        }
        if (getIngressTdmTrunkType() != null) {
            _hashCode += getIngressTdmTrunkType().hashCode();
        }
        if (getLookupType() != null) {
            _hashCode += getLookupType().hashCode();
        }
        if (getCallParamFilterGroupId() != null) {
            _hashCode += getCallParamFilterGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "FilterCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterCriteriaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterCriteriaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledNoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNpi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledNpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oli");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressSignalingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressSignalingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressDestSwitchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressDestSwitchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingressTdmTrunkType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ingressTdmTrunkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lookupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callParamFilterGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callParamFilterGroupId"));
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
