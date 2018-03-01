
public class Pessoa {

	private String nome;
	private int idade;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	void fazAniversario(Pessoa pessoa) {
		idade = pessoa.getIdade();
		idade += 1;

	}

	String imprimeDados() {

		String dados = "\nNome: " + getNome();
		dados += "\nIdade: " + getIdade();
		System.out.println(dados);
		return dados;

	}

}
