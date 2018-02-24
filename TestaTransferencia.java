class TestaTransferencia{


	public static void main(String [] args){
		
 	 Conta origem = new Conta();
	 origem.deposita(10000);
	 origem.setNumero(70);
	 origem.setTitular("Bolsonaro");

	 Conta destino = new Conta();
	 destino.deposita(30000);
	 destino.setTitular("Pablo");
	 destino.setNumero(100);

	 origem.recuperaDadosParaImpressao();
	 destino.recuperaDadosParaImpressao();

	 boolean transferiu = origem.transfere(destino,500);

	 origem.recuperaDadosParaImpressao();
	 destino.recuperaDadosParaImpressao();	  	

	}


}
