class TestaConta{


	public static void main(String [] args){

		Conta conta = new Conta();
		conta.numero = 224;
		conta.titular = "Collor";
		conta.saldo = 20000.0;
		conta.limite = 5000.0;
		conta.imprime();
		conta.deposita(5000.45);
		conta.imprime();
		boolean sacou = conta.saque(1000);
		conta.imprime();
		
	}





}
