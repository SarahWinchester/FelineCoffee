import java.util.List;

public class Te extends Beverage {

    private String leafType;

    public Te(String name, boolean milk, List<Sizes> size, String leafType) {
        super(name, milk, size);
        this.leafType = leafType;
    }

    public String getLeafType() {
        return leafType;
    }

    public void setLeafType(String leafType) {
        this.leafType = leafType;
    }
}
