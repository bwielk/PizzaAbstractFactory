package pizzas;


public class NYPizzaIngridientFactory implements PizzaIngridientFactory {
	
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}
	
	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozarella();
	}

	@Override
	public Vegetable[] createVegetables() {
		Vegetable vegetables[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return vegetables;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
}
