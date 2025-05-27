package models;

public class BreadType {
    public String bread;

    public static BreadType valueOf(String lowerCase) {
        return null;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public BreadType(String bread) {
        this.bread = bread;
    }
}
