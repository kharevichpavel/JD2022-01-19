package by.it.katsal.jd01_05;
import java.util.stream.IntStream;

import static java.lang.Math.*;
public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();

    }

    private static void step1() {
        double y = 0;
        for (double  a = 0; a <= 2; a = a + 0.2){
            for (int x = 1; x <=6 ; x++) {
                y = y + pow(7,a) - cos(x);



            }

            System.out.printf("index=%3.2f  final=%10.8f%n",a,y);
        }
    }

    private static void step2() {
        double a = 0;
        double b = 0;
        for (double  x = -6; x < 2; x=x+0.5) {
            double x2 = x/2;
            if (-2<x2 && x2<=-1){
                b = sin(x*x);
            }
            else if (-1<x2 && x2<0.2){
                b = cos(x*x);
            }
            else if (x2 == 0.2){
                b = 1/tan(x*x);

            }
            else{
                System.out.printf("При x/2=%5.3f вычисления не определены\n",x);
                continue;
            }

            a = log10(abs(b + 2.74) );
            System.out.printf("При x/2=%3.2f a=%10.7f\n", x,a);
        }
    }


}
