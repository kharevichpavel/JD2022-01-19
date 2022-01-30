package by.it.zaretskaya.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        step1();
    }

    private static void step1() {
        double a = 756.13;
        double x = 0.3;
        double step1 = cos(pow(x * x + PI / 6, 5));
        double step2=sqrt(x*pow(a,3));
        double step3=log(abs((a-1.12*x)/4));
        double z = step1 - step2 - step3;
        System.out.printf("For x=%f a=%f result z=%f%n",x,a,z);


    }
}
