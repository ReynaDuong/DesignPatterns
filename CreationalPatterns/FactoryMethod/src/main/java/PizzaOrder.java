import pizza.Pizza;
import store.ChicagoStylePizzaStore;
import store.NYStylePizzaStore;
import store.PizzaStore;

public class PizzaOrder {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("ORDER: " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("ORDER: " + pizza.getName());
    }
}
