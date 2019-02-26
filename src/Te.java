import java.util.List;

public class Te extends Beverage {

    private String leafType;

    public Te(String name, boolean milk, Sizes sizes, double price, String leafType) {
        super(name, milk, sizes, price);
        this.leafType = leafType;
    }


    public String getLeafType() {
        return leafType;
    }

    public void setLeafType(String leafType) {
        this.leafType = leafType;
    }
}
