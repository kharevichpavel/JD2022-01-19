package by.it.kuzma.jd02_02.entity;

public class Good {
    public final String name;
    public final double price;

    public Good(String name, double price) {
        this.name = name;
        this.price = price;
    }



    @Override
    public String toString() {
        return name +
                " (price = " + price +
                ')';
    }
}
