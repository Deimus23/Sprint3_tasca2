package Classes;

public class Pizza {
    private final int size ;
    private final String dough;
    private final String toppings;

    public Pizza (int size, String dough,String toppings) {
        this.toppings = toppings;
        this.size = size;
        this.dough = dough;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", dough='" + dough + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}
