package by.it.tarend.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        solveTask4();
        solveTask5();
    }

    private static void solveTask4() {
        System.out.println("-".repeat(18));
        System.out.printf("\ta\t\ty%n");
        System.out.println("-".repeat(18));
        for (double a = 0; a <= 2; a += 0.2) {
            double y = 0;
            for (int x = 1; x <= 6; x++) {
                y += pow(7, a) - cos(x);
            }
            System.out.printf("%4.2f\t%8.5g%n", a, y);
        }
    }

    private static void solveTask5() {
        double alpha;
        double betha = 0;
        System.out.println();
        for (double x = -5.5; x < 2; x += 0.5) {
            if ((x / 2 > -2) && (x / 2 <= -1)) {
                betha = sin(x * x);
            } else if ((x / 2 > -1) && (x / 2 < 0.2)) {
                betha = cos(x * x);
            } else if (x / 2 == 0.2) {
                betha = 1 / tan(x * x);
            } else {
                System.out.printf("При x/2=%-4.2f вычисления не определены%n", x/2);
            }
            alpha = log10(abs(betha + 2.74));
            System.out.printf("При x/2=%-4.2f a = %g%n", x/2, alpha);
        }


    }

}

