package Banco;
import ElementosBanco.Usuario;
import ElementosBanco.Boleto;

public class AppBanco{
	
	public static void main(String[] args) {

		Boleto boleto1 = new Boleto();
		boleto1.setNomeBoleto ("DIVIDA_RUBANK");
		boleto1.setDataBoleto(15);
		boleto1.setNumeroBoleto(55248225);
		
		System.out.println("O boleto " + boleto1.getNomeBoleto() + 
		" de codigo " + boleto1.getNumeroBoleto() +  " esta com vencimento no prazo de " +
		boleto1.getDataBoleto() + " dias para o pagamento.");
		
	}
}
