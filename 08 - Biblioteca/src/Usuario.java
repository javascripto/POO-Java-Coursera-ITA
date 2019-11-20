import java.util.List;
import java.util.ArrayList;

public class Usuario {
	String nome;
	List<Livro> livrosEmprestados = new ArrayList<>();

	Usuario(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}
}
