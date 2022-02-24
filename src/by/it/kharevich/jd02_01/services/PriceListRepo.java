package by.it.kharevich.jd02_01.services;

import by.it.kharevich.jd02_01.entity.Good;

public class PriceListRepo extends Thread{

    private final Good good;

    public PriceListRepo(Good good) {
        this.good = good;
    }


}
