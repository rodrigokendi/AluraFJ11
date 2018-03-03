import java.util.Calendar;

class TestaConta {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		Conta conta = new Conta();
		conta.setTitular("Collor");
		
		conta.setDataAbertura(c.getTime());
		conta.setLimite(5000.0);
		conta.setAgencia("0900-0");
		conta.recuperaDadosParaImpressao();
		conta.deposita(5000);
		conta.recuperaDadosParaImpressao();
		conta.saca(1000);
		conta.recuperaDadosParaImpressao();
		System.out.println("Rendimento mensal: " + conta.calculaRendimento() + "\n");
		conta.recuperaDadosParaImpressao();

		Conta conta1 = new Conta();
		conta1.setTitular("DORIA");
		conta1.setDataAbertura(c.getTime());
		conta1.recuperaDadosParaImpressao();

		Conta conta2 = new Conta("TESTE");
		conta2.setDataAbertura(c.getTime());
		conta2.recuperaDadosParaImpressao();

		System.out.println("Quantidade total de contas: " + Conta.getQtdConta());

	}

}
