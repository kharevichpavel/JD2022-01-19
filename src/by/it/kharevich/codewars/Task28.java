package by.it.kharevich.codewars;

import java.util.Arrays;

public class Task28 {

    public static int gps(int s, double[] x) {
        int speed = 0;
        for (int i = 0; i < x.length-1; i++) {
            speed = (int) Math.max(speed,(3600*(x[i+1]-x[i])/s));
        }
        return speed;
    }

    public static void main(String[] args) {
        System.out.println(gps(15, new double[]{1.3, 2.1, 3.4, 4.2, 5.8}));

    }
}
