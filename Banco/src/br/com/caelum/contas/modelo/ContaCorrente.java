package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel, Comparable {

	public String getTipo() {
		return "Conta Corrente";
	}

	public boolean saca(double valor) {

		super.saca(valor + 0.10);
		return true;

	}

	@Override
	public double getValorImposto() {

		return this.getSaldo() * 0.01;
	}

	@Override
	public int compareTo(Object o) {

		if (o instanceof Conta) {
			ContaCorrente cc = (ContaCorrente) o;
			return (int) (getSaldo() - cc.getSaldo());

		} else
			throw new RuntimeException(o + "nao eh tipo conta");

	}
}
