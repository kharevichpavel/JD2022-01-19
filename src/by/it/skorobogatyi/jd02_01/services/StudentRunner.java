package by.it.skorobogatyi.jd02_01.services;

import by.it.skorobogatyi.jd02_01.entity.Customer;
import by.it.skorobogatyi.jd02_01.entity.Good;
import by.it.skorobogatyi.jd02_01.entity.Store;
import by.it.skorobogatyi.jd02_01.utils.RandomData;

public class StudentRunner extends CustomerRunner {

    private final Customer customer;
    private final StoreRunner storeRunner;
    private final String storeName;


    public StudentRunner(Customer customer, StoreRunner storeRunner, Store storeName) {
        super(customer, storeRunner, storeName);
        this.customer = customer;
        this.storeRunner = storeRunner;
        this.storeName = storeName.name;
    }

    @Override
    public void run() {

        enteredStore();

        takeCart();

        int goodsCounter = RandomData.getRandomNumber(2);

        if (goodsCounter > 0) {
            for (int i = 0; i < goodsCounter; i++) {
                Good good = chooseGood();
                putToCart(good);

                System.out.println(customer + " choose " + good);
            }
        } else {
            System.out.println(customer + " choose nothing, he's poor student");
        }

        goOut();

    }
}
