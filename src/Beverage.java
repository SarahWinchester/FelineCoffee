import java.util.ArrayList;
import java.util.List;

public class Beverage {

    private String name;
    //private double price;
    private boolean milk;
    private List<Sizes> size = new ArrayList<Sizes>();
    //private List<Beverage> beverages= new ArrayList<Beverage>();


    public Beverage(String name, boolean milk, List<Sizes> size) {
        this.name = name;
        this.milk = milk;
        this.size = size;
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

    public List<Sizes> getSize() {
        return size;
    }

    public void setSize(List<Sizes> size) {
        this.size = size;
    }
}
