package by.it.yushkevich.jd01_05;

import static java.lang.Math.*;

import java.lang.management.MemoryType;

public class TaskA {

    public static void main(String[] args) {

        solvePartOne();
        solvePartTwo();
        solvePartThree();

    }


    private static void solvePartOne() {

        double a = 756.13;
        double x = 0.3;

        double partOne = cos(pow((x * x + PI / 6.0), 5));
        double partTwo = sqrt(x * pow(a, 3));
        double partThree = log(abs((a - 1.12 * x) / 4));
        double z = partOne - partTwo - partThree;
        System.out.printf("For x = %f, a = %f, result z = %f\n", x, a, z);

    }

    private static void solvePartTwo() {
        double a = 1.21;
        double b = 0.371;
        double y = tan(pow(a + b, 2)) - cbrt(a + 1.5) + a * pow(b, 5) - b / log(pow(a, 2));
        System.out.printf("For a = %f, b = %f, y = %f\n", a, b, y);

    }


    private static void solvePartThree() {

        double x = 12.1;
        System.out.println("-".repeat(50));
        System.out.println("     A        X       F");
        System.out.println("-".repeat(50));

        for (double a = -5; a <= 12; a = a + 3.75) {

            double f = exp(a*x) - 3.45*a;
            System.out.printf(" %8.4f  %8.4f  %-12.6g\n", a,x, f);

        }
        System.out.println("-".repeat(50));

    }


}
