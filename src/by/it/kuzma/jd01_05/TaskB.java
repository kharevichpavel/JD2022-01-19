package by.it.kuzma.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step1();

    }

    private static void step1() {

        System.out.println("  a      y");

        for (double a = 0; a <= 2 ; a+= 0.2) {
            double y = 0;

            for (int x = 1; x <= 6; x++) {
                y += pow(7,a) - cos(x);
            }
            System.out.printf(" %3.1f    %4.4f%n", a, y);


        }
    }
}
