package by.it.kubarkova.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        solvePart1A();
        solvePart2A();
        solvePart3A();
        
    }




    private static void solvePart1A() {
        double a=756.13;
        double x=0.3;
        double part1=cos(pow(x*x+PI/6.0,5));
        double part2=sqrt(x*pow(a,3));
        double part3=log(abs((a-1.12*x)/4));
        double z= part1-part2-part3;
        System.out.printf("For x=%f a=%f result z=%f%n",x,a,z);
    }

    private static void solvePart2A() {
        double a=1.21;
        double b=0.371;
        double y= tan(pow(a+b,2))-cbrt(a+1.5)+a*pow(b,5)-b/log(a*a);
        System.out.printf("For a=%f b=%f result y=%f%n",a,b,y);
    }
    private static void solvePart3A() {
        double x=12.1;
        System.out.println("-".repeat(40));
        System.out.println("     A        X        F");
        System.out.println("-".repeat(40));
        for (double i = -5; i < 12; i=i+3.75) {
            double f=exp(i*x)-3.45*i;
            System.out.printf("%8.4f %8.4f %12.6g%n",i,x,f);
            System.out.println("-".repeat(40));


            
        }
    }
}
