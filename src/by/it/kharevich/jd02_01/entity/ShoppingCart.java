package by.it.kharevich.jd02_01.entity;

public class ShoppingCart {

    private final Good good;

    public ShoppingCart(String name, Good good) {
        this.good = good;

    }

    @Override
    public String toString() {
        return good.name;
    }
}
