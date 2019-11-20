import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class Biblioteca {
	private List<Usuario> listaDeUsuarios = new ArrayList<>();
	private List<Livro> catalogoDeLivros = new ArrayList<>();

	Biblioteca registrarUsuarios(Usuario... usuarios) {
		for (Usuario usuario: usuarios)
			listaDeUsuarios.add(usuario);
		return this;
	}
	
	Biblioteca adicionarLivrosAoCatalogo(Livro... livros) {
		for (Livro livro: livros)
			catalogoDeLivros.add(livro);
		return this;
	}

	List<Livro> exibirLivrosDisponiveis() {
		return catalogoDeLivros
				.stream()
				.filter(livro -> livro.disponivel)
				.collect(Collectors.toList());
	}
	
	List<Livro> exibirLivrosEmprestados() {
		return catalogoDeLivros
				.stream()
				.filter(livro -> !livro.disponivel)
				.collect(Collectors.toList());
	}

	List<Livro> exibirCatalogoDeLivros() {
		return catalogoDeLivros;
	}

	Biblioteca emprestarLivro(Livro livro, Usuario usuario) throws Exception {
		if (!livro.disponivel) {
			throw new Exception("O livro não está disponível");
		}
		livro.disponivel = false;
		usuario.livrosEmprestados.add(livro);
		livro.usuario = usuario;
		return this;
	}

	Biblioteca devolverLivro(Livro livro) throws Exception {
		if (livro.usuario == null) {
			throw new Exception("O Livro não está emprestado");
		}
		livro.disponivel = true;
		livro.usuario.livrosEmprestados.remove(livro);
		livro.usuario = null;
		return this;
	}
}

