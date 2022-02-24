package by.it.skorobogatyi.jd02_01.services;

import by.it.skorobogatyi.jd02_01.entity.Customer;
import by.it.skorobogatyi.jd02_01.entity.Good;
import by.it.skorobogatyi.jd02_01.entity.Store;
import by.it.skorobogatyi.jd02_01.utils.PriceListRepo;
import by.it.skorobogatyi.jd02_01.utils.RandomData;
import by.it.skorobogatyi.jd02_01.utils.Sleeper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;

public class CustomerRunner extends Thread implements CustomerAction, ShoppingCartAction {

    private final Customer customer;
    private final StoreRunner storeRunner;
    private final String storeName;


    public CustomerRunner(Customer customer, StoreRunner storeRunner, Store storeName) {
        this.customer = customer;
        this.storeName = storeName.name;
        this.setName("Worker for " + customer.toString());
        this.storeRunner = storeRunner;
    }


    @Override
    public void run() {

        enteredStore();

        takeCart();

        int goodsCounter = RandomData.getRandomNumber(2, 5);

        for (int i = 0; i < goodsCounter; i++) {
            Good good = chooseGood();
            putToCart(good);

            System.out.println(customer + " choose " + good);
        }

        goOut();
    }

    @Override
    public void enteredStore() {

        System.out.println(customer + " entered the store");
    }

    @Override
    public Good chooseGood() {

        System.out.println(customer + " started to choose");

        int timeout = RandomData.getRandomNumber(500, 2000);

        Sleeper.sleep(timeout);

        int randomGoodNumber = RandomData.getRandomNumber(PriceListRepo.priceList.size() - 1);
        Map.Entry<String, BigDecimal> goodEntry =
                PriceListRepo
                .priceList
                .entrySet()
                .stream()
                .toList()
                .get(randomGoodNumber);

        Good good = new Good(goodEntry.getKey(), goodEntry.getValue());

        System.out.println(customer + " have chosen the good");

        Sleeper.sleep(RandomData.getRandomNumber(100, 300));

        return good;
    }

    @Override
    public void goOut() {

        System.out.println(customer + " goes out");
    }

    @Override
    public void takeCart() {

        customer.setShoppingCart();
        System.out.println(customer + " took a cart");
    }

    @Override
    public int putToCart(Good good) {

        ArrayList<Good> goodList = customer.getShoppingCart().goodList;
        goodList.add(good);
        return goodList.size();
    }
}

