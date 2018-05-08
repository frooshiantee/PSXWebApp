/**
 * PSXAPI_r10_00_00.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.sonus.ems.api.psx.r10_00_00.services;

public interface PSXAPI_r10_00_00 extends java.rmi.Remote {
    public com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[] getNextItems(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey in1, int in2, int in3) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException;
    public com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[] bulkRetrieve(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in1, int in2, int in3, java.lang.String[] in4, java.lang.String in5) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException;
    public void bulkUpdate(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in1, java.lang.String in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException;
    public java.lang.String listall(java.lang.String in0, java.lang.String in1, java.lang.String in2, boolean in3, boolean in4) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException;
    public java.lang.String getJobStatus(java.lang.String in0) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException;
    public void bulkDelete(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in1, java.lang.String in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException;
    public void put(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in1) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException;
    public void put(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[] in1, boolean in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException;
    public void delete(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey in1) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException;
    public void delete(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[] in1, boolean in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException;
    public void create(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in1) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException;
    public void create(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[] in1, boolean in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException;
    public void update(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey in1, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException;
    public void update(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[] in1, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in2, boolean in3) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException;
    public com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue retrieve(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey in1) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException;
    public com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue[] retrieve(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityKey[] in1, boolean in2) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiBatchException;
    public int getCount(java.lang.String in0, com.sonus.ems.api.psx.r10_00_00.model.ManagedEntityValue in1, java.lang.String in2, java.lang.String[] in3) throws java.rmi.RemoteException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiException, com.sonus.ems.api.psx.r10_00_00.model.ProvApiAuthorizationException;
}
