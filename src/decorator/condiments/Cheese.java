package decorator.condiments;

import decorator.Pizza;

public class Cheese extends CondimentDecorator {
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost() + .29;
    }
}
