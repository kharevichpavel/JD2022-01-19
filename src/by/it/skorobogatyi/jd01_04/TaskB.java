package by.it.skorobogatyi.jd01_04;

import java.util.Scanner;

public class TaskB {
    
    static int delimiterNumber = 60;
    static int periodsNumber = 4;
    static String periodsName = "Квартал";

    public static void main(String[] args) {

        System.out.println("Введите количество сотрудников");
        Scanner scanner = new Scanner(System.in);
        int peopleNumber = scanner.nextInt();

        String[] surnames = new String[peopleNumber];

        for (int i = 0; i < peopleNumber; i++) {
            System.out.println("Введите фамилию сотрудника " + (i + 1));
            surnames[i] = scanner.next();
        }

        int[][] employeeSalary = new int[peopleNumber][periodsNumber];

        for (int i = 0; i < peopleNumber; i++) {

            System.out.printf("Введите зарплату для %s%n", surnames[i]);
            for (int j = 0; j < periodsNumber; j++) {
                employeeSalary[i][j] = scanner.nextInt();
            }
        }

        int[] salarySum = new int[peopleNumber];
        for (int i = 0; i < peopleNumber; i++) {
            for (int j = 0; j < periodsNumber; j++) {
                salarySum[i] += employeeSalary[i][j];
            }
        }

        System.out.println("-".repeat(delimiterNumber));
        System.out.printf("%-9s", "Фамилия");

        for (int i = 1; i < periodsNumber + 1; i++) {
            String string = periodsName + i;
            System.out.printf("%-9s", string);
        }

        System.out.printf("Итого%n");
        System.out.println("-".repeat(delimiterNumber));

        for (int i = 0; i < peopleNumber; i++) {
            System.out.printf("%7s: ", surnames[i]);
            for (int j = 0; j < periodsNumber; j++) {
                System.out.printf("%-9d", employeeSalary[i][j]);
            }
            System.out.printf("%-10d%n", salarySum[i]);
        }

        System.out.println("-".repeat(delimiterNumber));

        double finalSum = 0;

        for (int i = 0; i < salarySum.length; i++) {
            finalSum += salarySum[i];
        }
        
        System.out.printf("%-9s%f%n", "Итого", finalSum);

        double medial = (finalSum / (periodsNumber * surnames.length));
        System.out.printf("%-9s%.4f", "Средняя", medial);
    }
}

