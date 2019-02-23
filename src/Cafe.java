import java.util.List;

public class Cafe extends Beverage {

    private String coffeType;

    public Cafe(String name, boolean milk, List<Sizes> size, String coffeType) {
        super(name, milk, size);
        this.coffeType = coffeType;
    }

    public String getCoffeType() {
        return coffeType;
    }

    public void setCoffeType(String coffeType) {
        this.coffeType = coffeType;
    }
}
