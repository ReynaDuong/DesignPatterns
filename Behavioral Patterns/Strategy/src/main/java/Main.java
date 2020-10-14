import strategy.duck.*;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Duck> ducks = new LinkedList<Duck>();

        ducks.add(new MallardDuck());
        ducks.add(new RubberDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new DecoyDuck());

        for (Duck duck : ducks) {
            duck.display();
            duck.fly();
            duck.quack();
            duck.swim();
        }
    }
}
