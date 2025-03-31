package Classes.PizzaTypes;

import Classes.Pizza;
import Interface.PizzaBuilder;

public class PizzaMargarita implements PizzaBuilder {
    private int size;
    private String dough;
    private String toppings;
    private String oil="spicy oil";

    @Override
    public PizzaBuilder setSize(int size) {
        this.size=size;
        return this;
    }

    @Override
    public PizzaBuilder setDought(String dough) {
        this.dough=dough;
        return this;
    }

    @Override
    public PizzaBuilder addToppings(String topping) {
        this.toppings=topping;
        return null;
    }

    @Override
    public Pizza build() {
        return new Pizza (size,dough, toppings);
    }
}
