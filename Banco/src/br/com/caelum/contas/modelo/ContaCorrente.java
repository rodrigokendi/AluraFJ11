package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {

	
	public String getTipo(){
		return "Conta Corrente";
	}
	
	public boolean saca(double valor) {

		if (valor > 0) {
			if (getSaldo() + getLimite() >= valor) {
				super.saca(valor + 0.10);
				return true;
			}
		}
		System.out.println("==================================");
		System.out.println("Erro na operacao de saque");
		System.out.println("==================================");
		return false;
	}
}
