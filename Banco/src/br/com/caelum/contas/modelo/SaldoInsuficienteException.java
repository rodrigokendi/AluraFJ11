package br.com.caelum.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException{
	
	/**
	 * classe de excecao para metodos saca e transfere
	 */
	
	public SaldoInsuficienteException(double valor){
		super("Saldo insuficiente para sacar o valor de: R$ " + valor);
		
	}
	

}
