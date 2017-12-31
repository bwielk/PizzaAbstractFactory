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
		assertEquals("Thin crust", pizza.getDough());
		assertEquals("Marinara", pizza.getSauce());		
		assertEquals("Parmeggiano cheese", pizza.getToppings().get(0));
	}

	@Test
	public void NYPizzaStoreCanCreateNYPepperoniPizza(){
		Pizza pizza = nyStore.orderPizza("pepperoni");
		assertEquals("New York Style Pepperoni Pizza", pizza.getName());
		assertEquals("Thick crust", pizza.getDough());
		assertEquals("Red pepper sauce", pizza.getSauce());		
		assertEquals("Mozarella cheese", pizza.getToppings().get(0));
	}
	
	@Test
	public void ChicagoPizzaStoreCanCreateChicagoCheesePizza(){
		Pizza pizza = chicagoStore.orderPizza("cheese");
		assertEquals("Chicago Style Cheese Pizza", pizza.getName());
		assertEquals("Thick crust", pizza.getDough());
		assertEquals("Tomato sauce", pizza.getSauce());		
		assertEquals("Mozarella cheese", pizza.getToppings().get(0));
	}

	@Test
	public void ChicagoPizzaStoreCanCreateChicagoPepperoniPizza(){
		Pizza pizza = chicagoStore.orderPizza("pepperoni");
		assertEquals("Chicago Style Pepperoni Pizza", pizza.getName());
		assertEquals("Thick crust", pizza.getDough());
		assertEquals("Tomato and basil sauce", pizza.getSauce());		
		assertEquals("Parmeggiano cheese", pizza.getToppings().get(0));
	}
}
