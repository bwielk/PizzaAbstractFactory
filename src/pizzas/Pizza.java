package pizzas;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public String getDough() {
		return dough;
	}
	public String getSauce() {
		return sauce;
	}
	
	public String getName() {
		return name;
	}
	public ArrayList<String> getToppings() {
		return toppings;
	}

}
