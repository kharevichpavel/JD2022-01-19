package by.it.skorobogatyi.jd01_02;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        step1();
        step2(month);
        step3(a, b, c);

    }

    private static void step1() {

        int[][] array = new int[5][5];

        int counter = 1;

        for (int firstIndex = 0; firstIndex < array.length; firstIndex++) {

            for (int secondIndex = 0; secondIndex < array[firstIndex].length; secondIndex++) {

                array[firstIndex][secondIndex] = counter;
                counter++;
                System.out.print(array[firstIndex][secondIndex] + " ");
            }
            System.out.println();
        }
    }

    private static void step2(int month) {
        switch (month) {
            case 1 -> System.out.println("январь");
            case 2 -> System.out.println("февраль");
            case 3 -> System.out.println("март");
            case 4 -> System.out.println("апрель");
            case 5 -> System.out.println("май");
            case 6 -> System.out.println("июнь");
            case 7 -> System.out.println("июль");
            case 8 -> System.out.println("август");
            case 9 -> System.out.println("сентябрь");
            case 10 -> System.out.println("октябрь");
            case 11 -> System.out.println("ноябрь");
            case 12 -> System.out.println("декабрь");
            default -> System.out.println("нет такого месяца");
        }
    }

    private static void step3(double a, double b, double c) {

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {

            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(root1 + " " + root2);

        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println(root);

        } else {
            System.out.println("корней нет");
        }
    }
}
