package br.com.caelum.contas.modelo;
public class PessoaFisica {

	private String nome;
	private String cpf;
	private String endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public PessoaFisica(String nome, String cpf, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public PessoaFisica() {
		super();
	}

	boolean validaClienteCpf(PessoaFisica pessoaFisica) {
		String temCpf = pessoaFisica.getCpf();

		if (temCpf != null) {
			System.out.println(pessoaFisica.getCpf());
			return true;

		}

			System.out.println("Cliente sem cpf");
		 	return false;

	}

}
