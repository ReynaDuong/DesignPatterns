package condiment;

import beverage.Beverage;
import beverage.Size;

public class Whip extends CondimentDecorator{
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
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
