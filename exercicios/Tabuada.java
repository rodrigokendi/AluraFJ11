class Tabuada{


	public static void main(String [] args){

		int aux=0;

		for(int i=1; i<=10; i++){
		   System.out.println("\nTabuada do " + i + "\n");
		 for(int j=1; j<=10; j++){
		    aux=i*j;
	            System.out.println(i+"X"+j+"="+aux);			
		 }
	       }
	}


}