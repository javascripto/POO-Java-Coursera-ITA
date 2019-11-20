
public class Livro {
	private static int contador;

	int id;
	String titulo;
	String autor;
	Usuario usuario;
	Boolean disponivel = true;
	
	Livro(String titulo, String autor) {
		this.id = contador++;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public String toString() {
		return titulo + " - " + autor;
	}
}
