package by.it.kharevich.jd02_02.services;

import by.it.kharevich.jd02_02.entity.Good;

import java.util.HashMap;

public class PriceListRepo extends Thread {


    private final Good good;

    public PriceListRepo() {
        good = new Good();

    }


    public PriceListRepo(Good good) {
        HashMap<String, Integer> priceListRepo = new HashMap<>();


        this.good = null;
    }
}
