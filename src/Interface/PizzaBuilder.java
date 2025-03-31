package Interface;

import Classes.Pizza;

public interface PizzaBuilder {
    PizzaBuilder setSize(int size);
    PizzaBuilder setDought(String dough);
    PizzaBuilder addToppings(String topping);
    Pizza build();
}
