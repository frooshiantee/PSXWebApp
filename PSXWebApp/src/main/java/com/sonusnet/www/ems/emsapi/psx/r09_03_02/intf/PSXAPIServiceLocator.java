/**
 * PSXAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf;

public class PSXAPIServiceLocator extends org.apache.axis.client.Service implements com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPIService {

    public PSXAPIServiceLocator() {
    }


    public PSXAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PSXAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PSXAPIR09_03_02
    private java.lang.String PSXAPIR09_03_02_address = "http://192.168.125.25/emsapi/services/PSXAPI/PSXAPI/r09_03_02";

    public java.lang.String getPSXAPIR09_03_02Address() {
        return PSXAPIR09_03_02_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PSXAPIR09_03_02WSDDServiceName = "PSXAPI/r09_03_02";

    public java.lang.String getPSXAPIR09_03_02WSDDServiceName() {
        return PSXAPIR09_03_02WSDDServiceName;
    }

    public void setPSXAPIR09_03_02WSDDServiceName(java.lang.String name) {
        PSXAPIR09_03_02WSDDServiceName = name;
    }

    public com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPI_r09_03_02 getPSXAPIR09_03_02() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PSXAPIR09_03_02_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPSXAPIR09_03_02(endpoint);
    }

    public com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPI_r09_03_02 getPSXAPIR09_03_02(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPIR09_03_02SoapBindingStub _stub = new com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPIR09_03_02SoapBindingStub(portAddress, this);
            _stub.setPortName(getPSXAPIR09_03_02WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPSXAPIR09_03_02EndpointAddress(java.lang.String address) {
        PSXAPIR09_03_02_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPI_r09_03_02.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPIR09_03_02SoapBindingStub _stub = new com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPIR09_03_02SoapBindingStub(new java.net.URL(PSXAPIR09_03_02_address), this);
                _stub.setPortName(getPSXAPIR09_03_02WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PSXAPI/r09_03_02".equals(inputPortName)) {
            return getPSXAPIR09_03_02();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "PSXAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r09_03_02/intf", "PSXAPI/r09_03_02"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PSXAPIR09_03_02".equals(portName)) {
            setPSXAPIR09_03_02EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
