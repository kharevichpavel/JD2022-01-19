package by.it.kharevich.codewars;

import java.sql.Array;
import java.util.Arrays;

public class Task4 {

    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]*=(-1);
        }
        return array;
    }


}
