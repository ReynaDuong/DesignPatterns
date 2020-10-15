package beverage;

public class DarkRoast extends Beverage{
    public DarkRoast(Size size) {
        description = "Dark Roast";
        setSize(size);
    }

    @Override
    public double getCost() {
        if (size == Size.TALL) {
            return 0.89;
        } else if (size == Size.GRANDE) {
            return 0.99;
        } else {
            return 1.00;
        }
    }
}
