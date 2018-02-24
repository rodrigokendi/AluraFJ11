class TestaContaComModificador{


	public static void main(String [] args){
		Conta c1 = new Conta();
		c1.setNumero(50);
		c1.setTitular("Modificador");
		c1.deposita(2000);
	  	c1.recuperaDadosParaImpressao();

	 	Conta c2 = new Conta("Gilmar");
	 	c2.recuperaDadosParaImpressao();
	}


}
