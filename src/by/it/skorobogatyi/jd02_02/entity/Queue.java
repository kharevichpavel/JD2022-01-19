package by.it.skorobogatyi.jd02_02.entity;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class Queue {

    private final Deque<Customer> customerDeque = new ArrayDeque<>();

    private final Object monitior = new Object;

    public void add(Customer customer) {
        synchronized (monitior) {
            customerDeque.addLast(customer);
        }
    }

    public Optional<Customer> extract() {
        synchronized (monitior) {
            return Optional.ofNullable(customerDeque.pollFirst());
        }
    }


}
