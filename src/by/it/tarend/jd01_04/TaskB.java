package by.it.tarend.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // кол-во сотрудников
        String[] persons = new String[n];
        int[][] salaries = new int[n][4];
        int[] sumSalary = new int[n];
        int totalSum = 0;
        double avgSalary;

        for (int i = 0; i < persons.length; i++) {
            persons[i] = sc.next();
        }

        for (int person = 0; person < persons.length; person++) {
            System.out.println("Введите зарплату для " + persons[person]);
            for (int quarter = 0; quarter < 4; quarter++) {
                salaries[person][quarter] = sc.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < sumSalary.length; i++) {
            for (int j = 0; j < salaries[i].length; j++) {
                sumSalary[i] += salaries[i][j];
            }
        }

        for (int personSum : sumSalary) {
            totalSum += personSum;
        }
        avgSalary = (double) totalSum / (4 * n);

        System.out.println("-".repeat(68));
        System.out.println("Фамилия\t\tКвартал1\tКвартал2\tКвартал3\tКвартал4\tИтого");
        System.out.println("-".repeat(68));
        for (int i = 0; i < persons.length; i++) {
            System.out.printf("%1$7s:\t%2$-8d\t%3$-8d\t%4$-8d\t%5$-8d\t%6$-8d%n", persons[i], salaries[i][0], salaries[i][1], salaries[i][2], salaries[i][3], sumSalary[i]);
        }
        System.out.println("-".repeat(68));
        System.out.printf("Итого\t%-8d%n", totalSum);
        System.out.printf("Средняя\t%-10.5f%n", avgSalary);
    }
}
