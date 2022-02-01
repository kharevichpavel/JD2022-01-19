package by.it.zaretskaya.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        step1();
        step2();
        step3();
    }

    private static void step1() {
        double a = 756.13;
        double x = 0.3;
        double part1 = cos(pow(x * x + PI / 6, 5));
        double part2=sqrt(x*pow(a,3));
        double part3=log(abs((a-1.12*x)/4));
        double z = part1 - part2 - part3;
        System.out.printf("For x=%f a=%f result z=%f%n",x,a,z);

    }
    private static void step2() {
       double a=1.21;
       double b=0.371;
       double step1=tan(pow(a+b,2));
       double step2=cbrt(a+1.5);
       double step3=a*pow(b,5);
       double step4=b/log(a*a);
       double y=step1-step2+step3-step4;
        System.out.printf("For a=%f b=%f result y=%f%n",a,b,y);

    }
       private static void step3() {
        double x = 12.1;
           System.out.println("-".repeat(36));
           System.out.println("   A        X       F");
           System.out.println("-".repeat(36));
        for (double a = -5; a <=12 ; a=a+3.75) {
            double f = exp(a * x) - 3.45 * a;
            System.out.printf(" %8.4f  %8.4f  %12.6g%n",a,x,f);
        }
           System.out.println("-".repeat(36));


    }
}
