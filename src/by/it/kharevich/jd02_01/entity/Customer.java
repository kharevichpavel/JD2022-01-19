package by.it.kharevich.jd02_01.entity;

import java.awt.*;

public class Customer {

    private final String name;

    public Customer(int number) {
        name = "Customer # " + number;
    }

    @Override
    public String toString() {
        return name;
    }
}
