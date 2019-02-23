import java.util.List;

public class Frapuccino extends Beverage {

    private boolean creamType;
    private int priceWhippedCream;

    //Constructor


    public Frapuccino(String name, boolean milk, List<Sizes> size, boolean creamType, int priceWhippedCream) {
        super(name, milk, size);
        this.creamType = creamType;
        this.priceWhippedCream = priceWhippedCream;
    }

    public boolean isCreamType() {
        return creamType;
    }

    public void setCreamType(boolean creamType) {
        this.creamType = creamType;
    }

    public int getPriceWhippedCream() {
        return priceWhippedCream;
    }

    public void setPriceWhippedCream(int priceWhippedCream) {
        this.priceWhippedCream = priceWhippedCream;
    }
}
