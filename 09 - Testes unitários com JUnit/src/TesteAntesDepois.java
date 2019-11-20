import static java.lang.System.out;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class TesteAntesDepois {
	@BeforeAll
	static void beforeAll() {
		out.println("------------------");
		out.println("Antes de TODOS os testes".toUpperCase());
	}

	@AfterAll
	static void afterAll() {
		out.println("Depois de TODOS os testes".toUpperCase());
		out.println("------------------");
	}

	@BeforeEach
	void beforeEach() {
		out.println("Antes de cada teste");
	}

	@AfterEach
	void afterEach() {
		out.println("Depois de cada teste");
	}

	@Test
	void teste1() {
		out.println("Teste 1");
	}

	@Test
	void teste2() {
		out.println("Teste 2");
	}

	@Test
	void teste3() {
		out.println("Teste 3");
	}
}
