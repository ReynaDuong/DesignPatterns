package beverage;

public class HouseBlend extends Beverage{
    public HouseBlend(Size size) {
        description = "House Blend";
        setSize(size);
    }

    @Override
    public double getCost() {
        if (size == Size.TALL) {
            return 1.49;
        } else if (size == Size.GRANDE) {
            return 1.59;
        } else {
            return 1.69;
        }
    }
}
