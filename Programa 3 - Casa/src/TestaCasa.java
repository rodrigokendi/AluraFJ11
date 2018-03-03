
public class TestaCasa {

	
	public static void main(String[] args) {
		
		Casa casa = new Casa();
		casa.pinta("Vermelho");

		Porta porta1 = new Porta();
		porta1.abre();
		porta1.setDimensaoX(1);
		
		Porta Porta2 = new Porta();
		Porta2.abre();
		Porta2.fecha();
		
		Porta Porta3 = new Porta();
		Porta3.abre();
		Porta3.fecha();
		Porta3.abre();
		
		System.out.println("Portas abertas: " + Porta.qtdPortasAbertas());
		
		
	}
}
