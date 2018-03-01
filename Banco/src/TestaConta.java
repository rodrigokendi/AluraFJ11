class TestaConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		// conta.setNumero(224);
		conta.setTitular("Collor");
		Data data = new Data();
		conta.setDataAbertura(data);
		data.setDia(01);
		data.setMes(05);
		data.setAno(2018);
		conta.setLimite(5000.0);
		conta.setAgencia("0900-0");
		conta.recuperaDadosParaImpressao();
		conta.deposita(5000);
		conta.recuperaDadosParaImpressao();
		boolean sacou = conta.saca(1000);
		conta.recuperaDadosParaImpressao();
		System.out.println("Rendimento mensal: " + conta.calculaRendimento() + "\n");
		conta.recuperaDadosParaImpressao();

		Conta conta1 = new Conta();
		// conta1.setNumero(224);
		conta1.setTitular("DORIA");
		conta1.setDataAbertura(data);
		conta1.recuperaDadosParaImpressao();

		Conta conta2 = new Conta("TESTE");
		// conta2.setNumero(224);
		conta2.setDataAbertura(data);
		conta2.recuperaDadosParaImpressao();

		System.out.println("Quantidade total de contas: " + Conta.getQtdConta());

	}

}
