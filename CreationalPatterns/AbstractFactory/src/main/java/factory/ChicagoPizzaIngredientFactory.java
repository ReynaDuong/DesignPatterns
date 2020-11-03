package factory;

import ingredients.cheese.Cheese;
import ingredients.cheese.MozzarellaCheese;
import ingredients.clams.Clams;
import ingredients.clams.FrozenClams;
import ingredients.dough.Dough;
import ingredients.dough.ThickCrustDough;
import ingredients.pepperoni.Pepperoni;
import ingredients.pepperoni.SlicedPepperoni;
import ingredients.sauce.PlumTomatoSauce;
import ingredients.sauce.Sauce;
import ingredients.veggies.BlackOlives;
import ingredients.veggies.Eggplant;
import ingredients.veggies.Spinach;
import ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		return new Veggies[]{ new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant()
		};
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
