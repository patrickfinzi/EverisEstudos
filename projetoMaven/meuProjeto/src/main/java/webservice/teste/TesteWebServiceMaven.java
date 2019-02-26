package webservice.teste;

import org.apache.commons.lang.exception.ExceptionUtils;

import br.com.bradseg.gsre.salvados.webservice.ConsultaDevolucaoStatusWebService;
import br.com.bradseg.gsre.salvados.webservice.ConsultaDevolucaoStatusWebServiceService;
import br.com.bradseg.gsre.salvados.webservice.ObjetoSalvadoDTO;

public class TesteWebServiceMaven {

	//@Autowired
	//private static EstudoWebService cliente;
	
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		/*EstudoWebServiceService servico = new EstudoWebServiceService();
		EstudoWebService cliente = servico.getEstudoWebServicePort();*/
		
		//System.out.println(cliente.imprimirMensagem("James"));
		try{
		ConsultaDevolucaoStatusWebServiceService service = new ConsultaDevolucaoStatusWebServiceService();
		ConsultaDevolucaoStatusWebService cliente = service.getConsultaDevolucaoStatusWebServicePort();
		//System.out.println(cliente.consultarStatusDevolucao());
		String teste = cliente.consultarStatusDevolucao();
		System.out.println(teste);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
