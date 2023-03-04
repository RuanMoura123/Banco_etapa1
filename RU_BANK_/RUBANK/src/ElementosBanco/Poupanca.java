package ElementosBanco;
import java.util.Scanner;

public class Poupanca {
	
	private String nomePoupanca;
	private String tipoPoupanca;
	private Integer saldo = 0;
	
	Integer depositarPoupanca, sacarPoupanca, verSaldoPoupanca;

	Scanner entradaTexto = new Scanner(System.in);
	
	
	public void verSaldoPoupanca() {
		System.out.println(saldo);
	}
	
	public void depositarPoupanca(Integer depositarPoupanca) {
		System.out.println("Digite o valor de deposito: ");
		saldo = entradaTexto.nextInt();
		
		//entradaTexto.close();
	};
	
	public void sacarPoupanca(Integer sacarPoupanca) {
		System.out.println("Digite o valor de saque: ");
		saldo = (-(entradaTexto.nextInt()) + saldo);
		
		entradaTexto.close();
	};
	
	//
	public String getNomePoupanca() {
		return nomePoupanca;
	}
	
	public void setNomePoupanca(String nomePoupanca) {
		this.nomePoupanca = nomePoupanca;
	}
	
	
	
}
