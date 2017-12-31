package pizzas;

public class ChicagoPizzaIngridientFactory implements PizzaIngridientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSaucce();
	}

	public Cheese createCheese() {
		return new Parmeggiano();
	}

	public Vegetable[] createVegetables() {
		Vegetable vegetables[] = {new Aubergine(), new Spinach(), new BlackOlives()};
		return vegetables;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

}
