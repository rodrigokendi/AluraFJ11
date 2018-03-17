package br.com.caelum.contas;

import java.util.ArrayList;

public class Testalista {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();
		lista.add("Paulo");
		lista.add("Guilherme");
		lista.add("Carlos");
		lista.add("Sergio");
		System.out.println(lista);
		System.out.println(lista.contains("Paulo"));
		lista.remove("Sergio");
		System.out.println(lista);
		System.out.println(lista.size());

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

	}

}
