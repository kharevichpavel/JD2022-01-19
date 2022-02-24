package by.it.skorobogatyi.jd02_01.entity;

import by.it.skorobogatyi.jd02_01.utils.PriceListRepo;
import by.it.skorobogatyi.jd02_01.utils.RandomData;
import by.it.skorobogatyi.jd02_01.utils.StoreNames;

public class Store {

    public final String name;


    public Store(String name) {
        this.name = name;
    }


    public static Store generateStore() {

        int randomStoreNumber = RandomData.getRandomNumber(StoreNames.values().length - 1);
        StoreNames randomStoreValue = StoreNames.values()[randomStoreNumber];
        String storeName = String.valueOf(randomStoreValue);

        Store store = new Store(storeName);
        PriceListRepo.fillHashmap();
        return store;
    }
}
