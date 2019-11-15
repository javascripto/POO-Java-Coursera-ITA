
public class ContaCorrente {
	private int numeroConta;
	private double saldoAtual;
	
	ContaCorrente(int numeroConta, double saldoInicial) {
		this.numeroConta = numeroConta;
		saldoAtual = saldoInicial;
	}
	
	ContaCorrente(int numeroConta) {
		this.numeroConta = numeroConta;
		this.saldoAtual = 0;
	}
	
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	ContaCorrente creditarValor(double valor) {
		saldoAtual += valor;
		return this;
	}
	
	ContaCorrente debitarValor(double valor) {
		if (possoRetirarValor(valor)) {
			saldoAtual -= valor;
		}
		return this;
	}
	
	boolean possoRetirarValor(double valor) {
		return valor >= saldoAtual;
	}
}
