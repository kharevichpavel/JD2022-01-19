package by.it.kharevich.codewars;

import java.util.Arrays;

public class Task6 {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int element : args) {
            if (element<min){
                min=element;
            }
        }
        return min;
    }

}
