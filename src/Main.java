import Classes.Pizza;
import Classes.PizzaTypes.Pizza4Cheese;
import Classes.PizzaTypes.PizzaMargarita;
import Classes.*;
import Interface.PizzaBuilder;

public class Main {
    public static void main(String[] args) {


                PizzaBuilder hawaianaBuilder = new Pizza4Cheese();
                MestrePizzer mestre1 = new MestrePizzer(hawaianaBuilder);
                Pizza pizzaHawaiana = mestre1.ferPizza("Gran", "Fina");
                System.out.println(pizzaHawaiana);


                PizzaBuilder vegetarianaBuilder = new PizzaMargarita();
                MestrePizzer mestre2 = new MestrePizzer(vegetarianaBuilder);
                Pizza pizzaVegetariana = mestre2.ferPizza("Mitjana", "Integral");
                System.out.println(pizzaVegetariana);


                PizzaBuilder customBuilder = new Pizza4Cheese(); // pots reutilitzar qualsevol builder
                MestrePizzer mestre3 = new MestrePizzer(customBuilder);
                Pizza pizzaCustom = mestre3.ferPizzaPersonalitzada("Petita", "Clàssica", "Tonyina", "Olives", "Formatge");
                System.out.println(pizzaCustom);



    }
}