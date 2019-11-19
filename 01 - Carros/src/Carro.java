
public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	void acelerar() {
		velocidade += potencia;
	}
	
	void frear() {
		velocidade /= 2;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	public String toString() {
		return "O Carro " + (nome != null ? nome : "") + 
				" está a velocidade de " +
				getVelocidade() + " km/h";
	}
}
