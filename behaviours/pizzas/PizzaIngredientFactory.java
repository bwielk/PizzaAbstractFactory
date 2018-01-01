package pizzas;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Vegetable[] createVegetables();
	public Pepperoni createPepperoni();
}
