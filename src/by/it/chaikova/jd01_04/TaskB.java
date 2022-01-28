package by.it.chaikova.jd01_04;

import java.util.Scanner;


public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число людей: ");
        int n = scanner.nextInt();

          System.out.print("Введите их фамилии: ");
        String[] secondName = new String[n];
        for (int i = 0; i < secondName.length; i++) {
            secondName[i] = scanner.next();
        }

        //System.out.println("Введите их зарплаты за 4 квартала: ");

        System.out.println("Введите зарплату для"  );
        n= scanner.nextInt();
        int salaryForFourQuarters[][] = new int[n][4];
        for (int i = 0; i < salaryForFourQuarters.length; i++) {
            for (int j = 0; j < salaryForFourQuarters[i].length; j++) {

                salaryForFourQuarters[i][j] = scanner.nextInt();
            }
        }

      //  for (int i = 0; i < salaryForFourQuarters.length; i++) {
        //    for (int j = 0; j < salaryForFourQuarters[i].length; j++) {
          //      System.out.println(salaryForFourQuarters[i][j] );
            //}
        //}
        //arrayPrint(salaryForFourQuarters,"Доходы", 6);
        //System.out.println();
    }

    public static void arrayPrint(int salaryForFourQuarters[][] , String name, int cols) {
int col=0;
        for (int i = 0; i < salaryForFourQuarters.length ; i++) {
            System.out.println(name);
            System.out.printf("%-5s%-12s%-25s%-10s%n", "Код", "За единиц", "Валюты", "Бел. рублей");
            System.out.println("-----------------------------------------------------");
            System.out.printf("%-5s%-12d%-25s%-10.4f%n", "RUR", 100, "Российский рубль", 3.48);
            System.out.printf("[%s8 -s8]= %-4d",i,salaryForFourQuarters);
            col++;
            if ((col%cols==0) || (salaryForFourQuarters.length-1==i)){
                System.out.println();
            }

        }
    }
}
