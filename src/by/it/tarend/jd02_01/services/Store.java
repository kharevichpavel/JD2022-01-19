package by.it.tarend.jd02_01.services;

import by.it.tarend.jd02_01.entity.Customer;

public class Store extends Thread{
    @Override
    public void run() {

        for (int number = 0; number <= 2; number++) {
            Customer customer = new Customer(number);

            CustomerWorker customerWorker = new CustomerWorker(this, customer);
            customerWorker.start();
        }

    }
}
