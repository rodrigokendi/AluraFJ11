package br.com.caelum.contas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class TestaListaUtil {

	public static void main(String[] args) {

		List<String> lista = new LinkedList<>();
		lista.add("Paulo");
		lista.add("Guilherme");
		// lista.add(38);
		lista.add("Sergio");
		System.out.println(lista);
		System.out.println(lista.contains("Paulo"));
		lista.remove("Sergio");
		System.out.println(lista);
		System.out.println(lista.size());

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		Set<String> linguagem = new HashSet<>();
		linguagem.add("Java");
		linguagem.add("Cobol");
		linguagem.add("C");
		linguagem.add("Java");
		System.out.println(linguagem);

		for (String s : linguagem) {
			//System.out.println(s);

			Iterator i = linguagem.iterator();
			while (i.hasNext()) {
				if (s == "Cobol") {
					i.remove();
				}

			}

		}
		System.out.println(linguagem);

	}

}
