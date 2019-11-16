
public class CalculadoraBonus {
	public int bonusDoDia;

	CalculadoraBonus() {
		bonusDoDia = 1;
	}

	CalculadoraBonus(int bonusDoDia) {
		this.bonusDoDia = bonusDoDia;
	}

	public int bonus(Usuario usuario) {
		int multiplicador = bonusDoDia;
		if (usuario.vip) {
			multiplicador *= 5;
		}
		return multiplicador;
	}
}
