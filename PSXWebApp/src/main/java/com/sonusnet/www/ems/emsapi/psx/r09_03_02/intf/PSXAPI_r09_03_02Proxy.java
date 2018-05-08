package com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf;

public class PSXAPI_r09_03_02Proxy implements com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPI_r09_03_02 {
  private String _endpoint = null;
  private com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPI_r09_03_02 pSXAPI_r09_03_02 = null;
  
  public PSXAPI_r09_03_02Proxy() {
    _initPSXAPI_r09_03_02Proxy();
  }
  
  public PSXAPI_r09_03_02Proxy(String endpoint) {
    _endpoint = endpoint;
    _initPSXAPI_r09_03_02Proxy();
  }
  
  private void _initPSXAPI_r09_03_02Proxy() {
    try {
      pSXAPI_r09_03_02 = (new com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPIServiceLocator()).getPSXAPIR09_03_02();
      if (pSXAPI_r09_03_02 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pSXAPI_r09_03_02)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pSXAPI_r09_03_02)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pSXAPI_r09_03_02 != null)
      ((javax.xml.rpc.Stub)pSXAPI_r09_03_02)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sonusnet.www.ems.emsapi.psx.r09_03_02.intf.PSXAPI_r09_03_02 getPSXAPI_r09_03_02() {
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    return pSXAPI_r09_03_02;
  }
  
  public com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[] getNextItems(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey in1, int in2, int in3) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    return pSXAPI_r09_03_02.getNextItems(in0, in1, in2, in3);
  }
  
  public com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[] bulkRetrieve(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in1, int in2, int in3, java.lang.String[] in4, java.lang.String in5) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    return pSXAPI_r09_03_02.bulkRetrieve(in0, in1, in2, in3, in4, in5);
  }
  
  public void bulkUpdate(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in1, java.lang.String in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    pSXAPI_r09_03_02.bulkUpdate(in0, in1, in2);
  }
  
  public java.lang.String listall(java.lang.String in0, java.lang.String in1, java.lang.String in2, boolean in3, boolean in4) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    return pSXAPI_r09_03_02.listall(in0, in1, in2, in3, in4);
  }
  
  public java.lang.String getJobStatus(java.lang.String in0) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    return pSXAPI_r09_03_02.getJobStatus(in0);
  }
  
  public void bulkDelete(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in1, java.lang.String in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    pSXAPI_r09_03_02.bulkDelete(in0, in1, in2);
  }
  
  public void put(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in1) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    pSXAPI_r09_03_02.put(in0, in1);
  }
  
  public void put(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[] in1, boolean in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    pSXAPI_r09_03_02.put(in0, in1, in2);
  }
  
  public void delete(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey in1) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    pSXAPI_r09_03_02.delete(in0, in1);
  }
  
  public void delete(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[] in1, boolean in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    pSXAPI_r09_03_02.delete(in0, in1, in2);
  }
  
  public void create(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in1) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    pSXAPI_r09_03_02.create(in0, in1);
  }
  
  public void create(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[] in1, boolean in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    pSXAPI_r09_03_02.create(in0, in1, in2);
  }
  
  public void update(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey in1, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    pSXAPI_r09_03_02.update(in0, in1, in2);
  }
  
  public void update(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[] in1, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in2, boolean in3) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    pSXAPI_r09_03_02.update(in0, in1, in2, in3);
  }
  
  public com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue retrieve(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey in1) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    return pSXAPI_r09_03_02.retrieve(in0, in1);
  }
  
  public com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue[] retrieve(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityKey[] in1, boolean in2) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiBatchException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    return pSXAPI_r09_03_02.retrieve(in0, in1, in2);
  }
  
  public int getCount(java.lang.String in0, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ManagedEntityValue in1, java.lang.String in2, java.lang.String[] in3) throws java.rmi.RemoteException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiException, com.sonusnet.www.ems.emsapi.psx.r09_03_02.model.ProvApiAuthorizationException{
    if (pSXAPI_r09_03_02 == null)
      _initPSXAPI_r09_03_02Proxy();
    return pSXAPI_r09_03_02.getCount(in0, in1, in2, in3);
  }
  
  
}