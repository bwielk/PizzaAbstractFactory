package pizzas;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings;
	
	public String getName() {
		return name;
	}
	public ArrayList<String> getToppings() {
		return toppings;
	}

}
