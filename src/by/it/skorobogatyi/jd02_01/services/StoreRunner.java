package by.it.skorobogatyi.jd02_01.services;

import by.it.skorobogatyi.jd02_01.entity.Customer;
import by.it.skorobogatyi.jd02_01.entity.Store;
import by.it.skorobogatyi.jd02_01.exceptions.StoreException;
import by.it.skorobogatyi.jd02_01.utils.RandomData;
import by.it.skorobogatyi.jd02_01.utils.Sleeper;

import java.util.ArrayList;
import java.util.List;

public class StoreRunner extends Thread{

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

            for (int i = 0; i < customersAmount; i++) {

                Customer customer = new Customer(++customerNumber);
                CustomerRunner customerRunner = new CustomerRunner(customer, this, store);

                threads.add(customerRunner);
                customerRunner.start();
            }

            Sleeper.sleep(1000);
        }

        joinThreads(threads);

        System.out.println("Store " + store.name + " closed");
    }

    private void joinThreads(List<Thread> threads) {
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new StoreException(e);
            }
        }
    }
}
