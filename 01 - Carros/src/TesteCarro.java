import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TesteCarro {

	@Test
	void testeCarroParado() {
		Carro carro = new Carro();
		assertEquals(0, carro.getVelocidade());
	}

	@Test
	void testeAcelerar() {
		Carro carro = new Carro();
		carro.potencia = 10;
		carro.acelerar();
		assertEquals(10, carro.getVelocidade());
	}

	@Test
	void testeFrear() {
		Carro carro = new Carro();
		carro.potencia = 10;
		carro.acelerar();
		carro.frear();
		assertEquals(5, carro.getVelocidade());
	}


	@Test
	void testeFrearAteZero() {
		Carro carro = new Carro();
		carro.potencia = 10;
		carro.acelerar();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		assertEquals(0, carro.getVelocidade());
	}
}
