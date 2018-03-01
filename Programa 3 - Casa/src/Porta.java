
public class Porta {
	
	
	private static int quantidadeDePortasAbertas;
	private boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	void abre() {

		this.aberta  = true;
		quantidadeDePortasAbertas++;	
	}

	void fecha() {

		this.aberta = false;
	//	quantidadeDePortasAbertas--;
	}

	void pinta(String s) {

		cor = s;
		System.out.println("\nCor atual da porta:" + getCor());
	}

	boolean estaAberta() {
		if (aberta) {
			System.out.println("Porta esta aberta");
			return true;
		}
		System.out.println("Porta esta fechada");
		return false;
	}
	
	void imprimeDimensao() {
		
		String dados = "\nDimensaoX: " + dimensaoX;
			   dados+= 	"\nDimensaoY: " + dimensaoY;
			   dados+= 	"\nDimensaoZ: " + dimensaoZ;
			   
		System.out.println(dados);	   
	}
	
	static int qtdPortasAbertas() {
	 
		return quantidadeDePortasAbertas;
		
	}
}
