package ElementosBanco;

import java.util.ArrayList;

public class Conta {

		private String nomeUsuario;
		private Integer saldo, investimento;
		private ArrayList <Poupanca> poupanca;
		
		// Ações
		public void consultarSaldo() {
			
		};
		
		public void gerarBoleto() {
			
		};
		
		public void pagarBoleto() {
			
		};
		
		public void consultarPoupanca() {
			
		};
		
		//
		
		public String getNomeUsuario() { //nome do usuario
			return nomeUsuario;
		}
		
		public void setNomeUsuario(String nomeUsuario) {
			this.nomeUsuario = nomeUsuario;
		};
		
		public Integer getSaldo() { // saldo
			return saldo;
		}
		
		public void setSaldo(Integer saldo) {
			this.saldo = saldo;
		};
		
		
}
