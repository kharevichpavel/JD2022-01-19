package by.it.kuzma.jd02_02.entity;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class Queue {

    private final Deque<Customer> customerDeque = new ArrayDeque<>();

    private final Object monitor = new Object();

    public synchronized void add(Customer customer){
        //synchronized (monitor) {
            customerDeque.addLast(customer);
        //}
    }

    public synchronized Optional<Customer> extract(){
        //synchronized (monitor) {
            return Optional.ofNullable(customerDeque.pollFirst());
        //}
    }
}
