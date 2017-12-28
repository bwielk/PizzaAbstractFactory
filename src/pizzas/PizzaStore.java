package pizzas;

public class PizzaStore {
	
	PizzaFactory pizzaFactory;
	
	public PizzaStore(PizzaFactory factory){
		this.pizzaFactory = factory;
	}
	
	public Pizza orderPizza(String name){
		Pizza pizza;
		pizza = pizzaFactory.createPizza(name);
		return pizza;
	}
}
