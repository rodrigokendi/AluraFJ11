package br.com.caelum.contas.modelo;


class TestaConta {

	public static void main(String[] args) {
		
		
		Conta conta = new ContaCorrente();
		conta.setTitular("Collor");	
		conta.setLimite(5000.0);
		conta.setAgencia("0900-0");
		conta.recuperaDadosParaImpressao();
		conta.deposita(5000);
		conta.recuperaDadosParaImpressao();
		conta.saca(1000);
		conta.recuperaDadosParaImpressao();
		System.out.println("Rendimento mensal: " + conta.calculaRendimento() + "\n");
		conta.recuperaDadosParaImpressao();

		Conta conta1 = new ContaPoupanca();
		conta1.setTitular("DORIA");
		conta1.recuperaDadosParaImpressao();

		Conta conta2 = new ContaPoupanca();
		conta2.recuperaDadosParaImpressao();

		System.out.println("Quantidade total de contas: " + Conta.getQtdConta());

	}

}
