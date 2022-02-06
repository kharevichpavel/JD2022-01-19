package by.it.kuzma.jb01_02;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        step1();

        int month=scanner.nextInt();
        step2(month);

        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        step3(a, b, c);

    }

    private static void step1() {
        for (int i=1; i<=25; i++){
            if (i%5==0){
                System.out.println(i);
            }else{
                System.out.print(i+" ");
            }
        }
    }

    private static void step2(int month) {
        switch (month) {
            case (1) -> System.out.println("январь");
            case (2) -> System.out.println("февраль");
            case (3) -> System.out.println("март");
            case (4) -> System.out.println("апрель");
            case (5) -> System.out.println("май");
            case (6) -> System.out.println("июнь");
            case (7) -> System.out.println("июль");
            case (8) -> System.out.println("август");
            case (9) -> System.out.println("сентябрь");
            case (10) -> System.out.println("октябрь");
            case (11) -> System.out.println("ноябрь");
            case (12) -> System.out.println("декабрь");
            default -> System.out.println("нет такого месяца");
        }
    }

    private static void step3(double a,double b, double c) {

        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println(x1+" "+ x2 );
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println(x);
        }
        else {
            System.out.println("корней нет");
        }
    }
}
