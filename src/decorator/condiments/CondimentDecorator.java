package decorator.condiments;

import decorator.Pizza;

public abstract class CondimentDecorator extends Pizza {
    @Override
    public abstract String getDescription();
}
