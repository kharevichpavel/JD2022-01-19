package by.it.skorobogatyi.jd02_01.utils;

import java.util.Random;

public class RandomData {

    private RandomData(){
    }

    private static final Random random = new Random();

    public static int getRandomNumber(int min, int max){
        return random.nextInt(min, max);
    }

    public static int getRandomNumber(int max){
        return getRandomNumber(0, max + 1);
    }

}
