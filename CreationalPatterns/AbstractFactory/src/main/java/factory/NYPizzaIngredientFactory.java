package factory;

import ingredients.cheese.Cheese;
import ingredients.cheese.ReggianoCheese;
import ingredients.clams.Clams;
import ingredients.clams.FreshClams;
import ingredients.dough.Dough;
import ingredients.dough.ThinCrustDough;
import ingredients.pepperoni.Pepperoni;
import ingredients.pepperoni.SlicedPepperoni;
import ingredients.sauce.MarinaraSauce;
import ingredients.sauce.Sauce;
import ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		return new Veggies[]{
				new Garlic(), new Onion(), new Mushroom(), new RedPepper()
		};
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
