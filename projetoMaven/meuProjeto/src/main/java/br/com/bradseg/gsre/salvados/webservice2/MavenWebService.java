package br.com.bradseg.gsre.salvados.webservice2;
import javax.jws.WebMethod;

import javax.jws.WebService;

import br.com.bradseg.gsre.salvados.webservice.ObjetoSalvadoDTO;



@WebService(name="MavenWebService", targetNamespace="http://webservice2.salvados.gsre.bradseg.com.br/", serviceName="MavenWebServiceService", portName="MavenWebServicePort")
public class MavenWebService {

	@WebMethod(operationName="retornaSalvado", action="")
	public ObjetoSalvadoDTO retornaSalvado(){
		ObjetoSalvadoDTO salvadoMaven = new ObjetoSalvadoDTO();
		salvadoMaven.setCodObjetoSalvado(12345);
		return salvadoMaven;
	}
	
}
