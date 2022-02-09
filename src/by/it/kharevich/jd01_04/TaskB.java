package by.it.kharevich.jd01_04;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleCount = sc.nextInt();

        String[] nameAll = new String[peopleCount];
        for (int i = 0; i < nameAll.length; i++) {
            nameAll[i] = sc.next();
        }

        int[][] salary = new int[peopleCount][4];
        double sum = 0;
        int sumName;
        int[] resultName = new int[salary.length];
        double average = 0;

        for (int i = 0; i < salary.length; i++) {
            double kv = 4;
            System.out.printf("Введите зарплату для %s\n", nameAll[i]);
            for (int j = 0; j < salary[0].length; j++) {
                salary[i][j] = sc.nextInt();
                sum = sum + salary[i][j];
                average = (sum / salary.length) / kv;
            }
        }

        for (int i = 0; i < salary.length; i++) {
            sumName = 0;
            for (int i1 = 0; i1 < salary[i].length; i1++) {
                sumName = sumName + salary[i][i1];
            }
            resultName[i] = sumName;
        }

        System.out.print("-".repeat(65));
        System.out.println();
        System.out.print("Фамилия        Квартла1  Квартал2  Квартал3  Квартал4  Итого");
        System.out.println();
        System.out.print("-".repeat(65));

        for (int i = 0; i < salary.length; i++) {
            System.out.println();
            System.out.printf("%-15s", nameAll[i] + ":");
            for (int i1 = 0; i1 < salary[i].length; i1++) {
                System.out.printf("%-10d", salary[i][i1]);
            }
            System.out.printf("%-10d", resultName[i]);
        }
        System.out.println();
        System.out.print("-".repeat(65));
        System.out.println();
        System.out.printf("Итого          " + "%-15f", sum);
        System.out.println();
        System.out.printf("Средняя        " + "%-15.6f", average);
    }
}

