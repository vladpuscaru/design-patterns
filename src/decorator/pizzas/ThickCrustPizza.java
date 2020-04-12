package decorator.pizzas;

import decorator.Pizza;

public class ThickCrustPizza extends Pizza {
    public ThickCrustPizza() {
        this.description = "Thick Crust Pizza";
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
