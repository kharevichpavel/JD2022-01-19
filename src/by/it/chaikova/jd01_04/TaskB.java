package by.it.chaikova.jd01_04;

import java.util.Scanner;


public class TaskB {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите число людей: ");
        int n = scanner.nextInt();

        System.out.print("Введите их фамилии: ");
        String[] secondName = new String[n];
        for (int i = 0; i < secondName.length; i++) {
            secondName[i] = scanner.next();
        }


        int salaryForFourQuarters[][] = new int[n][4];
        for (int i = 0; i < salaryForFourQuarters.length; i++) {
            System.out.println("Введите зарплату для " + secondName[i]);
            for (int j = 0; j < salaryForFourQuarters[i].length; j++) {
                salaryForFourQuarters[i][j] = scanner.nextInt();
            }
        }


        System.out.printf("%-9s%-10s%-10s%-10s%-10s%-5s%n", "Фамилия", "Квартал1", "Квартал2", "Квартал3", "Квартал4", "Итого");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < salaryForFourQuarters.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-9s%-10d%-10d%-10d%-10d%-5d%n", secondName[i], salaryForFourQuarters[0][0], salaryForFourQuarters[0][1], salaryForFourQuarters[0][2], salaryForFourQuarters[0][3], totalPersonal(salaryForFourQuarters[0]));
                System.out.printf("%-9s%-10d%-10d%-10d%-10d%-5d%n", secondName[i], salaryForFourQuarters[1][0], salaryForFourQuarters[1][1], salaryForFourQuarters[1][2], salaryForFourQuarters[1][3], totalPersonal(salaryForFourQuarters[1]));
                System.out.printf("%-9s%-10d%-10d%-10d%-10d%-5d%n", secondName[i], salaryForFourQuarters[2][0], salaryForFourQuarters[2][1], salaryForFourQuarters[2][2], salaryForFourQuarters[2][3], totalPersonal(salaryForFourQuarters[2]));
                System.out.printf("%-9s%-10d%-10d%-10d%-10d%-5d%n", secondName[i], salaryForFourQuarters[3][0], salaryForFourQuarters[3][1], salaryForFourQuarters[3][2], salaryForFourQuarters[3][3], totalPersonal(salaryForFourQuarters[3]));

            }
            System.out.println("------------------------------------------------------");
            System.out.printf("%-9s%-10d%n", "Итого", totalSumOfPayments(salaryForFourQuarters));
            //System.out.printf("%-9s%n", "Средняя", totalSumOfPayments(salaryForFourQuarters));
        }
    }

    public static int totalSumOfPayments(int array[][]) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[0].length; j++) {
                total = total + array[i][j];
            }
        }

        return total;
    }


    public static int totalPersonal(int array []) {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+ array[i];
        }
        return sum;
    }

  public static int personalitySalary(int salaryForFourQuarters[] ) {
        int personal = 0;
        for (int i = 0; i < 4; i++) {
                personal =personal + salaryForFourQuarters[0];
            }
       return personal;
   }


    public static int[] totalInMonth(int[][] salaryForFourQuarters) {
        int[] totalMonth = new int[3];
        for (int i = 0; i < salaryForFourQuarters.length; i++) {
            for (int j = 0; j < 4; j++) {
                totalMonth[i] += salaryForFourQuarters[i][j];
            }
        }

        return totalMonth;
    }
}
