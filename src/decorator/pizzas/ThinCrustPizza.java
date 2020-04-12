package decorator.pizzas;

import decorator.Pizza;

public class ThinCrustPizza extends Pizza {
    public ThinCrustPizza() {
        this.description = "Thin Crust Pizza";
    }

    @Override
    public double cost() {
        return 3.49;
    }
}
