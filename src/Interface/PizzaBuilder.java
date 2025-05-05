package Interface;

import Classes.Pizza;

public interface PizzaBuilder {
    PizzaBuilder setSize(int size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder addToppings(String topping);
    Pizza build();
}
