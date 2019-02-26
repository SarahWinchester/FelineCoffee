import java.util.List;

public class Cafe extends Beverage {

    private String coffeType;
    public static final String cof = "Coffee";

    public Cafe(String name, boolean milk, Sizes sizes, double price, String coffeType) {
        super(name, milk, sizes, price);
        this.coffeType = coffeType;
    }

    public String getCoffeType() {
        return coffeType;
    }

    public void setCoffeType(String coffeType) {
        this.coffeType = coffeType;
    }

    public static String getCof() {
        return cof;
    }
}
