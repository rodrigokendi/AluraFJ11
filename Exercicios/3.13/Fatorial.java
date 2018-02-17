class Fatorial{


	public static void main(String [] args){
	 long fat = 1;
	 int valor = 20;


	 for( int i = 1; i <= valor; i++ ){
	  fat *= i;
          System.out.println( "O fatorial de " + i + " é igual a " + fat );
	}

	
   }
}
