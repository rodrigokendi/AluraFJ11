
public class Casa{
	
	private String cor;
	private Porta porta1;
	private Porta porta2;
	private Porta porta3;
	
	
	
	public String getCor() {
		return cor;
	}


	public Porta getPorta1() {
		return porta1;
	}



	public void setPorta1(Porta porta1) {
		this.porta1 = porta1;
	}



	public Porta getPorta2() {
		return porta2;
	}



	public void setPorta2(Porta porta2) {
		this.porta2 = porta2;
	}



	public Porta getPorta3() {
		return porta3;
	}



	public void setPorta3(Porta porta3) {
		this.porta3 = porta3;
	}



	void pinta(String s) {
		cor = s;
		System.out.println("\nCor atual da casa:" + getCor());
		
	}
	


	
}
