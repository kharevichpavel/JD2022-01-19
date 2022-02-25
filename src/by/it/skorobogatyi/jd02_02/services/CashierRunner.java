package by.it.skorobogatyi.jd02_02.services;

import by.it.skorobogatyi.jd02_02.entity.Cashier;
import by.it.skorobogatyi.jd02_02.entity.Customer;
import by.it.skorobogatyi.jd02_02.entity.Good;
import by.it.skorobogatyi.jd02_02.entity.Store;
import by.it.skorobogatyi.jd02_02.utils.RandomData;
import by.it.skorobogatyi.jd02_02.utils.Sleeper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;

import static by.it.skorobogatyi.jd02_02.utils.ColouredPrinter.printForCashier;
import static by.it.skorobogatyi.jd02_02.utils.ColouredPrinter.printForCheck;

public class CashierRunner implements Runnable {

    private final Cashier cashier;
    private final Store store;

    public CashierRunner(Cashier cashier, Store store) {
        this.cashier = cashier;
        this.store = store;

    }

    @Override
    public void run() {

        printForCashier(cashier + " started to work");

        while (store.getManager().shopOpened()) {
            Optional<Customer> optionalCustomer = store.getQueue().extract();

            if (optionalCustomer.isPresent()) {
                Customer customer = optionalCustomer.get();
                serviceCustomer(customer);

            } else {
                Sleeper.sleep(10);
            }
        }

        if (store.getQueue().extract().isEmpty()) {
            finishWorkForCashier();
        }

    }

    private synchronized void serviceCustomer(Customer customer) {

        printForCashier(cashier + " started service" + customer);
        printForCashier("_".repeat(50));

        printForCheck("| Goods in cart for " + customer + ":");

        ArrayList<Good> goodListOfCustomer = customer.getShoppingCart().goodList;
        BigDecimal checkForCustomer = BigDecimal.valueOf(0);

        for (Good good : goodListOfCustomer) {
            String goodName = good.name;
            BigDecimal goodPrice = good.price;
            checkForCustomer = checkForCustomer.add(goodPrice);
            printForCheck("| " + goodName + " for price " + goodPrice);
        }

        printForCheck("| Check for " + customer + ": " + checkForCustomer);
        printForCashier("_".repeat(50));

        cashier.setMoney(cashier.getMoney().add(checkForCustomer));

        int timeForCashier = RandomData.getRandomNumber(2000, 5000);
        Sleeper.sleep(timeForCashier);

        printForCashier(cashier + " finished service " + customer);

        synchronized (customer) {
            customer.setWaiting(false);
            customer.notify();
        }
    }

    private void finishWorkForCashier() {
        BigDecimal money = cashier.getMoney();
        printForCashier(cashier + " finished to work, money for work day = " + money.toString());

    }
}
