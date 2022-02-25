package by.it.skorobogatyi.jd02_02.services;

import by.it.skorobogatyi.jd02_02.entity.*;
import by.it.skorobogatyi.jd02_02.utils.RandomData;
import by.it.skorobogatyi.jd02_02.utils.Sleeper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;

import static by.it.skorobogatyi.jd02_02.utils.Constants.BLUE_COLOUR;
import static by.it.skorobogatyi.jd02_02.utils.Constants.FORMATTING_END;

public class CashierRunner implements Runnable {

    private final Cashier cashier;
    private final Store store;

    public CashierRunner(Cashier cashier, Store store) {
        this.cashier = cashier;
        this.store = store;
    }

    @Override
    public void run() {

        System.out.println(BLUE_COLOUR + cashier + " started to work" + FORMATTING_END);

        while (!store.getManager().shopClosed()) {
            Optional<Customer> optionalCustomer = store.getQueue().extract();

            if (optionalCustomer.isPresent()) {
                Customer customer = optionalCustomer.get();
                serviceCustomer(customer);

            } else {
                Sleeper.sleep(100);
            }
        }

        finishWorkForCashier();

    }

    private void serviceCustomer(Customer customer) {
        System.out.println(BLUE_COLOUR + cashier + " started to service" + customer + FORMATTING_END);

        ArrayList<Good> goodListOfCustomer = customer.getShoppingCart().goodList;
        for (Good good : goodListOfCustomer) {
            String goodName = good.name;
            BigDecimal goodPrice = good.price;

        }


        int timeForCashier = RandomData.getRandomNumber(2000, 5000);
        Sleeper.sleep(timeForCashier);

        System.out.println(BLUE_COLOUR + cashier + " finished service" + customer + FORMATTING_END);

        synchronized (customer.getMonitor()) {
            customer.setWaiting(false);
            customer.notify();
        }
    }

    private void finishWorkForCashier() {
        BigDecimal money = cashier.getMoney();
        System.out.println(BLUE_COLOUR + cashier + " finished to work, money for work day = " + money.toString() + FORMATTING_END);

    }
}
