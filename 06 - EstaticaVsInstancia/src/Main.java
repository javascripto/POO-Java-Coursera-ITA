
public class Main {

	public static void main(String[] args) {
		Somador s1 = new Somador("Somador 1");
		Somador s2 = new Somador("Somador 2");
		Somador s3 = new Somador("Somador 3");

		for (int i = 0; i < 3; i++) {
			s1.somar();
			s2.somar();
			s3.somar();
		}
		
		s1.imprimir();
		s2.imprimir();
		s3.imprimir();
	}

}
