package by.it.kuzma.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();


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

    private static void step2() {

        System.out.println("_".repeat(40));
        System.out.println(" x      a");

        for (double x = -6; x < 2; x+=0.5) {

            double a;
            double beta;

            if (-2 < x/2 && x/2 <= -1){
                beta = sin(pow(x, 2));
                a = log10(abs(beta + 2.74));
                System.out.printf("%4.2f  %f%n",x ,a);
            }else if (-1 <x/2 && x/2 <0.2){
                beta = cos(pow(x, 2));
                a = log10(abs(beta + 2.74));
                System.out.printf("%4.2f  %f%n",x ,a);
            }else if (x/2 == 0.2){
                beta = 1 / tan(pow(x, 2));
                a = log10(abs(beta + 2.74));
                System.out.printf("%4.2f  %f%n",x ,a);
            }else {
                System.out.printf("%4.2f  Вычисления невозможны%n", x);
            }
            
        }

    }
}
