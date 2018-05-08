/**
 * PSXAPIR09_03_02SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf;

public class PSXAPIR09_03_02SoapBindingStub extends org.apache.axis.client.Stub implements com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPI_r09_03_02 {
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
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_tns1_ManagedEntityKey"));
        oper.setReturnClass(com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getNextItemsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkRetrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_tns1_ManagedEntityValue"));
        oper.setReturnClass(com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "bulkRetrieveReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
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
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
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
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("put");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("put");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_tns1_ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_tns1_ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiBatchException"), 
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
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_tns1_ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_tns1_ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityValue"));
        oper.setReturnClass(com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "retrieveReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_tns1_ManagedEntityKey"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_tns1_ManagedEntityValue"));
        oper.setReturnClass(com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "retrieveReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiBatchException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityValue"), com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCountReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "fault"),
                      "com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException",
                      new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException"), 
                      true
                     ));
        _operations[16] = oper;

    }

    public PSXAPIR09_03_02SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PSXAPIR09_03_02SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PSXAPIR09_03_02SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_tns1_ErrorEntity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ErrorEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ErrorEntity");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_tns1_ManagedEntityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_tns1_ManagedEntityValue");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "ArrayOf_xsd_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AccessTransferProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AccessTransferProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AccessTransferProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AccessTransferProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AdMsgProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AdMsgProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AdMsgProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AdMsgProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AdProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AdProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AdProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AdProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AmaCalltypeLookup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AmaCalltypeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AmaCalltypeLookupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AmaCalltypeLookupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ApplicationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ApplicationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ApplicationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ApplicationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ArsProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ArsProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ArsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ArsProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Authcode");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Authcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AuthcodeEncryption");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AuthcodeEncryption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AuthcodeEncryptionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AuthcodeEncryptionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AuthcodeGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AuthcodeGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AuthcodeGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AuthcodeGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AuthcodeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AuthcodeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AutoRecallProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AutoRecallProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AutoRecallProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AutoRecallProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AutoRecallProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AutoRecallProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "AutoRecallProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.AutoRecallProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BgBlockingLabelProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BgBlockingLabelProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BgBlockingLabelProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BgBlockingLabelProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BgBlockingLabelProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BgBlockingLabelProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BgBlockingLabelProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BgBlockingLabelProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BgRegisteredUser");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BgRegisteredUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BgRegisteredUserKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BgRegisteredUserKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingInfoProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BillingInfoProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingInfoProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BillingInfoProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingInfoProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BillingInfoProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingInfoProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BillingInfoProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingPlan");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BillingPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingPlanKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BillingPlanKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingRate");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BillingRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingRateKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BillingRateKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingZone");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BillingZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BillingZoneKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BillingZoneKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BlockingLabelProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BlockingLabelProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BlockingLabelProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BlockingLabelProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BlockingLabelProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BlockingLabelProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BlockingLabelProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BlockingLabelProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BusinessGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BusinessGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BusinessGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BusinessGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BusinessLocation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BusinessLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BusinessLocationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BusinessLocationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BusinessUnit");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BusinessUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "BusinessUnitKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.BusinessUnitKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CaleaEntity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CaleaEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CaleaEntityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CaleaEntityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallingClist");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallingClist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallingClistKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallingClistKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallingPartyBillingNumber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallingPartyBillingNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallingPartyBillingNumberData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallingPartyBillingNumberData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallingPartyBillingNumberDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallingPartyBillingNumberDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallingPartyBillingNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallingPartyBillingNumberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallParameterFilterGroupProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallParameterFilterGroupProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallParameterFilterGroupProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallParameterFilterGroupProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallParameterFilterGroupProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallParameterFilterGroupProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallParameterFilterGroupProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallParameterFilterGroupProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallParameters");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallParametersKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallParametersKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallParamFilterProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallParamFilterProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallParamFilterProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallParamFilterProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallParamFilterProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallParamFilterProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallParamFilterProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallParamFilterProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallRecordingCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallRecordingCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallRecordingCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallRecordingCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallType");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CallTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CallTypeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CanonicalName");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CanonicalName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CanonicalNameKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CanonicalNameKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CapQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CapQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CapQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CapQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Carrier");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Carrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Carrier900TollNxx");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Carrier900TollNxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Carrier900TollNxxKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Carrier900TollNxxKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierCodeConversionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierCodeConversionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierCodeConversionProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierCodeConversionProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierCodeConversionProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierCodeConversionProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierCodeConversionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierCodeConversionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierDestinationChargeIndication");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierDestinationChargeIndication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierDestinationChargeIndicationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierDestinationChargeIndicationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierDomain");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierSelectionPriority");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierSelectionPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierSelectionPriorityData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierSelectionPriorityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierSelectionPriorityDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierSelectionPriorityDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierSelectionPriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierSelectionPriorityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierTypeProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierTypeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierTypeProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierTypeProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierTypeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierTypeProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CarrierTypeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CarrierTypeProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeAreaGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeAreaGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeAreaGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeAreaGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeAreaGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeAreaGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeAreaGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeAreaGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeBandProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeBandProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeBandProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeBandProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeBandProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeBandProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeBandProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeBandProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeIndex");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeIndex.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeIndexKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeIndexKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeIndication");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeIndication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeIndicationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeIndicationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeRateInfoParameters");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeRateInfoParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeRateInfoParametersKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeRateInfoParametersKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeRateProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeRateProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeRateProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeRateProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeRateProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeRateProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ChargeRateProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ChargeRateProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ClassOfService");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ClassOfService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ClassOfServiceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ClassOfServiceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ClusterProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ClusterProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ClusterProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ClusterProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CodecEntry");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CodecEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CodecEntryKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CodecEntryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CodecListProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CodecListProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CodecListProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CodecListProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CodecRoutingPriority");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CodecRoutingPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CodecRoutingPriorityData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CodecRoutingPriorityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CodecRoutingPriorityDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CodecRoutingPriorityDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CodecRoutingPriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CodecRoutingPriorityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CongestionControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CongestionControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CongestionControlProfileAdaptData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CongestionControlProfileAdaptData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CongestionControlProfileAdaptDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CongestionControlProfileAdaptDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CongestionControlProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CongestionControlProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CongestionControlProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CongestionControlProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CongestionControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CongestionControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CosBlockingLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CosBlockingLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CosBlockingLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CosBlockingLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CosCallRestrictionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CosCallRestrictionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CosCallRestrictionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CosCallRestrictionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CosCpcScreen");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CosCpcScreen.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CosCpcScreenKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CosCpcScreenKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CosInfodigitScreen");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CosInfodigitScreen.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CosInfodigitScreenKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CosInfodigitScreenKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Country");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Country.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CountryKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CountryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Cpc");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Cpc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CpcKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CpcKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CpcMappingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CpcMappingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CpcMappingProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CpcMappingProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CpcMappingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CpcMappingProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CpcMappingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CpcMappingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CpcScreening");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CpcScreening.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "CpcScreeningKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.CpcScreeningKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DdiRangeProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DdiRangeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DdiRangeProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DdiRangeProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DdiRangeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DdiRangeProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DdiRangeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DdiRangeProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Destination");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Destination.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DestinationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DestinationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DeviceProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DeviceProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DeviceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DeviceProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DialPlanProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DialPlanProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DialPlanProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DialPlanProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DigitLenEnfProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DigitLenEnfProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DigitLenEnfProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DigitLenEnfProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DnsZone");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DnsZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DnsZoneKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DnsZoneKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DnsZoneLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DnsZoneLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DnsZoneLabelData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DnsZoneLabelData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DnsZoneLabelDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DnsZoneLabelDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DnsZoneLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DnsZoneLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DomainControllerProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DomainControllerProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DomainControllerProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DomainControllerProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DpcExceptionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DpcExceptionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DpcExceptionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DpcExceptionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DpcInformation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DpcInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DpcInformationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DpcInformationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DtmfProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DtmfProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DtmfProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DtmfProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DtmfProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DtmfProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "DtmfProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.DtmfProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EchoCancelCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EchoCancelCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EchoCancelCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EchoCancelCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ElementRoutingPriority");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ElementRoutingPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ElementRoutingPriorityGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ElementRoutingPriorityGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ElementRoutingPriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ElementRoutingPriorityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ElementScript");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ElementScript.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ElementScriptKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ElementScriptKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnblocProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnblocProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnblocProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnblocProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnblocProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnblocProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnblocProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnblocProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EndPointLocationProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EndPointLocationProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EndPointLocationProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EndPointLocationProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Enterprise");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Enterprise.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnterpriseKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnterpriseKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnumAuthorityProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnumAuthorityProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnumAuthorityProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnumAuthorityProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnumAuthorityProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnumAuthorityProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnumAuthorityProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnumAuthorityProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnumDomain");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnumDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnumDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnumDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnumDomainsProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnumDomainsProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnumDomainsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnumDomainsProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnumQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnumQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EnumQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EnumQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ErrorEntity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ErrorEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ErrorHandlingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ErrorHandlingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ErrorHandlingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ErrorHandlingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EscapedCarrier");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EscapedCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EscapedCarrierKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EscapedCarrierKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EscapedNpa");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EscapedNpa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EscapedNpaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EscapedNpaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EscapedNumber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EscapedNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EscapedNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EscapedNumberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EscapedTrunkgroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EscapedTrunkgroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "EscapedTrunkgroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.EscapedTrunkgroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "FeatureControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.FeatureControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "FeatureControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.FeatureControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "FeatureKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.FeatureKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "FilterCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.FilterCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "FilterCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.FilterCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ForcedOffnetLocation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ForcedOffnetLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ForcedOffnetLocationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ForcedOffnetLocationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ForwardersData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ForwardersData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ForwardersDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ForwardersDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Gateway");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Gateway.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GatewayGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GatewayGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GatewayGroupCollection");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GatewayGroupCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GatewayGroupCollectionData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GatewayGroupCollectionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GatewayGroupCollectionDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GatewayGroupCollectionDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GatewayGroupCollectionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GatewayGroupCollectionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GatewayGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GatewayGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GatewayGroupSig");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GatewayGroupSig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GatewayGroupSigKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GatewayGroupSigKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GatewayKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GatewayKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GatewayLrns");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GatewayLrns.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GatewayLrnsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GatewayLrnsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GlobalizeNumberProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GlobalizeNumberProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GlobalizeNumberProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GlobalizeNumberProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GlobalizeNumberProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GlobalizeNumberProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GlobalizeNumberProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GlobalizeNumberProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GlobalTitleProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GlobalTitleProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "GlobalTitleProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.GlobalTitleProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Gr303Subscriber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Gr303Subscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Gr303SubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Gr303SubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "H323Zone");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.H323Zone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "H323ZoneKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.H323ZoneKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "H323ZoneNetwork");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.H323ZoneNetwork.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "H323ZoneNetworkKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.H323ZoneNetworkKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HifraudCountryLabelProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HifraudCountryLabelProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HifraudCountryLabelProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HifraudCountryLabelProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HifraudCountryLabelProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HifraudCountryLabelProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HifraudCountryLabelProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HifraudCountryLabelProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Holiday");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Holiday.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HolidayKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HolidayKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HomeDomainGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HomeDomainGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HomeDomainGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HomeDomainGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HomeDomainGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HomeDomainGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HomeDomainGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HomeDomainGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HomeDomainLookup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HomeDomainLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HomeDomainLookupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HomeDomainLookupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HostedLnp");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HostedLnp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HostedLnpKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HostedLnpKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxApplicationServer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxApplicationServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxApplicationServerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxApplicationServerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxAuthenticationProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxAuthenticationProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxAuthenticationProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxAuthenticationProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxCapabilitiesProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxCapabilitiesProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxCapabilitiesProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxCapabilitiesProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxCapabilitiesProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxCapabilitiesProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxCapabilitiesProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxCapabilitiesProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxCapability");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxCapability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxCapabilityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxCapabilityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxChargingInformation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxChargingInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxChargingInformationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxChargingInformationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxCsLocationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxCsLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxCsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxCsLocationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxDiameterPeer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxDiameterPeer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxDiameterPeerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxDiameterPeerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxDiameterRealmRoute");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxDiameterRealmRoute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxDiameterRealmRouteKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxDiameterRealmRouteKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxDiameterVirtualPeer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxDiameterVirtualPeer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxDiameterVirtualPeerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxDiameterVirtualPeerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxFailOverHss");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxFailOverHss.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxFailOverHssKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxFailOverHssKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxFeatureList");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxFeatureList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxFeatureListKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxFeatureListKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxFmcRepositoryData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxFmcRepositoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxFmcRepositoryDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxFmcRepositoryDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxIfcSet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxIfcSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxIfcSetData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxIfcSetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxIfcSetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxIfcSetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxIfcSetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxIfcSetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxIfcSetUsageData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxIfcSetUsageData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxIfcSetUsageDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxIfcSetUsageDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxImplicitRegistrationSet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxImplicitRegistrationSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxImplicitRegistrationSetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxImplicitRegistrationSetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxInstance");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxInstanceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxInstanceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxInterNetworkRoamingAgreements");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxInterNetworkRoamingAgreements.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxInterNetworkRoamingAgreementsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxInterNetworkRoamingAgreementsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxMsisdn");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxMsisdn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxMsisdnKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxMsisdnKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxNetworkInformation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxNetworkInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxNetworkInformationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxNetworkInformationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxPartition");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxPartition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxPartitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxPartitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxPrivateUserIdentity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxPrivateUserIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxPrivateUserIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxPrivateUserIdentityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxPsLocationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxPsLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxPsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxPsLocationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxPublicUserIdentity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxPublicUserIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxPublicUserIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxPublicUserIdentityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxRegistrationTermination");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxRegistrationTermination.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxRegistrationTerminationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxRegistrationTerminationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxRepositoryData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxRepositoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxRepositoryDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxRepositoryDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxSCscf");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxSCscf.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxSCscfKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxSCscfKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxServiceProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxServiceProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxServiceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxServiceProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxSubscriptionNotificationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxSubscriptionNotificationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxSubscriptionNotificationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxSubscriptionNotificationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxSubscriptionPermissions");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxSubscriptionPermissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxSubscriptionPermissionsData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxSubscriptionPermissionsData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxSubscriptionPermissionsDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxSubscriptionPermissionsDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxSubscriptionPermissionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxSubscriptionPermissionsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxTriggerPoint");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxTriggerPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxTriggerPointData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxTriggerPointData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxTriggerPointDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxTriggerPointDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxTriggerPointKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxTriggerPointKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlChargingInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlChargingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlChargingInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlChargingInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlCsLocationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlCsLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlCsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlCsLocationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlInitialFilterCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlInitialFilterCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlInitialFilterCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlInitialFilterCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlMsisdn");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlMsisdn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlMsisdnKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlMsisdnKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlPsLocationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlPsLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlPsLocationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlPsLocationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlRepositoryData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlRepositoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlRepositoryDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlRepositoryDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlSCscfName");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlSCscfName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HsxXmlSCscfNameKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HsxXmlSCscfNameKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HtrProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HtrProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HtrProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HtrProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HtrProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HtrProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "HtrProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.HtrProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InapQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InapQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InapQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InapQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InDialogueHandlingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InDialogueHandlingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InDialogueHandlingProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InDialogueHandlingProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InDialogueHandlingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InDialogueHandlingProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InDialogueHandlingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InDialogueHandlingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Infodigit");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Infodigit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InfodigitKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InfodigitKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InfoTransCapProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InfoTransCapProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InfoTransCapProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InfoTransCapProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InterBusinessGroupService");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InterBusinessGroupService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InterBusinessGroupServiceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InterBusinessGroupServiceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InterGatewayGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InterGatewayGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InterGatewayGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InterGatewayGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InterGatewayGroupSig");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InterGatewayGroupSig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InterGatewayGroupSigKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InterGatewayGroupSigKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InternalToSipCauseMapping");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InternalToSipCauseMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InternalToSipCauseMappingKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InternalToSipCauseMappingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Interworking");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Interworking.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "InterworkingKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.InterworkingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpPeer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.IpPeer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpPeerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.IpPeerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpSignalingPeerGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.IpSignalingPeerGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpSignalingPeerGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.IpSignalingPeerGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpSignalingPeerGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.IpSignalingPeerGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpSignalingPeerGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.IpSignalingPeerGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpSignalingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.IpSignalingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpSignalingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.IpSignalingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpSignalingTonePackage");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.IpSignalingTonePackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "IpSignalingTonePackageKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.IpSignalingTonePackageKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Lata");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Lata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrCountryCap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrCountryCap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrCountryCapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrCountryCapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrCurrency");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrCurrencyKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrCurrencyKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrCustomer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrCustomerIdentity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrCustomerIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrCustomerIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrCustomerIdentityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrCustomerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrCustomerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrCustomerOffer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrCustomerOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrCustomerOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrCustomerOfferKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrExceptions");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrExceptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrExceptionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrExceptionsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrMarginProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrMarginProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrMarginProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrMarginProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrOffer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrOfferKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrOfferRateSheet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrOfferRateSheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrOfferRateSheetData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrOfferRateSheetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrOfferRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrOfferRateSheetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrOfferRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrOfferRateSheetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrOfferVendorGroups");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrOfferVendorGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrOfferVendorGroupsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrOfferVendorGroupsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrOfferVendors");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrOfferVendors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrOfferVendorsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrOfferVendorsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrQos");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrQos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrQosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrQosTypes");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrQosTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrQosTypesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrQosTypesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrRules");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrRulesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrRulesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrTgQos");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrTgQos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrTgQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrTgQosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrVendor");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrVendorGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrVendorGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrVendorGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrVendorGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrVendorGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrVendorGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrVendorGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrVendorGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrVendorKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrVendorKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrVendorRateSheet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrVendorRateSheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrVendorRateSheetData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrVendorRateSheetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrVendorRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrVendorRateSheetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LcrVendorRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LcrVendorRateSheetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LocalCallingArea");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LocalCallingArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LocalCallingAreaFrom");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LocalCallingAreaFrom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LocalCallingAreaFromKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LocalCallingAreaFromKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LocalCallingAreaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LocalCallingAreaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LocalCallingAreaNpaNxx");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LocalCallingAreaNpaNxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LocalCallingAreaNpaNxxKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LocalCallingAreaNpaNxxKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LocalCallingAreaTo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LocalCallingAreaTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LocalCallingAreaToKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LocalCallingAreaToKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LocalRingBackTone");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LocalRingBackTone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LocalRingBackToneKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LocalRingBackToneKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LogProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LogProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LogProfileCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LogProfileCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LogProfileCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LogProfileCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LogProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LogProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LwresdDnsServer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LwresdDnsServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LwresdDnsServerData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LwresdDnsServerData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LwresdDnsServerDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LwresdDnsServerDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LwresdDnsServerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LwresdDnsServerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LwresdProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LwresdProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "LwresdProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.LwresdProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ManagedEntityValue");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MediaQosKpiProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.MediaQosKpiProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MediaQosKpiProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.MediaQosKpiProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MessageWaitingIndicator");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.MessageWaitingIndicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MessageWaitingIndicatorKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.MessageWaitingIndicatorKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MimeSubType");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.MimeSubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MimeSubTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.MimeSubTypeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MobileQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.MobileQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MobileQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.MobileQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MpAnnouncementPackage");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.MpAnnouncementPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MpAnnouncementPackageKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.MpAnnouncementPackageKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Mta");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Mta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "MtaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.MtaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NetworkdataInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NetworkdataInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NetworkdataInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NetworkdataInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NonSubscriber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NonSubscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NonSubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NonSubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NpaNxx");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NpaNxx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NpaNxxKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NpaNxxKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberAnalysisProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberAnalysisProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberAnalysisProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberAnalysisProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberAnalysisProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberAnalysisProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberAnalysisProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberAnalysisProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberControlProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberControlProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberControlProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberControlProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberingPlan");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberingPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberingPlanKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberingPlanKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberTranslation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberTranslationCondition");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberTranslationCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberTranslationConditionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberTranslationConditionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberTranslationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberTranslationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberTranslationProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberTranslationProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberTranslationProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberTranslationProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberTranslationProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberTranslationProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberTranslationProfileDetail");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberTranslationProfileDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberTranslationProfileDetailKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberTranslationProfileDetailKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberTranslationProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberTranslationProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberUrlTranslation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberUrlTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "NumberUrlTranslationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.NumberUrlTranslationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OlecChosenIxcCarrierCode");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.OlecChosenIxcCarrierCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OlecChosenIxcCarrierCodeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.OlecChosenIxcCarrierCodeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OperatorNumber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.OperatorNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OperatorNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.OperatorNumberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OrigEntityRoutingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.OrigEntityRoutingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OrigEntityRoutingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.OrigEntityRoutingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OwningCarrierProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.OwningCarrierProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OwningCarrierProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.OwningCarrierProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OwningCarrierProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.OwningCarrierProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "OwningCarrierProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.OwningCarrierProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PacketServiceProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PacketServiceProfile.class;
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
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PacketServiceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PacketServiceProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Partition");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Partition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PartitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PartitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PcSsnRoutingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PcSsnRoutingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PcSsnRoutingProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PcSsnRoutingProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PcSsnRoutingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PcSsnRoutingProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PcSsnRoutingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PcSsnRoutingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PeerThrottlingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PeerThrottlingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PeerThrottlingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PeerThrottlingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Plmn");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Plmn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PlmnKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PlmnKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PlmnProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PlmnProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PlmnProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PlmnProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PmCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmCriteriaGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PmCriteriaGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmCriteriaGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PmCriteriaGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmCriteriaGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PmCriteriaGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmCriteriaGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PmCriteriaGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PmCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmRule");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PmRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmRuleCustomDnis");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PmRuleCustomDnis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmRuleCustomDnisKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PmRuleCustomDnisKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PmRuleKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PmRuleKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PostTranslationSsg");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PostTranslationSsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PostTranslationSsgData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PostTranslationSsgData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PostTranslationSsgDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PostTranslationSsgDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PostTranslationSsgKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PostTranslationSsgKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PprPartitionMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PprPartitionMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PprPartitionMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PprPartitionMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PprProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PprProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PprProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PprProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PpspIdsProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PpspIdsProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PpspIdsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PpspIdsProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PreferredPacketServiceProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PreferredPacketServiceProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PreferredPacketServiceProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PreferredPacketServiceProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PrefixProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PrefixProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PrefixProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PrefixProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PrefixProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PrefixProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PrefixProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PrefixProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PrefixType");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PrefixType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PrefixTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PrefixTypeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiAuthorizationException");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiBatchException");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ProvApiException");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PspIdsProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PspIdsProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PspIdsProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PspIdsProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PublicSafetyAnsweringPoint");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PublicSafetyAnsweringPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PublicSafetyAnsweringPointData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PublicSafetyAnsweringPointData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PublicSafetyAnsweringPointDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PublicSafetyAnsweringPointDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "PublicSafetyAnsweringPointKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.PublicSafetyAnsweringPointKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RecorderProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RecorderProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RecorderProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RecorderProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RedirectionInfoProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RedirectionInfoProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RedirectionInfoProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RedirectionInfoProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Region");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Region.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RegionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RegionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ReleaseCauseInTriggerProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ReleaseCauseInTriggerProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ReleaseCauseInTriggerProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ReleaseCauseInTriggerProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ReleaseCauseInTriggerProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ReleaseCauseInTriggerProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ReleaseCauseInTriggerProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ReleaseCauseInTriggerProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Route");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Route.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RouteKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RouteKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RouteQueryKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RouteQueryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RouteRangeProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RouteRangeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RouteRangeProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RouteRangeProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RouteRangeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RouteRangeProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RouteRangeProfileDataSplit");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RouteRangeProfileDataSplit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RouteRangeProfileDataSplitKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RouteRangeProfileDataSplitKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RouteRangeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RouteRangeProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RouteSet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RouteSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RouteSetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RouteSetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RoutingCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RoutingCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RoutingCriteriaGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RoutingCriteriaGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RoutingCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RoutingCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RoutingLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RoutingLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RoutingLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RoutingLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RoutingLabelQueryKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RoutingLabelQueryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RoutingLabelRoutes");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RoutingLabelRoutes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RoutingLabelRoutesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RoutingLabelRoutesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RuntimeVariable");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RuntimeVariable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RuntimeVariableData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RuntimeVariableData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RuntimeVariableDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RuntimeVariableDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "RuntimeVariableKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.RuntimeVariableKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpaDeviceLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScpaDeviceLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpaDeviceLabelData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScpaDeviceLabelData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpaDeviceLabelDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScpaDeviceLabelDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpaDeviceLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScpaDeviceLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpPartitionMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScpPartitionMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpPartitionMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScpPartitionMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScpQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScpQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpRoutingConfig");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScpRoutingConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpRoutingConfigKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScpRoutingConfigKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpServiceDeviceLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScpServiceDeviceLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScpServiceDeviceLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScpServiceDeviceLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Script");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Script.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ScriptKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ScriptKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SctpAssociation");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SctpAssociation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SctpAssociationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SctpAssociationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SctpControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SctpControlProfile.class;
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
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SctpControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SctpControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SctpHostNameProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SctpHostNameProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SctpHostNameProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SctpHostNameProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SctpIpAddress");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SctpIpAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SctpIpAddressKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SctpIpAddressKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdAinMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdAinMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdAinMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdAinMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdCapMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdCapMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdCapMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdCapMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdEnumMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdEnumMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdEnumMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdEnumMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdInapMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdInapMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdInapMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdInapMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdMobileMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdMobileMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdMobileMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdMobileMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdRoutingConfigMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdRoutingConfigMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdRoutingConfigMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdRoutingConfigMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdSipMessageMap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdSipMessageMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SdSipMessageMapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SdSipMessageMapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SecureCryptoSuiteProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SecureCryptoSuiteProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SecureCryptoSuiteProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SecureCryptoSuiteProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SecureCryptoSuiteProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SecureCryptoSuiteProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SecureCryptoSuiteProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SecureCryptoSuiteProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ServiceArea");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ServiceArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ServiceAreaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ServiceAreaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ServiceDefinition");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ServiceDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ServiceDefinitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ServiceDefinitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ServiceExceptionProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ServiceExceptionProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ServiceExceptionProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ServiceExceptionProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ServiceExceptionProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ServiceExceptionProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ServiceExceptionProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ServiceExceptionProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SgxDevice");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SgxDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SgxDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SgxDeviceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ShortKeyProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ShortKeyProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ShortKeyProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ShortKeyProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ShortKeyProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ShortKeyProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ShortKeyProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ShortKeyProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SignalingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SignalingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SignalingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SignalingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SignalingQosKpiProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SignalingQosKpiProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SignalingQosKpiProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SignalingQosKpiProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SigtranDpcRoute");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SigtranDpcRoute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SigtranDpcRouteKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SigtranDpcRouteKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SigtranLocalAs");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SigtranLocalAs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SigtranLocalAsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SigtranLocalAsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SigtranSg");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SigtranSg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SigtranSgKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SigtranSgKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SigtranTcapRegistration");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SigtranTcapRegistration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SigtranTcapRegistrationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SigtranTcapRegistrationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipDomain");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipHeaderParserProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipHeaderParserProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipHeaderParserProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipHeaderParserProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipHeaderParserProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipHeaderParserProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipHeaderParserProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipHeaderParserProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipLrProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipLrProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipLrProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipLrProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipLrProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipLrProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipLrProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipLrProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipMimeContentVersions");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipMimeContentVersions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipMimeContentVersionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipMimeContentVersionsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipResponseCodes");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipResponseCodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipResponseCodesData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipResponseCodesData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipResponseCodesDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipResponseCodesDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipResponseCodesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipResponseCodesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpDevice");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipScpDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpDeviceData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipScpDeviceData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpDeviceDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipScpDeviceDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipScpDeviceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpMappingProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipScpMappingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpMappingProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipScpMappingProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpMappingProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipScpMappingProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpMappingProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipScpMappingProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpQueryProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipScpQueryProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpQueryProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipScpQueryProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpServiceDeviceLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipScpServiceDeviceLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipScpServiceDeviceLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipScpServiceDeviceLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipToInternalCauseMapping");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipToInternalCauseMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SipToInternalCauseMappingKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SipToInternalCauseMappingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmAction");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmActionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmActionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmCriteria");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmCriteriaKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmCriteriaKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmProfileGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmProfileGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmProfileGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmProfileGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmRule");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmRuleActionData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmRuleActionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmRuleActionDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmRuleActionDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmRuleCriterionData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmRuleCriterionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmRuleCriterionDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmRuleCriterionDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SmmRuleKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SmmRuleKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Softswitch");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Softswitch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SoftswitchCarrier");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SoftswitchCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SoftswitchCarrierKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SoftswitchCarrierKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SoftswitchKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SoftswitchKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SpasDevice");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SpasDevice.class;
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
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SpasDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SpasDeviceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SplitAreaCode");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SplitAreaCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SplitAreaCodeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SplitAreaCodeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SsDevice");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SsDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SsDeviceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SsDeviceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Ssg");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Ssg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SsgKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SsgKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SuaNetworkAppearance");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SuaNetworkAppearance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SuaNetworkAppearanceKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SuaNetworkAppearanceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SuaProtocolProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SuaProtocolProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SuaProtocolProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SuaProtocolProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SuaSp");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SuaSp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SuaSpKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SuaSpKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SuaSpLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SuaSpLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SuaSpLabelData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SuaSpLabelData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SuaSpLabelDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SuaSpLabelDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SuaSpLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SuaSpLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Subscriber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Subscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SubscriberApplicationInfo");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SubscriberApplicationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SubscriberApplicationInfoKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SubscriberApplicationInfoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SubscriberSearchKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SubscriberSearchKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SwitchTypeCpcProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SwitchTypeCpcProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SwitchTypeCpcProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SwitchTypeCpcProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SwitchTypeCpcProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SwitchTypeCpcProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "SwitchTypeCpcProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.SwitchTypeCpcProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TcapProtocolProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TcapProtocolProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TcapProtocolProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TcapProtocolProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TciProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TciProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TciProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TciProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TciProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TciProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TciProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TciProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TgCosProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TgCosProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TgCosProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TgCosProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TimeRangeProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TimeRangeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TimeRangeProfileData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TimeRangeProfileData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TimeRangeProfileDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TimeRangeProfileDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TimeRangeProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TimeRangeProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TollfreePrefix");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TollfreePrefix.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TollfreePrefixKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TollfreePrefixKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrafficControlApplication");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrafficControlApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrafficControlApplicationKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrafficControlApplicationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrafficControlEscape");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrafficControlEscape.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrafficControlEscapeData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrafficControlEscapeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrafficControlEscapeDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrafficControlEscapeDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrafficControlEscapeKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrafficControlEscapeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrafficControlProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrafficControlProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrafficControlProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrafficControlProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TranslationLabel");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TranslationLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TranslationLabelKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TranslationLabelKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TranslationNumber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TranslationNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TranslationNumberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TranslationNumberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TriggerTypePriority");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TriggerTypePriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TriggerTypePriorityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TriggerTypePriorityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "Trunkgroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.Trunkgroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrunkgroupDomain");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrunkgroupDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrunkgroupDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrunkgroupDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrunkgroupGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrunkgroupGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrunkgroupGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrunkgroupGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrunkgroupGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrunkgroupGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrunkgroupGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrunkgroupGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "TrunkgroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.TrunkgroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "UcOcrCos");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.UcOcrCos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "UcOcrCosKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.UcOcrCosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "UcOcrProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.UcOcrProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "UcOcrProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.UcOcrProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "UserInfoProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.UserInfoProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "UserInfoProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.UserInfoProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrCountryCap");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrCountryCap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrCountryCapKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrCountryCapKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrCurrency");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrCurrencyKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrCurrencyKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrCustomer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrCustomerIdentity");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrCustomerIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrCustomerIdentityKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrCustomerIdentityKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrCustomerKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrCustomerKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrCustomerOffer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrCustomerOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrCustomerOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrCustomerOfferKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrExceptions");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrExceptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrExceptionsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrExceptionsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrMarginProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrMarginProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrMarginProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrMarginProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrOffer");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrOfferKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrOfferKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrOfferRateSheet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrOfferRateSheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrOfferRateSheetData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrOfferRateSheetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrOfferRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrOfferRateSheetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrOfferRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrOfferRateSheetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrOfferVendorGroups");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrOfferVendorGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrOfferVendorGroupsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrOfferVendorGroupsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrOfferVendors");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrOfferVendors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrOfferVendorsKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrOfferVendorsKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrQos");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrQos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrQosKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrQosTypes");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrQosTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrQosTypesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrQosTypesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrRules");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrRulesKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrRulesKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrTgQos");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrTgQos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrTgQosKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrTgQosKey.class;
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
            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrVendor");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrVendorGroup");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrVendorGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrVendorGroupData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrVendorGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrVendorGroupDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrVendorGroupDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrVendorGroupKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrVendorGroupKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrVendorKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrVendorKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrVendorRateSheet");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrVendorRateSheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrVendorRateSheetData");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrVendorRateSheetData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrVendorRateSheetDataKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrVendorRateSheetDataKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VbrVendorRateSheetKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VbrVendorRateSheetKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VPNSubscriber");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VPNSubscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "VPNSubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.VPNSubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ZoneDefinition");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ZoneDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ZoneDefinitionKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ZoneDefinitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ZoneIndexProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ZoneIndexProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ZoneIndexProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ZoneIndexProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ZzProfile");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ZzProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ZzProfileKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ZzProfileKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/model", "ZzProfileQueryKey");
            cachedSerQNames.add(qName);
            cls = com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ZzProfileQueryKey.class;
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

    public com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[] getNextItems(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey in1, int in2, int in3) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "getNextItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2), new java.lang.Integer(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[] bulkRetrieve(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in1, int in2, int in3, java.lang.String[] in4, java.lang.String in5) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "bulkRetrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2), new java.lang.Integer(in3), in4, in5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void bulkUpdate(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in1, java.lang.String in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "bulkUpdate"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String listall(java.lang.String in0, java.lang.String in1, java.lang.String in2, boolean in3, boolean in4) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "listall"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getJobStatus(java.lang.String in0) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "getJobStatus"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void bulkDelete(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in1, java.lang.String in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "bulkDelete"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void put(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in1) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "put"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void put(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[] in1, boolean in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "put"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void delete(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey in1) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "delete"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void delete(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[] in1, boolean in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "delete"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void create(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in1) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "create"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void create(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[] in1, boolean in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "create"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void update(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey in1, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "update"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void update(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[] in1, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in2, boolean in3) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "update"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue retrieve(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey in1) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue) org.apache.axis.utils.JavaUtils.convert(_resp, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[] retrieve(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[] in1, boolean in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Boolean(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getCount(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in1, java.lang.String in2, java.lang.String[] in3) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "getCount"));

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
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) {
              throw (com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
