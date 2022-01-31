package by.it.tarend.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        solveTask1();
        solveTask2();
        solveTask3();

    }

    private static void solveTask1() {
        double a = 756.13;
        double x = 0.3;
        double part1 = cos(pow(x*x + PI/6.0, 5));
        double part2 = sqrt(x * pow(a, 3));
        double part3 = log(abs((a - 1.12 * x) / 4));
        double z = part1 - part2 - part3;
        System.out.printf("For x=%-10.6f a=%-10.6f result z=%-10.6f%n", x, a, z);
    }

    private static void solveTask2() {
        double a = 1.21;
        double b = 0.371;
        double part1 = tan(pow((a + b), 2));
        double part2 = cbrt(a + 1.5);
        double part3 = a * pow(b, 5) - b / log(a * a);
        double y = part1 - part2 + part3;
        System.out.printf("For a=%-10.5f b=%-10.5f result y=%-10.5f%n", a, b, y);
    }
    private static void solveTask3() {
        double x = 12.1;
        double y;
        System.out.println("-".repeat(18));
        System.out.printf("\ta\t\ty%n");
        System.out.println("-".repeat(18));
        for (double a = -5; a <= 12 ; a+=3.75) {
            y = exp(a * x) - 3.45 * a;
            System.out.printf("%5.2f\t%8.5g%n", a, y);
        }
        System.out.println("-".repeat(18));
    }
}
