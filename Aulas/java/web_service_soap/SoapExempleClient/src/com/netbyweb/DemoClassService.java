/**
 * DemoClassService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netbyweb;

public interface DemoClassService extends javax.xml.rpc.Service {
    public java.lang.String getDemoClassAddress();

    public com.netbyweb.DemoClass getDemoClass() throws javax.xml.rpc.ServiceException;

    public com.netbyweb.DemoClass getDemoClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
