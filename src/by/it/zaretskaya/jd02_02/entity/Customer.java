package by.it.zaretskaya.jd02_02.entity;

public class Customer {
    private final String name;

    public Customer(int number) {

        name="Customer№"+number;
    }

    @Override
    public String toString() {
        return name;
    }
}
