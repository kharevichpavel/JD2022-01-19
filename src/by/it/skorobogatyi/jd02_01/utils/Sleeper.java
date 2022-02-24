package by.it.skorobogatyi.jd02_01.utils;

import by.it.skorobogatyi.jd02_01.exceptions.StoreException;

public class Sleeper {


    private Sleeper(){
    }


    public static void sleep(int millis){

        try {
            Thread.sleep(millis / Constants.SPEEDUP);
        } catch (InterruptedException e) {
            throw new StoreException(e);
        }
    }
}
