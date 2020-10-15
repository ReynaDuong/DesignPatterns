package beverage;

public class Decaf extends Beverage{
    public Decaf(Size size) {
        description = "Decaf";
        setSize(size);
    }

    @Override
    public double getCost() {
        if (size == Size.TALL) {
            return 0.79;
        } else if (size == Size.GRANDE) {
            return 0.99;
        } else {
            return 1.09;
        }
    }
}
