import java.util.Map;
import java.util.HashMap;
import java.util.function.BiFunction;

public class Pizza {
	static HashMap<String, Integer> ingredientesDeTodasPizzas = new HashMap<>();

	HashMap<String, Integer> ingredientes = new HashMap<>();

	static int contabilizarIngredientes(HashMap<String, Integer> ingredientes) {
		int quantidadeTotal = 0;
		for (Map.Entry<String, Integer> ingrediente: ingredientes.entrySet()) {
			quantidadeTotal += ingrediente.getValue();
		}
		return quantidadeTotal;
	}

	Pizza adicionaIngrediente(String ingrediente, int quantidade) {
		BiFunction<Integer, Integer, Integer> fundirValores = (v1, v2) -> v1 + v2;
		ingredientes.merge(ingrediente, quantidade, fundirValores);
		ingredientesDeTodasPizzas.merge(ingrediente, quantidade, fundirValores);
		return this;
	}
	
	int getPreco() {
		int quantidadeTotal = Pizza.contabilizarIngredientes(ingredientes);
		if (quantidadeTotal <= 2) return 15;
		if (quantidadeTotal < 5) return 20;
		return 23;
	}
}
