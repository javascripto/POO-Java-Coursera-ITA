
public class Main {
	public static void main(String[] args) {
		Paciente p1 = new Paciente(70, 1.73);
		Paciente p2 = new Paciente(110, 1.85);
		Paciente p3 = new Paciente(47, 1.60);

		System.out.println(p1.diagnostico());
		System.out.println(p2.diagnostico());
		System.out.println(p3.diagnostico());
	}
}
