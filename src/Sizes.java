public enum Sizes {


    small(46),
    medium(50),
    large(55);


    private double price;

    Sizes(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
