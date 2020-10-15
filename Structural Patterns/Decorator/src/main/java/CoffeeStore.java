import beverage.*;
import condiment.Milk;
import condiment.Mocha;
import condiment.Whip;

public class CoffeeStore {

    public static void main(String[] args) {
        Beverage espresso = new Espresso(Size.TALL);
        System.out.println("Order: " + espresso.getDescription() + " $" + espresso.getCost());

        Beverage decaf = new Decaf(Size.GRANDE);
        System.out.println("Order: " + decaf.getDescription() + " $" + decaf.getCost());

        Beverage darkRoast = new DarkRoast(Size.VENTI);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.print("Order: " + darkRoast.getDescription());
        System.out.printf("%s%2.2f%n", " $", darkRoast.getCost());

        Beverage houseBlend = new HouseBlend(Size.GRANDE);
        houseBlend = new Milk(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.print("Order: " + houseBlend.getDescription());
        System.out.printf("%s%2.2f%n", " $", houseBlend.getCost());
    }
}
