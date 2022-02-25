package by.it.skorobogatyi.jd02_02.services;

import by.it.skorobogatyi.jd02_02.entity.Cashier;
import by.it.skorobogatyi.jd02_02.entity.Customer;
import by.it.skorobogatyi.jd02_02.entity.Store;
import by.it.skorobogatyi.jd02_02.utils.RandomData;
import by.it.skorobogatyi.jd02_02.utils.Sleeper;

import java.util.Optional;

public class CashierWorker implements Runnable{

    private final Cashier cashier;
    private final Store store;

    public CashierWorker(Cashier cashier, Store store) {
        this.cashier = cashier;
        this.store = store;
    }

    @Override
    public void run() {

        System.out.println(cashier + " started to work");

        while (!store.getManager().shopClosed()) {
            Optional<Customer> optionalCustomer = queue.extract();

            if (optionalCustomer.isPresent()) {

                Customer customer = optionalCustomer.get();
                System.out.println(cashier + " started to service" + customer);
                int timeForCashier = RandomData.getRandomNumber(2000, 5000);
                Sleeper.sleep(timeForCashier);
                synchronized (customer) {
                    customer.setWaiting(false);
                    customer.notify();
                }
                System.out.println(cashier + " ended to service" + customer);

            } else {
                Sleeper.sleep(100);
            }
        }

        System.out.println(cashier + " finished to work");

    }
}
