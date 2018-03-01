
public class TestaPorta {

	public static void main(String[] args) {

		Porta porta = new Porta();
		porta.abre();
		porta.pinta("Marrom");
		porta.estaAberta();
		porta.fecha();
		porta.estaAberta();
		porta.abre();
		porta.estaAberta();
		porta.setDimensaoX(10.1);
		porta.setDimensaoY(5);
		porta.setDimensaoZ(3.75);
		porta.imprimeDimensao();
	}

}
