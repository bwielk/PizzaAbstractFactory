package pizzas;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String name) {
		Pizza pizza = null;
		switch (name){
		case "cheese":
			pizza = new ChicagoCheesePizza();
			break;
		case "pepperoni":
			pizza = new ChicagoPeppperoniPizza();
			break;
		}
		return pizza;
	}
}
