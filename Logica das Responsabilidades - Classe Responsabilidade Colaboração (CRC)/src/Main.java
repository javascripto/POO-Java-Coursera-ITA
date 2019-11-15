
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		
		banco
			.registrarNovaConta()
			.registrarNovaConta(230)
			.registrarNovaConta(500);

		System.out.println(banco);
	}

}

// Acoplamento = Classe Cliente (Banco) depende da Classe servidora (ContaCorrente)
