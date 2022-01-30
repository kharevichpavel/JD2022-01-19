package by.it.kravchenko.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        partOne();
        partTwo();
        partThree();
    }

    private static void partOne() {
        double a = 756.13;
        double x = 0.3;
        double step1 = cos(pow(pow(x, 2) + PI / 6.0, 5));
        double step2 = sqrt(x * (pow(a, 3)));
        double step3 = log(abs((a - 1.12 * x) / 4));
        double z = step1 - step2 - step3;
        System.out.println(z);

    }

    private static void partTwo() {
        double a = 1.21;
        double b = 0.371;
        double y = tan(pow(a + b, 2)) - cbrt(a + 1.5) + a * pow(b, 5) - b / (log(pow(a, 2)));
        System.out.printf("For a=%f b=%f result=%f", a, b, y);
        System.out.println();
    }

    private static void partThree() {
        double x = 12.1;
        System.out.println("-".repeat(40));
        System.out.println("  A          X            F");
        System.out.println("-".repeat(40));
        for (double a = -5; a <= 12; a = a + 3.75) {
            double f = exp(a * x) - 3.45 * a;
            System.out.printf("%8.4f %8.4f %14.6g%n", a, x, f);
        }
    }
}
