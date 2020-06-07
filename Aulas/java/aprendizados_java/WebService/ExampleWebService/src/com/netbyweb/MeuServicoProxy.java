package com.netbyweb;

public class MeuServicoProxy implements com.netbyweb.MeuServico {
  private String _endpoint = null;
  private com.netbyweb.MeuServico meuServico = null;
  
  public MeuServicoProxy() {
    _initMeuServicoProxy();
  }
  
  public MeuServicoProxy(String endpoint) {
    _endpoint = endpoint;
    _initMeuServicoProxy();
  }
  
  private void _initMeuServicoProxy() {
    try {
      meuServico = (new com.netbyweb.MeuServicoServiceLocator()).getMeuServico();
      if (meuServico != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)meuServico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)meuServico)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (meuServico != null)
      ((javax.xml.rpc.Stub)meuServico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.netbyweb.MeuServico getMeuServico() {
    if (meuServico == null)
      _initMeuServicoProxy();
    return meuServico;
  }
  
  public java.lang.String digaAlgo(java.lang.String assunto) throws java.rmi.RemoteException{
    if (meuServico == null)
      _initMeuServicoProxy();
    return meuServico.digaAlgo(assunto);
  }
  
  
}