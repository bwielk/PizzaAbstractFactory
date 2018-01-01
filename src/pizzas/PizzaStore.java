package pizzas;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String name){
		Pizza pizza;
		pizza = createPizza(name);
		pizza.prepare();
		return pizza;
	}
	
	abstract Pizza createPizza(String name); //the factory method
}
