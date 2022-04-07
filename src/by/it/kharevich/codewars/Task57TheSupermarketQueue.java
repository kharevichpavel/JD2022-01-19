package by.it.kharevich.codewars;


import java.util.Arrays;


public class Task57TheSupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] result = new int[n];
        for(int i = 0; i < customers.length; i++){
            result[0] += customers[i];
            Arrays.sort(result);
            //System.out.println(result[0] + " ressort");
        }
        System.out.println(result[0] + " res0");
        System.out.println(result[1] + " res1");
        return result[n-1];
    }

    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 2));

    }

}
