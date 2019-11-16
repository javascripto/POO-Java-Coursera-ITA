
public class Compra {
	private int valorTotal;
	private int numeroParcelas;
	
	// a vista
	Compra(int valor) {
		valorTotal = valor;
		numeroParcelas = 1;
	}
	
	// parcelado
	Compra(int valorParcela, int qtdParcelas) {
		numeroParcelas = qtdParcelas;
		valorTotal = valorParcela * qtdParcelas;;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	
	
	public int getValorParcela() {
		return valorTotal / numeroParcelas;
	}
	
}
