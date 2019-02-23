public enum Sizes {


    chico(46),
    mediano(50),
    grande(55);


    private double price;

    Sizes(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
