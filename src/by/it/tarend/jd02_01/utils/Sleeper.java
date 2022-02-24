package by.it.tarend.jd02_01.utils;

import by.it.tarend.jd02_01.exceptions.StoreException;

public class Sleeper {

    public Sleeper() {
    }

    public void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new StoreException("message" +e);
        }
    }

}


