import java.util.List;
import java.util.ArrayList;

public class Banco {
	private static int contadorContas;

	private List<ContaCorrente> contasAtivas = new ArrayList<ContaCorrente>();
	private List<ContaCorrente> contasInativas = new ArrayList<ContaCorrente>();

	Banco registrarNovaConta() {
		double saldoInicial = 0;
		return registrarNovaConta(saldoInicial);
	}

	Banco registrarNovaConta(double saldoInicial) {
		ContaCorrente conta = new ContaCorrente(contadorContas++, saldoInicial);
		this.contasAtivas.add(conta);
		return this;
	}

	int getNumeroDeContasAtivas() {
		return contasAtivas.size();
	}
	
	int getNumeroDeContasInativas() {
		return contasInativas.size();
	}
	
	double getSaldoTotal() {
		double saldoTotal = 0;

		for (ContaCorrente conta: contasAtivas)
			saldoTotal += conta.getSaldoAtual();

		for (ContaCorrente conta: contasInativas)
			saldoTotal += conta.getSaldoAtual();

		return saldoTotal;
	}
	
	public String toString() {
		return
				"Contas ativas: " + getNumeroDeContasAtivas() + "\n" +
				"Saldo total: " + getSaldoTotal();
	}
}
