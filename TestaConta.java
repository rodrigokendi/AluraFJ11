class TestaConta{


	public static void main(String [] args){

		Conta conta = new Conta();
		//conta.setNumero(224);
		conta.setTitular("Collor");
		conta.setDataAbertura("20/02/2018"); 
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
		//conta1.setNumero(224);
		conta1.setTitular("DORIA");
		conta1.setDataAbertura("20/02/2018");
		conta1.recuperaDadosParaImpressao();


		Conta conta2 = new Conta("TESTE");
		//conta2.setNumero(224);
		conta2.setDataAbertura("20/02/2018");
		conta2.recuperaDadosParaImpressao();


		System.out.println("Quantidade total de contas: " + Conta.getQtdConta());
		
	}


}
