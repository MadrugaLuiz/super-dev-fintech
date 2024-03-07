package fintech;

import java.util.List;

public interface Conta {

	static final Integer numero = null;
	static final Double saldo = null;
	static final Double limite = null;
	static final List extrato = null;
	static final String banco = "";

	private Integer gerarNumero() {
		return numero;

	}

	private void registrarTransacao() {
		System.out.println();
	}

}
