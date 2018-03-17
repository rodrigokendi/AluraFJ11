package br.com.caelum.contas.arquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class LeArquivo {

	public static void main(String[] args) throws IOException {
		//InputStream is = new FileInputStream("arquivo.txt");
		// System.out.println(is.read());
		//InputStream is =  System.in;
		InputStream is = new URL("http://www.google.com.br").openStream();

		InputStreamReader isr = new InputStreamReader(is);
		// System.out.println((char) isr.read());

		BufferedReader br = new BufferedReader(isr);
		// System.out.println(br.readLine());
		String s = br.readLine();

		while (s != null) {
			System.out.println(s);
			s = br.readLine();

		}

	}

}
