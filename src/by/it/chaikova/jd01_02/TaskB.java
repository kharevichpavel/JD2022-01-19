package by.it.chaikova.jd01_02;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        System.out.println("Step1:");
        step1();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Step2:");
        System.out.print("Ввести число от 1 до 12: ");
        int month = scanner.nextInt();
        step2(month);

        System.out.println("Step3:");
        System.out.print("Введите коэффициент а: ");
        double a = scanner.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите коэффициент с: ");
        double c = scanner.nextDouble();
        step3(a, b, c);
    }

    private static void step1() {
        int n = 5;
        int[][] array = new int[n][n];
        for (int t = 0; t < n; t++) {
            for (int j = 0; j < n; j++) {
                array[t][j] = (t * n) + j + 1;
                System.out.print(array[t][j] + " ");
            }
            System.out.println();
        }
    }

    private static void step2(int month) {
        switch (month) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("нет такого месяца");
                break;
        }

    }

    private static void step3(double a, double b, double c) {
        double dis = b * b - 4 * a * c;
        if (dis < 0)
            System.out.println("корней нет");
        else if (dis == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        } else {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }
        System.out.println(dis);
    }
}