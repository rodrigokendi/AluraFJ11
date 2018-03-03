
public class Casa{
	
	private String cor;
//	private Porta porta1;
	//private Porta porta2;
	//private Porta porta3;
	
	
	
	public String getCor() {
		return cor;
	}


	
	void pinta(String s) {
		cor = s;
		System.out.println("\nCor atual da casa:" + getCor());
		
	}
	


	
}
