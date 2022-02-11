package by.it.chaikova.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {

        step1();
        step2();
    }

    private static void step2() {
        double β=0;
        for (double x = 1; x < 6; x += 0.5) {
            if (x / 2 > -2 && x / 2 <= -1) {
                 β = sin(pow(x, 2));
            }
            if (x / 2 > -1 || x / 2 < 0.2) {
                 β = cos(pow(x, 2));
            }
            if (x / 2.0 == 0.2) {
                 β = 1 / (tan(pow(x, 2)));
            } else {
                System.out.println("Вычисления при таком значении x невозможны");
            }

            double α = log(abs(β + 2.74));

            System.out.println(α);
        }
    }


    private static void step1() {

        double y = 0;
        for (int x = 1; x <= 6; x++) {
            for (int a = 0; a <= 2; a += 0.2) {
                y = (pow(7, a) - cos(x));
                y += y;
            }
        }
        System.out.println(y);
    }
}
