package beverage;

public abstract class Beverage {
    Size size;
    String description;

    public String getDescription() {
        return size + " " + description;
    }

    void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double getCost();
}
