import java.util.ArrayList;
import java.util.List;

public class Beverage {

    public String name;
    private boolean milk;
    Sizes sizes ;
    public double price;

    public Beverage(String name, boolean milk, Sizes sizes, double price) {
        this.milk = milk;
        this.sizes = sizes;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
