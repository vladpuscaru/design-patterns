package decorator;

public abstract class Pizza {
    protected String description = "Unknown pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
