package decorator.condiments;

import decorator.Pizza;

public class Olive extends CondimentDecorator {
    private Pizza pizza;

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    @Override
    public double cost() {
        return pizza.cost() + .09;
    }
}
