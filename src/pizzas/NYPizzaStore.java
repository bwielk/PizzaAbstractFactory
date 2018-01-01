package pizzas;

public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String name) {
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		Pizza pizza = null;
		switch (name){
		case "cheese":
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
			break;
		case "pepperoni":
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
			break;
		}
		return pizza;
	}

}
