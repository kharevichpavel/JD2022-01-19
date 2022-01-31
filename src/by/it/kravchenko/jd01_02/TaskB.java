package by.it.kravchenko.jd01_02;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        step1();
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        step2(month);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        step3(a, b, c);
    }


    static void step1() {
        for (int i = 1; i < 26; i++) {
            int columns = 5;
            System.out.printf("%3d", i);
            if (i % 5 == 0) System.out.println();
        }

    }

    static void step2(int month) {
        String monthList;
        switch (month) {
            case 1:
                monthList = "январь";
                break;
            case 2:
                monthList = "февраль";
                break;
            case 3:
                monthList = "март";
                break;
            case 4:
                monthList = "апрель";
                break;
            case 5:
                monthList = "май";
                break;
            case 6:
                monthList = "июнь";
                break;
            case 7:
                monthList = "июль";
                break;
            case 8:
                monthList = "август";
                break;
            case 9:
                monthList = "сентябрь";
                break;
            case 10:
                monthList = "октябрь";
                break;
            case 11:
                monthList = "ноябрь";
                break;
            case 12:
                monthList = "декабрь";
                break;
            default:
                monthList = "нет такого месяца";
                break;
        }
        System.out.println(monthList);


    }

    static void step3(double a, double b, double c) {
        double dics = b * b - 4 * a * c;
        if (dics < 0) System.out.println("корней нет");
        else if (dics == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        } else {
            double x1 = (-b + Math.sqrt(dics)) / (2 * a);
            double x2 = (-b - Math.sqrt(dics)) / (2 * a);
            System.out.println(x1 + " " + x2);

        }


    }
}
