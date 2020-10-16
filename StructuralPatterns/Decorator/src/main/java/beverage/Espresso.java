package beverage;

public class Espresso extends Beverage{
    public Espresso(Size size) {
        description = "Espresso";
        setSize(size);
    }

    @Override
    public double getCost() {
        if (size == Size.TALL) {
            return 1.89;
        } else if (size == Size.GRANDE) {
            return 1.99;
        } else {
            return 2.00;
        }
    }
}
