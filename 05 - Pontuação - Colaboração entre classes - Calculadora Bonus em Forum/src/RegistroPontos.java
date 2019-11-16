
public class RegistroPontos {
	
	private CalculadoraBonus calculadora;
	
	RegistroPontos(CalculadoraBonus cb) {
		calculadora = cb;
	}

	void fazerUmComentario(Usuario usuario) {
		usuario.pontos += 3 * calculadora.bonus(usuario);
	}

	void criarUmTopico(Usuario usuario) {
		usuario.pontos += 5 * calculadora.bonus(usuario);
	}

	void darLike(Usuario usuario) {
		usuario.pontos += 1 * calculadora.bonus(usuario);
	}
}
