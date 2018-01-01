package pizzas;

public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String name) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
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
