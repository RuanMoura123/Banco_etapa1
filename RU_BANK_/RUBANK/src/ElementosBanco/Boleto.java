package ElementosBanco;


public class Boleto {
	
	private Integer numeroBoleto;
	private String nomeBoleto;
	private Integer dataBoleto;
	
	
	Usuario usuario;
	Conta conta;
	Poupanca pupanca;
	//public int setNumeroBoleto;
	
	
	//Ações
	/*
	 public void gerarBoleto() {
		
	};
	
	public void pagarBoleto() {
		
	};*/
	
	//Número do boleto
	
	public Integer getNumeroBoleto(){
		return numeroBoleto;
	}
	
	public void setNumeroBoleto(Integer numeroBoleto) {
		this.numeroBoleto = numeroBoleto;
	}
	
	// Nome do Boleto
	
	public String getNomeBoleto(){
		return nomeBoleto;
	}
	
	public void setNomeBoleto(String nomeBoleto) {
		this.nomeBoleto = nomeBoleto;
	}
	
	// Data do boleto
	
	public Integer getDataBoleto(){
		return dataBoleto;
	}
	
	public void setDataBoleto(Integer dataBoleto) {
		this.dataBoleto = dataBoleto;
	}

}
