import java.util.List;

public class Cafe extends Beverage {

    private String coffeeType;

    public Cafe(String name, boolean milk, Sizes sizes, double price, String coffeeType) {
        super(name, milk, sizes, price);
        setCoffeeType(coffeeType);
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

}
