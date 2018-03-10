package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaConta {

	public static void main(String[] args) {

		Conta c = new ContaCorrente();
		System.out.println("objeto c: " + c);
		
		Tributavel z = (ContaCorrente) c;
		System.out.println("objeto z: " + z);
		c.deposita(100);
		System.out.println("saldo: " + c.getSaldo()/0);
	
		
		
		
		
		Tributavel z1 = new ContaCorrente();
		System.out.println("objeto z1: " + z1);
		
		System.out.println(((Conta)z).getQtdConta());
		
		((Conta)z).getSaldo();
		
		
		SeguroDeVida s = new SeguroDeVida();
		/*s.setNumeroApolice(100);
		s.setTitular("Rodrigo");
		s.setValor(100000);
		String dados = s.getTitular();
		dados += s.getNumeroApolice();
		dados +=s.getValor();
		System.out.println(dados);*/
		System.out.println(s);

	}

}
