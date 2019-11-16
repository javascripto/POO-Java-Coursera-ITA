import static java.lang.System.out;

public class Somador {
	String nome;
	int valorInstancia = 0;
	static int valorEstatica = 0;
	
	Somador(String nome) {
		this.nome = nome;
	}

	void somar() {
		valorInstancia++;
		valorEstatica++;
	}
	
	void imprimir() {
		out.println("Somador " + nome + ": instancia=" + valorInstancia + " estatica=" + valorEstatica);
	}
}
