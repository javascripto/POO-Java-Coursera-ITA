
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
// Cart�o CRC (Classe-Responsabilidade Colabora��o) = Cart�o que expressa a colabora��o entre classes

/*
 * Cart�o CRC:
 * 
 * -----------------------------------------------------------
 * | Classe Banco                                             |
 * -----------------------------------------------------------
 * | Responsabilidade        | Colaboracao                    |
 * -----------------------------------------------------------
 * | registrarNovaConta      | ContaCorrente (construtor)     |
 * -----------------------------------------------------------
 * | getNumeroDeContasAtivas | ContaCorrente (numeroConta)    |
 * -----------------------------------------------------------
 * | getSaldoTotal           | ContaCorrente (getSaldoAtual)  |
 * -----------------------------------------------------------
 */