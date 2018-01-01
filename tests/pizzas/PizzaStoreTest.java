package pizzas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PizzaStoreTest{
	
	private PizzaStore nyStore;
	private PizzaStore chicagoStore;
	
	@Before
	public void before(){
		nyStore = new NYPizzaStore();
		chicagoStore = new ChicagoPizzaStore();
	}

	@Test
	public void NYPizzaStoreCanCreateNYCheesePizza(){
		Pizza pizza = nyStore.orderPizza("cheese");
		assertEquals("New York Style Cheese Pizza", pizza.getName());
		assertEquals("Thin Crust Dough", pizza.getDough().getDoughName());
		assertEquals("Marinara Sauce", pizza.getSauce().getSauceName());		
		assertEquals("Mozzarella", pizza.getCheese().getCheeseName());
	}

	@Test
	public void NYPizzaStoreCanCreateNYPepperoniPizza(){
		Pizza pizza = nyStore.orderPizza("pepperoni");
		assertEquals("New York Style Pepperoni Pizza", pizza.getName());
		assertEquals("Thin Crust Dough", pizza.getDough().getDoughName());
		assertEquals("Marinara Sauce", pizza.getSauce().getSauceName());		
		assertEquals("Mozzarella", pizza.getCheese().getCheeseName());
		assertEquals("Sliced Pepperoni", pizza.getPepperoni().getPepperoniName());
	}
	
	@Test
	public void ChicagoPizzaStoreCanCreateChicagoCheesePizza(){
		Pizza pizza = chicagoStore.orderPizza("cheese");
		assertEquals("Chicago Style Cheese Pizza", pizza.getName());
		assertEquals("Thick Crust Dough", pizza.getDough().getDoughName());
		assertEquals("Plum Tomato Sauce", pizza.getSauce().getSauceName());		
		assertEquals("Parmeggiano", pizza.getCheese().getCheeseName());
	}

	@Test
	public void ChicagoPizzaStoreCanCreateChicagoPepperoniPizza(){
		Pizza pizza = chicagoStore.orderPizza("pepperoni");
		assertEquals("Chicago Style Pepperoni Pizza", pizza.getName());
		assertEquals("Thick Crust Dough", pizza.getDough().getDoughName());
		assertEquals("Plum Tomato Sauce", pizza.getSauce().getSauceName());		
		assertEquals("Parmeggiano", pizza.getCheese().getCheeseName());
		assertEquals("Sliced Pepperoni", pizza.getPepperoni().getPepperoniName());
	}
}
