class TestaReferencia{

	public static void main(String [] args){
	 Conta c1 = new Conta();
	 c1.setNumero(10);
	 c1.setTitular("Maluf");
  	 
	 Conta c2 = new Conta();
	 c2.setNumero(10);
	 c2.setTitular("Maluf");
 	
	 c1=c2;
	 
 	 c2.setNumero(20);

	 System.out.println(c2.getNumero());
	 System.out.println(c1.getNumero());

	 
	}


}
