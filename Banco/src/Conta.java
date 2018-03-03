import java.text.DateFormat;
import java.util.Date;

class Conta {

	private static int numero;
	private static int identificador;
	private String titular;
	private double saldo;
	private double limite;
	private Date dataAbertura;
	private String agencia;
	private static int qtdConta;

	public int getNumero() {
		return numero;
	}

	public int getIdentificador() {
		return identificador;
	}	

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date data) {
		this.dataAbertura = data;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public static int getQtdConta() {
		return Conta.qtdConta;
	}

	public Conta() {
		limite = 1000;
		numero += 1;
		identificador += 1;	
		qtdConta++;
	}

	public Conta(String titular) {
		this.titular = titular;
		numero += 1;
		identificador += 1;	
		qtdConta++;
	}

	boolean saca(double valor) {

		if (valor > 0) {
			if (saldo + limite >= valor) {
				return true;
			}
		}
		System.out.println("==================================");
		System.out.println("Erro na operacao de saque");
		System.out.println("==================================");
		return false;
	}

	String recuperaDadosParaImpressao() {
		System.out.println("====================");
		String dados = "titular: " + this.titular;
		dados += "\nnumero: " + numero;
		dados += "\nagencia: " + this.agencia;
		dados += "\nsaldo: " + this.saldo;
		dados += "\nlimite: " + this.limite;
		DateFormat f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dados += "\ndata abertura: " + f.format(dataAbertura);
		System.out.println(dados);
		System.out.println("====================");
		return dados;
	}

	void deposita(double valor) {

		saldo = saldo + valor;

	}

	boolean transfere(Conta destino, double valor) {
		if (saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		System.out.println("==================================");
		System.out.println("Erro na transacao de Transferencia");
		System.out.println("==================================");
		return false;
	}

	double calculaRendimento() {
		return saldo * 0.1;
	}
	


}