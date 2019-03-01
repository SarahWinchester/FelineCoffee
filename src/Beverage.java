public class Beverage {

    public String name;
    public  boolean milk;
    Sizes sizes ;
    public double price;

    public Beverage() {
    }

    public Beverage(String name, boolean milk, Sizes sizes, double price) {
        setName(name);
        setMilk(milk);
        setSizes(sizes);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getMilk() {
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
