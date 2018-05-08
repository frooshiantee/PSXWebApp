/**
 * PSXAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.services;

public class PSXAPIServiceLocator extends org.apache.axis.client.Service implements com.sonus.ems.api.psx.r10_00_00.services.PSXAPIService {

    public PSXAPIServiceLocator() {
    }


    public PSXAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PSXAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PSXAPIR10_00_00
    private java.lang.String PSXAPIR10_00_00_address = "http://192.168.25.254/emsapi/services/PSXAPI/PSXAPI/r10_00_00";

    public java.lang.String getPSXAPIR10_00_00Address() {
        return PSXAPIR10_00_00_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PSXAPIR10_00_00WSDDServiceName = "PSXAPI/r10_00_00";

    public java.lang.String getPSXAPIR10_00_00WSDDServiceName() {
        return PSXAPIR10_00_00WSDDServiceName;
    }

    public void setPSXAPIR10_00_00WSDDServiceName(java.lang.String name) {
        PSXAPIR10_00_00WSDDServiceName = name;
    }

    public com.sonus.ems.api.psx.r10_00_00.services.PSXAPI_r10_00_00 getPSXAPIR10_00_00() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PSXAPIR10_00_00_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPSXAPIR10_00_00(endpoint);
    }

    public com.sonus.ems.api.psx.r10_00_00.services.PSXAPI_r10_00_00 getPSXAPIR10_00_00(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sonus.ems.api.psx.r10_00_00.services.PSXAPIR10_00_00SoapBindingStub _stub = new com.sonus.ems.api.psx.r10_00_00.services.PSXAPIR10_00_00SoapBindingStub(portAddress, this);
            _stub.setPortName(getPSXAPIR10_00_00WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPSXAPIR10_00_00EndpointAddress(java.lang.String address) {
        PSXAPIR10_00_00_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sonus.ems.api.psx.r10_00_00.services.PSXAPI_r10_00_00.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sonus.ems.api.psx.r10_00_00.services.PSXAPIR10_00_00SoapBindingStub _stub = new com.sonus.ems.api.psx.r10_00_00.services.PSXAPIR10_00_00SoapBindingStub(new java.net.URL(PSXAPIR10_00_00_address), this);
                _stub.setPortName(getPSXAPIR10_00_00WSDDServiceName());
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
        if ("PSXAPI/r10_00_00".equals(inputPortName)) {
            return getPSXAPIR10_00_00();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "PSXAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.sonusnet.com/ems/emsapi/psx/r10_00_00/intf", "PSXAPI/r10_00_00"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PSXAPIR10_00_00".equals(portName)) {
            setPSXAPIR10_00_00EndpointAddress(address);
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
