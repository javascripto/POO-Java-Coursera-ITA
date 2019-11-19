import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	List<Pizza> listaPizza = new ArrayList<>();

	CarrinhoDeCompras adicionarPizza(Pizza pizza) {
		if (pizza.ingredientes.size() == 0) {
			System.out.println("O carrinho n�o aceita pizza sem ingredientes!");
			return this;
		}
		listaPizza.add(pizza);
		return this;
	}

	void imprimirValorTotalDasPizzas() {
		System.out.println("Preços das pizzas no carrinho:");
		for (int i = 0; i < listaPizza.size(); i++) {
			System.out.println("Pizza " + (i+1) + ": R$ " + listaPizza.get(i).getPreco());
		}
		System.out.println();
	}
	
	void imprimirQuantidadeDeCadaIngrediente() {
		System.out.println("Quantidade de cada ingrediente em todas as pizzas:");
		for (Map.Entry<String, Integer> ingrediente: Pizza.ingredientesDeTodasPizzas.entrySet()) {
			System.out.println(ingrediente.getKey() + ": " + ingrediente.getValue());
		}
		System.out.println();
	}
}
