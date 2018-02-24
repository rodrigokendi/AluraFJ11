public class Agenda {

	public static void main(String[] args) {

		System.out.println("Agenda de contatos");
		Contato contato = new Contato();
		contato.setNome("Rodrigo");
		contato.setTelefone("11992729622");
		System.out.println(contato.getNome());
		System.out.println(contato.imprimeTudao());

	}

}
