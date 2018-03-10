package br.com.caelum.contas;

import java.awt.Font;
import java.io.FileNotFoundException;

public class TestaErro {

	public static void main(String[] args) {
		System.out.println("Inicio do main:");
		//metodo1();
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fim do main.");

	}

	public static void metodo1() {
		System.out.println("inicio do metodo 1");

		metodo2();

		System.out.println("Fim do metodo 1");
	}

	public static void metodo2() {
		System.out.println("inicio do metodo 2");
		int[] array = new int[10];
		try {
			for (int i = 0; i < 15; i++) {
				array[i] = i * i;
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println("DEU RUIM!!");

		}

		System.out.println("Fim do metodo 2");
	}
	


}
