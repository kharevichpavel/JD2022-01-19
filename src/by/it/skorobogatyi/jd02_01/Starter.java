package by.it.skorobogatyi.jd02_01;

import by.it.skorobogatyi.jd02_01.entity.Store;
import by.it.skorobogatyi.jd02_01.services.StoreRunner;

public class Starter {

    public static void main(String[] args) {

        Store store = Store.generateStore();

        StoreRunner storeRunner = new StoreRunner(store);
        storeRunner.start();
    }
}
