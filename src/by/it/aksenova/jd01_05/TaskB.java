package by.it.aksenova.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();
    }

        private static void step1 () {
            int x;
            for (x = 1; x < 7; x++) {
                double sum = 0;
                for (double a = 0; a <= 2; a = a + 0.2) {
                    sum = pow(7, a) - tan(x);
                    double y = sum;
                    System.out.printf("a=%3.2f sum=%g", a, sum);
                    System.out.println();
                }
            }
        }

    private static void step2(){
        
    }

}


