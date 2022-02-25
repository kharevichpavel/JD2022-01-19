package by.it.skorobogatyi.jd02_02.services;

import by.it.skorobogatyi.jd02_02.entity.*;
import by.it.skorobogatyi.jd02_02.exceptions.StoreException;
import by.it.skorobogatyi.jd02_02.utils.RandomData;
import by.it.skorobogatyi.jd02_02.utils.Sleeper;

import java.util.ArrayList;
import java.util.List;

import static by.it.skorobogatyi.jd02_02.utils.ColouredPrinter.printForStore;

public class StoreRunner extends Thread {

    public final Store store;
    private final List<Thread> threads;

    public StoreRunner(Store store) {
        this.store = store;
        this.threads = new ArrayList<>();
    }

    @Override
    public void run() {

        printForStore("Store " + store.name + " opened");

        int customerNumber = 0;

        for (int i = 1; i <= 2; i++) {
            getAndRunNewCashierAndCashierWorker(i, threads);
        }

        Manager managerOfThisStore = store.getManager();

        while (managerOfThisStore.shopOpened()) {

            int customersAmount = RandomData.getRandomNumber(2);
            for (int i = 0; i < customersAmount && managerOfThisStore.shopOpened(); i++) {

                generateAndRunNewCustomerRunner(++customerNumber, threads);
                Sleeper.sleep(1000);
            }
        }

        startToCloseShop(threads);
    }

    private void getAndRunNewCashierAndCashierWorker(int number, List<Thread> threads) {
        CashierRunner cashierRunner = new CashierRunner(new Cashier(number), store);
        Thread thread = new Thread(cashierRunner);
        threads.add(thread);
        thread.start();
    }

    private void generateAndRunNewCustomerRunner(int customerNumber, List<Thread> threads) {
        CustomerRunner customerRunner = generateNewCustomerRunner(customerNumber);
        threads.add(customerRunner);
        customerRunner.start();
    }

    private CustomerRunner generateNewCustomerRunner(int customerNumber) {

        int customerRole = RandomData.getRandomNumber(3); //choosing customer role

        CustomerRunner customerRunner;

        switch (customerRole) {
            case 0 -> customerRunner = new PensionerRunner(
                    new Pensioner(customerNumber), this, store);
            case 1, 2 -> customerRunner = new StudentRunner(
                    new Student(customerNumber), this, store);
            default -> customerRunner = new CustomerRunner(
                    new Customer(customerNumber), this, store);
        }
        return customerRunner;
    }

    private void startToCloseShop(List<Thread> threads) {
        printForStore("Shop is closing");
        joinThreads(threads);
        printForStore("Store " + store.name + " closed");
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


