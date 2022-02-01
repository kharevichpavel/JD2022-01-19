package by.it.kravchenko.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во людей");
        int n = scanner.nextInt();
        System.out.println(n);
        System.out.println("Введите имена");
        String [] lastnames = new String[n];
        for (int i = 0; i < n; i++) {
            lastnames[i]= scanner.next();
            System.out.println(lastnames[i]);
        }

    }
}
