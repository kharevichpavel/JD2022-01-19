package by.it.kharevich.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {

        part1();

    }

    private static void part1() {
        double y;
        for (double a = 0; a<=2 ; a=a+0.2) {
            double sum=0;
            for (double x = 1; x <=6 ; x++) {
                double s = pow(7,a)-cos(x);
                sum=sum+s;
            }
            y=sum;
            System.out.printf("%-4.1f      " + "%-16.12f%n",a,y);
        }
        System.out.println();
    }


}
