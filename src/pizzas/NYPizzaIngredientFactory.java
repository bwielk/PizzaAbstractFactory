package pizzas;


public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	
	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new Mozzarella();
	}

	public Vegetable[] createVegetables() {
		Vegetable vegetables[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return vegetables;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
}
