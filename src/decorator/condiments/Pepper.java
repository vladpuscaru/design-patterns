package decorator.condiments;

import decorator.Pizza;

public class Pepper extends CondimentDecorator {
    private Pizza pizza;

    public Pepper(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Peppers";
    }

    @Override
    public double cost() {
        return pizza.cost() + .59;
    }
}
