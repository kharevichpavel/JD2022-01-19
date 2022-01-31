package by.it.kravchenko.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        partOne();
        partTwo();
    }

    private static void partOne() {
        for (double a = 0; a <= 2; a = a + 0.2) {
            double y = pow(7, a) * 6;
            for (int x = 1; x <= 6; x++)
                y = y - cos(x);
            System.out.printf("For a=%-8.2f sum y=%-8.4f%n", a, y);


        }
    }

    private static void partTwo() {
        for (double x = -6; x < 2; x = x + 0.5) {
            double a;
            double b=0;
            if (-2 < x / 2 && x / 2 <= -1) {
                b = sin(pow(x, 2));
            }
            else if (-1 < x / 2 && x / 2 < 0.2) {
                b = cos(pow(x, 2));
            }
            else if (x / 2 == 0.2) {
                b = 1 / tan(pow(x, 2));
            }
            else {
                System.out.println("Вычисления невозможны");
            }
            a = log10(abs(b + 2.74));
            System.out.printf("For b=%-8.4f a=%-10.6f%n", b, a);


        }
    }
}
