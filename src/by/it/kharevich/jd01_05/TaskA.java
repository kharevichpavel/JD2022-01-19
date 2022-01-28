package by.it.kharevich.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        solvePart1();
        solvePart2();
        solvePart3();


    }

    private static void solvePart1() {
        double a = 756.13;
        double x = 0.3;
        double part1 = cos(pow(x * x * PI / 6.0, 5));
        double part2=sqrt(x*pow(a,3));
        double part3=log(abs((a-1.12*x)/4));
        double z=part1-part2-part3;
        System.out.printf("For x=%f a=%f result z=%f%n",x,a,z);
    }

    private static void solvePart2() {
    }

    private static void solvePart3() {
    }
}
