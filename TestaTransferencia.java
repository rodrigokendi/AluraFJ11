class TestaTransferencia{


	public static void main(String [] args){
		
 	 Conta origem = new Conta();
	 origem.deposita(10000);
	 origem.numero = 70;
	 origem.titular = "Bolsonaro";

	 Conta destino = new Conta();
	 destino.deposita(30000);
	 destino.titular = "Pablo";
	 destino.numero = 100;

	 origem.imprime();
	 destino.imprime();

	 boolean transferiu = origem.transfere(destino,500);

	 origem.imprime();
	 destino.imprime();	  	

	}




}
