package fintech;

public class Transacao implements Conta {
	private Integer tipo;
	private Conta contaDe;
	private Conta contaPara;
	private Double valor;

	public boolean efetuarTransacao() {
		return false;

	}

}
