class Conta{


	int numero;
	String titular;
	double saldo;
	double limite;
	//double saqueDisponivel = saldo + limite;

	boolean saque(double valor){
       
 	 if (valor > 0){
           if(saldo + limite >= valor){ 	
	     saldo = saldo - valor;
	     System.out.println("Saque realizado com sucesso");
	     return true;	
	  }
	}
	   System.out.println("Erro na operacão de saque");
	   return false;	
	}


	void imprime(){
	  System.out.println("Titular: " + titular);
	  System.out.println("Saldo: " + saldo);
	  System.out.println("==================================");

	}

	void deposita(double valor){
	 saldo = saldo + valor;
	
	}

	boolean transfere(Conta destino, double valor){
	 if (saque(valor)){
	  destino.deposita(valor);
 	  System.out.println("Transferencia com sucesso");
	  System.out.println("==================================");
	  return true; 	
	 }
 	  System.out.println("Erro na transacao de Transferencia");
 	  System.out.println("==================================");
	  return false;
	}





}
