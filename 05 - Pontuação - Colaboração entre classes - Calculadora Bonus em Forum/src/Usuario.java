
public class Usuario {
	public String nome;
	public int pontos;
	public boolean vip;
	
	Usuario(String nome) {
		this.nome = nome;
	}
	
	Usuario(String nome, boolean vip) {
		this.nome = nome;
		this.vip = vip;
	}
}
