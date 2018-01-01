package pizzas;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	Vegetable vegetables[];
	Pepperoni pepperoni;
	Cheese cheese;
	
	public Dough getDough() {
		return dough;
	}
	
	public Sauce getSauce() {
		return sauce;
	}
	
	public String getName() {
		return name;
	}
	
	public Vegetable[] getVegetables(){
		return vegetables;
	}
	
	public Pepperoni getPepperoni() {
		return pepperoni;
	}
	
	public Cheese getCheese() {
		return cheese;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	abstract void prepare();
}
