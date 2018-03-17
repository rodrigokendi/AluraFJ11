import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		List<Integer> numero = new ArrayList<>();
		numero.add(10);
		numero.add(50);
		numero.add(30);
		numero.add(8);
		System.out.println(numero);
	    Collections.sort(numero);
	    System.out.println(numero);
	    Collections.shuffle(numero);
		System.out.println(numero);
		Collections.reverse(numero);
		System.out.println(numero); 
		Collections.shuffle(numero);
		System.out.println(numero); 
	}

}
