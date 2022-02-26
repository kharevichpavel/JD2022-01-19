package by.it.burov.jd02_01.entity;

public class Customer {
    private final String name;

    public Customer(int naumber) {
        name = "Customer " + naumber;
    }

    @Override
    public String toString() {
        return name;
    }
}
