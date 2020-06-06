package com.netbyweb;

public class DemoClassProxy implements com.netbyweb.DemoClass {
  private String _endpoint = null;
  private com.netbyweb.DemoClass demoClass = null;
  
  public DemoClassProxy() {
    _initDemoClassProxy();
  }
  
  public DemoClassProxy(String endpoint) {
    _endpoint = endpoint;
    _initDemoClassProxy();
  }
  
  private void _initDemoClassProxy() {
    try {
      demoClass = (new com.netbyweb.DemoClassServiceLocator()).getDemoClass();
      if (demoClass != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)demoClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)demoClass)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (demoClass != null)
      ((javax.xml.rpc.Stub)demoClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.netbyweb.DemoClass getDemoClass() {
    if (demoClass == null)
      _initDemoClassProxy();
    return demoClass;
  }
  
  public java.lang.String func(int a, int b) throws java.rmi.RemoteException{
    if (demoClass == null)
      _initDemoClassProxy();
    return demoClass.func(a, b);
  }
  
  
}