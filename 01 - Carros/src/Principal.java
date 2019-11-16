
public class Principal {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.potencia = 10;
		carro.nome = "Corcel";
		carro.velocidade = 0;
		
		Carro carro2 = new Carro();
		carro2.potencia = 20;
		carro2.nome = "Carango";
		carro2.velocidade = 0;

		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.frear();

		println(carro.toString());
		println(carro2.toString());
	}
	
	static void println(String string) {
		System.out.println(string);
	}

}
