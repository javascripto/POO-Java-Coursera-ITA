import static java.lang.System.out;

public class Main {

	public static void main(String[] args) throws Exception {
		Biblioteca biblioteca = new Biblioteca();

		Usuario fulano = new Usuario("Fulano");
		Usuario beltrano = new Usuario("Beltrano");
		Usuario cicrano = new Usuario("Cicrano");

		Livro livro1 = new Livro("Domain Driven Design", "Eric Evans");
		Livro livro2 = new Livro("Clean Code", "Robert C. Martin");
		Livro livro3 = new Livro("Design Patterns", "Richard Helm");
		Livro livro4 = new Livro("Microservicos Prontos para Produção", "Susan J. Fowler");
		Livro livro5 = new Livro("Programando com Kotlin", "Stephen Samuel");
		Livro livro6 = new Livro("Arquitetura Limpa", "Robert C. Martin");

		biblioteca.registrarUsuarios(fulano, beltrano, cicrano);
		biblioteca.adicionarLivrosAoCatalogo(livro1, livro2, livro3, livro4, livro5, livro6);

		biblioteca.emprestarLivro(livro1, fulano);

		out.println(fulano.livrosEmprestados);

		biblioteca.devolverLivro(livro1);
		
		out.println(fulano.livrosEmprestados);
		out.println(biblioteca.exibirLivrosEmprestados());
		System.out.println(biblioteca.exibirLivrosDisponiveis());
	}

}

// Diagrama Colaboração:
//
// Biblioteca ----> depende ----> Livro
//   |
//   |
// depende
//   |
//   |
//   v
// Usuario