package by.it.skorobogatyi.jd02_02.utils;

import by.it.skorobogatyi.jd02_02.exceptions.StoreException;

import static by.it.skorobogatyi.jd02_02.utils.Constants.*;

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
