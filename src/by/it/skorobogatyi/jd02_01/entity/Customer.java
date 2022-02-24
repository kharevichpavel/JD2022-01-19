package by.it.skorobogatyi.jd02_01.entity;

public class Customer {

    private final String name;

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    private ShoppingCart shoppingCart;

    public void setShoppingCart() {
        this.shoppingCart = new ShoppingCart();
    }

    public Customer(int number) {
        this.name = "Customer №" + number;
    }



    @Override
    public String toString() {
        return name;
    }
}
