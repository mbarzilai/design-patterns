package decorator;

public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
