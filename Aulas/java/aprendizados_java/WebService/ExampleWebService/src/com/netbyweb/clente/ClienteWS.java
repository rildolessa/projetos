package com.netbyweb.clente;

import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import com.netbyweb.MeuServico;
import com.netbyweb.MeuServicoServiceLocator;

public class ClienteWS {
 	
	public static void main(String[] args)  {
		
		try {
			MeuServico	meuServico = new MeuServicoServiceLocator().getMeuServico();
			System.out.println("Serviço webService: " + meuServico.digaAlgo("FUNFOU"));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
