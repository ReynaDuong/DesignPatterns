package store;

import pizza.*;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            case "clam":
                return new NYStyleClamPizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            default:
                return null;
        }
    }

}
