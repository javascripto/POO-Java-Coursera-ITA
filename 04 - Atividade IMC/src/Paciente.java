
public class Paciente {
	private double peso;
	private double altura;

	Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	double calcularIMC() {
		return peso / (altura * altura);
	}
	
	String diagnostico() {
		double IMC = calcularIMC();
		String kgM2 = String.format(" %.2f", IMC) + " kg/m²";

		if (IMC < 16) return "Baixo peso muito grave:" + kgM2;
		if (IMC >= 16   && IMC <= 16.99) return "Baixo peso grave:" + kgM2;
		if (IMC >= 17   && IMC <= 18.49) return "Baixo peso:" + kgM2;
		if (IMC >= 18.5 && IMC <= 24.99) return "Peso normal:" + kgM2;
		if (IMC >= 25   && IMC <= 29.99) return "Sobrepeso:" + kgM2;
		if (IMC >= 30   && IMC <= 34.99) return "Obesidade grau I:" + kgM2;
		if (IMC >= 35   && IMC <= 39.99) return "Obesidade grau II:" + kgM2;
		return "Obesidade grau III:" + kgM2;
	}
}
