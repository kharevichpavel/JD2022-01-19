package by.it.kuzma.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число людей:");
        int n = scanner.nextInt();
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Фамилия "+ (i + 1));
            name[i] = scanner.next();
        }

        int[][] salary = new int[n][4];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите зарплату для "+name[i]);
            for (int j = 0; j < salary[0].length; j++) {
                salary[i][j] = scanner.nextInt();
            }
        }
        String surName = "Фамилия";
        String quart = "Квартал";
        String total = "Итого";
        String average = "Срувняя";
        int totalNumb = 0;
        double count = 0;
        System.out.printf(" %s  %s   %s   %s   %s   %s%n", surName, quart+1, quart+2, quart+3, quart+4, total );
        System.out.println("-".repeat(60));
        for (int i = 0; i < n; i++) {
            System.out.printf(" %7s: %-11d%-11d%-11d%-11d%-5d%n", name[i], salary[i][0], salary[i][1],
                    salary[i][2], salary[i][3], salary[i][0] + salary[i][1] + salary[i][2] + salary[i][3]);
        }
        System.out.println("-".repeat(60));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < salary[0].length; j++) {
                totalNumb += salary[i][j];
                count++;

            }
            if (i == (n - 1)) {

                System.out.printf(" %s %d%n", total, totalNumb );
                System.out.printf(" %s %2.4f%n", average, totalNumb / count);
            }
        }

    }
}
