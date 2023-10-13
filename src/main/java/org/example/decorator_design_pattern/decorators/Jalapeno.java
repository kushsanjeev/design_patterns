package org.example.decorator_design_pattern.decorators;

import org.example.decorator_design_pattern.base.BasePizza;

public class Jalapeno extends ToppingDecorator{
    BasePizza basePizza;

    public Jalapeno(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 40;
    }
}
