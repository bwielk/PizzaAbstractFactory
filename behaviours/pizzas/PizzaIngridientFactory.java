package pizzas;

public interface PizzaIngridientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Vegetable[] createVegetables();
	public Pepperoni createPepperoni();
}
