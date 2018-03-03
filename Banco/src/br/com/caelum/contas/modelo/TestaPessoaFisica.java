package br.com.caelum.contas.modelo;
public class TestaPessoaFisica {

	public static void main(String[] args) {

		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("Jurema");
		pessoaFisica.validaClienteCpf(pessoaFisica);

		
		PessoaFisica pessoaFisica2 = new PessoaFisica();
		pessoaFisica2.setNome("Jucemar");
		pessoaFisica2.setCpf("40648266800");
		pessoaFisica.validaClienteCpf(pessoaFisica2);
		System.out.println(pessoaFisica2.getNome());
	}

}
