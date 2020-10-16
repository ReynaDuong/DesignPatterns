package condiment;

import beverage.Beverage;
import beverage.Size;

public class Soy extends CondimentDecorator{
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double getCost() {
        if (beverage.getSize() == Size.TALL) {
            return beverage.getCost() + 0.10;
        } else if (beverage.getSize() == Size.GRANDE) {
            return beverage.getCost() + 0.15;
        } else {
            return beverage.getCost() + 0.20;
        }
    }
}
