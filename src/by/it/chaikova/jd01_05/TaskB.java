package by.it.chaikova.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {

        step1();
        step2();
    }

    private static void step2() {

    }

    private static void step1() {

        for (int x = 1; x <= 6; x++) {
        for (double a = 0; a <= 2; a += 0.2) {
                double y = (pow(7, a) - cos(x));
                y+=y;
                System.out.printf(" При а=%8.2f сумма y=%8.6g%n ", a, y);
            }
        }
    }
}
