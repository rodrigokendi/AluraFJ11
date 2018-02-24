class TestaConta{


	public static void main(String [] args){

		Conta conta = new Conta();
		conta.numero = 224;
		conta.titular = "Collor";
		conta.saldo = 20000.0;
		conta.limite = 5000.0;
		conta.imprime();
		conta.saque(10000);
		conta.imprime();
	}





}
