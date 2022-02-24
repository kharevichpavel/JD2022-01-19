package by.it.skorobogatyi.jd02_01.utils;

import by.it.skorobogatyi.jd02_01.exceptions.StoreException;

import static by.it.skorobogatyi.jd02_01.utils.Constants.SPEEDUP;

public class Sleeper {


    private Sleeper(){
    }


    public static void sleep(double millis){

        try {
            Thread.sleep((long) millis / SPEEDUP);
        } catch (InterruptedException e) {
            throw new StoreException(e);
        }
    }
}
