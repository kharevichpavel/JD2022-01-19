package by.it.tarend.jd02_01.services;

import by.it.tarend.jd02_01.entity.Customer;
import by.it.tarend.jd02_01.entity.Good;
import by.it.tarend.jd02_01.utils.PriceListRepo;
import by.it.tarend.jd02_01.utils.RandomData;
import by.it.tarend.jd02_01.utils.Sleeper;

import java.util.Set;

public class CustomerWorker extends Thread implements CustomerAction, ShoppingCardAction{

    private final Customer customer;
    private final Store store;


    public CustomerWorker(Store store, Customer customer) {
        this.customer = customer;
        this.store = store;
        this.setName("Worker name "  + customer.toString() + " ");
    }

    @Override
    public void run() {
        enteredStore();
        Good good = chooseGood();
        System.out.println(customer + " choose " + good);
        goOut();
    }

    @Override
    public void enteredStore() {
        System.out.println(customer + " entered to store");

    }

    @Override
    public Good chooseGood() {

        System.out.println(customer + " started to choose goods");
        int timeOut = RandomData.get(500, 2000);
        Sleeper.sleep(timeOut);
        Set<Good> goods = PriceListRepo.priceList.keySet();
        int randomGoodIndex = RandomData.get(0, goods.size());
        System.out.println(customer + " finished to choose goods");

        return goods.stream().toList().get(randomGoodIndex);
    }

    @Override
    public void goOut() {
        System.out.println(customer + " go out");
    }

    @Override
    public void TakeCart() {
        int timeOut = RandomData.get(100,300);
        Sleeper.sleep(timeOut);
        System.out.println(customer + " took Cart");
    }

    @Override
    public int putToCart(Good good) {
        int goodNumber = RandomData.get(2, 5);
        for (int i = 0; i < goodNumber; i++) {

        }
        return 0;
    }
}
