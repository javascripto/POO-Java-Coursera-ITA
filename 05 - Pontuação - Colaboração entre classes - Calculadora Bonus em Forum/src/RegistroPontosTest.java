import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RegistroPontosTest {
	final boolean vip = true;

	@Test
	void pontosCriarTopico() {
		Usuario usuario = new Usuario("Fulano");
		RegistroPontos registroPontos = new RegistroPontos(new CalculadoraBonus());

		registroPontos.criarUmTopico(usuario);

		assertEquals(5, usuario.pontos);
	}
	
	@Test
	void pontosCriarTopicoVip() {
		Usuario usuario = new Usuario("Fulano", vip);
		RegistroPontos registroPontos = new RegistroPontos(new CalculadoraBonus());
		
		registroPontos.criarUmTopico(usuario);
		
		assertEquals(25, usuario.pontos);
	}

	@Test
	void pontosCriarTopicoBonusDoDia() {
		Usuario usuario = new Usuario("Fulano");
		CalculadoraBonus calculadoraBonus = new CalculadoraBonus(3);
		RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
		
		registroPontos.criarUmTopico(usuario);
		
		assertEquals(15, usuario.pontos);
	}

	@Test
	void pontosCriarTopicoVIPBonusDoDia() {
		Usuario usuario = new Usuario("Fulano", vip);
		CalculadoraBonus calculadoraBonus = new CalculadoraBonus(2);
		RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
		
		registroPontos.criarUmTopico(usuario);
		
		assertEquals(50, usuario.pontos);
	}
}
