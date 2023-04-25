package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();
	
	private CepApi() {}
	
	public static CepApi getInstancia() {
		
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		
		return "Boa viagem";
	}
	
	public String recuperarEstado(String cep) {
		
		return "Rio de janeiro";
	}
}
