/**
 * MeuServicoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netbyweb;

public class MeuServicoServiceLocator extends org.apache.axis.client.Service implements com.netbyweb.MeuServicoService {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MeuServicoServiceLocator() {
    }


    public MeuServicoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MeuServicoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MeuServico
    private java.lang.String MeuServico_address = "http://localhost:8080/ExampleWebService/services/MeuServico";

    public java.lang.String getMeuServicoAddress() {
        return MeuServico_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MeuServicoWSDDServiceName = "MeuServico";

    public java.lang.String getMeuServicoWSDDServiceName() {
        return MeuServicoWSDDServiceName;
    }

    public void setMeuServicoWSDDServiceName(java.lang.String name) {
        MeuServicoWSDDServiceName = name;
    }

    public com.netbyweb.MeuServico getMeuServico() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MeuServico_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMeuServico(endpoint);
    }

    public com.netbyweb.MeuServico getMeuServico(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.netbyweb.MeuServicoSoapBindingStub _stub = new com.netbyweb.MeuServicoSoapBindingStub(portAddress, this);
            _stub.setPortName(getMeuServicoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMeuServicoEndpointAddress(java.lang.String address) {
        MeuServico_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.netbyweb.MeuServico.class.isAssignableFrom(serviceEndpointInterface)) {
                com.netbyweb.MeuServicoSoapBindingStub _stub = new com.netbyweb.MeuServicoSoapBindingStub(new java.net.URL(MeuServico_address), this);
                _stub.setPortName(getMeuServicoWSDDServiceName());
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
        if ("MeuServico".equals(inputPortName)) {
            return getMeuServico();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://netbyweb.com", "MeuServicoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://netbyweb.com", "MeuServico"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MeuServico".equals(portName)) {
            setMeuServicoEndpointAddress(address);
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
