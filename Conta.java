class Conta{


	int numero;
	String titular;
	double saldo;
	double limite;
	

	void saque(double valor){
	  saldo = saldo - valor;	
	}


	void imprime(){
	  System.out.println("Titular: " + titular);
	  System.out.println("Saldo: " + saldo);
	  System.out.println("==================================");

}





}
