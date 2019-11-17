import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	List<Pizza> listaPizza = new ArrayList<>();

	CarrinhoDeCompras adicionarPizza(Pizza pizza) {
		if (pizza.ingredientes.size() == 0) {
			System.out.println("O carrinho não aceita pizza sem ingredientes!");
			return this;
		}
		listaPizza.add(pizza);
		return this;
	}

	void imprimirValorTotalDasPizzas() {
		System.out.println("Preços das pizzas no carrinho:");
		for (Pizza pizza: listaPizza) {
			System.out.println(pizza.getPreco());
		}
		System.out.println("------------------------------");
	}
	
	void imprimirQuantidadeDeCadaIngrediente() {
		System.out.println("Quantidade de cada ingrediente em todas as pizzas:");
		for (Map.Entry<String, Integer> ingrediente: Pizza.ingredientesDeTodasPizzas.entrySet()) {
			System.out.println(ingrediente.getKey() + ": " + ingrediente.getValue());
		}
	}
}
