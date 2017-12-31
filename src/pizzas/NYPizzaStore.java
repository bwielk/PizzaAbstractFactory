package pizzas;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String name) {
		Pizza pizza = null;
		switch (name){
		case "cheese":
			pizza = new NYCheesePizza();
			break;
		case "pepperoni":
			pizza = new NYPeppperoniPizza();
			break;
		}
		return pizza;
	}

}
