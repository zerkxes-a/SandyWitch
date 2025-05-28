package models;

public class ToppingType {

    public String type;

    public ToppingType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        double price = 0.0;
        if (type.equals("regular")) {
            price = 0.00;
        } else if (type.equals("meat")) {
            price = 1.00;
        } else if (type.equals("cheese")) {
            price = 2.50;
        } else if (type.equals("sauce")) {
            price = 0.00;
        }
        return price;
    }

}
