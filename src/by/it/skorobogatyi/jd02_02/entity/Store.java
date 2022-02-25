package by.it.skorobogatyi.jd02_02.entity;

import by.it.skorobogatyi.jd02_02.utils.PriceListRepo;
import by.it.skorobogatyi.jd02_02.utils.RandomData;
import by.it.skorobogatyi.jd02_02.utils.StoreNames;

public class Store {

    public final String name;
    private int customersAmount;
    private final Queue queue;


    public Store(String name, Queue queue) {
        this.name = name;
        this.queue = queue;
    }

    public Queue getQueue() {
        return queue;
    }

    public static Store generateStore() {

        int numberOfStoreNames = StoreNames.values().length;

        int randomStoreNumber = RandomData.getRandomNumberForStoreNames(numberOfStoreNames);

        StoreNames randomStoreValue = StoreNames.values()[randomStoreNumber];

        String storeName = String.valueOf(randomStoreValue);

        Store store = new Store(storeName, queue);
        PriceListRepo.fillPriceList();
        return store;
    }

    public void plusCustomersAmount() {
        customersAmount++;
    }

    public void minusCustomersAmount() {
        customersAmount--;
    }

    public int getCustomersAmount() {
        return customersAmount;
    }
}
