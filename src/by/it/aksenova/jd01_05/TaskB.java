package by.it.aksenova.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step1();
        System.out.println("-".repeat(40));
        step2();
    }

        private static void step1 () {
            for (double a = 0; a<=2; a=a+0.2) {
                double sum = 0;
                for (int x=1; x<7; x++) {
                    sum = sum+ (pow(7, a) - cos(x));
                    System.out.printf("a=%3.2f sum=%g", a, sum);
                    System.out.println();
                }
            }
        }

    private static void step2(){
        
    }

}


