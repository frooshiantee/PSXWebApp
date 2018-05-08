/**
 * PSXAPIR10_00_00SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.services;

public class PSXAPIR10_00_00SoapBindingStub extends org.apache.axis.client.Stub implements com.sonus.ems.api.psx.r10_00_00.services.PSXAPI_r10_00_00 {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[17];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNextItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityKey"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ManagedEntityKey"));
        oper.setReturnClass(com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getNextItemsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkRetrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityValue"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ManagedEntityValue"));
        oper.setReturnClass(com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "bulkRetrieveReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityValue"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listallReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJobStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getJobStatusReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityValue"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("put");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityValue"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("put");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ManagedEntityValue"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityKey"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ManagedEntityKey"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityValue"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ManagedEntityValue"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityKey"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityValue"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ManagedEntityKey"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityValue"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityKey"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityValue"));
        oper.setReturnClass(com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "retrieveReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ManagedEntityKey"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ManagedEntityValue"));
        oper.setReturnClass(com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "retrieveReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityValue"), com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCountReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "fault"),
                      "com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[16] = oper;

    }

    public PSXAPIR10_00_00SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PSXAPIR10_00_00SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PSXAPIR10_00_00SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
        addBindings6();
        addBindings7();
        addBindings8();
        addBindings9();
        addBindings10();
        addBindings11();
        addBindings12();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_AccessTransferProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AccessTransferProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AccessTransferProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_AdMsgProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AdMsgProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AdMsgProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_AdProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AdProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AdProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_AmaCalltypeLookupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AmaCalltypeLookupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AmaCalltypeLookupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ApplicationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ApplicationInfoKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ApplicationInfoKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ArsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ArsProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ArsProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_AuthcodeEncryptionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AuthcodeEncryptionKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AuthcodeEncryptionKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_AuthcodeGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AuthcodeGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AuthcodeGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_AuthcodeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AuthcodeKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AuthcodeKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_AutoRecallProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AutoRecallProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AutoRecallProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_AutoRecallProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AutoRecallProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AutoRecallProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BgBlockingLabelProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BgBlockingLabelProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BgBlockingLabelProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BgBlockingLabelProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BgBlockingLabelProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BgBlockingLabelProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BgRegisteredUserKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BgRegisteredUserKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BgRegisteredUserKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BillingInfoProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingInfoProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingInfoProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BillingInfoProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingInfoProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingInfoProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BillingPlanKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingPlanKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingPlanKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BillingRateKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingRateKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingRateKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BillingZoneKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingZoneKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingZoneKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BlockingLabelProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BlockingLabelProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BlockingLabelProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BlockingLabelProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BlockingLabelProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BlockingLabelProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BusinessGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BusinessGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BusinessGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BusinessLocationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BusinessLocationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BusinessLocationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_BusinessUnitKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BusinessUnitKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BusinessUnitKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CaleaEntityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CaleaEntityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CaleaEntityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CallingClistKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallingClistKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallingClistKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CallingPartyBillingNumberDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallingPartyBillingNumberDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallingPartyBillingNumberDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CallingPartyBillingNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallingPartyBillingNumberKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallingPartyBillingNumberKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CallParameterFilterGroupProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParameterFilterGroupProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParameterFilterGroupProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CallParameterFilterGroupProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParameterFilterGroupProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParameterFilterGroupProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CallParametersKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParametersKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParametersKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CallParamFilterProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParamFilterProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParamFilterProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CallParamFilterProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParamFilterProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParamFilterProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CallRecordingCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallRecordingCriteriaKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallRecordingCriteriaKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CallTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallTypeKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallTypeKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CanonicalNameKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CanonicalNameKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CanonicalNameKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CapQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CapQueryProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CapQueryProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_Carrier900TollNxxKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Carrier900TollNxxKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Carrier900TollNxxKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CarrierCodeConversionProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierCodeConversionProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierCodeConversionProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CarrierCodeConversionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierCodeConversionProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierCodeConversionProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CarrierDestinationChargeIndicationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierDestinationChargeIndicationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierDestinationChargeIndicationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CarrierDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierDomainKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierDomainKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CarrierGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierGroupDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierGroupDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CarrierGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CarrierKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CarrierSelectionPriorityDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierSelectionPriorityDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierSelectionPriorityDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CarrierSelectionPriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierSelectionPriorityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierSelectionPriorityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CarrierTypeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierTypeProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierTypeProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CarrierTypeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierTypeProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierTypeProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ChargeAreaGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeAreaGroupDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeAreaGroupDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ChargeAreaGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeAreaGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeAreaGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ChargeBandProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeBandProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeBandProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ChargeBandProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeBandProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeBandProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ChargeIndexKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeIndexKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeIndexKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ChargeIndicationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeIndicationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeIndicationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ChargeRateInfoParametersKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeRateInfoParametersKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeRateInfoParametersKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ChargeRateProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeRateProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeRateProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ChargeRateProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeRateProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeRateProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ClassOfServiceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ClassOfServiceKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ClassOfServiceKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ClusterProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ClusterProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ClusterProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CodecEntryKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CodecEntryKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecEntryKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CodecListProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CodecListProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecListProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CodecRoutingPriorityDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CodecRoutingPriorityDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecRoutingPriorityDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CodecRoutingPriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CodecRoutingPriorityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecRoutingPriorityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CongestionControlProfileAdaptDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CongestionControlProfileAdaptDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CongestionControlProfileAdaptDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CongestionControlProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CongestionControlProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CongestionControlProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CongestionControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CongestionControlProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CongestionControlProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CosBlockingLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CosBlockingLabelKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosBlockingLabelKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CosCallRestrictionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CosCallRestrictionProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosCallRestrictionProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CosCpcScreenKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CosCpcScreenKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosCpcScreenKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CosInfodigitScreenKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CosInfodigitScreenKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosInfodigitScreenKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CountryKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CountryKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CountryKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CpcKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CpcKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CpcMappingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CpcMappingProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcMappingProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CpcMappingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CpcMappingProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcMappingProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_CpcScreeningKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CpcScreeningKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcScreeningKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DdiRangeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DdiRangeProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DdiRangeProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DdiRangeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DdiRangeProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DdiRangeProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DestinationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DestinationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DestinationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DeviceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DeviceProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DeviceProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DialPlanProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DialPlanProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DialPlanProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DigitLenEnfProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DigitLenEnfProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DigitLenEnfProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DnsZoneKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DnsZoneKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DnsZoneKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DnsZoneLabelDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DnsZoneLabelDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DnsZoneLabelDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DnsZoneLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DnsZoneLabelKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DnsZoneLabelKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DomainControllerProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DomainControllerProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DomainControllerProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DpcExceptionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DpcExceptionProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DpcExceptionProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DpcInformationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DpcInformationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DpcInformationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DtmfProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DtmfProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DtmfProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_DtmfProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DtmfProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DtmfProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EchoCancelCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EchoCancelCriteriaKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EchoCancelCriteriaKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ElementRoutingPriorityGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ElementRoutingPriorityGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ElementRoutingPriorityGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ElementRoutingPriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ElementRoutingPriorityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ElementRoutingPriorityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ElementScriptKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ElementScriptKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ElementScriptKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EnblocProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnblocProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnblocProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EnblocProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnblocProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnblocProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EndPointLocationProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EndPointLocationProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EndPointLocationProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EnterpriseKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnterpriseKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnterpriseKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EnumAuthorityProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumAuthorityProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumAuthorityProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EnumAuthorityProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumAuthorityProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumAuthorityProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EnumDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumDomainKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumDomainKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EnumDomainsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumDomainsProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumDomainsProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EnumQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumQueryProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumQueryProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ErrorEntity");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ErrorEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ErrorEntity");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ErrorHandlingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ErrorHandlingProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ErrorHandlingProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EscapedCarrierKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EscapedCarrierKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EscapedCarrierKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EscapedNpaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EscapedNpaKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EscapedNpaKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EscapedNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EscapedNumberKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EscapedNumberKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_EscapedTrunkgroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EscapedTrunkgroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EscapedTrunkgroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_FeatureControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FeatureControlProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FeatureControlProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_FeatureKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FeatureKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FeatureKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_FilterCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FilterCriteriaKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FilterCriteriaKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_FlexibleVariableRulesDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FlexibleVariableRulesDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FlexibleVariableRulesDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_FlexibleVariableRulesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FlexibleVariableRulesKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FlexibleVariableRulesKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ForcedOffnetLocationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ForcedOffnetLocationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ForcedOffnetLocationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ForwardersDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ForwardersDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ForwardersDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_GatewayGroupCollectionDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayGroupCollectionDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroupCollectionDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_GatewayGroupCollectionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayGroupCollectionKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroupCollectionKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_GatewayGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_GatewayGroupSigKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayGroupSigKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroupSigKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_GatewayKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_GatewayLrnsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayLrnsKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayLrnsKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_GlobalizeNumberProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GlobalizeNumberProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GlobalizeNumberProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_GlobalizeNumberProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GlobalizeNumberProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GlobalizeNumberProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_GlobalTitleProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GlobalTitleProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GlobalTitleProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_Gr303SubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Gr303SubscriberKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Gr303SubscriberKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_H323ZoneKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.H323ZoneKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "H323ZoneKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_H323ZoneNetworkKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.H323ZoneNetworkKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "H323ZoneNetworkKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HifraudCountryLabelProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HifraudCountryLabelProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HifraudCountryLabelProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HifraudCountryLabelProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HifraudCountryLabelProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HifraudCountryLabelProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HolidayKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HolidayKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HolidayKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HomeDomainGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HomeDomainGroupDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HomeDomainGroupDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HomeDomainGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HomeDomainGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HomeDomainGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HomeDomainLookupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HomeDomainLookupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HomeDomainLookupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HostedLnpKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HostedLnpKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HostedLnpKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxApplicationServerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxApplicationServerKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxApplicationServerKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxAuthenticationProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxAuthenticationProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxAuthenticationProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxCapabilitiesProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxCapabilitiesProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxCapabilitiesProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxCapabilitiesProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxCapabilitiesProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxCapabilitiesProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxCapabilityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxCapabilityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxCapabilityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxChargingInformationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxChargingInformationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxChargingInformationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxCsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxCsLocationInfoKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxCsLocationInfoKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxDiameterPeerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxDiameterPeerKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxDiameterPeerKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxDiameterRealmRouteKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxDiameterRealmRouteKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxDiameterRealmRouteKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxDiameterVirtualPeerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxDiameterVirtualPeerKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxDiameterVirtualPeerKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxFailOverHssKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxFailOverHssKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxFailOverHssKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxFeatureListKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxFeatureListKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxFeatureListKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxFmcRepositoryDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxFmcRepositoryDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxFmcRepositoryDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxIfcSetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxIfcSetDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxIfcSetDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxIfcSetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxIfcSetKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxIfcSetKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxIfcSetUsageDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxIfcSetUsageDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxIfcSetUsageDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxImplicitRegistrationSetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxImplicitRegistrationSetKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxImplicitRegistrationSetKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxInstanceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxInstanceKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxInstanceKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxInterNetworkRoamingAgreementsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxInterNetworkRoamingAgreementsKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxInterNetworkRoamingAgreementsKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxMsisdnKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxMsisdnKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxMsisdnKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxNetworkInformationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxNetworkInformationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxNetworkInformationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxPartitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxPartitionKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPartitionKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxPrivateUserIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxPrivateUserIdentityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPrivateUserIdentityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxPsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxPsLocationInfoKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPsLocationInfoKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxPublicUserIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxPublicUserIdentityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPublicUserIdentityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxRegistrationTerminationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxRegistrationTerminationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxRegistrationTerminationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxRepositoryDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxRepositoryDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxRepositoryDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxSCscfKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxSCscfKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSCscfKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxServiceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxServiceProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxServiceProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxSubscriptionNotificationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxSubscriptionNotificationInfoKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSubscriptionNotificationInfoKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxSubscriptionPermissionsDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxSubscriptionPermissionsDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSubscriptionPermissionsDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxSubscriptionPermissionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxSubscriptionPermissionsKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSubscriptionPermissionsKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxTriggerPointDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxTriggerPointDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxTriggerPointDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HsxTriggerPointKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxTriggerPointKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxTriggerPointKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HtrProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HtrProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HtrProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_HtrProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HtrProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HtrProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_InapQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InapQueryProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InapQueryProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_InDialogueHandlingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InDialogueHandlingProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InDialogueHandlingProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_InDialogueHandlingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InDialogueHandlingProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InDialogueHandlingProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_InfodigitKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InfodigitKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InfodigitKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_InfoTransCapProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InfoTransCapProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InfoTransCapProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_InterBusinessGroupServiceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InterBusinessGroupServiceKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InterBusinessGroupServiceKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_InterGatewayGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InterGatewayGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InterGatewayGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_InterGatewayGroupSigKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InterGatewayGroupSigKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InterGatewayGroupSigKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_InternalToSipCauseMappingKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InternalToSipCauseMappingKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InternalToSipCauseMappingKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_InterworkingKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InterworkingKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InterworkingKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_IpPeerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpPeerKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpPeerKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_IpSignalingPeerGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpSignalingPeerGroupDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingPeerGroupDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_IpSignalingPeerGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpSignalingPeerGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingPeerGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_IpSignalingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpSignalingProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_IpSignalingTonePackageKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpSignalingTonePackageKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingTonePackageKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrCountryCapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCountryCapKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCountryCapKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrCurrencyKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCurrencyKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCurrencyKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrCustomerIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCustomerIdentityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCustomerIdentityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrCustomerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCustomerKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCustomerKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrCustomerOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCustomerOfferKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCustomerOfferKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrExceptionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrExceptionsKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrExceptionsKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrMarginProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrMarginProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrMarginProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrOfferRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferRateSheetDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferRateSheetDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrOfferRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferRateSheetKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferRateSheetKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrOfferVendorGroupsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferVendorGroupsKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferVendorGroupsKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrOfferVendorsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferVendorsKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferVendorsKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrQosKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrQosKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrQosTypesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrQosTypesKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrQosTypesKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrRulesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrRulesKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrRulesKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrTgQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrTgQosKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrTgQosKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrVendorGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorGroupDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorGroupDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrVendorGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrVendorKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrVendorRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorRateSheetDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorRateSheetDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LcrVendorRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorRateSheetKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorRateSheetKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LocalCallingAreaFromKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalCallingAreaFromKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingAreaFromKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LocalCallingAreaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalCallingAreaKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingAreaKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LocalCallingAreaNpaNxxKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalCallingAreaNpaNxxKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingAreaNpaNxxKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LocalCallingAreaToKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalCallingAreaToKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingAreaToKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LocalRingBackToneKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalRingBackToneKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalRingBackToneKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LogProfileCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LogProfileCriteriaKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LogProfileCriteriaKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LogProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LogProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LogProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LwresdDnsServerDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LwresdDnsServerDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LwresdDnsServerDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LwresdDnsServerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LwresdDnsServerKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LwresdDnsServerKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_LwresdProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LwresdProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LwresdProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ManagedEntityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ManagedEntityValue");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_MediaQosKpiProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MediaQosKpiProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MediaQosKpiProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_MessageWaitingIndicatorKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MessageWaitingIndicatorKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MessageWaitingIndicatorKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_MimeSubTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MimeSubTypeKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MimeSubTypeKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_MobileQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MobileQueryProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MobileQueryProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_MpAnnouncementPackageKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MpAnnouncementPackageKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MpAnnouncementPackageKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_MtaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MtaKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MtaKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NetworkdataInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NetworkdataInfoKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NetworkdataInfoKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NonSubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NonSubscriberKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NonSubscriberKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NumberAnalysisProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberAnalysisProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberAnalysisProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NumberAnalysisProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberAnalysisProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberAnalysisProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NumberControlProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberControlProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberControlProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NumberControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberControlProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberControlProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NumberingPlanKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberingPlanKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberingPlanKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NumberTranslationConditionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationConditionKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationConditionKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NumberTranslationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NumberTranslationProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NumberTranslationProfileDetailKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationProfileDetailKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationProfileDetailKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NumberTranslationProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_NumberUrlTranslationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberUrlTranslationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberUrlTranslationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_OlecChosenIxcCarrierCodeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OlecChosenIxcCarrierCodeKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OlecChosenIxcCarrierCodeKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_OperatorNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OperatorNumberKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OperatorNumberKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_OrigEntityRoutingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OrigEntityRoutingProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OrigEntityRoutingProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_OwningCarrierProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OwningCarrierProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OwningCarrierProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_OwningCarrierProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OwningCarrierProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OwningCarrierProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PacketServiceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PacketServiceProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PacketServiceProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PartitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PartitionKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PartitionKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PcSsnRoutingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PcSsnRoutingProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PcSsnRoutingProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PcSsnRoutingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PcSsnRoutingProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PcSsnRoutingProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PeerThrottlingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PeerThrottlingProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PeerThrottlingProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PlmnKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PlmnKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PlmnKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PlmnProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PlmnProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PlmnProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PmCriteriaGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmCriteriaGroupDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmCriteriaGroupDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PmCriteriaGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmCriteriaGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmCriteriaGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PmCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmCriteriaKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmCriteriaKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PmRuleCustomDnisKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmRuleCustomDnisKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmRuleCustomDnisKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PmRuleKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmRuleKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmRuleKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PolicyProfileGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PolicyProfileGroupDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PolicyProfileGroupDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PolicyProfileGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PolicyProfileGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PolicyProfileGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PolicyProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PolicyProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PolicyProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PostTranslationSsgDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PostTranslationSsgDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PostTranslationSsgDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PostTranslationSsgKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PostTranslationSsgKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PostTranslationSsgKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PprPartitionMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PprPartitionMapKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PprPartitionMapKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PprProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PprProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PprProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PpspIdsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PpspIdsProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PpspIdsProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PreferredPacketServiceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PreferredPacketServiceProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PreferredPacketServiceProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PrefixProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PrefixProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PrefixProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PrefixProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PrefixProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PrefixProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PrefixTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PrefixTypeKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PrefixTypeKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PspIdsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PspIdsProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PspIdsProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PublicSafetyAnsweringPointDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PublicSafetyAnsweringPointDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PublicSafetyAnsweringPointDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_PublicSafetyAnsweringPointKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PublicSafetyAnsweringPointKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PublicSafetyAnsweringPointKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RecorderProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RecorderProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RecorderProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RedirectionInfoProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RedirectionInfoProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RedirectionInfoProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RegionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RegionKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RegionKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RelayIpPortKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RelayIpPortKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RelayIpPortKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ReleaseCauseInTriggerProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ReleaseCauseInTriggerProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ReleaseCauseInTriggerProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ReleaseCauseInTriggerProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ReleaseCauseInTriggerProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ReleaseCauseInTriggerProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RouteKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RouteQueryKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteQueryKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteQueryKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RouteRangeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteRangeProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteRangeProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RouteRangeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteRangeProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteRangeProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RouteSetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteSetKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteSetKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RoutingCriteriaGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingCriteriaGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingCriteriaGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RoutingCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingCriteriaKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingCriteriaKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RoutingLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingLabelKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingLabelKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RoutingLabelQueryKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingLabelQueryKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingLabelQueryKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RoutingLabelRoutesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingLabelRoutesKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingLabelRoutesKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RuntimeVariableDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RuntimeVariableDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RuntimeVariableDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_RuntimeVariableKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RuntimeVariableKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RuntimeVariableKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ScpaDeviceLabelDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpaDeviceLabelDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpaDeviceLabelDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ScpaDeviceLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpaDeviceLabelKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpaDeviceLabelKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ScpPartitionMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpPartitionMapKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpPartitionMapKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ScpQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpQueryProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpQueryProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ScpRoutingConfigKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpRoutingConfigKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpRoutingConfigKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ScpServiceDeviceLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpServiceDeviceLabelKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpServiceDeviceLabelKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ScriptKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScriptKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScriptKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SctpAssociationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SctpAssociationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpAssociationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SctpControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SctpControlProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpControlProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SctpHostNameProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SctpHostNameProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpHostNameProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SctpIpAddressKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SctpIpAddressKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpIpAddressKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SdAinMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdAinMessageMapKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdAinMessageMapKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SdCapMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdCapMessageMapKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdCapMessageMapKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SdEnumMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdEnumMessageMapKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdEnumMessageMapKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SdInapMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdInapMessageMapKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdInapMessageMapKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SdMobileMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdMobileMessageMapKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdMobileMessageMapKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SdRoutingConfigMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdRoutingConfigMapKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdRoutingConfigMapKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SdSipMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdSipMessageMapKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdSipMessageMapKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SecureCryptoSuiteProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SecureCryptoSuiteProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SecureCryptoSuiteProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SecureCryptoSuiteProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SecureCryptoSuiteProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SecureCryptoSuiteProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ServiceAreaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ServiceAreaKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceAreaKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ServiceDefinitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ServiceDefinitionKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceDefinitionKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ServiceExceptionProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ServiceExceptionProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceExceptionProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ServiceExceptionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ServiceExceptionProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceExceptionProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SgxDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SgxDeviceKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SgxDeviceKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ShortKeyProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ShortKeyProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ShortKeyProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ShortKeyProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ShortKeyProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ShortKeyProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SignalingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SignalingProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SignalingProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SignalingQosKpiProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SignalingQosKpiProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SignalingQosKpiProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SigtranDpcRouteKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SigtranDpcRouteKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranDpcRouteKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SigtranLocalAsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SigtranLocalAsKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranLocalAsKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SigtranSgKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SigtranSgKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranSgKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SigtranTcapRegistrationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SigtranTcapRegistrationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranTcapRegistrationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipDomainKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipDomainKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipHeaderParserProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipHeaderParserProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipHeaderParserProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipHeaderParserProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipHeaderParserProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipHeaderParserProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipLrProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipLrProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipLrProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipLrProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipLrProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipLrProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipMimeContentVersionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipMimeContentVersionsKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipMimeContentVersionsKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipResponseCodesDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipResponseCodesDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipResponseCodesDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipResponseCodesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipResponseCodesKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipResponseCodesKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipScpDeviceDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpDeviceDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpDeviceDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipScpDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpDeviceKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpDeviceKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipScpMappingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpMappingProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpMappingProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipScpMappingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpMappingProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpMappingProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipScpQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpQueryProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpQueryProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipScpServiceDeviceLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpServiceDeviceLabelKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpServiceDeviceLabelKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SipToInternalCauseMappingKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipToInternalCauseMappingKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipToInternalCauseMappingKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SmmActionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmActionKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmActionKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SmmCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmCriteriaKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmCriteriaKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SmmProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SmmProfileGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmProfileGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmProfileGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SmmProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SmmRuleActionDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmRuleActionDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmRuleActionDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SmmRuleCriterionDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmRuleCriterionDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmRuleCriterionDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SmmRuleKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmRuleKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmRuleKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SoftswitchCarrierKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SoftswitchCarrierKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SoftswitchCarrierKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SoftswitchKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SoftswitchKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SoftswitchKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SpasDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SpasDeviceKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SpasDeviceKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SplitAreaCodeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SplitAreaCodeKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SplitAreaCodeKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SsDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SsDeviceKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SsDeviceKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SsgKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SsgKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SsgKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SuaNetworkAppearanceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaNetworkAppearanceKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaNetworkAppearanceKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SuaProtocolProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaProtocolProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaProtocolProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SuaSpKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaSpKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaSpKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SuaSpLabelDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaSpLabelDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaSpLabelDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SuaSpLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaSpLabelKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaSpLabelKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SubscriberApplicationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SubscriberApplicationInfoKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SubscriberApplicationInfoKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SubscriberKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SubscriberKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SubscriberSearchKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SubscriberSearchKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SubscriberSearchKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SwitchTypeCpcProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SwitchTypeCpcProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SwitchTypeCpcProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_SwitchTypeCpcProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SwitchTypeCpcProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SwitchTypeCpcProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TcapProtocolProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TcapProtocolProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TcapProtocolProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TciProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TciProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TciProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TciProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TciProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TciProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TgCosProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TgCosProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TgCosProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TimeRangeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TimeRangeProfileDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TimeRangeProfileDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TimeRangeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TimeRangeProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TimeRangeProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TollfreePrefixKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TollfreePrefixKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TollfreePrefixKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TrafficControlApplicationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrafficControlApplicationKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlApplicationKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TrafficControlEscapeDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrafficControlEscapeDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlEscapeDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TrafficControlEscapeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrafficControlEscapeKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlEscapeKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TrafficControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrafficControlProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TranslationLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TranslationLabelKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TranslationLabelKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TranslationNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TranslationNumberKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TranslationNumberKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TriggerTypePriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TriggerTypePriorityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TriggerTypePriorityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TrunkgroupDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrunkgroupDomainKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupDomainKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TrunkgroupGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrunkgroupGroupDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupGroupDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TrunkgroupGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrunkgroupGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_TrunkgroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrunkgroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_UcOcrCosKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.UcOcrCosKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "UcOcrCosKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_UcOcrProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.UcOcrProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "UcOcrProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_UserInfoProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.UserInfoProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "UserInfoProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrCountryCapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCountryCapKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCountryCapKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrCurrencyKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCurrencyKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCurrencyKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrCustomerIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCustomerIdentityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCustomerIdentityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrCustomerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCustomerKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCustomerKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrCustomerOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCustomerOfferKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCustomerOfferKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrExceptionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrExceptionsKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrExceptionsKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrMarginProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrMarginProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrMarginProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrOfferRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferRateSheetDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferRateSheetDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrOfferRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferRateSheetKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferRateSheetKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrOfferVendorGroupsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferVendorGroupsKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferVendorGroupsKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrOfferVendorsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferVendorsKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferVendorsKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrQosKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrQosKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrQosTypesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrQosTypesKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrQosTypesKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrRulesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrRulesKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrRulesKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrTgQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrTgQosKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrTgQosKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrVendorGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorGroupDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorGroupDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrVendorGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorGroupKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorGroupKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrVendorKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrVendorRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorRateSheetDataKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorRateSheetDataKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VbrVendorRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorRateSheetKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorRateSheetKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_VPNSubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VPNSubscriberKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VPNSubscriberKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ZoneDefinitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ZoneDefinitionKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ZoneDefinitionKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ZoneIndexProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ZoneIndexProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ZoneIndexProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ZzProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ZzProfileKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ZzProfileKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_tns1_ZzProfileQueryKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ZzProfileQueryKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ZzProfileQueryKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "ArrayOf_xsd_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AccessTransferProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AccessTransferProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AccessTransferProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AccessTransferProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AdMsgProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AdMsgProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AdMsgProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AdMsgProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AdProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AdProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AdProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AdProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AmaCalltypeLookup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AmaCalltypeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AmaCalltypeLookupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AmaCalltypeLookupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ApplicationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ApplicationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ApplicationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ApplicationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ArsProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ArsProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ArsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ArsProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Authcode");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Authcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AuthcodeEncryption");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AuthcodeEncryption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AuthcodeEncryptionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AuthcodeEncryptionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AuthcodeGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AuthcodeGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AuthcodeGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AuthcodeGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AuthcodeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AuthcodeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AutoRecallProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AutoRecallProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AutoRecallProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AutoRecallProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AutoRecallProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AutoRecallProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "AutoRecallProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.AutoRecallProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BgBlockingLabelProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BgBlockingLabelProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BgBlockingLabelProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BgBlockingLabelProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BgBlockingLabelProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BgBlockingLabelProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BgBlockingLabelProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BgBlockingLabelProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BgRegisteredUser");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BgRegisteredUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BgRegisteredUserKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BgRegisteredUserKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingInfoProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingInfoProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingInfoProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingInfoProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingInfoProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingInfoProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingInfoProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingInfoProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingPlan");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingPlanKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingPlanKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingRate");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingRateKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingRateKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingZone");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BillingZoneKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BillingZoneKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BlockingLabelProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BlockingLabelProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BlockingLabelProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BlockingLabelProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BlockingLabelProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BlockingLabelProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BlockingLabelProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BlockingLabelProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BusinessGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BusinessGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BusinessGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BusinessGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BusinessLocation");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BusinessLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BusinessLocationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BusinessLocationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BusinessUnit");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BusinessUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "BusinessUnitKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.BusinessUnitKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CaleaEntity");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CaleaEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CaleaEntityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CaleaEntityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallingClist");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallingClist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallingClistKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallingClistKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallingPartyBillingNumber");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallingPartyBillingNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallingPartyBillingNumberData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallingPartyBillingNumberData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallingPartyBillingNumberDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallingPartyBillingNumberDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallingPartyBillingNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallingPartyBillingNumberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParameterFilterGroupProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParameterFilterGroupProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParameterFilterGroupProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParameterFilterGroupProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParameterFilterGroupProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParameterFilterGroupProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParameterFilterGroupProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParameterFilterGroupProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParameters");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParametersKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParametersKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParamFilterProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParamFilterProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParamFilterProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParamFilterProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParamFilterProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParamFilterProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallParamFilterProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallParamFilterProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallRecordingCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallRecordingCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallRecordingCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallRecordingCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallType");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CallTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CallTypeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CanonicalName");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CanonicalName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CanonicalNameKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CanonicalNameKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CapQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CapQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CapQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CapQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Carrier");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Carrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Carrier900TollNxx");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Carrier900TollNxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Carrier900TollNxxKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Carrier900TollNxxKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierCodeConversionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierCodeConversionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierCodeConversionProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierCodeConversionProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierCodeConversionProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierCodeConversionProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierCodeConversionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierCodeConversionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierDestinationChargeIndication");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierDestinationChargeIndication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierDestinationChargeIndicationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierDestinationChargeIndicationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierDomain");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierSelectionPriority");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierSelectionPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierSelectionPriorityData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierSelectionPriorityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierSelectionPriorityDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierSelectionPriorityDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierSelectionPriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierSelectionPriorityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierTypeProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierTypeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierTypeProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierTypeProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierTypeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierTypeProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CarrierTypeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CarrierTypeProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeAreaGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeAreaGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeAreaGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeAreaGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeAreaGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeAreaGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeAreaGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeAreaGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeBandProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeBandProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeBandProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeBandProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeBandProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeBandProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeBandProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeBandProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeIndex");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeIndex.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeIndexKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeIndexKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeIndication");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeIndication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeIndicationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeIndicationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeRateInfoParameters");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeRateInfoParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeRateInfoParametersKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeRateInfoParametersKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeRateProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeRateProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeRateProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeRateProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeRateProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeRateProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ChargeRateProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ChargeRateProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ClassOfService");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ClassOfService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ClassOfServiceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ClassOfServiceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ClusterProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ClusterProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ClusterProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ClusterProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecEntry");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CodecEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecEntryKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CodecEntryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecListProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CodecListProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecListProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CodecListProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecRoutingPriority");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CodecRoutingPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecRoutingPriorityData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CodecRoutingPriorityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecRoutingPriorityDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CodecRoutingPriorityDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CodecRoutingPriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CodecRoutingPriorityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CongestionControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CongestionControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CongestionControlProfileAdaptData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CongestionControlProfileAdaptData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CongestionControlProfileAdaptDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CongestionControlProfileAdaptDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CongestionControlProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CongestionControlProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CongestionControlProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CongestionControlProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CongestionControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CongestionControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosBlockingLabel");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CosBlockingLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosBlockingLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CosBlockingLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosCallRestrictionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CosCallRestrictionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosCallRestrictionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CosCallRestrictionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosCpcScreen");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CosCpcScreen.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosCpcScreenKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CosCpcScreenKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosInfodigitScreen");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CosInfodigitScreen.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CosInfodigitScreenKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CosInfodigitScreenKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Country");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Country.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CountryKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CountryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Cpc");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Cpc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CpcKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcMappingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CpcMappingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcMappingProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CpcMappingProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcMappingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CpcMappingProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcMappingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CpcMappingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcScreening");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CpcScreening.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "CpcScreeningKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.CpcScreeningKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DdiRangeProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DdiRangeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DdiRangeProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DdiRangeProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DdiRangeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DdiRangeProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DdiRangeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DdiRangeProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Destination");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Destination.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DestinationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DestinationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DeviceProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DeviceProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DeviceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DeviceProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DialPlanProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DialPlanProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DialPlanProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DialPlanProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DigitLenEnfProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DigitLenEnfProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DigitLenEnfProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DigitLenEnfProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DnsZone");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DnsZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DnsZoneKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DnsZoneKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DnsZoneLabel");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DnsZoneLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DnsZoneLabelData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DnsZoneLabelData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DnsZoneLabelDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DnsZoneLabelDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DnsZoneLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DnsZoneLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DomainControllerProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DomainControllerProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DomainControllerProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DomainControllerProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DpcExceptionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DpcExceptionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DpcExceptionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DpcExceptionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DpcInformation");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DpcInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DpcInformationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DpcInformationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DtmfProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DtmfProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DtmfProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DtmfProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DtmfProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DtmfProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "DtmfProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.DtmfProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EchoCancelCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EchoCancelCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EchoCancelCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EchoCancelCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ElementRoutingPriority");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ElementRoutingPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ElementRoutingPriorityGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ElementRoutingPriorityGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ElementRoutingPriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ElementRoutingPriorityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ElementScript");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ElementScript.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ElementScriptKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ElementScriptKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnblocProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnblocProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnblocProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnblocProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnblocProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnblocProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnblocProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnblocProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings6() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EndPointLocationProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EndPointLocationProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EndPointLocationProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EndPointLocationProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Enterprise");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Enterprise.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnterpriseKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnterpriseKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumAuthorityProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumAuthorityProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumAuthorityProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumAuthorityProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumAuthorityProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumAuthorityProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumAuthorityProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumAuthorityProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumDomain");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumDomainsProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumDomainsProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumDomainsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumDomainsProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EnumQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EnumQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ErrorEntity");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ErrorEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ErrorHandlingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ErrorHandlingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ErrorHandlingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ErrorHandlingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EscapedCarrier");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EscapedCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EscapedCarrierKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EscapedCarrierKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EscapedNpa");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EscapedNpa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EscapedNpaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EscapedNpaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EscapedNumber");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EscapedNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EscapedNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EscapedNumberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EscapedTrunkgroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EscapedTrunkgroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "EscapedTrunkgroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.EscapedTrunkgroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FeatureControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FeatureControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FeatureControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FeatureControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FeatureKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FeatureKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FilterCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FilterCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FilterCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FilterCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FlexibleVariableRules");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FlexibleVariableRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FlexibleVariableRulesData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FlexibleVariableRulesData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FlexibleVariableRulesDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FlexibleVariableRulesDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "FlexibleVariableRulesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.FlexibleVariableRulesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ForcedOffnetLocation");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ForcedOffnetLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ForcedOffnetLocationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ForcedOffnetLocationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ForwardersData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ForwardersData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ForwardersDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ForwardersDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Gateway");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Gateway.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroupCollection");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayGroupCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroupCollectionData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayGroupCollectionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroupCollectionDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayGroupCollectionDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroupCollectionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayGroupCollectionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroupSig");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayGroupSig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayGroupSigKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayGroupSigKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayLrns");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayLrns.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GatewayLrnsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GatewayLrnsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GlobalizeNumberProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GlobalizeNumberProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GlobalizeNumberProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GlobalizeNumberProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GlobalizeNumberProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GlobalizeNumberProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GlobalizeNumberProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GlobalizeNumberProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GlobalTitleProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GlobalTitleProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "GlobalTitleProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.GlobalTitleProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Gr303Subscriber");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Gr303Subscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Gr303SubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Gr303SubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "H323Zone");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.H323Zone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "H323ZoneKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.H323ZoneKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "H323ZoneNetwork");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.H323ZoneNetwork.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "H323ZoneNetworkKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.H323ZoneNetworkKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HifraudCountryLabelProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HifraudCountryLabelProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HifraudCountryLabelProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HifraudCountryLabelProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HifraudCountryLabelProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HifraudCountryLabelProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HifraudCountryLabelProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HifraudCountryLabelProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Holiday");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Holiday.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HolidayKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HolidayKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HomeDomainGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HomeDomainGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HomeDomainGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HomeDomainGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HomeDomainGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HomeDomainGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HomeDomainGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HomeDomainGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HomeDomainLookup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HomeDomainLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HomeDomainLookupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HomeDomainLookupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HostedLnp");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HostedLnp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HostedLnpKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HostedLnpKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxApplicationServer");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxApplicationServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxApplicationServerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxApplicationServerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxAuthenticationProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxAuthenticationProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxAuthenticationProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxAuthenticationProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxCapabilitiesProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxCapabilitiesProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxCapabilitiesProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxCapabilitiesProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxCapabilitiesProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxCapabilitiesProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxCapabilitiesProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxCapabilitiesProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxCapability");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxCapability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxCapabilityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxCapabilityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxChargingInformation");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxChargingInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxChargingInformationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxChargingInformationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxCsLocationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxCsLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxCsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxCsLocationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxDiameterPeer");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxDiameterPeer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxDiameterPeerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxDiameterPeerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxDiameterRealmRoute");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxDiameterRealmRoute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxDiameterRealmRouteKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxDiameterRealmRouteKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxDiameterVirtualPeer");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxDiameterVirtualPeer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxDiameterVirtualPeerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxDiameterVirtualPeerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxFailOverHss");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxFailOverHss.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxFailOverHssKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxFailOverHssKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxFeatureList");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxFeatureList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxFeatureListKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxFeatureListKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings7() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxFmcRepositoryData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxFmcRepositoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxFmcRepositoryDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxFmcRepositoryDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxIfcSet");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxIfcSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxIfcSetData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxIfcSetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxIfcSetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxIfcSetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxIfcSetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxIfcSetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxIfcSetUsageData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxIfcSetUsageData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxIfcSetUsageDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxIfcSetUsageDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxImplicitRegistrationSet");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxImplicitRegistrationSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxImplicitRegistrationSetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxImplicitRegistrationSetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxInstance");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxInstanceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxInstanceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxInterNetworkRoamingAgreements");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxInterNetworkRoamingAgreements.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxInterNetworkRoamingAgreementsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxInterNetworkRoamingAgreementsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxMsisdn");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxMsisdn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxMsisdnKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxMsisdnKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxNetworkInformation");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxNetworkInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxNetworkInformationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxNetworkInformationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPartition");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxPartition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPartitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxPartitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPrivateUserIdentity");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxPrivateUserIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPrivateUserIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxPrivateUserIdentityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPsLocationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxPsLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxPsLocationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPublicUserIdentity");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxPublicUserIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxPublicUserIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxPublicUserIdentityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxRegistrationTermination");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxRegistrationTermination.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxRegistrationTerminationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxRegistrationTerminationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxRepositoryData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxRepositoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxRepositoryDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxRepositoryDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSCscf");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxSCscf.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSCscfKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxSCscfKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxServiceProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxServiceProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxServiceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxServiceProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSubscriptionNotificationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxSubscriptionNotificationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSubscriptionNotificationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxSubscriptionNotificationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSubscriptionPermissions");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxSubscriptionPermissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSubscriptionPermissionsData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxSubscriptionPermissionsData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSubscriptionPermissionsDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxSubscriptionPermissionsDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxSubscriptionPermissionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxSubscriptionPermissionsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxTriggerPoint");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxTriggerPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxTriggerPointData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxTriggerPointData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxTriggerPointDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxTriggerPointDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxTriggerPointKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxTriggerPointKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlChargingInfo");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlChargingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlChargingInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlChargingInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlCsLocationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlCsLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlCsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlCsLocationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlInitialFilterCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlInitialFilterCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlInitialFilterCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlInitialFilterCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlMsisdn");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlMsisdn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlMsisdnKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlMsisdnKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlPsLocationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlPsLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlPsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlPsLocationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlRepositoryData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlRepositoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlRepositoryDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlRepositoryDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlSCscfName");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlSCscfName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HsxXmlSCscfNameKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HsxXmlSCscfNameKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HtrProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HtrProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HtrProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HtrProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HtrProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HtrProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "HtrProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.HtrProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InapQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InapQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InapQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InapQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InDialogueHandlingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InDialogueHandlingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InDialogueHandlingProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InDialogueHandlingProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InDialogueHandlingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InDialogueHandlingProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InDialogueHandlingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InDialogueHandlingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Infodigit");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Infodigit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InfodigitKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InfodigitKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InfoTransCapProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InfoTransCapProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InfoTransCapProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InfoTransCapProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InterBusinessGroupService");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InterBusinessGroupService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InterBusinessGroupServiceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InterBusinessGroupServiceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InterGatewayGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InterGatewayGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InterGatewayGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InterGatewayGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InterGatewayGroupSig");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InterGatewayGroupSig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InterGatewayGroupSigKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InterGatewayGroupSigKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InternalToSipCauseMapping");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InternalToSipCauseMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InternalToSipCauseMappingKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InternalToSipCauseMappingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Interworking");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Interworking.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "InterworkingKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.InterworkingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpPeer");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpPeer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpPeerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpPeerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingPeerGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpSignalingPeerGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingPeerGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpSignalingPeerGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingPeerGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpSignalingPeerGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingPeerGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpSignalingPeerGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpSignalingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpSignalingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingTonePackage");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpSignalingTonePackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "IpSignalingTonePackageKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.IpSignalingTonePackageKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Lata");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Lata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCountryCap");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCountryCap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCountryCapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCountryCapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCurrency");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCurrencyKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCurrencyKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCustomer");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCustomerIdentity");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCustomerIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings8() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCustomerIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCustomerIdentityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCustomerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCustomerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCustomerOffer");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCustomerOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrCustomerOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrCustomerOfferKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrExceptions");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrExceptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrExceptionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrExceptionsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrMarginProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrMarginProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrMarginProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrMarginProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOffer");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferRateSheet");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferRateSheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferRateSheetData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferRateSheetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferRateSheetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferRateSheetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferVendorGroups");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferVendorGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferVendorGroupsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferVendorGroupsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferVendors");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferVendors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrOfferVendorsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrOfferVendorsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrQos");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrQos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrQosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrQosTypes");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrQosTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrQosTypesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrQosTypesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrRules");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrRulesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrRulesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrTgQos");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrTgQos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrTgQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrTgQosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendor");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorRateSheet");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorRateSheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorRateSheetData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorRateSheetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorRateSheetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LcrVendorRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LcrVendorRateSheetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingArea");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalCallingArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingAreaFrom");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalCallingAreaFrom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingAreaFromKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalCallingAreaFromKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingAreaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalCallingAreaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingAreaNpaNxx");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalCallingAreaNpaNxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingAreaNpaNxxKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalCallingAreaNpaNxxKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingAreaTo");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalCallingAreaTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalCallingAreaToKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalCallingAreaToKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalRingBackTone");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalRingBackTone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LocalRingBackToneKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LocalRingBackToneKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LogProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LogProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LogProfileCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LogProfileCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LogProfileCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LogProfileCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LogProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LogProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LwresdDnsServer");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LwresdDnsServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LwresdDnsServerData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LwresdDnsServerData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LwresdDnsServerDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LwresdDnsServerDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LwresdDnsServerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LwresdDnsServerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LwresdProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LwresdProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "LwresdProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.LwresdProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ManagedEntityValue");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MediaQosKpiProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MediaQosKpiProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MediaQosKpiProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MediaQosKpiProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MessageWaitingIndicator");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MessageWaitingIndicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MessageWaitingIndicatorKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MessageWaitingIndicatorKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MimeSubType");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MimeSubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MimeSubTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MimeSubTypeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MobileQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MobileQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MobileQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MobileQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MpAnnouncementPackage");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MpAnnouncementPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MpAnnouncementPackageKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MpAnnouncementPackageKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Mta");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Mta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "MtaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.MtaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NetworkdataInfo");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NetworkdataInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NetworkdataInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NetworkdataInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NonSubscriber");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NonSubscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NonSubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NonSubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NpaNxx");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NpaNxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NpaNxxKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NpaNxxKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberAnalysisProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberAnalysisProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberAnalysisProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberAnalysisProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberAnalysisProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberAnalysisProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberAnalysisProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberAnalysisProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberControlProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberControlProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberControlProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberControlProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberingPlan");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberingPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberingPlanKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberingPlanKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslation");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationCondition");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationConditionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationConditionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationProfileDetail");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationProfileDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationProfileDetailKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationProfileDetailKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberTranslationProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberTranslationProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberUrlTranslation");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberUrlTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "NumberUrlTranslationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.NumberUrlTranslationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OlecChosenIxcCarrierCode");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OlecChosenIxcCarrierCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OlecChosenIxcCarrierCodeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OlecChosenIxcCarrierCodeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings9() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OperatorNumber");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OperatorNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OperatorNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OperatorNumberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OrigEntityRoutingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OrigEntityRoutingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OrigEntityRoutingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OrigEntityRoutingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OwningCarrierProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OwningCarrierProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OwningCarrierProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OwningCarrierProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OwningCarrierProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OwningCarrierProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "OwningCarrierProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.OwningCarrierProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PacketServiceProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PacketServiceProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PacketServiceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PacketServiceProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Partition");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Partition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PartitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PartitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PcSsnRoutingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PcSsnRoutingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PcSsnRoutingProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PcSsnRoutingProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PcSsnRoutingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PcSsnRoutingProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PcSsnRoutingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PcSsnRoutingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PeerThrottlingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PeerThrottlingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PeerThrottlingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PeerThrottlingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Plmn");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Plmn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PlmnKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PlmnKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PlmnProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PlmnProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PlmnProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PlmnProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmCriteriaGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmCriteriaGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmCriteriaGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmCriteriaGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmCriteriaGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmCriteriaGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmCriteriaGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmCriteriaGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmRule");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmRuleCustomDnis");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmRuleCustomDnis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmRuleCustomDnisKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmRuleCustomDnisKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PmRuleKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PmRuleKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PolicyProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PolicyProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PolicyProfileGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PolicyProfileGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PolicyProfileGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PolicyProfileGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PolicyProfileGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PolicyProfileGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PolicyProfileGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PolicyProfileGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PolicyProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PolicyProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PostTranslationSsg");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PostTranslationSsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PostTranslationSsgData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PostTranslationSsgData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PostTranslationSsgDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PostTranslationSsgDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PostTranslationSsgKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PostTranslationSsgKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PprPartitionMap");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PprPartitionMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PprPartitionMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PprPartitionMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PprProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PprProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PprProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PprProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PpspIdsProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PpspIdsProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PpspIdsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PpspIdsProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PreferredPacketServiceProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PreferredPacketServiceProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PreferredPacketServiceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PreferredPacketServiceProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PrefixProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PrefixProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PrefixProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PrefixProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PrefixProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PrefixProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PrefixProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PrefixProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PrefixType");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PrefixType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PrefixTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PrefixTypeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiAuthorizationException");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiBatchException");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ProvApiException");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ProvApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PspIdsProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PspIdsProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PspIdsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PspIdsProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PublicSafetyAnsweringPoint");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PublicSafetyAnsweringPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PublicSafetyAnsweringPointData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PublicSafetyAnsweringPointData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PublicSafetyAnsweringPointDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PublicSafetyAnsweringPointDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "PublicSafetyAnsweringPointKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.PublicSafetyAnsweringPointKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RecorderProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RecorderProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RecorderProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RecorderProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RedirectionInfoProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RedirectionInfoProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RedirectionInfoProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RedirectionInfoProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Region");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Region.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RegionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RegionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RelayIpPort");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RelayIpPort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RelayIpPortKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RelayIpPortKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ReleaseCauseInTriggerProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ReleaseCauseInTriggerProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ReleaseCauseInTriggerProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ReleaseCauseInTriggerProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ReleaseCauseInTriggerProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ReleaseCauseInTriggerProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ReleaseCauseInTriggerProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ReleaseCauseInTriggerProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Route");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Route.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteQueryKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteQueryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteRangeProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteRangeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteRangeProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteRangeProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteRangeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteRangeProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteRangeProfileDataSplit");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteRangeProfileDataSplit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteRangeProfileDataSplitKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteRangeProfileDataSplitKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteRangeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteRangeProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteSet");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RouteSetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RouteSetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingCriteriaGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingCriteriaGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingLabel");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingLabelQueryKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingLabelQueryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingLabelRoutes");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingLabelRoutes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RoutingLabelRoutesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RoutingLabelRoutesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RuntimeVariable");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RuntimeVariable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RuntimeVariableData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RuntimeVariableData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RuntimeVariableDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RuntimeVariableDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "RuntimeVariableKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.RuntimeVariableKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings10() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpaDeviceLabel");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpaDeviceLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpaDeviceLabelData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpaDeviceLabelData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpaDeviceLabelDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpaDeviceLabelDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpaDeviceLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpaDeviceLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpPartitionMap");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpPartitionMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpPartitionMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpPartitionMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpRoutingConfig");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpRoutingConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpRoutingConfigKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpRoutingConfigKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpServiceDeviceLabel");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpServiceDeviceLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScpServiceDeviceLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScpServiceDeviceLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Script");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Script.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ScriptKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ScriptKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpAssociation");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SctpAssociation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpAssociationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SctpAssociationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SctpControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SctpControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpHostNameProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SctpHostNameProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpHostNameProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SctpHostNameProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpIpAddress");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SctpIpAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SctpIpAddressKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SctpIpAddressKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdAinMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdAinMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdAinMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdAinMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdCapMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdCapMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdCapMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdCapMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdEnumMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdEnumMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdEnumMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdEnumMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdInapMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdInapMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdInapMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdInapMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdMobileMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdMobileMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdMobileMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdMobileMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdRoutingConfigMap");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdRoutingConfigMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdRoutingConfigMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdRoutingConfigMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdSipMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdSipMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SdSipMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SdSipMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SecureCryptoSuiteProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SecureCryptoSuiteProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SecureCryptoSuiteProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SecureCryptoSuiteProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SecureCryptoSuiteProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SecureCryptoSuiteProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SecureCryptoSuiteProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SecureCryptoSuiteProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceArea");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ServiceArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceAreaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ServiceAreaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceDefinition");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ServiceDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceDefinitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ServiceDefinitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceExceptionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ServiceExceptionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceExceptionProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ServiceExceptionProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceExceptionProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ServiceExceptionProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ServiceExceptionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ServiceExceptionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SgxDevice");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SgxDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SgxDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SgxDeviceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ShortKeyProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ShortKeyProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ShortKeyProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ShortKeyProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ShortKeyProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ShortKeyProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ShortKeyProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ShortKeyProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SignalingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SignalingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SignalingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SignalingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SignalingQosKpiProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SignalingQosKpiProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SignalingQosKpiProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SignalingQosKpiProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranDpcRoute");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SigtranDpcRoute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranDpcRouteKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SigtranDpcRouteKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranLocalAs");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SigtranLocalAs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranLocalAsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SigtranLocalAsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranSg");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SigtranSg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranSgKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SigtranSgKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranTcapRegistration");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SigtranTcapRegistration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SigtranTcapRegistrationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SigtranTcapRegistrationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipDomain");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipHeaderParserProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipHeaderParserProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipHeaderParserProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipHeaderParserProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipHeaderParserProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipHeaderParserProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipHeaderParserProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipHeaderParserProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipLrProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipLrProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipLrProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipLrProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipLrProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipLrProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipLrProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipLrProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipMimeContentVersions");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipMimeContentVersions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipMimeContentVersionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipMimeContentVersionsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipResponseCodes");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipResponseCodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipResponseCodesData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipResponseCodesData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipResponseCodesDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipResponseCodesDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipResponseCodesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipResponseCodesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpDevice");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpDeviceData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpDeviceData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpDeviceDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpDeviceDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpDeviceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpMappingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpMappingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpMappingProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpMappingProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpMappingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpMappingProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpMappingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpMappingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpServiceDeviceLabel");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpServiceDeviceLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipScpServiceDeviceLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipScpServiceDeviceLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipToInternalCauseMapping");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipToInternalCauseMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SipToInternalCauseMappingKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SipToInternalCauseMappingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmAction");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmActionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmActionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings11() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmProfileGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmProfileGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmProfileGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmProfileGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmRule");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmRuleActionData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmRuleActionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmRuleActionDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmRuleActionDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmRuleCriterionData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmRuleCriterionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmRuleCriterionDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmRuleCriterionDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SmmRuleKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SmmRuleKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Softswitch");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Softswitch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SoftswitchCarrier");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SoftswitchCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SoftswitchCarrierKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SoftswitchCarrierKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SoftswitchKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SoftswitchKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SpasDevice");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SpasDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SpasDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SpasDeviceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SplitAreaCode");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SplitAreaCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SplitAreaCodeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SplitAreaCodeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SsDevice");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SsDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SsDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SsDeviceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Ssg");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Ssg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SsgKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SsgKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaNetworkAppearance");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaNetworkAppearance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaNetworkAppearanceKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaNetworkAppearanceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaProtocolProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaProtocolProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaProtocolProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaProtocolProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaSp");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaSp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaSpKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaSpKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaSpLabel");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaSpLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaSpLabelData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaSpLabelData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaSpLabelDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaSpLabelDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SuaSpLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SuaSpLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Subscriber");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Subscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SubscriberApplicationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SubscriberApplicationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SubscriberApplicationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SubscriberApplicationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SubscriberSearchKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SubscriberSearchKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SwitchTypeCpcProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SwitchTypeCpcProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SwitchTypeCpcProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SwitchTypeCpcProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SwitchTypeCpcProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SwitchTypeCpcProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "SwitchTypeCpcProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.SwitchTypeCpcProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TcapProtocolProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TcapProtocolProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TcapProtocolProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TcapProtocolProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TciProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TciProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TciProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TciProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TciProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TciProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TciProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TciProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TgCosProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TgCosProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TgCosProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TgCosProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TimeRangeProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TimeRangeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TimeRangeProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TimeRangeProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TimeRangeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TimeRangeProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TimeRangeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TimeRangeProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TollfreePrefix");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TollfreePrefix.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TollfreePrefixKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TollfreePrefixKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlApplication");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrafficControlApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlApplicationKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrafficControlApplicationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlEscape");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrafficControlEscape.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlEscapeData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrafficControlEscapeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlEscapeDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrafficControlEscapeDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlEscapeKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrafficControlEscapeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrafficControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrafficControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrafficControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TranslationLabel");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TranslationLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TranslationLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TranslationLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TranslationNumber");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TranslationNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TranslationNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TranslationNumberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TriggerTypePriority");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TriggerTypePriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TriggerTypePriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TriggerTypePriorityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "Trunkgroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.Trunkgroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupDomain");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrunkgroupDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrunkgroupDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrunkgroupGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrunkgroupGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrunkgroupGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrunkgroupGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "TrunkgroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.TrunkgroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "UcOcrCos");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.UcOcrCos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "UcOcrCosKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.UcOcrCosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "UcOcrProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.UcOcrProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "UcOcrProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.UcOcrProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "UserInfoProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.UserInfoProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "UserInfoProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.UserInfoProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCountryCap");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCountryCap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCountryCapKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCountryCapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCurrency");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCurrencyKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCurrencyKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCustomer");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCustomerIdentity");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCustomerIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCustomerIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCustomerIdentityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCustomerKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCustomerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCustomerOffer");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCustomerOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrCustomerOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrCustomerOfferKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrExceptions");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrExceptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrExceptionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrExceptionsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrMarginProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrMarginProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrMarginProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrMarginProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOffer");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings12() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferRateSheet");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferRateSheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferRateSheetData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferRateSheetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferRateSheetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferRateSheetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferVendorGroups");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferVendorGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferVendorGroupsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferVendorGroupsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferVendors");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferVendors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrOfferVendorsKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrOfferVendorsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrQos");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrQos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrQosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrQosTypes");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrQosTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrQosTypesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrQosTypesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrRules");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrRulesKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrRulesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrTgQos");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrTgQos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrTgQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrTgQosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendor");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorGroup");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorRateSheet");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorRateSheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorRateSheetData");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorRateSheetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorRateSheetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VbrVendorRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VbrVendorRateSheetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VPNSubscriber");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VPNSubscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "VPNSubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.VPNSubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ZoneDefinition");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ZoneDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ZoneDefinitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ZoneDefinitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ZoneIndexProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ZoneIndexProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ZoneIndexProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ZoneIndexProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ZzProfile");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ZzProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ZzProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ZzProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/model", "ZzProfileQueryKey");
            cachedSerQNames.add(qName);
            cls = com.sonus.ems.api.psx.r10_00_00.model.ZzProfileQueryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[] getNextItems(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey in1, int in2, int in3) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "getNextItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2), new java.lang.Integer(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[] bulkRetrieve(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in1, int in2, int in3, java.lang.String[] in4, java.lang.String in5) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "bulkRetrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2), new java.lang.Integer(in3), in4, in5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void bulkUpdate(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in1, java.lang.String in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "bulkUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String listall(java.lang.String in0, java.lang.String in1, java.lang.String in2, boolean in3, boolean in4) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "listall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, new java.lang.Boolean(in3), new java.lang.Boolean(in4)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getJobStatus(java.lang.String in0) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "getJobStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void bulkDelete(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in1, java.lang.String in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "bulkDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void put(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in1) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "put"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void put(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[] in1, boolean in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "put"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Boolean(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void delete(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey in1) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void delete(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[] in1, boolean in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Boolean(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void create(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in1) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void create(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[] in1, boolean in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Boolean(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void update(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey in1, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void update(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[] in1, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in2, boolean in3) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, new java.lang.Boolean(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue retrieve(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey in1) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue) org.apache.axis.utils.JavaUtils.convert(_resp, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[] retrieve(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[] in1, boolean in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Boolean(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getCount(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in1, java.lang.String in2, java.lang.String[] in3) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "getCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) {
              throw (com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
