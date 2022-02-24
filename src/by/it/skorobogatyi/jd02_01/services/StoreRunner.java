package by.it.skorobogatyi.jd02_01.services;

import by.it.skorobogatyi.jd02_01.entity.Customer;
import by.it.skorobogatyi.jd02_01.entity.Pensioner;
import by.it.skorobogatyi.jd02_01.entity.Store;
import by.it.skorobogatyi.jd02_01.entity.Student;
import by.it.skorobogatyi.jd02_01.exceptions.StoreException;
import by.it.skorobogatyi.jd02_01.utils.RandomData;
import by.it.skorobogatyi.jd02_01.utils.Sleeper;

import java.util.ArrayList;
import java.util.List;

public class StoreRunner extends Thread {

    public final Store store;

    public StoreRunner(Store store) {
        this.store = store;
    }

    @Override
    public void run() {

        System.out.println("Store " + store.name + " opened");

        int customerNumber = 0;
        List<Thread> threads = new ArrayList<>();

        for (int iteration = 0; iteration < 120; iteration++) {

            int customersAmount = RandomData.getRandomNumber(2); //can delete later

            int customerRole = RandomData.getRandomNumber(3);

            for (int i = 0; i < customersAmount; i++) {

                Customer customer;
                switch (customerRole) {
                    case 0 -> customer = new Pensioner(++customerNumber);
                    case 1, 2 -> customer = new Student(++customerNumber);
                    default -> customer = new Customer(++customerNumber);
                }

                String customerType = customer.getClass().getSimpleName();
                CustomerRunner customerRunner;
                customerRunner = switch (customerType) {
                    case "Student" -> new StudentRunner(customer, this, store);
                    case "Pensioner" -> new PensionerRunner(customer, this, store);
                    default -> new CustomerRunner(customer, this, store);
                };

                threads.add(customerRunner);
                customerRunner.start();

                Sleeper.sleep(1000);
            }

            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new StoreException(e);
                }
            }
        }
        System.out.println("Store " + store.name + " closed");


    }
}


