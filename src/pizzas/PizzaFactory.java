package pizzas;

public class PizzaFactory {
	
	public Pizza createPizza(String name){
		Pizza pizza = null;
		switch (name){
		case "cheese":
			pizza = new CheesePizza();
			break;
		case "pepperoni":
			pizza = new PeppperoniPizza();
			break;
		case "clam":
			pizza = new ClamPizza();
			break;
		case "greek":
			pizza = new GreekPizza();
			break;
		}
		return pizza;
	}
}
