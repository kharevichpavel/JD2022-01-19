package by.it.kharevich.codewars;

import java.util.Arrays;


public class Task15 {

    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        int[] arrNew=new int[2];
        arrNew[0]=arr[0];
        arrNew[1]=arr[arr.length-1];
        return arrNew;

    }
}
