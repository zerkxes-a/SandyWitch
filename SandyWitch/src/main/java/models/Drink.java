package models;

public class Drink {
    private String flavor;
    private Size size;

    public Drink(String flavor, Size size) {
        this.flavor = flavor;
        this.size = size;
    }

    public double getPrice() {
        double price = 0.0;
        if (size.equals("small")) {
            price = 2.00;
        } else if (size.equals("medium")) {
            price = 2.50;
        } else if (size.equals("large")) {
            price = 3.00;
        }

        return price;
    }

    @Override
    public String toString() {
        return ("Drink selection: " + size + " " + flavor + " : " + String.format("$.2d", getPrice()));
    }
}
