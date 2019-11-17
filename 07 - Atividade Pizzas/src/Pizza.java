import java.util.Map;
import java.util.HashMap;

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
		if (ingredientes.get(ingrediente) != null) {
			ingredientes.put(ingrediente, quantidade + ingredientes.get(ingrediente).intValue());
		} else {
			ingredientes.put(ingrediente, quantidade);	
		}
		if (ingredientesDeTodasPizzas.get(ingrediente) != null) {
			ingredientesDeTodasPizzas.put(ingrediente, quantidade + ingredientesDeTodasPizzas.get(ingrediente).intValue());
		} else {
			ingredientesDeTodasPizzas.put(ingrediente, quantidade);	
		}
		return this;
	}
	
	int getPreco() {
		int quantidadeTotal = Pizza.contabilizarIngredientes(ingredientes);
		if (quantidadeTotal <= 2) return 15;
		if (quantidadeTotal < 5) return 20;
		return 23;
	}
}
