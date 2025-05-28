package models;

public class Side {
    private String type;

    public Side(String type) {
        this.type = type;
    }

    public double getPrice() {
        double price = 0.0;
        if (type.equals("spam musubi")) {
            price = 3.50;
        } else if (type.equals("calamari")) {
            price = 7.00;
        } else if (type.equals("house chips")) {
            price = 2.50;
        }
        return price;
    }
    @Override
    public String toString() {
        return ("Side selection: " + type + " : " + String.format("$.2d", getPrice()));
    }
}
