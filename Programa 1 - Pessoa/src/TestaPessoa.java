
public class TestaPessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Rodrigo");
		pessoa.setIdade(27);
		pessoa.imprimeDados();
		pessoa.fazAniversario(pessoa);
		pessoa.imprimeDados();
		pessoa.fazAniversario(pessoa);
		pessoa.imprimeDados();

	}

}
