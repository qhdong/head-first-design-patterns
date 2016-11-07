package chapter3.decorator;

public abstract class Beverage {
    protected String description = "Unknown";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
