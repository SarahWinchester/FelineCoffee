import java.util.List;

public class Frapuccino extends Beverage {

    private boolean creamType;
    private double priceWhippedCream = 10;

    //Constructor


    public Frapuccino(String name, boolean milk, Sizes sizes, double price, boolean creamType, double priceWhippedCream) {
        super(name, milk, sizes, price);
        setCreamType(creamType);
        setPriceWhippedCream(priceWhippedCream);
    }

    public boolean getCreamType() {
        return creamType;
    }

    public void setCreamType(boolean creamType) {
        this.creamType = creamType;
    }

    public double getPriceWhippedCream() {
        return priceWhippedCream;
    }

    public void setPriceWhippedCream(double priceWhippedCream) {
        this.priceWhippedCream = priceWhippedCream;
    }
}
