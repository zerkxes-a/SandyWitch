package models;

public class SandwichSize {
    private Size sandwichSize;

    public SandwichSize(Size sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public static SandwichSize valueof(String string) {
        return null;
    }

    public Size getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(Size sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public double getPrice() {
        double price = 0.0;
        if (sandwichSize.equals("small")) {
            price = 5.50;
        } else if (sandwichSize.equals("medium")) {
            price = 7.00;
        } else if (sandwichSize.equals("large")) {
            price = 9.00;
        }

        return price;
    }
}
