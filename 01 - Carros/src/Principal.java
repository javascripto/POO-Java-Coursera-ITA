import static java.lang.System.out;

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

		out.println(carro.toString());
		out.println(carro2.toString());

	}
}

/*
 * Ao usar "import static" no lugar de "import"
 * você pode usar os metodos estaticos sem referenciar o nome da classe
 *
 *
 * import static java.lang.Math.*;
 * import static java.lang.System.out;
 *
 * class Main {
 *   public static void main(String[] args) {
 *     out.println(pow(2, 4) == Math.pow(2, 4));
 *   }
 * }
 *
 */