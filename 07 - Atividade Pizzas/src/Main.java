
public class Main {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		pizza1
			.adicionaIngrediente("calabresa", 5)
			.adicionaIngrediente("queijo", 4);

		pizza2
			.adicionaIngrediente("queijo", 1);
		
		pizza3
			.adicionaIngrediente("queijo", 2)
			.adicionaIngrediente("molho", 1);

		carrinho
			.adicionarPizza(pizza1)
			.adicionarPizza(pizza2)
			.adicionarPizza(pizza3);
		
		carrinho.imprimirValorTotalDasPizzas();
		carrinho.imprimirQuantidadeDeCadaIngrediente();
	}

}
