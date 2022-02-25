package by.it.skorobogatyi.jd02_02.entity;

import by.it.skorobogatyi.jd02_02.utils.RandomData;
import by.it.skorobogatyi.jd02_02.utils.StoreNames;

public class Store {

    public final String name;
    private final Queue queue;
    private final Manager manager;
    private final GoodsAndPricesStorage storage;


    public Store(String name, Queue queue, Manager manager) {
        this.name = name;
        this.queue = queue;
        this.manager = manager;
        this.storage = new GoodsAndPricesStorage();
    }


    public Manager getManager() {
        return manager;
    }

    public Queue getQueue() {
        return queue;
    }

    public static Store generateStore(int planCount) {

        int numberOfStoreNames = StoreNames.values().length;

        int randomStoreNumber = RandomData.getRandomNumberForStoreNames(numberOfStoreNames);

        StoreNames randomStoreValue = StoreNames.values()[randomStoreNumber];

        String storeName = String.valueOf(randomStoreValue);

        return new Store(storeName, new Queue(), new Manager(planCount));
    }

    public GoodsAndPricesStorage getStorage() {
        return storage;
    }
}
