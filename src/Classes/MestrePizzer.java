import Classes.Pizza;
import Interface.PizzaBuilder;

public class MestrePizzer {
    private PizzaBuilder builder;

    public MestrePizzer(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza ferPizza(int size, String dough) {
        return builder.setSize(size)
                .setDough(dough)
                .build();
    }

    public Pizza ferPizzaPersonalitzada(int size, String dough, String... toppings) {
        builder.setSize(size).setDough(dough);
        for (String topping : toppings) {
            builder.addToppings(topping);
        }
        return builder.build();
    }
}
{
}
