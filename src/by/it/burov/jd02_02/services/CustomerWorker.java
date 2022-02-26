package by.it.burov.jd02_02.services;

import by.it.burov.jd02_02.entity.Customer;
import by.it.burov.jd02_02.entity.Good;
import by.it.burov.jd02_02.entity.Queue;
import by.it.burov.jd02_02.exceptions.StoreException;
import by.it.burov.jd02_02.utils.RandomData;
import by.it.burov.jd02_02.utils.Sleeper;

public class CustomerWorker extends Thread implements CustomerAction {

    private final Customer customer;
    private final Store store;

    public CustomerWorker(Store store, Customer customer) {
        this.customer = customer;
        this.store = store;
        this.setName("Worker for" + customer.toString() + " ");
        store.getManager().customerIn();
    }

    @Override
    public void enteredStore() {
        System.out.println(customer + " entered to " + store.name);
    }

    @Override
    public Good chooseGood() {
        System.out.println(customer + " started to choose goods");
        int timeout = RandomData.get(500, 2000);
        Sleeper.sleep(timeout);
        System.out.println(customer + " finished choose goods");
        return new Good();
    }

    @Override
    public void goToQueue() {
        System.out.println(customer + " waiting in Queue ");
        synchronized (customer) {
            Queue storeQueue = store.getQueue();
            storeQueue.add(customer);
            customer.setWaiting(true);
            while (customer.isWaiting()) {
                try {
                    customer.wait();
                } catch (InterruptedException e) {
                    throw new StoreException(e);
                }
            }
        }
        System.out.println(customer + " left Queue ");


    }

    @Override
    public void goOut() {
        System.out.println(customer + " goes out");

    }

    @Override
    public void run() {
        enteredStore();
        Good good = chooseGood();
        System.out.println(customer + " choose " + good);
        goOut();
        store.getManager().customerOut();
    }
}
